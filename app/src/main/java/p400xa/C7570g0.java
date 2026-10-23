package p400xa;

import android.os.SystemClock;
import be.C1328x;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5874q;
import p043ce.AbstractC1500l;
import p317rb.AbstractC6567a;
import p359ue.AbstractC7167u;
import p400xa.C7570g0;
import p400xa.InterfaceC7620y0;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: xa.g0 */
/* loaded from: classes2.dex */
public final class C7570g0 {

    /* renamed from: t */
    public static final a f27777t = new a(null);

    /* renamed from: u */
    private static final ArrayList f27778u;

    /* renamed from: g */
    private float f27785g;

    /* renamed from: h */
    private float f27786h;

    /* renamed from: j */
    private boolean f27788j;

    /* renamed from: q */
    private Disposable f27795q;

    /* renamed from: r */
    private InterfaceC7620y0 f27796r;

    /* renamed from: s */
    private int f27797s;

    /* renamed from: a */
    private final String f27779a = C7570g0.class.getSimpleName();

    /* renamed from: b */
    private final String f27780b = IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE;

    /* renamed from: c */
    private final String f27781c = "msg";

    /* renamed from: d */
    private final String f27782d = "total_ms";

    /* renamed from: e */
    private final String f27783e = "host";

    /* renamed from: f */
    private final String f27784f = "ping";

    /* renamed from: i */
    private boolean f27787i = true;

    /* renamed from: k */
    private String f27789k = "";

    /* renamed from: l */
    private String f27790l = "";

    /* renamed from: m */
    private String f27791m = "";

    /* renamed from: n */
    private String f27792n = "";

    /* renamed from: o */
    private String f27793o = "";

    /* renamed from: p */
    private String f27794p = "";

    /* renamed from: xa.g0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final ArrayList m29025a() {
            return C7570g0.f27778u;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.g0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ int f27798a;

        /* renamed from: b */
        final /* synthetic */ C7570g0 f27799b;

        /* renamed from: c */
        final /* synthetic */ int f27800c;

        /* renamed from: d */
        final /* synthetic */ boolean f27801d;

        /* renamed from: e */
        final /* synthetic */ int f27802e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, C7570g0 c7570g0, int i11, boolean z10, int i12) {
            super(1);
            this.f27798a = i10;
            this.f27799b = c7570g0;
            this.f27800c = i11;
            this.f27801d = z10;
            this.f27802e = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m29027e(int i10, C7570g0 c7570g0, String str, int i11, boolean z10, int i12, ObservableEmitter observableEmitter) {
            AbstractC5868k.m23674f(c7570g0, "this$0");
            AbstractC5868k.m23674f(str, "$url");
            AbstractC5868k.m23674f(observableEmitter, "it");
            try {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i13 = 0; i13 < i10; i13++) {
                    arrayList.add(c7570g0.m29013n(str, 80, i11));
                }
                if (!arrayList.isEmpty()) {
                    z11 = c7570g0.m29017t(str, arrayList, i10, z10);
                }
                observableEmitter.onNext(Boolean.valueOf(z11));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(final String str) {
            AbstractC5868k.m23674f(str, "url");
            final int i10 = this.f27798a;
            final C7570g0 c7570g0 = this.f27799b;
            final int i11 = this.f27800c;
            final boolean z10 = this.f27801d;
            final int i12 = this.f27802e;
            return Observable.create(new ObservableOnSubscribe() { // from class: xa.h0
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    C7570g0.b.m29027e(i10, c7570g0, str, i11, z10, i12, observableEmitter);
                }
            }).subscribeOn(Schedulers.m20294io());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.g0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ float f27804b;

        /* renamed from: c */
        final /* synthetic */ C5874q f27805c;

        /* renamed from: d */
        final /* synthetic */ boolean f27806d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, C5874q c5874q, boolean z10) {
            super(1);
            this.f27804b = f10;
            this.f27805c = c5874q;
            this.f27806d = z10;
        }

        /* renamed from: a */
        public final void m29029a(Boolean bool) {
            boolean z10 = false;
            AbstractC5868k.m23673e(bool, "it");
            if (bool.booleanValue()) {
                C7570g0.this.f27785g += 1.0f;
            } else {
                C7570g0.this.f27786h += 1.0f;
            }
            if (C7570g0.this.f27787i) {
                if (this.f27805c.f23408a) {
                    return;
                }
                if (C7570g0.this.f27785g > 0.0f) {
                    InterfaceC7620y0 interfaceC7620y0 = C7570g0.this.f27796r;
                    if (interfaceC7620y0 != null) {
                        interfaceC7620y0.mo29366a(true, this.f27806d, C7570g0.this.f27797s / ((int) C7570g0.this.f27785g));
                    }
                    this.f27805c.f23408a = true;
                    return;
                }
                if (C7570g0.this.f27786h == this.f27804b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    InterfaceC7620y0 interfaceC7620y02 = C7570g0.this.f27796r;
                    if (interfaceC7620y02 != null) {
                        InterfaceC7620y0.a.m29373a(interfaceC7620y02, false, this.f27806d, 0, 4, null);
                    }
                    this.f27805c.f23408a = true;
                    return;
                }
                return;
            }
            if (this.f27805c.f23408a) {
                return;
            }
            float f10 = 2;
            if (C7570g0.this.f27785g >= this.f27804b / f10) {
                InterfaceC7620y0 interfaceC7620y03 = C7570g0.this.f27796r;
                if (interfaceC7620y03 != null) {
                    interfaceC7620y03.mo29366a(true, this.f27806d, C7570g0.this.f27797s / ((int) C7570g0.this.f27785g));
                }
                this.f27805c.f23408a = true;
                return;
            }
            if (C7570g0.this.f27786h > this.f27804b / f10) {
                InterfaceC7620y0 interfaceC7620y04 = C7570g0.this.f27796r;
                if (interfaceC7620y04 != null) {
                    InterfaceC7620y0.a.m29373a(interfaceC7620y04, false, this.f27806d, 0, 4, null);
                }
                this.f27805c.f23408a = true;
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29029a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.g0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f27807a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m29030a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29030a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        ArrayList m6984c;
        m6984c = AbstractC1500l.m6984c("www.google.com", "www.baidu.com");
        f27778u = m6984c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final C7562d1 m29013n(String str, int i10, int i11) {
        String hostAddress = null;
        Socket socket = new Socket();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = "";
        try {
            try {
                InetAddress byName = InetAddress.getByName(str);
                AbstractC5868k.m23673e(byName, "getByName(url)");
                socket.connect(new InetSocketAddress(byName, i10), i11 * 1000);
                hostAddress = socket.getInetAddress().getHostAddress();
                AbstractC5868k.m23673e(hostAddress, "socket.inetAddress.hostAddress");
            } catch (IOException e10) {
                e = e10;
            }
            try {
                socket.close();
                return new C7562d1("200", AbstractC3215b.JSON_SUCCESS, Double.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), hostAddress);
            } catch (IOException e11) {
                e = e11;
                str2 = hostAddress;
                return new C7562d1("-1", String.valueOf(e.getMessage()), Double.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), str2);
            }
        } finally {
            socket.close();
        }
    }

    /* renamed from: r */
    private final ArrayList m29015r(String str) {
        boolean m27763v;
        int m27735E;
        List m27748R;
        ArrayList arrayList = new ArrayList();
        m27763v = AbstractC7167u.m27763v(str, this.f27784f, false, 2, null);
        if (m27763v) {
            m27735E = AbstractC7167u.m27735E(str, this.f27784f, 0, false, 6, null);
            String substring = str.substring(m27735E + 5);
            AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
            m27748R = AbstractC7167u.m27748R(substring, new String[]{","}, false, 0, 6, null);
            arrayList.addAll(m27748R);
        }
        return arrayList;
    }

    /* renamed from: s */
    private final void m29016s(boolean z10) {
        this.f27785g = 0.0f;
        this.f27786h = 0.0f;
        this.f27787i = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r8.doubleValue() >= r10.doubleValue()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        r10 = r7.m28995d();
        ne.AbstractC5868k.m23671c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r11 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        r8 = r7.m28995d();
        ne.AbstractC5868k.m23671c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r8.doubleValue() > r11.doubleValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r8 = r7.m28995d();
        ne.AbstractC5868k.m23671c(r8);
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r11 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r10 == null) goto L14;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m29017t(java.lang.String r39, java.util.ArrayList r40, int r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p400xa.C7570g0.m29017t(java.lang.String, java.util.ArrayList, int, boolean):boolean");
    }

    /* renamed from: v */
    private final void m29018v(ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        float size = arrayList.size() + 0.0f;
        C5874q c5874q = new C5874q();
        Observable fromIterable = Observable.fromIterable(arrayList);
        final b bVar = new b(i10, this, i11, z10, i12);
        Observable observeOn = fromIterable.flatMap(new Function() { // from class: xa.d0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m29019w;
                m29019w = C7570g0.m29019w(InterfaceC5660l.this, obj);
                return m29019w;
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final c cVar = new c(size, c5874q, z10);
        Consumer consumer = new Consumer() { // from class: xa.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7570g0.m29020x(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f27807a;
        this.f27795q = observeOn.subscribe(consumer, new Consumer() { // from class: xa.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7570g0.m29021y(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final ObservableSource m29019w(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m29020x(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m29021y(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: o */
    public final void m29022o(ArrayList arrayList, String str, boolean z10, boolean z11, String str2, String str3, String str4, String str5, String str6, String str7, int i10, int i11) {
        AbstractC5868k.m23674f(str2, "mediaCode");
        AbstractC5868k.m23674f(str3, "title");
        AbstractC5868k.m23674f(str4, "bussType");
        AbstractC5868k.m23674f(str5, "cdnType");
        AbstractC5868k.m23674f(str6, "transId");
        AbstractC5868k.m23674f(str7, "eCode");
        m29016s(z10);
        this.f27788j = z11;
        this.f27789k = str2;
        this.f27790l = str3;
        this.f27791m = str4;
        this.f27792n = str5;
        this.f27793o = str6;
        this.f27794p = str7;
        if (!z10 && z11) {
            InterfaceC7620y0 interfaceC7620y0 = this.f27796r;
            if (interfaceC7620y0 != null) {
                InterfaceC7620y0.a.m29373a(interfaceC7620y0, false, z11, 0, 4, null);
                return;
            }
            return;
        }
        if (AbstractC6567a.m25638h(arrayList)) {
            AbstractC5868k.m23671c(arrayList);
            m29018v(arrayList, i10, i11, 0, z11);
        } else if (str != null) {
            ArrayList m29015r = m29015r(str);
            if (!m29015r.isEmpty()) {
                m29018v(m29015r, i10, i11, 0, z11);
            } else {
                m29018v(f27778u, i10, i11, 0, z11);
            }
        }
    }

    /* renamed from: q */
    public final void m29023q() {
        Disposable disposable;
        Disposable disposable2 = this.f27795q;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f27795q) != null) {
            disposable.dispose();
        }
    }

    /* renamed from: u */
    public final void m29024u(InterfaceC7620y0 interfaceC7620y0) {
        this.f27796r = interfaceC7620y0;
    }
}
