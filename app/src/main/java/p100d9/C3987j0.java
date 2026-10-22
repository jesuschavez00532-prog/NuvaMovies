package p100d9;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.mine.R$id;
import com.mine.R$layout;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: d9.j0 */
/* loaded from: classes2.dex */
public final class C3987j0 extends AbstractC7527b {
    public C3987j0() {
        super(R$layout.layout_item_package_label, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m16874s(C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (z10) {
            view.setSelected(false);
            ((TextView) c7531f.m28863b(R$id.mTvDescription)).setSelected(true);
            ((TextView) c7531f.m28863b(R$id.mTvLabel)).setSelected(true);
        } else {
            ((TextView) c7531f.m28863b(R$id.mTvDescription)).setSelected(false);
            ((TextView) c7531f.m28863b(R$id.mTvLabel)).setSelected(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final boolean m16875t(C7531f c7531f, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (keyEvent.getAction() == 0) {
            if (c7531f.getBindingAdapterPosition() == 0) {
                view.setSelected(false);
            }
            if (i10 == 19 || i10 == 20) {
                view.setSelected(true);
            }
        }
        return false;
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        if (m28849g().size() > 3) {
            return 3;
        }
        return super.getItemCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, C3989k0 c3989k0) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(c3989k0, "bean");
        ((TextView) c7531f.m28863b(R$id.mTvLabel)).setText(c3989k0.m16878b());
        ((TextView) c7531f.m28863b(R$id.mTvDescription)).setText(c3989k0.m16877a());
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.h0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C3987j0.m16874s(C7531f.this, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: d9.i0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean m16875t;
                m16875t = C3987j0.m16875t(C7531f.this, view, i10, keyEvent);
                return m16875t;
            }
        });
    }
}
