package p418yc;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cookie.SerializableCookie;
import com.titan.ranger.NativeJni;
import com.titan.ranger.bean.Env;
import com.titan.ranger.bean.Program;
import com.titan.thumbnail.PreviewUtil;
import com.titan.thumbnail.ThumbnailCallback;
import com.titan.thumbnail.ThumbnailRequest;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3325bt;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5879v;
import ne.C5872o;
import p357uc.C7076c;
import p386wc.InterfaceC7392a;
import p386wc.InterfaceC7393b;
import p402xc.C7629a;
import p432zc.AbstractC7781a;
import se.InterfaceC6869f;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import vc.EnumC7255c;
import vc.EnumC7256d;
import vc.EnumC7257e;

/* renamed from: yc.h */
/* loaded from: classes.dex */
public final class C7705h {

    /* renamed from: k */
    private static final InterfaceC1312h f28254k;

    /* renamed from: l */
    private static String f28255l;

    /* renamed from: m */
    public static final b f28256m = new b(null);

    /* renamed from: a */
    private final String f28257a;

    /* renamed from: b */
    private final C7702e[] f28258b;

    /* renamed from: c */
    private String f28259c;

    /* renamed from: d */
    private C7629a f28260d;

    /* renamed from: e */
    private InterfaceC7392a f28261e;

    /* renamed from: f */
    private InterfaceC7393b f28262f;

    /* renamed from: g */
    private Env f28263g;

    /* renamed from: h */
    private volatile boolean f28264h;

    /* renamed from: i */
    private HandlerThread f28265i;

    /* renamed from: j */
    private Handler f28266j;

    /* renamed from: yc.h$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f28267a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7705h invoke() {
            return new C7705h(null);
        }
    }

    /* renamed from: yc.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        static final /* synthetic */ InterfaceC6869f[] f28268a = {AbstractC5879v.m23692d(new C5872o(AbstractC5879v.m23690b(b.class), "instance", "getInstance()Lcom/titan/media/TitanPlayer;"))};

        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: b */
        private final C7705h m29770b() {
            InterfaceC1312h interfaceC1312h = C7705h.f28254k;
            InterfaceC6869f interfaceC6869f = f28268a[0];
            return (C7705h) interfaceC1312h.getValue();
        }

        /* renamed from: a */
        public final C7705h m29771a() {
            return m29770b();
        }

        /* renamed from: c */
        public final String m29772c() {
            return C7705h.f28255l;
        }

        /* renamed from: d */
        public final void m29773d(String str) {
            AbstractC5868k.m23675g(str, "<set-?>");
            C7705h.f28255l = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.h$c */
    /* loaded from: classes3.dex */
    public static final class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f28270b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC7392a f28271c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC7393b f28272d;

        c(String str, InterfaceC7392a interfaceC7392a, InterfaceC7393b interfaceC7393b) {
            this.f28270b = str;
            this.f28271c = interfaceC7392a;
            this.f28272d = interfaceC7393b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7705h.this.f28259c = this.f28270b;
            C7705h.this.f28261e = this.f28271c;
            C7705h.this.f28262f = this.f28272d;
            NativeJni.m13097c().m13100f(this.f28270b);
            C7705h.this.m29747s(0);
            C7705h.this.m29747s(1);
            C7705h.this.f28260d = new C7629a(0);
            C7629a c7629a = C7705h.this.f28260d;
            if (c7629a != null) {
                c7629a.m844s(5000, false);
            }
            Log.i(C7705h.this.m29761q(), "========= version =========");
            Log.i(C7705h.this.m29761q(), "titan:2.5.2;ranger:" + NativeJni.f13374d);
        }
    }

    /* renamed from: yc.h$d */
    /* loaded from: classes3.dex */
    static final class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EnumC7256d f28273a;

        /* renamed from: b */
        final /* synthetic */ EnumC7257e f28274b;

        /* renamed from: c */
        final /* synthetic */ EnumC7255c f28275c;

        d(EnumC7256d enumC7256d, EnumC7257e enumC7257e, EnumC7255c enumC7255c) {
            this.f28273a = enumC7256d;
            this.f28274b = enumC7257e;
            this.f28275c = enumC7255c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NativeJni.m13097c().m13107m(this.f28273a.m28089a(), this.f28274b.m28090a(), this.f28275c.m28088a());
        }
    }

    /* renamed from: yc.h$e */
    /* loaded from: classes3.dex */
    static final class e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28277b;

        /* renamed from: c */
        final /* synthetic */ String f28278c;

        e(int i10, String str) {
            this.f28277b = i10;
            this.f28278c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e c7702e = C7705h.this.f28258b[this.f28277b];
            if (c7702e != null) {
                c7702e.m29688s0(this.f28278c);
            }
        }
    }

    /* renamed from: yc.h$f */
    /* loaded from: classes3.dex */
    static final class f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28280b;

        /* renamed from: c */
        final /* synthetic */ String f28281c;

        /* renamed from: d */
        final /* synthetic */ Program f28282d;

        /* renamed from: e */
        final /* synthetic */ String f28283e;

        f(int i10, String str, Program program, String str2) {
            this.f28280b = i10;
            this.f28281c = str;
            this.f28282d = program;
            this.f28283e = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e c7702e = C7705h.this.f28258b[this.f28280b];
            if (c7702e != null) {
                c7702e.m29689t0(this.f28281c, this.f28282d, this.f28283e);
            }
        }
    }

    /* renamed from: yc.h$g */
    /* loaded from: classes3.dex */
    static final class g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28285b;

        /* renamed from: c */
        final /* synthetic */ String f28286c;

        g(int i10, String str) {
            this.f28285b = i10;
            this.f28286c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e c7702e = C7705h.this.f28258b[this.f28285b];
            if (c7702e != null) {
                c7702e.m29691z0(this.f28286c);
            }
        }
    }

    /* renamed from: yc.h$h */
    /* loaded from: classes3.dex */
    static final class h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28288b;

        /* renamed from: c */
        final /* synthetic */ String f28289c;

        /* renamed from: d */
        final /* synthetic */ long f28290d;

        h(int i10, String str, long j10) {
            this.f28288b = i10;
            this.f28289c = str;
            this.f28290d = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e c7702e = C7705h.this.f28258b[this.f28288b];
            if (c7702e != null) {
                c7702e.m29665B0(this.f28289c, this.f28290d);
            }
        }
    }

    /* renamed from: yc.h$i */
    /* loaded from: classes3.dex */
    static final class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f28291a;

        i(List list) {
            this.f28291a = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NativeJni.m13097c().m13112r(AbstractC7781a.m30143a().toJson(this.f28291a));
        }
    }

    /* renamed from: yc.h$j */
    /* loaded from: classes3.dex */
    static final class j implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Env f28293b;

        j(Env env) {
            this.f28293b = env;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            Env env = this.f28293b;
            C7629a c7629a = C7705h.this.f28260d;
            if (c7629a != null) {
                i10 = c7629a.m839j();
            } else {
                i10 = -1;
            }
            env.setTitan_port(i10);
            C7705h.this.m29751C(this.f28293b);
            NativeJni.m13097c().m13114t(AbstractC7781a.m30143a().toJson(this.f28293b));
        }
    }

    /* renamed from: yc.h$k */
    /* loaded from: classes3.dex */
    static final class k implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28295b;

        /* renamed from: c */
        final /* synthetic */ String f28296c;

        /* renamed from: d */
        final /* synthetic */ String f28297d;

        k(int i10, String str, String str2) {
            this.f28295b = i10;
            this.f28296c = str;
            this.f28297d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e c7702e = C7705h.this.f28258b[this.f28295b];
            if (c7702e != null) {
                c7702e.m29671I0(this.f28296c, this.f28297d);
            }
        }
    }

    /* renamed from: yc.h$l */
    /* loaded from: classes3.dex */
    static final class l implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28299b;

        /* renamed from: c */
        final /* synthetic */ String f28300c;

        /* renamed from: d */
        final /* synthetic */ int f28301d;

        l(int i10, String str, int i11) {
            this.f28299b = i10;
            this.f28300c = str;
            this.f28301d = i11;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
        @Override // java.lang.Runnable
        public final void run() {
            String str;
            C7702e c7702e = C7705h.this.f28258b[this.f28299b];
            String str2 = this.f28300c;
            switch (str2.hashCode()) {
                case -2060497896:
                    str = "subtitle";
                    str2.equals(str);
                    return;
                case -1662454116:
                    str = "subtitle_delay";
                    str2.equals(str);
                    return;
                case -1024974996:
                    str = "buffer_time";
                    str2.equals(str);
                    return;
                case -810883302:
                    if (str2.equals("volume") && c7702e != null) {
                        c7702e.m29675O0(this.f28301d);
                        return;
                    }
                    return;
                case -46576386:
                    str = C3325bt.f14208aZ;
                    str2.equals(str);
                    return;
                case 93166550:
                    if (str2.equals("audio") && c7702e != null) {
                        c7702e.m29666C0(this.f28301d);
                        return;
                    }
                    return;
                case 109641799:
                    if (str2.equals("speed") && c7702e != null) {
                        c7702e.m29673L0(this.f28301d);
                        return;
                    }
                    return;
                case 782236819:
                    str = "hdr_map";
                    str2.equals(str);
                    return;
                case 1330532588:
                    if (str2.equals("thumbnail") && c7702e != null) {
                        c7702e.m29668F0(this.f28301d);
                        return;
                    }
                    return;
                case 1689832893:
                    if (str2.equals("polling_period") && c7702e != null) {
                        c7702e.m29672K0(this.f28301d);
                        return;
                    }
                    return;
                case 1943400114:
                    if (str2.equals("mediacodec") && c7702e != null) {
                        c7702e.m29669G0(this.f28301d);
                        return;
                    }
                    return;
                case 2132222038:
                    str = "default_subtitle";
                    str2.equals(str);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: yc.h$m */
    /* loaded from: classes3.dex */
    static final class m implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28303b;

        /* renamed from: c */
        final /* synthetic */ String f28304c;

        /* renamed from: d */
        final /* synthetic */ String f28305d;

        /* renamed from: e */
        final /* synthetic */ Context f28306e;

        /* renamed from: f */
        final /* synthetic */ int f28307f;

        m(int i10, String str, String str2, Context context, int i11) {
            this.f28303b = i10;
            this.f28304c = str;
            this.f28305d = str2;
            this.f28306e = context;
            this.f28307f = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e c7702e = C7705h.this.f28258b[this.f28303b];
            String str = this.f28304c;
            if (str.hashCode() == -985752863 && str.equals("player")) {
                if (c7702e != null) {
                    c7702e.m29670H0(this.f28306e);
                }
                if (!C7705h.this.f28264h && AbstractC5868k.m23669a(this.f28305d, "ijk")) {
                    String loadLibrariesOnce = IjkMediaPlayer.loadLibrariesOnce(null);
                    if (loadLibrariesOnce != null) {
                        NativeJni.m13097c().m13105k(this.f28303b, "onError", 0, 1300, 0L, loadLibrariesOnce);
                    }
                    C7705h.this.f28264h = true;
                    Log.i(C7705h.this.m29761q(), "========= version =========");
                    Log.i(C7705h.this.m29761q(), "ijk:" + IjkMediaPlayer.getIjkVersion() + ";ffmpeg:" + IjkMediaPlayer.getFFVersion());
                    b bVar = C7705h.f28256m;
                    bVar.m29773d(bVar.m29772c() + "-[" + IjkMediaPlayer.getIjkVersion() + "]-[" + IjkMediaPlayer.getFFVersion() + ']');
                }
                if (c7702e != null) {
                    c7702e.m29678U0(this.f28305d, this.f28307f);
                }
            }
        }
    }

    /* renamed from: yc.h$n */
    /* loaded from: classes3.dex */
    static final class n implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28309b;

        /* renamed from: c */
        final /* synthetic */ Surface f28310c;

        /* renamed from: d */
        final /* synthetic */ String f28311d;

        n(int i10, Surface surface, String str) {
            this.f28309b = i10;
            this.f28310c = surface;
            this.f28311d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e c7702e = C7705h.this.f28258b[this.f28309b];
            if (c7702e != null) {
                c7702e.m29674M0(this.f28310c, this.f28311d);
            }
        }
    }

    /* renamed from: yc.h$o */
    /* loaded from: classes3.dex */
    static final class o implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f28313b;

        /* renamed from: c */
        final /* synthetic */ String f28314c;

        o(int i10, String str) {
            this.f28313b = i10;
            this.f28314c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e c7702e = C7705h.this.f28258b[this.f28313b];
            if (c7702e != null) {
                c7702e.m29677T0(this.f28314c);
            }
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f28267a);
        f28254k = m5965b;
        f28255l = "[2.5.2]";
    }

    private C7705h() {
        String simpleName = C7705h.class.getSimpleName();
        AbstractC5868k.m23670b(simpleName, "javaClass.simpleName");
        this.f28257a = simpleName;
        this.f28258b = new C7702e[2];
        this.f28259c = "";
        HandlerThread handlerThread = new HandlerThread("handlerTitan", -4);
        this.f28265i = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.f28265i;
        this.f28266j = new Handler(handlerThread2 != null ? handlerThread2.getLooper() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m29747s(int i10) {
        ThumbnailCallback thumbnailCallback;
        this.f28258b[i10] = new C7702e(i10);
        InterfaceC7392a interfaceC7392a = this.f28261e;
        if (interfaceC7392a != null && this.f28262f != null) {
            C7702e c7702e = this.f28258b[i10];
            if (c7702e != null) {
                if (interfaceC7392a == null) {
                    AbstractC5868k.m23682n();
                }
                InterfaceC7393b interfaceC7393b = this.f28262f;
                if (interfaceC7393b == null) {
                    AbstractC5868k.m23682n();
                }
                c7702e.m29667D0(interfaceC7392a, interfaceC7393b);
            }
            if (i10 == 0) {
                PreviewUtil previewUtil = PreviewUtil.INSTANCE;
                C7702e c7702e2 = this.f28258b[i10];
                ThumbnailCallback thumbnailCallback2 = null;
                if (c7702e2 != null) {
                    thumbnailCallback = c7702e2.m29686h0();
                } else {
                    thumbnailCallback = null;
                }
                previewUtil.setPreviewCallback(thumbnailCallback);
                ThumbnailRequest thumbnailRequest = ThumbnailRequest.INSTANCE;
                C7702e c7702e3 = this.f28258b[i10];
                if (c7702e3 != null) {
                    thumbnailCallback2 = c7702e3.m29686h0();
                }
                thumbnailRequest.setThumbnailCallback(thumbnailCallback2);
            }
        }
    }

    /* renamed from: w */
    private final void m29748w(Runnable runnable) {
        Handler handler = this.f28266j;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: A */
    public final void m29749A(List list) {
        AbstractC5868k.m23675g(list, "entries");
        m29748w(new i(list));
    }

    /* renamed from: B */
    public final void m29750B(Env env) {
        AbstractC5868k.m23675g(env, C3309bd.f14094a);
        m29748w(new j(env));
    }

    /* renamed from: C */
    public final void m29751C(Env env) {
        this.f28263g = env;
    }

    /* renamed from: D */
    public final void m29752D(int i10, String str, String str2) {
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        AbstractC5868k.m23675g(str2, "media");
        m29748w(new k(i10, str, str2));
    }

    /* renamed from: E */
    public final void m29753E(int i10, String str, int i11) {
        AbstractC5868k.m23675g(str, CacheEntity.KEY);
        m29748w(new l(i10, str, i11));
    }

    /* renamed from: F */
    public final void m29754F(int i10, String str, String str2, Context context, int i11) {
        AbstractC5868k.m23675g(str, CacheEntity.KEY);
        AbstractC5868k.m23675g(str2, "value");
        m29748w(new m(i10, str, str2, context, i11));
    }

    /* renamed from: G */
    public final void m29755G(int i10, Surface surface, String str) {
        AbstractC5868k.m23675g(str, "surfaceId");
        m29748w(new n(i10, surface, str));
    }

    /* renamed from: H */
    public final void m29756H(int i10, String str) {
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        m29748w(new o(i10, str));
    }

    /* renamed from: m */
    public final Env m29757m() {
        return this.f28263g;
    }

    /* renamed from: n */
    public final String m29758n(int i10) {
        String m29684c0;
        C7702e c7702e = this.f28258b[i10];
        if (c7702e == null || (m29684c0 = c7702e.m29684c0()) == null) {
            return "none";
        }
        return m29684c0;
    }

    /* renamed from: o */
    public final long m29759o(int i10) {
        C7702e c7702e = this.f28258b[i10];
        if (c7702e != null) {
            return c7702e.m29679V();
        }
        return -1L;
    }

    /* renamed from: p */
    public final C7076c m29760p(int i10) {
        C7702e c7702e = this.f28258b[i10];
        if (c7702e != null) {
            return c7702e.m29685f0();
        }
        return null;
    }

    /* renamed from: q */
    public final String m29761q() {
        return this.f28257a;
    }

    /* renamed from: r */
    public final void m29762r(String str, InterfaceC7392a interfaceC7392a, InterfaceC7393b interfaceC7393b) {
        AbstractC5868k.m23675g(str, "workPath");
        AbstractC5868k.m23675g(interfaceC7392a, "playerCallback");
        AbstractC5868k.m23675g(interfaceC7393b, "rangerCallback");
        m29748w(new c(str, interfaceC7392a, interfaceC7393b));
    }

    /* renamed from: t */
    public final boolean m29763t(int i10) {
        C7702e c7702e = this.f28258b[i10];
        if (c7702e != null) {
            return c7702e.m29687o0();
        }
        return false;
    }

    /* renamed from: u */
    public final void m29764u(EnumC7256d enumC7256d, EnumC7257e enumC7257e, EnumC7255c enumC7255c) {
        AbstractC5868k.m23675g(enumC7256d, "obj");
        AbstractC5868k.m23675g(enumC7257e, "type");
        AbstractC5868k.m23675g(enumC7255c, "event");
        m29748w(new d(enumC7256d, enumC7257e, enumC7255c));
    }

    /* renamed from: v */
    public final void m29765v(int i10, String str) {
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        m29748w(new e(i10, str));
    }

    /* renamed from: x */
    public final void m29766x(int i10, String str, Program program, String str2) {
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        AbstractC5868k.m23675g(program, "program");
        AbstractC5868k.m23675g(str2, "extra");
        m29748w(new f(i10, str, program, str2));
    }

    /* renamed from: y */
    public final void m29767y(int i10, String str) {
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        m29748w(new g(i10, str));
    }

    /* renamed from: z */
    public final void m29768z(int i10, String str, long j10) {
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        m29748w(new h(i10, str, j10));
    }

    public /* synthetic */ C7705h(AbstractC5864g abstractC5864g) {
        this();
    }
}
