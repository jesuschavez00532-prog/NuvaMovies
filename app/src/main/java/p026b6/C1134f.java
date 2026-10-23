package p026b6;

import anet.channel.request.Request;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p007a6.AbstractC0074g;
import p026b6.C1133e;
import p395x5.C7503f;

/* renamed from: b6.f */
/* loaded from: classes.dex */
class C1134f implements InterfaceC1129a {

    /* renamed from: d */
    private static final Charset f4445d = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    private final File f4446a;

    /* renamed from: b */
    private final int f4447b;

    /* renamed from: c */
    private C1133e f4448c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b6.f$a */
    /* loaded from: classes.dex */
    public class a implements C1133e.d {

        /* renamed from: a */
        final /* synthetic */ byte[] f4449a;

        /* renamed from: b */
        final /* synthetic */ int[] f4450b;

        a(byte[] bArr, int[] iArr) {
            this.f4449a = bArr;
            this.f4450b = iArr;
        }

        @Override // p026b6.C1133e.d
        /* renamed from: a */
        public void mo5166a(InputStream inputStream, int i10) throws java.io.IOException {
            try {
                inputStream.read(this.f4449a, this.f4450b[0], i10);
                int[] iArr = this.f4450b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b6.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final byte[] f4452a;

        /* renamed from: b */
        public final int f4453b;

        b(byte[] bArr, int i10) {
            this.f4452a = bArr;
            this.f4453b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1134f(File file, int i10) {
        this.f4446a = file;
        this.f4447b = i10;
    }

    /* renamed from: f */
    private void m5167f(long j10, String str) {
        if (this.f4448c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f4447b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f4448c.m5161e(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f4445d));
            while (!this.f4448c.m5165q() && this.f4448c.m5160E() > this.f4447b) {
                this.f4448c.m5159A();
            }
        } catch (IOException e10) {
            C7503f.m28716f().m28720e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    /* renamed from: g */
    private b m5168g() {
        if (!this.f4446a.exists()) {
            return null;
        }
        m5169h();
        C1133e c1133e = this.f4448c;
        if (c1133e == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[c1133e.m5160E()];
        try {
            this.f4448c.m5164m(new a(bArr, iArr));
        } catch (IOException e10) {
            C7503f.m28716f().m28720e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m5169h() {
        if (this.f4448c == null) {
            try {
                this.f4448c = new C1133e(this.f4446a);
            } catch (IOException e10) {
                C7503f.m28716f().m28720e("Could not open log file: " + this.f4446a, e10);
            }
        }
    }

    @Override // p026b6.InterfaceC1129a
    /* renamed from: a */
    public void mo5110a() {
        AbstractC0074g.m255e(this.f4448c, "There was a problem closing the Crashlytics log file.");
        this.f4448c = null;
    }

    @Override // p026b6.InterfaceC1129a
    /* renamed from: b */
    public String mo5111b() {
        byte[] mo5112c = mo5112c();
        if (mo5112c != null) {
            return new String(mo5112c, f4445d);
        }
        return null;
    }

    @Override // p026b6.InterfaceC1129a
    /* renamed from: c */
    public byte[] mo5112c() {
        b m5168g = m5168g();
        if (m5168g == null) {
            return null;
        }
        int i10 = m5168g.f4453b;
        byte[] bArr = new byte[i10];
        System.arraycopy(m5168g.f4452a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // p026b6.InterfaceC1129a
    /* renamed from: d */
    public void mo5113d() {
        mo5110a();
        this.f4446a.delete();
    }

    @Override // p026b6.InterfaceC1129a
    /* renamed from: e */
    public void mo5114e(long j10, String str) {
        m5169h();
        m5167f(j10, str);
    }
}
