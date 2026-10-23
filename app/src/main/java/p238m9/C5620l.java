package p238m9;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$style;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import p100d9.C3982h;
import p161ha.InterfaceC4786n;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: m9.l */
/* loaded from: classes2.dex */
public final class C5620l extends C7767e {

    /* renamed from: F0 */
    private View f22662F0;

    /* renamed from: G0 */
    private C3982h f22663G0;

    /* renamed from: H0 */
    private InterfaceC4786n f22664H0;

    /* renamed from: I0 */
    public Map f22665I0 = new LinkedHashMap();

    /* renamed from: m9.l$a */
    /* loaded from: classes2.dex */
    public static final class a implements DialogInterface.OnKeyListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            if (i10 != 4) {
                if (i10 == 23) {
                    if (keyEvent != null && keyEvent.getAction() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Dialog m3280r9 = C5620l.this.m3280r9();
                        if (m3280r9 != null && m3280r9.isShowing()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            InterfaceC4786n m22818J9 = C5620l.this.m22818J9();
                            if (m22818J9 != null) {
                                m22818J9.mo11901a();
                            }
                            return true;
                        }
                    }
                }
            } else {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    InterfaceC4786n m22818J92 = C5620l.this.m22818J9();
                    if (m22818J92 != null) {
                        m22818J92.cancel();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: I9 */
    private final void m22815I9() {
        int i10 = R$id.mDialogRv;
        RecyclerView recyclerView = (RecyclerView) m22817H9(i10);
        C3982h c3982h = this.f22663G0;
        if (c3982h == null) {
            AbstractC5868k.m23686r("mCouponAdapter");
            c3982h = null;
        }
        recyclerView.setAdapter(c3982h);
        ((RecyclerView) m22817H9(i10)).setLayoutManager(new LinearLayoutManager(m3096J6(), 1, false));
    }

    /* renamed from: M9 */
    private final void m22816M9() {
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f22665I0.clear();
    }

    /* renamed from: H9 */
    public View m22817H9(int i10) {
        View findViewById;
        Map map = this.f22665I0;
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

    /* renamed from: J9 */
    public final InterfaceC4786n m22818J9() {
        return this.f22664H0;
    }

    /* renamed from: K9 */
    public final void m22819K9(List list) {
        AbstractC5868k.m23674f(list, "data");
        C3982h c3982h = new C3982h();
        this.f22663G0 = c3982h;
        c3982h.m28856n(list);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public final void m22820L9(InterfaceC4786n interfaceC4786n) {
        this.f22664H0 = interfaceC4786n;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_receivable_coupon, viewGroup, false);
        this.f22662F0 = inflate;
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
            window.setLayout(AbstractC7786b.m30166j(931), AbstractC7786b.m30163g(781));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m22816M9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        m22815I9();
        int i10 = R$id.mDialogRv;
        ((RecyclerView) m22817H9(i10)).requestFocus();
        if (((RecyclerView) m22817H9(i10)).getChildAt(0) != null) {
            ((RecyclerView) m22817H9(i10)).getChildAt(0).requestFocus();
        }
        Dialog m3280r92 = m3280r9();
        if (m3280r92 != null) {
            m3280r92.setOnKeyListener(new a());
        }
    }
}
