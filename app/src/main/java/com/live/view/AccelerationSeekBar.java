package com.live.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.SeekBar;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* loaded from: classes2.dex */
public final class AccelerationSeekBar extends SeekBar {

    /* renamed from: a */
    private final String f10903a;

    /* renamed from: b */
    private int f10904b;

    /* renamed from: c */
    private int f10905c;

    /* renamed from: d */
    private int f10906d;

    /* renamed from: e */
    private int f10907e;

    /* renamed from: f */
    private int f10908f;

    /* renamed from: g */
    private boolean f10909g;

    /* renamed from: h */
    public Map f10910h;

    public AccelerationSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private final void m11575a() {
        int i10;
        int i11 = this.f10906d - 1;
        this.f10906d = i11;
        if (i11 <= 0) {
            int i12 = this.f10907e;
            if (i12 <= this.f10905c && (i10 = this.f10904b) != 0) {
                setKeyProgressIncrement(i12 * i10);
                this.f10907e++;
            }
            this.f10906d = 3;
        }
    }

    protected final int getC() {
        return this.f10906d;
    }

    protected final int getD() {
        return this.f10907e;
    }

    protected final int getIncrement() {
        return this.f10904b;
    }

    protected final int getMDuration() {
        return this.f10908f;
    }

    protected final int getMaxMultiple() {
        return this.f10905c;
    }

    public final String getTAG() {
        return this.f10903a;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // android.widget.AbsSeekBar, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 21 || i10 == 22) {
            if (this.f10909g) {
                return false;
            }
            m11575a();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 21 || i10 == 22) {
            this.f10906d = 3;
            this.f10907e = 2;
            setKeyProgressIncrement(this.f10904b);
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC5868k.m23674f(motionEvent, "event");
        return super.onTouchEvent(motionEvent);
    }

    protected final void setC(int i10) {
        this.f10906d = i10;
    }

    protected final void setD(int i10) {
        this.f10907e = i10;
    }

    public final void setDuration(int i10) {
        if (i10 > 0) {
            this.f10908f = i10;
        } else {
            this.f10908f = 1;
        }
        int i11 = this.f10908f;
        if (i11 >= 3600000) {
            this.f10905c = 30;
            this.f10904b = getMax() / 500;
        } else if (i11 >= 1800000) {
            this.f10905c = 20;
            this.f10904b = getMax() / 500;
        } else if (i11 >= 600000) {
            this.f10905c = 10;
            this.f10904b = getMax() / IjkMediaCodecInfo.RANK_LAST_CHANCE;
        } else {
            this.f10905c = 8;
            this.f10904b = getMax() / IjkMediaCodecInfo.RANK_LAST_CHANCE;
        }
    }

    protected final void setIncrement(int i10) {
        this.f10904b = i10;
    }

    protected final void setMDuration(int i10) {
        this.f10908f = i10;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMax(int i10) {
        super.setMax(i10);
        int i11 = i10 / 500;
        this.f10904b = i11;
        setKeyProgressIncrement(i11);
    }

    protected final void setMaxMultiple(int i10) {
        this.f10905c = i10;
    }

    public final void setPause(boolean z10) {
        this.f10909g = z10;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        super.setProgress(i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccelerationSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10910h = new LinkedHashMap();
        this.f10903a = AccelerationSeekBar.class.getSimpleName();
        this.f10904b = 1;
        this.f10905c = 10;
        this.f10906d = 3;
        this.f10907e = 2;
        this.f10908f = 1;
    }

    public /* synthetic */ AccelerationSeekBar(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
