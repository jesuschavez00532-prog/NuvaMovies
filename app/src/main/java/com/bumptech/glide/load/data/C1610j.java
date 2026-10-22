package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p109e2.AbstractC4117g;
import p109e2.C4113c;
import p184j1.C4974e;
import p184j1.EnumC4970a;
import p278p1.C6169i;

/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes.dex */
public class C1610j implements InterfaceC1604d {

    /* renamed from: g */
    static final b f6407g = new a();

    /* renamed from: a */
    private final C6169i f6408a;

    /* renamed from: b */
    private final int f6409b;

    /* renamed from: c */
    private final b f6410c;

    /* renamed from: d */
    private HttpURLConnection f6411d;

    /* renamed from: e */
    private InputStream f6412e;

    /* renamed from: f */
    private volatile boolean f6413f;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.C1610j.b
        /* renamed from: a */
        public HttpURLConnection mo7444a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.data.j$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo7444a(URL url);
    }

    public C1610j(C6169i c6169i, int i10) {
        this(c6169i, i10, f6407g);
    }

    /* renamed from: c */
    private HttpURLConnection m7438c(URL url, Map map) {
        try {
            HttpURLConnection mo7444a = this.f6410c.mo7444a(url);
            for (Map.Entry entry : map.entrySet()) {
                mo7444a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            mo7444a.setConnectTimeout(this.f6409b);
            mo7444a.setReadTimeout(this.f6409b);
            mo7444a.setUseCaches(false);
            mo7444a.setDoInput(true);
            mo7444a.setInstanceFollowRedirects(false);
            return mo7444a;
        } catch (IOException e10) {
            throw new C4974e("URL.openConnection threw", 0, e10);
        }
    }

    /* renamed from: e */
    private static int m7439e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
                return -1;
            }
            return -1;
        }
    }

    /* renamed from: f */
    private InputStream m7440f(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f6412e = C4113c.m17201b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f6412e = httpURLConnection.getInputStream();
            }
            return this.f6412e;
        } catch (IOException e10) {
            throw new C4974e("Failed to obtain InputStream", m7439e(httpURLConnection), e10);
        }
    }

    /* renamed from: g */
    private static boolean m7441g(int i10) {
        if (i10 / 100 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m7442h(int i10) {
        if (i10 / 100 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private InputStream m7443i(URL url, int i10, URL url2, Map map) {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C4974e("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection m7438c = m7438c(url, map);
            this.f6411d = m7438c;
            try {
                m7438c.connect();
                this.f6412e = this.f6411d.getInputStream();
                if (this.f6413f) {
                    return null;
                }
                int m7439e = m7439e(this.f6411d);
                if (m7441g(m7439e)) {
                    return m7440f(this.f6411d);
                }
                if (m7442h(m7439e)) {
                    String headerField = this.f6411d.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            mo7423b();
                            return m7443i(url3, i10 + 1, url, map);
                        } catch (MalformedURLException e10) {
                            throw new C4974e("Bad redirect url: " + headerField, m7439e, e10);
                        }
                    }
                    throw new C4974e("Received empty or null redirect url", m7439e);
                }
                if (m7439e == -1) {
                    throw new C4974e(m7439e);
                }
                try {
                    throw new C4974e(this.f6411d.getResponseMessage(), m7439e);
                } catch (IOException e11) {
                    throw new C4974e("Failed to get a response message", m7439e, e11);
                }
            } catch (IOException e12) {
                throw new C4974e("Failed to connect or obtain data", m7439e(this.f6411d), e12);
            }
        }
        throw new C4974e("Too many (> 5) redirects!", -1);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: a */
    public Class mo7418a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: b */
    public void mo7423b() {
        InputStream inputStream = this.f6412e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6411d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6411d = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public void cancel() {
        this.f6413f = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: d */
    public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
        StringBuilder sb2;
        long m17210b = AbstractC4117g.m17210b();
        try {
            try {
                aVar.mo7431e(m7443i(this.f6408a.m24645i(), 0, null, this.f6408a.m24643e()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.mo7430c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb2 = new StringBuilder();
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(AbstractC4117g.m17209a(m17210b));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC4117g.m17209a(m17210b));
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public EnumC4970a getDataSource() {
        return EnumC4970a.REMOTE;
    }

    C1610j(C6169i c6169i, int i10, b bVar) {
        this.f6408a = c6169i;
        this.f6409b = i10;
        this.f6410c = bVar;
    }
}
