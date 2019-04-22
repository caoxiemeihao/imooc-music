package com.atom.imoocmusic.activitys;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.atom.imoocmusic.R;
import com.atom.imoocmusic.adapters.MusicGridAdapter;

public class MainActivity extends BaseActivity {

    private RecyclerView mRvGrid;
    private MusicGridAdapter mAdapter;

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
        mAdapter = new MusicGridAdapter(MainActivity.this);
        mRvGrid.setAdapter(mAdapter);
    }
}
