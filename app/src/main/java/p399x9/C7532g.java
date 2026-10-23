package p399x9;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import ne.AbstractC5868k;
import p433zd.AbstractC7786b;

/* renamed from: x9.g */
/* loaded from: classes2.dex */
public final class C7532g {

    /* renamed from: a */
    private final View f27676a;

    /* renamed from: b */
    private final SparseArray f27677b;

    /* renamed from: c */
    private int f27678c;

    public C7532g(View view) {
        AbstractC5868k.m23674f(view, "itemView");
        this.f27676a = view;
        this.f27677b = new SparseArray();
        AbstractC7786b.m30157a(view);
    }

    /* renamed from: a */
    public final View m28868a() {
        return this.f27676a;
    }

    /* renamed from: b */
    public final int m28869b() {
        return this.f27678c;
    }

    /* renamed from: c */
    public final Object m28870c(int i10) {
        View view = (View) this.f27677b.get(i10);
        if (view == null) {
            View findViewById = this.f27676a.findViewById(i10);
            this.f27677b.put(i10, findViewById);
            return findViewById;
        }
        return view;
    }

    /* renamed from: d */
    public final void m28871d(int i10) {
        this.f27678c = i10;
    }

    /* renamed from: e */
    public final C7532g m28872e(int i10, String str) {
        TextView textView = (TextView) m28870c(i10);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        return this;
    }

    /* renamed from: f */
    public final C7532g m28873f(int i10, boolean z10) {
        int i11 = 0;
        View view = (View) m28870c(i10);
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        return this;
    }
}
