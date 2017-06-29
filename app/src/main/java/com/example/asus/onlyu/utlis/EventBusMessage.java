package com.example.asus.onlyu.utlis;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/21 10:32
 * 邮箱：17600157003@163.com
 */

public class EventBusMessage<T>{
    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public EventBusMessage(T message) {
        this.message = message;
    }

    private T message;
}
