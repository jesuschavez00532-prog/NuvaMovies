package com.interactive.brasiliptv.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Stub GuidePageActivity - original class is in decompiled package p061ui.
 * Original: com.interactive.brasiliptv.p061ui.activity.GuidePageActivity (renamed by jadx)
 */
public class GuidePageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Nuva Movies - Guide (stub)");
        setContentView(tv);
    }
}
