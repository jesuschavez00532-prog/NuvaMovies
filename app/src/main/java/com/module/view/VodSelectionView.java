package com.module.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import be.C1328x;
import com.module.R$color;
import com.module.R$id;
import com.module.view.VodSelectionView;
import com.open.leanback.widget.HorizontalGridView;
import com.open.leanback.widget.InterfaceC3056g;
import com.request.result.SimpleProgramList;
import com.zhy.autolayout.AutoLinearLayout;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import me.InterfaceC5665q;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import p348u2.AbstractC7029f;
import p399x9.C7543r;
import p399x9.C7545t;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class VodSelectionView extends AutoLinearLayout {

    /* renamed from: u */
    public static final C3027a f12323u = new C3027a(null);

    /* renamed from: a */
    private final int f12324a;

    /* renamed from: b */
    private HorizontalGridView f12325b;

    /* renamed from: c */
    private HorizontalGridView f12326c;

    /* renamed from: d */
    private final int f12327d;

    /* renamed from: e */
    private ArrayList f12328e;

    /* renamed from: f */
    private SparseArray f12329f;

    /* renamed from: g */
    private ArrayList f12330g;

    /* renamed from: h */
    private C7543r f12331h;

    /* renamed from: i */
    private C7545t f12332i;

    /* renamed from: j */
    private InterfaceC5664p f12333j;

    /* renamed from: k */
    private TextView f12334k;

    /* renamed from: l */
    private PopupWindow f12335l;

    /* renamed from: m */
    private View f12336m;

    /* renamed from: n */
    private boolean f12337n;

    /* renamed from: o */
    private int f12338o;

    /* renamed from: p */
    private int f12339p;

    /* renamed from: q */
    private int f12340q;

    /* renamed from: r */
    private InterfaceC3028b f12341r;

    /* renamed from: s */
    private final HandlerC3041i f12342s;

    /* renamed from: t */
    public Map f12343t = new LinkedHashMap();

    /* renamed from: com.module.view.VodSelectionView$a */
    /* loaded from: classes2.dex */
    public static final class C3027a {
        private C3027a() {
        }

        public /* synthetic */ C3027a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.module.view.VodSelectionView$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3028b {
        /* renamed from: a */
        boolean mo12329a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.VodSelectionView$c */
    /* loaded from: classes2.dex */
    public static final class C3029c extends AbstractC5869l implements InterfaceC5665q {
        C3029c() {
            super(3);
        }

        /* renamed from: a */
        public final void m12330a(View view, int i10, SimpleProgramList simpleProgramList) {
            int i11;
            boolean z10;
            PopupWindow popupWindow;
            AbstractC5868k.m23674f(view, "view");
            AbstractC5868k.m23674f(simpleProgramList, "simpleProgramList");
            int i12 = VodSelectionView.this.f12327d;
            HorizontalGridView horizontalGridView = VodSelectionView.this.f12326c;
            if (horizontalGridView != null) {
                i11 = horizontalGridView.getSelectedPosition();
            } else {
                i11 = 0;
            }
            int i13 = i10 + (i12 * i11);
            InterfaceC5664p interfaceC5664p = VodSelectionView.this.f12333j;
            if (interfaceC5664p != null) {
                z10 = ((Boolean) interfaceC5664p.mo2391h(Integer.valueOf(i13), simpleProgramList)).booleanValue();
            } else {
                z10 = false;
            }
            if (z10 && (popupWindow = VodSelectionView.this.f12335l) != null) {
                popupWindow.dismiss();
            }
            if (VodSelectionView.this.f12337n) {
                VodSelectionView.this.f12340q = i13;
            }
            if (VodSelectionView.this.f12337n && VodSelectionView.this.f12339p != VodSelectionView.this.f12338o) {
                Iterator it = ((List) VodSelectionView.this.f12329f.get(VodSelectionView.this.f12339p)).iterator();
                while (it.hasNext()) {
                    ((SimpleProgramList) it.next()).setSelected(false);
                }
                VodSelectionView vodSelectionView = VodSelectionView.this;
                vodSelectionView.f12339p = vodSelectionView.f12338o;
            }
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m12330a((View) obj, ((Number) obj2).intValue(), (SimpleProgramList) obj3);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.module.view.VodSelectionView$d */
    /* loaded from: classes2.dex */
    static final class C3030d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ int f12345a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f12346b;

        /* renamed from: c */
        final /* synthetic */ VodSelectionView f12347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3030d(int i10, ArrayList arrayList, VodSelectionView vodSelectionView) {
            super(1);
            this.f12345a = i10;
            this.f12346b = arrayList;
            this.f12347c = vodSelectionView;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Observable mo542f(Integer num) {
            int intValue;
            AbstractC5868k.m23674f(num, "index");
            if (num.intValue() == this.f12345a - 1) {
                intValue = this.f12346b.size();
            } else {
                intValue = (num.intValue() + 1) * this.f12347c.f12327d;
            }
            ArrayList arrayList = new ArrayList(this.f12346b.subList(num.intValue() * this.f12347c.f12327d, intValue));
            this.f12347c.f12329f.put(num.intValue(), arrayList);
            ArrayList arrayList2 = this.f12347c.f12330g;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((SimpleProgramList) arrayList.get(0)).getSeriesNumber());
            sb2.append('-');
            sb2.append(((SimpleProgramList) arrayList.get(arrayList.size() - 1)).getSeriesNumber());
            arrayList2.add(sb2.toString());
            return Observable.fromArray(this.f12347c.f12329f);
        }
    }

    /* renamed from: com.module.view.VodSelectionView$e */
    /* loaded from: classes2.dex */
    static final class C3031e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3031e f12348a = new C3031e();

        C3031e() {
            super(1);
        }

        /* renamed from: a */
        public final void m12332a(Observable observable) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12332a((Observable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.module.view.VodSelectionView$f */
    /* loaded from: classes2.dex */
    static final class C3032f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3032f f12349a = new C3032f();

        C3032f() {
            super(1);
        }

        /* renamed from: a */
        public final void m12333a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12333a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public VodSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12327d = 20;
        this.f12328e = new ArrayList();
        this.f12329f = new SparseArray();
        this.f12330g = new ArrayList();
        this.f12331h = new C7543r();
        this.f12332i = new C7545t(new C3042j(this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        m12323w();
        this.f12342s = new HandlerC3041i(this, Looper.getMainLooper());
    }

    /* renamed from: A */
    private final void m12292A() {
        HorizontalGridView horizontalGridView = this.f12325b;
        if (horizontalGridView != null) {
            horizontalGridView.setOnChildSelectedListener(new InterfaceC3056g() { // from class: db.m1
                @Override // com.open.leanback.widget.InterfaceC3056g
                /* renamed from: a */
                public final void mo12571a(ViewGroup viewGroup, View view, int i10, long j10) {
                    VodSelectionView.m12293B(VodSelectionView.this, viewGroup, view, i10, j10);
                }
            });
        }
        HorizontalGridView horizontalGridView2 = this.f12326c;
        if (horizontalGridView2 != null) {
            horizontalGridView2.setOnChildSelectedListener(new InterfaceC3056g() { // from class: db.n1
                @Override // com.open.leanback.widget.InterfaceC3056g
                /* renamed from: a */
                public final void mo12571a(ViewGroup viewGroup, View view, int i10, long j10) {
                    VodSelectionView.m12294C(VodSelectionView.this, viewGroup, view, i10, j10);
                }
            });
        }
        this.f12331h.m28908u(new C3029c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m12293B(VodSelectionView vodSelectionView, ViewGroup viewGroup, View view, int i10, long j10) {
        AbstractC5868k.m23674f(vodSelectionView, "this$0");
        if (view == null) {
            return;
        }
        vodSelectionView.f12336m = view;
        vodSelectionView.m12300K(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m12294C(VodSelectionView vodSelectionView, ViewGroup viewGroup, View view, int i10, long j10) {
        AbstractC5868k.m23674f(vodSelectionView, "this$0");
        if (view == null) {
            return;
        }
        if (vodSelectionView.f12329f.size() > i10) {
            Object obj = vodSelectionView.f12329f.get(i10);
            AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.SimpleProgramList>");
            List m23702b = AbstractC5882y.m23702b(obj);
            if (vodSelectionView.f12337n && i10 == 0 && vodSelectionView.f12340q == 0) {
                ((SimpleProgramList) m23702b.get(0)).setSelected(true);
            }
            vodSelectionView.f12331h.m28856n(m23702b);
            HorizontalGridView horizontalGridView = vodSelectionView.f12325b;
            if (horizontalGridView != null) {
                horizontalGridView.setSelectedPosition(0);
            }
        }
        TextView textView = vodSelectionView.f12334k;
        if (textView != null) {
            AbstractC5868k.m23671c(textView);
            textView.setTextColor(vodSelectionView.getContext().getResources().getColorStateList(R$color.text_filter_color));
        }
        TextView textView2 = (TextView) view.findViewById(R$id.mTextTitle);
        if (textView2 != null) {
            textView2.setTextColor(vodSelectionView.getContext().getResources().getColorStateList(R$color.text_selection_interval_remember_color));
            vodSelectionView.f12334k = textView2;
        }
        vodSelectionView.f12338o = i10;
    }

    /* renamed from: E */
    public static /* synthetic */ void m12295E(VodSelectionView vodSelectionView, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        vodSelectionView.m12325D(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final Observable m12296G(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Observable) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m12297H(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m12298I(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m12299J(VodSelectionView vodSelectionView, InterfaceC5642a interfaceC5642a) {
        boolean z10;
        HorizontalGridView horizontalGridView;
        int selectedPosition;
        AbstractC5868k.m23674f(vodSelectionView, "this$0");
        vodSelectionView.f12332i.m28854l(vodSelectionView.f12330g);
        HorizontalGridView horizontalGridView2 = vodSelectionView.f12326c;
        if (horizontalGridView2 != null && horizontalGridView2.getSelectedPosition() == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (horizontalGridView = vodSelectionView.f12326c) == null) {
            selectedPosition = 0;
        } else {
            selectedPosition = horizontalGridView.getSelectedPosition();
        }
        if (selectedPosition > vodSelectionView.f12329f.size() - 1) {
            selectedPosition = vodSelectionView.f12329f.size() - 1;
        }
        vodSelectionView.f12340q = 0;
        Object obj = vodSelectionView.f12329f.get(selectedPosition);
        AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.SimpleProgramList>");
        List m23702b = AbstractC5882y.m23702b(obj);
        if (vodSelectionView.f12337n && selectedPosition == 0) {
            ((SimpleProgramList) m23702b.get(0)).setSelected(true);
        }
        vodSelectionView.f12331h.m28854l(m23702b);
        HorizontalGridView horizontalGridView3 = vodSelectionView.f12325b;
        if (horizontalGridView3 != null) {
            horizontalGridView3.setSelectedPosition(0);
        }
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0130  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m12300K(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.module.view.VodSelectionView.m12300K(android.view.View, int):void");
    }

    /* renamed from: t */
    private final int m12320t(int i10) {
        int i11 = this.f12327d;
        int i12 = i10 % i11;
        int i13 = i10 / i11;
        if (i12 != 0) {
            return i13 + 1;
        }
        return i13;
    }

    /* renamed from: u */
    private final void m12321u() {
        ViewParent viewParent;
        HorizontalGridView horizontalGridView = this.f12325b;
        if (horizontalGridView == null) {
            this.f12325b = new HorizontalGridView(getContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            layoutParams.height = AbstractC7786b.m30163g(80);
            HorizontalGridView horizontalGridView2 = this.f12325b;
            if (horizontalGridView2 != null) {
                horizontalGridView2.setLayoutParams(layoutParams);
            }
            HorizontalGridView horizontalGridView3 = this.f12325b;
            if (horizontalGridView3 != null) {
                horizontalGridView3.setClipChildren(false);
            }
            HorizontalGridView horizontalGridView4 = this.f12325b;
            if (horizontalGridView4 != null) {
                horizontalGridView4.setClipToPadding(false);
            }
            HorizontalGridView horizontalGridView5 = this.f12325b;
            if (horizontalGridView5 != null) {
                horizontalGridView5.setHorizontalSpacing(AbstractC7786b.m30166j(10));
            }
        } else {
            ViewParent viewParent2 = null;
            if (horizontalGridView != null) {
                viewParent = horizontalGridView.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent != null) {
                HorizontalGridView horizontalGridView6 = this.f12325b;
                if (horizontalGridView6 != null) {
                    viewParent2 = horizontalGridView6.getParent();
                }
                AbstractC5868k.m23672d(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) viewParent2).removeView(this.f12325b);
            }
        }
        HorizontalGridView horizontalGridView7 = this.f12325b;
        if (horizontalGridView7 != null) {
            horizontalGridView7.setPadding(0, AbstractC7786b.m30163g(5), AbstractC7786b.m30166j(90), 0);
        }
        this.f12331h.setHasStableIds(true);
        HorizontalGridView horizontalGridView8 = this.f12325b;
        if (horizontalGridView8 != null) {
            horizontalGridView8.setAdapter(this.f12331h);
        }
        addView(this.f12325b);
    }

    /* renamed from: v */
    private final void m12322v() {
        ViewParent viewParent;
        HorizontalGridView horizontalGridView = this.f12326c;
        if (horizontalGridView == null) {
            this.f12326c = new HorizontalGridView(getContext());
            AutoLinearLayout.C3911a c3911a = new AutoLinearLayout.C3911a(-1, -2);
            ((LinearLayout.LayoutParams) c3911a).height = AbstractC7786b.m30163g(70);
            ((LinearLayout.LayoutParams) c3911a).bottomMargin = AbstractC7786b.m30163g(28);
            HorizontalGridView horizontalGridView2 = this.f12326c;
            if (horizontalGridView2 != null) {
                horizontalGridView2.setLayoutParams(c3911a);
            }
            HorizontalGridView horizontalGridView3 = this.f12326c;
            if (horizontalGridView3 != null) {
                horizontalGridView3.setClipChildren(false);
            }
            HorizontalGridView horizontalGridView4 = this.f12326c;
            if (horizontalGridView4 != null) {
                horizontalGridView4.setClipToPadding(false);
            }
            HorizontalGridView horizontalGridView5 = this.f12326c;
            if (horizontalGridView5 != null) {
                horizontalGridView5.setHorizontalSpacing(AbstractC7786b.m30166j(10));
            }
        } else {
            ViewParent viewParent2 = null;
            if (horizontalGridView != null) {
                viewParent = horizontalGridView.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent != null) {
                HorizontalGridView horizontalGridView6 = this.f12326c;
                if (horizontalGridView6 != null) {
                    viewParent2 = horizontalGridView6.getParent();
                }
                AbstractC5868k.m23672d(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) viewParent2).removeView(this.f12326c);
            }
        }
        HorizontalGridView horizontalGridView7 = this.f12326c;
        if (horizontalGridView7 != null) {
            horizontalGridView7.setPadding(0, 0, AbstractC7786b.m30166j(90), 0);
        }
        HorizontalGridView horizontalGridView8 = this.f12326c;
        if (horizontalGridView8 != null) {
            horizontalGridView8.setAdapter(this.f12332i);
        }
        addView(this.f12326c);
    }

    /* renamed from: w */
    private final void m12323w() {
        m12322v();
        m12321u();
        m12292A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m12324y(VodSelectionView vodSelectionView, View view) {
        int i10;
        AbstractC5868k.m23674f(vodSelectionView, "this$0");
        AbstractC5868k.m23674f(view, "$it");
        HorizontalGridView horizontalGridView = vodSelectionView.f12325b;
        if (horizontalGridView != null) {
            i10 = horizontalGridView.getSelectedPosition();
        } else {
            i10 = 0;
        }
        vodSelectionView.m12300K(view, i10);
    }

    /* renamed from: D */
    public final void m12325D(int i10, int i11) {
        int m12320t = m12320t(i10 + 1) - 1;
        if (i11 == -1 && this.f12328e.size() > i10) {
            i11 = ((SimpleProgramList) this.f12328e.get(i10)).getSeriesNumber();
        }
        HorizontalGridView horizontalGridView = this.f12326c;
        if (horizontalGridView != null) {
            horizontalGridView.setSelectedPosition(m12320t);
        }
        this.f12331h.m28909v(i10, i11);
    }

    /* renamed from: F */
    public final void m12326F(ArrayList arrayList, final InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(arrayList, "list");
        int m12320t = m12320t(arrayList.size());
        this.f12328e.clear();
        this.f12330g.clear();
        this.f12329f.clear();
        this.f12328e.addAll(arrayList);
        Observable<Integer> range = Observable.range(0, m12320t);
        final C3030d c3030d = new C3030d(m12320t, arrayList, this);
        Observable compose = range.map(new Function() { // from class: db.p1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m12296G;
                m12296G = VodSelectionView.m12296G(InterfaceC5660l.this, obj);
                return m12296G;
            }
        }).compose(AbstractC7029f.m27120a());
        final C3031e c3031e = C3031e.f12348a;
        Consumer consumer = new Consumer() { // from class: db.q1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VodSelectionView.m12297H(InterfaceC5660l.this, obj);
            }
        };
        final C3032f c3032f = C3032f.f12349a;
        compose.subscribe(consumer, new Consumer() { // from class: db.r1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VodSelectionView.m12298I(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: db.s1
            @Override // io.reactivex.functions.Action
            public final void run() {
                VodSelectionView.m12299J(VodSelectionView.this, interfaceC5642a);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.module.view.VodSelectionView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        final View view;
        if (i10 == 130 && (view = this.f12336m) != null) {
            view.post(new Runnable() { // from class: db.o1
                @Override // java.lang.Runnable
                public final void run() {
                    VodSelectionView.m12324y(VodSelectionView.this, view);
                }
            });
        }
        return super.requestFocus(i10, rect);
    }

    public final void setFocusListener(InterfaceC3028b interfaceC3028b) {
        AbstractC5868k.m23674f(interfaceC3028b, "listener");
        this.f12341r = interfaceC3028b;
    }

    public final void setLeftRightPadding(int i10) {
        HorizontalGridView horizontalGridView = this.f12325b;
        if (horizontalGridView != null) {
            horizontalGridView.setPadding(AbstractC7786b.m30166j(i10), 0, AbstractC7786b.m30166j(i10), 0);
        }
        HorizontalGridView horizontalGridView2 = this.f12326c;
        if (horizontalGridView2 != null) {
            horizontalGridView2.setPadding(AbstractC7786b.m30166j(i10), AbstractC7786b.m30163g(10), AbstractC7786b.m30166j(i10), 0);
        }
    }

    public final void setOffset(boolean z10) {
        ViewGroup.LayoutParams layoutParams;
        int i10;
        HorizontalGridView horizontalGridView = this.f12326c;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (horizontalGridView != null) {
            layoutParams = horizontalGridView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams != null) {
            if (z10) {
                i10 = AbstractC7786b.m30166j(318);
            } else {
                i10 = 0;
            }
            marginLayoutParams.leftMargin = i10;
        }
        HorizontalGridView horizontalGridView2 = this.f12326c;
        if (horizontalGridView2 != null) {
            horizontalGridView2.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setOnItemClickListener(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f12333j = interfaceC5664p;
    }

    /* renamed from: x */
    public final void m12327x() {
        HorizontalGridView horizontalGridView = this.f12325b;
        if (horizontalGridView != null) {
            horizontalGridView.requestFocus();
        }
    }

    /* renamed from: z */
    public final void m12328z() {
        HorizontalGridView horizontalGridView = this.f12326c;
        if (horizontalGridView != null) {
            horizontalGridView.setSelectedPosition(0);
        }
    }
}
