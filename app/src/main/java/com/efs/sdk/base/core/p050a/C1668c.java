package com.efs.sdk.base.core.p050a;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.EfsConstant;
import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.PackageUtil;
import com.efs.sdk.base.core.util.secure.C1724a;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: com.efs.sdk.base.core.a.c */
/* loaded from: classes.dex */
public final class C1668c {

    /* renamed from: a */
    String f7017a;

    /* renamed from: b */
    String f7018b;

    /* renamed from: c */
    String f7019c;

    /* renamed from: d */
    public String f7020d;

    /* renamed from: e */
    public int f7021e;

    /* renamed from: f */
    public String f7022f;

    /* renamed from: g */
    public byte f7023g;

    /* renamed from: h */
    public String f7024h;

    /* renamed from: i */
    String f7025i;

    /* renamed from: j */
    String f7026j;

    /* renamed from: k */
    String f7027k;

    /* renamed from: l */
    String f7028l;

    /* renamed from: m */
    String f7029m = "";

    /* renamed from: n */
    String f7030n = "";

    /* renamed from: o */
    public long f7031o = 0;

    /* renamed from: a */
    public static C1668c m7621a() {
        C1668c c1668c = new C1668c();
        c1668c.f7017a = ControllerCenter.getGlobalEnvStruct().getAppid();
        c1668c.f7018b = ControllerCenter.getGlobalEnvStruct().getSecret();
        c1668c.f7028l = ControllerCenter.getGlobalEnvStruct().getUid();
        c1668c.f7029m = ControllerCenter.getGlobalEnvStruct().getLogUid();
        c1668c.f7030n = ControllerCenter.getGlobalEnvStruct().getLogDid();
        c1668c.f7026j = BuildConfig.VERSION_NAME;
        c1668c.f7019c = PackageUtil.getAppVersionName(ControllerCenter.getGlobalEnvStruct().mAppContext);
        c1668c.f7025i = String.valueOf(C1698b.m7679a().f7118d.mConfigVersion);
        c1668c.f7027k = EfsConstant.UM_SDK_VERSION;
        return c1668c;
    }

    /* renamed from: b */
    public final String m7623b() {
        C1666a.m7610a();
        String valueOf = String.valueOf(C1666a.m7613b() / 1000);
        String base64EncodeToStr = EncodeUtil.base64EncodeToStr(C1724a.m7772a(this.f7028l + valueOf, this.f7018b));
        String base64EncodeToStr2 = EncodeUtil.base64EncodeToStr(C1724a.m7772a(EncodeUtil.base64DecodeToStr(this.f7029m.getBytes()) + "_" + valueOf, this.f7018b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.f7017a);
        treeMap.put("sd", base64EncodeToStr);
        treeMap.put("logud", base64EncodeToStr2);
        String m7622a = m7622a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        if (!TextUtils.isEmpty(m7622a)) {
            String base64EncodeToStr3 = EncodeUtil.base64EncodeToStr(C1724a.m7772a(m7622a + "_" + valueOf, this.f7018b));
            treeMap.put("wl_dd", base64EncodeToStr3);
            treeMap.put("logdd", base64EncodeToStr3);
        }
        if (!TextUtils.isEmpty(this.f7020d)) {
            treeMap.put("cp", this.f7020d);
        }
        if (this.f7023g != 0) {
            treeMap.put("de", String.valueOf(this.f7021e));
            treeMap.put("type", this.f7024h);
            String str = this.f7022f;
            if (TextUtils.isEmpty(str)) {
                C1666a.m7610a();
                long m7613b = C1666a.m7613b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", Long.valueOf(m7613b), Integer.valueOf(new Random(m7613b).nextInt(10000)));
            }
            treeMap.put("seq", str);
        }
        treeMap.put("cver", this.f7025i);
        treeMap.put("os", DispatchConstants.ANDROID);
        treeMap.put("sver", this.f7025i);
        treeMap.put("tm", valueOf);
        treeMap.put("ver", this.f7019c);
        treeMap.put("um_sdk_ver", this.f7027k);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = ((String) entry.getKey()) + Operator.Operation.EQUALS + ((String) entry.getValue());
            sb3.append(str2);
            sb2.append(str2);
            sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        }
        String md5 = EncodeUtil.md5(sb3.toString() + this.f7018b);
        sb2.append("sign=");
        sb2.append(md5);
        Log.m7722d("efs.config", sb2.toString());
        return EncodeUtil.urlEncode(sb2.toString());
    }

    /* renamed from: a */
    private static String m7622a(Context context) {
        Class<UMConfigure> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = UMConfigure.class;
            UMLog uMLog = UMConfigure.umDebugLog;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getUMIDString", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, context);
            if (invoke != null) {
                return invoke.toString();
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }
}
