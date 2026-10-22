package androidx.loader.app;

import android.support.v4.media.session.AbstractC0272b;
import androidx.lifecycle.AbstractC0761o;
import androidx.lifecycle.C0762p;
import androidx.lifecycle.C0763q;
import androidx.lifecycle.InterfaceC0752f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p214l.C5312j;
import p373w.AbstractC7337b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.loader.app.b */
/* loaded from: classes.dex */
public class C0768b extends AbstractC0767a {

    /* renamed from: a */
    private final InterfaceC0752f f3156a;

    /* renamed from: b */
    private final a f3157b;

    /* renamed from: androidx.loader.app.b$a */
    /* loaded from: classes.dex */
    static class a extends AbstractC0761o {

        /* renamed from: e */
        private static final C0762p.a f3158e = new C7798a();

        /* renamed from: c */
        private C5312j f3159c = new C5312j();

        /* renamed from: d */
        private boolean f3160d = false;

        /* renamed from: androidx.loader.app.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C7798a implements C0762p.a {
            C7798a() {
            }

            @Override // androidx.lifecycle.C0762p.a
            /* renamed from: a */
            public AbstractC0761o mo3585a(Class cls) {
                return new a();
            }
        }

        a() {
        }

        /* renamed from: f */
        static a m3753f(C0763q c0763q) {
            return (a) new C0762p(c0763q, f3158e).m3742a(a.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC0761o
        /* renamed from: d */
        public void mo3574d() {
            super.mo3574d();
            if (this.f3159c.m21445k() <= 0) {
                this.f3159c.m21438b();
            } else {
                AbstractC0272b.m941a(this.f3159c.m21446l(0));
                throw null;
            }
        }

        /* renamed from: e */
        public void m3754e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3159c.m21445k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("    ");
                if (this.f3159c.m21445k() > 0) {
                    AbstractC0272b.m941a(this.f3159c.m21446l(0));
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3159c.m21443i(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }

        /* renamed from: g */
        void m3755g() {
            if (this.f3159c.m21445k() <= 0) {
                return;
            }
            AbstractC0272b.m941a(this.f3159c.m21446l(0));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0768b(InterfaceC0752f interfaceC0752f, C0763q c0763q) {
        this.f3156a = interfaceC0752f;
        this.f3157b = a.m3753f(c0763q);
    }

    @Override // androidx.loader.app.AbstractC0767a
    /* renamed from: a */
    public void mo3751a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3157b.m3754e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC0767a
    /* renamed from: c */
    public void mo3752c() {
        this.f3157b.m3755g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        AbstractC7337b.m28316a(this.f3156a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
