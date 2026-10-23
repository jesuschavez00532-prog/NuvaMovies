package p322s1;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p184j1.InterfaceC4975f;
import p230m1.InterfaceC5571d;

/* renamed from: s1.g0 */
/* loaded from: classes.dex */
public final class C6625g0 extends AbstractC6626h {

    /* renamed from: c */
    private static final byte[] f25436c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC4975f.f20711a);

    /* renamed from: b */
    private final int f25437b;

    public C6625g0(int i10) {
        boolean z10 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC4121k.m17223a(z10, "roundingRadius must be greater than 0.");
        this.f25437b = i10;
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        messageDigest.update(f25436c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f25437b).array());
    }

    @Override // p322s1.AbstractC6626h
    /* renamed from: c */
    protected Bitmap mo25853c(InterfaceC5571d interfaceC5571d, Bitmap bitmap, int i10, int i11) {
        return AbstractC6629i0.m25873n(interfaceC5571d, bitmap, this.f25437b);
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (!(obj instanceof C6625g0) || this.f25437b != ((C6625g0) obj).f25437b) {
            return false;
        }
        return true;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        return AbstractC4122l.m17243p(-569625254, AbstractC4122l.m17242o(this.f25437b));
    }
}
