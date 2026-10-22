package com.widget.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

/* loaded from: classes3.dex */
public class FocusUtils {
    public static boolean curFocusViewIsValid(View view, View view2) {
        if (view2 == null) {
            return false;
        }
        Rect findLocationWithView = findLocationWithView((ViewGroup) view.getParent(), view2);
        if (findLocationWithView.right + view2.getWidth() + 50 > 1920 || findLocationWithView.left < 0) {
            return false;
        }
        return true;
    }

    public static Rect findLocationWithView(ViewGroup viewGroup, View view) {
        Rect rect = new Rect();
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return rect;
    }

    public static View getCurFocusView(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            return null;
        }
        View selectedView = currentFocus instanceof ListView ? ((ListView) currentFocus).getSelectedView() : null;
        if (currentFocus instanceof GridView) {
            selectedView = ((GridView) currentFocus).getSelectedView();
        }
        return selectedView != null ? selectedView : currentFocus;
    }

    public static boolean hasNextView(View view, Activity activity, KeyEvent keyEvent) {
        int i10;
        View focusSearch;
        switch (keyEvent.getKeyCode()) {
            case 19:
                i10 = 33;
                break;
            case 20:
                i10 = 130;
                break;
            case 21:
                i10 = 17;
                break;
            case 22:
                i10 = 66;
                break;
            default:
                return false;
        }
        View curFocusView = getCurFocusView(activity);
        if (curFocusView == null || (focusSearch = curFocusView.focusSearch(i10)) == null || (focusSearch instanceof Button) || (focusSearch instanceof ImageView)) {
            return false;
        }
        return true;
    }

    public static boolean nextFocusViewIsValid(View view, Activity activity, KeyEvent keyEvent) {
        int i10;
        View focusSearch;
        switch (keyEvent.getKeyCode()) {
            case 19:
                i10 = 33;
                break;
            case 20:
                i10 = 130;
                break;
            case 21:
                i10 = 17;
                break;
            case 22:
                i10 = 66;
                break;
            default:
                return false;
        }
        View curFocusView = getCurFocusView(activity);
        if (curFocusView == null || (focusSearch = curFocusView.focusSearch(i10)) == null) {
            return false;
        }
        Rect findLocationWithView = findLocationWithView((ViewGroup) view.getParent(), focusSearch);
        if (findLocationWithView.right + focusSearch.getWidth() + 50 > 1920 || findLocationWithView.left < 0) {
            return false;
        }
        return true;
    }

    public static View getCurFocusView(View view) {
        if (view == null) {
            return null;
        }
        View selectedView = view instanceof ListView ? ((ListView) view).getSelectedView() : null;
        if (view instanceof GridView) {
            selectedView = ((GridView) view).getSelectedView();
        }
        return selectedView != null ? selectedView : view;
    }
}
