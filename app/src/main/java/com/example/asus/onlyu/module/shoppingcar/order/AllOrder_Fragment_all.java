package com.example.asus.onlyu.module.shoppingcar.order;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.base.MVPBaseFragment;
import com.example.asus.onlyu.module.shoppingcar.adapter.AllOrderAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * author：郑志强
 * data：2017/7/6 19:41
 * function：
 */

public class AllOrder_Fragment_all extends MVPBaseFragment {
    @BindView(R.id.allorder_recycler)
    RecyclerView mAllorderRecycler;
    Unbinder unbinder;

    @Override
    protected void initdata() {
    }

    @Override
    protected void initView() {
        LinearLayoutManager manager=new LinearLayoutManager(getActivity());
        mAllorderRecycler.setLayoutManager(manager);
        mAllorderRecycler.setAdapter(new AllOrderAdapter(getActivity()));
    }

    @Override
    protected int layoutRes() {
        return R.layout.allorder_fragment;
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
