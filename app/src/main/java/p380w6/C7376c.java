package p380w6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import anet.channel.request.Request;
import anet.channel.util.HttpConstant;
import com.google.firebase.installations.C2656d;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.HttpHeaders;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.internal.C3452a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p127f5.AbstractC4250l;
import p219l4.AbstractC5391n;
import p281p4.AbstractC6197a;
import p281p4.AbstractC6205i;
import p312r6.InterfaceC6545j;
import p338t6.InterfaceC6922b;
import p380w6.AbstractC7377d;
import p380w6.AbstractC7379f;

/* renamed from: w6.c */
/* loaded from: classes.dex */
public class C7376c {

    /* renamed from: d */
    private static final Pattern f27368d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f27369e = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    private final Context f27370a;

    /* renamed from: b */
    private final InterfaceC6922b f27371b;

    /* renamed from: c */
    private final C7378e f27372c = new C7378e();

    public C7376c(Context context, InterfaceC6922b interfaceC6922b) {
        this.f27370a = context;
        this.f27371b = interfaceC6922b;
    }

    /* renamed from: a */
    private static String m28460a(String str, String str2, String str3) {
        String str4 = null;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m28461b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put(Constants.KEY_SDK_VERSION, "a:17.0.2");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: c */
    private static JSONObject m28462c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_SDK_VERSION, "a:17.0.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: f */
    private String m28463f() {
        try {
            Context context = this.f27370a;
            byte[] m24741a = AbstractC6197a.m24741a(context, context.getPackageName());
            if (m24741a == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f27370a.getPackageName());
                return null;
            }
            return AbstractC6205i.m24762b(m24741a, false);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f27370a.getPackageName(), e10);
            return null;
        }
    }

    /* renamed from: g */
    private URL m28464g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new C2656d(e10.getMessage(), C2656d.a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m28465h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes(Request.DEFAULT_CHARSET);
    }

    /* renamed from: i */
    private static boolean m28466i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: j */
    private static void m28467j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m28468k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m28472o = m28472o(httpURLConnection);
        if (!TextUtils.isEmpty(m28472o)) {
            Log.w("Firebase-Installations", m28472o);
            Log.w("Firebase-Installations", m28460a(str, str2, str3));
        }
    }

    /* renamed from: l */
    private HttpURLConnection m28469l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty(HttpHeaders.HEAD_KEY_ACCEPT, "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f27370a.getPackageName());
            InterfaceC6545j interfaceC6545j = (InterfaceC6545j) this.f27371b.get();
            if (interfaceC6545j != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) AbstractC4250l.m17729a(interfaceC6545j.mo25589a()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m28463f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C2656d("Firebase Installations Service is unavailable. Please try again later.", C2656d.a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m28470m(String str) {
        AbstractC5391n.m21776b(f27368d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    /* renamed from: n */
    private AbstractC7377d m28471n(HttpURLConnection httpURLConnection) throws java.io.IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f27369e));
        AbstractC7379f.a m28486a = AbstractC7379f.m28486a();
        AbstractC7377d.a m28479a = AbstractC7377d.m28479a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(SerializableCookie.NAME)) {
                m28479a.mo28452f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m28479a.mo28449c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m28479a.mo28450d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m28486a.mo28458c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m28486a.mo28459d(m28470m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m28479a.mo28448b(m28486a.mo28456a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m28479a.mo28451e(AbstractC7377d.b.OK).mo28447a();
    }

    /* renamed from: o */
    private static String m28472o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f27369e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* renamed from: p */
    private AbstractC7379f m28473p(HttpURLConnection httpURLConnection) throws java.io.IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f27369e));
        AbstractC7379f.a m28486a = AbstractC7379f.m28486a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m28486a.mo28458c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m28486a.mo28459d(m28470m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m28486a.mo28457b(AbstractC7379f.b.OK).mo28456a();
    }

    /* renamed from: q */
    private void m28474q(HttpURLConnection httpURLConnection, String str, String str2) {
        m28476s(httpURLConnection, m28465h(m28461b(str, str2)));
    }

    /* renamed from: r */
    private void m28475r(HttpURLConnection httpURLConnection) {
        m28476s(httpURLConnection, m28465h(m28462c()));
    }

    /* renamed from: s */
    private static void m28476s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* renamed from: d */
    public AbstractC7377d m28477d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC7377d m28471n;
        if (this.f27372c.m28484b()) {
            URL m28464g = m28464g(String.format("projects/%s/installations", str3));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(C3452a.f15266f);
                HttpURLConnection m28469l = m28469l(m28464g, str);
                try {
                    try {
                        m28469l.setRequestMethod("POST");
                        m28469l.setDoOutput(true);
                        if (str5 != null) {
                            m28469l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                        }
                        m28474q(m28469l, str2, str4);
                        responseCode = m28469l.getResponseCode();
                        this.f27372c.m28485f(responseCode);
                    } catch (IOException | AssertionError unused) {
                    }
                    if (m28466i(responseCode)) {
                        m28471n = m28471n(m28469l);
                    } else {
                        m28468k(m28469l, str4, str, str3);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                m28467j();
                                m28471n = AbstractC7377d.m28479a().mo28451e(AbstractC7377d.b.BAD_CONFIG).mo28447a();
                            } else {
                                m28469l.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new C2656d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C2656d.a.TOO_MANY_REQUESTS);
                        }
                    }
                    return m28471n;
                } finally {
                    m28469l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new C2656d("Firebase Installations Service is unavailable. Please try again later.", C2656d.a.UNAVAILABLE);
        }
        throw new C2656d("Firebase Installations Service is unavailable. Please try again later.", C2656d.a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC7379f m28478e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC7379f m28473p;
        if (this.f27372c.m28484b()) {
            URL m28464g = m28464g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(C3452a.f15268h);
                HttpURLConnection m28469l = m28469l(m28464g, str);
                try {
                    try {
                        m28469l.setRequestMethod("POST");
                        m28469l.addRequestProperty(HttpConstant.AUTHORIZATION, "FIS_v2 " + str4);
                        m28469l.setDoOutput(true);
                        m28475r(m28469l);
                        responseCode = m28469l.getResponseCode();
                        this.f27372c.m28485f(responseCode);
                    } finally {
                        m28469l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (m28466i(responseCode)) {
                    m28473p = m28473p(m28469l);
                } else {
                    m28468k(m28469l, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                m28467j();
                                m28473p = AbstractC7379f.m28486a().mo28457b(AbstractC7379f.b.BAD_CONFIG).mo28456a();
                            } else {
                                m28469l.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new C2656d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C2656d.a.TOO_MANY_REQUESTS);
                        }
                    }
                    m28473p = AbstractC7379f.m28486a().mo28457b(AbstractC7379f.b.AUTH_ERROR).mo28456a();
                }
                return m28473p;
            }
            throw new C2656d("Firebase Installations Service is unavailable. Please try again later.", C2656d.a.UNAVAILABLE);
        }
        throw new C2656d("Firebase Installations Service is unavailable. Please try again later.", C2656d.a.UNAVAILABLE);
    }
}
