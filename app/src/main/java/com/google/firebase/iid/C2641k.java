package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.installations.AbstractC2659g;
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

/* renamed from: com.google.firebase.iid.k */
/* loaded from: classes.dex */
public class C2641k {

    /* renamed from: a */
    private final C6913d f10106a;

    /* renamed from: b */
    private final C2644n f10107b;

    /* renamed from: c */
    private final C4522d f10108c;

    /* renamed from: d */
    private final InterfaceC6922b f10109d;

    /* renamed from: e */
    private final InterfaceC6922b f10110e;

    /* renamed from: f */
    private final InterfaceC7048d f10111f;

    C2641k(C6913d c6913d, C2644n c2644n, C4522d c4522d, InterfaceC6922b interfaceC6922b, InterfaceC6922b interfaceC6922b2, InterfaceC7048d interfaceC7048d) {
        this.f10106a = c6913d;
        this.f10107b = c2644n;
        this.f10108c = c4522d;
        this.f10109d = interfaceC6922b;
        this.f10110e = interfaceC6922b2;
        this.f10111f = interfaceC7048d;
    }

    /* renamed from: a */
    private static String m10950a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    private AbstractC4245i m10951b(AbstractC4245i abstractC4245i) {
        return abstractC4245i.mo17705g(AbstractC2632b.m10948a(), new InterfaceC4229a(this) { // from class: com.google.firebase.iid.j

            /* renamed from: a */
            private final C2641k f10105a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10105a = this;
            }

            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public Object mo289a(AbstractC4245i abstractC4245i2) {
                return this.f10105a.m10958g(abstractC4245i2);
            }
        });
    }

    /* renamed from: c */
    private String m10952c() {
        try {
            return m10950a(MessageDigest.getInstance("SHA-1").digest(this.f10106a.m26868l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    private String m10953e(Bundle bundle) {
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
                String valueOf = String.valueOf(bundle);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
                sb2.append("Unexpected response: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m10954f(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private Bundle m10955h(String str, String str2, String str3, Bundle bundle) {
        InterfaceC6546k.a mo25590b;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f10106a.m26869m().m26881c());
        bundle.putString("gmsv", Integer.toString(this.f10107b.m10966d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f10107b.m10964a());
        bundle.putString("app_ver_name", this.f10107b.m10965b());
        bundle.putString("firebase-app-name-hash", m10952c());
        try {
            String mo10994b = ((AbstractC2659g) AbstractC4250l.m17729a(this.f10111f.mo11029b(false))).mo10994b();
            if (!TextUtils.isEmpty(mo10994b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", mo10994b);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        InterfaceC6546k interfaceC6546k = (InterfaceC6546k) this.f10110e.get();
        InterfaceC1146i interfaceC1146i = (InterfaceC1146i) this.f10109d.get();
        if (interfaceC6546k != null && interfaceC1146i != null && (mo25590b = interfaceC6546k.mo25590b("fire-iid")) != InterfaceC6546k.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo25590b.m25593a()));
            bundle.putString("Firebase-Client", interfaceC1146i.mo5196a());
        }
        return bundle;
    }

    /* renamed from: i */
    private AbstractC4245i m10956i(String str, String str2, String str3, Bundle bundle) {
        m10955h(str, str2, str3, bundle);
        return this.f10108c.m18918a(bundle);
    }

    /* renamed from: d */
    public AbstractC4245i m10957d(String str, String str2, String str3) {
        return m10951b(m10956i(str, str2, str3, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ String m10958g(AbstractC4245i abstractC4245i) {
        return m10953e((Bundle) abstractC4245i.mo17709k(IOException.class));
    }

    public C2641k(C6913d c6913d, C2644n c2644n, InterfaceC6922b interfaceC6922b, InterfaceC6922b interfaceC6922b2, InterfaceC7048d interfaceC7048d) {
        this(c6913d, c2644n, new C4522d(c6913d.m26867j()), interfaceC6922b, interfaceC6922b2, interfaceC7048d);
    }
}
