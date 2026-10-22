package com.live.p063db;

import org.xutils.DbManager;

/* loaded from: classes2.dex */
public class LiveDao {
    private static final String TAG = "LiveDao";
    private static LiveDao sInstance;
    private DbManager mDb = XutilDb.getDbManager(XutilDb.DB_NAME_LIVE);

    private LiveDao() {
    }

    public static LiveDao getInstance() {
        if (sInstance == null) {
            synchronized (LiveDao.class) {
                sInstance = new LiveDao();
            }
        }
        return sInstance;
    }

    public DbManager getDb() {
        return this.mDb;
    }
}
