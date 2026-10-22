package p107e0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.lzy.okgo.OkGo;

/* renamed from: e0.a */
/* loaded from: classes.dex */
public abstract class AbstractC4106a extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray f18051a = new SparseArray();

    /* renamed from: b */
    private static int f18052b = 1;

    /* renamed from: b */
    public static boolean m17174b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray sparseArray = f18051a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m17175c(Context context, Intent intent) {
        SparseArray sparseArray = f18051a;
        synchronized (sparseArray) {
            int i10 = f18052b;
            int i11 = i10 + 1;
            f18052b = i11;
            if (i11 <= 0) {
                f18052b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i10);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(OkGo.DEFAULT_MILLISECONDS);
            sparseArray.put(i10, newWakeLock);
            return startService;
        }
    }
}
