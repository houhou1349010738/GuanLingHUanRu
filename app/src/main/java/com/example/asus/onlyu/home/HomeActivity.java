package com.example.asus.onlyu.home;


import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.base.MVPBaseActivity;
import com.example.asus.onlyu.module.home.Home_fragment;
import com.example.asus.onlyu.module.home.utils.ShowDialog;
import com.example.asus.onlyu.module.merchant.MerChant;
import com.example.asus.onlyu.module.shoppingcar.ShoppingCar_Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class HomeActivity<T> extends MVPBaseActivity<T> {

    @BindView(R.id.iv_home)
    ImageView mIvHome;
    @BindView(R.id.iv_pinpai)
    ImageView mIvPinpai;
    @BindView(R.id.iv_shop)
    ImageView mIvShop;
    @BindView(R.id.iv_my)
    ImageView mIvMy;
    @BindView(R.id.intofra_fral)
    FrameLayout mIntofraFral;

    @Override
    protected void initview() {
        //初始化视图，加载首页fragment
        replaceFra(R.id.intofra_fral,new Home_fragment());
        ShowDialog.showLocdialog(this,"是否使用当前位置");
        ShowDialog.showLocdialog(this,"是否打开NFC");

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_home, R.id.iv_pinpai, R.id.iv_shop, R.id.iv_my})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            //加载首页
            case R.id.iv_home:
                replaceFra(R.id.intofra_fral,new Home_fragment());
                mIvHome.setImageResource(R.drawable.home_dj);
                mIvPinpai.setImageResource(R.drawable.pinpai_mr);
                mIvShop.setImageResource(R.drawable.shop_mr);
                mIvMy.setImageResource(R.drawable.my_mr);
                break;
            //加载品牌
            case R.id.iv_pinpai:
                replaceFra(R.id.intofra_fral,new MerChant());
                mIvPinpai.setImageResource(R.drawable.pinpai_dj);
                mIvShop.setImageResource(R.drawable.shop_mr);
                mIvMy.setImageResource(R.drawable.my_mr);
                mIvHome.setImageResource(R.drawable.home_mr);
                break;
            //加载购物车
            case R.id.iv_shop:
                replaceFra(R.id.intofra_fral,new ShoppingCar_Fragment());
                mIvShop.setImageResource(R.drawable.shop_dj);
                mIvMy.setImageResource(R.drawable.my_mr);
                mIvHome.setImageResource(R.drawable.home_mr);
                mIvPinpai.setImageResource(R.drawable.pinpai_mr);
                break;
            //加载我的
            case R.id.iv_my:
                mIvMy.setImageResource(R.drawable.my_dj);
                mIvHome.setImageResource(R.drawable.home_mr);
                mIvPinpai.setImageResource(R.drawable.pinpai_mr);
                mIvShop.setImageResource(R.drawable.shop_mr);
                break;
        }
    }


}
