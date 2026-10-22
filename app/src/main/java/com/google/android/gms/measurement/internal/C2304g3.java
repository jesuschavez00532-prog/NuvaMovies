package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.internal.g3 */
/* loaded from: classes.dex */
public final class C2304g3 extends AbstractC2491x3 {

    /* renamed from: c */
    private final C2293f3 f8609c;

    /* renamed from: d */
    private boolean f8610d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2304g3(C2415q4 c2415q4) {
        super(c2415q4);
        Context mo9584f = this.f8714a.mo9584f();
        this.f8714a.m10051z();
        this.f8609c = new C2293f3(this, mo9584f, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m9536x(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2304g3.m9536x(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2491x3
    /* renamed from: n */
    protected final boolean mo9472n() {
        return false;
    }

    /* renamed from: o */
    final SQLiteDatabase m9537o() {
        if (this.f8610d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f8609c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f8610d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0265  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m9538p(int r24) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2304g3.m9538p(int):java.util.List");
    }

    /* renamed from: q */
    public final void m9539q() {
        int delete;
        mo9428h();
        try {
            SQLiteDatabase m9537o = m9537o();
            if (m9537o != null && (delete = m9537o.delete("messages", null, null)) > 0) {
                this.f8714a.mo9577b().m9804v().m9700b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9700b("Error resetting local analytics data. error", e10);
        }
    }

    /* renamed from: r */
    public final boolean m9540r() {
        return m9536x(3, new byte[0]);
    }

    /* renamed from: s */
    final boolean m9541s() {
        Context mo9584f = this.f8714a.mo9584f();
        this.f8714a.m10051z();
        return mo9584f.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: t */
    public final boolean m9542t() {
        mo9428h();
        if (!this.f8610d && m9541s()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase m9537o = m9537o();
                    if (m9537o == null) {
                        this.f8610d = true;
                        return false;
                    }
                    m9537o.beginTransaction();
                    m9537o.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m9537o.setTransactionSuccessful();
                    m9537o.endTransaction();
                    m9537o.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e10) {
                    this.f8714a.mo9577b().m9800r().m9700b("Error deleting app launch break from local database", e10);
                    this.f8610d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.f8714a.mo9577b().m9800r().m9700b("Error deleting app launch break from local database", e11);
                    this.f8610d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f8714a.mo9577b().m9805w().m9699a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m9543u(C2267d c2267d) {
        byte[] m9936c0 = this.f8714a.m10031N().m9936c0(c2267d);
        if (m9936c0.length > 131072) {
            this.f8714a.mo9577b().m9802t().m9699a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return m9536x(2, m9936c0);
    }

    /* renamed from: v */
    public final boolean m9544v(C2465v c2465v) {
        Parcel obtain = Parcel.obtain();
        C2476w.m10096a(c2465v, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f8714a.mo9577b().m9802t().m9699a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return m9536x(0, marshall);
    }

    /* renamed from: w */
    public final boolean m9545w(C2354k9 c2354k9) {
        Parcel obtain = Parcel.obtain();
        C2365l9.m9786a(c2354k9, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f8714a.mo9577b().m9802t().m9699a("User property too long for local database. Sending directly to service");
            return false;
        }
        return m9536x(1, marshall);
    }
}
