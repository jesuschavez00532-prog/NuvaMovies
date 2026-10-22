package p216l1;

import java.io.File;
import p184j1.C4977h;
import p184j1.InterfaceC4973d;
import p243n1.InterfaceC5723a;

/* renamed from: l1.e */
/* loaded from: classes.dex */
class C5318e implements InterfaceC5723a.b {

    /* renamed from: a */
    private final InterfaceC4973d f21663a;

    /* renamed from: b */
    private final Object f21664b;

    /* renamed from: c */
    private final C4977h f21665c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5318e(InterfaceC4973d interfaceC4973d, Object obj, C4977h c4977h) {
        this.f21663a = interfaceC4973d;
        this.f21664b = obj;
        this.f21665c = c4977h;
    }

    @Override // p243n1.InterfaceC5723a.b
    /* renamed from: a */
    public boolean mo21457a(File file) {
        return this.f21663a.mo20315b(this.f21664b, file, this.f21665c);
    }
}
