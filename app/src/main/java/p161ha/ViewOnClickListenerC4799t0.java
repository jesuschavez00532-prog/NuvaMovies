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
import com.module.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.t0 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4799t0 extends C7767e implements View.OnClickListener {

    /* renamed from: G0 */
    private View f20224G0;

    /* renamed from: H0 */
    private a f20225H0;

    /* renamed from: L0 */
    private boolean f20229L0;

    /* renamed from: O0 */
    public Map f20232O0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f20223F0 = ViewOnClickListenerC4799t0.class.getSimpleName();

    /* renamed from: I0 */
    private String f20226I0 = "";

    /* renamed from: J0 */
    private String f20227J0 = "";

    /* renamed from: K0 */
    private String f20228K0 = "";

    /* renamed from: M0 */
    private boolean f20230M0 = true;

    /* renamed from: N0 */
    private String f20231N0 = "";

    /* renamed from: ha.t0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0);

        /* renamed from: b */
        void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20232O0.clear();
    }

    /* renamed from: H9 */
    public View m19828H9(int i10) {
        View findViewById;
        Map map = this.f20232O0;
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
    public final void m19829I9(boolean z10) {
        this.f20229L0 = z10;
    }

    /* renamed from: J9 */
    public final void m19830J9(a aVar) {
        AbstractC5868k.m23674f(aVar, "dialogCallback");
        this.f20225H0 = aVar;
    }

    /* renamed from: K9 */
    public final void m19831K9(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "msg");
        AbstractC5868k.m23674f(str2, "firstStr");
        AbstractC5868k.m23674f(str3, "secondStr");
        AbstractC5868k.m23674f(str4, "titleStr");
        this.f20226I0 = str;
        this.f20227J0 = str2;
        this.f20228K0 = str3;
        this.f20231N0 = str4;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public final void m19832L9(boolean z10) {
        this.f20230M0 = z10;
    }

    /* renamed from: M9 */
    public final void m19833M9() {
        int i10;
        if (!TextUtils.isEmpty(this.f20231N0)) {
            ((TextView) m19828H9(R$id.mDialogTitle)).setText(this.f20231N0);
        }
        int i11 = R$id.mBtnFirst;
        Button button = (Button) m19828H9(i11);
        if (this.f20229L0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        button.setVisibility(i10);
        ((TextView) m19828H9(R$id.mDialogContent)).setText(this.f20226I0);
        ((Button) m19828H9(i11)).setText(this.f20227J0);
        int i12 = R$id.mBtnSecond;
        ((Button) m19828H9(i12)).setText(this.f20228K0);
        ((Button) m19828H9(i11)).setOnClickListener(this);
        ((Button) m19828H9(i12)).setOnClickListener(this);
        m3287z9(this.f20230M0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_common_tip_new, viewGroup, false);
        this.f20224G0 = inflate;
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
        m19833M9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        ((Button) m19828H9(R$id.mBtnSecond)).requestFocus();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnFirst) {
            a aVar = this.f20225H0;
            if (aVar != null) {
                aVar.mo11876b(this);
            }
            mo3278o9();
            return;
        }
        if (id2 == R$id.mBtnSecond) {
            a aVar2 = this.f20225H0;
            if (aVar2 != null) {
                aVar2.mo11875a(this);
            }
            mo3278o9();
        }
    }
}
