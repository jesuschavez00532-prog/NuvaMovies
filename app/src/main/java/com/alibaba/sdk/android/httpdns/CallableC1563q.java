package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import anet.channel.request.Request;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.alibaba.sdk.android.httpdns.q */
/* loaded from: classes.dex */
public class CallableC1563q implements Callable<String[]> {

    /* renamed from: a */
    private static Context f6016a;

    /* renamed from: a */
    private EnumC1564s f6018a;

    /* renamed from: d */
    private int f6019d;

    /* renamed from: d */
    private long f6020d;

    /* renamed from: e */
    private String[] f6021e;
    private Map<String, String> extra;
    private String hostName;

    /* renamed from: j */
    private boolean f6022j;

    /* renamed from: k */
    private String f6023k;

    /* renamed from: l */
    private String f6024l;
    private static C1536d hostManager = C1536d.m7110a();

    /* renamed from: a */
    private static final Object f6017a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1563q(String str, EnumC1564s enumC1564s) {
        this.f6019d = 1;
        this.f6023k = null;
        this.f6021e = C1542f.f5953c;
        this.f6022j = false;
        this.f6024l = null;
        this.extra = new HashMap();
        this.f6020d = 0L;
        this.hostName = str;
        this.f6018a = enumC1564s;
    }

    /* renamed from: d */
    private boolean m7216d(String str) {
        return str.matches("[a-zA-Z0-9\\-_]+");
    }

    /* renamed from: e */
    private boolean m7217e(String str) {
        return str.matches("[a-zA-Z0-9\\-_=]+");
    }

    private String getExtra() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        Map<String, String> map = this.extra;
        boolean z11 = true;
        if (map != null) {
            z10 = true;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("&sdns-");
                sb2.append(entry.getKey());
                sb2.append(Operator.Operation.EQUALS);
                sb2.append(URLEncoder.encode(entry.getValue(), Request.DEFAULT_CHARSET));
                if (!m7216d(entry.getKey())) {
                    C1545i.m7167f("设置自定义参数失败，自定义key不合法：" + entry.getKey());
                    z11 = false;
                }
                if (!m7217e(entry.getValue())) {
                    C1545i.m7167f("设置自定义参数失败，自定义value不合法：" + entry.getValue());
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        if (z11 && z10) {
            String sb3 = sb2.toString();
            if (sb3.getBytes(Request.DEFAULT_CHARSET).length <= 1000) {
                return sb3;
            }
            C1545i.m7167f("设置自定义参数失败，自定义参数过长");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setContext(Context context) {
        f6016a = context;
    }

    /* renamed from: a */
    public void m7218a(int i10) {
        if (i10 >= 0) {
            this.f6019d = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1563q(String str, EnumC1564s enumC1564s, Map<String, String> map, String str2) {
        this.f6019d = 1;
        this.f6023k = null;
        this.f6021e = C1542f.f5953c;
        this.f6022j = false;
        this.f6024l = null;
        HashMap hashMap = new HashMap();
        this.extra = hashMap;
        this.f6020d = 0L;
        this.hostName = str;
        this.f6018a = enumC1564s;
        this.f6024l = str2;
        hashMap.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03bd A[Catch: all -> 0x03ea, TryCatch #5 {all -> 0x03ea, blocks: (B:73:0x03af, B:75:0x03bd, B:82:0x03c4), top: B:72:0x03af }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03d1 A[Catch: IOException -> 0x03d5, TRY_ENTER, TryCatch #2 {IOException -> 0x03d5, blocks: (B:26:0x038a, B:28:0x038f, B:79:0x03d1, B:81:0x03d9), top: B:19:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d9 A[Catch: IOException -> 0x03d5, TRY_LEAVE, TryCatch #2 {IOException -> 0x03d5, blocks: (B:26:0x038a, B:28:0x038f, B:79:0x03d1, B:81:0x03d9), top: B:19:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c4 A[Catch: all -> 0x03ea, TRY_LEAVE, TryCatch #5 {all -> 0x03ea, blocks: (B:73:0x03af, B:75:0x03bd, B:82:0x03c4), top: B:72:0x03af }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] call() {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.CallableC1563q.call():java.lang.String[]");
    }
}
