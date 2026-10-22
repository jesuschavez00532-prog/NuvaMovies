package p391x1;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p184j1.C4977h;
import p216l1.InterfaceC5335v;
import p333t1.C6890b;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public class C7484a implements InterfaceC7488e {

    /* renamed from: a */
    private final Bitmap.CompressFormat f27553a;

    /* renamed from: b */
    private final int f27554b;

    public C7484a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p391x1.InterfaceC7488e
    /* renamed from: a */
    public InterfaceC5335v mo28680a(InterfaceC5335v interfaceC5335v, C4977h c4977h) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC5335v.get()).compress(this.f27553a, this.f27554b, byteArrayOutputStream);
        interfaceC5335v.mo21576b();
        return new C6890b(byteArrayOutputStream.toByteArray());
    }

    public C7484a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f27553a = compressFormat;
        this.f27554b = i10;
    }
}
