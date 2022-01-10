package dev.saurabhmishra.githubpullrequests.base

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding

interface BaseUIComponent<VM: BaseViewModel, VB: ViewDataBinding> {
    val binding: VB
    val viewModel: VM

    @LayoutRes
    fun layoutId(): Int
    fun viewModelClass(): Class<VM>

}