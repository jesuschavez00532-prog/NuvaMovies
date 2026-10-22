package md;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.fragment.app.AbstractC0729o;
import com.lzy.okgo.model.Progress;
import com.module.p069db.UmengPush;
import com.taobao.accs.common.Constants;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: md.b */
/* loaded from: classes3.dex */
public final class C5639b extends C7767e {

    /* renamed from: G0 */
    private View f22720G0;

    /* renamed from: H0 */
    private UmengPush f22721H0;

    /* renamed from: I0 */
    public Map f22722I0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f22719F0 = C5639b.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K9 */
    public static final void m22878K9(C5639b c5639b, View view) {
        AbstractC5868k.m23674f(c5639b, "this$0");
        c5639b.mo3279p9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f22722I0.clear();
    }

    /* renamed from: I9 */
    public View m22879I9(int i10) {
        View findViewById;
        Map map = this.f22722I0;
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
    public final void m22880J9() {
        ((Button) m22879I9(R$id.mBtnOk)).setOnClickListener(new View.OnClickListener() { // from class: md.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5639b.m22878K9(C5639b.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public final void m22881L9(AbstractC0729o abstractC0729o, String str, UmengPush umengPush) {
        AbstractC5868k.m23674f(abstractC0729o, "manager");
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
        super.mo3277E9(abstractC0729o, str);
        this.f22721H0 = umengPush;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_msg_push, viewGroup, false);
        this.f22720G0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22882W0() {
        /*
            r3 = this;
            com.module.db.UmengPush r0 = r3.f22721H0
            if (r0 == 0) goto L84
            int r0 = com.vod.R$id.mTvTitle
            android.view.View r0 = r3.m22879I9(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.module.db.UmengPush r1 = r3.f22721H0
            if (r1 == 0) goto L15
            java.lang.String r1 = r1.getMessageType()
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L60
            int r2 = r1.hashCode()
            switch(r2) {
                case 49: goto L50;
                case 50: goto L40;
                case 51: goto L30;
                case 52: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L60
        L20:
            java.lang.String r2 = "4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L29
            goto L60
        L29:
            int r1 = com.vod.R$string.event_notification
            java.lang.String r1 = r3.m3172j7(r1)
            goto L66
        L30:
            java.lang.String r2 = "3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L39
            goto L60
        L39:
            int r1 = com.vod.R$string.version_upgrade_str
            java.lang.String r1 = r3.m3172j7(r1)
            goto L66
        L40:
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49
            goto L60
        L49:
            int r1 = com.vod.R$string.account_tips
            java.lang.String r1 = r3.m3172j7(r1)
            goto L66
        L50:
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L59
            goto L60
        L59:
            int r1 = com.vod.R$string.push_program_title
            java.lang.String r1 = r3.m3172j7(r1)
            goto L66
        L60:
            int r1 = com.vod.R$string.account_tips
            java.lang.String r1 = r3.m3172j7(r1)
        L66:
            r0.setText(r1)
            int r0 = com.vod.R$id.mTvContent
            android.view.View r0 = r3.m22879I9(r0)
            com.module.childlock.view.MarqueTextView r0 = (com.module.childlock.view.MarqueTextView) r0
            if (r0 != 0) goto L74
            goto L84
        L74:
            com.module.db.UmengPush r1 = r3.f22721H0
            if (r1 == 0) goto L7f
            java.lang.String r1 = r1.getText()
            if (r1 == 0) goto L7f
            goto L81
        L7f:
            java.lang.String r1 = ""
        L81:
            r0.setText(r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md.C5639b.m22882W0():void");
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
            attributes.width = AbstractC7786b.m30166j(860);
            int m30163g = AbstractC7786b.m30163g(540);
            attributes.height = m30163g;
            window.setLayout(attributes.width, m30163g);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        m22880J9();
        m22882W0();
    }
}
