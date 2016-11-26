package com.fzc.myrefresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by fanzhengchen on 11/6/16.
 */

public class FzcRefreshView extends View {


    private FzcAnimation mRefreshAnimation;
    private int mCenterX;
    private int mCenterY;
    private Paint mPaint;

    public FzcRefreshView(Context context) {
        this(context, null);
    }

    public FzcRefreshView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FzcRefreshView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.GREEN);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mCenterX = MeasureSpec.getSize(widthMeasureSpec) >> 1;
        mCenterY = MeasureSpec.getSize(heightMeasureSpec) >> 1;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
//        mRefreshAnimation = new FzcAnimation(0, 359, mCenterX, mCenterY, 10, true);
//        mRefreshAnimation.setDuration(3000);
//        mRefreshAnimation.setRepeatCount(-1);
//        mRefreshAnimation.setRepeatMode(Animation.REVERSE);
//        startAnimation(mRefreshAnimation);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawCircle(canvas);
    }

    void drawCircle(Canvas canvas) {
        canvas.drawCircle(mCenterX, mCenterY, 30, mPaint);
    }

}
