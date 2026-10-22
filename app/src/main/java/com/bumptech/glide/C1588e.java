package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import java.util.List;
import java.util.Map;
import p003a2.C0012h;
import p022b2.AbstractC1043k;
import p022b2.C1039g;
import p109e2.AbstractC4116f;
import p216l1.C5324k;
import p230m1.InterfaceC5569b;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes.dex */
public class C1588e extends ContextWrapper {

    /* renamed from: k */
    static final AbstractC1617m f6296k = new C1585b();

    /* renamed from: a */
    private final InterfaceC5569b f6297a;

    /* renamed from: b */
    private final AbstractC4116f.b f6298b;

    /* renamed from: c */
    private final C1039g f6299c;

    /* renamed from: d */
    private final ComponentCallbacks2C1586c.a f6300d;

    /* renamed from: e */
    private final List f6301e;

    /* renamed from: f */
    private final Map f6302f;

    /* renamed from: g */
    private final C5324k f6303g;

    /* renamed from: h */
    private final C1589f f6304h;

    /* renamed from: i */
    private final int f6305i;

    /* renamed from: j */
    private C0012h f6306j;

    public C1588e(Context context, InterfaceC5569b interfaceC5569b, AbstractC4116f.b bVar, C1039g c1039g, ComponentCallbacks2C1586c.a aVar, Map map, List list, C5324k c5324k, C1589f c1589f, int i10) {
        super(context.getApplicationContext());
        this.f6297a = interfaceC5569b;
        this.f6299c = c1039g;
        this.f6300d = aVar;
        this.f6301e = list;
        this.f6302f = map;
        this.f6303g = c5324k;
        this.f6304h = c1589f;
        this.f6305i = i10;
        this.f6298b = AbstractC4116f.m17208a(bVar);
    }

    /* renamed from: a */
    public AbstractC1043k m7307a(ImageView imageView, Class cls) {
        return this.f6299c.m4860a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC5569b m7308b() {
        return this.f6297a;
    }

    /* renamed from: c */
    public List m7309c() {
        return this.f6301e;
    }

    /* renamed from: d */
    public synchronized C0012h m7310d() {
        if (this.f6306j == null) {
            this.f6306j = (C0012h) this.f6300d.mo7298a().mo39V();
        }
        return this.f6306j;
    }

    /* renamed from: e */
    public AbstractC1617m m7311e(Class cls) {
        AbstractC1617m abstractC1617m = (AbstractC1617m) this.f6302f.get(cls);
        if (abstractC1617m == null) {
            for (Map.Entry entry : this.f6302f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC1617m = (AbstractC1617m) entry.getValue();
                }
            }
        }
        if (abstractC1617m == null) {
            return f6296k;
        }
        return abstractC1617m;
    }

    /* renamed from: f */
    public C5324k m7312f() {
        return this.f6303g;
    }

    /* renamed from: g */
    public C1589f m7313g() {
        return this.f6304h;
    }

    /* renamed from: h */
    public int m7314h() {
        return this.f6305i;
    }

    /* renamed from: i */
    public C1592i m7315i() {
        return (C1592i) this.f6298b.get();
    }
}
