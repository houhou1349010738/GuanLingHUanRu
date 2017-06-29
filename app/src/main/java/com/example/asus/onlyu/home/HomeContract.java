package com.example.asus.onlyu.home;


import com.example.asus.onlyu.base.BasePresenter;
import com.example.asus.onlyu.base.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class HomeContract {
    interface View extends BaseView {
        void undata(String s);
    }

    interface  Presenter extends BasePresenter<View> {
        void getdata();
    }
}
