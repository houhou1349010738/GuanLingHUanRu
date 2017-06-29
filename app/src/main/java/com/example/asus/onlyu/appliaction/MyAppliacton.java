package com.example.asus.onlyu.appliaction;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/21 08:22
 * 邮箱：17600157003@163.com
 */

public class MyAppliacton extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
