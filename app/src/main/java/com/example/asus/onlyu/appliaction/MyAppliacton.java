package com.example.asus.onlyu.appliaction;

import android.app.Application;
import android.graphics.Typeface;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/21 08:22
 * 邮箱：17600157003@163.com
 */

public class MyAppliacton extends Application{

    public static Typeface msyh;
    public static Typeface PingFang_Light;
    public static Typeface msyhbd;
    public static Typeface PingFang_Medium;
    public static Typeface msyhl;
    public static Typeface PingFang_Bold;
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
        //字体
        msyh=Typeface.createFromAsset(getAssets(),"fonts/msyh.ttc");
        PingFang_Light=Typeface.createFromAsset(getAssets(),"fonts/PingFang Light.ttf");
        msyhbd=Typeface.createFromAsset(getAssets(),"fonts/msyhbd.ttc");
        PingFang_Medium=Typeface.createFromAsset(getAssets(),"fonts/PingFang Medium.ttf");
        msyhl=Typeface.createFromAsset(getAssets(),"fonts/msyhl.ttc");
        PingFang_Bold=Typeface.createFromAsset(getAssets(),"fonts/PingFang Bold.ttf");
    }
}
