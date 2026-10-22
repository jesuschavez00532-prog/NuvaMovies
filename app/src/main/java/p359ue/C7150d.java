package p359ue;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p269oe.InterfaceC5974a;
import p344te.InterfaceC6942b;
import re.AbstractC6578f;
import re.C6575c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ue.d */
/* loaded from: classes3.dex */
public final class C7150d implements InterfaceC6942b {

    /* renamed from: a */
    private final CharSequence f26835a;

    /* renamed from: b */
    private final int f26836b;

    /* renamed from: c */
    private final int f26837c;

    /* renamed from: d */
    private final InterfaceC5664p f26838d;

    /* renamed from: ue.d$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator, InterfaceC5974a {

        /* renamed from: a */
        private int f26839a = -1;

        /* renamed from: b */
        private int f26840b;

        /* renamed from: c */
        private int f26841c;

        /* renamed from: d */
        private C6575c f26842d;

        /* renamed from: e */
        private int f26843e;

        a() {
            int m25677e;
            m25677e = AbstractC6578f.m25677e(C7150d.this.f26836b, 0, C7150d.this.f26835a.length());
            this.f26840b = m25677e;
            this.f26841c = m25677e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f26844f.f26837c) goto L9;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m27664b() {
            /*
                r6 = this;
                int r0 = r6.f26841c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f26839a = r1
                r0 = 0
                r6.f26842d = r0
                goto L9e
            Lc:
                ue.d r0 = p359ue.C7150d.this
                int r0 = p359ue.C7150d.m27662c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f26843e
                int r0 = r0 + r3
                r6.f26843e = r0
                ue.d r4 = p359ue.C7150d.this
                int r4 = p359ue.C7150d.m27662c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f26841c
                ue.d r4 = p359ue.C7150d.this
                java.lang.CharSequence r4 = p359ue.C7150d.m27661b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                re.c r0 = new re.c
                int r1 = r6.f26840b
                ue.d r4 = p359ue.C7150d.this
                java.lang.CharSequence r4 = p359ue.C7150d.m27661b(r4)
                int r4 = p359ue.AbstractC7167u.m27766y(r4)
                r0.<init>(r1, r4)
                r6.f26842d = r0
                r6.f26841c = r2
                goto L9c
            L47:
                ue.d r0 = p359ue.C7150d.this
                me.p r0 = p359ue.C7150d.m27660a(r0)
                ue.d r4 = p359ue.C7150d.this
                java.lang.CharSequence r4 = p359ue.C7150d.m27661b(r4)
                int r5 = r6.f26841c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo2391h(r4, r5)
                be.n r0 = (be.C1318n) r0
                if (r0 != 0) goto L77
                re.c r0 = new re.c
                int r1 = r6.f26840b
                ue.d r4 = p359ue.C7150d.this
                java.lang.CharSequence r4 = p359ue.C7150d.m27661b(r4)
                int r4 = p359ue.AbstractC7167u.m27766y(r4)
                r0.<init>(r1, r4)
                r6.f26842d = r0
                r6.f26841c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m5967a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m5968b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f26840b
                re.c r4 = re.AbstractC6576d.m25672g(r4, r2)
                r6.f26842d = r4
                int r2 = r2 + r0
                r6.f26840b = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f26841c = r2
            L9c:
                r6.f26839a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p359ue.C7150d.a.m27664b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6575c next() {
            if (this.f26839a == -1) {
                m27664b();
            }
            if (this.f26839a != 0) {
                C6575c c6575c = this.f26842d;
                AbstractC5868k.m23672d(c6575c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f26842d = null;
                this.f26839a = -1;
                return c6575c;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26839a == -1) {
                m27664b();
            }
            if (this.f26839a == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7150d(CharSequence charSequence, int i10, int i11, InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(charSequence, "input");
        AbstractC5868k.m23674f(interfaceC5664p, "getNextMatch");
        this.f26835a = charSequence;
        this.f26836b = i10;
        this.f26837c = i11;
        this.f26838d = interfaceC5664p;
    }

    @Override // p344te.InterfaceC6942b
    public Iterator iterator() {
        return new a();
    }
}
