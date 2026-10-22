package p420z;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: z.b */
/* loaded from: classes.dex */
class C7725b extends Filter {

    /* renamed from: a */
    a f28417a;

    /* renamed from: z.b$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo1818a(Cursor cursor);

        /* renamed from: b */
        Cursor mo29838b();

        /* renamed from: c */
        CharSequence mo1819c(Cursor cursor);

        /* renamed from: d */
        Cursor mo1820d(CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7725b(a aVar) {
        this.f28417a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f28417a.mo1819c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo1820d = this.f28417a.mo1820d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo1820d != null) {
            filterResults.count = mo1820d.getCount();
            filterResults.values = mo1820d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo29838b = this.f28417a.mo29838b();
        Object obj = filterResults.values;
        if (obj != null && obj != mo29838b) {
            this.f28417a.mo1818a((Cursor) obj);
        }
    }
}
