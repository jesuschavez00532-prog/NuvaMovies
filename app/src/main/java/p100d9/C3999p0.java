package p100d9;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mine.R$id;
import com.mine.R$layout;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: d9.p0 */
/* loaded from: classes2.dex */
public final class C3999p0 extends AbstractC7527b {

    /* renamed from: e */
    private a f17744e;

    /* renamed from: f */
    private boolean f17745f;

    /* renamed from: g */
    private int f17746g;

    /* renamed from: d9.p0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo11948a(int i10);

        /* renamed from: b */
        void mo11949b(int i10, boolean z10);
    }

    public C3999p0() {
        super(R$layout.item_person_menu, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m16903t(C3999p0 c3999p0, int i10, TextView textView, ImageView imageView, C4011w c4011w, View view, boolean z10) {
        boolean z11;
        AbstractC5868k.m23674f(c3999p0, "this$0");
        AbstractC5868k.m23674f(textView, "$mTvMenu");
        AbstractC5868k.m23674f(imageView, "$mIvMenu");
        AbstractC5868k.m23674f(c4011w, "$tabBean");
        a aVar = c3999p0.f17744e;
        if (aVar != null) {
            aVar.mo11949b(i10, z10);
        }
        textView.setFocusable(z10);
        textView.setSelected(z10);
        int i11 = 0;
        if (z10) {
            c3999p0.f17745f = false;
            c3999p0.f17746g = i10;
            view.setSelected(false);
            Integer m16949a = c4011w.m16949a();
            if (m16949a != null) {
                i11 = m16949a.intValue();
            }
            imageView.setImageResource(i11);
            return;
        }
        if (c3999p0.f17745f && c3999p0.f17746g == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setSelected(z11);
        if (view.isSelected()) {
            Integer m16951c = c4011w.m16951c();
            if (m16951c != null) {
                i11 = m16951c.intValue();
            }
            imageView.setImageResource(i11);
            return;
        }
        Integer m16950b = c4011w.m16950b();
        if (m16950b != null) {
            i11 = m16950b.intValue();
        }
        imageView.setImageResource(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m16904u(C3999p0 c3999p0, int i10, View view, int i11, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c3999p0, "this$0");
        if (keyEvent.getAction() == 0) {
            if (i11 == 22) {
                a aVar = c3999p0.f17744e;
                if (aVar != null) {
                    aVar.mo11948a(i10);
                }
                return true;
            }
            if (i11 == 20 && i10 == c3999p0.getItemCount() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m16905v(C3999p0 c3999p0, int i10, View view) {
        AbstractC5868k.m23674f(c3999p0, "this$0");
        a aVar = c3999p0.f17744e;
        if (aVar != null) {
            aVar.mo11948a(i10);
        }
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return m28849g().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, final C4011w c4011w) {
        int i10;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(c4011w, "bean");
        final int adapterPosition = c7531f.getAdapterPosition();
        final ImageView imageView = (ImageView) c7531f.m28863b(R$id.mIvMenu);
        final TextView textView = (TextView) c7531f.m28863b(R$id.mTvMenu);
        textView.setText(c4011w.m16953e());
        Integer m16950b = c4011w.m16950b();
        boolean z10 = false;
        if (m16950b != null) {
            i10 = m16950b.intValue();
        } else {
            i10 = 0;
        }
        imageView.setImageResource(i10);
        View view = c7531f.itemView;
        if (this.f17745f && this.f17746g == adapterPosition) {
            z10 = true;
        }
        view.setSelected(z10);
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.m0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                C3999p0.m16903t(C3999p0.this, adapterPosition, textView, imageView, c4011w, view2, z11);
            }
        });
        if (adapterPosition == getItemCount() - 1) {
            c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: d9.n0
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i11, KeyEvent keyEvent) {
                    boolean m16904u;
                    m16904u = C3999p0.m16904u(C3999p0.this, adapterPosition, view2, i11, keyEvent);
                    return m16904u;
                }
            });
        } else {
            c7531f.itemView.setOnKeyListener(null);
        }
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: d9.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3999p0.m16905v(C3999p0.this, adapterPosition, view2);
            }
        });
    }

    /* renamed from: w */
    public final void m16907w(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f17744e = aVar;
    }

    /* renamed from: x */
    public final void m16908x(boolean z10) {
        this.f17745f = z10;
    }
}
