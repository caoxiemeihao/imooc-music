package com.atom.imoocmusic.activitys;

import android.os.Bundle;
import android.util.Log;

import com.atom.imoocmusic.R;

public class RegisterActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
    }

    private void initView() {
        Log.e("RegisterActivity", "===============");
        initNavBar(true, "注册", false);
    }
}
