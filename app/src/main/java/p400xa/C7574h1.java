package p400xa;

import android.content.Context;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;
import p161ha.C4806x;
import p317rb.AbstractC6567a;

/* renamed from: xa.h1 */
/* loaded from: classes2.dex */
public final class C7574h1 {

    /* renamed from: a */
    public static final C7574h1 f27833a = new C7574h1();

    /* renamed from: b */
    private static C4806x f27834b;

    private C7574h1() {
    }

    /* renamed from: c */
    public static /* synthetic */ void m29062c(C7574h1 c7574h1, Context context, String str, Boolean bool, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        c7574h1.m29064b(context, str, bool);
    }

    /* renamed from: a */
    public final void m29063a() {
        AbstractC0729o abstractC0729o;
        C4806x c4806x = f27834b;
        if (c4806x != null) {
            if (c4806x != null) {
                abstractC0729o = c4806x.m3119R6();
            } else {
                abstractC0729o = null;
            }
            if (abstractC0729o != null) {
                C4806x c4806x2 = f27834b;
                if (c4806x2 != null) {
                    c4806x2.mo3279p9();
                }
                f27834b = null;
            }
        }
    }

    /* renamed from: b */
    public final void m29064b(Context context, String str, Boolean bool) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "errorMsg");
        if (AbstractC6567a.m25637g(str)) {
            m29063a();
            if (f27834b == null) {
                f27834b = new C4806x();
            }
            C4806x c4806x = f27834b;
            if (c4806x != null) {
                c4806x.m19863L9(str);
            }
            C4806x c4806x2 = f27834b;
            if (c4806x2 != null) {
                c4806x2.m19862J9(bool);
            }
            C4806x c4806x3 = f27834b;
            if (c4806x3 != null) {
                AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
                AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
                c4806x3.mo3277E9(m3294d4, "ErrorMsgDialog");
            }
        }
    }
}
