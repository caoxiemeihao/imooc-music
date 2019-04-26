package com.atom.imoocmusic.activitys;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.atom.imoocmusic.R;

public class PlayMusicActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        // 隐藏 statusBar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void onBackClick(View view) {
        onBackPressed();
    }
}
