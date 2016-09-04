package com.padc.xxx;

import android.app.Application;
import android.content.Context;

/**
 * Created by aung on 9/4/16.
 */
public class XXXApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
