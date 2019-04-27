package com.atom.imoocmusic.activitys;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.atom.imoocmusic.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class PlayMusicActivity extends BaseActivity {

    private ImageView mIvBg;
    private String imgUrl = "https://y.gtimg.cn/music/photo_new/T002R300x300M000003w7iL42J7TjH.jpg?max_age=2592000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        // 隐藏 statusBar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        initView();
        Glide.with(this)
                .load(imgUrl)
                .apply(RequestOptions.bitmapTransform(new BlurTransformation(25, 10)))
                .into(mIvBg);
    }

    private void initView() {
        mIvBg = fd(R.id.iv_bg);
    }

    public void onBackClick(View view) {
        onBackPressed();
    }
}
