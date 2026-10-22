package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import anet.channel.request.Request;
import com.google.android.datatransport.cct.C1785d;
import com.lzy.okgo.model.HttpHeaders;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p095d4.InterfaceC3935a;
import p235m6.C5598b;
import p235m6.InterfaceC5597a;
import p294q3.C6335b;
import p309r3.AbstractC6514a;
import p309r3.AbstractC6523j;
import p309r3.AbstractC6524k;
import p309r3.AbstractC6525l;
import p309r3.AbstractC6526m;
import p309r3.AbstractC6527n;
import p309r3.AbstractC6528o;
import p309r3.EnumC6529p;
import p324s3.AbstractC6661i;
import p324s3.C6660h;
import p335t3.AbstractC6898f;
import p335t3.AbstractC6899g;
import p335t3.InterfaceC6905m;
import p393x3.AbstractC7492a;
import p409y3.AbstractC7663b;
import p409y3.InterfaceC7662a;
import p409y3.InterfaceC7664c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes.dex */
public final class C1785d implements InterfaceC6905m {

    /* renamed from: a */
    private final InterfaceC5597a f7486a;

    /* renamed from: b */
    private final ConnectivityManager f7487b;

    /* renamed from: c */
    private final Context f7488c;

    /* renamed from: d */
    final URL f7489d;

    /* renamed from: e */
    private final InterfaceC3935a f7490e;

    /* renamed from: f */
    private final InterfaceC3935a f7491f;

    /* renamed from: g */
    private final int f7492g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final URL f7493a;

        /* renamed from: b */
        final AbstractC6523j f7494b;

        /* renamed from: c */
        final String f7495c;

        a(URL url, AbstractC6523j abstractC6523j, String str) {
            this.f7493a = url;
            this.f7494b = abstractC6523j;
            this.f7495c = str;
        }

        /* renamed from: a */
        a m7892a(URL url) {
            return new a(url, this.f7494b, this.f7495c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f7496a;

        /* renamed from: b */
        final URL f7497b;

        /* renamed from: c */
        final long f7498c;

        b(int i10, URL url, long j10) {
            this.f7496a = i10;
            this.f7497b = url;
            this.f7498c = j10;
        }
    }

    C1785d(Context context, InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2, int i10) {
        this.f7486a = AbstractC6523j.m25545b();
        this.f7488c = context;
        this.f7487b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7489d = m7889n(C1782a.f7477c);
        this.f7490e = interfaceC3935a2;
        this.f7491f = interfaceC3935a;
        this.f7492g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public b m7880e(a aVar) {
        AbstractC7492a.m28692f("CctTransportBackend", "Making request to: %s", aVar.f7493a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f7493a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f7492g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(HttpHeaders.HEAD_KEY_USER_AGENT, String.format("datatransport/%s android/", "3.1.7"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f7495c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f7486a.mo22759a(aVar.f7494b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC7492a.m28692f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC7492a.m28688b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC7492a.m28688b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            InputStream m7888m = m7888m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                            try {
                                b bVar = new b(responseCode, null, AbstractC6527n.m25554b(new BufferedReader(new InputStreamReader(m7888m))).mo25538c());
                                if (m7888m != null) {
                                    m7888m.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                return bVar;
                            } finally {
                            }
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e10) {
            e = e10;
            AbstractC7492a.m28690d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            AbstractC7492a.m28690d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            AbstractC7492a.m28690d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (C5598b e13) {
            e = e13;
            AbstractC7492a.m28690d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: f */
    private static int m7881f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC6528o.b.UNKNOWN_MOBILE_SUBTYPE.m25557b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC6528o.b.COMBINED.m25557b();
        }
        if (AbstractC6528o.b.m25556a(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    /* renamed from: g */
    private static int m7882g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC6528o.c.NONE.m25559b();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m7883h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC7492a.m28690d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    /* renamed from: i */
    private AbstractC6523j m7884i(AbstractC6898f abstractC6898f) {
        AbstractC6525l.a m25549j;
        HashMap hashMap = new HashMap();
        for (AbstractC6661i abstractC6661i : abstractC6898f.mo26816b()) {
            String mo25983j = abstractC6661i.mo25983j();
            if (!hashMap.containsKey(mo25983j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC6661i);
                hashMap.put(mo25983j, arrayList);
            } else {
                ((List) hashMap.get(mo25983j)).add(abstractC6661i);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC6661i abstractC6661i2 = (AbstractC6661i) ((List) entry.getValue()).get(0);
            AbstractC6526m.a mo25531b = AbstractC6526m.m25550a().mo25535f(EnumC6529p.DEFAULT).mo25536g(this.f7491f.mo16762a()).mo25537h(this.f7490e.mo16762a()).mo25531b(AbstractC6524k.m25546a().mo25507c(AbstractC6524k.b.ANDROID_FIREBASE).mo25506b(AbstractC6514a.m25470a().mo25495m(Integer.valueOf(abstractC6661i2.m26022g("sdk-version"))).mo25492j(abstractC6661i2.m26021b(Constants.KEY_MODEL)).mo25488f(abstractC6661i2.m26021b("hardware")).mo25486d(abstractC6661i2.m26021b("device")).mo25494l(abstractC6661i2.m26021b("product")).mo25493k(abstractC6661i2.m26021b("os-uild")).mo25490h(abstractC6661i2.m26021b("manufacturer")).mo25487e(abstractC6661i2.m26021b("fingerprint")).mo25485c(abstractC6661i2.m26021b(C3325bt.f14170O)).mo25489g(abstractC6661i2.m26021b("locale")).mo25491i(abstractC6661i2.m26021b("mcc_mnc")).mo25484b(abstractC6661i2.m26021b("application_build")).mo25483a()).mo25505a());
            try {
                mo25531b.m25551i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo25531b.m25552j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC6661i abstractC6661i3 : (List) entry.getValue()) {
                C6660h mo25981e = abstractC6661i3.mo25981e();
                C6335b m26019b = mo25981e.m26019b();
                if (m26019b.equals(C6335b.m25117b("proto"))) {
                    m25549j = AbstractC6525l.m25549j(mo25981e.m26018a());
                } else if (m26019b.equals(C6335b.m25117b("json"))) {
                    m25549j = AbstractC6525l.m25548i(new String(mo25981e.m26018a(), Charset.forName(Request.DEFAULT_CHARSET)));
                } else {
                    AbstractC7492a.m28693g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m26019b);
                }
                m25549j.mo25517c(abstractC6661i3.mo25982f()).mo25518d(abstractC6661i3.mo25984k()).mo25522h(abstractC6661i3.m26023h("tz-offset")).mo25519e(AbstractC6528o.m25555a().mo25543c(AbstractC6528o.c.m25558a(abstractC6661i3.m26022g("net-type"))).mo25542b(AbstractC6528o.b.m25556a(abstractC6661i3.m26022g("mobile-subtype"))).mo25541a());
                if (abstractC6661i3.mo25980d() != null) {
                    m25549j.mo25516b(abstractC6661i3.mo25980d());
                }
                arrayList3.add(m25549j.mo25515a());
            }
            mo25531b.mo25532c(arrayList3);
            arrayList2.add(mo25531b.mo25530a());
        }
        return AbstractC6523j.m25544a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m7885j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    static long m7886k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ a m7887l(a aVar, b bVar) {
        URL url = bVar.f7497b;
        if (url != null) {
            AbstractC7492a.m28688b("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.m7892a(bVar.f7497b);
        }
        return null;
    }

    /* renamed from: m */
    private static InputStream m7888m(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    private static URL m7889n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // p335t3.InterfaceC6905m
    /* renamed from: a */
    public AbstractC6899g mo7890a(AbstractC6898f abstractC6898f) {
        AbstractC6523j m7884i = m7884i(abstractC6898f);
        URL url = this.f7489d;
        String str = null;
        if (abstractC6898f.mo26817c() != null) {
            try {
                C1782a m7872c = C1782a.m7872c(abstractC6898f.mo26817c());
                if (m7872c.m7875d() != null) {
                    str = m7872c.m7875d();
                }
                if (m7872c.m7876e() != null) {
                    url = m7889n(m7872c.m7876e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC6899g.m26829a();
            }
        }
        try {
            b bVar = (b) AbstractC7663b.m29465a(5, new a(url, m7884i, str), new InterfaceC7662a() { // from class: com.google.android.datatransport.cct.b
                @Override // p409y3.InterfaceC7662a
                public final Object apply(Object obj) {
                    C1785d.b m7880e;
                    m7880e = C1785d.this.m7880e((C1785d.a) obj);
                    return m7880e;
                }
            }, new InterfaceC7664c() { // from class: com.google.android.datatransport.cct.c
                @Override // p409y3.InterfaceC7664c
                /* renamed from: a */
                public final Object mo7877a(Object obj, Object obj2) {
                    C1785d.a m7887l;
                    m7887l = C1785d.m7887l((C1785d.a) obj, (C1785d.b) obj2);
                    return m7887l;
                }
            });
            int i10 = bVar.f7496a;
            if (i10 == 200) {
                return AbstractC6899g.m26831e(bVar.f7498c);
            }
            if (i10 < 500 && i10 != 404) {
                if (i10 == 400) {
                    return AbstractC6899g.m26830d();
                }
                return AbstractC6899g.m26829a();
            }
            return AbstractC6899g.m26832f();
        } catch (IOException e10) {
            AbstractC7492a.m28690d("CctTransportBackend", "Could not make request to the backend", e10);
            return AbstractC6899g.m26832f();
        }
    }

    @Override // p335t3.InterfaceC6905m
    /* renamed from: b */
    public AbstractC6661i mo7891b(AbstractC6661i abstractC6661i) {
        NetworkInfo activeNetworkInfo = this.f7487b.getActiveNetworkInfo();
        AbstractC6661i.a m26028c = abstractC6661i.m26025l().m26026a("sdk-version", Build.VERSION.SDK_INT).m26028c(Constants.KEY_MODEL, Build.MODEL).m26028c("hardware", Build.HARDWARE).m26028c("device", Build.DEVICE).m26028c("product", Build.PRODUCT).m26028c("os-uild", Build.ID).m26028c("manufacturer", Build.MANUFACTURER).m26028c("fingerprint", Build.FINGERPRINT).m26027b("tz-offset", m7886k()).m26026a("net-type", m7882g(activeNetworkInfo)).m26026a("mobile-subtype", m7881f(activeNetworkInfo)).m26028c(C3325bt.f14170O, Locale.getDefault().getCountry()).m26028c("locale", Locale.getDefault().getLanguage());
        m7885j(this.f7488c).getSimOperator();
        return m26028c.m26028c("mcc_mnc", "722310").m26028c("application_build", Integer.toString(m7883h(this.f7488c))).mo25985d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1785d(Context context, InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2) {
        this(context, interfaceC3935a, interfaceC3935a2, 130000);
    }
}
