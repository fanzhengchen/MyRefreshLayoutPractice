package com.fzc.refreshlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by fanzhengchen on 11/6/16.
 */

public class FzcLayout extends ViewGroup {


//    SwipeRefreshLayout
    public FzcLayout(Context context) {
        this(context, null);
    }

    public FzcLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FzcLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
