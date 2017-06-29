package com.example.asus.onlyu.module.home;

import com.example.asus.onlyu.R;
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

    }

    @Override
    protected int layoutRes() {
        return R.layout.home_fragment;
    }

}
