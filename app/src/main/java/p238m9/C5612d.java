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
import ne.AbstractC5882y;
import p100d9.C3980g;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: m9.d */
/* loaded from: classes2.dex */
public final class C5612d extends C7767e {

    /* renamed from: F0 */
    private List f22638F0;

    /* renamed from: G0 */
    private View f22639G0;

    /* renamed from: H0 */
    private C3980g f22640H0;

    /* renamed from: I0 */
    public Map f22641I0;

    /* renamed from: m9.d$a */
    /* loaded from: classes2.dex */
    public static final class a implements DialogInterface.OnKeyListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            boolean z10 = false;
            boolean z11 = false;
            if (i10 == 23) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Dialog m3280r9 = C5612d.this.m3280r9();
                    if (m3280r9 != null && m3280r9.isShowing()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        C5612d.this.mo3278o9();
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public C5612d(List list) {
        AbstractC5868k.m23674f(list, "data");
        this.f22641I0 = new LinkedHashMap();
        this.f22638F0 = list;
    }

    /* renamed from: I9 */
    private final void m22787I9() {
        this.f22640H0 = new C3980g();
        int i10 = R$id.mDialogRv;
        RecyclerView recyclerView = (RecyclerView) m22789H9(i10);
        C3980g c3980g = this.f22640H0;
        C3980g c3980g2 = null;
        if (c3980g == null) {
            AbstractC5868k.m23686r("mCouponAdapter");
            c3980g = null;
        }
        recyclerView.setAdapter(c3980g);
        ((RecyclerView) m22789H9(i10)).setLayoutManager(new LinearLayoutManager(m3096J6(), 1, false));
        C3980g c3980g3 = this.f22640H0;
        if (c3980g3 == null) {
            AbstractC5868k.m23686r("mCouponAdapter");
        } else {
            c3980g2 = c3980g3;
        }
        List list = this.f22638F0;
        AbstractC5868k.m23672d(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.CouponCodeList>");
        c3980g2.m28856n(AbstractC5882y.m23702b(list));
    }

    /* renamed from: J9 */
    private final void m22788J9() {
        m3287z9(true);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f22641I0.clear();
    }

    /* renamed from: H9 */
    public View m22789H9(int i10) {
        View findViewById;
        Map map = this.f22641I0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_received_coupon, viewGroup, false);
        this.f22639G0 = inflate;
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
        m22788J9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        m22787I9();
        int i10 = R$id.mDialogRv;
        ((RecyclerView) m22789H9(i10)).requestFocus();
        if (((RecyclerView) m22789H9(i10)).getChildAt(0) != null) {
            ((RecyclerView) m22789H9(i10)).getChildAt(0).requestFocus();
        }
        Dialog m3280r92 = m3280r9();
        if (m3280r92 != null) {
            m3280r92.setOnKeyListener(new a());
        }
    }
}
