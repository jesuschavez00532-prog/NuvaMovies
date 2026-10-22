package p204k5;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: k5.a */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC5130a implements View.OnTouchListener {

    /* renamed from: a */
    private final Dialog f21065a;

    /* renamed from: b */
    private final int f21066b;

    /* renamed from: c */
    private final int f21067c;

    /* renamed from: d */
    private final int f21068d;

    public ViewOnTouchListenerC5130a(Dialog dialog, Rect rect) {
        this.f21065a = dialog;
        this.f21066b = rect.left;
        this.f21067c = rect.top;
        this.f21068d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f21066b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f21067c + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f21068d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f21065a.onTouchEvent(obtain);
    }
}
