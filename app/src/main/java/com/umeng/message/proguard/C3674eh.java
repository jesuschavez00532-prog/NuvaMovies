package com.umeng.message.proguard;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.umeng.message.proguard.eh */
/* loaded from: classes3.dex */
public class C3674eh extends FrameLayout {

    /* renamed from: a */
    private a f16459a;

    /* renamed from: b */
    private Boolean f16460b;

    /* renamed from: com.umeng.message.proguard.eh$a */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: f */
        View f16464f;

        /* renamed from: a */
        private final AtomicLong f16461a = new AtomicLong(-1);

        /* renamed from: b */
        private final AtomicLong f16462b = new AtomicLong(0);

        /* renamed from: c */
        private boolean f16463c = false;

        /* renamed from: g */
        public float f16465g = -1.0f;

        /* renamed from: h */
        public float f16466h = -1.0f;

        /* renamed from: i */
        public float f16467i = -1.0f;

        /* renamed from: j */
        public float f16468j = -1.0f;

        /* renamed from: k */
        public float f16469k = -1.0f;

        /* renamed from: l */
        public float f16470l = -1.0f;

        /* renamed from: m */
        public float f16471m = -1.0f;

        /* renamed from: n */
        public float f16472n = -1.0f;

        /* renamed from: a */
        public void mo15659a() {
        }

        /* renamed from: b */
        public void mo15660b() {
        }

        /* renamed from: c */
        protected abstract void mo15661c();

        /* renamed from: d */
        protected abstract void mo15662d();

        /* renamed from: e */
        public final long m15733e() {
            long j10 = this.f16462b.get();
            if (this.f16461a.get() != -1) {
                return j10 + (SystemClock.elapsedRealtime() - this.f16461a.get());
            }
            return j10;
        }

        /* renamed from: a */
        protected void mo15676a(Configuration configuration) {
        }

        /* renamed from: a */
        protected final void m15732a(boolean z10) {
            if (this.f16463c == z10) {
                return;
            }
            this.f16463c = z10;
            if (z10) {
                if (this.f16461a.get() == -1) {
                    this.f16461a.set(SystemClock.elapsedRealtime());
                }
            } else {
                if (this.f16461a.get() != -1) {
                    AtomicLong atomicLong = this.f16462b;
                    atomicLong.set((atomicLong.get() + SystemClock.elapsedRealtime()) - this.f16461a.get());
                }
                this.f16461a.set(-1L);
            }
        }
    }

    public C3674eh(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f16459a != null) {
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action == 1) {
                    this.f16459a.f16466h = motionEvent.getX();
                    this.f16459a.f16468j = motionEvent.getY();
                    this.f16459a.f16471m = motionEvent.getRawX();
                    this.f16459a.f16472n = motionEvent.getRawY();
                }
            } else {
                this.f16459a.f16465g = motionEvent.getX();
                this.f16459a.f16467i = motionEvent.getY();
                this.f16459a.f16469k = motionEvent.getRawX();
                this.f16459a.f16470l = motionEvent.getRawY();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a getOnStatusListener() {
        return this.f16459a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16460b = Boolean.TRUE;
        a aVar = this.f16459a;
        if (aVar != null) {
            aVar.mo15661c();
            aVar.m15732a(true);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = this.f16459a;
        if (aVar != null) {
            aVar.mo15676a(configuration);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        a aVar;
        super.onDetachedFromWindow();
        if (this.f16460b.booleanValue() && (aVar = this.f16459a) != null) {
            aVar.m15732a(false);
            aVar.mo15662d();
        }
        this.f16460b = Boolean.FALSE;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        a aVar = this.f16459a;
        if (aVar != null) {
            if (hasWindowFocus() && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.m15732a(z10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean z11;
        super.onWindowFocusChanged(z10);
        a aVar = this.f16459a;
        if (aVar != null) {
            if (z10 && getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.m15732a(z11);
            if (z10) {
                aVar.mo15659a();
            } else {
                aVar.mo15660b();
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        a aVar = this.f16459a;
        if (aVar != null) {
            if (hasWindowFocus() && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.m15732a(z10);
        }
    }

    public void setOnStatusListener(a aVar) {
        Boolean bool;
        if (aVar != null) {
            aVar.f16464f = this;
        }
        this.f16459a = aVar;
        if (aVar != null && (bool = this.f16460b) != null) {
            if (bool.booleanValue()) {
                aVar.mo15661c();
                aVar.m15732a(true);
            } else {
                aVar.m15732a(false);
                aVar.mo15662d();
            }
        }
    }
}
