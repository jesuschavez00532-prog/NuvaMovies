package p306r0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import be.C1328x;
import com.advertlib.bean.AdReportBean;
import com.advertlib.bean.AdReportBeanWrapper;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public final class C6492a {

    /* renamed from: c */
    public static final a f24950c = new a(null);

    /* renamed from: d */
    private static final String f24951d = "adtable";

    /* renamed from: e */
    private static final String f24952e = "id";

    /* renamed from: f */
    private static final String f24953f = "ad_id";

    /* renamed from: g */
    private static final String f24954g = "ad_name";

    /* renamed from: h */
    private static final String f24955h = "display_times";

    /* renamed from: i */
    private static final String f24956i = "click_times";

    /* renamed from: j */
    private static final String f24957j = "user_name";

    /* renamed from: k */
    private static final String f24958k = "apk_version";

    /* renamed from: l */
    private static final String f24959l = "media_type";

    /* renamed from: m */
    private static final String f24960m = "ad_type";

    /* renamed from: n */
    private static final String f24961n = "last_update_timestamp";

    /* renamed from: o */
    private static final String f24962o = "game_stay_time";

    /* renamed from: a */
    private C6493b f24963a;

    /* renamed from: b */
    private SQLiteDatabase f24964b;

    /* renamed from: r0.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final String m25439a() {
            return C6492a.f24953f;
        }

        /* renamed from: b */
        public final String m25440b() {
            return C6492a.f24954g;
        }

        /* renamed from: c */
        public final String m25441c() {
            return C6492a.f24960m;
        }

        /* renamed from: d */
        public final String m25442d() {
            return C6492a.f24958k;
        }

        /* renamed from: e */
        public final String m25443e() {
            return C6492a.f24956i;
        }

        /* renamed from: f */
        public final String m25444f() {
            return C6492a.f24955h;
        }

        /* renamed from: g */
        public final String m25445g() {
            return C6492a.f24962o;
        }

        /* renamed from: h */
        public final String m25446h() {
            return C6492a.f24952e;
        }

        /* renamed from: i */
        public final String m25447i() {
            return C6492a.f24961n;
        }

        /* renamed from: j */
        public final String m25448j() {
            return C6492a.f24959l;
        }

        /* renamed from: k */
        public final String m25449k() {
            return C6492a.f24957j;
        }

        /* renamed from: l */
        public final String m25450l() {
            return C6492a.f24951d;
        }
    }

    public C6492a(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        C6493b c6493b = new C6493b(context);
        this.f24963a = c6493b;
        SQLiteDatabase writableDatabase = c6493b.getWritableDatabase();
        AbstractC5868k.m23673e(writableDatabase, "adHelper.writableDatabase");
        this.f24964b = writableDatabase;
    }

    /* renamed from: o */
    private final AdReportBeanWrapper m25434o(Cursor cursor) {
        int i10 = cursor.getInt(cursor.getColumnIndex(f24952e));
        String string = cursor.getString(cursor.getColumnIndex(f24953f));
        AbstractC5868k.m23673e(string, "cursor.getString(cursor.…ColumnIndex(FIELD_AD_ID))");
        String string2 = cursor.getString(cursor.getColumnIndex(f24954g));
        AbstractC5868k.m23673e(string2, "cursor.getString(cursor.…lumnIndex(FIELD_AD_NAME))");
        int i11 = cursor.getInt(cursor.getColumnIndex(f24955h));
        int i12 = cursor.getInt(cursor.getColumnIndex(f24956i));
        String string3 = cursor.getString(cursor.getColumnIndex(f24957j));
        AbstractC5868k.m23673e(string3, "cursor.getString(cursor.…mnIndex(FIELD_USER_NAME))");
        int i13 = cursor.getInt(cursor.getColumnIndex(f24958k));
        String string4 = cursor.getString(cursor.getColumnIndex(f24959l));
        AbstractC5868k.m23673e(string4, "cursor.getString(cursor.…nIndex(FIELD_MEDIA_TYPE))");
        String string5 = cursor.getString(cursor.getColumnIndex(f24960m));
        AbstractC5868k.m23673e(string5, "cursor.getString(cursor.…lumnIndex(FIELD_AD_TYPE))");
        return new AdReportBeanWrapper(i10, new AdReportBean(string, string2, i11, i12, "unknown", "unknown", string3, i13, "unknown", string4, string5, cursor.getLong(cursor.getColumnIndex(f24961n)), cursor.getLong(cursor.getColumnIndex(f24962o))));
    }

    /* renamed from: p */
    private final void m25435p(ContentValues contentValues, AdReportBean adReportBean) {
        contentValues.put(f24953f, adReportBean.getAd_id());
        String str = f24954g;
        String ad_name = adReportBean.getAd_name();
        if (ad_name == null) {
            ad_name = "";
        }
        contentValues.put(str, ad_name);
        contentValues.put(f24955h, Integer.valueOf(adReportBean.getDisplay_times()));
        contentValues.put(f24956i, Integer.valueOf(adReportBean.getClick_times()));
        contentValues.put(f24957j, adReportBean.getUser_name());
        contentValues.put(f24958k, Integer.valueOf(adReportBean.getApk_version()));
        contentValues.put(f24959l, adReportBean.getMedia_type());
        contentValues.put(f24960m, adReportBean.getAd_type());
        contentValues.put(f24961n, Long.valueOf(adReportBean.getLast_update_timestamp()));
        contentValues.put(f24962o, Long.valueOf(adReportBean.getGame_stay_time()));
    }

    /* renamed from: m */
    public final void m25436m(List list) {
        AbstractC5868k.m23674f(list, "ids");
        synchronized (this) {
            String[] strArr = {""};
            this.f24964b.beginTransaction();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    strArr[0] = String.valueOf(((Number) it.next()).intValue());
                    this.f24964b.delete(f24951d, f24952e + "=?", strArr);
                }
                this.f24964b.setTransactionSuccessful();
                this.f24964b.endTransaction();
                C1328x c1328x = C1328x.f4998a;
            } catch (Throwable th) {
                this.f24964b.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: n */
    public final List m25437n() {
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (this) {
                Cursor rawQuery = this.f24964b.rawQuery("SELECT * FROM " + f24951d, null);
                while (rawQuery.moveToNext()) {
                    AbstractC5868k.m23673e(rawQuery, "cursor");
                    arrayList.add(m25434o(rawQuery));
                }
                rawQuery.close();
                C1328x c1328x = C1328x.f4998a;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: q */
    public final void m25438q(AdReportBean adReportBean) {
        AbstractC5868k.m23674f(adReportBean, "item");
        ContentValues contentValues = new ContentValues();
        m25435p(contentValues, adReportBean);
        synchronized (this) {
            this.f24964b.insert(f24951d, null, contentValues);
        }
    }
}
