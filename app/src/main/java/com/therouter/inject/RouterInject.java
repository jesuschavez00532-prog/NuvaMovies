package com.therouter.inject;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Keep;
import be.C1328x;
import com.therouter.inject.RouterInject;
import dalvik.system.DexFile;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import mc.AbstractC5637l;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p000a.TheRouterServiceProvideInjecter;
import p267oc.AbstractC5963c;
import p267oc.C5964d;
import p288pc.C6257d;
import p288pc.C6262i;
import p288pc.InterfaceC6255b;
import p359ue.AbstractC7166t;

/* loaded from: classes.dex */
public final class RouterInject {

    /* renamed from: a */
    private final C6262i f13320a = new C6262i(16);

    /* renamed from: b */
    private final LinkedList f13321b = new LinkedList();

    /* renamed from: c */
    private final C6257d f13322c = new C6257d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.therouter.inject.RouterInject$a */
    /* loaded from: classes.dex */
    public static final class C3225a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ Exception f13323a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3225a(Exception exc) {
            super(0);
            this.f13323a = exc;
        }

        /* renamed from: a */
        public final void m13079a() {
            this.f13323a.printStackTrace();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13079a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.therouter.inject.RouterInject$b */
    /* loaded from: classes.dex */
    public static final class C3226b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ Exception f13324a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3226b(Exception exc) {
            super(0);
            this.f13324a = exc;
        }

        /* renamed from: a */
        public final void m13080a() {
            this.f13324a.printStackTrace();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13080a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m13070d(RouterInject routerInject, Context context) {
        AbstractC5868k.m23674f(routerInject, "this$0");
        TheRouterServiceProvideInjecter.trojan();
        if (routerInject.f13320a.isEmpty()) {
            routerInject.m13077i(context);
        }
    }

    /* renamed from: e */
    private final Object m13071e(Class cls, Object... objArr) {
        boolean z10;
        Class[] clsArr;
        Class<?> cls2;
        Iterator it = this.f13321b.iterator();
        Object obj = null;
        while (it.hasNext()) {
            obj = ((InterfaceC6255b) it.next()).interception(cls, Arrays.copyOf(objArr, objArr.length));
            if (obj != null) {
                AbstractC3227a.m13083c("mCustomInterceptors::===" + cls + "===" + obj.getClass().getSimpleName() + obj.hashCode(), null, 2, null);
                return obj;
            }
        }
        this.f13320a.readLock().lock();
        Iterator it2 = this.f13320a.iterator();
        while (it2.hasNext()) {
            obj = ((InterfaceC6255b) it2.next()).interception(cls, Arrays.copyOf(objArr, objArr.length));
            if (obj != null) {
                AbstractC3227a.m13083c("interception::===" + cls + "===" + obj.getClass().getSimpleName() + obj.hashCode(), null, 2, null);
                try {
                    this.f13320a.readLock().unlock();
                } catch (Exception unused) {
                }
                return obj;
            }
        }
        try {
            this.f13320a.readLock().unlock();
        } catch (Exception unused2) {
        }
        if (cls.isInterface()) {
            AbstractC3227a.m13083c(cls + " is interface, but do not have @ServiceProvider", null, 2, null);
            return obj;
        }
        String name = cls.getName();
        AbstractC5868k.m23673e(name, "tClass.name");
        if (m13074j(name)) {
            AbstractC3227a.m13083c(cls + " is primitive data types, but do not have @ServiceProvider", null, 2, null);
            return obj;
        }
        if (objArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            clsArr = new Class[objArr.length];
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                Object obj2 = objArr[i10];
                if (obj2 != null) {
                    cls2 = obj2.getClass();
                } else {
                    cls2 = null;
                }
                clsArr[i10] = cls2;
            }
        } else {
            clsArr = new Class[0];
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            AbstractC5868k.m23673e(declaredConstructor, "tClass.getDeclaredConstructor(*paramsClass)");
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Exception e10) {
            AbstractC3227a.m13082b(cls.toString() + " do not have @ServiceProvider class. And constructor error::" + e10.getMessage(), new C3225a(e10));
            return obj;
        }
    }

    /* renamed from: g */
    private final void m13072g(Context context) {
        C6262i c6262i;
        boolean m27730q;
        try {
            try {
                if (context == null) {
                    return;
                }
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                    AbstractC5868k.m23673e(applicationInfo, "context.packageManager.g…o(context.packageName, 0)");
                    Enumeration<String> entries = new DexFile(applicationInfo.sourceDir).entries();
                    AbstractC5868k.m23673e(entries, "dexfile.entries()");
                    char c10 = 0;
                    while (entries.hasMoreElements()) {
                        String nextElement = entries.nextElement();
                        if (nextElement != null) {
                            String str = nextElement;
                            m27730q = AbstractC7166t.m27730q(str, "a.ServiceProvider__TheRouter__", false, 2, null);
                            if (m27730q) {
                                if (c10 <= 0) {
                                    this.f13320a.writeLock().lock();
                                    c10 = 1;
                                }
                                Class<?> cls = Class.forName(str);
                                if (InterfaceC6255b.class.isAssignableFrom(cls) && !AbstractC5868k.m23669a(InterfaceC6255b.class, cls)) {
                                    C6262i c6262i2 = this.f13320a;
                                    Object newInstance = cls.newInstance();
                                    if (newInstance != null) {
                                        c6262i2.add((InterfaceC6255b) newInstance);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.therouter.inject.Interceptor");
                                    }
                                }
                            } else if (c10 > 0) {
                                try {
                                    this.f13320a.writeLock().unlock();
                                } catch (Exception unused) {
                                }
                                c10 = 65535;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    c6262i = this.f13320a;
                } catch (Exception e10) {
                    AbstractC3227a.m13082b("getAllDI error", new C3226b(e10));
                    c6262i = this.f13320a;
                }
                c6262i.writeLock().unlock();
            } catch (Throwable th) {
                try {
                    this.f13320a.writeLock().unlock();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m13073h(RouterInject routerInject, Context context) {
        AbstractC5868k.m23674f(routerInject, "this$0");
        routerInject.m13072g(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[ORIG_RETURN, RETURN] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m13074j(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -2133280414: goto La0;
                case -2056817302: goto L97;
                case -1707381259: goto L8e;
                case -1707368381: goto L85;
                case -1707093143: goto L7c;
                case -1385909489: goto L73;
                case -1374022353: goto L6a;
                case -527879800: goto L61;
                case -515992664: goto L58;
                case -67829378: goto L4f;
                case 155276373: goto L46;
                case 344809556: goto L3c;
                case 398507100: goto L32;
                case 398795216: goto L28;
                case 411999259: goto L1e;
                case 761287205: goto L14;
                case 1195259493: goto La;
                default: goto L8;
            }
        L8:
            goto La8
        La:
            java.lang.String r0 = "java.lang.String"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L14:
            java.lang.String r0 = "java.lang.Double"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L1e:
            java.lang.String r0 = "kotlin.Boolean"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L28:
            java.lang.String r0 = "java.lang.Long"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L32:
            java.lang.String r0 = "java.lang.Byte"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L3c:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L46:
            java.lang.String r0 = "java.lang.Character"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L4f:
            java.lang.String r0 = "kotlin.Double"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L58:
            java.lang.String r0 = "java.lang.Short"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L61:
            java.lang.String r0 = "java.lang.Float"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L6a:
            java.lang.String r0 = "kotlin.Short"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L73:
            java.lang.String r0 = "kotlin.Float"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L7c:
            java.lang.String r0 = "kotlin.Long"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L85:
            java.lang.String r0 = "kotlin.Char"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L8e:
            java.lang.String r0 = "kotlin.Byte"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        L97:
            java.lang.String r0 = "java.lang.Integer"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto La8
        La0:
            java.lang.String r0 = "kotlin.Int"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
        La8:
            r1 = 0
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.therouter.inject.RouterInject.m13074j(java.lang.String):boolean");
    }

    @Keep
    public final void addInterceptor(InterfaceC6255b interfaceC6255b) {
        AbstractC5868k.m23674f(interfaceC6255b, "factory");
        this.f13321b.addFirst(interfaceC6255b);
    }

    /* renamed from: c */
    public final void m13075c(final Context context) {
        AbstractC5637l.m22872f(new Runnable() { // from class: pc.f
            @Override // java.lang.Runnable
            public final void run() {
                RouterInject.m13070d(RouterInject.this, context);
            }
        });
    }

    /* renamed from: f */
    public final Object m13076f(Class cls, Object... objArr) {
        AbstractC5868k.m23674f(cls, "clazz");
        AbstractC5868k.m23674f(objArr, "params");
        String str = "";
        for (Object obj : objArr) {
            str = str + obj + ", ";
        }
        AbstractC5963c.m24121b(new C5964d(cls + ".provider(" + str + ')'));
        Object m24891b = this.f13322c.m24891b(cls, Arrays.copyOf(objArr, objArr.length));
        if (m24891b == null) {
            Object m13071e = m13071e(cls, Arrays.copyOf(objArr, objArr.length));
            if (m13071e != null) {
                return this.f13322c.m24892c(cls, m13071e, Arrays.copyOf(objArr, objArr.length));
            }
            return m13071e;
        }
        return m24891b;
    }

    /* renamed from: i */
    public final void m13077i(final Context context) {
        AbstractC5637l.m22872f(new Runnable() { // from class: pc.g
            @Override // java.lang.Runnable
            public final void run() {
                RouterInject.m13073h(RouterInject.this, context);
            }
        });
    }

    /* renamed from: k */
    public final void m13078k(Context context) {
        TheRouterServiceProvideInjecter.trojan();
        if (this.f13320a.isEmpty()) {
            m13077i(context);
        }
    }

    @Keep
    public final void privateAddInterceptor(InterfaceC6255b interfaceC6255b) {
        AbstractC5868k.m23674f(interfaceC6255b, "factory");
        this.f13320a.add(interfaceC6255b);
    }
}
