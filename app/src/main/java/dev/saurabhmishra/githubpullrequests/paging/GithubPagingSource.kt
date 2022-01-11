package dev.saurabhmishra.githubpullrequests.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dev.saurabhmishra.githubpullrequests.models.PullRequest
import dev.saurabhmishra.githubpullrequests.models.SafeResult
import dev.saurabhmishra.githubpullrequests.repository.GithubRepository
import dev.saurabhmishra.githubpullrequests.utils.AppConstants

class GithubPagingSource(
    private val githubRepository: GithubRepository
): PagingSource<Int, PullRequest>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PullRequest> {
        val position = params.key ?: AppConstants.GITHUB_STARTING_PAGE_INDEX
        return when (val response = githubRepository.getGithubPullRequests(perPage = params.loadSize, page = position)) {
            is SafeResult.Success -> {
                val repos = response.data.orEmpty()
                val nextKey = if (repos.isEmpty()) {
                    null
                } else {
                    // initial load size = 3 * NETWORK_PAGE_SIZE
                    // ensure we're not requesting duplicating items, at the 2nd request
                    position + (params.loadSize / AppConstants.GITHUB_PAGE_SIZE)
                }
                LoadResult.Page(
                    data = repos,
                    prevKey = if (position == AppConstants.GITHUB_STARTING_PAGE_INDEX) null else position - 1,
                    nextKey = nextKey
                )
            }
            is SafeResult.Failure -> {
                LoadResult.Error(response.exception)
            }
        }


    }


    override fun getRefreshKey(state: PagingState<Int, PullRequest>): Int? {
        // We need to get the previous key (or next key if previous is null) of the page
        // that was closest to the most recently accessed index.
        // Anchor position is the most recently accessed index
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }

    }
}