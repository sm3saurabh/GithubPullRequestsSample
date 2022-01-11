package dev.saurabhmishra.githubpullrequests.scheduler

import kotlin.coroutines.CoroutineContext

interface GithubExecutionScheduler {
    fun ioContext(): CoroutineContext
    fun mainContext(): CoroutineContext
    fun defaultContext(): CoroutineContext
}