package td;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: td.d */
/* loaded from: classes3.dex */
public final class C6936d extends C7767e {

    /* renamed from: F0 */
    private final AbstractC7527b f26283F0;

    /* renamed from: G0 */
    private View f26284G0;

    /* renamed from: H0 */
    public Map f26285H0;

    public C6936d(AbstractC7527b abstractC7527b) {
        AbstractC5868k.m23674f(abstractC7527b, "mAdapter");
        this.f26285H0 = new LinkedHashMap();
        this.f26283F0 = abstractC7527b;
    }

    /* renamed from: J9 */
    private final void m26940J9() {
        int i10 = R$id.rvQuality;
        ((RecyclerView) m26942I9(i10)).setLayoutManager(new LinearLayoutManager(m3096J6(), 0, false));
        ((RecyclerView) m26942I9(i10)).setAdapter(this.f26283F0);
        ((Button) m26942I9(R$id.mBtnExit)).setOnClickListener(new View.OnClickListener() { // from class: td.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6936d.m26941K9(C6936d.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K9 */
    public static final void m26941K9(C6936d c6936d, View view) {
        AbstractC5868k.m23674f(c6936d, "this$0");
        c6936d.mo3278o9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f26285H0.clear();
    }

    /* renamed from: I9 */
    public View m26942I9(int i10) {
        View findViewById;
        Map map = this.f26285H0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_select_quality, viewGroup, false);
        this.f26284G0 = inflate;
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
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(551));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m26940J9();
    }
}
