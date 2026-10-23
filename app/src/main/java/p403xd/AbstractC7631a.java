package p403xd;

import android.view.View;
import anet.channel.entity.ConnType;
import p433zd.AbstractC7786b;
import p433zd.AbstractC7788d;

/* renamed from: xd.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7631a {

    /* renamed from: a */
    protected int f28084a;

    /* renamed from: b */
    protected int f28085b;

    /* renamed from: c */
    protected int f28086c;

    public AbstractC7631a(int i10, int i11, int i12) {
        this.f28084a = i10;
        this.f28085b = i11;
        this.f28086c = i12;
    }

    /* renamed from: a */
    public void mo29404a(View view) {
        boolean z10 = false;
        int m29410g;
        if (view.getTag() != null && view.getTag().toString().equals(ConnType.PK_AUTO)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            AbstractC7788d.m30170a(" pxVal = " + this.f28084a + " ," + getClass().getSimpleName());
        }
        if (m29412i()) {
            if (mo29408e()) {
                m29410g = m29411h();
            } else {
                m29410g = m29410g();
            }
            if (z10) {
                AbstractC7788d.m30170a(" useDefault val= " + m29410g);
            }
        } else if (m29406c()) {
            m29410g = m29411h();
            if (z10) {
                AbstractC7788d.m30170a(" baseWidth val= " + m29410g);
            }
        } else {
            m29410g = m29410g();
            if (z10) {
                AbstractC7788d.m30170a(" baseHeight val= " + m29410g);
            }
        }
        if (m29410g > 0) {
            m29410g = Math.max(m29410g, 1);
        }
        mo29409f(view, m29410g);
    }

    /* renamed from: b */
    protected abstract int mo29405b();

    /* renamed from: c */
    protected boolean m29406c() {
        return m29407d(this.f28085b, mo29405b());
    }

    /* renamed from: d */
    protected boolean m29407d(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: e */
    protected abstract boolean mo29408e();

    /* renamed from: f */
    protected abstract void mo29409f(View view, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public int m29410g() {
        return AbstractC7786b.m30164h(this.f28084a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public int m29411h() {
        return AbstractC7786b.m30167k(this.f28084a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public boolean m29412i() {
        if (!m29407d(this.f28086c, mo29405b()) && !m29407d(this.f28085b, mo29405b())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "AutoAttr{pxVal=" + this.f28084a + ", baseWidth=" + m29406c() + ", defaultBaseWidth=" + mo29408e() + '}';
    }
}
