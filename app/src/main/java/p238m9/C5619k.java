package p238m9;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p433zd.AbstractC7786b;

/* renamed from: m9.k */
/* loaded from: classes2.dex */
public final class C5619k extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: C0 */
    private DialogInterface.OnDismissListener f22660C0;

    /* renamed from: D0 */
    public Map f22661D0 = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J9 */
    public static final void m22810J9(C5619k c5619k, View view) {
        AbstractC5868k.m23674f(c5619k, "this$0");
        c5619k.mo3279p9();
    }

    /* renamed from: G9 */
    public void m22811G9() {
        this.f22661D0.clear();
    }

    /* renamed from: H9 */
    public View m22812H9(int i10) {
        View findViewById;
        Map map = this.f22661D0;
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
    public final void m22813I9() {
        ((TextView) m22812H9(R$id.mTvConfirm)).setOnClickListener(new View.OnClickListener() { // from class: m9.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5619k.m22810J9(C5619k.this, view);
            }
        });
    }

    /* renamed from: K9 */
    public final void m22814K9(DialogInterface.OnDismissListener onDismissListener) {
        AbstractC5868k.m23674f(onDismissListener, "onDismissListener");
        this.f22660C0 = onDismissListener;
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
        return layoutInflater.inflate(R$layout.dialog_prompt_bind, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        m22811G9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(540));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        m22813I9();
        super.mo3176k8(view, bundle);
        ((TextView) m22812H9(R$id.mTvConfirm)).requestFocus();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f22660C0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
