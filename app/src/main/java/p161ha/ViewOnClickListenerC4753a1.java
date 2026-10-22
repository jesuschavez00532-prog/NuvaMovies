package p161ha;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import com.module.event.EnterHomeAct;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: ha.a1 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4753a1 extends C7767e implements View.OnClickListener {

    /* renamed from: F0 */
    private View f20091F0;

    /* renamed from: G0 */
    public Map f20092G0 = new LinkedHashMap();

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20092G0.clear();
    }

    /* renamed from: H9 */
    public View m19647H9(int i10) {
        View findViewById;
        Map map = this.f20092G0;
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

    /* renamed from: I9 */
    public final void m19648I9() {
        ((Button) m19647H9(R$id.mBtnReverseCancel)).setOnClickListener(this);
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
        View inflate = layoutInflater.inflate(R$layout.dialog_reverse_tool, viewGroup, false);
        this.f20091F0 = inflate;
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
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(580));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        m19648I9();
        super.mo3176k8(view, bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        mo3278o9();
        C7709c.m29787d().m29801m(new EnterHomeAct());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        if (view.getId() == R$id.mBtnReverseCancel) {
            mo3278o9();
            C7709c.m29787d().m29801m(new EnterHomeAct());
        }
    }
}
