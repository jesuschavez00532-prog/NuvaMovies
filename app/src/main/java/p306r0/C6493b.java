package p306r0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p306r0.C6492a;

/* renamed from: r0.b */
/* loaded from: classes.dex */
public final class C6493b extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final a f24965a = new a(null);

    /* renamed from: b */
    private static final int f24966b = 2;

    /* renamed from: c */
    private static final String f24967c = "addb";

    /* renamed from: r0.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6493b(Context context) {
        super(context, f24967c, (SQLiteDatabase.CursorFactory) null, f24966b);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* renamed from: a */
    private final void m25451a(SQLiteDatabase sQLiteDatabase, C6494c c6494c) {
        String str = "ALTER TABLE " + C6492a.f24950c.m25450l() + " ADD COLUMN " + c6494c.m25453a() + ' ' + c6494c.m25454b();
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(str);
        }
    }

    /* renamed from: b */
    private final String m25452b(String str, String str2, List list) {
        StringBuffer stringBuffer = new StringBuffer("create table ");
        stringBuffer.append(str);
        stringBuffer.append(" (");
        stringBuffer.append(str2);
        stringBuffer.append(" integer primary key autoincrement");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6494c c6494c = (C6494c) it.next();
            stringBuffer.append(",");
            stringBuffer.append(c6494c.m25453a());
            stringBuffer.append(" ");
            stringBuffer.append(c6494c.m25454b());
        }
        stringBuffer.append(")");
        String stringBuffer2 = stringBuffer.toString();
        AbstractC5868k.m23673e(stringBuffer2, "stringBuilder.toString()");
        return stringBuffer2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC5868k.m23674f(sQLiteDatabase, "db");
        ArrayList arrayList = new ArrayList();
        C6492a.a aVar = C6492a.f24950c;
        arrayList.add(new C6494c(aVar.m25439a(), "text(40)"));
        arrayList.add(new C6494c(aVar.m25440b(), "text(40)"));
        arrayList.add(new C6494c(aVar.m25444f(), "integer"));
        arrayList.add(new C6494c(aVar.m25443e(), "integer"));
        arrayList.add(new C6494c(aVar.m25449k(), "text(60)"));
        arrayList.add(new C6494c(aVar.m25442d(), "integer"));
        arrayList.add(new C6494c(aVar.m25448j(), "text(40)"));
        arrayList.add(new C6494c(aVar.m25441c(), "text(40)"));
        arrayList.add(new C6494c(aVar.m25447i(), "Long"));
        arrayList.add(new C6494c(aVar.m25445g(), "Long"));
        sQLiteDatabase.execSQL(m25452b(aVar.m25450l(), aVar.m25446h(), arrayList));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 > i11) {
            return;
        }
        while (true) {
            if (i10 == 1) {
                m25451a(sQLiteDatabase, new C6494c(C6492a.f24950c.m25445g(), "Long"));
            }
            if (i10 != i11) {
                i10++;
            } else {
                return;
            }
        }
    }
}
