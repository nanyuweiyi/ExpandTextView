package com.lcodecore.expandtextview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class ListActivity extends BaseActivity {

    RecyclerView recyclerView;
    String[] sampleStrings;

    @Override
    public int setInflateId() {
        return R.layout.activity_list;
    }

    @Override
    public void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sampleStrings = getResources().getStringArray(R.array.sampleStrings);

        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        SampleTextListAdapter adapter = new SampleTextListAdapter(this, sampleStrings);
        recyclerView.setAdapter(adapter);

    }

}
