package p329s8;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import cc.C1441a;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$style;
import com.login.p065ui.activity.ForcePasswordChangeActivity;
import com.module.event.LoginSuccessRequestDataEvent;
import com.request.bean.CloseForceChangePwdPageEvent;
import com.request.result.LoginResult;
import com.taobao.accs.common.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: s8.f1 */
/* loaded from: classes2.dex */
public final class C6714f1 extends C7767e {

    /* renamed from: H0 */
    private View f25766H0;

    /* renamed from: I0 */
    public Map f25767I0 = new LinkedHashMap();

    /* renamed from: F0 */
    private String f25764F0 = "";

    /* renamed from: G0 */
    private final String f25765G0 = C6714f1.class.getSimpleName();

    /* renamed from: s8.f1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f25768a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m26297a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26297a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: J9 */
    private final void m26293J9() {
        ((Button) m26295I9(R$id.mBtnClose)).setOnClickListener(new View.OnClickListener() { // from class: s8.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6714f1.m26294K9(C6714f1.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K9 */
    public static final void m26294K9(C6714f1 c6714f1, View view) {
        AbstractC5868k.m23674f(c6714f1, "this$0");
        c6714f1.mo3279p9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25767I0.clear();
    }

    /* renamed from: I9 */
    public View m26295I9(int i10) {
        View findViewById;
        Map map = this.f25767I0;
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
    public final void m26296L9(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        this.f25764F0 = str;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_reset_password_success, viewGroup, false);
        this.f25766H0 = inflate;
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
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m26293J9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        boolean z10;
        AbstractActivityC0302c abstractActivityC0302c;
        AbstractC0729o m3294d4;
        InterfaceC7251a interfaceC7251a;
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        if (this.f25764F0.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Activity m6706d = C1441a.f5552a.m6706d(ForcePasswordChangeActivity.class);
            if (m6706d instanceof AbstractActivityC0302c) {
                abstractActivityC0302c = (AbstractActivityC0302c) m6706d;
            } else {
                abstractActivityC0302c = null;
            }
            if (abstractActivityC0302c != null && (m3294d4 = abstractActivityC0302c.m3294d4()) != null && (interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0])) != null) {
                interfaceC7251a.mo25622b(m3294d4, false, this.f25764F0, a.f25768a);
            }
        }
        C7709c.m29787d().m29801m(new CloseForceChangePwdPageEvent());
        super.onDismiss(dialogInterface);
    }
}
