package p121f;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.resources.R$styleable;
import androidx.vectordrawable.graphics.drawable.C0844f;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p121f.AbstractC4203d;
import p121f.AbstractC4205f;
import p214l.C5308f;
import p214l.C5312j;
import p254o.AbstractC5896k;
import p290q.InterfaceC6320y;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: f.c */
/* loaded from: classes.dex */
public class C4202c extends AbstractC4205f implements InterfaceC6320y {

    /* renamed from: o */
    private c f18389o;

    /* renamed from: p */
    private g f18390p;

    /* renamed from: q */
    private int f18391q;

    /* renamed from: r */
    private int f18392r;

    /* renamed from: s */
    private boolean f18393s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.c$b */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a */
        private final Animatable f18394a;

        b(Animatable animatable) {
            super();
            this.f18394a = animatable;
        }

        @Override // p121f.C4202c.g
        /* renamed from: c */
        public void mo17524c() {
            this.f18394a.start();
        }

        @Override // p121f.C4202c.g
        /* renamed from: d */
        public void mo17525d() {
            this.f18394a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.c$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC4205f.a {

        /* renamed from: K */
        C5308f f18395K;

        /* renamed from: L */
        C5312j f18396L;

        c(c cVar, C4202c c4202c, Resources resources) {
            super(cVar, c4202c, resources);
            if (cVar != null) {
                this.f18395K = cVar.f18395K;
                this.f18396L = cVar.f18396L;
            } else {
                this.f18395K = new C5308f();
                this.f18396L = new C5312j();
            }
        }

        /* renamed from: D */
        private static long m17526D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        /* renamed from: B */
        int m17527B(int[] iArr, Drawable drawable, int i10) {
            int m17579z = super.m17579z(iArr, drawable);
            this.f18396L.m21444j(m17579z, Integer.valueOf(i10));
            return m17579z;
        }

        /* renamed from: C */
        int m17528C(int i10, int i11, Drawable drawable, boolean z10) {
            long j10;
            int m17553a = super.m17553a(drawable);
            long m17526D = m17526D(i10, i11);
            if (z10) {
                j10 = IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            } else {
                j10 = 0;
            }
            long j11 = m17553a;
            this.f18395K.m21390a(m17526D, Long.valueOf(j11 | j10));
            if (z10) {
                this.f18395K.m21390a(m17526D(i11, i10), Long.valueOf(IjkMediaMeta.AV_CH_WIDE_RIGHT | j11 | j10));
            }
            return m17553a;
        }

        /* renamed from: E */
        int m17529E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return ((Integer) this.f18396L.m21441g(i10, 0)).intValue();
        }

        /* renamed from: F */
        int m17530F(int[] iArr) {
            int m17578A = super.m17578A(iArr);
            if (m17578A >= 0) {
                return m17578A;
            }
            return super.m17578A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m17531G(int i10, int i11) {
            return (int) ((Long) this.f18395K.m21395h(m17526D(i10, i11), -1L)).longValue();
        }

        /* renamed from: H */
        boolean m17532H(int i10, int i11) {
            if ((((Long) this.f18395K.m21395h(m17526D(i10, i11), -1L)).longValue() & IjkMediaMeta.AV_CH_WIDE_RIGHT) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: I */
        boolean m17533I(int i10, int i11) {
            if ((((Long) this.f18395K.m21395h(m17526D(i10, i11), -1L)).longValue() & IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) != 0) {
                return true;
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C4202c(this, null);
        }

        @Override // p121f.AbstractC4205f.a, p121f.AbstractC4203d.d
        /* renamed from: r */
        void mo17534r() {
            this.f18395K = this.f18395K.clone();
            this.f18396L = this.f18396L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C4202c(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.c$d */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a */
        private final C0844f f18397a;

        d(C0844f c0844f) {
            super();
            this.f18397a = c0844f;
        }

        @Override // p121f.C4202c.g
        /* renamed from: c */
        public void mo17524c() {
            this.f18397a.start();
        }

        @Override // p121f.C4202c.g
        /* renamed from: d */
        public void mo17525d() {
            this.f18397a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.c$e */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a */
        private final ObjectAnimator f18398a;

        /* renamed from: b */
        private final boolean f18399b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int i10 = 0;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z10) {
                i10 = numberOfFrames - 1;
            } else {
                i10 = 0;
            }
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.m17537a());
            ofInt.setInterpolator(fVar);
            this.f18399b = z11;
            this.f18398a = ofInt;
        }

        @Override // p121f.C4202c.g
        /* renamed from: a */
        public boolean mo17535a() {
            return this.f18399b;
        }

        @Override // p121f.C4202c.g
        /* renamed from: b */
        public void mo17536b() {
            this.f18398a.reverse();
        }

        @Override // p121f.C4202c.g
        /* renamed from: c */
        public void mo17524c() {
            this.f18398a.start();
        }

        @Override // p121f.C4202c.g
        /* renamed from: d */
        public void mo17525d() {
            this.f18398a.cancel();
        }
    }

    /* renamed from: f.c$f */
    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f18400a;

        /* renamed from: b */
        private int f18401b;

        /* renamed from: c */
        private int f18402c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            m17538b(animationDrawable, z10);
        }

        /* renamed from: a */
        int m17537a() {
            return this.f18402c;
        }

        /* renamed from: b */
        int m17538b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f18401b = numberOfFrames;
            int[] iArr = this.f18400a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f18400a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f18400a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f18402c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = 0.0f;
            int i10 = (int) ((f10 * this.f18402c) + 0.5f);
            int i11 = this.f18401b;
            int[] iArr = this.f18400a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            if (i12 < i11) {
                f11 = i10 / this.f18402c;
            } else {
                f11 = 0.0f;
            }
            return (i12 / i11) + f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.c$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        /* renamed from: a */
        public boolean mo17535a() {
            return false;
        }

        /* renamed from: b */
        public void mo17536b() {
        }

        /* renamed from: c */
        public abstract void mo17524c();

        /* renamed from: d */
        public abstract void mo17525d();
    }

    public C4202c() {
        this(null, null);
    }

    /* renamed from: l */
    public static C4202c m17513l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C4202c c4202c = new C4202c();
            c4202c.m17523m(context, resources, xmlPullParser, attributeSet, theme);
            return c4202c;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: n */
    private void m17514n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            m17516p(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            m17517q(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    private void m17515o() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r7.getName().equals("vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r5 = androidx.vectordrawable.graphics.drawable.C0852n.m4355c(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r4.f18389o.m17527B(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5 != 4) goto L28;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m17516p(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
        /*
            r4 = this;
            int[] r0 = androidx.appcompat.resources.R$styleable.f1222b
            android.content.res.TypedArray r0 = p254o.AbstractC5896k.m23823k(r6, r9, r8, r0)
            int r1 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableItem_android_drawable
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.c2 r3 = androidx.appcompat.widget.C0382c2.m1640h()
            android.graphics.drawable.Drawable r5 = r3.m1649j(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.m17577j(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L70
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L57
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.n r5 = androidx.vectordrawable.graphics.drawable.C0852n.m4355c(r6, r7, r8, r9)
            goto L70
        L47:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r5 < r3) goto L52
            android.graphics.drawable.Drawable r5 = p121f.AbstractC4200a.m17511a(r6, r7, r8, r9)
            goto L70
        L52:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8)
            goto L70
        L57:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L70:
            if (r5 == 0) goto L79
            f.c$c r6 = r4.f18389o
            int r5 = r6.m17527B(r0, r5, r1)
            return r5
        L79:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            goto L93
        L92:
            throw r5
        L93:
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: p121f.C4202c.m17516p(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r10.getName().equals("animated-vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r4 = androidx.vectordrawable.graphics.drawable.C0844f.m4320a(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r1 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r3 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        return r7.f18389o.m17528C(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r4 != 4) goto L32;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m17517q(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            int[] r0 = androidx.appcompat.resources.R$styleable.f1223c
            android.content.res.TypedArray r0 = p254o.AbstractC5896k.m23823k(r9, r12, r11, r0)
            int r1 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.c2 r5 = androidx.appcompat.widget.C0382c2.m1640h()
            android.graphics.drawable.Drawable r4 = r5.m1649j(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L78
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L5f
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            androidx.vectordrawable.graphics.drawable.f r4 = androidx.vectordrawable.graphics.drawable.C0844f.m4320a(r8, r9, r10, r11, r12)
            goto L78
        L4f:
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r8 < r4) goto L5a
            android.graphics.drawable.Drawable r4 = p121f.AbstractC4200a.m17511a(r9, r10, r11, r12)
            goto L78
        L5a:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11)
            goto L78
        L5f:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L78:
            if (r4 == 0) goto La0
            if (r1 == r2) goto L85
            if (r3 == r2) goto L85
            f.c$c r8 = r7.f18389o
            int r8 = r8.m17528C(r1, r3, r4, r5)
            return r8
        L85:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La0:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            goto Lba
        Lb9:
            throw r8
        Lba:
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: p121f.C4202c.m17517q(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* renamed from: r */
    private boolean m17518r(int i10) {
        int m17543c;
        int m17531G;
        g bVar;
        g gVar = this.f18390p;
        if (gVar != null) {
            if (i10 == this.f18391q) {
                return true;
            }
            if (i10 == this.f18392r && gVar.mo17535a()) {
                gVar.mo17536b();
                this.f18391q = this.f18392r;
                this.f18392r = i10;
                return true;
            }
            m17543c = this.f18391q;
            gVar.mo17525d();
        } else {
            m17543c = m17543c();
        }
        this.f18390p = null;
        this.f18392r = -1;
        this.f18391q = -1;
        c cVar = this.f18389o;
        int m17529E = cVar.m17529E(m17543c);
        int m17529E2 = cVar.m17529E(i10);
        if (m17529E2 == 0 || m17529E == 0 || (m17531G = cVar.m17531G(m17529E, m17529E2)) < 0) {
            return false;
        }
        boolean m17533I = cVar.m17533I(m17529E, m17529E2);
        m17544g(m17531G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m17532H(m17529E, m17529E2), m17533I);
        } else if (current instanceof C0844f) {
            bVar = new d((C0844f) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.mo17524c();
        this.f18390p = bVar;
        this.f18392r = m17543c;
        this.f18391q = i10;
        return true;
    }

    /* renamed from: s */
    private void m17519s(TypedArray typedArray) {
        int changingConfigurations;
        c cVar = this.f18389o;
        if (Build.VERSION.SDK_INT >= 21) {
            int i10 = cVar.f18429d;
            changingConfigurations = typedArray.getChangingConfigurations();
            cVar.f18429d = i10 | changingConfigurations;
        }
        cVar.m17573x(typedArray.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f18434i));
        cVar.m17569t(typedArray.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_constantSize, cVar.f18437l));
        cVar.m17570u(typedArray.getInt(R$styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f18417A));
        cVar.m17571v(typedArray.getInt(R$styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f18418B));
        setDither(typedArray.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_dither, cVar.f18449x));
    }

    @Override // p121f.AbstractC4205f, p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p121f.AbstractC4205f, p121f.AbstractC4203d
    /* renamed from: h */
    public void mo17521h(AbstractC4203d.d dVar) {
        super.mo17521h(dVar);
        if (dVar instanceof c) {
            this.f18389o = (c) dVar;
        }
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f18390p;
        if (gVar != null) {
            gVar.mo17525d();
            this.f18390p = null;
            m17544g(this.f18391q);
            this.f18391q = -1;
            this.f18392r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p121f.AbstractC4203d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c mo17520b() {
        return new c(this.f18389o, this, null);
    }

    /* renamed from: m */
    public void m17523m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, R$styleable.f1221a);
        setVisible(m23823k.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        m17519s(m23823k);
        m17545i(resources);
        m23823k.recycle();
        m17514n(context, resources, xmlPullParser, attributeSet, theme);
        m17515o();
    }

    @Override // p121f.AbstractC4205f, p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f18393s && super.mutate() == this) {
            this.f18389o.mo17534r();
            this.f18393s = true;
        }
        return this;
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    @Override // p121f.AbstractC4205f, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        int m17530F = this.f18389o.m17530F(iArr);
        if (m17530F != m17543c() && (m17518r(m17530F) || m17544g(m17530F))) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z10 | current.setState(iArr);
        }
        return z10;
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f18390p;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.mo17524c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C4202c(c cVar, Resources resources) {
        super(null);
        this.f18391q = -1;
        this.f18392r = -1;
        mo17521h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
