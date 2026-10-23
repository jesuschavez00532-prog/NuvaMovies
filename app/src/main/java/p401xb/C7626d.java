package p401xb;

import android.content.Context;
import anet.channel.util.HttpConstant;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1455h;
import cc.C1464l0;
import com.dcs.bean.DomainInfo;
import com.umeng.analytics.pro.C3384f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import okhttp3.ResponseBody;
import p030bc.C1224f;
import p179ib.AbstractC4926c;
import p201k2.AbstractC5092i;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7030g;
import p359ue.C7149c;
import p363v2.C7197a;
import p401xb.C7626d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: xb.d */
/* loaded from: classes2.dex */
public final class C7626d {

    /* renamed from: a */
    public static final C7626d f28065a;

    /* renamed from: b */
    private static final String f28066b;

    /* renamed from: c */
    private static int f28067c;

    /* renamed from: d */
    private static String f28068d;

    /* renamed from: e */
    private static int f28069e;

    /* renamed from: f */
    private static final ScheduledThreadPoolExecutor f28070f;

    /* renamed from: g */
    private static InterfaceC7623a f28071g;

    /* renamed from: h */
    private static String f28072h;

    /* renamed from: i */
    private static String f28073i;

    /* renamed from: j */
    private static final InterfaceC1312h f28074j;

    /* renamed from: xb.d$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f28075a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DomainInfo invoke() {
            return C7197a.f26917a.m27845b(AbstractC4926c.m20239f().first.toString(), AbstractC4926c.m20239f().second.toString(), "key_epg");
        }
    }

    /* renamed from: xb.d$b */
    /* loaded from: classes2.dex */
    public static final class b implements Callback {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m29399d(Response response) {
            AbstractC5868k.m23674f(response, "$response");
            int m25762b = response.m25762b();
            if (response.m25763d()) {
                C7626d c7626d = C7626d.f28065a;
                if (!c7626d.m29385o(response)) {
                    c7626d.m29386p();
                    return;
                }
                return;
            }
            if (m25762b == 304) {
                C7626d.f28065a.m29384n();
            } else if (m25762b == 404 || m25762b == 500) {
                C7626d.f28065a.m29386p();
            } else {
                C7626d.f28065a.m29386p();
            }
        }

        @Override // retrofit2.Callback
        /* renamed from: a */
        public void mo21158a(Call call, Throwable th) {
            AbstractC5868k.m23674f(call, "call");
            AbstractC5868k.m23674f(th, "t");
            if (th instanceof UnknownHostException) {
                C7626d.f28067c = 4;
            } else {
                C7626d.f28065a.m29386p();
            }
        }

        @Override // retrofit2.Callback
        /* renamed from: b */
        public void mo21159b(Call call, final Response response) {
            AbstractC5868k.m23674f(call, "call");
            AbstractC5868k.m23674f(response, "response");
            C7626d.f28070f.submit(new AbstractC7030g.f("epg download", new Runnable() { // from class: xb.e
                @Override // java.lang.Runnable
                public final void run() {
                    C7626d.b.m29399d(Response.this);
                }
            }, false));
        }
    }

    /* renamed from: xb.d$c */
    /* loaded from: classes2.dex */
    public static final class c implements Callback {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m29401d(Response response) {
            AbstractC5868k.m23674f(response, "$response");
            int m25762b = response.m25762b();
            if (response.m25763d()) {
                if (!C7626d.f28065a.m29385o(response)) {
                    C7626d.f28067c = 2;
                }
            } else {
                if (m25762b == 304) {
                    C7626d.f28065a.m29384n();
                    return;
                }
                C7197a.f26917a.m27860t(C7626d.f28065a.m29391h(), "key_epg");
                if (m25762b == 404 || m25762b == 500) {
                    C7626d.f28067c = 4;
                } else {
                    C7626d.f28067c = 2;
                }
            }
        }

        @Override // retrofit2.Callback
        /* renamed from: a */
        public void mo21158a(Call call, Throwable th) {
            AbstractC5868k.m23674f(call, "call");
            AbstractC5868k.m23674f(th, "t");
            C7197a.f26917a.m27860t(C7626d.f28065a.m29391h(), "key_epg");
            if (th instanceof UnknownHostException) {
                C7626d.f28067c = 4;
            } else {
                C7626d.f28067c = 2;
            }
        }

        @Override // retrofit2.Callback
        /* renamed from: b */
        public void mo21159b(Call call, final Response response) {
            AbstractC5868k.m23674f(call, "call");
            AbstractC5868k.m23674f(response, "response");
            C7626d.f28070f.submit(new AbstractC7030g.f("epg download", new Runnable() { // from class: xb.f
                @Override // java.lang.Runnable
                public final void run() {
                    C7626d.c.m29401d(Response.this);
                }
            }, false));
        }
    }

    static {
        InterfaceC1312h m5965b;
        C7626d c7626d = new C7626d();
        f28065a = c7626d;
        f28066b = c7626d.getClass().getSimpleName();
        f28068d = "";
        f28070f = AbstractC7030g.m27130d();
        f28072h = "";
        f28073i = "";
        m5965b = AbstractC1314j.m5965b(a.f28075a);
        f28074j = m5965b;
    }

    private C7626d() {
    }

    /* renamed from: l */
    private final void m29382l() {
        f28067c = 1;
        f28070f.submit(new AbstractC7030g.f("epg request", new Runnable() { // from class: xb.b
            @Override // java.lang.Runnable
            public final void run() {
                C7626d.m29383m();
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m29383m() {
        String m6823b = C1464l0.f5622a.m6823b();
        String m29388r = f28065a.m29388r("epg_info");
        if (AbstractC6567a.m25634d(m29388r)) {
            m29388r = "966c1ba6e09b4d96-8617e8c0a0a21587";
        }
        C1224f.f4816e.m5631a().m5613s(HttpConstant.HTTP, f28072h, m6823b, f28069e, m29388r).mo25686n(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m29384n() {
        f28067c = 3;
        InterfaceC7623a interfaceC7623a = f28071g;
        if (interfaceC7623a != null) {
            interfaceC7623a.onFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m29385o(Response response) {
        File file = new File(f28068d, "epg");
        if (file.exists()) {
            file.delete();
        }
        ResponseBody responseBody = (ResponseBody) response.m25761a();
        if (responseBody == null) {
            return false;
        }
        InputStream byteStream = responseBody.byteStream();
        AbstractC5868k.m23673e(byteStream, "body.byteStream()");
        String m29389t = m29389t(byteStream, file);
        if (AbstractC6567a.m25634d(m29389t)) {
            return false;
        }
        InterfaceC7623a interfaceC7623a = f28071g;
        if (interfaceC7623a != null) {
            interfaceC7623a.mo6640a(file);
        }
        m29390u(m29389t);
        if (file.exists()) {
            file.delete();
        }
        f28067c = 3;
        InterfaceC7623a interfaceC7623a2 = f28071g;
        if (interfaceC7623a2 != null) {
            interfaceC7623a2.onFinished();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m29386p() {
        f28067c = 1;
        f28070f.submit(new AbstractC7030g.f("epg request", new Runnable() { // from class: xb.c
            @Override // java.lang.Runnable
            public final void run() {
                C7626d.m29387q();
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m29387q() {
        String m6823b = C1464l0.f5622a.m6823b();
        String m29388r = f28065a.m29388r("epg_info");
        if (AbstractC6567a.m25634d(m29388r)) {
            m29388r = "966c1ba6e09b4d96-8617e8c0a0a21587";
        }
        C1224f.f4816e.m5631a().m5613s(HttpConstant.HTTP, f28073i, m6823b, f28069e, m29388r).mo25686n(new c());
    }

    /* renamed from: r */
    private final String m29388r(String str) {
        File file = new File(f28068d, str);
        if (!file.exists()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        sb2.append(new String(bArr, 0, read, C7149c.f26829b));
                    } else {
                        C1455h.f5573a.m6759a(fileInputStream);
                        String sb3 = sb2.toString();
                        AbstractC5868k.m23673e(sb3, "sb.toString()");
                        return sb3;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                C1455h.f5573a.m6759a(fileInputStream);
                return "";
            }
        } catch (Throwable th) {
            C1455h.f5573a.m6759a(fileInputStream);
            throw th;
        }
    }

    /* renamed from: t */
    private final String m29389t(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        try {
            try {
                byte[] bArr = new byte[8192];
                C5876s c5876s = new C5876s();
                while (true) {
                    int read = inputStream.read(bArr);
                    c5876s.f23410a = read;
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                        messageDigest.update(bArr, 0, c5876s.f23410a);
                    } else {
                        fileOutputStream.flush();
                        String m20667b = AbstractC5092i.m20667b(messageDigest.digest());
                        AbstractC5868k.m23673e(m20667b, "bytesToHexString(digest.digest())");
                        C1455h.f5573a.m6759a(inputStream, fileOutputStream);
                        return m20667b;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                C1455h.f5573a.m6759a(inputStream, fileOutputStream);
                return "";
            }
        } catch (Throwable th) {
            C1455h.f5573a.m6759a(inputStream, fileOutputStream);
            throw th;
        }
    }

    /* renamed from: u */
    private final void m29390u(String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(f28068d, "epg_info"));
        try {
            try {
                byte[] bytes = str.getBytes(C7149c.f26829b);
                AbstractC5868k.m23673e(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes, 0, bytes.length);
                fileOutputStream.flush();
                C1455h.f5573a.m6759a(fileOutputStream);
            } catch (Exception e10) {
                e10.printStackTrace();
                C1455h.f5573a.m6759a(fileOutputStream);
            }
        } catch (Throwable th) {
            C1455h.f5573a.m6759a(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: h */
    public final DomainInfo m29391h() {
        return (DomainInfo) f28074j.getValue();
    }

    /* renamed from: i */
    public final void m29392i(Context context, int i10) {
        String str = null;
        String second = null;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        String absolutePath = context.getFilesDir().getAbsolutePath();
        AbstractC5868k.m23673e(absolutePath, "context.filesDir.absolutePath");
        f28068d = absolutePath;
        f28069e = i10;
        DomainInfo m29391h = m29391h();
        String str2 = "";
        if (m29391h == null || (str = m29391h.getFirst()) == null) {
            str = "";
        }
        f28072h = str;
        DomainInfo m29391h2 = m29391h();
        if (m29391h2 != null && (second = m29391h2.getSecond()) != null) {
            str2 = second;
        }
        f28073i = str2;
    }

    /* renamed from: j */
    public final boolean m29393j() {
        int i10 = f28067c;
        if (i10 != 3 && i10 != 4 && i10 != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m29394k() {
        int i10 = f28067c;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void m29395s() {
        int i10 = f28067c;
        if (i10 != 0 && i10 != 2) {
            return;
        }
        m29382l();
    }

    /* renamed from: v */
    public final void m29396v(InterfaceC7623a interfaceC7623a) {
        AbstractC5868k.m23674f(interfaceC7623a, "callback");
        f28071g = interfaceC7623a;
    }
}
