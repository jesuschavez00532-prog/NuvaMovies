package p326s5;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: s5.k */
/* loaded from: classes.dex */
public final class C6688k implements InterfaceC6680c {

    /* renamed from: a */
    private final float f25648a;

    public C6688k(float f10) {
        this.f25648a = f10;
    }

    @Override // p326s5.InterfaceC6680c
    /* renamed from: a */
    public float mo26055a(RectF rectF) {
        return this.f25648a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6688k) && this.f25648a == ((C6688k) obj).f25648a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f25648a)});
    }
}
