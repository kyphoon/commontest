package com.kyphoon.base_common.utils

import android.content.Context
import android.content.Intent

/**
@Auther: kyphoon
@CreateTime: 2020/9/28
@Description: 组件间跳转工具，利用反射原理。
组件化开发中，同层级业务组件间activity的跳转方式
 1，路由  阿里ARouter  美团WMRouter
 2，反射
 */
class NavigationUtil {

    companion object {
        /**
         * 单纯通过全路径跳转
         * */
        fun intent(context: Context, path: String) {
            var clazz: Class<*> = Class.forName(path)
            context.startActivity(Intent(context, clazz))
        }

        /**
         * 通过intent携带参数跳转
         * */
        fun intent(context: Context, path: String, intent: Intent) {
            var clazz: Class<*> = Class.forName(path)
            intent.setClass(context, clazz)
            context.startActivity(intent)
        }
    }
}