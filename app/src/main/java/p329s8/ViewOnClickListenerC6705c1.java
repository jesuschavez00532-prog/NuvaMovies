package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$style;
import ga.C4417e;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import p201k2.AbstractC5085b;
import p348u2.AbstractC7028e;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: s8.c1 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6705c1 extends C7767e implements View.OnClickListener {

    /* renamed from: G0 */
    private View f25749G0;

    /* renamed from: H0 */
    private InterfaceC5642a f25750H0;

    /* renamed from: I0 */
    public Map f25751I0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25748F0 = ViewOnClickListenerC6705c1.class.getSimpleName();

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25751I0.clear();
    }

    /* renamed from: H9 */
    public View m26281H9(int i10) {
        View findViewById;
        Map map = this.f25751I0;
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
    public final void m26282I9(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "dialogCallback");
        this.f25750H0 = interfaceC5642a;
    }

    /* renamed from: J9 */
    public final void m26283J9() {
        ((Button) m26281H9(R$id.mBtnReLogin)).setOnClickListener(this);
        ((Button) m26281H9(R$id.mBtnExit)).setOnClickListener(this);
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
        View inflate = layoutInflater.inflate(R$layout.dialog_relogin_tip, viewGroup, false);
        this.f25749G0 = inflate;
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
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(520));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        m26283J9();
        super.mo3176k8(view, bundle);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnReLogin) {
            InterfaceC5642a interfaceC5642a = this.f25750H0;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
            mo3278o9();
            return;
        }
        if (id2 == R$id.mBtnExit) {
            mo3278o9();
            AbstractC7028e.m27115a("rlogin");
            C4417e c4417e = C4417e.f19115a;
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            String m20598h = AbstractC5085b.m20598h(m3096J6());
            AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
            C4417e.m18497f(c4417e, m3096J6, m20598h, false, false, 12, null);
        }
    }
}
