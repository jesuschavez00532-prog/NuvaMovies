package com.vod.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.open.leanback.widget.AbstractC3050a;
import com.open.leanback.widget.AbstractC3057h;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.AssetList;
import com.request.result.ChildColumn;
import com.request.result.GetShelveResult;
import com.request.result.PosterList;
import com.request.result.RecommendColumnContentDataBean;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
import com.vod.R$string;
import com.vod.ui.activity.KidsCategoryActivity;
import com.widget.recyclerView.LinearLayoutManagerTV;
import com.widget.recyclerView.RecyclerViewTV;
import com.zhy.autolayout.AutoLinearLayout;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5665q;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import ne.C5876s;
import p043ce.AbstractC1500l;
import p201k2.AbstractC5091h;
import p212kd.C5165d2;
import p212kd.C5181h2;
import p253nd.InterfaceC5846f;
import p289pd.C6274l;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7598p1;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7619y;

/* loaded from: classes3.dex */
public final class KidsCategoryActivity extends AbstractActivityC2972a implements InterfaceC5846f {

    /* renamed from: s0 */
    public static final C3809a f17235s0 = new C3809a(null);

    /* renamed from: H */
    private int f17239H;

    /* renamed from: I */
    private boolean f17240I;

    /* renamed from: J */
    private boolean f17241J;

    /* renamed from: V */
    private ChildColumn f17247V;

    /* renamed from: W */
    private View f17248W;

    /* renamed from: Z */
    private int f17251Z;

    /* renamed from: h0 */
    private int f17253h0;

    /* renamed from: i0 */
    private boolean f17254i0;

    /* renamed from: j0 */
    private ArrayList f17255j0;

    /* renamed from: l0 */
    private String f17257l0;

    /* renamed from: m0 */
    private List f17258m0;

    /* renamed from: n0 */
    private final InterfaceC1312h f17259n0;

    /* renamed from: o0 */
    private final InterfaceC1312h f17260o0;

    /* renamed from: p0 */
    private final HandlerC3811c f17261p0;

    /* renamed from: q0 */
    private final C3812d f17262q0;

    /* renamed from: r0 */
    public Map f17263r0 = new LinkedHashMap();

    /* renamed from: E */
    private final String f17236E = "KidsCategoryActivity";

    /* renamed from: F */
    private int f17237F = 1;

    /* renamed from: G */
    private int f17238G = 1;

    /* renamed from: K */
    private int f17242K = -1;

    /* renamed from: L */
    private String f17243L = "";

    /* renamed from: M */
    private String f17244M = "";

    /* renamed from: N */
    private String f17245N = "";

    /* renamed from: O */
    private int f17246O = -1;

    /* renamed from: X */
    private boolean f17249X = true;

    /* renamed from: Y */
    private int f17250Y = 1;

    /* renamed from: g0 */
    private int f17252g0 = 1;

    /* renamed from: k0 */
    private String f17256k0 = "";

    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3809a {

        /* renamed from: com.vod.ui.activity.KidsCategoryActivity$a$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ Intent f17264a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Intent intent) {
                super(1);
                this.f17264a = intent;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "it");
                return this.f17264a;
            }
        }

        private C3809a() {
        }

        public /* synthetic */ C3809a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m16269a(Context context, int i10, String str, String str2, String str3, List list, String str4) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(str, "columnName");
            AbstractC5868k.m23674f(str2, "type");
            AbstractC5868k.m23674f(str3, "playEntrance");
            AbstractC5868k.m23674f(str4, "columnAlias");
            Intent intent = new Intent(context, (Class<?>) KidsCategoryActivity.class);
            intent.putExtra("extra_column_id", i10);
            intent.putExtra("extra_column_name", str);
            intent.putExtra("extra_category_type", str2);
            intent.putExtra("extra_play_entrance", str3);
            intent.putExtra("extra_category_selected_alias", str4);
            if (list != null) {
                intent.putExtra("extra_column_poster", (ArrayList) list);
            }
            intent.setFlags(262144);
            C7619y.m29367d(C7619y.f28056a, context, KidsCategoryActivity.class, null, new a(intent), 2, null);
        }
    }

    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$b */
    /* loaded from: classes3.dex */
    static final class C3810b extends AbstractC5869l implements InterfaceC5642a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.vod.ui.activity.KidsCategoryActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ KidsCategoryActivity f17266a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(KidsCategoryActivity kidsCategoryActivity) {
                super(1);
                this.f17266a = kidsCategoryActivity;
            }

            /* renamed from: a */
            public final void m16272a(ChildColumn childColumn) {
                AbstractC5868k.m23674f(childColumn, "it");
                if (this.f17266a.f17249X) {
                    this.f17266a.m16237f7(childColumn);
                } else {
                    this.f17266a.f17249X = true;
                }
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m16272a((ChildColumn) obj);
                return C1328x.f4998a;
            }
        }

        C3810b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5165d2 invoke() {
            C5165d2 c5165d2 = new C5165d2();
            c5165d2.setHasStableIds(true);
            c5165d2.m20858y(new a(KidsCategoryActivity.this));
            return c5165d2;
        }
    }

    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$c */
    /* loaded from: classes3.dex */
    public static final class HandlerC3811c extends Handler {
        HandlerC3811c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Integer num;
            AbstractC5868k.m23674f(message, "msg");
            int i10 = message.what;
            if (i10 == 10001) {
                ChildColumn childColumn = KidsCategoryActivity.this.f17247V;
                if (childColumn != null) {
                    num = Integer.valueOf(childColumn.getId());
                } else {
                    num = null;
                }
                if (num != null) {
                    KidsCategoryActivity.this.f17239H = 0;
                    C6274l c6274l = (C6274l) KidsCategoryActivity.this.m11977r5();
                    ChildColumn childColumn2 = KidsCategoryActivity.this.f17247V;
                    AbstractC5868k.m23671c(childColumn2);
                    c6274l.m24949O3(childColumn2.getId(), 8, 1, 24);
                    return;
                }
                return;
            }
            if (i10 == 10002) {
                if (KidsCategoryActivity.this.f17253h0 > 0 && KidsCategoryActivity.this.f17253h0 <= KidsCategoryActivity.this.f17251Z) {
                    KidsCategoryActivity kidsCategoryActivity = KidsCategoryActivity.this;
                    kidsCategoryActivity.m16225U6(kidsCategoryActivity.f17253h0);
                } else {
                    AbstractC7598p1.m29244h(KidsCategoryActivity.this.m30049S4(), KidsCategoryActivity.this.getString(R$string.tip_invalid_pro_number), new int[0]);
                }
                KidsCategoryActivity.this.f17253h0 = 0;
                KidsCategoryActivity kidsCategoryActivity2 = KidsCategoryActivity.this;
                int i11 = R$id.mTextInputNumber;
                ((TextView) kidsCategoryActivity2.m16268z6(i11)).setText("");
                ((TextView) KidsCategoryActivity.this.m16268z6(i11)).setVisibility(8);
                return;
            }
            if (i10 == 10003) {
                KidsCategoryActivity.this.f17241J = false;
            }
        }
    }

    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$d */
    /* loaded from: classes3.dex */
    public static final class C3812d extends AbstractC3057h {
        C3812d() {
        }

        @Override // com.open.leanback.widget.AbstractC3057h
        /* renamed from: a */
        public void mo11995a(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
            int m16221P6 = KidsCategoryActivity.this.m16221P6(i10 + 1);
            TextView textView = (TextView) KidsCategoryActivity.this.m16268z6(R$id.mTextPage);
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(m16221P6);
            sb2.append('/');
            sb2.append(KidsCategoryActivity.this.f17251Z);
            sb2.append(')');
            textView.setText(sb2.toString());
        }
    }

    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$e */
    /* loaded from: classes3.dex */
    static final class C3813e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3813e f17269a = new C3813e();

        C3813e() {
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

    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$f */
    /* loaded from: classes3.dex */
    static final class C3814f extends AbstractC5869l implements InterfaceC5660l {
        C3814f() {
            super(1);
        }

        /* renamed from: a */
        public final void m16274a(ChildColumn childColumn) {
            KidsCategoryActivity.this.f17246O = childColumn.getId();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16274a((ChildColumn) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$g */
    /* loaded from: classes3.dex */
    static final class C3815g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3815g f17271a = new C3815g();

        C3815g() {
            super(1);
        }

        /* renamed from: a */
        public final void m16275a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16275a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$h */
    /* loaded from: classes3.dex */
    public static final class C3816h extends AbstractC5869l implements InterfaceC5665q {
        C3816h() {
            super(3);
        }

        /* renamed from: a */
        public final void m16276a(int i10, ChildColumn childColumn, boolean z10) {
            AbstractC5868k.m23674f(childColumn, "bean");
            if (z10) {
                if (KidsCategoryActivity.this.f17249X) {
                    KidsCategoryActivity.this.m16237f7(childColumn);
                } else {
                    KidsCategoryActivity.this.f17249X = true;
                }
            }
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m16276a(((Number) obj).intValue(), (ChildColumn) obj2, ((Boolean) obj3).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$i */
    /* loaded from: classes3.dex */
    public static final class C3817i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3817i f17273a = new C3817i();

        C3817i() {
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

    /* renamed from: com.vod.ui.activity.KidsCategoryActivity$j */
    /* loaded from: classes3.dex */
    static final class C3818j extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3818j f17274a = new C3818j();

        C3818j() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5181h2 invoke() {
            return new C5181h2();
        }
    }

    public KidsCategoryActivity() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(new C3810b());
        this.f17259n0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(C3818j.f17274a);
        this.f17260o0 = m5965b2;
        this.f17261p0 = new HandlerC3811c(Looper.getMainLooper());
        this.f17262q0 = new C3812d();
    }

    /* renamed from: M6 */
    private final C5165d2 m16218M6() {
        return (C5165d2) this.f17259n0.getValue();
    }

    /* renamed from: N6 */
    private final String m16219N6(ChildColumn childColumn) {
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

    /* renamed from: O6 */
    private final void m16220O6() {
        ArrayList arrayList;
        this.f17242K = getIntent().getIntExtra("extra_column_id", -1);
        String stringExtra = getIntent().getStringExtra("extra_column_name");
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f17243L = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("extra_category_type");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f17244M = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("extra_play_entrance");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f17245N = stringExtra3;
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_column_poster");
        if (serializableExtra instanceof ArrayList) {
            arrayList = (ArrayList) serializableExtra;
        } else {
            arrayList = null;
        }
        this.f17255j0 = arrayList;
        String stringExtra4 = getIntent().getStringExtra("extra_category_selected_alias");
        if (stringExtra4 != null) {
            str = stringExtra4;
        }
        this.f17256k0 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P6 */
    public final int m16221P6(int i10) {
        int i11 = i10 % 8;
        int i12 = i10 / 8;
        if (i11 != 0) {
            i12++;
        }
        return i12 + (this.f17237F - 1);
    }

    /* renamed from: R6 */
    private final int m16222R6(int i10) {
        int i11 = i10 % 8;
        int i12 = i10 / 8;
        if (i11 != 0) {
            return i12 + 1;
        }
        return i12;
    }

    /* renamed from: S6 */
    private final C5181h2 m16223S6() {
        return (C5181h2) this.f17260o0.getValue();
    }

    /* renamed from: T6 */
    private final String m16224T6(ChildColumn childColumn) {
        String alias;
        if (AbstractC6567a.m25634d(this.f17245N)) {
            if (childColumn == null || (alias = childColumn.getAlias()) == null) {
                return "";
            }
            return alias;
        }
        return this.f17245N + '/' + m16219N6(childColumn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U6 */
    public final void m16225U6(int i10) {
        if (i10 >= this.f17237F && m16223S6().m28848f().size() > (i10 - this.f17237F) * 8) {
            int i11 = R$id.mGridProgram;
            ((VerticalGridView) m16268z6(i11)).scrollToPosition((i10 - this.f17237F) * 8);
            ((VerticalGridView) m16268z6(i11)).setSelectedPositionSmooth((i10 - this.f17237F) * 8);
            return;
        }
        this.f17239H = 1;
        this.f17238G = i10;
        if (this.f17247V != null) {
            this.f17254i0 = true;
            C6274l c6274l = (C6274l) m11977r5();
            ChildColumn childColumn = this.f17247V;
            AbstractC5868k.m23671c(childColumn);
            c6274l.m24949O3(childColumn.getId(), 8, this.f17238G, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V6 */
    public static final void m16226V6(KidsCategoryActivity kidsCategoryActivity) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        ((RecyclerViewTV) kidsCategoryActivity.m16268z6(R$id.mGridCategory)).requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W6 */
    public static final void m16227W6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X6 */
    public static final void m16228X6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y6 */
    public static final void m16229Y6(KidsCategoryActivity kidsCategoryActivity, List list) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        if (kidsCategoryActivity.f17246O == -1) {
            kidsCategoryActivity.f17246O = ((ChildColumn) list.get(0)).getId();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z6 */
    public static final void m16230Z6(KidsCategoryActivity kidsCategoryActivity, C5876s c5876s) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        AbstractC5868k.m23674f(c5876s, "$needSelectIndex");
        int childCount = ((RecyclerViewTV) kidsCategoryActivity.m16268z6(R$id.mGridCategory)).getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            int i11 = R$id.mGridCategory;
            View childAt = ((RecyclerViewTV) kidsCategoryActivity.m16268z6(i11)).getChildAt(i10);
            if (childAt != null && ((RecyclerViewTV) kidsCategoryActivity.m16268z6(i11)).getChildAdapterPosition(childAt) == c5876s.f23410a) {
                childAt.requestFocus();
                ((AutoLinearLayout) kidsCategoryActivity.m16268z6(R$id.llContent)).setFocusable(false);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7 */
    public static final void m16231a7(KidsCategoryActivity kidsCategoryActivity) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        ((RecyclerViewTV) kidsCategoryActivity.m16268z6(R$id.mGridCategory)).requestFocus();
        ((AutoLinearLayout) kidsCategoryActivity.m16268z6(R$id.llContent)).setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b7 */
    public static final boolean m16232b7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7 */
    public static final boolean m16233c7(KidsCategoryActivity kidsCategoryActivity) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        int i10 = R$id.mGridProgram;
        int selectedPosition = ((VerticalGridView) kidsCategoryActivity.m16268z6(i10)).getSelectedPosition();
        if (selectedPosition < 4) {
            return false;
        }
        ((VerticalGridView) kidsCategoryActivity.m16268z6(i10)).setSelectedPositionSmooth(selectedPosition - 4);
        return false;
    }

    /* renamed from: d7 */
    private final void m16234d7() {
        int m16221P6 = m16221P6(m16223S6().m28848f().size());
        this.f17250Y = m16221P6;
        int i10 = this.f17252g0;
        int i11 = this.f17251Z - 1;
        boolean z10 = false;
        if (i10 <= m16221P6 && m16221P6 <= i11) {
            z10 = true;
        }
        if (z10) {
            this.f17239H = 2;
            this.f17252g0 = m16221P6 + 1;
            if (this.f17247V != null) {
                C6274l c6274l = (C6274l) m11977r5();
                ChildColumn childColumn = this.f17247V;
                AbstractC5868k.m23671c(childColumn);
                c6274l.m24949O3(childColumn.getId(), 8, this.f17252g0, 24);
            }
        }
    }

    /* renamed from: e7 */
    private final void m16236e7() {
        int i10 = this.f17237F;
        int i11 = i10 - 3;
        this.f17238G = i11;
        if (i11 < 1) {
            this.f17238G = 1;
        }
        int i12 = (i10 - this.f17238G) * 8;
        this.f17239H = 3;
        if (this.f17247V != null) {
            C6274l c6274l = (C6274l) m11977r5();
            ChildColumn childColumn = this.f17247V;
            AbstractC5868k.m23671c(childColumn);
            c6274l.m24949O3(childColumn.getId(), 8, this.f17238G, Integer.valueOf(i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f7 */
    public final void m16237f7(ChildColumn childColumn) {
        this.f17247V = childColumn;
        C7594o0 c7594o0 = C7594o0.f27942a;
        List<PosterList> posterList = childColumn.getPosterList();
        C7594o0.a aVar = C7594o0.a.Background;
        String m29220i = c7594o0.m29220i(posterList, aVar);
        if (TextUtils.isEmpty(m29220i)) {
            m29220i = c7594o0.m29220i(this.f17258m0, aVar);
        }
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m16268z6(R$id.llContent);
        AbstractC5868k.m23673e(autoLinearLayout, "llContent");
        C7594o0.m29195L(c7594o0, this, m29220i, autoLinearLayout, Integer.valueOf(R$mipmap.vod_kids_bg), null, null, 0, 112, null);
        m16239g7();
        m16223S6().m28847d();
        m16223S6().m20920A(m16224T6(childColumn), childColumn.getId());
        ((TextView) m16268z6(R$id.mTextTitle)).setText(this.f17257l0 + " > " + AbstractC5091h.m20660c(childColumn.getName(), childColumn.getAlias()));
        ((C6274l) m11977r5()).m24950Y0();
        this.f17261p0.removeMessages(10001);
        this.f17261p0.sendEmptyMessageDelayed(10001, 100L);
    }

    /* renamed from: g7 */
    private final void m16239g7() {
        this.f17250Y = 1;
        this.f17252g0 = 1;
        this.f17237F = 1;
        this.f17239H = 0;
        this.f17251Z = 0;
        ((TextView) m16268z6(R$id.mTextPage)).setText("");
    }

    /* renamed from: h7 */
    private final void m16241h7() {
        int i10 = R$id.mLlSearchFocus;
        ((AutoLinearLayout) m16268z6(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sd.m0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                KidsCategoryActivity.m16243i7(KidsCategoryActivity.this, view, z10);
            }
        });
        int i11 = R$id.mLlFilterFocus;
        ((AutoLinearLayout) m16268z6(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sd.n0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                KidsCategoryActivity.m16245j7(KidsCategoryActivity.this, view, z10);
            }
        });
        int i12 = R$id.mGridProgram;
        ((VerticalGridView) m16268z6(i12)).setOnChildViewHolderSelectedListener(this.f17262q0);
        ((VerticalGridView) m16268z6(i12)).setOnKeyInterceptListener(new AbstractC3050a.c() { // from class: sd.o0
            @Override // com.open.leanback.widget.AbstractC3050a.c
            /* renamed from: a */
            public final boolean mo12521a(KeyEvent keyEvent) {
                boolean m16246k7;
                m16246k7 = KidsCategoryActivity.m16246k7(KidsCategoryActivity.this, keyEvent);
                return m16246k7;
            }
        });
        ((AutoLinearLayout) m16268z6(i10)).setOnClickListener(new View.OnClickListener() { // from class: sd.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KidsCategoryActivity.m16248l7(KidsCategoryActivity.this, view);
            }
        });
        ((AutoLinearLayout) m16268z6(i11)).setOnClickListener(new View.OnClickListener() { // from class: sd.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KidsCategoryActivity.m16249m7(KidsCategoryActivity.this, view);
            }
        });
        ((VerticalGridView) m16268z6(i12)).setOnLoadMoreListener(new AbstractC3050a.d() { // from class: sd.e0
            @Override // com.open.leanback.widget.AbstractC3050a.d
            public final void onLoadMore() {
                KidsCategoryActivity.m16250n7(KidsCategoryActivity.this);
            }
        });
        m16218M6().m20857x(new C3816h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7 */
    public static final void m16243i7(KidsCategoryActivity kidsCategoryActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        if (z10 && !kidsCategoryActivity.f17241J) {
            ((AutoLinearLayout) kidsCategoryActivity.m16268z6(R$id.mLlSearchFocus)).setSelected(false);
            ((TextView) kidsCategoryActivity.m16268z6(R$id.tvSearch)).setSelected(false);
            kidsCategoryActivity.m16218M6().m20853r();
            kidsCategoryActivity.f17248W = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j7 */
    public static final void m16245j7(KidsCategoryActivity kidsCategoryActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        if (z10) {
            ((AutoLinearLayout) kidsCategoryActivity.m16268z6(R$id.mLlFilterFocus)).setSelected(false);
            kidsCategoryActivity.m16218M6().m20853r();
            kidsCategoryActivity.f17248W = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7 */
    public static final boolean m16246k7(KidsCategoryActivity kidsCategoryActivity, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        if (keyEvent.getKeyCode() == 19 && ((VerticalGridView) kidsCategoryActivity.m16268z6(R$id.mGridProgram)).getSelectedPosition() < 4 && kidsCategoryActivity.f17237F != 1) {
            if (keyEvent.getAction() == 0 && !kidsCategoryActivity.f17240I) {
                kidsCategoryActivity.f17240I = true;
                kidsCategoryActivity.m16236e7();
                return true;
            }
            if (keyEvent.getAction() == 1) {
                kidsCategoryActivity.f17240I = false;
            }
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 21 || (kidsCategoryActivity.m16223S6().getItemCount() != 0 && ((VerticalGridView) kidsCategoryActivity.m16268z6(R$id.mGridProgram)).getSelectedPosition() % 4 != 0)) {
            return false;
        }
        if (kidsCategoryActivity.m16218M6().m20855v()) {
            kidsCategoryActivity.f17249X = false;
            kidsCategoryActivity.m16218M6().m20856w();
        } else {
            View view = kidsCategoryActivity.f17248W;
            if (view == null) {
                return false;
            }
            if (view != null) {
                view.requestFocus();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7 */
    public static final void m16248l7(KidsCategoryActivity kidsCategoryActivity, View view) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        C7589m1.f27886a.m29146o(7);
        kidsCategoryActivity.m16251o7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7 */
    public static final void m16249m7(KidsCategoryActivity kidsCategoryActivity, View view) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        C7589m1 c7589m1 = C7589m1.f27886a;
        c7589m1.m29146o(9);
        c7589m1.m29141j();
        c7589m1.m29121D();
        C7619y.f28056a.m29369b(kidsCategoryActivity.m30049S4(), FilterActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n7 */
    public static final void m16250n7(KidsCategoryActivity kidsCategoryActivity) {
        AbstractC5868k.m23674f(kidsCategoryActivity, "this$0");
        kidsCategoryActivity.m16234d7();
    }

    /* renamed from: o7 */
    private final void m16251o7() {
        C7619y.m29367d(C7619y.f28056a, m30049S4(), VodSearchActivity.class, null, C3817i.f17273a, 2, null);
    }

    @Override // p253nd.InterfaceC5846f
    /* renamed from: F */
    public void mo16260F() {
        ((LoadingView) m16268z6(R$id.mLoadingView)).setVisibility(8);
    }

    @Override // p253nd.InterfaceC5846f
    /* renamed from: P */
    public void mo16261P(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f17254i0 = false;
        this.f17252g0 = this.f17250Y;
        AbstractActivityC2972a.m11957W5(this, str, true, null, null, null, null, null, 124, null);
    }

    @Override // p253nd.InterfaceC5846f
    /* renamed from: Q */
    public void mo16262Q(RecommendColumnContentDataBean recommendColumnContentDataBean) {
        boolean z10;
        AbstractC5868k.m23674f(recommendColumnContentDataBean, "bean");
        this.f17258m0 = recommendColumnContentDataBean.getParentPosterList();
        this.f17257l0 = recommendColumnContentDataBean.getFirstLevelColumnName();
        final List<ChildColumn> columnList = recommendColumnContentDataBean.getColumnList();
        C5165d2 m16218M6 = m16218M6();
        AbstractC5868k.m23672d(columnList, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.ChildColumn>");
        m16218M6.m28854l(AbstractC5882y.m23702b(columnList));
        ((RecyclerViewTV) m16268z6(R$id.mGridCategory)).setFocusable(true);
        final C5876s c5876s = new C5876s();
        int i10 = 0;
        for (Object obj : columnList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            ChildColumn childColumn = (ChildColumn) obj;
            if (this.f17256k0.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && AbstractC5868k.m23669a(childColumn.getAlias(), this.f17256k0)) {
                c5876s.f23410a = i10;
            }
            i10 = i11;
        }
        if (c5876s.f23410a != 0) {
            int i12 = R$id.mGridCategory;
            ((RecyclerViewTV) m16268z6(i12)).scrollToPosition(c5876s.f23410a);
            ((RecyclerViewTV) m16268z6(i12)).postDelayed(new Runnable() { // from class: sd.b0
                @Override // java.lang.Runnable
                public final void run() {
                    KidsCategoryActivity.m16230Z6(KidsCategoryActivity.this, c5876s);
                }
            }, 200L);
        } else {
            ((RecyclerViewTV) m16268z6(R$id.mGridCategory)).post(new Runnable() { // from class: sd.g0
                @Override // java.lang.Runnable
                public final void run() {
                    KidsCategoryActivity.m16231a7(KidsCategoryActivity.this);
                }
            });
        }
        Observable fromIterable = Observable.fromIterable(columnList);
        final C3813e c3813e = C3813e.f17269a;
        Observable compose = fromIterable.filter(new Predicate() { // from class: sd.h0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj2) {
                boolean m16232b7;
                m16232b7 = KidsCategoryActivity.m16232b7(InterfaceC5660l.this, obj2);
                return m16232b7;
            }
        }).take(1L).compose(AbstractC7029f.m27120a());
        final C3814f c3814f = new C3814f();
        Consumer consumer = new Consumer() { // from class: sd.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                KidsCategoryActivity.m16227W6(InterfaceC5660l.this, obj2);
            }
        };
        final C3815g c3815g = C3815g.f17271a;
        compose.subscribe(consumer, new Consumer() { // from class: sd.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                KidsCategoryActivity.m16228X6(InterfaceC5660l.this, obj2);
            }
        }, new Action() { // from class: sd.k0
            @Override // io.reactivex.functions.Action
            public final void run() {
                KidsCategoryActivity.m16229Y6(KidsCategoryActivity.this, columnList);
            }
        });
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: Q6, reason: merged with bridge method [inline-methods] */
    public C6274l mo7516s5() {
        return new C6274l(this, this);
    }

    @Override // p253nd.InterfaceC5846f
    /* renamed from: T */
    public void mo16264T(String str, boolean z10) {
        List m6989h;
        AbstractC5868k.m23674f(str, "errCode");
        if (z10) {
            ChildColumn childColumn = new ChildColumn();
            childColumn.setId(this.f17242K);
            childColumn.setName(this.f17243L);
            childColumn.setAlias(this.f17243L);
            childColumn.setPosterList(this.f17255j0);
            C5165d2 m16218M6 = m16218M6();
            m6989h = AbstractC1500l.m6989h(childColumn);
            m16218M6.m28854l(m6989h);
            int i10 = R$id.mGridCategory;
            ((RecyclerViewTV) m16268z6(i10)).setFocusable(true);
            ((RecyclerViewTV) m16268z6(i10)).post(new Runnable() { // from class: sd.f0
                @Override // java.lang.Runnable
                public final void run() {
                    KidsCategoryActivity.m16226V6(KidsCategoryActivity.this);
                }
            });
            this.f17246O = this.f17242K;
            return;
        }
        AbstractActivityC2972a.m11957W5(this, str, true, null, null, null, null, null, 124, null);
    }

    @Override // p253nd.InterfaceC5846f
    /* renamed from: X */
    public void mo16265X(GetShelveResult getShelveResult, int i10) {
        AbstractC5868k.m23674f(getShelveResult, "getShelveDataResult");
        if (!AbstractC6567a.m25635e(getShelveResult.getData().getAssetList())) {
            int i11 = this.f17239H;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f17237F = 1;
                        List<AssetList> assetList = getShelveResult.getData().getAssetList();
                        AbstractC5868k.m23671c(assetList);
                        m16223S6().m28854l((ArrayList) assetList);
                        this.f17251Z = m16222R6(getShelveResult.getData().getAssetListTotalSize());
                        TextView textView = (TextView) m16268z6(R$id.mTextPage);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f17250Y);
                        sb2.append('/');
                        sb2.append(this.f17251Z);
                        textView.setText(sb2.toString());
                    } else {
                        this.f17240I = false;
                        this.f17237F = this.f17238G;
                        List m28848f = m16223S6().m28848f();
                        List<AssetList> assetList2 = getShelveResult.getData().getAssetList();
                        AbstractC5868k.m23672d(assetList2, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.AssetList>");
                        m28848f.addAll(0, (ArrayList) assetList2);
                        C5181h2 m16223S6 = m16223S6();
                        List<AssetList> assetList3 = getShelveResult.getData().getAssetList();
                        AbstractC5868k.m23671c(assetList3);
                        m16223S6.notifyItemRangeInserted(0, assetList3.size());
                        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: sd.l0
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                boolean m16233c7;
                                m16233c7 = KidsCategoryActivity.m16233c7(KidsCategoryActivity.this);
                                return m16233c7;
                            }
                        });
                    }
                } else {
                    C5181h2 m16223S62 = m16223S6();
                    List<AssetList> assetList4 = getShelveResult.getData().getAssetList();
                    AbstractC5868k.m23672d(assetList4, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.AssetList>");
                    m16223S62.m28845b((ArrayList) assetList4);
                }
            } else {
                this.f17237F = this.f17238G;
                this.f17241J = true;
                List<AssetList> assetList5 = getShelveResult.getData().getAssetList();
                AbstractC5868k.m23671c(assetList5);
                m16223S6().m28854l((ArrayList) assetList5);
                TextView textView2 = (TextView) m16268z6(R$id.mTextPage);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f17237F);
                sb3.append('/');
                sb3.append(this.f17251Z);
                textView2.setText(sb3.toString());
                this.f17261p0.removeMessages(10003);
                this.f17261p0.sendEmptyMessage(10003);
                int i12 = R$id.mGridProgram;
                ((VerticalGridView) m16268z6(i12)).scrollToPosition(0);
                ((VerticalGridView) m16268z6(i12)).setSelectedPositionSmooth(0);
            }
            int m16221P6 = m16221P6(m16223S6().m28848f().size());
            this.f17250Y = m16221P6;
            this.f17252g0 = m16221P6;
            return;
        }
        if (m16223S6().getItemCount() == 0) {
            m16223S6().m28847d();
            m16239g7();
        }
        int m16221P62 = m16221P6(m16223S6().getItemCount());
        this.f17250Y = m16221P62;
        this.f17252g0 = m16221P62;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        m16220O6();
        int i10 = R$id.mGridCategory;
        ((RecyclerViewTV) m16268z6(i10)).setLayoutManager(new LinearLayoutManagerTV(m30049S4()));
        ((RecyclerViewTV) m16268z6(i10)).setAdapter(m16218M6());
        m16223S6().m20921C(this.f17244M);
        int i11 = R$id.mGridProgram;
        ((VerticalGridView) m16268z6(i11)).setAdapter(m16223S6());
        VerticalGridView verticalGridView = (VerticalGridView) m16268z6(i11);
        AbstractC5868k.m23673e(verticalGridView, "mGridProgram");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        ((VerticalGridView) m16268z6(i11)).setWindowAlignmentOffsetPercent(25.0f);
        ((TextView) m16268z6(R$id.tvSearch)).setTypeface(Typeface.createFromAsset(m11976o5().getAssets(), "amazingkids.otf"));
        ((TextView) m16268z6(R$id.tvFilter)).setTypeface(Typeface.createFromAsset(m11976o5().getAssets(), "amazingkids.otf"));
        ((AutoLinearLayout) m16268z6(R$id.llContent)).requestFocus();
        m16241h7();
    }

    @Override // p253nd.InterfaceC5846f
    /* renamed from: h */
    public void mo16266h() {
        if (this.f17242K > 0) {
            ((C6274l) m11977r5()).m24947E3(Integer.valueOf(this.f17242K), null, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        this.f17261p0.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && i10 == 22) {
            if (((RecyclerViewTV) m16268z6(R$id.mGridCategory)).getFocusedChild() != null) {
                m16218M6().m20859z(true);
                ((VerticalGridView) m16268z6(R$id.mGridProgram)).requestFocus();
                return true;
            }
            int i11 = R$id.mLlFilterFocus;
            if (((AutoLinearLayout) m16268z6(i11)).hasFocus()) {
                ((AutoLinearLayout) m16268z6(i11)).setSelected(true);
                ((VerticalGridView) m16268z6(R$id.mGridProgram)).requestFocus();
                return true;
            }
            int i12 = R$id.mLlSearchFocus;
            if (((AutoLinearLayout) m16268z6(i12)).hasFocus()) {
                ((AutoLinearLayout) m16268z6(i12)).setSelected(true);
                ((TextView) m16268z6(R$id.tvSearch)).setSelected(true);
                ((VerticalGridView) m16268z6(R$id.mGridProgram)).requestFocus();
                return true;
            }
        }
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
                this.f17253h0 = (this.f17253h0 * 10) + (i10 - 7);
                int i13 = R$id.mTextInputNumber;
                ((TextView) m16268z6(i13)).setVisibility(0);
                ((TextView) m16268z6(i13)).setText(String.valueOf(this.f17253h0));
                this.f17261p0.removeMessages(10002);
                this.f17261p0.sendEmptyMessageDelayed(10002, 3000L);
                break;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p253nd.InterfaceC5846f
    /* renamed from: x */
    public void mo16267x() {
        ((LoadingView) m16268z6(R$id.mLoadingView)).setVisibility(0);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_kidscategory;
    }

    /* renamed from: z6 */
    public View m16268z6(int i10) {
        Map map = this.f17263r0;
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
}
