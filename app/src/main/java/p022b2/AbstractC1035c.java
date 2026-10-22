package p022b2;

import android.graphics.drawable.Drawable;
import p003a2.InterfaceC0008d;
import p109e2.AbstractC4122l;

/* renamed from: b2.c */
/* loaded from: classes.dex */
public abstract class AbstractC1035c implements InterfaceC1042j {

    /* renamed from: a */
    private final int f4272a;

    /* renamed from: b */
    private final int f4273b;

    /* renamed from: c */
    private InterfaceC0008d f4274c;

    public AbstractC1035c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p022b2.InterfaceC1042j
    public final InterfaceC0008d getRequest() {
        return this.f4274c;
    }

    @Override // p022b2.InterfaceC1042j
    public final void getSize(InterfaceC1041i interfaceC1041i) {
        interfaceC1041i.mo130e(this.f4272a, this.f4273b);
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onDestroy() {
    }

    @Override // p022b2.InterfaceC1042j
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // p022b2.InterfaceC1042j
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
    }

    @Override // p022b2.InterfaceC1042j
    public final void removeCallback(InterfaceC1041i interfaceC1041i) {
    }

    @Override // p022b2.InterfaceC1042j
    public final void setRequest(InterfaceC0008d interfaceC0008d) {
        this.f4274c = interfaceC0008d;
    }

    public AbstractC1035c(int i10, int i11) {
        if (AbstractC4122l.m17249v(i10, i11)) {
            this.f4272a = i10;
            this.f4273b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }
}
