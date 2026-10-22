package com.umeng.message.notify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.umeng.message.proguard.C3577aw;

/* loaded from: classes3.dex */
public final class UPushMessageNotifyActivity extends Activity {
    /* renamed from: a */
    private void m15270a(Intent intent) {
        try {
            C3577aw m15353a = C3577aw.m15353a();
            m15353a.m15356b();
            m15353a.m15354a(this, intent);
        } catch (Throwable unused) {
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m15270a(getIntent());
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m15270a(intent);
    }
}
