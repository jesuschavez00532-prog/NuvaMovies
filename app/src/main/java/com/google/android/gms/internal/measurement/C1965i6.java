package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.AbstractC0550d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i6 */
/* loaded from: classes.dex */
public final class C1965i6 implements InterfaceC1919f6 {

    /* renamed from: c */
    private static C1965i6 f7815c;

    /* renamed from: a */
    private final Context f7816a;

    /* renamed from: b */
    private final ContentObserver f7817b;

    private C1965i6() {
        this.f7816a = null;
        this.f7817b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1965i6 m8522b(Context context) {
        C1965i6 c1965i6;
        C1965i6 c1965i62;
        synchronized (C1965i6.class) {
            if (f7815c == null) {
                if (AbstractC0550d.m2356b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c1965i62 = new C1965i6(context);
                } else {
                    c1965i62 = new C1965i6();
                }
                f7815c = c1965i62;
            }
            c1965i6 = f7815c;
        }
        return c1965i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static synchronized void m8523e() {
        Context context;
        synchronized (C1965i6.class) {
            C1965i6 c1965i6 = f7815c;
            if (c1965i6 != null && (context = c1965i6.f7816a) != null && c1965i6.f7817b != null) {
                context.getContentResolver().unregisterContentObserver(f7815c.f7817b);
            }
            f7815c = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1919f6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String mo8136a(final String str) {
        Context context = this.f7816a;
        if (context != null && !AbstractC2189x5.m9170a(context)) {
            try {
                return (String) AbstractC1887d6.m8247a(new InterfaceC1903e6() { // from class: com.google.android.gms.internal.measurement.g6
                    @Override // com.google.android.gms.internal.measurement.InterfaceC1903e6
                    /* renamed from: a */
                    public final Object mo8287a() {
                        return C1965i6.this.m8525d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String m8525d(String str) {
        return AbstractC2159v5.m9034a(this.f7816a.getContentResolver(), str, null);
    }

    private C1965i6(Context context) {
        this.f7816a = context;
        C1950h6 c1950h6 = new C1950h6(this, null);
        this.f7817b = c1950h6;
        context.getContentResolver().registerContentObserver(AbstractC2159v5.f8197a, true, c1950h6);
    }
}
