package com.smartsoftasia.bigglibrary.imageView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


public class ImageHelper {

    public interface ImageDownloaderListener {
        public void onDone(boolean success, int result, Object response);
    }

    public static final int IMAGE_DOWNLOAD_SUCCESS = 1;
    public static final int IMAGE_DOWNLOAD_FAIL = 2;
    public static final int IMAGE_DOWNLOAD_CANCEL = 3;

    @Deprecated
    public static void init(Context context) {
    }

    public static void loadImage(Context context, final String url, final ImageView imageView) {
        Glide.with(context)
                .load(url)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .crossFade()
                .into(imageView);
    }

    @Deprecated
    public static void loadImage(Context context, final String url, final ImageView imageView,
                                 final ImageDownloaderListener listener) {
        Glide.with(context)
                .load(url)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .crossFade()
                .into(imageView);
    }


}
