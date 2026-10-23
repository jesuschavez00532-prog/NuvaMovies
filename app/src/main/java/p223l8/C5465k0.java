package p223l8;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;
import ba.AbstractC1196d;
import be.C1328x;
import cc.C1466m0;
import com.core.sysopt.mark.live.ChannelPanelRootView;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.view.ViewOnFocusChangeListenerC2876d;
import com.lzy.okgo.cookie.SerializableCookie;
import com.module.event.GetAllLiveDataSuccessEvent;
import com.module.event.GetChildLiveDataSuccessEvent;
import com.module.event.GetLiveFavoriteSucEvent;
import com.module.event.HideContentFragmentEvent;
import com.module.event.HideLockViewEvent;
import com.module.event.LiveGuideShow;
import com.module.event.PlaySelectedChannelListEvent;
import com.module.event.PreAllLiveDataEvent;
import com.module.event.RefreshLockEvent;
import com.module.event.SetVoiceSearchLiveDataEvent;
import com.module.event.ShowGuideEvent;
import com.module.event.UpdatePlayIndexItemEvent;
import com.module.view.AutoFocusedTextView;
import com.request.result.Channel;
import com.request.result.UserInfo;
import com.widget.custom.MemoryListView;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import ne.C5878u;
import org.greenrobot.eventbus.ThreadMode;
import p028b8.C1149b;
import p040c8.C1407f;
import p040c8.C1427v;
import p040c8.C1428w;
import p102db.C4053l;
import p117ea.AbstractC4161e;
import p130f8.InterfaceC4274a;
import p130f8.InterfaceC4275b;
import p159h8.C4625k;
import p207k8.ViewOnClickListenerC5133a;
import p258o3.AbstractC5907c;
import p302qc.C6448c;
import p348u2.AbstractC7029f;
import p400xa.C7578j;
import p400xa.C7586l1;
import p400xa.C7589m1;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: l8.k0 */
/* loaded from: classes.dex */
public final class C5465k0 extends AbstractC1196d<InterfaceC4274a> implements InterfaceC4275b {

    /* renamed from: A0 */
    private C1149b f22220A0;

    /* renamed from: C0 */
    private ViewOnClickListenerC5133a f22222C0;

    /* renamed from: D0 */
    private boolean f22223D0;

    /* renamed from: E0 */
    private ViewOnFocusChangeListenerC2876d f22224E0;

    /* renamed from: F0 */
    private InterfaceC5642a f22225F0;

    /* renamed from: z0 */
    private View.OnFocusChangeListener f22229z0;

    /* renamed from: H0 */
    public Map f22227H0 = new LinkedHashMap();

    /* renamed from: y0 */
    private final String f22228y0 = "LiveChannelFrag";

    /* renamed from: B0 */
    private String f22221B0 = "HomeLive";

    /* renamed from: G0 */
    private boolean f22226G0 = true;

    /* renamed from: l8.k0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Fragment m3133W6 = C5465k0.this.m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            return Boolean.valueOf(((C5442e1) m3133W6).mo21948d4());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ArrayList f22231a;

        /* renamed from: b */
        final /* synthetic */ C5465k0 f22232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList arrayList, C5465k0 c5465k0) {
            super(1);
            this.f22231a = arrayList;
            this.f22232b = c5465k0;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Integer num) {
            AbstractC5868k.m23674f(num, "it");
            C1407f c1407f = C1407f.f5458a;
            String channelCode = ((Channel) this.f22231a.get(num.intValue())).getChannelCode();
            Fragment m3133W6 = this.f22232b.m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            return Boolean.valueOf(c1407f.m6485F(channelCode, ((C5442e1) m3133W6).mo21948d4()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f22233a;

        /* renamed from: b */
        final /* synthetic */ C5876s f22234b;

        /* renamed from: c */
        final /* synthetic */ C5465k0 f22235c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f22236d;

        /* renamed from: e */
        final /* synthetic */ boolean f22237e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C5878u c5878u, C5876s c5876s, C5465k0 c5465k0, ArrayList arrayList, boolean z10) {
            super(1);
            this.f22233a = c5878u;
            this.f22234b = c5876s;
            this.f22235c = c5465k0;
            this.f22236d = arrayList;
            this.f22237e = z10;
        }

        /* renamed from: a */
        public final void m22114a(Integer num) {
            Disposable disposable = (Disposable) this.f22233a.f23412a;
            if (disposable != null) {
                disposable.dispose();
            }
            C5876s c5876s = this.f22234b;
            AbstractC5868k.m23673e(num, "it");
            c5876s.f23410a = num.intValue();
            this.f22235c.m22046Ia(this.f22234b.f23410a, this.f22236d);
            if (!this.f22237e) {
                ((InterfaceC4274a) this.f22235c.m5478w9()).mo17832s2();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22114a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f22238a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m22115a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22115a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f22239a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C5878u c5878u) {
            super(1);
            this.f22239a = c5878u;
        }

        /* renamed from: a */
        public final void m22116a(Disposable disposable) {
            this.f22239a.f23412a = disposable;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22116a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.k0$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5878u f22241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C5878u c5878u) {
            super(1);
            this.f22241b = c5878u;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Integer num) {
            boolean m6469G;
            AbstractC5868k.m23674f(num, "it");
            Fragment m3133W6 = C5465k0.this.m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            if (((C5442e1) m3133W6).mo21948d4()) {
                m6469G = C1427v.f5519a.m6636W(((Channel) ((ArrayList) this.f22241b.f23412a).get(num.intValue())).getChannelCode());
            } else {
                m6469G = C1407f.m6469G(C1407f.f5458a, ((Channel) ((ArrayList) this.f22241b.f23412a).get(num.intValue())).getChannelCode(), false, 2, null);
            }
            return Boolean.valueOf(m6469G);
        }
    }

    /* renamed from: l8.k0$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f22242a;

        /* renamed from: b */
        final /* synthetic */ C5876s f22243b;

        /* renamed from: c */
        final /* synthetic */ C5465k0 f22244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C5878u c5878u, C5876s c5876s, C5465k0 c5465k0) {
            super(1);
            this.f22242a = c5878u;
            this.f22243b = c5876s;
            this.f22244c = c5465k0;
        }

        /* renamed from: a */
        public final void m22118a(Integer num) {
            Disposable disposable = (Disposable) this.f22242a.f23412a;
            if (disposable != null) {
                disposable.dispose();
            }
            C5876s c5876s = this.f22243b;
            AbstractC5868k.m23673e(num, "it");
            c5876s.f23410a = num.intValue();
            C1149b c1149b = this.f22244c.f22220A0;
            C1149b c1149b2 = null;
            if (c1149b == null) {
                AbstractC5868k.m23686r("mChannelAdapter");
                c1149b = null;
            }
            if (c1149b.getCount() > 0) {
                C1149b c1149b3 = this.f22244c.f22220A0;
                if (c1149b3 == null) {
                    AbstractC5868k.m23686r("mChannelAdapter");
                    c1149b3 = null;
                }
                c1149b3.m5222h();
                ((MemoryListView) this.f22244c.m22101W9(R$id.mLvChannelList)).setSelection(this.f22243b.f23410a);
                C1149b c1149b4 = this.f22244c.f22220A0;
                if (c1149b4 == null) {
                    AbstractC5868k.m23686r("mChannelAdapter");
                } else {
                    c1149b2 = c1149b4;
                }
                c1149b2.notifyDataSetChanged();
            }
            ((MemoryListView) this.f22244c.m22101W9(R$id.mLvChannelList)).requestFocus();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22118a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.k0$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f22245a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m22119a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22119a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.k0$i */
    /* loaded from: classes2.dex */
    static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f22246a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C5878u c5878u) {
            super(1);
            this.f22246a = c5878u;
        }

        /* renamed from: a */
        public final void m22120a(Disposable disposable) {
            this.f22246a.f23412a = disposable;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22120a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5642a f22247a;

        /* renamed from: b */
        final /* synthetic */ C5465k0 f22248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC5642a interfaceC5642a, C5465k0 c5465k0) {
            super(0);
            this.f22247a = interfaceC5642a;
            this.f22248b = c5465k0;
        }

        /* renamed from: a */
        public final void m22121a() {
            this.f22247a.invoke();
            this.f22248b.m22096Ra();
            C7589m1.f27886a.m29156y("LIVE");
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22121a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5642a {
        k() {
            super(0);
        }

        /* renamed from: a */
        public final void m22122a() {
            InterfaceC5642a interfaceC5642a = C5465k0.this.f22225F0;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22122a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$l */
    /* loaded from: classes2.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {
        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m22123a(View view) {
            int i10 = 0;
            AbstractC5868k.m23674f(view, "it");
            C7589m1.f27886a.m29149r();
            C1466m0 c1466m0 = C1466m0.f5627a;
            if (c1466m0.m6838K()) {
                i10 = 5;
            } else if (c1466m0.m6839L()) {
                i10 = 4;
            } else {
                i10 = 3;
            }
            C6448c.m25240q(C5634i.m22843d("http://module_mine/UserCenterActivity").m25253s("needPerformCrSwitch", true).m25253s("extra_from_router", true).m25255u("SELECTED_POSITION", i10).m25254t(262144), C5465k0.this.m3096J6(), null, 2, null);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22123a((View) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {
        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m22124a(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            if (!AbstractC5868k.m23669a(C5465k0.this.m22108ua(), "FreeLive")) {
                                C5465k0.this.m22049Ka();
                                return;
                            }
                            C7586l1 c7586l1 = C7586l1.f27877a;
                            Context m3096J6 = C5465k0.this.m3096J6();
                            AbstractC5868k.m23671c(m3096J6);
                            String string = C5465k0.this.m3154d7().getString(R$string.personal_goto_personal_get_vip);
                            AbstractC5868k.m23673e(string, "resources.getString(R.st…al_goto_personal_get_vip)");
                            C7586l1.m29112f(c7586l1, m3096J6, string, 0, 0, 12, null);
                            return;
                        }
                        return;
                    }
                    Fragment m3133W6 = C5465k0.this.m3133W6();
                    AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                    ((C5442e1) m3133W6).m21949db();
                    return;
                }
                if (!AbstractC5868k.m23669a(C5465k0.this.m22108ua(), "FreeLive")) {
                    C5465k0.this.m22073bb();
                    return;
                }
                C7586l1 c7586l12 = C7586l1.f27877a;
                Context m3096J62 = C5465k0.this.m3096J6();
                AbstractC5868k.m23671c(m3096J62);
                String string2 = C5465k0.this.m3154d7().getString(R$string.personal_goto_personal_get_vip);
                AbstractC5868k.m23673e(string2, "resources.getString(R.st…al_goto_personal_get_vip)");
                C7586l1.m29112f(c7586l12, m3096J62, string2, 0, 0, 12, null);
                return;
            }
            if (!AbstractC5868k.m23669a(C5465k0.this.m22108ua(), "FreeLive")) {
                C5465k0.this.m22076fa();
                return;
            }
            C7586l1 c7586l13 = C7586l1.f27877a;
            Context m3096J63 = C5465k0.this.m3096J6();
            AbstractC5868k.m23671c(m3096J63);
            String string3 = C5465k0.this.m3154d7().getString(R$string.personal_goto_personal_get_vip);
            AbstractC5868k.m23673e(string3, "resources.getString(R.st…al_goto_personal_get_vip)");
            C7586l1.m29112f(c7586l13, m3096J63, string3, 0, 0, 12, null);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22124a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.k0$n */
    /* loaded from: classes2.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final n f22252a = new n();

        n() {
            super(0);
        }

        /* renamed from: a */
        public final void m22125a() {
            C7709c.m29787d().m29801m(new LiveGuideShow(false));
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22125a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: Aa */
    public static final boolean m22038Aa(C5465k0 c5465k0, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5465k0, "this$0");
        if (keyEvent.getAction() == 0) {
            C1149b c1149b = null;
            switch (i10) {
                case 19:
                    C1149b c1149b2 = c5465k0.f22220A0;
                    if (c1149b2 == null) {
                        AbstractC5868k.m23686r("mChannelAdapter");
                        c1149b2 = null;
                    }
                    if (c1149b2.getCount() < 0) {
                        return true;
                    }
                    int i11 = R$id.mLvChannelList;
                    if (((MemoryListView) c5465k0.m22101W9(i11)).getSelectedItemPosition() == 0) {
                        int i12 = R$id.mTvAdultDisable;
                        if (((TextView) c5465k0.m22101W9(i12)).getVisibility() == 0) {
                            ((TextView) c5465k0.m22101W9(i12)).requestFocus();
                        } else {
                            MemoryListView memoryListView = (MemoryListView) c5465k0.m22101W9(i11);
                            C1149b c1149b3 = c5465k0.f22220A0;
                            if (c1149b3 == null) {
                                AbstractC5868k.m23686r("mChannelAdapter");
                            } else {
                                c1149b = c1149b3;
                            }
                            memoryListView.setSelectionTriggerItemSelect(c1149b.getCount() - 1);
                        }
                        return true;
                    }
                    break;
                case 20:
                    C1149b c1149b4 = c5465k0.f22220A0;
                    if (c1149b4 == null) {
                        AbstractC5868k.m23686r("mChannelAdapter");
                        c1149b4 = null;
                    }
                    if (c1149b4.getCount() < 0) {
                        return true;
                    }
                    int i13 = R$id.mLvChannelList;
                    int selectedItemPosition = ((MemoryListView) c5465k0.m22101W9(i13)).getSelectedItemPosition();
                    C1149b c1149b5 = c5465k0.f22220A0;
                    if (c1149b5 == null) {
                        AbstractC5868k.m23686r("mChannelAdapter");
                    } else {
                        c1149b = c1149b5;
                    }
                    if (selectedItemPosition == c1149b.getCount() - 1) {
                        int i14 = R$id.mTvAdultDisable;
                        if (((TextView) c5465k0.m22101W9(i14)).getVisibility() == 0) {
                            ((TextView) c5465k0.m22101W9(i14)).requestFocus();
                        } else {
                            ((MemoryListView) c5465k0.m22101W9(i13)).setSelectionTriggerItemSelect(0);
                        }
                        return true;
                    }
                    break;
                case 21:
                    Fragment m3133W6 = c5465k0.m3133W6();
                    AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                    ((C5442e1) m3133W6).m21964ra();
                    return true;
                case 22:
                    C1149b c1149b6 = c5465k0.f22220A0;
                    if (c1149b6 == null) {
                        AbstractC5868k.m23686r("mChannelAdapter");
                    } else {
                        c1149b = c1149b6;
                    }
                    int i15 = R$id.mLvChannelList;
                    c1149b.m5225l(((MemoryListView) c5465k0.m22101W9(i15)).getSelectedItemPosition());
                    Channel mo17824B1 = ((InterfaceC4274a) c5465k0.m5478w9()).mo17824B1(((MemoryListView) c5465k0.m22101W9(i15)).getSelectedItemPosition());
                    if (mo17824B1 != null) {
                        mo17824B1.setChannelNumber(((MemoryListView) c5465k0.m22101W9(i15)).getSelectedItemPosition() + 1);
                        C1427v c1427v = C1427v.f5519a;
                        c1427v.m6648l0(mo17824B1);
                        Fragment m3133W62 = c5465k0.m3133W6();
                        AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                        ((C5442e1) m3133W62).m21967va(mo17824B1);
                        c1427v.m6649m0(mo17824B1.getChannelCode());
                    }
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ba */
    public static final void m22039Ba(C5465k0 c5465k0, AdapterView adapterView, View view, int i10, long j10) {
        boolean z10;
        AbstractC5868k.m23674f(c5465k0, "this$0");
        C7709c.m29787d().m29801m(new HideContentFragmentEvent());
        Fragment m3133W6 = c5465k0.m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        int m21936Fa = ((C5442e1) m3133W6).m21936Fa();
        C1407f c1407f = C1407f.f5458a;
        if (m21936Fa == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        c1407f.m6504c0(z10);
        ((InterfaceC4274a) c5465k0.m5478w9()).mo17831n3(i10, c5465k0.f22221B0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ca */
    public static final boolean m22040Ca(C5465k0 c5465k0, AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5868k.m23674f(c5465k0, "this$0");
        c5465k0.m22069Za();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Da */
    public static final void m22041Da(C5465k0 c5465k0, View view, boolean z10) {
        AbstractC5868k.m23674f(c5465k0, "this$0");
        if (z10) {
            ((LinearLayout) c5465k0.m22101W9(R$id.mLlMenu)).setVisibility(0);
            c5465k0.m22101W9(R$id.mViewLine).setVisibility(0);
        } else {
            ((LinearLayout) c5465k0.m22101W9(R$id.mLlMenu)).setVisibility(8);
            c5465k0.m22101W9(R$id.mViewLine).setVisibility(8);
        }
        View.OnFocusChangeListener onFocusChangeListener = c5465k0.f22229z0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ea */
    public static final boolean m22042Ea(C5465k0 c5465k0, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5465k0, "this$0");
        if (keyEvent.getAction() == 0) {
            C1149b c1149b = null;
            switch (i10) {
                case 19:
                    if (!c5465k0.m22090Fa()) {
                        C1149b c1149b2 = c5465k0.f22220A0;
                        if (c1149b2 == null) {
                            AbstractC5868k.m23686r("mChannelAdapter");
                            c1149b2 = null;
                        }
                        if (c1149b2.getCount() > 0) {
                            int i11 = R$id.mLvChannelList;
                            MemoryListView memoryListView = (MemoryListView) c5465k0.m22101W9(i11);
                            C1149b c1149b3 = c5465k0.f22220A0;
                            if (c1149b3 == null) {
                                AbstractC5868k.m23686r("mChannelAdapter");
                            } else {
                                c1149b = c1149b3;
                            }
                            memoryListView.setSelectionTriggerItemSelect(c1149b.getCount() - 1);
                            ((MemoryListView) c5465k0.m22101W9(i11)).requestFocus();
                        }
                    }
                    return true;
                case 20:
                    if (c5465k0.m22090Fa()) {
                        ViewOnFocusChangeListenerC2876d viewOnFocusChangeListenerC2876d = c5465k0.f22224E0;
                        if (viewOnFocusChangeListenerC2876d != null) {
                            viewOnFocusChangeListenerC2876d.requestFocus();
                        }
                    } else {
                        C1149b c1149b4 = c5465k0.f22220A0;
                        if (c1149b4 == null) {
                            AbstractC5868k.m23686r("mChannelAdapter");
                        } else {
                            c1149b = c1149b4;
                        }
                        if (c1149b.getCount() > 0) {
                            int i12 = R$id.mLvChannelList;
                            ((MemoryListView) c5465k0.m22101W9(i12)).setSelectionTriggerItemSelect(0);
                            ((MemoryListView) c5465k0.m22101W9(i12)).requestFocus();
                        }
                    }
                    return true;
                case 21:
                    Fragment m3133W6 = c5465k0.m3133W6();
                    AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                    ((C5442e1) m3133W6).m21964ra();
                    return true;
                case 22:
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ia */
    public final void m22046Ia(int i10, ArrayList arrayList) {
        if (m3075C6() != null && !m3192t7()) {
            int i11 = R$id.mLvChannelList;
            if (((MemoryListView) m22101W9(i11)) != null) {
                ((MemoryListView) m22101W9(i11)).setSelection(i10);
                C1149b c1149b = this.f22220A0;
                C1149b c1149b2 = null;
                if (c1149b == null) {
                    AbstractC5868k.m23686r("mChannelAdapter");
                    c1149b = null;
                }
                c1149b.m5222h();
                C1149b c1149b3 = this.f22220A0;
                if (c1149b3 == null) {
                    AbstractC5868k.m23686r("mChannelAdapter");
                } else {
                    c1149b2 = c1149b3;
                }
                c1149b2.m5223i(arrayList);
                Fragment m3133W6 = m3133W6();
                AbstractC5868k.m23671c(m3133W6);
                if (m3133W6.m3079D7()) {
                    Fragment m3133W62 = m3133W6();
                    AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                    if (!((C5442e1) m3133W62).m21944Sa()) {
                        ((MemoryListView) m22101W9(i11)).requestFocus();
                        if (C1427v.f5519a.m6621G()) {
                            Fragment m3133W63 = m3133W6();
                            AbstractC5868k.m23672d(m3133W63, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                            if (((C5442e1) m3133W63).mo21948d4()) {
                                m22067Ya();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ka */
    public final void m22049Ka() {
        ((InterfaceC4274a) m5478w9()).mo17827Q2(((MemoryListView) m22101W9(R$id.mLvChannelList)).getSelectedItemPosition());
    }

    /* renamed from: La */
    private final void m22051La() {
        int i10 = R$id.mLvChannelList;
        int selectedItemPosition = ((MemoryListView) m22101W9(i10)).getSelectedItemPosition() - 7;
        if (selectedItemPosition < 0) {
            selectedItemPosition = 0;
        }
        ((MemoryListView) m22101W9(i10)).setSelectionTriggerItemSelect(selectedItemPosition);
    }

    /* renamed from: Ma */
    private final void m22053Ma() {
        int i10 = R$id.mLvChannelList;
        int selectedItemPosition = ((MemoryListView) m22101W9(i10)).getSelectedItemPosition();
        C1149b c1149b = this.f22220A0;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        int count = c1149b.getCount();
        int i11 = selectedItemPosition + 7;
        if (i11 + 1 >= count) {
            i11 = count - 1;
        }
        ((MemoryListView) m22101W9(i10)).setSelectionTriggerItemSelect(i11);
    }

    /* renamed from: Na */
    private final void m22055Na(int i10, boolean z10) {
        boolean z11;
        int i11 = R$id.mLvChannelList;
        int firstVisiblePosition = ((MemoryListView) m22101W9(i11)).getFirstVisiblePosition();
        int lastVisiblePosition = ((MemoryListView) m22101W9(i11)).getLastVisiblePosition();
        int i12 = 0;
        if (firstVisiblePosition <= i10 && i10 <= lastVisiblePosition) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        View childAt = ((MemoryListView) m22101W9(i11)).getChildAt(i10 - firstVisiblePosition);
        if (childAt == null) {
            return;
        }
        ImageView imageView = (ImageView) childAt.findViewById(R$id.mIvFav);
        if (!z10) {
            i12 = 4;
        }
        imageView.setVisibility(i12);
    }

    /* renamed from: Oa */
    private final void m22057Oa(int i10, boolean z10) {
        boolean z11;
        int i11 = R$id.mLvChannelList;
        int firstVisiblePosition = ((MemoryListView) m22101W9(i11)).getFirstVisiblePosition();
        int lastVisiblePosition = ((MemoryListView) m22101W9(i11)).getLastVisiblePosition();
        int i12 = 0;
        if (firstVisiblePosition <= i10 && i10 <= lastVisiblePosition) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        View childAt = ((MemoryListView) m22101W9(i11)).getChildAt(i10 - firstVisiblePosition);
        if (childAt == null) {
            return;
        }
        ImageView imageView = (ImageView) childAt.findViewById(R$id.mIvLock);
        if (!z10) {
            i12 = 4;
        }
        imageView.setVisibility(i12);
    }

    /* renamed from: Ya */
    private final void m22067Ya() {
        C1149b c1149b = this.f22220A0;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        int i10 = R$id.mLvChannelList;
        c1149b.m5225l(((MemoryListView) m22101W9(i10)).getSelectedItemPosition());
        Channel mo17824B1 = ((InterfaceC4274a) m5478w9()).mo17824B1(((MemoryListView) m22101W9(i10)).getSelectedItemPosition());
        if (mo17824B1 != null) {
            mo17824B1.setChannelNumber(((MemoryListView) m22101W9(i10)).getSelectedItemPosition() + 1);
            C1427v c1427v = C1427v.f5519a;
            c1427v.m6648l0(mo17824B1);
            Fragment m3133W6 = m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            ((C5442e1) m3133W6).m21967va(mo17824B1);
            c1427v.m6649m0(mo17824B1.getChannelCode());
        }
    }

    /* renamed from: Za */
    private final void m22069Za() {
        if (((InterfaceC4274a) m5478w9()).mo17828U1(((MemoryListView) m22101W9(R$id.mLvChannelList)).getSelectedItemPosition())) {
            return;
        }
        ViewOnClickListenerC5133a viewOnClickListenerC5133a = new ViewOnClickListenerC5133a();
        this.f22222C0 = viewOnClickListenerC5133a;
        viewOnClickListenerC5133a.m20765I9(new m());
        ViewOnClickListenerC5133a viewOnClickListenerC5133a2 = this.f22222C0;
        if (viewOnClickListenerC5133a2 != null) {
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            viewOnClickListenerC5133a2.mo3277E9(m3119R6, "LiveMenuDialog");
        }
    }

    /* renamed from: ab */
    private final void m22071ab() {
        C4053l.a aVar = C4053l.f17879P0;
        C4053l.c cVar = C4053l.c.LiveMenu;
        if (aVar.m17071b(cVar)) {
            C7709c.m29787d().m29801m(new LiveGuideShow(false));
            return;
        }
        C4053l c4053l = new C4053l();
        LinearLayout linearLayout = (LinearLayout) m22101W9(R$id.mLlMenu);
        AbstractC5868k.m23673e(linearLayout, "mLlMenu");
        c4053l.m17069ea(linearLayout);
        c4053l.m17067ca(C4053l.b.TOP_RIGHT);
        c4053l.m17065aa(R$layout.layout_guide_menu);
        c4053l.m17066ba(-AutoSizeUtils.dp2px(m3096J6(), 30.0f), AutoSizeUtils.dp2px(m3096J6(), 13.0f));
        c4053l.m17068da(n.f22252a);
        AbstractC0729o m3093I6 = m3093I6();
        AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
        c4053l.mo3277E9(m3093I6, "GuideDialog");
        aVar.m17073d(cVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bb */
    public final void m22073bb() {
        ((InterfaceC4274a) m5478w9()).mo17829Z0(((MemoryListView) m22101W9(R$id.mLvChannelList)).getSelectedItemPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final void m22075ea(C5465k0 c5465k0) {
        AbstractC5868k.m23674f(c5465k0, "this$0");
        C4053l.a aVar = C4053l.f17879P0;
        if (aVar.m17071b(C4053l.c.BackIcon)) {
            C4053l.c cVar = C4053l.c.LiveMenu;
            if (!aVar.m17071b(cVar)) {
                aVar.m17073d(cVar, true);
                c5465k0.m22071ab();
                C7709c.m29787d().m29801m(new LiveGuideShow(true));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fa */
    public final void m22076fa() {
        if (C7578j.f27850a.m29087a()) {
            return;
        }
        ((InterfaceC4274a) m5478w9()).mo17825B2(((MemoryListView) m22101W9(R$id.mLvChannelList)).getSelectedItemPosition());
    }

    /* renamed from: ga */
    private final void m22077ga(final ArrayList arrayList, final boolean z10) {
        final C5876s c5876s = new C5876s();
        if (!arrayList.isEmpty()) {
            C5878u c5878u = new C5878u();
            Observable<Integer> range = Observable.range(0, arrayList.size());
            final b bVar = new b(arrayList, this);
            Observable<R> compose = range.filter(new Predicate() { // from class: l8.b0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean m22078ha;
                    m22078ha = C5465k0.m22078ha(InterfaceC5660l.this, obj);
                    return m22078ha;
                }
            }).compose(AbstractC7029f.m27120a());
            final c cVar = new c(c5878u, c5876s, this, arrayList, z10);
            Consumer consumer = new Consumer() { // from class: l8.c0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5465k0.m22079ia(InterfaceC5660l.this, obj);
                }
            };
            final d dVar = d.f22238a;
            Consumer<? super Throwable> consumer2 = new Consumer() { // from class: l8.d0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5465k0.m22080ja(InterfaceC5660l.this, obj);
                }
            };
            Action action = new Action() { // from class: l8.e0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    C5465k0.m22081ka(C5465k0.this, c5876s, arrayList, z10);
                }
            };
            final e eVar = new e(c5878u);
            compose.subscribe(consumer, consumer2, action, new Consumer() { // from class: l8.f0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5465k0.m22082la(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final boolean m22078ha(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ia */
    public static final void m22079ia(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public static final void m22080ja(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public static final void m22081ka(C5465k0 c5465k0, C5876s c5876s, ArrayList arrayList, boolean z10) {
        AbstractC5868k.m23674f(c5465k0, "this$0");
        AbstractC5868k.m23674f(c5876s, "$playIndex");
        AbstractC5868k.m23674f(arrayList, "$data");
        c5465k0.m22046Ia(c5876s.f23410a, arrayList);
        if (!z10) {
            ((InterfaceC4274a) c5465k0.m5478w9()).mo17832s2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: la */
    public static final void m22082la(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: na */
    public static final void m22083na(C5465k0 c5465k0, C5876s c5876s) {
        AbstractC5868k.m23674f(c5465k0, "this$0");
        AbstractC5868k.m23674f(c5876s, "$playIndex");
        C1149b c1149b = c5465k0.f22220A0;
        C1149b c1149b2 = null;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        if (c1149b.getCount() > 0) {
            C1149b c1149b3 = c5465k0.f22220A0;
            if (c1149b3 == null) {
                AbstractC5868k.m23686r("mChannelAdapter");
                c1149b3 = null;
            }
            c1149b3.m5222h();
            ((MemoryListView) c5465k0.m22101W9(R$id.mLvChannelList)).setSelection(c5876s.f23410a);
            C1149b c1149b4 = c5465k0.f22220A0;
            if (c1149b4 == null) {
                AbstractC5868k.m23686r("mChannelAdapter");
            } else {
                c1149b2 = c1149b4;
            }
            c1149b2.notifyDataSetChanged();
        }
        ((MemoryListView) c5465k0.m22101W9(R$id.mLvChannelList)).requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oa */
    public static final void m22084oa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pa */
    public static final boolean m22085pa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qa */
    public static final void m22086qa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ra */
    public static final void m22087ra(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: xa */
    public static /* synthetic */ void m22088xa(C5465k0 c5465k0, boolean z10, InterfaceC5642a interfaceC5642a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c5465k0.m22110wa(z10, interfaceC5642a);
    }

    /* renamed from: za */
    private final void m22089za() {
        int i10 = R$id.mLvChannelList;
        ((MemoryListView) m22101W9(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.g0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m22038Aa;
                m22038Aa = C5465k0.m22038Aa(C5465k0.this, view, i11, keyEvent);
                return m22038Aa;
            }
        });
        ((MemoryListView) m22101W9(i10)).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l8.h0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j10) {
                C5465k0.m22039Ba(C5465k0.this, adapterView, view, i11, j10);
            }
        });
        ((MemoryListView) m22101W9(i10)).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l8.i0
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i11, long j10) {
                boolean m22040Ca;
                m22040Ca = C5465k0.m22040Ca(C5465k0.this, adapterView, view, i11, j10);
                return m22040Ca;
            }
        });
        ((MemoryListView) m22101W9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l8.j0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5465k0.m22041Da(C5465k0.this, view, z10);
            }
        });
        int i11 = R$id.mTvAdultDisable;
        TextView textView = (TextView) m22101W9(i11);
        AbstractC5868k.m23673e(textView, "mTvAdultDisable");
        AbstractC5907c.m23859c(textView, new l(), 0L, 2, null);
        ((TextView) m22101W9(i11)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.v
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                boolean m22042Ea;
                m22042Ea = C5465k0.m22042Ea(C5465k0.this, view, i12, keyEvent);
                return m22042Ea;
            }
        });
    }

    @Override // p130f8.InterfaceC4275b
    /* renamed from: A2 */
    public void mo17835A2(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "data");
        C1149b c1149b = this.f22220A0;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        c1149b.m5223i(arrayList);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_live_channel;
    }

    @Override // p130f8.InterfaceC4275b
    /* renamed from: B2 */
    public void mo17836B2() {
        m22096Ra();
        m22103Xa();
    }

    @Override // p130f8.InterfaceC4275b
    /* renamed from: C3 */
    public void mo17837C3(int i10) {
        ((MemoryListView) m22101W9(R$id.mLvChannelList)).setSelectionTriggerItemSelect(i10);
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void EventShowGuide(ShowGuideEvent showGuideEvent) {
        AbstractC5868k.m23674f(showGuideEvent, "event");
        if (showGuideEvent.getType() == C4053l.c.LiveMenu && m3073B7()) {
            m22071ab();
        }
    }

    @Override // p130f8.InterfaceC4275b
    /* renamed from: F5 */
    public void mo17838F5(ArrayList arrayList, boolean z10) {
        AbstractC5868k.m23674f(arrayList, "data");
        m22077ga(arrayList, z10);
    }

    /* renamed from: Fa */
    public final boolean m22090Fa() {
        int i10 = R$id.mRootView;
        if (((ChannelPanelRootView) m22101W9(i10)) == null || this.f22224E0 == null || ((ChannelPanelRootView) m22101W9(i10)).indexOfChild(this.f22224E0) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: Ga */
    public final boolean m22091Ga() {
        int i10 = R$id.mLvChannelList;
        if (((MemoryListView) m22101W9(i10)) != null && ((MemoryListView) m22101W9(i10)).getCount() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Ha */
    public final boolean m22092Ha() {
        return m30051p9();
    }

    /* renamed from: Ja */
    public final void m22093Ja(int i10, boolean z10, boolean z11) {
        if (m3133W6() == null) {
            return;
        }
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        int m21936Fa = ((C5442e1) m3133W6).m21936Fa();
        Fragment m3133W62 = m3133W6();
        AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        int m21935Ea = ((C5442e1) m3133W62).m21935Ea();
        this.f22223D0 = z11;
        InterfaceC4274a.a.m17834a((InterfaceC4274a) m5478w9(), i10, z10, m21936Fa, m21935Ea, z11, false, 32, null);
    }

    @Override // p130f8.InterfaceC4275b
    /* renamed from: K2 */
    public void mo17839K2(int i10, boolean z10) {
        m22057Oa(i10, z10);
    }

    /* renamed from: Pa */
    public final void m22094Pa(View.OnFocusChangeListener onFocusChangeListener) {
        AbstractC5868k.m23674f(onFocusChangeListener, "listener");
        this.f22229z0 = onFocusChangeListener;
    }

    /* renamed from: Qa */
    public final void m22095Qa(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        this.f22225F0 = interfaceC5642a;
    }

    /* renamed from: Ra */
    public final void m22096Ra() {
        if (m22090Fa()) {
            ((ChannelPanelRootView) m22101W9(R$id.mRootView)).removeView(this.f22224E0);
            this.f22224E0 = null;
        }
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: Sa */
    public final void m22097Sa() {
        ((MemoryListView) m22101W9(R$id.mLvChannelList)).requestFocus();
        C1149b c1149b = this.f22220A0;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        c1149b.m5225l(-1);
    }

    /* renamed from: Ta */
    public final void m22098Ta() {
        if (m22090Fa()) {
            ((TextView) m22101W9(R$id.mTvAdultDisable)).requestFocus();
        } else {
            ((MemoryListView) m22101W9(R$id.mLvChannelList)).requestFocus();
        }
    }

    @Override // p130f8.InterfaceC4275b
    /* renamed from: U1 */
    public void mo17840U1(int i10) {
    }

    /* renamed from: Ua */
    public final void m22099Ua() {
        String str = this.f22221B0;
        if (AbstractC5868k.m23669a(str, "FreeLive")) {
            InterfaceC4274a interfaceC4274a = (InterfaceC4274a) m5478w9();
            C1407f c1407f = C1407f.f5458a;
            InterfaceC4274a.a.m17834a(interfaceC4274a, c1407f.m6525q(), false, 4, c1407f.m6525q(), false, false, 32, null);
        } else if (AbstractC5868k.m23669a(str, "MatchLive")) {
            InterfaceC4274a interfaceC4274a2 = (InterfaceC4274a) m5478w9();
            C1407f c1407f2 = C1407f.f5458a;
            InterfaceC4274a.a.m17834a(interfaceC4274a2, c1407f2.m6523o(), true, 3, c1407f2.m6523o(), false, false, 32, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V7 */
    public void mo3131V7(boolean z10) {
        super.mo3131V7(z10);
    }

    /* renamed from: Va */
    public final void m22100Va(String str) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m22101W9(R$id.mTvColumnTitle);
        if (autoFocusedTextView != null) {
            autoFocusedTextView.setText(str);
        }
    }

    /* renamed from: W9 */
    public View m22101W9(int i10) {
        View findViewById;
        Map map = this.f22227H0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* renamed from: Wa */
    public final void m22102Wa() {
        AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m22101W9(R$id.mTvColumnTitle);
        if (autoFocusedTextView != null) {
            autoFocusedTextView.setVisibility(8);
        }
        TextView textView = (TextView) m22101W9(R$id.mTvAdultDisable);
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: Xa */
    public final void m22103Xa() {
        AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m22101W9(R$id.mTvColumnTitle);
        if (autoFocusedTextView != null) {
            autoFocusedTextView.setVisibility(0);
        }
        TextView textView = (TextView) m22101W9(R$id.mTvAdultDisable);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // p130f8.InterfaceC4275b
    /* renamed from: c2 */
    public void mo17841c2(int i10, boolean z10) {
        m22055Na(i10, z10);
    }

    /* renamed from: da */
    public final void m22104da() {
        C1149b c1149b = this.f22220A0;
        if (c1149b != null) {
            C1149b c1149b2 = null;
            if (c1149b == null) {
                AbstractC5868k.m23686r("mChannelAdapter");
                c1149b = null;
            }
            c1149b.m5223i(new ArrayList());
            C1149b c1149b3 = this.f22220A0;
            if (c1149b3 == null) {
                AbstractC5868k.m23686r("mChannelAdapter");
            } else {
                c1149b2 = c1149b3;
            }
            c1149b2.m5224j(new HashMap());
        }
        if (m5472B9()) {
            ((InterfaceC4274a) m5478w9()).mo17830j3();
        }
    }

    @Override // p430z9.AbstractC7765c, androidx.fragment.app.Fragment
    /* renamed from: g9 */
    public void mo3165g9(boolean z10) {
        super.mo3165g9(z10);
    }

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void getAllChannelData(GetAllLiveDataSuccessEvent getAllLiveDataSuccessEvent) {
        AbstractC5868k.m23674f(getAllLiveDataSuccessEvent, "event");
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        int m21936Fa = ((C5442e1) m3133W6).m21936Fa();
        Fragment m3133W62 = m3133W6();
        AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        InterfaceC4274a.a.m17834a((InterfaceC4274a) m5478w9(), getAllLiveDataSuccessEvent.getColumnId(), true, m21936Fa, ((C5442e1) m3133W62).m21935Ea(), false, false, 32, null);
    }

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void getChildChannelData(GetChildLiveDataSuccessEvent getChildLiveDataSuccessEvent) {
        AbstractC5868k.m23674f(getChildLiveDataSuccessEvent, "event");
        if (!AbstractC5868k.m23669a(this.f22221B0, getChildLiveDataSuccessEvent.getParentType())) {
            return;
        }
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        int m21936Fa = ((C5442e1) m3133W6).m21936Fa();
        Fragment m3133W62 = m3133W6();
        AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        InterfaceC4274a.a.m17834a((InterfaceC4274a) m5478w9(), getChildLiveDataSuccessEvent.getColumnId(), false, m21936Fa, ((C5442e1) m3133W62).m21935Ea(), false, false, 32, null);
    }

    @InterfaceC7719m
    public final void getFavListSucMessage(GetLiveFavoriteSucEvent getLiveFavoriteSucEvent) {
        AbstractC5868k.m23674f(getLiveFavoriteSucEvent, "event");
        C1149b c1149b = this.f22220A0;
        if (c1149b != null) {
            if (this.f22223D0) {
                Fragment m3133W6 = m3133W6();
                AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                int m21936Fa = ((C5442e1) m3133W6).m21936Fa();
                Fragment m3133W62 = m3133W6();
                AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                InterfaceC4274a.a.m17834a((InterfaceC4274a) m5478w9(), -1, false, m21936Fa, ((C5442e1) m3133W62).m21935Ea(), true, false, 32, null);
                return;
            }
            C1149b c1149b2 = null;
            if (c1149b == null) {
                AbstractC5868k.m23686r("mChannelAdapter");
                c1149b = null;
            }
            C1428w.f5539a.m6673f(c1149b.m5221g());
            C1149b c1149b3 = this.f22220A0;
            if (c1149b3 == null) {
                AbstractC5868k.m23686r("mChannelAdapter");
            } else {
                c1149b2 = c1149b3;
            }
            c1149b2.notifyDataSetChanged();
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void hideLockView(HideLockViewEvent hideLockViewEvent) {
        AbstractC5868k.m23674f(hideLockViewEvent, "event");
        ((MemoryListView) m22101W9(R$id.mLvChannelList)).requestFocus();
    }

    @Override // p130f8.InterfaceC4275b
    /* renamed from: j6 */
    public void mo17842j6(HashMap hashMap) {
        AbstractC5868k.m23674f(hashMap, "epgMap");
        C1149b c1149b = this.f22220A0;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        c1149b.m5224j(hashMap);
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m22099Ua();
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22227H0.clear();
    }

    /* renamed from: ma */
    public final void m22105ma() {
        if (!m30051p9()) {
            return;
        }
        C5878u c5878u = new C5878u();
        C1149b c1149b = this.f22220A0;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        c5878u.f23412a = c1149b.m5221g();
        final C5876s c5876s = new C5876s();
        if (!((Collection) c5878u.f23412a).isEmpty()) {
            C5878u c5878u2 = new C5878u();
            Observable<Integer> range = Observable.range(0, ((ArrayList) c5878u.f23412a).size());
            final f fVar = new f(c5878u);
            Observable<R> compose = range.filter(new Predicate() { // from class: l8.w
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean m22085pa;
                    m22085pa = C5465k0.m22085pa(InterfaceC5660l.this, obj);
                    return m22085pa;
                }
            }).compose(AbstractC7029f.m27120a());
            final g gVar = new g(c5878u2, c5876s, this);
            Consumer consumer = new Consumer() { // from class: l8.x
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5465k0.m22086qa(InterfaceC5660l.this, obj);
                }
            };
            final h hVar = h.f22245a;
            Consumer<? super Throwable> consumer2 = new Consumer() { // from class: l8.y
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5465k0.m22087ra(InterfaceC5660l.this, obj);
                }
            };
            Action action = new Action() { // from class: l8.z
                @Override // io.reactivex.functions.Action
                public final void run() {
                    C5465k0.m22083na(C5465k0.this, c5876s);
                }
            };
            final i iVar = new i(c5878u2);
            compose.subscribe(consumer, consumer2, action, new Consumer() { // from class: l8.a0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5465k0.m22084oa(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        this.f22221B0 = ((C5442e1) m3133W6).m21939Ia();
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        int i10 = R$id.mLvChannelList;
        MemoryListView memoryListView = (MemoryListView) m22101W9(i10);
        AbstractC5868k.m23673e(memoryListView, "mLvChannelList");
        this.f22220A0 = new C1149b(m3096J6, memoryListView, new a());
        MemoryListView memoryListView2 = (MemoryListView) m22101W9(i10);
        C1149b c1149b = this.f22220A0;
        C1149b c1149b2 = null;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        memoryListView2.setAdapter((ListAdapter) c1149b);
        C1149b c1149b3 = this.f22220A0;
        if (c1149b3 == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
        } else {
            c1149b2 = c1149b3;
        }
        c1149b2.notifyDataSetChanged();
        m22089za();
        Fragment m3133W62 = m3133W6();
        AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        if (((C5442e1) m3133W62).m21936Fa() == 3) {
            ((AutoFocusedTextView) m22101W9(R$id.mTvColumnTitle)).setText(m3154d7().getString(R$string.live_tab_channel));
        } else {
            AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m22101W9(R$id.mTvColumnTitle);
            Fragment m3133W63 = m3133W6();
            AbstractC5868k.m23672d(m3133W63, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            autoFocusedTextView.setText(((C5442e1) m3133W63).m21934Da());
        }
        ((LinearLayout) m22101W9(R$id.mLlMenu)).post(new Runnable() { // from class: l8.u
            @Override // java.lang.Runnable
            public final void run() {
                C5465k0.m22075ea(C5465k0.this);
            }
        });
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (m30051p9() && keyEvent.getRepeatCount() == 0) {
            int i11 = R$id.mLvChannelList;
            if (((MemoryListView) m22101W9(i11)).isFocused() || i10 == 21) {
                if (i10 != 21) {
                    if (i10 != 77) {
                        if (i10 != 82) {
                            if (i10 != 168) {
                                if (i10 != 222 && i10 != 2012) {
                                    if (i10 != 59) {
                                        if (i10 != 60) {
                                            if (i10 != 92) {
                                                if (i10 != 93) {
                                                    switch (i10) {
                                                    }
                                                }
                                            }
                                        }
                                        m22051La();
                                        return true;
                                    }
                                    m22053Ma();
                                    return true;
                                }
                                if (!AbstractC5868k.m23669a(this.f22221B0, "FreeLive")) {
                                    m22073bb();
                                } else {
                                    C7586l1 c7586l1 = C7586l1.f27877a;
                                    Context m3096J6 = m3096J6();
                                    AbstractC5868k.m23671c(m3096J6);
                                    String string = m3154d7().getString(R$string.personal_goto_personal_get_vip);
                                    AbstractC5868k.m23673e(string, "resources.getString(R.st…al_goto_personal_get_vip)");
                                    C7586l1.m29112f(c7586l1, m3096J6, string, 0, 0, 12, null);
                                }
                                return true;
                            }
                            if (!AbstractC5868k.m23669a(this.f22221B0, "FreeLive")) {
                                m22049Ka();
                            } else {
                                C7586l1 c7586l12 = C7586l1.f27877a;
                                Context m3096J62 = m3096J6();
                                AbstractC5868k.m23671c(m3096J62);
                                String string2 = m3154d7().getString(R$string.personal_goto_personal_get_vip);
                                AbstractC5868k.m23673e(string2, "resources.getString(R.st…al_goto_personal_get_vip)");
                                C7586l1.m29112f(c7586l12, m3096J62, string2, 0, 0, 12, null);
                            }
                            return true;
                        }
                        if (keyEvent.getAction() == 0) {
                            m22069Za();
                        }
                        return true;
                    }
                    if (!AbstractC5868k.m23669a(this.f22221B0, "FreeLive")) {
                        m22076fa();
                    } else {
                        C7586l1 c7586l13 = C7586l1.f27877a;
                        Context m3096J63 = m3096J6();
                        AbstractC5868k.m23671c(m3096J63);
                        String string3 = m3154d7().getString(R$string.personal_goto_personal_get_vip);
                        AbstractC5868k.m23673e(string3, "resources.getString(R.st…al_goto_personal_get_vip)");
                        C7586l1.m29112f(c7586l13, m3096J63, string3, 0, 0, 12, null);
                    }
                    return true;
                }
                LinearLayout linearLayout = (LinearLayout) m22101W9(R$id.mLlBindEmail);
                if (linearLayout != null && linearLayout.hasFocus()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    TextView textView = (TextView) m22101W9(R$id.mTextForget);
                    if (textView != null && textView.hasFocus()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 && !((MemoryListView) m22101W9(i11)).hasFocus()) {
                        C1149b c1149b = this.f22220A0;
                        if (c1149b == null) {
                            AbstractC5868k.m23686r("mChannelAdapter");
                            c1149b = null;
                        }
                        if (c1149b.getCount() <= 0) {
                            Fragment m3133W6 = m3133W6();
                            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                            ((C5442e1) m3133W6).m21964ra();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void playCurrentChannel(PlaySelectedChannelListEvent playSelectedChannelListEvent) {
        AbstractC5868k.m23674f(playSelectedChannelListEvent, "event");
        C7709c.m29787d().m29801m(new HideContentFragmentEvent());
        ((InterfaceC4274a) m5478w9()).mo17831n3(((MemoryListView) m22101W9(R$id.mLvChannelList)).getSelectedItemPosition(), this.f22221B0);
    }

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void preAllLiveDataMessage(PreAllLiveDataEvent preAllLiveDataEvent) {
        AbstractC5868k.m23674f(preAllLiveDataEvent, "event");
        if (C1407f.f5458a.m6486H() && !AbstractC5868k.m23669a(this.f22221B0, "NewVoiceLive")) {
            Fragment m3133W6 = m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            int m21936Fa = ((C5442e1) m3133W6).m21936Fa();
            Fragment m3133W62 = m3133W6();
            AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            ((InterfaceC4274a) m5478w9()).mo17833z0(preAllLiveDataEvent.getColumnId(), true, m21936Fa, ((C5442e1) m3133W62).m21935Ea(), false, true);
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        ((ChannelPanelRootView) m22101W9(R$id.mRootView)).setVisibility(0);
    }

    /* renamed from: sa */
    public final int m22106sa() {
        return ((MemoryListView) m22101W9(R$id.mLvChannelList)).getSelectedItemPosition();
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void setLockStatus(RefreshLockEvent refreshLockEvent) {
        AbstractC5868k.m23674f(refreshLockEvent, "event");
        ((InterfaceC4274a) m5478w9()).mo17826C3(((MemoryListView) m22101W9(R$id.mLvChannelList)).getSelectedItemPosition(), refreshLockEvent.isLocked());
    }

    @InterfaceC7719m(sticky = true)
    public final void setVoiceSearchLiveData(SetVoiceSearchLiveDataEvent setVoiceSearchLiveDataEvent) {
        AbstractC5868k.m23674f(setVoiceSearchLiveDataEvent, "event");
        if (!AbstractC5868k.m23669a(this.f22221B0, "VoiceLive")) {
            return;
        }
        InterfaceC4274a interfaceC4274a = (InterfaceC4274a) m5478w9();
        C1407f c1407f = C1407f.f5458a;
        InterfaceC4274a.a.m17834a(interfaceC4274a, c1407f.m6523o(), true, 3, c1407f.m6523o(), false, false, 32, null);
        C7709c.m29787d().m29805t(setVoiceSearchLiveDataEvent);
    }

    /* renamed from: ta */
    public final boolean m22107ta() {
        return this.f22223D0;
    }

    /* renamed from: ua */
    public final String m22108ua() {
        return this.f22221B0;
    }

    @InterfaceC7719m
    public final void updatePlayIndexItem(UpdatePlayIndexItemEvent updatePlayIndexItemEvent) {
        AbstractC5868k.m23674f(updatePlayIndexItemEvent, "event");
        C1149b c1149b = this.f22220A0;
        if (c1149b == null) {
            AbstractC5868k.m23686r("mChannelAdapter");
            c1149b = null;
        }
        c1149b.notifyDataSetChanged();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: va, reason: merged with bridge method [inline-methods] */
    public InterfaceC4274a mo5465y9() {
        return new C4625k(this, this);
    }

    /* renamed from: wa */
    public final void m22110wa(boolean z10, InterfaceC5642a interfaceC5642a) {
        String str;
        String str2;
        boolean z11;
        AbstractC5868k.m23674f(interfaceC5642a, "callBack");
        m22102Wa();
        UserInfo m6887v = C1466m0.f5627a.m6887v();
        if (m6887v != null) {
            str = m6887v.getRestrictedStatus();
        } else {
            str = null;
        }
        boolean z12 = true;
        if (AbstractC5868k.m23669a(str, "1")) {
            if (AbstractC4161e.f18225a.m17399b().length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str2 = "type_set";
            } else {
                str2 = "type_check";
            }
        } else {
            str2 = "";
        }
        if (str2.length() != 0) {
            z12 = false;
        }
        if (z12) {
            return;
        }
        if (!m22090Fa()) {
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            AbstractC0729o m3093I6 = m3093I6();
            AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
            ViewOnFocusChangeListenerC2876d viewOnFocusChangeListenerC2876d = new ViewOnFocusChangeListenerC2876d(m3096J6, null, 0, this, m3093I6, 6, null);
            this.f22224E0 = viewOnFocusChangeListenerC2876d;
            viewOnFocusChangeListenerC2876d.m11607m(str2);
            ViewOnFocusChangeListenerC2876d viewOnFocusChangeListenerC2876d2 = this.f22224E0;
            if (viewOnFocusChangeListenerC2876d2 != null) {
                viewOnFocusChangeListenerC2876d2.setCallBack(new j(interfaceC5642a, this));
            }
            ViewOnFocusChangeListenerC2876d viewOnFocusChangeListenerC2876d3 = this.f22224E0;
            if (viewOnFocusChangeListenerC2876d3 != null) {
                viewOnFocusChangeListenerC2876d3.m11608n(new k());
            }
            ((ChannelPanelRootView) m22101W9(R$id.mRootView)).addView(this.f22224E0, 3);
        } else {
            ViewOnFocusChangeListenerC2876d viewOnFocusChangeListenerC2876d4 = this.f22224E0;
            if (viewOnFocusChangeListenerC2876d4 != null) {
                viewOnFocusChangeListenerC2876d4.m11607m(str2);
            }
        }
        if (z10) {
            ((TextView) m22101W9(R$id.mTvAdultDisable)).requestFocus();
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22226G0;
    }

    /* renamed from: ya */
    public final void m22111ya() {
        ViewOnClickListenerC5133a viewOnClickListenerC5133a = this.f22222C0;
        if (viewOnClickListenerC5133a != null) {
            viewOnClickListenerC5133a.mo3279p9();
        }
    }
}
