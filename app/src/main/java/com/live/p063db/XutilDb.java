package com.live.p063db;

import java.io.File;
import ne.AbstractC5868k;
import org.xutils.C6127x;
import org.xutils.DbManager;
import org.xutils.p275ex.DbException;
import p400xa.C7581k;

/* loaded from: classes2.dex */
public final class XutilDb {
    public static final String DB_NAME_LIVE;
    public static final String DB_NAME_LIVE_FAV_Data;
    private static final String DB_NAME_LIVE_Locked;
    public static final String DB_NAME_LIVE_RESERVATION_Data;
    public static final XutilDb INSTANCE;
    private static final String TAG;
    private static boolean not_first;

    static {
        XutilDb xutilDb = new XutilDb();
        INSTANCE = xutilDb;
        TAG = xutilDb.getClass().getSimpleName();
        DB_NAME_LIVE_FAV_Data = "liveFavData.db";
        DB_NAME_LIVE_RESERVATION_Data = "liveReservationData.db";
        DB_NAME_LIVE_Locked = "liveLocked.db";
        DB_NAME_LIVE = "xxl-live.db";
    }

    private XutilDb() {
    }

    public static final DbManager getDbManager(final String str) {
        AbstractC5868k.m23674f(str, "dbName");
        try {
            DbManager.DaoConfig dbDir = new DbManager.DaoConfig().setDbName(str).setDbDir(new File(INSTANCE.getDbPath()));
            AbstractC5868k.m23671c(dbDir);
            dbDir.setDbVersion(3);
            dbDir.setDbUpgradeListener(new DbManager.DbUpgradeListener() { // from class: com.live.db.a
                @Override // org.xutils.DbManager.DbUpgradeListener
                public final void onUpgrade(DbManager dbManager, int i10, int i11) {
                    XutilDb.getDbManager$lambda$0(str, dbManager, i10, i11);
                }
            });
            return C6127x.getDb(dbDir);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!not_first) {
                C7581k c7581k = C7581k.f27855a;
                if (!c7581k.m29096e()) {
                    try {
                        DbManager.DaoConfig dbDir2 = new DbManager.DaoConfig().setDbName(str).setDbDir(new File(c7581k.m29093b(c7581k.m29095d())));
                        AbstractC5868k.m23671c(dbDir2);
                        dbDir2.setDbVersion(1);
                        return C6127x.getDb(dbDir2);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        not_first = true;
                        try {
                            DbManager.DaoConfig dbName = new DbManager.DaoConfig().setDbName(str);
                            C7581k c7581k2 = C7581k.f27855a;
                            DbManager.DaoConfig dbDir3 = dbName.setDbDir(new File(c7581k2.m29094c(c7581k2.m29095d())));
                            AbstractC5868k.m23671c(dbDir3);
                            dbDir3.setDbVersion(1);
                            return C6127x.getDb(dbDir3);
                        } catch (Exception e12) {
                            e12.printStackTrace();
                            return null;
                        }
                    }
                }
                not_first = true;
                try {
                    DbManager.DaoConfig dbDir4 = new DbManager.DaoConfig().setDbName(str).setDbDir(new File(c7581k.m29094c(c7581k.m29095d())));
                    AbstractC5868k.m23671c(dbDir4);
                    dbDir4.setDbVersion(1);
                    return C6127x.getDb(dbDir4);
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDbManager$lambda$0(String str, DbManager dbManager, int i10, int i11) {
        AbstractC5868k.m23674f(str, "$dbName");
        if (AbstractC5868k.m23669a(DB_NAME_LIVE_FAV_Data, str) && i10 == 1) {
            try {
                dbManager.addColumn(ChannelList.class, "posterUrl");
            } catch (DbException e10) {
                e10.printStackTrace();
            }
        }
        if (AbstractC5868k.m23669a(DB_NAME_LIVE_RESERVATION_Data, str) && i10 == 2) {
            try {
                dbManager.addColumn(ReservationList.class, "isNotified");
            } catch (DbException e11) {
                e11.printStackTrace();
            }
        }
    }

    private final String getDbPath() {
        C7581k c7581k = C7581k.f27855a;
        return c7581k.m29092a(c7581k.m29095d());
    }

    public final String getDB_NAME_LIVE_Locked() {
        return DB_NAME_LIVE_Locked;
    }

    public final String getTAG() {
        return TAG;
    }
}
