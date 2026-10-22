package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import p373w.AbstractC7342g;

/* renamed from: androidx.core.view.c */
/* loaded from: classes.dex */
public final class C0559c {

    /* renamed from: a */
    private final f f2326a;

    /* renamed from: androidx.core.view.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final c f2327a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2327a = new b(clipData, i10);
            } else {
                this.f2327a = new d(clipData, i10);
            }
        }

        /* renamed from: a */
        public C0559c m2419a() {
            return this.f2327a.mo2423a();
        }

        /* renamed from: b */
        public a m2420b(Bundle bundle) {
            this.f2327a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public a m2421c(int i10) {
            this.f2327a.mo2425c(i10);
            return this;
        }

        /* renamed from: d */
        public a m2422d(Uri uri) {
            this.f2327a.mo2424b(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.c$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final ContentInfo.Builder f2328a;

        b(ClipData clipData, int i10) {
            this.f2328a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // androidx.core.view.C0559c.c
        /* renamed from: a */
        public C0559c mo2423a() {
            ContentInfo build;
            build = this.f2328a.build();
            return new C0559c(new e(build));
        }

        @Override // androidx.core.view.C0559c.c
        /* renamed from: b */
        public void mo2424b(Uri uri) {
            this.f2328a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C0559c.c
        /* renamed from: c */
        public void mo2425c(int i10) {
            this.f2328a.setFlags(i10);
        }

        @Override // androidx.core.view.C0559c.c
        public void setExtras(Bundle bundle) {
            this.f2328a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.c$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        C0559c mo2423a();

        /* renamed from: b */
        void mo2424b(Uri uri);

        /* renamed from: c */
        void mo2425c(int i10);

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.c$d */
    /* loaded from: classes.dex */
    private static final class d implements c {

        /* renamed from: a */
        ClipData f2329a;

        /* renamed from: b */
        int f2330b;

        /* renamed from: c */
        int f2331c;

        /* renamed from: d */
        Uri f2332d;

        /* renamed from: e */
        Bundle f2333e;

        d(ClipData clipData, int i10) {
            this.f2329a = clipData;
            this.f2330b = i10;
        }

        @Override // androidx.core.view.C0559c.c
        /* renamed from: a */
        public C0559c mo2423a() {
            return new C0559c(new g(this));
        }

        @Override // androidx.core.view.C0559c.c
        /* renamed from: b */
        public void mo2424b(Uri uri) {
            this.f2332d = uri;
        }

        @Override // androidx.core.view.C0559c.c
        /* renamed from: c */
        public void mo2425c(int i10) {
            this.f2331c = i10;
        }

        @Override // androidx.core.view.C0559c.c
        public void setExtras(Bundle bundle) {
            this.f2333e = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.c$e */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a */
        private final ContentInfo f2334a;

        e(ContentInfo contentInfo) {
            this.f2334a = AbstractC0583i.m2467a(AbstractC7342g.m28327g(contentInfo));
        }

        @Override // androidx.core.view.C0559c.f
        /* renamed from: a */
        public ClipData mo2426a() {
            ClipData clip;
            clip = this.f2334a.getClip();
            return clip;
        }

        @Override // androidx.core.view.C0559c.f
        /* renamed from: b */
        public int mo2427b() {
            int flags;
            flags = this.f2334a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.C0559c.f
        /* renamed from: c */
        public ContentInfo mo2428c() {
            return this.f2334a;
        }

        @Override // androidx.core.view.C0559c.f
        /* renamed from: d */
        public int mo2429d() {
            int source;
            source = this.f2334a.getSource();
            return source;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2334a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.c$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        ClipData mo2426a();

        /* renamed from: b */
        int mo2427b();

        /* renamed from: c */
        ContentInfo mo2428c();

        /* renamed from: d */
        int mo2429d();
    }

    /* renamed from: androidx.core.view.c$g */
    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a */
        private final ClipData f2335a;

        /* renamed from: b */
        private final int f2336b;

        /* renamed from: c */
        private final int f2337c;

        /* renamed from: d */
        private final Uri f2338d;

        /* renamed from: e */
        private final Bundle f2339e;

        g(d dVar) {
            this.f2335a = (ClipData) AbstractC7342g.m28327g(dVar.f2329a);
            this.f2336b = AbstractC7342g.m28323c(dVar.f2330b, 0, 5, "source");
            this.f2337c = AbstractC7342g.m28326f(dVar.f2331c, 1);
            this.f2338d = dVar.f2332d;
            this.f2339e = dVar.f2333e;
        }

        @Override // androidx.core.view.C0559c.f
        /* renamed from: a */
        public ClipData mo2426a() {
            return this.f2335a;
        }

        @Override // androidx.core.view.C0559c.f
        /* renamed from: b */
        public int mo2427b() {
            return this.f2337c;
        }

        @Override // androidx.core.view.C0559c.f
        /* renamed from: c */
        public ContentInfo mo2428c() {
            return null;
        }

        @Override // androidx.core.view.C0559c.f
        /* renamed from: d */
        public int mo2429d() {
            return this.f2336b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f2335a.getDescription());
            sb2.append(", source=");
            sb2.append(C0559c.m2413e(this.f2336b));
            sb2.append(", flags=");
            sb2.append(C0559c.m2412a(this.f2337c));
            String str2 = "";
            if (this.f2338d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f2338d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f2339e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    C0559c(f fVar) {
        this.f2326a = fVar;
    }

    /* renamed from: a */
    static String m2412a(int i10) {
        if ((i10 & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i10);
    }

    /* renamed from: e */
    static String m2413e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return String.valueOf(i10);
                            }
                            return "SOURCE_PROCESS_TEXT";
                        }
                        return "SOURCE_AUTOFILL";
                    }
                    return "SOURCE_DRAG_AND_DROP";
                }
                return "SOURCE_INPUT_METHOD";
            }
            return "SOURCE_CLIPBOARD";
        }
        return "SOURCE_APP";
    }

    /* renamed from: g */
    public static C0559c m2414g(ContentInfo contentInfo) {
        return new C0559c(new e(contentInfo));
    }

    /* renamed from: b */
    public ClipData m2415b() {
        return this.f2326a.mo2426a();
    }

    /* renamed from: c */
    public int m2416c() {
        return this.f2326a.mo2427b();
    }

    /* renamed from: d */
    public int m2417d() {
        return this.f2326a.mo2429d();
    }

    /* renamed from: f */
    public ContentInfo m2418f() {
        return this.f2326a.mo2428c();
    }

    public String toString() {
        return this.f2326a.toString();
    }
}
