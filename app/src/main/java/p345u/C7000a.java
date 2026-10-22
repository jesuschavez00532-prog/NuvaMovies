package p345u;

import android.graphics.Typeface;
import android.os.Handler;
import p345u.AbstractC7004e;
import p345u.AbstractC7005f;

/* renamed from: u.a */
/* loaded from: classes.dex */
class C7000a {

    /* renamed from: a */
    private final AbstractC7005f.c f26323a;

    /* renamed from: b */
    private final Handler f26324b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC7005f.c f26325a;

        /* renamed from: b */
        final /* synthetic */ Typeface f26326b;

        a(AbstractC7005f.c cVar, Typeface typeface) {
            this.f26325a = cVar;
            this.f26326b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26325a.mo24462b(this.f26326b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC7005f.c f26328a;

        /* renamed from: b */
        final /* synthetic */ int f26329b;

        b(AbstractC7005f.c cVar, int i10) {
            this.f26328a = cVar;
            this.f26329b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26328a.mo24461a(this.f26329b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7000a(AbstractC7005f.c cVar, Handler handler) {
        this.f26323a = cVar;
        this.f26324b = handler;
    }

    /* renamed from: a */
    private void m27009a(int i10) {
        this.f26324b.post(new b(this.f26323a, i10));
    }

    /* renamed from: c */
    private void m27010c(Typeface typeface) {
        this.f26324b.post(new a(this.f26323a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m27011b(AbstractC7004e.e eVar) {
        if (eVar.m27036a()) {
            m27010c(eVar.f26352a);
        } else {
            m27009a(eVar.f26353b);
        }
    }
}
