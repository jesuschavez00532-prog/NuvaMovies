package p359ue;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1482a;
import p043ce.AbstractC1484b;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1508t;
import p344te.AbstractC6950j;
import p344te.InterfaceC6942b;
import re.C6575c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ue.h */
/* loaded from: classes3.dex */
public final class C7154h implements InterfaceC7153g {

    /* renamed from: a */
    private final Matcher f26847a;

    /* renamed from: b */
    private final CharSequence f26848b;

    /* renamed from: c */
    private final InterfaceC7152f f26849c;

    /* renamed from: d */
    private List f26850d;

    /* renamed from: ue.h$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1484b {
        a() {
        }

        @Override // p043ce.AbstractC1482a
        /* renamed from: c */
        public int mo6923c() {
            return C7154h.this.m27669d().groupCount() + 1;
        }

        @Override // p043ce.AbstractC1482a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m27670g((String) obj);
        }

        /* renamed from: g */
        public /* bridge */ boolean m27670g(String str) {
            return super.contains(str);
        }

        @Override // p043ce.AbstractC1484b, java.util.List
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String group = C7154h.this.m27669d().group(i10);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // p043ce.AbstractC1484b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m27672j((String) obj);
        }

        /* renamed from: j */
        public /* bridge */ int m27672j(String str) {
            return super.indexOf(str);
        }

        /* renamed from: k */
        public /* bridge */ int m27673k(String str) {
            return super.lastIndexOf(str);
        }

        @Override // p043ce.AbstractC1484b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m27673k((String) obj);
        }
    }

    /* renamed from: ue.h$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC1482a implements InterfaceC7152f {

        /* renamed from: ue.h$b$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {
            a() {
                super(1);
            }

            /* renamed from: a */
            public final C7151e m27676a(int i10) {
                return b.this.m27675i(i10);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                return m27676a(((Number) obj).intValue());
            }
        }

        b() {
        }

        @Override // p043ce.AbstractC1482a
        /* renamed from: c */
        public int mo6923c() {
            return C7154h.this.m27669d().groupCount() + 1;
        }

        @Override // p043ce.AbstractC1482a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            boolean z10;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = obj instanceof C7151e;
            }
            if (!z10) {
                return false;
            }
            return m27674g((C7151e) obj);
        }

        /* renamed from: g */
        public /* bridge */ boolean m27674g(C7151e c7151e) {
            return super.contains(c7151e);
        }

        /* renamed from: i */
        public C7151e m27675i(int i10) {
            C6575c m27687f;
            m27687f = AbstractC7156j.m27687f(C7154h.this.m27669d(), i10);
            if (m27687f.m25664p().intValue() >= 0) {
                String group = C7154h.this.m27669d().group(i10);
                AbstractC5868k.m23673e(group, "matchResult.group(index)");
                return new C7151e(group, m27687f);
            }
            return null;
        }

        @Override // p043ce.AbstractC1482a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C6575c m6986e;
            InterfaceC6942b m7003o;
            InterfaceC6942b m26992f;
            m6986e = AbstractC1500l.m6986e(this);
            m7003o = AbstractC1508t.m7003o(m6986e);
            m26992f = AbstractC6950j.m26992f(m7003o, new a());
            return m26992f.iterator();
        }
    }

    public C7154h(Matcher matcher, CharSequence charSequence) {
        AbstractC5868k.m23674f(matcher, "matcher");
        AbstractC5868k.m23674f(charSequence, "input");
        this.f26847a = matcher;
        this.f26848b = charSequence;
        this.f26849c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final MatchResult m27669d() {
        return this.f26847a;
    }

    @Override // p359ue.InterfaceC7153g
    /* renamed from: a */
    public List mo27666a() {
        if (this.f26850d == null) {
            this.f26850d = new a();
        }
        List list = this.f26850d;
        AbstractC5868k.m23671c(list);
        return list;
    }

    @Override // p359ue.InterfaceC7153g
    /* renamed from: b */
    public C6575c mo27667b() {
        C6575c m27686e;
        m27686e = AbstractC7156j.m27686e(m27669d());
        return m27686e;
    }

    @Override // p359ue.InterfaceC7153g
    public InterfaceC7153g next() {
        int i10;
        InterfaceC7153g m27685d;
        int end = m27669d().end();
        if (m27669d().end() == m27669d().start()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = end + i10;
        if (i11 <= this.f26848b.length()) {
            Matcher matcher = this.f26847a.pattern().matcher(this.f26848b);
            AbstractC5868k.m23673e(matcher, "matcher.pattern().matcher(input)");
            m27685d = AbstractC7156j.m27685d(matcher, i11, this.f26848b);
            return m27685d;
        }
        return null;
    }
}
