package com.live.p063db;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import org.xutils.DbManager;
import org.xutils.p274db.Selector;
import p317rb.AbstractC6567a;

/* loaded from: classes2.dex */
public final class LiveLockedUpDao {
    public static final Companion Companion = new Companion(null);
    private static final LiveLockedUpDao instance = new LiveLockedUpDao();
    private final String TAG = LiveLockedUpDao.class.getSimpleName();

    /* renamed from: db */
    private final DbManager f10820db = XutilDb.getDbManager(XutilDb.INSTANCE.getDB_NAME_LIVE_Locked());

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC5864g abstractC5864g) {
            this();
        }

        public final LiveLockedUpDao getInstance() {
            return LiveLockedUpDao.instance;
        }
    }

    public final boolean deleteItemById(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        if (this.f10820db == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            this.f10820db.deleteById(ChannelList.class, str);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean insert(ChannelList channelList) {
        String str;
        if (this.f10820db == null) {
            return false;
        }
        if (channelList != null) {
            str = channelList.getChannelCode();
        } else {
            str = null;
        }
        if (!AbstractC6567a.m25637g(str)) {
            return false;
        }
        try {
            this.f10820db.saveOrUpdate(channelList);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final ArrayList<ChannelList> queryAll() {
        ArrayList<ChannelList> arrayList = new ArrayList<>();
        DbManager dbManager = this.f10820db;
        if (dbManager == null) {
            return arrayList;
        }
        try {
            List findAll = dbManager.selector(ChannelList.class).findAll();
            if (findAll != null && findAll.size() > 0) {
                arrayList.addAll(findAll);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public final ChannelList queryByCode(String str) {
        Selector selector;
        Selector where;
        AbstractC5868k.m23674f(str, "channelCode");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            DbManager dbManager = this.f10820db;
            if (dbManager == null || (selector = dbManager.selector(ChannelList.class)) == null || (where = selector.where("channelCode", "in", new String[]{str})) == null) {
                return null;
            }
            return (ChannelList) where.findFirst();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
