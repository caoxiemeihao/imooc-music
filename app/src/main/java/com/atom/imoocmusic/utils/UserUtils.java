package com.atom.imoocmusic.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.atom.imoocmusic.R;
import com.atom.imoocmusic.activitys.LoginActivity;
import com.blankj.utilcode.util.RegexUtils;

public class UserUtils {

    /**
     * 验证登录用户输入合法性
     */
    public static boolean validateLogin(Context context, String phone, String password) {
        // 简单的
        // RegexUtils.isMobileSimple(phone);
        // 精确地
        if (!RegexUtils.isMobileExact(phone)) {
            Toast.makeText(context, "无效手机号", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    /**
     * 退出登录
     */
    public static void logout(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        // 添加 Intent 标识符 -> 清理 Task 栈 -> 新生成一个 Task 栈
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        // 手动生成的 Task 栈，需要手动还原 Activity 切换的过度动画 | 一定要放在 startActivity 后面
        ((Activity)context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);
    }
}
