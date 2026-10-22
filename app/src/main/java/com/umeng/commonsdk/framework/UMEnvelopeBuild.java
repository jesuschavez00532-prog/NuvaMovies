package com.umeng.commonsdk.framework;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3327bv;
import com.umeng.analytics.pro.C3329bx;
import com.umeng.analytics.pro.C3389k;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.internal.C3452a;
import com.umeng.commonsdk.internal.C3453b;
import com.umeng.commonsdk.statistics.C3482b;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UMEnvelopeBuild {
    public static boolean transmissionSendFlag;

    private static JSONObject add2CacheTable(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        if (jSONObject != null && jSONObject2 != null) {
            C3389k m14262a = C3389k.m14262a(context);
            long currentTimeMillis = System.currentTimeMillis();
            UUID randomUUID = UUID.randomUUID();
            ContentValues contentValues = new ContentValues();
            contentValues.put(C3329bx.f14345e, str2);
            contentValues.put(C3329bx.f14346f, m14262a.m14286c(jSONObject.toString()));
            contentValues.put(C3329bx.f14347g, m14262a.m14286c(jSONObject2.toString()));
            contentValues.put(C3329bx.f14348h, String.valueOf(currentTimeMillis));
            contentValues.put(C3329bx.f14349i, randomUUID.toString());
            contentValues.put(C3329bx.f14350j, str);
            contentValues.put(C3329bx.f14351k, str3);
            C3327bv.m13985a(context).m13991a(C3329bx.f14343c, contentValues);
            if (C3325bt.f14191aI.equalsIgnoreCase(str2)) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]inner业务，返回空 JSONObject。");
            } else if (C3325bt.f14190aH.equalsIgnoreCase(str2)) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]分享业务 返回body。");
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("header", new JSONObject());
                    jSONObject3.put("share", jSONObject2.getJSONObject("share"));
                    return jSONObject3;
                } catch (JSONException unused) {
                }
            } else if (!C3325bt.f14186aD.equalsIgnoreCase(str2)) {
                try {
                    if ("t".equalsIgnoreCase(str2)) {
                        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 半开报文，返回body。");
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(C3482b.m14744a("header"), new JSONObject());
                        jSONObject4.put(C3482b.m14744a("analytics"), jSONObject2.getJSONObject("analytics"));
                        return jSONObject4;
                    }
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 闭合报文，返回body。");
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(C3482b.m14744a("header"), new JSONObject());
                    jSONObject5.put(C3482b.m14744a("analytics"), jSONObject2.getJSONObject("analytics"));
                    return jSONObject5;
                } catch (JSONException unused2) {
                    return jSONObject2;
                }
            }
            return new JSONObject();
        }
        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]构建信封传入 header 或 body 字段为空，直接返回");
        return null;
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject.has("st")) {
            str = "t";
        } else {
            str = jSONObject2.has(C3325bt.f14183aA) ? C3325bt.f14191aI : "a";
        }
        return buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2, UMServerURL.PATH_ANALYTICS, str, "9.7.9");
    }

    public static JSONObject buildSilentEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (!UMUtils.isMainProgress(context)) {
            JSONObject jSONObject3 = null;
            try {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("exception", 120);
                    return jSONObject4;
                } catch (JSONException unused) {
                    jSONObject3 = jSONObject4;
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
            }
        } else {
            return new C3482b().m14752a(context.getApplicationContext(), jSONObject, jSONObject2, str);
        }
    }

    public static JSONObject buildZeroEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (!UMUtils.isMainProgress(context)) {
            JSONObject jSONObject3 = null;
            try {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("exception", 120);
                    return jSONObject4;
                } catch (JSONException unused) {
                    jSONObject3 = jSONObject4;
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
            }
        } else {
            return new C3482b().m14754b(context.getApplicationContext(), jSONObject, jSONObject2, str);
        }
    }

    public static long getLastInstantBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastInstantBuildTime(context.getApplicationContext());
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastSuccessfulBuildTime(context.getApplicationContext());
    }

    public static synchronized boolean getTransmissionSendFlag() {
        boolean z10;
        synchronized (UMEnvelopeBuild.class) {
            z10 = transmissionSendFlag;
        }
        return z10;
    }

    public static String imprintProperty(Context context, String str, String str2) {
        if (context == null) {
            return str2;
        }
        return ImprintHandler.getImprintService(context.getApplicationContext()).m14860c().m14863a(str, str2);
    }

    public static boolean isOnline(Context context) {
        boolean z10 = !UMConfigure.needSendZcfgEnv(context);
        if (UMFrUtils.isOnline(context) && z10) {
            return true;
        }
        return false;
    }

    public static boolean isReadyBuild(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        C3448a.m14582a(context);
        return isRet(context, uMBusinessType, false);
    }

    public static boolean isReadyBuildNew(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        if (!getTransmissionSendFlag()) {
            return false;
        }
        return isRet(context, uMBusinessType, false);
    }

    public static boolean isReadyBuildStateless() {
        if (!getTransmissionSendFlag()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r5) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean isRet(android.content.Context r5, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r6, boolean r7) {
        /*
            if (r5 == 0) goto L43
            android.content.Context r0 = r5.getApplicationContext()
            boolean r1 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r0)
            int r2 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r0)
            if (r1 == 0) goto L3c
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r7 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            r3 = 1
            r4 = 0
            if (r6 != r7) goto L1f
            boolean r5 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6)
            if (r5 == 0) goto L1d
            goto L2d
        L1d:
            r7 = 1
            goto L3c
        L1f:
            boolean r7 = com.umeng.commonsdk.framework.C3448a.m14585a()
            if (r7 == 0) goto L2f
            int r5 = com.umeng.commonsdk.framework.C3448a.m14586b()
            long r5 = (long) r5
            com.umeng.commonsdk.framework.UMWorkDispatch.sendDelayProcessMsg(r5)
        L2d:
            r7 = 0
            goto L3c
        L2f:
            boolean r6 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6)
            if (r6 != 0) goto L2d
            boolean r5 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r5)
            if (r5 == 0) goto L1d
            goto L2d
        L3c:
            if (r1 == 0) goto L43
            if (r2 <= 0) goto L43
            com.umeng.commonsdk.framework.C3448a.m14591d()
        L43:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMEnvelopeBuild.isRet(android.content.Context, com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType, boolean):boolean");
    }

    public static long maxDataSpace(Context context) {
        if (context == null) {
            return 0L;
        }
        return C3482b.m14742a(context.getApplicationContext());
    }

    public static void registerNetReceiver(Context context) {
        C3448a.m14588b(context);
    }

    public static void sendProcessNextMsgOnce() {
        C3448a.m14591d();
    }

    public static synchronized void setTransmissionSendFlag(boolean z10) {
        synchronized (UMEnvelopeBuild.class) {
            transmissionSendFlag = z10;
        }
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]业务发起构建普通有状态信封请求。");
        JSONObject jSONObject3 = null;
        if (TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("exception", 121);
                    return jSONObject4;
                } catch (JSONException unused) {
                    jSONObject3 = jSONObject4;
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
            }
        } else if (!UMUtils.isMainProgress(context)) {
            try {
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("exception", 120);
                    return jSONObject5;
                } catch (JSONException unused3) {
                    jSONObject3 = jSONObject5;
                    return jSONObject3;
                }
            } catch (JSONException unused4) {
            }
        } else {
            if (UMConfigure.needSendZcfgEnv(context)) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 未获取到，写入二级缓存");
                return add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
            }
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 已获取到，判断二级缓存是否为空");
            if (C3327bv.m13985a(context).m13996c()) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存为空，直接打信封");
                return new C3482b().m14753a(context.getApplicationContext(), jSONObject, jSONObject2, str, str2, str3);
            }
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存不为空，写入二级缓存");
            JSONObject add2CacheTable = add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
            if (!UMWorkDispatch.eventHasExist(C3452a.f15280t)) {
                UMWorkDispatch.sendEvent(context, C3452a.f15280t, C3453b.m14605a(context).m14606a(), null);
            }
            return add2CacheTable;
        }
    }
}
