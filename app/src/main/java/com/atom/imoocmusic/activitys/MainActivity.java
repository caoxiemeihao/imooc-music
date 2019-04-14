package com.atom.imoocmusic.activitys;

import android.os.Bundle;

import com.atom.imoocmusic.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        initNavBar(false, "Fire music", true);
    }
}
