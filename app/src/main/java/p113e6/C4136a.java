package p113e6;

import anet.channel.request.Request;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p395x5.C7503f;

/* renamed from: e6.a */
/* loaded from: classes.dex */
public class C4136a {

    /* renamed from: a */
    private final String f18169a;

    /* renamed from: b */
    private final Map f18170b;

    /* renamed from: c */
    private final Map f18171c = new HashMap();

    public C4136a(String str, Map map) {
        this.f18169a = str;
        this.f18170b = map;
    }

    /* renamed from: a */
    private String m17323a(Map map) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((String) entry.getKey());
        sb3.append(Operator.Operation.EQUALS);
        if (entry.getValue() == null) {
            str = "";
        } else {
            str = (String) entry.getValue();
        }
        sb3.append(str);
        sb2.append(sb3.toString());
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
            sb4.append((String) entry2.getKey());
            sb4.append(Operator.Operation.EQUALS);
            if (entry2.getValue() == null) {
                str2 = "";
            } else {
                str2 = (String) entry2.getValue();
            }
            sb4.append(str2);
            sb2.append(sb4.toString());
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private String m17324b(String str, Map map) {
        String m17323a = m17323a(map);
        if (m17323a.isEmpty()) {
            return str;
        }
        if (str.contains(Operator.Operation.EMPTY_PARAM)) {
            if (!str.endsWith(DispatchConstants.SIGN_SPLIT_SYMBOL)) {
                m17323a = DispatchConstants.SIGN_SPLIT_SYMBOL + m17323a;
            }
            return str + m17323a;
        }
        return str + Operator.Operation.EMPTY_PARAM + m17323a;
    }

    /* renamed from: e */
    private String m17325e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Request.DEFAULT_CHARSET));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    /* renamed from: c */
    public C4138c m17326c() {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String m17325e = null;
        inputStream = null;
        try {
            String m17324b = m17324b(this.f18169a, this.f18170b);
            C7503f.m28716f().m28723i("GET Request URL: " + m17324b);
            httpsURLConnection = (HttpsURLConnection) new URL(m17324b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f18171c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m17325e = m17325e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C4138c(responseCode, m17325e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public C4136a m17327d(String str, String str2) {
        this.f18171c.put(str, str2);
        return this;
    }
}
