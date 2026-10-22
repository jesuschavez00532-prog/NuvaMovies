package p367v6;

import anet.channel.request.Request;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p337t5.C6913d;

/* renamed from: v6.c */
/* loaded from: classes.dex */
public class C7244c {

    /* renamed from: a */
    private File f27066a;

    /* renamed from: b */
    private final C6913d f27067b;

    /* renamed from: v6.c$a */
    /* loaded from: classes.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C7244c(C6913d c6913d) {
        this.f27067b = c6913d;
    }

    /* renamed from: a */
    private File m28037a() {
        if (this.f27066a == null) {
            synchronized (this) {
                if (this.f27066a == null) {
                    this.f27066a = new File(this.f27067b.m26867j().getFilesDir(), "PersistedInstallation." + this.f27067b.m26870n() + ".json");
                }
            }
        }
        return this.f27066a;
    }

    /* renamed from: c */
    private JSONObject m28038c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m28037a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public AbstractC7245d m28039b(AbstractC7245d abstractC7245d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC7245d.mo28014d());
            jSONObject.put("Status", abstractC7245d.mo28017g().ordinal());
            jSONObject.put("AuthToken", abstractC7245d.mo28012b());
            jSONObject.put("RefreshToken", abstractC7245d.mo28016f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC7245d.mo28018h());
            jSONObject.put("ExpiresInSecs", abstractC7245d.mo28013c());
            jSONObject.put("FisError", abstractC7245d.mo28015e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f27067b.m26867j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Request.DEFAULT_CHARSET));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(m28037a())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return abstractC7245d;
    }

    /* renamed from: d */
    public AbstractC7245d m28040d() {
        JSONObject m28038c = m28038c();
        String optString = m28038c.optString("Fid", null);
        int optInt = m28038c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m28038c.optString("AuthToken", null);
        String optString3 = m28038c.optString("RefreshToken", null);
        long optLong = m28038c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m28038c.optLong("ExpiresInSecs", 0L);
        return AbstractC7245d.m28041a().mo28023d(optString).mo28026g(a.values()[optInt]).mo28021b(optString2).mo28025f(optString3).mo28027h(optLong).mo28022c(optLong2).mo28024e(m28038c.optString("FisError", null)).mo28020a();
    }
}
