package com.example.asus.onlyu.module.home.view;

import android.support.v7.widget.LinearLayoutManager;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.adapter.HomeRecyclerAdapter;
import com.example.asus.onlyu.base.MVPBaseFragment;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by chengqianlang on 2017/6/28.
 */

public class Home_fragment extends MVPBaseFragment {
    @BindView(R.id.xrecycle_homef)
    XRecyclerView mXrecycleHomef;
    Unbinder unbinder;

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void initdata() {

    }

    @Override
    protected void initView() {
        //加载recyclerview
        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(getActivity());
        mXrecycleHomef.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mXrecycleHomef.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected int layoutRes() {
        return R.layout.home_fragment;
    }

}
