package com.module.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.C0439r;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p102db.C4035f;
import p375w1.C7346c;

/* loaded from: classes2.dex */
public final class FixGifImageView extends C0439r {

    /* renamed from: c */
    private C4035f f12182c;

    /* renamed from: d */
    public Map f12183d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixGifImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0439r, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (!isFocused() && getDrawableState()[0] != 16842908) {
            if (isSelected()) {
                C4035f c4035f = this.f12182c;
                if (c4035f != null) {
                    AbstractC5868k.m23671c(c4035f);
                    super.setImageDrawable(c4035f.m17029c());
                    C4035f c4035f2 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f2);
                    if (c4035f2.m17028b() instanceof C7346c) {
                        C4035f c4035f3 = this.f12182c;
                        AbstractC5868k.m23671c(c4035f3);
                        Drawable m17028b = c4035f3.m17028b();
                        AbstractC5868k.m23672d(m17028b, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                        ((C7346c) m17028b).stop();
                    }
                    C4035f c4035f4 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f4);
                    if (c4035f4.m17029c() instanceof C7346c) {
                        C4035f c4035f5 = this.f12182c;
                        AbstractC5868k.m23671c(c4035f5);
                        Drawable m17029c = c4035f5.m17029c();
                        AbstractC5868k.m23672d(m17029c, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                        ((C7346c) m17029c).start();
                    }
                    C4035f c4035f6 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f6);
                    if (c4035f6.m17027a() instanceof C7346c) {
                        C4035f c4035f7 = this.f12182c;
                        AbstractC5868k.m23671c(c4035f7);
                        Drawable m17027a = c4035f7.m17027a();
                        AbstractC5868k.m23672d(m17027a, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                        ((C7346c) m17027a).stop();
                        return;
                    }
                    return;
                }
                return;
            }
            C4035f c4035f8 = this.f12182c;
            if (c4035f8 != null) {
                AbstractC5868k.m23671c(c4035f8);
                super.setImageDrawable(c4035f8.m17028b());
                C4035f c4035f9 = this.f12182c;
                AbstractC5868k.m23671c(c4035f9);
                if (c4035f9.m17028b() instanceof C7346c) {
                    C4035f c4035f10 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f10);
                    Drawable m17028b2 = c4035f10.m17028b();
                    AbstractC5868k.m23672d(m17028b2, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                    ((C7346c) m17028b2).start();
                }
                C4035f c4035f11 = this.f12182c;
                AbstractC5868k.m23671c(c4035f11);
                if (c4035f11.m17029c() instanceof C7346c) {
                    C4035f c4035f12 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f12);
                    Drawable m17029c2 = c4035f12.m17029c();
                    AbstractC5868k.m23672d(m17029c2, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                    ((C7346c) m17029c2).stop();
                }
                C4035f c4035f13 = this.f12182c;
                AbstractC5868k.m23671c(c4035f13);
                if (c4035f13.m17027a() instanceof C7346c) {
                    C4035f c4035f14 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f14);
                    Drawable m17027a2 = c4035f14.m17027a();
                    AbstractC5868k.m23672d(m17027a2, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                    ((C7346c) m17027a2).stop();
                    return;
                }
                return;
            }
            return;
        }
        C4035f c4035f15 = this.f12182c;
        if (c4035f15 != null) {
            AbstractC5868k.m23671c(c4035f15);
            super.setImageDrawable(c4035f15.m17027a());
            C4035f c4035f16 = this.f12182c;
            AbstractC5868k.m23671c(c4035f16);
            if (c4035f16.m17028b() instanceof C7346c) {
                C4035f c4035f17 = this.f12182c;
                AbstractC5868k.m23671c(c4035f17);
                Drawable m17028b3 = c4035f17.m17028b();
                AbstractC5868k.m23672d(m17028b3, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17028b3).stop();
            }
            C4035f c4035f18 = this.f12182c;
            AbstractC5868k.m23671c(c4035f18);
            if (c4035f18.m17029c() instanceof C7346c) {
                C4035f c4035f19 = this.f12182c;
                AbstractC5868k.m23671c(c4035f19);
                Drawable m17029c3 = c4035f19.m17029c();
                AbstractC5868k.m23672d(m17029c3, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17029c3).stop();
            }
            C4035f c4035f20 = this.f12182c;
            AbstractC5868k.m23671c(c4035f20);
            if (c4035f20.m17027a() instanceof C7346c) {
                C4035f c4035f21 = this.f12182c;
                AbstractC5868k.m23671c(c4035f21);
                Drawable m17027a3 = c4035f21.m17027a();
                AbstractC5868k.m23672d(m17027a3, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17027a3).start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4035f c4035f = this.f12182c;
        if (c4035f != null) {
            AbstractC5868k.m23671c(c4035f);
            if (c4035f.m17028b() instanceof C7346c) {
                C4035f c4035f2 = this.f12182c;
                AbstractC5868k.m23671c(c4035f2);
                Drawable m17028b = c4035f2.m17028b();
                AbstractC5868k.m23672d(m17028b, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17028b).stop();
            }
            C4035f c4035f3 = this.f12182c;
            AbstractC5868k.m23671c(c4035f3);
            if (c4035f3.m17029c() instanceof C7346c) {
                C4035f c4035f4 = this.f12182c;
                AbstractC5868k.m23671c(c4035f4);
                Drawable m17029c = c4035f4.m17029c();
                AbstractC5868k.m23672d(m17029c, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17029c).stop();
            }
            C4035f c4035f5 = this.f12182c;
            AbstractC5868k.m23671c(c4035f5);
            if (c4035f5.m17027a() instanceof C7346c) {
                C4035f c4035f6 = this.f12182c;
                AbstractC5868k.m23671c(c4035f6);
                Drawable m17027a = c4035f6.m17027a();
                AbstractC5868k.m23672d(m17027a, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17027a).stop();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            Log.e("FixGifImageView", "find exception and view is " + this);
            throw e10;
        }
    }

    @Override // androidx.appcompat.widget.C0439r, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            this.f12182c = null;
        }
        if (drawable instanceof C4035f) {
            C4035f c4035f = (C4035f) drawable;
            this.f12182c = c4035f;
            if (!isFocused() && getDrawableState()[0] != 16842908) {
                if (isSelected()) {
                    super.setImageDrawable(c4035f.m17029c());
                    C4035f c4035f2 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f2);
                    if (c4035f2.m17028b() instanceof C7346c) {
                        C4035f c4035f3 = this.f12182c;
                        AbstractC5868k.m23671c(c4035f3);
                        Drawable m17028b = c4035f3.m17028b();
                        AbstractC5868k.m23672d(m17028b, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                        ((C7346c) m17028b).stop();
                    }
                    C4035f c4035f4 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f4);
                    if (c4035f4.m17029c() instanceof C7346c) {
                        C4035f c4035f5 = this.f12182c;
                        AbstractC5868k.m23671c(c4035f5);
                        Drawable m17029c = c4035f5.m17029c();
                        AbstractC5868k.m23672d(m17029c, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                        ((C7346c) m17029c).start();
                    }
                    C4035f c4035f6 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f6);
                    if (c4035f6.m17027a() instanceof C7346c) {
                        C4035f c4035f7 = this.f12182c;
                        AbstractC5868k.m23671c(c4035f7);
                        Drawable m17027a = c4035f7.m17027a();
                        AbstractC5868k.m23672d(m17027a, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                        ((C7346c) m17027a).stop();
                        return;
                    }
                    return;
                }
                super.setImageDrawable(c4035f.m17028b());
                C4035f c4035f8 = this.f12182c;
                AbstractC5868k.m23671c(c4035f8);
                if (c4035f8.m17028b() instanceof C7346c) {
                    C4035f c4035f9 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f9);
                    Drawable m17028b2 = c4035f9.m17028b();
                    AbstractC5868k.m23672d(m17028b2, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                    ((C7346c) m17028b2).start();
                }
                C4035f c4035f10 = this.f12182c;
                AbstractC5868k.m23671c(c4035f10);
                if (c4035f10.m17029c() instanceof C7346c) {
                    C4035f c4035f11 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f11);
                    Drawable m17029c2 = c4035f11.m17029c();
                    AbstractC5868k.m23672d(m17029c2, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                    ((C7346c) m17029c2).stop();
                }
                C4035f c4035f12 = this.f12182c;
                AbstractC5868k.m23671c(c4035f12);
                if (c4035f12.m17027a() instanceof C7346c) {
                    C4035f c4035f13 = this.f12182c;
                    AbstractC5868k.m23671c(c4035f13);
                    Drawable m17027a2 = c4035f13.m17027a();
                    AbstractC5868k.m23672d(m17027a2, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                    ((C7346c) m17027a2).stop();
                    return;
                }
                return;
            }
            super.setImageDrawable(c4035f.m17027a());
            C4035f c4035f14 = this.f12182c;
            AbstractC5868k.m23671c(c4035f14);
            if (c4035f14.m17028b() instanceof C7346c) {
                C4035f c4035f15 = this.f12182c;
                AbstractC5868k.m23671c(c4035f15);
                Drawable m17028b3 = c4035f15.m17028b();
                AbstractC5868k.m23672d(m17028b3, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17028b3).stop();
            }
            C4035f c4035f16 = this.f12182c;
            AbstractC5868k.m23671c(c4035f16);
            if (c4035f16.m17029c() instanceof C7346c) {
                C4035f c4035f17 = this.f12182c;
                AbstractC5868k.m23671c(c4035f17);
                Drawable m17029c3 = c4035f17.m17029c();
                AbstractC5868k.m23672d(m17029c3, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17029c3).stop();
            }
            C4035f c4035f18 = this.f12182c;
            AbstractC5868k.m23671c(c4035f18);
            if (c4035f18.m17027a() instanceof C7346c) {
                C4035f c4035f19 = this.f12182c;
                AbstractC5868k.m23671c(c4035f19);
                Drawable m17027a3 = c4035f19.m17027a();
                AbstractC5868k.m23672d(m17027a3, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
                ((C7346c) m17027a3).start();
                return;
            }
            return;
        }
        super.setImageDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixGifImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f12183d = new LinkedHashMap();
    }

    public /* synthetic */ FixGifImageView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
