package com.widget.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;

/* loaded from: classes3.dex */
public final class CustomViewPager extends ViewPager {
    public Map<Integer, View> _$_findViewCache;
    private boolean isScrollable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPager(Context context) {
        super(context);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this._$_findViewCache = new LinkedHashMap();
        this.isScrollable = true;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (this.isScrollable) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.isScrollable) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.isScrollable) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setScrollable(boolean z10) {
        this.isScrollable = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attrs");
        this._$_findViewCache = new LinkedHashMap();
        this.isScrollable = true;
    }
}
