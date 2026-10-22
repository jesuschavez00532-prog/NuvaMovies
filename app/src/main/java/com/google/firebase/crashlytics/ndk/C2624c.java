package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import p038c6.AbstractC1370c0;
import p128f6.C4270f;
import p395x5.C7503f;
import p395x5.InterfaceC7498a;
import p395x5.InterfaceC7504g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.ndk.c */
/* loaded from: classes.dex */
public class C2624c implements InterfaceC7498a {

    /* renamed from: e */
    private static C2624c f10046e;

    /* renamed from: a */
    private final C2622a f10047a;

    /* renamed from: b */
    private boolean f10048b;

    /* renamed from: c */
    private String f10049c;

    /* renamed from: d */
    private a f10050d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.crashlytics.ndk.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo10875a();
    }

    C2624c(C2622a c2622a, boolean z10) {
        this.f10047a = c2622a;
        this.f10048b = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C2624c m10877f(Context context, boolean z10) {
        C2624c c2624c = new C2624c(new C2622a(context, new JniNativeApi(context), new C4270f(context)), z10);
        f10046e = c2624c;
        return c2624c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m10878g(String str, String str2, long j10, AbstractC1370c0 abstractC1370c0) {
        C7503f.m28716f().m28717b("Initializing native session: " + str);
        if (!this.f10047a.m10870d(str, str2, j10, abstractC1370c0)) {
            C7503f.m28716f().m28725k("Failed to initialize Crashlytics NDK for session " + str);
        }
    }

    @Override // p395x5.InterfaceC7498a
    /* renamed from: a */
    public InterfaceC7504g mo10879a(String str) {
        return new C2628g(this.f10047a.m10868a(str));
    }

    @Override // p395x5.InterfaceC7498a
    /* renamed from: b */
    public boolean mo10880b() {
        String str = this.f10049c;
        if (str != null && mo10881c(str)) {
            return true;
        }
        return false;
    }

    @Override // p395x5.InterfaceC7498a
    /* renamed from: c */
    public boolean mo10881c(String str) {
        return this.f10047a.m10869c(str);
    }

    @Override // p395x5.InterfaceC7498a
    /* renamed from: d */
    public synchronized void mo10882d(final String str, final String str2, final long j10, final AbstractC1370c0 abstractC1370c0) {
        this.f10049c = str;
        a aVar = new a() { // from class: com.google.firebase.crashlytics.ndk.b
            @Override // com.google.firebase.crashlytics.ndk.C2624c.a
            /* renamed from: a */
            public final void mo10875a() {
                C2624c.this.m10878g(str, str2, j10, abstractC1370c0);
            }
        };
        this.f10050d = aVar;
        if (this.f10048b) {
            aVar.mo10875a();
        }
    }
}
