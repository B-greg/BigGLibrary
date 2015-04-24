package com.smartsoftasia.bigglibrary.imageView;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by gui on 07/08/2014.
 */
public class NetworkImageView extends AbstractImageView{
    private static final String TAG = "GBImageView";

    public NetworkImageView(Context context) {
        super(context);
    }

    public NetworkImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        if (widthByHeight != 0) {
            width = (int) (height * widthByHeight);
        } else if (heightByWidth != 0) {
            height = (int) (width * heightByWidth);
        }

        setMeasuredDimension(width, height);
    }

}
