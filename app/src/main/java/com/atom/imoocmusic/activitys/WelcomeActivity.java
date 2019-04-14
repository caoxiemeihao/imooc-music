package com.atom.imoocmusic.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.atom.imoocmusic.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends BaseActivity {

    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        init();
    }

    private void init() {
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() { // 主线程调用
//                Log.e("WelcomeActivity", "当前线程为 : " + Thread.currentThread());
                toLogin();
            }
        }, 3 * 1000);
    }

    /**
     * 跳转到主页
     */
    private void toMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     * 跳转到登陆
     */
    private void toLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
