package com.taobao.accs.p072b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.C3197j;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.taobao.accs.b.a */
/* loaded from: classes.dex */
public class C3119a extends SQLiteOpenHelper {

    /* renamed from: c */
    private static volatile C3119a f12835c;

    /* renamed from: e */
    private static final Lock f12836e = new ReentrantLock();

    /* renamed from: a */
    public int f12837a;

    /* renamed from: b */
    LinkedList<a> f12838b;

    /* renamed from: d */
    private Context f12839d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.taobao.accs.b.a$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        String f12840a;

        /* renamed from: b */
        Object[] f12841b;

        private a(String str, Object[] objArr) {
            this.f12840a = str;
            this.f12841b = objArr;
        }
    }

    private C3119a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, cursorFactory, i10);
        this.f12837a = 0;
        this.f12838b = new LinkedList<>();
        this.f12839d = context;
    }

    /* renamed from: a */
    public static C3119a m12706a(Context context) {
        if (f12835c == null) {
            synchronized (C3119a.class) {
                if (f12835c == null) {
                    f12835c = new C3119a(context, Constants.DB_NAME, null, 3);
                }
            }
        }
        return f12835c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        if (!C3197j.m13006a(super.getWritableDatabase().getPath(), 102400)) {
            return null;
        }
        return super.getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            Lock lock = f12836e;
            if (lock.tryLock()) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS traffic(_id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT, host TEXT,serviceid TEXT, bid TEXT, isbackground TEXT, size TEXT)");
            }
            lock.unlock();
        } catch (Throwable th) {
            f12836e.unlock();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < i11) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS service");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ping");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS msg");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ack");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS election");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindApp");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindUser");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS traffic");
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public void m12711a(String str, String str2, String str3, boolean z10, long j10, String str4) {
        if (m12708a(str, str3, z10, str4)) {
            m12707a("UPDATE traffic SET size=? WHERE date=? AND host=? AND bid=? AND isbackground=?", new Object[]{Long.valueOf(j10), str4, str, str3, String.valueOf(z10)}, true);
        } else {
            m12707a("INSERT INTO traffic VALUES(null,?,?,?,?,?,?)", new Object[]{str4, str, str2, str3, String.valueOf(z10), Long.valueOf(j10)}, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r2 == null) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean m12708a(java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18) {
        /*
            r14 = this;
            monitor-enter(r14)
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r14.getWritableDatabase()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            if (r3 != 0) goto Lb
            monitor-exit(r14)
            return r1
        Lb:
            java.lang.String r4 = "traffic"
            r0 = 7
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r0 = "_id"
            r5[r1] = r0     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r0 = "date"
            r12 = 1
            r5[r12] = r0     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r0 = "host"
            r6 = 2
            r5[r6] = r0     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r0 = "serviceid"
            r7 = 3
            r5[r7] = r0     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r0 = "bid"
            r8 = 4
            r5[r8] = r0     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r0 = "isbackground"
            r9 = 5
            r5[r9] = r0     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r0 = "size"
            r9 = 6
            r5[r9] = r0     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r0 = "date=? AND host=? AND bid=? AND isbackground=?"
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r8[r1] = r18     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r8[r12] = r15     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r8[r6] = r16     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r6 = java.lang.String.valueOf(r17)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r8[r7] = r6     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = 100
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r6 = r0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            if (r2 == 0) goto L62
            int r0 = r2.getCount()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            if (r0 <= 0) goto L62
            r2.close()     // Catch: java.lang.Throwable -> L81
            monitor-exit(r14)
            return r12
        L62:
            if (r2 == 0) goto L79
        L64:
            r2.close()     // Catch: java.lang.Throwable -> L81
            goto L79
        L68:
            r0 = move-exception
            goto L7b
        L6a:
            r0 = move-exception
            java.lang.String r3 = "DBHelper"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L68
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L68
            com.taobao.accs.utl.ALog.m12944w(r3, r0, r4)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L79
            goto L64
        L79:
            monitor-exit(r14)
            return r1
        L7b:
            if (r2 == 0) goto L80
            r2.close()     // Catch: java.lang.Throwable -> L81
        L80:
            throw r0     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            monitor-exit(r14)
            goto L85
        L84:
            throw r0
        L85:
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p072b.C3119a.m12708a(java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    /* renamed from: a */
    public void m12710a() {
        m12707a("DELETE FROM traffic", null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (r4.moveToFirst() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        r6 = r4.getString(r2);
        r10 = r4.getString(r13);
        r8 = r4.getString(r14);
        r7 = r4.getString(4);
        r9 = java.lang.Boolean.valueOf(r4.getString(5)).booleanValue();
        r16 = r4.getLong(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        if (r7 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (r16 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        r1.add(new com.taobao.accs.p073ut.monitor.TrafficsMonitor.C3187a(r6, r7, r8, r9, r10, r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        if (r4.moveToNext() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f2, code lost:
    
        r4.close();
        r2 = r2;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.taobao.accs.p073ut.monitor.TrafficsMonitor.C3187a> m12709a(boolean r21) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p072b.C3119a.m12709a(boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        com.taobao.accs.utl.ALog.m12938d("DBHelper", "db is full!", new java.lang.Object[0]);
        onUpgrade(r5, 0, 1);
        r4.f12837a = 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m12707a(java.lang.String r5, java.lang.Object[] r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.LinkedList<com.taobao.accs.b.a$a> r1 = r4.f12838b     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            com.taobao.accs.b.a$a r2 = new com.taobao.accs.b.a$a     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r3 = 0
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r1.add(r2)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.util.LinkedList<com.taobao.accs.b.a$a> r5 = r4.f12838b     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r6 = 5
            if (r5 > r6) goto L18
            if (r7 == 0) goto L78
        L18:
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r5 != 0) goto L20
            monitor-exit(r4)
            return
        L20:
            java.util.LinkedList<com.taobao.accs.b.a$a> r6 = r4.f12838b     // Catch: java.lang.Throwable -> L65
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L65
            if (r6 <= 0) goto L61
            java.util.LinkedList<com.taobao.accs.b.a$a> r6 = r4.f12838b     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.removeFirst()     // Catch: java.lang.Throwable -> L65
            com.taobao.accs.b.a$a r6 = (com.taobao.accs.p072b.C3119a.a) r6     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r7 = r6.f12841b     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L3a
            java.lang.String r1 = r6.f12840a     // Catch: java.lang.Throwable -> L65
            r5.execSQL(r1, r7)     // Catch: java.lang.Throwable -> L65
            goto L3f
        L3a:
            java.lang.String r7 = r6.f12840a     // Catch: java.lang.Throwable -> L65
            r5.execSQL(r7)     // Catch: java.lang.Throwable -> L65
        L3f:
            java.lang.String r6 = r6.f12840a     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "INSERT"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L20
            int r6 = r4.f12837a     // Catch: java.lang.Throwable -> L65
            r7 = 1
            int r6 = r6 + r7
            r4.f12837a = r6     // Catch: java.lang.Throwable -> L65
            r1 = 4000(0xfa0, float:5.605E-42)
            if (r6 <= r1) goto L20
            java.lang.String r6 = "DBHelper"
            java.lang.String r1 = "db is full!"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L65
            com.taobao.accs.utl.ALog.m12938d(r6, r1, r2)     // Catch: java.lang.Throwable -> L65
            r4.onUpgrade(r5, r0, r7)     // Catch: java.lang.Throwable -> L65
            r4.f12837a = r0     // Catch: java.lang.Throwable -> L65
        L61:
            r5.close()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            goto L78
        L65:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            throw r6     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
        L6a:
            r5 = move-exception
            goto L7a
        L6c:
            r5 = move-exception
            java.lang.String r6 = "DBHelper"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6a
            com.taobao.accs.utl.ALog.m12938d(r6, r5, r7)     // Catch: java.lang.Throwable -> L6a
        L78:
            monitor-exit(r4)
            return
        L7a:
            monitor-exit(r4)
            goto L7d
        L7c:
            throw r5
        L7d:
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p072b.C3119a.m12707a(java.lang.String, java.lang.Object[], boolean):void");
    }
}
