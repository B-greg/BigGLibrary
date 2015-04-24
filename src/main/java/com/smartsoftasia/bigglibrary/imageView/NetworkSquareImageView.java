package com.smartsoftasia.bigglibrary.imageView;

import android.content.Context;
import android.util.AttributeSet;


/**
 * Created by gregoire on 9/4/14.
 */
public class NetworkSquareImageView extends AbstractImageView {

    public NetworkSquareImageView(Context context) {
        super(context);
    }

    public NetworkSquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();

         setMeasuredDimension(measuredWidth, measuredWidth);

    }

}
