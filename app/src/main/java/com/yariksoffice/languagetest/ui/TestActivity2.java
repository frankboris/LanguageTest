package com.yariksoffice.languagetest.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.yariksoffice.languagetest.R;

public class TestActivity2 extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_2);
        //noinspection ConstantConditions
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}