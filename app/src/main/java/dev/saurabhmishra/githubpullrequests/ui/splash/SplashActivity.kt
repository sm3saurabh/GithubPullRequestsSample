package dev.saurabhmishra.githubpullrequests.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import dev.saurabhmishra.githubpullrequests.R
import dev.saurabhmishra.githubpullrequests.base.BaseActivity
import dev.saurabhmishra.githubpullrequests.databinding.ActivitySplashBinding
import dev.saurabhmishra.githubpullrequests.extensions.safeLaunch
import dev.saurabhmishra.githubpullrequests.ui.home.HomeActivity
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>() {

    override fun layoutId(): Int {
        return R.layout.activity_splash
    }

    override fun viewModelClass(): Class<SplashViewModel> {
        return SplashViewModel::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.safeLaunch {
            delay(2000L)
            HomeActivity.launch(this@SplashActivity)
        }
    }


}