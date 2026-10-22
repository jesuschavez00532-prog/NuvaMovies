package p101da;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p101da.ViewOnClickListenerC4019e;
import p117ea.C4160d;
import p433zd.AbstractC7786b;

/* renamed from: da.a */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4015a extends DialogInterfaceOnCancelListenerC0710d implements View.OnClickListener {

    /* renamed from: D0 */
    private ViewOnClickListenerC4019e.a f17794D0;

    /* renamed from: E0 */
    private DialogInterface.OnDismissListener f17795E0;

    /* renamed from: F0 */
    public Map f17796F0 = new LinkedHashMap();

    /* renamed from: C0 */
    private final String f17793C0 = "AttentionDialog";

    /* renamed from: F9 */
    public void m16962F9() {
        this.f17796F0.clear();
    }

    /* renamed from: G9 */
    public View m16963G9(int i10) {
        View findViewById;
        Map map = this.f17796F0;
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

    /* renamed from: H9 */
    public final void m16964H9() {
        ((Button) m16963G9(R$id.mButtonCancel)).setOnClickListener(this);
        ((Button) m16963G9(R$id.mButtonConfirm)).setOnClickListener(this);
    }

    /* renamed from: I9 */
    public final void m16965I9(DialogInterface.OnDismissListener onDismissListener) {
        AbstractC5868k.m23674f(onDismissListener, "onDismissListener");
        this.f17795E0 = onDismissListener;
    }

    /* renamed from: J9 */
    public final void m16966J9(ViewOnClickListenerC4019e.a aVar) {
        AbstractC5868k.m23674f(aVar, "passwordCallback");
        this.f17794D0 = aVar;
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
        return layoutInflater.inflate(R$layout.dialog_attention, viewGroup, true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        m16962F9();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public void mo3170i8() {
        Window window;
        super.mo3170i8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            window = m3280r9.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = AbstractC7786b.m30166j(820);
            int m30163g = AbstractC7786b.m30163g(480);
            attributes.height = m30163g;
            window.setLayout(attributes.width, m30163g);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m16964H9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        ((Button) m16963G9(R$id.mButtonConfirm)).requestFocus();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        ViewOnClickListenerC4019e.a aVar = this.f17794D0;
        if (aVar != null) {
            AbstractC5868k.m23671c(aVar);
            aVar.mo17007b2();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mButtonConfirm) {
            mo3279p9();
            C4160d m17390a = C4160d.f18217d.m17390a();
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23672d(m3096J6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC0729o m3294d4 = ((AbstractActivityC0712e) m3096J6).m3294d4();
            AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
            C4160d.m17381p(m17390a, m3294d4, this.f17794D0, false, false, 12, null);
            return;
        }
        if (id2 == R$id.mButtonCancel) {
            ViewOnClickListenerC4019e.a aVar = this.f17794D0;
            if (aVar != null) {
                AbstractC5868k.m23671c(aVar);
                aVar.mo17007b2();
            }
            mo3279p9();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f17795E0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
