package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1606f;
import com.bumptech.glide.load.data.InterfaceC1605e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p124f2.AbstractC4219a;
import p184j1.InterfaceC4973d;
import p184j1.InterfaceC4979j;
import p184j1.InterfaceC4980k;
import p216l1.C5322i;
import p216l1.C5333t;
import p216l1.InterfaceC5335v;
import p278p1.C6177q;
import p278p1.InterfaceC6176p;
import p373w.InterfaceC7339d;
import p391x1.C7489f;
import p391x1.InterfaceC7488e;
import p422z1.C7738a;
import p422z1.C7739b;
import p422z1.C7740c;
import p422z1.C7741d;
import p422z1.C7742e;
import p422z1.C7743f;

/* renamed from: com.bumptech.glide.i */
/* loaded from: classes.dex */
public class C1592i {

    /* renamed from: a */
    private final C6177q f6319a;

    /* renamed from: b */
    private final C7738a f6320b;

    /* renamed from: c */
    private final C7742e f6321c;

    /* renamed from: d */
    private final C7743f f6322d;

    /* renamed from: e */
    private final C1606f f6323e;

    /* renamed from: f */
    private final C7489f f6324f;

    /* renamed from: g */
    private final C7739b f6325g;

    /* renamed from: h */
    private final C7741d f6326h = new C7741d();

    /* renamed from: i */
    private final C7740c f6327i = new C7740c();

    /* renamed from: j */
    private final InterfaceC7339d f6328j;

    /* renamed from: com.bumptech.glide.i$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.i$b */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.i$c */
    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* renamed from: com.bumptech.glide.i$d */
    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.bumptech.glide.i$e */
    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C1592i() {
        InterfaceC7339d m17634e = AbstractC4219a.m17634e();
        this.f6328j = m17634e;
        this.f6319a = new C6177q(m17634e);
        this.f6320b = new C7738a();
        this.f6321c = new C7742e();
        this.f6322d = new C7743f();
        this.f6323e = new C1606f();
        this.f6324f = new C7489f();
        this.f6325g = new C7739b();
        m7339s(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: f */
    private List m7321f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f6321c.m29933d(cls, cls2)) {
            for (Class cls5 : this.f6324f.m28683b(cls4, cls3)) {
                arrayList.add(new C5322i(cls, cls4, cls5, this.f6321c.m29932b(cls, cls4), this.f6324f.m28682a(cls4, cls5), this.f6328j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C1592i m7322a(Class cls, InterfaceC4973d interfaceC4973d) {
        this.f6320b.m29919a(cls, interfaceC4973d);
        return this;
    }

    /* renamed from: b */
    public C1592i m7323b(Class cls, InterfaceC4980k interfaceC4980k) {
        this.f6322d.m29936a(cls, interfaceC4980k);
        return this;
    }

    /* renamed from: c */
    public C1592i m7324c(Class cls, Class cls2, InterfaceC4979j interfaceC4979j) {
        m7326e("legacy_append", cls, cls2, interfaceC4979j);
        return this;
    }

    /* renamed from: d */
    public C1592i m7325d(Class cls, Class cls2, InterfaceC6176p interfaceC6176p) {
        this.f6319a.m24669a(cls, cls2, interfaceC6176p);
        return this;
    }

    /* renamed from: e */
    public C1592i m7326e(String str, Class cls, Class cls2, InterfaceC4979j interfaceC4979j) {
        this.f6321c.m29931a(str, interfaceC4979j, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List m7327g() {
        List m29923b = this.f6325g.m29923b();
        if (!m29923b.isEmpty()) {
            return m29923b;
        }
        throw new b();
    }

    /* renamed from: h */
    public C5333t m7328h(Class cls, Class cls2, Class cls3) {
        C5333t m29925a = this.f6327i.m29925a(cls, cls2, cls3);
        if (this.f6327i.m29926c(m29925a)) {
            return null;
        }
        if (m29925a == null) {
            List m7321f = m7321f(cls, cls2, cls3);
            if (m7321f.isEmpty()) {
                m29925a = null;
            } else {
                m29925a = new C5333t(cls, cls2, cls3, m7321f, this.f6328j);
            }
            this.f6327i.m29927d(cls, cls2, cls3, m29925a);
        }
        return m29925a;
    }

    /* renamed from: i */
    public List m7329i(Object obj) {
        return this.f6319a.m24671d(obj);
    }

    /* renamed from: j */
    public List m7330j(Class cls, Class cls2, Class cls3) {
        List m29928a = this.f6326h.m29928a(cls, cls2, cls3);
        if (m29928a == null) {
            m29928a = new ArrayList();
            Iterator it = this.f6319a.m24670c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f6321c.m29933d((Class) it.next(), cls2)) {
                    if (!this.f6324f.m28683b(cls4, cls3).isEmpty() && !m29928a.contains(cls4)) {
                        m29928a.add(cls4);
                    }
                }
            }
            this.f6326h.m29929b(cls, cls2, cls3, Collections.unmodifiableList(m29928a));
        }
        return m29928a;
    }

    /* renamed from: k */
    public InterfaceC4980k m7331k(InterfaceC5335v interfaceC5335v) {
        InterfaceC4980k m29937b = this.f6322d.m29937b(interfaceC5335v.mo21577c());
        if (m29937b != null) {
            return m29937b;
        }
        throw new d(interfaceC5335v.mo21577c());
    }

    /* renamed from: l */
    public InterfaceC1605e m7332l(Object obj) {
        return this.f6323e.m7432a(obj);
    }

    /* renamed from: m */
    public InterfaceC4973d m7333m(Object obj) {
        InterfaceC4973d m29920b = this.f6320b.m29920b(obj.getClass());
        if (m29920b != null) {
            return m29920b;
        }
        throw new e(obj.getClass());
    }

    /* renamed from: n */
    public boolean m7334n(InterfaceC5335v interfaceC5335v) {
        if (this.f6322d.m29937b(interfaceC5335v.mo21577c()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public C1592i m7335o(ImageHeaderParser imageHeaderParser) {
        this.f6325g.m29922a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public C1592i m7336p(InterfaceC1605e.a aVar) {
        this.f6323e.m7433b(aVar);
        return this;
    }

    /* renamed from: q */
    public C1592i m7337q(Class cls, Class cls2, InterfaceC7488e interfaceC7488e) {
        this.f6324f.m28684c(cls, cls2, interfaceC7488e);
        return this;
    }

    /* renamed from: r */
    public C1592i m7338r(Class cls, Class cls2, InterfaceC6176p interfaceC6176p) {
        this.f6319a.m24672f(cls, cls2, interfaceC6176p);
        return this;
    }

    /* renamed from: s */
    public final C1592i m7339s(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f6321c.m29934e(arrayList);
        return this;
    }
}
