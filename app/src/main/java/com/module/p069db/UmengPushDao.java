package com.module.p069db;

import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.lzy.okgo.model.Progress;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import org.xutils.C6127x;
import org.xutils.DbManager;
import org.xutils.common.util.KeyValue;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p275ex.DbException;

/* loaded from: classes2.dex */
public final class UmengPushDao {
    private final InterfaceC1312h db$delegate;
    private final String TAG = "UmengPushDao";
    private final String MESSAGE_DB_NAME = "user_message.db";

    public UmengPushDao() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new UmengPushDao$db$2(this));
        this.db$delegate = m5965b;
    }

    private final DbManager getDb() {
        return (DbManager) this.db$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDbManager$lambda$0(DbManager dbManager, int i10, int i11) {
    }

    public static /* synthetic */ void updateMessageStatusByMsgId$default(UmengPushDao umengPushDao, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = UmengPush.ALREADY_READ;
            AbstractC5868k.m23673e(str2, "ALREADY_READ");
        }
        umengPushDao.updateMessageStatusByMsgId(str, str2);
    }

    public final void addMessage(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
        try {
            getDb().saveOrUpdate(umengPush);
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    public final void addOrUpdateUpgradeMessage(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
        try {
            String msgId = umengPush.getMsgId();
            AbstractC5868k.m23673e(msgId, "message.msgId");
            if (queryMessageByMsgId(msgId) == null) {
                getDb().save(umengPush);
            } else {
                getDb().update(UmengPush.class, WhereBuilder.m24391b("msgId", Operator.Operation.EQUALS, umengPush.getMsgId()), new KeyValue("messageTime", umengPush.getMessageTime()), new KeyValue(Progress.STATUS, umengPush.getStatus()), new KeyValue("text", umengPush.getText()));
            }
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    public final void deleteAllMessage() {
        try {
            getDb().delete(UmengPush.class);
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    public final void deleteMessage(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
        try {
            getDb().delete(umengPush);
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    public final void deleteMessageByMsgId(String str) {
        AbstractC5868k.m23674f(str, "msgId");
        try {
            getDb().delete(UmengPush.class, WhereBuilder.m24391b("msgId", Operator.Operation.EQUALS, str));
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }

    public final DbManager getDbManager(String str) {
        AbstractC5868k.m23674f(str, "dbName");
        DbManager db2 = C6127x.getDb(new DbManager.DaoConfig().setDbName(str).setDbVersion(1).setDbUpgradeListener(new DbManager.DbUpgradeListener() { // from class: com.module.db.a
            @Override // org.xutils.DbManager.DbUpgradeListener
            public final void onUpgrade(DbManager dbManager, int i10, int i11) {
                UmengPushDao.getDbManager$lambda$0(dbManager, i10, i11);
            }
        }));
        AbstractC5868k.m23673e(db2, "getDb(daoConfig)");
        return db2;
    }

    public final List<UmengPush> queryAllMessage() {
        List<UmengPush> list;
        try {
            list = getDb().selector(UmengPush.class).orderBy("messageTime", true).findAll();
        } catch (Exception e10) {
            e10.printStackTrace();
            list = null;
        }
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final UmengPush queryMessageByMsgId(String str) {
        AbstractC5868k.m23674f(str, "msgId");
        try {
            return (UmengPush) getDb().selector(UmengPush.class).where("msgId", Operator.Operation.EQUALS, str).findFirst();
        } catch (DbException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final int queryMessageTotal() {
        try {
            List findAll = getDb().findAll(UmengPush.class);
            if (findAll == null) {
                return 0;
            }
            return findAll.size();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final int queryMessageUnReadSize() {
        try {
            List findAll = getDb().selector(UmengPush.class).where(Progress.STATUS, Operator.Operation.EQUALS, MessageService.MSG_DB_READY_REPORT).findAll();
            if (findAll == null) {
                return 0;
            }
            return findAll.size();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final void updateMessageStatusByMsgId(String str, String str2) {
        AbstractC5868k.m23674f(str, "msgId");
        AbstractC5868k.m23674f(str2, Progress.STATUS);
        try {
            getDb().update(UmengPush.class, WhereBuilder.m24391b("msgId", Operator.Operation.EQUALS, str), new KeyValue(Progress.STATUS, str2));
        } catch (DbException e10) {
            e10.printStackTrace();
        }
    }
}
