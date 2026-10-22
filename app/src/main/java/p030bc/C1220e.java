package p030bc;

import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.AbstractC1453g;
import cc.C1449e;
import cc.C1455h;
import cc.C1478x;
import cc.C1479y;
import com.request.bean.SubTitleFileList;
import com.request.bean.SubtitleDownloadErrorEvent;
import io.reactivex.Notification;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import p035c3.AbstractC1350e;
import p213kf.C5260h;
import p279p2.AbstractC6187a;
import p348u2.AbstractC7029f;
import retrofit2.Response;
import retrofit2.Retrofit;
import sb.InterfaceC6780a;
import ye.C7709c;

/* renamed from: bc.e */
/* loaded from: classes.dex */
public final class C1220e {

    /* renamed from: e */
    public static final b f4793e = new b(null);

    /* renamed from: f */
    private static final InterfaceC1312h f4794f;

    /* renamed from: a */
    private final String f4795a = "DownloadService";

    /* renamed from: b */
    private final List f4796b = new ArrayList();

    /* renamed from: c */
    private final long f4797c = 15;

    /* renamed from: d */
    private final InterfaceC1312h f4798d;

    /* renamed from: bc.e$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f4799a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1220e invoke() {
            return new C1220e();
        }
    }

    /* renamed from: bc.e$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: b */
        private final C1220e m5539b() {
            return (C1220e) C1220e.f4794f.getValue();
        }

        /* renamed from: a */
        public final C1220e m5540a() {
            return m5539b();
        }
    }

    /* renamed from: bc.e$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6780a invoke() {
            return (InterfaceC6780a) C1220e.this.m5535q().m25767b(InterfaceC6780a.class);
        }
    }

    /* renamed from: bc.e$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ String f4802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f4802b = str;
        }

        /* renamed from: a */
        public final void m5542a(Notification notification) {
            C1220e.this.f4796b.remove(this.f4802b);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5542a((Notification) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: bc.e$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ SubTitleFileList f4803a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SubTitleFileList subTitleFileList) {
            super(1);
            this.f4803a = subTitleFileList;
        }

        /* renamed from: a */
        public final void m5543a(Boolean bool) {
            this.f4803a.setDownloadFinished(true);
            this.f4803a.setDownloadError(!bool.booleanValue());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5543a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: bc.e$f */
    /* loaded from: classes.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ SubTitleFileList f4804a;

        /* renamed from: b */
        final /* synthetic */ String f4805b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(SubTitleFileList subTitleFileList, String str) {
            super(1);
            this.f4804a = subTitleFileList;
            this.f4805b = str;
        }

        /* renamed from: a */
        public final void m5544a(Throwable th) {
            this.f4804a.setDownloadFinished(true);
            this.f4804a.setDownloadError(true);
            C7709c m29787d = C7709c.m29787d();
            String str = this.f4805b;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            m29787d.m29801m(new SubtitleDownloadErrorEvent(str, message));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5544a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.e$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ File f4807b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(File file) {
            super(1);
            this.f4807b = file;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Response response) {
            boolean z10;
            AbstractC5868k.m23674f(response, "it");
            ResponseBody responseBody = (ResponseBody) response.m25761a();
            if (response.m25763d() && responseBody != null) {
                C1220e c1220e = C1220e.this;
                InputStream byteStream = responseBody.byteStream();
                AbstractC5868k.m23673e(byteStream, "body.byteStream()");
                z10 = c1220e.m5536r(byteStream, this.f4807b);
            } else {
                z10 = false;
            }
            if (z10) {
                return Boolean.valueOf(z10);
            }
            throw new IllegalArgumentException("文件下载失败");
        }
    }

    /* renamed from: bc.e$h */
    /* loaded from: classes.dex */
    public static final class h implements Function {

        /* renamed from: a */
        final /* synthetic */ int f4808a;

        /* renamed from: b */
        final /* synthetic */ C1220e f4809b;

        /* renamed from: c */
        final /* synthetic */ String f4810c;

        /* renamed from: d */
        final /* synthetic */ String f4811d;

        /* renamed from: e */
        final /* synthetic */ File f4812e;

        h(int i10, C1220e c1220e, String str, String str2, File file) {
            this.f4808a = i10;
            this.f4809b = c1220e;
            this.f4810c = str;
            this.f4811d = str2;
            this.f4812e = file;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableSource apply(Throwable th) {
            AbstractC5868k.m23674f(th, "t");
            if (this.f4808a == 0) {
                Observable just = Observable.just(Boolean.FALSE);
                AbstractC5868k.m23673e(just, "just(false)");
                return just;
            }
            C7709c m29787d = C7709c.m29787d();
            String str = this.f4811d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f4808a);
            sb2.append('+');
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            sb2.append(message);
            m29787d.m29801m(new SubtitleDownloadErrorEvent(str, sb2.toString()));
            return this.f4809b.m5532n(this.f4811d, this.f4810c, this.f4812e, this.f4808a - 1);
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f4799a);
        f4794f = m5965b;
    }

    public C1220e() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new c());
        this.f4798d = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m5529k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m5530l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m5531m(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final Observable m5532n(String str, String str2, File file, int i10) {
        Observable<Response<ResponseBody>> m26673a = m5534p().m26673a(str2);
        final g gVar = new g(file);
        Observable onErrorResumeNext = m26673a.map(new Function() { // from class: bc.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m5533o;
                m5533o = C1220e.m5533o(InterfaceC5660l.this, obj);
                return m5533o;
            }
        }).onErrorResumeNext(new h(i10, this, str2, str, file));
        AbstractC5868k.m23673e(onErrorResumeNext, "private fun downloadFile…\n                })\n    }");
        return onErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final Boolean m5533o(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: p */
    private final InterfaceC6780a m5534p() {
        return (InterfaceC6780a) this.f4798d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final Retrofit m5535q() {
        OkHttpClient.Builder dns = new OkHttpClient.Builder().retryOnConnectionFailure(true).connectTimeout(this.f4797c, TimeUnit.SECONDS).connectionPool(AbstractC6187a.m24711a()).addInterceptor(new C1449e()).dns(new C1478x());
        X509TrustManager m6758a = AbstractC1453g.m6758a();
        if (m6758a != null) {
            dns.sslSocketFactory(new C1479y(m6758a), m6758a);
        }
        OkHttpClient build = dns.build();
        AbstractC5868k.m23673e(build, "builder.build()");
        Retrofit m25779e = new Retrofit.Builder().m25777c("http://www.baidu.com").m25781g(build).m25775a(C5260h.m21165d()).m25779e();
        AbstractC5868k.m23673e(m25779e, "Builder()\n              …\n                .build()");
        return m25779e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final boolean m5536r(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    C1455h.f5573a.m6759a(inputStream, fileOutputStream);
                    return true;
                }
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            C1455h.f5573a.m6759a(inputStream, fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            C1455h.f5573a.m6759a(inputStream, fileOutputStream2);
            throw th;
        }
    }

    /* renamed from: j */
    public final Observable m5537j(String str, SubTitleFileList subTitleFileList, String str2, int i10) {
        String str3;
        boolean z10;
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(subTitleFileList, "subTitleFileList");
        AbstractC5868k.m23674f(str2, "filepath");
        String url = subTitleFileList.getUrl();
        if (url == null || (str3 = AbstractC1350e.m6119a(url, "key_subtitle")) == null) {
            str3 = "";
        }
        boolean z11 = false;
        if (str3.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (str2.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                File file = new File(str2);
                if (file.exists()) {
                    file.delete();
                }
                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                    subTitleFileList.setDownloadFinished(true);
                    subTitleFileList.setDownloadError(true);
                    Observable empty = Observable.empty();
                    AbstractC5868k.m23673e(empty, "empty()");
                    return empty;
                }
                synchronized (C1220e.class) {
                    if (this.f4796b.contains(str3)) {
                        Observable empty2 = Observable.empty();
                        AbstractC5868k.m23673e(empty2, "empty()");
                        return empty2;
                    }
                    this.f4796b.add(str3);
                    Observable m5532n = m5532n(str, str3, file, i10);
                    final d dVar = new d(str3);
                    Observable doOnEach = m5532n.doOnEach(new Consumer() { // from class: bc.a
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C1220e.m5529k(InterfaceC5660l.this, obj);
                        }
                    });
                    final e eVar = new e(subTitleFileList);
                    Observable doOnNext = doOnEach.doOnNext(new Consumer() { // from class: bc.b
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C1220e.m5530l(InterfaceC5660l.this, obj);
                        }
                    });
                    final f fVar = new f(subTitleFileList, str);
                    Observable compose = doOnNext.doOnError(new Consumer() { // from class: bc.c
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C1220e.m5531m(InterfaceC5660l.this, obj);
                        }
                    }).compose(AbstractC7029f.m27121b());
                    AbstractC5868k.m23673e(compose, "fun downloadFile(content…erHelper.io2main())\n    }");
                    return compose;
                }
            }
        }
        Observable empty3 = Observable.empty();
        AbstractC5868k.m23673e(empty3, "empty()");
        return empty3;
    }
}
