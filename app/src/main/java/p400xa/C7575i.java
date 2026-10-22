package p400xa;

import android.os.SystemClock;
import com.lzy.okgo.model.Progress;
import java.util.HashMap;
import ne.AbstractC5868k;
import p035c3.AbstractC1349d;
import p153h2.AbstractC4509b;
import p421z0.C7730d;

/* renamed from: xa.i */
/* loaded from: classes2.dex */
public final class C7575i {

    /* renamed from: a */
    public static final C7575i f27835a = new C7575i();

    private C7575i() {
    }

    /* renamed from: a */
    public final void m29065a(double d10, double d11, double d12, double d13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AbstractC5868k.m23674f(str, "detectType");
        AbstractC5868k.m23674f(str2, "pingType");
        AbstractC5868k.m23674f(str3, "mECode");
        AbstractC5868k.m23674f(str4, "mCode");
        AbstractC5868k.m23674f(str5, "title");
        AbstractC5868k.m23674f(str6, "pingHost");
        AbstractC5868k.m23674f(str7, "pingMsg");
        AbstractC5868k.m23674f(str8, "host");
        AbstractC5868k.m23674f(str9, "bussType");
        AbstractC5868k.m23674f(str10, "cdnType");
        AbstractC5868k.m23674f(str11, "mTransId");
        HashMap hashMap = new HashMap();
        hashMap.put("mCode", str4);
        hashMap.put("title", str5);
        hashMap.put("host", str8);
        hashMap.put("cdnType", str10);
        hashMap.put("bussType", str9);
        hashMap.put("pingHost", str6);
        hashMap.put("pingMsg", str7);
        hashMap.put("minTime", Double.valueOf(d10));
        hashMap.put("maxTime", Double.valueOf(d11));
        hashMap.put("aveTime", Double.valueOf(d12));
        hashMap.put("sucRate", Double.valueOf(d13));
        hashMap.put("detectType", str);
        hashMap.put("pingType", str2);
        hashMap.put("transId", str11);
        hashMap.put("eCode", str3);
        C7730d.m29861b(C7730d.f28438a, "app_net_detect", hashMap, SystemClock.elapsedRealtime(), 0L, false, false, 56, null);
    }

    /* renamed from: b */
    public final void m29066b(String str, String str2, String str3, int i10) {
        AbstractC5868k.m23674f(str, "searchWords");
        AbstractC5868k.m23674f(str2, "title");
        AbstractC5868k.m23674f(str3, "actorName");
        HashMap hashMap = new HashMap();
        hashMap.put("title", str2);
        hashMap.put("searchWords", str);
        hashMap.put("actorName", str3);
        hashMap.put("position", Integer.valueOf(i10));
        C7730d.m29861b(C7730d.f28438a, "app_search_result_click", hashMap, SystemClock.elapsedRealtime(), 0L, false, false, 56, null);
    }

    /* renamed from: c */
    public final void m29067c(String str, String str2, String str3, long j10, int i10, String str4, Long l10, String str5) {
        AbstractC5868k.m23674f(str, "eCode");
        AbstractC5868k.m23674f(str2, "uri");
        AbstractC5868k.m23674f(str3, "host");
        AbstractC4509b.m18869b("BBReportOther", "URI: " + str2 + "host : " + str3, new Object[0]);
        String m6118a = AbstractC1349d.m6118a(str3, AbstractC1349d.f5077a);
        HashMap hashMap = new HashMap();
        hashMap.put("eCode", str);
        hashMap.put("uri", str2);
        AbstractC5868k.m23673e(m6118a, "desHost");
        hashMap.put("host|DES", m6118a);
        hashMap.put("duration", Long.valueOf(j10));
        hashMap.put("resumeCount", Integer.valueOf(i10));
        if (str4 != null) {
            hashMap.put(Progress.FILE_PATH, str4);
        }
        if (l10 != null) {
            hashMap.put("fileSize", Long.valueOf(l10.longValue()));
        }
        if (str5 != null) {
            hashMap.put("apkMd5", str5);
        }
        Long m29238b = AbstractC7598p1.m29238b();
        AbstractC5868k.m23673e(m29238b, "getAvailableInternalMemorySize()");
        hashMap.put("availableSize", m29238b);
        C7730d.m29861b(C7730d.f28438a, "app_update", hashMap, SystemClock.elapsedRealtime(), 0L, false, false, 56, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29068d(java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, long r21) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.String r3 = "searchWords"
            ne.AbstractC5868k.m23674f(r0, r3)
            java.lang.String r4 = "title"
            ne.AbstractC5868k.m23674f(r1, r4)
            boolean r5 = android.text.TextUtils.isEmpty(r17)
            if (r5 != 0) goto L9e
            r5 = 0
            int r7 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r7 < 0) goto L9e
            if (r19 < 0) goto L9e
            boolean r5 = android.text.TextUtils.isEmpty(r20)
            if (r5 == 0) goto L26
            goto L9e
        L26:
            if (r2 == 0) goto L5c
            int r5 = r20.hashCode()
            switch(r5) {
                case -1865291882: goto L51;
                case -1602815757: goto L46;
                case 78386401: goto L3b;
                case 1852016068: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L5c
        L30:
            java.lang.String r5 = "voice/search/app/live"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L39
            goto L5c
        L39:
            r2 = 1
            goto L5d
        L3b:
            java.lang.String r5 = "voice/search/vod"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L44
            goto L5c
        L44:
            r2 = 4
            goto L5d
        L46:
            java.lang.String r5 = "voice/search/app/vod"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L4f
            goto L5c
        L4f:
            r2 = 2
            goto L5d
        L51:
            java.lang.String r5 = "voice/search/live"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L5a
            goto L5c
        L5a:
            r2 = 3
            goto L5d
        L5c:
            r2 = 0
        L5d:
            if (r2 > 0) goto L60
            return
        L60:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r7.put(r4, r1)
            r7.put(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            java.lang.String r1 = "position"
            r7.put(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "jumpType"
            r7.put(r1, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r21
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "processTime"
            r7.put(r1, r0)
            z0.d r5 = p421z0.C7730d.f28438a
            java.lang.String r6 = "app_voice_search_result_click"
            long r8 = android.os.SystemClock.elapsedRealtime()
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 56
            r15 = 0
            p421z0.C7730d.m29861b(r5, r6, r7, r8, r10, r12, r13, r14, r15)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p400xa.C7575i.m29068d(java.lang.String, java.lang.String, int, java.lang.String, long):void");
    }
}
