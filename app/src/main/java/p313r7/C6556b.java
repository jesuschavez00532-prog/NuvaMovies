package p313r7;

import af.C0236b;
import af.C0239e;
import af.InterfaceC0237c;
import af.InterfaceC0238d;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.CloseDialogEvent;
import com.module.event.CloseForceBindEvent;
import com.module.event.LoginSuccessEvent;
import com.module.event.RemoteLoginEvent;
import com.request.bean.UserTokenInvalidEvent;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import p141g2.C4337a;
import p161ha.C4774h1;
import p161ha.C4807x0;
import p161ha.DialogC4781k0;
import p415y9.AbstractApplicationC7689d;

/* renamed from: r7.b */
/* loaded from: classes.dex */
public class C6556b implements InterfaceC0238d {

    /* renamed from: a */
    private static final Map f25176a = new HashMap();

    static {
        ThreadMode threadMode = ThreadMode.MAIN;
        m25614b(new C0236b(DialogC4781k0.class, true, new C0239e[]{new C0239e("CloseForceBindEvent", CloseForceBindEvent.class, threadMode)}));
        m25614b(new C0236b(AbstractApplicationC7689d.class, true, new C0239e[]{new C0239e("registPushTagAndAlias", LoginSuccessEvent.class)}));
        m25614b(new C0236b(C4807x0.class, true, new C0239e[]{new C0239e("OnEventCloseDialog", CloseDialogEvent.class, threadMode)}));
        m25614b(new C0236b(AbstractActivityC2972a.class, true, new C0239e[]{new C0239e("onEventRemoteLogin", RemoteLoginEvent.class, threadMode, 0, true), new C0239e("onExchangeExpired", C4337a.class, threadMode), new C0239e("onUserTokenInvalid", UserTokenInvalidEvent.class, threadMode), new C0239e("awakenVoiceAssist", AwakenVoiceAssistEvent.class, threadMode)}));
        m25614b(new C0236b(C4774h1.class, true, new C0239e[]{new C0239e("loginSuccessMessage", LoginSuccessEvent.class, threadMode)}));
    }

    /* renamed from: b */
    private static void m25614b(InterfaceC0237c interfaceC0237c) {
        f25176a.put(interfaceC0237c.mo884c(), interfaceC0237c);
    }

    @Override // af.InterfaceC0238d
    /* renamed from: a */
    public InterfaceC0237c mo887a(Class cls) {
        InterfaceC0237c interfaceC0237c = (InterfaceC0237c) f25176a.get(cls);
        if (interfaceC0237c != null) {
            return interfaceC0237c;
        }
        return null;
    }
}
