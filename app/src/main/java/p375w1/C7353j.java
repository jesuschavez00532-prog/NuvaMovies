package p375w1;

import android.util.Log;
import com.bumptech.glide.load.AbstractC1599a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5569b;

/* renamed from: w1.j */
/* loaded from: classes.dex */
public class C7353j implements InterfaceC4979j {

    /* renamed from: a */
    private final List f27294a;

    /* renamed from: b */
    private final InterfaceC4979j f27295b;

    /* renamed from: c */
    private final InterfaceC5569b f27296c;

    public C7353j(List list, InterfaceC4979j interfaceC4979j, InterfaceC5569b interfaceC5569b) {
        this.f27294a = list;
        this.f27295b = interfaceC4979j;
        this.f27296c = interfaceC5569b;
    }

    /* renamed from: e */
    private static byte[] m28380e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
                return null;
            }
            return null;
        }
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5335v mo20329a(InputStream inputStream, int i10, int i11, C4977h c4977h) {
        byte[] m28380e = m28380e(inputStream);
        if (m28380e == null) {
            return null;
        }
        return this.f27295b.mo20329a(ByteBuffer.wrap(m28380e), i10, i11, c4977h);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(InputStream inputStream, C4977h c4977h) {
        if (!((Boolean) c4977h.m20325c(AbstractC7352i.f27293b)).booleanValue() && AbstractC1599a.m7406f(this.f27294a, inputStream, this.f27296c) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }
}
