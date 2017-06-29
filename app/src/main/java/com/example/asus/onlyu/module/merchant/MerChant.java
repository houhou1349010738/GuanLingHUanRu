package com.example.asus.onlyu.module.merchant;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.adapter.Marter_Adapter;
import com.example.asus.onlyu.base.BasePresenterImpl;
import com.example.asus.onlyu.base.MVPBaseFragment;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * 作者：${CaiJianNan}
 * 时间2017/6/27 10:04
 * 邮箱：17600157003@163.com
 */

public class MerChant<T> extends MVPBaseFragment<T> implements View.OnClickListener {

    @BindView(R.id.marter_edit)
    EditText     mMarterEdit;
    @BindView(R.id.marter_ssoke)
    RadioButton  mMarterSsoke;
    @BindView(R.id.marter_tea)
    RadioButton  mMarterTea;
    @BindView(R.id.marter_tea1)
    RadioButton  mMarterTea1;
    @BindView(R.id.marter_tea2)
    RadioButton  mMarterTea2;
    @BindView(R.id.marter_tea3)
    RadioButton  mMarterTea3;
    @BindView(R.id.marter_tea4)
    RadioButton  mMarterTea4;
    @BindView(R.id.marter_radio)
    RadioGroup   mMarterRadio;
    @BindView(R.id.marter_recycler)
    RecyclerView mMarterRecycler;
    @BindView(R.id.marter_bnt)
    Button       mMarterBnt;
    Unbinder unbinder;
    private BasePresenterImpl mBasePresenter;

    @Override
    protected void initdata() {
        mBasePresenter = new BasePresenterImpl();
        mBasePresenter.GetDataModel();
    }

    @Override
    protected void initView() {
        mMarterRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        Marter_Adapter adapter = new Marter_Adapter(getActivity());
        mMarterRecycler.setAdapter(adapter);
    }

    @Override
    protected int layoutRes() {
        return R.layout.marter_fragment;
    }


    @Override
    public void UpData(T o) {

    }

    @Override
    public void onClick(View v) {

    }

    @OnClick({R.id.marter_ssoke, R.id.marter_tea, R.id.marter_tea1, R.id.marter_tea2, R.id.marter_tea3, R.id.marter_tea4, R.id.marter_bnt})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.marter_ssoke:
                break;
            case R.id.marter_tea:
                break;
            case R.id.marter_tea1:
                break;
            case R.id.marter_tea2:
                break;
            case R.id.marter_tea3:
                break;
            case R.id.marter_tea4:
                break;
            case R.id.marter_bnt:
                startActivity(new Intent(getActivity(),Shopping_Activity.class));
                break;
        }
    }
}
