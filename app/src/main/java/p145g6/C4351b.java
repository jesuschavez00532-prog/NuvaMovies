package p145g6;

import android.content.Context;
import anet.channel.request.Request;
import com.google.android.datatransport.cct.C1782a;
import java.nio.charset.Charset;
import p007a6.AbstractC0092p;
import p007a6.C0065b0;
import p038c6.AbstractC1366a0;
import p097d6.C3960g;
import p127f5.AbstractC4245i;
import p157h6.InterfaceC4557i;
import p294q3.C6335b;
import p294q3.InterfaceC6338e;
import p294q3.InterfaceC6340g;
import p324s3.C6672t;

/* renamed from: g6.b */
/* loaded from: classes.dex */
public class C4351b {

    /* renamed from: c */
    private static final C3960g f18936c = new C3960g();

    /* renamed from: d */
    private static final String f18937d = m18260e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    private static final String f18938e = m18260e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    private static final InterfaceC6338e f18939f = new InterfaceC6338e() { // from class: g6.a
        @Override // p294q3.InterfaceC6338e
        public final Object apply(Object obj) {
            byte[] m18259d;
            m18259d = C4351b.m18259d((AbstractC1366a0) obj);
            return m18259d;
        }
    };

    /* renamed from: a */
    private final C4353d f18940a;

    /* renamed from: b */
    private final InterfaceC6338e f18941b;

    C4351b(C4353d c4353d, InterfaceC6338e interfaceC6338e) {
        this.f18940a = c4353d;
        this.f18941b = interfaceC6338e;
    }

    /* renamed from: b */
    public static C4351b m18258b(Context context, InterfaceC4557i interfaceC4557i, C0065b0 c0065b0) {
        C6672t.m26046f(context);
        InterfaceC6340g m26048g = C6672t.m26044c().m26048g(new C1782a(f18937d, f18938e));
        C6335b m25117b = C6335b.m25117b("json");
        InterfaceC6338e interfaceC6338e = f18939f;
        return new C4351b(new C4353d(m26048g.mo25123a("FIREBASE_CRASHLYTICS_REPORT", AbstractC1366a0.class, m25117b, interfaceC6338e), interfaceC4557i.mo18974b(), c0065b0), interfaceC6338e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ byte[] m18259d(AbstractC1366a0 abstractC1366a0) {
        return f18936c.m16810E(abstractC1366a0).getBytes(Charset.forName(Request.DEFAULT_CHARSET));
    }

    /* renamed from: e */
    private static String m18260e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    /* renamed from: c */
    public AbstractC4245i m18261c(AbstractC0092p abstractC0092p, boolean z10) {
        return this.f18940a.m18276h(abstractC0092p, z10).m17724a();
    }
}
