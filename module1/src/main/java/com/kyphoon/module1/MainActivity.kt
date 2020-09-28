package com.kyphoon.module1

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.kyphoon.base_common.BaseActivity
import com.kyphoon.base_common.utils.NavigationUtil
import kotlinx.android.synthetic.main.module1_activity_main.*

@Route(path = "/module1/MainActivity")
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module1_activity_main)

        bt_intent_to_module2.setOnClickListener {
            //通过反射机制跳转
            NavigationUtil.intent(this,"com.kyphoon.module2.MainActivity")
            //通过路由框架跳转
//            ARouter.getInstance().build("/module2/MainActivity").withString("flag","msg").navigation()
        }

    }
}
