package p217l2;

import androidx.fragment.app.AbstractC0729o;
import com.module.p069db.UmengPush;
import me.InterfaceC5642a;
import me.InterfaceC5660l;

/* renamed from: l2.c */
/* loaded from: classes.dex */
public interface InterfaceC5342c {

    /* renamed from: l2.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m21626a(InterfaceC5342c interfaceC5342c, AbstractC0729o abstractC0729o, InterfaceC5642a interfaceC5642a, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    z10 = false;
                }
                interfaceC5342c.mo21619f(abstractC0729o, interfaceC5642a, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBindEmailDialog");
        }

        /* renamed from: b */
        public static /* synthetic */ void m21627b(InterfaceC5342c interfaceC5342c, AbstractC0729o abstractC0729o, boolean z10, InterfaceC5642a interfaceC5642a, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                if ((i10 & 4) != 0) {
                    interfaceC5642a = null;
                }
                interfaceC5342c.mo21616c(abstractC0729o, z10, interfaceC5642a);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBindPhoneDialog");
        }
    }

    /* renamed from: a */
    void mo21614a(AbstractC0729o abstractC0729o, UmengPush umengPush);

    /* renamed from: b */
    void mo21615b();

    /* renamed from: c */
    void mo21616c(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5642a interfaceC5642a);

    /* renamed from: d */
    void mo21617d(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5660l interfaceC5660l);

    /* renamed from: e */
    void mo21618e(AbstractC0729o abstractC0729o);

    /* renamed from: f */
    void mo21619f(AbstractC0729o abstractC0729o, InterfaceC5642a interfaceC5642a, boolean z10);

    /* renamed from: g */
    void mo21620g(AbstractC0729o abstractC0729o);

    /* renamed from: h */
    void mo21621h(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5660l interfaceC5660l);

    /* renamed from: i */
    void mo21622i(AbstractC0729o abstractC0729o, boolean z10, InterfaceC5660l interfaceC5660l);

    /* renamed from: j */
    void mo21623j(AbstractC0729o abstractC0729o);

    /* renamed from: k */
    void mo21624k(AbstractC0729o abstractC0729o, InterfaceC5642a interfaceC5642a);

    /* renamed from: l */
    void mo21625l(AbstractC0729o abstractC0729o, String str, String str2, String str3, InterfaceC5642a interfaceC5642a);
}
