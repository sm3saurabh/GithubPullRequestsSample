package dev.saurabhmishra.githubpullrequests.di

import androidx.paging.Pager
import androidx.paging.PagingConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.saurabhmishra.githubpullrequests.models.PullRequest
import dev.saurabhmishra.githubpullrequests.paging.GithubPagingSource
import dev.saurabhmishra.githubpullrequests.scheduler.GithubExecutionScheduler
import dev.saurabhmishra.githubpullrequests.scheduler.GithubExecutionSchedulerImpl
import dev.saurabhmishra.githubpullrequests.utils.AppConstants

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideExecutionScheduler(): GithubExecutionScheduler {
        return GithubExecutionSchedulerImpl()
    }

    @Provides
    fun provideGithubPager(githubPagingSource: GithubPagingSource): Pager<Int, PullRequest> {
        return Pager(
            config = PagingConfig(
                pageSize = AppConstants.GITHUB_PAGE_SIZE
            ),
            pagingSourceFactory = { githubPagingSource }
        )
    }

}