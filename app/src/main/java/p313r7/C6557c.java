package p313r7;

import af.C0236b;
import af.C0239e;
import af.InterfaceC0237c;
import af.InterfaceC0238d;
import com.live.p064ui.activity.LiveNewVoiceSearchActivity;
import com.module.event.ChangeListToAllChannelEvent;
import com.module.event.ChangeUserAccountSuccessEvent;
import com.module.event.FinishVoiceLiveEvent;
import com.module.event.GetAllLiveDataSuccessEvent;
import com.module.event.GetChildLiveDataSuccessEvent;
import com.module.event.GetLiveDataSuccessEvent;
import com.module.event.GetLiveFavoriteSucEvent;
import com.module.event.HideContentFragmentEvent;
import com.module.event.HideLockViewEvent;
import com.module.event.LiveGuideShow;
import com.module.event.LockChannelEvent;
import com.module.event.LockMonitorEvent;
import com.module.event.PlaySelectedChannelListEvent;
import com.module.event.PreAllLiveDataEvent;
import com.module.event.RefreshLockEvent;
import com.module.event.RequestLiveColumnSuccessEvent;
import com.module.event.SelectAllChannelTabEvent;
import com.module.event.SetVoiceSearchLiveDataEvent;
import com.module.event.ShowGuideEvent;
import com.module.event.ShowLiveInfoBarEvent;
import com.module.event.StopLiveStreamEvent;
import com.module.event.ToStartPlayBackEvent;
import com.module.event.ToStartPlayEvent;
import com.module.event.ToStartPlayVoiceSearchEvent;
import com.module.event.UpdateLiveNoticeEvent;
import com.module.event.UpdatePlayIndexItemEvent;
import com.module.event.UpdateRestrictStateEvent;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import p223l8.C5442e1;
import p223l8.C5465k0;
import p223l8.C5498s1;
import p223l8.C5500t;

/* renamed from: r7.c */
/* loaded from: classes2.dex */
public class C6557c implements InterfaceC0238d {

    /* renamed from: a */
    private static final Map f25177a = new HashMap();

    static {
        ThreadMode threadMode = ThreadMode.MAIN;
        m25615b(new C0236b(C5498s1.class, true, new C0239e[]{new C0239e("getFavListSucMessage", GetLiveFavoriteSucEvent.class), new C0239e("lockChannel", LockChannelEvent.class, threadMode), new C0239e("getLiveDataSuccess", GetLiveDataSuccessEvent.class, threadMode), new C0239e("toStartPlay", ToStartPlayEvent.class), new C0239e("toStartPlayBack", ToStartPlayBackEvent.class), new C0239e("hideContent", HideContentFragmentEvent.class), new C0239e("showInfoBar", ShowLiveInfoBarEvent.class), new C0239e("toStartPlayVoiceSearch", ToStartPlayVoiceSearchEvent.class, threadMode, 0, true), new C0239e("findLockChannel", LockMonitorEvent.class, threadMode), new C0239e("changeUserAccountSuccess", ChangeUserAccountSuccessEvent.class, threadMode), new C0239e("updateLiveNotice", UpdateLiveNoticeEvent.class), new C0239e("stopLiveStream", StopLiveStreamEvent.class, threadMode), new C0239e("liveGuideShow", LiveGuideShow.class)}));
        m25615b(new C0236b(C5500t.class, true, new C0239e[]{new C0239e("getAllChannelData", GetAllLiveDataSuccessEvent.class, threadMode, 0, true), new C0239e("preAllLiveDataMessage", PreAllLiveDataEvent.class, threadMode, 0, true), new C0239e("updatePlayIndexItem", UpdatePlayIndexItemEvent.class)}));
        m25615b(new C0236b(LiveNewVoiceSearchActivity.class, true, new C0239e[]{new C0239e("finishVioceMsg", FinishVoiceLiveEvent.class)}));
        m25615b(new C0236b(C5465k0.class, true, new C0239e[]{new C0239e("getAllChannelData", GetAllLiveDataSuccessEvent.class, threadMode, 0, true), new C0239e("preAllLiveDataMessage", PreAllLiveDataEvent.class, threadMode, 0, true), new C0239e("getChildChannelData", GetChildLiveDataSuccessEvent.class, threadMode, 0, true), new C0239e("setLockStatus", RefreshLockEvent.class, threadMode), new C0239e("hideLockView", HideLockViewEvent.class, threadMode), new C0239e("getFavListSucMessage", GetLiveFavoriteSucEvent.class), new C0239e("updatePlayIndexItem", UpdatePlayIndexItemEvent.class), new C0239e("playCurrentChannel", PlaySelectedChannelListEvent.class, threadMode), new C0239e("setVoiceSearchLiveData", SetVoiceSearchLiveDataEvent.class, ThreadMode.POSTING, 0, true), new C0239e("EventShowGuide", ShowGuideEvent.class, threadMode)}));
        m25615b(new C0236b(C5442e1.class, true, new C0239e[]{new C0239e("requestLiveColumnSuccess", RequestLiveColumnSuccessEvent.class, threadMode, 0, true), new C0239e("changeListToAllChannel", ChangeListToAllChannelEvent.class), new C0239e("changeUserAccountSuccess", ChangeUserAccountSuccessEvent.class, threadMode), new C0239e("updateRestrictStateEvent", UpdateRestrictStateEvent.class, threadMode), new C0239e("EventShowGuide", ShowGuideEvent.class, threadMode), new C0239e("selectChannelTab", SelectAllChannelTabEvent.class, threadMode)}));
    }

    /* renamed from: b */
    private static void m25615b(InterfaceC0237c interfaceC0237c) {
        f25177a.put(interfaceC0237c.mo884c(), interfaceC0237c);
    }

    @Override // af.InterfaceC0238d
    /* renamed from: a */
    public InterfaceC0237c mo887a(Class cls) {
        InterfaceC0237c interfaceC0237c = (InterfaceC0237c) f25177a.get(cls);
        if (interfaceC0237c != null) {
            return interfaceC0237c;
        }
        return null;
    }
}
