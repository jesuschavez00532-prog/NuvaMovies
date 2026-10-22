package com.taobao.accs;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.lzy.okgo.cache.CacheEntity;
import com.taobao.accs.base.BaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

/* loaded from: classes.dex */
public class ChannelService extends BaseService {
    public static final int DEFAULT_FORGROUND_V = 21;
    static final int NOTIFY_ID = 9371;
    public static int SDK_VERSION_CODE = 221;
    public static final String SUPPORT_FOREGROUND_VERSION_KEY = "support_foreground_v";
    static final String TAG = "ChannelService";
    private static ChannelService mInstance;
    private boolean mFristStarted = true;

    /* loaded from: classes.dex */
    public static class KernelService extends Service {

        /* renamed from: a */
        private static KernelService f12825a;

        /* renamed from: b */
        private Context f12826b;

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            f12825a = this;
            this.f12826b = getApplicationContext();
        }

        @Override // android.app.Service
        public void onDestroy() {
            try {
                stopForeground(true);
            } catch (Throwable th) {
                ALog.m12939e(ChannelService.TAG, "onDestroy", th, new Object[0]);
            }
            f12825a = null;
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i10, int i11) {
            try {
                ThreadPoolExecutorFactory.execute(new RunnableC3113a(this));
                return 2;
            } catch (Throwable th) {
                ALog.m12939e(ChannelService.TAG, " onStartCommand", th, new Object[0]);
                return 2;
            }
        }
    }

    public static ChannelService getInstance() {
        return mInstance;
    }

    static int getSupportForegroundVer(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(SUPPORT_FOREGROUND_VERSION_KEY, 21);
        } catch (Throwable th) {
            ALog.m12939e(TAG, "getSupportForegroundVer fail:", th, CacheEntity.KEY, SUPPORT_FOREGROUND_VERSION_KEY);
            return 21;
        }
    }

    static void startKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, (Class<?>) KernelService.class);
                intent.setPackage(context.getPackageName());
                context.startService(intent);
            }
        } catch (Throwable th) {
            ALog.m12939e(TAG, "startKernel", th, new Object[0]);
        }
    }

    static void stopKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, (Class<?>) KernelService.class);
                intent.setPackage(context.getPackageName());
                context.stopService(intent);
            }
        } catch (Throwable th) {
            ALog.m12939e(TAG, "stopKernel", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public void onCreate() {
        super.onCreate();
        GlobalClientInfo.f12843a = getApplicationContext();
        mInstance = this;
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public void onDestroy() {
        stopKernel(getApplicationContext());
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.mFristStarted) {
            this.mFristStarted = false;
            startKernel(getApplicationContext());
        }
        return super.onStartCommand(intent, i10, i11);
    }
}
