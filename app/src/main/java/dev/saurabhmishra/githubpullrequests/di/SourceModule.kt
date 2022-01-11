package dev.saurabhmishra.githubpullrequests.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.saurabhmishra.githubpullrequests.network.GithubApi
import dev.saurabhmishra.githubpullrequests.paging.GithubPagingSource
import dev.saurabhmishra.githubpullrequests.repository.GithubRepository
import dev.saurabhmishra.githubpullrequests.scheduler.GithubExecutionScheduler
import dev.saurabhmishra.githubpullrequests.source.GithubNetworkSource
import dev.saurabhmishra.githubpullrequests.source.GithubNetworkSourceImpl

@InstallIn(SingletonComponent::class)
@Module
object SourceModule {

    @Provides
    fun provideGithubNetworkSource(githubApi: GithubApi, githubExecutionScheduler: GithubExecutionScheduler): GithubNetworkSource {
        return GithubNetworkSourceImpl(githubApi, githubExecutionScheduler.ioContext())
    }

    @Provides
    fun provideGithubPagingSource(githubRepository: GithubRepository): GithubPagingSource {
        return GithubPagingSource(githubRepository)
    }
}