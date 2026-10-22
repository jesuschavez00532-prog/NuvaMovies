package p239mb;

import com.qiniu.android.dns.C3063a;
import com.youth.banner.BannerConfig;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210kb.C5141b;
import p210kb.C5145f;
import p210kb.InterfaceC5143d;
import p266ob.AbstractC5958b;

/* renamed from: mb.a */
/* loaded from: classes2.dex */
public class C5625a implements InterfaceC5143d {

    /* renamed from: a */
    private static final String f22677a = "a";

    @Override // p210kb.InterfaceC5143d
    /* renamed from: a */
    public C5145f[] mo20806a(C5141b c5141b, C3063a c3063a) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(String.format("https://dns.google.com/resolve?name=%1$s", c5141b.f21098a)).openConnection();
        httpURLConnection.setConnectTimeout(BannerConfig.TIME);
        httpURLConnection.setReadTimeout(3000);
        AbstractC5958b.m24116a(f22677a, "google dns response code is " + httpURLConnection.getResponseCode());
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb2.append(readLine);
        }
        AbstractC5958b.m24116a(f22677a, "google dns resolve domain is " + c5141b.f21098a + " and result is " + sb2.toString());
        try {
            JSONObject jSONObject = new JSONObject(sb2.toString());
            if (jSONObject.optInt("Status", 0) != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("Answer");
            if (optJSONArray.length() <= 0) {
                return null;
            }
            int length = optJSONArray.length();
            C5145f[] c5145fArr = new C5145f[length];
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject.optInt("type") == 1) {
                    c5145fArr[i10] = new C5145f(optJSONObject.optString("data"), 1, optJSONObject.optInt("TTL"), System.currentTimeMillis() / 1000, C5145f.a.Unknown);
                }
            }
            return c5145fArr;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
