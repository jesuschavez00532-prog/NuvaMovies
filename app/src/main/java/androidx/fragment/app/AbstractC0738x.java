package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0749c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public abstract class AbstractC0738x {

    /* renamed from: a */
    private final AbstractC0724k f3000a;

    /* renamed from: b */
    private final ClassLoader f3001b;

    /* renamed from: d */
    int f3003d;

    /* renamed from: e */
    int f3004e;

    /* renamed from: f */
    int f3005f;

    /* renamed from: g */
    int f3006g;

    /* renamed from: h */
    int f3007h;

    /* renamed from: i */
    boolean f3008i;

    /* renamed from: k */
    String f3010k;

    /* renamed from: l */
    int f3011l;

    /* renamed from: m */
    CharSequence f3012m;

    /* renamed from: n */
    int f3013n;

    /* renamed from: o */
    CharSequence f3014o;

    /* renamed from: p */
    ArrayList f3015p;

    /* renamed from: q */
    ArrayList f3016q;

    /* renamed from: s */
    ArrayList f3018s;

    /* renamed from: c */
    ArrayList f3002c = new ArrayList();

    /* renamed from: j */
    boolean f3009j = true;

    /* renamed from: r */
    boolean f3017r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.x$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f3019a;

        /* renamed from: b */
        Fragment f3020b;

        /* renamed from: c */
        int f3021c;

        /* renamed from: d */
        int f3022d;

        /* renamed from: e */
        int f3023e;

        /* renamed from: f */
        int f3024f;

        /* renamed from: g */
        AbstractC0749c.c f3025g;

        /* renamed from: h */
        AbstractC0749c.c f3026h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, Fragment fragment) {
            this.f3019a = i10;
            this.f3020b = fragment;
            AbstractC0749c.c cVar = AbstractC0749c.c.RESUMED;
            this.f3025g = cVar;
            this.f3026h = cVar;
        }

        a(int i10, Fragment fragment, AbstractC0749c.c cVar) {
            this.f3019a = i10;
            this.f3020b = fragment;
            this.f3025g = fragment.f2635X;
            this.f3026h = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0738x(AbstractC0724k abstractC0724k, ClassLoader classLoader) {
        this.f3000a = abstractC0724k;
        this.f3001b = classLoader;
    }

    /* renamed from: b */
    public AbstractC0738x m3638b(int i10, Fragment fragment, String str) {
        mo3232m(i10, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC0738x m3639c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f2624G = viewGroup;
        return m3638b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public AbstractC0738x m3640d(Fragment fragment, String str) {
        mo3232m(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3641e(a aVar) {
        this.f3002c.add(aVar);
        aVar.f3021c = this.f3003d;
        aVar.f3022d = this.f3004e;
        aVar.f3023e = this.f3005f;
        aVar.f3024f = this.f3006g;
    }

    /* renamed from: f */
    public AbstractC0738x m3642f(Fragment fragment) {
        m3641e(new a(7, fragment));
        return this;
    }

    /* renamed from: g */
    public abstract int mo3227g();

    /* renamed from: h */
    public abstract int mo3228h();

    /* renamed from: i */
    public abstract void mo3229i();

    /* renamed from: j */
    public abstract void mo3230j();

    /* renamed from: k */
    public AbstractC0738x mo3231k(Fragment fragment) {
        m3641e(new a(6, fragment));
        return this;
    }

    /* renamed from: l */
    public AbstractC0738x m3643l() {
        if (!this.f3008i) {
            this.f3009j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3232m(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.f2668y;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2668y + " now " + str);
                }
                fragment.f2668y = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.f2666w;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2666w + " now " + i10);
                    }
                    fragment.f2666w = i10;
                    fragment.f2667x = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m3641e(new a(i11, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* renamed from: n */
    public AbstractC0738x mo3233n(Fragment fragment) {
        m3641e(new a(4, fragment));
        return this;
    }

    /* renamed from: o */
    public abstract boolean mo3234o();

    /* renamed from: p */
    public AbstractC0738x mo3235p(Fragment fragment) {
        m3641e(new a(3, fragment));
        return this;
    }

    /* renamed from: q */
    public AbstractC0738x m3644q(int i10, Fragment fragment) {
        return m3645r(i10, fragment, null);
    }

    /* renamed from: r */
    public AbstractC0738x m3645r(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            mo3232m(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: s */
    public AbstractC0738x mo3236s(Fragment fragment, AbstractC0749c.c cVar) {
        m3641e(new a(10, fragment, cVar));
        return this;
    }

    /* renamed from: t */
    public AbstractC0738x m3646t(boolean z10) {
        this.f3017r = z10;
        return this;
    }

    /* renamed from: u */
    public AbstractC0738x mo3237u(Fragment fragment) {
        m3641e(new a(5, fragment));
        return this;
    }
}
