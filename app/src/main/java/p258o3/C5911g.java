package p258o3;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.os.storage.StorageManager;
import be.AbstractC1320p;
import be.C1318n;
import be.C1328x;
import com.download.bean.UDiskBean;
import com.lzy.okgo.OkGo;
import com.umeng.analytics.pro.C3384f;
import ee.InterfaceC4181d;
import ge.AbstractC4435b;
import ge.AbstractC4445l;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import me.InterfaceC5665q;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p125f3.C4223b;
import p125f3.C4224c;
import p136fe.AbstractC4313d;
import p142g3.C4343e;
import p258o3.C5909e;
import p287pb.AbstractApplicationC6253c;
import ve.AbstractC7269d;
import ve.AbstractC7285i0;
import ve.AbstractC7329x;
import ve.C7297m0;
import ve.C7327w0;
import ve.InterfaceC7261a0;

/* renamed from: o3.g */
/* loaded from: classes.dex */
public final class C5911g {

    /* renamed from: h */
    public static final a f23514h = new a(null);

    /* renamed from: i */
    private static C5911g f23515i;

    /* renamed from: a */
    private final String f23516a;

    /* renamed from: b */
    private final String f23517b;

    /* renamed from: c */
    private StorageManager f23518c;

    /* renamed from: d */
    private UDiskBean f23519d;

    /* renamed from: e */
    private final ArrayList f23520e;

    /* renamed from: f */
    private InterfaceC5665q f23521f;

    /* renamed from: g */
    private InterfaceC5642a f23522g;

    /* renamed from: o3.g$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C5911g m23905a() {
            if (C5911g.f23515i == null) {
                synchronized (C5911g.class) {
                    if (C5911g.f23515i == null) {
                        C5911g.f23515i = new C5911g(null);
                    }
                    C1328x c1328x = C1328x.f4998a;
                }
            }
            C5911g c5911g = C5911g.f23515i;
            AbstractC5868k.m23671c(c5911g);
            return c5911g;
        }
    }

    /* renamed from: o3.g$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        int f23523e;

        b(InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new b(interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            Object m18094c = null;
            m18094c = AbstractC4313d.m18094c();
            int i10 = this.f23523e;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC1320p.m5976b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1320p.m5976b(obj);
                this.f23523e = 1;
                if (AbstractC7285i0.m28228a(2000L, this) == m18094c) {
                    return m18094c;
                }
            }
            C5911g.this.m23891x();
            C5911g c5911g = C5911g.this;
            c5911g.m23890u(c5911g.m23893h());
            return C1328x.f4998a;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((b) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o3.g$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        int f23525e;

        /* renamed from: g */
        final /* synthetic */ UDiskBean f23527g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o3.g$c$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC4445l implements InterfaceC5664p {

            /* renamed from: e */
            int f23528e;

            /* renamed from: f */
            final /* synthetic */ C5911g f23529f;

            /* renamed from: g */
            final /* synthetic */ UDiskBean f23530g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5911g c5911g, UDiskBean uDiskBean, InterfaceC4181d interfaceC4181d) {
                super(2, interfaceC4181d);
                this.f23529f = c5911g;
                this.f23530g = uDiskBean;
            }

            @Override // ge.AbstractC4434a
            /* renamed from: a */
            public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                return new a(this.f23529f, this.f23530g, interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: l */
            public final Object mo2392l(Object obj) {
                AbstractC4313d.m18094c();
                if (this.f23528e == 0) {
                    AbstractC1320p.m5976b(obj);
                    this.f23529f.m23889t(this.f23530g.getPath());
                    return C1328x.f4998a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // me.InterfaceC5664p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                return ((a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(UDiskBean uDiskBean, InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
            this.f23527g = uDiskBean;
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new c(this.f23527g, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            Object m18094c = null;
            m18094c = AbstractC4313d.m18094c();
            int i10 = this.f23525e;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC1320p.m5976b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1320p.m5976b(obj);
                AbstractC7329x m28252b = C7297m0.m28252b();
                a aVar = new a(C5911g.this, this.f23527g, null);
                this.f23525e = 1;
                if (AbstractC7269d.m28113c(m28252b, aVar, this) == m18094c) {
                    return m18094c;
                }
            }
            InterfaceC5665q m23896k = C5911g.this.m23896k();
            if (m23896k != null) {
                m23896k.mo12281b(AbstractC4435b.m18626a(true), this.f23527g.getName(), this.f23527g.getPath());
            }
            return C1328x.f4998a;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((c) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    public /* synthetic */ C5911g(AbstractC5864g abstractC5864g) {
        this();
    }

    /* renamed from: g */
    private final void m23886g() {
        C4224c m17667v = C4224c.m17667v();
        if (m17667v != null) {
            m17667v.m17668n();
        }
        C4343e.m18227a().m18233e();
        C4343e.m18227a().m18231c().clear();
        C5909e.a aVar = C5909e.f23504f;
        Context context = OkGo.getInstance().getContext();
        AbstractC5868k.m23673e(context, "getInstance().context");
        aVar.m23878a(context).m23873h();
        InterfaceC5642a interfaceC5642a = this.f23522g;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
        this.f23522g = null;
    }

    /* renamed from: n */
    private final ArrayList m23887n(Context context) {
        Method method;
        String str = null;
        String str2 = null;
        Object obj = null;
        String str3 = null;
        String str4 = null;
        C5911g c5911g = this;
        ArrayList arrayList = new ArrayList();
        Method declaredMethod = StorageManager.class.getDeclaredMethod("getVolumeList", new Class[0]);
        int i10 = 1;
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(c5911g.f23518c, new Object[0]);
        AbstractC5868k.m23672d(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        try {
            method = StorageManager.class.getDeclaredMethod("getVolumeFSLabel", String.class);
        } catch (Exception e10) {
            e10.printStackTrace();
            method = null;
        }
        if (method != null) {
            method.setAccessible(true);
        }
        Class<?> cls = Class.forName("android.os.storage.StorageVolume");
        Method declaredMethod2 = cls.getDeclaredMethod("getPath", new Class[0]);
        declaredMethod2.setAccessible(true);
        Method declaredMethod3 = cls.getDeclaredMethod("getDescription", Context.class);
        declaredMethod3.setAccessible(true);
        Method declaredMethod4 = cls.getDeclaredMethod("getState", new Class[0]);
        declaredMethod4.setAccessible(true);
        Method declaredMethod5 = cls.getDeclaredMethod("isRemovable", new Class[0]);
        declaredMethod5.setAccessible(true);
        int length = objArr.length;
        int i11 = 0;
        while (i11 < length) {
            Object obj2 = objArr[i11];
            Object invoke2 = declaredMethod2.invoke(obj2, new Object[0]);
            if (invoke2 instanceof String) {
                str = (String) invoke2;
            } else {
                str = null;
            }
            Object[] objArr2 = new Object[i10];
            objArr2[0] = context;
            Object invoke3 = declaredMethod3.invoke(obj2, objArr2);
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            } else {
                str2 = null;
            }
            if (method != null) {
                StorageManager storageManager = c5911g.f23518c;
                Object[] objArr3 = new Object[i10];
                objArr3[0] = str;
                obj = method.invoke(storageManager, objArr3);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            Object invoke4 = declaredMethod5.invoke(obj2, new Object[0]);
            AbstractC5868k.m23672d(invoke4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) invoke4).booleanValue();
            Object invoke5 = declaredMethod4.invoke(obj2, new Object[0]);
            if (invoke5 instanceof String) {
                str4 = (String) invoke5;
            } else {
                str4 = null;
            }
            if (booleanValue && AbstractC5868k.m23669a(str4, "mounted") && str2 != null && str != null) {
                if (str3 != null) {
                    str2 = str3;
                }
                arrayList.add(new C1318n(str2, str));
            }
            i11++;
            c5911g = this;
            i10 = 1;
        }
        return arrayList;
    }

    /* renamed from: o */
    private final ArrayList m23888o() {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.os.storage.VolumeInfo");
            AbstractC5868k.m23672d(cls, "null cannot be cast to non-null type java.lang.Class<*>");
            AbstractC5868k.m23672d(cls.getMethod("getDescriptionComparator", new Class[0]), "null cannot be cast to non-null type java.lang.reflect.Method");
            Method method = StorageManager.class.getMethod("getBestVolumeDescription", cls);
            AbstractC5868k.m23672d(method, "null cannot be cast to non-null type java.lang.reflect.Method");
            Method method2 = StorageManager.class.getMethod("getVolumes", new Class[0]);
            AbstractC5868k.m23672d(method2, "null cannot be cast to non-null type java.lang.reflect.Method");
            Method method3 = cls.getMethod("isMountedReadable", new Class[0]);
            AbstractC5868k.m23672d(method3, "null cannot be cast to non-null type java.lang.reflect.Method");
            Method method4 = cls.getMethod("getType", new Class[0]);
            AbstractC5868k.m23672d(method4, "null cannot be cast to non-null type java.lang.reflect.Method");
            Method method5 = cls.getMethod("getPath", new Class[0]);
            AbstractC5868k.m23672d(method5, "null cannot be cast to non-null type java.lang.reflect.Method");
            Object invoke = method2.invoke(this.f23518c, new Object[0]);
            AbstractC5868k.m23672d(invoke, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj : (List) invoke) {
                if (obj != null) {
                    Object invoke2 = method3.invoke(obj, new Object[0]);
                    AbstractC5868k.m23672d(invoke2, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) invoke2).booleanValue()) {
                        Object invoke3 = method4.invoke(obj, new Object[0]);
                        AbstractC5868k.m23672d(invoke3, "null cannot be cast to non-null type kotlin.Int");
                        if (((Integer) invoke3).intValue() == 0) {
                            Object invoke4 = method5.invoke(obj, new Object[0]);
                            AbstractC5868k.m23672d(invoke4, "null cannot be cast to non-null type java.io.File");
                            Object invoke5 = method.invoke(this.f23518c, obj);
                            AbstractC5868k.m23672d(invoke5, "null cannot be cast to non-null type kotlin.String");
                            String path = ((File) invoke4).getPath();
                            AbstractC5868k.m23673e(path, "path2.path");
                            arrayList.add(new C1318n((String) invoke5, path));
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m23889t(String str) {
        try {
            C4223b.m17665a(str + "/BrasilTV/info.db");
            C4224c m17667v = C4224c.m17667v();
            if (m17667v != null) {
                m17667v.m17677y();
            }
            C4343e.m18228g();
            C4343e.m18229h(C4224c.m17666u().m17673s());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m23890u(UDiskBean uDiskBean) {
        this.f23519d = uDiskBean;
        if (uDiskBean != null) {
            AbstractC7269d.m28112b(C7327w0.f27234a, C7297m0.m28253c(), null, new c(uDiskBean, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m23891x() {
        this.f23520e.clear();
        ArrayList<C1318n> m23898m = m23898m(AbstractApplicationC6253c.f24484b.m24887a());
        if (m23898m != null) {
            for (C1318n c1318n : m23898m) {
                this.f23520e.add(new UDiskBean((String) c1318n.m5969c(), (String) c1318n.m5970d()));
            }
        }
    }

    /* renamed from: f */
    public final void m23892f(UDiskBean uDiskBean) {
        if (uDiskBean != null && !this.f23520e.contains(uDiskBean)) {
            this.f23520e.add(uDiskBean);
            if (this.f23519d == null) {
                m23890u(uDiskBean);
            }
        }
    }

    /* renamed from: h */
    public final UDiskBean m23893h() {
        if (this.f23520e.isEmpty()) {
            return null;
        }
        return (UDiskBean) this.f23520e.get(0);
    }

    /* renamed from: i */
    public final String m23894i(Context context) {
        String str = null;
        boolean z10 = false;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        UDiskBean uDiskBean = this.f23519d;
        if (uDiskBean == null || (str = uDiskBean.getName()) == null) {
            str = "";
        }
        try {
            String m23913b = C5913i.m23913b(((Number) m23899p().m5970d()).longValue());
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return str + '(' + m23913b + ')';
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: j */
    public final String m23895j() {
        UDiskBean uDiskBean = this.f23519d;
        if (uDiskBean != null) {
            return uDiskBean.getPath() + "/BrasilTV";
        }
        return null;
    }

    /* renamed from: k */
    public final InterfaceC5665q m23896k() {
        return this.f23521f;
    }

    /* renamed from: l */
    public final String m23897l() {
        UDiskBean uDiskBean = this.f23519d;
        if (uDiskBean != null) {
            return uDiskBean.getPath();
        }
        return null;
    }

    /* renamed from: m */
    public final ArrayList m23898m(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (Build.VERSION.SDK_INT >= 23) {
            return m23888o();
        }
        return m23887n(context);
    }

    /* renamed from: p */
    public final C1318n m23899p() {
        UDiskBean uDiskBean = this.f23519d;
        if (uDiskBean != null) {
            StatFs statFs = new StatFs(uDiskBean.getPath());
            return new C1318n(Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()), Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong()));
        }
        return new C1318n(0L, 0L);
    }

    /* renamed from: q */
    public final boolean m23900q() {
        return !this.f23520e.isEmpty();
    }

    /* renamed from: r */
    public final void m23901r(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f23520e.clear();
        Object systemService = context.getApplicationContext().getSystemService("storage");
        AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
        this.f23518c = (StorageManager) systemService;
        for (C1318n c1318n : m23898m(context)) {
            this.f23520e.add(new UDiskBean((String) c1318n.m5969c(), (String) c1318n.m5970d()));
        }
        m23890u(m23893h());
    }

    /* renamed from: s */
    public final void m23902s(String str) {
        boolean z10 = false;
        String str2 = null;
        AbstractC5868k.m23674f(str, "path");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        Iterator it = this.f23520e.iterator();
        AbstractC5868k.m23673e(it, "mStorageDeviceList.iterator()");
        while (it.hasNext()) {
            if (AbstractC5868k.m23669a(((UDiskBean) it.next()).getPath(), str)) {
                it.remove();
            }
        }
        UDiskBean uDiskBean = this.f23519d;
        if (uDiskBean != null) {
            str2 = uDiskBean.getPath();
        } else {
            str2 = null;
        }
        if (AbstractC5868k.m23669a(str2, str)) {
            m23886g();
            InterfaceC5665q interfaceC5665q = this.f23521f;
            if (interfaceC5665q != null) {
                interfaceC5665q.mo12281b(Boolean.FALSE, "", "");
            }
            AbstractC7269d.m28112b(C7327w0.f27234a, null, null, new b(null), 3, null);
        }
    }

    /* renamed from: v */
    public final void m23903v(InterfaceC5642a interfaceC5642a) {
        this.f23522g = interfaceC5642a;
    }

    /* renamed from: w */
    public final void m23904w(InterfaceC5665q interfaceC5665q) {
        this.f23521f = interfaceC5665q;
    }

    private C5911g() {
        this.f23516a = C5911g.class.getSimpleName();
        this.f23517b = "/proc/mounts";
        this.f23520e = new ArrayList();
    }
}
