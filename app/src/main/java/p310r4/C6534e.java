package p310r4;

import android.content.Context;

/* renamed from: r4.e */
/* loaded from: classes.dex */
public class C6534e {

    /* renamed from: b */
    private static C6534e f25143b = new C6534e();

    /* renamed from: a */
    private C6533d f25144a = null;

    /* renamed from: a */
    public static C6533d m25570a(Context context) {
        return f25143b.m25571b(context);
    }

    /* renamed from: b */
    public final synchronized C6533d m25571b(Context context) {
        if (this.f25144a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f25144a = new C6533d(context);
        }
        return this.f25144a;
    }
}
