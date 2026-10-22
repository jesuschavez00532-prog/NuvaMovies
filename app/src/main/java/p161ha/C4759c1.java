package p161ha;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.titans.entity.CdnType;
import ga.C4417e;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import ne.C5881x;
import p201k2.AbstractC5085b;
import p430z9.C7767e;

/* renamed from: ha.c1 */
/* loaded from: classes2.dex */
public final class C4759c1 extends C7767e {

    /* renamed from: F0 */
    public Map f20113F0 = new LinkedHashMap();

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20113F0.clear();
    }

    /* renamed from: H9 */
    public View m19686H9(int i10) {
        View findViewById;
        Map map = this.f20113F0;
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
        return layoutInflater.inflate(R$layout.dialog_user_token_invalid, viewGroup, false);
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        String m6878m;
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC5868k.m23669a(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PEERSTAR)) {
            m6878m = c1466m0.m6888w();
        } else {
            m6878m = c1466m0.m6878m();
        }
        TextView textView = (TextView) m19686H9(R$id.mTextAccount);
        C5881x c5881x = C5881x.f23415a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String string = m3096J6.getString(R$string.error_dialog_account);
        AbstractC5868k.m23673e(string, "context!!.getString(R.string.error_dialog_account)");
        String format = String.format(string, Arrays.copyOf(new Object[]{m6878m}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(format);
        TextView textView2 = (TextView) m19686H9(R$id.mTextVersion);
        Context m3096J62 = m3096J6();
        AbstractC5868k.m23671c(m3096J62);
        String string2 = m3096J62.getString(R$string.error_dialog_version);
        AbstractC5868k.m23673e(string2, "context!!.getString(R.string.error_dialog_version)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{AbstractC5085b.m20603m(m3096J6())}, 1));
        AbstractC5868k.m23673e(format2, "format(format, *args)");
        textView2.setText(format2);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        mo3278o9();
        C4417e c4417e = C4417e.f19115a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m20598h = AbstractC5085b.m20598h(m3096J6());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, m3096J6, m20598h, false, false, 12, null);
    }
}
