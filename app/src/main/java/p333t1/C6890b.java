package p333t1;

import p109e2.AbstractC4121k;
import p216l1.InterfaceC5335v;

/* renamed from: t1.b */
/* loaded from: classes.dex */
public class C6890b implements InterfaceC5335v {

    /* renamed from: a */
    private final byte[] f26200a;

    public C6890b(byte[] bArr) {
        this.f26200a = (byte[]) AbstractC4121k.m17226d(bArr);
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f26200a;
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: b */
    public void mo21576b() {
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: c */
    public Class mo21577c() {
        return byte[].class;
    }

    @Override // p216l1.InterfaceC5335v
    public int getSize() {
        return this.f26200a.length;
    }
}
