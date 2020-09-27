package com.kyphoon.commontest

import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.kyphoon.base_common.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_arouter_module1.setOnClickListener {
            ARouter.getInstance().build("/module1/MainActivity").navigation()
        }

        bt_arouter_module2.setOnClickListener {
            ARouter.getInstance().build("/app/SecondActivity").navigation()
        }
    }
}