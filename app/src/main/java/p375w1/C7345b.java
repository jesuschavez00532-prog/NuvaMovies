package p375w1;

import android.graphics.Bitmap;
import p152h1.InterfaceC4503a;
import p230m1.InterfaceC5569b;
import p230m1.InterfaceC5571d;

/* renamed from: w1.b */
/* loaded from: classes.dex */
public final class C7345b implements InterfaceC4503a.a {

    /* renamed from: a */
    private final InterfaceC5571d f27253a;

    /* renamed from: b */
    private final InterfaceC5569b f27254b;

    public C7345b(InterfaceC5571d interfaceC5571d, InterfaceC5569b interfaceC5569b) {
        this.f27253a = interfaceC5571d;
        this.f27254b = interfaceC5569b;
    }

    @Override // p152h1.InterfaceC4503a.a
    /* renamed from: a */
    public Bitmap mo18828a(int i10, int i11, Bitmap.Config config) {
        return this.f27253a.mo22619e(i10, i11, config);
    }

    @Override // p152h1.InterfaceC4503a.a
    /* renamed from: b */
    public int[] mo18829b(int i10) {
        InterfaceC5569b interfaceC5569b = this.f27254b;
        if (interfaceC5569b == null) {
            return new int[i10];
        }
        return (int[]) interfaceC5569b.mo22611d(i10, int[].class);
    }

    @Override // p152h1.InterfaceC4503a.a
    /* renamed from: c */
    public void mo18830c(Bitmap bitmap) {
        this.f27253a.mo22617c(bitmap);
    }

    @Override // p152h1.InterfaceC4503a.a
    /* renamed from: d */
    public void mo18831d(byte[] bArr) {
        InterfaceC5569b interfaceC5569b = this.f27254b;
        if (interfaceC5569b == null) {
            return;
        }
        interfaceC5569b.put(bArr);
    }

    @Override // p152h1.InterfaceC4503a.a
    /* renamed from: e */
    public byte[] mo18832e(int i10) {
        InterfaceC5569b interfaceC5569b = this.f27254b;
        if (interfaceC5569b == null) {
            return new byte[i10];
        }
        return (byte[]) interfaceC5569b.mo22611d(i10, byte[].class);
    }

    @Override // p152h1.InterfaceC4503a.a
    /* renamed from: f */
    public void mo18833f(int[] iArr) {
        InterfaceC5569b interfaceC5569b = this.f27254b;
        if (interfaceC5569b == null) {
            return;
        }
        interfaceC5569b.put(iArr);
    }
}
