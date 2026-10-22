package p022b2;

import p109e2.AbstractC4122l;

/* renamed from: b2.h */
/* loaded from: classes.dex */
public abstract class AbstractC1040h extends AbstractC1033a {
    private final int height;
    private final int width;

    public AbstractC1040h() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p022b2.InterfaceC1042j
    public final void getSize(InterfaceC1041i interfaceC1041i) {
        if (AbstractC4122l.m17249v(this.width, this.height)) {
            interfaceC1041i.mo130e(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    @Override // p022b2.InterfaceC1042j
    public void removeCallback(InterfaceC1041i interfaceC1041i) {
    }

    public AbstractC1040h(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
