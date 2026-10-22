package com.taobao.agoo.p075a;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3199l;
import com.taobao.accs.utl.C3203p;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.IRegister;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import com.taobao.agoo.p075a.p076a.C3214a;
import com.taobao.agoo.p075a.p076a.C3216c;
import com.taobao.agoo.p075a.p076a.C3217d;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.Config;
import org.json.JSONObject;

/* renamed from: com.taobao.agoo.a.b */
/* loaded from: classes.dex */
public class C3218b implements AccsDataListener {

    /* renamed from: b */
    public static C3213a f13259b;

    /* renamed from: a */
    public Map<String, ICallback> f13260a = new HashMap();

    public C3218b(Context context) {
        if (f13259b == null) {
            f13259b = new C3213a(context.getApplicationContext());
        }
    }

    /* renamed from: a */
    private void m13067a(JSONObject jSONObject, ICallback iCallback) {
        String m13019a = C3203p.m13019a(jSONObject, C3214a.JSON_PUSH_USER_TOKEN, null);
        if (!TextUtils.isEmpty(m13019a)) {
            Config.m24190c(GlobalClientInfo.getContext(), m13019a);
            if (iCallback != null) {
                iCallback.onSuccess();
                f13259b.m13056c(iCallback.extra);
                return;
            }
            return;
        }
        if (iCallback != null) {
            iCallback.onFailure("", "agoo server error-pushtoken null");
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onAntiBrush(boolean z10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i10, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        boolean equals;
        try {
            if ("AgooDeviceCmd".equals(str)) {
                ICallback iCallback = this.f13260a.get(str2);
                if (i10 == 200) {
                    String str3 = new String(bArr, "utf-8");
                    ALog.m12941i("RequestListener", "RequestListener onResponse", Constants.KEY_DATA_ID, str2, "listener", iCallback, "json", str3);
                    JSONObject jSONObject = new JSONObject(str3);
                    String m13019a = C3203p.m13019a(jSONObject, AbstractC3215b.JSON_ERRORCODE, null);
                    String m13019a2 = C3203p.m13019a(jSONObject, AbstractC3215b.JSON_CMD, null);
                    if (!AbstractC3215b.JSON_SUCCESS.equals(m13019a)) {
                        if (iCallback != null) {
                            iCallback.onFailure(String.valueOf(m13019a), "agoo server error");
                        }
                        if (equals) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (C3216c.JSON_CMD_REGISTER.equals(m13019a2)) {
                        String m13019a3 = C3203p.m13019a(jSONObject, "deviceId", null);
                        if (TextUtils.isEmpty(m13019a3)) {
                            if (iCallback != null) {
                                iCallback.onFailure("", "agoo server error deviceid null");
                            }
                        } else {
                            TaobaoRegister.setIsRegisterSuccess(true);
                            C3199l.m13012a().m13017b();
                            Config.m24187b(GlobalClientInfo.getContext(), m13019a3);
                            f13259b.m13054a(GlobalClientInfo.getContext().getPackageName());
                            if (iCallback instanceof IRegister) {
                                UtilityImpl.m12970c(Config.PREFERENCES, GlobalClientInfo.getContext());
                                ((IRegister) iCallback).onSuccess(m13019a3);
                            }
                        }
                        if ("AgooDeviceCmd".equals(str)) {
                            this.f13260a.remove(str2);
                            return;
                        }
                        return;
                    }
                    if (C3214a.JSON_CMD_SETALIAS.equals(m13019a2)) {
                        m13067a(jSONObject, iCallback);
                        if ("AgooDeviceCmd".equals(str)) {
                            this.f13260a.remove(str2);
                            return;
                        }
                        return;
                    }
                    if (C3214a.JSON_CMD_REMOVEALIAS.equals(m13019a2)) {
                        Config.m24190c(GlobalClientInfo.getContext(), null);
                        if (iCallback != null) {
                            iCallback.onSuccess();
                        }
                        f13259b.m13053a();
                        if ("AgooDeviceCmd".equals(str)) {
                            this.f13260a.remove(str2);
                            return;
                        }
                        return;
                    }
                    if ((C3217d.JSON_CMD_ENABLEPUSH.equals(m13019a2) || C3217d.JSON_CMD_DISABLEPUSH.equals(m13019a2)) && iCallback != null) {
                        iCallback.onSuccess();
                    }
                } else if (iCallback != null) {
                    iCallback.onFailure(String.valueOf(i10), "accs channel error");
                }
            }
            if (!"AgooDeviceCmd".equals(str)) {
                return;
            }
        } catch (Throwable th) {
            try {
                ALog.m12939e("RequestListener", "onResponse", th, new Object[0]);
                if (!"AgooDeviceCmd".equals(str)) {
                    return;
                }
            } finally {
                if ("AgooDeviceCmd".equals(str)) {
                    this.f13260a.remove(str2);
                }
            }
        }
        this.f13260a.remove(str2);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }
}
