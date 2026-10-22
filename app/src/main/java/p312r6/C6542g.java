package p312r6;

import android.content.Context;
import android.util.Base64OutputStream;
import anet.channel.request.Request;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p027b7.InterfaceC1146i;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p312r6.InterfaceC6546k;
import p331t.AbstractC6882m;
import p337t5.C6913d;
import p338t6.InterfaceC6922b;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;

/* renamed from: r6.g */
/* loaded from: classes.dex */
public class C6542g implements InterfaceC6545j, InterfaceC6546k {

    /* renamed from: f */
    private static final ThreadFactory f25162f = new ThreadFactory() { // from class: r6.b
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread m25588m;
            m25588m = C6542g.m25588m(runnable);
            return m25588m;
        }
    };

    /* renamed from: a */
    private final InterfaceC6922b f25163a;

    /* renamed from: b */
    private final Context f25164b;

    /* renamed from: c */
    private final InterfaceC6922b f25165c;

    /* renamed from: d */
    private final Set f25166d;

    /* renamed from: e */
    private final Executor f25167e;

    private C6542g(final Context context, final String str, Set set, InterfaceC6922b interfaceC6922b) {
        this(new InterfaceC6922b() { // from class: r6.f
            @Override // p338t6.InterfaceC6922b
            public final Object get() {
                C6553r m25586k;
                m25586k = C6542g.m25586k(context, str);
                return m25586k;
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f25162f), interfaceC6922b, context);
    }

    /* renamed from: h */
    public static C7216d m25583h() {
        return C7216d.m27910d(C6542g.class, InterfaceC6545j.class, InterfaceC6546k.class).m27929b(C7233r.m27995j(Context.class)).m27929b(C7233r.m27995j(C6913d.class)).m27929b(C7233r.m27997l(InterfaceC6543h.class)).m27929b(C7233r.m27996k(InterfaceC1146i.class)).m27933f(new InterfaceC7223h() { // from class: r6.c
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                C6542g m25584i;
                m25584i = C6542g.m25584i(interfaceC7218e);
                return m25584i;
            }
        }).m27931d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ C6542g m25584i(InterfaceC7218e interfaceC7218e) {
        return new C6542g((Context) interfaceC7218e.mo27905a(Context.class), ((C6913d) interfaceC7218e.mo27905a(C6913d.class)).m26870n(), interfaceC7218e.mo27906d(InterfaceC6543h.class), interfaceC7218e.mo27943b(InterfaceC1146i.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ String m25585j() {
        String byteArrayOutputStream;
        synchronized (this) {
            C6553r c6553r = (C6553r) this.f25163a.get();
            List m25605c = c6553r.m25605c();
            c6553r.m25604b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < m25605c.size(); i10++) {
                AbstractC6554s abstractC6554s = (AbstractC6554s) m25605c.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", abstractC6554s.mo25577c());
                jSONObject.put("dates", new JSONArray((Collection) abstractC6554s.mo25576b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes(Request.DEFAULT_CHARSET));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString(Request.DEFAULT_CHARSET);
                } finally {
                }
            } finally {
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ C6553r m25586k(Context context, String str) {
        return new C6553r(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Void m25587l() {
        synchronized (this) {
            ((C6553r) this.f25163a.get()).m25610k(System.currentTimeMillis(), ((InterfaceC1146i) this.f25165c.get()).mo5196a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ Thread m25588m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // p312r6.InterfaceC6545j
    /* renamed from: a */
    public AbstractC4245i mo25589a() {
        if (!AbstractC6882m.m26795a(this.f25164b)) {
            return AbstractC4250l.m17733e("");
        }
        return AbstractC4250l.m17731c(this.f25167e, new Callable() { // from class: r6.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m25585j;
                m25585j = C6542g.this.m25585j();
                return m25585j;
            }
        });
    }

    @Override // p312r6.InterfaceC6546k
    /* renamed from: b */
    public synchronized InterfaceC6546k.a mo25590b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C6553r c6553r = (C6553r) this.f25163a.get();
        if (c6553r.m25608i(currentTimeMillis)) {
            c6553r.m25607g();
            return InterfaceC6546k.a.GLOBAL;
        }
        return InterfaceC6546k.a.NONE;
    }

    /* renamed from: n */
    public AbstractC4245i m25591n() {
        if (this.f25166d.size() <= 0) {
            return AbstractC4250l.m17733e(null);
        }
        if (!AbstractC6882m.m26795a(this.f25164b)) {
            return AbstractC4250l.m17733e(null);
        }
        return AbstractC4250l.m17731c(this.f25167e, new Callable() { // from class: r6.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m25587l;
                m25587l = C6542g.this.m25587l();
                return m25587l;
            }
        });
    }

    C6542g(InterfaceC6922b interfaceC6922b, Set set, Executor executor, InterfaceC6922b interfaceC6922b2, Context context) {
        this.f25163a = interfaceC6922b;
        this.f25166d = set;
        this.f25167e = executor;
        this.f25165c = interfaceC6922b2;
        this.f25164b = context;
    }
}
