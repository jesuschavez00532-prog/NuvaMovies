package p241n;

import java.util.Arrays;

/* renamed from: n.j */
/* loaded from: classes.dex */
public abstract class AbstractC5706j extends C5702f {

    /* renamed from: v0 */
    protected C5702f[] f22907v0 = new C5702f[4];

    /* renamed from: w0 */
    protected int f22908w0 = 0;

    /* renamed from: I0 */
    public void m23054I0(C5702f c5702f) {
        int i10 = this.f22908w0 + 1;
        C5702f[] c5702fArr = this.f22907v0;
        if (i10 > c5702fArr.length) {
            this.f22907v0 = (C5702f[]) Arrays.copyOf(c5702fArr, c5702fArr.length * 2);
        }
        C5702f[] c5702fArr2 = this.f22907v0;
        int i11 = this.f22908w0;
        c5702fArr2[i11] = c5702f;
        this.f22908w0 = i11 + 1;
    }

    /* renamed from: J0 */
    public void m23055J0() {
        this.f22908w0 = 0;
    }
}
