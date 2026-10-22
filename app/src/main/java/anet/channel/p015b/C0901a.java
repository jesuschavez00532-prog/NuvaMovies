package anet.channel.p015b;

import android.support.v4.media.session.AbstractC0272b;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.taobao.alivfssdk.cache.AVFSCache;
import com.taobao.alivfssdk.cache.AVFSCacheConfig;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.IAVFSCache;
import p183j0.InterfaceC4967a;

/* renamed from: anet.channel.b.a */
/* loaded from: classes.dex */
public class C0901a implements InterfaceC4967a {

    /* renamed from: a */
    private static boolean f3797a = true;

    /* renamed from: b */
    private static Object f3798b;

    /* renamed from: c */
    private static Object f3799c;

    /* renamed from: d */
    private static Object f3800d;

    static {
        try {
            Class.forName("com.taobao.alivfssdk.cache.AVFSCacheManager");
            f3798b = new C0902b();
            f3799c = new C0903c();
            f3800d = new C0904d();
        } catch (ClassNotFoundException unused) {
            f3797a = false;
            ALog.m4790w("anet.AVFSCacheImpl", "no alivfs sdk!", null, new Object[0]);
        }
    }

    /* renamed from: b */
    private IAVFSCache m4508b() {
        AVFSCache cacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache");
        if (cacheForModule != null) {
            return cacheForModule.getFileCache();
        }
        return null;
    }

    /* renamed from: a */
    public void m4509a() {
        AVFSCache cacheForModule;
        if (f3797a && (cacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache")) != null) {
            AVFSCacheConfig aVFSCacheConfig = new AVFSCacheConfig();
            aVFSCacheConfig.limitSize = 5242880L;
            aVFSCacheConfig.fileMemMaxSize = 1048576L;
            cacheForModule.moduleConfig(aVFSCacheConfig);
        }
    }

    @Override // p183j0.InterfaceC4967a
    public void clear() {
        if (!f3797a) {
            return;
        }
        try {
            IAVFSCache m4508b = m4508b();
            if (m4508b != null) {
                m4508b.removeAllObject((IAVFSCache.OnAllObjectRemoveCallback) f3800d);
            }
        } catch (Exception e10) {
            ALog.m4786e("anet.AVFSCacheImpl", "clear cache failed", null, e10, new Object[0]);
        }
    }

    public InterfaceC4967a.a get(String str) {
        if (!f3797a) {
            return null;
        }
        try {
            IAVFSCache m4508b = m4508b();
            if (m4508b != null) {
                AbstractC0272b.m941a(m4508b.objectForKey(StringUtils.md5ToHex(str)));
                return null;
            }
        } catch (Exception e10) {
            ALog.m4786e("anet.AVFSCacheImpl", "get cache failed", null, e10, new Object[0]);
        }
        return null;
    }

    public void put(String str, InterfaceC4967a.a aVar) {
        if (!f3797a) {
            return;
        }
        try {
            IAVFSCache m4508b = m4508b();
            if (m4508b != null) {
                m4508b.setObjectForKey(StringUtils.md5ToHex(str), aVar, (IAVFSCache.OnObjectSetCallback) f3798b);
            }
        } catch (Exception e10) {
            ALog.m4786e("anet.AVFSCacheImpl", "put cache failed", null, e10, new Object[0]);
        }
    }

    public void remove(String str) {
        if (!f3797a) {
            return;
        }
        try {
            IAVFSCache m4508b = m4508b();
            if (m4508b != null) {
                m4508b.removeObjectForKey(StringUtils.md5ToHex(str), (IAVFSCache.OnObjectRemoveCallback) f3799c);
            }
        } catch (Exception e10) {
            ALog.m4786e("anet.AVFSCacheImpl", "remove cache failed", null, e10, new Object[0]);
        }
    }
}
