package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p331t.AbstractC6880k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public final class RunnableC0819f implements Runnable {

    /* renamed from: e */
    static final ThreadLocal f3450e = new ThreadLocal();

    /* renamed from: f */
    static Comparator f3451f = new a();

    /* renamed from: b */
    long f3453b;

    /* renamed from: c */
    long f3454c;

    /* renamed from: a */
    ArrayList f3452a = new ArrayList();

    /* renamed from: d */
    private ArrayList f3455d = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.f$a */
    /* loaded from: classes.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            boolean z10;
            boolean z11;
            RecyclerView recyclerView = cVar.f3463d;
            if (recyclerView == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (cVar2.f3463d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z12 = cVar.f3460a;
            if (z12 != cVar2.f3460a) {
                if (!z12) {
                    return 1;
                }
                return -1;
            }
            int i10 = cVar2.f3461b - cVar.f3461b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3462c - cVar2.f3462c;
            if (i11 == 0) {
                return 0;
            }
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.f$b */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.AbstractC0797p.c {

        /* renamed from: a */
        int f3456a;

        /* renamed from: b */
        int f3457b;

        /* renamed from: c */
        int[] f3458c;

        /* renamed from: d */
        int f3459d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p.c
        /* renamed from: a */
        public void mo3924a(int i10, int i11) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    int i12 = this.f3459d * 2;
                    int[] iArr = this.f3458c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f3458c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i12 >= iArr.length) {
                        int[] iArr3 = new int[i12 * 2];
                        this.f3458c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f3458c;
                    iArr4[i12] = i10;
                    iArr4[i12 + 1] = i11;
                    this.f3459d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m4203b() {
            int[] iArr = this.f3458c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3459d = 0;
        }

        /* renamed from: c */
        void m4204c(RecyclerView recyclerView, boolean z10) {
            this.f3459d = 0;
            int[] iArr = this.f3458c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0797p abstractC0797p = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && abstractC0797p != null && abstractC0797p.isItemPrefetchEnabled()) {
                if (z10) {
                    if (!recyclerView.mAdapterHelper.m4116p()) {
                        abstractC0797p.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    abstractC0797p.collectAdjacentPrefetchPositions(this.f3456a, this.f3457b, recyclerView.mState, this);
                }
                int i10 = this.f3459d;
                if (i10 > abstractC0797p.mPrefetchMaxCountObserved) {
                    abstractC0797p.mPrefetchMaxCountObserved = i10;
                    abstractC0797p.mPrefetchMaxObservedInInitialPrefetch = z10;
                    recyclerView.mRecycler.m3967P();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m4205d(int i10) {
            if (this.f3458c != null) {
                int i11 = this.f3459d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3458c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m4206e(int i10, int i11) {
            this.f3456a = i10;
            this.f3457b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.f$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f3460a;

        /* renamed from: b */
        public int f3461b;

        /* renamed from: c */
        public int f3462c;

        /* renamed from: d */
        public RecyclerView f3463d;

        /* renamed from: e */
        public int f3464e;

        c() {
        }

        /* renamed from: a */
        public void m4207a() {
            this.f3460a = false;
            this.f3461b = 0;
            this.f3462c = 0;
            this.f3463d = null;
            this.f3464e = 0;
        }
    }

    /* renamed from: b */
    private void m4192b() {
        c cVar;
        boolean z10;
        int size = this.f3452a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f3452a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m4204c(recyclerView, false);
                i10 += recyclerView.mPrefetchRegistry.f3459d;
            }
        }
        this.f3455d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3452a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f3456a) + Math.abs(bVar.f3457b);
                for (int i14 = 0; i14 < bVar.f3459d * 2; i14 += 2) {
                    if (i12 >= this.f3455d.size()) {
                        cVar = new c();
                        this.f3455d.add(cVar);
                    } else {
                        cVar = (c) this.f3455d.get(i12);
                    }
                    int[] iArr = bVar.f3458c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f3460a = z10;
                    cVar.f3461b = abs;
                    cVar.f3462c = i15;
                    cVar.f3463d = recyclerView2;
                    cVar.f3464e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3455d, f3451f);
    }

    /* renamed from: c */
    private void m4193c(c cVar, long j10) {
        long j11;
        if (cVar.f3460a) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j10;
        }
        RecyclerView.AbstractC0787f0 m4197i = m4197i(cVar.f3463d, cVar.f3464e, j11);
        if (m4197i != null && m4197i.mNestedRecyclerView != null && m4197i.isBound() && !m4197i.isInvalid()) {
            m4196h(m4197i.mNestedRecyclerView.get(), j10);
        }
    }

    /* renamed from: d */
    private void m4194d(long j10) {
        for (int i10 = 0; i10 < this.f3455d.size(); i10++) {
            c cVar = (c) this.f3455d.get(i10);
            if (cVar.f3463d != null) {
                m4193c(cVar, j10);
                cVar.m4207a();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m4195e(RecyclerView recyclerView, int i10) {
        int m4137j = recyclerView.mChildHelper.m4137j();
        for (int i11 = 0; i11 < m4137j; i11++) {
            RecyclerView.AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m4136i(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m4196h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m4137j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.m4204c(recyclerView, true);
        if (bVar.f3459d != 0) {
            try {
                AbstractC6880k.m26792a("RV Nested Prefetch");
                recyclerView.mState.m3842i(recyclerView.mAdapter);
                for (int i10 = 0; i10 < bVar.f3459d * 2; i10 += 2) {
                    m4197i(recyclerView, bVar.f3458c[i10], j10);
                }
            } finally {
                AbstractC6880k.m26793b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC0787f0 m4197i(RecyclerView recyclerView, int i10, long j10) {
        if (m4195e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.C0804w c0804w = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC0787f0 m3965N = c0804w.m3965N(i10, false, j10);
            if (m3965N != null) {
                if (m3965N.isBound() && !m3965N.isInvalid()) {
                    c0804w.m3959G(m3965N.itemView);
                } else {
                    c0804w.m3970a(m3965N, false);
                }
            }
            return m3965N;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public void m4198a(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f3452a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f3452a.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m4199f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f3452a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f3453b == 0) {
                this.f3453b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.m4206e(i10, i11);
    }

    /* renamed from: g */
    void m4200g(long j10) {
        m4192b();
        m4194d(j10);
    }

    /* renamed from: j */
    public void m4201j(RecyclerView recyclerView) {
        boolean remove = this.f3452a.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AbstractC6880k.m26792a("RV Prefetch");
            if (!this.f3452a.isEmpty()) {
                int size = this.f3452a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3452a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    m4200g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f3454c);
                }
            }
        } finally {
            this.f3453b = 0L;
            AbstractC6880k.m26793b();
        }
    }
}
