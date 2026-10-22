package org.android.agoo.control;

import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.Iterator;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.android.agoo.control.c */
/* loaded from: classes3.dex */
public class RunnableC6043c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AgooFactory f23702a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6043c(AgooFactory agooFactory) {
        this.f23702a = agooFactory;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessageService messageService;
        messageService = this.f23702a.messageService;
        ArrayList<MsgDO> m24217b = messageService.m24217b();
        if (m24217b != null && m24217b.size() > 0) {
            ALog.m12940e("AgooFactory", "reportCacheMsg", "size", Integer.valueOf(m24217b.size()));
            Iterator<MsgDO> it = m24217b.iterator();
            while (it.hasNext()) {
                MsgDO next = it.next();
                if (next != null) {
                    next.isFromCache = true;
                    this.f23702a.notifyManager.report(next, null);
                }
            }
        }
    }
}
