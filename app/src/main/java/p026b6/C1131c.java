package p026b6;

import java.io.File;
import p128f6.C4270f;

/* renamed from: b6.c */
/* loaded from: classes.dex */
public class C1131c {

    /* renamed from: c */
    private static final b f4423c = new b();

    /* renamed from: a */
    private final C4270f f4424a;

    /* renamed from: b */
    private InterfaceC1129a f4425b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b6.c$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC1129a {
        private b() {
        }

        @Override // p026b6.InterfaceC1129a
        /* renamed from: a */
        public void mo5110a() {
        }

        @Override // p026b6.InterfaceC1129a
        /* renamed from: b */
        public String mo5111b() {
            return null;
        }

        @Override // p026b6.InterfaceC1129a
        /* renamed from: c */
        public byte[] mo5112c() {
            return null;
        }

        @Override // p026b6.InterfaceC1129a
        /* renamed from: d */
        public void mo5113d() {
        }

        @Override // p026b6.InterfaceC1129a
        /* renamed from: e */
        public void mo5114e(long j10, String str) {
        }
    }

    public C1131c(C4270f c4270f) {
        this.f4424a = c4270f;
        this.f4425b = f4423c;
    }

    /* renamed from: d */
    private File m5120d(String str) {
        return this.f4424a.m17804o(str, "userlog");
    }

    /* renamed from: a */
    public void m5121a() {
        this.f4425b.mo5113d();
    }

    /* renamed from: b */
    public byte[] m5122b() {
        return this.f4425b.mo5112c();
    }

    /* renamed from: c */
    public String m5123c() {
        return this.f4425b.mo5111b();
    }

    /* renamed from: e */
    public final void m5124e(String str) {
        this.f4425b.mo5110a();
        this.f4425b = f4423c;
        if (str == null) {
            return;
        }
        m5125f(m5120d(str), 65536);
    }

    /* renamed from: f */
    void m5125f(File file, int i10) {
        this.f4425b = new C1134f(file, i10);
    }

    /* renamed from: g */
    public void m5126g(long j10, String str) {
        this.f4425b.mo5114e(j10, str);
    }

    public C1131c(C4270f c4270f, String str) {
        this(c4270f);
        m5124e(str);
    }
}
