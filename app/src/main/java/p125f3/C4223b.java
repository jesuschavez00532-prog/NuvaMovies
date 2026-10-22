package p125f3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.p066db.ColumnEntity;
import com.lzy.okgo.p066db.DBUtils;
import com.lzy.okgo.p066db.TableEntity;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: f3.b */
/* loaded from: classes.dex */
public class C4223b extends SQLiteOpenHelper {

    /* renamed from: e */
    private static String f18505e = "info.db";

    /* renamed from: f */
    static final Lock f18506f = new ReentrantLock();

    /* renamed from: a */
    private TableEntity f18507a;

    /* renamed from: b */
    private TableEntity f18508b;

    /* renamed from: c */
    private TableEntity f18509c;

    /* renamed from: d */
    private TableEntity f18510d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4223b() {
        this(OkGo.getInstance().getContext());
    }

    /* renamed from: a */
    public static void m17665a(String str) {
        f18505e = str;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f18507a.buildTableString());
        sQLiteDatabase.execSQL(this.f18508b.buildTableString());
        sQLiteDatabase.execSQL(this.f18509c.buildTableString());
        sQLiteDatabase.execSQL(this.f18510d.buildTableString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (DBUtils.isNeedUpgradeTable(sQLiteDatabase, this.f18507a)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache");
        }
        if (DBUtils.isNeedUpgradeTable(sQLiteDatabase, this.f18508b)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cookie");
        }
        if (DBUtils.isNeedUpgradeTable(sQLiteDatabase, this.f18509c)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS download");
        }
        if (DBUtils.isNeedUpgradeTable(sQLiteDatabase, this.f18510d)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS upload");
        }
        onCreate(sQLiteDatabase);
    }

    C4223b(Context context) {
        super(context, f18505e, (SQLiteDatabase.CursorFactory) null, 1);
        this.f18507a = new TableEntity("cache");
        this.f18508b = new TableEntity(SerializableCookie.COOKIE);
        this.f18509c = new TableEntity("download");
        this.f18510d = new TableEntity("upload");
        this.f18507a.addColumn(new ColumnEntity(CacheEntity.KEY, "VARCHAR", true, true)).addColumn(new ColumnEntity(CacheEntity.LOCAL_EXPIRE, "INTEGER")).addColumn(new ColumnEntity(CacheEntity.HEAD, "BLOB")).addColumn(new ColumnEntity("data", "BLOB"));
        this.f18508b.addColumn(new ColumnEntity("host", "VARCHAR")).addColumn(new ColumnEntity(SerializableCookie.NAME, "VARCHAR")).addColumn(new ColumnEntity("domain", "VARCHAR")).addColumn(new ColumnEntity(SerializableCookie.COOKIE, "BLOB")).addColumn(new ColumnEntity("host", SerializableCookie.NAME, "domain"));
        this.f18509c.addColumn(new ColumnEntity(Progress.TAG, "VARCHAR", true, true)).addColumn(new ColumnEntity("url", "VARCHAR")).addColumn(new ColumnEntity(Progress.FOLDER, "VARCHAR")).addColumn(new ColumnEntity(Progress.FILE_PATH, "VARCHAR")).addColumn(new ColumnEntity(Progress.FILE_NAME, "VARCHAR")).addColumn(new ColumnEntity(Progress.FRACTION, "VARCHAR")).addColumn(new ColumnEntity(Progress.TOTAL_SIZE, "INTEGER")).addColumn(new ColumnEntity(Progress.CURRENT_SIZE, "INTEGER")).addColumn(new ColumnEntity(Progress.STATUS, "INTEGER")).addColumn(new ColumnEntity(Progress.PRIORITY, "INTEGER")).addColumn(new ColumnEntity(Progress.DATE, "INTEGER")).addColumn(new ColumnEntity(Progress.REQUEST, "BLOB")).addColumn(new ColumnEntity(Progress.EXTRA1, "BLOB")).addColumn(new ColumnEntity(Progress.EXTRA2, "BLOB")).addColumn(new ColumnEntity(Progress.EXTRA3, "BLOB"));
        this.f18510d.addColumn(new ColumnEntity(Progress.TAG, "VARCHAR", true, true)).addColumn(new ColumnEntity("url", "VARCHAR")).addColumn(new ColumnEntity(Progress.FOLDER, "VARCHAR")).addColumn(new ColumnEntity(Progress.FILE_PATH, "VARCHAR")).addColumn(new ColumnEntity(Progress.FILE_NAME, "VARCHAR")).addColumn(new ColumnEntity(Progress.FRACTION, "VARCHAR")).addColumn(new ColumnEntity(Progress.TOTAL_SIZE, "INTEGER")).addColumn(new ColumnEntity(Progress.CURRENT_SIZE, "INTEGER")).addColumn(new ColumnEntity(Progress.STATUS, "INTEGER")).addColumn(new ColumnEntity(Progress.PRIORITY, "INTEGER")).addColumn(new ColumnEntity(Progress.DATE, "INTEGER")).addColumn(new ColumnEntity(Progress.REQUEST, "BLOB")).addColumn(new ColumnEntity(Progress.EXTRA1, "BLOB")).addColumn(new ColumnEntity(Progress.EXTRA2, "BLOB")).addColumn(new ColumnEntity(Progress.EXTRA3, "BLOB"));
    }
}
