package dev.saurabhmishra.githubpullrequests.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<VM: BaseViewModel, VB: ViewDataBinding>: AppCompatActivity(),
    BaseUIComponent<VM, VB> {

    private var _binding: VB? = null

    override val binding: VB
        get() = _binding!!

    override lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[viewModelClass()]
        _binding = DataBindingUtil.setContentView(this, layoutId())

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}