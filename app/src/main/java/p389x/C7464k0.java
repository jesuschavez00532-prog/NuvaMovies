package p389x;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x.k0 */
/* loaded from: classes.dex */
public class C7464k0 {

    /* renamed from: a */
    private final Object f27538a;

    /* renamed from: x.k0$a */
    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C7464k0 f27539a;

        a(C7464k0 c7464k0) {
            this.f27539a = c7464k0;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            C7458h0 mo6030b = this.f27539a.mo6030b(i10);
            if (mo6030b == null) {
                return null;
            }
            return mo6030b.m28635u0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List m28651c = this.f27539a.m28651c(str, i10);
            if (m28651c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m28651c.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((C7458h0) m28651c.get(i11)).m28635u0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f27539a.mo6032f(i10, i11, bundle);
        }
    }

    /* renamed from: x.k0$b */
    /* loaded from: classes.dex */
    static class b extends a {
        b(C7464k0 c7464k0) {
            super(c7464k0);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            C7458h0 mo6031d = this.f27539a.mo6031d(i10);
            if (mo6031d == null) {
                return null;
            }
            return mo6031d.m28635u0();
        }
    }

    /* renamed from: x.k0$c */
    /* loaded from: classes.dex */
    static class c extends b {
        c(C7464k0 c7464k0) {
            super(c7464k0);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f27539a.m28650a(i10, C7458h0.m28578v0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C7464k0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27538a = new c(this);
        } else {
            this.f27538a = new b(this);
        }
    }

    /* renamed from: a */
    public void m28650a(int i10, C7458h0 c7458h0, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C7458h0 mo6030b(int i10) {
        return null;
    }

    /* renamed from: c */
    public List m28651c(String str, int i10) {
        return null;
    }

    /* renamed from: d */
    public C7458h0 mo6031d(int i10) {
        return null;
    }

    /* renamed from: e */
    public Object m28652e() {
        return this.f27538a;
    }

    /* renamed from: f */
    public boolean mo6032f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public C7464k0(Object obj) {
        this.f27538a = obj;
    }
}
