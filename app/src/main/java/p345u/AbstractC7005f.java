package p345u;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import p373w.AbstractC7342g;

/* renamed from: u.f */
/* loaded from: classes.dex */
public abstract class AbstractC7005f {

    /* renamed from: u.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final int f26354a;

        /* renamed from: b */
        private final b[] f26355b;

        public a(int i10, b[] bVarArr) {
            this.f26354a = i10;
            this.f26355b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static a m27038a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        /* renamed from: b */
        public b[] m27039b() {
            return this.f26355b;
        }

        /* renamed from: c */
        public int m27040c() {
            return this.f26354a;
        }
    }

    /* renamed from: u.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Uri f26356a;

        /* renamed from: b */
        private final int f26357b;

        /* renamed from: c */
        private final int f26358c;

        /* renamed from: d */
        private final boolean f26359d;

        /* renamed from: e */
        private final int f26360e;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f26356a = (Uri) AbstractC7342g.m28327g(uri);
            this.f26357b = i10;
            this.f26358c = i11;
            this.f26359d = z10;
            this.f26360e = i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static b m27041a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        /* renamed from: b */
        public int m27042b() {
            return this.f26360e;
        }

        /* renamed from: c */
        public int m27043c() {
            return this.f26357b;
        }

        /* renamed from: d */
        public Uri m27044d() {
            return this.f26356a;
        }

        /* renamed from: e */
        public int m27045e() {
            return this.f26358c;
        }

        /* renamed from: f */
        public boolean m27046f() {
            return this.f26359d;
        }
    }

    /* renamed from: u.f$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public abstract void mo24461a(int i10);

        /* renamed from: b */
        public abstract void mo24462b(Typeface typeface);
    }

    /* renamed from: a */
    public static Typeface m27037a(Context context, C7003d c7003d, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C7000a c7000a = new C7000a(cVar, handler);
        if (z10) {
            return AbstractC7004e.m27031e(context, c7003d, c7000a, i10, i11);
        }
        return AbstractC7004e.m27030d(context, c7003d, i10, null, c7000a);
    }
}
