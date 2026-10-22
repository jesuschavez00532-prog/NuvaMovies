package p281p4;

import android.util.Base64;

/* renamed from: p4.c */
/* loaded from: classes.dex */
public abstract class AbstractC6199c {
    /* renamed from: a */
    public static String m24746a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
