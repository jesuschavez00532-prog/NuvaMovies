package com.umeng.message.proguard;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.umeng.message.proguard.bi */
/* loaded from: classes3.dex */
public final class C3591bi {
    /* renamed from: a */
    public static String m15418a(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(",");
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }
}
