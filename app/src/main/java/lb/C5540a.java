package lb;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210kb.C5145f;
import p210kb.InterfaceC5142c;
import p266ob.AbstractC5958b;
import p266ob.C5959c;

/* renamed from: lb.a */
/* loaded from: classes2.dex */
public class C5540a implements InterfaceC5142c {

    /* renamed from: a */
    private static final String f22466a = "a";

    /* renamed from: b */
    private static String f22467b;

    public C5540a(String str) {
        f22467b = str;
    }

    /* renamed from: b */
    private String m22456b(C5959c c5959c) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = c5959c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object obj = (String) entry.getKey();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("domain", obj);
                JSONArray jSONArray2 = new JSONArray();
                C5145f[] c5145fArr = (C5145f[]) entry.getValue();
                if (c5145fArr != null && c5145fArr.length != 0) {
                    for (C5145f c5145f : c5145fArr) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("data", c5145f.f21102a);
                        jSONObject2.put("type", c5145f.f21103b);
                        jSONObject2.put("ttl", c5145f.f21104c);
                        jSONObject2.put("timestamp", c5145f.f21105d);
                        jSONObject2.put("source", c5145f.f21106e.ordinal());
                        jSONArray2.put(jSONObject2);
                    }
                }
                jSONObject.put("records", jSONArray2);
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    private C5959c m22457c(String str) {
        AbstractC5958b.m24117b(f22466a, "local dns cache is " + str);
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 0) {
                return null;
            }
            C5959c c5959c = new C5959c();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                String optString = optJSONObject.optString("domain");
                JSONArray optJSONArray = optJSONObject.optJSONArray("records");
                int length2 = optJSONArray.length();
                C5145f[] c5145fArr = new C5145f[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                    c5145fArr[i11] = new C5145f(optJSONObject2.optString("data"), optJSONObject2.optInt("type"), optJSONObject2.optInt("ttl"), optJSONObject2.optLong("timestamp"), C5145f.a.Unknown);
                }
                c5959c.put(optString, c5145fArr);
            }
            return c5959c;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // p210kb.InterfaceC5142c
    /* renamed from: a */
    public boolean mo20805a(C5959c c5959c) {
        String m22456b = m22456b(c5959c);
        if (TextUtils.isEmpty(m22456b)) {
            return false;
        }
        File file = new File(f22467b + File.separator + "dns.cache");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(m22456b);
        fileWriter.flush();
        fileWriter.close();
        return false;
    }

    @Override // p210kb.InterfaceC5142c
    public C5959c load() throws java.io.IOException {
        File file = new File(f22467b + File.separator + "dns.cache");
        if (!file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            }
            sb2.append(new String(bArr, 0, read));
        }
        String sb3 = sb2.toString();
        if (TextUtils.isEmpty(sb3)) {
            return null;
        }
        return m22457c(sb3);
    }
}
