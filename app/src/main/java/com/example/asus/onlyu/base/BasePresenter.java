package com.example.asus.onlyu.base;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public interface  BasePresenter<T>{
    /**
     * BaseP层关联View层里的数据
     * @param
     */

    void SetDataModel(T t);

    /**
     * BaseP层解除View层里的数据
     * @param
     */
    void GetDataModel();
}
