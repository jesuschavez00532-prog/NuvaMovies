package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anet.channel.security.b */
/* loaded from: classes.dex */
class C0959b implements ISecurity {

    /* renamed from: a */
    private static String f3998a = "awcn.DefaultSecurityGuard";

    /* renamed from: b */
    private static boolean f3999b;

    /* renamed from: c */
    private static Map<String, Integer> f4000c;

    /* renamed from: d */
    private String f4001d;

    static {
        try {
            Class.forName("com.alibaba.wireless.security.open.SecurityGuardManager");
            f3999b = true;
            HashMap hashMap = new HashMap();
            f4000c = hashMap;
            hashMap.put(ISecurity.SIGN_ALGORITHM_HMAC_SHA1, 3);
            f4000c.put(ISecurity.CIPHER_ALGORITHM_AES128, 16);
        } catch (Throwable unused) {
            f3999b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0959b(String str) {
        this.f4001d = str;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        Integer num;
        IStaticDataEncryptComponent staticDataEncryptComp;
        if (!f3999b || context == null || bArr == null || TextUtils.isEmpty(str2) || !f4000c.containsKey(str) || (num = f4000c.get(str)) == null) {
            return null;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager != null && (staticDataEncryptComp = securityGuardManager.getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticBinarySafeDecryptNoB64(num.intValue(), str2, bArr, this.f4001d);
            }
        } catch (Throwable th) {
            ALog.m4786e(f3998a, "staticBinarySafeDecryptNoB64", null, th, new Object[0]);
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager == null || (dynamicDataStoreComp = securityGuardManager.getDynamicDataStoreComp()) == null) {
                return null;
            }
            return dynamicDataStoreComp.getByteArray(str);
        } catch (Throwable th) {
            ALog.m4786e(f3998a, "getBytes", null, th, new Object[0]);
            return null;
        }
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        return false;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context == null || bArr == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager == null || (dynamicDataStoreComp = securityGuardManager.getDynamicDataStoreComp()) == null) {
                return false;
            }
            if (dynamicDataStoreComp.putByteArray(str, bArr) == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            ALog.m4786e(f3998a, "saveBytes", null, th, new Object[0]);
            return false;
        }
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        if (f3999b && context != null && !TextUtils.isEmpty(str2) && f4000c.containsKey(str)) {
            try {
                ISecureSignatureComponent secureSignatureComp = SecurityGuardManager.getInstance(context).getSecureSignatureComp();
                if (secureSignatureComp != null) {
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str2;
                    securityGuardParamContext.paramMap.put("INPUT", str3);
                    securityGuardParamContext.requestType = f4000c.get(str).intValue();
                    return secureSignatureComp.signRequest(securityGuardParamContext, this.f4001d);
                }
            } catch (Throwable th) {
                ALog.m4786e(f3998a, "Securityguard sign request failed.", null, th, new Object[0]);
            }
        }
        return null;
    }
}
