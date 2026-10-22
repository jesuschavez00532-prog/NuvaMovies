package com.efs.sdk.pa.p060a;

import android.os.SystemClock;
import android.util.Printer;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.efs.sdk.pa.a.e */
/* loaded from: classes.dex */
final class C1776e implements Printer {

    /* renamed from: f */
    private long f7463f;

    /* renamed from: b */
    private boolean f7459b = false;

    /* renamed from: c */
    private String f7460c = null;

    /* renamed from: d */
    private long f7461d = -1;

    /* renamed from: e */
    private long f7462e = -1;

    /* renamed from: a */
    Vector<InterfaceC1775d> f7458a = new Vector<>();

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(Operator.Operation.GREATER_THAN)) {
            this.f7461d = SystemClock.elapsedRealtime();
            this.f7462e = SystemClock.currentThreadTimeMillis();
            this.f7460c = str;
            this.f7459b = true;
            Iterator<InterfaceC1775d> it = this.f7458a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.f7459b && str.startsWith(Operator.Operation.LESS_THAN)) {
            this.f7459b = false;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f7461d;
            if (elapsedRealtime > this.f7463f) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f7462e;
                Iterator<InterfaceC1775d> it2 = this.f7458a.iterator();
                while (it2.hasNext()) {
                    it2.next().mo7868a(this.f7460c, elapsedRealtime, currentThreadTimeMillis);
                }
            }
        }
    }
}
