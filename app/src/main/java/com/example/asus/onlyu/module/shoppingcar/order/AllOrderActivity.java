package com.example.asus.onlyu.module.shoppingcar.order;

import android.support.design.widget.TabLayout;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.base.MVPBaseActivity;

import butterknife.BindView;

public class AllOrderActivity extends MVPBaseActivity {

    @BindView(R.id.allorder_tab)
    TabLayout mAllorderTab;
    @BindView(R.id.allorder_container)
    FrameLayout mAllorderContainer;
    @BindView(R.id.allorder_relayout)
    RelativeLayout mAllorderRelayout;
    @BindView(R.id.allorder_scrollview)
    ScrollView mAllorderScrollview;

    private String[] mStrings=new String[]{"全部","待付款","待发货","待收货","售后"};
    @Override
    protected void initview() {
        replaceFragment(R.id.allorder_container, new AllOrder_Fragment_all(), "all");
    }

    @Override
    protected void initdata() {
        mAllorderTab.addTab(mAllorderTab.newTab().setText(mStrings[0]));
        mAllorderTab.addTab(mAllorderTab.newTab().setText(mStrings[1]));
        mAllorderTab.addTab(mAllorderTab.newTab().setText(mStrings[2]));
        mAllorderTab.addTab(mAllorderTab.newTab().setText(mStrings[3]));
        mAllorderTab.addTab(mAllorderTab.newTab().setText(mStrings[4]));
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_all_order;
    }

    @Override
    public void UpData(Object o) {

    }

}
