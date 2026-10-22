package com.vod.view;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.C0439r;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0751e;
import androidx.lifecycle.InterfaceC0758l;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class LevelImageView extends C0439r implements InterfaceC0751e {

    /* renamed from: c */
    private ObjectAnimator f17439c;

    /* renamed from: d */
    private boolean f17440d;

    /* renamed from: e */
    private int f17441e;

    /* renamed from: f */
    private boolean f17442f;

    public final int getMImageLevel() {
        return this.f17441e;
    }

    public final boolean getShouldShow() {
        return this.f17442f;
    }

    public final void setMImageLevel(int i10) {
        if (this.f17441e == i10) {
            return;
        }
        super.setImageLevel(i10);
        this.f17441e = i10;
    }

    public final void setShouldShow(boolean z10) {
        int i10;
        if (this.f17442f == z10) {
            return;
        }
        this.f17442f = z10;
        if (z10) {
            startAnimation();
            i10 = 0;
        } else {
            stopAnimation();
            i10 = 8;
        }
        setVisibility(i10);
    }

    @InterfaceC0758l(AbstractC0749c.b.ON_RESUME)
    public final void startAnimation() {
        ObjectAnimator objectAnimator;
        if (!this.f17442f) {
            return;
        }
        if (this.f17440d) {
            Drawable background = getBackground();
            AbstractC5868k.m23672d(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            if (!((AnimationDrawable) background).isRunning()) {
                Drawable background2 = getBackground();
                AbstractC5868k.m23672d(background2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((AnimationDrawable) background2).start();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimator2 = this.f17439c;
        boolean z10 = false;
        if (objectAnimator2 != null && !objectAnimator2.isRunning()) {
            z10 = true;
        }
        if (z10 && (objectAnimator = this.f17439c) != null) {
            objectAnimator.start();
        }
    }

    @InterfaceC0758l(AbstractC0749c.b.ON_PAUSE)
    public final void stopAnimation() {
        ObjectAnimator objectAnimator;
        if (!this.f17442f) {
            return;
        }
        if (this.f17440d) {
            Drawable background = getBackground();
            AbstractC5868k.m23672d(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            if (((AnimationDrawable) background).isRunning()) {
                Drawable background2 = getBackground();
                AbstractC5868k.m23672d(background2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((AnimationDrawable) background2).start();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimator2 = this.f17439c;
        boolean z10 = false;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            z10 = true;
        }
        if (z10 && (objectAnimator = this.f17439c) != null) {
            objectAnimator.cancel();
        }
    }
}
