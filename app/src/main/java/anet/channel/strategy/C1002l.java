package anet.channel.strategy;

import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.taobao.accs.utl.BaseMonitor;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: anet.channel.strategy.l */
/* loaded from: classes.dex */
public class C1002l {

    /* renamed from: anet.channel.strategy.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f4147a;

        /* renamed from: b */
        public final String f4148b;

        /* renamed from: c */
        public final int f4149c;

        /* renamed from: d */
        public final int f4150d;

        /* renamed from: e */
        public final int f4151e;

        /* renamed from: f */
        public final int f4152f;

        /* renamed from: g */
        public final String f4153g;

        /* renamed from: h */
        public final String f4154h;

        public a(JSONObject jSONObject) {
            this.f4147a = jSONObject.optInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            this.f4148b = jSONObject.optString("protocol");
            this.f4149c = jSONObject.optInt("cto");
            this.f4150d = jSONObject.optInt("rto");
            this.f4151e = jSONObject.optInt("retry");
            this.f4152f = jSONObject.optInt("heartbeat");
            this.f4153g = jSONObject.optString("rtt", "");
            this.f4154h = jSONObject.optString("publickey");
        }
    }

    /* renamed from: anet.channel.strategy.l$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final String f4155a;

        /* renamed from: b */
        public final int f4156b;

        /* renamed from: c */
        public final String f4157c;

        /* renamed from: d */
        public final String f4158d;

        /* renamed from: e */
        public final String f4159e;

        /* renamed from: f */
        public final String[] f4160f;

        /* renamed from: g */
        public final String[] f4161g;

        /* renamed from: h */
        public final a[] f4162h;

        /* renamed from: i */
        public final e[] f4163i;

        /* renamed from: j */
        public final boolean f4164j;

        /* renamed from: k */
        public final boolean f4165k;

        /* renamed from: l */
        public final int f4166l;

        public b(JSONObject jSONObject) {
            this.f4155a = jSONObject.optString("host");
            this.f4156b = jSONObject.optInt("ttl");
            this.f4157c = jSONObject.optString("safeAisles");
            this.f4158d = jSONObject.optString("cname", null);
            this.f4159e = jSONObject.optString("unit", null);
            this.f4164j = jSONObject.optInt("clear") == 1;
            this.f4165k = jSONObject.optBoolean("effectNow");
            this.f4166l = jSONObject.optInt("version");
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f4160f = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.f4160f[i10] = optJSONArray.optString(i10);
                }
            } else {
                this.f4160f = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("sips");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                int length2 = optJSONArray2.length();
                this.f4161g = new String[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    this.f4161g[i11] = optJSONArray2.optString(i11);
                }
            } else {
                this.f4161g = null;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("aisles");
            if (optJSONArray3 != null) {
                int length3 = optJSONArray3.length();
                this.f4162h = new a[length3];
                for (int i12 = 0; i12 < length3; i12++) {
                    this.f4162h[i12] = new a(optJSONArray3.optJSONObject(i12));
                }
            } else {
                this.f4162h = null;
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("strategies");
            if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                int length4 = optJSONArray4.length();
                this.f4163i = new e[length4];
                for (int i13 = 0; i13 < length4; i13++) {
                    this.f4163i[i13] = new e(optJSONArray4.optJSONObject(i13));
                }
                return;
            }
            this.f4163i = null;
        }
    }

    /* renamed from: anet.channel.strategy.l$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final String f4167a;

        /* renamed from: b */
        public final e[] f4168b;

        public c(JSONObject jSONObject) {
            this.f4167a = jSONObject.optString("host");
            JSONArray optJSONArray = jSONObject.optJSONArray("strategies");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f4168b = new e[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.f4168b[i10] = new e(optJSONArray.optJSONObject(i10));
                }
                return;
            }
            this.f4168b = null;
        }
    }

    /* renamed from: anet.channel.strategy.l$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final String f4169a;

        /* renamed from: b */
        public final b[] f4170b;

        /* renamed from: c */
        public final c[] f4171c;

        /* renamed from: d */
        public final String f4172d;

        /* renamed from: e */
        public final String f4173e;

        /* renamed from: f */
        public final int f4174f;

        /* renamed from: g */
        public final int f4175g;

        /* renamed from: h */
        public final int f4176h;

        public d(JSONObject jSONObject) {
            this.f4169a = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            this.f4172d = jSONObject.optString("uid", null);
            this.f4173e = jSONObject.optString("utdid", null);
            this.f4174f = jSONObject.optInt(DispatchConstants.CONFIG_VERSION);
            this.f4175g = jSONObject.optInt("fcl");
            this.f4176h = jSONObject.optInt("fct");
            JSONArray optJSONArray = jSONObject.optJSONArray(BaseMonitor.COUNT_POINT_DNS);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f4170b = new b[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.f4170b[i10] = new b(optJSONArray.optJSONObject(i10));
                }
            } else {
                this.f4170b = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                this.f4171c = new c[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    this.f4171c[i11] = new c(optJSONArray2.optJSONObject(i11));
                }
                return;
            }
            this.f4171c = null;
        }
    }

    /* renamed from: anet.channel.strategy.l$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final String f4177a;

        /* renamed from: b */
        public final a f4178b;

        /* renamed from: c */
        public final String f4179c;

        public e(JSONObject jSONObject) {
            this.f4177a = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            this.f4179c = jSONObject.optString("path");
            this.f4178b = new a(jSONObject);
        }
    }

    /* renamed from: a */
    public static d m4761a(JSONObject jSONObject) {
        try {
            return new d(jSONObject);
        } catch (Exception e10) {
            ALog.m4786e("StrategyResultParser", "Parse HttpDns response failed.", null, e10, "JSON Content", jSONObject.toString());
            return null;
        }
    }
}
