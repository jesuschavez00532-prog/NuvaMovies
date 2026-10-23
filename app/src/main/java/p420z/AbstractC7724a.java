package p420z;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.umeng.analytics.pro.C3329bx;
import p420z.C7725b;

/* renamed from: z.a */
/* loaded from: classes.dex */
public abstract class AbstractC7724a extends BaseAdapter implements Filterable, C7725b.a {

    /* renamed from: a */
    protected boolean f28407a;

    /* renamed from: b */
    protected boolean f28408b;

    /* renamed from: c */
    protected Cursor f28409c;

    /* renamed from: d */
    protected Context f28410d;

    /* renamed from: e */
    protected int f28411e;

    /* renamed from: f */
    protected a f28412f;

    /* renamed from: g */
    protected DataSetObserver f28413g;

    /* renamed from: h */
    protected C7725b f28414h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z.a$a */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC7724a.this.m29841i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z.a$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC7724a abstractC7724a = AbstractC7724a.this;
            abstractC7724a.f28407a = true;
            abstractC7724a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC7724a abstractC7724a = AbstractC7724a.this;
            abstractC7724a.f28407a = false;
            abstractC7724a.notifyDataSetInvalidated();
        }
    }

    public AbstractC7724a(Context context, Cursor cursor, boolean z10) {
        int i10 = 0;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        m29839f(context, cursor, i10);
    }

    /* renamed from: a */
    public void mo1818a(Cursor cursor) {
        Cursor m29842j = m29842j(cursor);
        if (m29842j != null) {
            m29842j.close();
        }
    }

    @Override // p420z.C7725b.a
    /* renamed from: b */
    public Cursor mo29838b() {
        return this.f28409c;
    }

    /* renamed from: c */
    public abstract CharSequence mo1819c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo1821e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    void m29839f(Context context, Cursor cursor, int i10) {
        int i11 = 0;
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f28408b = true;
        } else {
            this.f28408b = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f28409c = cursor;
        this.f28407a = z10;
        this.f28410d = context;
        if (z10) {
            i11 = cursor.getColumnIndexOrThrow(C3329bx.f14344d);
        } else {
            i11 = -1;
        }
        this.f28411e = i11;
        if ((i10 & 2) == 2) {
            this.f28412f = new a();
            this.f28413g = new b();
        } else {
            this.f28412f = null;
            this.f28413g = null;
        }
        if (z10) {
            a aVar = this.f28412f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f28413g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo29840g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.f28407a && (cursor = this.f28409c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f28407a) {
            this.f28409c.moveToPosition(i10);
            if (view == null) {
                view = mo29840g(this.f28410d, this.f28409c, viewGroup);
            }
            mo1821e(view, this.f28410d, this.f28409c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f28414h == null) {
            this.f28414h = new C7725b(this);
        }
        return this.f28414h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (this.f28407a && (cursor = this.f28409c) != null) {
            cursor.moveToPosition(i10);
            return this.f28409c;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f28407a || (cursor = this.f28409c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f28409c.getLong(this.f28411e);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f28407a) {
            if (this.f28409c.moveToPosition(i10)) {
                if (view == null) {
                    view = mo1822h(this.f28410d, this.f28409c, viewGroup);
                }
                mo1821e(view, this.f28410d, this.f28409c);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    public abstract View mo1822h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    protected void m29841i() {
        Cursor cursor;
        if (this.f28408b && (cursor = this.f28409c) != null && !cursor.isClosed()) {
            this.f28407a = this.f28409c.requery();
        }
    }

    /* renamed from: j */
    public Cursor m29842j(Cursor cursor) {
        Cursor cursor2 = this.f28409c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f28412f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f28413g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f28409c = cursor;
        if (cursor != null) {
            a aVar2 = this.f28412f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f28413g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f28411e = cursor.getColumnIndexOrThrow(C3329bx.f14344d);
            this.f28407a = true;
            notifyDataSetChanged();
        } else {
            this.f28411e = -1;
            this.f28407a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
