package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$styleable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0727m implements LayoutInflater.Factory2 {

    /* renamed from: a */
    final AbstractC0729o f2883a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C0736v f2884a;

        a(C0736v c0736v) {
            this.f2884a = c0736v;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m3603k = this.f2884a.m3603k();
            this.f2884a.m3604m();
            AbstractC0721i0.m3353n((ViewGroup) m3603k.f2625H.getParent(), LayoutInflaterFactory2C0727m.this.f2883a).m3361j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflaterFactory2C0727m(AbstractC0729o abstractC0729o) {
        this.f2883a = abstractC0729o;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0736v m3549v;
        if (C0720i.class.getName().equals(str)) {
            return new C0720i(context, attributeSet, this.f2883a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2612d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(R$styleable.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(R$styleable.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC0724k.m3407b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment m3521g0 = resourceId != -1 ? this.f2883a.m3521g0(resourceId) : null;
        if (m3521g0 == null && string != null) {
            m3521g0 = this.f2883a.m3523h0(string);
        }
        if (m3521g0 == null && id2 != -1) {
            m3521g0 = this.f2883a.m3521g0(id2);
        }
        if (m3521g0 == null) {
            m3521g0 = this.f2883a.m3541q0().mo3410a(context.getClassLoader(), attributeValue);
            m3521g0.f2657n = true;
            m3521g0.f2666w = resourceId != 0 ? resourceId : id2;
            m3521g0.f2667x = id2;
            m3521g0.f2668y = string;
            m3521g0.f2658o = true;
            AbstractC0729o abstractC0729o = this.f2883a;
            m3521g0.f2662s = abstractC0729o;
            m3521g0.f2663t = abstractC0729o.m3546t0();
            m3521g0.m3137X7(this.f2883a.m3546t0().m3412f(), attributeSet, m3521g0.f2639b);
            m3549v = this.f2883a.m3520g(m3521g0);
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "Fragment " + m3521g0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!m3521g0.f2658o) {
            m3521g0.f2658o = true;
            AbstractC0729o abstractC0729o2 = this.f2883a;
            m3521g0.f2662s = abstractC0729o2;
            m3521g0.f2663t = abstractC0729o2.m3546t0();
            m3521g0.m3137X7(this.f2883a.m3546t0().m3412f(), attributeSet, m3521g0.f2639b);
            m3549v = this.f2883a.m3549v(m3521g0);
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + m3521g0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
        }
        m3521g0.f2624G = (ViewGroup) view;
        m3549v.m3604m();
        m3549v.m3602j();
        View view2 = m3521g0.f2625H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (m3521g0.f2625H.getTag() == null) {
                m3521g0.f2625H.setTag(string);
            }
            m3521g0.f2625H.addOnAttachStateChangeListener(new a(m3549v));
            return m3521g0.f2625H;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
