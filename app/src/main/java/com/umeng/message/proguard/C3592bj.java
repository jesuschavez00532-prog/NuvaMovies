package com.umeng.message.proguard;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;

/* renamed from: com.umeng.message.proguard.bj */
/* loaded from: classes3.dex */
public final class C3592bj {

    /* renamed from: a */
    private static Boolean f16072a;

    /* renamed from: b */
    private static int f16073b;

    /* renamed from: c */
    private static final Handler f16074c = new Handler(Looper.getMainLooper()) { // from class: com.umeng.message.proguard.bj.4
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (1 == i10) {
                C3592bj.m15419a(message.arg1);
                removeMessages(2);
                Message obtainMessage = obtainMessage(2);
                obtainMessage.obj = message.obj;
                message.obj = null;
                sendMessageDelayed(obtainMessage, 500L);
                return;
            }
            if (2 == i10) {
                final int i11 = C3592bj.f16073b;
                C3592bj.m15426c();
                final Context context = (Context) message.obj;
                message.obj = null;
                if (context == null) {
                    return;
                }
                C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.bj.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i12;
                        if (C3592bj.f16072a != null && !C3592bj.f16072a.booleanValue()) {
                            return;
                        }
                        try {
                            ComponentName m15420a = C3592bj.m15420a(context);
                            if (m15420a == null) {
                                Boolean unused = C3592bj.f16072a = Boolean.FALSE;
                                return;
                            }
                            Uri parse = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
                            try {
                                str = context.getContentResolver().getType(parse);
                            } catch (Throwable unused2) {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                parse = Uri.parse("content://com.hihonor.android.launcher.settings/badge/");
                                str = context.getContentResolver().getType(parse);
                            }
                            if (str == null) {
                                Boolean unused3 = C3592bj.f16072a = Boolean.FALSE;
                                return;
                            }
                            UPLog.m15198i("Badge", "hw changeBadgeNum:", Integer.valueOf(i11));
                            Bundle bundle = new Bundle();
                            bundle.putString(Constants.KEY_PACKAGE, m15420a.getPackageName());
                            bundle.putString("class", m15420a.getClassName());
                            Bundle call = context.getContentResolver().call(parse, "getbadgeNumber", (String) null, bundle);
                            if (call != null) {
                                i12 = call.getInt("badgenumber", 0);
                            } else {
                                i12 = 0;
                            }
                            int max = Math.max(0, i11 + i12);
                            if (i12 != max) {
                                bundle.putInt("badgenumber", max);
                                context.getContentResolver().call(parse, "change_badge", (String) null, bundle);
                            }
                            UPLog.m15198i("Badge", "hw changeBadgeNum cur:", Integer.valueOf(max), "last:", Integer.valueOf(i12));
                            Boolean unused4 = C3592bj.f16072a = Boolean.TRUE;
                        } catch (Throwable unused5) {
                            Boolean unused6 = C3592bj.f16072a = Boolean.FALSE;
                        }
                    }
                });
            }
        }
    };

    /* renamed from: a */
    static /* synthetic */ int m15419a(int i10) {
        int i11 = f16073b + i10;
        f16073b = i11;
        return i11;
    }

    /* renamed from: c */
    static /* synthetic */ int m15426c() {
        f16073b = 0;
        return 0;
    }

    /* renamed from: b */
    public static void m15425b(Context context, int i10) {
        Boolean bool = f16072a;
        if (bool == null || bool.booleanValue()) {
            String str = Build.MANUFACTURER;
            if ("huawei".equalsIgnoreCase(str) || UPushThirdTokenCallback.TYPE_HONOR.equalsIgnoreCase(str)) {
                Handler handler = f16074c;
                Message obtainMessage = handler.obtainMessage(1);
                obtainMessage.arg1 = i10;
                obtainMessage.obj = context;
                handler.sendMessage(obtainMessage);
            }
        }
    }

    /* renamed from: a */
    public static void m15423a(final Context context, final int i10) {
        Boolean bool = f16072a;
        if (bool == null || bool.booleanValue()) {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if ("oppo".equalsIgnoreCase(str)) {
                C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.bj.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (C3592bj.f16072a != null && !C3592bj.f16072a.booleanValue()) {
                            return;
                        }
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putInt("app_badge_count", i10);
                            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
                            UPLog.m15198i("Badge", "oppo setBadgeNum:", Integer.valueOf(i10));
                            Boolean unused = C3592bj.f16072a = Boolean.TRUE;
                        } catch (Throwable unused2) {
                            Boolean unused3 = C3592bj.f16072a = Boolean.FALSE;
                        }
                    }
                });
                return;
            }
            if ("vivo".equalsIgnoreCase(str)) {
                C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.bj.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (C3592bj.f16072a != null && !C3592bj.f16072a.booleanValue()) {
                            return;
                        }
                        try {
                            ComponentName m15420a = C3592bj.m15420a(context);
                            if (m15420a == null) {
                                Boolean unused = C3592bj.f16072a = Boolean.FALSE;
                                return;
                            }
                            Intent intent = new Intent();
                            intent.setAction("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                            intent.putExtra(Constants.KEY_PACKAGE_NAME, m15420a.getPackageName());
                            intent.putExtra("className", m15420a.getClassName());
                            intent.putExtra("notificationNum", i10);
                            if (Build.VERSION.SDK_INT >= 26) {
                                intent.addFlags(16777216);
                            }
                            context.sendBroadcast(intent);
                            UPLog.m15198i("Badge", "vivo setBadgeNum:", Integer.valueOf(i10));
                            Boolean unused2 = C3592bj.f16072a = Boolean.TRUE;
                        } catch (Throwable unused3) {
                            Boolean unused4 = C3592bj.f16072a = Boolean.FALSE;
                        }
                    }
                });
            } else if ("huawei".equalsIgnoreCase(str) || UPushThirdTokenCallback.TYPE_HONOR.equalsIgnoreCase(str)) {
                C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.bj.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2;
                        if (C3592bj.f16072a != null && !C3592bj.f16072a.booleanValue()) {
                            return;
                        }
                        try {
                            Uri parse = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
                            try {
                                str2 = context.getContentResolver().getType(parse);
                            } catch (Throwable unused) {
                                str2 = null;
                            }
                            if (TextUtils.isEmpty(str2)) {
                                parse = Uri.parse("content://com.hihonor.android.launcher.settings/badge/");
                                str2 = context.getContentResolver().getType(parse);
                            }
                            if (str2 == null) {
                                Boolean unused2 = C3592bj.f16072a = Boolean.FALSE;
                                return;
                            }
                            ComponentName m15420a = C3592bj.m15420a(context);
                            if (m15420a == null) {
                                Boolean unused3 = C3592bj.f16072a = Boolean.FALSE;
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString(Constants.KEY_PACKAGE, m15420a.getPackageName());
                            bundle.putString("class", m15420a.getClassName());
                            bundle.putInt("badgenumber", i10);
                            context.getContentResolver().call(parse, "change_badge", (String) null, bundle);
                            UPLog.m15198i("Badge", "hw setBadgeNum:", Integer.valueOf(i10));
                            Boolean unused4 = C3592bj.f16072a = Boolean.TRUE;
                        } catch (Throwable unused5) {
                            Boolean unused6 = C3592bj.f16072a = Boolean.FALSE;
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ ComponentName m15420a(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            return launchIntentForPackage.getComponent();
        }
        return null;
    }
}
