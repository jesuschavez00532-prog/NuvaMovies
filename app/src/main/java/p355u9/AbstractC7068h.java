package p355u9;

import me.InterfaceC5660l;
import p359ue.C7155i;
import p359ue.InterfaceC7153g;
import p363v2.C7197a;

/* renamed from: u9.h */
/* loaded from: classes2.dex */
public abstract class AbstractC7068h {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ CharSequence m27231b(String str, InterfaceC7153g interfaceC7153g) {
        return ((String) interfaceC7153g.mo27666a().get(1)) + str + ((String) interfaceC7153g.mo27666a().get(3));
    }

    /* renamed from: c */
    public static String m27232c(String str, String str2) {
        final String m27854k = C7197a.f26917a.m27854k(str2);
        if (m27854k != null && m27854k.length() != 0 && str != null && str.length() != 0) {
            return new C7155i("^(https?://)([^/]+)(.*)").m27680d(str, new InterfaceC5660l() { // from class: u9.g
                @Override // me.InterfaceC5660l
                /* renamed from: f */
                public final Object mo542f(Object obj) {
                    CharSequence m27231b;
                    m27231b = AbstractC7068h.m27231b(m27854k, (InterfaceC7153g) obj);
                    return m27231b;
                }
            });
        }
        return str;
    }
}
