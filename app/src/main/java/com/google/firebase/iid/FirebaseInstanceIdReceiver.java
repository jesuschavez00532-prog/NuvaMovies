package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.AbstractC2676e0;
import com.google.firebase.messaging.C2698n;
import java.util.concurrent.ExecutionException;
import p127f5.AbstractC4250l;
import p155h4.AbstractC4518b;
import p155h4.C4516a;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC4518b {
    /* renamed from: g */
    private static Intent m10941g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // p155h4.AbstractC4518b
    /* renamed from: b */
    protected int mo10942b(Context context, C4516a c4516a) {
        try {
            return ((Integer) AbstractC4250l.m17729a(new C2698n(context).m11285i(c4516a.m18905g()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // p155h4.AbstractC4518b
    /* renamed from: c */
    protected void mo10943c(Context context, Bundle bundle) {
        Intent m10941g = m10941g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (AbstractC2676e0.m11174A(m10941g)) {
            AbstractC2676e0.m11194s(m10941g);
        }
    }
}
