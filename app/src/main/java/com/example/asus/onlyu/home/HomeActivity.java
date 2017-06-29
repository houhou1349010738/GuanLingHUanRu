package com.example.asus.onlyu.home;


import android.support.v4.content.ContextCompat;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.base.MVPBaseActivity;
import com.example.asus.onlyu.module.home.Home_fragment;
import com.example.asus.onlyu.module.merchant.MerChant;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationItem;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;
import com.luseen.luseenbottomnavigation.BottomNavigation.OnBottomNavigationItemClickListener;

import butterknife.BindView;


/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class HomeActivity<T> extends MVPBaseActivity<T> {
    @BindView(R.id.activity_main)
    RelativeLayout mActivityMain;
    @BindView(R.id.bottomNavigation)
    BottomNavigationView mBottomNavigation;
    @BindView(R.id.intofra_fral)
    FrameLayout mIntofraFral;

    @Override
    protected void initview() {
        //初始化视图
        addFragment(R.id.intofra_fral,new Home_fragment(),"home");
        final BottomNavigationItem home = new BottomNavigationItem
                ("首页", ContextCompat.getColor(this, R.color.bottom), R.mipmap.home_nomal);
        BottomNavigationItem biz= new BottomNavigationItem
                ("商家", ContextCompat.getColor(this, R.color.bottom), R.mipmap.sj_nomal);
        BottomNavigationItem shop = new BottomNavigationItem
                ("购物车", ContextCompat.getColor(this, R.color.bottom), R.mipmap.gwc_nomal);
        BottomNavigationItem me = new BottomNavigationItem
                ("我的", ContextCompat.getColor(this, R.color.bottom), R.mipmap.me_nomal);
        mBottomNavigation.addTab(home);
        mBottomNavigation.addTab(biz);
        mBottomNavigation.addTab(shop);
        mBottomNavigation.addTab(me);
        mBottomNavigation.isColoredBackground(false);
        mBottomNavigation.setItemActiveColorWithoutColoredBackground(ContextCompat.getColor(this, R.color.bottom));
        mBottomNavigation.setOnBottomNavigationItemClickListener(new OnBottomNavigationItemClickListener() {
            @Override
            public void onNavigationItemClick(int index) {
                switch (index){
                    case 0:
                        replaceFragment(R.id.intofra_fral,new Home_fragment(),"home");
                        break;
                    case 1:
                        replaceFragment(R.id.intofra_fral,new MerChant<>(),"merchant");
                        break;
                }
            }
        });

    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }


    @Override
    public void UpData(T o) {

    }


}
