package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.umeng.analytics.pro.ak */
/* loaded from: classes3.dex */
public class C3289ak {

    /* renamed from: a */
    private String f13969a;

    /* renamed from: b */
    private ArrayList<C3290al> f13970b = new ArrayList<>();

    public C3289ak(String str) {
        this.f13969a = "";
        this.f13969a = str;
        if (!TextUtils.isEmpty(str)) {
            m13754a();
        }
    }

    /* renamed from: a */
    private void m13754a() {
        try {
            if (this.f13969a.contains(",")) {
                for (String str : this.f13969a.split(",")) {
                    if (!TextUtils.isEmpty(str)) {
                        String trim = str.trim();
                        if (this.f13970b != null) {
                            this.f13970b.add(new C3290al(trim));
                        }
                    }
                }
                return;
            }
            String str2 = this.f13969a;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String trim2 = str2.trim();
            if (this.f13970b != null) {
                this.f13970b.add(new C3290al(trim2));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public boolean m13755a(int i10) {
        try {
            ArrayList<C3290al> arrayList = this.f13970b;
            if (arrayList == null) {
                return false;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C3290al c3290al = this.f13970b.get(i11);
                if (c3290al != null && c3290al.m13757a(i10)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
