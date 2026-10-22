package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.InterfaceC3118b;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3199l;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.p075a.C3218b;
import com.taobao.agoo.p075a.p076a.C3216c;
import java.util.Map;
import org.android.agoo.common.Config;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.agoo.g */
/* loaded from: classes.dex */
public final class C3224g implements IAgooAppReceiver {

    /* renamed from: a */
    final /* synthetic */ Context f13261a;

    /* renamed from: b */
    final /* synthetic */ Context f13262b;

    /* renamed from: c */
    final /* synthetic */ IRegister f13263c;

    /* renamed from: d */
    final /* synthetic */ String f13264d;

    /* renamed from: e */
    final /* synthetic */ String f13265e;

    /* renamed from: f */
    final /* synthetic */ InterfaceC3118b f13266f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3224g(Context context, Context context2, IRegister iRegister, String str, String str2, InterfaceC3118b interfaceC3118b) {
        this.f13261a = context;
        this.f13262b = context2;
        this.f13263c = iRegister;
        this.f13264d = str;
        this.f13265e = str2;
        this.f13266f = interfaceC3118b;
    }

    @Override // com.taobao.accs.IAppReceiver
    public Map<String, String> getAllServices() {
        return null;
    }

    @Override // com.taobao.accs.IAgooAppReceiver
    public String getAppkey() {
        return this.f13264d;
    }

    @Override // com.taobao.accs.IAppReceiver
    public String getService(String str) {
        return null;
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onBindApp(int i10) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onBindUser(String str, int i10) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onData(String str, String str2, byte[] bArr) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onSendData(String str, int i10) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onUnbindApp(int i10) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onUnbindUser(int i10) {
    }

    @Override // com.taobao.accs.IAppReceiverV1
    public void onBindApp(int i10, String str) {
        C3218b c3218b;
        C3218b c3218b2;
        C3218b c3218b3;
        try {
            ALog.m12941i("TaobaoRegister", "onBindApp", Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
            if (i10 == 200) {
                c3218b = TaobaoRegister.mRequestListener;
                if (c3218b == null) {
                    C3218b unused = TaobaoRegister.mRequestListener = new C3218b(this.f13261a);
                }
                GlobalClientInfo globalClientInfo = GlobalClientInfo.getInstance(this.f13262b);
                c3218b2 = TaobaoRegister.mRequestListener;
                globalClientInfo.registerListener("AgooDeviceCmd", c3218b2);
                if (!Config.m24185a() && C3218b.f13259b.m13055b(this.f13261a.getPackageName()) && !UtilityImpl.m12969b(Constants.SP_CHANNEL_FILE_NAME, this.f13262b)) {
                    String m24194g = Config.m24194g(this.f13261a);
                    if (!TextUtils.isEmpty(m24194g)) {
                        boolean unused2 = TaobaoRegister.isRegisterSuccess = true;
                        C3199l.m13012a().m13017b();
                        ALog.m12941i("TaobaoRegister", "agoo already Registered return ", new Object[0]);
                        IRegister iRegister = this.f13263c;
                        if (iRegister != null) {
                            iRegister.onSuccess(m24194g);
                            return;
                        }
                        return;
                    }
                }
                byte[] m13063a = C3216c.m13063a(this.f13261a, this.f13264d, this.f13265e);
                if (m13063a == null) {
                    IRegister iRegister2 = this.f13263c;
                    if (iRegister2 != null) {
                        iRegister2.onFailure("503.1", "req data null");
                        return;
                    }
                    return;
                }
                String mo12692b = this.f13266f.mo12692b(this.f13261a, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", m13063a, null));
                if (TextUtils.isEmpty(mo12692b)) {
                    IRegister iRegister3 = this.f13263c;
                    if (iRegister3 != null) {
                        iRegister3.onFailure("503.1", "accs channel disabled!");
                        return;
                    }
                    return;
                }
                if (this.f13263c != null) {
                    c3218b3 = TaobaoRegister.mRequestListener;
                    c3218b3.f13260a.put(mo12692b, this.f13263c);
                    return;
                }
                return;
            }
            IRegister iRegister4 = this.f13263c;
            if (iRegister4 != null) {
                iRegister4.onFailure(String.valueOf(i10), "accs bindapp error!");
            }
        } catch (Throwable th) {
            ALog.m12939e("TaobaoRegister", "register onBindApp", th, new Object[0]);
        }
    }
}
