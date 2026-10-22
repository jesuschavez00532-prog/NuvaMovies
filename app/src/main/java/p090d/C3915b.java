package p090d;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.AbstractC0547a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p090d.AbstractC3914a;
import p214l.C5303a;

/* renamed from: d.b */
/* loaded from: classes.dex */
public final class C3915b extends AbstractC3914a {
    /* renamed from: e */
    static Intent m16747e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // p090d.AbstractC3914a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo3562a(Context context, String[] strArr) {
        return m16747e(strArr);
    }

    @Override // p090d.AbstractC3914a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC3914a.a mo16745b(Context context, String[] strArr) {
        boolean z10;
        if (strArr != null && strArr.length != 0) {
            C5303a c5303a = new C5303a();
            boolean z11 = true;
            for (String str : strArr) {
                if (AbstractC0547a.m2319a(context, str) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c5303a.put(str, Boolean.valueOf(z10));
                if (!z10) {
                    z11 = false;
                }
            }
            if (z11) {
                return new AbstractC3914a.a(c5303a);
            }
            return null;
        }
        return new AbstractC3914a.a(Collections.emptyMap());
    }

    @Override // p090d.AbstractC3914a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map mo3563c(int i10, Intent intent) {
        boolean z10;
        if (i10 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = stringArrayExtra[i11];
                if (intArrayExtra[i11] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hashMap.put(str, Boolean.valueOf(z10));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
