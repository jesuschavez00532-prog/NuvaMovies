package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes.dex */
public final class RunnableC2462u7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f9128a;

    /* renamed from: b */
    final /* synthetic */ String f9129b;

    /* renamed from: c */
    final /* synthetic */ String f9130c;

    /* renamed from: d */
    final /* synthetic */ C2453t9 f9131d;

    /* renamed from: e */
    final /* synthetic */ boolean f9132e;

    /* renamed from: f */
    final /* synthetic */ C2254b8 f9133f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2462u7(C2254b8 c2254b8, AtomicReference atomicReference, String str, String str2, String str3, C2453t9 c2453t9, boolean z10) {
        this.f9133f = c2254b8;
        this.f9128a = atomicReference;
        this.f9129b = str2;
        this.f9130c = str3;
        this.f9131d = c2453t9;
        this.f9132e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C2254b8 c2254b8;
        InterfaceC1106f interfaceC1106f;
        synchronized (this.f9128a) {
            try {
                try {
                    c2254b8 = this.f9133f;
                    interfaceC1106f = c2254b8.f8405d;
                } catch (RemoteException e10) {
                    this.f9133f.f8714a.mo9577b().m9800r().m9702d("(legacy) Failed to get user properties; remote exception", null, this.f9129b, e10);
                    this.f9128a.set(Collections.emptyList());
                    atomicReference = this.f9128a;
                }
                if (interfaceC1106f == null) {
                    c2254b8.f8714a.mo9577b().m9800r().m9702d("(legacy) Failed to get user properties; not connected to service", null, this.f9129b, this.f9130c);
                    this.f9128a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    AbstractC5391n.m21783i(this.f9131d);
                    this.f9128a.set(interfaceC1106f.mo5065F(this.f9129b, this.f9130c, this.f9132e, this.f9131d));
                } else {
                    this.f9128a.set(interfaceC1106f.mo5070l(null, this.f9129b, this.f9130c, this.f9132e));
                }
                this.f9133f.m9480E();
                atomicReference = this.f9128a;
                atomicReference.notify();
            } finally {
                this.f9128a.notify();
            }
        }
    }
}
