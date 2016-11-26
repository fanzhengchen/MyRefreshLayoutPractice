package com.fzc.refreshlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fzc.myrefresh.FzcRefreshView;

public class MainActivity extends AppCompatActivity {


    private FzcRefreshView mRefreshView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
