package com.module.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import be.C1328x;
import com.module.R$color;
import com.module.R$id;
import com.module.view.SelectionView;
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
public final class SelectionView extends AutoLinearLayout {

    /* renamed from: t */
    public static final C3022a f12294t = new C3022a(null);

    /* renamed from: u */
    private static int f12295u;

    /* renamed from: a */
    private final int f12296a;

    /* renamed from: b */
    private HorizontalGridView f12297b;

    /* renamed from: c */
    private HorizontalGridView f12298c;

    /* renamed from: d */
    private final int f12299d;

    /* renamed from: e */
    private ArrayList f12300e;

    /* renamed from: f */
    private SparseArray f12301f;

    /* renamed from: g */
    private ArrayList f12302g;

    /* renamed from: h */
    private C7543r f12303h;

    /* renamed from: i */
    private C7545t f12304i;

    /* renamed from: j */
    private InterfaceC5664p f12305j;

    /* renamed from: k */
    private TextView f12306k;

    /* renamed from: l */
    private PopupWindow f12307l;

    /* renamed from: m */
    private View f12308m;

    /* renamed from: n */
    private boolean f12309n;

    /* renamed from: o */
    private int f12310o;

    /* renamed from: p */
    private int f12311p;

    /* renamed from: q */
    private int f12312q;

    /* renamed from: r */
    private final HandlerC3039g f12313r;

    /* renamed from: s */
    public Map f12314s = new LinkedHashMap();

    /* renamed from: com.module.view.SelectionView$a */
    /* loaded from: classes2.dex */
    public static final class C3022a {
        private C3022a() {
        }

        public /* synthetic */ C3022a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final int m12278a() {
            return SelectionView.f12295u;
        }

        /* renamed from: b */
        public final void m12279b(int i10) {
            SelectionView.f12295u = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.SelectionView$b */
    /* loaded from: classes2.dex */
    public static final class C3023b extends AbstractC5869l implements InterfaceC5665q {
        C3023b() {
            super(3);
        }

        /* renamed from: a */
        public final void m12280a(View view, int i10, SimpleProgramList simpleProgramList) {
            int i11;
            boolean z10;
            PopupWindow popupWindow;
            AbstractC5868k.m23674f(view, "view");
            AbstractC5868k.m23674f(simpleProgramList, "simpleProgramList");
            int i12 = SelectionView.this.f12299d;
            HorizontalGridView horizontalGridView = SelectionView.this.f12298c;
            if (horizontalGridView != null) {
                i11 = horizontalGridView.getSelectedPosition();
            } else {
                i11 = 0;
            }
            int i13 = i10 + (i12 * i11);
            InterfaceC5664p interfaceC5664p = SelectionView.this.f12305j;
            if (interfaceC5664p != null) {
                z10 = ((Boolean) interfaceC5664p.mo2391h(Integer.valueOf(i13), simpleProgramList)).booleanValue();
            } else {
                z10 = false;
            }
            if (z10 && (popupWindow = SelectionView.this.f12307l) != null) {
                popupWindow.dismiss();
            }
            if (SelectionView.this.f12309n) {
                SelectionView.this.f12312q = i13;
            }
            if (SelectionView.this.f12309n && SelectionView.this.f12311p != SelectionView.this.f12310o) {
                Iterator it = ((List) SelectionView.this.f12301f.get(SelectionView.this.f12311p)).iterator();
                while (it.hasNext()) {
                    ((SimpleProgramList) it.next()).setSelected(false);
                }
                SelectionView selectionView = SelectionView.this;
                selectionView.f12311p = selectionView.f12310o;
            }
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m12280a((View) obj, ((Number) obj2).intValue(), (SimpleProgramList) obj3);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.SelectionView$c */
    /* loaded from: classes2.dex */
    public static final class C3024c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ int f12316a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f12317b;

        /* renamed from: c */
        final /* synthetic */ SelectionView f12318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3024c(int i10, ArrayList arrayList, SelectionView selectionView) {
            super(1);
            this.f12316a = i10;
            this.f12317b = arrayList;
            this.f12318c = selectionView;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Observable mo542f(Integer num) {
            int intValue;
            AbstractC5868k.m23674f(num, "index");
            if (num.intValue() == this.f12316a - 1) {
                intValue = this.f12317b.size();
            } else {
                intValue = (num.intValue() + 1) * this.f12318c.f12299d;
            }
            ArrayList arrayList = new ArrayList(this.f12317b.subList(num.intValue() * this.f12318c.f12299d, intValue));
            this.f12318c.f12301f.put(num.intValue(), arrayList);
            ArrayList arrayList2 = this.f12318c.f12302g;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((SimpleProgramList) arrayList.get(0)).getSeriesNumber());
            sb2.append('-');
            sb2.append(((SimpleProgramList) arrayList.get(arrayList.size() - 1)).getSeriesNumber());
            arrayList2.add(sb2.toString());
            return Observable.fromArray(this.f12318c.f12301f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.SelectionView$d */
    /* loaded from: classes2.dex */
    public static final class C3025d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3025d f12319a = new C3025d();

        C3025d() {
            super(1);
        }

        /* renamed from: a */
        public final void m12283a(Observable observable) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12283a((Observable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.SelectionView$e */
    /* loaded from: classes2.dex */
    public static final class C3026e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3026e f12320a = new C3026e();

        C3026e() {
            super(1);
        }

        /* renamed from: a */
        public final void m12284a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12284a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public SelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12299d = 20;
        this.f12300e = new ArrayList();
        this.f12301f = new SparseArray();
        this.f12302g = new ArrayList();
        this.f12303h = new C7543r();
        this.f12304i = new C7545t(new C3040h(this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        m12236A();
        this.f12313r = new HandlerC3039g(this, Looper.getMainLooper());
    }

    /* renamed from: A */
    private final void m12236A() {
        m12270y();
        m12271z();
        m12238E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m12237B(SelectionView selectionView, View view) {
        int i10;
        AbstractC5868k.m23674f(selectionView, "this$0");
        AbstractC5868k.m23674f(view, "$it");
        HorizontalGridView horizontalGridView = selectionView.f12297b;
        if (horizontalGridView != null) {
            i10 = horizontalGridView.getSelectedPosition();
        } else {
            i10 = 0;
        }
        selectionView.m12247P(view, i10);
    }

    /* renamed from: E */
    private final void m12238E() {
        HorizontalGridView horizontalGridView = this.f12297b;
        if (horizontalGridView != null) {
            horizontalGridView.setOnChildSelectedListener(new InterfaceC3056g() { // from class: db.z0
                @Override // com.open.leanback.widget.InterfaceC3056g
                /* renamed from: a */
                public final void mo12571a(ViewGroup viewGroup, View view, int i10, long j10) {
                    SelectionView.m12239F(SelectionView.this, viewGroup, view, i10, j10);
                }
            });
        }
        HorizontalGridView horizontalGridView2 = this.f12298c;
        if (horizontalGridView2 != null) {
            horizontalGridView2.setOnChildSelectedListener(new InterfaceC3056g() { // from class: db.a1
                @Override // com.open.leanback.widget.InterfaceC3056g
                /* renamed from: a */
                public final void mo12571a(ViewGroup viewGroup, View view, int i10, long j10) {
                    SelectionView.m12240G(SelectionView.this, viewGroup, view, i10, j10);
                }
            });
        }
        this.f12303h.m28908u(new C3023b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m12239F(SelectionView selectionView, ViewGroup viewGroup, View view, int i10, long j10) {
        AbstractC5868k.m23674f(selectionView, "this$0");
        if (view == null) {
            return;
        }
        selectionView.f12308m = view;
        selectionView.m12247P(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m12240G(SelectionView selectionView, ViewGroup viewGroup, View view, int i10, long j10) {
        AbstractC5868k.m23674f(selectionView, "this$0");
        if (view == null) {
            return;
        }
        if (selectionView.f12301f.size() > i10) {
            Object obj = selectionView.f12301f.get(i10);
            AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.SimpleProgramList>");
            List m23702b = AbstractC5882y.m23702b(obj);
            if (selectionView.f12309n && i10 == 0 && selectionView.f12312q == 0) {
                ((SimpleProgramList) m23702b.get(0)).setSelected(true);
            }
            selectionView.f12303h.m28856n(m23702b);
            HorizontalGridView horizontalGridView = selectionView.f12297b;
            if (horizontalGridView != null) {
                horizontalGridView.setSelectedPosition(0);
            }
        }
        TextView textView = selectionView.f12306k;
        if (textView != null) {
            AbstractC5868k.m23671c(textView);
            textView.setTextColor(selectionView.getContext().getResources().getColorStateList(R$color.text_filter_color));
        }
        TextView textView2 = (TextView) view.findViewById(R$id.mTextTitle);
        if (textView2 != null) {
            textView2.setTextColor(selectionView.getContext().getResources().getColorStateList(R$color.text_selection_interval_remember_color));
            selectionView.f12306k = textView2;
        }
        selectionView.f12310o = i10;
    }

    /* renamed from: I */
    public static /* synthetic */ void m12241I(SelectionView selectionView, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        selectionView.m12274H(i10, i11);
    }

    /* renamed from: K */
    public static /* synthetic */ void m12242K(SelectionView selectionView, ArrayList arrayList, InterfaceC5642a interfaceC5642a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC5642a = null;
        }
        selectionView.m12275J(arrayList, interfaceC5642a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final Observable m12243L(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Observable) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m12244M(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m12245N(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m12246O(SelectionView selectionView, InterfaceC5642a interfaceC5642a) {
        boolean z10;
        HorizontalGridView horizontalGridView;
        int selectedPosition;
        AbstractC5868k.m23674f(selectionView, "this$0");
        selectionView.f12304i.m28854l(selectionView.f12302g);
        HorizontalGridView horizontalGridView2 = selectionView.f12298c;
        if (horizontalGridView2 != null && horizontalGridView2.getSelectedPosition() == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (horizontalGridView = selectionView.f12298c) == null) {
            selectedPosition = 0;
        } else {
            selectedPosition = horizontalGridView.getSelectedPosition();
        }
        if (selectedPosition > selectionView.f12301f.size() - 1) {
            selectedPosition = selectionView.f12301f.size() - 1;
        }
        selectionView.f12312q = 0;
        Object obj = selectionView.f12301f.get(selectedPosition);
        AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.SimpleProgramList>");
        List m23702b = AbstractC5882y.m23702b(obj);
        if (selectionView.f12309n && selectedPosition == 0) {
            ((SimpleProgramList) m23702b.get(0)).setSelected(true);
        }
        selectionView.f12303h.m28854l(m23702b);
        HorizontalGridView horizontalGridView3 = selectionView.f12297b;
        if (horizontalGridView3 != null) {
            horizontalGridView3.setSelectedPosition(0);
        }
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0130  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m12247P(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.module.view.SelectionView.m12247P(android.view.View, int):void");
    }

    /* renamed from: w */
    private final int m12269w(int i10) {
        int i11 = this.f12299d;
        int i12 = i10 % i11;
        int i13 = i10 / i11;
        if (i12 != 0) {
            return i13 + 1;
        }
        return i13;
    }

    /* renamed from: y */
    private final void m12270y() {
        ViewParent viewParent;
        HorizontalGridView horizontalGridView = this.f12297b;
        if (horizontalGridView == null) {
            this.f12297b = new HorizontalGridView(getContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            layoutParams.height = AbstractC7786b.m30163g(72);
            HorizontalGridView horizontalGridView2 = this.f12297b;
            if (horizontalGridView2 != null) {
                horizontalGridView2.setLayoutParams(layoutParams);
            }
            HorizontalGridView horizontalGridView3 = this.f12297b;
            if (horizontalGridView3 != null) {
                horizontalGridView3.setClipChildren(false);
            }
            HorizontalGridView horizontalGridView4 = this.f12297b;
            if (horizontalGridView4 != null) {
                horizontalGridView4.setClipToPadding(false);
            }
            HorizontalGridView horizontalGridView5 = this.f12297b;
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
                HorizontalGridView horizontalGridView6 = this.f12297b;
                if (horizontalGridView6 != null) {
                    viewParent2 = horizontalGridView6.getParent();
                }
                AbstractC5868k.m23672d(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) viewParent2).removeView(this.f12297b);
            }
        }
        HorizontalGridView horizontalGridView7 = this.f12297b;
        if (horizontalGridView7 != null) {
            horizontalGridView7.setPadding(0, 0, AbstractC7786b.m30166j(90), 0);
        }
        this.f12303h.setHasStableIds(true);
        HorizontalGridView horizontalGridView8 = this.f12297b;
        if (horizontalGridView8 != null) {
            horizontalGridView8.setAdapter(this.f12303h);
        }
        addView(this.f12297b);
    }

    /* renamed from: z */
    private final void m12271z() {
        ViewParent viewParent;
        HorizontalGridView horizontalGridView = this.f12298c;
        if (horizontalGridView == null) {
            this.f12298c = new HorizontalGridView(getContext());
            AutoLinearLayout.C3911a c3911a = new AutoLinearLayout.C3911a(-1, -2);
            ((LinearLayout.LayoutParams) c3911a).height = AbstractC7786b.m30163g(70);
            HorizontalGridView horizontalGridView2 = this.f12298c;
            if (horizontalGridView2 != null) {
                horizontalGridView2.setLayoutParams(c3911a);
            }
            HorizontalGridView horizontalGridView3 = this.f12298c;
            if (horizontalGridView3 != null) {
                horizontalGridView3.setClipChildren(false);
            }
            HorizontalGridView horizontalGridView4 = this.f12298c;
            if (horizontalGridView4 != null) {
                horizontalGridView4.setClipToPadding(false);
            }
            HorizontalGridView horizontalGridView5 = this.f12298c;
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
                HorizontalGridView horizontalGridView6 = this.f12298c;
                if (horizontalGridView6 != null) {
                    viewParent2 = horizontalGridView6.getParent();
                }
                AbstractC5868k.m23672d(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) viewParent2).removeView(this.f12298c);
            }
        }
        HorizontalGridView horizontalGridView7 = this.f12298c;
        if (horizontalGridView7 != null) {
            horizontalGridView7.setPadding(0, AbstractC7786b.m30163g(20), AbstractC7786b.m30166j(90), 0);
        }
        HorizontalGridView horizontalGridView8 = this.f12298c;
        if (horizontalGridView8 != null) {
            horizontalGridView8.setAdapter(this.f12304i);
        }
        addView(this.f12298c);
    }

    /* renamed from: C */
    public final void m12272C() {
        HorizontalGridView horizontalGridView = this.f12298c;
        if (horizontalGridView != null) {
            horizontalGridView.setSelectedPosition(0);
        }
    }

    /* renamed from: D */
    public final void m12273D() {
        this.f12309n = true;
        this.f12303h.m28907t(true);
    }

    /* renamed from: H */
    public final void m12274H(int i10, int i11) {
        int m12269w = m12269w(i10 + 1) - 1;
        if (i11 == -1 && this.f12300e.size() > i10) {
            i11 = ((SimpleProgramList) this.f12300e.get(i10)).getSeriesNumber();
        }
        HorizontalGridView horizontalGridView = this.f12298c;
        if (horizontalGridView != null) {
            horizontalGridView.setSelectedPosition(m12269w);
        }
        this.f12303h.m28909v(i10, i11);
    }

    /* renamed from: J */
    public final void m12275J(ArrayList arrayList, final InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(arrayList, "list");
        if (this.f12300e.size() == arrayList.size() && this.f12300e.containsAll(arrayList)) {
            return;
        }
        int m12269w = m12269w(arrayList.size());
        this.f12300e.clear();
        this.f12302g.clear();
        this.f12301f.clear();
        this.f12300e.addAll(arrayList);
        Observable<Integer> range = Observable.range(0, m12269w);
        final C3024c c3024c = new C3024c(m12269w, arrayList, this);
        Observable compose = range.map(new Function() { // from class: db.b1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m12243L;
                m12243L = SelectionView.m12243L(InterfaceC5660l.this, obj);
                return m12243L;
            }
        }).compose(AbstractC7029f.m27120a());
        final C3025d c3025d = C3025d.f12319a;
        Consumer consumer = new Consumer() { // from class: db.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectionView.m12244M(InterfaceC5660l.this, obj);
            }
        };
        final C3026e c3026e = C3026e.f12320a;
        compose.subscribe(consumer, new Consumer() { // from class: db.d1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectionView.m12245N(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: db.e1
            @Override // io.reactivex.functions.Action
            public final void run() {
                SelectionView.m12246O(SelectionView.this, interfaceC5642a);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        View view;
        PopupWindow popupWindow;
        View focusedChild;
        int i10 = 0;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int keyCode = keyEvent.getKeyCode();
            View view2 = null;
            if (keyCode != 19) {
                if (keyCode == 20) {
                    HorizontalGridView horizontalGridView = this.f12297b;
                    if (horizontalGridView != null) {
                        view2 = horizontalGridView.getFocusedChild();
                    }
                    if (view2 != null) {
                        PopupWindow popupWindow2 = this.f12307l;
                        if (popupWindow2 != null) {
                            popupWindow2.dismiss();
                        }
                        HorizontalGridView horizontalGridView2 = this.f12298c;
                        if (horizontalGridView2 != null) {
                            horizontalGridView2.requestFocus(130);
                        }
                        i10 = 1;
                    }
                }
            } else {
                HorizontalGridView horizontalGridView3 = this.f12298c;
                if (horizontalGridView3 != null) {
                    view = horizontalGridView3.getFocusedChild();
                } else {
                    view = null;
                }
                if (view != null) {
                    HorizontalGridView horizontalGridView4 = this.f12297b;
                    if (horizontalGridView4 != null) {
                        horizontalGridView4.requestFocus(33);
                    }
                    HorizontalGridView horizontalGridView5 = this.f12297b;
                    if (horizontalGridView5 != null && (focusedChild = horizontalGridView5.getFocusedChild()) != null) {
                        HorizontalGridView horizontalGridView6 = this.f12297b;
                        if (horizontalGridView6 != null) {
                            i10 = horizontalGridView6.getSelectedPosition();
                        }
                        m12247P(focusedChild, i10);
                    }
                    i10 = 1;
                } else {
                    HorizontalGridView horizontalGridView7 = this.f12297b;
                    if (horizontalGridView7 != null) {
                        view2 = horizontalGridView7.getFocusedChild();
                    }
                    if (view2 != null && (popupWindow = this.f12307l) != null) {
                        popupWindow.dismiss();
                    }
                }
            }
        }
        if (i10 != 0) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        final View view;
        if (i10 == 130 && (view = this.f12308m) != null) {
            view.post(new Runnable() { // from class: db.f1
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionView.m12237B(SelectionView.this, view);
                }
            });
        }
        return super.requestFocus(i10, rect);
    }

    public final void setLeftRightPadding(int i10) {
        HorizontalGridView horizontalGridView = this.f12297b;
        if (horizontalGridView != null) {
            horizontalGridView.setPadding(AbstractC7786b.m30166j(i10), 0, AbstractC7786b.m30166j(i10), 0);
        }
        HorizontalGridView horizontalGridView2 = this.f12298c;
        if (horizontalGridView2 != null) {
            horizontalGridView2.setPadding(AbstractC7786b.m30166j(i10), AbstractC7786b.m30163g(10), AbstractC7786b.m30166j(i10), 0);
        }
    }

    public final void setOnItemClickListener(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f12305j = interfaceC5664p;
    }

    /* renamed from: v */
    public final void m12276v() {
        this.f12311p = 0;
        this.f12310o = 0;
    }

    /* renamed from: x */
    public final void m12277x() {
        PopupWindow popupWindow = this.f12307l;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
