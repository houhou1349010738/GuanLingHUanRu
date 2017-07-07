package com.example.asus.onlyu.module.home.utils;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.asus.onlyu.R;

/**
 * Created by chengqianlang on 2017/7/7.
 */

public class ShowDialog {
    //展示地理位置的dialog
    public static void showLocdialog(Context context,String msg) {
        //点击button跳转页面显示一个dialog，定义他的格式
        final Dialog dialog = new Dialog(context, R.style.AlertDialogStyle);
        //显示dialog
        dialog.show();
        // 实例化view并指定布局
        LayoutInflater inflater = LayoutInflater.from(context);
        View viewDialog = inflater.inflate(R.layout.view_alertdialog, null);
        // 根据view找控件
        Button but_neg = (Button) viewDialog.findViewById(R.id.btn_neg);
        Button but_pos = (Button) viewDialog.findViewById(R.id.btn_pos);
        TextView tv_msg = (TextView) viewDialog.findViewById(R.id.txt_msg);
        tv_msg.setText(msg);
        but_neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        but_pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        //设置dialog的宽高为屏幕的宽高
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setContentView(viewDialog, layoutParams);

    }
    //展示nfc的dialog
    public static void showNFCdialog(Context context,String msg) {
        //点击button跳转页面显示一个dialog，定义他的格式
        final Dialog dialog = new Dialog(context, R.style.AlertDialogStyle);
        //显示dialog
        dialog.show();
        // 实例化view并指定布局
        LayoutInflater inflater = LayoutInflater.from(context);
        View viewDialog = inflater.inflate(R.layout.view_alertdialog, null);
        // 根据view找控件
        Button but_neg = (Button) viewDialog.findViewById(R.id.btn_neg);
        FontHelper.applyFont(context,but_neg,FontHelper.WRYHL);
        Button but_pos = (Button) viewDialog.findViewById(R.id.btn_pos);
        FontHelper.applyFont(context,but_pos,FontHelper.WRYHL);
        TextView tv_msg = (TextView) viewDialog.findViewById(R.id.txt_msg);
        FontHelper.applyFont(context,tv_msg,FontHelper.WRYHL);
        tv_msg.setText(msg);
        but_neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        but_pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        //设置dialog的宽高为屏幕的宽高
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setContentView(viewDialog, layoutParams);

    }
}
