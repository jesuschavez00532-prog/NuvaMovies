package p322s1;

import androidx.exifinterface.media.C0693b;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p109e2.AbstractC4111a;
import p230m1.InterfaceC5569b;

/* renamed from: s1.x */
/* loaded from: classes.dex */
public final class C6649x implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo7396a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public int mo7397b(InputStream inputStream, InterfaceC5569b interfaceC5569b) {
        int m3039c = new C0693b(inputStream).m3039c("Orientation", 1);
        if (m3039c == 0) {
            return -1;
        }
        return m3039c;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo7398c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public int mo7399d(ByteBuffer byteBuffer, InterfaceC5569b interfaceC5569b) {
        return mo7397b(AbstractC4111a.m17196g(byteBuffer), interfaceC5569b);
    }
}
