package com.umeng.p079ut.p084b.p085a.p086a;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: com.umeng.ut.b.a.a.d */
/* loaded from: classes3.dex */
public class C3760d {

    /* renamed from: a */
    private static final Pattern f16808a = Pattern.compile("([\t\r\n])+");

    /* renamed from: a */
    public static int m15968a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 = (i10 * 31) + c10;
        }
        return i10;
    }

    /* renamed from: d */
    public static String m15970d(String str) {
        if (str != null && !"".equals(str)) {
            return f16808a.matcher(str).replaceAll("");
        }
        return str;
    }

    public static boolean isEmpty(String str) {
        if (str != null && str.length() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Map<String, String> m15969a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.umeng.ut.b.a.a.d.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        treeMap.putAll(map);
        return treeMap;
    }
}
