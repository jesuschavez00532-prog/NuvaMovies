package p282p5;

import android.graphics.Typeface;

/* renamed from: p5.a */
/* loaded from: classes.dex */
public final class C6214a extends AbstractC6219f {

    /* renamed from: a */
    private final Typeface f24389a;

    /* renamed from: b */
    private final a f24390b;

    /* renamed from: c */
    private boolean f24391c;

    /* renamed from: p5.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo10634a(Typeface typeface);
    }

    public C6214a(a aVar, Typeface typeface) {
        this.f24389a = typeface;
        this.f24390b = aVar;
    }

    /* renamed from: d */
    private void m24785d(Typeface typeface) {
        if (!this.f24391c) {
            this.f24390b.mo10634a(typeface);
        }
    }

    @Override // p282p5.AbstractC6219f
    /* renamed from: a */
    public void mo10295a(int i10) {
        m24785d(this.f24389a);
    }

    @Override // p282p5.AbstractC6219f
    /* renamed from: b */
    public void mo10296b(Typeface typeface, boolean z10) {
        m24785d(typeface);
    }

    /* renamed from: c */
    public void m24786c() {
        this.f24391c = true;
    }
}
