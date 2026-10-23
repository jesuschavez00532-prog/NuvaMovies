package p154h3;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.NetworkInfo;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C0817d;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.download.R$color;
import com.download.R$id;
import com.download.R$layout;
import com.download.R$string;
import com.download.view.DefaultDownloadView;
import com.download.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p110e3.C4128f;
import p186j3.InterfaceC4985c;
import p186j3.InterfaceC4986d;
import p201k2.AbstractC5094k;
import p218l3.C5351b;
import p258o3.C5909e;
import p258o3.C5913i;
import p359ue.AbstractC7167u;
import p400xa.C7615w;
import ua.C7069a;

/* renamed from: h3.d */
/* loaded from: classes.dex */
public final class C4515d extends AbstractC4512a<InterfaceC4985c> implements InterfaceC4986d, C7069a.a {

    /* renamed from: A0 */
    private boolean f19531A0;

    /* renamed from: B0 */
    private C7069a f19532B0;

    /* renamed from: C0 */
    private final InterfaceC1312h f19533C0;

    /* renamed from: D0 */
    public Map f19534D0 = new LinkedHashMap();

    /* renamed from: h3.d$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        /* renamed from: a */
        public final void m18903a() {
            ((InterfaceC4985c) C4515d.this.m5478w9()).mo20344j();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18903a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: h3.d$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4128f invoke() {
            return new C4128f(C4515d.this);
        }
    }

    public C4515d() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f19533C0 = m5965b;
    }

    /* renamed from: L9 */
    private final C4128f m18891L9() {
        return (C4128f) this.f19533C0.getValue();
    }

    /* renamed from: N9 */
    private final void m18892N9() {
        if (this.f19532B0 == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C7069a c7069a = new C7069a();
            this.f19532B0 = c7069a;
            c7069a.m27233a(this);
            Context m3096J6 = m3096J6();
            if (m3096J6 != null) {
                m3096J6.registerReceiver(this.f19532B0, intentFilter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O9 */
    public static final void m18893O9(C4515d c4515d) {
        AbstractC5868k.m23674f(c4515d, "this$0");
        C5909e.a aVar = C5909e.f23504f;
        Context m3096J6 = c4515d.m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        aVar.m23878a(m3096J6).m23873h();
    }

    /* renamed from: P9 */
    private final void m18894P9() {
        if (this.f19532B0 != null) {
            try {
                Context m3096J6 = m3096J6();
                if (m3096J6 != null) {
                    m3096J6.unregisterReceiver(this.f19532B0);
                }
            } catch (IllegalArgumentException unused) {
                this.f19532B0 = null;
            }
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_downloading;
    }

    @Override // p186j3.InterfaceC4986d
    /* renamed from: E3 */
    public void mo18895E3() {
        if (!AbstractC5094k.m20685b(m3096J6())) {
            InterfaceC5642a m18877G9 = m18877G9();
            if (m18877G9 != null) {
                m18877G9.invoke();
            }
            int i10 = R$id.mDefaultView;
            ((DefaultDownloadView) m18897K9(i10)).setVisibility(0);
            ((Group) m18897K9(R$id.mGroupContent)).setVisibility(8);
            ((DefaultDownloadView) m18897K9(i10)).m7606g();
        }
    }

    @Override // p186j3.InterfaceC4986d
    /* renamed from: G */
    public void mo18896G() {
        InterfaceC5642a m18877G9 = m18877G9();
        if (m18877G9 != null) {
            m18877G9.invoke();
        }
        int i10 = R$id.mDefaultView;
        ((DefaultDownloadView) m18897K9(i10)).setVisibility(0);
        ((Group) m18897K9(R$id.mGroupContent)).setVisibility(8);
        ((DefaultDownloadView) m18897K9(i10)).m7605f();
    }

    @Override // p154h3.AbstractC4512a
    /* renamed from: H9 */
    protected boolean mo18878H9() {
        Button button;
        View focusedChild = ((VerticalGridView) m18897K9(R$id.mVgView)).getFocusedChild();
        if (focusedChild == null || (button = (Button) focusedChild.findViewById(R$id.mBtDownload)) == null || !button.hasFocus()) {
            return false;
        }
        return true;
    }

    /* renamed from: K9 */
    public View m18897K9(int i10) {
        View findViewById;
        Map map = this.f19534D0;
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
    /* renamed from: M9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4985c mo5465y9() {
        return new C5351b(this, this);
    }

    /* renamed from: Q9 */
    public void m18899Q9() {
        ((InterfaceC4985c) m5478w9()).mo20344j();
    }

    @Override // p154h3.AbstractC4512a, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        m18894P9();
        m18891L9().m17282e();
        mo5459m9();
    }

    @Override // p186j3.InterfaceC4986d
    /* renamed from: V2 */
    public void mo18900V2(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "task");
        ((DefaultDownloadView) m18897K9(R$id.mDefaultView)).setVisibility(8);
        ((Group) m18897K9(R$id.mGroupContent)).setVisibility(0);
        m18891L9().m17285i(arrayList);
    }

    @Override // p186j3.InterfaceC4986d
    /* renamed from: X */
    public void mo18901X() {
        InterfaceC5642a m18877G9 = m18877G9();
        if (m18877G9 != null) {
            m18877G9.invoke();
        }
        int i10 = R$id.mDefaultView;
        ((DefaultDownloadView) m18897K9(i10)).setVisibility(0);
        ((Group) m18897K9(R$id.mGroupContent)).setVisibility(8);
        ((DefaultDownloadView) m18897K9(i10)).m7604e();
        ((DefaultDownloadView) m18897K9(i10)).post(new Runnable() { // from class: h3.c
            @Override // java.lang.Runnable
            public final void run() {
                C4515d.m18893O9(C4515d.this);
            }
        });
    }

    @Override // ua.C7069a.a
    /* renamed from: e5 */
    public void mo16596e5(int i10) {
    }

    @Override // p186j3.InterfaceC4986d
    /* renamed from: g */
    public void mo18902g(boolean z10) {
        int i10 = 0;
        LoadingView loadingView = (LoadingView) m18897K9(R$id.mLoading);
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
        this.f19534D0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        int m27735E;
        String substring = null;
        m18892N9();
        TextView textView = (TextView) m18897K9(R$id.mTvNote1);
        C7615w c7615w = C7615w.f27995a;
        if (c7615w.m29309O()) {
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = m3172j7(R$string.download_note_1);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.download_note_1)");
            substring = String.format(m3172j7, Arrays.copyOf(new Object[]{C5913i.m23913b(c7615w.m29318y())}, 1));
            AbstractC5868k.m23673e(substring, "format(format, *args)");
        } else {
            String m3172j72 = m3172j7(R$string.download_note_1);
            AbstractC5868k.m23673e(m3172j72, "configView$lambda$0");
            m27735E = AbstractC7167u.m27735E(m3172j72, ",", 0, false, 6, null);
            substring = m3172j72.substring(0, m27735E);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        textView.setText(substring);
        C0817d c0817d = new C0817d(m3096J6(), 1);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        c0817d.m4170f(new ColorDrawable(m3096J6.getResources().getColor(R$color.color_0fc4c4c4)));
        int i10 = R$id.mVgView;
        ((VerticalGridView) m18897K9(i10)).addItemDecoration(c0817d);
        m18891L9().setHasStableIds(true);
        m18891L9().m17283f(new a());
        ((VerticalGridView) m18897K9(i10)).setAdapter(m18891L9());
    }

    @Override // ua.C7069a.a
    /* renamed from: o1 */
    public void mo16601o1(NetworkInfo networkInfo) {
        ((InterfaceC4985c) m5478w9()).mo20343h();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        ((InterfaceC4985c) m5478w9()).mo20343h();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f19531A0;
    }
}
