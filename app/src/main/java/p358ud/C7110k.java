package p358ud;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.RecyclerView;
import com.module.R$string;
import com.module.view.LoadingView;
import com.open.leanback.widget.AbstractC3057h;
import com.open.leanback.widget.VerticalGridView;
import com.vod.R$id;
import com.vod.R$layout;
import ga.C4417e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p161ha.ViewOnClickListenerC4799t0;
import p201k2.AbstractC5085b;
import p212kd.C5203n0;
import p225ld.AbstractC5551e;
import p225ld.C5550d;
import p268od.InterfaceC5965a;
import p268od.InterfaceC5966b;
import p303qd.C6482u;
import p348u2.AbstractC7028e;
import p400xa.AbstractC7555b0;
import p400xa.C7556b1;
import p400xa.C7572h;
import p430z9.AbstractC7766d;

/* renamed from: ud.k */
/* loaded from: classes3.dex */
public final class C7110k extends AbstractC7766d<InterfaceC5965a> implements InterfaceC5966b {

    /* renamed from: F0 */
    public static final a f26605F0 = new a(null);

    /* renamed from: A0 */
    private int f26606A0;

    /* renamed from: B0 */
    private int f26607B0;

    /* renamed from: C0 */
    private boolean f26608C0;

    /* renamed from: D0 */
    private boolean f26609D0;

    /* renamed from: y0 */
    private C5203n0 f26611y0;

    /* renamed from: E0 */
    public Map f26610E0 = new LinkedHashMap();

    /* renamed from: z0 */
    private String f26612z0 = "";

    /* renamed from: ud.k$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C7110k m27341a(String str) {
            AbstractC5868k.m23674f(str, "concreteColumnCode");
            C7110k c7110k = new C7110k();
            Bundle bundle = new Bundle();
            bundle.putString("key_concrete_column_code", str);
            c7110k.m3132V8(bundle);
            return c7110k;
        }
    }

    /* renamed from: ud.k$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            InterfaceC5642a m30062x9 = C7110k.this.m30062x9();
            if (m30062x9 != null) {
                m30062x9.invoke();
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: ud.k$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC3057h {
        c() {
        }

        @Override // com.open.leanback.widget.AbstractC3057h
        /* renamed from: a */
        public void mo11995a(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
            super.mo11995a(recyclerView, abstractC0787f0, i10, i11);
            if (C7110k.this.f26606A0 < C7110k.this.f26607B0 && !C7110k.this.f26608C0 && i10 >= C7110k.this.f26606A0 - 2) {
                C7110k.this.f26608C0 = true;
                InterfaceC5965a m27330I9 = C7110k.m27330I9(C7110k.this);
                if (m27330I9 != null) {
                    m27330I9.mo24124Z();
                }
            }
        }
    }

    /* renamed from: ud.k$d */
    /* loaded from: classes3.dex */
    public static final class d implements ViewOnClickListenerC4799t0.a {
        d() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            C7572h.f27809j.m29056a().m29054w();
            AbstractC7028e.m27115a("nuf");
            Context m3096J6 = C7110k.this.m3096J6();
            if (m3096J6 != null) {
                C7110k c7110k = C7110k.this;
                C4417e c4417e = C4417e.f19115a;
                String m20598h = AbstractC5085b.m20598h(c7110k.m3096J6());
                AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
                C4417e.m18497f(c4417e, m3096J6, m20598h, false, false, 12, null);
            }
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }
    }

    /* renamed from: I9 */
    public static final /* synthetic */ InterfaceC5965a m27330I9(C7110k c7110k) {
        return (InterfaceC5965a) c7110k.m30063y9();
    }

    /* renamed from: M9 */
    private final void m27334M9() {
        int i10 = R$id.mListView;
        ((VerticalGridView) m27336F9(i10)).setClipChildren(false);
        ((VerticalGridView) m27336F9(i10)).setClipToPadding(false);
    }

    /* renamed from: O9 */
    private final void m27335O9() {
        this.f26608C0 = false;
        InterfaceC5965a interfaceC5965a = (InterfaceC5965a) m30063y9();
        if (interfaceC5965a != null) {
            interfaceC5965a.mo24125l3(this.f26612z0);
        }
        InterfaceC5965a interfaceC5965a2 = (InterfaceC5965a) m30063y9();
        if (interfaceC5965a2 != null) {
            interfaceC5965a2.mo24123H0();
        }
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: B5 */
    public void mo24126B5(boolean z10) {
        this.f26608C0 = z10;
    }

    /* renamed from: F9 */
    public View m27336F9(int i10) {
        View findViewById;
        Map map = this.f26610E0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // p430z9.AbstractC7766d
    /* renamed from: N9, reason: merged with bridge method [inline-methods] */
    public InterfaceC5965a mo22228A9() {
        return new C6482u(this, this);
    }

    /* renamed from: P9 */
    public boolean m27338P9() {
        Activity activity;
        View currentFocus;
        Context m3096J6 = m3096J6();
        View view = null;
        if (m3096J6 instanceof Activity) {
            activity = (Activity) m3096J6;
        } else {
            activity = null;
        }
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
            view = currentFocus.focusSearch(17);
        }
        if (view == null || view.getId() != R$id.mRlTabItem) {
            return false;
        }
        return true;
    }

    @Override // p430z9.AbstractC7766d, p011aa.InterfaceC0124b
    /* renamed from: Q2 */
    public boolean mo493Q2() {
        if (mo495g5()) {
            return ((VerticalGridView) m27336F9(R$id.mListView)).requestFocus();
        }
        return false;
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: S4 */
    public void mo24127S4() {
        boolean z10;
        String str;
        String str2;
        if (m3075C6() != null) {
            AbstractActivityC0712e m3075C6 = m3075C6();
            if (m3075C6 != null) {
                z10 = m3075C6.isFinishing();
            } else {
                z10 = true;
            }
            if (!z10 && !m3192t7()) {
                C7556b1 c7556b1 = C7556b1.f27754a;
                AbstractC0729o m3093I6 = m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                StringBuilder sb2 = new StringBuilder();
                Context m3096J6 = m3096J6();
                String str3 = null;
                if (m3096J6 != null) {
                    str = m3096J6.getString(R$string.error_code_net_type);
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append('2');
                Context m3096J62 = m3096J6();
                if (m3096J62 != null) {
                    str3 = m3096J62.getString(R$string.cdn_ee2);
                }
                sb2.append(str3);
                String sb3 = sb2.toString();
                if (sb3 == null) {
                    sb3 = "";
                }
                Context m3096J63 = m3096J6();
                if (m3096J63 == null || (str2 = m3096J63.getString(R$string.commmon_exit_text)) == null) {
                    str2 = "";
                }
                C7556b1.m28962j(c7556b1, m3093I6, sb3, "", str2, true, new d(), false, null, false, 384, null);
            }
        }
    }

    @Override // p430z9.AbstractC7766d, p430z9.AbstractC7770h, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo22268m9();
    }

    @Override // p430z9.AbstractC7766d, p011aa.InterfaceC0124b
    /* renamed from: b5 */
    public boolean mo494b5() {
        boolean z10;
        int i10 = 0;
        boolean z11;
        int i11 = R$id.mListView;
        VerticalGridView verticalGridView = (VerticalGridView) m27336F9(i11);
        if (verticalGridView != null && verticalGridView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C5203n0 c5203n0 = this.f26611y0;
            if (c5203n0 != null) {
                i10 = c5203n0.getItemCount();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                VerticalGridView verticalGridView2 = (VerticalGridView) m27336F9(i11);
                if (verticalGridView2 != null) {
                    z11 = verticalGridView2.hasFocus();
                } else {
                    z11 = false;
                }
                if (z11 && ((LoadingView) m27336F9(R$id.mLoadingView)).getVisibility() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: d6 */
    public void mo24128d6() {
        ((VerticalGridView) m27336F9(R$id.mListView)).setVisibility(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5550d(0, AbstractC5551e.m22511e(), null, null, null, false, 48, null));
        C5203n0 c5203n0 = this.f26611y0;
        if (c5203n0 != null) {
            c5203n0.m21030i(arrayList);
        }
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: e3 */
    public void mo24129e3(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "homeVodExtras");
        C5203n0 c5203n0 = this.f26611y0;
        if (c5203n0 != null) {
            c5203n0.m21022a(arrayList);
        }
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: g */
    public void mo24130g(boolean z10) {
        int i10 = 0;
        LoadingView loadingView = (LoadingView) m27336F9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
    }

    @Override // p430z9.AbstractC7766d, p011aa.InterfaceC0124b
    /* renamed from: g5 */
    public boolean mo495g5() {
        boolean z10;
        VerticalGridView verticalGridView = (VerticalGridView) m27336F9(R$id.mListView);
        if (verticalGridView != null && verticalGridView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: h6 */
    public void mo24131h6(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "homeVodExtras");
        ((VerticalGridView) m27336F9(R$id.mListView)).setVisibility(0);
        C5203n0 c5203n0 = this.f26611y0;
        if (c5203n0 != null) {
            c5203n0.m21030i(arrayList);
        }
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: i5 */
    public void mo24132i5(C5550d c5550d) {
        AbstractC5868k.m23674f(c5550d, "homeVodExtra");
        C5203n0 c5203n0 = this.f26611y0;
        if (c5203n0 != null) {
            c5203n0.m21028g(c5550d);
        }
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: i6 */
    public void mo24133i6() {
        this.f26606A0 = 0;
    }

    @Override // p430z9.AbstractC7766d, p430z9.AbstractC7770h
    /* renamed from: m9 */
    public void mo22268m9() {
        this.f26610E0.clear();
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: n9 */
    public void mo22269n9() {
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: o9 */
    public void mo22270o9() {
        String str;
        Bundle m3090H6 = m3090H6();
        String str2 = "";
        if (m3090H6 != null) {
            str = m3090H6.getString("key_concrete_column_code", "");
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str;
        }
        this.f26612z0 = str2;
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            C5203n0 c5203n0 = new C5203n0(m3096J6, new b());
            this.f26611y0 = c5203n0;
            AbstractC5868k.m23671c(c5203n0);
            c5203n0.m21029h(this.f26612z0);
            int i10 = R$id.mListView;
            VerticalGridView verticalGridView = (VerticalGridView) m27336F9(i10);
            AbstractC5868k.m23673e(verticalGridView, "mListView");
            AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
            ((VerticalGridView) m27336F9(i10)).setAdapter(this.f26611y0);
            ((VerticalGridView) m27336F9(i10)).setOnChildViewHolderSelectedListener(new c());
        }
    }

    @Override // p011aa.InterfaceC0124b
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 != 4 && (i10 != 21 || !m27338P9())) {
            return false;
        }
        InterfaceC5642a m30061w9 = m30061w9();
        if (m30061w9 != null) {
            m30061w9.invoke();
            return true;
        }
        return true;
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: p9 */
    public int mo22272p9() {
        return R$layout.fragment_home_vod;
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: q9 */
    public void mo22273q9() {
        m27334M9();
        m27335O9();
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: r9 */
    public void mo27339r9() {
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: s9 */
    public void mo27340s9() {
        m27334M9();
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: u2 */
    public void mo24134u2(int i10) {
        this.f26607B0 = i10;
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: u4 */
    public void mo24135u4(int i10) {
        this.f26606A0 += i10;
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: w1 */
    public void mo24136w1(C5550d c5550d) {
        AbstractC5868k.m23674f(c5550d, "homeVodExtra");
        C5203n0 c5203n0 = this.f26611y0;
        if (c5203n0 != null) {
            c5203n0.m21031j(c5550d);
        }
    }

    @Override // p268od.InterfaceC5966b
    /* renamed from: y0 */
    public void mo24137y0() {
        mo24128d6();
    }

    @Override // p430z9.AbstractC7766d
    /* renamed from: z9 */
    public boolean mo22281z9() {
        return this.f26609D0;
    }
}
