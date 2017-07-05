package com.example.asus.onlyu.module.shoppingcar;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.base.MVPBaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * author：郑志强
 * data：2017/6/28 20:40
 * function：
 */

public class ShoppingCar_Fragment extends MVPBaseFragment {
    @BindView(R.id.tvTitle)
    TextView mTvTitle;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    Unbinder unbinder;

    @Override
    protected void initdata() {

    }

    @Override
    protected void initView() {
    }

    @Override
    protected int layoutRes() {
        return R.layout.shoppingcar_fragment;
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
