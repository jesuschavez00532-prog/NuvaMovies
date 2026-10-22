package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p203k4.C5105b0;
import p203k4.C5107d;
import p203k4.FragmentC5129z;
import p203k4.InterfaceC5108e;
import p219l4.AbstractC5391n;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: a */
    protected final InterfaceC5108e f7532a;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(InterfaceC5108e interfaceC5108e) {
        this.f7532a = interfaceC5108e;
    }

    /* renamed from: c */
    public static InterfaceC5108e m7917c(Activity activity) {
        return m7918d(new C5107d(activity));
    }

    /* renamed from: d */
    protected static InterfaceC5108e m7918d(C5107d c5107d) {
        if (c5107d.m20753d()) {
            return C5105b0.m20746n9(c5107d.m20751b());
        }
        if (c5107d.m20752c()) {
            return FragmentC5129z.m20763c(c5107d.m20750a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC5108e getChimeraLifecycleFragmentImpl(C5107d c5107d) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void m7919a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity m7920b() {
        Activity mo20749j3 = this.f7532a.mo20749j3();
        AbstractC5391n.m21783i(mo20749j3);
        return mo20749j3;
    }

    /* renamed from: e */
    public void mo7921e(int i10, int i11, Intent intent) {
    }

    /* renamed from: f */
    public void mo7922f(Bundle bundle) {
    }

    /* renamed from: g */
    public void m7923g() {
    }

    /* renamed from: h */
    public void mo7924h() {
    }

    /* renamed from: i */
    public void mo7925i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo7926j() {
    }

    /* renamed from: k */
    public void mo7927k() {
    }
}
