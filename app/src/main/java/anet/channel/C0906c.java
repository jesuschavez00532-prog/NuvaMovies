package anet.channel;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.c */
/* loaded from: classes.dex */
class C0906c {

    /* renamed from: a */
    Map<String, Integer> f3806a = new HashMap();

    /* renamed from: b */
    Map<String, SessionInfo> f3807b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4515a(SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            if (!TextUtils.isEmpty(sessionInfo.host)) {
                this.f3807b.put(sessionInfo.host, sessionInfo);
                return;
            }
            throw new IllegalArgumentException("host cannot be null or empty");
        }
        throw new NullPointerException("info is null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public SessionInfo m4517b(String str) {
        return this.f3807b.get(str);
    }

    /* renamed from: c */
    public int m4518c(String str) {
        Integer num;
        synchronized (this.f3806a) {
            num = this.f3806a.get(str);
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public SessionInfo m4513a(String str) {
        return this.f3807b.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Collection<SessionInfo> m4514a() {
        return this.f3807b.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4516a(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f3806a) {
                this.f3806a.put(str, Integer.valueOf(i10));
            }
            return;
        }
        throw new IllegalArgumentException("host cannot be null or empty");
    }
}
