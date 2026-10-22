package com.live.p063db;

import android.text.TextUtils;
import com.lzy.okgo.model.Progress;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.AnalyticsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;
import org.xutils.DbManager;
import org.xutils.common.util.KeyValue;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p275ex.DbException;

/* loaded from: classes2.dex */
public class LiveReserveDao {
    public static LiveReserveDao INSTANCE = new LiveReserveDao();
    private String TAG = "LiveReserveDao";

    /* renamed from: db */
    private DbManager f10821db = XutilDb.getDbManager(XutilDb.DB_NAME_LIVE_RESERVATION_Data);

    private LiveReserveDao() {
    }

    public boolean deleteByDate(String str) {
        if (this.f10821db == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            this.f10821db.delete(ReservationList.class, WhereBuilder.m24391b(Progress.DATE, Operator.Operation.EQUALS, str));
            return true;
        } catch (DbException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean deleteExpireData(long j10) {
        DbManager dbManager = this.f10821db;
        if (dbManager == null || j10 == 0) {
            return false;
        }
        try {
            dbManager.delete(ReservationList.class, WhereBuilder.m24391b("expireTime", Operator.Operation.LESS_THAN, Long.valueOf(j10)));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean deleteItemByDCT(String str, String str2, String str3, String str4) {
        if (this.f10821db == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        try {
            this.f10821db.delete(ReservationList.class, WhereBuilder.m24391b("channelCode", "in", new String[]{str}).and(Progress.DATE, "in", new String[]{str2}).and("content", "in", new String[]{str3}).and(AgooConstants.MESSAGE_TIME, "in", new String[]{str4}));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean deleteItemById(String str, String str2, String str3) {
        if (this.f10821db == null || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            this.f10821db.delete(ReservationList.class, WhereBuilder.m24391b("channelCode", "in", new String[]{str}).and("content", "in", new String[]{str2}).and(AgooConstants.MESSAGE_TIME, "in", new String[]{str3}));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean deleteReserveMatch(String str) {
        DbManager dbManager = this.f10821db;
        if (dbManager == null) {
            return false;
        }
        try {
            dbManager.delete(ReserveMatch.class, WhereBuilder.m24391b("gid", Operator.Operation.EQUALS, str));
            this.f10821db.delete(ReserveTeam.class, WhereBuilder.m24391b("gid", Operator.Operation.EQUALS, str));
            this.f10821db.delete(ReserveChannel.class, WhereBuilder.m24391b("gid", Operator.Operation.EQUALS, str));
            return true;
        } catch (DbException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean deleteReserveMatchByPastTime(String str) {
        DbManager dbManager = this.f10821db;
        if (dbManager == null) {
            return false;
        }
        try {
            List findAll = dbManager.selector(ReserveMatch.class).where("game_time", Operator.Operation.LESS_THAN, str).findAll();
            if (findAll != null && findAll.size() > 0) {
                Iterator it = findAll.iterator();
                while (it.hasNext()) {
                    deleteReserveMatch(((ReserveMatch) it.next()).getGameId());
                }
            }
            return true;
        } catch (DbException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean findReserveMatch(String str) {
        DbManager dbManager = this.f10821db;
        if (dbManager == null) {
            return false;
        }
        try {
            if (((ReserveMatch) dbManager.selector(ReserveMatch.class).where("gid", Operator.Operation.EQUALS, str).findFirst()) == null) {
                return false;
            }
            return true;
        } catch (DbException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean insert(ReservationList reservationList) {
        if (this.f10821db == null || reservationList == null || reservationList.getContent() == null) {
            return false;
        }
        try {
            this.f10821db.saveOrUpdate(reservationList);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean insertReserveMatch(ReserveMatch reserveMatch) {
        DbManager dbManager = this.f10821db;
        if (dbManager == null) {
            return false;
        }
        try {
            dbManager.save(reserveMatch.getHomeTeam());
            this.f10821db.save(reserveMatch.getVisitTeam());
            ArrayList<ReserveChannel> channels = reserveMatch.getChannels();
            if (channels != null && channels.size() > 0) {
                Iterator<ReserveChannel> it = channels.iterator();
                while (it.hasNext()) {
                    this.f10821db.save(it.next());
                }
            }
            this.f10821db.save(reserveMatch);
            return true;
        } catch (DbException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public ArrayList<ReservationList> queryAll() {
        DbManager dbManager = this.f10821db;
        if (dbManager == null) {
            return null;
        }
        try {
            return (ArrayList) dbManager.selector(ReservationList.class).findAll();
        } catch (DbException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public ArrayList<ReservationList> queryByDate(String str) {
        ArrayList<ReservationList> arrayList = new ArrayList<>();
        DbManager dbManager = this.f10821db;
        if (dbManager == null) {
            return arrayList;
        }
        try {
            List findAll = dbManager.selector(ReservationList.class).where(Progress.DATE, "in", new String[]{str}).orderBy(AnalyticsConfig.RTD_START_TIME, false).findAll();
            if (findAll != null && findAll.size() > 0) {
                arrayList.addAll(findAll);
            }
        } catch (DbException e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public boolean queryById(String str, String str2, String str3, String str4) {
        List findAll;
        if (this.f10821db == null) {
            return false;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                findAll = this.f10821db.selector(ReservationList.class).where(WhereBuilder.m24391b("channelCode", "in", new String[]{str}).and(Progress.DATE, "in", new String[]{str4}).and(AgooConstants.MESSAGE_TIME, "in", new String[]{str3}).and("content", "in", new String[]{str2})).findAll();
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

    public List<ReserveMatch> queryReserveMatchRecently(String str) {
        DbManager dbManager = this.f10821db;
        if (dbManager == null) {
            return null;
        }
        try {
            List<ReserveMatch> findAll = dbManager.selector(ReserveMatch.class).where("game_time", Operator.Operation.GREATER_THAN_OR_EQUALS, str).orderBy("game_time", false).findAll();
            if (findAll != null && findAll.size() > 0) {
                for (ReserveMatch reserveMatch : findAll) {
                    List findAll2 = this.f10821db.selector(ReserveTeam.class).where("gid", Operator.Operation.EQUALS, reserveMatch.getGameId()).findAll();
                    if (findAll2 != null && findAll2.size() >= 2) {
                        reserveMatch.setHomeTeam((ReserveTeam) findAll2.get(0));
                        reserveMatch.setVisitTeam((ReserveTeam) findAll2.get(1));
                        List findAll3 = this.f10821db.selector(ReserveChannel.class).where("gid", Operator.Operation.EQUALS, reserveMatch.getGameId()).findAll();
                        if (findAll3 != null && findAll3.size() > 0) {
                            reserveMatch.setChannels((ArrayList) findAll3);
                        }
                    }
                    return null;
                }
                return findAll;
            }
            return null;
        } catch (DbException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public ArrayList<ReservationList> queryReserveNotifyList(String str, String str2) {
        if (this.f10821db == null) {
            return null;
        }
        ArrayList<ReservationList> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                List findAll = this.f10821db.selector(ReservationList.class).where(AnalyticsConfig.RTD_START_TIME, Operator.Operation.GREATER_THAN_OR_EQUALS, str2).and(WhereBuilder.m24391b("isNotified", Operator.Operation.EQUALS, null).m24392or("isNotified", Operator.Operation.EQUALS, MessageService.MSG_DB_READY_REPORT)).and(Progress.DATE, Operator.Operation.EQUALS, str).m24386or(Progress.DATE, Operator.Operation.GREATER_THAN, str).orderBy(Progress.DATE, false).orderBy(AnalyticsConfig.RTD_START_TIME, false).findAll();
                if (findAll != null && findAll.size() > 0) {
                    arrayList.addAll(findAll);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }

    public ArrayList<ReservationList> queryStartTime(String str, String str2) {
        if (this.f10821db == null) {
            return null;
        }
        ArrayList<ReservationList> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            try {
                List findAll = this.f10821db.selector(ReservationList.class).where(AnalyticsConfig.RTD_START_TIME, "in", new String[]{str}).and(Progress.DATE, "in", new String[]{str2}).findAll();
                if (findAll != null && findAll.size() > 0) {
                    arrayList.addAll(findAll);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }

    public boolean updateItemByDCT(String str, String str2, String str3, String str4, int i10) {
        if (this.f10821db == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        try {
            this.f10821db.update(ReservationList.class, WhereBuilder.m24391b("channelCode", "in", new String[]{str}).and(Progress.DATE, "in", new String[]{str2}).and("content", "in", new String[]{str3}).and(AgooConstants.MESSAGE_TIME, "in", new String[]{str4}), new KeyValue("isRestore", String.valueOf(i10)));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean updateNotifyByDCT(String str, String str2, String str3, String str4, int i10) {
        if (this.f10821db == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        try {
            this.f10821db.update(ReservationList.class, WhereBuilder.m24391b("channelCode", "in", new String[]{str}).and(Progress.DATE, "in", new String[]{str2}).and("content", "in", new String[]{str3}).and(AgooConstants.MESSAGE_TIME, "in", new String[]{str4}), new KeyValue("isNotified", Integer.valueOf(i10)));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
