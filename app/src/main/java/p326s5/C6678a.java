package p326s5;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: s5.a */
/* loaded from: classes.dex */
public final class C6678a implements InterfaceC6680c {

    /* renamed from: a */
    private final float f25597a;

    public C6678a(float f10) {
        this.f25597a = f10;
    }

    @Override // p326s5.InterfaceC6680c
    /* renamed from: a */
    public float mo26055a(RectF rectF) {
        return this.f25597a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6678a) && this.f25597a == ((C6678a) obj).f25597a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f25597a)});
    }
}
