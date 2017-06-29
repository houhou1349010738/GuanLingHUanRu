package com.example.asus.onlyu.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.asus.onlyu.utlis.EventBusMessage;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public abstract class MVPBaseFragment<T> extends Fragment implements BaseView<T>{
    private View mFragView;
    private Unbinder mBind;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if(mFragView==null){
            mFragView = inflater.inflate(layoutRes(),null);
            mBind = ButterKnife.bind(this, mFragView);

            //配置EventBus
            EventBus.getDefault().register(this);
            initView();
            initdata();
        }
        ViewGroup parent = (ViewGroup) mFragView.getParent();
        if(parent!=null){
            parent.removeView(mFragView);
        }
        return mFragView;
    }

    protected abstract void initdata();

    protected abstract void initView();

    protected abstract int layoutRes();




    @Subscribe(threadMode = ThreadMode.MAIN)
    public void MyEventData(EventBusMessage t){

    }


    /**
     * 初始化的toolbar
     * @param toolbar
     * 显示toolbar是否显示字条目
     * @param isShow
     * toobar的标题
     * @param title
     */
        protected void  initToolBar(Toolbar toolbar, boolean isShow, String title){
        ((MVPBaseActivity)getActivity()).initToolBar(toolbar,isShow,title);

        }


        @Override
        public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
        }




        @Override
        public Context getContext() {
        return super.getContext();
    }

}
