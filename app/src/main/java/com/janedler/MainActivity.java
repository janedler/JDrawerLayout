package com.janedler;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private DrawerLayout drawerLayout;
    private Button mSlidingBtn;
    private Button mContentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mContentBtn = (Button) findViewById(R.id.content_btn);
        mSlidingBtn = (Button) findViewById(R.id.sliding_btn);

        mContentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mContentBtn", Toast.LENGTH_SHORT).show();
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        mSlidingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"mSlidingBtn",Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
            }
        });

        mSlidingBtn.postDelayed(new Runnable() {
            @Override
            public void run() {
                //drawerLayout.openDrawer(Gravity.LEFT);
            }
        }, 2000);

        mSlidingBtn.postDelayed(new Runnable() {
            @Override
            public void run() {
                //drawerLayout.closeDrawers();
            }
        },4000);

        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED); //关闭手势滑动
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED); //打开手势滑动
    }
}
