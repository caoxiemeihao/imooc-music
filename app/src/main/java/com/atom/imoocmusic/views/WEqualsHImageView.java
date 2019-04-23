package com.atom.imoocmusic.views;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

// AppCompatImageView
public class WEqualsHImageView extends AppCompatImageView {
    public WEqualsHImageView(Context context) {
        super(context);
    }

    public WEqualsHImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WEqualsHImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        /**
         * 宽高相等的ImageView
         * super.onMeasure 根据传入的宽高参数计算宽高，如果宽高传入相同的参数，那么就会得到宽高相等的ImageView
         */
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        /*
        int width = MeasureSpec.getSize(widthMeasureSpec); // 获取view宽度
        int mode = MeasureSpec.getMode(widthMeasureSpec); // 获取view模式[match_parent、wrap_content、dp...]
        */

    }
}
