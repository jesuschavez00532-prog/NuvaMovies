package p413y7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p353u7.C7051a;

/* renamed from: y7.a */
/* loaded from: classes2.dex */
public class C7681a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final String f28119a = String.format("CREATE TABLE %s (_id varchar(255) PRIMARY KEY NOT NULL,supportRanges integer NOT NULL,createAt long NOT NULL,uri varchar(255) NOT NULL,path varchar(255) NOT NULL,size long NOT NULL, progress long NOT NULL,status integer NOT NULL,breakPointCount integer NOT NULL);", "download_info");

    /* renamed from: b */
    private static final String f28120b = String.format("CREATE TABLE %s (_id integer PRIMARY KEY NOT NULL,threadId integer NOT NULL,downloadInfoId varchar(255) NOT NULL,uri varchar(255) NOT NULL,start long NOT NULL,end long NOT NULL,progress long NOT NULL);", "download_thread_info");

    public C7681a(Context context, C7051a c7051a) {
        super(context, c7051a.m27151b(), (SQLiteDatabase.CursorFactory) null, c7051a.m27152c());
    }

    /* renamed from: a */
    private void m29474a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f28119a);
        sQLiteDatabase.execSQL(f28120b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m29474a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
