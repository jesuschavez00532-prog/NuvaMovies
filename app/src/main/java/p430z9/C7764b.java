package p430z9;

import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.AbstractC0738x;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p400xa.C7571g1;

/* renamed from: z9.b */
/* loaded from: classes2.dex */
public class C7764b extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: C0 */
    public Map f28620C0 = new LinkedHashMap();

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: E9 */
    public void mo3277E9(AbstractC0729o abstractC0729o, String str) {
        AbstractC5868k.m23674f(abstractC0729o, "manager");
        C7571g1 c7571g1 = C7571g1.f27808a;
        AbstractC5868k.m23673e(DialogInterfaceOnCancelListenerC0710d.class, "clazz");
        c7571g1.m29031a(DialogInterfaceOnCancelListenerC0710d.class, this, "mDismissed", Boolean.FALSE);
        c7571g1.m29031a(DialogInterfaceOnCancelListenerC0710d.class, this, "mShownByMe", Boolean.TRUE);
        AbstractC0738x m3534m = abstractC0729o.m3534m();
        if (m3534m != null) {
            m3534m.m3640d(this, str);
        }
        if (m3534m != null) {
            m3534m.mo3228h();
        }
    }

    /* renamed from: F9 */
    public void mo16979F9() {
        this.f28620C0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }
}
