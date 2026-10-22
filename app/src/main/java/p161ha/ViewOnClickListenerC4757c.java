package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import ga.C4417e;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p201k2.AbstractC5085b;
import p348u2.AbstractC7028e;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.c */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4757c extends C7767e implements View.OnClickListener {

    /* renamed from: G0 */
    private View f20098G0;

    /* renamed from: H0 */
    private a f20099H0;

    /* renamed from: I0 */
    public Map f20100I0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f20097F0 = ViewOnClickListenerC4757c.class.getSimpleName();

    /* renamed from: ha.c$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: t */
        void mo11907t();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20100I0.clear();
    }

    /* renamed from: H9 */
    public View m19654H9(int i10) {
        View findViewById;
        Map map = this.f20100I0;
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
    public final void m19655I9(a aVar) {
        AbstractC5868k.m23674f(aVar, "dialogCallback");
        this.f20099H0 = aVar;
    }

    /* renamed from: J9 */
    public final void m19656J9() {
        ((Button) m19654H9(R$id.mBtnLogin)).setOnClickListener(this);
        ((Button) m19654H9(R$id.mBtnExit)).setOnClickListener(this);
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
        View inflate = layoutInflater.inflate(R$layout.dialog_blacklist_tip, viewGroup, false);
        this.f20098G0 = inflate;
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
            window.setLayout(AbstractC7786b.m30166j(892), AbstractC7786b.m30163g(520));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m19656J9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (!TextUtils.isEmpty(c1466m0.m6888w())) {
            ((TextView) m19654H9(R$id.mContentText)).setText(m3172j7(R$string.account_blacklist) + "\n(ID: " + c1466m0.m6888w() + ')');
        }
        ((Button) m19654H9(R$id.mBtnLogin)).requestFocus();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        mo3278o9();
        AbstractC7028e.m27115a("bd");
        C4417e c4417e = C4417e.f19115a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m20598h = AbstractC5085b.m20598h(m3096J6());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, m3096J6, m20598h, false, false, 12, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnLogin) {
            a aVar = this.f20099H0;
            if (aVar != null) {
                aVar.mo11907t();
            }
            mo3278o9();
            return;
        }
        if (id2 == R$id.mBtnExit) {
            mo3278o9();
            AbstractC7028e.m27115a("bd");
            C4417e c4417e = C4417e.f19115a;
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            String m20598h = AbstractC5085b.m20598h(m3096J6());
            AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
            C4417e.m18497f(c4417e, m3096J6, m20598h, false, false, 12, null);
        }
    }
}
