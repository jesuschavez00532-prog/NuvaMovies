package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.agoo.a */
/* loaded from: classes.dex */
public class RunnableC3212a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f13226a;

    /* renamed from: b */
    final /* synthetic */ BaseNotifyClick f13227b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3212a(BaseNotifyClick baseNotifyClick, Intent intent) {
        this.f13227b = baseNotifyClick;
        this.f13226a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        String parseMsgByThirdPush;
        String str;
        String str2;
        NotifManager notifManager;
        AgooFactory agooFactory;
        AgooFactory agooFactory2;
        String str3;
        AgooFactory agooFactory3;
        AgooFactory agooFactory4;
        Context context;
        NotifManager notifManager2;
        Intent intent = null;
        try {
            Intent intent2 = this.f13226a;
            if (intent2 != null) {
                parseMsgByThirdPush = this.f13227b.parseMsgByThirdPush(intent2);
                if (!TextUtils.isEmpty(parseMsgByThirdPush)) {
                    str2 = this.f13227b.msgSource;
                    if (!TextUtils.isEmpty(str2)) {
                        notifManager = this.f13227b.notifyManager;
                        if (notifManager == null) {
                            this.f13227b.notifyManager = new NotifManager();
                        }
                        agooFactory = this.f13227b.agooFactory;
                        if (agooFactory == null) {
                            this.f13227b.agooFactory = new AgooFactory();
                            agooFactory4 = this.f13227b.agooFactory;
                            context = this.f13227b.context;
                            notifManager2 = this.f13227b.notifyManager;
                            agooFactory4.init(context, notifManager2, null);
                        }
                        agooFactory2 = this.f13227b.agooFactory;
                        byte[] bytes = parseMsgByThirdPush.getBytes(Request.DEFAULT_CHARSET);
                        str3 = this.f13227b.msgSource;
                        Bundle msgReceiverPreHandler = agooFactory2.msgReceiverPreHandler(bytes, str3, null, false);
                        String string = msgReceiverPreHandler.getString("body");
                        ALog.m12941i("BaseNotifyClick", "begin parse EncryptedMsg", new Object[0]);
                        String parseEncryptedMsg = AgooFactory.parseEncryptedMsg(string);
                        int i10 = msgReceiverPreHandler.getInt("channel", -1);
                        if (!TextUtils.isEmpty(parseEncryptedMsg)) {
                            msgReceiverPreHandler.putString("body", parseEncryptedMsg);
                            msgReceiverPreHandler.putInt("channel", i10);
                        } else {
                            ALog.m12940e("BaseNotifyClick", "parse EncryptedMsg fail, empty", new Object[0]);
                        }
                        Intent intent3 = new Intent();
                        try {
                            intent3.putExtras(msgReceiverPreHandler);
                            agooFactory3 = this.f13227b.agooFactory;
                            agooFactory3.saveMsg(parseMsgByThirdPush.getBytes(Request.DEFAULT_CHARSET), "2");
                            this.f13227b.reportClickNotifyMsg(intent3);
                            intent = intent3;
                        } catch (Throwable th) {
                            intent = intent3;
                            th = th;
                            try {
                                ALog.m12939e("BaseNotifyClick", "buildMessage", th, new Object[0]);
                                try {
                                    this.f13227b.onMessage(intent);
                                    return;
                                } catch (Throwable th2) {
                                    ALog.m12939e("BaseNotifyClick", "onMessage", th2, new Object[0]);
                                    return;
                                }
                            } catch (Throwable th3) {
                                try {
                                    this.f13227b.onMessage(intent);
                                } catch (Throwable th4) {
                                    ALog.m12939e("BaseNotifyClick", "onMessage", th4, new Object[0]);
                                }
                                throw th3;
                            }
                        }
                    }
                }
                str = this.f13227b.msgSource;
                ALog.m12940e("BaseNotifyClick", "parseMsgFromNotifyListener null!!", "source", str);
            }
            try {
                this.f13227b.onMessage(intent);
            } catch (Throwable th5) {
                ALog.m12939e("BaseNotifyClick", "onMessage", th5, new Object[0]);
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
