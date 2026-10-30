package com.interactive.brasiliptv.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.main.ui.activity.HomeActivity;

/**
 * Stub WelcomeActivity - original class is in decompiled package p061ui.
 * Original: com.interactive.brasiliptv.p061ui.activity.WelcomeActivity (renamed by jadx)
 * Navigates to HomeActivity after 2s splash delay.
 */
public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WelcomeActivity.this, HomeActivity.class));
                finish();
            }
        }, 2000);
    }
}
