package com.umeng.analytics.pro;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.umeng.analytics.pro.ci */
/* loaded from: classes3.dex */
public final class C3341ci {

    /* renamed from: a */
    private static final Comparator f14404a = new a();

    /* renamed from: com.umeng.analytics.pro.ci$a */
    /* loaded from: classes3.dex */
    private static class a implements Comparator {
        private a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return C3341ci.m14064a((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return C3341ci.m14066a((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return C3341ci.m14065a((Map) obj, (Map) obj2);
            }
            if (obj instanceof byte[]) {
                return C3341ci.m14069a((byte[]) obj, (byte[]) obj2);
            }
            return C3341ci.m14060a((Comparable) obj, (Comparable) obj2);
        }
    }

    private C3341ci() {
    }

    /* renamed from: a */
    public static int m14056a(byte b10, byte b11) {
        if (b10 < b11) {
            return -1;
        }
        return b11 < b10 ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m14074b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static ByteBuffer m14075c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (m14074b(byteBuffer)) {
            return byteBuffer;
        }
        return ByteBuffer.wrap(m14072a(byteBuffer));
    }

    /* renamed from: d */
    public static ByteBuffer m14076d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), wrap.array(), 0, byteBuffer.remaining());
        } else {
            byteBuffer.slice().get(wrap.array());
        }
        return wrap;
    }

    /* renamed from: a */
    public static int m14057a(double d10, double d11) {
        if (d10 < d11) {
            return -1;
        }
        return d11 < d10 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m14058a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i11 < i10 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m14059a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j11 < j10 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m14067a(short s10, short s11) {
        if (s10 < s11) {
            return -1;
        }
        return s11 < s10 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m14061a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return m14060a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return m14064a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return m14066a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return m14065a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return m14069a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    /* renamed from: a */
    public static int m14068a(boolean z10, boolean z11) {
        return Boolean.valueOf(z10).compareTo(Boolean.valueOf(z11));
    }

    /* renamed from: a */
    public static int m14062a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: a */
    public static int m14069a(byte[] bArr, byte[] bArr2) {
        int m14058a = m14058a(bArr.length, bArr2.length);
        if (m14058a != 0) {
            return m14058a;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int m14056a = m14056a(bArr[i10], bArr2[i10]);
            if (m14056a != 0) {
                return m14056a;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m14060a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: a */
    public static int m14064a(List list, List list2) {
        int m14058a = m14058a(list.size(), list2.size());
        if (m14058a != 0) {
            return m14058a;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            int compare = f14404a.compare(list.get(i10), list2.get(i10));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m14066a(Set set, Set set2) {
        int m14058a = m14058a(set.size(), set2.size());
        if (m14058a != 0) {
            return m14058a;
        }
        Comparator comparator = f14404a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = f14404a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m14065a(Map map, Map map2) {
        int m14058a = m14058a(map.size(), map2.size());
        if (m14058a != 0) {
            return m14058a;
        }
        Comparator comparator = f14404a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f14404a;
            int compare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m14071a(ByteBuffer byteBuffer, StringBuilder sb2) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int position = byteBuffer.position() + arrayOffset;
        int limit = arrayOffset + byteBuffer.limit();
        int i10 = limit - position > 128 ? position + 128 : limit;
        for (int i11 = position; i11 < i10; i11++) {
            if (i11 > position) {
                sb2.append(" ");
            }
            sb2.append(m14070a(array[i11]));
        }
        if (limit != i10) {
            sb2.append("...");
        }
    }

    /* renamed from: a */
    public static String m14070a(byte b10) {
        return Integer.toHexString((b10 | 256) & 511).toUpperCase().substring(1);
    }

    /* renamed from: a */
    public static byte[] m14072a(ByteBuffer byteBuffer) {
        if (m14074b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m14063a(byteBuffer, bArr, 0);
        return bArr;
    }

    /* renamed from: a */
    public static int m14063a(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i10, remaining);
        return remaining;
    }

    /* renamed from: a */
    public static byte[] m14073a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
