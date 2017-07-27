package com.stellarscript.youtubevideo;


public interface YouTubeEventListener {

    void onError(String message);

    void onTimeChanged(int time);

    void onEndReached();

    void onPlaying(int duration);

    void onPaused();

    void onSeekPerformed();

    void onBuffering(int buffering);

    void onReady();

}
