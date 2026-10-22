package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p389x.C7458h0;
import p389x.C7464k0;

/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C0551a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f2316c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f2317a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f2318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$a */
    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0551a f2319a;

        a(C0551a c0551a) {
            this.f2319a = c0551a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2319a.mo2378a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C7464k0 mo2379b = this.f2319a.mo2379b(view);
            if (mo2379b != null) {
                return (AccessibilityNodeProvider) mo2379b.m28652e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2319a.mo2381f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C7458h0 m28578v0 = C7458h0.m28578v0(accessibilityNodeInfo);
            m28578v0.m28624n0(AbstractC0616q0.m2603U(view));
            m28578v0.m28614h0(AbstractC0616q0.m2598P(view));
            m28578v0.m28618k0(AbstractC0616q0.m2639p(view));
            m28578v0.m28631r0(AbstractC0616q0.m2591I(view));
            this.f2319a.mo2382g(view, m28578v0);
            m28578v0.m28609e(accessibilityNodeInfo.getText(), view);
            List m2375c = C0551a.m2375c(view);
            for (int i10 = 0; i10 < m2375c.size(); i10++) {
                m28578v0.m28604b((C7458h0.a) m2375c.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2319a.mo2383h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2319a.mo2384i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f2319a.mo2385j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f2319a.mo2386l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2319a.mo2387m(view, accessibilityEvent);
        }
    }

    public C0551a() {
        this(f2316c);
    }

    /* renamed from: c */
    static List m2375c(View view) {
        List list = (List) view.getTag(R$id.tag_accessibility_actions);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: e */
    private boolean m2376e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m28575p = C7458h0.m28575p(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; m28575p != null && i10 < m28575p.length; i10++) {
                if (clickableSpan.equals(m28575p[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m2377k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i10)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (m2376e(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2378a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2317a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C7464k0 mo2379b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2317a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C7464k0(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate m2380d() {
        return this.f2318b;
    }

    /* renamed from: f */
    public void mo2381f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2317a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2382g(View view, C7458h0 c7458h0) {
        this.f2317a.onInitializeAccessibilityNodeInfo(view, c7458h0.m28635u0());
    }

    /* renamed from: h */
    public void mo2383h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2317a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo2384i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2317a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo2385j(View view, int i10, Bundle bundle) {
        List m2375c = m2375c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= m2375c.size()) {
                break;
            }
            C7458h0.a aVar = (C7458h0.a) m2375c.get(i11);
            if (aVar.m28640b() == i10) {
                z10 = aVar.m28642d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = this.f2317a.performAccessibilityAction(view, i10, bundle);
        }
        if (!z10 && i10 == R$id.accessibility_action_clickable_span) {
            return m2377k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return z10;
    }

    /* renamed from: l */
    public void mo2386l(View view, int i10) {
        this.f2317a.sendAccessibilityEvent(view, i10);
    }

    /* renamed from: m */
    public void mo2387m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2317a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0551a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2317a = accessibilityDelegate;
        this.f2318b = new a(this);
    }
}
