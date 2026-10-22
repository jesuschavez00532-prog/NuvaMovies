package com.umeng.ccg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3300av;
import com.umeng.analytics.pro.RunnableC3295aq;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CcgAgent {
    private static Object lock = new Object();
    private static Object configUpdateLock = new Object();
    private static ArrayList<ConfigListener> callbacks = new ArrayList<>();
    private static ArrayList<ConfigUpdateListener> updateCallbacks = new ArrayList<>();
    private static Object actionInfoLock = new Object();
    private static Map<String, ActionInfo> actionInfoTable = new HashMap();
    private static Map<String, ArrayList<String>> forbidSdkTable = new HashMap();
    private static volatile int actUpFlag = 0;
    private static volatile long actUpTs = 0;

    static {
        forbidSdkTable.put(C3417a.f14983e, new ArrayList<>());
        forbidSdkTable.put(C3417a.f14982d, new ArrayList<>());
        forbidSdkTable.put(C3417a.f14980b, new ArrayList<>());
        forbidSdkTable.put(C3417a.f14981c, new ArrayList<>());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getActUpFlag() {
        return actUpFlag;
    }

    public static Map<String, String> getActUpInfo() {
        HashMap hashMap = new HashMap();
        hashMap.put(AgooConstants.MESSAGE_FLAG, String.valueOf(actUpFlag));
        hashMap.put("ts", String.valueOf(actUpTs));
        return hashMap;
    }

    public static ActionInfo getActionInfo(String str) {
        ActionInfo actionInfo = null;
        if (!TextUtils.isEmpty(str)) {
            synchronized (actionInfoLock) {
                if (actionInfoTable.containsKey(str)) {
                    actionInfo = actionInfoTable.get(str);
                }
            }
        }
        return actionInfo;
    }

    public static String[] getCollectItemList() {
        return new String[]{C3417a.f14983e, C3417a.f14982d, C3417a.f14980b, C3417a.f14981c};
    }

    public static void getConfigInfo(ConfigResult configResult) {
        if (configResult != null) {
            configResult.onConfigInfo(C3420d.m14476a().m14503b(UMGlobalContext.getAppContext()));
        }
    }

    public static ArrayList<String> getForbidSdkArray(String str) {
        if (forbidSdkTable.containsKey(str)) {
            return forbidSdkTable.get(str);
        }
        return null;
    }

    public static ArrayList<String> getRegistedModuleList() {
        ArrayList<String> arrayList;
        synchronized (actionInfoLock) {
            arrayList = new ArrayList<>(actionInfoTable.keySet());
        }
        return arrayList;
    }

    public static boolean hasRegistedActionInfo() {
        boolean z10;
        synchronized (actionInfoLock) {
            if (actionInfoTable.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static void init(Context context) {
        C3420d.m14476a().m14502a(context);
    }

    public static void notifyConfigChanged(JSONObject jSONObject) {
        synchronized (configUpdateLock) {
            int size = updateCallbacks.size();
            if (size > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    updateCallbacks.get(i10).onConfigUpdate(jSONObject);
                }
            }
        }
    }

    public static void notifyConfigReady(JSONObject jSONObject) {
        synchronized (lock) {
            int size = callbacks.size();
            if (size > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    callbacks.get(i10).onConfigReady(jSONObject);
                }
            }
        }
    }

    public static void onActUpEvent(String str, String str2, Bundle bundle) {
        boolean z10;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = "";
            if (bundle != null) {
                try {
                    str3 = bundle.getString("ss");
                } catch (Throwable unused) {
                    return;
                }
            }
            String str4 = str3;
            actUpFlag = 1;
            actUpTs = System.currentTimeMillis();
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, " set act up flag.");
            if (System.currentTimeMillis() - UMConfigure.getInitCompleteTs() <= 3000) {
                z10 = true;
            } else {
                z10 = false;
            }
            JSONObject m14501a = C3420d.m14476a().m14501a(str, str2, str4, actUpTs, z10);
            if (m14501a != null) {
                C3300av.m13807a(new RunnableC3295aq(RunnableC3295aq.f14008b, m14501a), 0L, TimeUnit.SECONDS);
                Thread.sleep(2000L);
                return;
            }
            return;
        }
        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "onActUpEvent: type or token agument is empty string, pls check!");
        MLog.m14765e("onActUpEvent: type、token参数不能为null或者空字符串！");
    }

    public static void registerActionInfo(ActionInfo actionInfo) {
        Context appContext = UMGlobalContext.getAppContext();
        if (actionInfo != null) {
            synchronized (actionInfoLock) {
                try {
                    String module = actionInfo.getModule(UMGlobalContext.getAppContext());
                    if (!TextUtils.isEmpty(module) && !actionInfoTable.containsKey(module)) {
                        String[] supportAction = actionInfo.getSupportAction(appContext);
                        if (supportAction != null) {
                            for (String str : supportAction) {
                                boolean switchState = actionInfo.getSwitchState(appContext, str);
                                if (forbidSdkTable.containsKey(str)) {
                                    ArrayList<String> arrayList = forbidSdkTable.get(str);
                                    if (!switchState) {
                                        arrayList.add(module);
                                    }
                                }
                            }
                        }
                        actionInfoTable.put(module, actionInfo);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void registerConfigListener(ConfigListener configListener) {
        if (configListener != null) {
            synchronized (lock) {
                callbacks.add(configListener);
            }
        }
    }

    public static void registerConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        if (configUpdateListener != null) {
            synchronized (configUpdateLock) {
                updateCallbacks.add(configUpdateListener);
            }
        }
    }
}
