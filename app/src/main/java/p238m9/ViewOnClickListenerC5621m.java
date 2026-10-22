package p238m9;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$style;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p217l2.InterfaceC5342c;
import p400xa.C7554b;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: m9.m */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5621m extends C7767e implements View.OnClickListener, View.OnFocusChangeListener {

    /* renamed from: F0 */
    private View f22667F0;

    /* renamed from: H0 */
    public Map f22669H0 = new LinkedHashMap();

    /* renamed from: G0 */
    private final C7554b f22668G0 = new C7554b();

    /* renamed from: m9.m$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f22670a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final void m22823a() {
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22823a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: I9 */
    private final void m22821I9() {
        int i10 = R$id.mLLEmail;
        ((AutoLinearLayout) m22822H9(i10)).setOnClickListener(this);
        ((AutoLinearLayout) m22822H9(i10)).setOnFocusChangeListener(this);
        int i11 = R$id.mLLPhone;
        ((AutoLinearLayout) m22822H9(i11)).setOnClickListener(this);
        ((AutoLinearLayout) m22822H9(i11)).setOnFocusChangeListener(this);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f22669H0.clear();
    }

    /* renamed from: H9 */
    public View m22822H9(int i10) {
        View findViewById;
        Map map = this.f22669H0;
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

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_select_bind_method, viewGroup, false);
        this.f22667F0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(700));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m22821I9();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mLLEmail;
        if (num != null && num.intValue() == i10) {
            InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c != null) {
                AbstractC0729o m3136X6 = m3136X6();
                AbstractC5868k.m23673e(m3136X6, "parentFragmentManager");
                InterfaceC5342c.a.m21626a(interfaceC5342c, m3136X6, a.f22670a, false, 4, null);
            }
            mo3279p9();
            return;
        }
        int i11 = R$id.mLLPhone;
        if (num != null && num.intValue() == i11) {
            InterfaceC5342c interfaceC5342c2 = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c2 != null) {
                AbstractC0729o m3136X62 = m3136X6();
                AbstractC5868k.m23673e(m3136X62, "parentFragmentManager");
                InterfaceC5342c.a.m21627b(interfaceC5342c2, m3136X62, false, null, 6, null);
            }
            mo3279p9();
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        AbstractC5868k.m23674f(view, "v");
        if (z10) {
            this.f22668G0.m28943c(view, 1.1f);
        } else {
            this.f22668G0.m28945f(view, 1.1f);
        }
    }
}
