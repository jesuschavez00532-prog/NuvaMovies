package p223l8;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.AbstractC0738x;
import androidx.fragment.app.Fragment;
import ba.AbstractC1196d;
import be.C1328x;
import cc.C1466m0;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.bean.EpgDate;
import com.live.p063db.ReservationList;
import com.live.view.MonitorKeyView;
import com.module.event.ChangeListToAllChannelEvent;
import com.module.event.GetAllLiveDataSuccessEvent;
import com.module.event.GetChildLiveDataSuccessEvent;
import com.module.event.GetLiveDataSuccessEvent;
import com.module.event.LiveGuideShow;
import com.module.event.RequestLiveColumnSuccessEvent;
import com.module.event.SelectAllChannelTabEvent;
import com.module.event.ShowGuideEvent;
import com.module.event.UpdateRestrictStateEvent;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.request.result.ChildColumn;
import com.request.result.UserInfo;
import com.widget.custom.MemoryListView;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.greenrobot.eventbus.ThreadMode;
import p028b8.C1147a;
import p028b8.C1180q0;
import p040c8.C1407f;
import p040c8.C1427v;
import p040c8.C1428w;
import p043ce.AbstractC1500l;
import p101da.ViewOnClickListenerC4019e;
import p102db.C4035f;
import p102db.C4053l;
import p130f8.InterfaceC4276c;
import p130f8.InterfaceC4277d;
import p132fa.AbstractC4298b;
import p159h8.C4710y0;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.AbstractC5091h;
import p207k8.ViewOnClickListenerC5136d;
import p223l8.C5442e1;
import p237m8.AbstractC5607a;
import p263o8.ViewOnKeyListenerC5933k;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7028e;
import p348u2.AbstractC7029f;
import p400xa.C7584l;
import p400xa.C7594o0;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: l8.e1 */
/* loaded from: classes.dex */
public final class C5442e1 extends AbstractC1196d<InterfaceC4276c> implements InterfaceC4277d, ViewOnKeyListenerC5933k.a {

    /* renamed from: V0 */
    private static final int f22120V0 = 0;

    /* renamed from: A0 */
    private C1147a f22125A0;

    /* renamed from: C0 */
    private ViewOnKeyListenerC5933k f22127C0;

    /* renamed from: D0 */
    private ViewOnClickListenerC5519x2 f22128D0;

    /* renamed from: E0 */
    private C5525z1 f22129E0;

    /* renamed from: F0 */
    private C5465k0 f22130F0;

    /* renamed from: G0 */
    private ViewOnClickListenerC4019e f22131G0;

    /* renamed from: H0 */
    private ViewOnClickListenerC5136d f22132H0;

    /* renamed from: I0 */
    private InterfaceC5642a f22133I0;

    /* renamed from: J0 */
    private int f22134J0;

    /* renamed from: K0 */
    private int f22135K0;

    /* renamed from: L0 */
    private int f22136L0;

    /* renamed from: M0 */
    private int f22137M0;

    /* renamed from: N0 */
    private long f22138N0;

    /* renamed from: O0 */
    private String f22139O0;

    /* renamed from: P0 */
    private boolean f22140P0;

    /* renamed from: Q0 */
    private HashMap f22141Q0;

    /* renamed from: R0 */
    private Disposable f22142R0;

    /* renamed from: S0 */
    private boolean f22143S0;

    /* renamed from: z0 */
    private C1180q0 f22146z0;

    /* renamed from: U0 */
    public static final a f22119U0 = new a(null);

    /* renamed from: W0 */
    private static final int f22121W0 = 1;

    /* renamed from: X0 */
    private static final int f22122X0 = 2;

    /* renamed from: Y0 */
    private static final int f22123Y0 = 3;

    /* renamed from: Z0 */
    private static final int f22124Z0 = 4;

    /* renamed from: T0 */
    public Map f22144T0 = new LinkedHashMap();

    /* renamed from: y0 */
    private final String f22145y0 = "LiveContentFrag";

    /* renamed from: B0 */
    private ArrayList f22126B0 = new ArrayList();

    /* renamed from: l8.e1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final int m21969a() {
            return C5442e1.f22124Z0;
        }

        /* renamed from: b */
        public final int m21970b() {
            return C5442e1.f22123Y0;
        }

        /* renamed from: c */
        public final int m21971c() {
            return C5442e1.f22122X0;
        }

        /* renamed from: d */
        public final int m21972d() {
            return C5442e1.f22121W0;
        }

        /* renamed from: e */
        public final int m21973e() {
            return C5442e1.f22120V0;
        }
    }

    /* renamed from: l8.e1$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5664p {
        b() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m21976g(C5442e1 c5442e1) {
            AbstractC5868k.m23674f(c5442e1, "this$0");
            C5465k0 c5465k0 = c5442e1.f22130F0;
            if (c5465k0 != null) {
                String string = c5442e1.m3154d7().getString(R$string.favorite);
                AbstractC5868k.m23673e(string, "resources.getString(R.string.favorite)");
                c5465k0.m22100Va(string);
            }
            c5442e1.m21956lb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m21977i(C5442e1 c5442e1) {
            AbstractC5868k.m23674f(c5442e1, "this$0");
            if (c5442e1.f22126B0.size() > 0) {
                C1407f c1407f = C1407f.f5458a;
                c5442e1.m21953jb(c1407f.m6523o());
                C5465k0 c5465k0 = c5442e1.f22130F0;
                if (c5465k0 != null) {
                    String string = c5442e1.m3154d7().getString(R$string.live_tab_channel);
                    AbstractC5868k.m23673e(string, "resources.getString(R.string.live_tab_channel)");
                    c5465k0.m22100Va(string);
                }
                c5442e1.m21958nb(c1407f.m6523o());
            }
        }

        /* renamed from: e */
        public final void m21978e(View view, int i10) {
            AbstractC5868k.m23674f(view, "<anonymous parameter 0>");
            if (C5442e1.this.m21936Fa() != i10) {
                C5442e1.this.m21954kb(i10);
                C5442e1.this.m21876Ka();
                a aVar = C5442e1.f22119U0;
                if (i10 == aVar.m21973e()) {
                    C5442e1 c5442e1 = C5442e1.this;
                    c5442e1.m21925rb(c5442e1.m21936Fa());
                    return;
                }
                if (i10 == aVar.m21972d()) {
                    C5442e1 c5442e12 = C5442e1.this;
                    c5442e12.m21925rb(c5442e12.m21936Fa());
                    return;
                }
                if (i10 == aVar.m21971c()) {
                    C5442e1 c5442e13 = C5442e1.this;
                    c5442e13.m21925rb(c5442e13.m21936Fa());
                    LinearLayout linearLayout = (LinearLayout) C5442e1.this.m21946Z9(R$id.mLlTab);
                    final C5442e1 c5442e14 = C5442e1.this;
                    linearLayout.post(new Runnable() { // from class: l8.f1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5442e1.b.m21976g(C5442e1.this);
                        }
                    });
                    return;
                }
                if (i10 == aVar.m21970b()) {
                    C5465k0 c5465k0 = C5442e1.this.f22130F0;
                    boolean z10 = false;
                    if (c5465k0 != null && c5465k0.m3079D7()) {
                        z10 = true;
                    }
                    if (!z10) {
                        C5442e1 c5442e15 = C5442e1.this;
                        c5442e15.m21925rb(c5442e15.m21936Fa());
                    }
                    LinearLayout linearLayout2 = (LinearLayout) C5442e1.this.m21946Z9(R$id.mLlTab);
                    final C5442e1 c5442e16 = C5442e1.this;
                    linearLayout2.post(new Runnable() { // from class: l8.g1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5442e1.b.m21977i(C5442e1.this);
                        }
                    });
                }
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m21978e((View) obj, ((Number) obj2).intValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        /* renamed from: a */
        public final void m21979a() {
            C5442e1.this.f22140P0 = true;
            C5442e1 c5442e1 = C5442e1.this;
            c5442e1.m21958nb(c5442e1.m21935Ea());
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m21979a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        /* renamed from: a */
        public final void m21980a() {
            InterfaceC5642a interfaceC5642a = C5442e1.this.f22133I0;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m21980a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.e1$e */
    /* loaded from: classes2.dex */
    public static final class e implements AdapterView.OnItemSelectedListener {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m21983c(C5442e1 c5442e1) {
            AbstractC5868k.m23674f(c5442e1, "this$0");
            C5465k0 c5465k0 = c5442e1.f22130F0;
            if (c5465k0 != null) {
                String string = c5442e1.m3154d7().getString(R$string.favorite);
                AbstractC5868k.m23673e(string, "resources.getString(R.string.favorite)");
                c5465k0.m22100Va(string);
            }
            c5442e1.m21956lb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m21984d(C5442e1 c5442e1) {
            AbstractC5868k.m23674f(c5442e1, "this$0");
            if (c5442e1.f22126B0.size() > 0) {
                C1407f c1407f = C1407f.f5458a;
                c5442e1.m21953jb(c1407f.m6523o());
                C5465k0 c5465k0 = c5442e1.f22130F0;
                if (c5465k0 != null) {
                    String string = c5442e1.m3154d7().getString(R$string.live_tab_channel);
                    AbstractC5868k.m23673e(string, "resources.getString(R.string.live_tab_channel)");
                    c5465k0.m22100Va(string);
                }
                c5442e1.m21958nb(c1407f.m6523o());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (((MemoryListView) C5442e1.this.m21946Z9(R$id.mLvTab)).hasFocus() && C5442e1.this.m21936Fa() != i10) {
                C5442e1.this.m21954kb(i10);
                C5442e1.this.m21876Ka();
                a aVar = C5442e1.f22119U0;
                if (i10 == aVar.m21973e()) {
                    C5442e1 c5442e1 = C5442e1.this;
                    c5442e1.m21925rb(c5442e1.m21936Fa());
                    return;
                }
                if (i10 == aVar.m21972d()) {
                    C5442e1 c5442e12 = C5442e1.this;
                    c5442e12.m21925rb(c5442e12.m21936Fa());
                    return;
                }
                if (i10 == aVar.m21971c()) {
                    C5442e1 c5442e13 = C5442e1.this;
                    c5442e13.m21925rb(c5442e13.m21936Fa());
                    LinearLayout linearLayout = (LinearLayout) C5442e1.this.m21946Z9(R$id.mLlTab);
                    final C5442e1 c5442e14 = C5442e1.this;
                    linearLayout.post(new Runnable() { // from class: l8.h1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5442e1.e.m21983c(C5442e1.this);
                        }
                    });
                    return;
                }
                if (i10 == aVar.m21970b()) {
                    C5465k0 c5465k0 = C5442e1.this.f22130F0;
                    boolean z10 = false;
                    if (c5465k0 != null && c5465k0.m3079D7()) {
                        z10 = true;
                    }
                    if (!z10) {
                        C5442e1 c5442e15 = C5442e1.this;
                        c5442e15.m21925rb(c5442e15.m21936Fa());
                    }
                    LinearLayout linearLayout2 = (LinearLayout) C5442e1.this.m21946Z9(R$id.mLlTab);
                    final C5442e1 c5442e16 = C5442e1.this;
                    linearLayout2.post(new Runnable() { // from class: l8.i1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5442e1.e.m21984d(C5442e1.this);
                        }
                    });
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: l8.e1$f */
    /* loaded from: classes2.dex */
    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: l8.e1$f$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5642a {

            /* renamed from: a */
            final /* synthetic */ C5442e1 f22152a;

            /* renamed from: b */
            final /* synthetic */ ChildColumn f22153b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5442e1 c5442e1, ChildColumn childColumn) {
                super(0);
                this.f22152a = c5442e1;
                this.f22153b = childColumn;
            }

            /* renamed from: a */
            public final void m21985a() {
                this.f22152a.f22140P0 = true;
                this.f22152a.m21958nb(this.f22153b.getId());
            }

            @Override // me.InterfaceC5642a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21985a();
                return C1328x.f4998a;
            }
        }

        f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            boolean z10;
            boolean z11;
            int size = C5442e1.this.f22126B0.size();
            if (size <= 0) {
                return;
            }
            int i11 = i10 + 1;
            if (size <= i11) {
                i11 = size - 1;
            }
            Object obj = C5442e1.this.f22126B0.get(i11);
            AbstractC5868k.m23673e(obj, "mLiveColumnList[adjustPos]");
            ChildColumn childColumn = (ChildColumn) obj;
            if (((MemoryListView) C5442e1.this.m21946Z9(R$id.mLvCategory)).hasFocus()) {
                C5442e1.this.m21954kb(C5442e1.f22119U0.m21969a());
                if (C5442e1.this.m21935Ea() == childColumn.getId()) {
                    C5465k0 c5465k0 = C5442e1.this.f22130F0;
                    if (c5465k0 != null && c5465k0.m22107ta()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (AbstractC5868k.m23669a(childColumn.getRestricted(), "1")) {
                            C5442e1.this.m21957mb(System.currentTimeMillis());
                            return;
                        }
                        return;
                    }
                }
                C5465k0 c5465k02 = C5442e1.this.f22130F0;
                if (c5465k02 != null && c5465k02.m3194u7()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    C5442e1 c5442e1 = C5442e1.this;
                    c5442e1.m21925rb(c5442e1.m21936Fa());
                }
                C5442e1.this.m21953jb(childColumn.getId());
                C5465k0 c5465k03 = C5442e1.this.f22130F0;
                if (c5465k03 != null) {
                    C1147a c1147a = C5442e1.this.f22125A0;
                    AbstractC5868k.m23671c(c1147a);
                    c5465k03.m22100Va(AbstractC5607a.m22777b(c1147a.getItem(i10)));
                }
                if (!AbstractC5868k.m23669a(childColumn.getRestricted(), "1")) {
                    C5465k0 c5465k04 = C5442e1.this.f22130F0;
                    if (c5465k04 != null) {
                        c5465k04.m22096Ra();
                    }
                    C5465k0 c5465k05 = C5442e1.this.f22130F0;
                    if (c5465k05 != null) {
                        c5465k05.m22103Xa();
                    }
                    C5442e1.this.m21958nb(childColumn.getId());
                    return;
                }
                if (C5442e1.this.f22140P0) {
                    C5465k0 c5465k06 = C5442e1.this.f22130F0;
                    if (c5465k06 != null) {
                        c5465k06.m22102Wa();
                    }
                    C5442e1.this.m21958nb(childColumn.getId());
                } else {
                    C5465k0 c5465k07 = C5442e1.this.f22130F0;
                    if (c5465k07 != null) {
                        c5465k07.m22104da();
                    }
                    C5465k0 c5465k08 = C5442e1.this.f22130F0;
                    if (c5465k08 != null) {
                        C5465k0.m22088xa(c5465k08, false, new a(C5442e1.this, childColumn), 1, null);
                    }
                }
                C5442e1.this.m21957mb(System.currentTimeMillis());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m21986a(C1328x c1328x) {
            C1147a c1147a = C5442e1.this.f22125A0;
            if (c1147a != null) {
                c1147a.m5208c(C5442e1.this.f22141Q0);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m21986a((C1328x) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f22155a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m21987a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m21987a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f22156a = new i();

        i() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            C1428w.f5539a.m6673f(list);
            return list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final j f22157a = new j();

        j() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            C1407f.f5458a.m6520m0(list);
            return list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ int f22158a;

        /* renamed from: b */
        final /* synthetic */ List f22159b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l8.e1$k$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5642a {

            /* renamed from: a */
            final /* synthetic */ List f22160a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f22160a = list;
            }

            @Override // me.InterfaceC5642a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f22160a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l8.e1$k$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final b f22161a = new b();

            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m21992a(int i10) {
                C1407f.f5458a.m6506e0(i10);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m21992a(((Number) obj).intValue());
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i10, List list) {
            super(1);
            this.f22158a = i10;
            this.f22159b = list;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            if (!AbstractC6567a.m25635e(list)) {
                C1407f c1407f = C1407f.f5458a;
                Channel m6531w = c1407f.m6531w();
                if (m6531w == null) {
                    m6531w = (Channel) list.get(0);
                }
                if (c1407f.m6512h0(AbstractC4298b.m17990b("last_sort", 0), m6531w.getChannelCode(), list, new a(this.f22159b), b.f22161a)) {
                    c1407f.m6501Z(this.f22158a);
                    return list;
                }
            }
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$l */
    /* loaded from: classes2.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {
        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m21993a(List list) {
            C1407f c1407f = C1407f.f5458a;
            c1407f.m6503b0(false);
            AbstractC5868k.m23673e(list, "it");
            c1407f.m6508f0(list);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m21993a((List) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final m f22163a = new m();

        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m21994a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m21994a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$n */
    /* loaded from: classes2.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5642a {
        n() {
            super(0);
        }

        /* renamed from: a */
        public final void m21995a() {
            InterfaceC5642a interfaceC5642a = C5442e1.this.f22133I0;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m21995a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$o */
    /* loaded from: classes2.dex */
    public static final class o extends AbstractC5869l implements InterfaceC5642a {
        o() {
            super(0);
        }

        /* renamed from: a */
        public final void m21996a() {
            InterfaceC5642a interfaceC5642a = C5442e1.this.f22133I0;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m21996a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.e1$p */
    /* loaded from: classes2.dex */
    public static final class p extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final p f22166a = new p();

        p() {
            super(0);
        }

        /* renamed from: a */
        public final void m21997a() {
            C7709c.m29787d().m29801m(new ShowGuideEvent(C4053l.c.LiveMenu));
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m21997a();
            return C1328x.f4998a;
        }
    }

    public C5442e1() {
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
        this.f22134J0 = ((Number) c4982a.m20333a(aVar.m24887a(), "live_last_column_id", -1)).intValue();
        this.f22135K0 = ((Number) c4982a.m20333a(aVar.m24887a(), "live_last_tab", Integer.valueOf(f22123Y0))).intValue();
        this.f22136L0 = -1;
        this.f22137M0 = -1;
        this.f22139O0 = "HomeLive";
        this.f22141Q0 = new HashMap();
        this.f22143S0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Aa */
    public static final void m21868Aa(C5442e1 c5442e1) {
        AbstractC5868k.m23674f(c5442e1, "this$0");
        c5442e1.m21956lb();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r0.equals("MatchLive") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.equals("VoiceLive") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0072, code lost:
    
        r4.f22137M0 = p040c8.C1407f.f5458a.m6528t();
        r4.f22135K0 = p223l8.C5442e1.f22123Y0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0.equals("NewVoiceLive") == false) goto L23;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* renamed from: Ba */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m21869Ba() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5442e1.m21869Ba():void");
    }

    /* renamed from: Ca */
    private final int m21870Ca() {
        int i10 = -1;
        if (this.f22126B0.size() > 1 && this.f22137M0 != -1) {
            int i11 = 0;
            for (Object obj : this.f22126B0) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC1500l.m6991j();
                }
                if (((ChildColumn) obj).getId() == this.f22137M0) {
                    i10 = i11;
                }
                i11 = i12;
            }
        }
        return i10 - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ka */
    public final void m21876Ka() {
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC0738x m3534m = m3093I6().m3534m();
        AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
        int i10 = this.f22136L0;
        boolean z13 = true;
        if (i10 == f22120V0) {
            C5525z1 c5525z1 = this.f22129E0;
            if (c5525z1 != null && c5525z1.m3190s7()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                C5525z1 c5525z12 = this.f22129E0;
                AbstractC5868k.m23671c(c5525z12);
                m3534m.mo3233n(c5525z12);
            }
            C5465k0 c5465k0 = this.f22130F0;
            if (c5465k0 == null || !c5465k0.m3190s7()) {
                z13 = false;
            }
            if (z13) {
                C5465k0 c5465k02 = this.f22130F0;
                AbstractC5868k.m23671c(c5465k02);
                m3534m.mo3233n(c5465k02);
            }
        } else if (i10 == f22121W0) {
            ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2 = this.f22128D0;
            if (viewOnClickListenerC5519x2 != null && viewOnClickListenerC5519x2.m3190s7()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                ViewOnClickListenerC5519x2 viewOnClickListenerC5519x22 = this.f22128D0;
                AbstractC5868k.m23671c(viewOnClickListenerC5519x22);
                m3534m.mo3233n(viewOnClickListenerC5519x22);
            }
            C5465k0 c5465k03 = this.f22130F0;
            if (c5465k03 == null || !c5465k03.m3190s7()) {
                z13 = false;
            }
            if (z13) {
                C5465k0 c5465k04 = this.f22130F0;
                AbstractC5868k.m23671c(c5465k04);
                m3534m.mo3233n(c5465k04);
            }
        } else {
            ViewOnClickListenerC5519x2 viewOnClickListenerC5519x23 = this.f22128D0;
            if (viewOnClickListenerC5519x23 != null && viewOnClickListenerC5519x23.m3190s7()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ViewOnClickListenerC5519x2 viewOnClickListenerC5519x24 = this.f22128D0;
                AbstractC5868k.m23671c(viewOnClickListenerC5519x24);
                m3534m.mo3233n(viewOnClickListenerC5519x24);
            }
            C5525z1 c5525z13 = this.f22129E0;
            if (c5525z13 == null || !c5525z13.m3190s7()) {
                z13 = false;
            }
            if (z13) {
                C5525z1 c5525z14 = this.f22129E0;
                AbstractC5868k.m23671c(c5525z14);
                m3534m.mo3233n(c5525z14);
            }
        }
        m3534m.mo3228h();
    }

    /* renamed from: Ma */
    private final void m21879Ma() {
        boolean z10;
        AbstractC0738x m3534m = m3093I6().m3534m();
        AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
        C5525z1 c5525z1 = this.f22129E0;
        boolean z11 = true;
        if (c5525z1 != null && c5525z1.m3190s7()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C5525z1 c5525z12 = this.f22129E0;
            AbstractC5868k.m23671c(c5525z12);
            m3534m.mo3233n(c5525z12);
        }
        ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2 = this.f22128D0;
        if (viewOnClickListenerC5519x2 == null || !viewOnClickListenerC5519x2.m3190s7()) {
            z11 = false;
        }
        if (z11) {
            ViewOnClickListenerC5519x2 viewOnClickListenerC5519x22 = this.f22128D0;
            AbstractC5868k.m23671c(viewOnClickListenerC5519x22);
            m3534m.mo3233n(viewOnClickListenerC5519x22);
        }
        m3534m.mo3228h();
    }

    /* renamed from: Na */
    private final void m21881Na() {
        ((MonitorKeyView) m21946Z9(R$id.mArlContentRoot)).m11591a(new d());
        int i10 = R$id.mLvTab;
        ((MemoryListView) m21946Z9(i10)).setOnItemSelectedListener(new e());
        ((MemoryListView) m21946Z9(i10)).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l8.l0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j10) {
                C5442e1.m21883Oa(adapterView, view, i11, j10);
            }
        });
        ((MemoryListView) m21946Z9(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.v0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m21885Pa;
                m21885Pa = C5442e1.m21885Pa(C5442e1.this, view, i11, keyEvent);
                return m21885Pa;
            }
        });
        int i11 = R$id.mLvCategory;
        ((MemoryListView) m21946Z9(i11)).setOnItemSelectedListener(new f());
        ((MemoryListView) m21946Z9(i11)).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l8.w0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j10) {
                C5442e1.m21887Qa(adapterView, view, i12, j10);
            }
        });
        ((MemoryListView) m21946Z9(i11)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.x0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                boolean m21889Ra;
                m21889Ra = C5442e1.m21889Ra(C5442e1.this, view, i12, keyEvent);
                return m21889Ra;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Oa */
    public static final void m21883Oa(AdapterView adapterView, View view, int i10, long j10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pa */
    public static final boolean m21885Pa(C5442e1 c5442e1, View view, int i10, KeyEvent keyEvent) {
        boolean z10;
        AbstractC5868k.m23674f(c5442e1, "this$0");
        int action = keyEvent.getAction();
        boolean z11 = false;
        if (action == 0) {
            if (i10 != 19) {
                if (i10 != 20) {
                    if (i10 == 22) {
                        ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2 = c5442e1.f22128D0;
                        if (viewOnClickListenerC5519x2 != null) {
                            if (viewOnClickListenerC5519x2 != null && viewOnClickListenerC5519x2.m3079D7()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                c5442e1.m21942La();
                                ViewOnClickListenerC5519x2 viewOnClickListenerC5519x22 = c5442e1.f22128D0;
                                AbstractC5868k.m23671c(viewOnClickListenerC5519x22);
                                viewOnClickListenerC5519x22.m22392da();
                            }
                        }
                        C5525z1 c5525z1 = c5442e1.f22129E0;
                        if (c5525z1 != null) {
                            if (c5525z1 != null && c5525z1.m3079D7()) {
                                z11 = true;
                            }
                            if (z11) {
                                c5442e1.m21942La();
                                C5525z1 c5525z12 = c5442e1.f22129E0;
                                AbstractC5868k.m23671c(c5525z12);
                                c5525z12.m22423ea();
                            }
                        }
                        C5465k0 c5465k0 = c5442e1.f22130F0;
                        if (c5465k0 != null) {
                            AbstractC5868k.m23671c(c5465k0);
                            if (c5465k0.m3079D7()) {
                                C5465k0 c5465k02 = c5442e1.f22130F0;
                                AbstractC5868k.m23671c(c5465k02);
                                if (c5465k02.m22091Ga()) {
                                    c5442e1.m21942La();
                                    C5465k0 c5465k03 = c5442e1.f22130F0;
                                    AbstractC5868k.m23671c(c5465k03);
                                    c5465k03.m22098Ta();
                                }
                            }
                        }
                        return true;
                    }
                } else {
                    int selectedItemPosition = ((MemoryListView) c5442e1.m21946Z9(R$id.mLvTab)).getSelectedItemPosition();
                    C1180q0 c1180q0 = c5442e1.f22146z0;
                    AbstractC5868k.m23671c(c1180q0);
                    if (selectedItemPosition == c1180q0.getCount() - 1) {
                        C1180q0 c1180q02 = c5442e1.f22146z0;
                        AbstractC5868k.m23671c(c1180q02);
                        c1180q02.m5417c(false);
                        if (c5442e1.f22126B0.size() > 1) {
                            int i11 = R$id.mLvCategory;
                            ((MemoryListView) c5442e1.m21946Z9(i11)).setForceSelectWhenGetFocus(0, 66);
                            ((MemoryListView) c5442e1.m21946Z9(i11)).requestFocus();
                            c5442e1.m21879Ma();
                        }
                        return true;
                    }
                }
            } else if (((MemoryListView) c5442e1.m21946Z9(R$id.mLvTab)).getSelectedItemPosition() == 0) {
                C1180q0 c1180q03 = c5442e1.f22146z0;
                AbstractC5868k.m23671c(c1180q03);
                c1180q03.m5417c(false);
                if (c5442e1.f22126B0.size() > 1) {
                    int i12 = R$id.mLvCategory;
                    MemoryListView memoryListView = (MemoryListView) c5442e1.m21946Z9(i12);
                    C1147a c1147a = c5442e1.f22125A0;
                    AbstractC5868k.m23671c(c1147a);
                    memoryListView.setForceSelectWhenGetFocus(c1147a.getCount() - 1, 66);
                    ((MemoryListView) c5442e1.m21946Z9(i12)).requestFocus();
                    c5442e1.m21879Ma();
                    c5442e1.m21925rb(f22124Z0);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Qa */
    public static final void m21887Qa(AdapterView adapterView, View view, int i10, long j10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r3.m22090Fa() != false) goto L19;
     */
    /* renamed from: Ra */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m21889Ra(p223l8.C5442e1 r2, android.view.View r3, int r4, android.view.KeyEvent r5) {
        /*
            java.lang.String r3 = "this$0"
            ne.AbstractC5868k.m23674f(r2, r3)
            int r3 = r5.getAction()
            if (r3 != 0) goto Lc3
            r3 = 19
            r5 = 66
            r0 = 1
            if (r4 == r3) goto L91
            r3 = 20
            if (r4 == r3) goto L55
            r3 = 22
            if (r4 == r3) goto L1c
            goto Lc3
        L1c:
            l8.k0 r3 = r2.f22130F0
            if (r3 == 0) goto L54
            ne.AbstractC5868k.m23671c(r3)
            boolean r3 = r3.m3079D7()
            if (r3 == 0) goto L54
            l8.k0 r3 = r2.f22130F0
            ne.AbstractC5868k.m23671c(r3)
            boolean r3 = r3.m22091Ga()
            if (r3 != 0) goto L3f
            l8.k0 r3 = r2.f22130F0
            ne.AbstractC5868k.m23671c(r3)
            boolean r3 = r3.m22090Fa()
            if (r3 == 0) goto L54
        L3f:
            r2.m21942La()
            b8.q0 r3 = r2.f22146z0
            ne.AbstractC5868k.m23671c(r3)
            int r4 = p223l8.C5442e1.f22123Y0
            r3.setSecondPosition(r4)
            l8.k0 r2 = r2.f22130F0
            ne.AbstractC5868k.m23671c(r2)
            r2.m22098Ta()
        L54:
            return r0
        L55:
            boolean r3 = r2.m21912eb()
            if (r3 == 0) goto L62
            long r3 = java.lang.System.currentTimeMillis()
            r2.f22138N0 = r3
            return r0
        L62:
            int r3 = com.live.R$id.mLvCategory
            android.view.View r3 = r2.m21946Z9(r3)
            com.widget.custom.MemoryListView r3 = (com.widget.custom.MemoryListView) r3
            int r3 = r3.getSelectedItemPosition()
            b8.a r4 = r2.f22125A0
            ne.AbstractC5868k.m23671c(r4)
            int r4 = r4.getCount()
            int r4 = r4 - r0
            if (r3 != r4) goto Lc3
            int r3 = com.live.R$id.mLvTab
            android.view.View r4 = r2.m21946Z9(r3)
            com.widget.custom.MemoryListView r4 = (com.widget.custom.MemoryListView) r4
            int r1 = p223l8.C5442e1.f22120V0
            r4.setForceSelectWhenGetFocus(r1, r5)
            android.view.View r2 = r2.m21946Z9(r3)
            com.widget.custom.MemoryListView r2 = (com.widget.custom.MemoryListView) r2
            r2.requestFocus()
            return r0
        L91:
            boolean r3 = r2.m21912eb()
            if (r3 == 0) goto L9e
            long r3 = java.lang.System.currentTimeMillis()
            r2.f22138N0 = r3
            return r0
        L9e:
            int r3 = com.live.R$id.mLvCategory
            android.view.View r3 = r2.m21946Z9(r3)
            com.widget.custom.MemoryListView r3 = (com.widget.custom.MemoryListView) r3
            int r3 = r3.getSelectedItemPosition()
            if (r3 != 0) goto Lc3
            int r3 = com.live.R$id.mLvTab
            android.view.View r4 = r2.m21946Z9(r3)
            com.widget.custom.MemoryListView r4 = (com.widget.custom.MemoryListView) r4
            int r1 = p223l8.C5442e1.f22123Y0
            r4.setForceSelectWhenGetFocus(r1, r5)
            android.view.View r2 = r2.m21946Z9(r3)
            com.widget.custom.MemoryListView r2 = (com.widget.custom.MemoryListView) r2
            r2.requestFocus()
            return r0
        Lc3:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5442e1.m21889Ra(l8.e1, android.view.View, int, android.view.KeyEvent):boolean");
    }

    /* renamed from: Ta */
    private final void m21892Ta(final List list) {
        Disposable disposable = this.f22142R0;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable compose = Observable.fromCallable(new Callable() { // from class: l8.q0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1328x m21894Ua;
                m21894Ua = C5442e1.m21894Ua(list, this);
                return m21894Ua;
            }
        }).compose(AbstractC7029f.m27121b());
        final g gVar = new g();
        Consumer consumer = new Consumer() { // from class: l8.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5442e1.m21896Va(InterfaceC5660l.this, obj);
            }
        };
        final h hVar = h.f22155a;
        this.f22142R0 = compose.subscribe(consumer, new Consumer() { // from class: l8.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5442e1.m21898Wa(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ua */
    public static final C1328x m21894Ua(List list, C5442e1 c5442e1) {
        AbstractC5868k.m23674f(list, "$list");
        AbstractC5868k.m23674f(c5442e1, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ChildColumn childColumn = (ChildColumn) it.next();
            C7584l c7584l = C7584l.f27868a;
            String m29107e = c7584l.m29107e(childColumn.getPosterList(), C7594o0.a.Logo.m29227b());
            String m29107e2 = c7584l.m29107e(childColumn.getPosterList(), C7594o0.a.Icon.m29227b());
            if (m29107e != null && m29107e2 != null) {
                Drawable m29105c = c7584l.m29105c(m29107e);
                Drawable m29105c2 = c7584l.m29105c(m29107e2);
                if (m29105c != null && m29105c2 != null) {
                    c5442e1.f22141Q0.put(Integer.valueOf(childColumn.getId()), new C4035f(m29105c, m29105c2, m29105c2));
                }
            }
        }
        return C1328x.f4998a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Va */
    public static final void m21896Va(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wa */
    public static final void m21898Wa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Xa */
    private final void m21900Xa(int i10) {
        int i11 = f22123Y0;
        this.f22136L0 = i11;
        this.f22137M0 = i10;
        ((MemoryListView) m21946Z9(R$id.mLvTab)).setSelection(i11);
        List m6509g = C1407f.f5458a.m6509g(i10);
        Observable just = Observable.just(m6509g);
        final i iVar = i.f22156a;
        Observable map = just.map(new Function() { // from class: l8.d1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m21902Ya;
                m21902Ya = C5442e1.m21902Ya(InterfaceC5660l.this, obj);
                return m21902Ya;
            }
        });
        final j jVar = j.f22157a;
        Observable map2 = map.map(new Function() { // from class: l8.m0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m21903Za;
                m21903Za = C5442e1.m21903Za(InterfaceC5660l.this, obj);
                return m21903Za;
            }
        });
        final k kVar = new k(i10, m6509g);
        Observable compose = map2.map(new Function() { // from class: l8.n0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m21905ab;
                m21905ab = C5442e1.m21905ab(InterfaceC5660l.this, obj);
                return m21905ab;
            }
        }).compose(AbstractC7029f.m27121b());
        final l lVar = new l();
        Consumer consumer = new Consumer() { // from class: l8.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5442e1.m21907bb(InterfaceC5660l.this, obj);
            }
        };
        final m mVar = m.f22163a;
        compose.subscribe(consumer, new Consumer() { // from class: l8.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5442e1.m21909cb(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ya */
    public static final List m21902Ya(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Za */
    public static final List m21903Za(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ab */
    public static final List m21905ab(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bb */
    public static final void m21907bb(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cb */
    public static final void m21909cb(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: eb */
    private final boolean m21912eb() {
        if (System.currentTimeMillis() - this.f22138N0 < 400) {
            return true;
        }
        return false;
    }

    /* renamed from: hb */
    private final void m21916hb() {
        int i10 = R$id.mArlContentRoot;
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = (ViewOnKeyListenerC5933k) ((MonitorKeyView) m21946Z9(i10)).findViewById(R$id.live_epg_panel);
        if (viewOnKeyListenerC5933k != null) {
            ((MonitorKeyView) m21946Z9(i10)).removeView(viewOnKeyListenerC5933k);
        }
        this.f22127C0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pb */
    public static final void m21923pb(C5442e1 c5442e1, Channel channel, EpgDate epgDate, EpgProgram epgProgram, ReservationList reservationList) {
        AbstractC5868k.m23674f(c5442e1, "this$0");
        AbstractC5868k.m23674f(channel, "$channel");
        AbstractC5868k.m23674f(epgDate, "$epgDate");
        AbstractC5868k.m23674f(epgProgram, "$epgItem");
        AbstractC5868k.m23674f(reservationList, "$reserveList");
        ((InterfaceC4276c) c5442e1.m5478w9()).mo17845H1(channel, epgDate, epgProgram, reservationList);
        ViewOnClickListenerC5136d viewOnClickListenerC5136d = c5442e1.f22132H0;
        if (viewOnClickListenerC5136d != null) {
            viewOnClickListenerC5136d.mo3278o9();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qb */
    public static final void m21924qb(C5442e1 c5442e1, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c5442e1, "this$0");
        c5442e1.f22132H0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rb */
    public final void m21925rb(int i10) {
        boolean z10;
        AbstractC0738x m3534m = m3093I6().m3534m();
        AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
        if (i10 == f22120V0) {
            if (this.f22128D0 == null) {
                ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2 = new ViewOnClickListenerC5519x2();
                this.f22128D0 = viewOnClickListenerC5519x2;
                viewOnClickListenerC5519x2.m22391ca(new n());
            }
            ViewOnClickListenerC5519x2 viewOnClickListenerC5519x22 = this.f22128D0;
            AbstractC5868k.m23671c(viewOnClickListenerC5519x22);
            if (viewOnClickListenerC5519x22.m3190s7()) {
                ViewOnClickListenerC5519x2 viewOnClickListenerC5519x23 = this.f22128D0;
                AbstractC5868k.m23671c(viewOnClickListenerC5519x23);
                m3534m.mo3237u(viewOnClickListenerC5519x23).mo3228h();
                return;
            } else {
                int i11 = R$id.mFlChildContent;
                ViewOnClickListenerC5519x2 viewOnClickListenerC5519x24 = this.f22128D0;
                AbstractC5868k.m23671c(viewOnClickListenerC5519x24);
                m3534m.m3638b(i11, viewOnClickListenerC5519x24, "liveSearchFrag").mo3228h();
                return;
            }
        }
        if (i10 == f22121W0) {
            if (this.f22129E0 == null) {
                this.f22129E0 = new C5525z1();
            }
            C5525z1 c5525z1 = this.f22129E0;
            AbstractC5868k.m23671c(c5525z1);
            if (c5525z1.m3190s7()) {
                C5525z1 c5525z12 = this.f22129E0;
                AbstractC5868k.m23671c(c5525z12);
                m3534m.mo3237u(c5525z12).mo3228h();
                return;
            } else {
                int i12 = R$id.mFlChildContent;
                C5525z1 c5525z13 = this.f22129E0;
                AbstractC5868k.m23671c(c5525z13);
                m3534m.m3638b(i12, c5525z13, "liveReserveFrag").mo3228h();
                return;
            }
        }
        boolean z11 = false;
        if (i10 == f22122X0 || i10 == f22123Y0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || i10 == f22124Z0) {
            z11 = true;
        }
        if (z11) {
            if (this.f22130F0 == null) {
                C5465k0 c5465k0 = new C5465k0();
                this.f22130F0 = c5465k0;
                c5465k0.m22094Pa(new View.OnFocusChangeListener() { // from class: l8.c1
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z12) {
                        C5442e1.m21927sb(C5442e1.this, view, z12);
                    }
                });
                C5465k0 c5465k02 = this.f22130F0;
                if (c5465k02 != null) {
                    c5465k02.m22095Qa(new o());
                }
            }
            C5465k0 c5465k03 = this.f22130F0;
            AbstractC5868k.m23671c(c5465k03);
            if (c5465k03.m3190s7()) {
                C5465k0 c5465k04 = this.f22130F0;
                AbstractC5868k.m23671c(c5465k04);
                m3534m.mo3237u(c5465k04).mo3228h();
            } else if (m3093I6().m3523h0("liveChannelFrag") == null) {
                int i13 = R$id.mFlChildContent;
                C5465k0 c5465k05 = this.f22130F0;
                AbstractC5868k.m23671c(c5465k05);
                m3534m.m3638b(i13, c5465k05, "liveChannelFrag").mo3228h();
            }
        }
    }

    /* renamed from: sa */
    private final void m21926sa() {
        C4053l.a aVar = C4053l.f17879P0;
        if (aVar.m17071b(C4053l.c.BackIcon) && !aVar.m17070a()) {
            m21929tb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sb */
    public static final void m21927sb(C5442e1 c5442e1, View view, boolean z10) {
        int i10;
        AbstractC5868k.m23674f(c5442e1, "this$0");
        FrameLayout frameLayout = (FrameLayout) c5442e1.m21946Z9(R$id.mAflRightArrow);
        if (z10) {
            c5442e1.m21926sa();
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
    }

    /* renamed from: ta */
    private final void m21928ta(int i10) {
        int i11 = 0;
        for (Object obj : this.f22126B0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1500l.m6991j();
            }
            if (((ChildColumn) obj).getId() == i10) {
                ((MemoryListView) m21946Z9(R$id.mLvCategory)).setSelection(i11 - 1);
                return;
            }
            i11 = i12;
        }
    }

    /* renamed from: tb */
    private final void m21929tb() {
        if (((FrameLayout) m21946Z9(R$id.mAflRightArrow)).getVisibility() == 0) {
            C4053l.a aVar = C4053l.f17879P0;
            C4053l.c cVar = C4053l.c.EpgRight;
            if (!aVar.m17071b(cVar)) {
                C4053l c4053l = new C4053l();
                ImageView imageView = (ImageView) m21946Z9(R$id.mIvRightArrow);
                AbstractC5868k.m23673e(imageView, "mIvRightArrow");
                c4053l.m17069ea(imageView);
                c4053l.m17067ca(C4053l.b.BOTTOM_RIGHT);
                c4053l.m17065aa(R$layout.layout_guide_epg_right);
                c4053l.m17066ba(-AutoSizeUtils.dp2px(m3096J6(), 33.0f), 0);
                c4053l.m17068da(p.f22166a);
                AbstractC0729o m3093I6 = m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                c4053l.mo3277E9(m3093I6, "GuideDialog");
                aVar.m17073d(cVar, true);
                return;
            }
        }
        C7709c.m29787d().m29801m(new LiveGuideShow(false));
    }

    /* renamed from: wa */
    private final void m21930wa() {
        boolean z10;
        String str;
        int i10 = this.f22136L0;
        boolean z11 = false;
        if (i10 == f22120V0 || i10 == f22121W0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = f22123Y0;
            this.f22136L0 = i11;
            C5465k0 c5465k0 = this.f22130F0;
            if (c5465k0 != null) {
                c5465k0.m22104da();
            }
            ChildColumn m6519m = C1407f.f5458a.m6519m();
            if (m6519m != null && this.f22137M0 == m6519m.getId()) {
                z11 = true;
            }
            if (z11) {
                C5465k0 c5465k02 = this.f22130F0;
                if (c5465k02 != null) {
                    c5465k02.m22096Ra();
                }
                C5465k0 c5465k03 = this.f22130F0;
                if (c5465k03 != null) {
                    c5465k03.m22103Xa();
                }
            }
            m21925rb(i11);
            m21942La();
            int i12 = R$id.mLvTab;
            ((MemoryListView) m21946Z9(i12)).setSelection(i11);
            C1180q0 c1180q0 = this.f22146z0;
            AbstractC5868k.m23671c(c1180q0);
            c1180q0.setSecondPosition(i11);
            ((MemoryListView) m21946Z9(i12)).post(new Runnable() { // from class: l8.y0
                @Override // java.lang.Runnable
                public final void run() {
                    C5442e1.m21931xa(C5442e1.this);
                }
            });
        } else {
            int i13 = f22123Y0;
            if (i10 == i13) {
                m21925rb(i13);
                m21942La();
                C5465k0 c5465k04 = this.f22130F0;
                if (c5465k04 != null) {
                    c5465k04.m22096Ra();
                }
                C5465k0 c5465k05 = this.f22130F0;
                if (c5465k05 != null) {
                    c5465k05.m22103Xa();
                }
                C5465k0 c5465k06 = this.f22130F0;
                if (c5465k06 != null) {
                    c5465k06.m22105ma();
                }
                C1180q0 c1180q02 = this.f22146z0;
                AbstractC5868k.m23671c(c1180q02);
                c1180q02.setSecondPosition(i13);
            } else {
                int i14 = f22124Z0;
                if (i10 == i14) {
                    m21925rb(i14);
                    m21942La();
                    C1407f c1407f = C1407f.f5458a;
                    ChildColumn m6519m2 = c1407f.m6519m();
                    if (m6519m2 != null && this.f22137M0 == m6519m2.getId()) {
                        z11 = true;
                    }
                    if (z11) {
                        Channel m6531w = c1407f.m6531w();
                        if (m6531w != null) {
                            str = m6531w.getRestricted();
                        } else {
                            str = null;
                        }
                        if (!AbstractC5868k.m23669a(str, "1") && !this.f22140P0) {
                            C5465k0 c5465k07 = this.f22130F0;
                            if (c5465k07 != null) {
                                c5465k07.m22104da();
                            }
                            ((MemoryListView) m21946Z9(R$id.mLvTab)).post(new Runnable() { // from class: l8.z0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C5442e1.m21932ya(C5442e1.this);
                                }
                            });
                            this.f22138N0 = System.currentTimeMillis();
                        } else {
                            ((MemoryListView) m21946Z9(R$id.mLvTab)).post(new Runnable() { // from class: l8.a1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C5442e1.m21933za(C5442e1.this);
                                }
                            });
                        }
                    } else {
                        C5465k0 c5465k08 = this.f22130F0;
                        if (c5465k08 != null) {
                            c5465k08.m22105ma();
                        }
                        int size = this.f22126B0.size();
                        int i15 = R$id.mLvCategory;
                        if (size > ((MemoryListView) m21946Z9(i15)).getSelectedItemPosition() + 1) {
                            int id2 = ((ChildColumn) this.f22126B0.get(((MemoryListView) m21946Z9(i15)).getSelectedItemPosition() + 1)).getId();
                            int i16 = this.f22137M0;
                            if (id2 != i16) {
                                m21928ta(i16);
                            }
                        }
                    }
                    C1180q0 c1180q03 = this.f22146z0;
                    AbstractC5868k.m23671c(c1180q03);
                    c1180q03.setSecondPosition(i13);
                } else {
                    int i17 = f22122X0;
                    if (i10 == i17) {
                        m21925rb(i17);
                        m21942La();
                        C1180q0 c1180q04 = this.f22146z0;
                        AbstractC5868k.m23671c(c1180q04);
                        c1180q04.setSecondPosition(i17);
                        ((MemoryListView) m21946Z9(R$id.mLvTab)).post(new Runnable() { // from class: l8.b1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5442e1.m21868Aa(C5442e1.this);
                            }
                        });
                    }
                }
            }
        }
        m21876Ka();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xa */
    public static final void m21931xa(C5442e1 c5442e1) {
        AbstractC5868k.m23674f(c5442e1, "this$0");
        C1407f c1407f = C1407f.f5458a;
        c5442e1.f22137M0 = c1407f.m6523o();
        C5465k0 c5465k0 = c5442e1.f22130F0;
        if (c5465k0 != null) {
            String string = c5442e1.m3154d7().getString(R$string.live_tab_channel);
            AbstractC5868k.m23673e(string, "resources.getString(R.string.live_tab_channel)");
            c5465k0.m22100Va(string);
        }
        c5442e1.m21958nb(c1407f.m6523o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ya */
    public static final void m21932ya(C5442e1 c5442e1) {
        AbstractC5868k.m23674f(c5442e1, "this$0");
        C5465k0 c5465k0 = c5442e1.f22130F0;
        if (c5465k0 != null) {
            c5465k0.m22110wa(true, new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: za */
    public static final void m21933za(C5442e1 c5442e1) {
        AbstractC5868k.m23674f(c5442e1, "this$0");
        ChildColumn m6519m = C1407f.f5458a.m6519m();
        AbstractC5868k.m23671c(m6519m);
        c5442e1.m21958nb(m6519m.getId());
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_live_content;
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: D0 */
    public void mo17853D0(ArrayList arrayList, int i10) {
        AbstractC5868k.m23674f(arrayList, "epgPrograms");
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = this.f22127C0;
        if (viewOnKeyListenerC5933k != null) {
            viewOnKeyListenerC5933k.m24029z(arrayList, i10);
        }
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: D2 */
    public void mo17854D2(final Channel channel, final EpgDate epgDate, final EpgProgram epgProgram, final ReservationList reservationList) {
        String format;
        AbstractC5868k.m23674f(channel, "channel");
        AbstractC5868k.m23674f(epgDate, "epgDate");
        AbstractC5868k.m23674f(epgProgram, "epgItem");
        AbstractC5868k.m23674f(reservationList, "reserveList");
        if (AbstractC5091h.m20664g()) {
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = m3172j7(R$string.dialog_exist_tip_format);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_exist_tip_format)");
            format = String.format(m3172j7, Arrays.copyOf(new Object[]{reservationList.getStartTime(), reservationList.getName(), channel.getName()}, 3));
            AbstractC5868k.m23673e(format, "format(format, *args)");
        } else {
            C5881x c5881x2 = C5881x.f23415a;
            String m3172j72 = m3172j7(R$string.dialog_exist_tip_format);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.dialog_exist_tip_format)");
            format = String.format(m3172j72, Arrays.copyOf(new Object[]{reservationList.getName(), reservationList.getStartTime(), channel.getName()}, 3));
            AbstractC5868k.m23673e(format, "format(format, *args)");
        }
        ViewOnClickListenerC5136d m20774H9 = ViewOnClickListenerC5136d.m20774H9(0, format, true);
        this.f22132H0 = m20774H9;
        if (m20774H9 != null) {
            m20774H9.m20775I9(new ViewOnClickListenerC5136d.b() { // from class: l8.t0
                @Override // p207k8.ViewOnClickListenerC5136d.b
                /* renamed from: a */
                public final void mo20779a() {
                    C5442e1.m21923pb(C5442e1.this, channel, epgDate, epgProgram, reservationList);
                }
            });
        }
        ViewOnClickListenerC5136d viewOnClickListenerC5136d = this.f22132H0;
        if (viewOnClickListenerC5136d != null) {
            viewOnClickListenerC5136d.m20776J9(new DialogInterface.OnDismissListener() { // from class: l8.u0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C5442e1.m21924qb(C5442e1.this, dialogInterface);
                }
            });
        }
        ViewOnClickListenerC5136d viewOnClickListenerC5136d2 = this.f22132H0;
        if (viewOnClickListenerC5136d2 != null) {
            viewOnClickListenerC5136d2.m20778L9(m3119R6(), "ExistReserveDialog");
        }
    }

    /* renamed from: Da */
    public final String m21934Da() {
        if (this.f22126B0.size() > 1 && this.f22137M0 != -1) {
            for (ChildColumn childColumn : this.f22126B0) {
                if (this.f22137M0 == childColumn.getId()) {
                    return AbstractC5607a.m22777b(childColumn);
                }
            }
            return "";
        }
        return "";
    }

    /* renamed from: Ea */
    public final int m21935Ea() {
        return this.f22137M0;
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void EventShowGuide(ShowGuideEvent showGuideEvent) {
        AbstractC5868k.m23674f(showGuideEvent, "event");
        if (showGuideEvent.getType() == C4053l.c.EpgRight && m3073B7()) {
            m21929tb();
        }
    }

    /* renamed from: Fa */
    public final int m21936Fa() {
        return this.f22136L0;
    }

    /* renamed from: Ga */
    public final int m21937Ga() {
        return this.f22134J0;
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: H */
    public void mo17855H() {
        Disposable disposable = this.f22142R0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: Ha */
    public final int m21938Ha() {
        return this.f22135K0;
    }

    /* renamed from: Ia */
    public final String m21939Ia() {
        return this.f22139O0;
    }

    @Override // p263o8.ViewOnKeyListenerC5933k.a
    /* renamed from: J0 */
    public String mo21940J0() {
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        String m22238J0 = ((C5498s1) m3133W6).m22238J0();
        if (m22238J0 == null) {
            return "";
        }
        return m22238J0;
    }

    @Override // ba.AbstractC1196d
    /* renamed from: Ja, reason: merged with bridge method [inline-methods] */
    public InterfaceC4276c mo5465y9() {
        return new C4710y0(this, this);
    }

    /* renamed from: La */
    public final void m21942La() {
        C1180q0 c1180q0 = this.f22146z0;
        if (c1180q0 != null) {
            AbstractC5868k.m23671c(c1180q0);
            c1180q0.m5418d(false);
        }
        C1147a c1147a = this.f22125A0;
        if (c1147a != null) {
            AbstractC5868k.m23671c(c1147a);
            c1147a.m5209d(false);
        }
        ((LinearLayout) m21946Z9(R$id.mLlTab)).setLayoutParams(new FrameLayout.LayoutParams(AutoSizeUtils.dp2px(m3096J6(), 80.0f), -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.leftMargin = AutoSizeUtils.dp2px(m3096J6(), 80.0f);
        ((FrameLayout) m21946Z9(R$id.mFlChildContent)).setLayoutParams(layoutParams);
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: N0 */
    public void mo17856N0(int i10) {
        C1407f c1407f = C1407f.f5458a;
        if (c1407f.m6523o() == i10) {
            AbstractC7028e.m27117c("n");
            C7709c.m29787d().m29802p(new GetAllLiveDataSuccessEvent(i10));
            if (AbstractC5868k.m23669a(this.f22139O0, "NewVoiceLive") && c1407f.m6530v()) {
                m21900Xa(i10);
            }
        } else {
            C7709c.m29787d().m29802p(new GetChildLiveDataSuccessEvent(i10, this.f22139O0));
        }
        if ((this.f22134J0 == -1 && c1407f.m6523o() == i10) || this.f22134J0 == i10) {
            c1407f.m6504c0(false);
            C7709c.m29787d().m29801m(new GetLiveDataSuccessEvent(i10, this.f22139O0));
        }
    }

    @Override // p263o8.ViewOnKeyListenerC5933k.a
    /* renamed from: P4 */
    public void mo21943P4() {
        m21916hb();
        C5465k0 c5465k0 = this.f22130F0;
        if (c5465k0 != null) {
            c5465k0.m22097Sa();
        }
        ((InterfaceC4276c) m5478w9()).mo17849o0();
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        C5500t.f22383O0.m22354a(this.f22137M0);
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: Sa */
    public final boolean m21944Sa() {
        if (!((MemoryListView) m21946Z9(R$id.mLvTab)).hasFocus() && !((MemoryListView) m21946Z9(R$id.mLvCategory)).hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V7 */
    public void mo3131V7(boolean z10) {
        super.mo3131V7(z10);
        if (z10) {
            C5465k0 c5465k0 = this.f22130F0;
            if (c5465k0 != null) {
                c5465k0.m22111ya();
            }
            m21951gb();
        }
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: W5 */
    public void mo17857W5(ArrayList arrayList) {
        Integer num;
        AbstractC5868k.m23674f(arrayList, "datas");
        this.f22126B0.clear();
        this.f22126B0.addAll(arrayList);
        C1407f c1407f = C1407f.f5458a;
        c1407f.m6518l0(arrayList);
        boolean z10 = true;
        if (this.f22126B0.size() > 1) {
            c1407f.m6493R(((ChildColumn) this.f22126B0.get(0)).getId());
            AbstractC7028e.m27117c("m");
            C1147a c1147a = this.f22125A0;
            if (c1147a != null) {
                c1147a.m5207b(this.f22126B0);
            }
            m21892Ta(this.f22126B0);
            if (m3133W6() == null) {
                return;
            }
            Fragment m3133W6 = m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
            if (!AbstractC5868k.m23669a(((C5498s1) m3133W6).m22282za(), "HomeLive")) {
                Fragment m3133W62 = m3133W6();
                AbstractC5868k.m23672d(m3133W62, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
                if (!AbstractC5868k.m23669a(((C5498s1) m3133W62).m22282za(), "NewVoiceLive")) {
                    return;
                }
            }
            ((InterfaceC4276c) m5478w9()).mo17851y0(c1407f.m6523o());
            int i10 = this.f22134J0;
            if (i10 != -1 && i10 != c1407f.m6523o()) {
                ((InterfaceC4276c) m5478w9()).mo17851y0(this.f22134J0);
            }
            ChildColumn m6524p = c1407f.m6524p();
            if (m6524p != null) {
                num = Integer.valueOf(m6524p.getId());
            } else {
                num = null;
            }
            if (num != null) {
                ChildColumn m6524p2 = c1407f.m6524p();
                if (m6524p2 == null || this.f22134J0 != m6524p2.getId()) {
                    z10 = false;
                }
                if (!z10) {
                    InterfaceC4276c interfaceC4276c = (InterfaceC4276c) m5478w9();
                    ChildColumn m6524p3 = c1407f.m6524p();
                    AbstractC5868k.m23671c(m6524p3);
                    interfaceC4276c.mo17851y0(m6524p3.getId());
                }
            }
        }
    }

    @Override // p263o8.ViewOnKeyListenerC5933k.a
    /* renamed from: Y */
    public void mo21945Y(ArrayList arrayList, int i10, boolean z10) {
        AbstractC5868k.m23674f(arrayList, "dates");
        ((InterfaceC4276c) m5478w9()).mo17847Y(arrayList, i10, z10);
    }

    /* renamed from: Z9 */
    public View m21946Z9(int i10) {
        View findViewById;
        Map map = this.f22144T0;
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

    @Override // p263o8.ViewOnKeyListenerC5933k.a
    /* renamed from: b4 */
    public void mo21947b4(EpgDate epgDate) {
        int m6523o;
        int i10 = this.f22136L0;
        if (i10 != f22122X0 && i10 != f22123Y0) {
            m6523o = this.f22137M0;
        } else {
            m6523o = C1407f.f5458a.m6523o();
        }
        ((InterfaceC4276c) m5478w9()).mo17844B3(epgDate, m6523o);
    }

    @InterfaceC7719m
    public final void changeListToAllChannel(ChangeListToAllChannelEvent changeListToAllChannelEvent) {
        AbstractC5868k.m23674f(changeListToAllChannelEvent, "event");
        if (this.f22136L0 == -1) {
            this.f22135K0 = f22123Y0;
        } else {
            this.f22136L0 = f22123Y0;
        }
        C1407f c1407f = C1407f.f5458a;
        this.f22137M0 = c1407f.m6523o();
        C5465k0 c5465k0 = this.f22130F0;
        if (c5465k0 != null) {
            String string = m3154d7().getString(R$string.live_tab_channel);
            AbstractC5868k.m23673e(string, "resources.getString(R.string.live_tab_channel)");
            c5465k0.m22100Va(string);
        }
        m21958nb(c1407f.m6523o());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @ye.InterfaceC7719m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void changeUserAccountSuccess(com.module.event.ChangeUserAccountSuccessEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            ne.AbstractC5868k.m23674f(r5, r0)
            java.util.ArrayList r5 = r4.f22126B0
            r5.clear()
            r5 = 0
            r4.f22140P0 = r5
            ja.a r0 = p193ja.C5044a.f20862a
            fa.d r1 = p132fa.C4300d.f18678a
            java.lang.String r1 = r1.m18035h()
            java.lang.Object r0 = r0.m20485a(r1)
            boolean r1 = r0 instanceof com.request.result.GetColumnContentsResultData
            r2 = 0
            if (r1 == 0) goto L21
            com.request.result.GetColumnContentsResultData r0 = (com.request.result.GetColumnContentsResultData) r0
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 == 0) goto L29
            java.util.List r1 = r0.getChildColumnList()
            goto L2a
        L29:
            r1 = r2
        L2a:
            r3 = 1
            if (r1 == 0) goto La6
            java.util.ArrayList r1 = r4.f22126B0
            java.util.List r0 = r0.getChildColumnList()
            ne.AbstractC5868k.m23671c(r0)
            r1.addAll(r0)
            java.util.ArrayList r0 = r4.f22126B0
            c8.f r1 = p040c8.C1407f.f5458a
            int r1 = r1.m6521n()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r1 = "mLiveColumnList[ChannelL…Helper.mAdultColumnIndex]"
            ne.AbstractC5868k.m23673e(r0, r1)
            com.request.result.ChildColumn r0 = (com.request.result.ChildColumn) r0
            cc.m0 r1 = cc.C1466m0.f5627a
            com.request.result.UserInfo r1 = r1.m6887v()
            if (r1 == 0) goto L58
            java.lang.String r2 = r1.getRestrictedStatus()
        L58:
            java.lang.String r1 = "1"
            boolean r1 = ne.AbstractC5868k.m23669a(r2, r1)
            if (r1 == 0) goto L91
            i2.a r1 = p170i2.C4842a.f20329a
            i2.b r2 = r1.m19920a()
            boolean r2 = r2.m19931H()
            if (r2 != 0) goto L77
            i2.b r1 = r1.m19920a()
            boolean r1 = r1.mo19970s()
            if (r1 != 0) goto L77
            goto L91
        L77:
            java.util.ArrayList r1 = r4.f22126B0
            r1.remove(r0)
            java.util.ArrayList r1 = r4.f22126B0
            int r1 = r1.size()
            if (r1 <= r3) goto L8b
            java.util.ArrayList r1 = r4.f22126B0
            r2 = 2
            r1.add(r2, r0)
            goto La6
        L8b:
            java.util.ArrayList r1 = r4.f22126B0
            r1.add(r0)
            goto La6
        L91:
            java.util.ArrayList r1 = r4.f22126B0
            r1.remove(r0)
            l8.k0 r0 = r4.f22130F0
            if (r0 == 0) goto L9d
            r0.m22096Ra()
        L9d:
            l8.k0 r0 = r4.f22130F0
            if (r0 == 0) goto La4
            r0.m22103Xa()
        La4:
            r0 = 1
            goto La7
        La6:
            r0 = 0
        La7:
            java.util.ArrayList r1 = r4.f22126B0
            int r1 = r1.size()
            if (r1 <= r3) goto Ld6
            if (r0 == 0) goto Lcd
            c8.f r0 = p040c8.C1407f.f5458a
            com.request.result.ChildColumn r0 = r0.m6519m()
            if (r0 == 0) goto Lc2
            int r1 = r4.f22137M0
            int r0 = r0.getId()
            if (r1 != r0) goto Lc2
            r5 = 1
        Lc2:
            if (r5 == 0) goto Lcd
            int r5 = r4.f22136L0
            r0 = -1
            if (r5 == r0) goto Lcd
            int r5 = p223l8.C5442e1.f22120V0
            r4.f22136L0 = r5
        Lcd:
            b8.a r5 = r4.f22125A0
            if (r5 == 0) goto Ld6
            java.util.ArrayList r0 = r4.f22126B0
            r5.m5207b(r0)
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5442e1.changeUserAccountSuccess(com.module.event.ChangeUserAccountSuccessEvent):void");
    }

    @Override // p263o8.ViewOnKeyListenerC5933k.a
    /* renamed from: d4 */
    public boolean mo21948d4() {
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        return ((C5498s1) m3133W6).m22258d4();
    }

    /* renamed from: db */
    public final void m21949db() {
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        ((C5498s1) m3133W6).m22250Sa();
    }

    /* renamed from: fb */
    public final void m21950fb(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        this.f22133I0 = interfaceC5642a;
    }

    /* renamed from: gb */
    public final void m21951gb() {
        m21916hb();
        ((InterfaceC4276c) m5478w9()).mo17849o0();
    }

    /* renamed from: ib */
    public final void m21952ib() {
        if (this.f22136L0 == -1) {
            m21869Ba();
        } else {
            m21930wa();
        }
    }

    /* renamed from: jb */
    public final void m21953jb(int i10) {
        this.f22137M0 = i10;
    }

    /* renamed from: kb */
    public final void m21954kb(int i10) {
        this.f22136L0 = i10;
    }

    @Override // p263o8.ViewOnKeyListenerC5933k.a
    /* renamed from: l0 */
    public void mo21955l0(EpgProgram epgProgram) {
        AbstractC5868k.m23674f(epgProgram, "epgItem");
        ((InterfaceC4276c) m5478w9()).mo17848l0(epgProgram);
    }

    /* renamed from: lb */
    public final void m21956lb() {
        C5465k0 c5465k0 = this.f22130F0;
        if (c5465k0 != null) {
            c5465k0.m22104da();
        }
        C5465k0 c5465k02 = this.f22130F0;
        if (c5465k02 != null) {
            c5465k02.m22093Ja(-1, false, true);
        }
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22144T0.clear();
    }

    /* renamed from: mb */
    public final void m21957mb(long j10) {
        this.f22138N0 = j10;
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: n1 */
    public void mo17858n1(boolean z10) {
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = this.f22127C0;
        if (viewOnKeyListenerC5933k != null) {
            viewOnKeyListenerC5933k.m24027x(z10);
        }
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: n3 */
    public void mo17859n3() {
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = this.f22127C0;
        if (viewOnKeyListenerC5933k != null) {
            viewOnKeyListenerC5933k.m24023C();
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        this.f22139O0 = ((C5498s1) m3133W6).m22282za();
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        this.f22146z0 = new C1180q0(m3096J6, new b());
        ((MemoryListView) m21946Z9(R$id.mLvTab)).setAdapter((ListAdapter) this.f22146z0);
        C1180q0 c1180q0 = this.f22146z0;
        AbstractC5868k.m23671c(c1180q0);
        c1180q0.notifyDataSetChanged();
        Context m3096J62 = m3096J6();
        AbstractC5868k.m23671c(m3096J62);
        this.f22125A0 = new C1147a(m3096J62);
        ((MemoryListView) m21946Z9(R$id.mLvCategory)).setAdapter((ListAdapter) this.f22125A0);
        C1147a c1147a = this.f22125A0;
        AbstractC5868k.m23671c(c1147a);
        c1147a.notifyDataSetChanged();
        m21881Na();
    }

    /* renamed from: nb */
    public final void m21958nb(int i10) {
        boolean z10;
        C1407f c1407f = C1407f.f5458a;
        if (i10 == c1407f.m6523o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!AbstractC6567a.m25635e(c1407f.m6515j(i10))) {
            C5465k0 c5465k0 = this.f22130F0;
            if (c5465k0 != null) {
                c5465k0.m22093Ja(i10, z10, false);
                return;
            }
            return;
        }
        if (!z10) {
            C5465k0 c5465k02 = this.f22130F0;
            if (c5465k02 != null) {
                c5465k02.m22104da();
            }
            ((InterfaceC4276c) m5478w9()).mo17851y0(i10);
        }
    }

    @Override // p263o8.ViewOnKeyListenerC5933k.a
    /* renamed from: o5 */
    public void mo21959o5(EpgDate epgDate, EpgProgram epgProgram) {
        AbstractC5868k.m23674f(epgDate, "epgDate");
        AbstractC5868k.m23674f(epgProgram, "epgItem");
        ((InterfaceC4276c) m5478w9()).mo17846L0(epgDate, epgProgram);
    }

    /* renamed from: oa */
    public final void m21960oa() {
        m21966ub();
        ((FrameLayout) m21946Z9(R$id.mAflRightArrow)).setVisibility(8);
        this.f22136L0 = -1;
        int i10 = R$id.mLvTab;
        int selectedItemPosition = ((MemoryListView) m21946Z9(i10)).getSelectedItemPosition();
        int i11 = f22122X0;
        if (selectedItemPosition == i11) {
            ((MemoryListView) m21946Z9(i10)).setSelection(-1);
            ((MemoryListView) m21946Z9(i10)).setForceSelectWhenGetFocus(i11, 66);
        } else {
            ((MemoryListView) m21946Z9(i10)).setSelection(i11);
        }
        ((MemoryListView) m21946Z9(i10)).requestFocus();
    }

    /* renamed from: ob */
    public final void m21961ob() {
        boolean z10 = true;
        C1427v.f5519a.m6647k0(true);
        int i10 = f22123Y0;
        this.f22136L0 = i10;
        C5465k0 c5465k0 = this.f22130F0;
        if (c5465k0 != null) {
            c5465k0.m22104da();
        }
        m21876Ka();
        m21925rb(i10);
        m21942La();
        C5465k0 c5465k02 = this.f22130F0;
        if (c5465k02 != null) {
            c5465k02.m22096Ra();
        }
        C5465k0 c5465k03 = this.f22130F0;
        if (c5465k03 != null) {
            c5465k03.m22103Xa();
        }
        ((MemoryListView) m21946Z9(R$id.mLvTab)).setSelection(i10);
        C1180q0 c1180q0 = this.f22146z0;
        AbstractC5868k.m23671c(c1180q0);
        c1180q0.setSecondPosition(i10);
        C1407f c1407f = C1407f.f5458a;
        this.f22137M0 = c1407f.m6523o();
        C5465k0 c5465k04 = this.f22130F0;
        if (c5465k04 == null || !c5465k04.m22092Ha()) {
            z10 = false;
        }
        if (z10) {
            C5465k0 c5465k05 = this.f22130F0;
            if (c5465k05 != null) {
                String string = m3154d7().getString(R$string.live_tab_channel);
                AbstractC5868k.m23673e(string, "resources.getString(R.string.live_tab_channel)");
                c5465k05.m22100Va(string);
            }
            m21958nb(c1407f.m6523o());
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        AbstractC5868k.m23674f(keyEvent, "event");
        ViewOnClickListenerC5519x2 viewOnClickListenerC5519x2 = this.f22128D0;
        if (viewOnClickListenerC5519x2 != null) {
            if (viewOnClickListenerC5519x2 != null && viewOnClickListenerC5519x2.m3079D7()) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                ViewOnClickListenerC5519x2 viewOnClickListenerC5519x22 = this.f22128D0;
                if (viewOnClickListenerC5519x22 != null) {
                    z15 = viewOnClickListenerC5519x22.onKeyDown(i10, keyEvent);
                } else {
                    z15 = false;
                }
                if (z15) {
                    return true;
                }
            }
        }
        C5525z1 c5525z1 = this.f22129E0;
        if (c5525z1 != null) {
            if (c5525z1 != null && c5525z1.m3079D7()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                C5525z1 c5525z12 = this.f22129E0;
                if (c5525z12 != null) {
                    z13 = c5525z12.onKeyDown(i10, keyEvent);
                } else {
                    z13 = false;
                }
                if (z13) {
                    return true;
                }
            }
        }
        C5465k0 c5465k0 = this.f22130F0;
        if (c5465k0 != null) {
            if (c5465k0 != null && c5465k0.m3079D7()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                C5465k0 c5465k02 = this.f22130F0;
                if (c5465k02 != null) {
                    z11 = c5465k02.onKeyDown(i10, keyEvent);
                } else {
                    z11 = false;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: pa */
    public final void m21962pa() {
        m21966ub();
        ((FrameLayout) m21946Z9(R$id.mAflRightArrow)).setVisibility(8);
        this.f22136L0 = -1;
        int i10 = R$id.mLvTab;
        int selectedItemPosition = ((MemoryListView) m21946Z9(i10)).getSelectedItemPosition();
        int i11 = f22123Y0;
        if (selectedItemPosition == i11) {
            ((MemoryListView) m21946Z9(i10)).setSelection(-1);
            ((MemoryListView) m21946Z9(i10)).setForceSelectWhenGetFocus(i11, 66);
        } else {
            ((MemoryListView) m21946Z9(i10)).setSelection(i11);
        }
        ((MemoryListView) m21946Z9(i10)).requestFocus();
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: q6 */
    public void mo17860q6(boolean z10) {
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = this.f22127C0;
        if (viewOnKeyListenerC5933k != null) {
            viewOnKeyListenerC5933k.m24022B(z10);
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    /* renamed from: qa */
    public final void m21963qa() {
        m21966ub();
        ((FrameLayout) m21946Z9(R$id.mAflRightArrow)).setVisibility(8);
        this.f22136L0 = -1;
        int i10 = R$id.mLvTab;
        int selectedItemPosition = ((MemoryListView) m21946Z9(i10)).getSelectedItemPosition();
        int i11 = f22120V0;
        if (selectedItemPosition == i11) {
            ((MemoryListView) m21946Z9(i10)).setSelection(-1);
            ((MemoryListView) m21946Z9(i10)).setForceSelectWhenGetFocus(i11, 66);
        } else {
            ((MemoryListView) m21946Z9(i10)).setSelection(i11);
        }
        ((MemoryListView) m21946Z9(i10)).requestFocus();
    }

    /* renamed from: ra */
    public final void m21964ra() {
        m21966ub();
        ((FrameLayout) m21946Z9(R$id.mAflRightArrow)).setVisibility(8);
        if (this.f22136L0 == f22124Z0) {
            ((MemoryListView) m21946Z9(R$id.mLvCategory)).requestFocus();
            C1180q0 c1180q0 = this.f22146z0;
            AbstractC5868k.m23671c(c1180q0);
            c1180q0.setSecondPosition(-1);
            return;
        }
        ((MemoryListView) m21946Z9(R$id.mLvTab)).requestFocus();
    }

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void requestLiveColumnSuccess(RequestLiveColumnSuccessEvent requestLiveColumnSuccessEvent) {
        AbstractC5868k.m23674f(requestLiveColumnSuccessEvent, "event");
        ((InterfaceC4276c) m5478w9()).mo17850r3();
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void selectChannelTab(SelectAllChannelTabEvent selectAllChannelTabEvent) {
        AbstractC5868k.m23674f(selectAllChannelTabEvent, "event");
        if (!AbstractC5868k.m23669a(this.f22139O0, "VoiceLive")) {
            return;
        }
        int i10 = this.f22136L0;
        int i11 = f22123Y0;
        if (i10 == i11) {
            return;
        }
        if (m3079D7()) {
            int i12 = R$id.mLvTab;
            ((MemoryListView) m21946Z9(i12)).setForceSelectWhenGetFocus(i11, 66);
            ((MemoryListView) m21946Z9(i12)).requestFocus();
            return;
        }
        this.f22136L0 = i11;
        m21876Ka();
        if (this.f22126B0.size() > 0) {
            C1407f c1407f = C1407f.f5458a;
            this.f22137M0 = c1407f.m6523o();
            C5465k0 c5465k0 = this.f22130F0;
            if (c5465k0 != null) {
                String string = m3154d7().getString(R$string.live_tab_channel);
                AbstractC5868k.m23673e(string, "resources.getString(R.string.live_tab_channel)");
                c5465k0.m22100Va(string);
            }
            m21958nb(c1407f.m6523o());
        }
    }

    /* renamed from: ua */
    public final void m21965ua() {
        ViewOnClickListenerC4019e viewOnClickListenerC4019e;
        ViewOnClickListenerC4019e viewOnClickListenerC4019e2 = this.f22131G0;
        boolean z10 = false;
        if (viewOnClickListenerC4019e2 != null && viewOnClickListenerC4019e2.m3079D7()) {
            z10 = true;
        }
        if (z10 && (viewOnClickListenerC4019e = this.f22131G0) != null) {
            viewOnClickListenerC4019e.mo3279p9();
        }
        this.f22131G0 = null;
    }

    /* renamed from: ub */
    public final void m21966ub() {
        C1180q0 c1180q0 = this.f22146z0;
        if (c1180q0 != null) {
            AbstractC5868k.m23671c(c1180q0);
            c1180q0.m5418d(true);
        }
        C1147a c1147a = this.f22125A0;
        if (c1147a != null) {
            AbstractC5868k.m23671c(c1147a);
            c1147a.m5209d(true);
        }
        ((LinearLayout) m21946Z9(R$id.mLlTab)).setLayoutParams(new FrameLayout.LayoutParams(AutoSizeUtils.dp2px(m3096J6(), 253.0f), -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.leftMargin = AutoSizeUtils.dp2px(m3096J6(), 253.0f);
        ((FrameLayout) m21946Z9(R$id.mFlChildContent)).setLayoutParams(layoutParams);
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void updateRestrictStateEvent(UpdateRestrictStateEvent updateRestrictStateEvent) {
        String str;
        boolean z10;
        AbstractC5868k.m23674f(updateRestrictStateEvent, "event");
        boolean z11 = false;
        this.f22140P0 = false;
        UserInfo m6887v = C1466m0.f5627a.m6887v();
        if (m6887v != null) {
            str = m6887v.getRestrictedStatus();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, "1")) {
            C4842a c4842a = C4842a.f20329a;
            if (c4842a.m19920a().m19931H() || c4842a.m19920a().mo19970s()) {
                C1407f c1407f = C1407f.f5458a;
                if (c1407f.m6519m() != null) {
                    if (this.f22126B0.size() > 1) {
                        ArrayList arrayList = this.f22126B0;
                        ChildColumn m6519m = c1407f.m6519m();
                        AbstractC5868k.m23671c(m6519m);
                        arrayList.add(2, m6519m);
                    } else {
                        ArrayList arrayList2 = this.f22126B0;
                        ChildColumn m6519m2 = c1407f.m6519m();
                        AbstractC5868k.m23671c(m6519m2);
                        arrayList2.add(m6519m2);
                    }
                    C1147a c1147a = this.f22125A0;
                    if (c1147a != null) {
                        c1147a.m5207b(this.f22126B0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        int size = this.f22126B0.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                ChildColumn m6519m3 = C1407f.f5458a.m6519m();
                if (m6519m3 != null && ((ChildColumn) this.f22126B0.get(i10)).getId() == m6519m3.getId()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            this.f22126B0.remove(i10);
        }
        C1147a c1147a2 = this.f22125A0;
        if (c1147a2 != null) {
            c1147a2.m5207b(this.f22126B0);
        }
        ChildColumn m6519m4 = C1407f.f5458a.m6519m();
        if (m6519m4 != null && this.f22137M0 == m6519m4.getId()) {
            z11 = true;
        }
        if (z11) {
            if (this.f22136L0 != -1) {
                this.f22136L0 = f22120V0;
            }
            C5465k0 c5465k0 = this.f22130F0;
            if (c5465k0 != null) {
                c5465k0.m22096Ra();
            }
            C5465k0 c5465k02 = this.f22130F0;
            if (c5465k02 != null) {
                c5465k02.m22103Xa();
            }
            Fragment m3133W6 = m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
            ((C5498s1) m3133W6).m22234Ea();
        }
    }

    /* renamed from: va */
    public final void m21967va(Channel channel) {
        m21916hb();
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = new ViewOnKeyListenerC5933k(m3096J6);
        this.f22127C0 = viewOnKeyListenerC5933k;
        viewOnKeyListenerC5933k.setParentType(this.f22139O0);
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k2 = this.f22127C0;
        if (viewOnKeyListenerC5933k2 != null) {
            viewOnKeyListenerC5933k2.setId(R$id.live_epg_panel);
        }
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k3 = this.f22127C0;
        if (viewOnKeyListenerC5933k3 != null) {
            viewOnKeyListenerC5933k3.setOnLiveEpgListener(this);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.leftMargin = AutoSizeUtils.dp2px(m3096J6(), 533.0f);
        ((MonitorKeyView) m21946Z9(R$id.mArlContentRoot)).addView(this.f22127C0, layoutParams);
        ((InterfaceC4276c) m5478w9()).mo17852z2(channel, this.f22127C0);
        int i10 = this.f22137M0;
        if (i10 == -1) {
            C1427v.f5519a.m6650n0(C1407f.f5458a.m6523o());
        } else {
            C1427v.f5519a.m6650n0(i10);
        }
    }

    /* renamed from: vb */
    public final void m21968vb() {
        this.f22133I0 = null;
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: w4 */
    public void mo17861w4(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "epgPrograms");
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = this.f22127C0;
        if (viewOnKeyListenerC5933k != null) {
            viewOnKeyListenerC5933k.m24028y(arrayList);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22143S0;
    }

    @Override // p130f8.InterfaceC4277d
    /* renamed from: z0 */
    public void mo17862z0() {
        ViewOnKeyListenerC5933k viewOnKeyListenerC5933k = this.f22127C0;
        if (viewOnKeyListenerC5933k != null) {
            viewOnKeyListenerC5933k.m24024D();
        }
    }
}
