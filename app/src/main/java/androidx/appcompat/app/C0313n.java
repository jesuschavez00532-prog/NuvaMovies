package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0376b0;
import androidx.appcompat.widget.C0391f;
import androidx.appcompat.widget.C0399h;
import androidx.appcompat.widget.C0403i;
import androidx.appcompat.widget.C0407j;
import androidx.appcompat.widget.C0409j1;
import androidx.appcompat.widget.C0419m;
import androidx.appcompat.widget.C0426n2;
import androidx.appcompat.widget.C0427o;
import androidx.appcompat.widget.C0439r;
import androidx.appcompat.widget.C0443s;
import androidx.appcompat.widget.C0455v;
import androidx.appcompat.widget.C0459w;
import androidx.appcompat.widget.C0470z;
import androidx.core.view.AbstractC0616q0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p138g.C4320d;
import p214l.C5311i;

/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes.dex */
public class C0313n {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final C5311i sConstructorMap = new C5311i();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.n$a */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a */
        private final View f1155a;

        /* renamed from: b */
        private final String f1156b;

        /* renamed from: c */
        private Method f1157c;

        /* renamed from: d */
        private Context f1158d;

        public a(View view, String str) {
            this.f1155a = view;
            this.f1156b = str;
        }

        /* renamed from: a */
        private void m1201a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1156b, View.class)) != null) {
                        this.f1157c = method;
                        this.f1158d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id2 = this.f1155a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f1155a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1156b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1155a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1157c == null) {
                m1201a(this.f1155a.getContext());
            }
            try {
                this.f1157c.invoke(this.f1158d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    /* renamed from: a */
    private void m1196a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && AbstractC0616q0.m2595M(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private View m1197b(Context context, String str, String str2) {
        String str3;
        C5311i c5311i = sConstructorMap;
        Constructor constructor = (Constructor) c5311i.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            c5311i.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    /* renamed from: c */
    private View m1198c(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i10 = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i10 >= strArr.length) {
                        return null;
                    }
                    View m1197b = m1197b(context, str, strArr[i10]);
                    if (m1197b != null) {
                        return m1197b;
                    }
                    i10++;
                }
            } else {
                return m1197b(context, str, null);
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: d */
    private static Context m1199d(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        int i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f901P, 0, 0);
        if (z10) {
            i10 = obtainStyledAttributes.getResourceId(R$styleable.View_android_theme, 0);
        } else {
            i10 = 0;
        }
        if (z11 && i10 == 0 && (i10 = obtainStyledAttributes.getResourceId(R$styleable.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i10 != 0) {
            if (!(context instanceof C4320d) || ((C4320d) context).m18112c() != i10) {
                return new C4320d(context, i10);
            }
            return context;
        }
        return context;
    }

    /* renamed from: e */
    private void m1200e(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C0391f createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0391f(context, attributeSet);
    }

    protected C0399h createButton(Context context, AttributeSet attributeSet) {
        return new C0399h(context, attributeSet);
    }

    protected C0403i createCheckBox(Context context, AttributeSet attributeSet) {
        return new C0403i(context, attributeSet);
    }

    protected C0407j createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C0407j(context, attributeSet);
    }

    protected C0419m createEditText(Context context, AttributeSet attributeSet) {
        return new C0419m(context, attributeSet);
    }

    protected C0427o createImageButton(Context context, AttributeSet attributeSet) {
        return new C0427o(context, attributeSet);
    }

    protected C0439r createImageView(Context context, AttributeSet attributeSet) {
        return new C0439r(context, attributeSet);
    }

    protected C0443s createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0443s(context, attributeSet);
    }

    protected C0455v createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0455v(context, attributeSet);
    }

    protected C0459w createRatingBar(Context context, AttributeSet attributeSet) {
        return new C0459w(context, attributeSet);
    }

    protected C0470z createSeekBar(Context context, AttributeSet attributeSet) {
        return new C0470z(context, attributeSet);
    }

    protected C0376b0 createSpinner(Context context, AttributeSet attributeSet) {
        return new C0376b0(context, attributeSet);
    }

    protected AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected C0409j1 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C0409j1(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View createRatingBar;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = m1199d(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = C0426n2.m1842b(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                createRatingBar = createRatingBar(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case 1:
                createRatingBar = createCheckedTextView(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case 2:
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case 3:
                createRatingBar = createTextView(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case 4:
                createRatingBar = createImageButton(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case 5:
                createRatingBar = createSeekBar(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case 6:
                createRatingBar = createSpinner(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case 7:
                createRatingBar = createRadioButton(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case '\b':
                createRatingBar = createToggleButton(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case '\t':
                createRatingBar = createImageView(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case '\n':
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case 11:
                createRatingBar = createCheckBox(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case '\f':
                createRatingBar = createEditText(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            case '\r':
                createRatingBar = createButton(context2, attributeSet);
                m1200e(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = m1198c(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            m1196a(createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}
