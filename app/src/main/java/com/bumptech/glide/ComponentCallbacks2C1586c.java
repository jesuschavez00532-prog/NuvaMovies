package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0712e;
import com.bumptech.glide.manager.C1631n;
import com.bumptech.glide.manager.InterfaceC1620c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p003a2.C0012h;
import p022b2.C1039g;
import p022b2.InterfaceC1042j;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p216l1.C5324k;
import p230m1.InterfaceC5569b;
import p230m1.InterfaceC5571d;
import p243n1.InterfaceC5731i;
import p407y1.AbstractC7657a;
import p407y1.C7660d;
import p407y1.InterfaceC7658b;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes.dex */
public class ComponentCallbacks2C1586c implements ComponentCallbacks2 {

    /* renamed from: k */
    private static volatile ComponentCallbacks2C1586c f6264k;

    /* renamed from: l */
    private static volatile boolean f6265l;

    /* renamed from: a */
    private final C5324k f6266a;

    /* renamed from: b */
    private final InterfaceC5571d f6267b;

    /* renamed from: c */
    private final InterfaceC5731i f6268c;

    /* renamed from: d */
    private final C1588e f6269d;

    /* renamed from: e */
    private final InterfaceC5569b f6270e;

    /* renamed from: f */
    private final C1631n f6271f;

    /* renamed from: g */
    private final InterfaceC1620c f6272g;

    /* renamed from: i */
    private final a f6274i;

    /* renamed from: h */
    private final List f6273h = new ArrayList();

    /* renamed from: j */
    private EnumC1590g f6275j = EnumC1590g.NORMAL;

    /* renamed from: com.bumptech.glide.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C0012h mo7298a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentCallbacks2C1586c(Context context, C5324k c5324k, InterfaceC5731i interfaceC5731i, InterfaceC5571d interfaceC5571d, InterfaceC5569b interfaceC5569b, C1631n c1631n, InterfaceC1620c interfaceC1620c, int i10, a aVar, Map map, List list, List list2, AbstractC7657a abstractC7657a, C1589f c1589f) {
        this.f6266a = c5324k;
        this.f6267b = interfaceC5571d;
        this.f6270e = interfaceC5569b;
        this.f6268c = interfaceC5731i;
        this.f6271f = c1631n;
        this.f6272g = interfaceC1620c;
        this.f6274i = aVar;
        this.f6269d = new C1588e(context, interfaceC5569b, AbstractC1595j.m7352d(this, list2, abstractC7657a), new C1039g(), aVar, map, list, c5324k, c1589f, i10);
    }

    /* renamed from: a */
    static void m7275a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f6265l) {
            f6265l = true;
            try {
                m7279n(context, generatedAppGlideModule);
                return;
            } finally {
                f6265l = false;
            }
        }
        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
    }

    /* renamed from: d */
    public static ComponentCallbacks2C1586c m7276d(Context context) {
        if (f6264k == null) {
            GeneratedAppGlideModule m7277e = m7277e(context.getApplicationContext());
            synchronized (ComponentCallbacks2C1586c.class) {
                if (f6264k == null) {
                    m7275a(context, m7277e);
                }
            }
        }
        return f6264k;
    }

    /* renamed from: e */
    private static GeneratedAppGlideModule m7277e(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            m7281r(e10);
            return null;
        } catch (InstantiationException e11) {
            m7281r(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            m7281r(e12);
            return null;
        } catch (InvocationTargetException e13) {
            m7281r(e13);
            return null;
        }
    }

    /* renamed from: m */
    private static C1631n m7278m(Context context) {
        AbstractC4121k.m17227e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m7276d(context).m7293l();
    }

    /* renamed from: n */
    private static void m7279n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m7280o(context, new C1587d(), generatedAppGlideModule);
    }

    /* renamed from: o */
    private static void m7280o(Context context, C1587d c1587d, GeneratedAppGlideModule generatedAppGlideModule) {
        C1631n.b bVar;
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo7272c()) {
            emptyList = new C7660d(applicationContext).m29464b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo7268d().isEmpty()) {
            Set mo7268d = generatedAppGlideModule.mo7268d();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                InterfaceC7658b interfaceC7658b = (InterfaceC7658b) it.next();
                if (mo7268d.contains(interfaceC7658b.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + interfaceC7658b);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((InterfaceC7658b) it2.next()).getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVar = generatedAppGlideModule.mo7269e();
        } else {
            bVar = null;
        }
        c1587d.m7306h(bVar);
        Iterator it3 = emptyList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC7658b) it3.next()).mo7340a(applicationContext, c1587d);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo7271b(applicationContext, c1587d);
        }
        ComponentCallbacks2C1586c m7299a = c1587d.m7299a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(m7299a);
        f6264k = m7299a;
    }

    /* renamed from: r */
    private static void m7281r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C1597l m7282u(Context context) {
        return m7278m(context).m7476f(context);
    }

    /* renamed from: v */
    public static ComponentCallbacks2C1597l m7283v(View view) {
        return m7278m(view.getContext()).m7477g(view);
    }

    /* renamed from: w */
    public static ComponentCallbacks2C1597l m7284w(AbstractActivityC0712e abstractActivityC0712e) {
        return m7278m(abstractActivityC0712e).m7479i(abstractActivityC0712e);
    }

    /* renamed from: b */
    public void m7285b() {
        AbstractC4122l.m17228a();
        this.f6266a.m21545e();
    }

    /* renamed from: c */
    public void m7286c() {
        AbstractC4122l.m17229b();
        this.f6268c.m23135b();
        this.f6267b.mo22616b();
        this.f6270e.mo22609b();
    }

    /* renamed from: f */
    public InterfaceC5569b m7287f() {
        return this.f6270e;
    }

    /* renamed from: g */
    public InterfaceC5571d m7288g() {
        return this.f6267b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public InterfaceC1620c m7289h() {
        return this.f6272g;
    }

    /* renamed from: i */
    public Context m7290i() {
        return this.f6269d.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C1588e m7291j() {
        return this.f6269d;
    }

    /* renamed from: k */
    public C1592i m7292k() {
        return this.f6269d.m7315i();
    }

    /* renamed from: l */
    public C1631n m7293l() {
        return this.f6271f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m7286c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        m7296s(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m7294p(ComponentCallbacks2C1597l componentCallbacks2C1597l) {
        synchronized (this.f6273h) {
            if (!this.f6273h.contains(componentCallbacks2C1597l)) {
                this.f6273h.add(componentCallbacks2C1597l);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m7295q(InterfaceC1042j interfaceC1042j) {
        synchronized (this.f6273h) {
            Iterator it = this.f6273h.iterator();
            while (it.hasNext()) {
                if (((ComponentCallbacks2C1597l) it.next()).m7394t(interfaceC1042j)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: s */
    public void m7296s(int i10) {
        AbstractC4122l.m17229b();
        synchronized (this.f6273h) {
            Iterator it = this.f6273h.iterator();
            while (it.hasNext()) {
                ((ComponentCallbacks2C1597l) it.next()).onTrimMemory(i10);
            }
        }
        this.f6268c.mo23129a(i10);
        this.f6267b.mo22615a(i10);
        this.f6270e.mo22608a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m7297t(ComponentCallbacks2C1597l componentCallbacks2C1597l) {
        synchronized (this.f6273h) {
            if (this.f6273h.contains(componentCallbacks2C1597l)) {
                this.f6273h.remove(componentCallbacks2C1597l);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
