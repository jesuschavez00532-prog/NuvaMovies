package p367v6;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3373dn;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p337t5.C6913d;

/* renamed from: v6.b */
/* loaded from: classes.dex */
public class C7243b {

    /* renamed from: c */
    private static final String[] f27063c = {Operator.Operation.MULTIPLY, "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f27064a;

    /* renamed from: b */
    private final String f27065b;

    public C7243b(C6913d c6913d) {
        this.f27064a = c6913d.m26867j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f27065b = m28029b(c6913d);
    }

    /* renamed from: a */
    private String m28028a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m28029b(C6913d c6913d) {
        String m26882d = c6913d.m26869m().m26882d();
        if (m26882d != null) {
            return m26882d;
        }
        String m26881c = c6913d.m26869m().m26881c();
        if (!m26881c.startsWith("1:") && !m26881c.startsWith("2:")) {
            return m26881c;
        }
        String[] split = m26881c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m28030c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & C3373dn.f14525m) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m28031d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m28032e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    /* renamed from: g */
    private String m28033g() {
        String string = null;
        synchronized (this.f27064a) {
            string = this.f27064a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m28034h() {
        synchronized (this.f27064a) {
            String string = this.f27064a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m28032e = m28032e(string);
            if (m28032e == null) {
                return null;
            }
            return m28030c(m28032e);
        }
    }

    /* renamed from: f */
    public String m28035f() {
        synchronized (this.f27064a) {
            String m28033g = m28033g();
            if (m28033g != null) {
                return m28033g;
            }
            return m28034h();
        }
    }

    /* renamed from: i */
    public String m28036i() {
        synchronized (this.f27064a) {
            for (String str : f27063c) {
                String string = this.f27064a.getString(m28028a(this.f27065b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m28031d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
