package com.kyphoon.base_common.base

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

/**
@Auther: kyphoon
@CreateTime: 2020/9/25
@Description:
 */
open class BaseApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()

        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(this)
    }

    override fun onTerminate() {
        super.onTerminate()
        ARouter.getInstance().destroy()
    }
}