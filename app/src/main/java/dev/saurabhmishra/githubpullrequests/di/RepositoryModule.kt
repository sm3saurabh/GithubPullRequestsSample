package dev.saurabhmishra.githubpullrequests.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.saurabhmishra.githubpullrequests.repository.GithubRepository
import dev.saurabhmishra.githubpullrequests.repository.GithubRepositoryImpl
import dev.saurabhmishra.githubpullrequests.source.GithubNetworkSource

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    fun provideGithubRepository(githubNetworkSource: GithubNetworkSource): GithubRepository {
        return GithubRepositoryImpl(githubNetworkSource)
    }
}