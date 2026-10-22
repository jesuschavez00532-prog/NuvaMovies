package com.open.leanback.widget;

/* renamed from: com.open.leanback.widget.d */
/* loaded from: classes2.dex */
public abstract class AbstractC3053d {

    /* renamed from: com.open.leanback.widget.d$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        int f12531a = -1;

        /* renamed from: b */
        int f12532b = -1;

        /* renamed from: c */
        int f12533c = 0;

        /* renamed from: d */
        float f12534d = 50.0f;

        /* renamed from: e */
        boolean f12535e = false;

        /* renamed from: f */
        private boolean f12536f;

        /* renamed from: a */
        public final int m12562a() {
            return this.f12533c;
        }

        /* renamed from: b */
        public final float m12563b() {
            return this.f12534d;
        }

        /* renamed from: c */
        public final int m12564c() {
            return this.f12531a;
        }

        /* renamed from: d */
        public boolean m12565d() {
            return this.f12536f;
        }

        /* renamed from: e */
        public final void m12566e(int i10) {
            this.f12533c = i10;
        }

        /* renamed from: f */
        public final void m12567f(float f10) {
            if ((f10 >= 0.0f && f10 <= 100.0f) || f10 == -1.0f) {
                this.f12534d = f10;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final void m12568g(boolean z10) {
            this.f12535e = z10;
        }

        /* renamed from: h */
        public final void m12569h(int i10) {
            this.f12531a = i10;
        }
    }
}
