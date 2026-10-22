package p322s1;

import android.graphics.Bitmap;
import p184j1.C4976g;
import p184j1.C4977h;
import p184j1.EnumC4972c;
import p184j1.InterfaceC4980k;
import p230m1.InterfaceC5569b;

/* renamed from: s1.c */
/* loaded from: classes.dex */
public class C6616c implements InterfaceC4980k {

    /* renamed from: b */
    public static final C4976g f25419b = C4976g.m20320f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C4976g f25420c = C4976g.m20319e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    private final InterfaceC5569b f25421a;

    public C6616c(InterfaceC5569b interfaceC5569b) {
        this.f25421a = interfaceC5569b;
    }

    /* renamed from: d */
    private Bitmap.CompressFormat m25834d(Bitmap bitmap, C4977h c4977h) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c4977h.m20325c(f25420c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // p184j1.InterfaceC4980k
    /* renamed from: a */
    public EnumC4972c mo20331a(C4977h c4977h) {
        return EnumC4972c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #2 {all -> 0x00c2, blocks: (B:3:0x0021, B:15:0x004b, B:18:0x006c, B:20:0x0072, B:46:0x00be, B:44:0x00c1, B:38:0x0067), top: B:2:0x0021 }] */
    @Override // p184j1.InterfaceC4973d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo20315b(p216l1.InterfaceC5335v r8, java.io.File r9, p184j1.C4977h r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.m25834d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p124f2.AbstractC4220b.m17644d(r4, r2, r3, r1)
            long r2 = p109e2.AbstractC4117g.m17210b()     // Catch: java.lang.Throwable -> Lc2
            j1.g r4 = p322s1.C6616c.f25419b     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r4 = r10.m20325c(r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc2
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc2
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            m1.b r9 = r7.f25421a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            if (r9 == 0) goto L44
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            m1.b r5 = r7.f25421a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r5 = r9
            goto L45
        L44:
            r5 = r6
        L45:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r5.close()     // Catch: java.io.IOException -> L4e java.lang.Throwable -> Lc2
        L4e:
            r9 = 1
            goto L6b
        L50:
            r8 = move-exception
            r5 = r6
            goto Lbc
        L53:
            r9 = move-exception
            r5 = r6
            goto L59
        L56:
            r8 = move-exception
            goto Lbc
        L58:
            r9 = move-exception
        L59:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L65
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r9)     // Catch: java.lang.Throwable -> L56
        L65:
            if (r5 == 0) goto L6a
            r5.close()     // Catch: java.io.IOException -> L6a java.lang.Throwable -> Lc2
        L6a:
            r9 = 0
        L6b:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> Lc2
            if (r4 == 0) goto Lb8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            r4.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r5 = "Compressed with type: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = " of size "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            int r1 = p109e2.AbstractC4122l.m17236i(r8)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = " in "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            double r1 = p109e2.AbstractC4117g.m17209a(r2)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = ", options format: "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            j1.g r1 = p322s1.C6616c.f25420c     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r10 = r10.m20325c(r1)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r10)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = ", hasAlpha: "
            r4.append(r10)     // Catch: java.lang.Throwable -> Lc2
            boolean r8 = r8.hasAlpha()     // Catch: java.lang.Throwable -> Lc2
            r4.append(r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> Lc2
            android.util.Log.v(r0, r8)     // Catch: java.lang.Throwable -> Lc2
        Lb8:
            p124f2.AbstractC4220b.m17645e()
            return r9
        Lbc:
            if (r5 == 0) goto Lc1
            r5.close()     // Catch: java.io.IOException -> Lc1 java.lang.Throwable -> Lc2
        Lc1:
            throw r8     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r8 = move-exception
            p124f2.AbstractC4220b.m17645e()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p322s1.C6616c.mo20315b(l1.v, java.io.File, j1.h):boolean");
    }
}
