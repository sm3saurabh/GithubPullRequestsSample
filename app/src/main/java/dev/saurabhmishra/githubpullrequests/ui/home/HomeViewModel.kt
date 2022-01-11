package dev.saurabhmishra.githubpullrequests.ui.home

import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.saurabhmishra.githubpullrequests.base.BaseViewModel
import dev.saurabhmishra.githubpullrequests.models.PullRequest
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val githubPager: Pager<Int, PullRequest>
): BaseViewModel() {

    val pagedPullRequests = githubPager.flow.cachedIn(viewModelScope)



}