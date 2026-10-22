package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.security.C0960c;
import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.umeng.analytics.pro.C3309bd;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Config {

    /* renamed from: b */
    private String f3701b;

    /* renamed from: c */
    private String f3702c;

    /* renamed from: d */
    private ENV f3703d = ENV.ONLINE;

    /* renamed from: e */
    private ISecurity f3704e;

    /* renamed from: a */
    private static Map<String, Config> f3700a = new HashMap();
    public static final Config DEFAULT_CONFIG = new Builder().setTag("[default]").setAppkey("[default]").setEnv(ENV.ONLINE).build();

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        private String f3705a;

        /* renamed from: b */
        private String f3706b;

        /* renamed from: c */
        private ENV f3707c = ENV.ONLINE;

        /* renamed from: d */
        private String f3708d;

        /* renamed from: e */
        private String f3709e;

        public Config build() {
            if (!TextUtils.isEmpty(this.f3706b)) {
                synchronized (Config.f3700a) {
                    for (Config config : Config.f3700a.values()) {
                        if (config.f3703d == this.f3707c && config.f3702c.equals(this.f3706b)) {
                            ALog.m4790w("awcn.Config", "duplicated config exist!", null, "appkey", this.f3706b, C3309bd.f14094a, this.f3707c);
                            if (!TextUtils.isEmpty(this.f3705a)) {
                                Config.f3700a.put(this.f3705a, config);
                            }
                            return config;
                        }
                    }
                    Config config2 = new Config();
                    config2.f3702c = this.f3706b;
                    config2.f3703d = this.f3707c;
                    if (TextUtils.isEmpty(this.f3705a)) {
                        config2.f3701b = StringUtils.concatString(this.f3706b, "$", this.f3707c.toString());
                    } else {
                        config2.f3701b = this.f3705a;
                    }
                    if (!TextUtils.isEmpty(this.f3709e)) {
                        config2.f3704e = C0960c.m4645a().createNonSecurity(this.f3709e);
                    } else {
                        config2.f3704e = C0960c.m4645a().createSecurity(this.f3708d);
                    }
                    synchronized (Config.f3700a) {
                        Config.f3700a.put(config2.f3701b, config2);
                    }
                    return config2;
                }
            }
            throw new RuntimeException("appkey can not be null or empty!");
        }

        public Builder setAppSecret(String str) {
            this.f3709e = str;
            return this;
        }

        public Builder setAppkey(String str) {
            this.f3706b = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            this.f3708d = str;
            return this;
        }

        public Builder setEnv(ENV env) {
            this.f3707c = env;
            return this;
        }

        public Builder setTag(String str) {
            this.f3705a = str;
            return this;
        }
    }

    protected Config() {
    }

    public static Config getConfig(String str, ENV env) {
        synchronized (f3700a) {
            for (Config config : f3700a.values()) {
                if (config.f3703d == env && config.f3702c.equals(str)) {
                    return config;
                }
            }
            return null;
        }
    }

    public static Config getConfigByTag(String str) {
        Config config;
        synchronized (f3700a) {
            config = f3700a.get(str);
        }
        return config;
    }

    public String getAppkey() {
        return this.f3702c;
    }

    public ENV getEnv() {
        return this.f3703d;
    }

    public ISecurity getSecurity() {
        return this.f3704e;
    }

    public String getTag() {
        return this.f3701b;
    }

    public String toString() {
        return this.f3701b;
    }
}
