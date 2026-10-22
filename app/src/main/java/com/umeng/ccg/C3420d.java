package com.umeng.ccg;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3280ab;
import com.umeng.analytics.pro.C3282ad;
import com.umeng.analytics.pro.C3283ae;
import com.umeng.analytics.pro.C3284af;
import com.umeng.analytics.pro.C3285ag;
import com.umeng.analytics.pro.C3286ah;
import com.umeng.analytics.pro.C3287ai;
import com.umeng.analytics.pro.C3289ak;
import com.umeng.analytics.pro.C3291am;
import com.umeng.analytics.pro.C3293ao;
import com.umeng.analytics.pro.C3297as;
import com.umeng.analytics.pro.C3299au;
import com.umeng.analytics.pro.C3300av;
import com.umeng.analytics.pro.C3301aw;
import com.umeng.analytics.pro.C3302ax;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.InterfaceC3281ac;
import com.umeng.analytics.pro.RunnableC3295aq;
import com.umeng.ccg.C3419c;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.ccg.d */
/* loaded from: classes3.dex */
public class C3420d implements C3419c.a {

    /* renamed from: a */
    private static final String f15034a = "iucc";

    /* renamed from: b */
    private static final String f15035b = C3309bd.m13860b().m13863b(C3309bd.f14091C);

    /* renamed from: c */
    private static JSONObject f15036c = null;

    /* renamed from: d */
    private static final String[] f15037d = {C3417a.f14984f, C3417a.f14985g, C3417a.f14986h};

    /* renamed from: e */
    private static final String[] f15038e = {C3417a.f14984f, C3417a.f14985g, C3417a.f14986h, C3417a.f14987i};

    /* renamed from: f */
    private static ArrayList<InterfaceC3281ac> f15039f = null;

    /* renamed from: g */
    private static ArrayList<InterfaceC3281ac> f15040g = null;

    /* renamed from: h */
    private static ArrayList<InterfaceC3281ac> f15041h = null;

    /* renamed from: i */
    private static ArrayList<InterfaceC3281ac> f15042i = null;

    /* renamed from: j */
    private static C3280ab f15043j = null;

    /* renamed from: m */
    private static e f15044m = new e();

    /* renamed from: k */
    private volatile String f15045k = "";

    /* renamed from: l */
    private Map<String, b> f15046l = new HashMap();

    /* renamed from: com.umeng.ccg.d$a */
    /* loaded from: classes3.dex */
    public static class a extends BroadcastReceiver {
        /* renamed from: a */
        public long m14504a(ArrayList<InterfaceC3281ac> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    InterfaceC3281ac interfaceC3281ac = arrayList.get(i10);
                    if (interfaceC3281ac instanceof C3284af) {
                        return ((C3284af) interfaceC3281ac).mo13741c();
                    }
                }
            }
            return 0L;
        }

        /* renamed from: b */
        public boolean m14505b(ArrayList<InterfaceC3281ac> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).mo13740b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON") && C3420d.f15043j != null && (C3420d.f15043j instanceof C3283ae)) {
                    if (m14505b(C3420d.f15042i)) {
                        C3419c.m14471a(UMGlobalContext.getAppContext(), 304, C3420d.m14476a(), null, 1000 * m14504a(C3420d.f15042i));
                    } else {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "don't send INVOKE_APPACT_WHEN_SCREEN_ON msg.");
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.umeng.ccg.d$b */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: b */
        private JSONArray f15052b;

        /* renamed from: c */
        private String f15053c;

        public b(JSONArray jSONArray, String str) {
            this.f15052b = jSONArray;
            this.f15053c = str;
        }

        /* renamed from: a */
        public JSONArray m14506a() {
            return this.f15052b;
        }

        /* renamed from: b */
        public String m14507b() {
            return this.f15053c;
        }
    }

    /* renamed from: com.umeng.ccg.d$c */
    /* loaded from: classes3.dex */
    private class c {

        /* renamed from: a */
        public String f15054a;

        /* renamed from: b */
        public int f15055b;

        /* renamed from: c */
        public int f15056c;

        public c(String str, int i10, int i11) {
            this.f15054a = str;
            this.f15055b = i10;
            this.f15056c = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.ccg.d$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        private static final C3420d f15058a = new C3420d();

        private d() {
        }
    }

    /* renamed from: com.umeng.ccg.d$e */
    /* loaded from: classes3.dex */
    public static class e extends BroadcastReceiver {
        /* renamed from: a */
        public long m14509a(ArrayList<InterfaceC3281ac> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    InterfaceC3281ac interfaceC3281ac = arrayList.get(i10);
                    if (interfaceC3281ac instanceof C3284af) {
                        return ((C3284af) interfaceC3281ac).mo13741c();
                    }
                }
            }
            return 0L;
        }

        /* renamed from: b */
        public boolean m14510b(ArrayList<InterfaceC3281ac> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).mo13740b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_ON");
                    if (m14510b(C3420d.f15039f)) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "report screen_on event.");
                        C3419c.m14471a(UMGlobalContext.getAppContext(), C3419c.f15026o, C3420d.m14476a(), null, m14509a(C3420d.f15039f) * 1000);
                    } else {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "don't report screen_on event.");
                    }
                }
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_OFF");
                    if (m14510b(C3420d.f15040g)) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "report screen_off event.");
                        C3419c.m14471a(UMGlobalContext.getAppContext(), 302, C3420d.m14476a(), null, m14509a(C3420d.f15040g) * 1000);
                    } else {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "don't report screen_off event.");
                    }
                }
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_USER_PRESENT");
                    if (m14510b(C3420d.f15041h)) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "report screen_unlock event.");
                        C3419c.m14471a(UMGlobalContext.getAppContext(), 303, C3420d.m14476a(), null, m14509a(C3420d.f15041h) * 1000);
                        return;
                    }
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "don't report screen_unlock event.");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m14479a(Context context, String str, BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: g */
    private boolean m14497g() {
        SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
        if (m13805a != null) {
            String string = m13805a.getString(C3299au.f14033f, "");
            if (TextUtils.isEmpty(string)) {
                m14498h();
                return false;
            }
            try {
                if (!C3297as.m13795a().keySet().equals(C3297as.m13796a(new JSONObject(string)).keySet())) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m14498h() {
        try {
            SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
            if (m13805a != null) {
                m13805a.edit().putString(C3299au.f14033f, new JSONObject(C3297as.m13795a()).toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private boolean m14499i() {
        try {
            SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
            if (m13805a == null) {
                return false;
            }
            if (TextUtils.isEmpty(m13805a.getString(C3299au.f14034g, ""))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: j */
    private JSONObject m14500j() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C3302ax.m13818b(UMUtils.genUmc(), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C3302ax.m13817a(byteArray, UMUtils.genSin());
            String str = new String(byteArray);
            byteArrayOutputStream.reset();
            return new JSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private long m14486b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ts")) {
            try {
                return jSONObject.optLong("ts");
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* renamed from: c */
    private void m14490c(Context context) {
        ImprintHandler.getImprintService(context).registImprintCallback(f15034a, new UMImprintChangeCallback() { // from class: com.umeng.ccg.d.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                C3419c.m14470a(UMGlobalContext.getAppContext(), 107, C3420d.m14476a(), str2);
            }
        });
    }

    /* renamed from: d */
    private Long m14492d(Context context) {
        try {
            SharedPreferences m13805a = C3299au.m13805a(context);
            if (m13805a == null) {
                return 0L;
            }
            return Long.valueOf(m13805a.getLong(C3299au.f14031d, 0L));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: e */
    private String m14495e(Context context) {
        try {
            SharedPreferences m13805a = C3299au.m13805a(context);
            return m13805a != null ? m13805a.getString(C3299au.f14032e, "") : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    private void m14491c(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(C3417a.f14979a)) {
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(C3417a.f14979a);
            C3280ab c3280ab = null;
            C3280ab m14475a = optJSONObject.has(C3417a.f14980b) ? m14475a(C3417a.f14980b, optJSONObject.optJSONObject(C3417a.f14980b)) : null;
            C3280ab m14475a2 = optJSONObject.has(C3417a.f14981c) ? m14475a(C3417a.f14981c, optJSONObject.optJSONObject(C3417a.f14981c)) : null;
            C3280ab m14475a3 = optJSONObject.has(C3417a.f14982d) ? m14475a(C3417a.f14982d, optJSONObject.optJSONObject(C3417a.f14982d)) : null;
            C3280ab m14475a4 = optJSONObject.has(C3417a.f14983e) ? m14475a(C3417a.f14983e, optJSONObject.optJSONObject(C3417a.f14983e)) : null;
            C3280ab m14475a5 = optJSONObject.has(C3417a.f14984f) ? m14475a(C3417a.f14984f, optJSONObject.optJSONObject(C3417a.f14984f)) : null;
            C3280ab m14475a6 = optJSONObject.has(C3417a.f14985g) ? m14475a(C3417a.f14985g, optJSONObject.optJSONObject(C3417a.f14985g)) : null;
            C3280ab m14475a7 = optJSONObject.has(C3417a.f14986h) ? m14475a(C3417a.f14986h, optJSONObject.optJSONObject(C3417a.f14986h)) : null;
            if (optJSONObject.has(C3417a.f14987i)) {
                c3280ab = m14475a(C3417a.f14987i, optJSONObject.optJSONObject(C3417a.f14987i));
                f15043j = c3280ab;
            }
            ArrayList arrayList = new ArrayList();
            if (m14475a != null) {
                arrayList.add(m14475a);
            }
            if (m14475a2 != null) {
                arrayList.add(m14475a2);
            }
            if (m14475a3 != null) {
                arrayList.add(m14475a3);
            }
            if (m14475a4 != null) {
                arrayList.add(m14475a4);
            }
            if (m14475a5 != null) {
                arrayList.add(m14475a5);
            }
            if (m14475a6 != null) {
                arrayList.add(m14475a6);
            }
            if (m14475a7 != null) {
                arrayList.add(m14475a7);
            }
            if (c3280ab != null) {
                arrayList.add(c3280ab);
            }
            C3419c.m14470a(UMGlobalContext.getAppContext(), C3419c.f15024m, m14476a(), arrayList);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C3420d m14476a() {
        return d.f15058a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized JSONObject m14503b(Context context) {
        File filesDir;
        String str;
        FileInputStream fileInputStream;
        JSONObject jSONObject = null;
        try {
            filesDir = context.getFilesDir();
            str = f15035b;
        } catch (Throwable unused) {
        }
        if (!new File(filesDir, str).exists()) {
            return null;
        }
        try {
            fileInputStream = context.openFileInput(str);
        } catch (Throwable unused2) {
            fileInputStream = null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(new String(C3302ax.m13817a(HelperUtils.readStreamToByteArray(fileInputStream), UMConfigure.sAppkey.getBytes())));
            try {
                C3297as.m13798a(fileInputStream);
            } catch (Throwable unused3) {
            }
            jSONObject = jSONObject2;
        } catch (Throwable unused4) {
            C3297as.m13798a(fileInputStream);
            return jSONObject;
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void m14502a(Context context) {
        C3419c.m14470a(context, 105, m14476a(), null);
    }

    /* renamed from: a */
    private boolean m14485a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(Constants.KEY_HTTP_CODE)) {
            return false;
        }
        try {
            if (200 == Integer.valueOf(jSONObject.optInt(Constants.KEY_HTTP_CODE)).intValue() && jSONObject.has(C3417a.f14979a)) {
                return jSONObject.has("ts");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private synchronized void m14481a(Context context, JSONObject jSONObject, String str) {
        long m14486b;
        byte[] m13817a;
        try {
            m14486b = m14486b(jSONObject);
            m13817a = C3302ax.m13817a(jSONObject.toString().getBytes(), UMConfigure.sAppkey.getBytes());
        } catch (Throwable unused) {
        }
        if (m13817a != null && m13817a.length > 1) {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), f15035b));
            try {
                fileOutputStream.write(m13817a);
                fileOutputStream.flush();
                C3297as.m13798a(fileOutputStream);
                m14478a(context, str, m14486b);
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "saveConfigFile success.");
            } catch (Throwable th) {
                C3297as.m13798a(fileOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    private void m14488b(String str) {
        String str2 = C3299au.f14029b + str;
        SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
        if (m13805a != null) {
            m13805a.edit().putLong(str2, System.currentTimeMillis()).commit();
        }
    }

    /* renamed from: a */
    private void m14483a(String str, InterfaceC3281ac interfaceC3281ac) {
        if (C3417a.f14984f.equalsIgnoreCase(str)) {
            if (f15039f == null) {
                f15039f = new ArrayList<>();
            }
            f15039f.add(interfaceC3281ac);
        }
        if (C3417a.f14985g.equalsIgnoreCase(str)) {
            if (f15040g == null) {
                f15040g = new ArrayList<>();
            }
            f15040g.add(interfaceC3281ac);
        }
        if (C3417a.f14986h.equalsIgnoreCase(str)) {
            if (f15041h == null) {
                f15041h = new ArrayList<>();
            }
            f15041h.add(interfaceC3281ac);
        }
        if (C3417a.f14987i.equalsIgnoreCase(str)) {
            if (f15042i == null) {
                f15042i = new ArrayList<>();
            }
            f15042i.add(interfaceC3281ac);
        }
    }

    /* renamed from: a */
    private C3280ab m14475a(String str, JSONObject jSONObject) {
        JSONArray optJSONArray;
        String str2;
        C3280ab c3280ab;
        JSONArray optJSONArray2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has(C3417a.f14990l) && (optJSONArray = jSONObject.optJSONArray(C3417a.f14990l)) != null && optJSONArray.length() > 0) {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray.get(0);
                    boolean has = jSONObject2.has(C3417a.f14991m);
                    boolean has2 = jSONObject2.has(C3417a.f14994p);
                    boolean has3 = jSONObject2.has(C3417a.f14995q);
                    if (!has || !has2 || !has3) {
                        return null;
                    }
                    try {
                        int optInt = jSONObject2.optInt(C3417a.f14991m);
                        long optLong = jSONObject2.optLong(C3417a.f14994p);
                        long optLong2 = jSONObject2.optLong(C3417a.f14995q);
                        String optString = jSONObject2.optString(C3417a.f14996r);
                        ArrayList arrayList = new ArrayList();
                        if (jSONObject2.has(C3417a.f14992n)) {
                            JSONArray optJSONArray3 = jSONObject2.optJSONArray(C3417a.f14992n);
                            HashSet hashSet = new HashSet();
                            if (optJSONArray3 != null) {
                                str2 = C3417a.f14999u;
                                int i10 = 0;
                                for (int length = optJSONArray3.length(); i10 < length; length = length) {
                                    hashSet.add(Integer.valueOf(optJSONArray3.getInt(i10)));
                                    i10++;
                                }
                            } else {
                                str2 = C3417a.f14999u;
                            }
                            if (hashSet.size() > 0) {
                                C3291am c3291am = new C3291am(hashSet);
                                if (Arrays.asList(f15037d).contains(str)) {
                                    m14483a(str, c3291am);
                                } else {
                                    arrayList.add(c3291am);
                                    if (C3417a.f14987i.equalsIgnoreCase(str)) {
                                        m14483a(str, c3291am);
                                    }
                                }
                            }
                        } else {
                            str2 = C3417a.f14999u;
                        }
                        if (jSONObject2.has(C3417a.f14993o)) {
                            String optString2 = jSONObject2.optString(C3417a.f14993o);
                            if (!TextUtils.isEmpty(optString2)) {
                                C3289ak c3289ak = new C3289ak(optString2);
                                HashSet hashSet2 = new HashSet();
                                for (int i11 = 1; i11 <= 24; i11++) {
                                    if (c3289ak.m13755a(i11)) {
                                        hashSet2.add(Integer.valueOf(i11));
                                    }
                                }
                                if (hashSet2.size() > 0) {
                                    C3285ag c3285ag = new C3285ag(hashSet2);
                                    if (Arrays.asList(f15037d).contains(str)) {
                                        m14483a(str, c3285ag);
                                    } else {
                                        arrayList.add(c3285ag);
                                    }
                                    if (C3417a.f14987i.equalsIgnoreCase(str)) {
                                        m14483a(str, c3285ag);
                                    }
                                }
                            }
                        }
                        arrayList.add(new C3287ai(optInt));
                        C3286ah c3286ah = new C3286ah(str, optLong);
                        String[] strArr = f15037d;
                        if (Arrays.asList(strArr).contains(str)) {
                            m14483a(str, c3286ah);
                        } else {
                            arrayList.add(c3286ah);
                        }
                        if (C3417a.f14987i.equalsIgnoreCase(str)) {
                            m14483a(str, c3286ah);
                        }
                        C3284af c3284af = new C3284af(optLong2);
                        if (Arrays.asList(strArr).contains(str)) {
                            m14483a(str, c3284af);
                            arrayList.add(c3284af);
                        } else {
                            arrayList.add(c3284af);
                        }
                        if (C3417a.f14987i.equalsIgnoreCase(str)) {
                            m14483a(str, c3284af);
                        }
                        if (C3417a.f14983e.equals(str)) {
                            c3280ab = new C3282ad(str, arrayList);
                        } else if (C3417a.f14987i.equals(str)) {
                            c3280ab = new C3283ae(str, arrayList);
                        } else {
                            c3280ab = new C3280ab(str, arrayList);
                        }
                        try {
                            c3280ab.mo13737b(str, jSONObject2);
                            c3280ab.mo13734a(optString);
                            String str3 = "";
                            String str4 = str2;
                            if (jSONObject.has(str4) && (optJSONArray2 = jSONObject.optJSONArray(str4)) != null) {
                                Map<String, b> map = this.f15046l;
                                if (map != null && !map.containsKey(str)) {
                                    this.f15046l.put(str, new b(new JSONArray(optJSONArray2.toString()), optString));
                                }
                                int length2 = optJSONArray2.length();
                                for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                                    str3 = str3 + optJSONArray2.getString(i12);
                                    if (i12 < length2 - 1) {
                                        str3 = str3 + ",";
                                    }
                                }
                            }
                            c3280ab.mo13736b(str3);
                        } catch (Throwable unused) {
                        }
                        return c3280ab;
                    } catch (Throwable unused2) {
                        return null;
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m14478a(Context context, String str, long j10) {
        SharedPreferences m13805a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] split = str.split("@");
            if (split.length != 4 || (m13805a = C3299au.m13805a(context)) == null) {
                return;
            }
            long parseLong = Long.parseLong(split[0]);
            String str2 = split[1];
            SharedPreferences.Editor edit = m13805a.edit();
            edit.putLong(C3299au.f14030c, j10);
            edit.putLong(C3299au.f14031d, parseLong);
            edit.putString(C3299au.f14032e, str2).commit();
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "updateTsS1S2 : ts = " + j10 + "; s1 = " + parseLong + "; s2 = " + str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m14482a(String str) {
        try {
            String[] split = str.split("@");
            if (split.length != 4) {
                return;
            }
            long parseLong = Long.parseLong(split[0]);
            String str2 = split[1];
            if (!TextUtils.isEmpty(this.f15045k)) {
                String[] split2 = this.f15045k.split("@");
                if (split2.length == 2) {
                    long parseLong2 = Long.parseLong(split2[0]);
                    String str3 = split2[1];
                    if (parseLong2 == parseLong && str3.equalsIgnoreCase(str2)) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "重复的iucc S1 and S2, 忽略本次更新，不发起fetch。");
                        return;
                    }
                }
            }
            SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
            if (m13805a != null) {
                if (m13805a.getLong(C3299au.f14030c, 0L) != parseLong) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "local config ts != iuccS1, send FETCH_NEW_CONFIG msg.");
                    this.f15045k = String.valueOf(parseLong) + "@" + str2;
                    C3419c.m14470a(UMGlobalContext.getAppContext(), 101, m14476a(), str);
                    return;
                }
                m14492d(UMGlobalContext.getAppContext());
                if (m14495e(UMGlobalContext.getAppContext()).equalsIgnoreCase(str2)) {
                    return;
                }
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "local S2 != iuccS2, send FETCH_NEW_CONFIG msg.");
                this.f15045k = String.valueOf(parseLong) + "@" + str2;
                C3419c.m14470a(UMGlobalContext.getAppContext(), 101, m14476a(), str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m14484a(boolean z10) {
        try {
            SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
            if (m13805a != null) {
                SharedPreferences.Editor edit = m13805a.edit();
                if (z10) {
                    edit.putString(C3299au.f14034g, "1").commit();
                } else {
                    edit.putString(C3299au.f14034g, "").commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private JSONObject m14477a(String str, int i10, int i11) {
        b bVar;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject.put("id", "$$_umc_ev1");
            jSONObject.put("ts", currentTimeMillis);
            jSONObject.put("tt", str);
            jSONObject.put(C3417a.f14978B, i10);
            jSONObject.put("result", i11);
            if (!this.f15046l.containsKey(C3417a.f14987i) || (bVar = this.f15046l.get(C3417a.f14987i)) == null) {
                return null;
            }
            JSONObject m13786a = C3293ao.m13786a(UMGlobalContext.getAppContext(), bVar.m14506a(), bVar.m14507b());
            JSONObject m13787a = C3293ao.m13787a(UMGlobalContext.getAppContext(), jSONObject);
            if (m13786a == null || m13787a == null) {
                return null;
            }
            return C3293ao.m13788a(m13786a, m13787a);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject m14501a(String str, String str2, String str3, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", "$$_umc_ev2");
            jSONObject.put("ts", j10);
            jSONObject.put("tt", str);
            jSONObject.put(AgooConstants.MESSAGE_FLAG, str2);
            jSONObject.put("ss", str3);
            if (z10) {
                jSONObject.put("cd", 1);
            } else {
                jSONObject.put("cd", 0);
            }
            JSONObject m13786a = C3293ao.m13786a(UMGlobalContext.getAppContext(), new JSONArray(), "");
            JSONObject m13787a = C3293ao.m13787a(UMGlobalContext.getAppContext(), jSONObject);
            if (m13786a == null || m13787a == null) {
                return null;
            }
            return C3293ao.m13788a(m13786a, m13787a);
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    private void m14480a(Context context, String str, JSONObject jSONObject) {
        JSONObject m14477a;
        Object m13810a;
        try {
            m14488b(C3417a.f14987i);
            final String optString = jSONObject.has("target") ? jSONObject.optString("target") : "";
            if (TextUtils.isEmpty(optString)) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> target is empty, ignore umc_cfg process");
                return;
            }
            final int optInt = jSONObject.has(C3417a.f14978B) ? jSONObject.optInt(C3417a.f14978B) : 0;
            if (optInt == 0) {
                JSONObject m14500j = m14500j();
                if (m14500j == null || (m13810a = C3301aw.m13810a(m14500j.optString(C3325bt.f14194aL), m14500j.optString(C3325bt.f14190aH), new Class[]{String.class}, context, new Object[]{m14500j.optString("a")})) == null || Build.VERSION.SDK_INT < 23) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("ss", Base64.encodeToString(C3302ax.m13817a(DeviceConfig.getPackageName(context).getBytes(), UMUtils.genSin()), 0).trim());
                C3301aw.m13810a(m14500j.optString("m"), m14500j.optString("x"), new Class[]{String.class, String.class, String[].class, Bundle.class, Activity.class, C3301aw.m13808a(m14500j.optString(C3325bt.f14192aJ)), Handler.class}, m13810a, new Object[]{optString, C3417a.f14989k, null, bundle, null, new AccountManagerCallback<Bundle>() { // from class: com.umeng.ccg.d.2
                    @Override // android.accounts.AccountManagerCallback
                    public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
                        int i10 = 1;
                        try {
                            accountManagerFuture.getResult();
                            i10 = 0;
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> umc_cfg p s!");
                        } catch (Throwable unused) {
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> umc_cfg p f!");
                        }
                        C3419c.m14470a(UMGlobalContext.getAppContext(), C3419c.f15030s, C3420d.m14476a(), new c(optString, optInt, i10));
                    }
                }, null});
                return;
            }
            if (Build.VERSION.SDK_INT < 23 || (m14477a = m14477a(optString, optInt, 0)) == null) {
                return;
            }
            C3300av.m13807a(new RunnableC3295aq(RunnableC3295aq.f14008b, m14477a), 0L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0490, code lost:
    
        if (r6 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x049d, code lost:
    
        r3.put("config", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x049b, code lost:
    
        if (0 == 0) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    @Override // com.umeng.ccg.C3419c.a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo14474a(java.lang.Object r21, int r22) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.ccg.C3420d.mo14474a(java.lang.Object, int):void");
    }
}
