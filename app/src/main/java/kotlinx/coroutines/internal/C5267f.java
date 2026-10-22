package kotlinx.coroutines.internal;

import anet.channel.request.Request;
import be.AbstractC1306b;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import ke.AbstractC5252a;
import ne.AbstractC5868k;
import p043ce.AbstractC1501m;
import p043ce.AbstractC1505q;
import p043ce.AbstractC1508t;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;

/* renamed from: kotlinx.coroutines.internal.f */
/* loaded from: classes3.dex */
public final class C5267f {

    /* renamed from: a */
    public static final C5267f f21476a = new C5267f();

    private C5267f() {
    }

    /* renamed from: a */
    private final Object m21188a(String str, ClassLoader classLoader, Class cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final List m21189b(Class cls, ClassLoader classLoader) {
        List m6999D;
        try {
            return m21193d(cls, classLoader);
        } catch (Throwable unused) {
            m6999D = AbstractC1508t.m6999D(ServiceLoader.load(cls, classLoader));
            return m6999D;
        }
    }

    /* renamed from: e */
    private final List m21190e(URL url) {
        boolean m27730q;
        BufferedReader bufferedReader;
        String m27751U;
        String m27756Z;
        String m27751U2;
        String url2 = url.toString();
        m27730q = AbstractC7166t.m27730q(url2, "jar", false, 2, null);
        if (m27730q) {
            m27751U = AbstractC7167u.m27751U(url2, "jar:file:", null, 2, null);
            m27756Z = AbstractC7167u.m27756Z(m27751U, '!', null, 2, null);
            m27751U2 = AbstractC7167u.m27751U(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(m27756Z, false);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m27751U2)), Request.DEFAULT_CHARSET));
                try {
                    List m21191f = f21476a.m21191f(bufferedReader);
                    AbstractC5252a.m21156a(bufferedReader, null);
                    jarFile.close();
                    return m21191f;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC1306b.m5958a(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List m21191f2 = f21476a.m21191f(bufferedReader);
                AbstractC5252a.m21156a(bufferedReader, null);
                return m21191f2;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        }
    }

    /* renamed from: f */
    private final List m21191f(BufferedReader bufferedReader) {
        List m6999D;
        String m27757a0;
        CharSequence m27758b0;
        boolean z10;
        boolean z11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                m27757a0 = AbstractC7167u.m27757a0(readLine, "#", null, 2, null);
                if (m27757a0 != null) {
                    m27758b0 = AbstractC7167u.m27758b0(m27757a0);
                    String obj = m27758b0.toString();
                    boolean z12 = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 < obj.length()) {
                            char charAt = obj.charAt(i10);
                            if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (!z11) {
                                z10 = false;
                                break;
                            }
                            i10++;
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        if (obj.length() > 0) {
                            z12 = true;
                        }
                        if (z12) {
                            linkedHashSet.add(obj);
                        }
                    } else {
                        throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                m6999D = AbstractC1508t.m6999D(linkedHashSet);
                return m6999D;
            }
        }
    }

    /* renamed from: c */
    public final List m21192c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!AbstractC5268g.m21194a()) {
            return m21189b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return m21189b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final List m21193d(Class cls, ClassLoader classLoader) {
        Set m7002G;
        int m6992k;
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        AbstractC5868k.m23673e(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1505q.m6995n(arrayList, f21476a.m21190e((URL) it.next()));
        }
        m7002G = AbstractC1508t.m7002G(arrayList);
        if (!m7002G.isEmpty()) {
            m6992k = AbstractC1501m.m6992k(m7002G, 10);
            ArrayList arrayList2 = new ArrayList(m6992k);
            Iterator it2 = m7002G.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f21476a.m21188a((String) it2.next(), classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
