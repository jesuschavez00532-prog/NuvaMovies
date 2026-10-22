package com.titan.ranger;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.gson.Gson;
import com.titan.ranger.bean.RangerResult;
import java.util.HashMap;
import p432zc.AbstractC7781a;

/* loaded from: classes3.dex */
public class NativeJni {

    /* renamed from: d */
    public static String f13374d;

    /* renamed from: e */
    private static NativeJni f13375e;

    /* renamed from: a */
    private final String f13376a = NativeJni.class.getSimpleName();

    /* renamed from: b */
    private Handler f13377b;

    /* renamed from: c */
    private HandlerThread f13378c;

    /* renamed from: com.titan.ranger.NativeJni$a */
    /* loaded from: classes3.dex */
    class RunnableC3229a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13379a;

        /* renamed from: b */
        final /* synthetic */ String f13380b;

        /* renamed from: c */
        final /* synthetic */ long f13381c;

        /* renamed from: d */
        final /* synthetic */ long f13382d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC3249c f13383e;

        RunnableC3229a(int i10, String str, long j10, long j11, InterfaceC3249c interfaceC3249c) {
            this.f13379a = i10;
            this.f13380b = str;
            this.f13381c = j10;
            this.f13382d = j11;
            this.f13383e = interfaceC3249c;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("Seek", AbstractC3247a.m13128l(this.f13379a, this.f13380b, this.f13381c, this.f13382d));
            InterfaceC3249c interfaceC3249c = this.f13383e;
            if (interfaceC3249c != null) {
                interfaceC3249c.mo13116a("");
            }
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$b */
    /* loaded from: classes3.dex */
    class RunnableC3230b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13385a;

        /* renamed from: b */
        final /* synthetic */ String f13386b;

        /* renamed from: c */
        final /* synthetic */ String f13387c;

        RunnableC3230b(int i10, String str, String str2) {
            this.f13385a = i10;
            this.f13386b = str;
            this.f13387c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("SetMedia", AbstractC3247a.m13129m(this.f13385a, this.f13386b, this.f13387c));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$c */
    /* loaded from: classes3.dex */
    class RunnableC3231c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13389a;

        /* renamed from: b */
        final /* synthetic */ String f13390b;

        RunnableC3231c(int i10, String str) {
            this.f13389a = i10;
            this.f13390b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("Pause", AbstractC3247a.m13126j(this.f13389a, this.f13390b));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$d */
    /* loaded from: classes3.dex */
    class RunnableC3232d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13392a;

        /* renamed from: b */
        final /* synthetic */ String f13393b;

        RunnableC3232d(int i10, String str) {
            this.f13392a = i10;
            this.f13393b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("Resume", AbstractC3247a.m13126j(this.f13392a, this.f13393b));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$e */
    /* loaded from: classes3.dex */
    class RunnableC3233e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13395a;

        /* renamed from: b */
        final /* synthetic */ String f13396b;

        RunnableC3233e(int i10, String str) {
            this.f13395a = i10;
            this.f13396b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("StopProgram", AbstractC3247a.m13126j(this.f13395a, this.f13396b));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$f */
    /* loaded from: classes3.dex */
    class RunnableC3234f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13398a;

        /* renamed from: b */
        final /* synthetic */ long f13399b;

        /* renamed from: c */
        final /* synthetic */ long f13400c;

        RunnableC3234f(int i10, long j10, long j11) {
            this.f13398a = i10;
            this.f13399b = j10;
            this.f13400c = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("OnPlayBuffer", AbstractC3247a.m13121e(this.f13398a, this.f13399b, this.f13400c));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$g */
    /* loaded from: classes3.dex */
    static class C3235g implements InterfaceC3249c {
        C3235g() {
        }

        @Override // com.titan.ranger.InterfaceC3249c
        /* renamed from: a */
        public void mo13116a(String str) {
            NativeJni.f13374d = str;
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$h */
    /* loaded from: classes3.dex */
    class RunnableC3236h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13402a;

        /* renamed from: b */
        final /* synthetic */ String f13403b;

        /* renamed from: c */
        final /* synthetic */ String f13404c;

        /* renamed from: d */
        final /* synthetic */ int f13405d;

        RunnableC3236h(int i10, String str, String str2, int i11) {
            this.f13402a = i10;
            this.f13403b = str;
            this.f13404c = str2;
            this.f13405d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("OnPlayerOperation", AbstractC3247a.m13123g(this.f13402a, this.f13403b, this.f13404c, this.f13405d));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$i */
    /* loaded from: classes3.dex */
    class RunnableC3237i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13407a;

        /* renamed from: b */
        final /* synthetic */ String f13408b;

        /* renamed from: c */
        final /* synthetic */ int f13409c;

        /* renamed from: d */
        final /* synthetic */ int f13410d;

        /* renamed from: e */
        final /* synthetic */ long f13411e;

        /* renamed from: f */
        final /* synthetic */ String f13412f;

        RunnableC3237i(int i10, String str, int i11, int i12, long j10, String str2) {
            this.f13407a = i10;
            this.f13408b = str;
            this.f13409c = i11;
            this.f13410d = i12;
            this.f13411e = j10;
            this.f13412f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("OnPlayerEvent", AbstractC3247a.m13122f(this.f13407a, this.f13408b, this.f13409c, this.f13410d, this.f13411e, this.f13412f));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$j */
    /* loaded from: classes3.dex */
    class RunnableC3238j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13414a;

        /* renamed from: b */
        final /* synthetic */ String f13415b;

        /* renamed from: c */
        final /* synthetic */ String f13416c;

        RunnableC3238j(int i10, String str, String str2) {
            this.f13414a = i10;
            this.f13415b = str;
            this.f13416c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("OnMediaInfo", AbstractC3247a.m13119c(this.f13414a, this.f13415b, this.f13416c));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$k */
    /* loaded from: classes3.dex */
    class RunnableC3239k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13418a;

        /* renamed from: b */
        final /* synthetic */ String f13419b;

        /* renamed from: c */
        final /* synthetic */ String f13420c;

        RunnableC3239k(int i10, String str, String str2) {
            this.f13418a = i10;
            this.f13419b = str;
            this.f13420c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("OnPlayEvent", AbstractC3247a.m13120d(this.f13418a, this.f13419b, this.f13420c));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$l */
    /* loaded from: classes3.dex */
    class RunnableC3240l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13422a;

        /* renamed from: b */
        final /* synthetic */ String f13423b;

        /* renamed from: c */
        final /* synthetic */ String f13424c;

        RunnableC3240l(String str, String str2, String str3) {
            this.f13422a = str;
            this.f13423b = str2;
            this.f13424c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("OnSystemEvent", AbstractC3247a.m13124h(this.f13422a, this.f13423b, this.f13424c));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$m */
    /* loaded from: classes3.dex */
    class RunnableC3241m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13426a;

        RunnableC3241m(String str) {
            this.f13426a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap hashMap = new HashMap();
            hashMap.put("work_path", this.f13426a);
            NativeJni.this.m13095a("Init", AbstractC7781a.m30143a().toJson(hashMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.titan.ranger.NativeJni$n */
    /* loaded from: classes3.dex */
    public class RunnableC3242n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3249c f13428a;

        RunnableC3242n(InterfaceC3249c interfaceC3249c) {
            this.f13428a = interfaceC3249c;
        }

        @Override // java.lang.Runnable
        public void run() {
            String res = ((RangerResult) AbstractC7781a.m30143a().fromJson(NativeJni.this.m13095a("GetVersion", "{}"), RangerResult.class)).getRes();
            InterfaceC3249c interfaceC3249c = this.f13428a;
            if (interfaceC3249c != null) {
                interfaceC3249c.mo13116a(res);
            }
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$o */
    /* loaded from: classes3.dex */
    class RunnableC3243o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13430a;

        RunnableC3243o(String str) {
            this.f13430a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("SetEnv", AbstractC3247a.m13118b(this.f13430a));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$p */
    /* loaded from: classes3.dex */
    class RunnableC3244p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13432a;

        RunnableC3244p(String str) {
            this.f13432a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("SetEntries", AbstractC3247a.m13117a(this.f13432a));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$q */
    /* loaded from: classes3.dex */
    class RunnableC3245q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13434a;

        /* renamed from: b */
        final /* synthetic */ String f13435b;

        /* renamed from: c */
        final /* synthetic */ int f13436c;

        RunnableC3245q(int i10, String str, int i11) {
            this.f13434a = i10;
            this.f13435b = str;
            this.f13436c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("SetPlayer", AbstractC3247a.m13125i(this.f13434a, this.f13435b, this.f13436c));
        }
    }

    /* renamed from: com.titan.ranger.NativeJni$r */
    /* loaded from: classes3.dex */
    class RunnableC3246r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13438a;

        /* renamed from: b */
        final /* synthetic */ String f13439b;

        /* renamed from: c */
        final /* synthetic */ String f13440c;

        /* renamed from: d */
        final /* synthetic */ String f13441d;

        RunnableC3246r(int i10, String str, String str2, String str3) {
            this.f13438a = i10;
            this.f13439b = str;
            this.f13440c = str2;
            this.f13441d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeJni.this.m13095a("PrepareProgram", AbstractC3247a.m13127k(this.f13438a, this.f13439b, this.f13440c, this.f13441d));
        }
    }

    static {
        System.loadLibrary("ranger-jni");
        System.loadLibrary("c++_shared");
        f13374d = "";
    }

    private NativeJni() {
        HandlerThread handlerThread = new HandlerThread("handlerRanger");
        this.f13378c = handlerThread;
        handlerThread.start();
        this.f13377b = new Handler(this.f13378c.getLooper());
    }

    private native String Call(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m13095a(String str, String str2) {
        return Call(str, str2);
    }

    /* renamed from: c */
    public static NativeJni m13097c() {
        if (f13375e == null) {
            synchronized (NativeJni.class) {
                if (f13375e == null) {
                    NativeJni nativeJni = new NativeJni();
                    f13375e = nativeJni;
                    nativeJni.m13098d(new C3235g());
                }
            }
        }
        return f13375e;
    }

    /* renamed from: d */
    public void m13098d(InterfaceC3249c interfaceC3249c) {
        this.f13377b.post(new RunnableC3242n(interfaceC3249c));
    }

    /* renamed from: e */
    public void m13099e(int i10, String str, InterfaceC3248b interfaceC3248b) {
        String m13095a = m13095a("GetStatus", AbstractC3247a.m13126j(i10, str));
        Gson m30143a = AbstractC7781a.m30143a();
        Status status = (Status) m30143a.fromJson(((RangerResult) m30143a.fromJson(m13095a, RangerResult.class)).getRes(), Status.class);
        if (interfaceC3248b != null) {
            interfaceC3248b.mo13130a(status);
        }
    }

    /* renamed from: f */
    public void m13100f(String str) {
        Handler handler = this.f13377b;
        if (handler == null) {
            Log.e(this.f13376a, "threadHandler is not initialized");
        } else {
            handler.post(new RunnableC3241m(str));
        }
    }

    /* renamed from: g */
    public void m13101g(int i10, String str, int i11) {
        this.f13377b.post(new RunnableC3245q(i10, str, i11));
    }

    /* renamed from: h */
    public void m13102h(int i10, String str, String str2) {
        this.f13377b.post(new RunnableC3238j(i10, str, str2));
    }

    /* renamed from: i */
    public void m13103i(int i10, String str, String str2) {
        this.f13377b.post(new RunnableC3239k(i10, str, str2));
    }

    /* renamed from: j */
    public void m13104j(int i10, long j10, long j11) {
        this.f13377b.post(new RunnableC3234f(i10, j10, j11));
    }

    /* renamed from: k */
    public void m13105k(int i10, String str, int i11, int i12, long j10, String str2) {
        this.f13377b.post(new RunnableC3237i(i10, str, i11, i12, j10, str2));
    }

    /* renamed from: l */
    public void m13106l(int i10, String str, String str2, int i11) {
        this.f13377b.post(new RunnableC3236h(i10, str, str2, i11));
    }

    /* renamed from: m */
    public void m13107m(String str, String str2, String str3) {
        this.f13377b.post(new RunnableC3240l(str, str2, str3));
    }

    /* renamed from: n */
    public void m13108n(int i10, String str) {
        this.f13377b.post(new RunnableC3231c(i10, str));
    }

    /* renamed from: o */
    public void m13109o(int i10, String str, String str2, String str3) {
        this.f13377b.post(new RunnableC3246r(i10, str, str2, str3));
    }

    /* renamed from: p */
    public void m13110p(int i10, String str) {
        this.f13377b.post(new RunnableC3232d(i10, str));
    }

    /* renamed from: q */
    public void m13111q(int i10, String str, long j10, long j11, InterfaceC3249c interfaceC3249c) {
        this.f13377b.post(new RunnableC3229a(i10, str, j10, j11, interfaceC3249c));
    }

    /* renamed from: r */
    public void m13112r(String str) {
        this.f13377b.post(new RunnableC3244p(str));
    }

    /* renamed from: s */
    public void m13113s(int i10, String str, String str2) {
        this.f13377b.post(new RunnableC3230b(i10, str, str2));
    }

    /* renamed from: t */
    public void m13114t(String str) {
        this.f13377b.post(new RunnableC3243o(str));
    }

    /* renamed from: u */
    public void m13115u(int i10, String str) {
        this.f13377b.post(new RunnableC3233e(i10, str));
    }
}
