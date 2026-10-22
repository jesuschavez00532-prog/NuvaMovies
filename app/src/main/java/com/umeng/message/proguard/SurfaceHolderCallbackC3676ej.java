package com.umeng.message.proguard;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* renamed from: com.umeng.message.proguard.ej */
/* loaded from: classes3.dex */
public final class SurfaceHolderCallbackC3676ej extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    public C3632cv f16483a;

    /* renamed from: b */
    public boolean f16484b;

    public SurfaceHolderCallbackC3676ej(Context context) {
        super(context);
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
        holder.setFormat(-3);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3615ce.m15509a("SurfaceView", "onAttachedToWindow");
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3615ce.m15509a("SurfaceView", "onDetachedFromWindow");
    }

    public final void setVideoPlayer(C3632cv c3632cv) {
        this.f16483a = c3632cv;
        if (c3632cv != null) {
            c3632cv.f16254b = getHolder();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C3615ce.m15509a("SurfaceView", "surfaceChanged format:" + i10 + " width:" + i11 + " height:" + i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C3615ce.m15509a("SurfaceView", "surfaceCreated");
        if (this.f16484b) {
            this.f16484b = true;
            C3632cv c3632cv = this.f16483a;
            if (c3632cv != null) {
                c3632cv.m15587c();
                return;
            }
            return;
        }
        C3632cv c3632cv2 = this.f16483a;
        if (c3632cv2 != null) {
            c3632cv2.m15581a();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C3615ce.m15509a("SurfaceView", "surfaceDestroyed playing:", Boolean.valueOf(this.f16484b));
        C3632cv c3632cv = this.f16483a;
        if (c3632cv != null) {
            boolean m15589d = c3632cv.m15589d();
            this.f16484b = m15589d;
            this.f16483a.m15583a(m15589d);
        }
    }
}
