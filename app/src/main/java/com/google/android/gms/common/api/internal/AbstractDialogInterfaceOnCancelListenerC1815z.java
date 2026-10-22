package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p172i4.C4854b;
import p172i4.C4868i;
import p203k4.AbstractC5127x;
import p203k4.InterfaceC5108e;
import p365v4.HandlerC7209h;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC1815z extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    protected volatile boolean f7622b;

    /* renamed from: c */
    protected final AtomicReference f7623c;

    /* renamed from: d */
    private final Handler f7624d;

    /* renamed from: e */
    protected final C4868i f7625e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractDialogInterfaceOnCancelListenerC1815z(InterfaceC5108e interfaceC5108e, C4868i c4868i) {
        super(interfaceC5108e);
        this.f7623c = new AtomicReference(null);
        this.f7624d = new HandlerC7209h(Looper.getMainLooper());
        this.f7625e = c4868i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m8050l(C4854b c4854b, int i10) {
        this.f7623c.set(null);
        mo7985m(c4854b, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m8051o() {
        this.f7623c.set(null);
        mo7986n();
    }

    /* renamed from: p */
    private static final int m8052p(C1812w c1812w) {
        if (c1812w == null) {
            return -1;
        }
        return c1812w.m8047a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo7921e(int i10, int i11, Intent intent) {
        C1812w c1812w = (C1812w) this.f7623c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int mo20045g = this.f7625e.mo20045g(m7920b());
                if (mo20045g == 0) {
                    m8051o();
                    return;
                } else {
                    if (c1812w == null) {
                        return;
                    }
                    if (c1812w.m8048b().m20017g() == 18 && mo20045g == 18) {
                        return;
                    }
                }
            }
        } else {
            if (i11 == -1) {
                m8051o();
                return;
            }
            if (i11 == 0) {
                if (c1812w == null) {
                    return;
                }
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m8050l(new C4854b(i12, null, c1812w.m8048b().toString()), m8052p(c1812w));
                return;
            }
        }
        if (c1812w != null) {
            m8050l(c1812w.m8048b(), c1812w.m8047a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo7922f(Bundle bundle) {
        C1812w c1812w;
        super.mo7922f(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f7623c;
            if (bundle.getBoolean("resolving_error", false)) {
                c1812w = new C1812w(new C4854b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c1812w = null;
            }
            atomicReference.set(c1812w);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo7925i(Bundle bundle) {
        super.mo7925i(bundle);
        C1812w c1812w = (C1812w) this.f7623c.get();
        if (c1812w == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c1812w.m8047a());
        bundle.putInt("failed_status", c1812w.m8048b().m20017g());
        bundle.putParcelable("failed_resolution", c1812w.m8048b().m20019j());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo7926j() {
        super.mo7926j();
        this.f7622b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public void mo7927k() {
        super.mo7927k();
        this.f7622b = false;
    }

    /* renamed from: m */
    protected abstract void mo7985m(C4854b c4854b, int i10);

    /* renamed from: n */
    protected abstract void mo7986n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m8050l(new C4854b(13, null), m8052p((C1812w) this.f7623c.get()));
    }

    /* renamed from: s */
    public final void m8055s(C4854b c4854b, int i10) {
        C1812w c1812w = new C1812w(c4854b, i10);
        AtomicReference atomicReference = this.f7623c;
        while (!AbstractC5127x.m20760a(atomicReference, null, c1812w)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f7624d.post(new RunnableC1814y(this, c1812w));
    }
}
