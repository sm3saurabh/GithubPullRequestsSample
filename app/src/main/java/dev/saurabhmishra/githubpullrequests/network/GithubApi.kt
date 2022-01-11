package dev.saurabhmishra.githubpullrequests.network

import dev.saurabhmishra.githubpullrequests.models.PullRequest
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApi {
    @GET("/repos/denisidoro/navi/pulls")
    suspend fun getClosedPullRequests(
        @Query("per_page") perPage: Int,
        @Query("page") page: Int,
        @Query("state") state: String = "closed",
    ): List<PullRequest>
}