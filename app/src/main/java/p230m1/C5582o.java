package p230m1;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p109e2.AbstractC4122l;

/* renamed from: m1.o */
/* loaded from: classes.dex */
public class C5582o implements InterfaceC5579l {

    /* renamed from: d */
    private static final Bitmap.Config[] f22603d;

    /* renamed from: e */
    private static final Bitmap.Config[] f22604e;

    /* renamed from: f */
    private static final Bitmap.Config[] f22605f;

    /* renamed from: g */
    private static final Bitmap.Config[] f22606g;

    /* renamed from: h */
    private static final Bitmap.Config[] f22607h;

    /* renamed from: a */
    private final c f22608a = new c();

    /* renamed from: b */
    private final C5574g f22609b = new C5574g();

    /* renamed from: c */
    private final Map f22610c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1.o$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22611a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f22611a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22611a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22611a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22611a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1.o$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC5580m {

        /* renamed from: a */
        private final c f22612a;

        /* renamed from: b */
        int f22613b;

        /* renamed from: c */
        private Bitmap.Config f22614c;

        public b(c cVar) {
            this.f22612a = cVar;
        }

        @Override // p230m1.InterfaceC5580m
        /* renamed from: a */
        public void mo22645a() {
            this.f22612a.m22614c(this);
        }

        /* renamed from: b */
        public void m22675b(int i10, Bitmap.Config config) {
            this.f22613b = i10;
            this.f22614c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f22613b != bVar.f22613b || !AbstractC4122l.m17232e(this.f22614c, bVar.f22614c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11 = this.f22613b * 31;
            Bitmap.Config config = this.f22614c;
            if (config != null) {
                i10 = config.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public String toString() {
            return C5582o.m22672h(this.f22613b, this.f22614c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1.o$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC5570c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p230m1.AbstractC5570c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo22612a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m22677e(int i10, Bitmap.Config config) {
            b bVar = (b) m22613b();
            bVar.m22675b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f22603d = configArr;
        f22604e = configArr;
        f22605f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f22606g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f22607h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: f */
    private void m22670f(Integer num, Bitmap bitmap) {
        NavigableMap m22674j = m22674j(bitmap.getConfig());
        Integer num2 = (Integer) m22674j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m22674j.remove(num);
                return;
            } else {
                m22674j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo22668e(bitmap) + ", this: " + this);
    }

    /* renamed from: g */
    private b m22671g(int i10, Bitmap.Config config) {
        b m22677e = this.f22608a.m22677e(i10, config);
        for (Bitmap.Config config2 : m22673i(config)) {
            Integer num = (Integer) m22674j(config2).ceilingKey(Integer.valueOf(i10));
            if (num != null && num.intValue() <= i10 * 8) {
                if (num.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return m22677e;
                        }
                    } else if (config2.equals(config)) {
                        return m22677e;
                    }
                }
                this.f22608a.m22614c(m22677e);
                return this.f22608a.m22677e(num.intValue(), config2);
            }
        }
        return m22677e;
    }

    /* renamed from: h */
    static String m22672h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    /* renamed from: i */
    private static Bitmap.Config[] m22673i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f22604e;
            }
        }
        int i10 = a.f22611a[config.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return new Bitmap.Config[]{config};
                    }
                    return f22607h;
                }
                return f22606g;
            }
            return f22605f;
        }
        return f22603d;
    }

    /* renamed from: j */
    private NavigableMap m22674j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f22610c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f22610c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // p230m1.InterfaceC5579l
    /* renamed from: a */
    public String mo22664a(int i10, int i11, Bitmap.Config config) {
        return m22672h(AbstractC4122l.m17235h(i10, i11, config), config);
    }

    @Override // p230m1.InterfaceC5579l
    /* renamed from: b */
    public int mo22665b(Bitmap bitmap) {
        return AbstractC4122l.m17236i(bitmap);
    }

    @Override // p230m1.InterfaceC5579l
    /* renamed from: c */
    public void mo22666c(Bitmap bitmap) {
        b m22677e = this.f22608a.m22677e(AbstractC4122l.m17236i(bitmap), bitmap.getConfig());
        this.f22609b.m22627d(m22677e, bitmap);
        NavigableMap m22674j = m22674j(bitmap.getConfig());
        Integer num = (Integer) m22674j.get(Integer.valueOf(m22677e.f22613b));
        Integer valueOf = Integer.valueOf(m22677e.f22613b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        m22674j.put(valueOf, Integer.valueOf(i10));
    }

    @Override // p230m1.InterfaceC5579l
    /* renamed from: d */
    public Bitmap mo22667d(int i10, int i11, Bitmap.Config config) {
        b m22671g = m22671g(AbstractC4122l.m17235h(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f22609b.m22626a(m22671g);
        if (bitmap != null) {
            m22670f(Integer.valueOf(m22671g.f22613b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // p230m1.InterfaceC5579l
    /* renamed from: e */
    public String mo22668e(Bitmap bitmap) {
        return m22672h(AbstractC4122l.m17236i(bitmap), bitmap.getConfig());
    }

    @Override // p230m1.InterfaceC5579l
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f22609b.m22628f();
        if (bitmap != null) {
            m22670f(Integer.valueOf(AbstractC4122l.m17236i(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f22609b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f22610c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f22610c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
