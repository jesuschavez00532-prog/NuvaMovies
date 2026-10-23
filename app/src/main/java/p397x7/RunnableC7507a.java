package p397x7;

import android.os.Process;
import android.text.TextUtils;
import com.lzy.okgo.model.HttpHeaders;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import p009a8.C0111a;
import p009a8.C0112b;
import p353u7.C7051a;
import p368v7.InterfaceC7246a;
import p428z7.C7760a;
import p428z7.C7761b;

/* renamed from: x7.a */
/* loaded from: classes2.dex */
public class RunnableC7507a implements Runnable {

    /* renamed from: a */
    private final C7761b f27585a;

    /* renamed from: b */
    private final InterfaceC7246a f27586b;

    /* renamed from: c */
    private final C7051a f27587c;

    /* renamed from: d */
    private final C7760a f27588d;

    /* renamed from: e */
    private final a f27589e;

    /* renamed from: f */
    private long f27590f;

    /* renamed from: g */
    private InputStream f27591g;

    /* renamed from: x7.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo28058a();

        /* renamed from: c */
        void mo28060c();
    }

    public RunnableC7507a(C7761b c7761b, InterfaceC7246a interfaceC7246a, C7051a c7051a, C7760a c7760a, a aVar) {
        long j10;
        this.f27585a = c7761b;
        this.f27586b = interfaceC7246a;
        this.f27587c = c7051a;
        this.f27588d = c7760a;
        if (c7760a.m30019r()) {
            j10 = c7761b.m30037e();
        } else {
            j10 = 0;
        }
        this.f27590f = j10;
        this.f27589e = aVar;
    }

    /* renamed from: a */
    private void m28729a() {
        if (!this.f27588d.m30018q()) {
        } else {
            throw new C0112b(7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.net.HttpURLConnection] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28730b(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p397x7.RunnableC7507a.m28730b(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.net.HttpURLConnection] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28731c(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p397x7.RunnableC7507a.m28731c(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public HttpURLConnection m28732d(String str) {
        Throwable th = null;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(this.f27587c.m27150a());
                httpURLConnection.setReadTimeout(this.f27587c.m27157h());
                httpURLConnection.setRequestMethod(this.f27587c.m27156g());
                this.f27585a.m30038f();
                if (this.f27588d.m30019r()) {
                    httpURLConnection.setRequestProperty(HttpHeaders.HEAD_KEY_RANGE, "bytes=" + (this.f27585a.m30038f() + this.f27590f) + Operator.Operation.MINUS + this.f27585a.m30035c());
                }
                httpURLConnection.disconnect();
                return httpURLConnection;
            } catch (Exception unused) {
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return httpURLConnection2;
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        try {
            m28729a();
            if ((this.f27585a.m30038f() + this.f27590f) - 1 == this.f27585a.m30035c()) {
                this.f27589e.mo28058a();
            } else if (TextUtils.isEmpty(this.f27585a.m30033a())) {
                m28730b(this.f27585a.m30040h());
            } else {
                m28731c(this.f27585a.m30040h(), this.f27585a.m30033a());
            }
        } catch (C0111a e10) {
            if (e10.m485a() == 7) {
                this.f27588d.m29998D(6);
                this.f27588d.m30026y(e10);
                this.f27586b.mo28053a(this.f27588d);
                return;
            }
            this.f27586b.mo28054b(this.f27588d, e10);
        }
    }
}
