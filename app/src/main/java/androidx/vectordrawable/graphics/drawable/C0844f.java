package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p214l.C5303a;
import p254o.AbstractC5896k;
import p290q.AbstractC6306k;

/* renamed from: androidx.vectordrawable.graphics.drawable.f */
/* loaded from: classes.dex */
public class C0844f extends AbstractC0851m implements Animatable {

    /* renamed from: b */
    private b f3549b;

    /* renamed from: c */
    private Context f3550c;

    /* renamed from: d */
    private ArgbEvaluator f3551d;

    /* renamed from: e */
    private Animator.AnimatorListener f3552e;

    /* renamed from: f */
    ArrayList f3553f;

    /* renamed from: g */
    final Drawable.Callback f3554g;

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$a */
    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0844f.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            C0844f.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0844f.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.f$b */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        int f3556a;

        /* renamed from: b */
        C0852n f3557b;

        /* renamed from: c */
        AnimatorSet f3558c;

        /* renamed from: d */
        ArrayList f3559d;

        /* renamed from: e */
        C5303a f3560e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f3556a = bVar.f3556a;
                C0852n c0852n = bVar.f3557b;
                if (c0852n != null) {
                    Drawable.ConstantState constantState = c0852n.getConstantState();
                    if (resources != null) {
                        this.f3557b = (C0852n) constantState.newDrawable(resources);
                    } else {
                        this.f3557b = (C0852n) constantState.newDrawable();
                    }
                    C0852n c0852n2 = (C0852n) this.f3557b.mutate();
                    this.f3557b = c0852n2;
                    c0852n2.setCallback(callback);
                    this.f3557b.setBounds(bVar.f3557b.getBounds());
                    this.f3557b.m4361h(false);
                }
                ArrayList arrayList = bVar.f3559d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3559d = new ArrayList(size);
                    this.f3560e = new C5303a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) bVar.f3559d.get(i10);
                        Animator clone = animator.clone();
                        String str = (String) bVar.f3560e.get(animator);
                        clone.setTarget(this.f3557b.m4360d(str));
                        this.f3559d.add(clone);
                        this.f3560e.put(clone, str);
                    }
                    m4323a();
                }
            }
        }

        /* renamed from: a */
        public void m4323a() {
            if (this.f3558c == null) {
                this.f3558c = new AnimatorSet();
            }
            this.f3558c.playTogether(this.f3559d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3556a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C0844f() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C0844f m4320a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0844f c0844f = new C0844f(context);
        c0844f.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0844f;
    }

    /* renamed from: b */
    private void m4321b(String str, Animator animator) {
        animator.setTarget(this.f3549b.f3557b.m4360d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m4322c(animator);
        }
        b bVar = this.f3549b;
        if (bVar.f3559d == null) {
            bVar.f3559d = new ArrayList();
            this.f3549b.f3560e = new C5303a();
        }
        this.f3549b.f3559d.add(animator);
        this.f3549b.f3560e.put(animator, str);
    }

    /* renamed from: c */
    private void m4322c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                m4322c(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3551d == null) {
                    this.f3551d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3551d);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25055a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return AbstractC6306k.m25056b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3549b.f3557b.draw(canvas);
        if (this.f3549b.f3558c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return AbstractC6306k.m25058d(drawable);
        }
        return this.f3549b.f3557b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f3549b.f3556a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return AbstractC6306k.m25059e(drawable);
        }
        return this.f3549b.f3557b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3566a != null && Build.VERSION.SDK_INT >= 24) {
            return new c(this.f3566a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f3549b.f3557b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f3549b.f3557b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f3549b.f3557b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25061g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3541e);
                    int resourceId = m23823k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0852n m4354b = C0852n.m4354b(resources, resourceId, theme);
                        m4354b.m4361h(false);
                        m4354b.setCallback(this.f3554g);
                        C0852n c0852n = this.f3549b.f3557b;
                        if (c0852n != null) {
                            c0852n.setCallback(null);
                        }
                        this.f3549b.f3557b = m4354b;
                    }
                    m23823k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0839a.f3542f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3550c;
                        if (context != null) {
                            m4321b(string, AbstractC0848j.m4336i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f3549b.m4323a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return AbstractC6306k.m25062h(drawable);
        }
        return this.f3549b.f3557b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        boolean isRunning;
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            isRunning = AbstractC0840b.m4316a(drawable).isRunning();
            return isRunning;
        }
        return this.f3549b.f3558c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f3549b.f3557b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3549b.f3557b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f3549b.f3557b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f3549b.f3557b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f3549b.f3557b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25064j(drawable, z10);
        } else {
            this.f3549b.f3557b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0851m, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTint(int i10) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25068n(drawable, i10);
        } else {
            this.f3549b.f3557b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25069o(drawable, colorStateList);
        } else {
            this.f3549b.f3557b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC6306k.m25070p(drawable, mode);
        } else {
            this.f3549b.f3557b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f3549b.f3557b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC0840b.m4316a(drawable).start();
        } else {
            if (this.f3549b.f3558c.isStarted()) {
                return;
            }
            this.f3549b.f3558c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            AbstractC0840b.m4316a(drawable).stop();
        } else {
            this.f3549b.f3558c.end();
        }
    }

    private C0844f(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3566a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3549b.f3557b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$c */
    /* loaded from: classes.dex */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f3561a;

        public c(Drawable.ConstantState constantState) {
            this.f3561a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            boolean canApplyTheme;
            canApplyTheme = this.f3561a.canApplyTheme();
            return canApplyTheme;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3561a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0844f c0844f = new C0844f();
            Drawable newDrawable = this.f3561a.newDrawable();
            c0844f.f3566a = newDrawable;
            newDrawable.setCallback(c0844f.f3554g);
            return c0844f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0844f c0844f = new C0844f();
            Drawable newDrawable = this.f3561a.newDrawable(resources);
            c0844f.f3566a = newDrawable;
            newDrawable.setCallback(c0844f.f3554g);
            return c0844f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            Drawable newDrawable;
            C0844f c0844f = new C0844f();
            newDrawable = this.f3561a.newDrawable(resources, theme);
            c0844f.f3566a = newDrawable;
            newDrawable.setCallback(c0844f.f3554g);
            return c0844f;
        }
    }

    private C0844f(Context context, b bVar, Resources resources) {
        this.f3551d = null;
        this.f3552e = null;
        this.f3553f = null;
        a aVar = new a();
        this.f3554g = aVar;
        this.f3550c = context;
        if (bVar != null) {
            this.f3549b = bVar;
        } else {
            this.f3549b = new b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
