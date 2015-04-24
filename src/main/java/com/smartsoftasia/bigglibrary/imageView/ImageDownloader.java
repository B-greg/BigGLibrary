package com.smartsoftasia.bigglibrary.imageView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.smartsoftasia.bigglibrary.R;


/**
 * Created by gui on 07/08/2014.
 */
public class ImageDownloader {
    private static final String TAG = "ImageDownloader";

    @Deprecated
    public static void init(Context context) {
/*        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.riv_blank).imageScaleType(ImageScaleType.IN_SAMPLE_INT)
                .displayer(new FadeInBitmapDisplayer(250)).bitmapConfig(Bitmap.Config.RGB_565)
                .cacheInMemory(true).cacheOnDisc(true).considerExifParams(true)
                .delayBeforeLoading(100).build();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .defaultDisplayImageOptions(options).denyCacheImageMultipleSizesInMemory()
                .threadPriority(Thread.NORM_PRIORITY + 3).memoryCache(new WeakMemoryCache()).memoryCacheExtraOptions(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
                .discCacheFileCount(500).build();

        if (!ImageLoader.getInstance().isInited()) {
            ImageLoader.getInstance().init(config);
        }*/
    }

    @Deprecated
    public static void init(Context context, Drawable drawable) {
/*        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(drawable).imageScaleType(ImageScaleType.IN_SAMPLE_INT)
                .displayer(new FadeInBitmapDisplayer(250)).bitmapConfig(Bitmap.Config.RGB_565)
                .cacheInMemory(true).cacheOnDisc(true).delayBeforeLoading(100).build();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .defaultDisplayImageOptions(options).denyCacheImageMultipleSizesInMemory()
                .threadPriority(Thread.NORM_PRIORITY + 3).memoryCache(new WeakMemoryCache())
                .discCacheFileCount(500).build();

        if (!ImageLoader.getInstance().isInited()) {
            ImageLoader.getInstance().init(config);
        }*/
    }

    public static void loadImage(final Context context, final String url, final ImageView imageView) {
        Glide.with(context)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .into(imageView);
    }

    public static void loadImage(final Context context, final String url, final ImageView imageView,
                                 final int downloadIndicator) {
        Glide.with(context)
                .load(url)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .placeholder(downloadIndicator)
                .crossFade()
                .into(imageView);
    }


}
