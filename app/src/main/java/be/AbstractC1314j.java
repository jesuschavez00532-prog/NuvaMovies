package be;

import com.taobao.accs.common.Constants;
import me.InterfaceC5642a;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: be.j */
/* loaded from: classes3.dex */
public abstract class AbstractC1314j {

    /* renamed from: be.j$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4980a;

        static {
            int[] iArr = new int[EnumC1316l.values().length];
            try {
                iArr[EnumC1316l.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1316l.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1316l.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4980a = iArr;
        }
    }

    /* renamed from: a */
    public static InterfaceC1312h m5964a(EnumC1316l enumC1316l, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(enumC1316l, Constants.KEY_MODE);
        AbstractC5868k.m23674f(interfaceC5642a, "initializer");
        int i10 = a.f4980a[enumC1316l.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new C1329y(interfaceC5642a);
                }
                throw new C1317m();
            }
            return new C1322r(interfaceC5642a);
        }
        return new C1323s(interfaceC5642a, null, 2, null);
    }

    /* renamed from: b */
    public static InterfaceC1312h m5965b(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "initializer");
        return new C1323s(interfaceC5642a, null, 2, null);
    }
}
