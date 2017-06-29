package com.example.asus.onlyu.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;

import com.example.asus.onlyu.utlis.EventBusMessage;
import com.zhy.autolayout.AutoLayoutActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.lang.reflect.ParameterizedType;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public abstract class MVPBaseActivity<T> extends AutoLayoutActivity implements BaseView<T>{
    private Unbinder mBind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // 进行数据恢复
        super.onCreate(savedInstanceState);
        setContentView(layoutRes());

        //配置黄油刀
        mBind = ButterKnife.bind(this);
        //配置EventBus
        EventBus.getDefault().register(this);
        //创建一个初始化试图的方法
        initview();
        //创建一个初始化数据的方法
        initdata();

        }

        protected abstract void initview();

        protected abstract void initdata();

        protected abstract int layoutRes();


        /**
        * EventBus获取值执行的方法
        * @param t
        */
        @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
        public void MyEventData(EventBusMessage t){

        }


        /**
        * 替换Fragment的方法
        * @param contentView
        * @param fragment
         * @param tag
        */
        protected void replaceFragment(int contentView,Fragment fragment,String tag){
        //判断需要覆盖的Fragment的标记为空的话就重新覆盖
        if(getSupportFragmentManager().findFragmentByTag(tag)==null){
        getSupportFragmentManager().beginTransaction()
        .replace(contentView,fragment,tag)
        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        .addToBackStack(tag)
        .commit();
        }else{
        // 存在则弹出在它上面的所有fragment，并显示对应fragment
        getSupportFragmentManager().popBackStack(tag, 0);
        }
        }
        /**
        * 添加fragment
        * @param contentView
        * @param fragment
        * @param tag
        */
        protected void addFragment(int contentView, Fragment fragment, String tag){
        getSupportFragmentManager()
        .beginTransaction()
        .add(contentView,fragment,tag)
        .commit();
        }





    /**
     * 初始化一个toobar的方法
     * @param toolbar
     * @param isShow
     * @param title
     */
        protected void initToolBar(Toolbar toolbar, boolean isShow, String title){
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        //是否显示子条目
        getSupportActionBar().setDisplayHomeAsUpEnabled(isShow);
        }

        /**
        * 初始化TooBar
        * @param toolbar
        * @param homeAsUpEnabled
        * @param resTitle
        */
        protected void initToolBar(Toolbar toolbar, boolean homeAsUpEnabled, int resTitle) {
        initToolBar(toolbar, homeAsUpEnabled, getString(resTitle));
        }




        /**
        * 销毁解绑黄油刀
        * 和EVENTBus
        */
        @Override
        protected void onDestroy() {
        super.onDestroy();

            //解绑Butt
            mBind.unbind();
            //解绑EventBus
            EventBus.getDefault().unregister(this);
        }






    /**
     * C初始化P程接口的方法
     * @param o
     * @param i
     * @param <T>
     * @return
     */
        public  <T> T getInstance(Object o, int i) {
        try {
        return ((Class<T>) ((ParameterizedType) (o.getClass()
        .getGenericSuperclass())).getActualTypeArguments()[i])
        .newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return null;
    }
}
