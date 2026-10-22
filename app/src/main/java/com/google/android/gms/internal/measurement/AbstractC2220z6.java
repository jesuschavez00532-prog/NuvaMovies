package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
/* loaded from: classes.dex */
public abstract class AbstractC2220z6 {

    /* renamed from: h */
    private static volatile AbstractC2175w6 f8296h;

    /* renamed from: l */
    public static final /* synthetic */ int f8300l = 0;

    /* renamed from: a */
    final C2160v6 f8301a;

    /* renamed from: b */
    final String f8302b;

    /* renamed from: c */
    private final Object f8303c;

    /* renamed from: d */
    private volatile int f8304d = -1;

    /* renamed from: e */
    private volatile Object f8305e;

    /* renamed from: f */
    private final boolean f8306f;

    /* renamed from: g */
    private static final Object f8295g = new Object();

    /* renamed from: i */
    private static final AtomicReference f8297i = new AtomicReference();

    /* renamed from: j */
    private static final C1856b7 f8298j = new C1856b7(new Object() { // from class: com.google.android.gms.internal.measurement.q6
    }, null);

    /* renamed from: k */
    private static final AtomicInteger f8299k = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC2220z6(C2160v6 c2160v6, String str, Object obj, boolean z10, AbstractC2190x6 abstractC2190x6) {
        if (c2160v6.f8211b != null) {
            this.f8301a = c2160v6;
            this.f8302b = str;
            this.f8303c = obj;
            this.f8306f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    public static void m9394d() {
        f8299k.incrementAndGet();
    }

    /* renamed from: e */
    public static void m9395e(final Context context) {
        if (f8296h == null) {
            Object obj = f8295g;
            synchronized (obj) {
                if (f8296h == null) {
                    synchronized (obj) {
                        AbstractC2175w6 abstractC2175w6 = f8296h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (abstractC2175w6 == null || abstractC2175w6.mo9083a() != context) {
                            C1855b6.m8135e();
                            AbstractC1840a7.m8089c();
                            C1965i6.m8523e();
                            f8296h = new C2204y5(context, AbstractC1996k7.m8583a(new InterfaceC1936g7() { // from class: com.google.android.gms.internal.measurement.p6
                                @Override // com.google.android.gms.internal.measurement.InterfaceC1936g7
                                /* renamed from: a */
                                public final Object mo8105a() {
                                    Context context2 = context;
                                    int i10 = AbstractC2220z6.f8300l;
                                    return AbstractC2010l6.m8622a(context2);
                                }
                            }));
                            f8299k.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    abstract Object mo8902a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[Catch: all -> 0x00cf, TryCatch #0 {all -> 0x00cf, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0064, B:24:0x006e, B:27:0x009f, B:29:0x00af, B:31:0x00c3, B:32:0x00c6, B:33:0x00ca, B:34:0x0077, B:36:0x007d, B:39:0x008f, B:41:0x0095, B:43:0x009d, B:44:0x008d, B:48:0x0054, B:49:0x00d1, B:50:0x00d6, B:51:0x00d7), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[Catch: all -> 0x00cf, TryCatch #0 {all -> 0x00cf, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0064, B:24:0x006e, B:27:0x009f, B:29:0x00af, B:31:0x00c3, B:32:0x00c6, B:33:0x00ca, B:34:0x0077, B:36:0x007d, B:39:0x008f, B:41:0x0095, B:43:0x009d, B:44:0x008d, B:48:0x0054, B:49:0x00d1, B:50:0x00d6, B:51:0x00d7), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: all -> 0x00cf, TryCatch #0 {all -> 0x00cf, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0064, B:24:0x006e, B:27:0x009f, B:29:0x00af, B:31:0x00c3, B:32:0x00c6, B:33:0x00ca, B:34:0x0077, B:36:0x007d, B:39:0x008f, B:41:0x0095, B:43:0x009d, B:44:0x008d, B:48:0x0054, B:49:0x00d1, B:50:0x00d6, B:51:0x00d7), top: B:11:0x001c }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9396b() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2220z6.m9396b():java.lang.Object");
    }

    /* renamed from: c */
    public final String m9397c() {
        String str = this.f8301a.f8213d;
        return this.f8302b;
    }
}
