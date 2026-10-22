package com.alibaba.sdk.android.httpdns.p045b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.alibaba.sdk.android.httpdns.b.d */
/* loaded from: classes.dex */
class C1530d extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final Object f5883a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1530d(Context context) {
        super(context, "aliclound_httpdns.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private long m7086a(SQLiteDatabase sQLiteDatabase, C1533g c1533g) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_id", Long.valueOf(c1533g.f5891i));
        contentValues.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, c1533g.f5893o);
        contentValues.put("ttl", c1533g.f5894p);
        try {
            return sQLiteDatabase.insert(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, null, contentValues);
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* renamed from: b */
    private long m7091b(SQLiteDatabase sQLiteDatabase, C1533g c1533g) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_id", Long.valueOf(c1533g.f5891i));
        contentValues.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, c1533g.f5893o);
        contentValues.put("ttl", c1533g.f5894p);
        try {
            return sQLiteDatabase.insert("ipv6", null, contentValues);
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* renamed from: c */
    private void m7096c(long j10) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("ipv6", "id = ?", new String[]{String.valueOf(j10)});
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE host (id INTEGER PRIMARY KEY,host TEXT,sp TEXT,time TEXT,extra TEXT,cache_key TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE ip (id INTEGER PRIMARY KEY,host_id INTEGER,ip TEXT,ttl TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE ipv6 (id INTEGER PRIMARY KEY,host_id INTEGER,ip TEXT,ttl TEXT);");
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 != i11) {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS host;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ip;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ipv6;");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                onCreate(sQLiteDatabase);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m7097c(C1531e c1531e) {
        m7089a(c1531e.f5888id);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m7098a(C1531e c1531e) {
        SQLiteDatabase writableDatabase;
        synchronized (f5883a) {
            m7101b(c1531e.f5889m, c1531e.host);
            ContentValues contentValues = new ContentValues();
            SQLiteDatabase sQLiteDatabase = null;
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                writableDatabase.beginTransaction();
                contentValues.put("host", c1531e.host);
                contentValues.put("sp", c1531e.f5889m);
                contentValues.put(AgooConstants.MESSAGE_TIME, C1529c.m7084c(c1531e.f5890n));
                contentValues.put("extra", c1531e.f5884a);
                contentValues.put("cache_key", c1531e.f5886b);
                long insert = writableDatabase.insert("host", null, contentValues);
                c1531e.f5888id = insert;
                ArrayList<C1533g> arrayList = c1531e.f5885a;
                if (arrayList != null) {
                    Iterator<C1533g> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1533g next = it.next();
                        next.f5891i = insert;
                        next.f5892id = m7086a(writableDatabase, next);
                    }
                }
                ArrayList<C1533g> arrayList2 = c1531e.f5887b;
                if (arrayList2 != null) {
                    Iterator<C1533g> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C1533g next2 = it2.next();
                        next2.f5891i = insert;
                        next2.f5892id = m7091b(writableDatabase, next2);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
                return insert;
            } catch (Exception unused2) {
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                return 0L;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C1531e> m7100b() {
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase;
        synchronized (f5883a) {
            arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                sQLiteDatabase = getReadableDatabase();
                try {
                    cursor = sQLiteDatabase.query("host", null, null, null, null, null, null);
                    if (cursor != null && cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        do {
                            C1531e c1531e = new C1531e();
                            c1531e.f5888id = cursor.getInt(cursor.getColumnIndex("id"));
                            c1531e.host = cursor.getString(cursor.getColumnIndex("host"));
                            c1531e.f5889m = cursor.getString(cursor.getColumnIndex("sp"));
                            c1531e.f5890n = C1529c.m7085d(cursor.getString(cursor.getColumnIndex(AgooConstants.MESSAGE_TIME)));
                            c1531e.f5885a = (ArrayList) m7088a(c1531e);
                            c1531e.f5887b = (ArrayList) m7093b(c1531e);
                            c1531e.f5884a = cursor.getString(cursor.getColumnIndex("extra"));
                            c1531e.f5886b = cursor.getString(cursor.getColumnIndex("cache_key"));
                            arrayList.add(c1531e);
                        } while (cursor.moveToNext());
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Exception unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                sQLiteDatabase = null;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
            }
            sQLiteDatabase.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r10 != null) goto L27;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.alibaba.sdk.android.httpdns.p045b.C1533g> m7092b(long r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r10 = r11.getWritableDatabase()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L83
            java.lang.String r3 = "ipv6"
            r4 = 0
            java.lang.String r5 = "host_id=?"
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r13 = 0
            r6[r13] = r12     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            if (r1 == 0) goto L6c
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            if (r12 <= 0) goto L6c
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
        L2c:
            com.alibaba.sdk.android.httpdns.b.g r12 = new com.alibaba.sdk.android.httpdns.b.g     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.<init>()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = "id"
            int r13 = r1.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            int r13 = r1.getInt(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            long r2 = (long) r13     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.f5892id = r2     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = "host_id"
            int r13 = r1.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            int r13 = r1.getInt(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            long r2 = (long) r13     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.f5891i = r2     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = "ip"
            int r13 = r1.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = r1.getString(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.f5893o = r13     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = "ttl"
            int r13 = r1.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = r1.getString(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.f5894p = r13     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r0.add(r12)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            if (r12 != 0) goto L2c
        L6c:
            if (r1 == 0) goto L8c
            r1.close()
            goto L8c
        L72:
            r12 = move-exception
            goto L78
        L74:
            goto L85
        L76:
            r12 = move-exception
            r10 = r1
        L78:
            if (r1 == 0) goto L7d
            r1.close()
        L7d:
            if (r10 == 0) goto L82
            r10.close()
        L82:
            throw r12
        L83:
            r10 = r1
        L85:
            if (r1 == 0) goto L8a
            r1.close()
        L8a:
            if (r10 == 0) goto L8f
        L8c:
            r10.close()
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p045b.C1530d.m7092b(long):java.util.List");
    }

    /* renamed from: a */
    C1531e m7099a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        C1531e c1531e;
        C1531e c1531e2;
        synchronized (f5883a) {
            Cursor cursor = null;
            c1531e2 = null;
            c1531e2 = null;
            r1 = null;
            cursor = null;
            Cursor cursor2 = null;
            try {
                try {
                    sQLiteDatabase = getReadableDatabase();
                    try {
                        Cursor query = sQLiteDatabase.query("host", null, "sp=? AND host=?", new String[]{str, str2}, null, null, null);
                        if (query != null) {
                            try {
                                try {
                                    if (query.getCount() > 0) {
                                        query.moveToFirst();
                                        c1531e = new C1531e();
                                        try {
                                            c1531e.f5888id = query.getInt(query.getColumnIndex("id"));
                                            c1531e.host = query.getString(query.getColumnIndex("host"));
                                            c1531e.f5889m = query.getString(query.getColumnIndex("sp"));
                                            c1531e.f5890n = C1529c.m7085d(query.getString(query.getColumnIndex(AgooConstants.MESSAGE_TIME)));
                                            c1531e.f5885a = (ArrayList) m7088a(c1531e);
                                            c1531e.f5887b = (ArrayList) m7093b(c1531e);
                                            c1531e.f5884a = query.getString(query.getColumnIndex("extra"));
                                            c1531e.f5886b = query.getString(query.getColumnIndex("cache_key"));
                                            c1531e2 = c1531e;
                                        } catch (Exception unused) {
                                            cursor2 = query;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            c1531e2 = c1531e;
                                            return c1531e2;
                                        }
                                    }
                                } catch (Exception unused2) {
                                    c1531e = null;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = query;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                        sQLiteDatabase.close();
                    } catch (Exception unused3) {
                        c1531e = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } finally {
                }
            } catch (Exception unused4) {
                c1531e = null;
                sQLiteDatabase = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = null;
            }
        }
        return c1531e2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r10 != null) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.alibaba.sdk.android.httpdns.p045b.C1533g> m7087a(long r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r10 = r11.getWritableDatabase()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L83
            java.lang.String r3 = "ip"
            r4 = 0
            java.lang.String r5 = "host_id=?"
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r13 = 0
            r6[r13] = r12     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            if (r1 == 0) goto L6c
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            if (r12 <= 0) goto L6c
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
        L2c:
            com.alibaba.sdk.android.httpdns.b.g r12 = new com.alibaba.sdk.android.httpdns.b.g     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.<init>()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = "id"
            int r13 = r1.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            int r13 = r1.getInt(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            long r2 = (long) r13     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.f5892id = r2     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = "host_id"
            int r13 = r1.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            int r13 = r1.getInt(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            long r2 = (long) r13     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.f5891i = r2     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = "ip"
            int r13 = r1.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = r1.getString(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.f5893o = r13     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = "ttl"
            int r13 = r1.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r13 = r1.getString(r13)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r12.f5894p = r13     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r0.add(r12)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            if (r12 != 0) goto L2c
        L6c:
            if (r1 == 0) goto L8c
            r1.close()
            goto L8c
        L72:
            r12 = move-exception
            goto L78
        L74:
            goto L85
        L76:
            r12 = move-exception
            r10 = r1
        L78:
            if (r1 == 0) goto L7d
            r1.close()
        L7d:
            if (r10 == 0) goto L82
            r10.close()
        L82:
            throw r12
        L83:
            r10 = r1
        L85:
            if (r1 == 0) goto L8a
            r1.close()
        L8a:
            if (r10 == 0) goto L8f
        L8c:
            r10.close()
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p045b.C1530d.m7087a(long):java.util.List");
    }

    /* renamed from: b */
    private List<C1533g> m7093b(C1531e c1531e) {
        return m7092b(c1531e.f5888id);
    }

    /* renamed from: a */
    private List<C1533g> m7088a(C1531e c1531e) {
        return m7087a(c1531e.f5888id);
    }

    /* renamed from: b */
    private void m7094b(long j10) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "id = ?", new String[]{String.valueOf(j10)});
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
    }

    /* renamed from: a */
    private void m7089a(long j10) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("host", "id = ?", new String[]{String.valueOf(j10)});
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
    }

    /* renamed from: b */
    private void m7095b(C1533g c1533g) {
        m7096c(c1533g.f5892id);
    }

    /* renamed from: a */
    private void m7090a(C1533g c1533g) {
        m7094b(c1533g.f5892id);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7101b(String str, String str2) {
        synchronized (f5883a) {
            C1531e m7099a = m7099a(str, str2);
            if (m7099a != null) {
                m7097c(m7099a);
                ArrayList<C1533g> arrayList = m7099a.f5885a;
                if (arrayList != null) {
                    Iterator<C1533g> it = arrayList.iterator();
                    while (it.hasNext()) {
                        m7090a(it.next());
                    }
                }
                ArrayList<C1533g> arrayList2 = m7099a.f5887b;
                if (arrayList2 != null) {
                    Iterator<C1533g> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        m7095b(it2.next());
                    }
                }
            }
        }
    }
}
