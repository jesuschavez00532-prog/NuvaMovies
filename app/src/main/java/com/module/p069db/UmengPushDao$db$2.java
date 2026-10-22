package com.module.p069db;

import me.InterfaceC5642a;
import ne.AbstractC5869l;
import org.xutils.DbManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UmengPushDao$db$2 extends AbstractC5869l implements InterfaceC5642a {
    final /* synthetic */ UmengPushDao this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UmengPushDao$db$2(UmengPushDao umengPushDao) {
        super(0);
        this.this$0 = umengPushDao;
    }

    @Override // me.InterfaceC5642a
    public final DbManager invoke() {
        String str;
        UmengPushDao umengPushDao = this.this$0;
        str = umengPushDao.MESSAGE_DB_NAME;
        return umengPushDao.getDbManager(str);
    }
}
