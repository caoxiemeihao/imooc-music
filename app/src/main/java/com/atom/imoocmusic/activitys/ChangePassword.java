package com.atom.imoocmusic.activitys;

import android.os.Bundle;

import com.atom.imoocmusic.R;

public class ChangePassword extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        initView();
    }

    private void initView() {
        initNavBar(true, "修改密码", false);
    }
}
