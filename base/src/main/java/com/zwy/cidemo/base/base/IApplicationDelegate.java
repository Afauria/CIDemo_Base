package com.zwy.cidemo.base.base;

import android.support.annotation.Keep;

@Keep
public interface IApplicationDelegate {

    void onCreate();

    void onTerminate();

    void onLowMemory();

    void onTrimMemory(int level);

}
