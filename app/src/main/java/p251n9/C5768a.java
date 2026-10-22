package p251n9;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import be.C1328x;
import com.mine.R$id;
import com.mine.R$layout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p160h9.InterfaceC4721a;
import p160h9.InterfaceC4723b;
import p170i2.C4842a;
import p192j9.C5014a;
import p400xa.C7615w;

/* renamed from: n9.a */
/* loaded from: classes2.dex */
public final class C5768a extends AbstractC5774c<InterfaceC4721a> implements InterfaceC4723b {

    /* renamed from: B0 */
    private boolean f23103B0;

    /* renamed from: C0 */
    public Map f23104C0 = new LinkedHashMap();

    /* renamed from: n9.a$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m23236a(String str) {
            TextView textView;
            AbstractC5868k.m23674f(str, "it");
            if (C5768a.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C5768a.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing() && (textView = (TextView) C5768a.this.m23234S9(R$id.tvEmail)) != null) {
                    textView.setText(str);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23236a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.a$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m23237a(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (C5768a.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C5768a.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    AutoLinearLayout autoLinearLayout = (AutoLinearLayout) C5768a.this.m23234S9(R$id.mLlServiceWeb);
                    if (autoLinearLayout != null) {
                        autoLinearLayout.setVisibility(0);
                    }
                    TextView textView = (TextView) C5768a.this.m23234S9(R$id.tvWeb);
                    if (textView != null) {
                        textView.setText(str);
                    }
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23237a((String) obj);
            return C1328x.f4998a;
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_aboutus;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        return false;
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: S9 */
    public View m23234S9(int i10) {
        View findViewById;
        Map map = this.f23104C0;
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
    /* renamed from: T9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4721a mo5465y9() {
        return new C5014a(this, this);
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23104C0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        C7615w.m29301w(C7615w.f27995a, new a(), new b(), null, 4, null);
        if (C4842a.f20329a.m19920a().m19930G()) {
            AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23234S9(R$id.mLlServiceEmail);
            if (autoLinearLayout != null) {
                autoLinearLayout.setVisibility(0);
                return;
            }
            return;
        }
        AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m23234S9(R$id.mLlServiceEmail);
        if (autoLinearLayout2 != null) {
            autoLinearLayout2.setVisibility(8);
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23103B0;
    }
}
