package p207k8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p430z9.C7767e;

/* renamed from: k8.a */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5133a extends C7767e implements View.OnClickListener {

    /* renamed from: H0 */
    public static final a f21069H0 = new a(null);

    /* renamed from: F0 */
    private InterfaceC5660l f21070F0;

    /* renamed from: G0 */
    public Map f21071G0 = new LinkedHashMap();

    /* renamed from: k8.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f21071G0.clear();
    }

    /* renamed from: H9 */
    public View m20764H9(int i10) {
        View findViewById;
        Map map = this.f21071G0;
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
    public final void m20765I9(InterfaceC5660l interfaceC5660l) {
        this.f21070F0 = interfaceC5660l;
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
        return layoutInflater.inflate(R$layout.dialog_live_menu, viewGroup, false);
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
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        ((TextView) m20764H9(R$id.tvFav)).setOnClickListener(this);
        ((TextView) m20764H9(R$id.tvSort)).setOnClickListener(this);
        ((TextView) m20764H9(R$id.tvPrev)).setOnClickListener(this);
        ((TextView) m20764H9(R$id.tvBlock)).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10 = 0;
        AbstractC5868k.m23674f(view, "v");
        mo3278o9();
        if (AbstractC5868k.m23669a(view, (TextView) m20764H9(R$id.tvFav))) {
            i10 = 1;
        } else if (AbstractC5868k.m23669a(view, (TextView) m20764H9(R$id.tvSort))) {
            i10 = 2;
        } else if (AbstractC5868k.m23669a(view, (TextView) m20764H9(R$id.tvPrev))) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        InterfaceC5660l interfaceC5660l = this.f21070F0;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(i10));
        }
    }
}
