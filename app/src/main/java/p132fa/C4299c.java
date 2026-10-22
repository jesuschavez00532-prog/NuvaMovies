package p132fa;

import cc.C1466m0;
import com.taobao.accs.common.Constants;
import ne.AbstractC5868k;
import se.InterfaceC6869f;

/* renamed from: fa.c */
/* loaded from: classes2.dex */
public final class C4299c {

    /* renamed from: a */
    private final String f18625a;

    public C4299c(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_HTTP_CODE);
        this.f18625a = str;
    }

    /* renamed from: a */
    public final String m17993a(Object obj, InterfaceC6869f interfaceC6869f) {
        AbstractC5868k.m23674f(obj, "thisRef");
        AbstractC5868k.m23674f(interfaceC6869f, "property");
        return C1466m0.f5627a.m6882q() + this.f18625a;
    }
}
