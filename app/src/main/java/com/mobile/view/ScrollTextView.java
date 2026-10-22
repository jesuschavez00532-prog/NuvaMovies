package com.mobile.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public class ScrollTextView extends AppCompatTextView {

    /* renamed from: a */
    private Handler f11853a;

    /* renamed from: b */
    private Runnable f11854b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mobile.view.ScrollTextView$a */
    /* loaded from: classes2.dex */
    public class RunnableC2971a implements Runnable {
        RunnableC2971a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int height = (ScrollTextView.this.getHeight() - ScrollTextView.this.getPaddingBottom()) - ScrollTextView.this.getPaddingTop();
            int scrollY = ScrollTextView.this.getScrollY();
            int lineHeight = ScrollTextView.this.getLineHeight();
            int lineCount = ScrollTextView.this.getLineCount();
            if (lineCount <= Math.floor(height / lineHeight)) {
                return;
            }
            if (scrollY >= lineCount * lineHeight) {
                ScrollTextView.this.scrollTo(0, 0);
                ScrollTextView.this.f11853a.postDelayed(this, 1000L);
            } else {
                ScrollTextView.this.scrollBy(0, 1);
                ScrollTextView.this.f11853a.postDelayed(this, 100L);
            }
        }
    }

    public ScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: h */
    private void m11952h() {
        if (this.f11853a == null) {
            this.f11853a = new Handler(Looper.getMainLooper());
        }
        if (this.f11854b == null) {
            this.f11854b = new RunnableC2971a();
        }
    }

    /* renamed from: i */
    private void m11953i() {
        m11952h();
        scrollTo(0, 0);
        this.f11853a.removeCallbacks(this.f11854b);
        this.f11853a.postDelayed(this.f11854b, 5000L);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f11853a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m11953i();
    }
}
