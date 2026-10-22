package com.swlauthnew.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ScrollTextView extends TextView {
    Handler mHandler;
    Runnable mRunnable;

    public ScrollTextView(Context context) {
        this(context, null);
    }

    private void initSrcoll() {
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        if (this.mRunnable == null) {
            this.mRunnable = new Runnable() { // from class: com.swlauthnew.view.ScrollTextView.1
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
                        ScrollTextView.this.mHandler.postDelayed(this, 1000L);
                    } else {
                        ScrollTextView.this.scrollBy(0, 1);
                        ScrollTextView.this.mHandler.postDelayed(this, 100L);
                    }
                }
            };
        }
    }

    private void startScroll() {
        initSrcoll();
        scrollTo(0, 0);
        this.mHandler.removeCallbacks(this.mRunnable);
        this.mHandler.postDelayed(this.mRunnable, 3000L);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        startScroll();
    }

    public ScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
