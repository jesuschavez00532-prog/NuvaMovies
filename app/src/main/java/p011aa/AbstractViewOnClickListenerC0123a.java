package p011aa;

import android.view.View;

/* renamed from: aa.a */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC0123a implements View.OnClickListener {

    /* renamed from: a */
    private long f373a;

    /* renamed from: b */
    private final boolean m490b() {
        boolean z10 = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f373a;
        if (1 <= j10 && j10 < m491a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        this.f373a = currentTimeMillis;
        return false;
    }

    /* renamed from: a */
    public long m491a() {
        return 1000L;
    }

    /* renamed from: c */
    public abstract void mo492c(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m490b()) {
            return;
        }
        mo492c(view);
    }
}
