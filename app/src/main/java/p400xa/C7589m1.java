package p400xa;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import cc.AbstractC1468n0;
import cc.C1466m0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.lzy.okgo.cookie.SerializableCookie;
import com.request.result.AssetData;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.MobclickAgent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import ne.AbstractC5868k;
import p201k2.AbstractC5085b;
import p287pb.AbstractApplicationC6253c;

/* renamed from: xa.m1 */
/* loaded from: classes2.dex */
public final class C7589m1 {

    /* renamed from: a */
    public static final C7589m1 f27886a = null;

    /* renamed from: b */
    private static final String f27887b;

    /* renamed from: c */
    private static final SimpleDateFormat f27888c;

    /* renamed from: d */
    private static final SimpleDateFormat f27889d;

    /* renamed from: e */
    private static String f27890e;

    /* renamed from: f */
    private static long f27891f;

    /* renamed from: xa.m1$a */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a */
        public static final C7866a f27892a = C7866a.f27893a;

        /* renamed from: xa.m1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C7866a {

            /* renamed from: a */
            static final /* synthetic */ C7866a f27893a = new C7866a();

            /* renamed from: b */
            private static final String f27894b = "CH_PAUSE_AD";

            /* renamed from: c */
            private static final String f27895c = "CH_PAUSE_AD_SHOWTIME";

            private C7866a() {
            }

            /* renamed from: a */
            public final String m29158a() {
                return f27894b;
            }

            /* renamed from: b */
            public final String m29159b() {
                return f27895c;
            }
        }
    }

    /* renamed from: xa.m1$b */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a */
        public static final a f27896a = a.f27897a;

        /* renamed from: xa.m1$b$a */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            static final /* synthetic */ a f27897a = new a();

            /* renamed from: b */
            private static final String f27898b = "CH_PLAY_LIVE";

            /* renamed from: c */
            private static final String f27899c = "CH_FAV_LIVE";

            /* renamed from: d */
            private static final String f27900d = "RESERVATION";

            private a() {
            }

            /* renamed from: a */
            public final String m29160a() {
                return f27899c;
            }

            /* renamed from: b */
            public final String m29161b() {
                return f27898b;
            }

            /* renamed from: c */
            public final String m29162c() {
                return f27900d;
            }
        }
    }

    /* renamed from: xa.m1$c */
    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: a */
        public static final a f27901a = a.f27902a;

        /* renamed from: xa.m1$c$a */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            static final /* synthetic */ a f27902a = new a();

            /* renamed from: b */
            private static final String f27903b = "CH_PLAY_VOD";

            /* renamed from: c */
            private static final String f27904c = "CH_FAV_VOD";

            /* renamed from: d */
            private static final String f27905d = "CH_SUBSCRIBE_VOD";

            /* renamed from: e */
            private static final String f27906e = "CH_PLAY_RANK";

            /* renamed from: f */
            private static final String f27907f = "CH_PLAY_FREE";

            /* renamed from: g */
            private static final String f27908g = "CH_PLAY_TOPIC";

            /* renamed from: h */
            private static final String f27909h = "CH_PLAY_RECOMMEND";

            /* renamed from: i */
            private static final String f27910i = "CH_PLAY";

            private a() {
            }

            /* renamed from: a */
            public final String m29163a() {
                return f27904c;
            }

            /* renamed from: b */
            public final String m29164b() {
                return f27910i;
            }

            /* renamed from: c */
            public final String m29165c() {
                return f27907f;
            }

            /* renamed from: d */
            public final String m29166d() {
                return f27909h;
            }

            /* renamed from: e */
            public final String m29167e() {
                return f27908g;
            }

            /* renamed from: f */
            public final String m29168f() {
                return f27903b;
            }

            /* renamed from: g */
            public final String m29169g() {
                return f27905d;
            }
        }
    }

    /* renamed from: xa.m1$d */
    /* loaded from: classes2.dex */
    public class d {

        /* renamed from: a */
        public static final a f27911a = a.f27912a;

        /* renamed from: xa.m1$d$a */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            static final /* synthetic */ a f27912a = new a();

            /* renamed from: b */
            private static final String f27913b = AnalyticsConfig.RTD_START_TIME;

            /* renamed from: c */
            private static final String f27914c = "sn";

            /* renamed from: d */
            private static final String f27915d = "channelID";

            /* renamed from: e */
            private static final String f27916e = "channelName";

            /* renamed from: f */
            private static final String f27917f = "channelNameEpisode";

            /* renamed from: g */
            private static final String f27918g = "topicChannelName";

            /* renamed from: h */
            private static final String f27919h = "adShowTime";

            /* renamed from: i */
            private static final String f27920i = "RESERVATION_time";

            /* renamed from: j */
            private static final String f27921j = "serveIP";

            /* renamed from: k */
            private static final String f27922k = "userId";

            /* renamed from: l */
            private static final String f27923l = "apkVersion";

            /* renamed from: m */
            private static final String f27924m = "deviceModel";

            /* renamed from: n */
            private static final String f27925n = "sysVersion";

            /* renamed from: o */
            private static final String f27926o = "msg";

            /* renamed from: p */
            private static final String f27927p = "player";

            /* renamed from: q */
            private static final String f27928q = "mediaCodec";

            /* renamed from: r */
            private static final String f27929r = "subscribe_status";

            /* renamed from: s */
            private static final String f27930s = "thumbnailShow";

            /* renamed from: t */
            private static final String f27931t = "thumbnailName";

            /* renamed from: u */
            private static final String f27932u = "searchType";

            /* renamed from: v */
            private static final String f27933v = "patch_result";

            /* renamed from: w */
            private static final String f27934w = "patch_cost_time";

            /* renamed from: x */
            private static final String f27935x = "patch_exception";

            /* renamed from: y */
            private static final String f27936y = "patch_old_version";

            /* renamed from: z */
            private static final String f27937z = "download_exception";

            private a() {
            }

            /* renamed from: a */
            public final String m29170a() {
                return f27919h;
            }

            /* renamed from: b */
            public final String m29171b() {
                return f27923l;
            }

            /* renamed from: c */
            public final String m29172c() {
                return f27915d;
            }

            /* renamed from: d */
            public final String m29173d() {
                return f27916e;
            }

            /* renamed from: e */
            public final String m29174e() {
                return f27924m;
            }

            /* renamed from: f */
            public final String m29175f() {
                return f27937z;
            }

            /* renamed from: g */
            public final String m29176g() {
                return f27928q;
            }

            /* renamed from: h */
            public final String m29177h() {
                return f27927p;
            }

            /* renamed from: i */
            public final String m29178i() {
                return f27920i;
            }

            /* renamed from: j */
            public final String m29179j() {
                return f27932u;
            }

            /* renamed from: k */
            public final String m29180k() {
                return f27914c;
            }

            /* renamed from: l */
            public final String m29181l() {
                return f27913b;
            }

            /* renamed from: m */
            public final String m29182m() {
                return f27929r;
            }

            /* renamed from: n */
            public final String m29183n() {
                return f27925n;
            }

            /* renamed from: o */
            public final String m29184o() {
                return f27922k;
            }
        }
    }

    static {
        C7589m1 c7589m1 = new C7589m1();
        f27886a = c7589m1;
        f27887b = c7589m1.getClass().getSimpleName();
        f27888c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f27889d = new SimpleDateFormat("yyyy-MM-dd");
        f27890e = "";
    }

    private C7589m1() {
    }

    /* renamed from: A */
    public final void m29118A(String str, String str2) {
        if (str != null && str2 != null) {
            HashMap hashMap = new HashMap();
            d.a aVar = d.f27911a;
            String m29180k = aVar.m29180k();
            C1466m0 c1466m0 = C1466m0.f5627a;
            hashMap.put(m29180k, c1466m0.m6885t());
            hashMap.put(aVar.m29184o(), c1466m0.m6878m());
            String m29171b = aVar.m29171b();
            AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
            hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
            String m29174e = aVar.m29174e();
            String str3 = Build.MODEL;
            AbstractC5868k.m23673e(str3, "MODEL");
            hashMap.put(m29174e, str3);
            hashMap.put("mosaicoSubChannelCode", str);
            hashMap.put("mosaicoChannelCode", str2);
            MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_MOSAICO_BACK_CLICK", hashMap);
            Bundle bundle = new Bundle();
            bundle.putString(aVar.m29180k(), c1466m0.m6885t());
            bundle.putString(aVar.m29184o(), c1466m0.m6878m());
            bundle.putString(aVar.m29171b(), String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
            bundle.putString(aVar.m29174e(), str3);
            bundle.putString("mosaicoSubChannelCode", str);
            bundle.putString("mosaicoChannelCode", str2);
            FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_MOSAICO_BACK_CLICK", bundle);
        }
    }

    /* renamed from: B */
    public final void m29119B(String str) {
        if (str == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29180k, c1466m0.m6885t());
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str2 = Build.MODEL;
        AbstractC5868k.m23673e(str2, "MODEL");
        hashMap.put(m29174e, str2);
        hashMap.put("channelCode", str);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_MOSAICO_CHANNEL_CLICK", hashMap);
        Bundle bundle = new Bundle();
        bundle.putString(aVar.m29180k(), c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString(aVar.m29171b(), String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29174e(), str2);
        bundle.putString("channelCode", str);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_MOSAICO_CHANNEL_CLICK", bundle);
    }

    /* renamed from: C */
    public final void m29120C(String str, String str2) {
        if (str != null && str2 != null) {
            HashMap hashMap = new HashMap();
            d.a aVar = d.f27911a;
            String m29180k = aVar.m29180k();
            C1466m0 c1466m0 = C1466m0.f5627a;
            hashMap.put(m29180k, c1466m0.m6885t());
            hashMap.put(aVar.m29184o(), c1466m0.m6878m());
            String m29171b = aVar.m29171b();
            AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
            hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
            String m29174e = aVar.m29174e();
            String str3 = Build.MODEL;
            AbstractC5868k.m23673e(str3, "MODEL");
            hashMap.put(m29174e, str3);
            hashMap.put("mosaicoSubChannelCode", str);
            hashMap.put("mosaicoChannelCode", str2);
            MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_MOSAICO_ITEM_CLICK", hashMap);
            Bundle bundle = new Bundle();
            bundle.putString(aVar.m29180k(), c1466m0.m6885t());
            bundle.putString(aVar.m29184o(), c1466m0.m6878m());
            bundle.putString(aVar.m29171b(), String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
            bundle.putString(aVar.m29174e(), str3);
            bundle.putString("mosaicoSubChannelCode", str);
            bundle.putString("mosaicoChannelCode", str2);
            FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_MOSAICO_ITEM_CLICK", bundle);
        }
    }

    /* renamed from: D */
    public final void m29121D() {
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putString(aVar.m29174e(), Build.MODEL);
        bundle.putString(aVar.m29183n(), Build.VERSION.RELEASE);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_CLICK_FILTER", bundle);
    }

    /* renamed from: E */
    public final void m29122E() {
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putString(aVar.m29174e(), Build.MODEL);
        bundle.putString(aVar.m29183n(), Build.VERSION.RELEASE);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_CLICK_HOME_SEARCH", bundle);
    }

    /* renamed from: F */
    public final void m29123F(Exception exc) {
        AbstractC5868k.m23674f(exc, "exception");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29180k(), C1466m0.f5627a.m6885t());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str = Build.MODEL;
        AbstractC5868k.m23673e(str, "MODEL");
        hashMap.put(m29174e, str);
        Throwable cause = exc.getCause();
        Throwable th = exc;
        if (cause != null) {
            th = exc.getCause();
        }
        String stackTraceString = Log.getStackTraceString(th);
        AbstractC5868k.m23673e(stackTraceString, "if (exception.cause != n…ackTraceString(exception)");
        if (stackTraceString.length() > 50) {
            stackTraceString = stackTraceString.substring(0, 50);
            AbstractC5868k.m23673e(stackTraceString, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        hashMap.put("extra", stackTraceString);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_FIXUP_EXCEPTION", hashMap);
    }

    /* renamed from: G */
    public final void m29124G() {
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String str = Build.FINGERPRINT;
        if (str == null) {
            str = "unknown";
        }
        hashMap.put("finger_print", str);
        String m29174e = aVar.m29174e();
        String str2 = Build.MODEL;
        AbstractC5868k.m23673e(str2, "MODEL");
        hashMap.put(m29174e, str2);
        String m6897e = AbstractC1468n0.m6897e();
        AbstractC5868k.m23673e(m6897e, "getSerial()");
        hashMap.put("B29", m6897e);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_MEMORY_LOW", hashMap);
    }

    /* renamed from: H */
    public final void m29125H(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "setting");
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        C1466m0 c1466m0 = C1466m0.f5627a;
        sb2.append(c1466m0.m6878m());
        sb2.append('_');
        sb2.append(str);
        sb2.append('_');
        sb2.append(str2);
        hashMap.put("type", sb2.toString());
        d.a aVar = d.f27911a;
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        hashMap.put(aVar.m29180k(), c1466m0.m6885t());
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CLICK_QUALITY_SETTING", hashMap);
        Bundle bundle = new Bundle();
        bundle.putString("type", c1466m0.m6878m() + '_' + str + '_' + str2);
        bundle.putString(aVar.m29171b(), String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString(aVar.m29180k(), c1466m0.m6885t());
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_CLICK_QUALITY_SETTING", bundle);
    }

    /* renamed from: I */
    public final void m29126I(String str, int i10) {
        AbstractC5868k.m23674f(str, "keyword");
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putString("search_keyword", str);
        bundle.putInt("search_entrance", i10);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_SEARCH_NO_RESULT", bundle);
    }

    /* renamed from: J */
    public final void m29127J(boolean z10) {
        String str;
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putString(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29174e(), Build.MODEL);
        bundle.putString(aVar.m29183n(), Build.VERSION.RELEASE);
        String m29182m = aVar.m29182m();
        if (z10) {
            str = "subscribe";
        } else {
            str = "unsubscibe";
        }
        bundle.putString(m29182m, str);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_MATCH_SUBSCRIBE", bundle);
    }

    /* renamed from: K */
    public final void m29128K(String str, String str2) {
        AbstractC5868k.m23674f(str, "programId");
        AbstractC5868k.m23674f(str2, "errorMessage");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        SimpleDateFormat simpleDateFormat = f27888c;
        String format = simpleDateFormat.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29174e = aVar.m29174e();
        String str3 = Build.MODEL;
        AbstractC5868k.m23673e(str3, "MODEL");
        hashMap.put(m29174e, str3);
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29183n = aVar.m29183n();
        String str4 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str4, "RELEASE");
        hashMap.put(m29183n, str4);
        String m29184o = aVar.m29184o();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29184o, c1466m0.m6878m());
        hashMap.put("programId", str);
        hashMap.put("subtitle_download_error", str + '_' + c1466m0.m6878m() + '_' + str2 + '_' + simpleDateFormat.format(new Date()));
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_SUBTITLE_DOWNLOAD_FAILD", hashMap);
        Bundle bundle = new Bundle();
        bundle.putString(aVar.m29181l(), simpleDateFormat.format(new Date()));
        bundle.putString(aVar.m29174e(), str3);
        bundle.putString(aVar.m29171b(), String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29183n(), str4);
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString("programId", str);
        bundle.putString("subtitle_download_error", str + '_' + c1466m0.m6878m() + '_' + str2 + '_' + simpleDateFormat.format(new Date()));
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_SUBTITLE_DOWNLOAD_FAILD", bundle);
    }

    /* renamed from: L */
    public final void m29129L(String str) {
        AbstractC5868k.m23674f(str, "type");
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putString(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29174e(), Build.MODEL);
        bundle.putString(aVar.m29183n(), Build.VERSION.RELEASE);
        String m29179j = aVar.m29179j();
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    str = "Movies";
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    str = "Series";
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    str = "Cast";
                    break;
                }
                break;
        }
        bundle.putString(m29179j, str);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_MATCH_SEARCH_TYPE", bundle);
    }

    /* renamed from: M */
    public final void m29130M(String str) {
        AbstractC5868k.m23674f(str, "sn");
        FirebaseAnalytics.getInstance(AbstractApplicationC6253c.f24484b.m24887a()).m10841b(str);
    }

    /* renamed from: N */
    public final void m29131N(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f27890e = str;
    }

    /* renamed from: a */
    public final void m29132a(String str, String str2) {
        AbstractC5868k.m23674f(str, "eventKey");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29180k(), C1466m0.f5627a.m6885t());
        hashMap.put(aVar.m29173d(), str2);
        if (AbstractC5868k.m23669a(str, a.f27892a.m29159b())) {
            hashMap.put(aVar.m29170a(), String.valueOf((System.currentTimeMillis() - f27891f) / 1000));
        } else {
            f27891f = System.currentTimeMillis();
        }
        MobclickAgent.onEvent(AbstractApplicationC6253c.f24484b.m24887a(), str, hashMap);
    }

    /* renamed from: b */
    public final void m29133b(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "apkVersion");
        AbstractC5868k.m23674f(str3, "deviceModel");
        AbstractC5868k.m23674f(str4, "sysVersion");
        AbstractC5868k.m23674f(str5, "eventId");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29184o(), str);
        hashMap.put(aVar.m29171b(), str2);
        hashMap.put(aVar.m29174e(), str3);
        hashMap.put(aVar.m29183n(), str4);
        MobclickAgent.onEvent(AbstractApplicationC6253c.f24484b.m24887a(), str5, hashMap);
    }

    /* renamed from: c */
    public final void m29134c(String str, AssetData assetData) {
        AbstractC5868k.m23674f(str, "eventKey");
        AbstractC5868k.m23674f(assetData, "assetData");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29180k(), C1466m0.f5627a.m6885t());
        hashMap.put(aVar.m29172c(), assetData.getContentId());
        String m29173d = aVar.m29173d();
        String name = assetData.getName();
        if (name == null) {
            name = "";
        }
        hashMap.put(m29173d, name);
        MobclickAgent.onEvent(AbstractApplicationC6253c.f24484b.m24887a(), str, hashMap);
    }

    /* renamed from: d */
    public final void m29135d(String str, String str2, String str3, long j10) {
        AbstractC5868k.m23674f(str, "eventKey");
        AbstractC5868k.m23674f(str2, "channelCode");
        AbstractC5868k.m23674f(str3, SerializableCookie.NAME);
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29180k(), C1466m0.f5627a.m6885t());
        hashMap.put(aVar.m29172c(), str2);
        hashMap.put(aVar.m29173d(), str3);
        b.a aVar2 = b.f27896a;
        if (AbstractC5868k.m23669a(str, aVar2.m29160a())) {
            MobclickAgent.onEvent(AbstractApplicationC6253c.f24484b.m24887a(), str, hashMap);
        } else if (AbstractC5868k.m23669a(str, aVar2.m29161b())) {
            MobclickAgent.onEventValue(AbstractApplicationC6253c.f24484b.m24887a(), str, hashMap, (int) j10);
        }
    }

    /* renamed from: e */
    public final void m29136e(String str, String str2) {
        AbstractC5868k.m23674f(str, "eventKey");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29178i = aVar.m29178i();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29178i, format);
        hashMap.put(aVar.m29180k(), C1466m0.f5627a.m6885t());
        hashMap.put(aVar.m29173d(), str2);
        MobclickAgent.onEvent(AbstractApplicationC6253c.f24484b.m24887a(), str, hashMap);
    }

    /* renamed from: f */
    public final void m29137f(String str) {
        AbstractC5868k.m23674f(str, "player");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29184o(), C1466m0.f5627a.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str2 = Build.MODEL;
        AbstractC5868k.m23673e(str2, "MODEL");
        hashMap.put(m29174e, str2);
        String m29183n = aVar.m29183n();
        String str3 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str3, "RELEASE");
        hashMap.put(m29183n, str3);
        hashMap.put(aVar.m29177h(), str);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_PLAYER", hashMap);
    }

    /* renamed from: g */
    public final void m29138g(String str, AssetData assetData) {
        AbstractC5868k.m23674f(str, "eventKey");
        AbstractC5868k.m23674f(assetData, "assetData");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29180k(), C1466m0.f5627a.m6885t());
        hashMap.put(aVar.m29172c(), assetData.getContentId());
        String m29173d = aVar.m29173d();
        String name = assetData.getName();
        if (name == null) {
            name = "";
        }
        hashMap.put(m29173d, name);
        MobclickAgent.onEvent(AbstractApplicationC6253c.f24484b.m24887a(), str, hashMap);
    }

    /* renamed from: h */
    public final void m29139h(List list) {
        AbstractC5868k.m23674f(list, "codecInfo");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29184o(), C1466m0.f5627a.m6878m());
        hashMap.put(aVar.m29171b(), String.valueOf(AbstractC5085b.m20602l(AbstractApplicationC6253c.f24484b.m24887a())));
        String m29174e = aVar.m29174e();
        String str = Build.MODEL;
        AbstractC5868k.m23673e(str, "MODEL");
        hashMap.put(m29174e, str);
        String m29183n = aVar.m29183n();
        String str2 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str2, "RELEASE");
        hashMap.put(m29183n, str2);
        int size = list.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                hashMap.put(d.f27911a.m29176g() + i10, ((List) list.get(i10)).toString());
                if (i10 == size) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        MobclickAgent.onEvent(AbstractApplicationC6253c.f24484b.m24887a(), "EVENT_MEDIA_CODEC_INFO", hashMap);
    }

    /* renamed from: i */
    public final void m29140i(String str) {
        AbstractC5868k.m23674f(str, "exception");
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putString(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29174e(), Build.MODEL);
        bundle.putString(aVar.m29183n(), Build.VERSION.RELEASE);
        bundle.putString(aVar.m29175f(), str);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_ADD_DOWNLOAD_FAILED", bundle);
    }

    /* renamed from: j */
    public final void m29141j() {
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29180k, c1466m0.m6885t());
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str = Build.MODEL;
        AbstractC5868k.m23673e(str, "MODEL");
        hashMap.put(m29174e, str);
        String m29183n = aVar.m29183n();
        String str2 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str2, "RELEASE");
        hashMap.put(m29183n, str2);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CLICK_FILTER", hashMap);
    }

    /* renamed from: k */
    public final void m29142k(int i10) {
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putInt("filter_type", i10);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_CLICK_FILTER_CONDITION", bundle);
    }

    /* renamed from: l */
    public final void m29143l(int i10) {
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29180k, c1466m0.m6885t());
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str = Build.MODEL;
        AbstractC5868k.m23673e(str, "MODEL");
        hashMap.put(m29174e, str);
        String m29183n = aVar.m29183n();
        String str2 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str2, "RELEASE");
        hashMap.put(m29183n, str2);
        hashMap.put("filter_type", String.valueOf(i10));
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CLICK_FILTER_CONDITION", hashMap);
    }

    /* renamed from: m */
    public final void m29144m(boolean z10) {
        String str;
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        if (z10) {
            str = "bindNow";
        } else {
            str = "later";
        }
        hashMap.put("force_bind_type", str);
        String m29174e = aVar.m29174e();
        String str2 = Build.MODEL;
        AbstractC5868k.m23673e(str2, "MODEL");
        hashMap.put(m29174e, str2);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CLICK_FORCE_BIND", hashMap);
    }

    /* renamed from: n */
    public final void m29145n() {
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29180k, c1466m0.m6885t());
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str = Build.MODEL;
        AbstractC5868k.m23673e(str, "MODEL");
        hashMap.put(m29174e, str);
        String m29183n = aVar.m29183n();
        String str2 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str2, "RELEASE");
        hashMap.put(m29183n, str2);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CLICK_FORGET_CHILD_PWD", hashMap);
    }

    /* renamed from: o */
    public final void m29146o(int i10) {
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putInt("entrance", i10);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_CLICK_HOME_MENU", bundle);
    }

    /* renamed from: p */
    public final void m29147p() {
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29180k, c1466m0.m6885t());
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str = Build.MODEL;
        AbstractC5868k.m23673e(str, "MODEL");
        hashMap.put(m29174e, str);
        String m29183n = aVar.m29183n();
        String str2 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str2, "RELEASE");
        hashMap.put(m29183n, str2);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CLICK_HOME_SEARCH", hashMap);
    }

    /* renamed from: q */
    public final void m29148q(String str) {
        AbstractC5868k.m23674f(str, "type");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29180k, c1466m0.m6885t());
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str2 = Build.MODEL;
        AbstractC5868k.m23673e(str2, "MODEL");
        hashMap.put(m29174e, str2);
        hashMap.put("extra", str);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CLICK_INVITE_FRIEND_AD", hashMap);
        Bundle bundle = new Bundle();
        bundle.putString(aVar.m29180k(), c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString(aVar.m29171b(), String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29174e(), str2);
        bundle.putString("extra", str);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_CLICK_INVITE_FRIEND_AD", bundle);
    }

    /* renamed from: r */
    public final void m29149r() {
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29180k, c1466m0.m6885t());
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str = Build.MODEL;
        AbstractC5868k.m23673e(str, "MODEL");
        hashMap.put(m29174e, str);
        String m29183n = aVar.m29183n();
        String str2 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str2, "RELEASE");
        hashMap.put(m29183n, str2);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CLICK_LIVE_ADULT_DISABLE", hashMap);
    }

    /* renamed from: s */
    public final void m29150s(String str) {
        AbstractC5868k.m23674f(str, "channelName");
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putString(aVar.m29173d(), str);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_CLICK_PARENT_LOCK", bundle);
    }

    /* renamed from: t */
    public final void m29151t(String str, String str2, int i10) {
        AbstractC5868k.m23674f(str, "event");
        AbstractC5868k.m23674f(str2, "keyword");
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putString("search_keyword", str2);
        bundle.putInt("search_entrance", i10);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a(str, bundle);
    }

    /* renamed from: u */
    public final void m29152u(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "selectedAudio");
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putBoolean("state", z10);
        bundle.putString("extra", str);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_CLICK_VOD_SUBTITLE_SWITCH", bundle);
    }

    /* renamed from: v */
    public final void m29153v() {
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        hashMap.put(aVar.m29180k(), C1466m0.f5627a.m6885t());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_CRASH_RESET_VARIABLE", hashMap);
    }

    /* renamed from: w */
    public final void m29154w() {
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putString(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29174e(), Build.MODEL);
        bundle.putString(aVar.m29183n(), Build.VERSION.RELEASE);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_DOWNLOAD_BUTTON", bundle);
    }

    /* renamed from: x */
    public final void m29155x() {
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putString(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        bundle.putString(aVar.m29174e(), Build.MODEL);
        bundle.putString(aVar.m29183n(), Build.VERSION.RELEASE);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_DOWNLOAD_SUCCESS", bundle);
    }

    /* renamed from: y */
    public final void m29156y(String str) {
        AbstractC5868k.m23674f(str, "type");
        HashMap hashMap = new HashMap();
        d.a aVar = d.f27911a;
        String m29181l = aVar.m29181l();
        String format = f27888c.format(new Date());
        AbstractC5868k.m23673e(format, "sDateFormat.format(Date())");
        hashMap.put(m29181l, format);
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        hashMap.put(m29180k, c1466m0.m6885t());
        hashMap.put(aVar.m29184o(), c1466m0.m6878m());
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        hashMap.put(m29171b, String.valueOf(AbstractC5085b.m20602l(aVar2.m24887a())));
        String m29174e = aVar.m29174e();
        String str2 = Build.MODEL;
        AbstractC5868k.m23673e(str2, "MODEL");
        hashMap.put(m29174e, str2);
        String m29183n = aVar.m29183n();
        String str3 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str3, "RELEASE");
        hashMap.put(m29183n, str3);
        hashMap.put("extra", str);
        MobclickAgent.onEvent(aVar2.m24887a(), "EVENT_ENTER_ADULT_SUCCESS", hashMap);
    }

    /* renamed from: z */
    public final void m29157z(String str, int i10) {
        AbstractC5868k.m23674f(str, "keyword");
        Bundle bundle = new Bundle();
        d.a aVar = d.f27911a;
        String m29180k = aVar.m29180k();
        C1466m0 c1466m0 = C1466m0.f5627a;
        bundle.putString(m29180k, c1466m0.m6885t());
        bundle.putString(aVar.m29184o(), c1466m0.m6878m());
        bundle.putString(aVar.m29181l(), f27889d.format(new Date()));
        String m29171b = aVar.m29171b();
        AbstractApplicationC6253c.a aVar2 = AbstractApplicationC6253c.f24484b;
        bundle.putInt(m29171b, AbstractC5085b.m20602l(aVar2.m24887a()));
        bundle.putString("search_keyword", str);
        bundle.putInt("search_entrance", i10);
        FirebaseAnalytics.getInstance(aVar2.m24887a()).m10840a("EVENT_ENTER_VOD_DETAIL_ON_SEARCH", bundle);
    }
}
