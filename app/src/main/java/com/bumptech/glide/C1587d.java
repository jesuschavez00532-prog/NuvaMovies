package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C1589f;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.manager.C1622e;
import com.bumptech.glide.manager.C1631n;
import com.bumptech.glide.manager.InterfaceC1620c;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p003a2.C0012h;
import p109e2.AbstractC4121k;
import p214l.C5303a;
import p216l1.C5324k;
import p230m1.C5572e;
import p230m1.C5576i;
import p230m1.C5578k;
import p230m1.InterfaceC5569b;
import p230m1.InterfaceC5571d;
import p243n1.C5729g;
import p243n1.C5730h;
import p243n1.C5732j;
import p243n1.InterfaceC5723a;
import p243n1.InterfaceC5731i;
import p256o1.ExecutorServiceC5901a;
import p407y1.AbstractC7657a;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes.dex */
public final class C1587d {

    /* renamed from: c */
    private C5324k f6278c;

    /* renamed from: d */
    private InterfaceC5571d f6279d;

    /* renamed from: e */
    private InterfaceC5569b f6280e;

    /* renamed from: f */
    private InterfaceC5731i f6281f;

    /* renamed from: g */
    private ExecutorServiceC5901a f6282g;

    /* renamed from: h */
    private ExecutorServiceC5901a f6283h;

    /* renamed from: i */
    private InterfaceC5723a.a f6284i;

    /* renamed from: j */
    private C5732j f6285j;

    /* renamed from: k */
    private InterfaceC1620c f6286k;

    /* renamed from: n */
    private C1631n.b f6289n;

    /* renamed from: o */
    private ExecutorServiceC5901a f6290o;

    /* renamed from: p */
    private boolean f6291p;

    /* renamed from: q */
    private List f6292q;

    /* renamed from: a */
    private final Map f6276a = new C5303a();

    /* renamed from: b */
    private final C1589f.a f6277b = new C1589f.a();

    /* renamed from: l */
    private int f6287l = 4;

    /* renamed from: m */
    private ComponentCallbacks2C1586c.a f6288m = new a();

    /* renamed from: com.bumptech.glide.d$a */
    /* loaded from: classes.dex */
    class a implements ComponentCallbacks2C1586c.a {
        a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C1586c.a
        /* renamed from: a */
        public C0012h mo7298a() {
            return new C0012h();
        }
    }

    /* renamed from: com.bumptech.glide.d$b */
    /* loaded from: classes.dex */
    class b implements ComponentCallbacks2C1586c.a {

        /* renamed from: a */
        final /* synthetic */ C0012h f6294a;

        b(C0012h c0012h) {
            this.f6294a = c0012h;
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C1586c.a
        /* renamed from: a */
        public C0012h mo7298a() {
            C0012h c0012h = this.f6294a;
            if (c0012h == null) {
                return new C0012h();
            }
            return c0012h;
        }
    }

    /* renamed from: com.bumptech.glide.d$c */
    /* loaded from: classes.dex */
    static final class c {
    }

    /* renamed from: com.bumptech.glide.d$d */
    /* loaded from: classes.dex */
    public static final class d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ComponentCallbacks2C1586c m7299a(Context context, List list, AbstractC7657a abstractC7657a) {
        if (this.f6282g == null) {
            this.f6282g = ExecutorServiceC5901a.m23844h();
        }
        if (this.f6283h == null) {
            this.f6283h = ExecutorServiceC5901a.m23842f();
        }
        if (this.f6290o == null) {
            this.f6290o = ExecutorServiceC5901a.m23840d();
        }
        if (this.f6285j == null) {
            this.f6285j = new C5732j.a(context).m23142a();
        }
        if (this.f6286k == null) {
            this.f6286k = new C1622e();
        }
        if (this.f6279d == null) {
            int m23140b = this.f6285j.m23140b();
            if (m23140b > 0) {
                this.f6279d = new C5578k(m23140b);
            } else {
                this.f6279d = new C5572e();
            }
        }
        if (this.f6280e == null) {
            this.f6280e = new C5576i(this.f6285j.m23139a());
        }
        if (this.f6281f == null) {
            this.f6281f = new C5730h(this.f6285j.m23141d());
        }
        if (this.f6284i == null) {
            this.f6284i = new C5729g(context);
        }
        if (this.f6278c == null) {
            this.f6278c = new C5324k(this.f6281f, this.f6284i, this.f6283h, this.f6282g, ExecutorServiceC5901a.m23845i(), this.f6290o, this.f6291p);
        }
        List list2 = this.f6292q;
        if (list2 == null) {
            this.f6292q = Collections.emptyList();
        } else {
            this.f6292q = Collections.unmodifiableList(list2);
        }
        return new ComponentCallbacks2C1586c(context, this.f6278c, this.f6281f, this.f6279d, this.f6280e, new C1631n(this.f6289n), this.f6286k, this.f6287l, this.f6288m, this.f6276a, this.f6292q, list, abstractC7657a, this.f6277b.m7318b());
    }

    /* renamed from: b */
    public C1587d m7300b(InterfaceC5571d interfaceC5571d) {
        this.f6279d = interfaceC5571d;
        return this;
    }

    /* renamed from: c */
    public C1587d m7301c(C0012h c0012h) {
        return m7302d(new b(c0012h));
    }

    /* renamed from: d */
    public C1587d m7302d(ComponentCallbacks2C1586c.a aVar) {
        this.f6288m = (ComponentCallbacks2C1586c.a) AbstractC4121k.m17226d(aVar);
        return this;
    }

    /* renamed from: e */
    public C1587d m7303e(InterfaceC5723a.a aVar) {
        this.f6284i = aVar;
        return this;
    }

    /* renamed from: f */
    public C1587d m7304f(int i10) {
        if (i10 >= 2 && i10 <= 6) {
            this.f6287l = i10;
            return this;
        }
        throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
    }

    /* renamed from: g */
    public C1587d m7305g(InterfaceC5731i interfaceC5731i) {
        this.f6281f = interfaceC5731i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m7306h(C1631n.b bVar) {
        this.f6289n = bVar;
    }
}
