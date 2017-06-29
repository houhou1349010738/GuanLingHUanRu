package com.example.asus.onlyu.module.merchant;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.adapter.Shopping_adapter;
import com.example.asus.onlyu.base.MVPBaseActivity;

import butterknife.BindView;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 14:22
 * 邮箱：17600157003@163.com
 */

public class Shopping_Activity extends MVPBaseActivity {
    @BindView(R.id.shopping_finsh)
    ImageView    mShoppingFinsh;
    @BindView(R.id.shopping_edit)
    EditText     mShoppingEdit;
    @BindView(R.id.shopping_menu)
    ImageView    mShoppingMenu;
    @BindView(R.id.shopping_recycler)
    RecyclerView mShoppingRecycler;

    @Override
    protected void initview() {
    mShoppingRecycler.setLayoutManager(new GridLayoutManager(this,2));
        Shopping_adapter adapter = new Shopping_adapter(this);
        mShoppingRecycler.setAdapter(adapter);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.shopping_activity;
    }

    @Override
    public void UpData(Object o) {

    }


}
