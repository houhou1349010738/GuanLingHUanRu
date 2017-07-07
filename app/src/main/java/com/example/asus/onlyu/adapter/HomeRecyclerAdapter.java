package com.example.asus.onlyu.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.module.home.utils.FontHelper;
import com.example.asus.onlyu.module.home.utils.GildeImage;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chengqianlang on 2017/6/28.
 */

public class HomeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;

    public HomeRecyclerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                View home_vp = LayoutInflater.from(mContext).inflate(R.layout.home_item_vp, parent, false);
                VpPart vpPart = new VpPart(home_vp);
                return vpPart;
            case 2:
                View threebutpart = LayoutInflater.from(mContext).inflate(R.layout.home_item_threebut, parent, false);
                Threebutpart tbp = new Threebutpart(threebutpart);
                return tbp;
            case 3:
                View midpart = LayoutInflater.from(mContext).inflate(R.layout.home_item_mid, parent, false);
                Mid mid = new Mid(midpart);
                return mid;
        }
        View home_item = LayoutInflater.from(mContext).inflate(R.layout.home_item, parent, false);
        Item item = new Item(home_item);
        return item;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
        }
        return 0;
    }

    public class VpPart extends RecyclerView.ViewHolder {
        Banner mBanner;

        public VpPart(View itemView) {
            super(itemView);
            AutoUtils.autoSize(itemView);
            mBanner = (Banner) itemView.findViewById(R.id.item_vp_banner);
            mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            mBanner.setIndicatorGravity(BannerConfig.RIGHT);
            mBanner.setImageLoader(new GildeImage());
            ArrayList<Object> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                list.add(R.drawable.banner);
            }
            mBanner.setImages(list);
            mBanner.start();
        }
    }

    public class Threebutpart extends RecyclerView.ViewHolder {
        @BindView(R.id.threebut_iv_shopping)
        ImageView mThreebutIvShopping;
        @BindView(R.id.threebut_tv_shopping)
        TextView mThreebutTvShopping;
        @BindView(R.id.threebut_iv_nfc)
        ImageView mThreebutIvNfc;
        @BindView(R.id.threebut_tv_nfc)
        TextView mThreebutTvNfc;
        @BindView(R.id.threebut_iv_twocode)
        ImageView mThreebutIvTwocode;
        @BindView(R.id.threebut_tv_twocode)
        TextView mThreebutTvTwocode;
        @BindView(R.id.threebut_iv_history)
        ImageView mThreebutIvHistory;
        @BindView(R.id.threebut_tv_history)
        TextView mThreebutTvHistory;

        Threebutpart(View view) {
            super(view);
            AutoUtils.autoSize(view);
            ButterKnife.bind(this, view);
            FontHelper.applyFont(mContext, mThreebutTvShopping, "fonts/PingFang Light.ttf");
            FontHelper.applyFont(mContext, mThreebutTvNfc, "fonts/PingFang Light.ttf");
            FontHelper.applyFont(mContext, mThreebutTvTwocode, "fonts/PingFang Light.ttf");
            FontHelper.applyFont(mContext, mThreebutTvHistory, "fonts/PingFang Light.ttf");
        }
    }

    public class Mid extends RecyclerView.ViewHolder {
        @BindView(R.id.mid_lltop)
        LinearLayout mMidLltop;
        @BindView(R.id.mid_recycle)
        RecyclerView mMidRecycle;
        @BindView(R.id.mid_llup)
        LinearLayout mMidLlup;
        @BindView(R.id.mid_tv_jxhh)
        TextView mMidTvJxhh;
        @BindView(R.id.mid_tv_ttzx)
        TextView mMidTvTtzx;

        Mid(View view) {
            super(view);
            AutoUtils.autoSize(view);
            ButterKnife.bind(this, view);
            HomeMidRecyclerAdapter midadapter = new HomeMidRecyclerAdapter(mContext);
            mMidRecycle.setAdapter(midadapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
            linearLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
            mMidRecycle.setLayoutManager(linearLayoutManager);
            FontHelper.applyFont(mContext,mMidTvJxhh,"fonts/msyhbd.ttc");
            FontHelper.applyFont(mContext,mMidTvTtzx,"fonts/msyhbd.ttc");
        }
    }

    public class Item extends RecyclerView.ViewHolder {
        @BindView(R.id.home_item_iv)
        ImageView mHomeItemIv;
        @BindView(R.id.home_item_tvname)
        TextView mHomeItemTvname;
        @BindView(R.id.home_item_tvtime)
        TextView mHomeItemTvtime;

        Item(View view) {
            super(view);
            AutoUtils.autoSize(view);
            ButterKnife.bind(this, view);
            FontHelper.applyFont(mContext, mHomeItemTvname, "fonts/PingFang Medium.ttf");
            FontHelper.applyFont(mContext, mHomeItemTvtime, "fonts/PingFang Medium.ttf");
        }
    }
}
