package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.core.content.AbstractC0547a;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.android.agoo.message.MessageService;
import p420z.AbstractC7726c;

/* renamed from: androidx.appcompat.widget.l2 */
/* loaded from: classes.dex */
class ViewOnClickListenerC0418l2 extends AbstractC7726c implements View.OnClickListener {

    /* renamed from: l */
    private final SearchView f1797l;

    /* renamed from: m */
    private final SearchableInfo f1798m;

    /* renamed from: n */
    private final Context f1799n;

    /* renamed from: o */
    private final WeakHashMap f1800o;

    /* renamed from: p */
    private final int f1801p;

    /* renamed from: q */
    private boolean f1802q;

    /* renamed from: r */
    private int f1803r;

    /* renamed from: s */
    private ColorStateList f1804s;

    /* renamed from: t */
    private int f1805t;

    /* renamed from: u */
    private int f1806u;

    /* renamed from: v */
    private int f1807v;

    /* renamed from: w */
    private int f1808w;

    /* renamed from: x */
    private int f1809x;

    /* renamed from: y */
    private int f1810y;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.l2$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f1811a;

        /* renamed from: b */
        public final TextView f1812b;

        /* renamed from: c */
        public final ImageView f1813c;

        /* renamed from: d */
        public final ImageView f1814d;

        /* renamed from: e */
        public final ImageView f1815e;

        public a(View view) {
            this.f1811a = (TextView) view.findViewById(R.id.text1);
            this.f1812b = (TextView) view.findViewById(R.id.text2);
            this.f1813c = (ImageView) view.findViewById(R.id.icon1);
            this.f1814d = (ImageView) view.findViewById(R.id.icon2);
            this.f1815e = (ImageView) view.findViewById(R$id.edit_query);
        }
    }

    public ViewOnClickListenerC0418l2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1802q = false;
        this.f1803r = 1;
        this.f1805t = -1;
        this.f1806u = -1;
        this.f1807v = -1;
        this.f1808w = -1;
        this.f1809x = -1;
        this.f1810y = -1;
        this.f1797l = searchView;
        this.f1798m = searchableInfo;
        this.f1801p = searchView.getSuggestionCommitIconResId();
        this.f1799n = context;
        this.f1800o = weakHashMap;
    }

    /* renamed from: A */
    private void m1803A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1800o.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m1804B(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    /* renamed from: k */
    private Drawable m1805k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1800o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m1806l(CharSequence charSequence) {
        if (this.f1804s == null) {
            TypedValue typedValue = new TypedValue();
            this.f1799n.getTheme().resolveAttribute(R$attr.textColorSearchUrl, typedValue, true);
            this.f1804s = this.f1799n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1804s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m1807m(ComponentName componentName) {
        PackageManager packageManager = this.f1799n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m1808n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1800o.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f1800o.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1799n.getResources());
        }
        Drawable m1807m = m1807m(componentName);
        if (m1807m != null) {
            constantState = m1807m.getConstantState();
        }
        this.f1800o.put(flattenToShortString, constantState);
        return m1807m;
    }

    /* renamed from: o */
    public static String m1809o(Cursor cursor, String str) {
        return m1815w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m1810p() {
        Drawable m1808n = m1808n(this.f1798m.getSearchActivity());
        if (m1808n != null) {
            return m1808n;
        }
        return this.f1799n.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    private Drawable m1811q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1823r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1799n.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    return Drawable.createFromStream(openInputStream, null);
                } finally {
                    try {
                        openInputStream.close();
                    } catch (IOException e10) {
                        Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                    }
                }
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    /* renamed from: s */
    private Drawable m1812s(String str) {
        if (str == null || str.isEmpty() || MessageService.MSG_DB_READY_REPORT.equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1799n.getPackageName() + Operator.Operation.DIVISION + parseInt;
            Drawable m1805k = m1805k(str2);
            if (m1805k != null) {
                return m1805k;
            }
            Drawable m2324f = AbstractC0547a.m2324f(this.f1799n, parseInt);
            m1803A(str2, m2324f);
            return m2324f;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m1805k2 = m1805k(str);
            if (m1805k2 != null) {
                return m1805k2;
            }
            Drawable m1811q = m1811q(Uri.parse(str));
            m1803A(str, m1811q);
            return m1811q;
        }
    }

    /* renamed from: t */
    private Drawable m1813t(Cursor cursor) {
        int i10 = this.f1808w;
        if (i10 == -1) {
            return null;
        }
        Drawable m1812s = m1812s(cursor.getString(i10));
        if (m1812s != null) {
            return m1812s;
        }
        return m1810p();
    }

    /* renamed from: u */
    private Drawable m1814u(Cursor cursor) {
        int i10 = this.f1809x;
        if (i10 == -1) {
            return null;
        }
        return m1812s(cursor.getString(i10));
    }

    /* renamed from: w */
    private static String m1815w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* renamed from: y */
    private void m1816y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m1817z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // p420z.AbstractC7724a, p420z.C7725b.a
    /* renamed from: a */
    public void mo1818a(Cursor cursor) {
        if (this.f1802q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1818a(cursor);
            if (cursor != null) {
                this.f1805t = cursor.getColumnIndex("suggest_text_1");
                this.f1806u = cursor.getColumnIndex("suggest_text_2");
                this.f1807v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1808w = cursor.getColumnIndex("suggest_icon_1");
                this.f1809x = cursor.getColumnIndex("suggest_icon_2");
                this.f1810y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p420z.AbstractC7724a, p420z.C7725b.a
    /* renamed from: c */
    public CharSequence mo1819c(Cursor cursor) {
        String m1809o;
        String m1809o2;
        if (cursor == null) {
            return null;
        }
        String m1809o3 = m1809o(cursor, "suggest_intent_query");
        if (m1809o3 != null) {
            return m1809o3;
        }
        if (this.f1798m.shouldRewriteQueryFromData() && (m1809o2 = m1809o(cursor, "suggest_intent_data")) != null) {
            return m1809o2;
        }
        if (!this.f1798m.shouldRewriteQueryFromText() || (m1809o = m1809o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m1809o;
    }

    @Override // p420z.C7725b.a
    /* renamed from: d */
    public Cursor mo1820d(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (this.f1797l.getVisibility() == 0 && this.f1797l.getWindowVisibility() == 0) {
            try {
                Cursor m1824v = m1824v(this.f1798m, charSequence2, 50);
                if (m1824v != null) {
                    m1824v.getCount();
                    return m1824v;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // p420z.AbstractC7724a
    /* renamed from: e */
    public void mo1821e(View view, Context context, Cursor cursor) {
        int i10;
        CharSequence m1815w;
        a aVar = (a) view.getTag();
        int i11 = this.f1810y;
        if (i11 != -1) {
            i10 = cursor.getInt(i11);
        } else {
            i10 = 0;
        }
        if (aVar.f1811a != null) {
            m1817z(aVar.f1811a, m1815w(cursor, this.f1805t));
        }
        if (aVar.f1812b != null) {
            String m1815w2 = m1815w(cursor, this.f1807v);
            if (m1815w2 != null) {
                m1815w = m1806l(m1815w2);
            } else {
                m1815w = m1815w(cursor, this.f1806u);
            }
            if (TextUtils.isEmpty(m1815w)) {
                TextView textView = aVar.f1811a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1811a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1811a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1811a.setMaxLines(1);
                }
            }
            m1817z(aVar.f1812b, m1815w);
        }
        ImageView imageView = aVar.f1813c;
        if (imageView != null) {
            m1816y(imageView, m1813t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1814d;
        if (imageView2 != null) {
            m1816y(imageView2, m1814u(cursor), 8);
        }
        int i12 = this.f1803r;
        if (i12 != 2 && (i12 != 1 || (i10 & 1) == 0)) {
            aVar.f1815e.setVisibility(8);
            return;
        }
        aVar.f1815e.setVisibility(0);
        aVar.f1815e.setTag(aVar.f1811a.getText());
        aVar.f1815e.setOnClickListener(this);
    }

    @Override // p420z.AbstractC7724a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo29840g = mo29840g(this.f1799n, mo29838b(), viewGroup);
            if (mo29840g != null) {
                ((a) mo29840g.getTag()).f1811a.setText(e10.toString());
            }
            return mo29840g;
        }
    }

    @Override // p420z.AbstractC7724a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo1822h = mo1822h(this.f1799n, mo29838b(), viewGroup);
            if (mo1822h != null) {
                ((a) mo1822h.getTag()).f1811a.setText(e10.toString());
            }
            return mo1822h;
        }
    }

    @Override // p420z.AbstractC7726c, p420z.AbstractC7724a
    /* renamed from: h */
    public View mo1822h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo1822h = super.mo1822h(context, cursor, viewGroup);
        mo1822h.setTag(new a(mo1822h));
        ((ImageView) mo1822h.findViewById(R$id.edit_query)).setImageResource(this.f1801p);
        return mo1822h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1804B(mo29838b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1804B(mo29838b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1797l.m1521U((CharSequence) tag);
        }
    }

    /* renamed from: r */
    Drawable m1823r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1799n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: v */
    Cursor m1824v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1799n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m1825x(int i10) {
        this.f1803r = i10;
    }
}
