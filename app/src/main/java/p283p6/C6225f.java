package p283p6;

import anet.channel.request.Request;
import com.lzy.okgo.cache.CacheEntity;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p235m6.C5598b;
import p235m6.C5599c;
import p235m6.InterfaceC5600d;
import p235m6.InterfaceC5601e;
import p235m6.InterfaceC5602f;
import p283p6.InterfaceC6223d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p6.f */
/* loaded from: classes.dex */
public final class C6225f implements InterfaceC5601e {

    /* renamed from: f */
    private static final Charset f24422f = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: g */
    private static final C5599c f24423g = C5599c.m22761a(CacheEntity.KEY).m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

    /* renamed from: h */
    private static final C5599c f24424h = C5599c.m22761a("value").m22766b(C6220a.m24809b().m24811c(2).m24810a()).m22765a();

    /* renamed from: i */
    private static final InterfaceC5600d f24425i = new InterfaceC5600d() { // from class: p6.e
        @Override // p235m6.InterfaceC5600d
        /* renamed from: a */
        public final void mo6142a(Object obj, Object obj2) {
            C6225f.m24821v((Map.Entry) obj, (InterfaceC5601e) obj2);
        }
    };

    /* renamed from: a */
    private OutputStream f24426a;

    /* renamed from: b */
    private final Map f24427b;

    /* renamed from: c */
    private final Map f24428c;

    /* renamed from: d */
    private final InterfaceC5600d f24429d;

    /* renamed from: e */
    private final C6228i f24430e = new C6228i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p6.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24431a;

        static {
            int[] iArr = new int[InterfaceC6223d.a.values().length];
            f24431a = iArr;
            try {
                iArr[InterfaceC6223d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24431a[InterfaceC6223d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24431a[InterfaceC6223d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6225f(OutputStream outputStream, Map map, Map map2, InterfaceC5600d interfaceC5600d) {
        this.f24426a = outputStream;
        this.f24427b = map;
        this.f24428c = map2;
        this.f24429d = interfaceC5600d;
    }

    /* renamed from: o */
    private static ByteBuffer m24815o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private long m24816p(InterfaceC5600d interfaceC5600d, Object obj) {
        C6221b c6221b = new C6221b();
        try {
            OutputStream outputStream = this.f24426a;
            this.f24426a = c6221b;
            try {
                interfaceC5600d.mo6142a(obj, this);
                this.f24426a = outputStream;
                long m24812a = c6221b.m24812a();
                c6221b.close();
                return m24812a;
            } catch (Throwable th) {
                this.f24426a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c6221b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: q */
    private C6225f m24817q(InterfaceC5600d interfaceC5600d, C5599c c5599c, Object obj, boolean z10) {
        long m24816p = m24816p(interfaceC5600d, obj);
        if (z10 && m24816p == 0) {
            return this;
        }
        m24822w((m24820u(c5599c) << 3) | 2);
        m24823x(m24816p);
        interfaceC5600d.mo6142a(obj, this);
        return this;
    }

    /* renamed from: r */
    private C6225f m24818r(InterfaceC5602f interfaceC5602f, C5599c c5599c, Object obj, boolean z10) {
        this.f24430e.m24843b(c5599c, z10);
        interfaceC5602f.mo22771a(obj, this.f24430e);
        return this;
    }

    /* renamed from: t */
    private static InterfaceC6223d m24819t(C5599c c5599c) {
        InterfaceC6223d interfaceC6223d = (InterfaceC6223d) c5599c.m22764c(InterfaceC6223d.class);
        if (interfaceC6223d != null) {
            return interfaceC6223d;
        }
        throw new C5598b("Field has no @Protobuf config");
    }

    /* renamed from: u */
    private static int m24820u(C5599c c5599c) {
        InterfaceC6223d interfaceC6223d = (InterfaceC6223d) c5599c.m22764c(InterfaceC6223d.class);
        if (interfaceC6223d != null) {
            return interfaceC6223d.tag();
        }
        throw new C5598b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m24821v(Map.Entry entry, InterfaceC5601e interfaceC5601e) {
        interfaceC5601e.mo22770f(f24423g, entry.getKey());
        interfaceC5601e.mo22770f(f24424h, entry.getValue());
    }

    /* renamed from: w */
    private void m24822w(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f24426a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f24426a.write(i10 & 127);
    }

    /* renamed from: x */
    private void m24823x(long j10) {
        while (((-128) & j10) != 0) {
            this.f24426a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f24426a.write(((int) j10) & 127);
    }

    /* renamed from: e */
    InterfaceC5601e m24824e(C5599c c5599c, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        m24822w((m24820u(c5599c) << 3) | 1);
        this.f24426a.write(m24815o(8).putDouble(d10).array());
        return this;
    }

    @Override // p235m6.InterfaceC5601e
    /* renamed from: f */
    public InterfaceC5601e mo22770f(C5599c c5599c, Object obj) {
        return m24826h(c5599c, obj, true);
    }

    /* renamed from: g */
    InterfaceC5601e m24825g(C5599c c5599c, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        m24822w((m24820u(c5599c) << 3) | 5);
        this.f24426a.write(m24815o(4).putFloat(f10).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public InterfaceC5601e m24826h(C5599c c5599c, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            m24822w((m24820u(c5599c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f24422f);
            m24822w(bytes.length);
            this.f24426a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m24826h(c5599c, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m24817q(f24425i, c5599c, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m24824e(c5599c, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return m24825g(c5599c, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return m24830l(c5599c, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return m24832n(c5599c, ((Boolean) obj).booleanValue(), z10);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            m24822w((m24820u(c5599c) << 3) | 2);
            m24822w(bArr.length);
            this.f24426a.write(bArr);
            return this;
        }
        InterfaceC5600d interfaceC5600d = (InterfaceC5600d) this.f24427b.get(obj.getClass());
        if (interfaceC5600d != null) {
            return m24817q(interfaceC5600d, c5599c, obj, z10);
        }
        InterfaceC5602f interfaceC5602f = (InterfaceC5602f) this.f24428c.get(obj.getClass());
        if (interfaceC5602f != null) {
            return m24818r(interfaceC5602f, c5599c, obj, z10);
        }
        if (obj instanceof InterfaceC6222c) {
            return mo22768b(c5599c, ((InterfaceC6222c) obj).mo24813a());
        }
        if (obj instanceof Enum) {
            return mo22768b(c5599c, ((Enum) obj).ordinal());
        }
        return m24817q(this.f24429d, c5599c, obj, z10);
    }

    @Override // p235m6.InterfaceC5601e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C6225f mo22768b(C5599c c5599c, int i10) {
        return m24828j(c5599c, i10, true);
    }

    /* renamed from: j */
    C6225f m24828j(C5599c c5599c, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC6223d m24819t = m24819t(c5599c);
        int i11 = a.f24431a[m24819t.intEncoding().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m24822w((m24819t.tag() << 3) | 5);
                    this.f24426a.write(m24815o(4).putInt(i10).array());
                }
            } else {
                m24822w(m24819t.tag() << 3);
                m24822w((i10 << 1) ^ (i10 >> 31));
            }
        } else {
            m24822w(m24819t.tag() << 3);
            m24822w(i10);
        }
        return this;
    }

    @Override // p235m6.InterfaceC5601e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C6225f mo22767a(C5599c c5599c, long j10) {
        return m24830l(c5599c, j10, true);
    }

    /* renamed from: l */
    C6225f m24830l(C5599c c5599c, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC6223d m24819t = m24819t(c5599c);
        int i10 = a.f24431a[m24819t.intEncoding().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    m24822w((m24819t.tag() << 3) | 1);
                    this.f24426a.write(m24815o(8).putLong(j10).array());
                }
            } else {
                m24822w(m24819t.tag() << 3);
                m24823x((j10 >> 63) ^ (j10 << 1));
            }
        } else {
            m24822w(m24819t.tag() << 3);
            m24823x(j10);
        }
        return this;
    }

    @Override // p235m6.InterfaceC5601e
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6225f mo22769c(C5599c c5599c, boolean z10) {
        return m24832n(c5599c, z10, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C6225f m24832n(C5599c c5599c, boolean z10, boolean z11) {
        return m24828j(c5599c, z10 ? 1 : 0, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C6225f m24833s(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC5600d interfaceC5600d = (InterfaceC5600d) this.f24427b.get(obj.getClass());
        if (interfaceC5600d != null) {
            interfaceC5600d.mo6142a(obj, this);
            return this;
        }
        throw new C5598b("No encoder for " + obj.getClass());
    }
}
