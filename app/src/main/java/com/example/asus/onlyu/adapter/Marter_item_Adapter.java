package com.example.asus.onlyu.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.module.merchant.Shopping_Activity;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 11:11
 * 邮箱：17600157003@163.com
 */

public class Marter_item_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    public Marter_item_Adapter(Context context) {
        mContext = context;
    }

    private Context mContext;
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.marter_item_adapter,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, Shopping_Activity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 6;
    }
    public  class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
