package va;

import androidx.fragment.app.AbstractC0729o;
import com.module.p069db.UmengPush;
import me.InterfaceC5660l;

/* renamed from: va.a */
/* loaded from: classes2.dex */
public interface InterfaceC7251a {

    /* renamed from: va.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m28064a(InterfaceC7251a interfaceC7251a, AbstractC0729o abstractC0729o, boolean z10, String str, InterfaceC5660l interfaceC5660l, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str = "";
                }
                interfaceC7251a.mo25622b(abstractC0729o, z10, str, interfaceC5660l);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoginDialog");
        }

        /* renamed from: b */
        public static /* synthetic */ void m28065b(InterfaceC7251a interfaceC7251a, AbstractC0729o abstractC0729o, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = true;
                }
                interfaceC7251a.mo25623c(abstractC0729o, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSelectRetrieveMethodDialog");
        }
    }

    /* renamed from: a */
    void mo25621a(AbstractC0729o abstractC0729o, UmengPush umengPush);

    /* renamed from: b */
    void mo25622b(AbstractC0729o abstractC0729o, boolean z10, String str, InterfaceC5660l interfaceC5660l);

    /* renamed from: c */
    void mo25623c(AbstractC0729o abstractC0729o, boolean z10);
}
