package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3520d;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.k */
/* loaded from: classes3.dex */
public class C3499k extends AbstractC3489a {

    /* renamed from: a */
    private static final String f15483a = "utdid";

    /* renamed from: b */
    private Context f15484b;

    public C3499k(Context context) {
        super("utdid");
        this.f15484b = context;
    }

    /* renamed from: g */
    private String m14896g() {
        try {
            return this.f15484b.getSharedPreferences("Alvin2", 0).getString("UTDID2", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    private String m14897h() {
        try {
            return this.f15484b.getSharedPreferences("um_push_ut", 0).getString("d_id", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    /* renamed from: f */
    public String mo14876f() {
        try {
            if (FieldManager.allow(C3520d.f15699u)) {
                String m14897h = m14897h();
                if (TextUtils.isEmpty(m14897h)) {
                    return m14896g();
                }
                return m14897h;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
