package p041c9;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c9.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1434c {
    /* renamed from: a */
    public static C1433b m6688a(File file) {
        Map m6689b = m6689b(file);
        if (m6689b == null) {
            return null;
        }
        String str = (String) m6689b.get("channel");
        m6689b.remove("channel");
        return new C1433b(str, m6689b);
    }

    /* renamed from: b */
    public static Map m6689b(File file) {
        try {
            String m6690c = m6690c(file);
            if (m6690c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(m6690c);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.getString(obj));
            }
            return hashMap;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m6690c(File file) {
        return AbstractC1436e.m6696d(file, 1903654775);
    }
}
