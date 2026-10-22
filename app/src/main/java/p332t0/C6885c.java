package p332t0;

import android.content.Context;
import com.advertlib.bean.AdInfo;
import com.umeng.analytics.pro.C3384f;
import java.io.File;
import ne.AbstractC5868k;
import ne.C5874q;
import p242n0.C5715b;
import p277p0.C6156m;
import p321s0.InterfaceC6607b;

/* renamed from: t0.c */
/* loaded from: classes.dex */
public final class C6885c implements InterfaceC6883a {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m26799d(InterfaceC6607b interfaceC6607b, String str, C5874q c5874q) {
        AbstractC5868k.m23674f(str, "$adType");
        AbstractC5868k.m23674f(c5874q, "$isSuccess");
        if (interfaceC6607b != null) {
            interfaceC6607b.mo23220a(str, c5874q.f23408a);
        }
    }

    @Override // p332t0.InterfaceC6883a
    /* renamed from: a */
    public File mo26796a(Context context, String str, AdInfo adInfo) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(adInfo, "adInfo");
        C5715b c5715b = C5715b.f22948a;
        String url = adInfo.getUrl();
        if (url == null) {
            url = "";
        }
        return c5715b.m23099b(context, url);
    }

    @Override // p332t0.InterfaceC6883a
    /* renamed from: b */
    public void mo26797b(Context context, final String str, AdInfo adInfo, final InterfaceC6607b interfaceC6607b) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(adInfo, "adInfo");
        final C5874q c5874q = new C5874q();
        C5715b c5715b = C5715b.f22948a;
        String url = adInfo.getUrl();
        if (url == null) {
            url = "";
        }
        c5874q.f23408a = c5715b.m23101e(context, url);
        C6156m.f24180a.m24566S().post(new Runnable() { // from class: t0.b
            @Override // java.lang.Runnable
            public final void run() {
                C6885c.m26799d(InterfaceC6607b.this, str, c5874q);
            }
        });
    }
}
