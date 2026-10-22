package com.open.leanback.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0616q0;
import androidx.recyclerview.widget.AbstractC0824k;
import androidx.recyclerview.widget.C0821h;
import androidx.recyclerview.widget.RecyclerView;
import anet.channel.bytes.C0905a;
import anet.channel.entity.EventType;
import com.open.leanback.widget.AbstractC3051b;
import com.open.leanback.widget.C3062m;
import com.taobao.accs.data.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p214l.C5306d;
import p389x.C7458h0;

/* loaded from: classes2.dex */
public final class GridLayoutManager extends RecyclerView.AbstractC0797p {

    /* renamed from: S */
    private static final Rect f12422S = new Rect();

    /* renamed from: T */
    static int[] f12423T = new int[2];

    /* renamed from: A */
    private int f12424A;

    /* renamed from: B */
    private int f12425B;

    /* renamed from: C */
    private int f12426C;

    /* renamed from: D */
    private int f12427D;

    /* renamed from: E */
    private int f12428E;

    /* renamed from: G */
    int f12430G;

    /* renamed from: I */
    AbstractC3051b f12432I;

    /* renamed from: M */
    private int f12436M;

    /* renamed from: N */
    private int f12437N;

    /* renamed from: b */
    final AbstractC3050a f12443b;

    /* renamed from: g */
    RecyclerView.C0779b0 f12448g;

    /* renamed from: h */
    int f12449h;

    /* renamed from: i */
    int f12450i;

    /* renamed from: k */
    int[] f12452k;

    /* renamed from: l */
    RecyclerView.C0804w f12453l;

    /* renamed from: r */
    AbstractC3046d f12459r;

    /* renamed from: s */
    C3048f f12460s;

    /* renamed from: u */
    private int f12462u;

    /* renamed from: w */
    int f12464w;

    /* renamed from: x */
    private int f12465x;

    /* renamed from: y */
    private int f12466y;

    /* renamed from: z */
    private int[] f12467z;

    /* renamed from: a */
    int f12442a = 10;

    /* renamed from: c */
    int f12444c = 0;

    /* renamed from: d */
    private boolean f12445d = false;

    /* renamed from: e */
    private boolean f12446e = false;

    /* renamed from: f */
    private AbstractC0824k f12447f = AbstractC0824k.m4224a(this);

    /* renamed from: j */
    final SparseIntArray f12451j = new SparseIntArray();

    /* renamed from: m */
    int f12454m = 221696;

    /* renamed from: n */
    private InterfaceC3056g f12455n = null;

    /* renamed from: o */
    private ArrayList f12456o = null;

    /* renamed from: p */
    int f12457p = -1;

    /* renamed from: q */
    int f12458q = 0;

    /* renamed from: t */
    private int f12461t = 0;

    /* renamed from: F */
    private int f12429F = 8388659;

    /* renamed from: H */
    private int f12431H = 1;

    /* renamed from: J */
    private int f12433J = 0;

    /* renamed from: K */
    final C3062m f12434K = new C3062m();

    /* renamed from: L */
    private final C3052c f12435L = new C3052c();

    /* renamed from: O */
    private int[] f12438O = new int[2];

    /* renamed from: P */
    final C3061l f12439P = new C3061l();

    /* renamed from: Q */
    private final Runnable f12440Q = new RunnableC3043a();

    /* renamed from: R */
    private AbstractC3051b.b f12441R = new C3044b();

    /* renamed from: v */
    int f12463v = -1;

    /* renamed from: com.open.leanback.widget.GridLayoutManager$a */
    /* loaded from: classes2.dex */
    class RunnableC3043a implements Runnable {
        RunnableC3043a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GridLayoutManager.this.requestLayout();
        }
    }

    /* renamed from: com.open.leanback.widget.GridLayoutManager$b */
    /* loaded from: classes2.dex */
    class C3044b implements AbstractC3051b.b {
        C3044b() {
        }

        @Override // com.open.leanback.widget.AbstractC3051b.b
        /* renamed from: a */
        public int mo12483a() {
            return GridLayoutManager.this.f12449h;
        }

        @Override // com.open.leanback.widget.AbstractC3051b.b
        /* renamed from: b */
        public int mo12484b(int i10) {
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            return gridLayoutManager.m12438e0(gridLayoutManager.findViewByPosition(i10 - gridLayoutManager.f12449h));
        }

        @Override // com.open.leanback.widget.AbstractC3051b.b
        /* renamed from: c */
        public int mo12485c(int i10) {
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            View findViewByPosition = gridLayoutManager.findViewByPosition(i10 - gridLayoutManager.f12449h);
            GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
            if ((gridLayoutManager2.f12454m & 262144) != 0) {
                return gridLayoutManager2.m12434c0(findViewByPosition);
            }
            return gridLayoutManager2.m12436d0(findViewByPosition);
        }

        @Override // com.open.leanback.widget.AbstractC3051b.b
        /* renamed from: d */
        public void mo12486d(Object obj, int i10, int i11, int i12, int i13) {
            int m12616i;
            int i14;
            int i15;
            C3048f c3048f;
            View view = (View) obj;
            if (i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
                if (!GridLayoutManager.this.f12432I.m12553u()) {
                    m12616i = GridLayoutManager.this.f12434K.m12602a().m12614g();
                } else {
                    m12616i = GridLayoutManager.this.f12434K.m12602a().m12616i() - GridLayoutManager.this.f12434K.m12602a().m12613f();
                }
                i13 = m12616i;
            }
            if (!GridLayoutManager.this.f12432I.m12553u()) {
                i15 = i11 + i13;
                i14 = i13;
            } else {
                i14 = i13 - i11;
                i15 = i13;
            }
            int m12413N = GridLayoutManager.this.m12413N(i12) + GridLayoutManager.this.f12434K.m12604c().m12614g();
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            int i16 = m12413N - gridLayoutManager.f12464w;
            gridLayoutManager.f12439P.m12594g(view, i10);
            GridLayoutManager.this.m12471t0(i12, view, i14, i15, i16);
            if (!GridLayoutManager.this.f12448g.m3841h()) {
                GridLayoutManager.this.m12409G1();
            }
            GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
            if ((gridLayoutManager2.f12454m & 3) != 1 && (c3048f = gridLayoutManager2.f12460s) != null) {
                c3048f.m12505d();
            }
            GridLayoutManager.this.getClass();
        }

        @Override // com.open.leanback.widget.AbstractC3051b.b
        /* renamed from: e */
        public int mo12487e(int i10, boolean z10, Object[] objArr, boolean z11) {
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            View m12432b0 = gridLayoutManager.m12432b0(i10 - gridLayoutManager.f12449h);
            C3047e c3047e = (C3047e) m12432b0.getLayoutParams();
            AbstractC0272b.m941a(GridLayoutManager.this.m12399B(GridLayoutManager.this.f12443b.getChildViewHolder(m12432b0), AbstractC3053d.class));
            c3047e.m12503u(null);
            if (!c3047e.m3928d()) {
                if (z11) {
                    if (z10) {
                        GridLayoutManager.this.addDisappearingView(m12432b0);
                    } else {
                        GridLayoutManager.this.addDisappearingView(m12432b0, 0);
                    }
                } else if (z10) {
                    GridLayoutManager.this.addView(m12432b0);
                } else {
                    GridLayoutManager.this.addView(m12432b0, 0);
                }
                int i11 = GridLayoutManager.this.f12463v;
                if (i11 != -1) {
                    m12432b0.setVisibility(i11);
                }
                C3048f c3048f = GridLayoutManager.this.f12460s;
                if (c3048f != null) {
                    c3048f.m12506e();
                }
                int m12420T = GridLayoutManager.this.m12420T(m12432b0, m12432b0.findFocus());
                GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
                int i12 = gridLayoutManager2.f12454m;
                if ((i12 & 3) != 1) {
                    if (i10 == gridLayoutManager2.f12457p && m12420T == gridLayoutManager2.f12458q && gridLayoutManager2.f12460s == null) {
                        gridLayoutManager2.m12450k();
                    }
                } else if ((i12 & 4) == 0) {
                    if ((i12 & 16) == 0 && i10 == gridLayoutManager2.f12457p && m12420T == gridLayoutManager2.f12458q) {
                        gridLayoutManager2.m12450k();
                    } else if ((i12 & 16) != 0 && i10 >= gridLayoutManager2.f12457p && m12432b0.hasFocusable()) {
                        GridLayoutManager gridLayoutManager3 = GridLayoutManager.this;
                        gridLayoutManager3.f12457p = i10;
                        gridLayoutManager3.f12458q = m12420T;
                        gridLayoutManager3.f12454m &= -17;
                        gridLayoutManager3.m12450k();
                    }
                }
                GridLayoutManager.this.m12475w0(m12432b0);
            }
            objArr[0] = m12432b0;
            GridLayoutManager gridLayoutManager4 = GridLayoutManager.this;
            if (gridLayoutManager4.f12444c == 0) {
                return gridLayoutManager4.m12481z(m12432b0);
            }
            return gridLayoutManager4.m12479y(m12432b0);
        }

        @Override // com.open.leanback.widget.AbstractC3051b.b
        public int getCount() {
            return GridLayoutManager.this.f12448g.m3836c() + GridLayoutManager.this.f12449h;
        }

        @Override // com.open.leanback.widget.AbstractC3051b.b
        public void removeItem(int i10) {
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            View findViewByPosition = gridLayoutManager.findViewByPosition(i10 - gridLayoutManager.f12449h);
            GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
            if ((gridLayoutManager2.f12454m & 3) == 1) {
                gridLayoutManager2.detachAndScrapView(findViewByPosition, gridLayoutManager2.f12453l);
            } else {
                gridLayoutManager2.removeAndRecycleView(findViewByPosition, gridLayoutManager2.f12453l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.open.leanback.widget.GridLayoutManager$c */
    /* loaded from: classes2.dex */
    public class C3045c extends AbstractC3046d {
        C3045c() {
            super();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        public PointF computeScrollVectorForPosition(int i10) {
            if (getChildCount() == 0) {
                return null;
            }
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            boolean z10 = false;
            int position = gridLayoutManager.getPosition(gridLayoutManager.getChildAt(0));
            GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
            int i11 = 1;
            if ((gridLayoutManager2.f12454m & 262144) == 0 ? i10 < position : i10 > position) {
                z10 = true;
            }
            if (z10) {
                i11 = -1;
            }
            if (gridLayoutManager2.f12444c == 0) {
                return new PointF(i11, 0.0f);
            }
            return new PointF(0.0f, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.open.leanback.widget.GridLayoutManager$d */
    /* loaded from: classes2.dex */
    public abstract class AbstractC3046d extends C0821h {

        /* renamed from: a */
        boolean f12471a;

        AbstractC3046d() {
            super(GridLayoutManager.this.f12443b.getContext());
        }

        /* renamed from: c */
        protected void mo12488c() {
            View findViewByPosition = findViewByPosition(getTargetPosition());
            if (findViewByPosition == null) {
                if (getTargetPosition() >= 0) {
                    GridLayoutManager.this.m12415O0(getTargetPosition(), 0, false, 0);
                    return;
                }
                return;
            }
            if (GridLayoutManager.this.f12457p != getTargetPosition()) {
                GridLayoutManager.this.f12457p = getTargetPosition();
            }
            if (GridLayoutManager.this.hasFocus()) {
                GridLayoutManager.this.f12454m |= 32;
                findViewByPosition.requestFocus();
                GridLayoutManager.this.f12454m &= -33;
            }
            GridLayoutManager.this.m12450k();
            GridLayoutManager.this.m12452l();
        }

        @Override // androidx.recyclerview.widget.C0821h
        protected int calculateTimeForScrolling(int i10) {
            int calculateTimeForScrolling = super.calculateTimeForScrolling(i10);
            if (GridLayoutManager.this.f12434K.m12602a().m12616i() > 0) {
                float m12616i = (30.0f / GridLayoutManager.this.f12434K.m12602a().m12616i()) * i10;
                if (calculateTimeForScrolling < m12616i) {
                    return (int) m12616i;
                }
                return calculateTimeForScrolling;
            }
            return calculateTimeForScrolling;
        }

        @Override // androidx.recyclerview.widget.C0821h, androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        protected void onStop() {
            super.onStop();
            if (!this.f12471a) {
                mo12488c();
            }
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            if (gridLayoutManager.f12459r == this) {
                gridLayoutManager.f12459r = null;
            }
            if (gridLayoutManager.f12460s == this) {
                gridLayoutManager.f12460s = null;
            }
        }

        @Override // androidx.recyclerview.widget.C0821h, androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        protected void onTargetFound(View view, RecyclerView.C0779b0 c0779b0, RecyclerView.AbstractC0777a0.a aVar) {
            int i10;
            int i11;
            if (GridLayoutManager.this.m12414O(view, null, GridLayoutManager.f12423T)) {
                if (GridLayoutManager.this.f12444c == 0) {
                    int[] iArr = GridLayoutManager.f12423T;
                    i11 = iArr[0];
                    i10 = iArr[1];
                } else {
                    int[] iArr2 = GridLayoutManager.f12423T;
                    int i12 = iArr2[1];
                    i10 = iArr2[0];
                    i11 = i12;
                }
                aVar.m3833d(i11, i10, calculateTimeForDeceleration((int) Math.sqrt((i11 * i11) + (i10 * i10))), this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.open.leanback.widget.GridLayoutManager$e */
    /* loaded from: classes2.dex */
    public static final class C3047e extends RecyclerView.C0798q {

        /* renamed from: e */
        int f12473e;

        /* renamed from: f */
        int f12474f;

        /* renamed from: g */
        int f12475g;

        /* renamed from: h */
        int f12476h;

        /* renamed from: i */
        private int f12477i;

        /* renamed from: j */
        private int f12478j;

        /* renamed from: k */
        private int[] f12479k;

        public C3047e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: g */
        int[] m12489g() {
            return this.f12479k;
        }

        /* renamed from: h */
        int m12490h() {
            return this.f12477i;
        }

        /* renamed from: i */
        int m12491i() {
            return this.f12478j;
        }

        /* renamed from: j */
        AbstractC3053d m12492j() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public int m12493k(View view) {
            return (view.getHeight() - this.f12474f) - this.f12476h;
        }

        /* renamed from: l */
        int m12494l(View view) {
            return view.getLeft() + this.f12473e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m */
        public int m12495m() {
            return this.f12473e;
        }

        /* renamed from: n */
        int m12496n(View view) {
            return view.getRight() - this.f12475g;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public int m12497o() {
            return this.f12475g;
        }

        /* renamed from: p */
        int m12498p(View view) {
            return view.getTop() + this.f12474f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q */
        public int m12499q() {
            return this.f12474f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r */
        public int m12500r(View view) {
            return (view.getWidth() - this.f12473e) - this.f12475g;
        }

        /* renamed from: s */
        void m12501s(int i10) {
            this.f12477i = i10;
        }

        /* renamed from: t */
        void m12502t(int i10) {
            this.f12478j = i10;
        }

        /* renamed from: u */
        void m12503u(AbstractC3053d abstractC3053d) {
        }

        /* renamed from: v */
        void m12504v(int i10, int i11, int i12, int i13) {
            this.f12473e = i10;
            this.f12474f = i11;
            this.f12475g = i12;
            this.f12476h = i13;
        }

        public C3047e(int i10, int i11) {
            super(i10, i11);
        }

        public C3047e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C3047e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C3047e(RecyclerView.C0798q c0798q) {
            super(c0798q);
        }

        public C3047e(C3047e c3047e) {
            super((RecyclerView.C0798q) c3047e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.open.leanback.widget.GridLayoutManager$f */
    /* loaded from: classes2.dex */
    public final class C3048f extends AbstractC3046d {

        /* renamed from: c */
        private final boolean f12480c;

        /* renamed from: d */
        private int f12481d;

        C3048f(int i10, boolean z10) {
            super();
            this.f12481d = i10;
            this.f12480c = z10;
            setTargetPosition(-2);
        }

        @Override // com.open.leanback.widget.GridLayoutManager.AbstractC3046d
        /* renamed from: c */
        protected void mo12488c() {
            super.mo12488c();
            this.f12481d = 0;
            View findViewByPosition = findViewByPosition(getTargetPosition());
            if (findViewByPosition != null) {
                GridLayoutManager.this.m12417R0(findViewByPosition, true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        public PointF computeScrollVectorForPosition(int i10) {
            int i11;
            int i12 = this.f12481d;
            if (i12 == 0) {
                return null;
            }
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            if ((gridLayoutManager.f12454m & 262144) == 0 ? i12 < 0 : i12 > 0) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            if (gridLayoutManager.f12444c == 0) {
                return new PointF(i11, 0.0f);
            }
            return new PointF(0.0f, i11);
        }

        /* renamed from: d */
        void m12505d() {
            int i10;
            if (this.f12480c && (i10 = this.f12481d) != 0) {
                this.f12481d = GridLayoutManager.this.m12410H0(true, i10);
            }
            int i11 = this.f12481d;
            if (i11 == 0 || ((i11 > 0 && GridLayoutManager.this.m12455m0()) || (this.f12481d < 0 && GridLayoutManager.this.m12453l0()))) {
                setTargetPosition(GridLayoutManager.this.f12457p);
                stop();
            }
        }

        /* renamed from: e */
        void m12506e() {
            int i10;
            int i11;
            View findViewByPosition;
            if (!this.f12480c && (i10 = this.f12481d) != 0) {
                if (i10 > 0) {
                    GridLayoutManager gridLayoutManager = GridLayoutManager.this;
                    i11 = gridLayoutManager.f12457p + gridLayoutManager.f12430G;
                } else {
                    GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
                    i11 = gridLayoutManager2.f12457p - gridLayoutManager2.f12430G;
                }
                View view = null;
                while (this.f12481d != 0 && (findViewByPosition = findViewByPosition(i11)) != null) {
                    if (GridLayoutManager.this.m12446i(findViewByPosition)) {
                        GridLayoutManager gridLayoutManager3 = GridLayoutManager.this;
                        gridLayoutManager3.f12457p = i11;
                        gridLayoutManager3.f12458q = 0;
                        int i12 = this.f12481d;
                        if (i12 > 0) {
                            this.f12481d = i12 - 1;
                        } else {
                            this.f12481d = i12 + 1;
                        }
                        view = findViewByPosition;
                    }
                    if (this.f12481d > 0) {
                        i11 += GridLayoutManager.this.f12430G;
                    } else {
                        i11 -= GridLayoutManager.this.f12430G;
                    }
                }
                if (view != null && GridLayoutManager.this.hasFocus()) {
                    GridLayoutManager.this.f12454m |= 32;
                    view.requestFocus();
                    GridLayoutManager.this.f12454m &= -33;
                }
            }
        }

        /* renamed from: f */
        void m12507f() {
            int i10 = this.f12481d;
            if (i10 > (-GridLayoutManager.this.f12442a)) {
                this.f12481d = i10 - 1;
            }
        }

        /* renamed from: g */
        void m12508g() {
            int i10 = this.f12481d;
            if (i10 < GridLayoutManager.this.f12442a) {
                this.f12481d = i10 + 1;
            }
        }

        @Override // androidx.recyclerview.widget.C0821h
        protected void updateActionForInterimTarget(RecyclerView.AbstractC0777a0.a aVar) {
            if (this.f12481d == 0) {
                return;
            }
            super.updateActionForInterimTarget(aVar);
        }
    }

    public GridLayoutManager(AbstractC3050a abstractC3050a) {
        this.f12443b = abstractC3050a;
        setItemPrefetchEnabled(false);
    }

    /* renamed from: A1 */
    private void m12351A1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m12352B1(getChildAt(i10));
        }
    }

    /* renamed from: B1 */
    private void m12352B1(View view) {
        C3047e c3047e = (C3047e) view.getLayoutParams();
        c3047e.m12492j();
        c3047e.m12501s(this.f12435L.f12527c.m12561i(view));
        c3047e.m12502t(this.f12435L.f12526b.m12561i(view));
    }

    /* renamed from: D0 */
    private boolean m12353D0() {
        return this.f12432I.m12554v();
    }

    /* renamed from: E0 */
    private void m12354E0() {
        int i10;
        AbstractC3051b abstractC3051b = this.f12432I;
        if ((this.f12454m & 262144) != 0) {
            i10 = this.f12436M + this.f12437N + this.f12450i;
        } else {
            i10 = (-this.f12437N) - this.f12450i;
        }
        abstractC3051b.m12555w(i10);
    }

    /* renamed from: E1 */
    private void m12355E1() {
        int i10 = this.f12454m & (-1025);
        int i11 = 0;
        if (m12358G0(false)) {
            i11 = EventType.AUTH_FAIL;
        }
        int i12 = i10 | i11;
        this.f12454m = i12;
        if ((i12 & EventType.AUTH_FAIL) != 0) {
            m12387s();
        }
    }

    /* renamed from: F0 */
    private void m12356F0(boolean z10) {
        int i10;
        if (z10) {
            if (m12455m0()) {
                return;
            }
        } else if (m12453l0()) {
            return;
        }
        C3048f c3048f = this.f12460s;
        if (c3048f == null) {
            this.f12443b.stopScroll();
            boolean z11 = true;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            if (this.f12430G <= 1) {
                z11 = false;
            }
            C3048f c3048f2 = new C3048f(i10, z11);
            this.f12461t = 0;
            startSmoothScroll(c3048f2);
            return;
        }
        if (z10) {
            c3048f.m12508g();
        } else {
            c3048f.m12507f();
        }
    }

    /* renamed from: F1 */
    private void m12357F1() {
        this.f12434K.f12550c.m12631x(getWidth());
        this.f12434K.f12549b.m12631x(getHeight());
        this.f12434K.f12550c.m12627t(getPaddingLeft(), getPaddingRight());
        this.f12434K.f12549b.m12627t(getPaddingTop(), getPaddingBottom());
        this.f12436M = this.f12434K.m12602a().m12616i();
    }

    /* renamed from: G0 */
    private boolean m12358G0(boolean z10) {
        C5306d[] m12546n;
        C5306d c5306d;
        int m21382g;
        int m12481z;
        if (this.f12466y != 0 || this.f12467z == null) {
            return false;
        }
        AbstractC3051b abstractC3051b = this.f12432I;
        if (abstractC3051b == null) {
            m12546n = null;
        } else {
            m12546n = abstractC3051b.m12546n();
        }
        boolean z11 = false;
        int i10 = -1;
        for (int i11 = 0; i11 < this.f12430G; i11++) {
            if (m12546n == null) {
                c5306d = null;
            } else {
                c5306d = m12546n[i11];
            }
            if (c5306d == null) {
                m21382g = 0;
            } else {
                m21382g = c5306d.m21382g();
            }
            int i12 = -1;
            for (int i13 = 0; i13 < m21382g; i13 += 2) {
                int m21379d = c5306d.m21379d(i13 + 1);
                for (int m21379d2 = c5306d.m21379d(i13); m21379d2 <= m21379d; m21379d2++) {
                    View findViewByPosition = findViewByPosition(m21379d2 - this.f12449h);
                    if (findViewByPosition != null) {
                        if (z10) {
                            m12475w0(findViewByPosition);
                        }
                        if (this.f12444c == 0) {
                            m12481z = m12479y(findViewByPosition);
                        } else {
                            m12481z = m12481z(findViewByPosition);
                        }
                        if (m12481z > i12) {
                            i12 = m12481z;
                        }
                    }
                }
            }
            int m3836c = this.f12448g.m3836c();
            if (!this.f12443b.hasFixedSize() && z10 && i12 < 0 && m3836c > 0) {
                if (i10 < 0) {
                    int i14 = this.f12457p;
                    if (i14 < 0) {
                        i14 = 0;
                    } else if (i14 >= m3836c) {
                        i14 = m3836c - 1;
                    }
                    if (getChildCount() > 0) {
                        int layoutPosition = this.f12443b.getChildViewHolder(getChildAt(0)).getLayoutPosition();
                        int layoutPosition2 = this.f12443b.getChildViewHolder(getChildAt(getChildCount() - 1)).getLayoutPosition();
                        if (i14 >= layoutPosition && i14 <= layoutPosition2) {
                            i14 = i14 - layoutPosition <= layoutPosition2 - i14 ? layoutPosition - 1 : layoutPosition2 + 1;
                            if (i14 < 0 && layoutPosition2 < m3836c - 1) {
                                i14 = layoutPosition2 + 1;
                            } else if (i14 >= m3836c && layoutPosition > 0) {
                                i14 = layoutPosition - 1;
                            }
                        }
                    }
                    if (i14 >= 0 && i14 < m3836c) {
                        m12394x0(i14, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), this.f12438O);
                        if (this.f12444c == 0) {
                            i10 = this.f12438O[1];
                        } else {
                            i10 = this.f12438O[0];
                        }
                    }
                }
                if (i10 >= 0) {
                    i12 = i10;
                }
            }
            if (i12 < 0) {
                i12 = 0;
            }
            int[] iArr = this.f12467z;
            if (iArr[i11] != i12) {
                iArr[i11] = i12;
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m12359H(int r10) {
        /*
            r9 = this;
            int r0 = r9.f12444c
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 17
            if (r0 != 0) goto L2b
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r8) goto L25
            if (r10 == r3) goto L23
            if (r10 == r2) goto L1d
            if (r10 == r1) goto L1b
            goto L46
        L1b:
            r4 = 3
            goto L48
        L1d:
            int r10 = r9.f12454m
            r10 = r10 & r0
            if (r10 != 0) goto L48
            goto L38
        L23:
            r4 = 2
            goto L48
        L25:
            int r10 = r9.f12454m
            r10 = r10 & r0
            if (r10 != 0) goto L38
            goto L48
        L2b:
            if (r0 != r7) goto L46
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r8) goto L40
            if (r10 == r3) goto L48
            if (r10 == r2) goto L3a
            if (r10 == r1) goto L38
            goto L46
        L38:
            r4 = 1
            goto L48
        L3a:
            int r10 = r9.f12454m
            r10 = r10 & r0
            if (r10 != 0) goto L23
            goto L1b
        L40:
            int r10 = r9.f12454m
            r10 = r10 & r0
            if (r10 != 0) goto L1b
            goto L23
        L46:
            r4 = 17
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.GridLayoutManager.m12359H(int):int");
    }

    /* renamed from: H1 */
    private void m12360H1() {
        C3062m.a m12604c = this.f12434K.m12604c();
        int m12614g = m12604c.m12614g() - this.f12464w;
        int m12373R = m12373R() + m12614g;
        m12604c.m12607B(m12614g, m12373R, m12614g, m12373R);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m12361I(android.view.View r13, int[] r14) {
        /*
            r12 = this;
            int r0 = r12.m12389u(r13)
            int r1 = r12.m12436d0(r13)
            int r2 = r12.m12434c0(r13)
            com.open.leanback.widget.m r3 = r12.f12434K
            com.open.leanback.widget.m$a r3 = r3.m12602a()
            int r3 = r3.m12614g()
            com.open.leanback.widget.m r4 = r12.f12434K
            com.open.leanback.widget.m$a r4 = r4.m12602a()
            int r4 = r4.m12610c()
            com.open.leanback.widget.b r5 = r12.f12432I
            int r5 = r5.m12551s(r0)
            r6 = 1
            r7 = 0
            r8 = 2
            r9 = 0
            if (r1 >= r3) goto L6f
            int r1 = r12.f12433J
            if (r1 != r8) goto L6c
            r1 = r13
        L31:
            boolean r10 = r12.m12353D0()
            if (r10 == 0) goto L69
            com.open.leanback.widget.b r1 = r12.f12432I
            int r10 = r1.m12545m()
            l.d[] r1 = r1.mo12547o(r10, r0)
            r1 = r1[r5]
            int r10 = r1.m21379d(r7)
            android.view.View r10 = r12.findViewByPosition(r10)
            int r11 = r12.m12436d0(r10)
            int r11 = r2 - r11
            if (r11 <= r4) goto L67
            int r0 = r1.m21382g()
            if (r0 <= r8) goto L64
            int r0 = r1.m21379d(r8)
            android.view.View r0 = r12.findViewByPosition(r0)
            r2 = r9
            r9 = r0
            goto La5
        L64:
            r2 = r9
            r9 = r10
            goto La5
        L67:
            r1 = r10
            goto L31
        L69:
            r2 = r9
            r9 = r1
            goto La5
        L6c:
            r2 = r9
        L6d:
            r9 = r13
            goto La5
        L6f:
            int r10 = r4 + r3
            if (r2 <= r10) goto La4
            int r2 = r12.f12433J
            if (r2 != r8) goto La2
        L77:
            com.open.leanback.widget.b r2 = r12.f12432I
            int r8 = r2.m12548p()
            l.d[] r2 = r2.mo12547o(r0, r8)
            r2 = r2[r5]
            int r8 = r2.m21382g()
            int r8 = r8 - r6
            int r2 = r2.m21379d(r8)
            android.view.View r2 = r12.findViewByPosition(r2)
            int r8 = r12.m12434c0(r2)
            int r8 = r8 - r1
            if (r8 <= r4) goto L99
            r2 = r9
            goto L9f
        L99:
            boolean r8 = r12.m12378g()
            if (r8 != 0) goto L77
        L9f:
            if (r2 == 0) goto L6d
            goto La5
        La2:
            r2 = r13
            goto La5
        La4:
            r2 = r9
        La5:
            if (r9 == 0) goto Lad
            int r0 = r12.m12436d0(r9)
        Lab:
            int r0 = r0 - r3
            goto Lb6
        Lad:
            if (r2 == 0) goto Lb5
            int r0 = r12.m12434c0(r2)
            int r3 = r3 + r4
            goto Lab
        Lb5:
            r0 = 0
        Lb6:
            if (r9 == 0) goto Lba
            r13 = r9
            goto Lbd
        Lba:
            if (r2 == 0) goto Lbd
            r13 = r2
        Lbd:
            int r13 = r12.m12370P(r13)
            if (r0 != 0) goto Lc7
            if (r13 == 0) goto Lc6
            goto Lc7
        Lc6:
            return r7
        Lc7:
            r14[r7] = r0
            r14[r6] = r13
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.GridLayoutManager.m12361I(android.view.View, int[]):boolean");
    }

    /* renamed from: I0 */
    private void m12362I0() {
        int i10;
        int i11 = this.f12454m;
        if ((65600 & i11) == 65536) {
            AbstractC3051b abstractC3051b = this.f12432I;
            int i12 = this.f12457p;
            if ((i11 & 262144) != 0) {
                i10 = -this.f12437N;
            } else {
                i10 = this.f12436M + this.f12437N;
            }
            abstractC3051b.m12557y(i12, i10);
        }
    }

    /* renamed from: J0 */
    private void m12363J0() {
        int i10;
        int i11 = this.f12454m;
        if ((65600 & i11) == 65536) {
            AbstractC3051b abstractC3051b = this.f12432I;
            int i12 = this.f12457p;
            if ((i11 & 262144) != 0) {
                i10 = this.f12436M + this.f12437N;
            } else {
                i10 = -this.f12437N;
            }
            abstractC3051b.m12558z(i12, i10);
        }
    }

    /* renamed from: K0 */
    private void m12364K0(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (this.f12453l != null || this.f12448g != null) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.f12453l = c0804w;
        this.f12448g = c0779b0;
        this.f12449h = 0;
        this.f12450i = 0;
    }

    /* renamed from: L */
    private int m12365L(View view) {
        return this.f12434K.m12602a().m12615h(m12374X(view));
    }

    /* renamed from: L0 */
    private int m12366L0(int i10) {
        boolean z10;
        int m12612e;
        int i11 = this.f12454m;
        boolean z11 = true;
        if ((i11 & 64) == 0 && (i11 & 3) != 1 && (i10 <= 0 ? !(i10 >= 0 || this.f12434K.m12602a().m12623p() || i10 >= (m12612e = this.f12434K.m12602a().m12612e())) : !(this.f12434K.m12602a().m12622o() || i10 <= (m12612e = this.f12434K.m12602a().m12611d())))) {
            i10 = m12612e;
        }
        if (i10 == 0) {
            return 0;
        }
        m12395y0(-i10);
        if ((this.f12454m & 3) == 1) {
            m12409G1();
            return i10;
        }
        int childCount = getChildCount();
        if ((this.f12454m & 262144) == 0 ? i10 < 0 : i10 > 0) {
            m12354E0();
        } else {
            m12379h();
        }
        if (getChildCount() > childCount) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount2 = getChildCount();
        if ((262144 & this.f12454m) == 0 ? i10 < 0 : i10 > 0) {
            m12362I0();
        } else {
            m12363J0();
        }
        if (getChildCount() >= childCount2) {
            z11 = false;
        }
        if (z10 | z11) {
            m12355E1();
        }
        this.f12443b.invalidate();
        m12409G1();
        return i10;
    }

    /* renamed from: M */
    private int m12367M(int i10) {
        int i11 = this.f12466y;
        if (i11 != 0) {
            return i11;
        }
        int[] iArr = this.f12467z;
        if (iArr == null) {
            return 0;
        }
        return iArr[i10];
    }

    /* renamed from: M0 */
    private int m12368M0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        m12396z0(-i10);
        this.f12464w += i10;
        m12360H1();
        this.f12443b.invalidate();
        return i10;
    }

    /* renamed from: N0 */
    private void m12369N0(int i10, int i11, boolean z10) {
        if ((this.f12454m & 3) == 1) {
            m12366L0(i10);
            m12368M0(i11);
            return;
        }
        if (this.f12444c != 0) {
            i11 = i10;
            i10 = i11;
        }
        if (z10) {
            this.f12443b.smoothScrollBy(i10, i11);
        } else {
            this.f12443b.scrollBy(i10, i11);
            m12452l();
        }
    }

    /* renamed from: P */
    private int m12370P(View view) {
        return this.f12434K.m12604c().m12615h(m12375Y(view));
    }

    /* renamed from: P0 */
    private void m12371P0(View view, View view2, boolean z10) {
        m12372Q0(view, view2, z10, 0, 0);
    }

    /* renamed from: Q0 */
    private void m12372Q0(View view, View view2, boolean z10, int i10, int i11) {
        if ((this.f12454m & 64) != 0) {
            return;
        }
        int m12389u = m12389u(view);
        int m12420T = m12420T(view, view2);
        if (m12389u != this.f12457p || m12420T != this.f12458q) {
            this.f12457p = m12389u;
            this.f12458q = m12420T;
            this.f12461t = 0;
            if ((this.f12454m & 3) != 1) {
                m12450k();
            }
            if (this.f12443b.m12520f()) {
                this.f12443b.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && this.f12443b.hasFocus()) {
            view.requestFocus();
        }
        if ((this.f12454m & 131072) == 0 && z10) {
            return;
        }
        if (m12414O(view, view2, f12423T) || i10 != 0 || i11 != 0) {
            int[] iArr = f12423T;
            m12369N0(iArr[0] + i10, iArr[1] + i11, z10);
        }
    }

    /* renamed from: R */
    private int m12373R() {
        int i10;
        if ((this.f12454m & C0905a.MAX_POOL_SIZE) != 0) {
            i10 = 0;
        } else {
            i10 = this.f12430G - 1;
        }
        return m12413N(i10) + m12367M(i10);
    }

    /* renamed from: X */
    private int m12374X(View view) {
        if (this.f12444c == 0) {
            return m12376Z(view);
        }
        return m12377a0(view);
    }

    /* renamed from: Y */
    private int m12375Y(View view) {
        if (this.f12444c == 0) {
            return m12377a0(view);
        }
        return m12376Z(view);
    }

    /* renamed from: Z */
    private int m12376Z(View view) {
        C3047e c3047e = (C3047e) view.getLayoutParams();
        return c3047e.m12494l(view) + c3047e.m12490h();
    }

    /* renamed from: a0 */
    private int m12377a0(View view) {
        C3047e c3047e = (C3047e) view.getLayoutParams();
        return c3047e.m12498p(view) + c3047e.m12491i();
    }

    /* renamed from: g */
    private boolean m12378g() {
        return this.f12432I.m12534a();
    }

    /* renamed from: h */
    private void m12379h() {
        int i10;
        AbstractC3051b abstractC3051b = this.f12432I;
        if ((this.f12454m & 262144) != 0) {
            i10 = (-this.f12437N) - this.f12450i;
        } else {
            i10 = this.f12436M + this.f12437N + this.f12450i;
        }
        abstractC3051b.m12535b(i10);
    }

    /* renamed from: j */
    private void m12380j() {
        this.f12432I = null;
        this.f12467z = null;
        this.f12454m &= -1025;
    }

    /* renamed from: j0 */
    private boolean m12381j0(RecyclerView recyclerView, int i10, Rect rect) {
        View findViewByPosition = findViewByPosition(this.f12457p);
        if (findViewByPosition != null) {
            return findViewByPosition.requestFocus(i10, rect);
        }
        return false;
    }

    /* renamed from: k0 */
    private boolean m12382k0(RecyclerView recyclerView, int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        int m12614g = this.f12434K.m12602a().m12614g();
        int m12610c = this.f12434K.m12602a().m12610c() + m12614g;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && m12436d0(childAt) >= m12614g && m12434c0(childAt) <= m12610c && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    /* renamed from: m */
    private void m12383m() {
        AbstractC3051b.a mo12549q;
        int m12479y;
        int childCount = getChildCount();
        int m12545m = this.f12432I.m12545m();
        this.f12454m &= -9;
        boolean z10 = false;
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (m12545m == m12389u(childAt) && (mo12549q = this.f12432I.mo12549q(m12545m)) != null) {
                int m12413N = (m12413N(mo12549q.f12524a) + this.f12434K.m12604c().m12614g()) - this.f12464w;
                int m12436d0 = m12436d0(childAt);
                int m12438e0 = m12438e0(childAt);
                if (((C3047e) childAt.getLayoutParams()).m3930f()) {
                    this.f12454m |= 8;
                    detachAndScrapView(childAt, this.f12453l);
                    childAt = m12432b0(m12545m);
                    addView(childAt, i10);
                }
                View view = childAt;
                m12475w0(view);
                if (this.f12444c == 0) {
                    m12479y = m12481z(view);
                } else {
                    m12479y = m12479y(view);
                }
                m12471t0(mo12549q.f12524a, view, m12436d0, m12436d0 + m12479y, m12413N);
                if (m12438e0 == m12479y) {
                    i10++;
                    m12545m++;
                }
            }
            z10 = true;
        }
        if (z10) {
            int m12548p = this.f12432I.m12548p();
            for (int i11 = childCount - 1; i11 >= i10; i11--) {
                detachAndScrapView(getChildAt(i11), this.f12453l);
            }
            this.f12432I.mo12552t(m12545m);
            if ((this.f12454m & 65536) != 0) {
                m12379h();
                int i12 = this.f12457p;
                if (i12 >= 0 && i12 <= m12548p) {
                    while (this.f12432I.m12548p() < this.f12457p) {
                        this.f12432I.m12534a();
                    }
                }
            }
            while (this.f12432I.m12534a() && this.f12432I.m12548p() < m12548p) {
            }
        }
        m12409G1();
        m12360H1();
    }

    /* renamed from: o */
    private int m12384o(View view) {
        View findContainingItemView;
        AbstractC3050a abstractC3050a = this.f12443b;
        if (abstractC3050a != null && view != abstractC3050a && (findContainingItemView = findContainingItemView(view)) != null) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10) == findContainingItemView) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: p0 */
    private void m12385p0() {
        this.f12434K.m12603b();
        this.f12434K.f12550c.m12631x(getWidth());
        this.f12434K.f12549b.m12631x(getHeight());
        this.f12434K.f12550c.m12627t(getPaddingLeft(), getPaddingRight());
        this.f12434K.f12549b.m12627t(getPaddingTop(), getPaddingBottom());
        this.f12436M = this.f12434K.m12602a().m12616i();
        this.f12464w = 0;
    }

    /* renamed from: r */
    private void m12386r(boolean z10, boolean z11, int i10, int i11) {
        View findViewByPosition = findViewByPosition(this.f12457p);
        if (findViewByPosition != null && z11) {
            m12419S0(findViewByPosition, false, i10, i11);
        }
        if (findViewByPosition != null && z10 && !findViewByPosition.hasFocus()) {
            findViewByPosition.requestFocus();
            return;
        }
        if (!z10 && !this.f12443b.hasFocus()) {
            if (findViewByPosition != null && findViewByPosition.hasFocusable()) {
                this.f12443b.focusableViewAvailable(findViewByPosition);
            } else {
                int childCount = getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        findViewByPosition = getChildAt(i12);
                        if (findViewByPosition != null && findViewByPosition.hasFocusable()) {
                            this.f12443b.focusableViewAvailable(findViewByPosition);
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
            }
            if (z11 && findViewByPosition != null && findViewByPosition.hasFocus()) {
                m12419S0(findViewByPosition, false, i10, i11);
            }
        }
    }

    /* renamed from: s */
    private void m12387s() {
        AbstractC0616q0.m2620f0(this.f12443b, this.f12440Q);
    }

    /* renamed from: t */
    private int m12388t(int i10) {
        return m12389u(getChildAt(i10));
    }

    /* renamed from: u */
    private int m12389u(View view) {
        C3047e c3047e;
        if (view == null || (c3047e = (C3047e) view.getLayoutParams()) == null || c3047e.m3928d()) {
            return -1;
        }
        return c3047e.m3925a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r0 != r5.f12432I.m12553u()) goto L33;
     */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m12390u0() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r5.f12448g
            int r0 = r0.m3836c()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L10
            r5.f12457p = r1
            r5.f12458q = r3
            goto L22
        L10:
            int r4 = r5.f12457p
            if (r4 < r0) goto L1a
            int r0 = r0 - r2
            r5.f12457p = r0
            r5.f12458q = r3
            goto L22
        L1a:
            if (r4 != r1) goto L22
            if (r0 <= 0) goto L22
            r5.f12457p = r3
            r5.f12458q = r3
        L22:
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r5.f12448g
            boolean r0 = r0.m3835b()
            if (r0 != 0) goto L52
            com.open.leanback.widget.b r0 = r5.f12432I
            if (r0 == 0) goto L52
            int r0 = r0.m12545m()
            if (r0 < 0) goto L52
            int r0 = r5.f12454m
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L52
            com.open.leanback.widget.b r0 = r5.f12432I
            int r0 = r0.m12550r()
            int r1 = r5.f12430G
            if (r0 != r1) goto L52
            r5.m12357F1()
            r5.m12360H1()
            com.open.leanback.widget.b r0 = r5.f12432I
            int r1 = r5.f12427D
            r0.m12532F(r1)
            return r2
        L52:
            int r0 = r5.f12454m
            r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
            r5.f12454m = r0
            com.open.leanback.widget.b r0 = r5.f12432I
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == 0) goto L76
            int r4 = r5.f12430G
            int r0 = r0.m12550r()
            if (r4 != r0) goto L76
            int r0 = r5.f12454m
            r0 = r0 & r1
            if (r0 == 0) goto L6d
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            com.open.leanback.widget.b r4 = r5.f12432I
            boolean r4 = r4.m12553u()
            if (r0 == r4) goto L8f
        L76:
            int r0 = r5.f12430G
            com.open.leanback.widget.b r0 = com.open.leanback.widget.AbstractC3051b.m12527g(r0)
            r5.f12432I = r0
            com.open.leanback.widget.b$b r4 = r5.f12441R
            r0.m12530D(r4)
            com.open.leanback.widget.b r0 = r5.f12432I
            int r4 = r5.f12454m
            r1 = r1 & r4
            if (r1 == 0) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            r0.m12531E(r2)
        L8f:
            r5.m12385p0()
            r5.m12360H1()
            com.open.leanback.widget.b r0 = r5.f12432I
            int r1 = r5.f12427D
            r0.m12532F(r1)
            androidx.recyclerview.widget.RecyclerView$w r0 = r5.f12453l
            r5.detachAndScrapAttachedViews(r0)
            com.open.leanback.widget.b r0 = r5.f12432I
            r0.m12528A()
            com.open.leanback.widget.m r0 = r5.f12434K
            com.open.leanback.widget.m$a r0 = r0.m12602a()
            r0.m12621n()
            com.open.leanback.widget.m r0 = r5.f12434K
            com.open.leanback.widget.m$a r0 = r0.m12602a()
            r0.m12620m()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.GridLayoutManager.m12390u0():boolean");
    }

    /* renamed from: v */
    private int m12391v(int i10, View view, View view2) {
        int m12420T = m12420T(view, view2);
        if (m12420T != 0) {
            C3047e c3047e = (C3047e) view.getLayoutParams();
            return i10 + (c3047e.m12489g()[m12420T] - c3047e.m12489g()[0]);
        }
        return i10;
    }

    /* renamed from: v0 */
    private void m12392v0() {
        this.f12453l = null;
        this.f12448g = null;
        this.f12449h = 0;
        this.f12450i = 0;
    }

    /* renamed from: w */
    private boolean m12393w(View view, View view2, int[] iArr) {
        int m12365L = m12365L(view);
        if (view2 != null) {
            m12365L = m12391v(m12365L, view, view2);
        }
        int m12370P = m12370P(view);
        int i10 = m12365L + this.f12462u;
        if (i10 == 0 && m12370P == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = i10;
        iArr[1] = m12370P;
        return true;
    }

    /* renamed from: x0 */
    private void m12394x0(int i10, int i11, int i12, int[] iArr) {
        View m3983o = this.f12453l.m3983o(i10);
        if (m3983o != null) {
            C3047e c3047e = (C3047e) m3983o.getLayoutParams();
            Rect rect = f12422S;
            calculateItemDecorationsForChild(m3983o, rect);
            m3983o.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c3047e).leftMargin + ((ViewGroup.MarginLayoutParams) c3047e).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) c3047e).width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c3047e).topMargin + ((ViewGroup.MarginLayoutParams) c3047e).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) c3047e).height));
            iArr[0] = m12481z(m3983o);
            iArr[1] = m12479y(m3983o);
            this.f12453l.m3959G(m3983o);
        }
    }

    /* renamed from: y0 */
    private void m12395y0(int i10) {
        int childCount = getChildCount();
        int i11 = 0;
        if (this.f12444c == 1) {
            while (i11 < childCount) {
                getChildAt(i11).offsetTopAndBottom(i10);
                i11++;
            }
        } else {
            while (i11 < childCount) {
                getChildAt(i11).offsetLeftAndRight(i10);
                i11++;
            }
        }
    }

    /* renamed from: z0 */
    private void m12396z0(int i10) {
        int childCount = getChildCount();
        int i11 = 0;
        if (this.f12444c == 0) {
            while (i11 < childCount) {
                getChildAt(i11).offsetTopAndBottom(i10);
                i11++;
            }
        } else {
            while (i11 < childCount) {
                getChildAt(i11).offsetLeftAndRight(i10);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public int m12397A() {
        return this.f12437N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void m12398A0(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        int adapterPosition = abstractC0787f0.getAdapterPosition();
        if (adapterPosition != -1) {
            this.f12439P.m12597j(abstractC0787f0.itemView, adapterPosition);
        }
    }

    /* renamed from: B */
    Object m12399B(RecyclerView.AbstractC0787f0 abstractC0787f0, Class cls) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void m12400B0(boolean z10, int i10, Rect rect) {
        if (z10) {
            int i11 = this.f12457p;
            while (true) {
                View findViewByPosition = findViewByPosition(i11);
                if (findViewByPosition != null) {
                    if (findViewByPosition.getVisibility() == 0 && findViewByPosition.hasFocusable()) {
                        findViewByPosition.requestFocus();
                        return;
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: C */
    public int m12401C() {
        return this.f12433J;
    }

    /* renamed from: C0 */
    public void m12402C0(int i10) {
        int i11;
        boolean z10 = false;
        if (this.f12444c == 0) {
            if (i10 == 1) {
                i11 = 262144;
            }
            i11 = 0;
        } else {
            if (i10 == 1) {
                i11 = C0905a.MAX_POOL_SIZE;
            }
            i11 = 0;
        }
        int i12 = this.f12454m;
        if ((786432 & i12) == i11) {
            return;
        }
        this.f12454m = i11 | (i12 & (-786433)) | 256;
        C3062m.a aVar = this.f12434K.f12550c;
        if (i10 == 1) {
            z10 = true;
        }
        aVar.m12630w(z10);
    }

    /* renamed from: C1 */
    void m12403C1() {
        if (getChildCount() > 0) {
            this.f12449h = this.f12432I.m12545m() - ((C3047e) getChildAt(0).getLayoutParams()).m3926b();
        } else {
            this.f12449h = 0;
        }
    }

    /* renamed from: D */
    public int m12404D() {
        return this.f12425B;
    }

    /* renamed from: D1 */
    void m12405D1() {
        AbstractC3051b.a mo12549q;
        this.f12451j.clear();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            int oldPosition = this.f12443b.getChildViewHolder(getChildAt(i10)).getOldPosition();
            if (oldPosition >= 0 && (mo12549q = this.f12432I.mo12549q(oldPosition)) != null) {
                this.f12451j.put(oldPosition, mo12549q.f12524a);
            }
        }
    }

    /* renamed from: E */
    public int m12406E() {
        return this.f12435L.m12559a().m12562a();
    }

    /* renamed from: F */
    public float m12407F() {
        return this.f12435L.m12559a().m12563b();
    }

    /* renamed from: G */
    public int m12408G() {
        return this.f12435L.m12559a().m12564c();
    }

    /* renamed from: G1 */
    void m12409G1() {
        int m12545m;
        int m12548p;
        int m3836c;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f12448g.m3836c() == 0) {
            return;
        }
        if ((this.f12454m & 262144) == 0) {
            m12545m = this.f12432I.m12548p();
            i10 = this.f12448g.m3836c() - 1;
            m12548p = this.f12432I.m12545m();
            m3836c = 0;
        } else {
            m12545m = this.f12432I.m12545m();
            m12548p = this.f12432I.m12548p();
            m3836c = this.f12448g.m3836c() - 1;
            i10 = 0;
        }
        if (m12545m >= 0 && m12548p >= 0) {
            if (m12545m == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (m12548p == m3836c) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && this.f12434K.m12602a().m12622o() && !z11 && this.f12434K.m12602a().m12623p()) {
                return;
            }
            if (z10) {
                i11 = this.f12432I.m12542j(true, f12423T);
                View findViewByPosition = findViewByPosition(f12423T[1]);
                i12 = m12374X(findViewByPosition);
                int[] m12489g = ((C3047e) findViewByPosition.getLayoutParams()).m12489g();
                if (m12489g != null && m12489g.length > 0) {
                    i12 += m12489g[m12489g.length - 1] - m12489g[0];
                }
            } else {
                i11 = Integer.MAX_VALUE;
                i12 = Integer.MAX_VALUE;
            }
            if (z11) {
                i13 = this.f12432I.m12544l(false, f12423T);
                i14 = m12374X(findViewByPosition(f12423T[1]));
            } else {
                i13 = Integer.MIN_VALUE;
                i14 = Integer.MIN_VALUE;
            }
            this.f12434K.m12602a().m12607B(i13, i11, i14, i12);
        }
    }

    /* renamed from: H0 */
    int m12410H0(boolean z10, int i10) {
        int i11;
        int i12;
        AbstractC3051b abstractC3051b = this.f12432I;
        if (abstractC3051b == null) {
            return i10;
        }
        int i13 = this.f12457p;
        if (i13 != -1) {
            i11 = abstractC3051b.m12551s(i13);
        } else {
            i11 = -1;
        }
        int childCount = getChildCount();
        View view = null;
        for (int i14 = 0; i14 < childCount && i10 != 0; i14++) {
            if (i10 > 0) {
                i12 = i14;
            } else {
                i12 = (childCount - 1) - i14;
            }
            View childAt = getChildAt(i12);
            if (m12446i(childAt)) {
                int m12388t = m12388t(i12);
                int m12551s = this.f12432I.m12551s(m12388t);
                if (i11 == -1) {
                    i13 = m12388t;
                    view = childAt;
                    i11 = m12551s;
                } else if (m12551s == i11 && ((i10 > 0 && m12388t > i13) || (i10 < 0 && m12388t < i13))) {
                    i10 = i10 > 0 ? i10 - 1 : i10 + 1;
                    i13 = m12388t;
                    view = childAt;
                }
            }
        }
        if (view != null) {
            if (z10) {
                if (hasFocus()) {
                    this.f12454m |= 32;
                    view.requestFocus();
                    this.f12454m &= -33;
                }
                this.f12457p = i13;
                this.f12458q = 0;
            } else {
                m12417R0(view, true);
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final int m12411J(View view) {
        return ((C3047e) view.getLayoutParams()).m12494l(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final int m12412K(View view) {
        return ((C3047e) view.getLayoutParams()).m12496n(view);
    }

    /* renamed from: N */
    int m12413N(int i10) {
        int i11 = 0;
        if ((this.f12454m & C0905a.MAX_POOL_SIZE) != 0) {
            for (int i12 = this.f12430G - 1; i12 > i10; i12--) {
                i11 += m12367M(i12) + this.f12428E;
            }
            return i11;
        }
        int i13 = 0;
        while (i11 < i10) {
            i13 += m12367M(i11) + this.f12428E;
            i11++;
        }
        return i13;
    }

    /* renamed from: O */
    boolean m12414O(View view, View view2, int[] iArr) {
        int i10 = this.f12433J;
        if (i10 != 1 && i10 != 2) {
            return m12393w(view, view2, iArr);
        }
        return m12361I(view, iArr);
    }

    /* renamed from: O0 */
    void m12415O0(int i10, int i11, boolean z10, int i12) {
        this.f12462u = i12;
        View findViewByPosition = findViewByPosition(i10);
        boolean z11 = !isSmoothScrolling();
        if (z11 && !this.f12443b.isLayoutRequested() && findViewByPosition != null && m12389u(findViewByPosition) == i10) {
            this.f12454m |= 32;
            m12417R0(findViewByPosition, z10);
            this.f12454m &= -33;
            return;
        }
        int i13 = this.f12454m;
        if ((i13 & 512) != 0 && (i13 & 64) == 0) {
            if (z10 && !this.f12443b.isLayoutRequested()) {
                this.f12457p = i10;
                this.f12458q = i11;
                this.f12461t = Integer.MIN_VALUE;
                if (!m12458n0()) {
                    Log.w(m12424V(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                int m12482z1 = m12482z1(i10);
                if (m12482z1 != this.f12457p) {
                    this.f12457p = m12482z1;
                    this.f12458q = 0;
                    return;
                }
                return;
            }
            if (!z11) {
                m12480y1();
                this.f12443b.stopScroll();
            }
            if (!this.f12443b.isLayoutRequested() && findViewByPosition != null && m12389u(findViewByPosition) == i10) {
                this.f12454m |= 32;
                m12417R0(findViewByPosition, z10);
                this.f12454m &= -33;
                return;
            } else {
                this.f12457p = i10;
                this.f12458q = i11;
                this.f12461t = Integer.MIN_VALUE;
                this.f12454m |= 256;
                requestLayout();
                return;
            }
        }
        this.f12457p = i10;
        this.f12458q = i11;
        this.f12461t = Integer.MIN_VALUE;
    }

    /* renamed from: Q */
    public int m12416Q() {
        return this.f12457p;
    }

    /* renamed from: R0 */
    void m12417R0(View view, boolean z10) {
        View findFocus;
        if (view == null) {
            findFocus = null;
        } else {
            findFocus = view.findFocus();
        }
        m12371P0(view, findFocus, z10);
    }

    /* renamed from: S */
    int m12418S() {
        int i10;
        int left;
        int right;
        if (this.f12444c == 1) {
            i10 = -getHeight();
            if (getChildCount() <= 0 || (left = getChildAt(0).getTop()) >= 0) {
                return i10;
            }
        } else {
            if ((this.f12454m & 262144) != 0) {
                int width = getWidth();
                if (getChildCount() > 0 && (right = getChildAt(0).getRight()) > width) {
                    return right;
                }
                return width;
            }
            i10 = -getWidth();
            if (getChildCount() <= 0 || (left = getChildAt(0).getLeft()) >= 0) {
                return i10;
            }
        }
        return i10 + left;
    }

    /* renamed from: S0 */
    void m12419S0(View view, boolean z10, int i10, int i11) {
        View findFocus;
        if (view == null) {
            findFocus = null;
        } else {
            findFocus = view.findFocus();
        }
        m12372Q0(view, findFocus, z10, i10, i11);
    }

    /* renamed from: T */
    int m12420T(View view, View view2) {
        if (view != null && view2 != null) {
            ((C3047e) view.getLayoutParams()).m12492j();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m12421T0(int i10) {
        this.f12463v = i10;
        if (i10 != -1) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setVisibility(this.f12463v);
            }
        }
    }

    /* renamed from: U */
    public int m12422U() {
        return this.f12458q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void m12423U0(int i10) {
        int i11 = this.f12437N;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            this.f12437N = i10;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
    }

    /* renamed from: V */
    String m12424V() {
        return "GridLayoutManager:" + this.f12443b.getId();
    }

    /* renamed from: V0 */
    public void m12425V0(boolean z10, boolean z11) {
        int i10;
        int i11 = this.f12454m & (-6145);
        int i12 = 0;
        if (z10) {
            i10 = 2048;
        } else {
            i10 = 0;
        }
        int i13 = i10 | i11;
        if (z11) {
            i12 = 4096;
        }
        this.f12454m = i13 | i12;
    }

    /* renamed from: W */
    public int m12426W() {
        return this.f12426C;
    }

    /* renamed from: W0 */
    public void m12427W0(boolean z10, boolean z11) {
        int i10;
        int i11 = this.f12454m & (-24577);
        int i12 = 0;
        if (z10) {
            i10 = 8192;
        } else {
            i10 = 0;
        }
        int i13 = i10 | i11;
        if (z11) {
            i12 = 16384;
        }
        this.f12454m = i13 | i12;
    }

    /* renamed from: X0 */
    public void m12428X0(int i10) {
        this.f12433J = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void m12429Y0(boolean z10) {
        int i10;
        int i11 = this.f12454m & (-32769);
        if (z10) {
            i10 = Message.FLAG_DATA_TYPE;
        } else {
            i10 = 0;
        }
        this.f12454m = i10 | i11;
    }

    /* renamed from: Z0 */
    public void m12430Z0(boolean z10) {
        this.f12445d = z10;
    }

    /* renamed from: a1 */
    public void m12431a1(boolean z10) {
        this.f12446e = z10;
    }

    /* renamed from: b0 */
    protected View m12432b0(int i10) {
        return this.f12453l.m3983o(i10);
    }

    /* renamed from: b1 */
    public void m12433b1(int i10) {
        this.f12429F = i10;
    }

    /* renamed from: c0 */
    int m12434c0(View view) {
        return this.f12447f.mo4227d(view);
    }

    /* renamed from: c1 */
    public void m12435c1(int i10) {
        if (this.f12444c == 0) {
            this.f12425B = i10;
            this.f12427D = i10;
        } else {
            this.f12425B = i10;
            this.f12428E = i10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean canScrollHorizontally() {
        if (this.f12445d) {
            return false;
        }
        if (this.f12444c != 0 && this.f12430G <= 1) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean canScrollVertically() {
        if (this.f12446e) {
            return false;
        }
        if (this.f12444c != 1 && this.f12430G <= 1) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.C0779b0 c0779b0, RecyclerView.AbstractC0797p.c cVar) {
        int i12;
        try {
            m12364K0(null, c0779b0);
            if (this.f12444c != 0) {
                i10 = i11;
            }
            if (getChildCount() != 0 && i10 != 0) {
                if (i10 < 0) {
                    i12 = -this.f12437N;
                } else {
                    i12 = this.f12436M + this.f12437N;
                }
                this.f12432I.mo12539f(i12, i10, cVar);
            }
        } finally {
            m12392v0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void collectInitialPrefetchPositions(int i10, RecyclerView.AbstractC0797p.c cVar) {
        int i11 = this.f12443b.f12512l;
        if (i10 != 0 && i11 != 0) {
            int max = Math.max(0, Math.min(this.f12457p - ((i11 - 1) / 2), i10 - i11));
            for (int i12 = max; i12 < i10 && i12 < max + i11; i12++) {
                cVar.mo3924a(i12, 0);
            }
        }
    }

    /* renamed from: d0 */
    int m12436d0(View view) {
        return this.f12447f.mo4230g(view);
    }

    /* renamed from: d1 */
    public void m12437d1(int i10) {
        this.f12435L.m12559a().m12566e(i10);
        m12351A1();
    }

    /* renamed from: e0 */
    int m12438e0(View view) {
        Rect rect = f12422S;
        getDecoratedBoundsWithMargins(view, rect);
        if (this.f12444c == 0) {
            return rect.width();
        }
        return rect.height();
    }

    /* renamed from: e1 */
    public void m12439e1(float f10) {
        this.f12435L.m12559a().m12567f(f10);
        m12351A1();
    }

    /* renamed from: f0 */
    public int m12440f0() {
        return this.f12434K.m12602a().m12617j();
    }

    /* renamed from: f1 */
    public void m12441f1(boolean z10) {
        this.f12435L.m12559a().m12568g(z10);
        m12351A1();
    }

    /* renamed from: g0 */
    public int m12442g0() {
        return this.f12434K.m12602a().m12618k();
    }

    /* renamed from: g1 */
    public void m12443g1(int i10) {
        this.f12435L.m12559a().m12569h(i10);
        m12351A1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateDefaultLayoutParams() {
        return new C3047e(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C3047e(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int getColumnCountForAccessibility(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        AbstractC3051b abstractC3051b;
        if (this.f12444c == 1 && (abstractC3051b = this.f12432I) != null) {
            return abstractC3051b.m12550r();
        }
        return super.getColumnCountForAccessibility(c0804w, c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int getDecoratedBottom(View view) {
        return super.getDecoratedBottom(view) - ((C3047e) view.getLayoutParams()).f12476h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        C3047e c3047e = (C3047e) view.getLayoutParams();
        rect.left += c3047e.f12473e;
        rect.top += c3047e.f12474f;
        rect.right -= c3047e.f12475g;
        rect.bottom -= c3047e.f12476h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int getDecoratedLeft(View view) {
        return super.getDecoratedLeft(view) + ((C3047e) view.getLayoutParams()).f12473e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int getDecoratedRight(View view) {
        return super.getDecoratedRight(view) - ((C3047e) view.getLayoutParams()).f12475g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int getDecoratedTop(View view) {
        return super.getDecoratedTop(view) + ((C3047e) view.getLayoutParams()).f12474f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int getRowCountForAccessibility(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        AbstractC3051b abstractC3051b;
        if (this.f12444c == 0 && (abstractC3051b = this.f12432I) != null) {
            return abstractC3051b.m12550r();
        }
        return super.getRowCountForAccessibility(c0804w, c0779b0);
    }

    /* renamed from: h0 */
    public float m12444h0() {
        return this.f12434K.m12602a().m12619l();
    }

    /* renamed from: h1 */
    public void m12445h1(int i10) {
        this.f12425B = i10;
        this.f12426C = i10;
        this.f12428E = i10;
        this.f12427D = i10;
    }

    /* renamed from: i */
    boolean m12446i(View view) {
        if (view.getVisibility() == 0 && (!hasFocus() || view.hasFocusable())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public boolean m12447i0(RecyclerView recyclerView, int i10, Rect rect) {
        int i11 = this.f12433J;
        if (i11 != 1 && i11 != 2) {
            return m12381j0(recyclerView, i10, rect);
        }
        return m12382k0(recyclerView, i10, rect);
    }

    /* renamed from: i1 */
    public void m12448i1(boolean z10) {
        boolean z11;
        int i10 = this.f12454m;
        int i11 = 0;
        if ((i10 & 512) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            int i12 = i10 & (-513);
            if (z10) {
                i11 = 512;
            }
            this.f12454m = i12 | i11;
            requestLayout();
        }
    }

    /* renamed from: j1 */
    public void m12449j1(int i10) {
        if (i10 >= 0) {
            this.f12431H = i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    void m12450k() {
        View findViewByPosition;
        long itemId;
        if (this.f12455n == null && !m12460o0()) {
            return;
        }
        int i10 = this.f12457p;
        if (i10 == -1) {
            findViewByPosition = null;
        } else {
            findViewByPosition = findViewByPosition(i10);
        }
        if (findViewByPosition != null) {
            RecyclerView.AbstractC0787f0 childViewHolder = this.f12443b.getChildViewHolder(findViewByPosition);
            InterfaceC3056g interfaceC3056g = this.f12455n;
            if (interfaceC3056g != null) {
                AbstractC3050a abstractC3050a = this.f12443b;
                int i11 = this.f12457p;
                if (childViewHolder == null) {
                    itemId = -1;
                } else {
                    itemId = childViewHolder.getItemId();
                }
                interfaceC3056g.mo12571a(abstractC3050a, findViewByPosition, i11, itemId);
            }
            m12462p(this.f12443b, childViewHolder, this.f12457p, this.f12458q);
        } else {
            InterfaceC3056g interfaceC3056g2 = this.f12455n;
            if (interfaceC3056g2 != null) {
                interfaceC3056g2.mo12571a(this.f12443b, null, -1, -1L);
            }
            m12462p(this.f12443b, null, -1, 0);
        }
        if ((this.f12454m & 3) != 1 && !this.f12443b.isLayoutRequested()) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).isLayoutRequested()) {
                    m12387s();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void m12451k1(InterfaceC3055f interfaceC3055f) {
    }

    /* renamed from: l */
    void m12452l() {
        View findViewByPosition;
        if (!m12460o0()) {
            return;
        }
        int i10 = this.f12457p;
        if (i10 == -1) {
            findViewByPosition = null;
        } else {
            findViewByPosition = findViewByPosition(i10);
        }
        if (findViewByPosition != null) {
            m12464q(this.f12443b, this.f12443b.getChildViewHolder(findViewByPosition), this.f12457p, this.f12458q);
        } else {
            InterfaceC3056g interfaceC3056g = this.f12455n;
            if (interfaceC3056g != null) {
                interfaceC3056g.mo12571a(this.f12443b, null, -1, -1L);
            }
            m12464q(this.f12443b, null, -1, 0);
        }
    }

    /* renamed from: l0 */
    boolean m12453l0() {
        if (getItemCount() != 0 && this.f12443b.findViewHolderForAdapterPosition(0) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: l1 */
    public void m12454l1(InterfaceC3056g interfaceC3056g) {
        this.f12455n = interfaceC3056g;
    }

    /* renamed from: m0 */
    boolean m12455m0() {
        int itemCount = getItemCount();
        if (itemCount == 0 || this.f12443b.findViewHolderForAdapterPosition(itemCount - 1) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m1 */
    public void m12456m1(AbstractC3057h abstractC3057h) {
        if (abstractC3057h == null) {
            this.f12456o = null;
            return;
        }
        ArrayList arrayList = this.f12456o;
        if (arrayList == null) {
            this.f12456o = new ArrayList();
        } else {
            arrayList.clear();
        }
        this.f12456o.add(abstractC3057h);
    }

    /* renamed from: n */
    void m12457n() {
        int length;
        List m3979k = this.f12453l.m3979k();
        int size = m3979k.size();
        if (size == 0) {
            return;
        }
        int[] iArr = this.f12452k;
        if (iArr == null || size > iArr.length) {
            if (iArr == null) {
                length = 16;
            } else {
                length = iArr.length;
            }
            while (length < size) {
                length <<= 1;
            }
            this.f12452k = new int[length];
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int adapterPosition = ((RecyclerView.AbstractC0787f0) m3979k.get(i11)).getAdapterPosition();
            if (adapterPosition >= 0) {
                this.f12452k[i10] = adapterPosition;
                i10++;
            }
        }
        if (i10 > 0) {
            Arrays.sort(this.f12452k, 0, i10);
            this.f12432I.m12540h(this.f12452k, i10, this.f12451j);
        }
        this.f12451j.clear();
    }

    /* renamed from: n0 */
    protected boolean m12458n0() {
        if (this.f12432I != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n1 */
    public void m12459n1(boolean z10) {
        boolean z11;
        int i10 = this.f12454m;
        int i11 = 65536;
        if ((i10 & 65536) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            int i12 = i10 & (-65537);
            if (!z10) {
                i11 = 0;
            }
            this.f12454m = i12 | i11;
            if (z10) {
                requestLayout();
            }
        }
    }

    /* renamed from: o0 */
    boolean m12460o0() {
        ArrayList arrayList = this.f12456o;
        if (arrayList != null && arrayList.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o1 */
    public void m12461o1(int i10) {
        if (i10 < 0 && i10 != -2) {
            throw new IllegalArgumentException("Invalid row height: " + i10);
        }
        this.f12465x = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onAdapterChanged(RecyclerView.AbstractC0789h abstractC0789h, RecyclerView.AbstractC0789h abstractC0789h2) {
        if (abstractC0789h != null) {
            m12380j();
            this.f12457p = -1;
            this.f12461t = 0;
            this.f12439P.m12590b();
        }
        super.onAdapterChanged(abstractC0789h, abstractC0789h2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.GridLayoutManager.onAddFocusables(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onInitializeAccessibilityNodeInfo(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, C7458h0 c7458h0) {
        boolean z10;
        C7458h0.a aVar;
        C7458h0.a aVar2;
        m12364K0(c0804w, c0779b0);
        int m3836c = c0779b0.m3836c();
        if ((this.f12454m & 262144) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m3836c > 1 && !m12465q0(0)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.f12444c == 0) {
                    if (z10) {
                        aVar2 = C7458h0.a.f27498F;
                    } else {
                        aVar2 = C7458h0.a.f27496D;
                    }
                    c7458h0.m28604b(aVar2);
                } else {
                    c7458h0.m28604b(C7458h0.a.f27495C);
                }
            } else {
                c7458h0.m28602a(8192);
            }
            c7458h0.m28626o0(true);
        }
        if (m3836c > 1 && !m12465q0(m3836c - 1)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.f12444c == 0) {
                    if (z10) {
                        aVar = C7458h0.a.f27496D;
                    } else {
                        aVar = C7458h0.a.f27498F;
                    }
                    c7458h0.m28604b(aVar);
                } else {
                    c7458h0.m28604b(C7458h0.a.f27497E);
                }
            } else {
                c7458h0.m28602a(4096);
            }
            c7458h0.m28626o0(true);
        }
        c7458h0.m28601Z(C7458h0.b.m28643a(getRowCountForAccessibility(c0804w, c0779b0), getColumnCountForAccessibility(c0804w, c0779b0), isLayoutHierarchical(c0804w, c0779b0), getSelectionModeForAccessibility(c0804w, c0779b0)));
        m12392v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, View view, C7458h0 c7458h0) {
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f12432I != null && (layoutParams instanceof C3047e)) {
            int m3925a = ((C3047e) layoutParams).m3925a();
            if (m3925a >= 0) {
                i10 = this.f12432I.m12551s(m3925a);
            } else {
                i10 = -1;
            }
            if (i10 < 0) {
                return;
            }
            int m12550r = m3925a / this.f12432I.m12550r();
            if (this.f12444c == 0) {
                c7458h0.m28603a0(C7458h0.c.m28644a(i10, 1, m12550r, 1, false, false));
            } else {
                c7458h0.m28603a0(C7458h0.c.m28644a(m12550r, 1, i10, 1, false, false));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onInterceptFocusSearch(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.GridLayoutManager.onInterceptFocusSearch(android.view.View, int):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        AbstractC3051b abstractC3051b;
        int i12;
        if (this.f12457p != -1 && (abstractC3051b = this.f12432I) != null && abstractC3051b.m12545m() >= 0 && (i12 = this.f12461t) != Integer.MIN_VALUE && i10 <= this.f12457p + i12) {
            this.f12461t = i12 + i11;
        }
        this.f12439P.m12590b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f12461t = 0;
        this.f12439P.m12590b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        int i13;
        int i14 = this.f12457p;
        if (i14 != -1 && (i13 = this.f12461t) != Integer.MIN_VALUE) {
            int i15 = i14 + i13;
            if (i10 <= i15 && i15 < i10 + i12) {
                this.f12461t = i13 + (i11 - i10);
            } else if (i10 < i15 && i11 > i15 - i12) {
                this.f12461t = i13 - i12;
            } else if (i10 > i15 && i11 < i15) {
                this.f12461t = i13 + i12;
            }
        }
        this.f12439P.m12590b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        AbstractC3051b abstractC3051b;
        int i12;
        int i13;
        int i14;
        if (this.f12457p != -1 && (abstractC3051b = this.f12432I) != null && abstractC3051b.m12545m() >= 0 && (i12 = this.f12461t) != Integer.MIN_VALUE && i10 <= (i14 = (i13 = this.f12457p) + i12)) {
            if (i10 + i11 > i14) {
                this.f12457p = i13 + i12 + (i10 - i14);
                this.f12461t = Integer.MIN_VALUE;
            } else {
                this.f12461t = i12 - i11;
            }
        }
        this.f12439P.m12590b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            this.f12439P.m12595h(i10);
            i10++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 226
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.C0804w r13, androidx.recyclerview.widget.RecyclerView.C0779b0 r14) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.GridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onLayoutCompleted(RecyclerView.C0779b0 c0779b0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onMeasure(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, int i10, int i11) {
        int size;
        int size2;
        int mode;
        int paddingLeft;
        int paddingRight;
        m12364K0(c0804w, c0779b0);
        if (this.f12444c == 0) {
            size2 = View.MeasureSpec.getSize(i10);
            size = View.MeasureSpec.getSize(i11);
            mode = View.MeasureSpec.getMode(i11);
            paddingLeft = getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i10);
            size2 = View.MeasureSpec.getSize(i11);
            mode = View.MeasureSpec.getMode(i10);
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int i12 = paddingLeft + paddingRight;
        this.f12424A = size;
        int i13 = this.f12465x;
        if (i13 == -2) {
            int i14 = this.f12431H;
            if (i14 == 0) {
                i14 = 1;
            }
            this.f12430G = i14;
            this.f12466y = 0;
            int[] iArr = this.f12467z;
            if (iArr == null || iArr.length != i14) {
                this.f12467z = new int[i14];
            }
            if (this.f12448g.m3841h()) {
                m12403C1();
            }
            m12358G0(true);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode == 1073741824) {
                        size = this.f12424A;
                    } else {
                        throw new IllegalStateException("wrong spec");
                    }
                } else {
                    size = m12373R() + i12;
                }
            } else {
                size = Math.min(m12373R() + i12, this.f12424A);
            }
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalStateException("wrong spec");
                    }
                } else {
                    if (i13 == 0) {
                        i13 = size - i12;
                    }
                    this.f12466y = i13;
                    int i15 = this.f12431H;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    this.f12430G = i15;
                    size = (i13 * i15) + (this.f12428E * (i15 - 1)) + i12;
                }
            }
            int i16 = this.f12431H;
            if (i16 == 0 && i13 == 0) {
                this.f12430G = 1;
                this.f12466y = size - i12;
            } else if (i16 == 0) {
                this.f12466y = i13;
                int i17 = this.f12428E;
                this.f12430G = (size + i17) / (i13 + i17);
            } else if (i13 == 0) {
                this.f12430G = i16;
                this.f12466y = ((size - i12) - (this.f12428E * (i16 - 1))) / i16;
            } else {
                this.f12430G = i16;
                this.f12466y = i13;
            }
            if (mode == Integer.MIN_VALUE) {
                int i18 = this.f12466y;
                int i19 = this.f12430G;
                int i20 = (i18 * i19) + (this.f12428E * (i19 - 1)) + i12;
                if (i20 < size) {
                    size = i20;
                }
            }
        }
        if (this.f12444c == 0) {
            setMeasuredDimension(size2, size);
        } else {
            setMeasuredDimension(size, size2);
        }
        m12392v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        if ((this.f12454m & Message.FLAG_DATA_TYPE) == 0 && m12389u(view) != -1 && (this.f12454m & 35) == 0) {
            m12371P0(view, view2, true);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3049g)) {
            return;
        }
        C3049g c3049g = (C3049g) parcelable;
        this.f12457p = c3049g.f12483a;
        this.f12461t = 0;
        this.f12439P.m12593f(c3049g.f12484b);
        this.f12454m |= 256;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public Parcelable onSaveInstanceState() {
        C3049g c3049g = new C3049g();
        c3049g.f12483a = m12416Q();
        Bundle m12596i = this.f12439P.m12596i();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int m12389u = m12389u(childAt);
            if (m12389u != -1) {
                m12596i = this.f12439P.m12598k(m12596i, childAt, m12389u);
            }
        }
        c3049g.f12484b = m12596i;
        return c3049g;
    }

    /* renamed from: p */
    void m12462p(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
        ArrayList arrayList = this.f12456o;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC3057h) this.f12456o.get(size)).mo11995a(recyclerView, abstractC0787f0, i10, i11);
        }
    }

    /* renamed from: p1 */
    public void m12463p1(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f12454m;
        int i12 = 0;
        if ((i11 & 131072) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            int i13 = i11 & (-131073);
            if (z10) {
                i12 = 131072;
            }
            int i14 = i13 | i12;
            this.f12454m = i14;
            if ((i14 & 131072) != 0 && this.f12433J == 0 && (i10 = this.f12457p) != -1) {
                m12415O0(i10, this.f12458q, true, this.f12462u);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r7 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r5 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r7 == p389x.C7458h0.a.f27497E.m28640b()) goto L16;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.C0804w r5, androidx.recyclerview.widget.RecyclerView.C0779b0 r6, int r7, android.os.Bundle r8) {
        /*
            r4 = this;
            boolean r8 = r4.m12467r0()
            r0 = 1
            if (r8 != 0) goto L8
            return r0
        L8:
            r4.m12364K0(r5, r6)
            int r5 = r4.f12454m
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            r6 = 0
            if (r5 == 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r8 < r1) goto L51
            int r8 = r4.f12444c
            if (r8 != 0) goto L3f
            x.h0$a r8 = p389x.C7458h0.a.f27496D
            int r8 = r8.m28640b()
            if (r7 != r8) goto L34
            if (r5 == 0) goto L31
        L2e:
            r7 = 4096(0x1000, float:5.74E-42)
            goto L51
        L31:
            r7 = 8192(0x2000, float:1.14794E-41)
            goto L51
        L34:
            x.h0$a r8 = p389x.C7458h0.a.f27498F
            int r8 = r8.m28640b()
            if (r7 != r8) goto L51
            if (r5 == 0) goto L2e
            goto L31
        L3f:
            x.h0$a r5 = p389x.C7458h0.a.f27495C
            int r5 = r5.m28640b()
            if (r7 != r5) goto L48
            goto L31
        L48:
            x.h0$a r5 = p389x.C7458h0.a.f27497E
            int r5 = r5.m28640b()
            if (r7 != r5) goto L51
            goto L2e
        L51:
            if (r7 == r3) goto L5e
            if (r7 == r2) goto L56
            goto L64
        L56:
            r4.m12356F0(r6)
            r5 = -1
            r4.m12410H0(r6, r5)
            goto L64
        L5e:
            r4.m12356F0(r0)
            r4.m12410H0(r6, r0)
        L64:
            r4.m12392v0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.GridLayoutManager.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
    }

    /* renamed from: q */
    void m12464q(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
        ArrayList arrayList = this.f12456o;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC3057h) this.f12456o.get(size)).m12572b(recyclerView, abstractC0787f0, i10, i11);
        }
    }

    /* renamed from: q0 */
    boolean m12465q0(int i10) {
        RecyclerView.AbstractC0787f0 findViewHolderForAdapterPosition = this.f12443b.findViewHolderForAdapterPosition(i10);
        if (findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.itemView.getLeft() < 0 || findViewHolderForAdapterPosition.itemView.getRight() > this.f12443b.getWidth() || findViewHolderForAdapterPosition.itemView.getTop() < 0 || findViewHolderForAdapterPosition.itemView.getBottom() > this.f12443b.getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: q1 */
    public void m12466q1(int i10, int i11) {
        m12468r1(i10, 0, false, i11);
    }

    /* renamed from: r0 */
    public boolean m12467r0() {
        if ((this.f12454m & 131072) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r1 */
    public void m12468r1(int i10, int i11, boolean z10, int i12) {
        if ((this.f12457p != i10 && i10 != -1) || i11 != this.f12458q || i12 != this.f12462u) {
            m12415O0(i10, i11, z10, i12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void removeAndRecycleAllViews(RecyclerView.C0804w c0804w) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            removeAndRecycleViewAt(childCount, c0804w);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean m12469s0() {
        if ((this.f12454m & 64) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s1 */
    public void m12470s1(int i10) {
        m12468r1(i10, 0, true, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int scrollHorizontallyBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        int m12368M0;
        if ((this.f12454m & 512) != 0 && m12458n0()) {
            m12364K0(c0804w, c0779b0);
            this.f12454m = (this.f12454m & (-4)) | 2;
            if (this.f12444c == 0) {
                m12368M0 = m12366L0(i10);
            } else {
                m12368M0 = m12368M0(i10);
            }
            m12392v0();
            this.f12454m &= -4;
            return m12368M0;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void scrollToPosition(int i10) {
        m12468r1(i10, 0, false, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int scrollVerticallyBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        int m12368M0;
        if ((this.f12454m & 512) != 0 && m12458n0()) {
            this.f12454m = (this.f12454m & (-4)) | 2;
            m12364K0(c0804w, c0779b0);
            if (this.f12444c == 1) {
                m12368M0 = m12366L0(i10);
            } else {
                m12368M0 = m12368M0(i10);
            }
            m12392v0();
            this.f12454m &= -4;
            return m12368M0;
        }
        return 0;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            return;
        }
        this.f12444c = i10;
        this.f12447f = AbstractC0824k.m4225b(this, i10);
        this.f12434K.m12605d(i10);
        this.f12435L.m12560b(i10);
        this.f12454m |= 256;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0, int i10) {
        m12468r1(i10, 0, true, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void startSmoothScroll(RecyclerView.AbstractC0777a0 abstractC0777a0) {
        m12480y1();
        super.startSmoothScroll(abstractC0777a0);
        if (abstractC0777a0.isRunning() && (abstractC0777a0 instanceof AbstractC3046d)) {
            AbstractC3046d abstractC3046d = (AbstractC3046d) abstractC0777a0;
            this.f12459r = abstractC3046d;
            if (abstractC3046d instanceof C3048f) {
                this.f12460s = (C3048f) abstractC3046d;
                return;
            } else {
                this.f12460s = null;
                return;
            }
        }
        this.f12459r = null;
        this.f12460s = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean supportsPredictiveItemAnimations() {
        return true;
    }

    /* renamed from: t0 */
    void m12471t0(int i10, View view, int i11, int i12, int i13) {
        int m12481z;
        int i14;
        int m12367M;
        int i15;
        if (this.f12444c == 0) {
            m12481z = m12479y(view);
        } else {
            m12481z = m12481z(view);
        }
        int i16 = this.f12466y;
        if (i16 > 0) {
            m12481z = Math.min(m12481z, i16);
        }
        int i17 = this.f12429F;
        int i18 = i17 & 112;
        if ((this.f12454m & 786432) != 0) {
            i14 = Gravity.getAbsoluteGravity(i17 & 8388615, 1);
        } else {
            i14 = i17 & 7;
        }
        int i19 = this.f12444c;
        if ((i19 != 0 || i18 != 48) && (i19 != 1 || i14 != 3)) {
            if ((i19 == 0 && i18 == 80) || (i19 == 1 && i14 == 5)) {
                m12367M = m12367M(i10) - m12481z;
            } else if ((i19 == 0 && i18 == 16) || (i19 == 1 && i14 == 1)) {
                m12367M = (m12367M(i10) - m12481z) / 2;
            }
            i13 += m12367M;
        }
        if (this.f12444c == 0) {
            i15 = m12481z + i13;
        } else {
            int i20 = m12481z + i13;
            int i21 = i13;
            i13 = i11;
            i11 = i21;
            i15 = i12;
            i12 = i20;
        }
        C3047e c3047e = (C3047e) view.getLayoutParams();
        layoutDecoratedWithMargins(view, i11, i13, i12, i15);
        Rect rect = f12422S;
        super.getDecoratedBoundsWithMargins(view, rect);
        c3047e.m12504v(i11 - rect.left, i13 - rect.top, rect.right - i12, rect.bottom - i15);
        m12352B1(view);
    }

    /* renamed from: t1 */
    public void m12472t1(int i10, int i11, int i12) {
        m12468r1(i10, i11, false, i12);
    }

    /* renamed from: u1 */
    public void m12473u1(int i10) {
        if (this.f12444c == 1) {
            this.f12426C = i10;
            this.f12427D = i10;
        } else {
            this.f12426C = i10;
            this.f12428E = i10;
        }
    }

    /* renamed from: v1 */
    public void m12474v1(int i10) {
        this.f12434K.m12602a().m12632y(i10);
    }

    /* renamed from: w0 */
    void m12475w0(View view) {
        int makeMeasureSpec;
        int childMeasureSpec;
        int i10;
        C3047e c3047e = (C3047e) view.getLayoutParams();
        Rect rect = f12422S;
        calculateItemDecorationsForChild(view, rect);
        int i11 = ((ViewGroup.MarginLayoutParams) c3047e).leftMargin + ((ViewGroup.MarginLayoutParams) c3047e).rightMargin + rect.left + rect.right;
        int i12 = ((ViewGroup.MarginLayoutParams) c3047e).topMargin + ((ViewGroup.MarginLayoutParams) c3047e).bottomMargin + rect.top + rect.bottom;
        if (this.f12465x == -2) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f12466y, 1073741824);
        }
        if (this.f12444c == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i11, ((ViewGroup.MarginLayoutParams) c3047e).width);
            i10 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i12, ((ViewGroup.MarginLayoutParams) c3047e).height);
        } else {
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i12, ((ViewGroup.MarginLayoutParams) c3047e).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i11, ((ViewGroup.MarginLayoutParams) c3047e).width);
            i10 = childMeasureSpec2;
        }
        view.measure(childMeasureSpec, i10);
    }

    /* renamed from: w1 */
    public void m12476w1(int i10) {
        this.f12434K.m12602a().m12633z(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m12477x(RecyclerView recyclerView, int i10, int i11) {
        View findViewByPosition = findViewByPosition(this.f12457p);
        if (findViewByPosition == null) {
            return i11;
        }
        int indexOfChild = recyclerView.indexOfChild(findViewByPosition);
        if (i11 < indexOfChild) {
            return i11;
        }
        if (i11 < i10 - 1) {
            return ((indexOfChild + i10) - 1) - i11;
        }
        return indexOfChild;
    }

    /* renamed from: x1 */
    public void m12478x1(float f10) {
        this.f12434K.m12602a().m12606A(f10);
    }

    /* renamed from: y */
    int m12479y(View view) {
        C3047e c3047e = (C3047e) view.getLayoutParams();
        return getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c3047e).topMargin + ((ViewGroup.MarginLayoutParams) c3047e).bottomMargin;
    }

    /* renamed from: y1 */
    void m12480y1() {
        AbstractC3046d abstractC3046d = this.f12459r;
        if (abstractC3046d != null) {
            abstractC3046d.f12471a = true;
        }
    }

    /* renamed from: z */
    int m12481z(View view) {
        C3047e c3047e = (C3047e) view.getLayoutParams();
        return getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c3047e).leftMargin + ((ViewGroup.MarginLayoutParams) c3047e).rightMargin;
    }

    /* renamed from: z1 */
    int m12482z1(int i10) {
        C3045c c3045c = new C3045c();
        c3045c.setTargetPosition(i10);
        startSmoothScroll(c3045c);
        return c3045c.getTargetPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C3047e) {
            return new C3047e((C3047e) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.C0798q) {
            return new C3047e((RecyclerView.C0798q) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C3047e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C3047e(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.open.leanback.widget.GridLayoutManager$g */
    /* loaded from: classes2.dex */
    public static final class C3049g implements Parcelable {
        public static final Parcelable.Creator<C3049g> CREATOR = new a();

        /* renamed from: a */
        int f12483a;

        /* renamed from: b */
        Bundle f12484b;

        /* renamed from: com.open.leanback.widget.GridLayoutManager$g$a */
        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C3049g createFromParcel(Parcel parcel) {
                return new C3049g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C3049g[] newArray(int i10) {
                return new C3049g[i10];
            }
        }

        C3049g(Parcel parcel) {
            this.f12484b = Bundle.EMPTY;
            this.f12483a = parcel.readInt();
            this.f12484b = parcel.readBundle(GridLayoutManager.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f12483a);
            parcel.writeBundle(this.f12484b);
        }

        C3049g() {
            this.f12484b = Bundle.EMPTY;
        }
    }
}
