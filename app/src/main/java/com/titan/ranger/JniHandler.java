package com.titan.ranger;

import android.text.TextUtils;
import com.titan.ranger.bean.RangerResult;

/* loaded from: classes3.dex */
public class JniHandler {

    /* renamed from: a */
    private static InterfaceC3228a[] f13373a = new InterfaceC3228a[2];

    /* renamed from: com.titan.ranger.JniHandler$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC3228a {
        /* renamed from: a */
        int mo13090a(int i10, String str, String str2, String str3);

        /* renamed from: b */
        int mo13091b();

        /* renamed from: c */
        int mo13092c(String str, String str2, int i10);

        /* renamed from: d */
        int mo13093d(int i10, String str, Object obj, long j10);

        /* renamed from: t */
        int mo13094t(String str, String str2, long j10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x003d, code lost:
    
        if (r14.equals("OnPrepareEvent") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String Callback(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.titan.ranger.JniHandler.Callback(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private RangerResult m13085a(String str, String str2, long j10) {
        RangerResult rangerResult = new RangerResult(0, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            InterfaceC3228a interfaceC3228a = f13373a[0];
            if (interfaceC3228a != null) {
                rangerResult.setErr(interfaceC3228a.mo13094t(str, str2, j10));
            }
        } else {
            rangerResult.setErr(22);
        }
        return rangerResult;
    }

    /* renamed from: b */
    private RangerResult m13086b(int i10, String str, Object obj, long j10) {
        RangerResult rangerResult = new RangerResult(0, "");
        if (obj instanceof Status) {
            InterfaceC3228a interfaceC3228a = f13373a[i10];
            if (interfaceC3228a != null && i10 == interfaceC3228a.mo13091b()) {
                rangerResult.setErr(interfaceC3228a.mo13093d(i10, str, (Status) obj, j10));
            }
        } else {
            rangerResult.setErr(22);
        }
        return rangerResult;
    }

    /* renamed from: c */
    private RangerResult m13087c(int i10, String str, String str2, String str3) {
        RangerResult rangerResult = new RangerResult(0, "");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            InterfaceC3228a interfaceC3228a = f13373a[i10];
            if (interfaceC3228a != null && i10 == interfaceC3228a.mo13091b()) {
                rangerResult.setErr(interfaceC3228a.mo13090a(i10, str, str2, str3));
            }
        } else {
            rangerResult.setErr(22);
        }
        return rangerResult;
    }

    /* renamed from: d */
    public static void m13088d(int i10, InterfaceC3228a interfaceC3228a) {
        f13373a[i10] = interfaceC3228a;
    }

    /* renamed from: e */
    private RangerResult m13089e(int i10, String str, String str2, int i11) {
        RangerResult rangerResult = new RangerResult(0, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            InterfaceC3228a interfaceC3228a = f13373a[i10];
            if (interfaceC3228a != null && i10 == interfaceC3228a.mo13091b()) {
                rangerResult.setErr(interfaceC3228a.mo13092c(str, str2, i11));
            }
        } else {
            rangerResult.setErr(22);
        }
        return rangerResult;
    }
}
