package org.xutils.http;

import android.os.Parcelable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.util.LogUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.xutils.http.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6100a {

    /* renamed from: a */
    private static final ClassLoader f24038a = String.class.getClassLoader();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.xutils.http.a$a */
    /* loaded from: classes3.dex */
    public static class a implements b {

        /* renamed from: a */
        final /* synthetic */ JSONObject f24039a;

        a(JSONObject jSONObject) {
            this.f24039a = jSONObject;
        }

        @Override // org.xutils.http.AbstractC6100a.b
        public void onParseKV(String str, Object obj) {
            try {
                this.f24039a.put(str, AbstractC6100a.m24397a(obj));
            } catch (JSONException e10) {
                throw new IllegalArgumentException("parse RequestParams to json failed", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.xutils.http.a$b */
    /* loaded from: classes3.dex */
    public interface b {
        void onParseKV(String str, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [org.json.JSONArray] */
    /* renamed from: a */
    public static Object m24397a(Object obj) {
        Object jSONObject;
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            jSONObject = new JSONArray();
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                jSONObject.put(m24397a(Array.get(obj, i10)));
            }
        } else if (obj instanceof Iterable) {
            jSONObject = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONObject.put(m24397a(it.next()));
            }
        } else if (obj instanceof Map) {
            jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && value != null) {
                    jSONObject.put(String.valueOf(key), m24397a(value));
                }
            }
        } else {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null && classLoader != f24038a) {
                JSONObject jSONObject2 = new JSONObject();
                m24398b(obj, cls, new a(jSONObject2));
                return jSONObject2;
            }
            return obj;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m24398b(Object obj, Class cls, b bVar) {
        ClassLoader classLoader;
        if (obj != null && cls != null && cls != RequestParams.class && cls != Object.class && (classLoader = cls.getClassLoader()) != null && classLoader != f24038a) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    if (!Modifier.isTransient(field.getModifiers()) && !"serialVersionUID".equals(name) && field.getType() != Parcelable.Creator.class) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 != null) {
                                bVar.onParseKV(name, obj2);
                            }
                        } catch (Throwable th) {
                            LogUtil.m24376e(th.getMessage(), th);
                        }
                    }
                }
            }
            m24398b(obj, cls.getSuperclass(), bVar);
        }
    }
}
