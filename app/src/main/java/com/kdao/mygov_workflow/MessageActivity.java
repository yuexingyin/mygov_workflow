package com.kdao.mygov_workflow;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        setupBottomBar();
    }

    /**
     * Private function to set up bottom bar
     */
    private void setupBottomBar() {
        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setDefaultTabPosition(3);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_home) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    Intent newIntent = new Intent(MessageActivity.this, MainActivity.class);
                    startActivity(newIntent);
                } else if (tabId == R.id.tab_claim) {
                    Intent newIntent = new Intent(MessageActivity.this, ClaimActivity.class);
                    startActivity(newIntent);
                } else if (tabId == R.id.tab_tracking) {
                    Intent newIntent = new Intent(MessageActivity.this, TrackingActivity.class);
                    startActivity(newIntent);
                }
            }
        });

    }
}
