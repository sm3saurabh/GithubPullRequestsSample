package dev.saurabhmishra.githubpullrequests.scheduler

import dev.saurabhmishra.githubpullrequests.extensions.defaultCoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

class GithubExecutionSchedulerImpl : GithubExecutionScheduler {

    override fun ioContext(): CoroutineContext {
        return Dispatchers.IO + defaultCoroutineExceptionHandler
    }

    override fun mainContext(): CoroutineContext {
        return Dispatchers.Main + defaultCoroutineExceptionHandler
    }

    override fun defaultContext(): CoroutineContext {
        return Dispatchers.Default + defaultCoroutineExceptionHandler
    }
}