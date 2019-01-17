package com.zwy.cidemo.base.base;


import android.support.annotation.Keep;


@Keep
public interface BaseView<T> {

    void setPresenter(T presenter);

}
