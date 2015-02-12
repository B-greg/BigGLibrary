package com.smartsoftasia.bigglibrary.Adapter;

import android.view.View;

/**
 * Created by gregoire on 11/11/14.
 */
public interface IRecycleEvent{
    public interface OnRecycleClick {
        public void onRecycleClick(int position);
    }
    public interface OnRecycleViewClick {
        public void onRecycleViewClick(int position, View view);
    }
    public interface OnLongRecycleClick{
        public void onLongRecycleClick(int position);
    }
}
