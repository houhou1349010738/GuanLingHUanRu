package com.example.asus.onlyu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.module.home.utils.GildeImage;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;

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
        switch (viewType){
            case 1:
                View home_vp = View.inflate(mContext, R.layout.home_item_vp, null);
                VpPart vpPart = new VpPart(home_vp);
                return vpPart;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position){
            case 0:
                return 1;

        }
        return 0;
    }

    public class VpPart extends RecyclerView.ViewHolder{
        Banner mBanner;
        public VpPart(View itemView) {
            super(itemView);
            mBanner= (Banner) itemView.findViewById(R.id.item_vp_banner);
            mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            mBanner.setIndicatorGravity(BannerConfig.RIGHT);
            mBanner.setImageLoader(new GildeImage());
            ArrayList<Object> list = new ArrayList<>();
            for (int i = 0; i <5 ; i++) {
                list.add(R.drawable.banner);
            }
            mBanner.setImages(list);
            mBanner.start();
        }
    }
}
