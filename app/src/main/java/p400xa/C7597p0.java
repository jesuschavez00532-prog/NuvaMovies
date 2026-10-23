package p400xa;

import anet.channel.strategy.dispatch.DispatchConstants;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.raizlabs.android.dbflow.sql.language.Operator;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p359ue.AbstractC7167u;

/* renamed from: xa.p0 */
/* loaded from: classes2.dex */
public final class C7597p0 {

    /* renamed from: b */
    public static final b f27965b = new b(null);

    /* renamed from: c */
    private static final InterfaceC1312h f27966c;

    /* renamed from: a */
    private final String f27967a;

    /* renamed from: xa.p0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f27968a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7597p0 invoke() {
            return new C7597p0(null);
        }
    }

    /* renamed from: xa.p0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C7597p0 m29236a() {
            return (C7597p0) C7597p0.f27966c.getValue();
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f27968a);
        f27966c = m5965b;
    }

    public /* synthetic */ C7597p0(AbstractC5864g abstractC5864g) {
        this();
    }

    /* renamed from: b */
    public final String m29234b(String str, String str2) {
        int m27735E;
        int m27735E2;
        int m27735E3;
        String substring = null;
        AbstractC5868k.m23674f(str, "url");
        AbstractC5868k.m23674f(str2, "field");
        try {
            m27735E = AbstractC7167u.m27735E(str, str2, 0, false, 6, null);
            if (m27735E == -1) {
                return "";
            }
            m27735E2 = AbstractC7167u.m27735E(str, Operator.Operation.EQUALS, m27735E, false, 4, null);
            m27735E3 = AbstractC7167u.m27735E(str, DispatchConstants.SIGN_SPLIT_SYMBOL, m27735E, false, 4, null);
            if (m27735E2 == -1) {
                return "";
            }
            if (m27735E3 == -1) {
                substring = str.substring(m27735E2 + 1);
                AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
            } else {
                substring = str.substring(m27735E2 + 1, m27735E3);
                AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            return substring;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private C7597p0() {
        this.f27967a = C7597p0.class.getSimpleName();
    }
}
