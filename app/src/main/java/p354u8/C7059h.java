package p354u8;

import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0752f;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import be.C1328x;
import com.module.R$string;
import com.module.bean.TabBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p011aa.InterfaceC0124b;
import p223l8.C5500t;
import p358ud.C7110k;
import p430z9.AbstractC7766d;

/* renamed from: u8.h */
/* loaded from: classes2.dex */
public final class C7059h extends FragmentStateAdapter {

    /* renamed from: a */
    private AbstractActivityC0712e f26473a;

    /* renamed from: b */
    private ArrayList f26474b;

    /* renamed from: c */
    private List f26475c;

    /* renamed from: d */
    private HashMap f26476d;

    /* renamed from: e */
    private List f26477e;

    /* renamed from: f */
    private HashSet f26478f;

    /* renamed from: g */
    private C5500t f26479g;

    /* renamed from: h */
    private InterfaceC5642a f26480h;

    /* renamed from: i */
    private InterfaceC5642a f26481i;

    /* renamed from: u8.h$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        /* renamed from: a */
        public final void m27205a() {
            C7059h.this.f26480h.invoke();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27205a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: u8.h$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m27206a() {
            C7059h.this.f26481i.invoke();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27206a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: u8.h$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f26484a = new c();

        c() {
            super(0);
        }

        /* renamed from: a */
        public final void m27207a() {
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27207a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: u8.h$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f26485a = new d();

        d() {
            super(0);
        }

        /* renamed from: a */
        public final void m27208a() {
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27208a();
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7059h(AbstractActivityC0712e abstractActivityC0712e) {
        super(abstractActivityC0712e);
        AbstractC5868k.m23674f(abstractActivityC0712e, "activity");
        this.f26473a = abstractActivityC0712e;
        this.f26474b = new ArrayList();
        this.f26475c = new ArrayList();
        this.f26476d = new HashMap();
        this.f26477e = new ArrayList();
        this.f26478f = new HashSet();
        this.f26480h = d.f26485a;
        this.f26481i = c.f26484a;
    }

    /* renamed from: c */
    public final boolean m27200c(int i10) {
        InterfaceC0124b interfaceC0124b;
        if (i10 < this.f26477e.size()) {
            InterfaceC0752f m3523h0 = this.f26473a.m3294d4().m3523h0("f" + getItemId(i10));
            if (m3523h0 instanceof InterfaceC0124b) {
                return ((InterfaceC0124b) m3523h0).mo495g5();
            }
        }
        if (i10 >= this.f26476d.size() || (interfaceC0124b = (InterfaceC0124b) this.f26476d.get(this.f26474b.get(i10))) == null || !interfaceC0124b.mo495g5()) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j10) {
        return this.f26478f.contains(Long.valueOf(j10));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i10) {
        AbstractC7766d m27341a;
        if (i10 == 0) {
            m27341a = this.f26479g;
            if (m27341a == null) {
                AbstractC5868k.m23686r("mHomeLiveFragment");
                m27341a = null;
            }
        } else {
            C7110k.a aVar = C7110k.f26605F0;
            Object obj = this.f26474b.get(i10);
            AbstractC5868k.m23673e(obj, "mTitleList[position]");
            m27341a = aVar.m27341a((String) obj);
        }
        m27341a.m30059E9(new a());
        m27341a.m30058D9(new b());
        this.f26478f.add(Long.valueOf(getItemId(i10)));
        return m27341a.m30060v9();
    }

    /* renamed from: d */
    public final InterfaceC0124b m27201d(int i10) {
        if (i10 < this.f26477e.size()) {
            InterfaceC0752f m3523h0 = this.f26473a.m3294d4().m3523h0("f" + getItemId(i10));
            if (m3523h0 instanceof InterfaceC0124b) {
                return (InterfaceC0124b) m3523h0;
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m27202e(int i10) {
        if (i10 < this.f26477e.size()) {
            InterfaceC0752f m3523h0 = this.f26473a.m3294d4().m3523h0("f" + getItemId(i10));
            if (m3523h0 instanceof InterfaceC0124b) {
                return ((InterfaceC0124b) m3523h0).mo493Q2();
            }
        }
        if (i10 < this.f26476d.size()) {
            Object obj = this.f26476d.get(this.f26474b.get(i10));
            AbstractC5868k.m23671c(obj);
            return ((InterfaceC0124b) obj).mo493Q2();
        }
        return false;
    }

    /* renamed from: f */
    public final void m27203f(List list, List list2, ArrayList arrayList, C5500t c5500t) {
        AbstractC5868k.m23674f(list, "list");
        AbstractC5868k.m23674f(list2, "titles");
        AbstractC5868k.m23674f(arrayList, "titleList");
        AbstractC5868k.m23674f(c5500t, "homeLiveFragment");
        this.f26475c = list;
        this.f26477e = list2;
        this.f26474b = arrayList;
        this.f26479g = c5500t;
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public final void m27204g(InterfaceC5642a interfaceC5642a, InterfaceC5642a interfaceC5642a2) {
        AbstractC5868k.m23674f(interfaceC5642a, "onKeyEdgeUpListener");
        AbstractC5868k.m23674f(interfaceC5642a2, "onFocusSearchListener");
        this.f26480h = interfaceC5642a;
        this.f26481i = interfaceC5642a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f26474b.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        String titleStr = ((TabBean) this.f26477e.get(i10)).getTitleStr();
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_live))) {
            return 101L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_free))) {
            return 102L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_movies))) {
            return 103L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_series))) {
            return 104L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_kids))) {
            return 105L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_showtime))) {
            return 106L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_ranking))) {
            return 107L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_special))) {
            return 108L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_personal))) {
            return 109L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_featured))) {
            return 110L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_match))) {
            return 111L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_anime))) {
            return 112L;
        }
        if (AbstractC5868k.m23669a(titleStr, this.f26473a.getResources().getString(R$string.home_category_uhd))) {
            return 113L;
        }
        return i10;
    }
}
