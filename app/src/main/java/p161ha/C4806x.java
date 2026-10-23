package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
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
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import ne.C5881x;
import p201k2.AbstractC5085b;
import p400xa.C7589m1;
import p430z9.C7767e;

/* renamed from: ha.x */
/* loaded from: classes2.dex */
public final class C4806x extends C7767e {

    /* renamed from: G0 */
    private Boolean f20257G0;

    /* renamed from: H0 */
    public Map f20258H0 = new LinkedHashMap();

    /* renamed from: F0 */
    private String f20256F0 = "";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K9 */
    public static final boolean m19859K9(C4806x c4806x, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c4806x, "this$0");
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 4) {
                c4806x.mo3279p9();
                return true;
            }
            c4806x.mo3279p9();
        }
        return false;
    }

    /* renamed from: M9 */
    private final void m19860M9() {
        Context m3096J6;
        String string = null;
        String str = null;
        Context m3096J62;
        Boolean bool = this.f20257G0;
        if (bool != null) {
            AbstractC5868k.m23671c(bool);
            String str2 = "";
            if (!bool.booleanValue() ? !((m3096J6 = m3096J6()) == null || (string = m3096J6.getString(R$string.vod_menu_player_1)) == null) : !((m3096J62 = m3096J6()) == null || (string = m3096J62.getString(R$string.vod_menu_player_2)) == null)) {
                str2 = string;
            }
            ((TextView) m19861I9(R$id.mTvPlayer)).setText('(' + str2 + ')');
            Boolean bool2 = this.f20257G0;
            AbstractC5868k.m23671c(bool2);
            if (bool2.booleanValue()) {
                str = "Player 2";
            } else {
                str = "Player 1";
            }
            C7589m1.f27886a.m29137f(str);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20258H0.clear();
    }

    /* renamed from: I9 */
    public View m19861I9(int i10) {
        View findViewById;
        Map map = this.f20258H0;
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
    public final void m19862J9(Boolean bool) {
        this.f20257G0 = bool;
        Dialog m3280r9 = m3280r9();
        boolean z10 = false;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (z10) {
            m19860M9();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public final void m19863L9(String str) {
        AbstractC5868k.m23674f(str, "msg");
        this.f20256F0 = str;
        Dialog m3280r9 = m3280r9();
        boolean z10 = false;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (z10) {
            ((TextView) m19861I9(R$id.mTextError)).setText(this.f20256F0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_error_msg, viewGroup, false);
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
        String m6878m = null;
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC5868k.m23669a(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PEERSTAR)) {
            m6878m = c1466m0.m6888w();
        } else {
            m6878m = c1466m0.m6878m();
        }
        TextView textView = (TextView) m19861I9(R$id.mTextAccount);
        C5881x c5881x = C5881x.f23415a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String string = m3096J6.getString(R$string.error_dialog_account);
        AbstractC5868k.m23673e(string, "context!!.getString(R.string.error_dialog_account)");
        String format = String.format(string, Arrays.copyOf(new Object[]{m6878m}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(format);
        TextView textView2 = (TextView) m19861I9(R$id.mTextVersion);
        Context m3096J62 = m3096J6();
        AbstractC5868k.m23671c(m3096J62);
        String string2 = m3096J62.getString(R$string.error_dialog_version);
        AbstractC5868k.m23673e(string2, "context!!.getString(R.string.error_dialog_version)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{AbstractC5085b.m20603m(m3096J6())}, 1));
        AbstractC5868k.m23673e(format2, "format(format, *args)");
        textView2.setText(format2);
        ((TextView) m19861I9(R$id.mTextError)).setText(this.f20256F0);
        m19860M9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.setCancelable(true);
        }
        Dialog m3280r92 = m3280r9();
        if (m3280r92 != null) {
            m3280r92.setCanceledOnTouchOutside(true);
        }
        Dialog m3280r93 = m3280r9();
        if (m3280r93 != null) {
            m3280r93.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: ha.w
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    boolean m19859K9;
                    m19859K9 = C4806x.m19859K9(C4806x.this, dialogInterface, i10, keyEvent);
                    return m19859K9;
                }
            });
        }
    }
}
