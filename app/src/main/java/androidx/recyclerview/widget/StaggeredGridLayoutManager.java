package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0797p implements RecyclerView.AbstractC0777a0.b {

    /* renamed from: b */
    C0813f[] f3287b;

    /* renamed from: c */
    AbstractC0824k f3288c;

    /* renamed from: d */
    AbstractC0824k f3289d;

    /* renamed from: e */
    private int f3290e;

    /* renamed from: f */
    private int f3291f;

    /* renamed from: g */
    private final C0820g f3292g;

    /* renamed from: j */
    private BitSet f3295j;

    /* renamed from: o */
    private boolean f3300o;

    /* renamed from: p */
    private boolean f3301p;

    /* renamed from: q */
    private C0812e f3302q;

    /* renamed from: r */
    private int f3303r;

    /* renamed from: w */
    private int[] f3308w;

    /* renamed from: a */
    private int f3286a = -1;

    /* renamed from: h */
    boolean f3293h = false;

    /* renamed from: i */
    boolean f3294i = false;

    /* renamed from: k */
    int f3296k = -1;

    /* renamed from: l */
    int f3297l = Integer.MIN_VALUE;

    /* renamed from: m */
    C0811d f3298m = new C0811d();

    /* renamed from: n */
    private int f3299n = 2;

    /* renamed from: s */
    private final Rect f3304s = new Rect();

    /* renamed from: t */
    private final C0809b f3305t = new C0809b();

    /* renamed from: u */
    private boolean f3306u = false;

    /* renamed from: v */
    private boolean f3307v = true;

    /* renamed from: x */
    private final Runnable f3309x = new RunnableC0808a();

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    class RunnableC0808a implements Runnable {
        RunnableC0808a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m4046m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C0809b {

        /* renamed from: a */
        int f3311a;

        /* renamed from: b */
        int f3312b;

        /* renamed from: c */
        boolean f3313c;

        /* renamed from: d */
        boolean f3314d;

        /* renamed from: e */
        boolean f3315e;

        /* renamed from: f */
        int[] f3316f;

        C0809b() {
            m4052c();
        }

        /* renamed from: a */
        void m4050a() {
            int mo4236m;
            if (this.f3313c) {
                mo4236m = StaggeredGridLayoutManager.this.f3288c.mo4232i();
            } else {
                mo4236m = StaggeredGridLayoutManager.this.f3288c.mo4236m();
            }
            this.f3312b = mo4236m;
        }

        /* renamed from: b */
        void m4051b(int i10) {
            if (this.f3313c) {
                this.f3312b = StaggeredGridLayoutManager.this.f3288c.mo4232i() - i10;
            } else {
                this.f3312b = StaggeredGridLayoutManager.this.f3288c.mo4236m() + i10;
            }
        }

        /* renamed from: c */
        void m4052c() {
            this.f3311a = -1;
            this.f3312b = Integer.MIN_VALUE;
            this.f3313c = false;
            this.f3314d = false;
            this.f3315e = false;
            int[] iArr = this.f3316f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m4053d(C0813f[] c0813fArr) {
            int length = c0813fArr.length;
            int[] iArr = this.f3316f;
            if (iArr == null || iArr.length < length) {
                this.f3316f = new int[StaggeredGridLayoutManager.this.f3287b.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3316f[i10] = c0813fArr[i10].m4092p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0810c extends RecyclerView.C0798q {

        /* renamed from: e */
        C0813f f3318e;

        /* renamed from: f */
        boolean f3319f;

        public C0810c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: g */
        public boolean m4054g() {
            return this.f3319f;
        }

        public C0810c(int i10, int i11) {
            super(i10, i11);
        }

        public C0810c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0810c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: classes.dex */
    public static class C0812e implements Parcelable {
        public static final Parcelable.Creator<C0812e> CREATOR = new a();

        /* renamed from: a */
        int f3326a;

        /* renamed from: b */
        int f3327b;

        /* renamed from: c */
        int f3328c;

        /* renamed from: d */
        int[] f3329d;

        /* renamed from: e */
        int f3330e;

        /* renamed from: f */
        int[] f3331f;

        /* renamed from: g */
        List f3332g;

        /* renamed from: h */
        boolean f3333h;

        /* renamed from: i */
        boolean f3334i;

        /* renamed from: j */
        boolean f3335j;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0812e createFromParcel(Parcel parcel) {
                return new C0812e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0812e[] newArray(int i10) {
                return new C0812e[i10];
            }
        }

        public C0812e() {
        }

        /* renamed from: a */
        void m4073a() {
            this.f3329d = null;
            this.f3328c = 0;
            this.f3326a = -1;
            this.f3327b = -1;
        }

        /* renamed from: b */
        void m4074b() {
            this.f3329d = null;
            this.f3328c = 0;
            this.f3330e = 0;
            this.f3331f = null;
            this.f3332g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3326a);
            parcel.writeInt(this.f3327b);
            parcel.writeInt(this.f3328c);
            if (this.f3328c > 0) {
                parcel.writeIntArray(this.f3329d);
            }
            parcel.writeInt(this.f3330e);
            if (this.f3330e > 0) {
                parcel.writeIntArray(this.f3331f);
            }
            parcel.writeInt(this.f3333h ? 1 : 0);
            parcel.writeInt(this.f3334i ? 1 : 0);
            parcel.writeInt(this.f3335j ? 1 : 0);
            parcel.writeList(this.f3332g);
        }

        C0812e(Parcel parcel) {
            this.f3326a = parcel.readInt();
            this.f3327b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3328c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3329d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3330e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3331f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3333h = parcel.readInt() == 1;
            this.f3334i = parcel.readInt() == 1;
            this.f3335j = parcel.readInt() == 1;
            this.f3332g = parcel.readArrayList(C0811d.a.class.getClassLoader());
        }

        public C0812e(C0812e c0812e) {
            this.f3328c = c0812e.f3328c;
            this.f3326a = c0812e.f3326a;
            this.f3327b = c0812e.f3327b;
            this.f3329d = c0812e.f3329d;
            this.f3330e = c0812e.f3330e;
            this.f3331f = c0812e.f3331f;
            this.f3333h = c0812e.f3333h;
            this.f3334i = c0812e.f3334i;
            this.f3335j = c0812e.f3335j;
            this.f3332g = c0812e.f3332g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: classes.dex */
    public class C0813f {

        /* renamed from: a */
        ArrayList f3336a = new ArrayList();

        /* renamed from: b */
        int f3337b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3338c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3339d = 0;

        /* renamed from: e */
        final int f3340e;

        C0813f(int i10) {
            this.f3340e = i10;
        }

        /* renamed from: a */
        void m4077a(View view) {
            C0810c m4090n = m4090n(view);
            m4090n.f3318e = this;
            this.f3336a.add(view);
            this.f3338c = Integer.MIN_VALUE;
            if (this.f3336a.size() == 1) {
                this.f3337b = Integer.MIN_VALUE;
            }
            if (m4090n.m3928d() || m4090n.m3927c()) {
                this.f3339d += StaggeredGridLayoutManager.this.f3288c.mo4228e(view);
            }
        }

        /* renamed from: b */
        void m4078b(boolean z10, int i10) {
            int m4092p;
            if (z10) {
                m4092p = m4088l(Integer.MIN_VALUE);
            } else {
                m4092p = m4092p(Integer.MIN_VALUE);
            }
            m4081e();
            if (m4092p == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || m4092p >= StaggeredGridLayoutManager.this.f3288c.mo4232i()) {
                if (!z10 && m4092p > StaggeredGridLayoutManager.this.f3288c.mo4236m()) {
                    return;
                }
                if (i10 != Integer.MIN_VALUE) {
                    m4092p += i10;
                }
                this.f3338c = m4092p;
                this.f3337b = m4092p;
            }
        }

        /* renamed from: c */
        void m4079c() {
            C0811d.a m4063f;
            ArrayList arrayList = this.f3336a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C0810c m4090n = m4090n(view);
            this.f3338c = StaggeredGridLayoutManager.this.f3288c.mo4227d(view);
            if (m4090n.f3319f && (m4063f = StaggeredGridLayoutManager.this.f3298m.m4063f(m4090n.m3926b())) != null && m4063f.f3323b == 1) {
                this.f3338c += m4063f.m4070a(this.f3340e);
            }
        }

        /* renamed from: d */
        void m4080d() {
            C0811d.a m4063f;
            View view = (View) this.f3336a.get(0);
            C0810c m4090n = m4090n(view);
            this.f3337b = StaggeredGridLayoutManager.this.f3288c.mo4230g(view);
            if (m4090n.f3319f && (m4063f = StaggeredGridLayoutManager.this.f3298m.m4063f(m4090n.m3926b())) != null && m4063f.f3323b == -1) {
                this.f3337b -= m4063f.m4070a(this.f3340e);
            }
        }

        /* renamed from: e */
        void m4081e() {
            this.f3336a.clear();
            m4093q();
            this.f3339d = 0;
        }

        /* renamed from: f */
        public int m4082f() {
            if (StaggeredGridLayoutManager.this.f3293h) {
                return m4085i(this.f3336a.size() - 1, -1, true);
            }
            return m4085i(0, this.f3336a.size(), true);
        }

        /* renamed from: g */
        public int m4083g() {
            if (StaggeredGridLayoutManager.this.f3293h) {
                return m4085i(0, this.f3336a.size(), true);
            }
            return m4085i(this.f3336a.size() - 1, -1, true);
        }

        /* renamed from: h */
        int m4084h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int i12;
            boolean z13;
            int mo4236m = StaggeredGridLayoutManager.this.f3288c.mo4236m();
            int mo4232i = StaggeredGridLayoutManager.this.f3288c.mo4232i();
            if (i11 > i10) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            while (i10 != i11) {
                View view = (View) this.f3336a.get(i10);
                int mo4230g = StaggeredGridLayoutManager.this.f3288c.mo4230g(view);
                int mo4227d = StaggeredGridLayoutManager.this.f3288c.mo4227d(view);
                boolean z14 = false;
                if (!z12 ? mo4230g < mo4232i : mo4230g <= mo4232i) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z12 ? mo4227d > mo4236m : mo4227d >= mo4236m) {
                    z14 = true;
                }
                if (z13 && z14) {
                    if (z10 && z11) {
                        if (mo4230g >= mo4236m && mo4227d <= mo4232i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (mo4230g < mo4236m || mo4227d > mo4232i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i10 += i12;
            }
            return -1;
        }

        /* renamed from: i */
        int m4085i(int i10, int i11, boolean z10) {
            return m4084h(i10, i11, false, false, z10);
        }

        /* renamed from: j */
        public int m4086j() {
            return this.f3339d;
        }

        /* renamed from: k */
        int m4087k() {
            int i10 = this.f3338c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            m4079c();
            return this.f3338c;
        }

        /* renamed from: l */
        int m4088l(int i10) {
            int i11 = this.f3338c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3336a.size() == 0) {
                return i10;
            }
            m4079c();
            return this.f3338c;
        }

        /* renamed from: m */
        public View m4089m(int i10, int i11) {
            View view = null;
            if (i11 == -1) {
                int size = this.f3336a.size();
                int i12 = 0;
                while (i12 < size) {
                    View view2 = (View) this.f3336a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3293h && staggeredGridLayoutManager.getPosition(view2) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3293h && staggeredGridLayoutManager2.getPosition(view2) >= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view2;
                }
            } else {
                int size2 = this.f3336a.size() - 1;
                while (size2 >= 0) {
                    View view3 = (View) this.f3336a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3293h && staggeredGridLayoutManager3.getPosition(view3) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3293h && staggeredGridLayoutManager4.getPosition(view3) <= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        C0810c m4090n(View view) {
            return (C0810c) view.getLayoutParams();
        }

        /* renamed from: o */
        int m4091o() {
            int i10 = this.f3337b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            m4080d();
            return this.f3337b;
        }

        /* renamed from: p */
        int m4092p(int i10) {
            int i11 = this.f3337b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3336a.size() == 0) {
                return i10;
            }
            m4080d();
            return this.f3337b;
        }

        /* renamed from: q */
        void m4093q() {
            this.f3337b = Integer.MIN_VALUE;
            this.f3338c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        void m4094r(int i10) {
            int i11 = this.f3337b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3337b = i11 + i10;
            }
            int i12 = this.f3338c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3338c = i12 + i10;
            }
        }

        /* renamed from: s */
        void m4095s() {
            int size = this.f3336a.size();
            View view = (View) this.f3336a.remove(size - 1);
            C0810c m4090n = m4090n(view);
            m4090n.f3318e = null;
            if (m4090n.m3928d() || m4090n.m3927c()) {
                this.f3339d -= StaggeredGridLayoutManager.this.f3288c.mo4228e(view);
            }
            if (size == 1) {
                this.f3337b = Integer.MIN_VALUE;
            }
            this.f3338c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        void m4096t() {
            View view = (View) this.f3336a.remove(0);
            C0810c m4090n = m4090n(view);
            m4090n.f3318e = null;
            if (this.f3336a.size() == 0) {
                this.f3338c = Integer.MIN_VALUE;
            }
            if (m4090n.m3928d() || m4090n.m3927c()) {
                this.f3339d -= StaggeredGridLayoutManager.this.f3288c.mo4228e(view);
            }
            this.f3337b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m4097u(View view) {
            C0810c m4090n = m4090n(view);
            m4090n.f3318e = this;
            this.f3336a.add(0, view);
            this.f3337b = Integer.MIN_VALUE;
            if (this.f3336a.size() == 1) {
                this.f3338c = Integer.MIN_VALUE;
            }
            if (m4090n.m3928d() || m4090n.m3927c()) {
                this.f3339d += StaggeredGridLayoutManager.this.f3288c.mo4228e(view);
            }
        }

        /* renamed from: v */
        void m4098v(int i10) {
            this.f3337b = i10;
            this.f3338c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.AbstractC0797p.d properties = RecyclerView.AbstractC0797p.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f3261a);
        setSpanCount(properties.f3262b);
        setReverseLayout(properties.f3263c);
        this.f3292g = new C0820g();
        m4032t();
    }

    /* renamed from: A */
    private void m3998A(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, boolean z10) {
        int mo4232i;
        int m4000E = m4000E(Integer.MIN_VALUE);
        if (m4000E != Integer.MIN_VALUE && (mo4232i = this.f3288c.mo4232i() - m4000E) > 0) {
            int i10 = mo4232i - (-scrollBy(-mo4232i, c0804w, c0779b0));
            if (z10 && i10 > 0) {
                this.f3288c.mo4241r(i10);
            }
        }
    }

    /* renamed from: B */
    private void m3999B(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, boolean z10) {
        int mo4236m;
        int m4003H = m4003H(Integer.MAX_VALUE);
        if (m4003H != Integer.MAX_VALUE && (mo4236m = m4003H - this.f3288c.mo4236m()) > 0) {
            int scrollBy = mo4236m - scrollBy(mo4236m, c0804w, c0779b0);
            if (z10 && scrollBy > 0) {
                this.f3288c.mo4241r(-scrollBy);
            }
        }
    }

    /* renamed from: E */
    private int m4000E(int i10) {
        int m4088l = this.f3287b[0].m4088l(i10);
        for (int i11 = 1; i11 < this.f3286a; i11++) {
            int m4088l2 = this.f3287b[i11].m4088l(i10);
            if (m4088l2 > m4088l) {
                m4088l = m4088l2;
            }
        }
        return m4088l;
    }

    /* renamed from: F */
    private int m4001F(int i10) {
        int m4092p = this.f3287b[0].m4092p(i10);
        for (int i11 = 1; i11 < this.f3286a; i11++) {
            int m4092p2 = this.f3287b[i11].m4092p(i10);
            if (m4092p2 > m4092p) {
                m4092p = m4092p2;
            }
        }
        return m4092p;
    }

    /* renamed from: G */
    private int m4002G(int i10) {
        int m4088l = this.f3287b[0].m4088l(i10);
        for (int i11 = 1; i11 < this.f3286a; i11++) {
            int m4088l2 = this.f3287b[i11].m4088l(i10);
            if (m4088l2 < m4088l) {
                m4088l = m4088l2;
            }
        }
        return m4088l;
    }

    /* renamed from: H */
    private int m4003H(int i10) {
        int m4092p = this.f3287b[0].m4092p(i10);
        for (int i11 = 1; i11 < this.f3286a; i11++) {
            int m4092p2 = this.f3287b[i11].m4092p(i10);
            if (m4092p2 < m4092p) {
                m4092p = m4092p2;
            }
        }
        return m4092p;
    }

    /* renamed from: I */
    private C0813f m4004I(C0820g c0820g) {
        int i10;
        int i11;
        int i12;
        if (m4009P(c0820g.f3469e)) {
            i11 = this.f3286a - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f3286a;
            i11 = 0;
            i12 = 1;
        }
        C0813f c0813f = null;
        if (c0820g.f3469e == 1) {
            int mo4236m = this.f3288c.mo4236m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                C0813f c0813f2 = this.f3287b[i11];
                int m4088l = c0813f2.m4088l(mo4236m);
                if (m4088l < i13) {
                    c0813f = c0813f2;
                    i13 = m4088l;
                }
                i11 += i12;
            }
            return c0813f;
        }
        int mo4232i = this.f3288c.mo4232i();
        int i14 = Integer.MIN_VALUE;
        while (i11 != i10) {
            C0813f c0813f3 = this.f3287b[i11];
            int m4092p = c0813f3.m4092p(mo4232i);
            if (m4092p > i14) {
                c0813f = c0813f3;
                i14 = m4092p;
            }
            i11 += i12;
        }
        return c0813f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4005J(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3294i
            if (r0 == 0) goto L9
            int r0 = r6.m4037D()
            goto Ld
        L9:
            int r0 = r6.m4036C()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3298m
            r4.m4065h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3298m
            r9.m4067k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3298m
            r7.m4066j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3298m
            r9.m4067k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3298m
            r9.m4066j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f3294i
            if (r7 == 0) goto L4d
            int r7 = r6.m4036C()
            goto L51
        L4d:
            int r7 = r6.m4037D()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4005J(int, int, int):void");
    }

    /* renamed from: M */
    private void m4006M(View view, int i10, int i11, boolean z10) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.f3304s);
        C0810c c0810c = (C0810c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0810c).leftMargin;
        Rect rect = this.f3304s;
        int m4021f0 = m4021f0(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) c0810c).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) c0810c).topMargin;
        Rect rect2 = this.f3304s;
        int m4021f02 = m4021f0(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) c0810c).bottomMargin + rect2.bottom);
        if (z10) {
            shouldMeasureChild = shouldReMeasureChild(view, m4021f0, m4021f02, c0810c);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, m4021f0, m4021f02, c0810c);
        }
        if (shouldMeasureChild) {
            view.measure(m4021f0, m4021f02);
        }
    }

    /* renamed from: N */
    private void m4007N(View view, C0810c c0810c, boolean z10) {
        if (c0810c.f3319f) {
            if (this.f3290e == 1) {
                m4006M(view, this.f3303r, RecyclerView.AbstractC0797p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c0810c).height, true), z10);
                return;
            } else {
                m4006M(view, RecyclerView.AbstractC0797p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c0810c).width, true), this.f3303r, z10);
                return;
            }
        }
        if (this.f3290e == 1) {
            m4006M(view, RecyclerView.AbstractC0797p.getChildMeasureSpec(this.f3291f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) c0810c).width, false), RecyclerView.AbstractC0797p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c0810c).height, true), z10);
        } else {
            m4006M(view, RecyclerView.AbstractC0797p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c0810c).width, true), RecyclerView.AbstractC0797p.getChildMeasureSpec(this.f3291f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c0810c).height, false), z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        if (m4046m() != false) goto L90;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4008O(androidx.recyclerview.widget.RecyclerView.C0804w r9, androidx.recyclerview.widget.RecyclerView.C0779b0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4008O(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    /* renamed from: P */
    private boolean m4009P(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f3290e == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f3294i) {
                return true;
            }
            return false;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f3294i) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private void m4010R(View view) {
        for (int i10 = this.f3286a - 1; i10 >= 0; i10--) {
            this.f3287b[i10].m4097u(view);
        }
    }

    /* renamed from: S */
    private void m4011S(RecyclerView.C0804w c0804w, C0820g c0820g) {
        int min;
        int min2;
        if (c0820g.f3465a && !c0820g.f3473i) {
            if (c0820g.f3466b == 0) {
                if (c0820g.f3469e == -1) {
                    m4012T(c0804w, c0820g.f3471g);
                    return;
                } else {
                    m4013U(c0804w, c0820g.f3470f);
                    return;
                }
            }
            if (c0820g.f3469e == -1) {
                int i10 = c0820g.f3470f;
                int m4001F = i10 - m4001F(i10);
                if (m4001F < 0) {
                    min2 = c0820g.f3471g;
                } else {
                    min2 = c0820g.f3471g - Math.min(m4001F, c0820g.f3466b);
                }
                m4012T(c0804w, min2);
                return;
            }
            int m4002G = m4002G(c0820g.f3471g) - c0820g.f3471g;
            if (m4002G < 0) {
                min = c0820g.f3470f;
            } else {
                min = Math.min(m4002G, c0820g.f3466b) + c0820g.f3470f;
            }
            m4013U(c0804w, min);
        }
    }

    /* renamed from: T */
    private void m4012T(RecyclerView.C0804w c0804w, int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f3288c.mo4230g(childAt) >= i10 && this.f3288c.mo4240q(childAt) >= i10) {
                C0810c c0810c = (C0810c) childAt.getLayoutParams();
                if (c0810c.f3319f) {
                    for (int i11 = 0; i11 < this.f3286a; i11++) {
                        if (this.f3287b[i11].f3336a.size() == 1) {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f3286a; i12++) {
                        this.f3287b[i12].m4095s();
                    }
                } else if (c0810c.f3318e.f3336a.size() == 1) {
                    return;
                } else {
                    c0810c.f3318e.m4095s();
                }
                removeAndRecycleView(childAt, c0804w);
            } else {
                return;
            }
        }
    }

    /* renamed from: U */
    private void m4013U(RecyclerView.C0804w c0804w, int i10) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f3288c.mo4227d(childAt) <= i10 && this.f3288c.mo4239p(childAt) <= i10) {
                C0810c c0810c = (C0810c) childAt.getLayoutParams();
                if (c0810c.f3319f) {
                    for (int i11 = 0; i11 < this.f3286a; i11++) {
                        if (this.f3287b[i11].f3336a.size() == 1) {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f3286a; i12++) {
                        this.f3287b[i12].m4096t();
                    }
                } else if (c0810c.f3318e.f3336a.size() == 1) {
                    return;
                } else {
                    c0810c.f3318e.m4096t();
                }
                removeAndRecycleView(childAt, c0804w);
            } else {
                return;
            }
        }
    }

    /* renamed from: V */
    private void m4014V() {
        if (this.f3289d.mo4234k() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float mo4228e = this.f3289d.mo4228e(childAt);
            if (mo4228e >= f10) {
                if (((C0810c) childAt.getLayoutParams()).m4054g()) {
                    mo4228e = (mo4228e * 1.0f) / this.f3286a;
                }
                f10 = Math.max(f10, mo4228e);
            }
        }
        int i11 = this.f3291f;
        int round = Math.round(f10 * this.f3286a);
        if (this.f3289d.mo4234k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f3289d.mo4237n());
        }
        m4043d0(round);
        if (this.f3291f == i11) {
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            C0810c c0810c = (C0810c) childAt2.getLayoutParams();
            if (!c0810c.f3319f) {
                if (isLayoutRTL() && this.f3290e == 1) {
                    int i13 = this.f3286a;
                    int i14 = c0810c.f3318e.f3340e;
                    childAt2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f3291f) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = c0810c.f3318e.f3340e;
                    int i16 = this.f3291f * i15;
                    int i17 = i15 * i11;
                    if (this.f3290e == 1) {
                        childAt2.offsetLeftAndRight(i16 - i17);
                    } else {
                        childAt2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    /* renamed from: W */
    private void m4015W() {
        if (this.f3290e != 1 && isLayoutRTL()) {
            this.f3294i = !this.f3293h;
        } else {
            this.f3294i = this.f3293h;
        }
    }

    /* renamed from: X */
    private void m4016X(int i10) {
        boolean z10;
        C0820g c0820g = this.f3292g;
        c0820g.f3469e = i10;
        boolean z11 = this.f3294i;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        c0820g.f3468d = i11;
    }

    /* renamed from: Y */
    private void m4017Y(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3286a; i12++) {
            if (!this.f3287b[i12].f3336a.isEmpty()) {
                m4020e0(this.f3287b[i12], i10, i11);
            }
        }
    }

    /* renamed from: Z */
    private boolean m4018Z(RecyclerView.C0779b0 c0779b0, C0809b c0809b) {
        int m4034v;
        if (this.f3300o) {
            m4034v = m4035z(c0779b0.m3836c());
        } else {
            m4034v = m4034v(c0779b0.m3836c());
        }
        c0809b.f3311a = m4034v;
        c0809b.f3312b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4019c0(int r5, androidx.recyclerview.widget.RecyclerView.C0779b0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.g r0 = r4.f3292g
            r1 = 0
            r0.f3466b = r1
            r0.f3467c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.m3839f()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f3294i
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.k r5 = r4.f3288c
            int r5 = r5.mo4237n()
            goto L2f
        L25:
            androidx.recyclerview.widget.k r5 = r4.f3288c
            int r5 = r5.mo4237n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.g r0 = r4.f3292g
            androidx.recyclerview.widget.k r3 = r4.f3288c
            int r3 = r3.mo4236m()
            int r3 = r3 - r6
            r0.f3470f = r3
            androidx.recyclerview.widget.g r6 = r4.f3292g
            androidx.recyclerview.widget.k r0 = r4.f3288c
            int r0 = r0.mo4232i()
            int r0 = r0 + r5
            r6.f3471g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.g r0 = r4.f3292g
            androidx.recyclerview.widget.k r3 = r4.f3288c
            int r3 = r3.mo4231h()
            int r3 = r3 + r5
            r0.f3471g = r3
            androidx.recyclerview.widget.g r5 = r4.f3292g
            int r6 = -r6
            r5.f3470f = r6
        L5d:
            androidx.recyclerview.widget.g r5 = r4.f3292g
            r5.f3472h = r1
            r5.f3465a = r2
            androidx.recyclerview.widget.k r6 = r4.f3288c
            int r6 = r6.mo4234k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.k r6 = r4.f3288c
            int r6 = r6.mo4231h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f3473i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4019c0(int, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.f3290e == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f3290e == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f3290e == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f3290e == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f3290e != 1 && isLayoutRTL()) {
                return -1;
            }
            return 1;
        }
        if (this.f3290e == 1 || !isLayoutRTL()) {
            return -1;
        }
        return 1;
    }

    /* renamed from: e0 */
    private void m4020e0(C0813f c0813f, int i10, int i11) {
        int m4086j = c0813f.m4086j();
        if (i10 == -1) {
            if (c0813f.m4091o() + m4086j <= i11) {
                this.f3295j.set(c0813f.f3340e, false);
            }
        } else if (c0813f.m4087k() - m4086j >= i11) {
            this.f3295j.set(c0813f.f3340e, false);
        }
    }

    /* renamed from: f0 */
    private int m4021f0(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    /* renamed from: g */
    private void m4022g(View view) {
        for (int i10 = this.f3286a - 1; i10 >= 0; i10--) {
            this.f3287b[i10].m4077a(view);
        }
    }

    /* renamed from: h */
    private void m4023h(C0809b c0809b) {
        int mo4236m;
        C0812e c0812e = this.f3302q;
        int i10 = c0812e.f3328c;
        if (i10 > 0) {
            if (i10 == this.f3286a) {
                for (int i11 = 0; i11 < this.f3286a; i11++) {
                    this.f3287b[i11].m4081e();
                    C0812e c0812e2 = this.f3302q;
                    int i12 = c0812e2.f3329d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        if (c0812e2.f3334i) {
                            mo4236m = this.f3288c.mo4232i();
                        } else {
                            mo4236m = this.f3288c.mo4236m();
                        }
                        i12 += mo4236m;
                    }
                    this.f3287b[i11].m4098v(i12);
                }
            } else {
                c0812e.m4074b();
                C0812e c0812e3 = this.f3302q;
                c0812e3.f3326a = c0812e3.f3327b;
            }
        }
        C0812e c0812e4 = this.f3302q;
        this.f3301p = c0812e4.f3335j;
        setReverseLayout(c0812e4.f3333h);
        m4015W();
        C0812e c0812e5 = this.f3302q;
        int i13 = c0812e5.f3326a;
        if (i13 != -1) {
            this.f3296k = i13;
            c0809b.f3313c = c0812e5.f3334i;
        } else {
            c0809b.f3313c = this.f3294i;
        }
        if (c0812e5.f3330e > 1) {
            C0811d c0811d = this.f3298m;
            c0811d.f3320a = c0812e5.f3331f;
            c0811d.f3321b = c0812e5.f3332g;
        }
    }

    /* renamed from: k */
    private void m4024k(View view, C0810c c0810c, C0820g c0820g) {
        if (c0820g.f3469e == 1) {
            if (c0810c.f3319f) {
                m4022g(view);
                return;
            } else {
                c0810c.f3318e.m4077a(view);
                return;
            }
        }
        if (c0810c.f3319f) {
            m4010R(view);
        } else {
            c0810c.f3318e.m4097u(view);
        }
    }

    /* renamed from: l */
    private int m4025l(int i10) {
        boolean z10;
        if (getChildCount() == 0) {
            if (!this.f3294i) {
                return -1;
            }
            return 1;
        }
        if (i10 < m4036C()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f3294i) {
            return -1;
        }
        return 1;
    }

    /* renamed from: n */
    private boolean m4026n(C0813f c0813f) {
        if (this.f3294i) {
            if (c0813f.m4087k() < this.f3288c.mo4232i()) {
                ArrayList arrayList = c0813f.f3336a;
                return !c0813f.m4090n((View) arrayList.get(arrayList.size() - 1)).f3319f;
            }
        } else if (c0813f.m4091o() > this.f3288c.mo4236m()) {
            return !c0813f.m4090n((View) c0813f.f3336a.get(0)).f3319f;
        }
        return false;
    }

    /* renamed from: o */
    private int m4027o(RecyclerView.C0779b0 c0779b0) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC0827n.m4254a(c0779b0, this.f3288c, m4048x(!this.f3307v), m4047w(!this.f3307v), this, this.f3307v);
    }

    /* renamed from: p */
    private int m4028p(RecyclerView.C0779b0 c0779b0) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC0827n.m4255b(c0779b0, this.f3288c, m4048x(!this.f3307v), m4047w(!this.f3307v), this, this.f3307v, this.f3294i);
    }

    /* renamed from: q */
    private int m4029q(RecyclerView.C0779b0 c0779b0) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC0827n.m4256c(c0779b0, this.f3288c, m4048x(!this.f3307v), m4047w(!this.f3307v), this, this.f3307v);
    }

    /* renamed from: r */
    private C0811d.a m4030r(int i10) {
        C0811d.a aVar = new C0811d.a();
        aVar.f3324c = new int[this.f3286a];
        for (int i11 = 0; i11 < this.f3286a; i11++) {
            aVar.f3324c[i11] = i10 - this.f3287b[i11].m4088l(i10);
        }
        return aVar;
    }

    /* renamed from: s */
    private C0811d.a m4031s(int i10) {
        C0811d.a aVar = new C0811d.a();
        aVar.f3324c = new int[this.f3286a];
        for (int i11 = 0; i11 < this.f3286a; i11++) {
            aVar.f3324c[i11] = this.f3287b[i11].m4092p(i10) - i10;
        }
        return aVar;
    }

    /* renamed from: t */
    private void m4032t() {
        this.f3288c = AbstractC0824k.m4225b(this, this.f3290e);
        this.f3289d = AbstractC0824k.m4225b(this, 1 - this.f3290e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: u */
    private int m4033u(RecyclerView.C0804w c0804w, C0820g c0820g, RecyclerView.C0779b0 c0779b0) {
        int i10;
        int i11;
        int mo4236m;
        int m4000E;
        boolean z10;
        C0813f c0813f;
        int m4092p;
        int mo4228e;
        int i12;
        int mo4236m2;
        int i13;
        int mo4228e2;
        int mo4232i;
        boolean m4045j;
        int m4088l;
        Object r92 = 0;
        this.f3295j.set(0, this.f3286a, true);
        if (this.f3292g.f3473i) {
            if (c0820g.f3469e == 1) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = Integer.MIN_VALUE;
            }
        } else {
            if (c0820g.f3469e == 1) {
                i10 = c0820g.f3471g + c0820g.f3466b;
            } else {
                i10 = c0820g.f3470f - c0820g.f3466b;
            }
            i11 = i10;
        }
        m4017Y(c0820g.f3469e, i11);
        if (this.f3294i) {
            mo4236m = this.f3288c.mo4232i();
        } else {
            mo4236m = this.f3288c.mo4236m();
        }
        int i14 = mo4236m;
        boolean z11 = false;
        while (c0820g.m4208a(c0779b0) && (this.f3292g.f3473i || !this.f3295j.isEmpty())) {
            View m4209b = c0820g.m4209b(c0804w);
            C0810c c0810c = (C0810c) m4209b.getLayoutParams();
            int m3926b = c0810c.m3926b();
            int m4064g = this.f3298m.m4064g(m3926b);
            if (m4064g == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (c0810c.f3319f) {
                    c0813f = this.f3287b[r92];
                } else {
                    c0813f = m4004I(c0820g);
                }
                this.f3298m.m4068n(m3926b, c0813f);
            } else {
                c0813f = this.f3287b[m4064g];
            }
            C0813f c0813f2 = c0813f;
            c0810c.f3318e = c0813f2;
            if (c0820g.f3469e == 1) {
                addView(m4209b);
            } else {
                addView(m4209b, r92);
            }
            m4007N(m4209b, c0810c, r92);
            if (c0820g.f3469e == 1) {
                if (c0810c.f3319f) {
                    m4088l = m4000E(i14);
                } else {
                    m4088l = c0813f2.m4088l(i14);
                }
                int mo4228e3 = this.f3288c.mo4228e(m4209b) + m4088l;
                if (z10 && c0810c.f3319f) {
                    C0811d.a m4030r = m4030r(m4088l);
                    m4030r.f3323b = -1;
                    m4030r.f3322a = m3926b;
                    this.f3298m.m4058a(m4030r);
                }
                i12 = mo4228e3;
                mo4228e = m4088l;
            } else {
                if (c0810c.f3319f) {
                    m4092p = m4003H(i14);
                } else {
                    m4092p = c0813f2.m4092p(i14);
                }
                mo4228e = m4092p - this.f3288c.mo4228e(m4209b);
                if (z10 && c0810c.f3319f) {
                    C0811d.a m4031s = m4031s(m4092p);
                    m4031s.f3323b = 1;
                    m4031s.f3322a = m3926b;
                    this.f3298m.m4058a(m4031s);
                }
                i12 = m4092p;
            }
            if (c0810c.f3319f && c0820g.f3468d == -1) {
                if (z10) {
                    this.f3306u = true;
                } else {
                    if (c0820g.f3469e == 1) {
                        m4045j = m4044i();
                    } else {
                        m4045j = m4045j();
                    }
                    if (!m4045j) {
                        C0811d.a m4063f = this.f3298m.m4063f(m3926b);
                        if (m4063f != null) {
                            m4063f.f3325d = true;
                        }
                        this.f3306u = true;
                    }
                }
            }
            m4024k(m4209b, c0810c, c0820g);
            if (isLayoutRTL() && this.f3290e == 1) {
                if (c0810c.f3319f) {
                    mo4232i = this.f3289d.mo4232i();
                } else {
                    mo4232i = this.f3289d.mo4232i() - (((this.f3286a - 1) - c0813f2.f3340e) * this.f3291f);
                }
                mo4228e2 = mo4232i;
                i13 = mo4232i - this.f3289d.mo4228e(m4209b);
            } else {
                if (c0810c.f3319f) {
                    mo4236m2 = this.f3289d.mo4236m();
                } else {
                    mo4236m2 = (c0813f2.f3340e * this.f3291f) + this.f3289d.mo4236m();
                }
                i13 = mo4236m2;
                mo4228e2 = this.f3289d.mo4228e(m4209b) + mo4236m2;
            }
            if (this.f3290e == 1) {
                layoutDecoratedWithMargins(m4209b, i13, mo4228e, mo4228e2, i12);
            } else {
                layoutDecoratedWithMargins(m4209b, mo4228e, i13, i12, mo4228e2);
            }
            if (c0810c.f3319f) {
                m4017Y(this.f3292g.f3469e, i11);
            } else {
                m4020e0(c0813f2, this.f3292g.f3469e, i11);
            }
            m4011S(c0804w, this.f3292g);
            if (this.f3292g.f3472h && m4209b.hasFocusable()) {
                if (c0810c.f3319f) {
                    this.f3295j.clear();
                } else {
                    this.f3295j.set(c0813f2.f3340e, false);
                    z11 = true;
                    r92 = 0;
                }
            }
            z11 = true;
            r92 = 0;
        }
        if (!z11) {
            m4011S(c0804w, this.f3292g);
        }
        if (this.f3292g.f3469e == -1) {
            m4000E = this.f3288c.mo4236m() - m4003H(this.f3288c.mo4236m());
        } else {
            m4000E = m4000E(this.f3288c.mo4232i()) - this.f3288c.mo4232i();
        }
        if (m4000E > 0) {
            return Math.min(c0820g.f3466b, m4000E);
        }
        return 0;
    }

    /* renamed from: v */
    private int m4034v(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            int position = getPosition(getChildAt(i11));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: z */
    private int m4035z(int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: C */
    int m4036C() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: D */
    int m4037D() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View m4038K() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3286a
            r2.<init>(r3)
            int r3 = r12.f3286a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3290e
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f3294i
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0810c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3318e
            int r9 = r9.f3340e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3318e
            boolean r9 = r12.m4026n(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3318e
            int r9 = r9.f3340e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f3319f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f3294i
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.k r10 = r12.f3288c
            int r10 = r10.mo4227d(r7)
            androidx.recyclerview.widget.k r11 = r12.f3288c
            int r11 = r11.mo4227d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.k r10 = r12.f3288c
            int r10 = r10.mo4230g(r7)
            androidx.recyclerview.widget.k r11 = r12.f3288c
            int r11 = r11.mo4230g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0810c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3318e
            int r8 = r8.f3340e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3318e
            int r9 = r9.f3340e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4038K():android.view.View");
    }

    /* renamed from: L */
    public void m4039L() {
        this.f3298m.m4059b();
        requestLayout();
    }

    /* renamed from: Q */
    void m4040Q(int i10, RecyclerView.C0779b0 c0779b0) {
        int m4036C;
        int i11;
        if (i10 > 0) {
            m4036C = m4037D();
            i11 = 1;
        } else {
            m4036C = m4036C();
            i11 = -1;
        }
        this.f3292g.f3465a = true;
        m4019c0(m4036C, c0779b0);
        m4016X(i11);
        C0820g c0820g = this.f3292g;
        c0820g.f3467c = m4036C + c0820g.f3468d;
        c0820g.f3466b = Math.abs(i10);
    }

    /* renamed from: a0 */
    boolean m4041a0(RecyclerView.C0779b0 c0779b0, C0809b c0809b) {
        int i10;
        int m4036C;
        int mo4236m;
        boolean z10 = false;
        if (!c0779b0.m3841h() && (i10 = this.f3296k) != -1) {
            if (i10 >= 0 && i10 < c0779b0.m3836c()) {
                C0812e c0812e = this.f3302q;
                if (c0812e != null && c0812e.f3326a != -1 && c0812e.f3328c >= 1) {
                    c0809b.f3312b = Integer.MIN_VALUE;
                    c0809b.f3311a = this.f3296k;
                } else {
                    View findViewByPosition = findViewByPosition(this.f3296k);
                    if (findViewByPosition != null) {
                        if (this.f3294i) {
                            m4036C = m4037D();
                        } else {
                            m4036C = m4036C();
                        }
                        c0809b.f3311a = m4036C;
                        if (this.f3297l != Integer.MIN_VALUE) {
                            if (c0809b.f3313c) {
                                c0809b.f3312b = (this.f3288c.mo4232i() - this.f3297l) - this.f3288c.mo4227d(findViewByPosition);
                            } else {
                                c0809b.f3312b = (this.f3288c.mo4236m() + this.f3297l) - this.f3288c.mo4230g(findViewByPosition);
                            }
                            return true;
                        }
                        if (this.f3288c.mo4228e(findViewByPosition) > this.f3288c.mo4237n()) {
                            if (c0809b.f3313c) {
                                mo4236m = this.f3288c.mo4232i();
                            } else {
                                mo4236m = this.f3288c.mo4236m();
                            }
                            c0809b.f3312b = mo4236m;
                            return true;
                        }
                        int mo4230g = this.f3288c.mo4230g(findViewByPosition) - this.f3288c.mo4236m();
                        if (mo4230g < 0) {
                            c0809b.f3312b = -mo4230g;
                            return true;
                        }
                        int mo4232i = this.f3288c.mo4232i() - this.f3288c.mo4227d(findViewByPosition);
                        if (mo4232i < 0) {
                            c0809b.f3312b = mo4232i;
                            return true;
                        }
                        c0809b.f3312b = Integer.MIN_VALUE;
                    } else {
                        int i11 = this.f3296k;
                        c0809b.f3311a = i11;
                        int i12 = this.f3297l;
                        if (i12 == Integer.MIN_VALUE) {
                            if (m4025l(i11) == 1) {
                                z10 = true;
                            }
                            c0809b.f3313c = z10;
                            c0809b.m4050a();
                        } else {
                            c0809b.m4051b(i12);
                        }
                        c0809b.f3314d = true;
                    }
                }
                return true;
            }
            this.f3296k = -1;
            this.f3297l = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f3302q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: b0 */
    void m4042b0(RecyclerView.C0779b0 c0779b0, C0809b c0809b) {
        if (m4041a0(c0779b0, c0809b) || m4018Z(c0779b0, c0809b)) {
            return;
        }
        c0809b.m4050a();
        c0809b.f3311a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean canScrollHorizontally() {
        if (this.f3290e == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean canScrollVertically() {
        if (this.f3290e == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean checkLayoutParams(RecyclerView.C0798q c0798q) {
        return c0798q instanceof C0810c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.C0779b0 c0779b0, RecyclerView.AbstractC0797p.c cVar) {
        int m4088l;
        int i12;
        if (this.f3290e != 0) {
            i10 = i11;
        }
        if (getChildCount() != 0 && i10 != 0) {
            m4040Q(i10, c0779b0);
            int[] iArr = this.f3308w;
            if (iArr == null || iArr.length < this.f3286a) {
                this.f3308w = new int[this.f3286a];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f3286a; i14++) {
                C0820g c0820g = this.f3292g;
                if (c0820g.f3468d == -1) {
                    m4088l = c0820g.f3470f;
                    i12 = this.f3287b[i14].m4092p(m4088l);
                } else {
                    m4088l = this.f3287b[i14].m4088l(c0820g.f3471g);
                    i12 = this.f3292g.f3471g;
                }
                int i15 = m4088l - i12;
                if (i15 >= 0) {
                    this.f3308w[i13] = i15;
                    i13++;
                }
            }
            Arrays.sort(this.f3308w, 0, i13);
            for (int i16 = 0; i16 < i13 && this.f3292g.m4208a(c0779b0); i16++) {
                cVar.mo3924a(this.f3292g.f3467c, this.f3308w[i16]);
                C0820g c0820g2 = this.f3292g;
                c0820g2.f3467c += c0820g2.f3468d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeHorizontalScrollExtent(RecyclerView.C0779b0 c0779b0) {
        return m4027o(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeHorizontalScrollOffset(RecyclerView.C0779b0 c0779b0) {
        return m4028p(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeHorizontalScrollRange(RecyclerView.C0779b0 c0779b0) {
        return m4029q(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0777a0.b
    public PointF computeScrollVectorForPosition(int i10) {
        int m4025l = m4025l(i10);
        PointF pointF = new PointF();
        if (m4025l == 0) {
            return null;
        }
        if (this.f3290e == 0) {
            pointF.x = m4025l;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m4025l;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeVerticalScrollExtent(RecyclerView.C0779b0 c0779b0) {
        return m4027o(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeVerticalScrollOffset(RecyclerView.C0779b0 c0779b0) {
        return m4028p(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeVerticalScrollRange(RecyclerView.C0779b0 c0779b0) {
        return m4029q(c0779b0);
    }

    /* renamed from: d0 */
    void m4043d0(int i10) {
        this.f3291f = i10 / this.f3286a;
        this.f3303r = View.MeasureSpec.makeMeasureSpec(i10, this.f3289d.mo4234k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateDefaultLayoutParams() {
        if (this.f3290e == 0) {
            return new C0810c(-2, -1);
        }
        return new C0810c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0810c(context, attributeSet);
    }

    /* renamed from: i */
    boolean m4044i() {
        int m4088l = this.f3287b[0].m4088l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3286a; i10++) {
            if (this.f3287b[i10].m4088l(Integer.MIN_VALUE) != m4088l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean isAutoMeasureEnabled() {
        if (this.f3299n != 0) {
            return true;
        }
        return false;
    }

    boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    boolean m4045j() {
        int m4092p = this.f3287b[0].m4092p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3286a; i10++) {
            if (this.f3287b[i10].m4092p(Integer.MIN_VALUE) != m4092p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    boolean m4046m() {
        int m4036C;
        int m4037D;
        int i10;
        if (getChildCount() == 0 || this.f3299n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f3294i) {
            m4036C = m4037D();
            m4037D = m4036C();
        } else {
            m4036C = m4036C();
            m4037D = m4037D();
        }
        if (m4036C == 0 && m4038K() != null) {
            this.f3298m.m4059b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f3306u) {
            return false;
        }
        if (this.f3294i) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int i11 = m4037D + 1;
        C0811d.a m4062e = this.f3298m.m4062e(m4036C, i11, i10, true);
        if (m4062e == null) {
            this.f3306u = false;
            this.f3298m.m4061d(i11);
            return false;
        }
        C0811d.a m4062e2 = this.f3298m.m4062e(m4036C, m4062e.f3322a, i10 * (-1), true);
        if (m4062e2 == null) {
            this.f3298m.m4061d(m4062e.f3322a);
        } else {
            this.f3298m.m4061d(m4062e2.f3322a + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.f3286a; i11++) {
            this.f3287b[i11].m4094r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.f3286a; i11++) {
            this.f3287b[i11].m4094r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onAdapterChanged(RecyclerView.AbstractC0789h abstractC0789h, RecyclerView.AbstractC0789h abstractC0789h2) {
        this.f3298m.m4059b();
        for (int i10 = 0; i10 < this.f3286a; i10++) {
            this.f3287b[i10].m4081e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0804w c0804w) {
        super.onDetachedFromWindow(recyclerView, c0804w);
        removeCallbacks(this.f3309x);
        for (int i10 = 0; i10 < this.f3286a; i10++) {
            this.f3287b[i10].m4081e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public View onFocusSearchFailed(View view, int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        View findContainingItemView;
        int m4036C;
        boolean z10;
        boolean z11;
        int m4083g;
        int m4083g2;
        int m4083g3;
        View m4089m;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m4015W();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        C0810c c0810c = (C0810c) findContainingItemView.getLayoutParams();
        boolean z12 = c0810c.f3319f;
        C0813f c0813f = c0810c.f3318e;
        if (convertFocusDirectionToLayoutDirection == 1) {
            m4036C = m4037D();
        } else {
            m4036C = m4036C();
        }
        m4019c0(m4036C, c0779b0);
        m4016X(convertFocusDirectionToLayoutDirection);
        C0820g c0820g = this.f3292g;
        c0820g.f3467c = c0820g.f3468d + m4036C;
        c0820g.f3466b = (int) (this.f3288c.mo4237n() * 0.33333334f);
        C0820g c0820g2 = this.f3292g;
        c0820g2.f3472h = true;
        c0820g2.f3465a = false;
        m4033u(c0804w, c0820g2, c0779b0);
        this.f3300o = this.f3294i;
        if (!z12 && (m4089m = c0813f.m4089m(m4036C, convertFocusDirectionToLayoutDirection)) != null && m4089m != findContainingItemView) {
            return m4089m;
        }
        if (m4009P(convertFocusDirectionToLayoutDirection)) {
            for (int i11 = this.f3286a - 1; i11 >= 0; i11--) {
                View m4089m2 = this.f3287b[i11].m4089m(m4036C, convertFocusDirectionToLayoutDirection);
                if (m4089m2 != null && m4089m2 != findContainingItemView) {
                    return m4089m2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f3286a; i12++) {
                View m4089m3 = this.f3287b[i12].m4089m(m4036C, convertFocusDirectionToLayoutDirection);
                if (m4089m3 != null && m4089m3 != findContainingItemView) {
                    return m4089m3;
                }
            }
        }
        boolean z13 = !this.f3293h;
        if (convertFocusDirectionToLayoutDirection == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z12) {
            if (z11) {
                m4083g3 = c0813f.m4082f();
            } else {
                m4083g3 = c0813f.m4083g();
            }
            View findViewByPosition = findViewByPosition(m4083g3);
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (m4009P(convertFocusDirectionToLayoutDirection)) {
            for (int i13 = this.f3286a - 1; i13 >= 0; i13--) {
                if (i13 != c0813f.f3340e) {
                    if (z11) {
                        m4083g2 = this.f3287b[i13].m4082f();
                    } else {
                        m4083g2 = this.f3287b[i13].m4083g();
                    }
                    View findViewByPosition2 = findViewByPosition(m4083g2);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f3286a; i14++) {
                if (z11) {
                    m4083g = this.f3287b[i14].m4082f();
                } else {
                    m4083g = this.f3287b[i14].m4083g();
                }
                View findViewByPosition3 = findViewByPosition(m4083g);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View m4048x = m4048x(false);
            View m4047w = m4047w(false);
            if (m4048x != null && m4047w != null) {
                int position = getPosition(m4048x);
                int position2 = getPosition(m4047w);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                } else {
                    accessibilityEvent.setFromIndex(position2);
                    accessibilityEvent.setToIndex(position);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        m4005J(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f3298m.m4059b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        m4005J(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        m4005J(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        m4005J(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onLayoutChildren(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        m4008O(c0804w, c0779b0, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onLayoutCompleted(RecyclerView.C0779b0 c0779b0) {
        super.onLayoutCompleted(c0779b0);
        this.f3296k = -1;
        this.f3297l = Integer.MIN_VALUE;
        this.f3302q = null;
        this.f3305t.m4052c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0812e) {
            C0812e c0812e = (C0812e) parcelable;
            this.f3302q = c0812e;
            if (this.f3296k != -1) {
                c0812e.m4073a();
                this.f3302q.m4074b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public Parcelable onSaveInstanceState() {
        int m4036C;
        int m4092p;
        int mo4236m;
        int[] iArr;
        if (this.f3302q != null) {
            return new C0812e(this.f3302q);
        }
        C0812e c0812e = new C0812e();
        c0812e.f3333h = this.f3293h;
        c0812e.f3334i = this.f3300o;
        c0812e.f3335j = this.f3301p;
        C0811d c0811d = this.f3298m;
        if (c0811d != null && (iArr = c0811d.f3320a) != null) {
            c0812e.f3331f = iArr;
            c0812e.f3330e = iArr.length;
            c0812e.f3332g = c0811d.f3321b;
        } else {
            c0812e.f3330e = 0;
        }
        if (getChildCount() > 0) {
            if (this.f3300o) {
                m4036C = m4037D();
            } else {
                m4036C = m4036C();
            }
            c0812e.f3326a = m4036C;
            c0812e.f3327b = m4049y();
            int i10 = this.f3286a;
            c0812e.f3328c = i10;
            c0812e.f3329d = new int[i10];
            for (int i11 = 0; i11 < this.f3286a; i11++) {
                if (this.f3300o) {
                    m4092p = this.f3287b[i11].m4088l(Integer.MIN_VALUE);
                    if (m4092p != Integer.MIN_VALUE) {
                        mo4236m = this.f3288c.mo4232i();
                        m4092p -= mo4236m;
                        c0812e.f3329d[i11] = m4092p;
                    } else {
                        c0812e.f3329d[i11] = m4092p;
                    }
                } else {
                    m4092p = this.f3287b[i11].m4092p(Integer.MIN_VALUE);
                    if (m4092p != Integer.MIN_VALUE) {
                        mo4236m = this.f3288c.mo4236m();
                        m4092p -= mo4236m;
                        c0812e.f3329d[i11] = m4092p;
                    } else {
                        c0812e.f3329d[i11] = m4092p;
                    }
                }
            }
        } else {
            c0812e.f3326a = -1;
            c0812e.f3327b = -1;
            c0812e.f3328c = 0;
        }
        return c0812e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            m4046m();
        }
    }

    int scrollBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        m4040Q(i10, c0779b0);
        int m4033u = m4033u(c0804w, this.f3292g, c0779b0);
        if (this.f3292g.f3466b >= m4033u) {
            if (i10 < 0) {
                i10 = -m4033u;
            } else {
                i10 = m4033u;
            }
        }
        this.f3288c.mo4241r(-i10);
        this.f3300o = this.f3294i;
        C0820g c0820g = this.f3292g;
        c0820g.f3466b = 0;
        m4011S(c0804w, c0820g);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int scrollHorizontallyBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        return scrollBy(i10, c0804w, c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void scrollToPosition(int i10) {
        C0812e c0812e = this.f3302q;
        if (c0812e != null && c0812e.f3326a != i10) {
            c0812e.m4073a();
        }
        this.f3296k = i10;
        this.f3297l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int scrollVerticallyBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        return scrollBy(i10, c0804w, c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f3290e == 1) {
            chooseSize2 = RecyclerView.AbstractC0797p.chooseSize(i11, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.AbstractC0797p.chooseSize(i10, (this.f3291f * this.f3286a) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.AbstractC0797p.chooseSize(i10, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.AbstractC0797p.chooseSize(i11, (this.f3291f * this.f3286a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f3290e) {
            return;
        }
        this.f3290e = i10;
        AbstractC0824k abstractC0824k = this.f3288c;
        this.f3288c = this.f3289d;
        this.f3289d = abstractC0824k;
        requestLayout();
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        C0812e c0812e = this.f3302q;
        if (c0812e != null && c0812e.f3333h != z10) {
            c0812e.f3333h = z10;
        }
        this.f3293h = z10;
        requestLayout();
    }

    public void setSpanCount(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f3286a) {
            m4039L();
            this.f3286a = i10;
            this.f3295j = new BitSet(this.f3286a);
            this.f3287b = new C0813f[this.f3286a];
            for (int i11 = 0; i11 < this.f3286a; i11++) {
                this.f3287b[i11] = new C0813f(i11);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0, int i10) {
        C0821h c0821h = new C0821h(recyclerView.getContext());
        c0821h.setTargetPosition(i10);
        startSmoothScroll(c0821h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean supportsPredictiveItemAnimations() {
        if (this.f3302q == null) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    View m4047w(boolean z10) {
        int mo4236m = this.f3288c.mo4236m();
        int mo4232i = this.f3288c.mo4232i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int mo4230g = this.f3288c.mo4230g(childAt);
            int mo4227d = this.f3288c.mo4227d(childAt);
            if (mo4227d > mo4236m && mo4230g < mo4232i) {
                if (mo4227d > mo4232i && z10) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: x */
    View m4048x(boolean z10) {
        int mo4236m = this.f3288c.mo4236m();
        int mo4232i = this.f3288c.mo4232i();
        int childCount = getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int mo4230g = this.f3288c.mo4230g(childAt);
            if (this.f3288c.mo4227d(childAt) > mo4236m && mo4230g < mo4232i) {
                if (mo4230g < mo4236m && z10) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: y */
    int m4049y() {
        View m4048x;
        if (this.f3294i) {
            m4048x = m4047w(true);
        } else {
            m4048x = m4048x(true);
        }
        if (m4048x == null) {
            return -1;
        }
        return getPosition(m4048x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0810c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0810c(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C0811d {

        /* renamed from: a */
        int[] f3320a;

        /* renamed from: b */
        List f3321b;

        C0811d() {
        }

        /* renamed from: i */
        private int m4055i(int i10) {
            if (this.f3321b == null) {
                return -1;
            }
            a m4063f = m4063f(i10);
            if (m4063f != null) {
                this.f3321b.remove(m4063f);
            }
            int size = this.f3321b.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (((a) this.f3321b.get(i11)).f3322a >= i10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = (a) this.f3321b.get(i11);
            this.f3321b.remove(i11);
            return aVar.f3322a;
        }

        /* renamed from: l */
        private void m4056l(int i10, int i11) {
            List list = this.f3321b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3321b.get(size);
                int i12 = aVar.f3322a;
                if (i12 >= i10) {
                    aVar.f3322a = i12 + i11;
                }
            }
        }

        /* renamed from: m */
        private void m4057m(int i10, int i11) {
            List list = this.f3321b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3321b.get(size);
                int i13 = aVar.f3322a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f3321b.remove(size);
                    } else {
                        aVar.f3322a = i13 - i11;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m4058a(a aVar) {
            if (this.f3321b == null) {
                this.f3321b = new ArrayList();
            }
            int size = this.f3321b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f3321b.get(i10);
                if (aVar2.f3322a == aVar.f3322a) {
                    this.f3321b.remove(i10);
                }
                if (aVar2.f3322a >= aVar.f3322a) {
                    this.f3321b.add(i10, aVar);
                    return;
                }
            }
            this.f3321b.add(aVar);
        }

        /* renamed from: b */
        void m4059b() {
            int[] iArr = this.f3320a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3321b = null;
        }

        /* renamed from: c */
        void m4060c(int i10) {
            int[] iArr = this.f3320a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3320a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[m4069o(i10)];
                this.f3320a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3320a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m4061d(int i10) {
            List list = this.f3321b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f3321b.get(size)).f3322a >= i10) {
                        this.f3321b.remove(size);
                    }
                }
            }
            return m4065h(i10);
        }

        /* renamed from: e */
        public a m4062e(int i10, int i11, int i12, boolean z10) {
            List list = this.f3321b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f3321b.get(i13);
                int i14 = aVar.f3322a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f3323b == i12 || (z10 && aVar.f3325d))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public a m4063f(int i10) {
            List list = this.f3321b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3321b.get(size);
                if (aVar.f3322a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m4064g(int i10) {
            int[] iArr = this.f3320a;
            if (iArr != null && i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }

        /* renamed from: h */
        int m4065h(int i10) {
            int[] iArr = this.f3320a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int m4055i = m4055i(i10);
            if (m4055i == -1) {
                int[] iArr2 = this.f3320a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f3320a.length;
            }
            int min = Math.min(m4055i + 1, this.f3320a.length);
            Arrays.fill(this.f3320a, i10, min, -1);
            return min;
        }

        /* renamed from: j */
        void m4066j(int i10, int i11) {
            int[] iArr = this.f3320a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                m4060c(i12);
                int[] iArr2 = this.f3320a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f3320a, i10, i12, -1);
                m4056l(i10, i11);
            }
        }

        /* renamed from: k */
        void m4067k(int i10, int i11) {
            int[] iArr = this.f3320a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                m4060c(i12);
                int[] iArr2 = this.f3320a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f3320a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                m4057m(i10, i11);
            }
        }

        /* renamed from: n */
        void m4068n(int i10, C0813f c0813f) {
            m4060c(i10);
            this.f3320a[i10] = c0813f.f3340e;
        }

        /* renamed from: o */
        int m4069o(int i10) {
            int length = this.f3320a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C7799a();

            /* renamed from: a */
            int f3322a;

            /* renamed from: b */
            int f3323b;

            /* renamed from: c */
            int[] f3324c;

            /* renamed from: d */
            boolean f3325d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C7799a implements Parcelable.Creator {
                C7799a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f3322a = parcel.readInt();
                this.f3323b = parcel.readInt();
                this.f3325d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3324c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m4070a(int i10) {
                int[] iArr = this.f3324c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3322a + ", mGapDir=" + this.f3323b + ", mHasUnwantedGapAfter=" + this.f3325d + ", mGapPerSpan=" + Arrays.toString(this.f3324c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3322a);
                parcel.writeInt(this.f3323b);
                parcel.writeInt(this.f3325d ? 1 : 0);
                int[] iArr = this.f3324c;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3324c);
                } else {
                    parcel.writeInt(0);
                }
            }

            a() {
            }
        }
    }
}
