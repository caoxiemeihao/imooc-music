package com.atom.imoocmusic.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.atom.imoocmusic.R;
import com.atom.imoocmusic.activitys.PlayMusicActivity;
import com.bumptech.glide.Glide;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.ViewHolder> {

    private Context mContext;
    private View mItemView;
    private RecyclerView mRv;
    private boolean isCalculationRvHeight;
    private String imgUrl = "https://y.gtimg.cn/music/photo_new/T002R300x300M000003w7iL42J7TjH.jpg?max_age=2592000";

    public  MusicListAdapter(Context context, RecyclerView recyclerView) {
        mContext = context;
        mRv = recyclerView;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        mItemView = LayoutInflater.from(mContext).inflate(R.layout.item_list_music, viewGroup, false);
        return new ViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        setRecyclerViewHeight();

        Glide.with(mContext)
                .load(imgUrl)
                .into(viewHolder.ivCion);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, PlayMusicActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    /**
     * 设置RecyclerView高度
     */
    private void setRecyclerViewHeight() {

        if (isCalculationRvHeight || mRv == null) return;

        isCalculationRvHeight = true;

        // 获取itemView高度
        RecyclerView.LayoutParams itemLp = (RecyclerView.LayoutParams) mItemView.getLayoutParams();

        // 设置RecyclerView高度
        LinearLayout.LayoutParams rvLp = (LinearLayout.LayoutParams) mRv.getLayoutParams();
        rvLp.height = itemLp.height * this.getItemCount();
        mRv.setLayoutParams(rvLp);
    }

    class ViewHolder extends  RecyclerView.ViewHolder {

        ImageView ivCion;
        View itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;

            ivCion = itemView.findViewById(R.id.iv_icon);
        }
    }
}
