package p125f3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.download.R$string;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.utils.OkLogger;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import p400xa.C7586l1;
import p400xa.C7589m1;
import p415y9.AbstractApplicationC7689d;

/* renamed from: f3.a */
/* loaded from: classes.dex */
public abstract class AbstractC4222a {

    /* renamed from: e */
    protected static String f18498e;

    /* renamed from: a */
    protected Lock f18499a;

    /* renamed from: b */
    protected SQLiteOpenHelper f18500b;

    /* renamed from: c */
    protected SQLiteDatabase f18501c;

    /* renamed from: d */
    private boolean f18502d;

    /* renamed from: f3.a$a */
    /* loaded from: classes.dex */
    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) {
            C7586l1 c7586l1 = C7586l1.f27877a;
            Context context = AbstractApplicationC7689d.f28136e;
            c7586l1.m29115e(context, context.getString(R$string.download_storage_insufficient), 1, 17);
            C7589m1.f27886a.m29140i(str);
        }
    }

    /* renamed from: f3.a$b */
    /* loaded from: classes.dex */
    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
        }
    }

    public AbstractC4222a(SQLiteOpenHelper sQLiteOpenHelper) {
        f18498e = getClass().getSimpleName();
        this.f18499a = C4223b.f18506f;
        this.f18500b = sQLiteOpenHelper;
        try {
            this.f18501c = m17656g();
            this.f18502d = true;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f18502d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m17650a() {
        SQLiteDatabase sQLiteDatabase = this.f18501c;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f18501c.close();
            this.f18500b.close();
        }
        this.f18501c = null;
    }

    /* renamed from: b */
    protected final void m17651b(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            sQLiteDatabase.close();
        }
    }

    /* renamed from: c */
    public boolean m17652c(String str, String[] strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f18499a.lock();
        try {
            try {
                this.f18501c.beginTransaction();
                this.f18501c.delete(mo17654e(), str, strArr);
                this.f18501c.setTransactionSuccessful();
                try {
                    this.f18501c.endTransaction();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f18499a.unlock();
                OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " delete");
                return true;
            } catch (Exception e11) {
                OkLogger.printStackTrace(e11);
                try {
                    this.f18501c.endTransaction();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                this.f18499a.unlock();
                OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " delete");
                return false;
            }
        } catch (Throwable th) {
            try {
                this.f18501c.endTransaction();
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            this.f18499a.unlock();
            OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " delete");
            throw th;
        }
    }

    /* renamed from: d */
    public abstract ContentValues mo17653d(Object obj);

    /* renamed from: e */
    public abstract String mo17654e();

    /* renamed from: f */
    public boolean m17655f() {
        return this.f18502d;
    }

    /* renamed from: g */
    public SQLiteDatabase m17656g() {
        return this.f18500b.getWritableDatabase();
    }

    /* renamed from: h */
    public abstract Object mo17657h(Cursor cursor);

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List m17658i(java.lang.String[] r17, java.lang.String r18, java.lang.String[] r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = " query"
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.locks.Lock r0 = r1.f18499a
            r0.lock()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            android.database.sqlite.SQLiteDatabase r0 = r1.f18501c     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            android.database.sqlite.SQLiteDatabase r7 = r1.f18501c     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            java.lang.String r8 = r16.mo17654e()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
        L30:
            boolean r0 = r7.isClosed()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> La0
            if (r0 != 0) goto L44
            boolean r0 = r7.moveToNext()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> La0
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.mo17657h(r7)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> La0
            r5.add(r0)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> La0
            goto L30
        L44:
            android.database.sqlite.SQLiteDatabase r0 = r1.f18501c     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> La0
            r0.setTransactionSuccessful()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> La0
            r1.m17651b(r6, r7)
            android.database.sqlite.SQLiteDatabase r0 = r1.f18501c
            if (r0 == 0) goto L59
            r0.endTransaction()     // Catch: java.lang.Exception -> L54
            goto L59
        L54:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()
        L59:
            java.util.concurrent.locks.Lock r0 = r1.f18499a
            r0.unlock()
            java.lang.String r0 = p125f3.AbstractC4222a.f18498e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            goto L8d
        L66:
            r0 = move-exception
            goto L6e
        L68:
            r0 = move-exception
            r5 = r0
            r7 = r6
            goto La2
        L6c:
            r0 = move-exception
            r7 = r6
        L6e:
            com.lzy.okgo.utils.OkLogger.printStackTrace(r0)     // Catch: java.lang.Throwable -> La0
            r1.m17651b(r6, r7)
            android.database.sqlite.SQLiteDatabase r0 = r1.f18501c
            if (r0 == 0) goto L81
            r0.endTransaction()     // Catch: java.lang.Exception -> L7c
            goto L81
        L7c:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()
        L81:
            java.util.concurrent.locks.Lock r0 = r1.f18499a
            r0.unlock()
            java.lang.String r0 = p125f3.AbstractC4222a.f18498e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L8d:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.lzy.okgo.utils.OkLogger.m11765v(r0, r2)
            return r5
        La0:
            r0 = move-exception
            r5 = r0
        La2:
            r1.m17651b(r6, r7)
            android.database.sqlite.SQLiteDatabase r0 = r1.f18501c
            if (r0 == 0) goto Lb2
            r0.endTransaction()     // Catch: java.lang.Exception -> Lad
            goto Lb2
        Lad:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()
        Lb2:
            java.util.concurrent.locks.Lock r0 = r1.f18499a
            r0.unlock()
            java.lang.String r0 = p125f3.AbstractC4222a.f18498e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.lzy.okgo.utils.OkLogger.m11765v(r0, r2)
            goto Ld2
        Ld1:
            throw r5
        Ld2:
            goto Ld1
        */
        throw new UnsupportedOperationException("Method not decompiled: p125f3.AbstractC4222a.m17658i(java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: j */
    public Object m17659j(String str, String[] strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        List m17658i = m17658i(null, str, strArr, null, null, null, "1");
        OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " queryOne");
        if (m17658i.size() > 0) {
            return m17658i.get(0);
        }
        return null;
    }

    /* renamed from: k */
    public boolean m17660k(Object obj) {
        String str = "empty exception msg";
        if (obj == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f18499a.lock();
        try {
            try {
                this.f18501c.beginTransaction();
                this.f18501c.replace(mo17654e(), null, mo17653d(obj));
                this.f18501c.setTransactionSuccessful();
                try {
                    this.f18501c.endTransaction();
                } catch (Exception e10) {
                    if (obj instanceof Progress) {
                        ((Progress) obj).status = 4;
                    }
                    String message = e10.getMessage();
                    if (!TextUtils.isEmpty(message)) {
                        str = message;
                    }
                    Observable.just(str).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(), new b());
                    e10.printStackTrace();
                }
                this.f18499a.unlock();
                OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " replaceT");
                return true;
            } catch (Throwable th) {
                try {
                    this.f18501c.endTransaction();
                } catch (Exception e11) {
                    if (obj instanceof Progress) {
                        ((Progress) obj).status = 4;
                    }
                    String message2 = e11.getMessage();
                    if (!TextUtils.isEmpty(message2)) {
                        str = message2;
                    }
                    Observable.just(str).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(), new b());
                    e11.printStackTrace();
                }
                this.f18499a.unlock();
                OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " replaceT");
                throw th;
            }
        } catch (Exception e12) {
            OkLogger.printStackTrace(e12);
            try {
                this.f18501c.endTransaction();
            } catch (Exception e13) {
                if (obj instanceof Progress) {
                    ((Progress) obj).status = 4;
                }
                String message3 = e13.getMessage();
                if (!TextUtils.isEmpty(message3)) {
                    str = message3;
                }
                Observable.just(str).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(), new b());
                e13.printStackTrace();
            }
            this.f18499a.unlock();
            OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " replaceT");
            return false;
        }
    }

    /* renamed from: l */
    public boolean m17661l(List list) {
        if (list == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f18499a.lock();
        try {
            try {
                this.f18501c.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f18501c.replace(mo17654e(), null, mo17653d(it.next()));
                }
                this.f18501c.setTransactionSuccessful();
                try {
                    this.f18501c.endTransaction();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f18499a.unlock();
                OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " replaceList");
                return true;
            } catch (Throwable th) {
                try {
                    this.f18501c.endTransaction();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f18499a.unlock();
                OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " replaceList");
                throw th;
            }
        } catch (Exception e12) {
            OkLogger.printStackTrace(e12);
            try {
                this.f18501c.endTransaction();
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            this.f18499a.unlock();
            OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " replaceList");
            return false;
        }
    }

    /* renamed from: m */
    public boolean m17662m(ContentValues contentValues, String str, String[] strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f18499a.lock();
        try {
            try {
                this.f18501c.beginTransaction();
                this.f18501c.update(mo17654e(), contentValues, str, strArr);
                this.f18501c.setTransactionSuccessful();
                try {
                    this.f18501c.endTransaction();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f18499a.unlock();
                OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " updateContentValues");
                return true;
            } catch (Exception e11) {
                OkLogger.printStackTrace(e11);
                try {
                    this.f18501c.endTransaction();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                this.f18499a.unlock();
                OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " updateContentValues");
                return false;
            }
        } catch (Throwable th) {
            try {
                this.f18501c.endTransaction();
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            this.f18499a.unlock();
            OkLogger.m11765v(f18498e, (System.currentTimeMillis() - currentTimeMillis) + " updateContentValues");
            throw th;
        }
    }
}
