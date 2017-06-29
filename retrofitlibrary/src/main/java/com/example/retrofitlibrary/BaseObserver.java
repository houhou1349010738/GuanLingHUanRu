package com.example.retrofitlibrary;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/26 16:51
 * 邮箱：17600157003@163.com
 */

public class BaseObserver<T> implements Observer<T>{
    public BaseObserver(BaseSuccess success) {
        mSuccess = success;
    }

    private BaseSuccess mSuccess;
    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull T o) {
        mSuccess.Sueccess(o);
    }

    @Override
    public void onError(@NonNull Throwable e) {
        mSuccess.Error(e.toString());
    }

    @Override
    public void onComplete() {

    }
}
