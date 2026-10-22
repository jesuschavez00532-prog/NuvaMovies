package com.open.leanback.widget;

/* renamed from: com.open.leanback.widget.m */
/* loaded from: classes2.dex */
class C3062m {

    /* renamed from: a */
    private int f12548a = 0;

    /* renamed from: b */
    public final a f12549b;

    /* renamed from: c */
    public final a f12550c;

    /* renamed from: d */
    private a f12551d;

    /* renamed from: e */
    private a f12552e;

    /* renamed from: com.open.leanback.widget.m$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private int f12553a;

        /* renamed from: b */
        private int f12554b;

        /* renamed from: c */
        private int f12555c;

        /* renamed from: d */
        private int f12556d;

        /* renamed from: e */
        private int f12557e = 2;

        /* renamed from: f */
        private int f12558f = 3;

        /* renamed from: g */
        private int f12559g = 0;

        /* renamed from: h */
        private float f12560h = 50.0f;

        /* renamed from: i */
        private int f12561i;

        /* renamed from: j */
        private int f12562j;

        /* renamed from: k */
        private int f12563k;

        /* renamed from: l */
        private boolean f12564l;

        /* renamed from: m */
        private String f12565m;

        public a(String str) {
            m12626s();
            this.f12565m = str;
        }

        /* renamed from: A */
        public final void m12606A(float f10) {
            if ((f10 >= 0.0f && f10 <= 100.0f) || f10 == -1.0f) {
                this.f12560h = f10;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            r4.f12555c = (r4.f12553a - r4.f12562j) - r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            r4.f12556d = r4.f12554b - r4.f12562j;
         */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m12607B(int r5, int r6, int r7, int r8) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.C3062m.a.m12607B(int, int, int, int):void");
        }

        /* renamed from: a */
        final int m12608a() {
            int i10;
            if (!this.f12564l) {
                int i11 = this.f12559g;
                if (i11 < 0) {
                    i11 += this.f12561i;
                }
                float f10 = this.f12560h;
                if (f10 != -1.0f) {
                    return i11 + ((int) ((this.f12561i * f10) / 100.0f));
                }
                return i11;
            }
            int i12 = this.f12559g;
            if (i12 >= 0) {
                i10 = this.f12561i - i12;
            } else {
                i10 = -i12;
            }
            float f11 = this.f12560h;
            if (f11 != -1.0f) {
                return i10 - ((int) ((this.f12561i * f11) / 100.0f));
            }
            return i10;
        }

        /* renamed from: b */
        final int m12609b(int i10, int i11) {
            return i10 - i11;
        }

        /* renamed from: c */
        public final int m12610c() {
            return (this.f12561i - this.f12562j) - this.f12563k;
        }

        /* renamed from: d */
        public final int m12611d() {
            return this.f12555c;
        }

        /* renamed from: e */
        public final int m12612e() {
            return this.f12556d;
        }

        /* renamed from: f */
        public final int m12613f() {
            return this.f12563k;
        }

        /* renamed from: g */
        public final int m12614g() {
            return this.f12562j;
        }

        /* renamed from: h */
        public final int m12615h(int i10) {
            int i11;
            int i12;
            int m12616i = m12616i();
            int m12608a = m12608a();
            boolean m12623p = m12623p();
            boolean m12622o = m12622o();
            if (!m12623p) {
                int i13 = this.f12562j;
                int i14 = m12608a - i13;
                if (this.f12564l ? (this.f12558f & 2) != 0 : (this.f12558f & 1) != 0) {
                    int i15 = this.f12554b;
                    if (i10 - i15 <= i14) {
                        int i16 = i15 - i13;
                        if (!m12622o && i16 > (i12 = this.f12555c)) {
                            return i12;
                        }
                        return i16;
                    }
                }
            }
            if (!m12622o) {
                int i17 = this.f12563k;
                int i18 = (m12616i - m12608a) - i17;
                if (this.f12564l ? (this.f12558f & 1) != 0 : (this.f12558f & 2) != 0) {
                    int i19 = this.f12553a;
                    if (i19 - i10 <= i18) {
                        int i20 = i19 - (m12616i - i17);
                        if (!m12623p && i20 < (i11 = this.f12556d)) {
                            return i11;
                        }
                        return i20;
                    }
                }
            }
            return m12609b(i10, m12608a);
        }

        /* renamed from: i */
        public final int m12616i() {
            return this.f12561i;
        }

        /* renamed from: j */
        public final int m12617j() {
            return this.f12558f;
        }

        /* renamed from: k */
        public final int m12618k() {
            return this.f12559g;
        }

        /* renamed from: l */
        public final float m12619l() {
            return this.f12560h;
        }

        /* renamed from: m */
        public final void m12620m() {
            this.f12553a = Integer.MAX_VALUE;
            this.f12555c = Integer.MAX_VALUE;
        }

        /* renamed from: n */
        public final void m12621n() {
            this.f12554b = Integer.MIN_VALUE;
            this.f12556d = Integer.MIN_VALUE;
        }

        /* renamed from: o */
        public final boolean m12622o() {
            if (this.f12553a == Integer.MAX_VALUE) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public final boolean m12623p() {
            if (this.f12554b == Integer.MIN_VALUE) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        final boolean m12624q() {
            if ((this.f12557e & 2) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: r */
        final boolean m12625r() {
            if ((this.f12557e & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        void m12626s() {
            this.f12554b = Integer.MIN_VALUE;
            this.f12553a = Integer.MAX_VALUE;
        }

        /* renamed from: t */
        public final void m12627t(int i10, int i11) {
            this.f12562j = i10;
            this.f12563k = i11;
        }

        public String toString() {
            return " min:" + this.f12554b + " " + this.f12556d + " max:" + this.f12553a + " " + this.f12555c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u */
        public final void m12628u(boolean z10) {
            int i10;
            if (z10) {
                i10 = this.f12557e | 2;
            } else {
                i10 = this.f12557e & (-3);
            }
            this.f12557e = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v */
        public final void m12629v(boolean z10) {
            int i10;
            if (z10) {
                i10 = this.f12557e | 1;
            } else {
                i10 = this.f12557e & (-2);
            }
            this.f12557e = i10;
        }

        /* renamed from: w */
        public final void m12630w(boolean z10) {
            this.f12564l = z10;
        }

        /* renamed from: x */
        public final void m12631x(int i10) {
            this.f12561i = i10;
        }

        /* renamed from: y */
        public final void m12632y(int i10) {
            this.f12558f = i10;
        }

        /* renamed from: z */
        public final void m12633z(int i10) {
            this.f12559g = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3062m() {
        a aVar = new a("vertical");
        this.f12549b = aVar;
        a aVar2 = new a("horizontal");
        this.f12550c = aVar2;
        this.f12551d = aVar2;
        this.f12552e = aVar;
    }

    /* renamed from: a */
    public final a m12602a() {
        return this.f12551d;
    }

    /* renamed from: b */
    public final void m12603b() {
        m12602a().m12626s();
    }

    /* renamed from: c */
    public final a m12604c() {
        return this.f12552e;
    }

    /* renamed from: d */
    public final void m12605d(int i10) {
        this.f12548a = i10;
        if (i10 == 0) {
            this.f12551d = this.f12550c;
            this.f12552e = this.f12549b;
        } else {
            this.f12551d = this.f12549b;
            this.f12552e = this.f12550c;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("horizontal=");
        stringBuffer.append(this.f12550c.toString());
        stringBuffer.append("; vertical=");
        stringBuffer.append(this.f12549b.toString());
        return stringBuffer.toString();
    }
}
