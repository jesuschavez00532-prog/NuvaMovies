package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import p127f5.AbstractC4245i;
import p127f5.InterfaceC4229a;
import p214l.C5303a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.q0 */
/* loaded from: classes.dex */
public class C2705q0 {

    /* renamed from: a */
    private final Executor f10365a;

    /* renamed from: b */
    private final Map f10366b = new C5303a();

    /* renamed from: com.google.firebase.messaging.q0$a */
    /* loaded from: classes.dex */
    interface a {
        AbstractC4245i start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2705q0(Executor executor) {
        this.f10365a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC4245i m11306c(String str, AbstractC4245i abstractC4245i) {
        synchronized (this) {
            this.f10366b.remove(str);
        }
        return abstractC4245i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized AbstractC4245i m11307b(final String str, a aVar) {
        AbstractC4245i abstractC4245i = (AbstractC4245i) this.f10366b.get(str);
        if (abstractC4245i != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return abstractC4245i;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        AbstractC4245i mo17706h = aVar.start().mo17706h(this.f10365a, new InterfaceC4229a() { // from class: com.google.firebase.messaging.p0
            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public final Object mo289a(AbstractC4245i abstractC4245i2) {
                AbstractC4245i m11306c;
                m11306c = C2705q0.this.m11306c(str, abstractC4245i2);
                return m11306c;
            }
        });
        this.f10366b.put(str, mo17706h);
        return mo17706h;
    }
}
