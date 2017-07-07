package com.example.asus.onlyu.module.merchant;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.asus.onlyu.R;
import com.example.asus.onlyu.adapter.Details_Adapter_photoitem;
import com.example.asus.onlyu.adapter.Details_Adapter_shangpingitem;
import com.example.asus.onlyu.base.MVPBaseActivity;
import com.example.asus.onlyu.module.home.utils.GildeImage;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.example.asus.onlyu.R.id.detailsa_banner;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/29 09:40
 * 邮箱：17600157003@163.com
 */

public class DetailsActivity extends MVPBaseActivity {


    @BindView(R.id.detailsa_fenxiang)
    ImageView    mDetailsaFenxiang;
    @BindView(detailsa_banner)
    Banner mDetailsaVp;
    @BindView(R.id.detailsa_price)
    TextView     mDetailsaPrice;
    @BindView(R.id.detailsa_chajia)
    TextView     mDetailsaChajia;
    @BindView(R.id.detailsa_dizhi)
    TextView     mDetailsaDizhi;
    @BindView(R.id.detailsa_xiaoliang)
    TextView     mDetailsaXiaoliang;
    @BindView(R.id.detailsa_inpo)
    TextView     mDetailsaInpo;
    @BindView(R.id.detailsa_yunfei)
    TextView     mDetailsaYunfei;
    @BindView(R.id.detailsa_tuihuo)
    TextView     mDetailsaTuihuo;
    @BindView(R.id.detailsa_xuanze)
    TextView     mDetailsaXuanze;
    @BindView(R.id.detailsa_xuanze_iv)
    ImageView    mDetailsaXuanzeIv;
    @BindView(R.id.detailsa_koubei)
    TextView     mDetailsaKoubei;
    @BindView(R.id.detailsa_bnt1)
    Button       mDetailsaBnt1;
    @BindView(R.id.detailsa_bnt2)
    Button       mDetailsaBnt2;
    @BindView(R.id.detailsa_bnt3)
    Button       mDetailsaBnt3;
    @BindView(R.id.detailsa_recycler)
    RecyclerView mDetailsaRecycler;
    @BindView(R.id.detailsa_pingjia)
    Button       mDetailsaPingjia;
    @BindView(R.id.detailsa_text1)
    TextView     mDetailsaText1;
    @BindView(R.id.detailsa_jijie)
    TextView     mDetailsaJijie;
    @BindView(R.id.detailsa_chengfen)
    TextView     mDetailsaChengfen;
    @BindView(R.id.detailsa_fengge)
    TextView     mDetailsaFengge;
    @BindView(R.id.detailsa_qiongchang)
    TextView     mDetailsaQiongchang;
    @BindView(R.id.detailsa_lin)
    LinearLayout mDetailsaLin;
    @BindView(R.id.detailsa_text2)
    TextView     mDetailsaText2;
    @BindView(R.id.detailsa_xiangqing_recycler)
    RecyclerView mDetailsaXiangqingRecycler;
    @BindView(R.id.detailsa_xiaoxi)
    ImageView    mDetailsaXiaoxi;
    @BindView(R.id.detailsa_yuanxin)
    ImageView    mDetailsaYuanxin;
    @BindView(R.id.detailsa_gouwucar)
    Button       mDetailsaGouwucar;

    private List<Integer> image = new ArrayList<>();
    @Override
    protected   void initview() {


    }

    @Override
    protected void initdata() {

        image.add(R.drawable.timg);
        image.add(R.drawable.timg);
        mDetailsaVp.setIndicatorGravity(BannerConfig.RIGHT);
        mDetailsaVp.setImages(image);
        mDetailsaVp.setImageLoader(new GildeImage());
        mDetailsaVp.isAutoPlay(true);
        mDetailsaVp.start();
        List<String> list=new ArrayList<>();
        list.add("第一");list.add("第二");list.add("第三");

        Details_Adapter_shangpingitem adapter = new Details_Adapter_shangpingitem(R.layout.detailsa_adapter_item,list);
        Details_Adapter_photoitem photoitem = new Details_Adapter_photoitem(R.layout.detailas_adapter_spitem,image);
        mDetailsaRecycler.setLayoutManager(new LinearLayoutManager(this));
        mDetailsaRecycler.setAdapter(adapter);
        mDetailsaXiangqingRecycler.setLayoutManager(new LinearLayoutManager(this));
        mDetailsaXiangqingRecycler.setAdapter(photoitem);
    }

    @Override
    protected int layoutRes() {
        return R.layout.detailsa_ctivity;
    }

    @Override
    public void UpData(Object o) {

    }



    @OnClick({R.id.detailsa_xiaoxi, R.id.detailsa_yuanxin, R.id.detailsa_gouwucar})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.detailsa_xiaoxi:
                break;
            case R.id.detailsa_yuanxin:
                break;
            case R.id.detailsa_gouwucar:
                break;
        }
    }
}
