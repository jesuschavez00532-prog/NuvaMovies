package p003a2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import anet.channel.bytes.C0905a;
import anet.channel.entity.EventType;
import com.bumptech.glide.EnumC1591h;
import com.p077uc.crashsdk.export.LogType;
import com.taobao.accs.data.Message;
import java.util.Map;
import p093d2.C3922a;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p109e2.C4112b;
import p184j1.C4976g;
import p184j1.C4977h;
import p184j1.EnumC4971b;
import p184j1.InterfaceC4975f;
import p184j1.InterfaceC4981l;
import p216l1.AbstractC5323j;
import p292q1.C6323a;
import p322s1.AbstractC6640o;
import p322s1.C6634l;
import p322s1.C6636m;
import p322s1.C6646u;
import p322s1.C6648w;
import p322s1.C6650y;
import p375w1.AbstractC7352i;
import p375w1.C7346c;
import p375w1.C7349f;

/* renamed from: a2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0005a implements Cloneable {

    /* renamed from: a */
    private int f11a;

    /* renamed from: e */
    private Drawable f15e;

    /* renamed from: f */
    private int f16f;

    /* renamed from: g */
    private Drawable f17g;

    /* renamed from: h */
    private int f18h;

    /* renamed from: m */
    private boolean f23m;

    /* renamed from: o */
    private Drawable f25o;

    /* renamed from: p */
    private int f26p;

    /* renamed from: t */
    private boolean f30t;

    /* renamed from: u */
    private Resources.Theme f31u;

    /* renamed from: v */
    private boolean f32v;

    /* renamed from: w */
    private boolean f33w;

    /* renamed from: x */
    private boolean f34x;

    /* renamed from: z */
    private boolean f36z;

    /* renamed from: b */
    private float f12b = 1.0f;

    /* renamed from: c */
    private AbstractC5323j f13c = AbstractC5323j.f21747e;

    /* renamed from: d */
    private EnumC1591h f14d = EnumC1591h.NORMAL;

    /* renamed from: i */
    private boolean f19i = true;

    /* renamed from: j */
    private int f20j = -1;

    /* renamed from: k */
    private int f21k = -1;

    /* renamed from: l */
    private InterfaceC4975f f22l = C3922a.m16760c();

    /* renamed from: n */
    private boolean f24n = true;

    /* renamed from: q */
    private C4977h f27q = new C4977h();

    /* renamed from: r */
    private Map f28r = new C4112b();

    /* renamed from: s */
    private Class f29s = Object.class;

    /* renamed from: y */
    private boolean f35y = true;

    /* renamed from: N */
    private boolean m16N(int i10) {
        return m17O(this.f11a, i10);
    }

    /* renamed from: O */
    private static boolean m17O(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: Z */
    private AbstractC0005a m18Z(AbstractC6640o abstractC6640o, InterfaceC4981l interfaceC4981l) {
        return m20g0(abstractC6640o, interfaceC4981l, false);
    }

    /* renamed from: f0 */
    private AbstractC0005a m19f0(AbstractC6640o abstractC6640o, InterfaceC4981l interfaceC4981l) {
        return m20g0(abstractC6640o, interfaceC4981l, true);
    }

    /* renamed from: g0 */
    private AbstractC0005a m20g0(AbstractC6640o abstractC6640o, InterfaceC4981l interfaceC4981l, boolean z10) {
        AbstractC0005a m44a0;
        if (z10) {
            m44a0 = m72r0(abstractC6640o, interfaceC4981l);
        } else {
            m44a0 = m44a0(abstractC6640o, interfaceC4981l);
        }
        m44a0.f35y = true;
        return m44a0;
    }

    /* renamed from: h0 */
    private AbstractC0005a m21h0() {
        return this;
    }

    /* renamed from: A */
    public final EnumC1591h m22A() {
        return this.f14d;
    }

    /* renamed from: B */
    public final Class m23B() {
        return this.f29s;
    }

    /* renamed from: C */
    public final InterfaceC4975f m24C() {
        return this.f22l;
    }

    /* renamed from: D */
    public final float m25D() {
        return this.f12b;
    }

    /* renamed from: E */
    public final Resources.Theme m26E() {
        return this.f31u;
    }

    /* renamed from: F */
    public final Map m27F() {
        return this.f28r;
    }

    /* renamed from: G */
    public final boolean m28G() {
        return this.f36z;
    }

    /* renamed from: H */
    public final boolean m29H() {
        return this.f33w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final boolean m30I() {
        return this.f32v;
    }

    /* renamed from: J */
    public final boolean m31J(AbstractC0005a abstractC0005a) {
        if (Float.compare(abstractC0005a.f12b, this.f12b) == 0 && this.f16f == abstractC0005a.f16f && AbstractC4122l.m17232e(this.f15e, abstractC0005a.f15e) && this.f18h == abstractC0005a.f18h && AbstractC4122l.m17232e(this.f17g, abstractC0005a.f17g) && this.f26p == abstractC0005a.f26p && AbstractC4122l.m17232e(this.f25o, abstractC0005a.f25o) && this.f19i == abstractC0005a.f19i && this.f20j == abstractC0005a.f20j && this.f21k == abstractC0005a.f21k && this.f23m == abstractC0005a.f23m && this.f24n == abstractC0005a.f24n && this.f33w == abstractC0005a.f33w && this.f34x == abstractC0005a.f34x && this.f13c.equals(abstractC0005a.f13c) && this.f14d == abstractC0005a.f14d && this.f27q.equals(abstractC0005a.f27q) && this.f28r.equals(abstractC0005a.f28r) && this.f29s.equals(abstractC0005a.f29s) && AbstractC4122l.m17232e(this.f22l, abstractC0005a.f22l) && AbstractC4122l.m17232e(this.f31u, abstractC0005a.f31u)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m32K() {
        return this.f19i;
    }

    /* renamed from: L */
    public final boolean m33L() {
        return m16N(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean m34M() {
        return this.f35y;
    }

    /* renamed from: P */
    public final boolean m35P() {
        return this.f24n;
    }

    /* renamed from: Q */
    public final boolean m36Q() {
        return this.f23m;
    }

    /* renamed from: R */
    public final boolean m37R() {
        return m16N(2048);
    }

    /* renamed from: U */
    public final boolean m38U() {
        return AbstractC4122l.m17249v(this.f21k, this.f20j);
    }

    /* renamed from: V */
    public AbstractC0005a mo39V() {
        this.f30t = true;
        return m21h0();
    }

    /* renamed from: W */
    public AbstractC0005a mo40W() {
        return m44a0(AbstractC6640o.f25473e, new C6634l());
    }

    /* renamed from: X */
    public AbstractC0005a mo41X() {
        return m18Z(AbstractC6640o.f25472d, new C6636m());
    }

    /* renamed from: Y */
    public AbstractC0005a mo42Y() {
        return m18Z(AbstractC6640o.f25471c, new C6650y());
    }

    /* renamed from: a */
    public AbstractC0005a mo43a(AbstractC0005a abstractC0005a) {
        if (this.f32v) {
            return clone().mo43a(abstractC0005a);
        }
        if (m17O(abstractC0005a.f11a, 2)) {
            this.f12b = abstractC0005a.f12b;
        }
        if (m17O(abstractC0005a.f11a, 262144)) {
            this.f33w = abstractC0005a.f33w;
        }
        if (m17O(abstractC0005a.f11a, LogType.ANR)) {
            this.f36z = abstractC0005a.f36z;
        }
        if (m17O(abstractC0005a.f11a, 4)) {
            this.f13c = abstractC0005a.f13c;
        }
        if (m17O(abstractC0005a.f11a, 8)) {
            this.f14d = abstractC0005a.f14d;
        }
        if (m17O(abstractC0005a.f11a, 16)) {
            this.f15e = abstractC0005a.f15e;
            this.f16f = 0;
            this.f11a &= -33;
        }
        if (m17O(abstractC0005a.f11a, 32)) {
            this.f16f = abstractC0005a.f16f;
            this.f15e = null;
            this.f11a &= -17;
        }
        if (m17O(abstractC0005a.f11a, 64)) {
            this.f17g = abstractC0005a.f17g;
            this.f18h = 0;
            this.f11a &= -129;
        }
        if (m17O(abstractC0005a.f11a, 128)) {
            this.f18h = abstractC0005a.f18h;
            this.f17g = null;
            this.f11a &= -65;
        }
        if (m17O(abstractC0005a.f11a, 256)) {
            this.f19i = abstractC0005a.f19i;
        }
        if (m17O(abstractC0005a.f11a, 512)) {
            this.f21k = abstractC0005a.f21k;
            this.f20j = abstractC0005a.f20j;
        }
        if (m17O(abstractC0005a.f11a, EventType.AUTH_FAIL)) {
            this.f22l = abstractC0005a.f22l;
        }
        if (m17O(abstractC0005a.f11a, 4096)) {
            this.f29s = abstractC0005a.f29s;
        }
        if (m17O(abstractC0005a.f11a, 8192)) {
            this.f25o = abstractC0005a.f25o;
            this.f26p = 0;
            this.f11a &= -16385;
        }
        if (m17O(abstractC0005a.f11a, 16384)) {
            this.f26p = abstractC0005a.f26p;
            this.f25o = null;
            this.f11a &= -8193;
        }
        if (m17O(abstractC0005a.f11a, Message.FLAG_DATA_TYPE)) {
            this.f31u = abstractC0005a.f31u;
        }
        if (m17O(abstractC0005a.f11a, 65536)) {
            this.f24n = abstractC0005a.f24n;
        }
        if (m17O(abstractC0005a.f11a, 131072)) {
            this.f23m = abstractC0005a.f23m;
        }
        if (m17O(abstractC0005a.f11a, 2048)) {
            this.f28r.putAll(abstractC0005a.f28r);
            this.f35y = abstractC0005a.f35y;
        }
        if (m17O(abstractC0005a.f11a, C0905a.MAX_POOL_SIZE)) {
            this.f34x = abstractC0005a.f34x;
        }
        if (!this.f24n) {
            this.f28r.clear();
            int i10 = this.f11a & (-2049);
            this.f23m = false;
            this.f11a = i10 & (-131073);
            this.f35y = true;
        }
        this.f11a |= abstractC0005a.f11a;
        this.f27q.m20326d(abstractC0005a.f27q);
        return m56i0();
    }

    /* renamed from: a0 */
    final AbstractC0005a m44a0(AbstractC6640o abstractC6640o, InterfaceC4981l interfaceC4981l) {
        if (this.f32v) {
            return clone().m44a0(abstractC6640o, interfaceC4981l);
        }
        mo55i(abstractC6640o);
        return m69p0(interfaceC4981l, false);
    }

    /* renamed from: b */
    public AbstractC0005a mo45b() {
        if (this.f30t && !this.f32v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f32v = true;
        return mo39V();
    }

    /* renamed from: b0 */
    public AbstractC0005a mo46b0(int i10, int i11) {
        if (this.f32v) {
            return clone().mo46b0(i10, i11);
        }
        this.f21k = i10;
        this.f20j = i11;
        this.f11a |= 512;
        return m56i0();
    }

    /* renamed from: c0 */
    public AbstractC0005a mo47c0(int i10) {
        if (this.f32v) {
            return clone().mo47c0(i10);
        }
        this.f18h = i10;
        int i11 = this.f11a | 128;
        this.f17g = null;
        this.f11a = i11 & (-65);
        return m56i0();
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC0005a clone() {
        try {
            AbstractC0005a abstractC0005a = (AbstractC0005a) super.clone();
            C4977h c4977h = new C4977h();
            abstractC0005a.f27q = c4977h;
            c4977h.m20326d(this.f27q);
            C4112b c4112b = new C4112b();
            abstractC0005a.f28r = c4112b;
            c4112b.putAll(this.f28r);
            abstractC0005a.f30t = false;
            abstractC0005a.f32v = false;
            return abstractC0005a;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: d0 */
    public AbstractC0005a mo49d0(Drawable drawable) {
        if (this.f32v) {
            return clone().mo49d0(drawable);
        }
        this.f17g = drawable;
        int i10 = this.f11a | 64;
        this.f18h = 0;
        this.f11a = i10 & (-129);
        return m56i0();
    }

    /* renamed from: e */
    public AbstractC0005a mo50e(Class cls) {
        if (this.f32v) {
            return clone().mo50e(cls);
        }
        this.f29s = (Class) AbstractC4121k.m17226d(cls);
        this.f11a |= 4096;
        return m56i0();
    }

    /* renamed from: e0 */
    public AbstractC0005a mo51e0(EnumC1591h enumC1591h) {
        if (this.f32v) {
            return clone().mo51e0(enumC1591h);
        }
        this.f14d = (EnumC1591h) AbstractC4121k.m17226d(enumC1591h);
        this.f11a |= 8;
        return m56i0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0005a) {
            return m31J((AbstractC0005a) obj);
        }
        return false;
    }

    /* renamed from: f */
    public AbstractC0005a mo52f() {
        return mo58j0(C6646u.f25485j, Boolean.FALSE);
    }

    /* renamed from: g */
    public AbstractC0005a mo53g(AbstractC5323j abstractC5323j) {
        if (this.f32v) {
            return clone().mo53g(abstractC5323j);
        }
        this.f13c = (AbstractC5323j) AbstractC4121k.m17226d(abstractC5323j);
        this.f11a |= 4;
        return m56i0();
    }

    /* renamed from: h */
    public AbstractC0005a mo54h() {
        return mo58j0(AbstractC7352i.f27293b, Boolean.TRUE);
    }

    public int hashCode() {
        return AbstractC4122l.m17244q(this.f31u, AbstractC4122l.m17244q(this.f22l, AbstractC4122l.m17244q(this.f29s, AbstractC4122l.m17244q(this.f28r, AbstractC4122l.m17244q(this.f27q, AbstractC4122l.m17244q(this.f14d, AbstractC4122l.m17244q(this.f13c, AbstractC4122l.m17245r(this.f34x, AbstractC4122l.m17245r(this.f33w, AbstractC4122l.m17245r(this.f24n, AbstractC4122l.m17245r(this.f23m, AbstractC4122l.m17243p(this.f21k, AbstractC4122l.m17243p(this.f20j, AbstractC4122l.m17245r(this.f19i, AbstractC4122l.m17244q(this.f25o, AbstractC4122l.m17243p(this.f26p, AbstractC4122l.m17244q(this.f17g, AbstractC4122l.m17243p(this.f18h, AbstractC4122l.m17244q(this.f15e, AbstractC4122l.m17243p(this.f16f, AbstractC4122l.m17240m(this.f12b)))))))))))))))))))));
    }

    /* renamed from: i */
    public AbstractC0005a mo55i(AbstractC6640o abstractC6640o) {
        return mo58j0(AbstractC6640o.f25476h, AbstractC4121k.m17226d(abstractC6640o));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i0 */
    public final AbstractC0005a m56i0() {
        if (!this.f30t) {
            return m21h0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: j */
    public AbstractC0005a mo57j(int i10) {
        if (this.f32v) {
            return clone().mo57j(i10);
        }
        this.f16f = i10;
        int i11 = this.f11a | 32;
        this.f15e = null;
        this.f11a = i11 & (-17);
        return m56i0();
    }

    /* renamed from: j0 */
    public AbstractC0005a mo58j0(C4976g c4976g, Object obj) {
        if (this.f32v) {
            return clone().mo58j0(c4976g, obj);
        }
        AbstractC4121k.m17226d(c4976g);
        AbstractC4121k.m17226d(obj);
        this.f27q.m20327e(c4976g, obj);
        return m56i0();
    }

    /* renamed from: k */
    public AbstractC0005a mo59k(Drawable drawable) {
        if (this.f32v) {
            return clone().mo59k(drawable);
        }
        this.f15e = drawable;
        int i10 = this.f11a | 16;
        this.f16f = 0;
        this.f11a = i10 & (-33);
        return m56i0();
    }

    /* renamed from: k0 */
    public AbstractC0005a mo60k0(InterfaceC4975f interfaceC4975f) {
        if (this.f32v) {
            return clone().mo60k0(interfaceC4975f);
        }
        this.f22l = (InterfaceC4975f) AbstractC4121k.m17226d(interfaceC4975f);
        this.f11a |= EventType.AUTH_FAIL;
        return m56i0();
    }

    /* renamed from: l */
    public AbstractC0005a mo61l() {
        return m19f0(AbstractC6640o.f25471c, new C6650y());
    }

    /* renamed from: l0 */
    public AbstractC0005a mo62l0(float f10) {
        if (this.f32v) {
            return clone().mo62l0(f10);
        }
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.f12b = f10;
            this.f11a |= 2;
            return m56i0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    /* renamed from: m */
    public AbstractC0005a mo63m(EnumC4971b enumC4971b) {
        AbstractC4121k.m17226d(enumC4971b);
        return mo58j0(C6646u.f25481f, enumC4971b).mo58j0(AbstractC7352i.f27292a, enumC4971b);
    }

    /* renamed from: m0 */
    public AbstractC0005a mo64m0(boolean z10) {
        if (this.f32v) {
            return clone().mo64m0(true);
        }
        this.f19i = !z10;
        this.f11a |= 256;
        return m56i0();
    }

    /* renamed from: n0 */
    public AbstractC0005a mo65n0(int i10) {
        return mo58j0(C6323a.f24650b, Integer.valueOf(i10));
    }

    /* renamed from: o */
    public final AbstractC5323j m66o() {
        return this.f13c;
    }

    /* renamed from: o0 */
    public AbstractC0005a mo67o0(InterfaceC4981l interfaceC4981l) {
        return m69p0(interfaceC4981l, true);
    }

    /* renamed from: p */
    public final int m68p() {
        return this.f16f;
    }

    /* renamed from: p0 */
    AbstractC0005a m69p0(InterfaceC4981l interfaceC4981l, boolean z10) {
        if (this.f32v) {
            return clone().m69p0(interfaceC4981l, z10);
        }
        C6648w c6648w = new C6648w(interfaceC4981l, z10);
        m70q0(Bitmap.class, interfaceC4981l, z10);
        m70q0(Drawable.class, c6648w, z10);
        m70q0(BitmapDrawable.class, c6648w.m25962c(), z10);
        m70q0(C7346c.class, new C7349f(interfaceC4981l), z10);
        return m56i0();
    }

    /* renamed from: q0 */
    AbstractC0005a m70q0(Class cls, InterfaceC4981l interfaceC4981l, boolean z10) {
        if (this.f32v) {
            return clone().m70q0(cls, interfaceC4981l, z10);
        }
        AbstractC4121k.m17226d(cls);
        AbstractC4121k.m17226d(interfaceC4981l);
        this.f28r.put(cls, interfaceC4981l);
        int i10 = this.f11a | 2048;
        this.f24n = true;
        int i11 = i10 | 65536;
        this.f11a = i11;
        this.f35y = false;
        if (z10) {
            this.f11a = i11 | 131072;
            this.f23m = true;
        }
        return m56i0();
    }

    /* renamed from: r */
    public final Drawable m71r() {
        return this.f15e;
    }

    /* renamed from: r0 */
    final AbstractC0005a m72r0(AbstractC6640o abstractC6640o, InterfaceC4981l interfaceC4981l) {
        if (this.f32v) {
            return clone().m72r0(abstractC6640o, interfaceC4981l);
        }
        mo55i(abstractC6640o);
        return mo67o0(interfaceC4981l);
    }

    /* renamed from: s */
    public final Drawable m73s() {
        return this.f25o;
    }

    /* renamed from: s0 */
    public AbstractC0005a mo74s0(boolean z10) {
        if (this.f32v) {
            return clone().mo74s0(z10);
        }
        this.f36z = z10;
        this.f11a |= LogType.ANR;
        return m56i0();
    }

    /* renamed from: t */
    public final int m75t() {
        return this.f26p;
    }

    /* renamed from: u */
    public final boolean m76u() {
        return this.f34x;
    }

    /* renamed from: v */
    public final C4977h m77v() {
        return this.f27q;
    }

    /* renamed from: w */
    public final int m78w() {
        return this.f20j;
    }

    /* renamed from: x */
    public final int m79x() {
        return this.f21k;
    }

    /* renamed from: y */
    public final Drawable m80y() {
        return this.f17g;
    }

    /* renamed from: z */
    public final int m81z() {
        return this.f18h;
    }
}
