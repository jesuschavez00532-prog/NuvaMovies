package com.taobao.accs.net;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Calendar;

/* renamed from: com.taobao.accs.net.e */
/* loaded from: classes.dex */
class C3160e extends AbstractC3162g {

    /* renamed from: c */
    private PendingIntent f13001c;

    /* renamed from: d */
    private AlarmManager f13002d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3160e(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.AbstractC3162g
    /* renamed from: a */
    protected void mo12869a(int i10) {
        int i11;
        if (!GlobalConfig.isAlarmHeartbeatEnable()) {
            return;
        }
        if (this.f13002d == null) {
            this.f13002d = (AlarmManager) this.f13006a.getSystemService("alarm");
        }
        if (this.f13002d == null) {
            ALog.m12940e("AlarmHeartBeatMgr", "setInner null", new Object[0]);
            return;
        }
        if (this.f13001c == null) {
            Intent intent = new Intent();
            intent.setPackage(this.f13006a.getPackageName());
            intent.addFlags(32);
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", 201);
            if (Build.VERSION.SDK_INT >= 23) {
                i11 = 67108864;
            } else {
                i11 = 0;
            }
            this.f13001c = PendingIntent.getBroadcast(this.f13006a, 0, intent, i11);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(13, i10);
        this.f13002d.set(0, calendar.getTimeInMillis(), this.f13001c);
    }
}
