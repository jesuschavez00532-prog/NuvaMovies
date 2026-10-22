package p322s1;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import p109e2.AbstractC4122l;
import p184j1.InterfaceC4981l;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5571d;

/* renamed from: s1.h */
/* loaded from: classes.dex */
public abstract class AbstractC6626h implements InterfaceC4981l {
    @Override // p184j1.InterfaceC4981l
    /* renamed from: b */
    public final InterfaceC5335v mo20332b(Context context, InterfaceC5335v interfaceC5335v, int i10, int i11) {
        if (AbstractC4122l.m17249v(i10, i11)) {
            InterfaceC5571d m7288g = ComponentCallbacks2C1586c.m7276d(context).m7288g();
            Bitmap bitmap = (Bitmap) interfaceC5335v.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap mo25853c = mo25853c(m7288g, bitmap, i10, i11);
            if (!bitmap.equals(mo25853c)) {
                return C6624g.m25851e(mo25853c, m7288g);
            }
            return interfaceC5335v;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: c */
    protected abstract Bitmap mo25853c(InterfaceC5571d interfaceC5571d, Bitmap bitmap, int i10, int i11);
}
