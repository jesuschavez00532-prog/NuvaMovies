package com.efs.sdk.base.core.p052c;

import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.secure.C1724a;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.core.c.b */
/* loaded from: classes.dex */
public final class C1685b implements ILogEncryptAction {
    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final byte[] decrypt(String str, byte[] bArr) {
        try {
            return C1724a.m7773a(bArr, str);
        } catch (Exception e10) {
            Log.m7727e("efs.base", "aes decrypt error", e10);
            return null;
        }
    }

    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final byte[] encrypt(String str, byte[] bArr) {
        try {
            return C1724a.m7775b(bArr, str);
        } catch (Exception e10) {
            Log.m7727e("efs.base", "aes encrypt error", e10);
            return null;
        }
    }

    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final int getDeVal() {
        return 2;
    }
}
