package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2023m4;
import com.google.android.gms.internal.measurement.C2038n4;
import com.google.android.gms.internal.measurement.C2188x4;
import com.google.android.gms.internal.measurement.C2203y4;
import com.google.android.gms.internal.measurement.C2210yb;
import com.lzy.okgo.cookie.SerializableCookie;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3384f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l */
/* loaded from: classes.dex */
public final class C2355l extends AbstractC2485w8 {

    /* renamed from: f */
    private static final String[] f8764f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    private static final String[] f8765g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    private static final String[] f8766h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: i */
    private static final String[] f8767i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    private static final String[] f8768j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    private static final String[] f8769k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    private static final String[] f8770l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    private static final String[] f8771m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C2344k f8772d;

    /* renamed from: e */
    private final C2441s8 f8773e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2355l(C2310g9 c2310g9) {
        super(c2310g9);
        this.f8773e = new C2441s8(this.f8714a.mo9578c());
        this.f8714a.m10051z();
        this.f8772d = new C2344k(this, this.f8714a.mo9584f(), "google_app_measurement.db");
    }

    /* renamed from: H */
    static final void m9742H(ContentValues contentValues, String str, Object obj) {
        AbstractC5391n.m21779e("value");
        AbstractC5391n.m21783i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: I */
    private final long m9743I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m9754P().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.f8714a.mo9577b().m9800r().m9701c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: K */
    private final long m9744K(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = m9754P().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j11 = cursor.getLong(0);
                    cursor.close();
                    return j11;
                }
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f8714a.mo9577b().m9800r().m9701c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x022e: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:559), block:B:109:0x022e */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* renamed from: G */
    public final void m9748G(String str, long j10, long j11, C2288e9 c2288e9) {
        Object r42 = null;
        Cursor cursor;
        String[] strArr;
        Cursor rawQuery;
        String string;
        String str2;
        String[] strArr2;
        String[] strArr3;
        AbstractC5391n.m21783i(c2288e9);
        mo9428h();
        m10099i();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase m9754P = m9754P();
                r42 = TextUtils.isEmpty(null);
                String str4 = "";
                try {
                    if (r42 != 0) {
                        if (j11 != -1) {
                            strArr3 = new String[]{String.valueOf(j11), String.valueOf(j10)};
                        } else {
                            strArr3 = new String[]{String.valueOf(j10)};
                        }
                        if (j11 != -1) {
                            str4 = "rowid <= ? and ";
                        }
                        rawQuery = m9754P.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str4 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str3 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        if (j11 != -1) {
                            strArr = new String[]{null, String.valueOf(j11)};
                        } else {
                            strArr = new String[]{null};
                        }
                        if (j11 != -1) {
                            str4 = " and rowid <= ?";
                        }
                        rawQuery = m9754P.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str4 + " order by rowid limit 1;", strArr);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        String str6 = str5;
                        Cursor query = m9754P.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f8714a.mo9577b().m9800r().m9700b("Raw event metadata record is missing. appId", C2370m3.m9796z(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    C2203y4 c2203y4 = (C2203y4) ((C2188x4) C2343j9.m9669C(C2203y4.m9247K1(), query.getBlob(0))).m9176o();
                                    if (query.moveToNext()) {
                                        this.f8714a.mo9577b().m9805w().m9700b("Get multiple raw event metadata records, expected one. appId", C2370m3.m9796z(str3));
                                    }
                                    query.close();
                                    AbstractC5391n.m21783i(c2203y4);
                                    c2288e9.f8581a = c2203y4;
                                    if (j11 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{str3, str6, String.valueOf(j11)};
                                    } else {
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{str3, str6};
                                    }
                                    Cursor query2 = m9754P.query("raw_events", new String[]{"rowid", SerializableCookie.NAME, "timestamp", "data"}, str2, strArr2, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.f8714a.mo9577b().m9805w().m9700b("Raw event data disappeared while in transaction. appId", C2370m3.m9796z(str3));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j12 = query2.getLong(0);
                                        try {
                                            C2023m4 c2023m4 = (C2023m4) C2343j9.m9669C(C2038n4.m8715B(), query2.getBlob(3));
                                            c2023m4.m8680A(query2.getString(1));
                                            c2023m4.m8684E(query2.getLong(2));
                                            if (!c2288e9.m9534a(j12, (C2038n4) c2023m4.m9176o())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e10) {
                                            this.f8714a.mo9577b().m9800r().m9701c("Data loss. Failed to merge raw event. appId", C2370m3.m9796z(str3), e10);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (IOException e11) {
                                    this.f8714a.mo9577b().m9800r().m9701c("Data loss. Failed to merge raw event metadata. appId", C2370m3.m9796z(str3), e11);
                                    query.close();
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                r42 = str6;
                                this.f8714a.mo9577b().m9800r().m9701c("Data loss. Error selecting raw event. appId", C2370m3.m9796z(str3), e);
                                if (r42 != 0) {
                                    r42.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = str6;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            str6 = query;
                        } catch (Throwable th2) {
                            th = th2;
                            str6 = query;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        r42 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e16) {
            e = e16;
            r42 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: J */
    public final int m9749J(String str, String str2) {
        AbstractC5391n.m21779e(str);
        AbstractC5391n.m21779e(str2);
        mo9428h();
        m10099i();
        try {
            return m9754P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9702d("Error deleting conditional property", C2370m3.m9796z(str), this.f8714a.m10022D().m9643f(str2), e10);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public final long m9750L(String str, String str2) {
        AbstractC5391n.m21779e(str);
        AbstractC5391n.m21779e("first_open_count");
        mo9428h();
        m10099i();
        SQLiteDatabase m9754P = m9754P();
        m9754P.beginTransaction();
        long j10 = 0;
        try {
            try {
                long m9744K = m9744K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (m9744K == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (m9754P.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.f8714a.mo9577b().m9800r().m9701c("Failed to insert column (got -1). appId", C2370m3.m9796z(str), "first_open_count");
                        return -1L;
                    }
                    m9744K = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + m9744K));
                    if (m9754P.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.f8714a.mo9577b().m9800r().m9701c("Failed to update column (got 0). appId", C2370m3.m9796z(str), "first_open_count");
                        return -1L;
                    }
                    m9754P.setTransactionSuccessful();
                    return m9744K;
                } catch (SQLiteException e10) {
                    e = e10;
                    j10 = m9744K;
                    this.f8714a.mo9577b().m9800r().m9702d("Error inserting column. appId", C2370m3.m9796z(str), "first_open_count", e);
                    m9754P.endTransaction();
                    return j10;
                }
            } finally {
                m9754P.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    /* renamed from: M */
    public final long m9751M() {
        return m9744K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: N */
    public final long m9752N() {
        return m9744K("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: O */
    public final long m9753O(String str) {
        AbstractC5391n.m21779e(str);
        return m9744K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final SQLiteDatabase m9754P() {
        mo9428h();
        try {
            return this.f8772d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9805w().m9700b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d5: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:214), block:B:58:0x00d5 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle m9755Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo9428h()
            r7.m10099i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m9754P()     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            java.lang.String r3 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r2 != 0) goto L2e
            com.google.android.gms.measurement.internal.q4 r8 = r7.f8714a     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo9577b()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.k3 r8 = r8.m9804v()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r2 = "Default event parameters not found"
            r8.m9699a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r1.close()
            return r0
        L2e:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.m4 r3 = com.google.android.gms.internal.measurement.C2038n4.m8715B()     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.ca r2 = com.google.android.gms.measurement.internal.C2343j9.m9669C(r3, r2)     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.m4 r2 = (com.google.android.gms.internal.measurement.C2023m4) r2     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.z8 r2 = r2.m9176o()     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.n4 r2 = (com.google.android.gms.internal.measurement.C2038n4) r2     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.g9 r8 = r7.f9168b     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r8.m9586g0()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.util.List r8 = r2.m8729F()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
        L55:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.r4 r3 = (com.google.android.gms.internal.measurement.C2098r4) r3     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r4 = r3.m8891D()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            boolean r5 = r3.m8894Q()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L73
            double r5 = r3.m8899x()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L73:
            boolean r5 = r3.m8895R()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L81
            float r3 = r3.m8900y()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L81:
            boolean r5 = r3.m8898W()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L8f
            java.lang.String r3 = r3.m8892E()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L8f:
            boolean r5 = r3.m8896U()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L55
            long r5 = r3.m8890A()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L9d:
            r1.close()
            return r2
        La1:
            r2 = move-exception
            com.google.android.gms.measurement.internal.q4 r3 = r7.f8714a     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo9577b()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.k3 r3 = r3.m9800r()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2370m3.m9796z(r8)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r3.m9701c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r1.close()
            return r0
        Lb9:
            r8 = move-exception
            goto Lbf
        Lbb:
            r8 = move-exception
            goto Ld6
        Lbd:
            r8 = move-exception
            r1 = r0
        Lbf:
            com.google.android.gms.measurement.internal.q4 r2 = r7.f8714a     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo9577b()     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.k3 r2 = r2.m9800r()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = "Error selecting default event parameters"
            r2.m9700b(r3, r8)     // Catch: java.lang.Throwable -> Ld4
            if (r1 == 0) goto Ld3
            r1.close()
        Ld3:
            return r0
        Ld4:
            r8 = move-exception
            r0 = r1
        Ld6:
            if (r0 == 0) goto Ldb
            r0.close()
        Ldb:
            goto Ldd
        Ldc:
            throw r8
        Ldd:
            goto Ldc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9755Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fb A[Catch: SQLiteException -> 0x0247, all -> 0x026c, TryCatch #0 {SQLiteException -> 0x0247, blocks: (B:13:0x00f4, B:15:0x014b, B:19:0x0155, B:22:0x019f, B:24:0x01ce, B:26:0x01d5, B:29:0x01f0, B:31:0x01fb, B:32:0x020d, B:34:0x021e, B:35:0x0227, B:37:0x0230, B:41:0x01ec, B:43:0x019a), top: B:12:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021e A[Catch: SQLiteException -> 0x0247, all -> 0x026c, TryCatch #0 {SQLiteException -> 0x0247, blocks: (B:13:0x00f4, B:15:0x014b, B:19:0x0155, B:22:0x019f, B:24:0x01ce, B:26:0x01d5, B:29:0x01f0, B:31:0x01fb, B:32:0x020d, B:34:0x021e, B:35:0x0227, B:37:0x0230, B:41:0x01ec, B:43:0x019a), top: B:12:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0230 A[Catch: SQLiteException -> 0x0247, all -> 0x026c, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0247, blocks: (B:13:0x00f4, B:15:0x014b, B:19:0x0155, B:22:0x019f, B:24:0x01ce, B:26:0x01d5, B:29:0x01f0, B:31:0x01fb, B:32:0x020d, B:34:0x021e, B:35:0x0227, B:37:0x0230, B:41:0x01ec, B:43:0x019a), top: B:12:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ec A[Catch: SQLiteException -> 0x0247, all -> 0x026c, TryCatch #0 {SQLiteException -> 0x0247, blocks: (B:13:0x00f4, B:15:0x014b, B:19:0x0155, B:22:0x019f, B:24:0x01ce, B:26:0x01d5, B:29:0x01f0, B:31:0x01fb, B:32:0x020d, B:34:0x021e, B:35:0x0227, B:37:0x0230, B:41:0x01ec, B:43:0x019a), top: B:12:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019a A[Catch: SQLiteException -> 0x0247, all -> 0x026c, TryCatch #0 {SQLiteException -> 0x0247, blocks: (B:13:0x00f4, B:15:0x014b, B:19:0x0155, B:22:0x019f, B:24:0x01ce, B:26:0x01d5, B:29:0x01f0, B:31:0x01fb, B:32:0x020d, B:34:0x021e, B:35:0x0227, B:37:0x0230, B:41:0x01ec, B:43:0x019a), top: B:12:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0270  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C2372m5 m9756R(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9756R(java.lang.String):com.google.android.gms.measurement.internal.m5");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0153: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:340), block:B:30:0x0153 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C2267d m9757S(java.lang.String r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9757S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    /* renamed from: T */
    public final C2333j m9758T(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m9759U(j10, str, 1L, false, false, z12, false, z14);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C2333j m9759U(long r24, java.lang.String r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9759U(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.j");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C2421r m9760V(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9760V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a1: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:162), block:B:27:0x00a1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C2376m9 m9761X(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            r1 = r14
            p219l4.AbstractC5391n.m21779e(r15)
            p219l4.AbstractC5391n.m21779e(r16)
            r14.mo9428h()
            r14.m10099i()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r14.m9754P()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "set_timestamp"
            r11 = 0
            r5[r11] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "value"
            r12 = 1
            r5[r12] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "origin"
            r13 = 2
            r5[r13] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String[] r7 = new java.lang.String[]{r15, r16}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r4 = "user_attributes"
            java.lang.String r6 = "app_id=? and name=?"
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r0 != 0) goto L3d
            r3.close()
            return r2
        L3d:
            long r8 = r3.getLong(r11)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            java.lang.Object r10 = r14.m9762Y(r3, r12)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r10 != 0) goto L4b
            r3.close()
            return r2
        L4b:
            java.lang.String r6 = r3.getString(r13)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.m9 r0 = new com.google.android.gms.measurement.internal.m9     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            r4 = r0
            r5 = r15
            r7 = r16
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            boolean r4 = r3.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r4 == 0) goto L71
            com.google.android.gms.measurement.internal.q4 r4 = r1.f8714a     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9800r()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            java.lang.String r5 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2370m3.m9796z(r15)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            r4.m9700b(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
        L71:
            r3.close()
            return r0
        L75:
            r0 = move-exception
            goto L7b
        L77:
            r0 = move-exception
            goto La2
        L79:
            r0 = move-exception
            r3 = r2
        L7b:
            com.google.android.gms.measurement.internal.q4 r4 = r1.f8714a     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9800r()     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "Error querying user property. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2370m3.m9796z(r15)     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.q4 r7 = r1.f8714a     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.h3 r7 = r7.m10022D()     // Catch: java.lang.Throwable -> La0
            r8 = r16
            java.lang.String r7 = r7.m9643f(r8)     // Catch: java.lang.Throwable -> La0
            r4.m9702d(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            return r2
        La0:
            r0 = move-exception
            r2 = r3
        La2:
            if (r2 == 0) goto La7
            r2.close()
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9761X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.m9");
    }

    /* renamed from: Y */
    final Object m9762Y(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.f8714a.mo9577b().m9800r().m9700b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.f8714a.mo9577b().m9800r().m9699a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i10);
                }
                return Double.valueOf(cursor.getDouble(i10));
            }
            return Long.valueOf(cursor.getLong(i10));
        }
        this.f8714a.mo9577b().m9800r().m9699a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m9763Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m9754P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.q4 r3 = r6.f8714a     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo9577b()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.k3 r3 = r3.m9800r()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m9700b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9763Z():java.lang.String");
    }

    /* renamed from: a0 */
    public final List m9764a0(String str, String str2, String str3) {
        AbstractC5391n.m21779e(str);
        mo9428h();
        m10099i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Operator.Operation.MULTIPLY));
            sb2.append(" and name glob ?");
        }
        return m9765b0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        r3 = r41.f8714a.mo9577b().m9800r();
        r41.f8714a.m10051z();
        r3.m9700b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m9765b0(java.lang.String r42, java.lang.String[] r43) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9765b0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: c0 */
    public final List m9766c0(String str) {
        AbstractC5391n.m21779e(str);
        mo9428h();
        m10099i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m9754P = m9754P();
                String[] strArr = {SerializableCookie.NAME, "origin", "set_timestamp", "value"};
                this.f8714a.m10051z();
                cursor = m9754P.query("user_attributes", strArr, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object m9762Y = m9762Y(cursor, 3);
                    if (m9762Y == null) {
                        this.f8714a.mo9577b().m9800r().m9700b("Read invalid user property value, ignoring it. appId", C2370m3.m9796z(str));
                    } else {
                        arrayList.add(new C2376m9(str, str2, string, j10, m9762Y));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.f8714a.mo9577b().m9800r().m9701c("Error querying user properties. appId", C2370m3.m9796z(str), e10);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        r0 = r20.f8714a.mo9577b().m9800r();
        r20.f8714a.m10051z();
        r0.m9700b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m9767d0(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9767d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: e0 */
    public final void m9768e0() {
        m10099i();
        m9754P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void m9769f0() {
        m10099i();
        m9754P().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final void m9770g0(List list) {
        mo9428h();
        m10099i();
        AbstractC5391n.m21783i(list);
        AbstractC5391n.m21785k(list.size());
        if (!m9780u()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (m9743I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            this.f8714a.mo9577b().m9805w().m9699a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            m9754P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9700b("Error incrementing retry count. error", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final void m9771h0() {
        mo9428h();
        m10099i();
        if (m9780u()) {
            long m10097a = this.f9168b.m9583e0().f8545e.m10097a();
            long mo24748b = this.f8714a.mo9578c().mo24748b();
            long abs = Math.abs(mo24748b - m10097a);
            this.f8714a.m10051z();
            if (abs > ((Long) AbstractC2260c3.f8496z.m9456a(null)).longValue()) {
                this.f9168b.m9583e0().f8545e.m10098b(mo24748b);
                mo9428h();
                m10099i();
                if (m9780u()) {
                    SQLiteDatabase m9754P = m9754P();
                    String valueOf = String.valueOf(this.f8714a.mo9578c().mo24747a());
                    this.f8714a.m10051z();
                    int delete = m9754P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(C2311h.m9611i())});
                    if (delete > 0) {
                        this.f8714a.mo9577b().m9804v().m9700b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485w8
    /* renamed from: l */
    protected final boolean mo9454l() {
        return false;
    }

    /* renamed from: m */
    public final void m9772m(String str, String str2) {
        AbstractC5391n.m21779e(str);
        AbstractC5391n.m21779e(str2);
        mo9428h();
        m10099i();
        try {
            m9754P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9702d("Error deleting user property. appId", C2370m3.m9796z(str), this.f8714a.m10022D().m9643f(str2), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0262, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0246, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
    
        r0 = r24.f8714a.mo9577b().m9805w();
        r8 = com.google.android.gms.measurement.internal.C2370m3.m9796z(r25);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0204, code lost:
    
        if (r11.m8215L() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0206, code lost:
    
        r20 = java.lang.Integer.valueOf(r11.m8218y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0213, code lost:
    
        r0.m9702d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r20));
        r22 = r4;
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a8, code lost:
    
        r22 = r4;
        r4 = r25;
        r0 = r0.m8124E().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b8, code lost:
    
        if (r0.hasNext() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02ba, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.C2022m3) r0.next();
        m10099i();
        mo9428h();
        p219l4.AbstractC5391n.m21779e(r25);
        p219l4.AbstractC5391n.m21783i(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02d4, code lost:
    
        if (r3.m8672B().isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0303, code lost:
    
        r10 = r3.m8704j();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r4);
        r11.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x031a, code lost:
    
        if (r3.m8676G() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x031c, code lost:
    
        r14 = java.lang.Integer.valueOf(r3.m8678x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0326, code lost:
    
        r11.put("filter_id", r14);
        r23 = r0;
        r11.put("property_name", r3.m8672B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0338, code lost:
    
        if (r3.m8677H() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x033a, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.m8675F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0344, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0358, code lost:
    
        if (m9754P().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x036e, code lost:
    
        r0 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x035a, code lost:
    
        r24.f8714a.mo9577b().m9800r().m9700b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C2370m3.m9796z(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0372, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0373, code lost:
    
        r24.f8714a.mo9577b().m9800r().m9701c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C2370m3.m9796z(r25), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0343, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0325, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d6, code lost:
    
        r0 = r24.f8714a.mo9577b().m9805w();
        r8 = com.google.android.gms.measurement.internal.C2370m3.m9796z(r25);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ee, code lost:
    
        if (r3.m8676G() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02f0, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.m8678x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02fa, code lost:
    
        r0.m9702d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03bd, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0185, code lost:
    
        r10 = r0.m8124E().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0191, code lost:
    
        if (r10.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019d, code lost:
    
        if (((com.google.android.gms.internal.measurement.C2022m3) r10.next()).m8676G() != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        r24.f8714a.mo9577b().m9805w().m9701c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C2370m3.m9796z(r25), java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b8, code lost:
    
        r10 = r0.m8123D().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ce, code lost:
    
        if (r10.hasNext() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d0, code lost:
    
        r11 = (com.google.android.gms.internal.measurement.C1884d3) r10.next();
        m10099i();
        mo9428h();
        p219l4.AbstractC5391n.m21779e(r25);
        p219l4.AbstractC5391n.m21783i(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ea, code lost:
    
        if (r11.m8209D().isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0220, code lost:
    
        r14 = r11.m8704j();
        r3 = new android.content.ContentValues();
        r22 = r4;
        r4 = r25;
        r3.put("app_id", r4);
        r3.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023b, code lost:
    
        if (r11.m8215L() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023d, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.m8218y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0247, code lost:
    
        r3.put("filter_id", r8);
        r3.put("event_name", r11.m8209D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0257, code lost:
    
        if (r11.m8216M() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0259, code lost:
    
        r8 = java.lang.Boolean.valueOf(r11.m8213J());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0263, code lost:
    
        r3.put("session_scoped", r8);
        r3.put("data", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0277, code lost:
    
        if (m9754P().insertWithOnConflict("event_filters", null, r3, 5) != (-1)) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0279, code lost:
    
        r24.f8714a.mo9577b().m9800r().m9700b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C2370m3.m9796z(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x028c, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0292, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0293, code lost:
    
        r24.f8714a.mo9577b().m9800r().m9701c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C2370m3.m9796z(r25), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0386, code lost:
    
        m10099i();
        mo9428h();
        p219l4.AbstractC5391n.m21779e(r25);
        r0 = m9754P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r4, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r3, new java.lang.String[]{r4, java.lang.String.valueOf(r9)});
        r17 = r3;
        r4 = r22;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9773n(java.lang.String r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2355l.m9773n(java.lang.String, java.util.List):void");
    }

    /* renamed from: o */
    public final void m9774o() {
        m10099i();
        m9754P().setTransactionSuccessful();
    }

    /* renamed from: p */
    public final void m9775p(C2372m5 c2372m5) {
        AbstractC5391n.m21783i(c2372m5);
        mo9428h();
        m10099i();
        String m9841d0 = c2372m5.m9841d0();
        AbstractC5391n.m21783i(m9841d0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m9841d0);
        contentValues.put("app_instance_id", c2372m5.m9843e0());
        contentValues.put("gmp_app_id", c2372m5.m9851i0());
        contentValues.put("resettable_device_id_hash", c2372m5.m9834a());
        contentValues.put("last_bundle_index", Long.valueOf(c2372m5.m9832Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c2372m5.m9833Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c2372m5.m9831X()));
        contentValues.put("app_version", c2372m5.m9847g0());
        contentValues.put("app_store", c2372m5.m9845f0());
        contentValues.put("gmp_version", Long.valueOf(c2372m5.m9830W()));
        contentValues.put("dev_cert_hash", Long.valueOf(c2372m5.m9827T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c2372m5.m9817J()));
        contentValues.put("day", Long.valueOf(c2372m5.m9826S()));
        contentValues.put("daily_public_events_count", Long.valueOf(c2372m5.m9824Q()));
        contentValues.put("daily_events_count", Long.valueOf(c2372m5.m9823P()));
        contentValues.put("daily_conversions_count", Long.valueOf(c2372m5.m9821N()));
        contentValues.put("config_fetched_time", Long.valueOf(c2372m5.m9820M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c2372m5.m9829V()));
        contentValues.put("app_version_int", Long.valueOf(c2372m5.m9819L()));
        contentValues.put("firebase_instance_id", c2372m5.m9849h0());
        contentValues.put("daily_error_events_count", Long.valueOf(c2372m5.m9822O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c2372m5.m9825R()));
        contentValues.put("health_monitor_sample", c2372m5.m9853j0());
        c2372m5.m9808A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c2372m5.m9816I()));
        contentValues.put("admob_app_id", c2372m5.m9837b0());
        contentValues.put("dynamite_version", Long.valueOf(c2372m5.m9828U()));
        contentValues.put("session_stitching_token", c2372m5.m9836b());
        List m9838c = c2372m5.m9838c();
        if (m9838c != null) {
            if (m9838c.isEmpty()) {
                this.f8714a.mo9577b().m9805w().m9700b("Safelisted events should not be an empty list. appId", m9841d0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m9838c));
            }
        }
        C2210yb.m9363c();
        if (this.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8467k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase m9754P = m9754P();
            if (m9754P.update("apps", contentValues, "app_id = ?", new String[]{m9841d0}) == 0 && m9754P.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f8714a.mo9577b().m9800r().m9700b("Failed to insert/update app (got -1). appId", C2370m3.m9796z(m9841d0));
            }
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9701c("Error storing app. appId", C2370m3.m9796z(m9841d0), e10);
        }
    }

    /* renamed from: q */
    public final void m9776q(C2421r c2421r) {
        Long l10;
        AbstractC5391n.m21783i(c2421r);
        mo9428h();
        m10099i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2421r.f9014a);
        contentValues.put(SerializableCookie.NAME, c2421r.f9015b);
        contentValues.put("lifetime_count", Long.valueOf(c2421r.f9016c));
        contentValues.put("current_bundle_count", Long.valueOf(c2421r.f9017d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c2421r.f9019f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c2421r.f9020g));
        contentValues.put("last_bundled_day", c2421r.f9021h);
        contentValues.put("last_sampled_complex_event_id", c2421r.f9022i);
        contentValues.put("last_sampling_rate", c2421r.f9023j);
        contentValues.put("current_session_count", Long.valueOf(c2421r.f9018e));
        Boolean bool = c2421r.f9024k;
        if (bool != null && bool.booleanValue()) {
            l10 = 1L;
        } else {
            l10 = null;
        }
        contentValues.put("last_exempt_from_sampling", l10);
        try {
            if (m9754P().insertWithOnConflict(C3384f.f14604ax, null, contentValues, 5) == -1) {
                this.f8714a.mo9577b().m9800r().m9700b("Failed to insert/update event aggregates (got -1). appId", C2370m3.m9796z(c2421r.f9014a));
            }
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9701c("Error storing event aggregates. appId", C2370m3.m9796z(c2421r.f9014a), e10);
        }
    }

    /* renamed from: r */
    public final boolean m9777r() {
        if (m9743I("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m9778s() {
        if (m9743I("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m9779t() {
        if (m9743I("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    protected final boolean m9780u() {
        Context mo9584f = this.f8714a.mo9584f();
        this.f8714a.m10051z();
        return mo9584f.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean m9781v(String str, Long l10, long j10, C2038n4 c2038n4) {
        mo9428h();
        m10099i();
        AbstractC5391n.m21783i(c2038n4);
        AbstractC5391n.m21779e(str);
        AbstractC5391n.m21783i(l10);
        byte[] m8704j = c2038n4.m8704j();
        this.f8714a.mo9577b().m9804v().m9701c("Saving complex main event, appId, data size", this.f8714a.m10022D().m9641d(str), Integer.valueOf(m8704j.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", m8704j);
        try {
            if (m9754P().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f8714a.mo9577b().m9800r().m9700b("Failed to insert complex main event (got -1). appId", C2370m3.m9796z(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9701c("Error storing complex main event. appId", C2370m3.m9796z(str), e10);
            return false;
        }
    }

    /* renamed from: w */
    public final boolean m9782w(C2267d c2267d) {
        AbstractC5391n.m21783i(c2267d);
        mo9428h();
        m10099i();
        String str = c2267d.f8521a;
        AbstractC5391n.m21783i(str);
        if (m9761X(str, c2267d.f8523c.f8758b) == null) {
            long m9743I = m9743I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f8714a.m10051z();
            if (m9743I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c2267d.f8522b);
        contentValues.put(SerializableCookie.NAME, c2267d.f8523c.f8758b);
        m9742H(contentValues, "value", AbstractC5391n.m21783i(c2267d.f8523c.m9735g()));
        contentValues.put("active", Boolean.valueOf(c2267d.f8525e));
        contentValues.put("trigger_event_name", c2267d.f8526f);
        contentValues.put("trigger_timeout", Long.valueOf(c2267d.f8528h));
        contentValues.put("timed_out_event", this.f8714a.m10031N().m9936c0(c2267d.f8527g));
        contentValues.put("creation_timestamp", Long.valueOf(c2267d.f8524d));
        contentValues.put("triggered_event", this.f8714a.m10031N().m9936c0(c2267d.f8529i));
        contentValues.put("triggered_timestamp", Long.valueOf(c2267d.f8523c.f8759c));
        contentValues.put("time_to_live", Long.valueOf(c2267d.f8530j));
        contentValues.put("expired_event", this.f8714a.m10031N().m9936c0(c2267d.f8531k));
        try {
            if (m9754P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f8714a.mo9577b().m9800r().m9700b("Failed to insert/update conditional user property (got -1)", C2370m3.m9796z(str));
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9701c("Error storing conditional user property", C2370m3.m9796z(str), e10);
            return true;
        }
    }

    /* renamed from: x */
    public final boolean m9783x(C2376m9 c2376m9) {
        AbstractC5391n.m21783i(c2376m9);
        mo9428h();
        m10099i();
        if (m9761X(c2376m9.f8843a, c2376m9.f8845c) == null) {
            if (C2398o9.m9899X(c2376m9.f8845c)) {
                if (m9743I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c2376m9.f8843a}) >= this.f8714a.m10051z().m9626p(c2376m9.f8843a, AbstractC2260c3.f8427H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c2376m9.f8845c)) {
                long m9743I = m9743I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c2376m9.f8843a, c2376m9.f8844b});
                this.f8714a.m10051z();
                if (m9743I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2376m9.f8843a);
        contentValues.put("origin", c2376m9.f8844b);
        contentValues.put(SerializableCookie.NAME, c2376m9.f8845c);
        contentValues.put("set_timestamp", Long.valueOf(c2376m9.f8846d));
        m9742H(contentValues, "value", c2376m9.f8847e);
        try {
            if (m9754P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f8714a.mo9577b().m9800r().m9700b("Failed to insert/update user property (got -1). appId", C2370m3.m9796z(c2376m9.f8843a));
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            this.f8714a.mo9577b().m9800r().m9701c("Error storing user property. appId", C2370m3.m9796z(c2376m9.f8843a), e10);
            return true;
        }
    }
}
