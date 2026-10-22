package com.module.previewseekbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.C0470z;
import androidx.core.content.AbstractC0547a;
import com.module.R$drawable;
import com.module.R$styleable;
import com.module.previewseekbar.InterfaceC2985e;
import com.umeng.analytics.pro.C3330by;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p290q.AbstractC6306k;
import sa.InterfaceC6778b;

/* loaded from: classes2.dex */
public class PreviewSeekBar extends C0470z implements InterfaceC2985e, SeekBar.OnSeekBarChangeListener {

    /* renamed from: b */
    private List f12075b;

    /* renamed from: c */
    private C2984d f12076c;

    /* renamed from: d */
    private int f12077d;

    /* renamed from: e */
    private boolean f12078e;

    /* renamed from: f */
    private int f12079f;

    /* renamed from: g */
    private boolean f12080g;

    /* renamed from: h */
    private final Runnable f12081h;

    /* renamed from: com.module.previewseekbar.PreviewSeekBar$a */
    /* loaded from: classes2.dex */
    class RunnableC2980a implements Runnable {
        RunnableC2980a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PreviewSeekBar.this.f12078e = false;
            for (InterfaceC2985e.a aVar : PreviewSeekBar.this.f12075b) {
                PreviewSeekBar previewSeekBar = PreviewSeekBar.this;
                aVar.mo12030a(previewSeekBar, previewSeekBar.getProgress());
            }
        }
    }

    public PreviewSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.seekBarStyle);
    }

    /* renamed from: e */
    private void m12001e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.f12077d = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.f11941M0, 0, 0).getResourceId(R$styleable.PreviewSeekBar_previewFrameLayout, -1);
        }
        setThumb(context.getResources().getDrawable(R$drawable.thumb_progress_thumbnail));
        setProgressDrawable(context.getResources().getDrawable(R$drawable.bg_progress_thumbnail));
        this.f12075b = new ArrayList();
        C2984d c2984d = new C2984d(this, getDefaultColor());
        this.f12076c = c2984d;
        c2984d.m12039l(isEnabled());
        super.setOnSeekBarChangeListener(this);
    }

    private void setIncrement(boolean z10) {
        int i10;
        if (z10) {
            i10 = this.f12079f;
        } else {
            i10 = 5000;
        }
        setKeyProgressIncrement(i10);
    }

    @Override // com.module.previewseekbar.InterfaceC2985e
    /* renamed from: b */
    public void mo12002b(InterfaceC2985e.a aVar) {
        if (!this.f12075b.contains(aVar)) {
            this.f12075b.add(aVar);
        }
    }

    /* renamed from: d */
    public void m12003d() {
        if (isEnabled()) {
            this.f12076c.m12035g();
            this.f12078e = false;
        }
    }

    /* renamed from: f */
    public boolean m12004f() {
        return this.f12076c.m12037j();
    }

    /* renamed from: g */
    public void m12005g() {
        if (isEnabled()) {
            this.f12076c.m12043p();
        }
    }

    public int getDefaultColor() {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT >= 21) {
            colorStateList = getThumbTintList();
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Override // android.widget.AbsSeekBar, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 21 && i10 != 89) {
            if ((i10 == 22 || i10 == 90) && isEnabled()) {
                this.f12080g = true;
                this.f12078e = true;
                if (keyEvent.getRepeatCount() >= 12) {
                    setIncrement(true);
                }
                int progress = getProgress() + getKeyProgressIncrement();
                if (progress > getMax()) {
                    progress = getMax();
                }
                setProgress(progress);
                for (InterfaceC2985e.a aVar : this.f12075b) {
                    removeCallbacks(this.f12081h);
                    aVar.mo12031b(this, progress, i10);
                }
                return true;
            }
        } else if (isEnabled()) {
            this.f12080g = true;
            this.f12078e = true;
            if (keyEvent.getRepeatCount() >= 12) {
                setIncrement(true);
            }
            int progress2 = getProgress() - getKeyProgressIncrement();
            if (progress2 < 0) {
                progress2 = 0;
            }
            setProgress(progress2);
            for (InterfaceC2985e.a aVar2 : this.f12075b) {
                removeCallbacks(this.f12081h);
                aVar2.mo12031b(this, progress2, i10);
            }
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f12080g) {
            this.f12080g = false;
            if (i10 != 21 && i10 != 89) {
                if (i10 == 22 || i10 == 90) {
                    setIncrement(false);
                    Iterator it = this.f12075b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2985e.a) it.next()).mo12032c(this, getProgress());
                    }
                    removeCallbacks(this.f12081h);
                    postDelayed(this.f12081h, 10000L);
                }
            } else {
                setIncrement(false);
                Iterator it2 = this.f12075b.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2985e.a) it2.next()).mo12032c(this, getProgress());
                }
                removeCallbacks(this.f12081h);
                postDelayed(this.f12081h, 10000L);
            }
            return super.onKeyUp(i10, keyEvent);
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f12076c.m12036i() && getWidth() != 0 && getHeight() != 0 && !isInEditMode()) {
            this.f12076c.m12038k((ViewGroup) getParent(), this.f12077d);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        boolean z11;
        for (InterfaceC2985e.a aVar : this.f12075b) {
            if (!z10 && !this.f12078e) {
                z11 = false;
            } else {
                z11 = true;
            }
            aVar.mo12033d(this, i10, z11);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        if (isEnabled()) {
            Iterator it = this.f12075b.iterator();
            while (it.hasNext()) {
                ((InterfaceC2985e.a) it.next()).mo12031b(this, seekBar.getProgress(), 21);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (isEnabled()) {
            Iterator it = this.f12075b.iterator();
            while (it.hasNext()) {
                ((InterfaceC2985e.a) it.next()).mo12030a(this, seekBar.getProgress());
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (isEnabled()) {
                this.f12080g = true;
                this.f12078e = true;
            }
        } else if (motionEvent.getAction() == 1 && this.f12080g) {
            this.f12080g = false;
            this.f12078e = false;
            Iterator it = this.f12075b.iterator();
            while (it.hasNext()) {
                ((InterfaceC2985e.a) it.next()).mo12032c(this, getProgress());
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f12076c.m12039l(z10);
    }

    public void setHasPreview(boolean z10) {
        this.f12076c.m12040m(z10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public synchronized void setMax(int i10) {
        super.setMax(i10);
        setKeyProgressIncrement(5000);
        if (i10 >= 3600000) {
            this.f12079f = 60000;
        } else if (i10 >= 1800000) {
            this.f12079f = 30000;
        } else {
            this.f12079f = C3330by.f14355b;
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
    }

    public void setPreviewColorResourceTint(int i10) {
        setPreviewColorTint(AbstractC0547a.m2322d(getContext(), i10));
    }

    public void setPreviewColorTint(int i10) {
        this.f12076c.m12041n(i10);
        Drawable m25072r = AbstractC6306k.m25072r(getThumb());
        AbstractC6306k.m25068n(m25072r, i10);
        setThumb(m25072r);
        Drawable m25072r2 = AbstractC6306k.m25072r(getProgressDrawable());
        AbstractC6306k.m25068n(m25072r2, i10);
        setProgressDrawable(m25072r2);
    }

    public void setPreviewLoader(InterfaceC6778b interfaceC6778b) {
        this.f12076c.m12042o(interfaceC6778b);
    }

    public PreviewSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12077d = -1;
        this.f12078e = false;
        this.f12079f = 30000;
        this.f12080g = false;
        this.f12081h = new RunnableC2980a();
        m12001e(context, attributeSet);
    }
}
