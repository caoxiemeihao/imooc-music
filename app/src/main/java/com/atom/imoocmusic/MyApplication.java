package com.atom.imoocmusic;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

import io.realm.Realm;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // init it in the function of onCreate in ur Application
        Utils.init(MyApplication.this);
        Realm.init(this);
    }
}
