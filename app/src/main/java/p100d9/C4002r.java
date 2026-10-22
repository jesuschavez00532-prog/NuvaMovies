package p100d9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mine.R$drawable;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.module.bean.Link;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p116e9.C4156a;
import p170i2.C4842a;
import p201k2.AbstractC5086c;
import p201k2.AbstractC5091h;
import p348u2.AbstractC7026c;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7594o0;

/* renamed from: d9.r */
/* loaded from: classes2.dex */
public final class C4002r extends AbstractC7527b {

    /* renamed from: e */
    private C7554b f17751e;

    /* renamed from: f */
    private boolean f17752f;

    /* renamed from: g */
    private InterfaceC5660l f17753g;

    /* renamed from: h */
    private InterfaceC5642a f17754h;

    /* renamed from: i */
    private InterfaceC5664p f17755i;

    /* renamed from: j */
    private RecyclerView f17756j;

    public C4002r() {
        super(R$layout.item_vod_record_list, null, 2, null);
        this.f17751e = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m16913u(C7531f c7531f, C4002r c4002r, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c4002r, "this$0");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (i10 != 19) {
            if (i10 != 21) {
                if (i10 != 22) {
                    return false;
                }
                if (c7531f.getAdapterPosition() != c4002r.getItemCount() - 1) {
                    if (c7531f.getAdapterPosition() % 5 != 4) {
                        return false;
                    }
                    RecyclerView recyclerView = c4002r.f17756j;
                    if (recyclerView != null) {
                        View view2 = c7531f.itemView;
                        AbstractC5868k.m23673e(view2, "holder.itemView");
                        View childAt = recyclerView.getChildAt(c4002r.m16917y(view2) + 1);
                        if (childAt != null) {
                            childAt.requestFocus();
                        }
                    }
                }
            } else {
                if (c7531f.getAdapterPosition() % 5 == 0) {
                    InterfaceC5660l interfaceC5660l = c4002r.f17753g;
                    if (interfaceC5660l == null) {
                        return false;
                    }
                    interfaceC5660l.mo542f(Boolean.TRUE);
                    return false;
                }
                InterfaceC5660l interfaceC5660l2 = c4002r.f17753g;
                if (interfaceC5660l2 == null) {
                    return false;
                }
                interfaceC5660l2.mo542f(Boolean.FALSE);
                return false;
            }
        } else {
            int adapterPosition = c7531f.getAdapterPosition();
            if (adapterPosition != 0 && adapterPosition != 1 && adapterPosition != 2 && adapterPosition != 3 && adapterPosition != 4) {
                return false;
            }
            InterfaceC5642a interfaceC5642a = c4002r.f17754h;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m16914v(C7531f c7531f, View view, C4002r c4002r, View view2, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(view, "$broader");
        AbstractC5868k.m23674f(c4002r, "this$0");
        if (z10) {
            ((TextView) c7531f.m28863b(R$id.tvVideoName)).setSelected(true);
            ((TextView) c7531f.m28863b(R$id.tvUpdateNum)).setSelected(true);
            view.setBackgroundResource(R$drawable.poster_focus_nohalo);
            C7554b c7554b = c4002r.f17751e;
            AbstractC5868k.m23673e(view2, "v");
            c7554b.m28943c(view2, 1.1f);
            if (c4002r.f17752f) {
                c7531f.m28867f(R$id.rlCancel, true);
                return;
            }
            return;
        }
        ((TextView) c7531f.m28863b(R$id.tvVideoName)).setSelected(false);
        ((TextView) c7531f.m28863b(R$id.tvUpdateNum)).setSelected(false);
        view.setBackgroundColor(0);
        C7554b c7554b2 = c4002r.f17751e;
        AbstractC5868k.m23673e(view2, "v");
        c7554b2.m28945f(view2, 1.1f);
        if (c4002r.f17752f) {
            c7531f.m28867f(R$id.rlCancel, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final boolean m16915w(C4002r c4002r, C7531f c7531f, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c4002r, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (c4002r.f17752f) {
            if (motionEvent.getAction() == 0) {
                c7531f.m28867f(R$id.rlCancel, true);
            } else if (motionEvent.getAction() == 1) {
                c7531f.m28867f(R$id.rlCancel, false);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m16916x(C4002r c4002r, C4156a c4156a, View view) {
        AbstractC5868k.m23674f(c4002r, "this$0");
        AbstractC5868k.m23674f(c4156a, "$bean");
        InterfaceC5664p interfaceC5664p = c4002r.f17755i;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(Boolean.valueOf(c4002r.f17752f), c4156a);
        }
    }

    /* renamed from: y */
    private final int m16917y(View view) {
        int i10;
        View view2;
        RecyclerView recyclerView = this.f17756j;
        if (recyclerView != null) {
            i10 = recyclerView.getChildCount();
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            RecyclerView recyclerView2 = this.f17756j;
            if (recyclerView2 != null) {
                view2 = recyclerView2.getChildAt(i11);
            } else {
                view2 = null;
            }
            if (AbstractC5868k.m23669a(view, view2)) {
                return i11;
            }
        }
        return 0;
    }

    /* renamed from: z */
    private final void m16918z(TextView textView, C4156a c4156a) {
        textView.setTextColor(-1);
        textView.setVisibility(0);
        if (c4156a.m17368a().getShelveType().equals("1")) {
            Link m17369b = c4156a.m17369b();
            if (m17369b != null && m17369b.getRecordTime() > 0) {
                textView.setText(Html.fromHtml(m28850h().getString(R$string.history_watched_movies, AbstractC5086c.m20623p(m17369b.getRecordTime() / 1000))));
                return;
            }
            return;
        }
        textView.setText(Html.fromHtml(m28850h().getString(R$string.history_watched_series, c4156a.m17368a().getPlayIndexTitle())));
    }

    /* renamed from: A */
    public final void m16919A(InterfaceC5660l interfaceC5660l) {
        this.f17753g = interfaceC5660l;
    }

    /* renamed from: B */
    public final void m16920B(boolean z10) {
        this.f17752f = z10;
    }

    /* renamed from: C */
    public final void m16921C(InterfaceC5664p interfaceC5664p) {
        this.f17755i = interfaceC5664p;
    }

    /* renamed from: D */
    public final void m16922D(InterfaceC5642a interfaceC5642a) {
        this.f17754h = interfaceC5642a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f17756j = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final C4156a c4156a) {
        boolean z10;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(c4156a, "bean");
        Drawable m27111a = AbstractC7026c.m27111a(m28850h(), R$drawable.bg_placehoder);
        C7594o0 c7594o0 = C7594o0.f27942a;
        String albumPic = c4156a.m17368a().getAlbumPic();
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.ivProPoster);
        Context m28850h = m28850h();
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29204m(c7594o0, albumPic, imageView, m28850h, m27111a, 0, null, 48, null);
        m16918z((TextView) c7531f.m28863b(R$id.tvUpdateNum), c4156a);
        C7531f m28865d = c7531f.m28865d(R$id.tvVideoName, AbstractC5091h.m20660c(c4156a.m17368a().getAlbumTitle(), c4156a.m17368a().getAlias()));
        int i10 = R$id.mImg4kTag;
        if (AbstractC5868k.m23669a(c4156a.m17368a().getContentType(), "3") && C4842a.f20329a.m19920a().m19932I()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m28865d.m28867f(i10, z10);
        final View view = (View) c7531f.m28863b(R$id.broader);
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: d9.n
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i11, KeyEvent keyEvent) {
                boolean m16913u;
                m16913u = C4002r.m16913u(C7531f.this, this, view2, i11, keyEvent);
                return m16913u;
            }
        });
        if (this.f17752f && c7531f.itemView.hasFocus()) {
            c7531f.m28867f(R$id.rlCancel, true);
        } else {
            c7531f.m28867f(R$id.rlCancel, false);
        }
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                C4002r.m16914v(C7531f.this, view, this, view2, z11);
            }
        });
        c7531f.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: d9.p
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m16915w;
                m16915w = C4002r.m16915w(C4002r.this, c7531f, view2, motionEvent);
                return m16915w;
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: d9.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4002r.m16916x(C4002r.this, c4156a, view2);
            }
        });
    }
}
