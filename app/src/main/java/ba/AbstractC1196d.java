package ba;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC0712e;
import ca.InterfaceC1439a;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p400xa.C7554b;
import p430z9.AbstractC7765c;
import ye.C7709c;

/* renamed from: ba.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1196d<P extends InterfaceC1439a> extends AbstractC7765c {

    /* renamed from: u0 */
    public Activity f4749u0;

    /* renamed from: v0 */
    public InterfaceC1439a f4750v0;

    /* renamed from: w0 */
    private View f4751w0;

    /* renamed from: x0 */
    public Map f4752x0 = new LinkedHashMap();

    /* renamed from: s0 */
    private final String f4747s0 = getClass().getSimpleName();

    /* renamed from: t0 */
    private final C7554b f4748t0 = new C7554b();

    /* renamed from: C9 */
    private final void m5471C9() {
        if (mo5464x9() && !C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29803r(this);
        }
    }

    /* renamed from: A9 */
    public abstract int mo5451A9();

    /* renamed from: B9 */
    public final boolean m5472B9() {
        if (this.f4750v0 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: D9 */
    public final void m5473D9(Activity activity) {
        AbstractC5868k.m23674f(activity, "<set-?>");
        this.f4749u0 = activity;
    }

    /* renamed from: E9 */
    public final void m5474E9(InterfaceC1439a interfaceC1439a) {
        AbstractC5868k.m23674f(interfaceC1439a, "<set-?>");
        this.f4750v0 = interfaceC1439a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F9 */
    public final void m5475F9(View view) {
        this.f4751w0 = view;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: I7 */
    public void mo3094I7(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        super.mo3094I7(context);
        AbstractActivityC0712e m3075C6 = m3075C6();
        AbstractC5868k.m23671c(m3075C6);
        m5473D9(m3075C6);
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        if (this.f4751w0 == null) {
            this.f4751w0 = layoutInflater.inflate(mo5451A9(), viewGroup, false);
        }
        return this.f4751w0;
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        if (mo5464x9() && C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29806v(this);
        }
        if (this.f4750v0 != null) {
            m5478w9().mo6702n2();
        }
        super.mo3118Q7();
    }

    @Override // p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m5471C9();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f4752x0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: o9 */
    public void mo5476o9() {
        if (this.f4750v0 == null) {
            m5474E9(mo5465y9());
        }
        m5478w9().mo6701B0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v9 */
    public final C7554b m5477v9() {
        return this.f4748t0;
    }

    /* renamed from: w9 */
    public final InterfaceC1439a m5478w9() {
        InterfaceC1439a interfaceC1439a = this.f4750v0;
        if (interfaceC1439a != null) {
            return interfaceC1439a;
        }
        AbstractC5868k.m23686r("mPresenter");
        return null;
    }

    /* renamed from: x9 */
    public abstract boolean mo5464x9();

    /* renamed from: y9 */
    public abstract InterfaceC1439a mo5465y9();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z9 */
    public final View m5479z9() {
        return this.f4751w0;
    }
}
