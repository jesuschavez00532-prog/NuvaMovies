package p219l4;

import android.accounts.Account;
import android.support.v4.media.session.AbstractC0272b;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p037c5.C1359a;
import p214l.C5304b;

/* renamed from: l4.d */
/* loaded from: classes.dex */
public final class C5361d {

    /* renamed from: a */
    private final Account f21924a;

    /* renamed from: b */
    private final Set f21925b;

    /* renamed from: c */
    private final Set f21926c;

    /* renamed from: d */
    private final Map f21927d;

    /* renamed from: e */
    private final int f21928e;

    /* renamed from: f */
    private final View f21929f;

    /* renamed from: g */
    private final String f21930g;

    /* renamed from: h */
    private final String f21931h;

    /* renamed from: i */
    private final C1359a f21932i;

    /* renamed from: j */
    private Integer f21933j;

    /* renamed from: l4.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Account f21934a;

        /* renamed from: b */
        private C5304b f21935b;

        /* renamed from: c */
        private String f21936c;

        /* renamed from: d */
        private String f21937d;

        /* renamed from: e */
        private C1359a f21938e = C1359a.f5090j;

        /* renamed from: a */
        public C5361d m21708a() {
            return new C5361d(this.f21934a, this.f21935b, null, 0, null, this.f21936c, this.f21937d, this.f21938e, false);
        }

        /* renamed from: b */
        public a m21709b(String str) {
            this.f21936c = str;
            return this;
        }

        /* renamed from: c */
        public final a m21710c(Collection collection) {
            if (this.f21935b == null) {
                this.f21935b = new C5304b();
            }
            this.f21935b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final a m21711d(Account account) {
            this.f21934a = account;
            return this;
        }

        /* renamed from: e */
        public final a m21712e(String str) {
            this.f21937d = str;
            return this;
        }
    }

    public C5361d(Account account, Set set, Map map, int i10, View view, String str, String str2, C1359a c1359a, boolean z10) {
        Set unmodifiableSet;
        this.f21924a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f21925b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f21927d = map;
        this.f21929f = view;
        this.f21928e = i10;
        this.f21930g = str;
        this.f21931h = str2;
        this.f21932i = c1359a == null ? C1359a.f5090j : c1359a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f21926c = Collections.unmodifiableSet(hashSet);
        } else {
            AbstractC0272b.m941a(it.next());
            throw null;
        }
    }

    /* renamed from: a */
    public Account m21699a() {
        return this.f21924a;
    }

    /* renamed from: b */
    public Account m21700b() {
        Account account = this.f21924a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public Set m21701c() {
        return this.f21926c;
    }

    /* renamed from: d */
    public String m21702d() {
        return this.f21930g;
    }

    /* renamed from: e */
    public Set m21703e() {
        return this.f21925b;
    }

    /* renamed from: f */
    public final C1359a m21704f() {
        return this.f21932i;
    }

    /* renamed from: g */
    public final Integer m21705g() {
        return this.f21933j;
    }

    /* renamed from: h */
    public final String m21706h() {
        return this.f21931h;
    }

    /* renamed from: i */
    public final void m21707i(Integer num) {
        this.f21933j = num;
    }
}
