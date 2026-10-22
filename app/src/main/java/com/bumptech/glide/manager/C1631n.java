package com.bumptech.glide.manager;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p214l.C5303a;
import p322s1.C6651z;

/* renamed from: com.bumptech.glide.manager.n */
/* loaded from: classes.dex */
public class C1631n implements Handler.Callback {

    /* renamed from: f */
    private static final b f6437f = new a();

    /* renamed from: a */
    private volatile ComponentCallbacks2C1597l f6438a;

    /* renamed from: b */
    private final b f6439b;

    /* renamed from: c */
    private final C5303a f6440c = new C5303a();

    /* renamed from: d */
    private final InterfaceC1626i f6441d;

    /* renamed from: e */
    private final C1629l f6442e;

    /* renamed from: com.bumptech.glide.manager.n$a */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.C1631n.b
        /* renamed from: a */
        public ComponentCallbacks2C1597l mo7274a(ComponentCallbacks2C1586c componentCallbacks2C1586c, InterfaceC1627j interfaceC1627j, InterfaceC1632o interfaceC1632o, Context context) {
            return new ComponentCallbacks2C1597l(componentCallbacks2C1586c, interfaceC1627j, interfaceC1632o, context);
        }
    }

    /* renamed from: com.bumptech.glide.manager.n$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        ComponentCallbacks2C1597l mo7274a(ComponentCallbacks2C1586c componentCallbacks2C1586c, InterfaceC1627j interfaceC1627j, InterfaceC1632o interfaceC1632o, Context context);
    }

    public C1631n(b bVar) {
        bVar = bVar == null ? f6437f : bVar;
        this.f6439b = bVar;
        this.f6442e = new C1629l(bVar);
        this.f6441d = m7470b();
    }

    /* renamed from: a */
    private static void m7469a(Activity activity) {
        if (!activity.isDestroyed()) {
        } else {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static InterfaceC1626i m7470b() {
        if (C6651z.f25500f && C6651z.f25499e) {
            return new C1625h();
        }
        return new C1623f();
    }

    /* renamed from: c */
    private static Activity m7471c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m7471c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: d */
    private static void m7472d(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.m3182n7() != null) {
                map.put(fragment.m3182n7(), fragment);
                m7472d(fragment.m3093I6().m3544s0(), map);
            }
        }
    }

    /* renamed from: e */
    private Fragment m7473e(View view, AbstractActivityC0712e abstractActivityC0712e) {
        this.f6440c.clear();
        m7472d(abstractActivityC0712e.m3294d4().m3544s0(), this.f6440c);
        View findViewById = abstractActivityC0712e.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (Fragment) this.f6440c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f6440c.clear();
        return fragment;
    }

    /* renamed from: j */
    private ComponentCallbacks2C1597l m7474j(Context context) {
        if (this.f6438a == null) {
            synchronized (this) {
                if (this.f6438a == null) {
                    this.f6438a = this.f6439b.mo7274a(ComponentCallbacks2C1586c.m7276d(context.getApplicationContext()), new C1618a(), new C1624g(), context.getApplicationContext());
                }
            }
        }
        return this.f6438a;
    }

    /* renamed from: k */
    private static boolean m7475k(Context context) {
        Activity m7471c = m7471c(context);
        if (m7471c != null && m7471c.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public ComponentCallbacks2C1597l m7476f(Context context) {
        if (context != null) {
            if (AbstractC4122l.m17247t() && !(context instanceof Application)) {
                if (context instanceof AbstractActivityC0712e) {
                    return m7479i((AbstractActivityC0712e) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return m7476f(contextWrapper.getBaseContext());
                    }
                }
            }
            return m7474j(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: g */
    public ComponentCallbacks2C1597l m7477g(View view) {
        if (AbstractC4122l.m17246s()) {
            return m7476f(view.getContext().getApplicationContext());
        }
        AbstractC4121k.m17226d(view);
        AbstractC4121k.m17227e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity m7471c = m7471c(view.getContext());
        if (m7471c == null) {
            return m7476f(view.getContext().getApplicationContext());
        }
        if (m7471c instanceof AbstractActivityC0712e) {
            AbstractActivityC0712e abstractActivityC0712e = (AbstractActivityC0712e) m7471c;
            Fragment m7473e = m7473e(view, abstractActivityC0712e);
            if (m7473e != null) {
                return m7478h(m7473e);
            }
            return m7479i(abstractActivityC0712e);
        }
        return m7476f(view.getContext().getApplicationContext());
    }

    /* renamed from: h */
    public ComponentCallbacks2C1597l m7478h(Fragment fragment) {
        AbstractC4121k.m17227e(fragment.m3096J6(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC4122l.m17246s()) {
            return m7476f(fragment.m3096J6().getApplicationContext());
        }
        if (fragment.m3075C6() != null) {
            this.f6441d.mo7463a(fragment.m3075C6());
        }
        AbstractC0729o m3093I6 = fragment.m3093I6();
        Context m3096J6 = fragment.m3096J6();
        return this.f6442e.m7467b(m3096J6, ComponentCallbacks2C1586c.m7276d(m3096J6.getApplicationContext()), fragment.mo953f6(), m3093I6, fragment.m3079D7());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    /* renamed from: i */
    public ComponentCallbacks2C1597l m7479i(AbstractActivityC0712e abstractActivityC0712e) {
        if (AbstractC4122l.m17246s()) {
            return m7476f(abstractActivityC0712e.getApplicationContext());
        }
        m7469a(abstractActivityC0712e);
        this.f6441d.mo7463a(abstractActivityC0712e);
        boolean m7475k = m7475k(abstractActivityC0712e);
        return this.f6442e.m7467b(abstractActivityC0712e, ComponentCallbacks2C1586c.m7276d(abstractActivityC0712e.getApplicationContext()), abstractActivityC0712e.mo953f6(), abstractActivityC0712e.m3294d4(), m7475k);
    }
}
