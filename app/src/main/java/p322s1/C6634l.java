package p322s1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p184j1.InterfaceC4975f;
import p230m1.InterfaceC5571d;

/* renamed from: s1.l */
/* loaded from: classes.dex */
public class C6634l extends AbstractC6626h {

    /* renamed from: b */
    private static final byte[] f25451b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC4975f.f20711a);

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        messageDigest.update(f25451b);
    }

    @Override // p322s1.AbstractC6626h
    /* renamed from: c */
    protected Bitmap mo25853c(InterfaceC5571d interfaceC5571d, Bitmap bitmap, int i10, int i11) {
        return AbstractC6629i0.m25861b(interfaceC5571d, bitmap, i10, i11);
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        return obj instanceof C6634l;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        return -599754482;
    }
}
