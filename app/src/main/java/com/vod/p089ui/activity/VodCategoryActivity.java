package com.vod.p089ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1328x;
import com.core.sysopt.mark.vod.category.VodCategoryRootView;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.open.leanback.widget.AbstractC3050a;
import com.open.leanback.widget.AbstractC3057h;
import com.open.leanback.widget.InterfaceC3056g;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.AssetList;
import com.request.result.ChildColumn;
import com.request.result.GetShelveResult;
import com.request.result.PosterList;
import com.request.result.RecommendColumnContentDataBean;
import com.umeng.analytics.pro.C3325bt;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.p089ui.activity.VodCategoryActivity;
import com.zhy.autolayout.AutoLinearLayout;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import ne.C5881x;
import p043ce.AbstractC1500l;
import p102db.C4035f;
import p132fa.C4300d;
import p153h2.AbstractC4509b;
import p201k2.AbstractC5091h;
import p212kd.C5197l2;
import p212kd.C5236v1;
import p253nd.InterfaceC5853m;
import p289pd.C6283u;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p348u2.AbstractC7028e;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7568f1;
import p400xa.AbstractC7598p1;
import p400xa.C7584l;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7619y;

/* loaded from: classes3.dex */
public final class VodCategoryActivity extends AbstractActivityC2972a implements InterfaceC5853m {

    /* renamed from: C0 */
    public static final C3836a f17317C0 = new C3836a(null);

    /* renamed from: H */
    private int f17323H;

    /* renamed from: I */
    private boolean f17324I;

    /* renamed from: N */
    private int f17329N;

    /* renamed from: V */
    private int f17331V;

    /* renamed from: X */
    private boolean f17333X;

    /* renamed from: Y */
    private C5236v1 f17334Y;

    /* renamed from: i0 */
    private ChildColumn f17338i0;

    /* renamed from: j0 */
    public boolean f17339j0;

    /* renamed from: k0 */
    private boolean f17340k0;

    /* renamed from: m0 */
    public int f17342m0;

    /* renamed from: p0 */
    private boolean f17345p0;

    /* renamed from: r0 */
    private String f17347r0;

    /* renamed from: s0 */
    private List f17348s0;

    /* renamed from: v0 */
    private Disposable f17351v0;

    /* renamed from: B0 */
    public Map f17319B0 = new LinkedHashMap();

    /* renamed from: E */
    private final String f17320E = VodCategoryActivity.class.getSimpleName();

    /* renamed from: F */
    private int f17321F = 1;

    /* renamed from: G */
    private int f17322G = 1;

    /* renamed from: J */
    public int f17325J = -1;

    /* renamed from: K */
    public String f17326K = "";

    /* renamed from: L */
    public String f17327L = "";

    /* renamed from: M */
    private int f17328M = 1;

    /* renamed from: O */
    private int f17330O = 1;

    /* renamed from: W */
    private int f17332W = -1;

    /* renamed from: Z */
    private C5197l2 f17335Z = new C5197l2();

    /* renamed from: g0 */
    private ArrayList f17336g0 = new ArrayList();

    /* renamed from: h0 */
    private ArrayList f17337h0 = new ArrayList();

    /* renamed from: l0 */
    private boolean f17341l0 = true;

    /* renamed from: n0 */
    public String f17343n0 = "";

    /* renamed from: o0 */
    public String f17344o0 = "";

    /* renamed from: q0 */
    public String f17346q0 = "";

    /* renamed from: t0 */
    public int f17349t0 = -1;

    /* renamed from: u0 */
    private HashMap f17350u0 = new HashMap();

    /* renamed from: w0 */
    private final HandlerC3839d f17352w0 = new HandlerC3839d(Looper.getMainLooper());

    /* renamed from: x0 */
    private final View.OnKeyListener f17353x0 = new View.OnKeyListener() { // from class: sd.f1
        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean m16382g7;
            m16382g7 = VodCategoryActivity.m16382g7(VodCategoryActivity.this, view, i10, keyEvent);
            return m16382g7;
        }
    };

    /* renamed from: y0 */
    private final AbstractC3050a.c f17354y0 = new AbstractC3050a.c() { // from class: sd.g1
        @Override // com.open.leanback.widget.AbstractC3050a.c
        /* renamed from: a */
        public final boolean mo12521a(KeyEvent keyEvent) {
            boolean m16379e7;
            m16379e7 = VodCategoryActivity.m16379e7(VodCategoryActivity.this, keyEvent);
            return m16379e7;
        }
    };

    /* renamed from: z0 */
    private final C3841f f17355z0 = new C3841f();

    /* renamed from: A0 */
    private final C3840e f17318A0 = new C3840e();

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3836a {
        private C3836a() {
        }

        public /* synthetic */ C3836a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodCategoryActivity$b */
    /* loaded from: classes3.dex */
    public static final class C3837b extends AbstractC5869l implements InterfaceC5660l {
        C3837b() {
            super(1);
        }

        /* renamed from: a */
        public final void m16419a(C1328x c1328x) {
            C5236v1 c5236v1 = VodCategoryActivity.this.f17334Y;
            if (c5236v1 == null) {
                AbstractC5868k.m23686r("mCategoryAdapter");
                c5236v1 = null;
            }
            c5236v1.m21101u(VodCategoryActivity.this.f17350u0);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16419a((C1328x) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodCategoryActivity$c */
    /* loaded from: classes3.dex */
    public static final class C3838c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3838c f17357a = new C3838c();

        C3838c() {
            super(1);
        }

        /* renamed from: a */
        public final void m16420a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16420a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$d */
    /* loaded from: classes3.dex */
    public static final class HandlerC3839d extends Handler {
        HandlerC3839d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Integer num;
            AbstractC5868k.m23674f(message, "msg");
            int i10 = message.what;
            if (i10 == 10001) {
                ChildColumn childColumn = VodCategoryActivity.this.f17338i0;
                if (childColumn != null) {
                    num = Integer.valueOf(childColumn.getId());
                } else {
                    num = null;
                }
                if (num != null) {
                    VodCategoryActivity.this.f17323H = 0;
                    C6283u c6283u = (C6283u) VodCategoryActivity.this.m11977r5();
                    ChildColumn childColumn2 = VodCategoryActivity.this.f17338i0;
                    AbstractC5868k.m23671c(childColumn2);
                    c6283u.m24992Y3(childColumn2.getId(), 12, 1, 24);
                    return;
                }
                return;
            }
            if (i10 == 10002) {
                if (VodCategoryActivity.this.f17331V > 0 && VodCategoryActivity.this.f17331V <= VodCategoryActivity.this.f17329N) {
                    VodCategoryActivity vodCategoryActivity = VodCategoryActivity.this;
                    vodCategoryActivity.m16373Z6(vodCategoryActivity.f17331V);
                } else {
                    AbstractC7598p1.m29244h(VodCategoryActivity.this.m30049S4(), VodCategoryActivity.this.getString(R$string.tip_invalid_pro_number), new int[0]);
                }
                VodCategoryActivity.this.f17331V = 0;
                VodCategoryActivity vodCategoryActivity2 = VodCategoryActivity.this;
                int i11 = R$id.mTextInputNumber;
                ((TextView) vodCategoryActivity2.m16408C6(i11)).setText("");
                ((TextView) VodCategoryActivity.this.m16408C6(i11)).setVisibility(8);
            }
        }
    }

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$e */
    /* loaded from: classes3.dex */
    public static final class C3840e implements InterfaceC3056g {
        C3840e() {
        }

        @Override // com.open.leanback.widget.InterfaceC3056g
        /* renamed from: a */
        public void mo12571a(ViewGroup viewGroup, View view, int i10, long j10) {
            VodCategoryActivity.this.m16396p7(i10);
        }
    }

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$f */
    /* loaded from: classes3.dex */
    public static final class C3841f extends AbstractC3057h {
        C3841f() {
        }

        @Override // com.open.leanback.widget.AbstractC3057h
        /* renamed from: a */
        public void mo11995a(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
            int m16370V6 = VodCategoryActivity.this.m16370V6(i10 + 1);
            TextView textView = (TextView) VodCategoryActivity.this.m16408C6(R$id.mTextPage);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m16370V6);
            sb2.append('/');
            sb2.append(VodCategoryActivity.this.f17329N);
            textView.setText(sb2.toString());
        }
    }

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$g */
    /* loaded from: classes3.dex */
    static final class C3842g extends AbstractC5869l implements InterfaceC5660l {
        C3842g() {
            super(1);
        }

        /* renamed from: a */
        public final void m16421a(int i10) {
            ((VerticalGridView) VodCategoryActivity.this.m16408C6(R$id.mGridCategory)).setSelectedPosition(i10);
            VodCategoryActivity.this.m16396p7(i10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16421a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$h */
    /* loaded from: classes3.dex */
    static final class C3843h extends AbstractC5869l implements InterfaceC5660l {
        C3843h() {
            super(1);
        }

        /* renamed from: a */
        public final void m16422a(int i10) {
            ((VerticalGridView) VodCategoryActivity.this.m16408C6(R$id.mGridCategory)).setSelectedPosition(i10);
            VodCategoryActivity.this.m16396p7(i10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16422a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$i */
    /* loaded from: classes3.dex */
    static final class C3844i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3844i f17363a = new C3844i();

        C3844i() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(ChildColumn childColumn) {
            boolean m27723j;
            AbstractC5868k.m23674f(childColumn, "it");
            boolean z10 = true;
            m27723j = AbstractC7166t.m27723j("Todos", childColumn.getName(), true);
            if (!m27723j && !AbstractC5868k.m23669a("All", childColumn.getAlias())) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$j */
    /* loaded from: classes3.dex */
    static final class C3845j extends AbstractC5869l implements InterfaceC5660l {
        C3845j() {
            super(1);
        }

        /* renamed from: a */
        public final void m16424a(ChildColumn childColumn) {
            VodCategoryActivity.this.f17332W = childColumn.getId();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16424a((ChildColumn) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.VodCategoryActivity$k */
    /* loaded from: classes3.dex */
    static final class C3846k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3846k f17365a = new C3846k();

        C3846k() {
            super(1);
        }

        /* renamed from: a */
        public final void m16425a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16425a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodCategoryActivity$l */
    /* loaded from: classes3.dex */
    public static final class C3847l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3847l f17366a = new C3847l();

        C3847l() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "it");
            Intent putExtra = intent.putExtra("vod_type", "");
            AbstractC5868k.m23673e(putExtra, "it.putExtra(VodSearchActivity.KEY_VOD_TYPE, \"\")");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O6 */
    public static final boolean m16363O6(final VodCategoryActivity vodCategoryActivity, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        if (keyEvent.getKeyCode() == 19 && ((VerticalGridView) vodCategoryActivity.m16408C6(R$id.mGridProgram)).getSelectedPosition() < 6 && vodCategoryActivity.f17321F != 1) {
            if (keyEvent.getAction() == 0 && !vodCategoryActivity.f17324I) {
                vodCategoryActivity.f17324I = true;
                vodCategoryActivity.m16394o7();
                return true;
            }
            if (keyEvent.getAction() == 1) {
                vodCategoryActivity.f17324I = false;
            }
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 21 || (vodCategoryActivity.f17335Z.getItemCount() != 0 && ((VerticalGridView) vodCategoryActivity.m16408C6(R$id.mGridProgram)).getSelectedPosition() % 6 != 0)) {
            return false;
        }
        ((ImageView) vodCategoryActivity.m16408C6(R$id.mIvArrow)).setVisibility(8);
        int i10 = R$id.mVInterval;
        vodCategoryActivity.m16408C6(i10).setVisibility(0);
        AbstractC4509b.m18869b(vodCategoryActivity.f17320E, "isFilter  " + vodCategoryActivity.f17345p0, new Object[0]);
        if (!vodCategoryActivity.f17339j0 && vodCategoryActivity.f17345p0) {
            ((AutoLinearLayout) vodCategoryActivity.m16408C6(R$id.mLlFilter)).requestFocus();
        } else {
            vodCategoryActivity.m16408C6(i10).post(new Runnable() { // from class: sd.v0
                @Override // java.lang.Runnable
                public final void run() {
                    VodCategoryActivity.m16364P6(VodCategoryActivity.this);
                }
            });
            ((VerticalGridView) vodCategoryActivity.m16408C6(R$id.mGridCategory)).requestFocus();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P6 */
    public static final void m16364P6(VodCategoryActivity vodCategoryActivity) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        ((HorizontalScrollView) vodCategoryActivity.m16408C6(R$id.mScrollView)).scrollTo(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q6 */
    public static final void m16365Q6(VodCategoryActivity vodCategoryActivity) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        vodCategoryActivity.m16393n7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R6 */
    public static final void m16366R6(VodCategoryActivity vodCategoryActivity, View view) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        if (vodCategoryActivity.f17341l0) {
            vodCategoryActivity.m16402s7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S6 */
    public static final void m16367S6(VodCategoryActivity vodCategoryActivity, View view) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        C7589m1 c7589m1 = C7589m1.f27886a;
        c7589m1.m29146o(9);
        c7589m1.m29141j();
        c7589m1.m29121D();
        C7619y.f28056a.m29369b(vodCategoryActivity.m30049S4(), FilterActivity.class);
    }

    /* renamed from: T6 */
    private final String m16368T6(ChildColumn childColumn) {
        String str;
        String alias;
        if (childColumn != null) {
            str = childColumn.getAlias();
        } else {
            str = null;
        }
        if (AbstractC6567a.m25634d(str)) {
            if (childColumn == null || (alias = childColumn.getName()) == null) {
                return "";
            }
        } else if (childColumn == null || (alias = childColumn.getAlias()) == null) {
            return "";
        }
        return alias;
    }

    /* renamed from: U6 */
    private final void m16369U6() {
        if (!this.f12044B) {
            this.f17349t0 = getIntent().getIntExtra("extra_parent_column_id", -1);
            this.f17325J = getIntent().getIntExtra("extra_column_id", -1);
            String stringExtra = getIntent().getStringExtra("extra_column_code");
            String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f17326K = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("extra_column_name");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f17327L = stringExtra2;
            this.f17339j0 = getIntent().getBooleanExtra("extra_restrict", false);
            String stringExtra3 = getIntent().getStringExtra("extra_category_type");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.f17344o0 = stringExtra3;
            this.f17342m0 = getIntent().getIntExtra("extra_category_index", 0);
            String stringExtra4 = getIntent().getStringExtra("extra_play_entrance");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            this.f17343n0 = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("extra_category_selected_alias");
            if (stringExtra5 != null) {
                str = stringExtra5;
            }
            this.f17346q0 = str;
        }
        this.f17340k0 = AbstractC5868k.m23669a(this.f17344o0, C4300d.f18678a.m18055r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V6 */
    public final int m16370V6(int i10) {
        int i11 = i10 % 12;
        int i12 = i10 / 12;
        if (i11 != 0) {
            i12++;
        }
        return i12 + (this.f17321F - 1);
    }

    /* renamed from: X6 */
    private final int m16371X6(int i10) {
        int i11 = i10 % 12;
        int i12 = i10 / 12;
        if (i11 != 0) {
            return i12 + 1;
        }
        return i12;
    }

    /* renamed from: Y6 */
    private final String m16372Y6(ChildColumn childColumn) {
        String alias;
        if (AbstractC6567a.m25634d(this.f17343n0)) {
            if (childColumn == null || (alias = childColumn.getAlias()) == null) {
                return "";
            }
            return alias;
        }
        return this.f17343n0 + '/' + m16368T6(childColumn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z6 */
    public final void m16373Z6(int i10) {
        if (i10 >= this.f17321F && this.f17337h0.size() > (i10 - this.f17321F) * 12) {
            int i11 = R$id.mGridProgram;
            ((VerticalGridView) m16408C6(i11)).scrollToPosition((i10 - this.f17321F) * 12);
            ((VerticalGridView) m16408C6(i11)).setSelectedPositionSmooth((i10 - this.f17321F) * 12);
            return;
        }
        this.f17323H = 1;
        this.f17322G = i10;
        if (this.f17338i0 != null) {
            this.f17333X = true;
            C6283u c6283u = (C6283u) m11977r5();
            ChildColumn childColumn = this.f17338i0;
            AbstractC5868k.m23671c(childColumn);
            c6283u.m24992Y3(childColumn.getId(), 12, this.f17322G, 24);
        }
    }

    /* renamed from: a7 */
    private final void m16374a7(final List list) {
        Disposable disposable = this.f17351v0;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable compose = Observable.fromCallable(new Callable() { // from class: sd.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1328x m16375b7;
                m16375b7 = VodCategoryActivity.m16375b7(list, this);
                return m16375b7;
            }
        }).compose(AbstractC7029f.m27121b());
        final C3837b c3837b = new C3837b();
        Consumer consumer = new Consumer() { // from class: sd.z0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VodCategoryActivity.m16376c7(InterfaceC5660l.this, obj);
            }
        };
        final C3838c c3838c = C3838c.f17357a;
        this.f17351v0 = compose.subscribe(consumer, new Consumer() { // from class: sd.a1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VodCategoryActivity.m16377d7(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b7 */
    public static final C1328x m16375b7(List list, VodCategoryActivity vodCategoryActivity) {
        AbstractC5868k.m23674f(list, "$list");
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
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
                    vodCategoryActivity.f17350u0.put(Integer.valueOf(childColumn.getId()), new C4035f(m29105c, m29105c2, m29105c2));
                }
            }
        }
        return C1328x.f4998a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7 */
    public static final void m16376c7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d7 */
    public static final void m16377d7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e7 */
    public static final boolean m16379e7(final VodCategoryActivity vodCategoryActivity, KeyEvent keyEvent) {
        boolean z10;
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (keyEvent.getKeyCode() == 19 && ((VerticalGridView) vodCategoryActivity.m16408C6(R$id.mGridCategory)).getSelectedPosition() == 0) {
            if (vodCategoryActivity.f17339j0) {
                ((AutoLinearLayout) vodCategoryActivity.m16408C6(R$id.mLlSearch)).requestFocus();
            } else {
                ((AutoLinearLayout) vodCategoryActivity.m16408C6(R$id.mLlFilter)).requestFocus();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (keyEvent.getKeyCode() == 22) {
            int i10 = R$id.mIvArrow;
            ((ImageView) vodCategoryActivity.m16408C6(i10)).setVisibility(0);
            vodCategoryActivity.m16408C6(R$id.mVInterval).setVisibility(8);
            ((ImageView) vodCategoryActivity.m16408C6(i10)).post(new Runnable() { // from class: sd.b1
                @Override // java.lang.Runnable
                public final void run() {
                    VodCategoryActivity.m16380f7(VodCategoryActivity.this);
                }
            });
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f7 */
    public static final void m16380f7(VodCategoryActivity vodCategoryActivity) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        int i10 = R$id.mScrollView;
        ((HorizontalScrollView) vodCategoryActivity.m16408C6(i10)).smoothScrollTo(((HorizontalScrollView) vodCategoryActivity.m16408C6(i10)).getWidth(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7 */
    public static final boolean m16382g7(final VodCategoryActivity vodCategoryActivity, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        if (keyEvent.getAction() == 0) {
            if (i10 != 19) {
                if (i10 != 20) {
                    if (i10 == 22) {
                        int i11 = R$id.mIvArrow;
                        ((ImageView) vodCategoryActivity.m16408C6(i11)).setVisibility(0);
                        vodCategoryActivity.m16408C6(R$id.mVInterval).setVisibility(8);
                        if (!vodCategoryActivity.f17339j0 && view.getId() == R$id.mLlFilter) {
                            vodCategoryActivity.f17345p0 = true;
                            AbstractC4509b.m18869b(vodCategoryActivity.f17320E, "isFilter  " + vodCategoryActivity.f17345p0 + "   mSearchFilterKeyListener ", new Object[0]);
                        }
                        ((ImageView) vodCategoryActivity.m16408C6(i11)).post(new Runnable() { // from class: sd.w0
                            @Override // java.lang.Runnable
                            public final void run() {
                                VodCategoryActivity.m16384h7(VodCategoryActivity.this);
                            }
                        });
                    }
                } else if (!vodCategoryActivity.f17339j0 && view.getId() == R$id.mLlFilter) {
                    vodCategoryActivity.f17345p0 = false;
                    vodCategoryActivity.m16396p7(0);
                } else if (vodCategoryActivity.f17339j0 && view.getId() == R$id.mLlSearch) {
                    vodCategoryActivity.m16396p7(0);
                }
            } else if (!vodCategoryActivity.f17339j0 && view.getId() == R$id.mLlFilter) {
                vodCategoryActivity.f17345p0 = false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h7 */
    public static final void m16384h7(VodCategoryActivity vodCategoryActivity) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        int i10 = R$id.mScrollView;
        ((HorizontalScrollView) vodCategoryActivity.m16408C6(i10)).smoothScrollTo(((HorizontalScrollView) vodCategoryActivity.m16408C6(i10)).getWidth(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7 */
    public static final boolean m16386i7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j7 */
    public static final void m16388j7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7 */
    public static final void m16389k7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7 */
    public static final void m16391l7(VodCategoryActivity vodCategoryActivity, List list) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        if (vodCategoryActivity.f17332W == -1) {
            vodCategoryActivity.f17332W = ((ChildColumn) ((ArrayList) list).get(0)).getId();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7 */
    public static final boolean m16392m7(VodCategoryActivity vodCategoryActivity) {
        AbstractC5868k.m23674f(vodCategoryActivity, "this$0");
        int i10 = R$id.mGridProgram;
        int selectedPosition = ((VerticalGridView) vodCategoryActivity.m16408C6(i10)).getSelectedPosition();
        if (selectedPosition < 6) {
            return false;
        }
        ((VerticalGridView) vodCategoryActivity.m16408C6(i10)).setSelectedPositionSmooth(selectedPosition - 6);
        return false;
    }

    /* renamed from: n7 */
    private final void m16393n7() {
        int m16370V6 = m16370V6(this.f17337h0.size());
        this.f17328M = m16370V6;
        int i10 = this.f17330O;
        int i11 = this.f17329N - 1;
        boolean z10 = false;
        if (i10 <= m16370V6 && m16370V6 <= i11) {
            z10 = true;
        }
        if (z10) {
            this.f17323H = 2;
            this.f17330O = m16370V6 + 1;
            if (this.f17338i0 != null) {
                C6283u c6283u = (C6283u) m11977r5();
                ChildColumn childColumn = this.f17338i0;
                AbstractC5868k.m23671c(childColumn);
                c6283u.m24992Y3(childColumn.getId(), 12, this.f17330O, 24);
            }
        }
    }

    /* renamed from: o7 */
    private final void m16394o7() {
        int i10 = this.f17321F;
        int i11 = i10 - 2;
        this.f17322G = i11;
        if (i11 < 1) {
            this.f17322G = 1;
        }
        int i12 = (i10 - this.f17322G) * 12;
        this.f17323H = 3;
        if (this.f17338i0 != null) {
            C6283u c6283u = (C6283u) m11977r5();
            ChildColumn childColumn = this.f17338i0;
            AbstractC5868k.m23671c(childColumn);
            c6283u.m24992Y3(childColumn.getId(), 12, this.f17322G, Integer.valueOf(i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p7 */
    public final void m16396p7(int i10) {
        String str;
        String str2;
        String str3;
        if (i10 >= this.f17336g0.size()) {
            return;
        }
        this.f17338i0 = (ChildColumn) this.f17336g0.get(i10);
        TextView textView = (TextView) m16408C6(R$id.mTextTitle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17347r0);
        sb2.append(" > ");
        ChildColumn childColumn = this.f17338i0;
        List<PosterList> list = null;
        if (childColumn != null) {
            str = childColumn.getName();
        } else {
            str = null;
        }
        ChildColumn childColumn2 = this.f17338i0;
        if (childColumn2 != null) {
            str2 = childColumn2.getAlias();
        } else {
            str2 = null;
        }
        sb2.append(AbstractC5091h.m20660c(str, str2));
        textView.setText(sb2.toString());
        C7594o0 c7594o0 = C7594o0.f27942a;
        ChildColumn childColumn3 = this.f17338i0;
        if (childColumn3 != null) {
            list = childColumn3.getPosterList();
        }
        C7594o0.a aVar = C7594o0.a.Background;
        String m29220i = c7594o0.m29220i(list, aVar);
        if (TextUtils.isEmpty(m29220i)) {
            str3 = c7594o0.m29220i(this.f17348s0, aVar);
        } else {
            str3 = m29220i;
        }
        VodCategoryRootView vodCategoryRootView = (VodCategoryRootView) m16408C6(R$id.rlContent);
        AbstractC5868k.m23673e(vodCategoryRootView, "rlContent");
        C7594o0.m29194K(c7594o0, this, str3, vodCategoryRootView, AbstractC7026c.m27111a(this, R$color.color_0b0b0b), null, null, 0, 112, null);
        this.f17337h0.clear();
        this.f17335Z.m28847d();
        this.f17335Z.m20977C(m16372Y6((ChildColumn) this.f17336g0.get(i10)), ((ChildColumn) this.f17336g0.get(i10)).getId());
        m16398q7();
        if (this.f17341l0) {
            ((C6283u) m11977r5()).m24988F3();
            this.f17352w0.removeMessages(10001);
            this.f17352w0.sendEmptyMessageDelayed(10001, 100L);
        }
    }

    /* renamed from: q7 */
    private final void m16398q7() {
        this.f17328M = 1;
        this.f17330O = 1;
        this.f17321F = 1;
        this.f17323H = 0;
        this.f17329N = 0;
        ((TextView) m16408C6(R$id.mTextTotal)).setText("");
        ((TextView) m16408C6(R$id.mTextPage)).setText("");
        this.f17335Z.m20979E(0);
    }

    /* renamed from: r7 */
    private final void m16400r7(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (AbstractC5868k.m23669a(this.f17326K, ((ChildColumn) arrayList.get(i10)).getCode())) {
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
            Object remove = arrayList.remove(i10);
            AbstractC5868k.m23673e(remove, "list.removeAt(index)");
            arrayList.add(0, (ChildColumn) remove);
        }
    }

    /* renamed from: s7 */
    private final void m16402s7() {
        C7589m1 c7589m1 = C7589m1.f27886a;
        c7589m1.m29146o(10);
        if (this.f17339j0) {
            C7619y.f28056a.m29369b(m30049S4(), RestrictLevelSearchActivity.class);
        } else {
            c7589m1.m29146o(7);
            C7619y.m29367d(C7619y.f28056a, m30049S4(), VodSearchActivity.class, null, C3847l.f17366a, 2, null);
        }
    }

    /* renamed from: C6 */
    public View m16408C6(int i10) {
        Map map = this.f17319B0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: F */
    public void mo16409F() {
        ((LoadingView) m16408C6(R$id.mLoadingView)).setVisibility(8);
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: H */
    public void mo16410H() {
        Disposable disposable = this.f17351v0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: P */
    public void mo16411P(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f17333X = false;
        this.f17330O = this.f17328M;
        AbstractActivityC2972a.m11957W5(this, str, true, null, null, null, null, null, 124, null);
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: Q */
    public void mo16412Q(RecommendColumnContentDataBean recommendColumnContentDataBean) {
        AbstractC5868k.m23674f(recommendColumnContentDataBean, "bean");
        this.f17347r0 = recommendColumnContentDataBean.getFirstLevelColumnName();
        this.f17348s0 = recommendColumnContentDataBean.getParentPosterList();
        final List<ChildColumn> columnList = recommendColumnContentDataBean.getColumnList();
        AbstractC5868k.m23672d(columnList, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.ChildColumn>{ kotlin.collections.TypeAliasesKt.ArrayList<com.request.result.ChildColumn> }");
        ArrayList arrayList = (ArrayList) columnList;
        this.f17336g0 = arrayList;
        if (this.f17340k0) {
            m16400r7(arrayList);
        }
        int i10 = 0;
        int i11 = 0;
        for (Object obj : columnList) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            if (AbstractC5868k.m23669a(((ChildColumn) obj).getAlias(), this.f17346q0)) {
                i11 = i10;
            }
            i10 = i12;
        }
        C5236v1 c5236v1 = new C5236v1();
        this.f17334Y = c5236v1;
        c5236v1.m28854l(AbstractC5882y.m23702b(columnList));
        C5236v1 c5236v12 = this.f17334Y;
        C5236v1 c5236v13 = null;
        if (c5236v12 == null) {
            AbstractC5868k.m23686r("mCategoryAdapter");
            c5236v12 = null;
        }
        c5236v12.m21102v(new C3843h());
        int i13 = R$id.mGridCategory;
        VerticalGridView verticalGridView = (VerticalGridView) m16408C6(i13);
        C5236v1 c5236v14 = this.f17334Y;
        if (c5236v14 == null) {
            AbstractC5868k.m23686r("mCategoryAdapter");
        } else {
            c5236v13 = c5236v14;
        }
        verticalGridView.setAdapter(c5236v13);
        if (i11 != 0) {
            ((VerticalGridView) m16408C6(i13)).setSelectedPosition(i11);
        }
        ((VerticalGridView) m16408C6(i13)).requestFocus();
        Observable fromIterable = Observable.fromIterable(columnList);
        final C3844i c3844i = C3844i.f17363a;
        Observable compose = fromIterable.filter(new Predicate() { // from class: sd.h1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj2) {
                boolean m16386i7;
                m16386i7 = VodCategoryActivity.m16386i7(InterfaceC5660l.this, obj2);
                return m16386i7;
            }
        }).take(1L).compose(AbstractC7029f.m27120a());
        final C3845j c3845j = new C3845j();
        Consumer consumer = new Consumer() { // from class: sd.i1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                VodCategoryActivity.m16388j7(InterfaceC5660l.this, obj2);
            }
        };
        final C3846k c3846k = C3846k.f17365a;
        compose.subscribe(consumer, new Consumer() { // from class: sd.j1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                VodCategoryActivity.m16389k7(InterfaceC5660l.this, obj2);
            }
        }, new Action() { // from class: sd.k1
            @Override // io.reactivex.functions.Action
            public final void run() {
                VodCategoryActivity.m16391l7(VodCategoryActivity.this, columnList);
            }
        });
        m16374a7(columnList);
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: Q0 */
    public void mo16413Q0(int i10) {
        this.f17325J = i10;
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: T */
    public void mo16414T(String str, boolean z10) {
        ArrayList m6984c;
        AbstractC5868k.m23674f(str, "errCode");
        if (z10) {
            ChildColumn childColumn = new ChildColumn();
            childColumn.setId(this.f17325J);
            childColumn.setName(this.f17327L);
            childColumn.setAlias(this.f17327L);
            m6984c = AbstractC1500l.m6984c(childColumn);
            this.f17336g0 = m6984c;
            C5236v1 c5236v1 = new C5236v1();
            this.f17334Y = c5236v1;
            c5236v1.m28856n(this.f17336g0);
            C5236v1 c5236v12 = this.f17334Y;
            C5236v1 c5236v13 = null;
            if (c5236v12 == null) {
                AbstractC5868k.m23686r("mCategoryAdapter");
                c5236v12 = null;
            }
            c5236v12.m21102v(new C3842g());
            int i10 = R$id.mGridCategory;
            VerticalGridView verticalGridView = (VerticalGridView) m16408C6(i10);
            C5236v1 c5236v14 = this.f17334Y;
            if (c5236v14 == null) {
                AbstractC5868k.m23686r("mCategoryAdapter");
            } else {
                c5236v13 = c5236v14;
            }
            verticalGridView.setAdapter(c5236v13);
            ((VerticalGridView) m16408C6(i10)).requestFocus();
            this.f17332W = this.f17325J;
            return;
        }
        AbstractActivityC2972a.m11957W5(this, str, true, null, null, null, null, null, 124, null);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: W6, reason: merged with bridge method [inline-methods] */
    public C6283u mo7516s5() {
        return new C6283u(this, this);
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: X */
    public void mo16416X(GetShelveResult getShelveResult, int i10) {
        AbstractC5868k.m23674f(getShelveResult, "getShelveDataResult");
        if (!AbstractC6567a.m25635e(getShelveResult.getData().getAssetList())) {
            int i11 = this.f17323H;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f17321F = 1;
                        List<AssetList> assetList = getShelveResult.getData().getAssetList();
                        AbstractC5868k.m23671c(assetList);
                        ArrayList arrayList = (ArrayList) assetList;
                        this.f17337h0 = arrayList;
                        this.f17335Z.m28856n(arrayList);
                        int assetListTotalSize = getShelveResult.getData().getAssetListTotalSize();
                        this.f17335Z.m20979E(assetListTotalSize);
                        this.f17329N = m16371X6(assetListTotalSize);
                        TextView textView = (TextView) m16408C6(R$id.mTextTotal);
                        C5881x c5881x = C5881x.f23415a;
                        String string = getString(R$string.total, Integer.valueOf(assetListTotalSize));
                        AbstractC5868k.m23673e(string, "getString(R.string.total, totalSize)");
                        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                        AbstractC5868k.m23673e(format, "format(format, *args)");
                        textView.setText(format);
                        TextView textView2 = (TextView) m16408C6(R$id.mTextPage);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f17328M);
                        sb2.append('/');
                        sb2.append(this.f17329N);
                        textView2.setText(sb2.toString());
                    } else {
                        this.f17324I = false;
                        this.f17321F = this.f17322G;
                        ArrayList arrayList2 = this.f17337h0;
                        List<AssetList> assetList2 = getShelveResult.getData().getAssetList();
                        AbstractC5868k.m23672d(assetList2, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.AssetList>");
                        arrayList2.addAll(0, (ArrayList) assetList2);
                        C5197l2 c5197l2 = this.f17335Z;
                        List<AssetList> assetList3 = getShelveResult.getData().getAssetList();
                        AbstractC5868k.m23671c(assetList3);
                        c5197l2.notifyItemRangeInserted(0, assetList3.size());
                        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: sd.x0
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                boolean m16392m7;
                                m16392m7 = VodCategoryActivity.m16392m7(VodCategoryActivity.this);
                                return m16392m7;
                            }
                        });
                    }
                } else {
                    ArrayList arrayList3 = this.f17337h0;
                    List<AssetList> assetList4 = getShelveResult.getData().getAssetList();
                    AbstractC5868k.m23672d(assetList4, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.AssetList>");
                    arrayList3.addAll((ArrayList) assetList4);
                    C5197l2 c5197l22 = this.f17335Z;
                    int size = this.f17337h0.size();
                    List<AssetList> assetList5 = getShelveResult.getData().getAssetList();
                    AbstractC5868k.m23671c(assetList5);
                    c5197l22.notifyItemRangeChanged((size - assetList5.size()) - 1, this.f17337h0.size());
                }
            } else {
                this.f17321F = this.f17322G;
                this.f17337h0.clear();
                ArrayList arrayList4 = this.f17337h0;
                List<AssetList> assetList6 = getShelveResult.getData().getAssetList();
                AbstractC5868k.m23672d(assetList6, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.AssetList>");
                arrayList4.addAll((ArrayList) assetList6);
                this.f17335Z.notifyDataSetChanged();
                TextView textView3 = (TextView) m16408C6(R$id.mTextPage);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f17321F);
                sb3.append('/');
                sb3.append(this.f17329N);
                textView3.setText(sb3.toString());
                int i12 = R$id.mGridProgram;
                ((VerticalGridView) m16408C6(i12)).scrollToPosition(0);
                ((VerticalGridView) m16408C6(i12)).setSelectedPositionSmooth(0);
            }
            int m16370V6 = m16370V6(this.f17337h0.size());
            this.f17328M = m16370V6;
            this.f17330O = m16370V6;
            return;
        }
        if (this.f17337h0.size() == 0) {
            this.f17337h0.clear();
            this.f17335Z.m28847d();
            this.f17335Z.m20979E(0);
            m16398q7();
        }
        int m16370V62 = m16370V6(this.f17337h0.size());
        this.f17328M = m16370V62;
        this.f17330O = m16370V62;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        AbstractC7028e.m27119e(6, "g");
        m16369U6();
        ((VodCategoryRootView) m16408C6(R$id.rlContent)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        if (this.f17339j0) {
            ((ViewStub) m16408C6(R$id.mVsBlSearch)).inflate();
            ((TextView) m16408C6(R$id.mTvAdultTips)).setVisibility(0);
        } else {
            ((ViewStub) m16408C6(R$id.mVsNormalSearch)).inflate();
            ((TextView) m16408C6(R$id.mTvAdultTips)).setVisibility(8);
        }
        int i10 = R$id.mLlSearch;
        ((AutoLinearLayout) m16408C6(i10)).setOnKeyListener(this.f17353x0);
        int i11 = R$id.mGridCategory;
        VerticalGridView verticalGridView = (VerticalGridView) m16408C6(i11);
        AbstractC5868k.m23673e(verticalGridView, "mGridCategory");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        int i12 = R$id.mGridProgram;
        VerticalGridView verticalGridView2 = (VerticalGridView) m16408C6(i12);
        AbstractC5868k.m23673e(verticalGridView2, "mGridProgram");
        AbstractC7555b0.m28958l(verticalGridView2, true, false, null, 6, null);
        ((VerticalGridView) m16408C6(i11)).setOnKeyInterceptListener(this.f17354y0);
        ((VerticalGridView) m16408C6(i12)).setOnChildViewHolderSelectedListener(this.f17355z0);
        ((VerticalGridView) m16408C6(i11)).setOnChildSelectedListener(this.f17318A0);
        AbstractC7568f1.m28999a((VerticalGridView) m16408C6(i12));
        ((VerticalGridView) m16408C6(i12)).setOnKeyInterceptListener(new AbstractC3050a.c() { // from class: sd.u0
            @Override // com.open.leanback.widget.AbstractC3050a.c
            /* renamed from: a */
            public final boolean mo12521a(KeyEvent keyEvent) {
                boolean m16363O6;
                m16363O6 = VodCategoryActivity.m16363O6(VodCategoryActivity.this, keyEvent);
                return m16363O6;
            }
        });
        ((VerticalGridView) m16408C6(i12)).setAdapter(this.f17335Z);
        ((VerticalGridView) m16408C6(i12)).setWindowAlignmentOffsetPercent(25.0f);
        this.f17335Z.m20981I(this.f17344o0);
        this.f17335Z.m20978D(this.f17340k0);
        this.f17335Z.m20980F(this.f17339j0);
        ((VerticalGridView) m16408C6(i12)).setOnLoadMoreListener(new AbstractC3050a.d() { // from class: sd.c1
            @Override // com.open.leanback.widget.AbstractC3050a.d
            public final void onLoadMore() {
                VodCategoryActivity.m16365Q6(VodCategoryActivity.this);
            }
        });
        ((AutoLinearLayout) m16408C6(i10)).setOnClickListener(new View.OnClickListener() { // from class: sd.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodCategoryActivity.m16366R6(VodCategoryActivity.this, view);
            }
        });
        if (!this.f17339j0) {
            int i13 = R$id.mLlFilter;
            ((AutoLinearLayout) m16408C6(i13)).setOnKeyListener(this.f17353x0);
            ((AutoLinearLayout) m16408C6(i13)).setOnClickListener(new View.OnClickListener() { // from class: sd.e1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VodCategoryActivity.m16367S6(VodCategoryActivity.this, view);
                }
            });
        }
        AbstractC7028e.m27119e(7, C3325bt.f14195aM);
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: h */
    public void mo16417h() {
        if (this.f17325J > 0) {
            ((C6283u) m11977r5()).m24990J3(Integer.valueOf(this.f17325J), null, 1);
        } else {
            ((C6283u) m11977r5()).m24991W3(Integer.valueOf(this.f17349t0), null, 1, this.f17326K);
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('d');
        sb2.append(i10);
        AbstractC7028e.m27119e(3, sb2.toString());
        if (((VerticalGridView) m16408C6(R$id.mGridProgram)).getFocusedChild() != null) {
            switch (i10) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    this.f17331V = (this.f17331V * 10) + (i10 - 7);
                    int i11 = R$id.mTextInputNumber;
                    ((TextView) m16408C6(i11)).setVisibility(0);
                    ((TextView) m16408C6(i11)).setText(String.valueOf(this.f17331V));
                    this.f17352w0.removeMessages(10002);
                    this.f17352w0.sendEmptyMessageDelayed(10002, 3000L);
                    break;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        AbstractC7028e.m27119e(5, "f");
        super.setContentView(i10);
    }

    @Override // p253nd.InterfaceC5853m
    /* renamed from: x */
    public void mo16418x() {
        ((LoadingView) m16408C6(R$id.mLoadingView)).setVisibility(0);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_vodcategory;
    }
}
