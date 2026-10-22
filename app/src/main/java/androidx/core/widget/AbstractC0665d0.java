package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p360v.AbstractC7184o;
import p373w.AbstractC7342g;

/* renamed from: androidx.core.widget.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC0665d0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.d0$a */
    /* loaded from: classes.dex */
    public static class a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f2493a;

        /* renamed from: b */
        private final TextView f2494b;

        /* renamed from: c */
        private Class f2495c;

        /* renamed from: d */
        private Method f2496d;

        /* renamed from: e */
        private boolean f2497e;

        /* renamed from: f */
        private boolean f2498f = false;

        a(ActionMode.Callback callback, TextView textView) {
            this.f2493a = callback;
            this.f2494b = textView;
        }

        /* renamed from: a */
        private Intent m2946a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m2947b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m2946a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m2949d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List m2948c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m2946a(), 0)) {
                if (m2950e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        private boolean m2949d(TextView textView) {
            if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private boolean m2950e(ResolveInfo resolveInfo, Context context) {
            int checkSelfPermission;
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str != null) {
                checkSelfPermission = context.checkSelfPermission(str);
                if (checkSelfPermission == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private void m2951f(Menu menu) {
            Method declaredMethod;
            Context context = this.f2494b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2498f) {
                this.f2498f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2495c = cls;
                    this.f2496d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f2497e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2495c = null;
                    this.f2496d = null;
                    this.f2497e = false;
                }
            }
            try {
                if (this.f2497e && this.f2495c.isInstance(menu)) {
                    declaredMethod = this.f2496d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List m2948c = m2948c(context, packageManager);
                for (int i10 = 0; i10 < m2948c.size(); i10++) {
                    ResolveInfo resolveInfo = (ResolveInfo) m2948c.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m2947b(resolveInfo, this.f2494b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2493a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2493a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2493a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m2951f(menu);
            return this.f2493a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m2930a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* renamed from: b */
    public static int m2931b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m2932c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    private static int m2933d(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 1;
        }
        return 7;
    }

    /* renamed from: e */
    private static TextDirectionHeuristic m2934e(TextView textView) {
        DecimalFormatSymbols decimalFormatSymbols;
        String[] digitStrings;
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            decimalFormatSymbols = DecimalFormatSymbols.getInstance(textView.getTextLocale());
            digitStrings = decimalFormatSymbols.getDigitStrings();
            byte directionality = Character.getDirectionality(digitStrings[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (textView.getLayoutDirection() == 1) {
            z10 = true;
        }
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z10) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: f */
    public static AbstractC7184o.a m2935f(TextView textView) {
        int breakStrategy;
        int hyphenationFrequency;
        PrecomputedText.Params textMetricsParams;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            textMetricsParams = textView.getTextMetricsParams();
            return new AbstractC7184o.a(textMetricsParams);
        }
        AbstractC7184o.a.C7863a c7863a = new AbstractC7184o.a.C7863a(new TextPaint(textView.getPaint()));
        if (i10 >= 23) {
            breakStrategy = textView.getBreakStrategy();
            c7863a.m27809b(breakStrategy);
            hyphenationFrequency = textView.getHyphenationFrequency();
            c7863a.m27810c(hyphenationFrequency);
        }
        c7863a.m27811d(m2934e(textView));
        return c7863a.m27808a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m2936g(TextView textView, ColorStateList colorStateList) {
        AbstractC7342g.m28327g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof InterfaceC0671g0) {
            ((InterfaceC0671g0) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static void m2937h(TextView textView, PorterDuff.Mode mode) {
        AbstractC7342g.m28327g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof InterfaceC0671g0) {
            ((InterfaceC0671g0) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: i */
    public static void m2938i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: j */
    public static void m2939j(TextView textView, int i10) {
        int i11;
        AbstractC7342g.m28324d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: k */
    public static void m2940k(TextView textView, int i10) {
        int i11;
        AbstractC7342g.m28324d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* renamed from: l */
    public static void m2941l(TextView textView, int i10) {
        AbstractC7342g.m28324d(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    /* renamed from: m */
    public static void m2942m(TextView textView, AbstractC7184o abstractC7184o) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        m2935f(textView);
        throw null;
    }

    /* renamed from: n */
    public static void m2943n(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    /* renamed from: o */
    public static void m2944o(TextView textView, AbstractC7184o.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        textView.setTextDirection(m2933d(aVar.m27806d()));
        if (i10 < 23) {
            float textScaleX = aVar.m27807e().getTextScaleX();
            textView.getPaint().set(aVar.m27807e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.m27807e());
        textView.setBreakStrategy(aVar.m27804b());
        textView.setHyphenationFrequency(aVar.m27805c());
    }

    /* renamed from: p */
    public static ActionMode.Callback m2945p(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof a) && callback != null) {
            return new a(callback, textView);
        }
        return callback;
    }
}
