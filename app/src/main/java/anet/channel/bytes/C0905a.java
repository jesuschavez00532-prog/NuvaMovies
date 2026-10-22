package anet.channel.bytes;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: anet.channel.bytes.a */
/* loaded from: classes.dex */
public class C0905a {
    public static final int MAX_POOL_SIZE = 524288;
    public static final String TAG = "awcn.ByteArrayPool";

    /* renamed from: a */
    private final TreeSet<ByteArray> f3801a = new TreeSet<>();

    /* renamed from: b */
    private final ByteArray f3802b = ByteArray.create(0);

    /* renamed from: c */
    private final Random f3803c = new Random();

    /* renamed from: d */
    private long f3804d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: anet.channel.bytes.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static C0905a f3805a = new C0905a();

        a() {
        }
    }

    /* renamed from: a */
    public synchronized void m4512a(ByteArray byteArray) {
        ByteArray pollLast;
        if (byteArray != null) {
            int i10 = byteArray.bufferLength;
            if (i10 < 524288) {
                this.f3804d += i10;
                this.f3801a.add(byteArray);
                while (this.f3804d > 524288) {
                    if (this.f3803c.nextBoolean()) {
                        pollLast = this.f3801a.pollFirst();
                    } else {
                        pollLast = this.f3801a.pollLast();
                    }
                    this.f3804d -= pollLast.bufferLength;
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized ByteArray m4510a(int i10) {
        if (i10 >= 524288) {
            return ByteArray.create(i10);
        }
        ByteArray byteArray = this.f3802b;
        byteArray.bufferLength = i10;
        ByteArray ceiling = this.f3801a.ceiling(byteArray);
        if (ceiling == null) {
            ceiling = ByteArray.create(i10);
        } else {
            Arrays.fill(ceiling.buffer, (byte) 0);
            ceiling.dataLength = 0;
            this.f3801a.remove(ceiling);
            this.f3804d -= ceiling.bufferLength;
        }
        return ceiling;
    }

    /* renamed from: a */
    public ByteArray m4511a(byte[] bArr, int i10) {
        ByteArray m4510a = m4510a(i10);
        System.arraycopy(bArr, 0, m4510a.buffer, 0, i10);
        m4510a.dataLength = i10;
        return m4510a;
    }
}
