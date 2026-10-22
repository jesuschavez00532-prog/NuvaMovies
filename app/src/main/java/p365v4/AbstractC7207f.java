package p365v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.AbstractC0547a;

/* renamed from: v4.f */
/* loaded from: classes.dex */
public abstract class AbstractC7207f extends AbstractC0547a {
    /* renamed from: l */
    public static Intent m27904l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10;
        Intent registerReceiver;
        if (AbstractC7206e.m27903a()) {
            if (true != AbstractC7206e.m27903a()) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i10);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
