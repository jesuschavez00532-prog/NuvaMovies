package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import anet.channel.request.Request;
import com.google.firebase.crashlytics.ndk.C2627f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p007a6.AbstractC0074g;
import p038c6.AbstractC1370c0;
import p128f6.C4270f;
import p395x5.C7503f;

/* renamed from: com.google.firebase.crashlytics.ndk.a */
/* loaded from: classes.dex */
public class C2622a {

    /* renamed from: d */
    private static final Charset f10037d = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    private final Context f10038a;

    /* renamed from: b */
    private final InterfaceC2626e f10039b;

    /* renamed from: c */
    private final C4270f f10040c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2622a(Context context, InterfaceC2626e interfaceC2626e, C4270f c4270f) {
        this.f10038a = context;
        this.f10039b = interfaceC2626e;
        this.f10040c = c4270f;
    }

    /* renamed from: b */
    private static File m10865b(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: h */
    private static void m10866h(C4270f c4270f, String str, String str2, String str3) {
        m10867j(new File(c4270f.m17799i(str), str3), str2);
    }

    /* renamed from: j */
    private static void m10867j(File file, String str) {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f10037d));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            AbstractC0074g.m255e(bufferedWriter, "Failed to close " + file);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            AbstractC0074g.m255e(bufferedWriter2, "Failed to close " + file);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC0074g.m255e(bufferedWriter2, "Failed to close " + file);
            throw th;
        }
    }

    /* renamed from: a */
    public C2627f m10868a(String str) {
        String str2;
        File m17799i = this.f10040c.m17799i(str);
        File file = new File(m17799i, "pending");
        C7503f.m28716f().m28723i("Minidump directory: " + file.getAbsolutePath());
        File m10865b = m10865b(file, ".dmp");
        C7503f m28716f = C7503f.m28716f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Minidump file ");
        if (m10865b != null && m10865b.exists()) {
            str2 = "exists";
        } else {
            str2 = "does not exist";
        }
        sb2.append(str2);
        m28716f.m28723i(sb2.toString());
        C2627f.b bVar = new C2627f.b();
        if (m17799i != null && m17799i.exists() && file.exists()) {
            bVar.m10894l(m10865b(file, ".dmp")).m10893k(m10865b(m17799i, ".device_info")).m10896n(new File(m17799i, "session.json")).m10890h(new File(m17799i, "app.json")).m10892j(new File(m17799i, "device.json")).m10895m(new File(m17799i, "os.json"));
        }
        return bVar.m10891i();
    }

    /* renamed from: c */
    public boolean m10869c(String str) {
        File file = m10868a(str).f10051a;
        if (file != null && file.exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m10870d(String str, String str2, long j10, AbstractC1370c0 abstractC1370c0) {
        File m17799i = this.f10040c.m17799i(str);
        if (m17799i != null) {
            try {
                if (this.f10039b.mo10863a(m17799i.getCanonicalPath(), this.f10038a.getAssets())) {
                    m10871e(str, str2, j10);
                    m10872f(str, abstractC1370c0.mo6412a());
                    m10874i(str, abstractC1370c0.mo6414d());
                    m10873g(str, abstractC1370c0.mo6413c());
                    return true;
                }
                return false;
            } catch (IOException e10) {
                C7503f.m28716f().m28720e("Error initializing Crashlytics NDK", e10);
                return false;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m10871e(String str, String str2, long j10) {
        m10866h(this.f10040c, str, AbstractC2629h.m10904b(str, str2, j10), "session.json");
    }

    /* renamed from: f */
    public void m10872f(String str, AbstractC1370c0.a aVar) {
        m10866h(this.f10040c, str, AbstractC2629h.m10905c(aVar.mo6416a(), aVar.mo6420f(), aVar.mo6421g(), aVar.mo6419e(), aVar.mo6417c(), aVar.mo6418d().m28711d(), aVar.mo6418d().m28712e()), "app.json");
    }

    /* renamed from: g */
    public void m10873g(String str, AbstractC1370c0.b bVar) {
        m10866h(this.f10040c, str, AbstractC2629h.m10906d(bVar.mo6423a(), bVar.mo6428g(), bVar.mo6424b(), bVar.mo6431j(), bVar.mo6425d(), bVar.mo6426e(), bVar.mo6430i(), bVar.mo6427f(), bVar.mo6429h()), "device.json");
    }

    /* renamed from: i */
    public void m10874i(String str, AbstractC1370c0.c cVar) {
        m10866h(this.f10040c, str, AbstractC2629h.m10907e(cVar.mo6435d(), cVar.mo6434c(), cVar.mo6433b()), "os.json");
    }
}
