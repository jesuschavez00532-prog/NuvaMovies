package p352u6;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: u6.f */
/* loaded from: classes.dex */
public class C7050f {

    /* renamed from: a */
    private static final byte f26423a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f26424b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m27147b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m27148c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m27149a() {
        byte[] m27148c = m27148c(UUID.randomUUID(), new byte[17]);
        byte b10 = m27148c[0];
        m27148c[16] = b10;
        m27148c[0] = (byte) ((b10 & f26424b) | f26423a);
        return m27147b(m27148c);
    }
}
