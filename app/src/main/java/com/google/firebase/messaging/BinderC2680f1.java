package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.ServiceConnectionC2689i1;
import p127f5.AbstractC4245i;
import p127f5.InterfaceC4235d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.f1 */
/* loaded from: classes.dex */
public class BinderC2680f1 extends Binder {

    /* renamed from: a */
    private final a f10296a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.f1$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        AbstractC4245i mo11218a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2680f1(a aVar) {
        this.f10296a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m11217c(final ServiceConnectionC2689i1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f10296a.mo11218a(aVar.f10312a).mo17701c(new ExecutorC2681g(), new InterfaceC4235d() { // from class: com.google.firebase.messaging.e1
                @Override // p127f5.InterfaceC4235d
                /* renamed from: a */
                public final void mo488a(AbstractC4245i abstractC4245i) {
                    ServiceConnectionC2689i1.a.this.m11256d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
