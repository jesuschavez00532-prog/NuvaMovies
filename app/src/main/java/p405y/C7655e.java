package p405y;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: y.e */
/* loaded from: classes.dex */
public final class C7655e {

    /* renamed from: a */
    private final c f28090a;

    /* renamed from: y.e$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final Uri f28092a;

        /* renamed from: b */
        private final ClipDescription f28093b;

        /* renamed from: c */
        private final Uri f28094c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f28092a = uri;
            this.f28093b = clipDescription;
            this.f28094c = uri2;
        }

        @Override // p405y.C7655e.c
        /* renamed from: a */
        public ClipDescription mo29456a() {
            return this.f28093b;
        }

        @Override // p405y.C7655e.c
        /* renamed from: b */
        public Uri mo29457b() {
            return this.f28092a;
        }

        @Override // p405y.C7655e.c
        /* renamed from: c */
        public void mo29458c() {
        }

        @Override // p405y.C7655e.c
        /* renamed from: d */
        public Uri mo29459d() {
            return this.f28094c;
        }

        @Override // p405y.C7655e.c
        /* renamed from: e */
        public Object mo29460e() {
            return null;
        }
    }

    /* renamed from: y.e$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        ClipDescription mo29456a();

        /* renamed from: b */
        Uri mo29457b();

        /* renamed from: c */
        void mo29458c();

        /* renamed from: d */
        Uri mo29459d();

        /* renamed from: e */
        Object mo29460e();
    }

    public C7655e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f28090a = new a(uri, clipDescription, uri2);
        } else {
            this.f28090a = new b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C7655e m29450f(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new C7655e(new a(obj));
    }

    /* renamed from: a */
    public Uri m29451a() {
        return this.f28090a.mo29457b();
    }

    /* renamed from: b */
    public ClipDescription m29452b() {
        return this.f28090a.mo29456a();
    }

    /* renamed from: c */
    public Uri m29453c() {
        return this.f28090a.mo29459d();
    }

    /* renamed from: d */
    public void m29454d() {
        this.f28090a.mo29458c();
    }

    /* renamed from: e */
    public Object m29455e() {
        return this.f28090a.mo29460e();
    }

    /* renamed from: y.e$a */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a */
        final InputContentInfo f28091a;

        a(Object obj) {
            this.f28091a = (InputContentInfo) obj;
        }

        @Override // p405y.C7655e.c
        /* renamed from: a */
        public ClipDescription mo29456a() {
            return this.f28091a.getDescription();
        }

        @Override // p405y.C7655e.c
        /* renamed from: b */
        public Uri mo29457b() {
            return this.f28091a.getContentUri();
        }

        @Override // p405y.C7655e.c
        /* renamed from: c */
        public void mo29458c() {
            this.f28091a.requestPermission();
        }

        @Override // p405y.C7655e.c
        /* renamed from: d */
        public Uri mo29459d() {
            return this.f28091a.getLinkUri();
        }

        @Override // p405y.C7655e.c
        /* renamed from: e */
        public Object mo29460e() {
            return this.f28091a;
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f28091a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C7655e(c cVar) {
        this.f28090a = cVar;
    }
}
