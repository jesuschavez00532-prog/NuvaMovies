package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s7 */
/* loaded from: classes.dex */
public final class RunnableC2440s7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f9059a;

    /* renamed from: b */
    final /* synthetic */ String f9060b;

    /* renamed from: c */
    final /* synthetic */ String f9061c;

    /* renamed from: d */
    final /* synthetic */ C2453t9 f9062d;

    /* renamed from: e */
    final /* synthetic */ C2254b8 f9063e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2440s7(C2254b8 c2254b8, AtomicReference atomicReference, String str, String str2, String str3, C2453t9 c2453t9) {
        this.f9063e = c2254b8;
        this.f9059a = atomicReference;
        this.f9060b = str2;
        this.f9061c = str3;
        this.f9062d = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C2254b8 c2254b8;
        InterfaceC1106f interfaceC1106f;
        synchronized (this.f9059a) {
            try {
                try {
                    c2254b8 = this.f9063e;
                    interfaceC1106f = c2254b8.f8405d;
                } catch (RemoteException e10) {
                    this.f9063e.f8714a.mo9577b().m9800r().m9702d("(legacy) Failed to get conditional properties; remote exception", null, this.f9060b, e10);
                    this.f9059a.set(Collections.emptyList());
                    atomicReference = this.f9059a;
                }
                if (interfaceC1106f == null) {
                    c2254b8.f8714a.mo9577b().m9800r().m9702d("(legacy) Failed to get conditional properties; not connected to service", null, this.f9060b, this.f9061c);
                    this.f9059a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    AbstractC5391n.m21783i(this.f9062d);
                    this.f9059a.set(interfaceC1106f.mo5078y(this.f9060b, this.f9061c, this.f9062d));
                } else {
                    this.f9059a.set(interfaceC1106f.mo5075s(null, this.f9060b, this.f9061c));
                }
                this.f9063e.m9480E();
                atomicReference = this.f9059a;
                atomicReference.notify();
            } finally {
                this.f9059a.notify();
            }
        }
    }
}
