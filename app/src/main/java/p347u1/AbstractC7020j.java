package p347u1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p109e2.AbstractC4121k;
import p216l1.InterfaceC5331r;
import p216l1.InterfaceC5335v;
import p375w1.C7346c;

/* renamed from: u1.j */
/* loaded from: classes.dex */
public abstract class AbstractC7020j implements InterfaceC5335v, InterfaceC5331r {

    /* renamed from: a */
    protected final Drawable f26395a;

    public AbstractC7020j(Drawable drawable) {
        this.f26395a = (Drawable) AbstractC4121k.m17226d(drawable);
    }

    @Override // p216l1.InterfaceC5331r
    /* renamed from: a */
    public void mo21593a() {
        Drawable drawable = this.f26395a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C7346c) {
            ((C7346c) drawable).m28346e().prepareToDraw();
        }
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f26395a.getConstantState();
        if (constantState == null) {
            return this.f26395a;
        }
        return constantState.newDrawable();
    }
}
