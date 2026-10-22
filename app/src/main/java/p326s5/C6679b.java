package p326s5;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: s5.b */
/* loaded from: classes.dex */
public final class C6679b implements InterfaceC6680c {

    /* renamed from: a */
    private final InterfaceC6680c f25598a;

    /* renamed from: b */
    private final float f25599b;

    public C6679b(float f10, InterfaceC6680c interfaceC6680c) {
        while (interfaceC6680c instanceof C6679b) {
            interfaceC6680c = ((C6679b) interfaceC6680c).f25598a;
            f10 += ((C6679b) interfaceC6680c).f25599b;
        }
        this.f25598a = interfaceC6680c;
        this.f25599b = f10;
    }

    @Override // p326s5.InterfaceC6680c
    /* renamed from: a */
    public float mo26055a(RectF rectF) {
        return Math.max(0.0f, this.f25598a.mo26055a(rectF) + this.f25599b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6679b)) {
            return false;
        }
        C6679b c6679b = (C6679b) obj;
        if (this.f25598a.equals(c6679b.f25598a) && this.f25599b == c6679b.f25599b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25598a, Float.valueOf(this.f25599b)});
    }
}
