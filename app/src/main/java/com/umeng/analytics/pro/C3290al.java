package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;

/* renamed from: com.umeng.analytics.pro.al */
/* loaded from: classes3.dex */
public class C3290al {

    /* renamed from: a */
    private String f13971a;

    /* renamed from: e */
    private boolean f13975e = false;

    /* renamed from: d */
    private int f13974d = -1;

    /* renamed from: c */
    private int f13973c = -1;

    /* renamed from: b */
    private int f13972b = -1;

    public C3290al(String str) {
        this.f13971a = str;
        if (!TextUtils.isEmpty(str)) {
            m13756a();
        }
    }

    /* renamed from: a */
    private void m13756a() {
        try {
            if (this.f13971a.contains(Operator.Operation.MINUS)) {
                String[] split = this.f13971a.split(Operator.Operation.MINUS);
                if (split.length == 2) {
                    this.f13972b = Integer.valueOf(split[0]).intValue();
                    int intValue = Integer.valueOf(split[1]).intValue();
                    this.f13973c = intValue;
                    if (this.f13972b < 1) {
                        this.f13972b = 1;
                    }
                    if (intValue > 24) {
                        this.f13973c = 24;
                    }
                }
                this.f13975e = true;
                return;
            }
            this.f13974d = Integer.valueOf(this.f13971a).intValue();
            this.f13975e = false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public boolean m13757a(int i10) {
        int i11;
        if (this.f13975e) {
            int i12 = this.f13972b;
            if (i12 != -1 && (i11 = this.f13973c) != -1 && i10 >= i12 && i10 <= i11) {
                return true;
            }
        } else {
            int i13 = this.f13974d;
            if (i13 != -1 && i10 == i13) {
                return true;
            }
        }
        return false;
    }
}
