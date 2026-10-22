package p281p4;

import android.content.Context;
import android.util.Log;
import p219l4.AbstractC5391n;

/* renamed from: p4.f */
/* loaded from: classes.dex */
public abstract class AbstractC6202f {

    /* renamed from: a */
    private static final String[] f24369a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m24753a(Context context, Throwable th) {
        try {
            AbstractC5391n.m21783i(context);
            AbstractC5391n.m21783i(th);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
