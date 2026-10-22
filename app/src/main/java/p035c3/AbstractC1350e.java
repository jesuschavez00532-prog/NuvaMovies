package p035c3;

import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p359ue.C7155i;
import p359ue.InterfaceC7153g;
import p363v2.C7197a;

/* renamed from: c3.e */
/* loaded from: classes.dex */
public abstract class AbstractC1350e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c3.e$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f5078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f5078a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(InterfaceC7153g interfaceC7153g) {
            AbstractC5868k.m23674f(interfaceC7153g, "matchResult");
            return ((String) interfaceC7153g.mo27666a().get(1)) + this.f5078a + ((String) interfaceC7153g.mo27666a().get(3));
        }
    }

    /* renamed from: a */
    public static final String m6119a(String str, String str2) {
        boolean z10;
        AbstractC5868k.m23674f(str2, "domainKey");
        String m27854k = C7197a.f26917a.m27854k(str2);
        boolean z11 = true;
        if (m27854k.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (str != null && str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                return new C7155i("^(https?://)([^/]+)(.*)").m27680d(str, new a(m27854k));
            }
            return str;
        }
        return str;
    }
}
