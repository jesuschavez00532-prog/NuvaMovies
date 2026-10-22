package com.open.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.open.leanback.widget.AbstractC3053d;
import com.open.leanback.widget.GridLayoutManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.open.leanback.widget.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3054e {

    /* renamed from: a */
    private static Rect f12537a = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m12570a(View view, AbstractC3053d.a aVar, int i10) {
        View view2;
        int i11;
        int height;
        int width;
        int width2;
        int width3;
        GridLayoutManager.C3047e c3047e = (GridLayoutManager.C3047e) view.getLayoutParams();
        int i12 = aVar.f12531a;
        if (i12 == 0 || (view2 = view.findViewById(i12)) == null) {
            view2 = view;
        }
        int i13 = aVar.f12533c;
        if (i10 == 0) {
            if (view.getLayoutDirection() == 1) {
                if (view2 == view) {
                    width2 = c3047e.m12500r(view2);
                } else {
                    width2 = view2.getWidth();
                }
                int i14 = width2 - i13;
                if (aVar.f12535e) {
                    float f10 = aVar.f12534d;
                    if (f10 == 0.0f) {
                        i14 -= view2.getPaddingRight();
                    } else if (f10 == 100.0f) {
                        i14 += view2.getPaddingLeft();
                    }
                }
                if (aVar.f12534d != -1.0f) {
                    if (view2 == view) {
                        width3 = c3047e.m12500r(view2);
                    } else {
                        width3 = view2.getWidth();
                    }
                    i14 -= (int) ((width3 * aVar.f12534d) / 100.0f);
                }
                if (view != view2) {
                    Rect rect = f12537a;
                    rect.right = i14;
                    ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                    return f12537a.right + c3047e.m12497o();
                }
                return i14;
            }
            if (aVar.f12535e) {
                float f11 = aVar.f12534d;
                if (f11 == 0.0f) {
                    i13 += view2.getPaddingLeft();
                } else if (f11 == 100.0f) {
                    i13 -= view2.getPaddingRight();
                }
            }
            if (aVar.f12534d != -1.0f) {
                if (view2 == view) {
                    width = c3047e.m12500r(view2);
                } else {
                    width = view2.getWidth();
                }
                i13 += (int) ((width * aVar.f12534d) / 100.0f);
            }
            int i15 = i13;
            if (view != view2) {
                Rect rect2 = f12537a;
                rect2.left = i15;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect2);
                return f12537a.left - c3047e.m12495m();
            }
            return i15;
        }
        if (aVar.f12535e) {
            float f12 = aVar.f12534d;
            if (f12 == 0.0f) {
                i13 += view2.getPaddingTop();
            } else if (f12 == 100.0f) {
                i13 -= view2.getPaddingBottom();
            }
        }
        if (aVar.f12534d != -1.0f) {
            if (view2 == view) {
                height = c3047e.m12493k(view2);
            } else {
                height = view2.getHeight();
            }
            i13 += (int) ((height * aVar.f12534d) / 100.0f);
        }
        if (view != view2) {
            Rect rect3 = f12537a;
            rect3.top = i13;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect3);
            i11 = f12537a.top - c3047e.m12499q();
        } else {
            i11 = i13;
        }
        if (aVar.m12565d()) {
            return i11 + view2.getBaseline();
        }
        return i11;
    }
}
