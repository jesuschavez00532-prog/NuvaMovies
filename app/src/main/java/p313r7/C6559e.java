package p313r7;

import af.C0236b;
import af.C0239e;
import af.InterfaceC0237c;
import af.InterfaceC0238d;
import com.module.event.AutoPlayNextEpisodeEvent;
import com.module.event.FinishVodDetailEvent;
import com.module.event.MsgUnReadSizeUpdateEvent;
import com.module.event.RecommendGetSucEvent;
import com.module.event.RefreshTableTitleEvent;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.event.ShowErrorMsgEvent;
import com.module.event.StopVodPlayEvent;
import com.module.event.StopWhenPlayVoiceLiveEvent;
import com.module.event.SubtitleSelectEvent;
import com.module.event.TimeChangedEvent;
import com.module.event.UsbChangedEvent;
import com.request.bean.SubtitleDownloadErrorEvent;
import com.request.bean.SubtitleDownloadFinishEvent;
import com.vod.p089ui.activity.VodDetailsActivity;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import p141g2.C4338b;
import p358ud.C7086c;
import p358ud.C7098g;
import p358ud.C7107j;
import p358ud.C7121n1;
import p358ud.C7122o;
import p358ud.C7129r;
import p358ud.C7135u;
import p358ud.C7141x;
import sd.AbstractActivityC6850u1;

/* renamed from: r7.e */
/* loaded from: classes2.dex */
public class C6559e implements InterfaceC0238d {

    /* renamed from: a */
    private static final Map f25179a = new HashMap();

    static {
        m25617b(new C0236b(C7098g.class, true, new C0239e[]{new C0239e("onRecommendGetSucMessage", RecommendGetSucEvent.class)}));
        m25617b(new C0236b(C7107j.class, true, new C0239e[]{new C0239e("onRecommendGetSucMessage", RecommendGetSucEvent.class)}));
        m25617b(new C0236b(C7086c.class, true, new C0239e[]{new C0239e("onRecommendGetSucMessage", RecommendGetSucEvent.class)}));
        m25617b(new C0236b(C7122o.class, true, new C0239e[]{new C0239e("onRecommendGetSucMessage", RecommendGetSucEvent.class)}));
        m25617b(new C0236b(C7141x.class, true, new C0239e[]{new C0239e("onRecommendGetSucMessage", RecommendGetSucEvent.class)}));
        ThreadMode threadMode = ThreadMode.MAIN;
        m25617b(new C0236b(VodDetailsActivity.class, true, new C0239e[]{new C0239e("onEventSubtitleSelect", SubtitleSelectEvent.class), new C0239e("onEventAutoPlayNextEpisodeEvent", AutoPlayNextEpisodeEvent.class), new C0239e("onEventFinish", FinishVodDetailEvent.class), new C0239e("stopWhenPlayVoiceLive", StopWhenPlayVoiceLiveEvent.class, threadMode)}));
        m25617b(new C0236b(C7129r.class, true, new C0239e[]{new C0239e("onRecommendGetSucMessage", RecommendGetSucEvent.class)}));
        m25617b(new C0236b(C7135u.class, true, new C0239e[]{new C0239e("onRecommendGetSucMessage", RecommendGetSucEvent.class)}));
        m25617b(new C0236b(AbstractActivityC6850u1.class, true, new C0239e[]{new C0239e("onEventTimeChanged", TimeChangedEvent.class, threadMode), new C0239e("refreshUerInfoDisplayMessage", RefreshUerInfoDisplayEvent.class), new C0239e("handleExchangeSuccess", C4338b.class), new C0239e("onEventShowErrorMsg", ShowErrorMsgEvent.class, threadMode, 0, true), new C0239e("handleMessageUpdateEvent", MsgUnReadSizeUpdateEvent.class, threadMode), new C0239e("refreshTableMessage", RefreshTableTitleEvent.class, threadMode, 0, true), new C0239e("onEventUsbChanged", UsbChangedEvent.class, threadMode)}));
        m25617b(new C0236b(C7121n1.class, true, new C0239e[]{new C0239e("stopVodPlayMessage", StopVodPlayEvent.class, threadMode), new C0239e("subTitleDowmloadCompleteMessage", SubtitleDownloadFinishEvent.class, threadMode), new C0239e("handleSubtitleDownloadFailReport", SubtitleDownloadErrorEvent.class, threadMode)}));
    }

    /* renamed from: b */
    private static void m25617b(InterfaceC0237c interfaceC0237c) {
        f25179a.put(interfaceC0237c.mo884c(), interfaceC0237c);
    }

    @Override // af.InterfaceC0238d
    /* renamed from: a */
    public InterfaceC0237c mo887a(Class cls) {
        InterfaceC0237c interfaceC0237c = (InterfaceC0237c) f25179a.get(cls);
        if (interfaceC0237c != null) {
            return interfaceC0237c;
        }
        return null;
    }
}
