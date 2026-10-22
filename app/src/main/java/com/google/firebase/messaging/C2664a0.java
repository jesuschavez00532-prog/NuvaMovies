package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.installations.AbstractC2659g;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p027b7.InterfaceC1146i;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.InterfaceC4229a;
import p155h4.C4522d;
import p312r6.InterfaceC6546k;
import p337t5.C6913d;
import p338t6.InterfaceC6922b;
import p352u6.InterfaceC7048d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.a0 */
/* loaded from: classes.dex */
public class C2664a0 {

    /* renamed from: a */
    private final C6913d f10246a;

    /* renamed from: b */
    private final C2679f0 f10247b;

    /* renamed from: c */
    private final C4522d f10248c;

    /* renamed from: d */
    private final InterfaceC6922b f10249d;

    /* renamed from: e */
    private final InterfaceC6922b f10250e;

    /* renamed from: f */
    private final InterfaceC7048d f10251f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2664a0(C6913d c6913d, C2679f0 c2679f0, InterfaceC6922b interfaceC6922b, InterfaceC6922b interfaceC6922b2, InterfaceC7048d interfaceC7048d) {
        this(c6913d, c2679f0, new C4522d(c6913d.m26867j()), interfaceC6922b, interfaceC6922b2, interfaceC7048d);
    }

    /* renamed from: b */
    private static String m11095b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: c */
    private AbstractC4245i m11096c(AbstractC4245i abstractC4245i) {
        return abstractC4245i.mo17705g(new ExecutorC2681g(), new InterfaceC4229a() { // from class: com.google.firebase.messaging.z
            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public final Object mo289a(AbstractC4245i abstractC4245i2) {
                String m11100h;
                m11100h = C2664a0.this.m11100h(abstractC4245i2);
                return m11100h;
            }
        });
    }

    /* renamed from: d */
    private String m11097d() {
        try {
            return m11095b(MessageDigest.getInstance("SHA-1").digest(this.f10246a.m26868l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    private String m11098f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m11099g(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String m11100h(AbstractC4245i abstractC4245i) {
        return m11098f((Bundle) abstractC4245i.mo17709k(IOException.class));
    }

    /* renamed from: i */
    private void m11101i(String str, String str2, Bundle bundle) {
        InterfaceC6546k.a mo25590b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f10246a.m26869m().m26881c());
        bundle.putString("gmsv", Integer.toString(this.f10247b.m11212d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f10247b.m11210a());
        bundle.putString("app_ver_name", this.f10247b.m11211b());
        bundle.putString("firebase-app-name-hash", m11097d());
        try {
            String mo10994b = ((AbstractC2659g) AbstractC4250l.m17729a(this.f10251f.mo11029b(false))).mo10994b();
            if (!TextUtils.isEmpty(mo10994b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", mo10994b);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) AbstractC4250l.m17729a(this.f10251f.mo11028a()));
        bundle.putString("cliv", "fcm-23.0.8");
        InterfaceC6546k interfaceC6546k = (InterfaceC6546k) this.f10250e.get();
        InterfaceC1146i interfaceC1146i = (InterfaceC1146i) this.f10249d.get();
        if (interfaceC6546k != null && interfaceC1146i != null && (mo25590b = interfaceC6546k.mo25590b("fire-iid")) != InterfaceC6546k.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo25590b.m25593a()));
            bundle.putString("Firebase-Client", interfaceC1146i.mo5196a());
        }
    }

    /* renamed from: j */
    private AbstractC4245i m11102j(String str, String str2, Bundle bundle) {
        try {
            m11101i(str, str2, bundle);
            return this.f10248c.m18918a(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return AbstractC4250l.m17732d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC4245i m11103e() {
        return m11096c(m11102j(C2679f0.m11207c(this.f10246a), Operator.Operation.MULTIPLY, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public AbstractC4245i m11104k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m11096c(m11102j(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public AbstractC4245i m11105l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m11096c(m11102j(str, "/topics/" + str2, bundle));
    }

    C2664a0(C6913d c6913d, C2679f0 c2679f0, C4522d c4522d, InterfaceC6922b interfaceC6922b, InterfaceC6922b interfaceC6922b2, InterfaceC7048d interfaceC7048d) {
        this.f10246a = c6913d;
        this.f10247b = c2679f0;
        this.f10248c = c4522d;
        this.f10249d = interfaceC6922b;
        this.f10250e = interfaceC6922b2;
        this.f10251f = interfaceC7048d;
    }
}
