package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0551a;
import java.util.Map;
import java.util.WeakHashMap;
import p389x.C7458h0;
import p389x.C7464k0;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public class C0826m extends C0551a {

    /* renamed from: d */
    final RecyclerView f3481d;

    /* renamed from: e */
    private final a f3482e;

    /* renamed from: androidx.recyclerview.widget.m$a */
    /* loaded from: classes.dex */
    public static class a extends C0551a {

        /* renamed from: d */
        final C0826m f3483d;

        /* renamed from: e */
        private Map f3484e = new WeakHashMap();

        public a(C0826m c0826m) {
            this.f3483d = c0826m;
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: a */
        public boolean mo2378a(View view, AccessibilityEvent accessibilityEvent) {
            C0551a c0551a = (C0551a) this.f3484e.get(view);
            if (c0551a != null) {
                return c0551a.mo2378a(view, accessibilityEvent);
            }
            return super.mo2378a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: b */
        public C7464k0 mo2379b(View view) {
            C0551a c0551a = (C0551a) this.f3484e.get(view);
            if (c0551a != null) {
                return c0551a.mo2379b(view);
            }
            return super.mo2379b(view);
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: f */
        public void mo2381f(View view, AccessibilityEvent accessibilityEvent) {
            C0551a c0551a = (C0551a) this.f3484e.get(view);
            if (c0551a != null) {
                c0551a.mo2381f(view, accessibilityEvent);
            } else {
                super.mo2381f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            if (!this.f3483d.m4251o() && this.f3483d.f3481d.getLayoutManager() != null) {
                this.f3483d.f3481d.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c7458h0);
                C0551a c0551a = (C0551a) this.f3484e.get(view);
                if (c0551a != null) {
                    c0551a.mo2382g(view, c7458h0);
                    return;
                } else {
                    super.mo2382g(view, c7458h0);
                    return;
                }
            }
            super.mo2382g(view, c7458h0);
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: h */
        public void mo2383h(View view, AccessibilityEvent accessibilityEvent) {
            C0551a c0551a = (C0551a) this.f3484e.get(view);
            if (c0551a != null) {
                c0551a.mo2383h(view, accessibilityEvent);
            } else {
                super.mo2383h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: i */
        public boolean mo2384i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0551a c0551a = (C0551a) this.f3484e.get(viewGroup);
            if (c0551a != null) {
                return c0551a.mo2384i(viewGroup, view, accessibilityEvent);
            }
            return super.mo2384i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: j */
        public boolean mo2385j(View view, int i10, Bundle bundle) {
            if (!this.f3483d.m4251o() && this.f3483d.f3481d.getLayoutManager() != null) {
                C0551a c0551a = (C0551a) this.f3484e.get(view);
                if (c0551a != null) {
                    if (c0551a.mo2385j(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.mo2385j(view, i10, bundle)) {
                    return true;
                }
                return this.f3483d.f3481d.getLayoutManager().performAccessibilityActionForItem(view, i10, bundle);
            }
            return super.mo2385j(view, i10, bundle);
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: l */
        public void mo2386l(View view, int i10) {
            C0551a c0551a = (C0551a) this.f3484e.get(view);
            if (c0551a != null) {
                c0551a.mo2386l(view, i10);
            } else {
                super.mo2386l(view, i10);
            }
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: m */
        public void mo2387m(View view, AccessibilityEvent accessibilityEvent) {
            C0551a c0551a = (C0551a) this.f3484e.get(view);
            if (c0551a != null) {
                c0551a.mo2387m(view, accessibilityEvent);
            } else {
                super.mo2387m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public C0551a m4252n(View view) {
            return (C0551a) this.f3484e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void m4253o(View view) {
            C0551a m2631l = AbstractC0616q0.m2631l(view);
            if (m2631l != null && m2631l != this) {
                this.f3484e.put(view, m2631l);
            }
        }
    }

    public C0826m(RecyclerView recyclerView) {
        this.f3481d = recyclerView;
        C0551a m4250n = m4250n();
        if (m4250n != null && (m4250n instanceof a)) {
            this.f3482e = (a) m4250n;
        } else {
            this.f3482e = new a(this);
        }
    }

    @Override // androidx.core.view.C0551a
    /* renamed from: f */
    public void mo2381f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2381f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !m4251o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.C0551a
    /* renamed from: g */
    public void mo2382g(View view, C7458h0 c7458h0) {
        super.mo2382g(view, c7458h0);
        if (!m4251o() && this.f3481d.getLayoutManager() != null) {
            this.f3481d.getLayoutManager().onInitializeAccessibilityNodeInfo(c7458h0);
        }
    }

    @Override // androidx.core.view.C0551a
    /* renamed from: j */
    public boolean mo2385j(View view, int i10, Bundle bundle) {
        if (super.mo2385j(view, i10, bundle)) {
            return true;
        }
        if (!m4251o() && this.f3481d.getLayoutManager() != null) {
            return this.f3481d.getLayoutManager().performAccessibilityAction(i10, bundle);
        }
        return false;
    }

    /* renamed from: n */
    public C0551a m4250n() {
        return this.f3482e;
    }

    /* renamed from: o */
    boolean m4251o() {
        return this.f3481d.hasPendingAdapterUpdates();
    }
}
