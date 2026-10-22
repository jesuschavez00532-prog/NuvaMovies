package org.xutils.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.xutils.common.util.LogUtil;

/* loaded from: classes3.dex */
public class GifDrawable extends Drawable implements Runnable, Animatable {
    private int byteCount;
    private final int duration;
    private final Movie movie;
    private volatile boolean running;
    private int rate = 100;
    private final long begin = SystemClock.uptimeMillis();

    public GifDrawable(Movie movie, int i10) {
        this.movie = movie;
        this.byteCount = i10;
        this.duration = movie.duration();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        try {
            if (this.duration > 0) {
                i10 = ((int) (SystemClock.uptimeMillis() - this.begin)) % this.duration;
            } else {
                i10 = 0;
            }
            this.movie.setTime(i10);
            this.movie.draw(canvas, 0.0f, 0.0f);
            start();
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    public int getByteCount() {
        if (this.byteCount == 0) {
            this.byteCount = this.movie.width() * this.movie.height() * 3 * 5;
        }
        return this.byteCount;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.movie.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.movie.width();
    }

    public Movie getMovie() {
        return this.movie;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.movie.isOpaque()) {
            return -1;
        }
        return -3;
    }

    public int getRate() {
        return this.rate;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.running && this.duration > 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.duration > 0) {
            invalidateSelf();
            scheduleSelf(this, SystemClock.uptimeMillis() + this.rate);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setRate(int i10) {
        this.rate = i10;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (!isRunning()) {
            this.running = true;
            run();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (isRunning()) {
            this.running = false;
            unscheduleSelf(this);
        }
    }
}
