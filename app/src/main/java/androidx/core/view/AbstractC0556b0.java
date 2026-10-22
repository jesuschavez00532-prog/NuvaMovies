package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p305r.InterfaceMenuItemC6491b;

/* renamed from: androidx.core.view.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC0556b0 {
    /* renamed from: a */
    public static MenuItem m2403a(MenuItem menuItem, AbstractC0555b abstractC0555b) {
        if (menuItem instanceof InterfaceMenuItemC6491b) {
            return ((InterfaceMenuItemC6491b) menuItem).mo1384a(abstractC0555b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m2404b(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC6491b) {
            ((InterfaceMenuItemC6491b) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c10, i10);
        }
    }

    /* renamed from: c */
    public static void m2405c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC6491b) {
            ((InterfaceMenuItemC6491b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m2406d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC6491b) {
            ((InterfaceMenuItemC6491b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m2407e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC6491b) {
            ((InterfaceMenuItemC6491b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m2408f(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC6491b) {
            ((InterfaceMenuItemC6491b) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c10, i10);
        }
    }

    /* renamed from: g */
    public static void m2409g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC6491b) {
            ((InterfaceMenuItemC6491b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
