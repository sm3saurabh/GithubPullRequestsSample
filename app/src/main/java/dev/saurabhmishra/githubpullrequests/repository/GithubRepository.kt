package dev.saurabhmishra.githubpullrequests.repository

import dev.saurabhmishra.githubpullrequests.models.PullRequest
import dev.saurabhmishra.githubpullrequests.models.SafeResult
import dev.saurabhmishra.githubpullrequests.source.GithubNetworkSource

interface GithubRepository {
    suspend fun getGithubPullRequests(): SafeResult<List<PullRequest>>
}

class GithubRepositoryImpl(
    private val githubNetworkSource: GithubNetworkSource
): GithubRepository {

    override suspend fun getGithubPullRequests(): SafeResult<List<PullRequest>> {
        return githubNetworkSource.getGithubPullRequests()
    }

}