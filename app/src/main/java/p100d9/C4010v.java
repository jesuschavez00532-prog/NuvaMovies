package p100d9;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.mine.R$id;
import com.mine.R$layout;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import org.xutils.BuildConfig;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: d9.v */
/* loaded from: classes2.dex */
public final class C4010v extends AbstractC7527b {

    /* renamed from: e */
    private InterfaceC5664p f17777e;

    /* renamed from: f */
    private boolean f17778f;

    /* renamed from: g */
    private int f17779g;

    public C4010v() {
        super(R$layout.layout_item_member_center_tab, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m16943t(C4010v c4010v, C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c4010v, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (z10) {
            view.setSelected(false);
            c4010v.f17778f = true;
            c4010v.f17779g = c7531f.getBindingAdapterPosition();
            Log.d("MemberCenter", "holder.adapterPosition:" + c7531f.getBindingAdapterPosition());
            InterfaceC5664p interfaceC5664p = c4010v.f17777e;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Integer.valueOf(c7531f.getBindingAdapterPosition()), Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m16944u(C4010v c4010v, C7531f c7531f, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c4010v, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (keyEvent.getAction() == 0) {
            if (i10 == 20) {
                view.setSelected(true);
                int bindingAdapterPosition = c7531f.getBindingAdapterPosition();
                c4010v.f17779g = bindingAdapterPosition;
                if (BuildConfig.DEBUG) {
                    Log.d("MemberCenter", "isRemember:" + c4010v.f17778f + ";focusIndex:" + bindingAdapterPosition + ";" + c7531f.getBindingAdapterPosition());
                    return false;
                }
                return false;
            }
            if (i10 == 21 && c7531f.getBindingAdapterPosition() == 0) {
                view.setSelected(true);
                return false;
            }
            if ((i10 == 22 && c7531f.getBindingAdapterPosition() == c4010v.m28849g().size() - 1) || i10 == 19) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m16945v(C4010v c4010v, C7531f c7531f, View view) {
        AbstractC5868k.m23674f(c4010v, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5664p interfaceC5664p = c4010v.f17777e;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(Integer.valueOf(c7531f.getBindingAdapterPosition()), Boolean.TRUE);
        }
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return m28849g().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, String str) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(str, "bean");
        ((TextView) c7531f.m28863b(R$id.mTvTab)).setText(str);
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.s
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C4010v.m16943t(C4010v.this, c7531f, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: d9.t
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean m16944u;
                m16944u = C4010v.m16944u(C4010v.this, c7531f, view, i10, keyEvent);
                return m16944u;
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: d9.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4010v.m16945v(C4010v.this, c7531f, view);
            }
        });
    }

    /* renamed from: w */
    public final void m16947w(InterfaceC5664p interfaceC5664p) {
        this.f17777e = interfaceC5664p;
    }

    /* renamed from: x */
    public final void m16948x(boolean z10) {
        this.f17778f = z10;
    }
}
