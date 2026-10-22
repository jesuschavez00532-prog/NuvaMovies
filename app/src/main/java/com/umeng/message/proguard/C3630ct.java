package com.umeng.message.proguard;

import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.umeng.message.proguard.ct */
/* loaded from: classes3.dex */
public class C3630ct {

    /* renamed from: a */
    private static final C3630ct f16243a = new C3630ct();

    /* renamed from: b */
    private final HashMap<String, b> f16244b = new HashMap<>();

    /* renamed from: com.umeng.message.proguard.ct$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo15544a();

        /* renamed from: a */
        void mo15545a(String str);
    }

    private C3630ct() {
    }

    /* renamed from: a */
    public static void m15572a(final boolean z10, final String str, final a aVar) {
        C3630ct c3630ct = f16243a;
        if (str != null && str.length() != 0) {
            File m15720a = C3667ea.m15720a(str);
            if (m15720a.exists() && m15720a.length() > 512) {
                aVar.mo15545a(m15720a.getPath());
                C3631cu.m15575a(m15720a);
                return;
            } else {
                C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.ct.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        synchronized (C3630ct.class) {
                            b bVar = (b) C3630ct.this.f16244b.get(str);
                            if (bVar != null) {
                                bVar.m15574a(aVar);
                                return;
                            }
                            b bVar2 = new b(str, new a() { // from class: com.umeng.message.proguard.ct.1.1
                                @Override // com.umeng.message.proguard.C3630ct.a
                                /* renamed from: a */
                                public final void mo15545a(String str2) {
                                    synchronized (C3630ct.class) {
                                        C3630ct.this.f16244b.remove(str);
                                    }
                                }

                                @Override // com.umeng.message.proguard.C3630ct.a
                                /* renamed from: a */
                                public final void mo15544a() {
                                    synchronized (C3630ct.class) {
                                        C3630ct.this.f16244b.remove(str);
                                    }
                                }
                            });
                            bVar2.m15574a(aVar);
                            C3630ct.this.f16244b.put(str, bVar2);
                            if (z10) {
                                bVar2.run();
                            } else {
                                C3612cb.m15499a(bVar2);
                            }
                        }
                    }
                });
                return;
            }
        }
        new IllegalArgumentException("url empty");
        aVar.mo15544a();
    }

    /* renamed from: com.umeng.message.proguard.ct$b */
    /* loaded from: classes3.dex */
    static class b implements Runnable {

        /* renamed from: a */
        private final String f16250a;

        /* renamed from: b */
        private final ArrayList<a> f16251b;

        b(String str, a aVar) {
            ArrayList<a> arrayList = new ArrayList<>();
            this.f16251b = arrayList;
            this.f16250a = str;
            arrayList.add(aVar);
        }

        /* renamed from: a */
        public final void m15574a(a aVar) {
            synchronized (C3630ct.class) {
                this.f16251b.add(0, aVar);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                m15573a(this.f16250a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            synchronized (C3630ct.class) {
                this.f16251b.clear();
            }
        }

        /* renamed from: a */
        private void m15573a(String str) {
            HttpURLConnection httpURLConnection;
            InputStream inputStream;
            int contentLength;
            FileOutputStream fileOutputStream;
            byte[] bArr;
            long j10;
            long j11;
            int i10;
            byte[] bArr2;
            File m15720a = C3667ea.m15720a(str);
            if (m15720a.exists() && m15720a.length() > 512) {
                C3631cu.m15575a(m15720a);
                synchronized (C3630ct.class) {
                    Iterator<a> it = this.f16251b.iterator();
                    while (it.hasNext()) {
                        it.next().mo15545a(m15720a.getPath());
                    }
                }
                return;
            }
            File file = new File(m15720a.getParent(), m15720a.getName() + ".tmp");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = 0;
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setConnectTimeout(30000);
                        httpURLConnection2.setReadTimeout(30000);
                        inputStream = httpURLConnection2.getInputStream();
                        contentLength = httpURLConnection2.getContentLength();
                        fileOutputStream = new FileOutputStream(file);
                        bArr = new byte[8192];
                        C3615ce.m15509a("VideoDownload", "video contentLength:".concat(String.valueOf(contentLength)));
                        j10 = 0;
                        j11 = 0;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                    }
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, i11, read);
                        j10 += read;
                        if (contentLength > 0) {
                            httpURLConnection = httpURLConnection2;
                            try {
                                long j12 = (100 * j10) / contentLength;
                                if (j11 != j12) {
                                    if (j12 % 50 == 0) {
                                        i10 = contentLength;
                                        bArr2 = bArr;
                                        C3615ce.m15509a("VideoDownload", "video download progress:".concat(String.valueOf(j12)));
                                    } else {
                                        i10 = contentLength;
                                        bArr2 = bArr;
                                    }
                                    j11 = j12;
                                } else {
                                    i10 = contentLength;
                                    bArr2 = bArr;
                                }
                                httpURLConnection2 = httpURLConnection;
                                contentLength = i10;
                                bArr = bArr2;
                                i11 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        th = th2;
                        httpURLConnection.disconnect();
                        throw th;
                    }
                    httpURLConnection = httpURLConnection2;
                    fileOutputStream.flush();
                    C3668eb.m15722a(fileOutputStream);
                    C3668eb.m15722a(inputStream);
                    m15720a.delete();
                    file.renameTo(m15720a);
                    C3631cu.m15575a(m15720a);
                    synchronized (C3630ct.class) {
                        Iterator<a> it2 = this.f16251b.iterator();
                        while (it2.hasNext()) {
                            it2.next().mo15545a(m15720a.getPath());
                        }
                    }
                    httpURLConnection.disconnect();
                    C3615ce.m15510b("VideoDownload", "video download consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                } catch (IOException e10) {
                    file.delete();
                    C3615ce.m15512d("VideoDownload", "video download error:", e10.getMessage());
                    C3615ce.m15510b("VideoDownload", "video download consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    synchronized (C3630ct.class) {
                        Iterator<a> it3 = this.f16251b.iterator();
                        while (it3.hasNext()) {
                            a next = it3.next();
                            new IOException("download video:" + str + " failed!");
                            next.mo15544a();
                        }
                    }
                }
            } catch (Throwable th3) {
                C3615ce.m15510b("VideoDownload", "video download consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                throw th3;
            }
        }
    }
}
