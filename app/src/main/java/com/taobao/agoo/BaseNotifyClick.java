package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3198k;
import com.taobao.agoo.BaseNotifyClickActivity;
import java.util.Iterator;
import java.util.Set;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public abstract class BaseNotifyClick {
    private static final String TAG = "BaseNotifyClick";
    private AgooFactory agooFactory;
    private Context context;
    private String msgSource;
    private NotifManager notifyManager;

    private void buildMessage(Intent intent) {
        ThreadPoolExecutorFactory.execute(new RunnableC3212a(this, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String parseMsgByThirdPush(Intent intent) {
        String parseMsgFromIntent;
        Set<BaseNotifyClickActivity.INotifyListener> set = BaseNotifyClickActivity.notifyListeners;
        if (set != null && set.size() > 0) {
            Iterator<BaseNotifyClickActivity.INotifyListener> it = BaseNotifyClickActivity.notifyListeners.iterator();
            parseMsgFromIntent = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BaseNotifyClickActivity.INotifyListener next = it.next();
                String parseMsgFromIntent2 = next.parseMsgFromIntent(intent);
                if (!TextUtils.isEmpty(parseMsgFromIntent2)) {
                    this.msgSource = next.getMsgSource();
                    parseMsgFromIntent = parseMsgFromIntent2;
                    break;
                }
                parseMsgFromIntent = parseMsgFromIntent2;
            }
        } else {
            ALog.m12940e(TAG, "no impl, try use default impl to parse intent!", new Object[0]);
            BaseNotifyClickActivity.INotifyListener c3219b = new C3219b();
            parseMsgFromIntent = c3219b.parseMsgFromIntent(intent);
            if (TextUtils.isEmpty(parseMsgFromIntent)) {
                c3219b = new C3223f();
                parseMsgFromIntent = c3219b.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(parseMsgFromIntent)) {
                c3219b = new C3221d();
                parseMsgFromIntent = c3219b.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(parseMsgFromIntent)) {
                c3219b = new C3222e();
                parseMsgFromIntent = c3219b.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(parseMsgFromIntent)) {
                c3219b = new C3220c();
                parseMsgFromIntent = c3219b.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(parseMsgFromIntent)) {
                C3198k.m13010a("accs", "error", "parse 3push error", 0.0d);
            } else {
                this.msgSource = c3219b.getMsgSource();
                C3198k.m13010a("accs", "error", "parse 3push default " + this.msgSource, 0.0d);
            }
        }
        ALog.m12941i(TAG, "parseMsgByThirdPush", "result", parseMsgFromIntent, "msgSource", this.msgSource);
        return parseMsgFromIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportClickNotifyMsg(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("id");
            String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            String stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_REPORT);
            String stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            MsgDO msgDO = new MsgDO();
            msgDO.msgIds = stringExtra;
            msgDO.extData = stringExtra4;
            msgDO.messageSource = stringExtra2;
            msgDO.reportStr = stringExtra3;
            msgDO.msgStatus = MessageService.MSG_ACCS_NOTIFY_CLICK;
            ALog.m12941i(TAG, "reportClickNotifyMsg messageId:" + stringExtra + " source:" + stringExtra2 + " reportStr:" + stringExtra3 + " status:" + msgDO.msgStatus, new Object[0]);
            this.notifyManager.report(msgDO, null);
        } catch (Exception e10) {
            ALog.m12940e(TAG, "reportClickNotifyMsg exception: " + e10, new Object[0]);
        }
    }

    public void onCreate(Context context, Intent intent) {
        ALog.m12941i(TAG, "onCreate", new Object[0]);
        this.context = context;
        buildMessage(intent);
    }

    public abstract void onMessage(Intent intent);

    public void onNewIntent(Intent intent) {
        ALog.m12941i(TAG, "onNewIntent", new Object[0]);
        buildMessage(intent);
    }
}
