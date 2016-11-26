package com.fzc.myrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fanzhengchen on 11/6/16.
 */

public class FzcRefreshLayout extends ViewGroup {

    private View mTarget;
    private View mRefreshView;

    public FzcRefreshLayout(Context context) {
        this(context, null);
    }

    public FzcRefreshLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FzcRefreshLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }


    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
