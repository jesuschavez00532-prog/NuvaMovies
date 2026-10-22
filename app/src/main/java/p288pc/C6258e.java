package p288pc;

import android.util.LruCache;
import be.C1328x;
import me.InterfaceC5665q;
import ne.AbstractC5868k;
import ne.AbstractC5869l;

/* renamed from: pc.e */
/* loaded from: classes.dex */
public final class C6258e extends LruCache {

    /* renamed from: a */
    private InterfaceC5665q f24493a;

    /* renamed from: pc.e$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5665q {

        /* renamed from: a */
        public static final a f24494a = new a();

        a() {
            super(3);
        }

        /* renamed from: a */
        public final void m24895a(Object obj, Object obj2, Object obj3) {
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m24895a(obj, obj2, obj3);
            return C1328x.f4998a;
        }
    }

    public C6258e(int i10) {
        super(i10);
        this.f24493a = a.f24494a;
    }

    /* renamed from: a */
    public final void m24894a(InterfaceC5665q interfaceC5665q) {
        AbstractC5868k.m23674f(interfaceC5665q, "block");
        this.f24493a = interfaceC5665q;
    }

    @Override // android.util.LruCache
    protected void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        super.entryRemoved(z10, obj, obj2, obj3);
        this.f24493a.mo12281b(obj, obj2, obj3);
    }
}
