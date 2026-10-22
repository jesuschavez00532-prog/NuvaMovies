package p345u;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p214l.C5309g;
import p214l.C5311i;
import p276p.AbstractC6136i;
import p345u.AbstractC7005f;
import p373w.InterfaceC7336a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u.e */
/* loaded from: classes.dex */
public abstract class AbstractC7004e {

    /* renamed from: a */
    static final C5309g f26338a = new C5309g(16);

    /* renamed from: b */
    private static final ExecutorService f26339b = AbstractC7006g.m27047a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f26340c = new Object();

    /* renamed from: d */
    static final C5311i f26341d = new C5311i();

    /* renamed from: u.e$a */
    /* loaded from: classes.dex */
    class a implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f26342a;

        /* renamed from: b */
        final /* synthetic */ Context f26343b;

        /* renamed from: c */
        final /* synthetic */ C7003d f26344c;

        /* renamed from: d */
        final /* synthetic */ int f26345d;

        a(String str, Context context, C7003d c7003d, int i10) {
            this.f26342a = str;
            this.f26343b = context;
            this.f26344c = c7003d;
            this.f26345d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return AbstractC7004e.m27029c(this.f26342a, this.f26343b, this.f26344c, this.f26345d);
        }
    }

    /* renamed from: u.e$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC7336a {

        /* renamed from: a */
        final /* synthetic */ C7000a f26346a;

        b(C7000a c7000a) {
            this.f26346a = c7000a;
        }

        @Override // p373w.InterfaceC7336a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f26346a.m27011b(eVar);
        }
    }

    /* renamed from: u.e$c */
    /* loaded from: classes.dex */
    class c implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f26347a;

        /* renamed from: b */
        final /* synthetic */ Context f26348b;

        /* renamed from: c */
        final /* synthetic */ C7003d f26349c;

        /* renamed from: d */
        final /* synthetic */ int f26350d;

        c(String str, Context context, C7003d c7003d, int i10) {
            this.f26347a = str;
            this.f26348b = context;
            this.f26349c = c7003d;
            this.f26350d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return AbstractC7004e.m27029c(this.f26347a, this.f26348b, this.f26349c, this.f26350d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* renamed from: u.e$d */
    /* loaded from: classes.dex */
    class d implements InterfaceC7336a {

        /* renamed from: a */
        final /* synthetic */ String f26351a;

        d(String str) {
            this.f26351a = str;
        }

        @Override // p373w.InterfaceC7336a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (AbstractC7004e.f26340c) {
                C5311i c5311i = AbstractC7004e.f26341d;
                ArrayList arrayList = (ArrayList) c5311i.get(this.f26351a);
                if (arrayList == null) {
                    return;
                }
                c5311i.remove(this.f26351a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((InterfaceC7336a) arrayList.get(i10)).accept(eVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m27027a(C7003d c7003d, int i10) {
        return c7003d.m27023d() + Operator.Operation.MINUS + i10;
    }

    /* renamed from: b */
    private static int m27028b(AbstractC7005f.a aVar) {
        int i10 = 1;
        if (aVar.m27040c() != 0) {
            if (aVar.m27040c() != 1) {
                return -3;
            }
            return -2;
        }
        AbstractC7005f.b[] m27039b = aVar.m27039b();
        if (m27039b != null && m27039b.length != 0) {
            i10 = 0;
            for (AbstractC7005f.b bVar : m27039b) {
                int m27042b = bVar.m27042b();
                if (m27042b != 0) {
                    if (m27042b < 0) {
                        return -3;
                    }
                    return m27042b;
                }
            }
        }
        return i10;
    }

    /* renamed from: c */
    static e m27029c(String str, Context context, C7003d c7003d, int i10) {
        C5309g c5309g = f26338a;
        Typeface typeface = (Typeface) c5309g.m21407d(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            AbstractC7005f.a m27016d = AbstractC7002c.m27016d(context, c7003d, null);
            int m27028b = m27028b(m27016d);
            if (m27028b != 0) {
                return new e(m27028b);
            }
            Typeface m24454b = AbstractC6136i.m24454b(context, null, m27016d.m27039b(), i10);
            if (m24454b != null) {
                c5309g.m21409f(str, m24454b);
                return new e(m24454b);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Typeface m27030d(Context context, C7003d c7003d, int i10, Executor executor, C7000a c7000a) {
        String m27027a = m27027a(c7003d, i10);
        Typeface typeface = (Typeface) f26338a.m21407d(m27027a);
        if (typeface != null) {
            c7000a.m27011b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c7000a);
        synchronized (f26340c) {
            C5311i c5311i = f26341d;
            ArrayList arrayList = (ArrayList) c5311i.get(m27027a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bVar);
            c5311i.put(m27027a, arrayList2);
            c cVar = new c(m27027a, context, c7003d, i10);
            if (executor == null) {
                executor = f26339b;
            }
            AbstractC7006g.m27048b(executor, cVar, new d(m27027a));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Typeface m27031e(Context context, C7003d c7003d, C7000a c7000a, int i10, int i11) {
        String m27027a = m27027a(c7003d, i10);
        Typeface typeface = (Typeface) f26338a.m21407d(m27027a);
        if (typeface != null) {
            c7000a.m27011b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e m27029c = m27029c(m27027a, context, c7003d, i10);
            c7000a.m27011b(m27029c);
            return m27029c.f26352a;
        }
        try {
            e eVar = (e) AbstractC7006g.m27049c(f26339b, new a(m27027a, context, c7003d, i10), i11);
            c7000a.m27011b(eVar);
            return eVar.f26352a;
        } catch (InterruptedException unused) {
            c7000a.m27011b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u.e$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        final Typeface f26352a;

        /* renamed from: b */
        final int f26353b;

        e(int i10) {
            this.f26352a = null;
            this.f26353b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m27036a() {
            if (this.f26353b == 0) {
                return true;
            }
            return false;
        }

        e(Typeface typeface) {
            this.f26352a = typeface;
            this.f26353b = 0;
        }
    }
}
