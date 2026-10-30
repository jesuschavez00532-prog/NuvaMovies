package com.main.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Stub HomeActivity - original class is in decompiled package p067ui.
 * Original: com.main.p067ui.activity.HomeActivity (renamed by jadx).
 * The real class has too many obfuscated dependencies to compile directly.
 */
public class HomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Nuva Movies - Home");
        setContentView(tv);
    }
}
