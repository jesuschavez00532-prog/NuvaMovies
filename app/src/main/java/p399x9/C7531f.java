package p399x9;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ne.AbstractC5868k;
import p433zd.AbstractC7786b;

/* renamed from: x9.f */
/* loaded from: classes2.dex */
public final class C7531f extends RecyclerView.AbstractC0787f0 {

    /* renamed from: a */
    private final SparseArray f27675a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7531f(View view, boolean z10) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        this.f27675a = new SparseArray();
        if (z10) {
            AbstractC7786b.m30157a(view);
        }
    }

    /* renamed from: b */
    public final Object m28863b(int i10) {
        View view = (View) this.f27675a.get(i10);
        if (view == null) {
            View findViewById = this.itemView.findViewById(i10);
            this.f27675a.put(i10, findViewById);
            return findViewById;
        }
        return view;
    }

    /* renamed from: c */
    public final C7531f m28864c(int i10, View.OnClickListener onClickListener) {
        AbstractC5868k.m23674f(onClickListener, "clickListener");
        ((View) m28863b(i10)).setOnClickListener(onClickListener);
        return this;
    }

    /* renamed from: d */
    public final C7531f m28865d(int i10, String str) {
        TextView textView = (TextView) m28863b(i10);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        return this;
    }

    /* renamed from: e */
    public final C7531f m28866e(int i10, int i11) {
        ((View) m28863b(i10)).setVisibility(i11);
        return this;
    }

    /* renamed from: f */
    public final C7531f m28867f(int i10, boolean z10) {
        int i11 = 0;
        View view = (View) m28863b(i10);
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        return this;
    }
}
