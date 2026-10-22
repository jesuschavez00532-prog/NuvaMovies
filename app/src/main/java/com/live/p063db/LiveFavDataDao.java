package com.live.p063db;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.xutils.DbManager;

/* loaded from: classes2.dex */
public class LiveFavDataDao {
    private static LiveFavDataDao INSTANCE = new LiveFavDataDao();
    private String TAG = "LiveFavDataDao";

    /* renamed from: db */
    private DbManager f10819db = XutilDb.getDbManager(XutilDb.DB_NAME_LIVE_FAV_Data);

    private LiveFavDataDao() {
    }

    public static LiveFavDataDao getInstance() {
        return INSTANCE;
    }

    public boolean deleteAll() {
        DbManager dbManager = this.f10819db;
        if (dbManager == null) {
            return false;
        }
        try {
            dbManager.delete(ChannelList.class);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean deleteItemById(String str) {
        if (this.f10819db == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            this.f10819db.deleteById(ChannelList.class, str);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean insert(ChannelList channelList) {
        if (this.f10819db == null || channelList == null || channelList.getChannelCode() == null) {
            return false;
        }
        try {
            this.f10819db.saveOrUpdate(channelList);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public ArrayList<ChannelList> queryAll() {
        if (this.f10819db == null) {
            return null;
        }
        ArrayList<ChannelList> arrayList = new ArrayList<>();
        try {
            List findAll = this.f10819db.selector(ChannelList.class).findAll();
            if (findAll != null && findAll.size() > 0) {
                arrayList.addAll(findAll);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public boolean queryById(String str) {
        List findAll;
        if (this.f10819db == null) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                findAll = this.f10819db.selector(ChannelList.class).where("channelCode", "in", new String[]{str}).findAll();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (findAll == null && findAll.size() > 0) {
                return true;
            }
        }
        findAll = null;
        return findAll == null ? false : false;
    }
}
