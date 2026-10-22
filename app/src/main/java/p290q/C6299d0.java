package p290q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.d0 */
/* loaded from: classes.dex */
public final class C6299d0 extends Drawable.ConstantState {

    /* renamed from: a */
    int f24642a;

    /* renamed from: b */
    Drawable.ConstantState f24643b;

    /* renamed from: c */
    ColorStateList f24644c;

    /* renamed from: d */
    PorterDuff.Mode f24645d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6299d0(C6299d0 c6299d0) {
        this.f24644c = null;
        this.f24645d = C6293a0.f24634g;
        if (c6299d0 != null) {
            this.f24642a = c6299d0.f24642a;
            this.f24643b = c6299d0.f24643b;
            this.f24644c = c6299d0.f24644c;
            this.f24645d = c6299d0.f24645d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m25048a() {
        if (this.f24643b != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10;
        int i11 = this.f24642a;
        Drawable.ConstantState constantState = this.f24643b;
        if (constantState != null) {
            i10 = constantState.getChangingConfigurations();
        } else {
            i10 = 0;
        }
        return i11 | i10;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C6297c0(this, resources);
        }
        return new C6293a0(this, resources);
    }
}
