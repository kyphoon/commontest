package com.kyphoon.module2

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.kyphoon.base_common.BaseActivity
import kotlinx.android.synthetic.main.activity_module2_main.*

@Route(path = "/module2/MainActivity")
class MainActivity : BaseActivity() {

    @Autowired(name = "flag")
    @JvmField //kotlin必须加上，否则无法编译
    var msg : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module2_main)

        tv_text.text = msg
    }
}
