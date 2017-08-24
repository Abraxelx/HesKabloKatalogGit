package com.example.hes_stajyer.heskablokatalog;

import android.os.Handler;
import android.widget.ImageView;

/**
 * Created by Hes_Stajyer on 22.08.2017.
 */

public class LoadingScreen {
    private ImageView loading;

    LoadingScreen(ImageView loading) {
        this.loading = loading;
    }

    public void setLoadScreen(){
        final Integer[] loadingImages = {R.mipmap.loading};
        final Handler loadingHandler = new Handler();
        Runnable runnable = new Runnable() {
            int loadingImgIndex = 0;
            public void run() {
                loading.setImageResource(loadingImages[loadingImgIndex]);
                loadingImgIndex++;
                if (loadingImgIndex >= loadingImages.length)
                    loadingImgIndex = 0;
                loadingHandler.postDelayed(this, 500);//change to accordingly(i.e. 12000)
            }
        };
        loadingHandler.postDelayed(runnable, 500); // change it accordingly
    }}