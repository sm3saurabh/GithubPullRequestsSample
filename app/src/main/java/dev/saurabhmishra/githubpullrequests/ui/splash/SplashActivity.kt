package dev.saurabhmishra.githubpullrequests.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import dagger.hilt.android.AndroidEntryPoint
import dev.saurabhmishra.githubpullrequests.R
import dev.saurabhmishra.githubpullrequests.base.BaseActivity
import dev.saurabhmishra.githubpullrequests.databinding.ActivitySplashBinding
import dev.saurabhmishra.githubpullrequests.ui.home.HomeActivity

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

        Handler().postDelayed({ HomeActivity.launch(this) }, 2000)
    }


}