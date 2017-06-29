package com.example.asus.onlyu.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.module.merchant.DetailsActivity;


/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 20:51
 * 邮箱：17600157003@163.com
 */

public class Shopping_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;

    public Shopping_adapter(Context context) {
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.shopping_adapter_item,parent,false);
        ViewHolder holder  = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
     ViewHolder adapter = (ViewHolder) holder;
        adapter.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext,DetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
