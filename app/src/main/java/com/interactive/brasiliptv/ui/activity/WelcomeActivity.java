package com.interactive.brasiliptv.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Stub WelcomeActivity - original class is in decompiled package p061ui.
 * Original: com.interactive.brasiliptv.p061ui.activity.WelcomeActivity
 * Navigates to HomeActivity after a short delay (simulating splash behavior).
 */
public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Navigate after 2s splash delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent intent = new Intent(WelcomeActivity.this,
                        Class.forName("com.main.ui.activity.HomeActivity"));
                    startActivity(intent);
                    finish();
                } catch (ClassNotFoundException e) {
                    try {
                        Intent intent = new Intent(WelcomeActivity.this,
                            Class.forName("com.interactive.brasiliptv.ui.activity.GuidePageActivity"));
                        startActivity(intent);
                        finish();
                    } catch (ClassNotFoundException e2) {
                        // stay on splash
                    }
                }
            }
        }, 2000);
    }
}
