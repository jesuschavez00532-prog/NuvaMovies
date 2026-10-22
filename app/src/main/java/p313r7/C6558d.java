package p313r7;

import af.C0236b;
import af.C0239e;
import af.InterfaceC0237c;
import af.InterfaceC0238d;
import com.mine.p068ui.activity.UserCenterActivity;
import com.module.event.AccountLogoutEvent;
import com.module.event.CloseDialogEvent;
import com.module.event.ClosePersonalEvent;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.event.UpdateRestrictStateEvent;
import com.module.event.UpdateSubscribeEvent;
import com.module.event.UpdateVodFavEvent;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import p141g2.C4338b;
import p238m9.ViewOnClickListenerC5613e;
import p238m9.ViewOnClickListenerC5622n;
import p251n9.C5772b0;
import p251n9.C5781e0;
import p251n9.C5817t0;
import p251n9.ViewOnClickListenerC5771b;
import p251n9.ViewOnClickListenerC5779d1;
import p251n9.ViewOnClickListenerC5800l;

/* renamed from: r7.d */
/* loaded from: classes2.dex */
public class C6558d implements InterfaceC0238d {

    /* renamed from: a */
    private static final Map f25178a = new HashMap();

    static {
        m25616b(new C0236b(C5781e0.class, true, new C0239e[]{new C0239e("refreshUerInfoDisplayMessage", RefreshUerInfoDisplayEvent.class)}));
        m25616b(new C0236b(ViewOnClickListenerC5800l.class, true, new C0239e[]{new C0239e("handSubscribeUpdate", UpdateVodFavEvent.class)}));
        m25616b(new C0236b(ViewOnClickListenerC5779d1.class, true, new C0239e[]{new C0239e("handSubscribeUpdate", UpdateSubscribeEvent.class)}));
        ThreadMode threadMode = ThreadMode.MAIN;
        m25616b(new C0236b(ViewOnClickListenerC5622n.class, true, new C0239e[]{new C0239e("OnEventCloseDialog", CloseDialogEvent.class, threadMode)}));
        m25616b(new C0236b(ViewOnClickListenerC5771b.class, true, new C0239e[]{new C0239e("refreshUerInfoDisplayMessage", RefreshUerInfoDisplayEvent.class), new C0239e("handleExchangeSuccess", C4338b.class), new C0239e("accountLogout", AccountLogoutEvent.class, threadMode)}));
        m25616b(new C0236b(UserCenterActivity.class, true, new C0239e[]{new C0239e("refreshUerInfoDisplayMessage", RefreshUerInfoDisplayEvent.class), new C0239e("closePersonalMessage", ClosePersonalEvent.class, threadMode)}));
        m25616b(new C0236b(ViewOnClickListenerC5613e.class, true, new C0239e[]{new C0239e("OnEventCloseDialog", CloseDialogEvent.class, threadMode)}));
        m25616b(new C0236b(C5772b0.class, true, new C0239e[]{new C0239e("updateRestrictStateEvent", UpdateRestrictStateEvent.class, threadMode)}));
        m25616b(new C0236b(C5817t0.class, true, new C0239e[]{new C0239e("refreshUerInfoDisplayMessage", RefreshUerInfoDisplayEvent.class)}));
    }

    /* renamed from: b */
    private static void m25616b(InterfaceC0237c interfaceC0237c) {
        f25178a.put(interfaceC0237c.mo884c(), interfaceC0237c);
    }

    @Override // af.InterfaceC0238d
    /* renamed from: a */
    public InterfaceC0237c mo887a(Class cls) {
        InterfaceC0237c interfaceC0237c = (InterfaceC0237c) f25178a.get(cls);
        if (interfaceC0237c != null) {
            return interfaceC0237c;
        }
        return null;
    }
}
