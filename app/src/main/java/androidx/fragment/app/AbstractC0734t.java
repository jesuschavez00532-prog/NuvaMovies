package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0749c;
import androidx.viewpager.widget.AbstractC0871a;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public abstract class AbstractC0734t extends AbstractC0871a {

    /* renamed from: a */
    private final AbstractC0729o f2971a;

    /* renamed from: b */
    private final int f2972b;

    /* renamed from: c */
    private AbstractC0738x f2973c;

    /* renamed from: d */
    private Fragment f2974d;

    /* renamed from: e */
    private boolean f2975e;

    public AbstractC0734t(AbstractC0729o abstractC0729o) {
        this(abstractC0729o, 0);
    }

    /* renamed from: c */
    private static String m3586c(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    /* renamed from: a */
    public abstract Fragment mo3587a(int i10);

    /* renamed from: b */
    public long m3588b(int i10) {
        return i10;
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2973c == null) {
            this.f2973c = this.f2971a.m3534m();
        }
        this.f2973c.mo3231k(fragment);
        if (fragment.equals(this.f2974d)) {
            this.f2974d = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0738x abstractC0738x = this.f2973c;
        if (abstractC0738x != null) {
            if (!this.f2975e) {
                try {
                    this.f2975e = true;
                    abstractC0738x.mo3230j();
                } finally {
                    this.f2975e = false;
                }
            }
            this.f2973c = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        if (this.f2973c == null) {
            this.f2973c = this.f2971a.m3534m();
        }
        long m3588b = m3588b(i10);
        Fragment m3523h0 = this.f2971a.m3523h0(m3586c(viewGroup.getId(), m3588b));
        if (m3523h0 != null) {
            this.f2973c.m3642f(m3523h0);
        } else {
            m3523h0 = mo3587a(i10);
            this.f2973c.m3638b(viewGroup.getId(), m3523h0, m3586c(viewGroup.getId(), m3588b));
        }
        if (m3523h0 != this.f2974d) {
            m3523h0.m3144Z8(false);
            if (this.f2972b == 1) {
                this.f2973c.mo3236s(m3523h0, AbstractC0749c.c.STARTED);
            } else {
                m3523h0.mo3165g9(false);
            }
        }
        return m3523h0;
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).m3182n7() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2974d;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.m3144Z8(false);
                if (this.f2972b == 1) {
                    if (this.f2973c == null) {
                        this.f2973c = this.f2971a.m3534m();
                    }
                    this.f2973c.mo3236s(this.f2974d, AbstractC0749c.c.STARTED);
                } else {
                    this.f2974d.mo3165g9(false);
                }
            }
            fragment.m3144Z8(true);
            if (this.f2972b == 1) {
                if (this.f2973c == null) {
                    this.f2973c = this.f2971a.m3534m();
                }
                this.f2973c.mo3236s(fragment, AbstractC0749c.c.RESUMED);
            } else {
                fragment.mo3165g9(true);
            }
            this.f2974d = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public AbstractC0734t(AbstractC0729o abstractC0729o, int i10) {
        this.f2973c = null;
        this.f2974d = null;
        this.f2971a = abstractC0729o;
        this.f2972b = i10;
    }
}
