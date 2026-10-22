package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.v5 */
/* loaded from: classes.dex */
public abstract class AbstractC2159v5 {

    /* renamed from: f */
    static HashMap f8202f;

    /* renamed from: k */
    private static Object f8207k;

    /* renamed from: l */
    private static boolean f8208l;

    /* renamed from: a */
    public static final Uri f8197a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f8198b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f8199c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f8200d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f8201e = new AtomicBoolean();

    /* renamed from: g */
    static final HashMap f8203g = new HashMap();

    /* renamed from: h */
    static final HashMap f8204h = new HashMap();

    /* renamed from: i */
    static final HashMap f8205i = new HashMap();

    /* renamed from: j */
    static final HashMap f8206j = new HashMap();

    /* renamed from: m */
    static final String[] f8209m = new String[0];

    /* renamed from: a */
    public static String m9034a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC2159v5.class) {
            String str3 = null;
            if (f8202f == null) {
                f8201e.set(false);
                f8202f = new HashMap();
                f8207k = new Object();
                f8208l = false;
                contentResolver.registerContentObserver(f8197a, true, new C2144u5(null));
            } else if (f8201e.getAndSet(false)) {
                f8202f.clear();
                f8203g.clear();
                f8204h.clear();
                f8205i.clear();
                f8206j.clear();
                f8207k = new Object();
                f8208l = false;
            }
            Object obj = f8207k;
            if (f8202f.containsKey(str)) {
                String str4 = (String) f8202f.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            int length = f8209m.length;
            Cursor query = contentResolver.query(f8197a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    m9036c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m9036c(obj, str, string);
                if (string != null) {
                    str3 = string;
                }
                return str3;
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    private static void m9036c(Object obj, String str, String str2) {
        synchronized (AbstractC2159v5.class) {
            if (obj == f8207k) {
                f8202f.put(str, str2);
            }
        }
    }
}
