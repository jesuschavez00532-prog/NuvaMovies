package p223l8;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0738x;
import be.C1328x;
import cc.C1466m0;
import com.core.sysopt.mark.live.FocusBorderView;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.bean.NotifyChannel;
import com.live.p063db.ReservationList;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.ChangeListToAllChannelEvent;
import com.module.event.GetAllLiveDataSuccessEvent;
import com.module.event.GetChildLiveDataSuccessEvent;
import com.module.event.PreAllLiveDataEvent;
import com.module.event.ToStartPlayEvent;
import com.module.event.UpdatePlayIndexItemEvent;
import com.request.result.Channel;
import com.widget.custom.MemoryListView;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5878u;
import ne.C5881x;
import org.greenrobot.eventbus.ThreadMode;
import p028b8.C1159g;
import p040c8.C1407f;
import p040c8.C1415j;
import p130f8.InterfaceC4295v;
import p159h8.C4570a5;
import p207k8.ViewOnClickListenerC5136d;
import p237m8.AbstractC5607a;
import p258o3.C5909e;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p400xa.C7589m1;
import p430z9.AbstractActivityC7763a;
import p430z9.AbstractC7766d;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: l8.t */
/* loaded from: classes.dex */
public final class C5500t extends AbstractC7766d<C4570a5> implements InterfaceC4295v {

    /* renamed from: O0 */
    public static final a f22383O0 = new a(null);

    /* renamed from: P0 */
    private static int f22384P0 = -1;

    /* renamed from: A0 */
    private C5498s1 f22385A0;

    /* renamed from: B0 */
    private b f22386B0;

    /* renamed from: C0 */
    private ViewOnClickListenerC5136d f22387C0;

    /* renamed from: D0 */
    private boolean f22388D0;

    /* renamed from: E0 */
    private boolean f22389E0;

    /* renamed from: H0 */
    private final int f22392H0;

    /* renamed from: J0 */
    private boolean f22394J0;

    /* renamed from: M0 */
    private boolean f22397M0;

    /* renamed from: z0 */
    private C1159g f22400z0;

    /* renamed from: N0 */
    public Map f22398N0 = new LinkedHashMap();

    /* renamed from: y0 */
    private final String f22399y0 = "HomeLiveFragment";

    /* renamed from: F0 */
    private int f22390F0 = -1;

    /* renamed from: G0 */
    private ArrayList f22391G0 = new ArrayList();

    /* renamed from: I0 */
    private final int f22393I0 = 1;

    /* renamed from: K0 */
    private boolean f22395K0 = true;

    /* renamed from: L0 */
    private ArrayList f22396L0 = new ArrayList();

    /* renamed from: l8.t$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m22354a(int i10) {
            C5500t.f22384P0 = i10;
        }
    }

    /* renamed from: l8.t$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo11886a(boolean z10);
    }

    /* renamed from: l8.t$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5878u f22402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C5878u c5878u) {
            super(1);
            this.f22402b = c5878u;
        }

        /* renamed from: a */
        public final void m22355a(Integer num) {
            C1159g c1159g = C5500t.this.f22400z0;
            C1159g c1159g2 = null;
            if (c1159g == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
                c1159g = null;
            }
            c1159g.m5316g(-1);
            MemoryListView memoryListView = (MemoryListView) C5500t.this.m22340Y9(R$id.mLvChannelList);
            if (memoryListView != null) {
                AbstractC5868k.m23673e(num, "it");
                memoryListView.setSelection(num.intValue());
            }
            C1159g c1159g3 = C5500t.this.f22400z0;
            if (c1159g3 == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
            } else {
                c1159g2 = c1159g3;
            }
            c1159g2.notifyDataSetChanged();
            Disposable disposable = (Disposable) this.f22402b.f23412a;
            if (disposable != null) {
                disposable.dispose();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22355a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.t$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f22403a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m22356a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22356a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.t$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f22404a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C5878u c5878u) {
            super(1);
            this.f22404a = c5878u;
        }

        /* renamed from: a */
        public final void m22357a(Disposable disposable) {
            this.f22404a.f23412a = disposable;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22357a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: Aa */
    private final void m22297Aa() {
        ((MemoryListView) m22340Y9(R$id.mLvChannelList)).post(new Runnable() { // from class: l8.e
            @Override // java.lang.Runnable
            public final void run() {
                C5500t.m22298Ba(C5500t.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ba */
    public static final void m22298Ba(C5500t c5500t) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        if (c5500t.m3075C6() == null) {
            return;
        }
        if (c5500t.f22385A0 == null) {
            C5498s1 c5498s1 = new C5498s1();
            c5500t.f22385A0 = c5498s1;
            if (c5500t.f22388D0) {
                AbstractC5868k.m23671c(c5498s1);
                c5498s1.m22262gb(true);
            }
        }
        AbstractC0738x m3534m = c5500t.m3093I6().m3534m();
        AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
        int i10 = R$id.mFlMainLive;
        C5498s1 c5498s12 = c5500t.f22385A0;
        AbstractC5868k.m23671c(c5498s12);
        m3534m.m3645r(i10, c5498s12, "liveFrag").mo3230j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ca */
    public static final void m22299Ca(C5500t c5500t, ReservationList reservationList) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        AbstractC5868k.m23674f(reservationList, "$reserve");
        ViewOnClickListenerC5136d viewOnClickListenerC5136d = c5500t.f22387C0;
        if (viewOnClickListenerC5136d != null) {
            viewOnClickListenerC5136d.mo3278o9();
        }
        C4570a5 c4570a5 = (C4570a5) c5500t.m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19046x0(reservationList, c5500t.f22389E0);
        }
        C4570a5 c4570a52 = (C4570a5) c5500t.m30063y9();
        if (c4570a52 != null) {
            c4570a52.m19042i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Da */
    public static final void m22300Da(C5500t c5500t, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        c5500t.f22387C0 = null;
        C4570a5 c4570a5 = (C4570a5) c5500t.m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19037L();
        }
        C4570a5 c4570a52 = (C4570a5) c5500t.m30063y9();
        if (c4570a52 != null) {
            c4570a52.m19042i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ea */
    public static final void m22301Ea(C5500t c5500t, ObservableEmitter observableEmitter) {
        String str = null;
        AbstractC5868k.m23674f(c5500t, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        ArrayList arrayList = new ArrayList();
        C1159g c1159g = c5500t.f22400z0;
        if (c1159g == null) {
            AbstractC5868k.m23686r("mHomeChannelAdapter");
            c1159g = null;
        }
        arrayList.addAll(c1159g.m5311b());
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                String channelCode = ((Channel) arrayList.get(i10)).getChannelCode();
                Channel m6531w = C1407f.f5458a.m6531w();
                if (m6531w != null) {
                    str = m6531w.getChannelCode();
                } else {
                    str = null;
                }
                if (AbstractC5868k.m23669a(channelCode, str)) {
                    observableEmitter.onNext(Integer.valueOf(i10));
                    break;
                }
                i10++;
            }
            observableEmitter.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fa */
    public static final void m22303Fa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ga */
    public static final void m22305Ga(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ha */
    public static final void m22307Ha(C5500t c5500t) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        C1159g c1159g = c5500t.f22400z0;
        C1159g c1159g2 = null;
        if (c1159g == null) {
            AbstractC5868k.m23686r("mHomeChannelAdapter");
            c1159g = null;
        }
        c1159g.m5316g(-1);
        C1159g c1159g3 = c5500t.f22400z0;
        if (c1159g3 == null) {
            AbstractC5868k.m23686r("mHomeChannelAdapter");
        } else {
            c1159g2 = c1159g3;
        }
        c1159g2.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ia */
    public static final void m22309Ia(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: ba */
    private final void m22327ba(int i10) {
        C1159g c1159g = null;
        if (i10 == this.f22392H0) {
            C1159g c1159g2 = this.f22400z0;
            if (c1159g2 == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
                c1159g2 = null;
            }
            c1159g2.m5315f(false);
            MemoryListView memoryListView = (MemoryListView) m22340Y9(R$id.mLvChannelList);
            C1159g c1159g3 = this.f22400z0;
            if (c1159g3 == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
            } else {
                c1159g = c1159g3;
            }
            memoryListView.setSelection(c1159g.m5313d());
            return;
        }
        if (i10 == this.f22393I0) {
            C1159g c1159g4 = this.f22400z0;
            if (c1159g4 == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
                c1159g4 = null;
            }
            if (c1159g4.getCount() > 0) {
                MemoryListView memoryListView2 = (MemoryListView) m22340Y9(R$id.mLvChannelList);
                C1159g c1159g5 = this.f22400z0;
                if (c1159g5 == null) {
                    AbstractC5868k.m23686r("mHomeChannelAdapter");
                    c1159g5 = null;
                }
                memoryListView2.setSelection(c1159g5.m5313d());
                C1159g c1159g6 = this.f22400z0;
                if (c1159g6 == null) {
                    AbstractC5868k.m23686r("mHomeChannelAdapter");
                } else {
                    c1159g = c1159g6;
                }
                c1159g.m5310a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m22328ga(C5500t c5500t, View view) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        if (!c5500t.f22389E0) {
            c5500t.m22351xa(true);
            c5500t.m22327ba(c5500t.f22393I0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final void m22329ha(final C5500t c5500t, View view) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        c5500t.m22351xa(true);
        ((FocusBorderView) c5500t.m22340Y9(R$id.mFocusBorderView)).post(new Runnable() { // from class: l8.i
            @Override // java.lang.Runnable
            public final void run() {
                C5500t.m22330ia(C5500t.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ia */
    public static final void m22330ia(C5500t c5500t) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        C5498s1 c5498s1 = c5500t.f22385A0;
        if (c5498s1 != null) {
            c5498s1.m22232Db();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public static final void m22331ja(C5500t c5500t, View view, boolean z10) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        if (z10) {
            ((FocusBorderView) c5500t.m22340Y9(R$id.mFocusBorderView)).setBackgroundResource(R$drawable.poster_focus);
            return;
        }
        FocusBorderView focusBorderView = (FocusBorderView) c5500t.m22340Y9(R$id.mFocusBorderView);
        if (focusBorderView != null) {
            focusBorderView.setBackgroundResource(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public static final void m22332ka(View view, boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: la */
    public static final boolean m22333la(C5500t c5500t, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        if (keyEvent.getAction() == 0) {
            C1159g c1159g = null;
            switch (i10) {
                case 19:
                    C1159g c1159g2 = c5500t.f22400z0;
                    if (c1159g2 == null) {
                        AbstractC5868k.m23686r("mHomeChannelAdapter");
                        c1159g2 = null;
                    }
                    if (c1159g2.getCount() > 1) {
                        int i11 = R$id.mLvChannelList;
                        if (((MemoryListView) c5500t.m22340Y9(i11)).getSelectedItemPosition() == 0) {
                            MemoryListView memoryListView = (MemoryListView) c5500t.m22340Y9(i11);
                            C1159g c1159g3 = c5500t.f22400z0;
                            if (c1159g3 == null) {
                                AbstractC5868k.m23686r("mHomeChannelAdapter");
                            } else {
                                c1159g = c1159g3;
                            }
                            memoryListView.setSelectionTriggerItemSelect(c1159g.getCount() - 1);
                            return true;
                        }
                    }
                    break;
                case 20:
                    C1159g c1159g4 = c5500t.f22400z0;
                    if (c1159g4 == null) {
                        AbstractC5868k.m23686r("mHomeChannelAdapter");
                        c1159g4 = null;
                    }
                    if (c1159g4.getCount() > 1) {
                        int i12 = R$id.mLvChannelList;
                        int selectedItemPosition = ((MemoryListView) c5500t.m22340Y9(i12)).getSelectedItemPosition();
                        C1159g c1159g5 = c5500t.f22400z0;
                        if (c1159g5 == null) {
                            AbstractC5868k.m23686r("mHomeChannelAdapter");
                        } else {
                            c1159g = c1159g5;
                        }
                        if (selectedItemPosition == c1159g.getCount() - 1) {
                            ((MemoryListView) c5500t.m22340Y9(i12)).setSelectionTriggerItemSelect(0);
                            return true;
                        }
                    }
                    break;
                case 21:
                    ((FocusBorderView) c5500t.m22340Y9(R$id.mFocusBorderView)).requestFocus();
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ma */
    public static final void m22334ma(C5500t c5500t, AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        C1159g c1159g = c5500t.f22400z0;
        String str = null;
        if (c1159g == null) {
            AbstractC5868k.m23686r("mHomeChannelAdapter");
            c1159g = null;
        }
        Channel item = c1159g.getItem(i10);
        C1407f c1407f = C1407f.f5458a;
        if (C1407f.m6469G(c1407f, item.getChannelCode(), false, 2, null) && !C1415j.m6561d(C1415j.f5500a, item, null, null, 4, null)) {
            if (!c5500t.f22389E0) {
                c5500t.m22351xa(true);
                return;
            }
            return;
        }
        c1407f.m6488M();
        C1159g c1159g2 = c5500t.f22400z0;
        if (c1159g2 == null) {
            AbstractC5868k.m23686r("mHomeChannelAdapter");
            c1159g2 = null;
        }
        c1407f.m6508f0(c1159g2.m5311b());
        c1407f.m6506e0(i10);
        c5500t.mo17967T2();
        c1407f.m6502a0(3);
        c1407f.m6501Z(c1407f.m6523o());
        c1407f.m6504c0(true);
        if (c1407f.m6484E()) {
            Channel m6531w = c1407f.m6531w();
            C7589m1 c7589m1 = C7589m1.f27886a;
            if (m6531w != null) {
                str = m6531w.getChannelCode();
            }
            c7589m1.m29119B(str);
        }
        C7709c.m29787d().m29801m(new ToStartPlayEvent("HomeLive"));
        C7709c.m29787d().m29801m(new ChangeListToAllChannelEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: na */
    public static final void m22335na(final C5500t c5500t, View view) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        c5500t.m22351xa(true);
        ((FocusBorderView) c5500t.m22340Y9(R$id.mFocusBorderView)).post(new Runnable() { // from class: l8.j
            @Override // java.lang.Runnable
            public final void run() {
                C5500t.m22336oa(C5500t.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oa */
    public static final void m22336oa(C5500t c5500t) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        C5498s1 c5498s1 = c5500t.f22385A0;
        if (c5498s1 != null) {
            c5498s1.m22267lb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pa */
    public static final void m22337pa(final C5500t c5500t, View view) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        c5500t.m22351xa(true);
        ((FocusBorderView) c5500t.m22340Y9(R$id.mFocusBorderView)).post(new Runnable() { // from class: l8.h
            @Override // java.lang.Runnable
            public final void run() {
                C5500t.m22338qa(C5500t.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qa */
    public static final void m22338qa(C5500t c5500t) {
        AbstractC5868k.m23674f(c5500t, "this$0");
        C5498s1 c5498s1 = c5500t.f22385A0;
        if (c5498s1 != null) {
            c5498s1.m22274rb();
        }
    }

    /* renamed from: va */
    private final void m22339va() {
        if (this.f22390F0 != -1) {
            int i10 = R$id.mLvChannelList;
            if (((MemoryListView) m22340Y9(i10)) == null) {
                return;
            }
            ((MemoryListView) m22340Y9(i10)).setSelection(this.f22390F0);
            C1159g c1159g = this.f22400z0;
            if (c1159g == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
                c1159g = null;
            }
            c1159g.m5314e(this.f22391G0);
            ((MemoryListView) m22340Y9(i10)).setFocusable(true);
            this.f22390F0 = -1;
        }
        if (this.f22394J0) {
            mo17967T2();
            this.f22394J0 = false;
        }
    }

    @Override // p130f8.InterfaceC4295v
    /* renamed from: D4 */
    public void mo17963D4(NotifyChannel notifyChannel) {
        AbstractC5868k.m23674f(notifyChannel, "notifyChannel");
        int i10 = R$id.mLvChannelList;
        if (((MemoryListView) m22340Y9(i10)) != null) {
            ((MemoryListView) m22340Y9(i10)).setSelection(notifyChannel.getPlayIndex());
            C1159g c1159g = this.f22400z0;
            if (c1159g == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
                c1159g = null;
            }
            c1159g.m5314e(notifyChannel.getChannels());
            ((MemoryListView) m22340Y9(i10)).setFocusable(true);
            return;
        }
        this.f22390F0 = notifyChannel.getPlayIndex();
        this.f22391G0.addAll(notifyChannel.getChannels());
    }

    @Override // p130f8.InterfaceC4295v
    /* renamed from: F3 */
    public void mo17964F3(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "channelList");
        this.f22396L0 = arrayList;
        C4570a5 c4570a5 = (C4570a5) m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19038M0(this.f22396L0);
        }
    }

    @Override // p130f8.InterfaceC4295v
    /* renamed from: K5 */
    public void mo17965K5(long j10, String str, String str2) {
        String format = null;
        if (j10 == 0) {
            ViewOnClickListenerC5136d viewOnClickListenerC5136d = this.f22387C0;
            if (viewOnClickListenerC5136d != null) {
                viewOnClickListenerC5136d.mo3278o9();
                return;
            }
            return;
        }
        ViewOnClickListenerC5136d viewOnClickListenerC5136d2 = this.f22387C0;
        if (viewOnClickListenerC5136d2 != null) {
            if (j10 < 10) {
                C5881x c5881x = C5881x.f23415a;
                String m3172j7 = m3172j7(R$string.dialog_time_tip_format);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_time_tip_format)");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('0');
                sb2.append(j10);
                format = String.format(m3172j7, Arrays.copyOf(new Object[]{sb2.toString(), str, str2}, 3));
                AbstractC5868k.m23673e(format, "format(format, *args)");
            } else {
                C5881x c5881x2 = C5881x.f23415a;
                String m3172j72 = m3172j7(R$string.dialog_time_tip_format);
                AbstractC5868k.m23673e(m3172j72, "getString(R.string.dialog_time_tip_format)");
                format = String.format(m3172j72, Arrays.copyOf(new Object[]{String.valueOf(j10), str, str2}, 3));
                AbstractC5868k.m23673e(format, "format(format, *args)");
            }
            viewOnClickListenerC5136d2.m20777K9(format);
        }
    }

    @Override // p430z9.AbstractC7766d, p011aa.InterfaceC0124b
    /* renamed from: Q2 */
    public boolean mo493Q2() {
        if (!mo495g5()) {
            return false;
        }
        return ((FocusBorderView) m22340Y9(R$id.mFocusBorderView)).requestFocus();
    }

    @Override // p430z9.AbstractC7766d, p430z9.AbstractC7770h, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        C7709c.m29787d().m29804s(GetChildLiveDataSuccessEvent.class);
        C7709c.m29787d().m29802p(new GetChildLiveDataSuccessEvent(f22384P0, "HomeLive"));
        super.mo3123S7();
        mo22268m9();
    }

    @Override // p130f8.InterfaceC4295v
    /* renamed from: T1 */
    public void mo17966T1(NotifyChannel notifyChannel) {
        AbstractC5868k.m23674f(notifyChannel, "notifyChannel");
        int i10 = R$id.mLvChannelList;
        if (((MemoryListView) m22340Y9(i10)) != null) {
            ((MemoryListView) m22340Y9(i10)).setSelection(0);
            C1159g c1159g = this.f22400z0;
            if (c1159g == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
                c1159g = null;
            }
            c1159g.m5314e(notifyChannel.getChannels());
            ((MemoryListView) m22340Y9(i10)).setFocusable(true);
            return;
        }
        this.f22390F0 = 0;
        this.f22391G0.addAll(notifyChannel.getChannels());
    }

    @Override // p130f8.InterfaceC4295v
    /* renamed from: T2 */
    public void mo17967T2() {
        String str = null;
        int i10 = R$id.mTvChannel;
        if (((TextView) m22340Y9(i10)) == null) {
            this.f22394J0 = true;
            return;
        }
        TextView textView = (TextView) m22340Y9(i10);
        Channel m6531w = C1407f.f5458a.m6531w();
        if (m6531w == null || (str = AbstractC5607a.m22776a(m6531w)) == null) {
            str = "";
        }
        textView.setText(str);
        C4570a5 c4570a5 = (C4570a5) m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19043m0();
        }
    }

    /* renamed from: Y9 */
    public View m22340Y9(int i10) {
        View findViewById;
        Map map = this.f22398N0;
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

    @Override // p130f8.InterfaceC4295v
    /* renamed from: a1 */
    public void mo17968a1(final ReservationList reservationList) {
        boolean z10 = false;
        AbstractC5868k.m23674f(reservationList, "reserve");
        ViewOnClickListenerC5136d viewOnClickListenerC5136d = this.f22387C0;
        if (viewOnClickListenerC5136d != null && viewOnClickListenerC5136d.m3079D7()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.dialog_time_tip_format);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_time_tip_format)");
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{"60", reservationList.getName(), reservationList.getContent()}, 3));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        ViewOnClickListenerC5136d m20774H9 = ViewOnClickListenerC5136d.m20774H9(1, format, true);
        this.f22387C0 = m20774H9;
        if (m20774H9 != null) {
            m20774H9.m20775I9(new ViewOnClickListenerC5136d.b() { // from class: l8.f
                @Override // p207k8.ViewOnClickListenerC5136d.b
                /* renamed from: a */
                public final void mo20779a() {
                    C5500t.m22299Ca(C5500t.this, reservationList);
                }
            });
        }
        ViewOnClickListenerC5136d viewOnClickListenerC5136d2 = this.f22387C0;
        if (viewOnClickListenerC5136d2 != null) {
            viewOnClickListenerC5136d2.m20776J9(new DialogInterface.OnDismissListener() { // from class: l8.g
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C5500t.m22300Da(C5500t.this, dialogInterface);
                }
            });
        }
        ViewOnClickListenerC5136d viewOnClickListenerC5136d3 = this.f22387C0;
        if (viewOnClickListenerC5136d3 != null) {
            viewOnClickListenerC5136d3.m20778L9(m3093I6(), "ReserveNotifyDialog");
        }
        C4570a5 c4570a5 = (C4570a5) m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19040O(reservationList.getName(), reservationList.getContent());
        }
    }

    @Override // p430z9.AbstractC7766d, p011aa.InterfaceC0124b
    /* renamed from: b5 */
    public boolean mo494b5() {
        if (!this.f22397M0) {
            return false;
        }
        if (!((MemoryListView) m22340Y9(R$id.mLvChannelList)).hasFocus() && !((FocusBorderView) m22340Y9(R$id.mFocusBorderView)).hasFocus() && !((ImageView) m22340Y9(R$id.mIvAllColumn)).hasFocus() && !((ImageView) m22340Y9(R$id.mIvFav)).hasFocus() && !((ImageView) m22340Y9(R$id.mIvSearch)).hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // p430z9.AbstractC7770h, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: b8 */
    public void mo3149b8() {
        super.mo3149b8();
        C4570a5 c4570a5 = (C4570a5) m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19039N();
        }
    }

    /* renamed from: ca */
    public final void m22341ca(boolean z10) {
        MemoryListView memoryListView = (MemoryListView) m22340Y9(R$id.mLvChannelList);
        if (memoryListView != null) {
            memoryListView.setFocusable(z10);
        }
        FocusBorderView focusBorderView = (FocusBorderView) m22340Y9(R$id.mFocusBorderView);
        if (focusBorderView != null) {
            focusBorderView.setFocusable(z10);
        }
    }

    @Override // p430z9.AbstractC7766d
    /* renamed from: da, reason: merged with bridge method [inline-methods] */
    public C4570a5 mo22228A9() {
        AbstractActivityC0712e m3075C6 = m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.base.BaseActivity");
        return new C4570a5((AbstractActivityC7763a) m3075C6, this);
    }

    /* renamed from: ea */
    public final void m22343ea(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        C5498s1 c5498s1 = this.f22385A0;
        if (c5498s1 != null) {
            c5498s1.m22231Da(awakenVoiceAssistEvent);
        }
    }

    /* renamed from: fa */
    public final void m22344fa() {
        int i10 = R$id.mFocusBorderView;
        ((FocusBorderView) m22340Y9(i10)).setOnClickListener(new View.OnClickListener() { // from class: l8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5500t.m22328ga(C5500t.this, view);
            }
        });
        ((FocusBorderView) m22340Y9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l8.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5500t.m22331ja(C5500t.this, view, z10);
            }
        });
        int i11 = R$id.mLvChannelList;
        ((MemoryListView) m22340Y9(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l8.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5500t.m22332ka(view, z10);
            }
        });
        ((MemoryListView) m22340Y9(i11)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.m
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                boolean m22333la;
                m22333la = C5500t.m22333la(C5500t.this, view, i12, keyEvent);
                return m22333la;
            }
        });
        ((MemoryListView) m22340Y9(i11)).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l8.n
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j10) {
                C5500t.m22334ma(C5500t.this, adapterView, view, i12, j10);
            }
        });
        ((ImageView) m22340Y9(R$id.mIvAllColumn)).setOnClickListener(new View.OnClickListener() { // from class: l8.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5500t.m22335na(C5500t.this, view);
            }
        });
        ((ImageView) m22340Y9(R$id.mIvFav)).setOnClickListener(new View.OnClickListener() { // from class: l8.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5500t.m22337pa(C5500t.this, view);
            }
        });
        ((ImageView) m22340Y9(R$id.mIvSearch)).setOnClickListener(new View.OnClickListener() { // from class: l8.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5500t.m22329ha(C5500t.this, view);
            }
        });
    }

    @Override // p430z9.AbstractC7766d, p011aa.InterfaceC0124b
    /* renamed from: g5 */
    public boolean mo495g5() {
        if (!this.f22397M0) {
            return false;
        }
        return true;
    }

    @Override // p430z9.AbstractC7770h, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        boolean z10 = false;
        C5498s1 c5498s1;
        super.mo3164g8();
        if (this.f22388D0) {
            return;
        }
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6830C() && c1466m0.m6834G()) {
            c1466m0.m6857b0(false);
            C5498s1 c5498s12 = this.f22385A0;
            if (c5498s12 != null) {
                c5498s12.m22276sa();
            }
            C5498s1 c5498s13 = this.f22385A0;
            if (c5498s13 != null) {
                c5498s13.m22242Mb(C1407f.f5458a.m6528t());
            }
        } else {
            C5498s1 c5498s14 = this.f22385A0;
            if (c5498s14 != null && c5498s14.m22249Qa()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (c5498s1 = this.f22385A0) != null) {
                C5498s1.m22192Za(c5498s1, false, 1, null);
            }
            mo17967T2();
        }
        C4570a5 c4570a5 = (C4570a5) m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19042i0();
        }
        m22339va();
    }

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void getAllChannelData(GetAllLiveDataSuccessEvent getAllLiveDataSuccessEvent) {
        AbstractC5868k.m23674f(getAllLiveDataSuccessEvent, "event");
        C4570a5 c4570a5 = (C4570a5) m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19044s0(getAllLiveDataSuccessEvent.getColumnId());
        }
        C4570a5 c4570a52 = (C4570a5) m30063y9();
        if (c4570a52 != null) {
            c4570a52.m19042i0();
        }
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        super.mo3173j8();
        C5498s1 c5498s1 = this.f22385A0;
        if (c5498s1 != null) {
            c5498s1.m22253Ua();
        }
        C5498s1 c5498s12 = this.f22385A0;
        if (c5498s12 != null) {
            c5498s12.m22264ib(false);
        }
    }

    @Override // p430z9.AbstractC7766d, p430z9.AbstractC7770h
    /* renamed from: m9 */
    public void mo22268m9() {
        this.f22398N0.clear();
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: n9 */
    public void mo22269n9() {
        m22344fa();
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: o9 */
    public void mo22270o9() {
        this.f22397M0 = true;
        m30071t9(false);
        if (this.f22400z0 == null) {
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            int i10 = R$id.mLvChannelList;
            MemoryListView memoryListView = (MemoryListView) m22340Y9(i10);
            AbstractC5868k.m23673e(memoryListView, "mLvChannelList");
            this.f22400z0 = new C1159g(m3107M8, memoryListView);
            MemoryListView memoryListView2 = (MemoryListView) m22340Y9(i10);
            C1159g c1159g = this.f22400z0;
            if (c1159g == null) {
                AbstractC5868k.m23686r("mHomeChannelAdapter");
                c1159g = null;
            }
            memoryListView2.setAdapter((ListAdapter) c1159g);
            ((FrameLayout) m22340Y9(R$id.mFlMainLive)).setBackgroundColor(-16777216);
        }
        m22297Aa();
    }

    @Override // p011aa.InterfaceC0124b
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = false;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (!this.f22397M0) {
            return false;
        }
        if (this.f22389E0) {
            C5498s1 c5498s1 = this.f22385A0;
            if (c5498s1 != null) {
                AbstractC5868k.m23671c(c5498s1);
                z10 = c5498s1.onKeyDown(i10, keyEvent);
            } else {
                z10 = false;
            }
            if (!z10 && i10 == 4 && keyEvent.getRepeatCount() == 0) {
                m22351xa(false);
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        if ((i10 != 4 && (i10 != 21 || !AbstractC6567a.m25635e(this.f22391G0) || !m22345ra())) || this.f22389E0) {
            return false;
        }
        if (((MemoryListView) m22340Y9(R$id.mLvChannelList)).hasFocus()) {
            m22327ba(this.f22392H0);
        } else if (((FocusBorderView) m22340Y9(R$id.mFocusBorderView)).hasFocus()) {
            m22327ba(this.f22393I0);
        }
        InterfaceC5642a m30061w9 = m30061w9();
        if (m30061w9 != null) {
            m30061w9.invoke();
        }
        return true;
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: p9 */
    public int mo22272p9() {
        return R$layout.fragment_home_live;
    }

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void preAllLiveDataMessage(PreAllLiveDataEvent preAllLiveDataEvent) {
        C4570a5 c4570a5;
        AbstractC5868k.m23674f(preAllLiveDataEvent, "event");
        if (C1407f.f5458a.m6486H() && (c4570a5 = (C4570a5) m30063y9()) != null) {
            c4570a5.m19044s0(preAllLiveDataEvent.getColumnId());
        }
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: q9 */
    public void mo22273q9() {
    }

    /* renamed from: ra */
    public boolean m22345ra() {
        if (!((FocusBorderView) m22340Y9(R$id.mFocusBorderView)).hasFocus() && !((ImageView) m22340Y9(R$id.mIvAllColumn)).hasFocus()) {
            return false;
        }
        return true;
    }

    /* renamed from: sa */
    public final boolean m22346sa() {
        return this.f22389E0;
    }

    /* renamed from: ta */
    public final boolean m22347ta(int i10, KeyEvent keyEvent) {
        C5498s1 c5498s1;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (!this.f22397M0 || !this.f22389E0 || (c5498s1 = this.f22385A0) == null) {
            return false;
        }
        AbstractC5868k.m23671c(c5498s1);
        return c5498s1.m22252Ta(i10, keyEvent);
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: u9 */
    public void mo22348u9() {
        this.f22397M0 = false;
    }

    /* renamed from: ua */
    public final void m22349ua() {
        C5498s1 c5498s1 = this.f22385A0;
        if (c5498s1 != null) {
            c5498s1.m22253Ua();
        }
    }

    @InterfaceC7719m
    public final void updatePlayIndexItem(UpdatePlayIndexItemEvent updatePlayIndexItemEvent) {
        AbstractC5868k.m23674f(updatePlayIndexItemEvent, "event");
        C5878u c5878u = new C5878u();
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: l8.r
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C5500t.m22301Ea(C5500t.this, observableEmitter);
            }
        }).compose(AbstractC7029f.m27120a());
        final c cVar = new c(c5878u);
        Consumer consumer = new Consumer() { // from class: l8.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5500t.m22303Fa(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f22403a;
        Consumer<? super Throwable> consumer2 = new Consumer() { // from class: l8.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5500t.m22305Ga(InterfaceC5660l.this, obj);
            }
        };
        Action action = new Action() { // from class: l8.c
            @Override // io.reactivex.functions.Action
            public final void run() {
                C5500t.m22307Ha(C5500t.this);
            }
        };
        final e eVar = new e(c5878u);
        compose.subscribe(consumer, consumer2, action, new Consumer() { // from class: l8.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5500t.m22309Ia(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: wa */
    public final void m22350wa(b bVar) {
        AbstractC5868k.m23674f(bVar, "listener");
        this.f22386B0 = bVar;
    }

    /* renamed from: xa */
    public final void m22351xa(boolean z10) {
        int i10 = 0;
        if (!this.f22397M0) {
            return;
        }
        int i11 = R$id.mFocusBorderView;
        FocusBorderView focusBorderView = (FocusBorderView) m22340Y9(i11);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        focusBorderView.setVisibility(i10);
        this.f22389E0 = z10;
        C5498s1 c5498s1 = this.f22385A0;
        if (c5498s1 != null) {
            c5498s1.m22261fb(z10);
        }
        C5498s1 c5498s12 = this.f22385A0;
        if (c5498s12 != null) {
            c5498s12.m22277va();
        }
        b bVar = this.f22386B0;
        if (bVar != null) {
            bVar.mo11886a(z10);
        }
        if (z10) {
            int i12 = R$id.mFlMainLive;
            ViewGroup.LayoutParams layoutParams = ((FrameLayout) m22340Y9(i12)).getLayoutParams();
            AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = 0;
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            ((FrameLayout) m22340Y9(i12)).setLayoutParams(layoutParams2);
            ((ImageView) m22340Y9(R$id.mIvFullScreen)).setVisibility(8);
            ((RelativeLayout) m22340Y9(R$id.mLlBottomInfo)).setVisibility(8);
            ((LinearLayout) m22340Y9(R$id.mLlFastBtn)).setVisibility(8);
            C5498s1 c5498s13 = this.f22385A0;
            if (c5498s13 != null) {
                c5498s13.m22265jb();
            }
            ((FrameLayout) m22340Y9(i12)).requestFocus();
            C5909e.a aVar = C5909e.f23504f;
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            aVar.m23878a(m3107M8).m23872g();
            return;
        }
        int i13 = R$id.mFlMainLive;
        ViewGroup.LayoutParams layoutParams3 = ((FrameLayout) m22340Y9(i13)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.leftMargin = AutoSizeUtils.dp2px(m3096J6(), 128.0f);
        layoutParams4.width = AutoSizeUtils.dp2px(m3096J6(), 853.0f);
        layoutParams4.height = AutoSizeUtils.dp2px(m3096J6(), 480.0f);
        ((FrameLayout) m22340Y9(i13)).setLayoutParams(layoutParams4);
        ((ImageView) m22340Y9(R$id.mIvFullScreen)).setVisibility(0);
        ((RelativeLayout) m22340Y9(R$id.mLlBottomInfo)).setVisibility(0);
        ((LinearLayout) m22340Y9(R$id.mLlFastBtn)).setVisibility(0);
        C5498s1 c5498s14 = this.f22385A0;
        if (c5498s14 != null) {
            c5498s14.m22265jb();
        }
        ((FocusBorderView) m22340Y9(i11)).requestFocus();
        C4570a5 c4570a5 = (C4570a5) m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19038M0(this.f22396L0);
        }
        mo17967T2();
        C5909e.a aVar2 = C5909e.f23504f;
        Context m3107M82 = m3107M8();
        AbstractC5868k.m23673e(m3107M82, "requireContext()");
        aVar2.m23878a(m3107M82).m23874i();
    }

    @Override // p130f8.InterfaceC4295v
    /* renamed from: y1 */
    public void mo17969y1(String str, String str2) {
        AbstractC5868k.m23674f(str, "epgName");
        AbstractC5868k.m23674f(str2, "epgTime");
    }

    /* renamed from: ya */
    public final void m22352ya() {
        C5498s1 c5498s1;
        this.f22388D0 = true;
        C5498s1 c5498s12 = this.f22385A0;
        boolean z10 = false;
        if (c5498s12 != null && c5498s12.m22249Qa()) {
            z10 = true;
        }
        if (z10 && (c5498s1 = this.f22385A0) != null) {
            c5498s1.m22253Ua();
        }
        C5498s1 c5498s13 = this.f22385A0;
        if (c5498s13 != null) {
            c5498s13.m22262gb(true);
        }
        C4570a5 c4570a5 = (C4570a5) m30063y9();
        if (c4570a5 != null) {
            c4570a5.m19039N();
        }
    }

    @Override // p430z9.AbstractC7766d
    /* renamed from: z9 */
    public boolean mo22281z9() {
        return this.f22395K0;
    }

    /* renamed from: za */
    public final void m22353za() {
        this.f22388D0 = false;
        C5498s1 c5498s1 = this.f22385A0;
        if (c5498s1 != null) {
            c5498s1.m22262gb(false);
        }
    }
}
