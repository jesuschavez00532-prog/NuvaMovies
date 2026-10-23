package p161ha;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.i */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4775i extends C7767e implements View.OnClickListener {

    /* renamed from: G0 */
    private View f20159G0;

    /* renamed from: H0 */
    private a f20160H0;

    /* renamed from: L0 */
    private boolean f20164L0;

    /* renamed from: O0 */
    public Map f20167O0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f20158F0 = ViewOnClickListenerC4775i.class.getSimpleName();

    /* renamed from: I0 */
    private String f20161I0 = "";

    /* renamed from: J0 */
    private String f20162J0 = "";

    /* renamed from: K0 */
    private String f20163K0 = "";

    /* renamed from: M0 */
    private boolean f20165M0 = true;

    /* renamed from: N0 */
    private String f20166N0 = "";

    /* renamed from: ha.i$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo11879a(ViewOnClickListenerC4775i viewOnClickListenerC4775i);

        /* renamed from: b */
        void mo11880b(ViewOnClickListenerC4775i viewOnClickListenerC4775i);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20167O0.clear();
    }

    /* renamed from: H9 */
    public View m19761H9(int i10) {
        View findViewById;
        Map map = this.f20167O0;
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
    public final void m19762I9(boolean z10) {
        this.f20164L0 = z10;
    }

    /* renamed from: J9 */
    public final void m19763J9(a aVar) {
        AbstractC5868k.m23674f(aVar, "dialogCallback");
        this.f20160H0 = aVar;
    }

    /* renamed from: K9 */
    public final void m19764K9(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "msg");
        AbstractC5868k.m23674f(str2, "firstStr");
        AbstractC5868k.m23674f(str3, "secondStr");
        AbstractC5868k.m23674f(str4, "titleStr");
        this.f20161I0 = str;
        this.f20162J0 = str2;
        this.f20163K0 = str3;
        this.f20166N0 = str4;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public final void m19765L9(boolean z10) {
        this.f20165M0 = z10;
    }

    /* renamed from: M9 */
    public final void m19766M9() {
        int i10 = 0;
        if (!TextUtils.isEmpty(this.f20166N0)) {
            ((TextView) m19761H9(R$id.mDialogTitle)).setText(this.f20166N0);
        }
        int i11 = R$id.mBtnFirst;
        Button button = (Button) m19761H9(i11);
        if (this.f20164L0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        button.setVisibility(i10);
        ((TextView) m19761H9(R$id.mDialogContent)).setText(this.f20161I0);
        ((Button) m19761H9(i11)).setText(this.f20162J0);
        int i12 = R$id.mBtnSecond;
        ((Button) m19761H9(i12)).setText(this.f20163K0);
        ((Button) m19761H9(i11)).setOnClickListener(this);
        ((Button) m19761H9(i12)).setOnClickListener(this);
        ((AutoRelativeLayout) m19761H9(R$id.mLayoutBind)).setOnClickListener(this);
        ((AutoRelativeLayout) m19761H9(R$id.mLayoutLogin)).setOnClickListener(this);
        m3287z9(this.f20165M0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_common_tip, viewGroup, false);
        this.f20159G0 = inflate;
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
        m19766M9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        if (this.f20164L0) {
            ((Button) m19761H9(R$id.mBtnSecond)).requestFocus();
        } else {
            ((Button) m19761H9(R$id.mBtnFirst)).requestFocus();
        }
        if (AbstractC5868k.m23669a(this.f20162J0, m3172j7(R$string.account_binding)) && AbstractC5868k.m23669a(this.f20163K0, m3172j7(R$string.account_login))) {
            ((AutoLinearLayout) m19761H9(R$id.mLayoutCommon)).setVisibility(8);
            ((AutoLinearLayout) m19761H9(R$id.mLayoutBindOrLogin)).setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z10 = false;
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        boolean z11 = false;
        if (id2 == R$id.mBtnFirst || id2 == R$id.mLayoutBind) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a aVar = this.f20160H0;
            if (aVar != null) {
                aVar.mo11880b(this);
            }
            mo3278o9();
            return;
        }
        if (id2 == R$id.mBtnSecond || id2 == R$id.mLayoutLogin) {
            z11 = true;
        }
        if (z11) {
            a aVar2 = this.f20160H0;
            if (aVar2 != null) {
                aVar2.mo11879a(this);
            }
            mo3278o9();
        }
    }
}
