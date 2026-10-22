package p200k1;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC1599a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p230m1.InterfaceC5569b;

/* renamed from: k1.e */
/* loaded from: classes.dex */
class C5083e {

    /* renamed from: f */
    private static final C5079a f20934f = new C5079a();

    /* renamed from: a */
    private final C5079a f20935a;

    /* renamed from: b */
    private final InterfaceC5082d f20936b;

    /* renamed from: c */
    private final InterfaceC5569b f20937c;

    /* renamed from: d */
    private final ContentResolver f20938d;

    /* renamed from: e */
    private final List f20939e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5083e(List list, InterfaceC5082d interfaceC5082d, InterfaceC5569b interfaceC5569b, ContentResolver contentResolver) {
        this(list, f20934f, interfaceC5082d, interfaceC5569b, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:73), block:B:26:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m20585b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            k1.d r2 = r6.f20936b     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            android.database.Cursor r2 = r2.mo20584a(r7)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            if (r3 == 0) goto L1c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            r2.close()
            return r7
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            if (r2 == 0) goto L21
            r2.close()
        L21:
            return r1
        L22:
            r7 = move-exception
            goto L49
        L24:
            r3 = move-exception
            r2 = r1
        L26:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L47
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L47
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L47
        L41:
            if (r2 == 0) goto L46
            r2.close()
        L46:
            return r1
        L47:
            r7 = move-exception
            r1 = r2
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p200k1.C5083e.m20585b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    private boolean m20586c(File file) {
        if (this.f20935a.m20571a(file) && 0 < this.f20935a.m20573c(file)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m20587a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f20938d.openInputStream(uri);
                int m7402b = AbstractC1599a.m7402b(this.f20939e, inputStream, this.f20937c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m7402b;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e10) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e10);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
            return -1;
        }
    }

    /* renamed from: d */
    public InputStream m20588d(Uri uri) {
        String m20585b = m20585b(uri);
        if (TextUtils.isEmpty(m20585b)) {
            return null;
        }
        File m20572b = this.f20935a.m20572b(m20585b);
        if (!m20586c(m20572b)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(m20572b);
        try {
            return this.f20938d.openInputStream(fromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e10));
        }
    }

    C5083e(List list, C5079a c5079a, InterfaceC5082d interfaceC5082d, InterfaceC5569b interfaceC5569b, ContentResolver contentResolver) {
        this.f20935a = c5079a;
        this.f20936b = interfaceC5082d;
        this.f20937c = interfaceC5569b;
        this.f20938d = contentResolver;
        this.f20939e = list;
    }
}
