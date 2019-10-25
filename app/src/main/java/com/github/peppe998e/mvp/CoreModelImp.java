package com.github.peppe998e.mvp;

import android.app.Application;

import com.github.peppe998e.mvp.utils.CallBack;

import java.util.Locale;

/**
 * This class is the main MODEL of the application,
 * the main feature is that of being a mono-instance,
 * therefore all presenters share the same variables and methods
 *
 */
public class CoreModelImp extends Application implements CoreModel {
    int x = 0;

    @Override
    public void onCreate() {
        // Do something when app starts
        super.onCreate();
    }

    public void testString(CallBack<String> cb) {
        String toCallBackToast = String.format(Locale.getDefault(), "Clicked %d time(s)!", ++x);
        cb.exec(toCallBackToast);
    }

}
