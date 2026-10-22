package com.lzy.okgo.p066db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.lzy.okgo.cookie.SerializableCookie;

/* loaded from: classes2.dex */
public class CookieManager extends BaseDao<SerializableCookie> {
    private static Context context;
    private static volatile CookieManager instance;

    private CookieManager() {
        super(new DBHelper(context));
    }

    public static CookieManager getInstance() {
        if (instance == null) {
            synchronized (CookieManager.class) {
                if (instance == null) {
                    instance = new CookieManager();
                }
            }
        }
        return instance;
    }

    public static void init(Context context2) {
        context = context2;
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public String getTableName() {
        return SerializableCookie.COOKIE;
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public void unInit() {
    }

    @Override // com.lzy.okgo.p066db.BaseDao
    public ContentValues getContentValues(SerializableCookie serializableCookie) {
        return SerializableCookie.getContentValues(serializableCookie);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.lzy.okgo.p066db.BaseDao
    public SerializableCookie parseCursorToBean(Cursor cursor) {
        return SerializableCookie.parseCursorToBean(cursor);
    }
}
