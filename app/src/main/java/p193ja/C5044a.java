package p193ja;

import be.C1328x;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.cache.CacheEntity;
import com.request.result.RecommendList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;
import org.android.agoo.common.AgooConstants;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p400xa.C7581k;

/* renamed from: ja.a */
/* loaded from: classes2.dex */
public final class C5044a {

    /* renamed from: e */
    private static boolean f20866e;

    /* renamed from: a */
    public static final C5044a f20862a = new C5044a();

    /* renamed from: b */
    private static final String f20863b = "ColumnDataManager";

    /* renamed from: c */
    private static final HashMap f20864c = new HashMap(8);

    /* renamed from: d */
    private static HashMap f20865d = new HashMap(8);

    /* renamed from: f */
    private static ArrayList f20867f = new ArrayList();

    /* renamed from: ja.a$a */
    /* loaded from: classes2.dex */
    public static final class a extends TypeToken<List<? extends RecommendList>> {
        a() {
        }
    }

    private C5044a() {
    }

    /* renamed from: a */
    public final Object m20485a(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        return f20864c.get(str);
    }

    /* renamed from: b */
    public final List m20486b(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        if (AbstractC6567a.m25636f(f20865d)) {
            return null;
        }
        return (List) f20865d.get(str);
    }

    /* renamed from: c */
    public final List m20487c(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        String m29097f = C7581k.f27855a.m29097f(str);
        if (AbstractC6567a.m25634d(m29097f)) {
            return null;
        }
        return (List) AbstractC7027d.m27114a().fromJson(m29097f, new a().getType());
    }

    /* renamed from: d */
    public final void m20488d() {
        f20866e = true;
        synchronized (f20867f) {
            ArrayList arrayList = f20867f;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC5045b) arrayList.get(size)).mo16595Y0();
            }
            C1328x c1328x = C1328x.f4998a;
        }
    }

    /* renamed from: e */
    public final void m20489e(String str, Object obj) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        f20864c.put(str, obj);
    }

    /* renamed from: f */
    public final void m20490f(String str, List list) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        HashMap hashMap = f20865d;
        AbstractC5868k.m23671c(list);
        hashMap.put(str, list);
    }

    /* renamed from: g */
    public final void m20491g(InterfaceC5045b interfaceC5045b) {
        AbstractC5868k.m23674f(interfaceC5045b, AgooConstants.MESSAGE_NOTIFICATION);
        synchronized (f20867f) {
            Iterator it = f20867f.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (AbstractC5868k.m23669a((InterfaceC5045b) it.next(), interfaceC5045b)) {
                    z10 = true;
                }
            }
            if (!z10) {
                f20867f.add(interfaceC5045b);
                if (f20866e) {
                    ArrayList arrayList = f20867f;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((InterfaceC5045b) arrayList.get(size)).mo16595Y0();
                    }
                }
            }
            C1328x c1328x = C1328x.f4998a;
        }
    }

    /* renamed from: h */
    public final void m20492h(String str, List list) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        String json = AbstractC7027d.m27114a().toJson(list);
        C7581k c7581k = C7581k.f27855a;
        AbstractC5868k.m23673e(json, "json");
        c7581k.m29098g(str, json);
    }

    /* renamed from: i */
    public final void m20493i(InterfaceC5045b interfaceC5045b) {
        AbstractC5868k.m23674f(interfaceC5045b, AgooConstants.MESSAGE_NOTIFICATION);
        synchronized (f20867f) {
            ArrayList arrayList = f20867f;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (AbstractC5868k.m23669a((InterfaceC5045b) arrayList.get(size), interfaceC5045b)) {
                    f20867f.remove(size);
                }
            }
            C1328x c1328x = C1328x.f4998a;
        }
    }
}
