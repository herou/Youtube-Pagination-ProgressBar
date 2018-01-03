package com.example.youtubepaginationprogressbar;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

/**
 * Created by Eljo Prifti on 1/3/2018.
 */

public class YoutubeProgressBar extends ProgressBar{

    ProgressBar progressBar;
    int transitionSpeed;
    int transitionY;
    int delay;

    public YoutubeProgressBar(Context context,ProgressBar progressBar) {
        super(context);
        this.progressBar = progressBar;

    }

    public ProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public int getTransitionSpeed() {
        return transitionSpeed;
    }

    public void setTransitionSpeed(int transitionSpeed) {
        this.transitionSpeed = transitionSpeed;
    }


    public int getTransitionY() {
        return transitionY;
    }

    public void setTransitionY(int transitionY) {
        this.transitionY = transitionY;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void showProgress(){
        progressBar.setVisibility(View.VISIBLE);
    }

    public void startTransition(int transitionSpeed,int transitionY){

        progressBar.animate()
                .setDuration(transitionSpeed)
                .translationY(transitionY);
    }

    public void hideProgress(int delay){

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                progressBar.setVisibility(View.GONE);

            }
        }, delay);
    }
}
