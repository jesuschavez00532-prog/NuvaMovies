package p322s1;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;

/* renamed from: s1.k */
/* loaded from: classes.dex */
public final class C6632k implements InterfaceC4979j {

    /* renamed from: a */
    private final C6622f f25450a = new C6622f();

    @Override // p184j1.InterfaceC4979j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5335v mo20329a(ByteBuffer byteBuffer, int i10, int i11, C4977h c4977h) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f25450a.m25847c(createSource, i10, i11, c4977h);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(ByteBuffer byteBuffer, C4977h c4977h) {
        return true;
    }
}
