package com.example.asus.onlyu.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.onlyu.R;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 09:55
 * 邮箱：17600157003@163.com
 */

public class Marter_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int ITEMONT = 0;
    private final int ITEMTWO = 1;


    public Marter_Adapter(Context context) {
        mContext = context;
    }

    private Context mContext;

    @Override
    public int getItemViewType(int position) {
        int i = position % 2;
        if (i == 0) {
            return ITEMONT;
        }
        return ITEMTWO;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEMONT) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.marter_adapter_item1, parent, false);
            ViewHolderOne holderOne = new ViewHolderOne(view);
            return holderOne;
        } if (viewType == ITEMTWO){
            View view = LayoutInflater.from(mContext).inflate(R.layout.marter_adapter_item2, parent, false);
            ViewHolderOne2 holderOne2 = new ViewHolderOne2(view);

            return holderOne2;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);


    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class ViewHolderOne extends RecyclerView.ViewHolder {
        @BindView(R.id.marter_adapter_tv)
        TextView mMarterAdapterTv;

        public ViewHolderOne(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.auto(itemView);

        }
    }

    public class ViewHolderOne2 extends RecyclerView.ViewHolder {
        @BindView(R.id.marter_atapter_recycler)
        RecyclerView mMarterAtapterRecycler;
        public ViewHolderOne2(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            mMarterAtapterRecycler.setLayoutManager(new GridLayoutManager(mContext,3));
            Marter_item_Adapter adapter = new Marter_item_Adapter(mContext);
            mMarterAtapterRecycler.setAdapter(adapter);
        }
    }
}
