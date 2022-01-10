package dev.saurabhmishra.githubpullrequests.network

import dev.saurabhmishra.githubpullrequests.models.PullRequest

interface GithubApi {
    suspend fun getClosedPullRequests(): List<PullRequest>
}