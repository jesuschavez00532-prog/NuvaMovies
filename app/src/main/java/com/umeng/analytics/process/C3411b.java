package com.umeng.analytics.process;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3388j;
import java.io.File;

/* renamed from: com.umeng.analytics.process.b */
/* loaded from: classes3.dex */
class C3411b extends SQLiteOpenHelper {
    C3411b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, cursorFactory, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3411b m14448a(Context context, String str) {
        String m14451b = m14451b(context, str);
        InterfaceC3410a.f14959h.equals(str);
        return new C3411b(context, m14451b, null, 1);
    }

    /* renamed from: b */
    public static String m14451b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = InterfaceC3410a.f14959h;
        }
        String str2 = C3388j.m14258b(context) + InterfaceC3410a.f14952a;
        if (InterfaceC3410a.f14959h.equals(str)) {
            str2 = C3388j.m14258b(context);
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return String.format(str2 + InterfaceC3410a.f14956e, str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m14450a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* renamed from: a */
    private void m14450a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    public static String m14449a(Context context) {
        return C3388j.m14258b(context) + InterfaceC3410a.f14952a;
    }
}
