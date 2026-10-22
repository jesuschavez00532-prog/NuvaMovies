package com.google.android.gms.measurement.internal;

import android.content.Context;
import anet.channel.util.HttpConstant;
import com.google.android.gms.internal.measurement.AbstractC2040n6;
import com.google.android.gms.internal.measurement.AbstractC2220z6;
import com.google.android.gms.internal.measurement.C1846ad;
import com.google.android.gms.internal.measurement.C1855b6;
import com.google.android.gms.internal.measurement.C1861bc;
import com.google.android.gms.internal.measurement.C1894dd;
import com.google.android.gms.internal.measurement.C1909ec;
import com.google.android.gms.internal.measurement.C1942gd;
import com.google.android.gms.internal.measurement.C1971ic;
import com.google.android.gms.internal.measurement.C2002kd;
import com.google.android.gms.internal.measurement.C2016lc;
import com.google.android.gms.internal.measurement.C2030mb;
import com.google.android.gms.internal.measurement.C2047nd;
import com.google.android.gms.internal.measurement.C2061oc;
import com.google.android.gms.internal.measurement.C2075pb;
import com.google.android.gms.internal.measurement.C2092qd;
import com.google.android.gms.internal.measurement.C2106rc;
import com.google.android.gms.internal.measurement.C2120sb;
import com.google.android.gms.internal.measurement.C2137td;
import com.google.android.gms.internal.measurement.C2151uc;
import com.google.android.gms.internal.measurement.C2165vb;
import com.google.android.gms.internal.measurement.C2196xc;
import com.google.android.gms.internal.measurement.C2210yb;
import com.lzy.okgo.OkGo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.c3 */
/* loaded from: classes.dex */
public abstract class AbstractC2260c3 {

    /* renamed from: A */
    public static final C2249b3 f8416A;

    /* renamed from: A0 */
    public static final C2249b3 f8417A0;

    /* renamed from: B */
    public static final C2249b3 f8418B;

    /* renamed from: B0 */
    public static final C2249b3 f8419B0;

    /* renamed from: C */
    public static final C2249b3 f8420C;

    /* renamed from: C0 */
    public static final C2249b3 f8421C0;

    /* renamed from: D */
    public static final C2249b3 f8422D;

    /* renamed from: D0 */
    public static final C2249b3 f8423D0;

    /* renamed from: E */
    public static final C2249b3 f8424E;

    /* renamed from: F */
    public static final C2249b3 f8425F;

    /* renamed from: G */
    public static final C2249b3 f8426G;

    /* renamed from: H */
    public static final C2249b3 f8427H;

    /* renamed from: I */
    public static final C2249b3 f8428I;

    /* renamed from: J */
    public static final C2249b3 f8429J;

    /* renamed from: K */
    public static final C2249b3 f8430K;

    /* renamed from: L */
    public static final C2249b3 f8431L;

    /* renamed from: M */
    public static final C2249b3 f8432M;

    /* renamed from: N */
    public static final C2249b3 f8433N;

    /* renamed from: O */
    public static final C2249b3 f8434O;

    /* renamed from: P */
    public static final C2249b3 f8435P;

    /* renamed from: Q */
    public static final C2249b3 f8436Q;

    /* renamed from: R */
    public static final C2249b3 f8437R;

    /* renamed from: S */
    public static final C2249b3 f8438S;

    /* renamed from: T */
    public static final C2249b3 f8439T;

    /* renamed from: U */
    public static final C2249b3 f8440U;

    /* renamed from: V */
    public static final C2249b3 f8441V;

    /* renamed from: W */
    public static final C2249b3 f8442W;

    /* renamed from: X */
    public static final C2249b3 f8443X;

    /* renamed from: Y */
    public static final C2249b3 f8444Y;

    /* renamed from: Z */
    public static final C2249b3 f8445Z;

    /* renamed from: a0 */
    public static final C2249b3 f8447a0;

    /* renamed from: b0 */
    public static final C2249b3 f8449b0;

    /* renamed from: c0 */
    public static final C2249b3 f8451c0;

    /* renamed from: d0 */
    public static final C2249b3 f8453d0;

    /* renamed from: e0 */
    public static final C2249b3 f8455e0;

    /* renamed from: f0 */
    public static final C2249b3 f8457f0;

    /* renamed from: g0 */
    public static final C2249b3 f8459g0;

    /* renamed from: h0 */
    public static final C2249b3 f8461h0;

    /* renamed from: i0 */
    public static final C2249b3 f8463i0;

    /* renamed from: j0 */
    public static final C2249b3 f8465j0;

    /* renamed from: k0 */
    public static final C2249b3 f8467k0;

    /* renamed from: l0 */
    public static final C2249b3 f8469l0;

    /* renamed from: m0 */
    public static final C2249b3 f8471m0;

    /* renamed from: n0 */
    public static final C2249b3 f8473n0;

    /* renamed from: o0 */
    public static final C2249b3 f8475o0;

    /* renamed from: p0 */
    public static final C2249b3 f8477p0;

    /* renamed from: q0 */
    public static final C2249b3 f8479q0;

    /* renamed from: r0 */
    public static final C2249b3 f8481r0;

    /* renamed from: s0 */
    public static final C2249b3 f8483s0;

    /* renamed from: t0 */
    public static final C2249b3 f8485t0;

    /* renamed from: u0 */
    public static final C2249b3 f8487u0;

    /* renamed from: v0 */
    public static final C2249b3 f8489v0;

    /* renamed from: w0 */
    public static final C2249b3 f8491w0;

    /* renamed from: x0 */
    public static final C2249b3 f8493x0;

    /* renamed from: y */
    public static final C2249b3 f8494y;

    /* renamed from: y0 */
    public static final C2249b3 f8495y0;

    /* renamed from: z */
    public static final C2249b3 f8496z;

    /* renamed from: z0 */
    public static final C2249b3 f8497z0;

    /* renamed from: a */
    private static final List f8446a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final Set f8448b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final C2249b3 f8450c = m9514a("measurement.ad_id_cache_time", 10000L, 10000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.i0
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8937n());
        }
    });

    /* renamed from: d */
    public static final C2249b3 f8452d = m9514a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.a0
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8947x());
        }
    });

    /* renamed from: e */
    public static final C2249b3 f8454e = m9514a("measurement.config.cache_time", 86400000L, 3600000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.m0
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8939p());
        }
    });

    /* renamed from: f */
    public static final C2249b3 f8456f = m9514a("measurement.config.url_scheme", HttpConstant.HTTPS, HttpConstant.HTTPS, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.y0
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return C2120sb.m8935l();
        }
    });

    /* renamed from: g */
    public static final C2249b3 f8458g = m9514a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.l1
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return C2120sb.m8934k();
        }
    });

    /* renamed from: h */
    public static final C2249b3 f8460h = m9514a("measurement.upload.max_bundles", 100, 100, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.x1
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8922I());
        }
    });

    /* renamed from: i */
    public static final C2249b3 f8462i = m9514a("measurement.upload.max_batch_size", 65536, 65536, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.k2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8930f());
        }
    });

    /* renamed from: j */
    public static final C2249b3 f8464j = m9514a("measurement.upload.max_bundle_size", 65536, 65536, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.s2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8921H());
        }
    });

    /* renamed from: k */
    public static final C2249b3 f8466k = m9514a("measurement.upload.max_events_per_bundle", 1000, 1000, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.t2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8925L());
        }
    });

    /* renamed from: l */
    public static final C2249b3 f8468l = m9514a("measurement.upload.max_events_per_day", 100000, 100000, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.u2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8926b());
        }
    });

    /* renamed from: m */
    public static final C2249b3 f8470m = m9514a("measurement.upload.max_error_events_per_day", 1000, 1000, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.t0
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8924K());
        }
    });

    /* renamed from: n */
    public static final C2249b3 f8472n = m9514a("measurement.upload.max_public_events_per_day", 50000, 50000, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.f1
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8927c());
        }
    });

    /* renamed from: o */
    public static final C2249b3 f8474o = m9514a("measurement.upload.max_conversions_per_day", 10000, 10000, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.q1
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8923J());
        }
    });

    /* renamed from: p */
    public static final C2249b3 f8476p = m9514a("measurement.upload.max_realtime_events_per_day", 10, 10, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.c2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8929e());
        }
    });

    /* renamed from: q */
    public static final C2249b3 f8478q = m9514a("measurement.store.max_stored_events_per_app", 100000, 100000, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.n2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Integer.valueOf((int) C2120sb.m8942s());
        }
    });

    /* renamed from: r */
    public static final C2249b3 f8480r = m9514a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.v2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return C2120sb.m8936m();
        }
    });

    /* renamed from: s */
    public static final C2249b3 f8482s = m9514a("measurement.upload.backoff_period", 43200000L, 43200000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.w2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8918E());
        }
    });

    /* renamed from: t */
    public static final C2249b3 f8484t = m9514a("measurement.upload.window_interval", 3600000L, 3600000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.x2
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8933i());
        }
    });

    /* renamed from: u */
    public static final C2249b3 f8486u = m9514a("measurement.upload.interval", 3600000L, 3600000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.x
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8920G());
        }
    });

    /* renamed from: v */
    public static final C2249b3 f8488v = m9514a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.z
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8948y());
        }
    });

    /* renamed from: w */
    public static final C2249b3 f8490w = m9514a("measurement.upload.debug_upload_interval", 1000L, 1000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.b0
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8940q());
        }
    });

    /* renamed from: x */
    public static final C2249b3 f8492x = m9514a("measurement.upload.minimum_delay", 500L, 500L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.c0
        @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
        /* renamed from: a */
        public final Object mo9418a() {
            C2249b3 c2249b3 = AbstractC2260c3.f8450c;
            return Long.valueOf(C2120sb.m8946w());
        }
    });

    static {
        Long valueOf = Long.valueOf(OkGo.DEFAULT_MILLISECONDS);
        f8494y = m9514a("measurement.alarm_manager.minimum_interval", valueOf, valueOf, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.d0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8945v());
            }
        });
        f8496z = m9514a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8915B());
            }
        });
        f8416A = m9514a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8949z());
            }
        });
        f8418B = m9514a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8919F());
            }
        });
        f8420C = m9514a("measurement.upload.retry_time", 1800000L, 1800000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8932h());
            }
        });
        f8422D = m9514a("measurement.upload.retry_count", 6, 6, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Integer.valueOf((int) C2120sb.m8931g());
            }
        });
        f8424E = m9514a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8928d());
            }
        });
        f8425F = m9514a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Integer.valueOf((int) C2120sb.m8941r());
            }
        });
        f8426G = m9514a("measurement.audience.filter_result_max_count", 200, 200, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Integer.valueOf((int) C2120sb.m8944u());
            }
        });
        f8427H = m9514a("measurement.upload.max_public_user_properties", 25, 25, null);
        f8428I = m9514a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        f8429J = m9514a("measurement.upload.max_public_event_params", 25, 25, null);
        f8430K = m9514a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8914A());
            }
        });
        Boolean bool = Boolean.FALSE;
        f8431L = m9514a("measurement.test.boolean_flag", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2196xc.m9190g());
            }
        });
        f8432M = m9514a("measurement.test.string_flag", "---", "---", new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return C2196xc.m9189f();
            }
        });
        f8433N = m9514a("measurement.test.long_flag", -1L, -1L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2196xc.m9188d());
            }
        });
        f8434O = m9514a("measurement.test.int_flag", -2, -2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Integer.valueOf((int) C2196xc.m9187c());
            }
        });
        Double valueOf2 = Double.valueOf(-3.0d);
        f8435P = m9514a("measurement.test.double_flag", valueOf2, valueOf2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Double.valueOf(C2196xc.m9186b());
            }
        });
        f8436Q = m9514a("measurement.experiment.max_ids", 50, 50, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.v0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Integer.valueOf((int) C2120sb.m8943t());
            }
        });
        f8437R = m9514a("measurement.max_bundles_per_iteration", 100, 100, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Integer.valueOf((int) C2120sb.m8938o());
            }
        });
        f8438S = m9514a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.x0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8916C());
            }
        });
        f8439T = m9514a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.a1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Long.valueOf(C2120sb.m8917D());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f8440U = m9514a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1846ad.m8104c());
            }
        });
        f8441V = m9514a("measurement.quality.checksum", bool, bool, null);
        f8442W = m9514a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1909ec.m8327e());
            }
        });
        f8443X = m9514a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1909ec.m8326d());
            }
        });
        f8444Y = m9514a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1909ec.m8328f());
            }
        });
        f8445Z = m9514a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2092qd.m8862c());
            }
        });
        f8447a0 = m9514a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2106rc.m8907c());
            }
        });
        f8449b0 = m9514a("measurement.lifecycle.app_in_background_parameter", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2151uc.m9020c());
            }
        });
        f8451c0 = m9514a("measurement.integration.disable_firebase_instance_id", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.j1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2047nd.m8744d());
            }
        });
        f8453d0 = m9514a("measurement.collection.service.update_with_analytics_fix", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2137td.m9004c());
            }
        });
        f8455e0 = m9514a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1861bc.m8150d());
            }
        });
        f8457f0 = m9514a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2016lc.m8666d());
            }
        });
        f8459g0 = m9514a("measurement.collection.synthetic_data_mitigation", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2002kd.m8609c());
            }
        });
        f8461h0 = m9514a("measurement.service.storage_consent_support_version", 203600, 203600, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.p1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Integer.valueOf((int) C2165vb.m9054b());
            }
        });
        f8463i0 = m9514a("measurement.client.click_identifier_control.dev", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2030mb.m8708c());
            }
        });
        f8465j0 = m9514a("measurement.service.click_identifier_control", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2075pb.m8770c());
            }
        });
        f8467k0 = m9514a("measurement.service.store_null_safelist", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2210yb.m9364d());
            }
        });
        f8469l0 = m9514a("measurement.service.store_safelist", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2210yb.m9365e());
            }
        });
        f8471m0 = m9514a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.v1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8270l());
            }
        });
        f8473n0 = m9514a("measurement.redaction.config_redacted_fields", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.w1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8264f());
            }
        });
        f8475o0 = m9514a("measurement.redaction.upload_redacted_fields", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.y1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8273o());
            }
        });
        f8477p0 = m9514a("measurement.redaction.upload_subdomain_override", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.z1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8274p());
            }
        });
        f8479q0 = m9514a("measurement.redaction.device_info", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.b2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8265g());
            }
        });
        f8481r0 = m9514a("measurement.redaction.user_id", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.d2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8275q());
            }
        });
        f8483s0 = m9514a("measurement.redaction.google_signals", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.e2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8269k());
            }
        });
        f8485t0 = m9514a("measurement.collection.enable_session_stitching_token.service", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.f2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1942gd.m8474e());
            }
        });
        f8487u0 = m9514a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.g2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1942gd.m8473d());
            }
        });
        f8489v0 = m9514a("measurement.redaction.app_instance_id", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.h2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8262d());
            }
        });
        f8491w0 = m9514a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.i2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8268j());
            }
        });
        f8493x0 = m9514a("measurement.redaction.enhanced_uid", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.j2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8267i());
            }
        });
        f8495y0 = m9514a("measurement.redaction.e_tag", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8266h());
            }
        });
        f8497z0 = m9514a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.m2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8263e());
            }
        });
        f8417A0 = m9514a("measurement.redaction.retain_major_os_version", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.o2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8271m());
            }
        });
        f8419B0 = m9514a("measurement.redaction.scion_payload_generator", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.p2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1894dd.m8272n());
            }
        });
        f8421C0 = m9514a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.q2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C1971ic.m8533d());
            }
        });
        f8423D0 = m9514a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new InterfaceC2501y2() { // from class: com.google.android.gms.measurement.internal.r2
            @Override // com.google.android.gms.measurement.internal.InterfaceC2501y2
            /* renamed from: a */
            public final Object mo9418a() {
                C2249b3 c2249b3 = AbstractC2260c3.f8450c;
                return Boolean.valueOf(C2061oc.m8758d());
            }
        });
    }

    /* renamed from: a */
    static C2249b3 m9514a(String str, Object obj, Object obj2, InterfaceC2501y2 interfaceC2501y2) {
        C2249b3 c2249b3 = new C2249b3(str, obj, obj2, interfaceC2501y2, null);
        f8446a.add(c2249b3);
        return c2249b3;
    }

    /* renamed from: c */
    public static Map m9516c(Context context) {
        C1855b6 m8134b = C1855b6.m8134b(context.getContentResolver(), AbstractC2040n6.m8736a("com.google.android.gms.measurement"), new Runnable() { // from class: b5.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2220z6.m9394d();
            }
        });
        if (m8134b == null) {
            return Collections.emptyMap();
        }
        return m8134b.m8137c();
    }
}
