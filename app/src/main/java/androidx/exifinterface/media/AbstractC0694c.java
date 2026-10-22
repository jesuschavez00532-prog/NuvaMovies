package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: androidx.exifinterface.media.c */
/* loaded from: classes.dex */
abstract class AbstractC0694c {

    /* renamed from: androidx.exifinterface.media.c$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m3061a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        /* renamed from: b */
        static FileDescriptor m3062b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static long m3063c(FileDescriptor fileDescriptor, long j10, int i10) {
            return Os.lseek(fileDescriptor, j10, i10);
        }
    }

    /* renamed from: androidx.exifinterface.media.c$b */
    /* loaded from: classes.dex */
    static class b {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static void m3064a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m3058a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long[] m3059b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m3060c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}
