package p152h1;

import android.graphics.Bitmap;
import android.util.Log;
import com.umeng.analytics.pro.C3395q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p152h1.InterfaceC4503a;

/* renamed from: h1.e */
/* loaded from: classes.dex */
public class C4507e implements InterfaceC4503a {

    /* renamed from: u */
    private static final String f19500u = "e";

    /* renamed from: a */
    private int[] f19501a;

    /* renamed from: b */
    private final int[] f19502b;

    /* renamed from: c */
    private final InterfaceC4503a.a f19503c;

    /* renamed from: d */
    private ByteBuffer f19504d;

    /* renamed from: e */
    private byte[] f19505e;

    /* renamed from: f */
    private short[] f19506f;

    /* renamed from: g */
    private byte[] f19507g;

    /* renamed from: h */
    private byte[] f19508h;

    /* renamed from: i */
    private byte[] f19509i;

    /* renamed from: j */
    private int[] f19510j;

    /* renamed from: k */
    private int f19511k;

    /* renamed from: l */
    private C4505c f19512l;

    /* renamed from: m */
    private Bitmap f19513m;

    /* renamed from: n */
    private boolean f19514n;

    /* renamed from: o */
    private int f19515o;

    /* renamed from: p */
    private int f19516p;

    /* renamed from: q */
    private int f19517q;

    /* renamed from: r */
    private int f19518r;

    /* renamed from: s */
    private Boolean f19519s;

    /* renamed from: t */
    private Bitmap.Config f19520t;

    public C4507e(InterfaceC4503a.a aVar, C4505c c4505c, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        m18865i(c4505c, byteBuffer, i10);
    }

    /* renamed from: a */
    private int m18856a(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f19516p + i10; i18++) {
            byte[] bArr = this.f19509i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f19501a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f19516p + i20; i21++) {
            byte[] bArr2 = this.f19509i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f19501a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    /* renamed from: b */
    private void m18857b(C4504b c4504b) {
        boolean z10 = false;
        boolean booleanValue;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int[] iArr = this.f19510j;
        int i15 = c4504b.f19475d;
        int i16 = this.f19516p;
        int i17 = i15 / i16;
        int i18 = c4504b.f19473b / i16;
        int i19 = c4504b.f19474c / i16;
        int i20 = c4504b.f19472a / i16;
        if (this.f19511k == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i21 = this.f19518r;
        int i22 = this.f19517q;
        byte[] bArr = this.f19509i;
        int[] iArr2 = this.f19501a;
        Boolean bool = this.f19519s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i25 < i17) {
            Boolean bool2 = bool;
            if (c4504b.f19476e) {
                if (i24 >= i17) {
                    int i27 = i26 + 1;
                    i10 = i17;
                    if (i27 != 2) {
                        if (i27 != 3) {
                            if (i27 != 4) {
                                i26 = i27;
                            } else {
                                i26 = i27;
                                i24 = 1;
                                i23 = 2;
                            }
                        } else {
                            i26 = i27;
                            i24 = 2;
                            i23 = 4;
                        }
                    } else {
                        i26 = i27;
                        i24 = 4;
                    }
                } else {
                    i10 = i17;
                }
                i11 = i24 + i23;
            } else {
                i10 = i17;
                i11 = i24;
                i24 = i25;
            }
            int i28 = i24 + i18;
            if (i16 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i25 * i16 * c4504b.f19474c;
                if (z11) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & 255];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 < i31) {
                            int m18856a = m18856a(i33, i37, c4504b.f19474c);
                            if (m18856a != 0) {
                                iArr[i38] = m18856a;
                            } else if (z10 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i33 += i16;
                            i38++;
                            i19 = i13;
                        }
                    }
                    bool = bool2;
                    i25++;
                    i18 = i14;
                    i17 = i10;
                    i19 = i13;
                    i24 = i12;
                }
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i25++;
            i18 = i14;
            i17 = i10;
            i19 = i13;
            i24 = i12;
        }
        Boolean bool3 = bool;
        if (this.f19519s == null) {
            if (bool3 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool3.booleanValue();
            }
            this.f19519s = Boolean.valueOf(booleanValue);
        }
    }

    /* renamed from: c */
    private void m18858c(C4504b c4504b) {
        boolean z10 = false;
        boolean z11 = false;
        C4504b c4504b2 = c4504b;
        int[] iArr = this.f19510j;
        int i10 = c4504b2.f19475d;
        int i11 = c4504b2.f19473b;
        int i12 = c4504b2.f19474c;
        int i13 = c4504b2.f19472a;
        if (this.f19511k == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i14 = this.f19518r;
        byte[] bArr = this.f19509i;
        int[] iArr2 = this.f19501a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = c4504b2.f19474c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & 255;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            c4504b2 = c4504b;
        }
        Boolean bool = this.f19519s;
        if ((bool != null && bool.booleanValue()) || (this.f19519s == null && z10 && b10 != -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f19519s = Boolean.valueOf(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* renamed from: d */
    private void m18859d(C4504b c4504b) {
        int i10 = 0;
        int i11 = 0;
        short s10 = 0;
        C4507e c4507e = this;
        if (c4504b != null) {
            c4507e.f19504d.position(c4504b.f19481j);
        }
        if (c4504b == null) {
            C4505c c4505c = c4507e.f19512l;
            i10 = c4505c.f19488f;
            i11 = c4505c.f19489g;
        } else {
            i10 = c4504b.f19474c;
            i11 = c4504b.f19475d;
        }
        int i12 = i10 * i11;
        byte[] bArr = c4507e.f19509i;
        if (bArr == null || bArr.length < i12) {
            c4507e.f19509i = c4507e.f19503c.mo18832e(i12);
        }
        byte[] bArr2 = c4507e.f19509i;
        if (c4507e.f19506f == null) {
            c4507e.f19506f = new short[4096];
        }
        short[] sArr = c4507e.f19506f;
        if (c4507e.f19507g == null) {
            c4507e.f19507g = new byte[4096];
        }
        byte[] bArr3 = c4507e.f19507g;
        if (c4507e.f19508h == null) {
            c4507e.f19508h = new byte[C3395q.a.f14857a];
        }
        byte[] bArr4 = c4507e.f19508h;
        int m18862h = m18862h();
        int i13 = 1 << m18862h;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = m18862h + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = c4507e.f19505e;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            if (i23 == 0) {
                i23 = m18861g();
                if (i23 <= 0) {
                    c4507e.f19515o = 3;
                    break;
                }
                i24 = 0;
            }
            i26 += (bArr5[i24] & 255) << i25;
            i24++;
            i23--;
            int i31 = i25 + 8;
            int i32 = i21;
            int i33 = i20;
            int i34 = i28;
            int i35 = i16;
            int i36 = i29;
            while (true) {
                if (i31 >= i33) {
                    int i37 = i15;
                    int i38 = i26 & i22;
                    i26 >>= i33;
                    i31 -= i33;
                    if (i38 == i13) {
                        i22 = i17;
                        i33 = i35;
                        i32 = i37;
                        i15 = i32;
                        i34 = -1;
                    } else {
                        if (i38 == i14) {
                            i25 = i31;
                            i29 = i36;
                            i21 = i32;
                            i16 = i35;
                            i15 = i37;
                            i28 = i34;
                            i20 = i33;
                            c4507e = this;
                            break;
                        }
                        if (i34 == -1) {
                            bArr2[i27] = bArr3[i38];
                            i27++;
                            i18++;
                            i34 = i38;
                            i36 = i34;
                            i15 = i37;
                            i31 = i31;
                        } else {
                            if (i38 >= i32) {
                                bArr4[i30] = (byte) i36;
                                i30++;
                                s10 = i34;
                            } else {
                                s10 = i38;
                            }
                            while (s10 >= i13) {
                                bArr4[i30] = bArr3[s10];
                                i30++;
                                s10 = sArr[s10];
                            }
                            i36 = bArr3[s10] & 255;
                            byte b10 = (byte) i36;
                            bArr2[i27] = b10;
                            while (true) {
                                i27++;
                                i18++;
                                if (i30 <= 0) {
                                    break;
                                }
                                i30--;
                                bArr2[i27] = bArr4[i30];
                            }
                            byte[] bArr6 = bArr4;
                            if (i32 < 4096) {
                                sArr[i32] = (short) i34;
                                bArr3[i32] = b10;
                                i32++;
                                if ((i32 & i22) == 0 && i32 < 4096) {
                                    i33++;
                                    i22 += i32;
                                }
                            }
                            i34 = i38;
                            i15 = i37;
                            i31 = i31;
                            bArr4 = bArr6;
                        }
                    }
                } else {
                    i28 = i34;
                    i21 = i32;
                    i25 = i31;
                    c4507e = this;
                    i29 = i36;
                    i16 = i35;
                    i20 = i33;
                    break;
                }
            }
        }
        Arrays.fill(bArr2, i27, i12, (byte) 0);
    }

    /* renamed from: f */
    private Bitmap m18860f() {
        Bitmap.Config config;
        Boolean bool = this.f19519s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f19520t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap mo18828a = this.f19503c.mo18828a(this.f19518r, this.f19517q, config);
        mo18828a.setHasAlpha(true);
        return mo18828a;
    }

    /* renamed from: g */
    private int m18861g() {
        int m18862h = m18862h();
        if (m18862h <= 0) {
            return m18862h;
        }
        ByteBuffer byteBuffer = this.f19504d;
        byteBuffer.get(this.f19505e, 0, Math.min(m18862h, byteBuffer.remaining()));
        return m18862h;
    }

    /* renamed from: h */
    private int m18862h() {
        return this.f19504d.get() & 255;
    }

    /* renamed from: j */
    private Bitmap m18863j(C4504b c4504b, C4504b c4504b2) {
        int i10 = 0;
        int i11 = 0;
        Bitmap bitmap;
        int[] iArr = this.f19510j;
        int i12 = 0;
        if (c4504b2 == null) {
            Bitmap bitmap2 = this.f19513m;
            if (bitmap2 != null) {
                this.f19503c.mo18830c(bitmap2);
            }
            this.f19513m = null;
            Arrays.fill(iArr, 0);
        }
        if (c4504b2 != null && c4504b2.f19478g == 3 && this.f19513m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c4504b2 != null && (i11 = c4504b2.f19478g) > 0) {
            if (i11 == 2) {
                if (!c4504b.f19477f) {
                    C4505c c4505c = this.f19512l;
                    int i13 = c4505c.f19494l;
                    if (c4504b.f19482k == null || c4505c.f19492j != c4504b.f19479h) {
                        i12 = i13;
                    }
                }
                int i14 = c4504b2.f19475d;
                int i15 = this.f19516p;
                int i16 = i14 / i15;
                int i17 = c4504b2.f19473b / i15;
                int i18 = c4504b2.f19474c / i15;
                int i19 = c4504b2.f19472a / i15;
                int i20 = this.f19518r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f19518r;
                }
            } else if (i11 == 3 && (bitmap = this.f19513m) != null) {
                int i25 = this.f19518r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f19517q);
            }
        }
        m18859d(c4504b);
        if (!c4504b.f19476e && this.f19516p == 1) {
            m18858c(c4504b);
        } else {
            m18857b(c4504b);
        }
        if (this.f19514n && ((i10 = c4504b.f19478g) == 0 || i10 == 1)) {
            if (this.f19513m == null) {
                this.f19513m = m18860f();
            }
            Bitmap bitmap3 = this.f19513m;
            int i26 = this.f19518r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f19517q);
        }
        Bitmap m18860f = m18860f();
        int i27 = this.f19518r;
        m18860f.setPixels(iArr, 0, i27, 0, 0, i27, this.f19517q);
        return m18860f;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: A */
    public int mo18818A() {
        int i10 = this.f19512l.f19495m;
        if (i10 == -1) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // p152h1.InterfaceC4503a
    public void clear() {
        this.f19512l = null;
        byte[] bArr = this.f19509i;
        if (bArr != null) {
            this.f19503c.mo18831d(bArr);
        }
        int[] iArr = this.f19510j;
        if (iArr != null) {
            this.f19503c.mo18833f(iArr);
        }
        Bitmap bitmap = this.f19513m;
        if (bitmap != null) {
            this.f19503c.mo18830c(bitmap);
        }
        this.f19513m = null;
        this.f19504d = null;
        this.f19519s = null;
        byte[] bArr2 = this.f19505e;
        if (bArr2 != null) {
            this.f19503c.mo18831d(bArr2);
        }
    }

    /* renamed from: e */
    public int m18864e(int i10) {
        if (i10 >= 0) {
            C4505c c4505c = this.f19512l;
            if (i10 < c4505c.f19485c) {
                return ((C4504b) c4505c.f19487e.get(i10)).f19480i;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public synchronized void m18865i(C4505c c4505c, ByteBuffer byteBuffer, int i10) {
        if (i10 > 0) {
            int highestOneBit = Integer.highestOneBit(i10);
            this.f19515o = 0;
            this.f19512l = c4505c;
            this.f19511k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f19504d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f19504d.order(ByteOrder.LITTLE_ENDIAN);
            this.f19514n = false;
            Iterator it = c4505c.f19487e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C4504b) it.next()).f19478g == 3) {
                    this.f19514n = true;
                    break;
                }
            }
            this.f19516p = highestOneBit;
            int i11 = c4505c.f19488f;
            this.f19518r = i11 / highestOneBit;
            int i12 = c4505c.f19489g;
            this.f19517q = i12 / highestOneBit;
            this.f19509i = this.f19503c.mo18832e(i11 * i12);
            this.f19510j = this.f19503c.mo18829b(this.f19518r * this.f19517q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: r */
    public ByteBuffer mo18819r() {
        return this.f19504d;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: s */
    public synchronized Bitmap mo18820s() {
        C4504b c4504b;
        if (this.f19512l.f19485c <= 0 || this.f19511k < 0) {
            String str = f19500u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f19512l.f19485c + ", framePointer=" + this.f19511k);
            }
            this.f19515o = 1;
        }
        int i10 = this.f19515o;
        if (i10 != 1 && i10 != 2) {
            this.f19515o = 0;
            if (this.f19505e == null) {
                this.f19505e = this.f19503c.mo18832e(255);
            }
            C4504b c4504b2 = (C4504b) this.f19512l.f19487e.get(this.f19511k);
            int i11 = this.f19511k - 1;
            if (i11 >= 0) {
                c4504b = (C4504b) this.f19512l.f19487e.get(i11);
            } else {
                c4504b = null;
            }
            int[] iArr = c4504b2.f19482k;
            if (iArr == null) {
                iArr = this.f19512l.f19483a;
            }
            this.f19501a = iArr;
            if (iArr == null) {
                String str2 = f19500u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f19511k);
                }
                this.f19515o = 1;
                return null;
            }
            if (c4504b2.f19477f) {
                System.arraycopy(iArr, 0, this.f19502b, 0, iArr.length);
                int[] iArr2 = this.f19502b;
                this.f19501a = iArr2;
                iArr2[c4504b2.f19479h] = 0;
                if (c4504b2.f19478g == 2 && this.f19511k == 0) {
                    this.f19519s = Boolean.TRUE;
                }
            }
            return m18863j(c4504b2, c4504b);
        }
        String str3 = f19500u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f19515o);
        }
        return null;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: t */
    public void mo18821t() {
        this.f19511k = (this.f19511k + 1) % this.f19512l.f19485c;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: u */
    public int mo18822u() {
        return this.f19512l.f19485c;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: v */
    public int mo18823v() {
        int i10 = 0;
        if (this.f19512l.f19485c > 0 && (i10 = this.f19511k) >= 0) {
            return m18864e(i10);
        }
        return 0;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: w */
    public void mo18824w(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f19520t = config;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: x */
    public void mo18825x() {
        this.f19511k = -1;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: y */
    public int mo18826y() {
        return this.f19511k;
    }

    @Override // p152h1.InterfaceC4503a
    /* renamed from: z */
    public int mo18827z() {
        return this.f19504d.limit() + this.f19509i.length + (this.f19510j.length * 4);
    }

    public C4507e(InterfaceC4503a.a aVar) {
        this.f19502b = new int[256];
        this.f19520t = Bitmap.Config.ARGB_8888;
        this.f19503c = aVar;
        this.f19512l = new C4505c();
    }
}
