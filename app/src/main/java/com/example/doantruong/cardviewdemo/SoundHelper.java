package com.example.doantruong.cardviewdemo;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by DOANTRUONG on 12/5/2016.
 */

public class SoundHelper {
    private MediaPlayer mMusicPlayer;

    public SoundHelper() {
    }

    public void prepareMusicPlayer(Context context) {
        mMusicPlayer = MediaPlayer.create(context.getApplicationContext(),
                R.raw.animalsoundsong);
        mMusicPlayer.setVolume(.5f, .5f);
        mMusicPlayer.setLooping(true);
    }

    public void playMusic() {
        if (mMusicPlayer != null) {
            mMusicPlayer.start();
        }
    }
}
