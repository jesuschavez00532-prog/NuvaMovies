package com.google.android.gms.internal.measurement;

import anet.channel.util.HttpConstant;
import com.lzy.okgo.OkGo;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: com.google.android.gms.internal.measurement.ub */
/* loaded from: classes.dex */
public final class C2150ub implements InterfaceC2135tb {

    /* renamed from: A */
    public static final AbstractC2220z6 f8147A;

    /* renamed from: B */
    public static final AbstractC2220z6 f8148B;

    /* renamed from: C */
    public static final AbstractC2220z6 f8149C;

    /* renamed from: D */
    public static final AbstractC2220z6 f8150D;

    /* renamed from: E */
    public static final AbstractC2220z6 f8151E;

    /* renamed from: F */
    public static final AbstractC2220z6 f8152F;

    /* renamed from: G */
    public static final AbstractC2220z6 f8153G;

    /* renamed from: H */
    public static final AbstractC2220z6 f8154H;

    /* renamed from: I */
    public static final AbstractC2220z6 f8155I;

    /* renamed from: J */
    public static final AbstractC2220z6 f8156J;

    /* renamed from: K */
    public static final AbstractC2220z6 f8157K;

    /* renamed from: L */
    public static final AbstractC2220z6 f8158L;

    /* renamed from: M */
    public static final AbstractC2220z6 f8159M;

    /* renamed from: a */
    public static final AbstractC2220z6 f8160a;

    /* renamed from: b */
    public static final AbstractC2220z6 f8161b;

    /* renamed from: c */
    public static final AbstractC2220z6 f8162c;

    /* renamed from: d */
    public static final AbstractC2220z6 f8163d;

    /* renamed from: e */
    public static final AbstractC2220z6 f8164e;

    /* renamed from: f */
    public static final AbstractC2220z6 f8165f;

    /* renamed from: g */
    public static final AbstractC2220z6 f8166g;

    /* renamed from: h */
    public static final AbstractC2220z6 f8167h;

    /* renamed from: i */
    public static final AbstractC2220z6 f8168i;

    /* renamed from: j */
    public static final AbstractC2220z6 f8169j;

    /* renamed from: k */
    public static final AbstractC2220z6 f8170k;

    /* renamed from: l */
    public static final AbstractC2220z6 f8171l;

    /* renamed from: m */
    public static final AbstractC2220z6 f8172m;

    /* renamed from: n */
    public static final AbstractC2220z6 f8173n;

    /* renamed from: o */
    public static final AbstractC2220z6 f8174o;

    /* renamed from: p */
    public static final AbstractC2220z6 f8175p;

    /* renamed from: q */
    public static final AbstractC2220z6 f8176q;

    /* renamed from: r */
    public static final AbstractC2220z6 f8177r;

    /* renamed from: s */
    public static final AbstractC2220z6 f8178s;

    /* renamed from: t */
    public static final AbstractC2220z6 f8179t;

    /* renamed from: u */
    public static final AbstractC2220z6 f8180u;

    /* renamed from: v */
    public static final AbstractC2220z6 f8181v;

    /* renamed from: w */
    public static final AbstractC2220z6 f8182w;

    /* renamed from: x */
    public static final AbstractC2220z6 f8183x;

    /* renamed from: y */
    public static final AbstractC2220z6 f8184y;

    /* renamed from: z */
    public static final AbstractC2220z6 f8185z;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9037a();
        f8160a = m9037a.m9040d("measurement.ad_id_cache_time", 10000L);
        f8161b = m9037a.m9040d("measurement.max_bundles_per_iteration", 100L);
        f8162c = m9037a.m9040d("measurement.config.cache_time", 86400000L);
        f8163d = m9037a.m9041e("measurement.log_tag", "FA");
        f8164e = m9037a.m9041e("measurement.config.url_authority", "app-measurement.com");
        f8165f = m9037a.m9041e("measurement.config.url_scheme", HttpConstant.HTTPS);
        f8166g = m9037a.m9040d("measurement.upload.debug_upload_interval", 1000L);
        f8167h = m9037a.m9040d("measurement.lifetimevalue.max_currency_tracked", 4L);
        f8168i = m9037a.m9040d("measurement.store.max_stored_events_per_app", 100000L);
        f8169j = m9037a.m9040d("measurement.experiment.max_ids", 50L);
        f8170k = m9037a.m9040d("measurement.audience.filter_result_max_count", 200L);
        f8171l = m9037a.m9040d("measurement.alarm_manager.minimum_interval", OkGo.DEFAULT_MILLISECONDS);
        f8172m = m9037a.m9040d("measurement.upload.minimum_delay", 500L);
        f8173n = m9037a.m9040d("measurement.monitoring.sample_period_millis", 86400000L);
        f8174o = m9037a.m9040d("measurement.upload.realtime_upload_interval", 10000L);
        f8175p = m9037a.m9040d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f8176q = m9037a.m9040d("measurement.config.cache_time.service", 3600000L);
        f8177r = m9037a.m9040d("measurement.service_client.idle_disconnect_millis", 5000L);
        f8178s = m9037a.m9041e("measurement.log_tag.service", "FA-SVC");
        f8179t = m9037a.m9040d("measurement.upload.stale_data_deletion_interval", 86400000L);
        f8180u = m9037a.m9040d("measurement.sdk.attribution.cache.ttl", 604800000L);
        f8181v = m9037a.m9040d("measurement.redaction.app_instance_id.ttl", 7200000L);
        f8182w = m9037a.m9040d("measurement.upload.backoff_period", 43200000L);
        f8183x = m9037a.m9040d("measurement.upload.initial_upload_delay_time", 15000L);
        f8184y = m9037a.m9040d("measurement.upload.interval", 3600000L);
        f8185z = m9037a.m9040d("measurement.upload.max_bundle_size", IjkMediaMeta.AV_CH_TOP_BACK_CENTER);
        f8147A = m9037a.m9040d("measurement.upload.max_bundles", 100L);
        f8148B = m9037a.m9040d("measurement.upload.max_conversions_per_day", 500L);
        f8149C = m9037a.m9040d("measurement.upload.max_error_events_per_day", 1000L);
        f8150D = m9037a.m9040d("measurement.upload.max_events_per_bundle", 1000L);
        f8151E = m9037a.m9040d("measurement.upload.max_events_per_day", 100000L);
        f8152F = m9037a.m9040d("measurement.upload.max_public_events_per_day", 50000L);
        f8153G = m9037a.m9040d("measurement.upload.max_queue_time", 2419200000L);
        f8154H = m9037a.m9040d("measurement.upload.max_realtime_events_per_day", 10L);
        f8155I = m9037a.m9040d("measurement.upload.max_batch_size", IjkMediaMeta.AV_CH_TOP_BACK_CENTER);
        f8156J = m9037a.m9040d("measurement.upload.retry_count", 6L);
        f8157K = m9037a.m9040d("measurement.upload.retry_time", 1800000L);
        f8158L = m9037a.m9041e("measurement.upload.url", "https://app-measurement.com/a");
        f8159M = m9037a.m9040d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: A */
    public final String mo8968A() {
        return (String) f8158L.m9396b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: B */
    public final long mo8969B() {
        return ((Long) f8153G.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: C */
    public final long mo8970C() {
        return ((Long) f8185z.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: D */
    public final long mo8971D() {
        return ((Long) f8147A.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: E */
    public final long mo8972E() {
        return ((Long) f8154H.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: F */
    public final String mo8973F() {
        return (String) f8164e.m9396b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: G */
    public final long mo8974G() {
        return ((Long) f8183x.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: H */
    public final String mo8975H() {
        return (String) f8165f.m9396b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: I */
    public final long mo8976I() {
        return ((Long) f8152F.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: J */
    public final long mo8977J() {
        return ((Long) f8184y.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: a */
    public final long mo8978a() {
        return ((Long) f8160a.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: b */
    public final long mo8979b() {
        return ((Long) f8167h.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: c */
    public final long mo8980c() {
        return ((Long) f8177r.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: d */
    public final long mo8981d() {
        return ((Long) f8168i.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: e */
    public final long mo8982e() {
        return ((Long) f8161b.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: f */
    public final long mo8983f() {
        return ((Long) f8162c.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: g */
    public final long mo8984g() {
        return ((Long) f8166g.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: h */
    public final long mo8985h() {
        return ((Long) f8170k.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: i */
    public final long mo8986i() {
        return ((Long) f8171l.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: j */
    public final long mo8987j() {
        return ((Long) f8169j.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: k */
    public final long mo8988k() {
        return ((Long) f8174o.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: l */
    public final long mo8989l() {
        return ((Long) f8172m.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: m */
    public final long mo8990m() {
        return ((Long) f8173n.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: n */
    public final long mo8991n() {
        return ((Long) f8179t.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: o */
    public final long mo8992o() {
        return ((Long) f8175p.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: p */
    public final long mo8993p() {
        return ((Long) f8180u.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: q */
    public final long mo8994q() {
        return ((Long) f8157K.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: r */
    public final long mo8995r() {
        return ((Long) f8150D.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: s */
    public final long mo8996s() {
        return ((Long) f8181v.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: t */
    public final long mo8997t() {
        return ((Long) f8151E.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: u */
    public final long mo8998u() {
        return ((Long) f8159M.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: v */
    public final long mo8999v() {
        return ((Long) f8182w.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: w */
    public final long mo9000w() {
        return ((Long) f8148B.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: x */
    public final long mo9001x() {
        return ((Long) f8155I.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: y */
    public final long mo9002y() {
        return ((Long) f8156J.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2135tb
    /* renamed from: z */
    public final long mo9003z() {
        return ((Long) f8149C.m9396b()).longValue();
    }
}
