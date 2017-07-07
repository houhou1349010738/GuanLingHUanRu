package com.example.asus.onlyu.module.home.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.base.MVPBaseActivity;
import com.example.asus.onlyu.module.home.utils.FontHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Home_NFC_activity extends MVPBaseActivity {

    @BindView(R.id.nfc_iv_back)
    ImageView mNfcIvBack;
    @BindView(R.id.nfc_iv_help)
    ImageView mNfcIvHelp;
    @BindView(R.id.nfc_tv_l3_2)
    TextView mNfcTvL32;
    @BindView(R.id.nfc_title)
    TextView mNfcTitle;

    @Override
    protected void initview() {
        FontHelper.applyFont(this, mNfcTvL32, FontHelper.PFBD);
        FontHelper.applyFont(this, mNfcTitle, FontHelper.WRYHL);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_home__nfc;
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.nfc_iv_back, R.id.nfc_iv_help})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.nfc_iv_back:
                finish();
                break;
            case R.id.nfc_iv_help:

                break;
        }
    }
}
