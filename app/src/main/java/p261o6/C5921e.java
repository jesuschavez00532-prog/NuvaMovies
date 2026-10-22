package p261o6;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p235m6.C5598b;
import p235m6.C5599c;
import p235m6.InterfaceC5600d;
import p235m6.InterfaceC5601e;
import p235m6.InterfaceC5602f;
import p235m6.InterfaceC5603g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.e */
/* loaded from: classes.dex */
public final class C5921e implements InterfaceC5601e, InterfaceC5603g {

    /* renamed from: a */
    private C5921e f23552a = null;

    /* renamed from: b */
    private boolean f23553b = true;

    /* renamed from: c */
    private final JsonWriter f23554c;

    /* renamed from: d */
    private final Map f23555d;

    /* renamed from: e */
    private final Map f23556e;

    /* renamed from: f */
    private final InterfaceC5600d f23557f;

    /* renamed from: g */
    private final boolean f23558g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5921e(Writer writer, Map map, Map map2, InterfaceC5600d interfaceC5600d, boolean z10) {
        this.f23554c = new JsonWriter(writer);
        this.f23555d = map;
        this.f23556e = map2;
        this.f23557f = interfaceC5600d;
        this.f23558g = z10;
    }

    /* renamed from: q */
    private boolean m23941q(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private C5921e m23942t(String str, Object obj) {
        m23944v();
        this.f23554c.name(str);
        if (obj == null) {
            this.f23554c.nullValue();
            return this;
        }
        return m23947i(obj, false);
    }

    /* renamed from: u */
    private C5921e m23943u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m23944v();
        this.f23554c.name(str);
        return m23947i(obj, false);
    }

    /* renamed from: v */
    private void m23944v() {
        if (this.f23553b) {
            C5921e c5921e = this.f23552a;
            if (c5921e != null) {
                c5921e.m23944v();
                this.f23552a.f23553b = false;
                this.f23552a = null;
                this.f23554c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // p235m6.InterfaceC5601e
    /* renamed from: a */
    public InterfaceC5601e mo22767a(C5599c c5599c, long j10) {
        return m23950l(c5599c.m22763b(), j10);
    }

    @Override // p235m6.InterfaceC5601e
    /* renamed from: b */
    public InterfaceC5601e mo22768b(C5599c c5599c, int i10) {
        return m23949k(c5599c.m22763b(), i10);
    }

    @Override // p235m6.InterfaceC5601e
    /* renamed from: c */
    public InterfaceC5601e mo22769c(C5599c c5599c, boolean z10) {
        return m23952n(c5599c.m22763b(), z10);
    }

    @Override // p235m6.InterfaceC5601e
    /* renamed from: f */
    public InterfaceC5601e mo22770f(C5599c c5599c, Object obj) {
        return m23951m(c5599c.m22763b(), obj);
    }

    /* renamed from: g */
    public C5921e m23945g(int i10) {
        m23944v();
        this.f23554c.value(i10);
        return this;
    }

    /* renamed from: h */
    public C5921e m23946h(long j10) {
        m23944v();
        this.f23554c.value(j10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C5921e m23947i(Object obj, boolean z10) {
        Class<?> cls;
        int i10 = 0;
        if (z10 && m23941q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new C5598b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f23554c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f23554c.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return m23954p((byte[]) obj);
            }
            this.f23554c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    this.f23554c.value(r6[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    m23946h(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f23554c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f23554c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m23947i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m23947i(obj2, false);
                }
            }
            this.f23554c.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.f23554c.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m23947i(it.next(), false);
            }
            this.f23554c.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.f23554c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m23951m((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new C5598b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            this.f23554c.endObject();
            return this;
        }
        InterfaceC5600d interfaceC5600d = (InterfaceC5600d) this.f23555d.get(obj.getClass());
        if (interfaceC5600d != null) {
            return m23956s(interfaceC5600d, obj, z10);
        }
        InterfaceC5602f interfaceC5602f = (InterfaceC5602f) this.f23556e.get(obj.getClass());
        if (interfaceC5602f != null) {
            interfaceC5602f.mo22771a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            mo22772d(((Enum) obj).name());
            return this;
        }
        return m23956s(this.f23557f, obj, z10);
    }

    @Override // p235m6.InterfaceC5603g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C5921e mo22772d(String str) {
        m23944v();
        this.f23554c.value(str);
        return this;
    }

    /* renamed from: k */
    public C5921e m23949k(String str, int i10) {
        m23944v();
        this.f23554c.name(str);
        return m23945g(i10);
    }

    /* renamed from: l */
    public C5921e m23950l(String str, long j10) {
        m23944v();
        this.f23554c.name(str);
        return m23946h(j10);
    }

    /* renamed from: m */
    public C5921e m23951m(String str, Object obj) {
        if (this.f23558g) {
            return m23943u(str, obj);
        }
        return m23942t(str, obj);
    }

    /* renamed from: n */
    public C5921e m23952n(String str, boolean z10) {
        m23944v();
        this.f23554c.name(str);
        return mo22773e(z10);
    }

    @Override // p235m6.InterfaceC5603g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C5921e mo22773e(boolean z10) {
        m23944v();
        this.f23554c.value(z10);
        return this;
    }

    /* renamed from: p */
    public C5921e m23954p(byte[] bArr) {
        m23944v();
        if (bArr == null) {
            this.f23554c.nullValue();
        } else {
            this.f23554c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m23955r() {
        m23944v();
        this.f23554c.flush();
    }

    /* renamed from: s */
    C5921e m23956s(InterfaceC5600d interfaceC5600d, Object obj, boolean z10) {
        if (!z10) {
            this.f23554c.beginObject();
        }
        interfaceC5600d.mo6142a(obj, this);
        if (!z10) {
            this.f23554c.endObject();
        }
        return this;
    }
}
