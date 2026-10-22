package p238m9;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$style;
import com.module.event.AccountLogoutEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: m9.c */
/* loaded from: classes2.dex */
public final class C5611c extends C7767e {

    /* renamed from: F0 */
    private View f22636F0;

    /* renamed from: G0 */
    public Map f22637G0 = new LinkedHashMap();

    /* renamed from: K9 */
    private final void m22783K9() {
        ((Button) m22786J9(R$id.mBtnConfirm)).setOnClickListener(new View.OnClickListener() { // from class: m9.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5611c.m22784L9(C5611c.this, view);
            }
        });
        ((Button) m22786J9(R$id.mBtnCancel)).setOnClickListener(new View.OnClickListener() { // from class: m9.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5611c.m22785M9(C5611c.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L9 */
    public static final void m22784L9(C5611c c5611c, View view) {
        AbstractC5868k.m23674f(c5611c, "this$0");
        c5611c.mo3278o9();
        C7709c.m29787d().m29801m(new AccountLogoutEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public static final void m22785M9(C5611c c5611c, View view) {
        AbstractC5868k.m23674f(c5611c, "this$0");
        c5611c.mo3278o9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f22637G0.clear();
    }

    /* renamed from: J9 */
    public View m22786J9(int i10) {
        View findViewById;
        Map map = this.f22637G0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_logout_tip, viewGroup, false);
        this.f22636F0 = inflate;
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
            window.setLayout(AbstractC7786b.m30166j(865), AbstractC7786b.m30163g(541));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m22783K9();
    }
}
