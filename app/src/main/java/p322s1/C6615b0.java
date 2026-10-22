package p322s1;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import p109e2.AbstractC4111a;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;

/* renamed from: s1.b0 */
/* loaded from: classes.dex */
public final class C6615b0 implements InterfaceC4979j {

    /* renamed from: a */
    private final C6622f f25418a = new C6622f();

    @Override // p184j1.InterfaceC4979j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5335v mo20329a(InputStream inputStream, int i10, int i11, C4977h c4977h) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(AbstractC4111a.m17191b(inputStream));
        return this.f25418a.m25847c(createSource, i10, i11, c4977h);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(InputStream inputStream, C4977h c4977h) {
        return true;
    }
}
