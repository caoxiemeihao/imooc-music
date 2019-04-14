package com.atom.imoocmusic.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.atom.imoocmusic.R;
import com.atom.imoocmusic.utils.UserUtils;
import com.atom.imoocmusic.views.inputView;

public class LoginActivity extends BaseActivity {

    private inputView mInputPhone, mInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        initNavBar(false, "登录", false);

        mInputPhone = fd(R.id.input_phone);
        mInputPassword = fd(R.id.input_password);
    }

    public void onRegisterClick(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void onCommitClick(View view) {
//        Log.e("LoginActivity", "======================");
        String phone = mInputPhone.getInputStr();
        String password = mInputPassword.getInputStr();

        // 验证输入合法性
        if (!UserUtils.validateLogin(this, phone, password)) return;

        // 跳转到首页
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
