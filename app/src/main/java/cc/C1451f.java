package cc;

import android.content.Context;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3384f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import ne.AbstractC5868k;
import p201k2.AbstractC5085b;
import p287pb.AbstractApplicationC6253c;

/* renamed from: cc.f */
/* loaded from: classes.dex */
public final class C1451f {

    /* renamed from: a */
    public static final C1451f f5570a = new C1451f();

    private C1451f() {
    }

    /* renamed from: a */
    public final void m6756a(Context context, String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "dnsType");
        AbstractC5868k.m23674f(str2, "host");
        AbstractC5868k.m23674f(str3, "mapper");
        AbstractC5868k.m23674f(str4, "resolver");
        HashMap hashMap = new HashMap();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put("key_start_time", format);
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put("sn", c1466m0.m6885t());
        hashMap.put("userId", c1466m0.m6878m());
        hashMap.put("apkVersion", String.valueOf(AbstractC5085b.m20602l(AbstractApplicationC6253c.f24484b.m24887a())));
        hashMap.put("key_dns_type", str);
        hashMap.put("key_host", str2);
        hashMap.put("key_mapper", str3);
        hashMap.put("key_resolver", str4);
        MobclickAgent.onEvent(context.getApplicationContext(), "EVENT_BIGBEE_APP_DNS", hashMap);
    }

    /* renamed from: b */
    public final void m6757b(Context context, String str, String str2, int i10, String str3) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "uri");
        AbstractC5868k.m23674f(str2, "domain");
        AbstractC5868k.m23674f(str3, "userName");
        if (i10 < 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put("key_start_time", format);
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put("sn", c1466m0.m6885t());
        hashMap.put("userId", c1466m0.m6878m());
        hashMap.put("apkVersion", String.valueOf(AbstractC5085b.m20602l(AbstractApplicationC6253c.f24484b.m24887a())));
        hashMap.put("key_uri", str);
        hashMap.put("key_domin", str2);
        hashMap.put("key_http_status", String.valueOf(i10));
        hashMap.put("key_user_name", str3);
        MobclickAgent.onEvent(context.getApplicationContext(), "EVENT_BIGBEE_REQUEST_ERROR_MESSAGE", hashMap);
    }
}
