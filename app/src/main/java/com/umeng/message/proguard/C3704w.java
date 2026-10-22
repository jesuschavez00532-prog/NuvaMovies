package com.umeng.message.proguard;

import android.app.Application;
import android.content.ContentProviderOperation;
import android.content.Context;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UPLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.w */
/* loaded from: classes3.dex */
public final class C3704w implements UMLogDataProtocol {

    /* renamed from: b */
    private static final UMLogDataProtocol f16641b = new C3704w();

    /* renamed from: a */
    private final boolean f16642a = false;

    private C3704w() {
    }

    /* renamed from: a */
    public static UMLogDataProtocol m15832a() {
        return f16641b;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public final void removeCacheData(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(obj.toString()).optJSONObject("content");
            if (optJSONObject == null) {
                return;
            }
            Application m15840a = C3706y.m15840a();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            JSONArray optJSONArray = optJSONObject.optJSONArray("push");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) optJSONArray.get(i10);
                    arrayList.add(ContentProviderOperation.newDelete(C3682h.m15770d(m15840a)).withSelection("MsgId=? And ActionType=?", new String[]{jSONObject.optString("msg_id"), String.valueOf(jSONObject.optInt("action_type"))}).build());
                }
            }
            m15840a.getContentResolver().applyBatch(C3682h.m15772f(m15840a), arrayList);
        } catch (Throwable th) {
            UPLog.m15196e("Event", th);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public final JSONObject setupReportData(long j10) {
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public final void workEvent(Object obj, int i10) {
        int i11;
        JSONObject buildEnvelopeWithExtHeader;
        JSONArray optJSONArray;
        JSONObject buildEnvelopeWithExtHeader2;
        JSONObject buildEnvelopeWithExtHeader3;
        JSONObject jSONObject;
        JSONObject buildEnvelopeWithExtHeader4;
        if (obj == null) {
            return;
        }
        int i12 = 0;
        try {
            switch (i10) {
                case 16385:
                    Application m15840a = C3706y.m15840a();
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    JSONObject optJSONObject = jSONObject2.optJSONObject("content");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("push")) != null && optJSONArray.length() > 0) {
                        JSONObject jSONObject3 = (JSONObject) optJSONArray.get(0);
                        int optInt = jSONObject3.optInt("action_type");
                        if (optInt != 70 && optInt != 71) {
                            if (optInt == 0) {
                                ((C3577aw) PushAgent.getInstance(m15840a).getMessageNotifyApi()).m15355a(jSONObject3);
                            }
                            C3584bb.m15383a(m15840a).m15384a(jSONObject3.optString("msg_id"), optInt, jSONObject3.optLong("ts"));
                        }
                        i11 = optInt;
                    } else {
                        i11 = -1;
                    }
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("header");
                    if (optJSONObject2 != null && optJSONObject != null && (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(m15840a, optJSONObject2, optJSONObject, "umpx_push_logs", C3325bt.f14186aD, MsgConstant.SDK_VERSION)) != null && !buildEnvelopeWithExtHeader.has("exception") && i11 != 70 && i11 != 71) {
                        try {
                            removeCacheData(jSONObject2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            th.printStackTrace();
                            return;
                        }
                    }
                    return;
                case 16386:
                    Application m15840a2 = C3706y.m15840a();
                    JSONObject jSONObject4 = new JSONObject(obj.toString());
                    JSONObject optJSONObject3 = jSONObject4.optJSONObject("header");
                    JSONObject optJSONObject4 = jSONObject4.optJSONObject("content");
                    if (optJSONObject3 != null && optJSONObject4 != null && (buildEnvelopeWithExtHeader2 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(m15840a2, optJSONObject3, optJSONObject4, "umpx_push_launch", C3325bt.f14186aD, MsgConstant.SDK_VERSION)) != null && !buildEnvelopeWithExtHeader2.has("exception")) {
                        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a2);
                        messageSharedPrefs.f15770b.m15395a(C3384f.f14621p, System.currentTimeMillis());
                        try {
                            int parseInt = Integer.parseInt(UMEnvelopeBuild.imprintProperty(m15840a2, "launch_policy", "-1"));
                            UPLog.m15198i("Event", "launch policy:", Integer.valueOf(parseInt));
                            if (parseInt > 0) {
                                messageSharedPrefs.f15770b.m15394a("launch_send_policy", parseInt);
                            }
                        } catch (Throwable unused) {
                        }
                        try {
                            int parseInt2 = Integer.parseInt(UMEnvelopeBuild.imprintProperty(m15840a2, "tag_policy", "-1"));
                            UPLog.m15198i("Event", "tag policy:", Integer.valueOf(parseInt2));
                            if (parseInt2 > 0) {
                                messageSharedPrefs.f15770b.m15394a("tag_send_policy", parseInt2);
                                return;
                            }
                            return;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                    return;
                case 16387:
                    Application m15840a3 = C3706y.m15840a();
                    JSONObject jSONObject5 = new JSONObject(obj.toString());
                    JSONObject optJSONObject5 = jSONObject5.optJSONObject("header");
                    JSONObject optJSONObject6 = jSONObject5.optJSONObject("content");
                    if (optJSONObject5 != null && optJSONObject6 != null && (buildEnvelopeWithExtHeader3 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(m15840a3, optJSONObject5, optJSONObject6, "umpx_push_register", C3325bt.f14186aD, MsgConstant.SDK_VERSION)) != null && !buildEnvelopeWithExtHeader3.has("exception")) {
                        MessageSharedPrefs.getInstance(m15840a3).f15770b.m15398a("has_register", true);
                        return;
                    }
                    return;
                case 16388:
                    Application m15840a4 = C3706y.m15840a();
                    JSONObject jSONObject6 = new JSONObject(obj.toString());
                    JSONObject optJSONObject7 = jSONObject6.optJSONObject("jsonHeader");
                    JSONObject optJSONObject8 = jSONObject6.optJSONObject("jsonBody");
                    String optString = jSONObject6.optString("um_px_path");
                    if (optJSONObject7 != null && optJSONObject8 != null) {
                        optJSONObject7.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
                        optJSONObject7.put("din", C3637d.m15602c(C3706y.m15840a()));
                        optJSONObject7.put("push_switch", C3637d.m15624p(C3706y.m15840a()));
                        JSONArray optJSONArray2 = optJSONObject8.optJSONArray("push");
                        if (optJSONArray2 != null && optJSONArray2.length() > 0 && (i12 = (jSONObject = (JSONObject) optJSONArray2.get(0)).optInt("action_type")) == 0) {
                            ((C3577aw) PushAgent.getInstance(m15840a4).getMessageNotifyApi()).m15355a(jSONObject);
                        }
                        JSONObject buildEnvelopeWithExtHeader5 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(m15840a4, optJSONObject7, optJSONObject8, optString, C3325bt.f14186aD, MsgConstant.SDK_VERSION);
                        if (buildEnvelopeWithExtHeader5 != null && !buildEnvelopeWithExtHeader5.has("exception") && i12 != 6 && i12 != 7) {
                            m15833a(m15840a4, optJSONObject8.getJSONArray("push"));
                            return;
                        }
                        return;
                    }
                    return;
                case 16389:
                    Application m15840a5 = C3706y.m15840a();
                    JSONObject jSONObject7 = new JSONObject(obj.toString());
                    JSONObject optJSONObject9 = jSONObject7.optJSONObject("header");
                    JSONObject optJSONObject10 = jSONObject7.optJSONObject("content");
                    if (optJSONObject9 != null && optJSONObject10 != null && (buildEnvelopeWithExtHeader4 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(m15840a5, optJSONObject9, optJSONObject10, "umpx_push_logs", C3325bt.f14186aD, MsgConstant.SDK_VERSION)) != null && !buildEnvelopeWithExtHeader4.has("exception")) {
                        C3707z.m15843a();
                        C3707z.m15847a(optJSONObject10.getJSONArray("push"));
                        return;
                    }
                    return;
                case 16390:
                    JSONObject jSONObject8 = new JSONObject(obj.toString());
                    Application m15840a6 = C3706y.m15840a();
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
                    jSONObject9.put("din", C3637d.m15602c(m15840a6));
                    jSONObject9.put("push_switch", C3637d.m15624p(m15840a6));
                    JSONObject jSONObject10 = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    jSONObject8.put("pa", "");
                    jSONObject8.put("device_token", PushAgent.getInstance(m15840a6).getRegistrationId());
                    jSONObject8.put("msg_id", "");
                    jSONObject8.put("ts", System.currentTimeMillis());
                    jSONArray.put(jSONObject8);
                    jSONObject10.put("push", jSONArray);
                    UMEnvelopeBuild.buildEnvelopeWithExtHeader(m15840a6, jSONObject9, jSONObject10, "umpx_push_logs", C3325bt.f14186aD, MsgConstant.SDK_VERSION);
                    return;
                case 16391:
                case 16392:
                    Application m15840a7 = C3706y.m15840a();
                    JSONObject jSONObject11 = new JSONObject(obj.toString());
                    JSONObject optJSONObject11 = jSONObject11.optJSONObject("content");
                    JSONObject optJSONObject12 = jSONObject11.optJSONObject("header");
                    if (optJSONObject12 != null && optJSONObject11 != null) {
                        UMEnvelopeBuild.buildEnvelopeWithExtHeader(m15840a7, optJSONObject12, optJSONObject11, "umpx_push_logs", C3325bt.f14186aD, MsgConstant.SDK_VERSION);
                    }
                default:
                    return;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private static void m15833a(Context context, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                    arrayList.add(ContentProviderOperation.newDelete(C3682h.m15770d(context)).withSelection("MsgId=? And ActionType=?", new String[]{jSONObject.optString("msg_id"), String.valueOf(jSONObject.optInt("action_type"))}).build());
                }
                context.getContentResolver().applyBatch(C3682h.m15772f(context), arrayList);
            } catch (Throwable th) {
                UPLog.m15197e("Event", "remove cache error:" + th.getMessage());
            }
        }
    }
}
