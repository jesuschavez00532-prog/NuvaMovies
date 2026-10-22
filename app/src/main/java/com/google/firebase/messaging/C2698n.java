package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.InterfaceC4229a;
import p281p4.AbstractC6207k;

/* renamed from: com.google.firebase.messaging.n */
/* loaded from: classes.dex */
public class C2698n {

    /* renamed from: c */
    private static final Object f10327c = new Object();

    /* renamed from: d */
    private static ServiceConnectionC2689i1 f10328d;

    /* renamed from: a */
    private final Context f10329a;

    /* renamed from: b */
    private final Executor f10330b = new ExecutorC2681g();

    public C2698n(Context context) {
        this.f10329a = context;
    }

    /* renamed from: d */
    private static AbstractC4245i m11280d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (C2709s0.m11311b().m11315e(context)) {
            AbstractC2674d1.m11170f(context, m11281e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m11281e(context, "com.google.firebase.MESSAGING_EVENT").m11250c(intent);
        }
        return AbstractC4250l.m17733e(-1);
    }

    /* renamed from: e */
    private static ServiceConnectionC2689i1 m11281e(Context context, String str) {
        ServiceConnectionC2689i1 serviceConnectionC2689i1;
        synchronized (f10327c) {
            if (f10328d == null) {
                f10328d = new ServiceConnectionC2689i1(context, str);
            }
            serviceConnectionC2689i1 = f10328d;
        }
        return serviceConnectionC2689i1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ Integer m11282f(Context context, Intent intent) {
        return Integer.valueOf(C2709s0.m11311b().m11316g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Integer m11283g(AbstractC4245i abstractC4245i) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ AbstractC4245i m11284h(Context context, Intent intent, AbstractC4245i abstractC4245i) {
        if (AbstractC6207k.m24771h() && ((Integer) abstractC4245i.mo17708j()).intValue() == 402) {
            return m11280d(context, intent).mo17705g(new ExecutorC2681g(), new InterfaceC4229a() { // from class: com.google.firebase.messaging.m
                @Override // p127f5.InterfaceC4229a
                /* renamed from: a */
                public final Object mo289a(AbstractC4245i abstractC4245i2) {
                    Integer m11283g;
                    m11283g = C2698n.m11283g(abstractC4245i2);
                    return m11283g;
                }
            });
        }
        return abstractC4245i;
    }

    /* renamed from: i */
    public AbstractC4245i m11285i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m11286j(this.f10329a, intent);
    }

    /* renamed from: j */
    public AbstractC4245i m11286j(final Context context, final Intent intent) {
        boolean z10;
        boolean z11 = true;
        if (AbstractC6207k.m24771h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z11 = false;
        }
        if (z10 && !z11) {
            return m11280d(context, intent);
        }
        return AbstractC4250l.m17731c(this.f10330b, new Callable() { // from class: com.google.firebase.messaging.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m11282f;
                m11282f = C2698n.m11282f(context, intent);
                return m11282f;
            }
        }).mo17706h(this.f10330b, new InterfaceC4229a() { // from class: com.google.firebase.messaging.l
            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public final Object mo289a(AbstractC4245i abstractC4245i) {
                AbstractC4245i m11284h;
                m11284h = C2698n.m11284h(context, intent, abstractC4245i);
                return m11284h;
            }
        });
    }
}
