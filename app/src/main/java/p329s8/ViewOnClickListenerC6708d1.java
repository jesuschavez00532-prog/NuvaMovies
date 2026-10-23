package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.p069db.UmengPush;
import com.request.result.LoginResult;
import ga.C4417e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5091h;
import p340t8.C6926a;
import p348u2.AbstractC7028e;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: s8.d1 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6708d1 extends C7767e implements View.OnClickListener {

    /* renamed from: G0 */
    private View f25755G0;

    /* renamed from: H0 */
    private UmengPush f25756H0;

    /* renamed from: I0 */
    public Map f25757I0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25754F0 = ViewOnClickListenerC6708d1.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.d1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m26291a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            ViewOnClickListenerC6708d1.this.mo3278o9();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26291a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: I9 */
    private final void m26284I9() {
        mo3278o9();
        AbstractC7028e.m27115a("remote");
        C4417e c4417e = C4417e.f19115a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m20598h = AbstractC5085b.m20598h(m3096J6());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, m3096J6, m20598h, false, false, 12, null);
    }

    /* renamed from: J9 */
    private final String m26285J9(Date date) {
        if (AbstractC5091h.m20663f()) {
            String format = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(date);
            AbstractC5868k.m23673e(format, "{\n            val simple…at.format(date)\n        }");
            return format;
        }
        String format2 = new SimpleDateFormat("MM-dd-yyyy HH:mm").format(date);
        AbstractC5868k.m23673e(format2, "{\n            val simple…at.format(date)\n        }");
        return format2;
    }

    /* renamed from: K9 */
    private final void m26286K9() {
        InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
        if (interfaceC7251a != null) {
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            InterfaceC7251a.a.m28064a(interfaceC7251a, m3119R6, true, null, new a(), 4, null);
        }
    }

    /* renamed from: L9 */
    private final void m26287L9() {
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3093I6 = m3093I6();
        AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
        c6926a.m26908s(m3093I6, false);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25757I0.clear();
    }

    /* renamed from: H9 */
    public View m26288H9(int i10) {
        View findViewById;
        Map map = this.f25757I0;
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

    /* renamed from: M9 */
    public final void m26289M9(UmengPush umengPush) {
        this.f25756H0 = umengPush;
    }

    /* renamed from: N9 */
    public final void m26290N9() {
        String m3172j7 = null;
        String str = null;
        ((TextView) m26288H9(R$id.mTvTime)).setText(m26285J9(new Date()));
        TextView textView = (TextView) m26288H9(R$id.mTvIP);
        UmengPush umengPush = this.f25756H0;
        if (umengPush == null || (m3172j7 = umengPush.getLoginIp()) == null) {
            m3172j7 = m3172j7(R$string.unknown);
        }
        textView.setText(m3172j7);
        TextView textView2 = (TextView) m26288H9(R$id.mTvLocation);
        UmengPush umengPush2 = this.f25756H0;
        String str2 = null;
        if (umengPush2 != null) {
            str = umengPush2.getLoginCity();
        } else {
            str = null;
        }
        if (str == null) {
            str = m3172j7(R$string.unknown);
            AbstractC5868k.m23673e(str, "getString(R.string.unknown)");
        }
        UmengPush umengPush3 = this.f25756H0;
        if (umengPush3 != null) {
            str2 = umengPush3.getLoginCountry();
        }
        if (str2 == null) {
            str2 = m3172j7(R$string.unknown);
            AbstractC5868k.m23673e(str2, "getString(R.string.unknown)");
        }
        textView2.setText(str + ", " + str2);
        ((Button) m26288H9(R$id.mBtnLoginAnother)).setOnClickListener(this);
        ((Button) m26288H9(R$id.mBtnExit)).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_remote_login, viewGroup, false);
        this.f25755G0 = inflate;
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
            window.setLayout(AbstractC7786b.m30166j(1012), AbstractC7786b.m30163g(672));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m26290N9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        m26284I9();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnLoginAnother) {
            m26286K9();
        } else if (id2 == R$id.mBtnExit) {
            m26287L9();
        }
    }
}
