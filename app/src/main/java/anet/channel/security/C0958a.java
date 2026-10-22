package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.HMacUtil;

/* renamed from: anet.channel.security.a */
/* loaded from: classes.dex */
class C0958a implements ISecurity {

    /* renamed from: a */
    private String f3997a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0958a(String str) {
        this.f3997a = str;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        return true;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        return false;
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(this.f3997a) || !ISecurity.SIGN_ALGORITHM_HMAC_SHA1.equalsIgnoreCase(str)) {
            return null;
        }
        return HMacUtil.hmacSha1Hex(this.f3997a.getBytes(), str3.getBytes());
    }
}
