package p154h3;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C0817d;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.download.R$color;
import com.download.R$id;
import com.download.R$layout;
import com.download.bean.DownloadFinishEvent;
import com.download.view.DefaultDownloadView;
import com.download.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p110e3.C4127e;
import p186j3.InterfaceC4983a;
import p186j3.InterfaceC4984b;
import p218l3.C5350a;
import ye.InterfaceC7719m;

/* renamed from: h3.b */
/* loaded from: classes.dex */
public final class C4513b extends AbstractC4512a<InterfaceC4983a> implements InterfaceC4984b {

    /* renamed from: B0 */
    private final InterfaceC1312h f19526B0;

    /* renamed from: C0 */
    public Map f19527C0 = new LinkedHashMap();

    /* renamed from: A0 */
    private boolean f19525A0 = true;

    /* renamed from: h3.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        /* renamed from: a */
        public final void m18888a() {
            ((InterfaceC4983a) C4513b.this.m5478w9()).mo20342j();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18888a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: h3.b$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4127e invoke() {
            return new C4127e(C4513b.this);
        }
    }

    public C4513b() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f19526B0 = m5965b;
    }

    /* renamed from: K9 */
    private final C4127e m18880K9() {
        return (C4127e) this.f19526B0.getValue();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_download_finish;
    }

    @Override // p186j3.InterfaceC4984b
    /* renamed from: G */
    public void mo18881G() {
        InterfaceC5642a m18877G9 = m18877G9();
        if (m18877G9 != null) {
            m18877G9.invoke();
        }
        int i10 = R$id.mDefaultView;
        ((DefaultDownloadView) m18882J9(i10)).setVisibility(0);
        ((Group) m18882J9(R$id.mGroupContent)).setVisibility(8);
        ((DefaultDownloadView) m18882J9(i10)).m7605f();
    }

    @Override // p154h3.AbstractC4512a
    /* renamed from: H9 */
    protected boolean mo18878H9() {
        Button button;
        View focusedChild = ((VerticalGridView) m18882J9(R$id.mVgView)).getFocusedChild();
        if (focusedChild == null || (button = (Button) focusedChild.findViewById(R$id.mBtPlay)) == null || !button.hasFocus()) {
            return false;
        }
        return true;
    }

    /* renamed from: J9 */
    public View m18882J9(int i10) {
        View findViewById;
        Map map = this.f19527C0;
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

    @Override // ba.AbstractC1196d
    /* renamed from: L9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4983a mo5465y9() {
        return new C5350a(this, this);
    }

    /* renamed from: M9 */
    public void m18884M9() {
        ((InterfaceC4983a) m5478w9()).mo20342j();
    }

    @Override // p154h3.AbstractC4512a, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p186j3.InterfaceC4984b
    /* renamed from: U5 */
    public void mo18885U5(List list) {
        AbstractC5868k.m23674f(list, "task");
        ((DefaultDownloadView) m18882J9(R$id.mDefaultView)).setVisibility(8);
        ((Group) m18882J9(R$id.mGroupContent)).setVisibility(0);
        m18880K9().m17264e(list);
    }

    @Override // p186j3.InterfaceC4984b
    /* renamed from: X */
    public void mo18886X() {
        InterfaceC5642a m18877G9 = m18877G9();
        if (m18877G9 != null) {
            m18877G9.invoke();
        }
        int i10 = R$id.mDefaultView;
        ((DefaultDownloadView) m18882J9(i10)).setVisibility(0);
        ((Group) m18882J9(R$id.mGroupContent)).setVisibility(8);
        ((DefaultDownloadView) m18882J9(i10)).m7604e();
    }

    @Override // p186j3.InterfaceC4984b
    /* renamed from: g */
    public void mo18887g(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m18882J9(R$id.mLoading);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
    }

    @Override // p154h3.AbstractC4512a, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f19527C0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        C0817d c0817d = new C0817d(m3096J6(), 1);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        c0817d.m4170f(new ColorDrawable(m3096J6.getResources().getColor(R$color.color_0fc4c4c4)));
        int i10 = R$id.mVgView;
        ((VerticalGridView) m18882J9(i10)).addItemDecoration(c0817d);
        m18880K9().setHasStableIds(true);
        m18880K9().m17263d(new a());
        ((VerticalGridView) m18882J9(i10)).setAdapter(m18880K9());
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        ((InterfaceC4983a) m5478w9()).mo20341h();
    }

    @InterfaceC7719m
    public final void receiveDownloadFinish(DownloadFinishEvent downloadFinishEvent) {
        AbstractC5868k.m23674f(downloadFinishEvent, "event");
        m18884M9();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f19525A0;
    }
}
