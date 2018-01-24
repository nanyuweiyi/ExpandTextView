package com.lcodecore.expandtextview;

import android.support.v7.widget.Toolbar;

import com.lcodecore.extextview.ExpandTextView;

public class MainActivity extends BaseActivity {

    @Override
    public int setInflateId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String test = getString(R.string.test);

        ExpandTextView tv = (ExpandTextView) findViewById(R.id.tvTest);
        tv.setText(test);
    }

}
