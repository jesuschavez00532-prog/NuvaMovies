package p007a6;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: a6.f */
/* loaded from: classes.dex */
class C0072f {

    /* renamed from: a */
    private static final AtomicLong f201a = new AtomicLong(0);

    /* renamed from: b */
    private static String f202b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0072f(C0104w c0104w) {
        byte[] bArr = new byte[10];
        m246e(bArr);
        m245d(bArr);
        m244c(bArr);
        String m249B = AbstractC0074g.m249B(c0104w.mo474a());
        String m272v = AbstractC0074g.m272v(bArr);
        Locale locale = Locale.US;
        f202b = String.format(locale, "%s%s%s%s", m272v.substring(0, 12), m272v.substring(12, 16), m272v.subSequence(16, 20), m249B.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m242a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m243b(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m244c(byte[] bArr) {
        byte[] m243b = m243b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m243b[0];
        bArr[9] = m243b[1];
    }

    /* renamed from: d */
    private void m245d(byte[] bArr) {
        byte[] m243b = m243b(f201a.incrementAndGet());
        bArr[6] = m243b[0];
        bArr[7] = m243b[1];
    }

    /* renamed from: e */
    private void m246e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m242a = m242a(time / 1000);
        bArr[0] = m242a[0];
        bArr[1] = m242a[1];
        bArr[2] = m242a[2];
        bArr[3] = m242a[3];
        byte[] m243b = m243b(time % 1000);
        bArr[4] = m243b[0];
        bArr[5] = m243b[1];
    }

    public String toString() {
        return f202b;
    }
}
