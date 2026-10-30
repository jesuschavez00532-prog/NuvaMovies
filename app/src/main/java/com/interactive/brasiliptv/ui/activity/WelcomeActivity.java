package com.interactive.brasiliptv.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Stub WelcomeActivity - original class is in decompiled package p061ui.
 * Original: com.interactive.brasiliptv.p061ui.activity.WelcomeActivity
 * Renamed by jadx from com.interactive.brasiliptv.ui.activity.WelcomeActivity
 * This stub displays a placeholder screen until the app is fully rebuilt.
 */
public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Nuva Movies - Loading...");
        setContentView(tv);
    }
}
