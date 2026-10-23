package p026b6;

import anet.channel.request.Request;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p007a6.AbstractC0074g;
import p128f6.C4270f;
import p395x5.C7503f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b6.d */
/* loaded from: classes.dex */
public class C1132d {

    /* renamed from: b */
    private static final Charset f4426b = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    private final C4270f f4427a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b6.d$a */
    /* loaded from: classes.dex */
    public class a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f4428a;

        a(String str) {
            this.f4428a = str;
            put("userId", str);
        }
    }

    public C1132d(C4270f c4270f) {
        this.f4427a = c4270f;
    }

    /* renamed from: d */
    private static Map m5127d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m5132k(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: e */
    private String m5128e(String str) {
        return m5132k(new JSONObject(str), "userId");
    }

    /* renamed from: f */
    private static String m5129f(Map map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: i */
    private static void m5130i(File file) {
        if (file.exists() && file.delete()) {
            C7503f.m28716f().m28721g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: j */
    private static String m5131j(String str) {
        return new a(str).toString();
    }

    /* renamed from: k */
    private static String m5132k(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m5133a(String str) {
        return this.f4427a.m17804o(str, "internal-keys");
    }

    /* renamed from: b */
    public File m5134b(String str) {
        return this.f4427a.m17804o(str, "keys");
    }

    /* renamed from: c */
    public File m5135c(String str) {
        return this.f4427a.m17804o(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Map m5136g(String str, boolean z10) {
        File m5134b;
        FileInputStream fileInputStream;
        Exception e10 = null;
        if (z10) {
            m5134b = m5133a(str);
        } else {
            m5134b = m5134b(str);
        }
        if (m5134b.exists() && m5134b.length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(m5134b);
                try {
                    try {
                        Map m5127d = m5127d(AbstractC0074g.m250C(fileInputStream));
                        AbstractC0074g.m255e(fileInputStream, "Failed to close user metadata file.");
                        return m5127d;
                    } catch (Exception e11) {
                        e10 = e11;
                        C7503f.m28716f().m28726l("Error deserializing user metadata.", e10);
                        m5130i(m5134b);
                        AbstractC0074g.m255e(fileInputStream, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    AbstractC0074g.m255e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                fileInputStream = null;
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                AbstractC0074g.m255e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            m5130i(m5134b);
            return Collections.emptyMap();
        }
    }

    /* renamed from: h */
    public String m5137h(String str) {
        FileInputStream fileInputStream;
        File m5135c = m5135c(str);
        FileInputStream fileInputStream2 = null;
        if (m5135c.exists() && m5135c.length() != 0) {
            try {
                fileInputStream = new FileInputStream(m5135c);
                try {
                    try {
                        String m5128e = m5128e(AbstractC0074g.m250C(fileInputStream));
                        C7503f.m28716f().m28717b("Loaded userId " + m5128e + " for session " + str);
                        AbstractC0074g.m255e(fileInputStream, "Failed to close user metadata file.");
                        return m5128e;
                    } catch (Exception e10) {
                        e = e10;
                        C7503f.m28716f().m28726l("Error deserializing user metadata.", e);
                        m5130i(m5135c);
                        AbstractC0074g.m255e(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    AbstractC0074g.m255e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC0074g.m255e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            C7503f.m28716f().m28717b("No userId set for session " + str);
            m5130i(m5135c);
            return null;
        }
    }

    /* renamed from: l */
    public void m5138l(String str, Map map, boolean z10) {
        File m5134b;
        String m5129f = null;
        BufferedWriter bufferedWriter;
        if (z10) {
            m5134b = m5133a(str);
        } else {
            m5134b = m5134b(str);
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m5129f = m5129f(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m5134b), f4426b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            bufferedWriter.write(m5129f);
            bufferedWriter.flush();
            AbstractC0074g.m255e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            C7503f.m28716f().m28726l("Error serializing key/value metadata.", e);
            m5130i(m5134b);
            AbstractC0074g.m255e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC0074g.m255e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* renamed from: m */
    public void m5139m(String str, String str2) {
        String m5131j = null;
        BufferedWriter bufferedWriter;
        File m5135c = m5135c(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m5131j = m5131j(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m5135c), f4426b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(m5131j);
            bufferedWriter.flush();
            AbstractC0074g.m255e(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            C7503f.m28716f().m28726l("Error serializing user metadata.", e);
            AbstractC0074g.m255e(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC0074g.m255e(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
