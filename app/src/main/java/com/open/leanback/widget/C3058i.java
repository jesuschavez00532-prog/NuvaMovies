package com.open.leanback.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.open.leanback.widget.AbstractC3051b;
import p214l.C5306d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.open.leanback.widget.i */
/* loaded from: classes2.dex */
public class C3058i extends AbstractC3051b {

    /* renamed from: j */
    private final AbstractC3051b.a f12538j = new AbstractC3051b.a(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3058i() {
        m12529C(1);
    }

    /* renamed from: H */
    int m12573H() {
        int i10 = this.f12521g;
        if (i10 >= 0) {
            return i10 + 1;
        }
        int i11 = this.f12523i;
        if (i11 != -1) {
            return Math.min(i11, this.f12516b.getCount() - 1);
        }
        return 0;
    }

    /* renamed from: I */
    int m12574I() {
        int i10 = this.f12520f;
        if (i10 >= 0) {
            return i10 - 1;
        }
        int i11 = this.f12523i;
        if (i11 != -1) {
            return Math.min(i11, this.f12516b.getCount() - 1);
        }
        return this.f12516b.getCount() - 1;
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: c */
    protected final boolean mo12536c(int i10, boolean z10) {
        int i11;
        if (this.f12516b.getCount() == 0) {
            return false;
        }
        if (!z10 && m12537d(i10)) {
            return false;
        }
        int m12573H = m12573H();
        boolean z11 = false;
        while (m12573H < this.f12516b.getCount()) {
            int mo12487e = this.f12516b.mo12487e(m12573H, true, this.f12515a, false);
            if (this.f12520f >= 0 && this.f12521g >= 0) {
                if (this.f12517c) {
                    int i12 = m12573H - 1;
                    i11 = (this.f12516b.mo12485c(i12) - this.f12516b.mo12484b(i12)) - this.f12518d;
                } else {
                    int i13 = m12573H - 1;
                    i11 = this.f12516b.mo12485c(i13) + this.f12516b.mo12484b(i13) + this.f12518d;
                }
                this.f12521g = m12573H;
            } else {
                if (this.f12517c) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                this.f12520f = m12573H;
                this.f12521g = m12573H;
            }
            this.f12516b.mo12486d(this.f12515a[0], m12573H, mo12487e, 0, i11);
            if (!z10 && !m12537d(i10)) {
                m12573H++;
                z11 = true;
            } else {
                return true;
            }
        }
        return z11;
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: f */
    public void mo12539f(int i10, int i11, RecyclerView.AbstractC0797p.c cVar) {
        int m12574I;
        int i12;
        int i13;
        if (!this.f12517c ? i11 < 0 : i11 > 0) {
            if (m12545m() == 0) {
                return;
            }
            m12574I = m12574I();
            int mo12485c = this.f12516b.mo12485c(this.f12520f);
            if (this.f12517c) {
                i12 = this.f12518d;
            } else {
                i12 = -this.f12518d;
            }
            i13 = mo12485c + i12;
        } else {
            if (m12548p() == this.f12516b.getCount() - 1) {
                return;
            }
            m12574I = m12573H();
            int mo12484b = this.f12516b.mo12484b(this.f12521g) + this.f12518d;
            int mo12485c2 = this.f12516b.mo12485c(this.f12521g);
            if (this.f12517c) {
                mo12484b = -mo12484b;
            }
            i13 = mo12484b + mo12485c2;
        }
        cVar.mo3924a(m12574I, Math.abs(i13 - i10));
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: i */
    protected final int mo12541i(boolean z10, int i10, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
        }
        if (this.f12517c) {
            return this.f12516b.mo12485c(i10);
        }
        return this.f12516b.mo12485c(i10) + this.f12516b.mo12484b(i10);
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: k */
    protected final int mo12543k(boolean z10, int i10, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
        }
        if (this.f12517c) {
            return this.f12516b.mo12485c(i10) - this.f12516b.mo12484b(i10);
        }
        return this.f12516b.mo12485c(i10);
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: o */
    public final C5306d[] mo12547o(int i10, int i11) {
        this.f12522h[0].m21378b();
        this.f12522h[0].m21377a(i10);
        this.f12522h[0].m21377a(i11);
        return this.f12522h;
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: q */
    public final AbstractC3051b.a mo12549q(int i10) {
        return this.f12538j;
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: x */
    protected final boolean mo12556x(int i10, boolean z10) {
        int i11;
        if (this.f12516b.getCount() == 0) {
            return false;
        }
        if (!z10 && m12538e(i10)) {
            return false;
        }
        int mo12483a = this.f12516b.mo12483a();
        boolean z11 = false;
        for (int m12574I = m12574I(); m12574I >= mo12483a; m12574I--) {
            int mo12487e = this.f12516b.mo12487e(m12574I, false, this.f12515a, false);
            if (this.f12520f >= 0 && this.f12521g >= 0) {
                if (this.f12517c) {
                    i11 = this.f12516b.mo12485c(m12574I + 1) + this.f12518d + mo12487e;
                } else {
                    i11 = (this.f12516b.mo12485c(m12574I + 1) - this.f12518d) - mo12487e;
                }
                this.f12520f = m12574I;
            } else {
                if (this.f12517c) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                this.f12520f = m12574I;
                this.f12521g = m12574I;
            }
            this.f12516b.mo12486d(this.f12515a[0], m12574I, mo12487e, 0, i11);
            z11 = true;
            if (z10 || m12538e(i10)) {
                break;
            }
        }
        return z11;
    }
}
