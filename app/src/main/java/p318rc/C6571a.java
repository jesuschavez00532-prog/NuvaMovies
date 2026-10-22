package p318rc;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0272b;
import android.text.TextUtils;
import be.C1328x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import mc.AbstractC5635j;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p302qc.C6448c;

/* renamed from: rc.a */
/* loaded from: classes3.dex */
public final class C6571a {

    /* renamed from: a */
    public static final C6571a f25183a = new C6571a();

    /* renamed from: b */
    private static final ConcurrentHashMap f25184b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f25185a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final void m25651a() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            AbstractC5868k.m23673e(stackTrace, "currentThread().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                AbstractC5635j.m22862d("ActionManager", String.valueOf(stackTraceElement), null, 4, null);
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m25651a();
            return C1328x.f4998a;
        }
    }

    private C6571a() {
    }

    /* renamed from: a */
    public final synchronized void m25649a(C6448c c6448c, Context context) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        AbstractC5868k.m23674f(c6448c, "navigator");
        if (TextUtils.isEmpty(c6448c.m25244h())) {
            return;
        }
        AbstractC5635j.m22861c("ActionManager", "handleAction->" + c6448c.m25245i(), a.f25185a);
        ArrayList arrayList = new ArrayList();
        List list = (List) f25184b.get(c6448c.m25244h());
        if (list != null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        } else {
            copyOnWriteArrayList = null;
        }
        new Bundle();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AbstractC0272b.m941a(it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            return;
        }
        AbstractC0272b.m941a(it2.next());
        throw null;
    }

    /* renamed from: b */
    public final boolean m25650b(C6448c c6448c) {
        AbstractC5868k.m23674f(c6448c, "navigator");
        if (f25184b.get(c6448c.m25244h()) != null) {
            return true;
        }
        return false;
    }
}
