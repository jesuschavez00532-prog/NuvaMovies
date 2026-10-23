package p322s1;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import p109e2.C4114d;
import p109e2.C4119i;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5569b;
import p230m1.InterfaceC5571d;
import p322s1.C6646u;

/* renamed from: s1.h0 */
/* loaded from: classes.dex */
public class C6627h0 implements InterfaceC4979j {

    /* renamed from: a */
    private final C6646u f25438a;

    /* renamed from: b */
    private final InterfaceC5569b f25439b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.h0$a */
    /* loaded from: classes.dex */
    public static class a implements C6646u.b {

        /* renamed from: a */
        private final C6621e0 f25440a;

        /* renamed from: b */
        private final C4114d f25441b;

        a(C6621e0 c6621e0, C4114d c4114d) {
            this.f25440a = c6621e0;
            this.f25441b = c4114d;
        }

        @Override // p322s1.C6646u.b
        /* renamed from: a */
        public void mo25856a(InterfaceC5571d interfaceC5571d, Bitmap bitmap) {
            IOException m17203a = this.f25441b.m17203a();
            if (m17203a != null) {
                if (bitmap != null) {
                    interfaceC5571d.mo22617c(bitmap);
                    throw m17203a;
                }
                throw m17203a;
            }
        }

        @Override // p322s1.C6646u.b
        /* renamed from: b */
        public void mo25857b() {
            this.f25440a.m25845b();
        }
    }

    public C6627h0(C6646u c6646u, InterfaceC5569b interfaceC5569b) {
        this.f25438a = c6646u;
        this.f25439b = interfaceC5569b;
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5335v mo20329a(InputStream inputStream, int i10, int i11, C4977h c4977h) {
        C6621e0 c6621e0;
        boolean z10 = false;
        if (inputStream instanceof C6621e0) {
            c6621e0 = (C6621e0) inputStream;
            z10 = false;
        } else {
            c6621e0 = new C6621e0(inputStream, this.f25439b);
            z10 = true;
        }
        C4114d m17202b = C4114d.m17202b(c6621e0);
        try {
            return this.f25438a.m25954e(new C4119i(m17202b), i10, i11, c4977h, new a(c6621e0, m17202b));
        } finally {
            m17202b.m17204c();
            if (z10) {
                c6621e0.m25846c();
            }
        }
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(InputStream inputStream, C4977h c4977h) {
        return this.f25438a.m25957p(inputStream);
    }
}
