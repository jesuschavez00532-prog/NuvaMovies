package org.repackage.p270a.p271a.p272a.p273a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.repackage.p270a.p271a.p272a.InterfaceC6067a;

/* renamed from: org.repackage.a.a.a.a.c */
/* loaded from: classes3.dex */
public class C6070c {

    /* renamed from: a */
    public InterfaceC6067a f23845a = null;

    /* renamed from: b */
    public String f23846b = null;

    /* renamed from: c */
    public String f23847c = null;

    /* renamed from: d */
    public final Object f23848d = new Object();

    /* renamed from: e */
    public ServiceConnection f23849e = new ServiceConnectionC6069b(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.repackage.a.a.a.a.c$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public static final C6070c f23850a = new C6070c(null);
    }

    public /* synthetic */ C6070c(ServiceConnectionC6069b serviceConnectionC6069b) {
    }

    /* renamed from: a */
    public boolean m24224a(Context context) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT < 28) {
                return packageInfo != null && packageInfo.versionCode >= 1;
            }
            if (packageInfo == null) {
                return false;
            }
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode >= 1;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final String m24225b(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f23846b)) {
            this.f23846b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f23847c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f23846b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : digest) {
                            sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
                        }
                        str2 = sb2.toString();
                    }
                } catch (NoSuchAlgorithmException e11) {
                    e11.printStackTrace();
                }
            }
            this.f23847c = str2;
        }
        String m24222a = ((InterfaceC6067a.a.C7856a) this.f23845a).m24222a(this.f23846b, this.f23847c, str);
        if (TextUtils.isEmpty(m24222a)) {
            return "";
        }
        return m24222a;
    }

    /* renamed from: a */
    public synchronized String m24223a(Context context, String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f23845a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f23849e, 1)) {
                    synchronized (this.f23848d) {
                        try {
                            this.f23848d.wait(3000L);
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (this.f23845a == null) {
                    return "";
                }
                try {
                    return m24225b(context, str);
                } catch (RemoteException e11) {
                    e11.printStackTrace();
                    return "";
                }
            }
            try {
                return m24225b(context, str);
            } catch (RemoteException e12) {
                e12.printStackTrace();
                return "";
            }
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }
}
