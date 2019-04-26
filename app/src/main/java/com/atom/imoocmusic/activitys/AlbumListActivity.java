package com.atom.imoocmusic.activitys;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.atom.imoocmusic.R;
import com.atom.imoocmusic.adapters.MusicListAdapter;

public class AlbumListActivity extends BaseActivity {

    private RecyclerView mRvList;
    private MusicListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);

        initView();
    }

    private void initView() {
        initNavBar(true, "专辑列表", false);

        mRvList = fd(R.id.rv_list);
        mRvList.setLayoutManager(new LinearLayoutManager(AlbumListActivity.this));
        mRvList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mAdapter = new MusicListAdapter(AlbumListActivity.this, null);
        mRvList.setAdapter(mAdapter);
    }
}
