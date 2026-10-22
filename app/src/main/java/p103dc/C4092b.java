package p103dc;

import ec.AbstractC4172d;
import java.io.OutputStream;

/* renamed from: dc.b */
/* loaded from: classes.dex */
public class C4092b extends AbstractC4172d {
    @Override // ec.AbstractC4172d
    /* renamed from: a */
    protected int mo17127a() {
        return 3;
    }

    @Override // ec.AbstractC4172d
    /* renamed from: b */
    protected int mo17128b() {
        return 57;
    }

    @Override // ec.AbstractC4172d
    /* renamed from: e */
    protected void mo17129e(OutputStream outputStream, byte[] bArr, int i10, int i11) {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        if (i11 == 1) {
            byte b10 = bArr[i10];
            outputStream.write(cArr[(b10 >>> 2) & 63]);
            outputStream.write(cArr[((b10 << 4) & 48) + 0]);
            outputStream.write(61);
            outputStream.write(61);
            return;
        }
        if (i11 == 2) {
            byte b11 = bArr[i10];
            byte b12 = bArr[i10 + 1];
            outputStream.write(cArr[(b11 >>> 2) & 63]);
            outputStream.write(cArr[((b11 << 4) & 48) + ((b12 >>> 4) & 15)]);
            outputStream.write(cArr[((b12 << 2) & 60) + 0]);
            outputStream.write(61);
            return;
        }
        byte b13 = bArr[i10];
        byte b14 = bArr[i10 + 1];
        byte b15 = bArr[i10 + 2];
        outputStream.write(cArr[(b13 >>> 2) & 63]);
        outputStream.write(cArr[((b13 << 4) & 48) + ((b14 >>> 4) & 15)]);
        outputStream.write(cArr[((b14 << 2) & 60) + ((b15 >>> 6) & 3)]);
        outputStream.write(cArr[b15 & 63]);
    }
}
