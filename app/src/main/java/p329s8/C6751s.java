package p329s8;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.request.result.UserInfo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.C5881x;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: s8.s */
/* loaded from: classes2.dex */
public final class C6751s extends C7767e {

    /* renamed from: G0 */
    private View f25974G0;

    /* renamed from: I0 */
    private InterfaceC5642a f25976I0;

    /* renamed from: J0 */
    public Map f25977J0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25973F0 = C6751s.class.getSimpleName();

    /* renamed from: H0 */
    private String f25975H0 = "";

    /* renamed from: J9 */
    private final void m26535J9() {
        ((Button) m26538I9(R$id.mBtnClose)).setOnClickListener(new View.OnClickListener() { // from class: s8.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6751s.m26536K9(C6751s.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K9 */
    public static final void m26536K9(C6751s c6751s, View view) {
        AbstractC5868k.m23674f(c6751s, "this$0");
        c6751s.mo3278o9();
    }

    /* renamed from: W0 */
    private final void m26537W0() {
        String str;
        TextView textView = (TextView) m26538I9(R$id.mTextSuccess);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.phone_binding_success);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_binding_success)");
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{this.f25975H0}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
        TextView textView2 = (TextView) m26538I9(R$id.mTextAccount);
        String m3172j72 = m3172j7(R$string.phone_binding_account);
        AbstractC5868k.m23673e(m3172j72, "getString(R.string.phone_binding_account)");
        Object[] objArr = new Object[1];
        UserInfo m6887v = C1466m0.f5627a.m6887v();
        if (m6887v != null) {
            str = m6887v.getUserId();
        } else {
            str = null;
        }
        objArr[0] = str;
        String format2 = String.format(m3172j72, Arrays.copyOf(objArr, 1));
        AbstractC5868k.m23673e(format2, "format(format, *args)");
        textView2.setText(Html.fromHtml(format2));
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25977J0.clear();
    }

    /* renamed from: I9 */
    public View m26538I9(int i10) {
        View findViewById;
        Map map = this.f25977J0;
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

    /* renamed from: L9 */
    public final void m26539L9(InterfaceC5642a interfaceC5642a) {
        this.f25976I0 = interfaceC5642a;
    }

    /* renamed from: M9 */
    public final void m26540M9(String str) {
        AbstractC5868k.m23674f(str, "mobile");
        this.f25975H0 = str;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_bind_phone_success, viewGroup, false);
        this.f25974G0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        InterfaceC5642a interfaceC5642a = this.f25976I0;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
        mo16979F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(640));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m26535J9();
        m26537W0();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
    }
}
