package p208k9;

import af.InterfaceC0238d;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.module.bean.Album;
import com.module.bean.Link;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p131f9.C4296a;
import p217l2.InterfaceC5344e;
import p217l2.InterfaceC5346g;
import p313r7.C6558d;

/* renamed from: k9.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5137a {

    /* renamed from: a */
    private static final InterfaceC1312h f21086a;

    /* renamed from: k9.a$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC5344e {
        a() {
        }

        @Override // p217l2.InterfaceC5344e
        /* renamed from: a */
        public InterfaceC0238d mo20783a() {
            return new C6558d();
        }
    }

    /* renamed from: k9.a$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC5346g {
        b() {
        }

        @Override // p217l2.InterfaceC5346g
        /* renamed from: a */
        public String mo20784a() {
            return "user_vod.db";
        }

        @Override // p217l2.InterfaceC5346g
        /* renamed from: b */
        public void mo20785b(int i10, String str) {
            AbstractC5868k.m23674f(str, "contentId");
            AbstractC5137a.m20780a().m17977h(i10, str);
        }

        @Override // p217l2.InterfaceC5346g
        /* renamed from: c */
        public Link mo20786c(String str) {
            AbstractC5868k.m23674f(str, "streamId");
            return AbstractC5137a.m20780a().m17983n(str);
        }

        @Override // p217l2.InterfaceC5346g
        /* renamed from: d */
        public void mo20787d(String str, String str2) {
            AbstractC5868k.m23674f(str, "oldPath");
            AbstractC5868k.m23674f(str2, "newPath");
            AbstractC5137a.m20780a().m17972c(str, str2);
        }

        @Override // p217l2.InterfaceC5346g
        /* renamed from: e */
        public void mo20788e(Album album) {
            AbstractC5868k.m23674f(album, "album");
            AbstractC5137a.m20780a().m17970a(album);
        }

        @Override // p217l2.InterfaceC5346g
        /* renamed from: f */
        public void mo20789f(Link link) {
            AbstractC5868k.m23674f(link, "link");
            AbstractC5137a.m20780a().m17971b(link);
        }

        @Override // p217l2.InterfaceC5346g
        /* renamed from: g */
        public Album mo20790g(String str, int i10) {
            AbstractC5868k.m23674f(str, "contentId");
            return AbstractC5137a.m20780a().m17982m(str, i10);
        }
    }

    /* renamed from: k9.a$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f21087a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4296a invoke() {
            return new C4296a();
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(c.f21087a);
        f21086a = m5965b;
    }

    /* renamed from: a */
    public static final C4296a m20780a() {
        return (C4296a) f21086a.getValue();
    }

    /* renamed from: b */
    public static final InterfaceC5344e m20781b() {
        return new a();
    }

    /* renamed from: c */
    public static final InterfaceC5346g m20782c() {
        return new b();
    }
}
