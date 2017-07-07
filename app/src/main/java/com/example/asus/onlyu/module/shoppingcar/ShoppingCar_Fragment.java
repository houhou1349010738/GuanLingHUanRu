package com.example.asus.onlyu.module.shoppingcar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.base.MVPBaseFragment;
import com.example.asus.onlyu.module.shoppingcar.order.AllOrderActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * author：郑志强
 * data：2017/6/28 20:40
 * function：
 */

public class ShoppingCar_Fragment extends MVPBaseFragment {
    Unbinder unbinder;
    @BindView(R.id.ivSelectAll)
    ImageView mIvSelectAll;
    @BindView(R.id.tvCountTotal)
    TextView mTvCountTotal;
    @BindView(R.id.tvCountMoney)
    TextView mTvCountMoney;
    @BindView(R.id.btnSettle)
    Button mBtnSettle;
    @BindView(R.id.expandableListView)
    ExpandableListView mExpandableListView;

    @Override
    protected void initdata() {
    }

    @Override
    protected void initView() {
        mBtnSettle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AllOrderActivity.class);
                startActivity(intent);
            }
        });
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
