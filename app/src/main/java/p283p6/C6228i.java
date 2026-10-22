package p283p6;

import p235m6.C5598b;
import p235m6.C5599c;
import p235m6.InterfaceC5603g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p6.i */
/* loaded from: classes.dex */
public class C6228i implements InterfaceC5603g {

    /* renamed from: a */
    private boolean f24439a = false;

    /* renamed from: b */
    private boolean f24440b = false;

    /* renamed from: c */
    private C5599c f24441c;

    /* renamed from: d */
    private final C6225f f24442d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6228i(C6225f c6225f) {
        this.f24442d = c6225f;
    }

    /* renamed from: a */
    private void m24842a() {
        if (!this.f24439a) {
            this.f24439a = true;
            return;
        }
        throw new C5598b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m24843b(C5599c c5599c, boolean z10) {
        this.f24439a = false;
        this.f24441c = c5599c;
        this.f24440b = z10;
    }

    @Override // p235m6.InterfaceC5603g
    /* renamed from: d */
    public InterfaceC5603g mo22772d(String str) {
        m24842a();
        this.f24442d.m24826h(this.f24441c, str, this.f24440b);
        return this;
    }

    @Override // p235m6.InterfaceC5603g
    /* renamed from: e */
    public InterfaceC5603g mo22773e(boolean z10) {
        m24842a();
        this.f24442d.m24832n(this.f24441c, z10, this.f24440b);
        return this;
    }
}
