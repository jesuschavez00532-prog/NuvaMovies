package com.efs.sdk.pa;

import android.content.Context;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.pa.config.ConfigManager;
import com.efs.sdk.pa.config.IEfsReporter;
import com.efs.sdk.pa.config.PackageLevel;
import com.efs.sdk.pa.p060a.C1774c;
import java.util.HashMap;

/* loaded from: classes.dex */
public class PAFactory {
    private static final long DEFAULT_TIME_OUT_TIME = 2000;
    private static final long INVALID_TIME_OUT_TIME = 0;
    private static final long MAX_TIME_OUT_TIME = 4000;
    private static final String TAG = "pafactory";
    static final ThreadLocal<InterfaceC1769PA> sThreadLocal = new ThreadLocal<>();
    private ConfigManager mConfigManager;
    private Context mContext;
    private HashMap<String, String> mExtend;
    private IPaClient mPaClient;
    private EfsReporter mReporter;
    private IEfsReporter mReporterFactory;
    private String mSerial;
    private String mSver;
    private long mTimeOutTime;
    private PATraceListener mTraceListener;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        private PackageLevel f7412a;

        /* renamed from: b */
        private IEfsReporter f7413b;

        /* renamed from: c */
        private boolean f7414c;

        /* renamed from: d */
        private Context f7415d;

        /* renamed from: e */
        private String f7416e;

        /* renamed from: f */
        private HashMap<String, String> f7417f;

        /* renamed from: g */
        private String f7418g;

        /* renamed from: h */
        private long f7419h = PAFactory.DEFAULT_TIME_OUT_TIME;

        /* renamed from: i */
        private PATraceListener f7420i;

        /* renamed from: j */
        private IPaClient f7421j;

        public Builder(Context context, IEfsReporter iEfsReporter) {
            if (context != null) {
                if (iEfsReporter != null) {
                    this.f7413b = iEfsReporter;
                    this.f7415d = context;
                    return;
                }
                throw new RuntimeException("reporter Should Not Empty");
            }
            throw new RuntimeException("context Should Not null");
        }

        public PAFactory build() {
            if (this.f7412a != null) {
                return new PAFactory(this.f7415d, this.f7412a, this.f7413b, this.f7414c, this.f7416e, this.f7417f, this.f7418g, this.f7419h, this.f7420i, this.f7421j);
            }
            throw new RuntimeException(String.format("%s Should Not Null", ""));
        }

        public Builder extendLogInfo(HashMap<String, String> hashMap) {
            this.f7417f = hashMap;
            return this;
        }

        public Builder isNewInstall(boolean z10) {
            this.f7414c = z10;
            return this;
        }

        public Builder packageLevel(PackageLevel packageLevel) {
            this.f7412a = packageLevel;
            return this;
        }

        public Builder serial(String str) {
            this.f7416e = str;
            return this;
        }

        public Builder setPaClient(IPaClient iPaClient) {
            this.f7421j = iPaClient;
            return this;
        }

        public Builder sver(String str) {
            this.f7418g = str;
            return this;
        }

        public Builder timeoutTime(long j10) {
            if (j10 <= 0) {
                Log.w(PAFactory.TAG, "Timeout time is invalid, and the default value 2s will be used");
                this.f7419h = PAFactory.DEFAULT_TIME_OUT_TIME;
            } else {
                if (j10 > PAFactory.MAX_TIME_OUT_TIME) {
                    Log.w(PAFactory.TAG, "Timeout time over 4s is not recommended, and the default value 2s will be used");
                    this.f7419h = PAFactory.DEFAULT_TIME_OUT_TIME;
                    return this;
                }
                this.f7419h = j10;
            }
            return this;
        }

        public Builder traceListener(PATraceListener pATraceListener) {
            this.f7420i = pATraceListener;
            return this;
        }
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    public Context getContext() {
        return this.mContext;
    }

    public HashMap<String, String> getExtend() {
        return this.mExtend;
    }

    public IPaClient getPaClient() {
        return this.mPaClient;
    }

    public synchronized InterfaceC1769PA getPaInstance() {
        InterfaceC1769PA interfaceC1769PA;
        ThreadLocal<InterfaceC1769PA> threadLocal = sThreadLocal;
        interfaceC1769PA = threadLocal.get();
        if (interfaceC1769PA == null) {
            interfaceC1769PA = new C1774c(this.mConfigManager.enableTracer());
            interfaceC1769PA.registerPAANRListener(this.mContext, new C1771a(this), this.mTimeOutTime);
            threadLocal.set(interfaceC1769PA);
        }
        return interfaceC1769PA;
    }

    public EfsReporter getReporter() {
        EfsReporter efsReporter;
        if (this.mReporter == null) {
            IEfsReporter iEfsReporter = this.mReporterFactory;
            if (iEfsReporter != null) {
                efsReporter = iEfsReporter.getReporter();
            } else {
                efsReporter = null;
            }
            this.mReporter = efsReporter;
        }
        return this.mReporter;
    }

    public String getSerial() {
        return this.mSerial;
    }

    public String getSver() {
        return this.mSver;
    }

    public PATraceListener getTraceListener() {
        return this.mTraceListener;
    }

    private PAFactory(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z10, String str, HashMap<String, String> hashMap, String str2, long j10, PATraceListener pATraceListener, IPaClient iPaClient) {
        this.mReporterFactory = iEfsReporter;
        this.mSerial = str;
        this.mExtend = hashMap;
        this.mSver = str2;
        this.mContext = context;
        this.mTraceListener = pATraceListener;
        this.mPaClient = iPaClient;
        this.mTimeOutTime = j10;
        this.mConfigManager = new ConfigManager(context, packageLevel, iEfsReporter, z10);
    }
}
