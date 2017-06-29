package com.example.retrofitlibrary;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/26 16:52
 * 邮箱：17600157003@163.com
 */

public interface BaseSuccess<T>{
    void Sueccess(T t);
    void Error(String str);
}
