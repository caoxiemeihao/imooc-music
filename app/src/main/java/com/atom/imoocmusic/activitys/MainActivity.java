package com.atom.imoocmusic.activitys;

import android.net.MacAddress;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.atom.imoocmusic.R;
import com.atom.imoocmusic.adapters.MusicGridAdapter;
import com.atom.imoocmusic.adapters.MusicListAdapter;
import com.atom.imoocmusic.views.GridSpaceItemDecoration;

public class MainActivity extends BaseActivity {

    private RecyclerView mRvGrid, mRvList ;
    private MusicGridAdapter mGridAdapter;
    private MusicListAdapter mListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        initNavBar(false, "Fire music", true);

        mRvGrid = fd(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(MainActivity.this, 3));
        mRvGrid.addItemDecoration(new GridSpaceItemDecoration(
                getResources().getDimensionPixelSize(R.dimen.albumMarginSize), mRvGrid));
        mRvGrid.setNestedScrollingEnabled(false);
        mGridAdapter = new MusicGridAdapter(MainActivity.this);
        mRvGrid.setAdapter(mGridAdapter);

        mRvList = fd(R.id.rv_list);
        mRvList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRvList.setNestedScrollingEnabled(false);
        mListAdapter = new MusicListAdapter(MainActivity.this);
        mRvList.setAdapter(mListAdapter);
    }
}
