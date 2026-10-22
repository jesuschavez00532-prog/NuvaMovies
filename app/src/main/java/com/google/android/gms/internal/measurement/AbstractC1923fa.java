package com.google.android.gms.internal.measurement;

import com.lzy.okgo.cache.CacheEntity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.fa */
/* loaded from: classes.dex */
public abstract class AbstractC1923fa {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m8388a(InterfaceC1891da interfaceC1891da, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m8391d(interfaceC1891da, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final void m8389b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8389b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8389b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(AbstractC2119sa.m8913a(AbstractC1873c8.m8179v((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1873c8) {
            sb2.append(": \"");
            sb2.append(AbstractC2119sa.m8913a((AbstractC1873c8) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2222z8) {
            sb2.append(" {");
            m8391d((AbstractC2222z8) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i13 = i10 + 2;
            m8389b(sb2, i13, CacheEntity.KEY, entry.getKey());
            m8389b(sb2, i13, "value", entry.getValue());
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* renamed from: c */
    private static final String m8390c(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    private static void m8391d(InterfaceC1891da interfaceC1891da, StringBuilder sb2, int i10) {
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC1891da.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String concat = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m8389b(sb2, i10, m8390c(concat), AbstractC2222z8.m9403p(method2, interfaceC1891da, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m8389b(sb2, i10, m8390c(concat2), AbstractC2222z8.m9403p(method3, interfaceC1891da, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object m9403p = AbstractC2222z8.m9403p(method4, interfaceC1891da, new Object[0]);
                    if (method5 == null) {
                        if (m9403p instanceof Boolean) {
                            if (((Boolean) m9403p).booleanValue()) {
                                m8389b(sb2, i10, m8390c(concat3), m9403p);
                            }
                        } else if (m9403p instanceof Integer) {
                            if (((Integer) m9403p).intValue() != 0) {
                                m8389b(sb2, i10, m8390c(concat3), m9403p);
                            }
                        } else if (m9403p instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m9403p).floatValue()) != 0) {
                                m8389b(sb2, i10, m8390c(concat3), m9403p);
                            }
                        } else if (m9403p instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m9403p).doubleValue()) != 0) {
                                m8389b(sb2, i10, m8390c(concat3), m9403p);
                            }
                        } else {
                            if (m9403p instanceof String) {
                                equals = m9403p.equals("");
                            } else if (m9403p instanceof AbstractC1873c8) {
                                equals = m9403p.equals(AbstractC1873c8.f7691b);
                            } else if (m9403p instanceof InterfaceC1891da) {
                                if (m9403p != ((InterfaceC1891da) m9403p).mo8293a()) {
                                    m8389b(sb2, i10, m8390c(concat3), m9403p);
                                }
                            } else {
                                if ((m9403p instanceof Enum) && ((Enum) m9403p).ordinal() == 0) {
                                }
                                m8389b(sb2, i10, m8390c(concat3), m9403p);
                            }
                            if (!equals) {
                                m8389b(sb2, i10, m8390c(concat3), m9403p);
                            }
                        }
                    } else if (((Boolean) AbstractC2222z8.m9403p(method5, interfaceC1891da, new Object[0])).booleanValue()) {
                        m8389b(sb2, i10, m8390c(concat3), m9403p);
                    }
                }
            }
        }
        C2164va c2164va = ((AbstractC2222z8) interfaceC1891da).zzc;
        if (c2164va != null) {
            c2164va.m9051g(sb2, i10);
        }
    }
}
