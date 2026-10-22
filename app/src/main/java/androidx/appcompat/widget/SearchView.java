package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;
import anet.channel.bytes.C0905a;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p020b0.AbstractC1031a;
import p138g.InterfaceC4319c;
import p420z.AbstractC7724a;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0445s1 implements InterfaceC4319c {

    /* renamed from: z0 */
    static final C0360n f1521z0;

    /* renamed from: A */
    private Rect f1522A;

    /* renamed from: B */
    private int[] f1523B;

    /* renamed from: C */
    private int[] f1524C;

    /* renamed from: D */
    private final ImageView f1525D;

    /* renamed from: E */
    private final Drawable f1526E;

    /* renamed from: F */
    private final int f1527F;

    /* renamed from: G */
    private final int f1528G;

    /* renamed from: H */
    private final Intent f1529H;

    /* renamed from: I */
    private final Intent f1530I;

    /* renamed from: J */
    private final CharSequence f1531J;

    /* renamed from: K */
    View.OnFocusChangeListener f1532K;

    /* renamed from: L */
    private View.OnClickListener f1533L;

    /* renamed from: M */
    private boolean f1534M;

    /* renamed from: N */
    private boolean f1535N;

    /* renamed from: O */
    AbstractC7724a f1536O;

    /* renamed from: V */
    private boolean f1537V;

    /* renamed from: W */
    private CharSequence f1538W;

    /* renamed from: g0 */
    private boolean f1539g0;

    /* renamed from: h0 */
    private boolean f1540h0;

    /* renamed from: i0 */
    private int f1541i0;

    /* renamed from: j0 */
    private boolean f1542j0;

    /* renamed from: k0 */
    private CharSequence f1543k0;

    /* renamed from: l0 */
    private CharSequence f1544l0;

    /* renamed from: m0 */
    private boolean f1545m0;

    /* renamed from: n0 */
    private int f1546n0;

    /* renamed from: o0 */
    SearchableInfo f1547o0;

    /* renamed from: p */
    final SearchAutoComplete f1548p;

    /* renamed from: p0 */
    private Bundle f1549p0;

    /* renamed from: q */
    private final View f1550q;

    /* renamed from: q0 */
    private final Runnable f1551q0;

    /* renamed from: r */
    private final View f1552r;

    /* renamed from: r0 */
    private Runnable f1553r0;

    /* renamed from: s */
    private final View f1554s;

    /* renamed from: s0 */
    private final WeakHashMap f1555s0;

    /* renamed from: t */
    final ImageView f1556t;

    /* renamed from: t0 */
    private final View.OnClickListener f1557t0;

    /* renamed from: u */
    final ImageView f1558u;

    /* renamed from: u0 */
    View.OnKeyListener f1559u0;

    /* renamed from: v */
    final ImageView f1560v;

    /* renamed from: v0 */
    private final TextView.OnEditorActionListener f1561v0;

    /* renamed from: w */
    final ImageView f1562w;

    /* renamed from: w0 */
    private final AdapterView.OnItemClickListener f1563w0;

    /* renamed from: x */
    private final View f1564x;

    /* renamed from: x0 */
    private final AdapterView.OnItemSelectedListener f1565x0;

    /* renamed from: y */
    private C0362p f1566y;

    /* renamed from: y0 */
    private TextWatcher f1567y0;

    /* renamed from: z */
    private Rect f1568z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0391f {

        /* renamed from: d */
        private int f1569d;

        /* renamed from: e */
        private SearchView f1570e;

        /* renamed from: f */
        private boolean f1571f;

        /* renamed from: g */
        final Runnable f1572g;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        class RunnableC0346a implements Runnable {
            RunnableC0346a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m1534c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        /* renamed from: a */
        void m1532a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1521z0.m1538c(this);
        }

        /* renamed from: b */
        boolean m1533b() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        void m1534c() {
            if (this.f1571f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1571f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            if (this.f1569d > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.C0391f, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1571f) {
                removeCallbacks(this.f1572g);
                post(this.f1572g);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1570e.m1526Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1570e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1570e.hasFocus() && getVisibility() == 0) {
                this.f1571f = true;
                if (SearchView.m1501M(getContext())) {
                    m1532a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1571f = false;
                removeCallbacks(this.f1572g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f1571f = false;
                    removeCallbacks(this.f1572g);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f1571f = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1570e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1569d = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1572g = new RunnableC0346a();
            this.f1569d = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    class C0347a implements TextWatcher {
        C0347a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.m1525Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    class RunnableC0348b implements Runnable {
        RunnableC0348b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m1531f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    class RunnableC0349c implements Runnable {
        RunnableC0349c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7724a abstractC7724a = SearchView.this.f1536O;
            if (abstractC7724a instanceof ViewOnClickListenerC0418l2) {
                abstractC7724a.mo1818a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    class ViewOnFocusChangeListenerC0350d implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0350d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1532K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    class ViewOnLayoutChangeListenerC0351e implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0351e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.m1514B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0352f implements View.OnClickListener {
        ViewOnClickListenerC0352f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1556t) {
                searchView.m1522V();
                return;
            }
            if (view == searchView.f1560v) {
                searchView.m1518R();
                return;
            }
            if (view == searchView.f1558u) {
                searchView.m1523W();
            } else if (view == searchView.f1562w) {
                searchView.m1527a0();
            } else if (view == searchView.f1548p) {
                searchView.m1515H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    class ViewOnKeyListenerC0353g implements View.OnKeyListener {
        ViewOnKeyListenerC0353g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1547o0 == null) {
                return false;
            }
            if (searchView.f1548p.isPopupShowing() && SearchView.this.f1548p.getListSelection() != -1) {
                return SearchView.this.m1524X(view, i10, keyEvent);
            }
            if (SearchView.this.f1548p.m1533b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m1517P(0, null, searchView2.f1548p.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    class C0354h implements TextView.OnEditorActionListener {
        C0354h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.m1523W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    class C0355i implements AdapterView.OnItemClickListener {
        C0355i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.m1519S(i10, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    class C0356j implements AdapterView.OnItemSelectedListener {
        C0356j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.m1520T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public class InterfaceC0357k {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public class InterfaceC0358l {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public class InterfaceC0359m {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public static class C0360n {

        /* renamed from: a */
        private Method f1584a;

        /* renamed from: b */
        private Method f1585b;

        /* renamed from: c */
        private Method f1586c;

        C0360n() {
            this.f1584a = null;
            this.f1585b = null;
            this.f1586c = null;
            m1535d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1584a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1585b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1586c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m1535d() {
            if (Build.VERSION.SDK_INT < 29) {
            } else {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        void m1536a(AutoCompleteTextView autoCompleteTextView) {
            m1535d();
            Method method = this.f1585b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m1537b(AutoCompleteTextView autoCompleteTextView) {
            m1535d();
            Method method = this.f1584a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m1538c(AutoCompleteTextView autoCompleteTextView) {
            m1535d();
            Method method = this.f1586c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    public static class C0361o extends AbstractC1031a {
        public static final Parcelable.Creator<C0361o> CREATOR = new a();

        /* renamed from: c */
        boolean f1587c;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0361o createFromParcel(Parcel parcel) {
                return new C0361o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0361o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0361o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0361o[] newArray(int i10) {
                return new C0361o[i10];
            }
        }

        C0361o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1587c + "}";
        }

        @Override // p020b0.AbstractC1031a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1587c));
        }

        public C0361o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1587c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes.dex */
    private static class C0362p extends TouchDelegate {

        /* renamed from: a */
        private final View f1588a;

        /* renamed from: b */
        private final Rect f1589b;

        /* renamed from: c */
        private final Rect f1590c;

        /* renamed from: d */
        private final Rect f1591d;

        /* renamed from: e */
        private final int f1592e;

        /* renamed from: f */
        private boolean f1593f;

        public C0362p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1592e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1589b = new Rect();
            this.f1591d = new Rect();
            this.f1590c = new Rect();
            m1542a(rect, rect2);
            this.f1588a = view;
        }

        /* renamed from: a */
        public void m1542a(Rect rect, Rect rect2) {
            this.f1589b.set(rect);
            this.f1591d.set(rect);
            Rect rect3 = this.f1591d;
            int i10 = this.f1592e;
            rect3.inset(-i10, -i10);
            this.f1590c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z11 = this.f1593f;
                        this.f1593f = false;
                    }
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1593f;
                    if (z11 && !this.f1591d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1589b.contains(x10, y10)) {
                    this.f1593f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (z10 && !this.f1590c.contains(x10, y10)) {
                motionEvent.setLocation(this.f1588a.getWidth() / 2, this.f1588a.getHeight() / 2);
            } else {
                Rect rect = this.f1590c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            }
            return this.f1588a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        C0360n c0360n;
        if (Build.VERSION.SDK_INT < 29) {
            c0360n = new C0360n();
        } else {
            c0360n = null;
        }
        f1521z0 = c0360n;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    private Intent m1493C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1544l0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1549p0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1547o0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m1494D(Cursor cursor, int i10, String str) {
        int i11;
        Uri parse;
        String m1809o;
        try {
            String m1809o2 = ViewOnClickListenerC0418l2.m1809o(cursor, "suggest_intent_action");
            if (m1809o2 == null) {
                m1809o2 = this.f1547o0.getSuggestIntentAction();
            }
            if (m1809o2 == null) {
                m1809o2 = "android.intent.action.SEARCH";
            }
            String str2 = m1809o2;
            String m1809o3 = ViewOnClickListenerC0418l2.m1809o(cursor, "suggest_intent_data");
            if (m1809o3 == null) {
                m1809o3 = this.f1547o0.getSuggestIntentData();
            }
            if (m1809o3 != null && (m1809o = ViewOnClickListenerC0418l2.m1809o(cursor, "suggest_intent_data_id")) != null) {
                m1809o3 = m1809o3 + Operator.Operation.DIVISION + Uri.encode(m1809o);
            }
            if (m1809o3 == null) {
                parse = null;
            } else {
                parse = Uri.parse(m1809o3);
            }
            return m1493C(str2, parse, ViewOnClickListenerC0418l2.m1809o(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0418l2.m1809o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m1495E(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1549p0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m1496F(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    /* renamed from: G */
    private void m1497G() {
        this.f1548p.dismissDropDown();
    }

    /* renamed from: I */
    private void m1498I(View view, Rect rect) {
        view.getLocationInWindow(this.f1523B);
        getLocationInWindow(this.f1524C);
        int[] iArr = this.f1523B;
        int i10 = iArr[1];
        int[] iArr2 = this.f1524C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    /* renamed from: J */
    private CharSequence m1499J(CharSequence charSequence) {
        if (this.f1534M && this.f1526E != null) {
            double textSize = this.f1548p.getTextSize();
            Double.isNaN(textSize);
            int i10 = (int) (textSize * 1.25d);
            this.f1526E.setBounds(0, 0, i10, i10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f1526E), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    /* renamed from: K */
    private boolean m1500K() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1547o0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f1547o0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1529H;
        } else if (this.f1547o0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1530I;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    static boolean m1501M(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private boolean m1502N() {
        if ((this.f1537V || this.f1542j0) && !m1516L()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private void m1503O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    /* renamed from: Q */
    private boolean m1504Q(int i10, int i11, String str) {
        Cursor mo29838b = this.f1536O.mo29838b();
        if (mo29838b != null && mo29838b.moveToPosition(i10)) {
            m1503O(m1494D(mo29838b, i11, str));
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private void m1505b0() {
        post(this.f1551q0);
    }

    /* renamed from: c0 */
    private void m1506c0(int i10) {
        Editable text = this.f1548p.getText();
        Cursor mo29838b = this.f1536O.mo29838b();
        if (mo29838b == null) {
            return;
        }
        if (mo29838b.moveToPosition(i10)) {
            CharSequence mo1819c = this.f1536O.mo1819c(mo29838b);
            if (mo1819c != null) {
                setQuery(mo1819c);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    /* renamed from: e0 */
    private void m1507e0() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1548p.getText());
        int i10 = 0;
        if (!z11 && (!this.f1534M || this.f1545m0)) {
            z10 = false;
        }
        ImageView imageView = this.f1560v;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.f1560v.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* renamed from: g0 */
    private void m1508g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1548p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1499J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m1509h0() {
        this.f1548p.setThreshold(this.f1547o0.getSuggestThreshold());
        this.f1548p.setImeOptions(this.f1547o0.getImeOptions());
        int inputType = this.f1547o0.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1547o0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | C0905a.MAX_POOL_SIZE;
            }
        }
        this.f1548p.setInputType(inputType);
        AbstractC7724a abstractC7724a = this.f1536O;
        if (abstractC7724a != null) {
            abstractC7724a.mo1818a(null);
        }
        if (this.f1547o0.getSuggestAuthority() != null) {
            ViewOnClickListenerC0418l2 viewOnClickListenerC0418l2 = new ViewOnClickListenerC0418l2(getContext(), this, this.f1547o0, this.f1555s0);
            this.f1536O = viewOnClickListenerC0418l2;
            this.f1548p.setAdapter(viewOnClickListenerC0418l2);
            ViewOnClickListenerC0418l2 viewOnClickListenerC0418l22 = (ViewOnClickListenerC0418l2) this.f1536O;
            if (this.f1539g0) {
                i10 = 2;
            }
            viewOnClickListenerC0418l22.m1825x(i10);
        }
    }

    /* renamed from: i0 */
    private void m1510i0() {
        int i10;
        if (m1502N() && (this.f1558u.getVisibility() == 0 || this.f1562w.getVisibility() == 0)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f1554s.setVisibility(i10);
    }

    /* renamed from: j0 */
    private void m1511j0(boolean z10) {
        int i10;
        if (this.f1537V && m1502N() && hasFocus() && (z10 || !this.f1542j0)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f1558u.setVisibility(i10);
    }

    /* renamed from: k0 */
    private void m1512k0(boolean z10) {
        int i10;
        int i11;
        this.f1535N = z10;
        int i12 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.f1548p.getText());
        this.f1556t.setVisibility(i10);
        m1511j0(z11);
        View view = this.f1550q;
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        if (this.f1525D.getDrawable() == null || this.f1534M) {
            i12 = 8;
        }
        this.f1525D.setVisibility(i12);
        m1507e0();
        m1513l0(!z11);
        m1510i0();
    }

    /* renamed from: l0 */
    private void m1513l0(boolean z10) {
        int i10 = 8;
        if (this.f1542j0 && !m1516L() && z10) {
            this.f1558u.setVisibility(8);
            i10 = 0;
        }
        this.f1562w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        this.f1548p.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f1548p;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    /* renamed from: B */
    void m1514B() {
        int i10;
        int i11;
        if (this.f1564x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1552r.getPaddingLeft();
            Rect rect = new Rect();
            boolean m2027b = AbstractC0466x2.m2027b(this);
            if (this.f1534M) {
                i10 = resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_text_padding_left);
            } else {
                i10 = 0;
            }
            this.f1548p.getDropDownBackground().getPadding(rect);
            if (m2027b) {
                i11 = -rect.left;
            } else {
                i11 = paddingLeft - (rect.left + i10);
            }
            this.f1548p.setDropDownHorizontalOffset(i11);
            this.f1548p.setDropDownWidth((((this.f1564x.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
        }
    }

    /* renamed from: H */
    void m1515H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1548p.refreshAutoCompleteResults();
            return;
        }
        C0360n c0360n = f1521z0;
        c0360n.m1537b(this.f1548p);
        c0360n.m1536a(this.f1548p);
    }

    /* renamed from: L */
    public boolean m1516L() {
        return this.f1535N;
    }

    /* renamed from: P */
    void m1517P(int i10, String str, String str2) {
        getContext().startActivity(m1493C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    /* renamed from: R */
    void m1518R() {
        if (TextUtils.isEmpty(this.f1548p.getText())) {
            if (this.f1534M) {
                clearFocus();
                m1512k0(true);
                return;
            }
            return;
        }
        this.f1548p.setText("");
        this.f1548p.requestFocus();
        this.f1548p.setImeVisibility(true);
    }

    /* renamed from: S */
    boolean m1519S(int i10, int i11, String str) {
        m1504Q(i10, 0, null);
        this.f1548p.setImeVisibility(false);
        m1497G();
        return true;
    }

    /* renamed from: T */
    boolean m1520T(int i10) {
        m1506c0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m1521U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: V */
    void m1522V() {
        m1512k0(false);
        this.f1548p.requestFocus();
        this.f1548p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1533L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: W */
    void m1523W() {
        Editable text = this.f1548p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1547o0 != null) {
                m1517P(0, null, text.toString());
            }
            this.f1548p.setImeVisibility(false);
            m1497G();
        }
    }

    /* renamed from: X */
    boolean m1524X(View view, int i10, KeyEvent keyEvent) {
        int length;
        if (this.f1547o0 != null && this.f1536O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 != 66 && i10 != 84 && i10 != 61) {
                if (i10 != 21 && i10 != 22) {
                    if (i10 == 19) {
                        this.f1548p.getListSelection();
                        return false;
                    }
                } else {
                    if (i10 == 21) {
                        length = 0;
                    } else {
                        length = this.f1548p.length();
                    }
                    this.f1548p.setSelection(length);
                    this.f1548p.setListSelection(0);
                    this.f1548p.clearListSelection();
                    this.f1548p.m1532a();
                    return true;
                }
            } else {
                return m1519S(this.f1548p.getListSelection(), 0, null);
            }
        }
        return false;
    }

    /* renamed from: Y */
    void m1525Y(CharSequence charSequence) {
        Editable text = this.f1548p.getText();
        this.f1544l0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        m1511j0(z10);
        m1513l0(!z10);
        m1507e0();
        m1510i0();
        this.f1543k0 = charSequence.toString();
    }

    /* renamed from: Z */
    void m1526Z() {
        m1512k0(m1516L());
        m1505b0();
        if (this.f1548p.hasFocus()) {
            m1515H();
        }
    }

    /* renamed from: a0 */
    void m1527a0() {
        SearchableInfo searchableInfo = this.f1547o0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m1496F(this.f1529H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m1495E(this.f1530I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // p138g.InterfaceC4319c
    /* renamed from: c */
    public void mo1528c() {
        if (this.f1545m0) {
            return;
        }
        this.f1545m0 = true;
        int imeOptions = this.f1548p.getImeOptions();
        this.f1546n0 = imeOptions;
        this.f1548p.setImeOptions(imeOptions | 33554432);
        this.f1548p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1540h0 = true;
        super.clearFocus();
        this.f1548p.clearFocus();
        this.f1548p.setImeVisibility(false);
        this.f1540h0 = false;
    }

    /* renamed from: d0 */
    public void m1529d0(CharSequence charSequence, boolean z10) {
        this.f1548p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1548p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1544l0 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            m1523W();
        }
    }

    @Override // p138g.InterfaceC4319c
    /* renamed from: f */
    public void mo1530f() {
        m1529d0("", false);
        clearFocus();
        m1512k0(true);
        this.f1548p.setImeOptions(this.f1546n0);
        this.f1545m0 = false;
    }

    /* renamed from: f0 */
    void m1531f0() {
        int[] iArr;
        if (this.f1548p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f1552r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1554s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1548p.getImeOptions();
    }

    public int getInputType() {
        return this.f1548p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1541i0;
    }

    public CharSequence getQuery() {
        return this.f1548p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1538W;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f1547o0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f1547o0.getHintId());
            }
            return this.f1531J;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1528G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1527F;
    }

    public AbstractC7724a getSuggestionsAdapter() {
        return this.f1536O;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1551q0);
        post(this.f1553r0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0445s1, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            m1498I(this.f1548p, this.f1568z);
            Rect rect = this.f1522A;
            Rect rect2 = this.f1568z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            C0362p c0362p = this.f1566y;
            if (c0362p == null) {
                C0362p c0362p2 = new C0362p(this.f1522A, this.f1568z, this.f1548p);
                this.f1566y = c0362p2;
                setTouchDelegate(c0362p2);
                return;
            }
            c0362p.m1542a(this.f1522A, this.f1568z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0445s1, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (m1516L()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.f1541i0) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.f1541i0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.f1541i0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0361o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0361o c0361o = (C0361o) parcelable;
        super.onRestoreInstanceState(c0361o.m4828a());
        m1512k0(c0361o.f1587c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0361o c0361o = new C0361o(super.onSaveInstanceState());
        c0361o.f1587c = m1516L();
        return c0361o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m1505b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f1540h0 || !isFocusable()) {
            return false;
        }
        if (!m1516L()) {
            boolean requestFocus = this.f1548p.requestFocus(i10, rect);
            if (requestFocus) {
                m1512k0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1549p0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m1518R();
        } else {
            m1522V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1534M == z10) {
            return;
        }
        this.f1534M = z10;
        m1512k0(z10);
        m1508g0();
    }

    public void setImeOptions(int i10) {
        this.f1548p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1548p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1541i0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0357k interfaceC0357k) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1532K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0358l interfaceC0358l) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1533L = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0359m interfaceC0359m) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1538W = charSequence;
        m1508g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.f1539g0 = z10;
        AbstractC7724a abstractC7724a = this.f1536O;
        if (abstractC7724a instanceof ViewOnClickListenerC0418l2) {
            ViewOnClickListenerC0418l2 viewOnClickListenerC0418l2 = (ViewOnClickListenerC0418l2) abstractC7724a;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            viewOnClickListenerC0418l2.m1825x(i10);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1547o0 = searchableInfo;
        if (searchableInfo != null) {
            m1509h0();
            m1508g0();
        }
        boolean m1500K = m1500K();
        this.f1542j0 = m1500K;
        if (m1500K) {
            this.f1548p.setPrivateImeOptions("nm");
        }
        m1512k0(m1516L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1537V = z10;
        m1512k0(m1516L());
    }

    public void setSuggestionsAdapter(AbstractC7724a abstractC7724a) {
        this.f1536O = abstractC7724a;
        this.f1548p.setAdapter(abstractC7724a);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1568z = new Rect();
        this.f1522A = new Rect();
        this.f1523B = new int[2];
        this.f1524C = new int[2];
        this.f1551q0 = new RunnableC0348b();
        this.f1553r0 = new RunnableC0349c();
        this.f1555s0 = new WeakHashMap();
        ViewOnClickListenerC0352f viewOnClickListenerC0352f = new ViewOnClickListenerC0352f();
        this.f1557t0 = viewOnClickListenerC0352f;
        this.f1559u0 = new ViewOnKeyListenerC0353g();
        C0354h c0354h = new C0354h();
        this.f1561v0 = c0354h;
        C0355i c0355i = new C0355i();
        this.f1563w0 = c0355i;
        C0356j c0356j = new C0356j();
        this.f1565x0 = c0356j;
        this.f1567y0 = new C0347a();
        C0438q2 m1874v = C0438q2.m1874v(context, attributeSet, R$styleable.f894I, i10, 0);
        LayoutInflater.from(context).inflate(m1874v.m1888n(R$styleable.SearchView_layout, R$layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R$id.search_src_text);
        this.f1548p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1550q = findViewById(R$id.search_edit_frame);
        View findViewById = findViewById(R$id.search_plate);
        this.f1552r = findViewById;
        View findViewById2 = findViewById(R$id.submit_area);
        this.f1554s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R$id.search_button);
        this.f1556t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R$id.search_go_btn);
        this.f1558u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R$id.search_close_btn);
        this.f1560v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R$id.search_voice_btn);
        this.f1562w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R$id.search_mag_icon);
        this.f1525D = imageView5;
        AbstractC0616q0.m2642q0(findViewById, m1874v.m1881g(R$styleable.SearchView_queryBackground));
        AbstractC0616q0.m2642q0(findViewById2, m1874v.m1881g(R$styleable.SearchView_submitBackground));
        int i11 = R$styleable.SearchView_searchIcon;
        imageView.setImageDrawable(m1874v.m1881g(i11));
        imageView2.setImageDrawable(m1874v.m1881g(R$styleable.SearchView_goIcon));
        imageView3.setImageDrawable(m1874v.m1881g(R$styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(m1874v.m1881g(R$styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(m1874v.m1881g(i11));
        this.f1526E = m1874v.m1881g(R$styleable.SearchView_searchHintIcon);
        AbstractC0450t2.m1940a(imageView, getResources().getString(R$string.abc_searchview_description_search));
        this.f1527F = m1874v.m1888n(R$styleable.SearchView_suggestionRowLayout, R$layout.abc_search_dropdown_item_icons_2line);
        this.f1528G = m1874v.m1888n(R$styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(viewOnClickListenerC0352f);
        imageView3.setOnClickListener(viewOnClickListenerC0352f);
        imageView2.setOnClickListener(viewOnClickListenerC0352f);
        imageView4.setOnClickListener(viewOnClickListenerC0352f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0352f);
        searchAutoComplete.addTextChangedListener(this.f1567y0);
        searchAutoComplete.setOnEditorActionListener(c0354h);
        searchAutoComplete.setOnItemClickListener(c0355i);
        searchAutoComplete.setOnItemSelectedListener(c0356j);
        searchAutoComplete.setOnKeyListener(this.f1559u0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0350d());
        setIconifiedByDefault(m1874v.m1875a(R$styleable.SearchView_iconifiedByDefault, true));
        int m1880f = m1874v.m1880f(R$styleable.SearchView_android_maxWidth, -1);
        if (m1880f != -1) {
            setMaxWidth(m1880f);
        }
        this.f1531J = m1874v.m1890p(R$styleable.SearchView_defaultQueryHint);
        this.f1538W = m1874v.m1890p(R$styleable.SearchView_queryHint);
        int m1885k = m1874v.m1885k(R$styleable.SearchView_android_imeOptions, -1);
        if (m1885k != -1) {
            setImeOptions(m1885k);
        }
        int m1885k2 = m1874v.m1885k(R$styleable.SearchView_android_inputType, -1);
        if (m1885k2 != -1) {
            setInputType(m1885k2);
        }
        setFocusable(m1874v.m1875a(R$styleable.SearchView_android_focusable, true));
        m1874v.m1894w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1529H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1530I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1564x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0351e());
        }
        m1512k0(this.f1534M);
        m1508g0();
    }
}
