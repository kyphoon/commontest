package com.kyphoon.module1

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.kyphoon.base_common.BaseActivity
import kotlinx.android.synthetic.main.module1_activity_main.*

@Route(path = "/module1/MainActivity")
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module1_activity_main)

        bt_intent_to_module2.setOnClickListener {
            ARouter.getInstance().build("/module2/MainActivity").withString("flag","msg").navigation()
        }

    }
}
