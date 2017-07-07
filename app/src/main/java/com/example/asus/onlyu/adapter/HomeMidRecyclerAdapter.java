package com.example.asus.onlyu.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.module.home.utils.FontHelper;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chengqianlang on 2017/7/5.
 */

public class HomeMidRecyclerAdapter extends RecyclerView.Adapter<HomeMidRecyclerAdapter.ViewHolder> {
    private Context mContext;

    public HomeMidRecyclerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(mContext).inflate(R.layout.home_mid_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.home_mid_item_iv)
        ImageView mHomeMidItemIv;
        @BindView(R.id.home_mid_item_tvname)
        TextView mHomeMidItemTvname;
        @BindView(R.id.home_mid_item_tvmoney)
        TextView mHomeMidItemTvmoney;
        @BindView(R.id.home_mid_item_tvoldmoney)
        TextView mHomeMidItemTvoldmoney;
        public ViewHolder(View itemView) {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
            mHomeMidItemTvoldmoney.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            FontHelper.applyFont(mContext,mHomeMidItemTvname, FontHelper.WRYH);
            FontHelper.applyFont(mContext,mHomeMidItemTvmoney,FontHelper.WRYH);
            FontHelper.applyFont(mContext,mHomeMidItemTvoldmoney,FontHelper.WRYH);
        }
    }

}
