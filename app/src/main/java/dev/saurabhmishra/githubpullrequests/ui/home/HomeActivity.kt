package dev.saurabhmishra.githubpullrequests.ui.home

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import dev.saurabhmishra.githubpullrequests.R
import dev.saurabhmishra.githubpullrequests.base.BaseActivity
import dev.saurabhmishra.githubpullrequests.databinding.ActivityHomeBinding

@AndroidEntryPoint
class HomeActivity : BaseActivity<HomeViewModel, ActivityHomeBinding>() {
    override fun layoutId(): Int {
        return R.layout.activity_home
    }

    override fun viewModelClass(): Class<HomeViewModel> {
        return HomeViewModel::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    companion object {
        fun launch(currentActivity: Activity) {
            val launchingIntent = Intent(currentActivity, HomeActivity::class.java)
            currentActivity.startActivity(launchingIntent)
            currentActivity.finish()
        }
    }

}