package com.p077uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.lzy.okgo.cache.CacheEntity;
import com.p077uc.crashsdk.export.ICrashClient;
import com.p077uc.crashsdk.p078a.C3251a;
import com.p077uc.crashsdk.p078a.C3257g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.uc.crashsdk.d */
/* loaded from: classes3.dex */
public final class C3261d {

    /* renamed from: a */
    private static ICrashClient f13766a = null;

    /* renamed from: b */
    private static int f13767b = 3;

    /* renamed from: c */
    private static volatile List<ValueCallback<Bundle>> f13768c;

    /* renamed from: d */
    private static volatile List<ValueCallback<Bundle>> f13769d;

    /* renamed from: e */
    private static volatile List<ValueCallback<Bundle>> f13770e;

    /* renamed from: f */
    private static volatile List<ValueCallback<Bundle>> f13771f;

    /* renamed from: g */
    private static final Object f13772g = new Object();

    /* renamed from: a */
    public static void m13373a(ICrashClient iCrashClient) {
        f13766a = iCrashClient;
    }

    /* renamed from: b */
    public static boolean m13378b(ValueCallback<Bundle> valueCallback) {
        if (f13769d == null) {
            synchronized (f13772g) {
                if (f13769d == null) {
                    f13769d = new ArrayList();
                }
            }
        }
        synchronized (f13769d) {
            if (f13769d.size() >= f13767b) {
                return false;
            }
            f13769d.add(valueCallback);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m13379c(ValueCallback<Bundle> valueCallback) {
        if (f13770e == null) {
            synchronized (f13772g) {
                if (f13770e == null) {
                    f13770e = new ArrayList();
                }
            }
        }
        synchronized (f13770e) {
            if (f13770e.size() >= f13767b) {
                return false;
            }
            f13770e.add(valueCallback);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m13380d(ValueCallback<Bundle> valueCallback) {
        if (f13771f == null) {
            synchronized (f13772g) {
                if (f13771f == null) {
                    f13771f = new ArrayList();
                }
            }
        }
        synchronized (f13771f) {
            if (f13771f.size() >= f13767b) {
                return false;
            }
            f13771f.add(valueCallback);
            return true;
        }
    }

    /* renamed from: a */
    public static void m13375a(String str, String str2, String str3) {
        if (C3257g.m13225a(str)) {
            C3251a.m13169a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean equals = C3262e.m13481h().equals(str2);
        if (f13766a != null) {
            File file = new File(str);
            try {
                if (equals) {
                    f13766a.onLogGenerated(file, str3);
                } else {
                    f13766a.onClientProcessLogGenerated(str2, file, str3);
                }
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
        }
        List<ValueCallback<Bundle>> list = f13768c;
        if (!equals) {
            list = f13769d;
        }
        if (list != null) {
            synchronized (list) {
                for (ValueCallback<Bundle> valueCallback : list) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("filePathName", str);
                        if (!equals) {
                            bundle.putString("processName", str2);
                        }
                        bundle.putString("logType", str3);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C3257g.m13220a(th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static File m13371a(File file) {
        ICrashClient iCrashClient = f13766a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
        }
        return file;
    }

    /* renamed from: a */
    public static void m13376a(boolean z10) {
        ICrashClient iCrashClient = f13766a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z10);
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
        }
        if (f13770e != null) {
            synchronized (f13770e) {
                for (ValueCallback<Bundle> valueCallback : f13770e) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isJava", z10);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C3257g.m13220a(th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m13374a(String str, int i10, int i11) {
        ICrashClient iCrashClient = f13766a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i10, i11);
        }
        if (f13771f != null) {
            synchronized (f13771f) {
                for (ValueCallback<Bundle> valueCallback : f13771f) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("processName", str);
                        bundle.putInt(CacheEntity.KEY, i10);
                        bundle.putInt("count", i11);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th) {
                        C3257g.m13220a(th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m13372a(String str, boolean z10) {
        ICrashClient iCrashClient = f13766a;
        return iCrashClient != null ? iCrashClient.onGetCallbackInfo(str, z10) : "";
    }

    /* renamed from: a */
    public static boolean m13377a(ValueCallback<Bundle> valueCallback) {
        if (f13768c == null) {
            synchronized (f13772g) {
                if (f13768c == null) {
                    f13768c = new ArrayList();
                }
            }
        }
        synchronized (f13768c) {
            if (f13768c.size() >= f13767b) {
                return false;
            }
            f13768c.add(valueCallback);
            return true;
        }
    }
}
