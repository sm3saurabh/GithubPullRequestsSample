package dev.saurabhmishra.githubpullrequests.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.saurabhmishra.githubpullrequests.scheduler.GithubExecutionScheduler
import dev.saurabhmishra.githubpullrequests.scheduler.GithubExecutionSchedulerImpl

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideExecutionScheduler(): GithubExecutionScheduler {
        return GithubExecutionSchedulerImpl()
    }

}