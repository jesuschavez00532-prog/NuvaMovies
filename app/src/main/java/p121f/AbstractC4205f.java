package p121f;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p121f.AbstractC4203d;

/* renamed from: f.f */
/* loaded from: classes.dex */
abstract class AbstractC4205f extends AbstractC4203d {

    /* renamed from: m */
    private a f18453m;

    /* renamed from: n */
    private boolean f18454n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.f$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC4203d.d {

        /* renamed from: J */
        int[][] f18455J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, AbstractC4205f abstractC4205f, Resources resources) {
            super(aVar, abstractC4205f, resources);
            if (aVar != null) {
                this.f18455J = aVar.f18455J;
            } else {
                this.f18455J = new int[m17557f()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A */
        public int m17578A(int[] iArr) {
            int[][] iArr2 = this.f18455J;
            int m17559h = m17559h();
            for (int i10 = 0; i10 < m17559h; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // p121f.AbstractC4203d.d
        /* renamed from: o */
        public void mo17566o(int i10, int i11) {
            super.mo17566o(i10, i11);
            int[][] iArr = new int[i11];
            System.arraycopy(this.f18455J, 0, iArr, 0, i10);
            this.f18455J = iArr;
        }

        @Override // p121f.AbstractC4203d.d
        /* renamed from: r */
        abstract void mo17534r();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public int m17579z(int[] iArr, Drawable drawable) {
            int m17553a = m17553a(drawable);
            this.f18455J[m17553a] = iArr;
            return m17553a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4205f(a aVar) {
        if (aVar != null) {
            mo17521h(aVar);
        }
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p121f.AbstractC4203d
    /* renamed from: h */
    public void mo17521h(AbstractC4203d.d dVar) {
        super.mo17521h(dVar);
        if (dVar instanceof a) {
            this.f18453m = (a) dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m17577j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    @Override // p121f.AbstractC4203d, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f18454n && super.mutate() == this) {
            this.f18453m.mo17534r();
            this.f18454n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected abstract boolean onStateChange(int[] iArr);
}
