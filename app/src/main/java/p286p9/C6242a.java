package p286p9;

import android.content.Context;
import android.content.pm.PackageManager;
import com.dcs.bean.DomainInfo;
import com.mobile.bean.UpdateBean;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.net.Proxy;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p179ib.AbstractC4926c;
import p213kf.C5260h;
import p279p2.AbstractC6187a;
import p300q9.C6354b;
import p300q9.C6356d;
import p315r9.InterfaceC6563a;
import p341t9.AbstractC6927a;
import p348u2.AbstractC7029f;
import p355u9.AbstractC7062b;
import p363v2.C7197a;
import retrofit2.Retrofit;

/* renamed from: p9.a */
/* loaded from: classes2.dex */
public class C6242a {

    /* renamed from: i */
    public static DomainInfo f24454i = C7197a.f26917a.m27845b(AbstractC4926c.m20243j().first.toString(), AbstractC4926c.m20243j().second.toString(), "key_update");

    /* renamed from: a */
    private InterfaceC6243b f24455a;

    /* renamed from: b */
    private InterfaceC6243b f24456b;

    /* renamed from: c */
    private Observer f24457c;

    /* renamed from: d */
    private Observer f24458d;

    /* renamed from: e */
    private Disposable f24459e;

    /* renamed from: f */
    private Disposable f24460f;

    /* renamed from: g */
    private Context f24461g;

    /* renamed from: h */
    private final String f24462h = "fix";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p9.a$a */
    /* loaded from: classes2.dex */
    public class a implements Observer {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6563a f24463a;

        /* renamed from: b */
        final /* synthetic */ boolean f24464b;

        /* renamed from: c */
        final /* synthetic */ String f24465c;

        /* renamed from: d */
        final /* synthetic */ String f24466d;

        /* renamed from: e */
        final /* synthetic */ String f24467e;

        a(InterfaceC6563a interfaceC6563a, boolean z10, String str, String str2, String str3) {
            this.f24463a = interfaceC6563a;
            this.f24464b = z10;
            this.f24465c = str;
            this.f24466d = str2;
            this.f24467e = str3;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(UpdateBean updateBean) {
            this.f24463a.mo19702a(updateBean);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f24463a.mo19703b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (th instanceof C6354b) {
                this.f24463a.onError(th);
                return;
            }
            if (!this.f24464b) {
                AbstractC6927a.m26916f("updateA", th);
            }
            C6242a.this.m24857h(this.f24465c, this.f24466d, this.f24467e, this.f24464b, this.f24463a);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            C6242a.this.f24459e = disposable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p9.a$b */
    /* loaded from: classes2.dex */
    public class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(UpdateBean updateBean) {
            if (updateBean != null) {
            } else {
                throw new C6354b("main no update info");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p9.a$c */
    /* loaded from: classes2.dex */
    public class c implements Observer {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6563a f24470a;

        /* renamed from: b */
        final /* synthetic */ boolean f24471b;

        c(InterfaceC6563a interfaceC6563a, boolean z10) {
            this.f24470a = interfaceC6563a;
            this.f24471b = z10;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(UpdateBean updateBean) {
            this.f24470a.mo19702a(updateBean);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f24470a.mo19703b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f24470a.onError(th);
            if (!this.f24471b && !(th instanceof C6354b)) {
                AbstractC6927a.m26916f("updateB", th);
                C7197a.f26917a.m27860t(C6242a.f24454i, "key_update");
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            C6242a.this.f24460f = disposable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p9.a$d */
    /* loaded from: classes2.dex */
    public class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(UpdateBean updateBean) {
            if (updateBean != null) {
            } else {
                throw new C6354b("second no update info");
            }
        }
    }

    public C6242a(Context context, Dns dns, Interceptor interceptor) {
        this.f24461g = context.getApplicationContext();
        OkHttpClient.Builder proxy = new OkHttpClient.Builder().proxy(Proxy.NO_PROXY);
        if (interceptor != null) {
            proxy.addInterceptor(interceptor);
        }
        if (dns != null) {
            proxy.dns(dns);
        }
        OkHttpClient build = proxy.connectTimeout(20L, TimeUnit.SECONDS).connectionPool(AbstractC6187a.m24711a()).build();
        this.f24455a = m24858i("http://" + f24454i.getFirst(), build);
        this.f24456b = m24858i("http://" + f24454i.getSecond(), build);
    }

    /* renamed from: g */
    private void m24856g(String str, String str2, String str3, boolean z10, InterfaceC6563a interfaceC6563a) {
        String language = null;
        this.f24457c = new a(interfaceC6563a, z10, str, str2, str3);
        if ("zh".equals(Locale.getDefault().getLanguage())) {
            language = "htv_zh";
        } else {
            language = Locale.getDefault().getLanguage();
        }
        m24859j(this.f24455a, str, language, str2, str3).doOnNext(new b()).subscribe(this.f24457c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m24857h(String str, String str2, String str3, boolean z10, InterfaceC6563a interfaceC6563a) {
        String language = null;
        this.f24458d = new c(interfaceC6563a, z10);
        if ("zh".equals(Locale.getDefault().getLanguage())) {
            language = "htv_zh";
        } else {
            language = Locale.getDefault().getLanguage();
        }
        m24859j(this.f24456b, str, language, str2, str3).doOnNext(new d()).subscribe(this.f24458d);
    }

    /* renamed from: i */
    private InterfaceC6243b m24858i(String str, OkHttpClient okHttpClient) {
        return (InterfaceC6243b) new Retrofit.Builder().m25777c(str).m25775a(C5260h.m21165d()).m25776b(new C6356d()).m25781g(okHttpClient).m25779e().m25767b(InterfaceC6243b.class);
    }

    /* renamed from: j */
    private Observable m24859j(InterfaceC6243b interfaceC6243b, String str, String str2, String str3, String str4) {
        return interfaceC6243b.m24867a("checkUpdate", str, str2, str3, str4).compose(AbstractC7029f.m27121b());
    }

    /* renamed from: d */
    public void m24860d() {
        Disposable disposable = this.f24459e;
        if (disposable != null && !disposable.isDisposed()) {
            this.f24459e.dispose();
        }
        Disposable disposable2 = this.f24460f;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.f24460f.dispose();
        }
    }

    /* renamed from: e */
    public void m24861e(String str, int i10, String str2, String str3, boolean z10, InterfaceC6563a interfaceC6563a) {
        m24856g(str + "," + i10, str2, str3, z10, interfaceC6563a);
    }

    /* renamed from: f */
    public void m24862f(String str, String str2, InterfaceC6563a interfaceC6563a) {
        String packageName = this.f24461g.getPackageName();
        int i10 = 0;
        try {
            i10 = this.f24461g.getPackageManager().getPackageInfo(packageName, 0).versionCode;
            str = AbstractC7062b.m27213a(str, "tvmarket");
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m24861e(packageName, i10, str, str2, false, interfaceC6563a);
    }
}
