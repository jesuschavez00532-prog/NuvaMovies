package p157h6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p007a6.AbstractC0074g;
import p128f6.C4270f;
import p395x5.C7503f;

/* renamed from: h6.a */
/* loaded from: classes.dex */
public class C4549a {

    /* renamed from: a */
    private final File f19596a;

    public C4549a(C4270f c4270f) {
        this.f19596a = c4270f.m17795e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m18946a() {
        return this.f19596a;
    }

    /* renamed from: b */
    public JSONObject m18947b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C7503f.m28716f().m28717b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m18946a = m18946a();
                if (m18946a.exists()) {
                    fileInputStream = new FileInputStream(m18946a);
                    try {
                        jSONObject = new JSONObject(AbstractC0074g.m250C(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        C7503f.m28716f().m28720e("Failed to fetch cached settings", e);
                        AbstractC0074g.m255e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C7503f.m28716f().m28723i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC0074g.m255e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                AbstractC0074g.m255e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            AbstractC0074g.m255e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void m18948c(long j10, JSONObject jSONObject) {
        FileWriter fileWriter;
        C7503f.m28716f().m28723i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j10);
                    fileWriter = new FileWriter(m18946a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e10) {
                e = e10;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                AbstractC0074g.m255e(fileWriter, "Failed to close settings writer.");
            } catch (Exception e11) {
                e = e11;
                fileWriter2 = fileWriter;
                C7503f.m28716f().m28720e("Failed to cache settings", e);
                AbstractC0074g.m255e(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                AbstractC0074g.m255e(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
