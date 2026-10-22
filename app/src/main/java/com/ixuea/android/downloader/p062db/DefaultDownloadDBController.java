package com.ixuea.android.downloader.p062db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.C3329bx;
import java.util.ArrayList;
import java.util.List;
import p353u7.C7051a;
import p413y7.C7681a;
import p413y7.InterfaceC7682b;
import p428z7.C7760a;
import p428z7.C7761b;

/* loaded from: classes2.dex */
public final class DefaultDownloadDBController implements InterfaceC7682b {

    /* renamed from: d */
    public static final String[] f10626d = {C3329bx.f14344d, "supportRanges", "createAt", "uri", "path", "size", "progress", Progress.STATUS, "breakPointCount"};

    /* renamed from: e */
    public static final String[] f10627e = {C3329bx.f14344d, "threadId", "downloadInfoId", "uri", "start", "end", "progress"};

    /* renamed from: f */
    public static final String f10628f = String.format("REPLACE INTO %s (_id,threadId,downloadInfoId,uri,start,end,progress) VALUES(?,?,?,?,?,?,?);", "download_thread_info");

    /* renamed from: g */
    public static final String f10629g = String.format("REPLACE INTO %s (_id,supportRanges,createAt,uri,path,size,progress,status,breakPointCount) VALUES(?,?,?,?,?,?,?,?,?);", "download_info");

    /* renamed from: h */
    public static final String f10630h = String.format("UPDATE %s SET status=? WHERE status!=?;", "download_info");

    /* renamed from: a */
    private final C7681a f10631a;

    /* renamed from: b */
    private final SQLiteDatabase f10632b;

    /* renamed from: c */
    private final SQLiteDatabase f10633c;

    public DefaultDownloadDBController(Context context, C7051a c7051a) {
        C7681a c7681a = new C7681a(context, c7051a);
        this.f10631a = c7681a;
        this.f10632b = c7681a.getWritableDatabase();
        this.f10633c = c7681a.getReadableDatabase();
    }

    /* renamed from: h */
    private void m11411h(Cursor cursor, C7760a c7760a) {
        c7760a.m30027z(cursor.getString(0));
        c7760a.m29999E(cursor.getInt(1));
        c7760a.m30022u(cursor.getLong(2));
        c7760a.m30001G(cursor.getString(3));
        c7760a.m29995A(cursor.getString(4));
        c7760a.m29997C(cursor.getLong(5));
        c7760a.m29996B(cursor.getLong(6));
        c7760a.m29998D(cursor.getInt(7));
        c7760a.m30021t(cursor.getInt(8));
    }

    /* renamed from: i */
    private void m11412i(Cursor cursor, C7761b c7761b) {
        c7761b.m30043k(cursor.getInt(0));
        c7761b.m30046n(cursor.getInt(1));
        c7761b.m30041i(cursor.getString(2));
        c7761b.m30047o(cursor.getString(3));
        c7761b.m30045m(cursor.getLong(4));
        c7761b.m30042j(cursor.getLong(5));
        c7761b.m30044l(cursor.getLong(6));
    }

    @Override // p413y7.InterfaceC7682b
    /* renamed from: a */
    public void mo11413a(C7761b c7761b) {
        this.f10632b.execSQL(f10628f, new Object[]{Integer.valueOf(c7761b.m30036d()), Integer.valueOf(c7761b.m30039g()), c7761b.m30034b(), c7761b.m30040h(), Long.valueOf(c7761b.m30038f()), Long.valueOf(c7761b.m30035c()), Long.valueOf(c7761b.m30037e())});
    }

    @Override // p413y7.InterfaceC7682b
    /* renamed from: b */
    public void mo11414b(C7760a c7760a) {
        this.f10632b.delete("download_info", "_id=?", new String[]{String.valueOf(c7760a.m30009h())});
        this.f10632b.delete("download_thread_info", "downloadInfoId=?", new String[]{String.valueOf(c7760a.m30009h())});
    }

    @Override // p413y7.InterfaceC7682b
    /* renamed from: c */
    public List mo11415c() {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = this.f10633c.query("download_info", f10626d, "status!=?", new String[]{String.valueOf(5)}, null, null, "createAt desc");
            while (query.moveToNext()) {
                C7760a c7760a = new C7760a();
                arrayList.add(c7760a);
                m11411h(query, c7760a);
                Cursor query2 = this.f10633c.query("download_thread_info", f10627e, "downloadInfoId=?", new String[]{String.valueOf(c7760a.m30009h())}, null, null, null);
                ArrayList arrayList2 = new ArrayList();
                while (query2.moveToNext()) {
                    C7761b c7761b = new C7761b();
                    arrayList2.add(c7761b);
                    m11412i(query2, c7761b);
                }
                c7760a.m30024w(arrayList2);
            }
            return arrayList;
        } catch (Exception e10) {
            e10.printStackTrace();
            return arrayList;
        }
    }

    @Override // p413y7.InterfaceC7682b
    /* renamed from: d */
    public void mo11416d(C7761b c7761b) {
        this.f10632b.delete("download_thread_info", "_id=?", new String[]{String.valueOf(c7761b.m30036d())});
    }

    @Override // p413y7.InterfaceC7682b
    /* renamed from: e */
    public void mo11417e() {
        this.f10632b.execSQL(f10630h, new Object[]{4, 5});
    }

    @Override // p413y7.InterfaceC7682b
    /* renamed from: f */
    public C7760a mo11418f(String str) {
        try {
            Cursor query = this.f10633c.query("download_info", f10626d, "_id=?", new String[]{str}, null, null, "createAt desc");
            if (!query.moveToNext()) {
                return null;
            }
            C7760a c7760a = new C7760a();
            m11411h(query, c7760a);
            return c7760a;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // p413y7.InterfaceC7682b
    /* renamed from: g */
    public void mo11419g(C7760a c7760a) {
        this.f10632b.execSQL(f10629g, new Object[]{c7760a.m30009h(), Integer.valueOf(c7760a.m30014m()), Long.valueOf(c7760a.m30004c()), c7760a.m30015n(), c7760a.m30010i(), Long.valueOf(c7760a.m30012k()), Long.valueOf(c7760a.m30011j()), Integer.valueOf(c7760a.m30013l()), Integer.valueOf(c7760a.m30003b())});
    }
}
