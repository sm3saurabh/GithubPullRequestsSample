package dev.saurabhmishra.githubpullrequests.source

import dev.saurabhmishra.githubpullrequests.models.PullRequest
import dev.saurabhmishra.githubpullrequests.models.SafeResult
import dev.saurabhmishra.githubpullrequests.network.GithubApi
import dev.saurabhmishra.githubpullrequests.utils.safeApiCall
import kotlin.coroutines.CoroutineContext

interface GithubNetworkSource {
    suspend fun getGithubPullRequests(): SafeResult<List<PullRequest>>
}

class GithubNetworkSourceImpl(
    private val githubApi: GithubApi,
    private val executionContext: CoroutineContext
) : GithubNetworkSource {
    override suspend fun getGithubPullRequests(): SafeResult<List<PullRequest>> {
        return safeApiCall(executionContext) {
            githubApi.getClosedPullRequests()
        }
    }

}