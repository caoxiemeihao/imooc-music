package com.atom.imoocmusic.helps;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;

import java.io.IOException;

public class MediaPlayHelp {

    private static MediaPlayHelp instance;

    private Context mContext;
    private MediaPlayer mMediaPlayer;
    private String mPath;
    private OnMedaiPlayHelpListener onMedaiPlayHelpListener;

    public void setOnMedaiPlayHelpListener(OnMedaiPlayHelpListener onMedaiPlayHelpListener) {
        this.onMedaiPlayHelpListener = onMedaiPlayHelpListener;
    }

    public static MediaPlayHelp getInstance(Context context) {
        if (instance == null) {
            synchronized (MediaPlayHelp.class) {
                if (instance == null) {
                    instance = new MediaPlayHelp(context);
                }
            }
        }

        return instance;
    }

    private MediaPlayHelp(Context context) {
        mContext = context;
        mMediaPlayer = new MediaPlayer();
    }

    /**
     * 1、setPath: 当前需要播放的音乐
     * 2、start: 播放音乐
     * 3、pause: 暂停播放
     */
    public void setPath(String path) {
        mPath = path;

        /**
         * 1、音乐正在播放，重置音乐播放状态
         * 2、设置音乐播放路径
         * 3、准备播放
         */
        if (mMediaPlayer.isPlaying()) {
            mMediaPlayer.reset();
        }

        try {
            mMediaPlayer.setDataSource(mContext, Uri.parse(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        mMediaPlayer.prepareAsync();
        mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                if (onMedaiPlayHelpListener != null) {
                    onMedaiPlayHelpListener.onPrepared(mediaPlayer);
                }
            }
        });
    }

    public String getPath() {
        return mPath;
    }

    public void start() {
        if (mMediaPlayer.isPlaying()) return;
        mMediaPlayer.start();
    }

    public void pause() {
        mMediaPlayer.pause();
    }

    public interface OnMedaiPlayHelpListener {
        void onPrepared(MediaPlayer mp);
    }
}
