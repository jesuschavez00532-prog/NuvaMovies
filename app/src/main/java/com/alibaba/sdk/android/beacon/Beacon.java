package com.alibaba.sdk.android.beacon;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.lzy.okgo.OkGo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Beacon {

    /* renamed from: a */
    private final C1520b f5861a;

    /* loaded from: classes.dex */
    private final class BeaconHandler extends Handler {
        BeaconHandler(Looper looper) {
            super(looper);
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        String mAppKey;
        String mAppSecret;
        Map<String, String> mExtras = new HashMap();
        long mLoopInterval = 300000;

        public Builder appKey(String str) {
            this.mAppKey = str.trim();
            return this;
        }

        public Builder appSecret(String str) {
            this.mAppSecret = str.trim();
            return this;
        }

        public Beacon build() {
            return new Beacon(this);
        }

        public Builder extras(Map<String, String> map) {
            this.mExtras.putAll(map);
            return this;
        }

        public Builder loopInterval(long j10) {
            if (j10 < OkGo.DEFAULT_MILLISECONDS) {
                this.mLoopInterval = OkGo.DEFAULT_MILLISECONDS;
            } else {
                this.mLoopInterval = j10;
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class Config {
        public final String key;
        public final String value;

        public Config(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    /* loaded from: classes.dex */
    public static final class Error {
        public final String errCode;
        public final String errMsg;

        Error(String str, String str2) {
            this.errCode = str;
            this.errMsg = str2;
        }
    }

    /* loaded from: classes.dex */
    public interface OnServiceErrListener {
        void onErr(Error error);
    }

    /* loaded from: classes.dex */
    public interface OnUpdateListener {
        void onUpdate(List<Config> list);
    }

    private Beacon(Builder builder) {
        this.f5861a = new C1520b(this);
    }

    public static final void setPrepare(boolean z10) {
        C1519a.f5862a = z10;
    }

    public void addServiceErrListener(OnServiceErrListener onServiceErrListener) {
    }

    public void addUpdateListener(OnUpdateListener onUpdateListener) {
    }

    public List<Config> getConfigs() {
        return this.f5861a.m7053a();
    }

    public void start(Context context) {
    }

    public void stop() {
    }
}
