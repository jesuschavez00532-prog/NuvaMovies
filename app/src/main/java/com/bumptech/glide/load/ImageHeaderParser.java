package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p230m1.InterfaceC5569b;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* renamed from: a */
        private final boolean f6378a;

        ImageType(boolean z10) {
            this.f6378a = z10;
        }

        public boolean hasAlpha() {
            return this.f6378a;
        }

        public boolean isWebp() {
            int i10 = C1598a.f6379a[ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C1598a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6379a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f6379a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6379a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6379a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    ImageType mo7396a(ByteBuffer byteBuffer);

    /* renamed from: b */
    int mo7397b(InputStream inputStream, InterfaceC5569b interfaceC5569b);

    /* renamed from: c */
    ImageType mo7398c(InputStream inputStream);

    /* renamed from: d */
    int mo7399d(ByteBuffer byteBuffer, InterfaceC5569b interfaceC5569b);
}
