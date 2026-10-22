package com.live.p063db;

import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.bean.ChannelEpg;
import java.util.ArrayList;
import java.util.List;
import org.xutils.p275ex.DbException;

/* loaded from: classes2.dex */
public class LiveEpgDao {
    private static final String TAG = "LiveEpgDao";

    public void deleteTable() {
        try {
            LiveDao.getInstance().getDb().dropTable(ChannelEpg.class);
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    public boolean insertChannelEpg(List<ChannelEpg> list) {
        if (list != null && !list.isEmpty()) {
            try {
                LiveDao.getInstance().getDb().save(list);
                return true;
            } catch (DbException e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public ChannelEpg queryByCodeAndDate(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return (ChannelEpg) LiveDao.getInstance().getDb().selector(ChannelEpg.class).where("channel_code", Operator.Operation.EQUALS, str).and("epg_date", Operator.Operation.EQUALS, str2).findFirst();
            } catch (DbException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public ArrayList<ChannelEpg> queryByDate(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        try {
            List findAll = LiveDao.getInstance().getDb().selector(ChannelEpg.class).where("epg_date", Operator.Operation.EQUALS, str).findAll();
            if (findAll != null && !findAll.isEmpty()) {
                return (ArrayList) findAll;
            }
        } catch (DbException e10) {
            e10.printStackTrace();
        }
        return new ArrayList<>();
    }
}
