package com.live.p063db;

import com.taobao.accs.common.Constants;
import org.xutils.C6127x;
import org.xutils.DbManager;
import org.xutils.p275ex.DbException;

/* loaded from: classes2.dex */
public class PlayBackDao {

    /* renamed from: db */
    private DbManager f10822db = C6127x.getDb(new DbManager.DaoConfig().setDbName("playback").setDbVersion(1).setDbUpgradeListener(new DbManager.DbUpgradeListener() { // from class: com.live.db.PlayBackDao.1
        @Override // org.xutils.DbManager.DbUpgradeListener
        public void onUpgrade(DbManager dbManager, int i10, int i11) {
        }
    }));

    public void delete(PlaybackPositionModel playbackPositionModel) {
        try {
            this.f10822db.delete(playbackPositionModel);
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    public void insert(PlaybackPositionModel playbackPositionModel) {
        try {
            this.f10822db.saveOrUpdate(playbackPositionModel);
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    public PlaybackPositionModel query(String str) {
        try {
            return (PlaybackPositionModel) this.f10822db.selector(PlaybackPositionModel.class).where(Constants.KEY_HTTP_CODE, "in", new String[]{str}).findFirst();
        } catch (DbException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
