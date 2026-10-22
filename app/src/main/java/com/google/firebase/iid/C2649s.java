package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import p127f5.AbstractC4245i;
import p127f5.InterfaceC4229a;
import p214l.C5303a;

/* renamed from: com.google.firebase.iid.s */
/* loaded from: classes.dex */
class C2649s {

    /* renamed from: a */
    private final Executor f10124a;

    /* renamed from: b */
    private final Map f10125b = new C5303a();

    /* renamed from: com.google.firebase.iid.s$a */
    /* loaded from: classes.dex */
    interface a {
        AbstractC4245i start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2649s(Executor executor) {
        this.f10124a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized AbstractC4245i m10969a(String str, String str2, a aVar) {
        final Pair pair = new Pair(str, str2);
        AbstractC4245i abstractC4245i = (AbstractC4245i) this.f10125b.get(pair);
        if (abstractC4245i != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 29);
                sb2.append("Joining ongoing request for: ");
                sb2.append(valueOf);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            return abstractC4245i;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
            sb3.append("Making new request for: ");
            sb3.append(valueOf2);
            Log.d("FirebaseInstanceId", sb3.toString());
        }
        AbstractC4245i mo17706h = aVar.start().mo17706h(this.f10124a, new InterfaceC4229a(this, pair) { // from class: com.google.firebase.iid.r

            /* renamed from: a */
            private final C2649s f10122a;

            /* renamed from: b */
            private final Pair f10123b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10122a = this;
                this.f10123b = pair;
            }

            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public Object mo289a(AbstractC4245i abstractC4245i2) {
                this.f10122a.m10970b(this.f10123b, abstractC4245i2);
                return abstractC4245i2;
            }
        });
        this.f10125b.put(pair, mo17706h);
        return mo17706h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ AbstractC4245i m10970b(Pair pair, AbstractC4245i abstractC4245i) {
        synchronized (this) {
            this.f10125b.remove(pair);
        }
        return abstractC4245i;
    }
}
