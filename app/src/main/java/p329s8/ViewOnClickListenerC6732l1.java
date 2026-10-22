package p329s8;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0729o;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.module.view.DialogBottomBar;
import com.request.result.UserInfo;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p340t8.C6926a;
import p400xa.C7554b;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: s8.l1 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6732l1 extends C7767e implements View.OnClickListener, View.OnFocusChangeListener {

    /* renamed from: F0 */
    private View f25875F0;

    /* renamed from: I0 */
    public Map f25878I0 = new LinkedHashMap();

    /* renamed from: G0 */
    private final C7554b f25876G0 = new C7554b();

    /* renamed from: H0 */
    private boolean f25877H0 = true;

    /* renamed from: J9 */
    private final void m26426J9() {
        int i10 = R$id.mLLEmail;
        ((AutoLinearLayout) m26428H9(i10)).setOnClickListener(this);
        ((AutoLinearLayout) m26428H9(i10)).setOnFocusChangeListener(this);
        int i11 = R$id.mLLPhone;
        ((AutoLinearLayout) m26428H9(i11)).setOnClickListener(this);
        ((AutoLinearLayout) m26428H9(i11)).setOnFocusChangeListener(this);
    }

    /* renamed from: K9 */
    private final void m26427K9(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26428H9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25878I0.clear();
    }

    /* renamed from: H9 */
    public View m26428H9(int i10) {
        View findViewById;
        Map map = this.f25878I0;
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
    public final void m26429I9(boolean z10) {
        this.f25877H0 = z10;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_select_retrieve_method, viewGroup, false);
        this.f25875F0 = inflate;
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
        m26426J9();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mLLEmail;
        if (num != null && num.intValue() == i10) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                str = m6887v.getBindMail();
            }
            if (!AbstractC5868k.m23669a(str, "1") && this.f25877H0) {
                String m3172j7 = m3172j7(R$string.retrieve_not_bind_email);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.retrieve_not_bind_email)");
                m26427K9(m3172j7, false);
                return;
            } else {
                C6926a c6926a = C6926a.f26260a;
                AbstractC0729o m3119R6 = m3119R6();
                AbstractC5868k.m23671c(m3119R6);
                c6926a.m26907r(m3119R6, this.f25877H0);
                mo3278o9();
                return;
            }
        }
        int i11 = R$id.mLLPhone;
        if (num != null && num.intValue() == i11) {
            UserInfo m6887v2 = C1466m0.f5627a.m6887v();
            if (m6887v2 != null) {
                str = m6887v2.getBindMobile();
            }
            if (!AbstractC5868k.m23669a(str, "1") && this.f25877H0) {
                String m3172j72 = m3172j7(R$string.retrieve_not_bind_phone);
                AbstractC5868k.m23673e(m3172j72, "getString(R.string.retrieve_not_bind_phone)");
                m26427K9(m3172j72, false);
            } else {
                C6926a c6926a2 = C6926a.f26260a;
                AbstractC0729o m3119R62 = m3119R6();
                AbstractC5868k.m23671c(m3119R62);
                c6926a2.m26904n(m3119R62, this.f25877H0);
                mo3278o9();
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        AbstractC5868k.m23674f(view, "v");
        if (z10) {
            this.f25876G0.m28943c(view, 1.1f);
        } else {
            this.f25876G0.m28945f(view, 1.1f);
        }
    }
}
