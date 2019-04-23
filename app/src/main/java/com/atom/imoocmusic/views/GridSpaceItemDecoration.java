package com.atom.imoocmusic.views;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class GridSpaceItemDecoration extends RecyclerView.ItemDecoration {

    private int mSpace;

    public GridSpaceItemDecoration(int space, RecyclerView parent) {
        mSpace = space;
        getRecyclerViewOffstes(parent);
    }

    /**
     * @param outRect Itemd的矩形边界
     * @param view    ItemView
     * @param parent  RecyclerView
     * @param state   RecyclerView的状态
     */
    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.left = mSpace; // 每个item距离左侧偏移量
        // 判断每一行第一个item
//        会出现图片缩小问题
//        if (parent.getChildLayoutPosition(view) % 3 == 0) {
//            outRect.left = 0;
//        }
    }

    private void getRecyclerViewOffstes(RecyclerView parent) {
        // 用负margin值实现，抵消最左边的边线
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) parent.getLayoutParams();
        layoutParams.leftMargin = -mSpace;
        parent.setLayoutParams(layoutParams);
    }
}
