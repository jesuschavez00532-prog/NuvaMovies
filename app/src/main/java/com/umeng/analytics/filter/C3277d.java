package com.umeng.analytics.filter;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.umeng.analytics.filter.d */
/* loaded from: classes3.dex */
public class C3277d {

    /* renamed from: b */
    private static final String f13932b = "Ă";

    /* renamed from: c */
    private MessageDigest f13934c;

    /* renamed from: e */
    private boolean f13936e;

    /* renamed from: a */
    private final String f13933a = "MD5";

    /* renamed from: d */
    private Set<Object> f13935d = new HashSet();

    public C3277d(boolean z10, String str) {
        this.f13936e = z10;
        try {
            this.f13934c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
        }
        if (str != null) {
            int i10 = 0;
            if (z10) {
                try {
                    byte[] decode = Base64.decode(str.getBytes(), 0);
                    while (i10 < decode.length / 4) {
                        int i11 = i10 * 4;
                        this.f13935d.add(Integer.valueOf(((decode[i11 + 0] & 255) << 24) + ((decode[i11 + 1] & 255) << 16) + ((decode[i11 + 2] & 255) << 8) + (decode[i11 + 3] & 255)));
                        i10++;
                    }
                    return;
                } catch (IllegalArgumentException e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            String[] split = str.split(f13932b);
            int length = split.length;
            while (i10 < length) {
                this.f13935d.add(split[i10]);
                i10++;
            }
        }
    }

    /* renamed from: c */
    private Integer m13696c(String str) {
        try {
            this.f13934c.update(str.getBytes());
            byte[] digest = this.f13934c.digest();
            return Integer.valueOf(((digest[0] & 255) << 24) + ((digest[1] & 255) << 16) + ((digest[2] & 255) << 8) + (digest[3] & 255));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public boolean m13698a(String str) {
        if (this.f13936e) {
            return this.f13935d.contains(m13696c(str));
        }
        return this.f13935d.contains(str);
    }

    /* renamed from: b */
    public void m13699b(String str) {
        if (this.f13936e) {
            this.f13935d.add(m13696c(str));
        } else {
            this.f13935d.add(str);
        }
    }

    public String toString() {
        if (this.f13936e) {
            byte[] bArr = new byte[this.f13935d.size() * 4];
            Iterator<Object> it = this.f13935d.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((-16777216) & intValue) >> 24);
                int i12 = i11 + 1;
                bArr[i11] = (byte) ((16711680 & intValue) >> 16);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((65280 & intValue) >> 8);
                i10 = i13 + 1;
                bArr[i13] = (byte) (intValue & 255);
            }
            return new String(Base64.encode(bArr, 0));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : this.f13935d) {
            if (sb2.length() > 0) {
                sb2.append(f13932b);
            }
            sb2.append(obj.toString());
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public void m13697a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Object> it = this.f13935d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (sb2.length() > 0) {
                sb2.append(",");
            }
        }
        System.out.println(sb2.toString());
    }
}
