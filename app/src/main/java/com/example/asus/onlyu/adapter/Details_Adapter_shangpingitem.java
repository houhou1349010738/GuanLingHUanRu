package com.example.asus.onlyu.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;


/**
 * 作者：${CaiJianNan}
 * 时间2017/7/5 19:44
 * 邮箱：17600157003@163.com
 */

public class Details_Adapter_shangpingitem<T> extends BaseQuickAdapter<T,BaseViewHolder> {

    public Details_Adapter_shangpingitem(@LayoutRes int layoutResId, @Nullable List<T> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, T item) {

    }
}
