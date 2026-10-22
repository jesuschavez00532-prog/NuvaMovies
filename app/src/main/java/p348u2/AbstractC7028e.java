package p348u2;

import android.util.Log;

/* renamed from: u2.e */
/* loaded from: classes.dex */
public abstract class AbstractC7028e {

    /* renamed from: a */
    private static final StringBuilder f26399a = new StringBuilder();

    /* renamed from: a */
    public static void m27115a(String str) {
        StringBuilder sb2 = f26399a;
        if (sb2.length() > 0) {
            sb2.append("_");
        }
        sb2.append(str);
    }

    /* renamed from: b */
    public static String m27116b() {
        return f26399a.toString();
    }

    /* renamed from: c */
    public static void m27117c(String str) {
        Log.d("MarkCoreUtil", "tag=" + str);
    }

    /* renamed from: d */
    public static void m27118d(String str, long j10) {
        Log.d("MarkCoreUtil", "tag=" + str + " cost=" + j10);
    }

    /* renamed from: e */
    public static void m27119e(int i10, String str) {
        Log.d("MarkCoreUtil", "key=" + i10 + " info=" + str);
    }
}
