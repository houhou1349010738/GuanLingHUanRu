package com.example.retrofitlibrary;

import android.content.Context;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/26 14:13
 * 邮箱：17600157003@163.com
 * 实现Retorfit网络请求的工具类
 */

public class RetrofitClientUtlis {

    private static final int DEFAULT_TIMEOUT = 5;

    private        BaseApiServicer        apiService;
    private        Retrofit            mRetrofit;
    private static Context             mContext;
    private        OkHttpClient        okHttpClient;
    private static RetrofitClientUtlis sNewInstance;

    /**
     * 创建单利模式
     *有请求头回调的方法
     */
    public static RetrofitClientUtlis getInstance(Context context, String url, Map<String, String> headers) {
        if (context != null) {
            mContext = context;
        }
        return new RetrofitClientUtlis(context, url, headers);
    }
    /**
     * 创建单利模式
     *没有添加请求头回调的方法
     */

    public static RetrofitClientUtlis getInstance(Context context, String url) {

    if (context != null) {
    mContext = context;
    }
    return new RetrofitClientUtlis(context, url);
    }


    private RetrofitClientUtlis(Context context, String url) {
    this(context, url, null);
    }


    /**
     * create BaseApi  defalte ApiManager
     *
     * @return ApiManager
     */
    public RetrofitClientUtlis createBaseApi() {
        apiService = create(BaseApiServicer.class);
        return this;
    }



    public   <T> T create(final Class<T> service) {
        if (service == null) {
            throw new RuntimeException("Api service is null!");
        }
        return  mRetrofit.create(service);
    }

    /**
     * 创建构造器添加拦截器
     * @param context
     * @param uri
     * @param headers
     */
    private RetrofitClientUtlis(Context context, String uri, Map<String, String> headers){
    HttpLoggingInterceptor interceptor= new HttpLoggingInterceptor()
    .setLevel(HttpLoggingInterceptor.Level.HEADERS);
    okHttpClient = new OkHttpClient.Builder()
    .addNetworkInterceptor(interceptor).addInterceptor(new BaseInterceptor(headers))
    .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
    .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).build();

        /**
         * Retrofit添加OKHTTP
         * 支持解析对象
         * 支持RXJAVA
         */
    mRetrofit = new Retrofit.Builder().client(okHttpClient)
    .addConverterFactory(GsonConverterFactory.create())
    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    .baseUrl(uri)
    .build();
    }


    /**
     * Get请求
     * @param uri
     * @param map
     * @param o
     */
    public void get(String uri, Map<String,String> map, Observer o){
     apiService.executeGet(uri,map)
     .observeOn(Schedulers.io())
     .unsubscribeOn(Schedulers.io())
     .observeOn(AndroidSchedulers.mainThread())
     .subscribe(o);
    }


    /**
     * POst请求
     * @param uri
     * @param map
     * @param o
     */
    public void post(String uri, Map<String,String> map, Observer o){
        apiService.executePost(uri,map)
                .observeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(o);
    }

    /**
     *
     * @param observable
     * @param o
     * @param <T>
     * @return
     */
    public static <T> T execute(Observable<T> observable,Observer o) {
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(o);

        return null;
    }


}
