package dev.saurabhmishra.githubpullrequests.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.saurabhmishra.githubpullrequests.network.GithubApi
import dev.saurabhmishra.githubpullrequests.scheduler.GithubExecutionScheduler
import dev.saurabhmishra.githubpullrequests.source.GithubNetworkSource
import dev.saurabhmishra.githubpullrequests.source.GithubNetworkSourceImpl

@InstallIn(SingletonComponent::class)
@Module
object SourceModule {

    fun provideGithubNetworkSource(githubApi: GithubApi, githubExecutionScheduler: GithubExecutionScheduler): GithubNetworkSource {
        return GithubNetworkSourceImpl(githubApi, githubExecutionScheduler.ioContext())
    }
}