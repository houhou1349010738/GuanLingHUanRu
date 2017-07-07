package com.example.asus.onlyu.module.home.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.base.MVPBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Home_NFC_activity extends MVPBaseActivity {

    @BindView(R.id.nfc_iv_back)
    ImageView mNfcIvBack;
    @BindView(R.id.nfc_iv_help)
    ImageView mNfcIvHelp;

    @Override
    protected void initview() {

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
