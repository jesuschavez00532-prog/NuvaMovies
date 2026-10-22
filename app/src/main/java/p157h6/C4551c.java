package p157h6;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.lzy.okgo.model.HttpHeaders;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p007a6.C0086m;
import p113e6.C4136a;
import p113e6.C4137b;
import p113e6.C4138c;
import p395x5.C7503f;

/* renamed from: h6.c */
/* loaded from: classes.dex */
class C4551c implements InterfaceC4559k {

    /* renamed from: a */
    private final String f19597a;

    /* renamed from: b */
    private final C4137b f19598b;

    /* renamed from: c */
    private final C7503f f19599c;

    public C4551c(String str, C4137b c4137b) {
        this(str, c4137b, C7503f.m28716f());
    }

    /* renamed from: b */
    private C4136a m18951b(C4136a c4136a, C4558j c4558j) {
        m18952c(c4136a, "X-CRASHLYTICS-GOOGLE-APP-ID", c4558j.f19627a);
        m18952c(c4136a, "X-CRASHLYTICS-API-CLIENT-TYPE", DispatchConstants.ANDROID);
        m18952c(c4136a, "X-CRASHLYTICS-API-CLIENT-VERSION", C0086m.m364l());
        m18952c(c4136a, HttpHeaders.HEAD_KEY_ACCEPT, "application/json");
        m18952c(c4136a, "X-CRASHLYTICS-DEVICE-MODEL", c4558j.f19628b);
        m18952c(c4136a, "X-CRASHLYTICS-OS-BUILD-VERSION", c4558j.f19629c);
        m18952c(c4136a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c4558j.f19630d);
        m18952c(c4136a, "X-CRASHLYTICS-INSTALLATION-ID", c4558j.f19631e.mo474a());
        return c4136a;
    }

    /* renamed from: c */
    private void m18952c(C4136a c4136a, String str, String str2) {
        if (str2 != null) {
            c4136a.m17327d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m18953e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f19599c.m28726l("Failed to parse settings JSON from " + this.f19597a, e10);
            this.f19599c.m28725k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map m18954f(C4558j c4558j) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c4558j.f19634h);
        hashMap.put("display_version", c4558j.f19633g);
        hashMap.put("source", Integer.toString(c4558j.f19635i));
        String str = c4558j.f19632f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // p157h6.InterfaceC4559k
    /* renamed from: a */
    public JSONObject mo18955a(C4558j c4558j, boolean z10) {
        if (z10) {
            try {
                Map m18954f = m18954f(c4558j);
                C4136a m18951b = m18951b(m18956d(m18954f), c4558j);
                this.f19599c.m28717b("Requesting settings from " + this.f19597a);
                this.f19599c.m28723i("Settings query params were: " + m18954f);
                return m18957g(m18951b.m17326c());
            } catch (IOException e10) {
                this.f19599c.m28720e("Settings request failed.", e10);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    protected C4136a m18956d(Map map) {
        return this.f19598b.m17328a(this.f19597a, map).m17327d(HttpHeaders.HEAD_KEY_USER_AGENT, "Crashlytics Android SDK/" + C0086m.m364l()).m17327d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: g */
    JSONObject m18957g(C4138c c4138c) {
        int m17330b = c4138c.m17330b();
        this.f19599c.m28723i("Settings response code was: " + m17330b);
        if (m18958h(m17330b)) {
            return m18953e(c4138c.m17329a());
        }
        this.f19599c.m28719d("Settings request failed; (status: " + m17330b + ") from " + this.f19597a);
        return null;
    }

    /* renamed from: h */
    boolean m18958h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    C4551c(String str, C4137b c4137b, C7503f c7503f) {
        if (str != null) {
            this.f19599c = c7503f;
            this.f19598b = c4137b;
            this.f19597a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
