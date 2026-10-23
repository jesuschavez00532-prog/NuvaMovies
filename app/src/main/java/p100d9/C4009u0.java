package p100d9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mine.R$color;
import com.mine.R$drawable;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.mine.R$style;
import com.module.bean.SeriesSeasonBean;
import com.request.result.PosterList;
import com.request.result.SubscribeData;
import java.util.ArrayList;
import java.util.Arrays;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.C5881x;
import p153h2.AbstractC4509b;
import p170i2.C4842a;
import p201k2.AbstractC5091h;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7594o0;
import p400xa.C7607s1;

/* renamed from: d9.u0 */
/* loaded from: classes2.dex */
public final class C4009u0 extends AbstractC7527b {

    /* renamed from: e */
    private C7554b f17770e;

    /* renamed from: f */
    private boolean f17771f;

    /* renamed from: g */
    private InterfaceC5660l f17772g;

    /* renamed from: h */
    private InterfaceC5642a f17773h;

    /* renamed from: i */
    private InterfaceC5664p f17774i;

    /* renamed from: j */
    private RecyclerView f17775j;

    /* renamed from: k */
    private String f17776k;

    public C4009u0() {
        super(R$layout.item_vod_record_list, null, 2, null);
        this.f17770e = new C7554b();
        this.f17776k = "";
    }

    /* renamed from: B */
    private final void m16924B(SubscribeData subscribeData, TextView textView) {
        if (subscribeData.getScore() <= 0.0f) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        SpannableString spannableString = new SpannableString(String.valueOf(subscribeData.getScore()));
        spannableString.setSpan(new TextAppearanceSpan(m28850h(), R$style.style_movie_rate_large), 0, 1, 33);
        spannableString.setSpan(new TextAppearanceSpan(m28850h(), R$style.style_movie_rate_small), 2, 3, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* renamed from: C */
    private final void m16925C(TextView textView, SubscribeData subscribeData) {
        textView.setTextColor(-1);
        if (!AbstractC5868k.m23669a("1", subscribeData.getType()) && !AbstractC5868k.m23669a("3", subscribeData.getType()) && subscribeData.getVolumnCount() != 1) {
            if (subscribeData.getUpdateCount() == subscribeData.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f17776k)) {
                    textView.setVisibility(0);
                    C5881x c5881x = C5881x.f23415a;
                    String string = m28850h().getString(R$string.detail_season_over);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.detail_season_over)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f17776k}, 1));
                    AbstractC5868k.m23673e(format, "format(format, *args)");
                    textView.setText(format);
                    textView.setTextColor(m28850h().getResources().getColor(R$color.color_ffffff));
                    textView.setGravity(81);
                    return;
                }
                return;
            }
            textView.setVisibility(0);
            textView.setGravity(81);
            if (AbstractC6567a.m25637g(this.f17776k)) {
                C5881x c5881x2 = C5881x.f23415a;
                String string2 = m28850h().getString(R$string.program_update_to);
                AbstractC5868k.m23673e(string2, "mContext.getString(R.string.program_update_to)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{this.f17776k, Integer.valueOf(subscribeData.getUpdateCount())}, 2));
                AbstractC5868k.m23673e(format2, "format(format, *args)");
                textView.setText(format2);
                return;
            }
            C5881x c5881x3 = C5881x.f23415a;
            String string3 = m28850h().getString(R$string.detail_temp_set);
            AbstractC5868k.m23673e(string3, "mContext.getString(R.string.detail_temp_set)");
            String format3 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(subscribeData.getUpdateCount())}, 1));
            AbstractC5868k.m23673e(format3, "format(format, *args)");
            textView.setText(format3);
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m16930u(C7531f c7531f, C4009u0 c4009u0, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c4009u0, "this$0");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (i10 != 19) {
            if (i10 != 21) {
                if (i10 != 22) {
                    return false;
                }
                if (c7531f.getAdapterPosition() != c4009u0.getItemCount() - 1) {
                    if (c7531f.getAdapterPosition() % 5 != 4) {
                        return false;
                    }
                    RecyclerView recyclerView = c4009u0.f17775j;
                    if (recyclerView != null) {
                        View view2 = c7531f.itemView;
                        AbstractC5868k.m23673e(view2, "holder.itemView");
                        View childAt = recyclerView.getChildAt(c4009u0.m16934y(view2) + 1);
                        if (childAt != null) {
                            childAt.requestFocus();
                        }
                    }
                }
            } else {
                if (c7531f.getAdapterPosition() % 5 == 0) {
                    InterfaceC5660l interfaceC5660l = c4009u0.f17772g;
                    if (interfaceC5660l == null) {
                        return false;
                    }
                    interfaceC5660l.mo542f(Boolean.TRUE);
                    return false;
                }
                InterfaceC5660l interfaceC5660l2 = c4009u0.f17772g;
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
            InterfaceC5642a interfaceC5642a = c4009u0.f17773h;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m16931v(C7531f c7531f, C4009u0 c4009u0, View view, View view2, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c4009u0, "this$0");
        AbstractC5868k.m23674f(view, "$broader");
        ((TextView) c7531f.m28863b(R$id.tvUpdateNum)).setSelected(z10);
        if (c7531f.getAdapterPosition() % 5 == 0) {
            if (z10) {
                InterfaceC5660l interfaceC5660l = c4009u0.f17772g;
                if (interfaceC5660l != null) {
                    interfaceC5660l.mo542f(Boolean.TRUE);
                }
            } else {
                InterfaceC5660l interfaceC5660l2 = c4009u0.f17772g;
                if (interfaceC5660l2 != null) {
                    interfaceC5660l2.mo542f(Boolean.FALSE);
                }
            }
        }
        if (z10) {
            ((TextView) c7531f.m28863b(R$id.tvVideoName)).setSelected(true);
            view.setBackgroundResource(R$drawable.poster_focus_nohalo);
            C7554b c7554b = c4009u0.f17770e;
            AbstractC5868k.m23673e(view2, "v");
            c7554b.m28943c(view2, 1.1f);
            if (c4009u0.f17771f) {
                c7531f.m28867f(R$id.rlCancel, true);
                return;
            }
            return;
        }
        ((TextView) c7531f.m28863b(R$id.tvVideoName)).setSelected(false);
        view.setBackgroundColor(0);
        C7554b c7554b2 = c4009u0.f17770e;
        AbstractC5868k.m23673e(view2, "v");
        c7554b2.m28945f(view2, 1.1f);
        if (c4009u0.f17771f) {
            c7531f.m28867f(R$id.rlCancel, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final boolean m16932w(C4009u0 c4009u0, C7531f c7531f, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c4009u0, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (c4009u0.f17771f) {
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
    public static final void m16933x(C4009u0 c4009u0, SubscribeData subscribeData, View view) {
        AbstractC5868k.m23674f(c4009u0, "this$0");
        AbstractC5868k.m23674f(subscribeData, "$bean");
        InterfaceC5664p interfaceC5664p = c4009u0.f17774i;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(Boolean.valueOf(c4009u0.f17771f), subscribeData);
        }
    }

    /* renamed from: y */
    private final int m16934y(View view) {
        int i10 = 0;
        View view2;
        RecyclerView recyclerView = this.f17775j;
        if (recyclerView != null) {
            i10 = recyclerView.getChildCount();
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            RecyclerView recyclerView2 = this.f17775j;
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

    /* renamed from: A */
    public final void m16935A(boolean z10) {
        this.f17771f = z10;
    }

    /* renamed from: D */
    public final void m16936D(InterfaceC5664p interfaceC5664p) {
        this.f17774i = interfaceC5664p;
    }

    /* renamed from: E */
    public final void m16937E(InterfaceC5642a interfaceC5642a) {
        this.f17773h = interfaceC5642a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f17775j = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final SubscribeData subscribeData) {
        C7594o0.a aVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(subscribeData, "bean");
        C7594o0 c7594o0 = C7594o0.f27942a;
        ArrayList<PosterList> posterList = subscribeData.getPosterList();
        if (AbstractC5868k.m23669a("3", subscribeData.getType())) {
            aVar = C7594o0.a.SpecialTopic;
        } else {
            aVar = C7594o0.a.Icon;
        }
        String m29220i = c7594o0.m29220i(posterList, aVar);
        Drawable m27111a = AbstractC7026c.m27111a(m28850h(), R$drawable.bg_placehoder);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.ivProPoster);
        Context m28850h = m28850h();
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29204m(c7594o0, m29220i, imageView, m28850h, m27111a, 0, null, 48, null);
        m16925C((TextView) c7531f.m28863b(R$id.tvUpdateNum), subscribeData);
        m16924B(subscribeData, (TextView) c7531f.m28863b(R$id.tvdDtailsSroce));
        int i10 = R$id.tvTagSubtitle;
        if (subscribeData.getMoreSubtitle() == 1 && AbstractC5868k.m23669a(subscribeData.getType(), "1")) {
            z10 = true;
        } else {
            z10 = false;
        }
        C7531f m28867f = c7531f.m28867f(i10, z10);
        int i11 = R$id.tvTsTag;
        String contentType = subscribeData.getContentType();
        if (contentType != null) {
            z11 = contentType.equals("1");
        } else {
            z11 = false;
        }
        C7531f m28867f2 = m28867f.m28867f(i11, z11);
        int i12 = R$id.mImg4kTag;
        if (AbstractC5868k.m23669a(subscribeData.getContentType(), "3") && C4842a.f20329a.m19920a().m19932I()) {
            z12 = true;
        } else {
            z12 = false;
        }
        C7531f m28867f3 = m28867f2.m28867f(i12, z12);
        int i13 = R$id.tvTopicTag;
        String type = subscribeData.getType();
        if (type != null) {
            z13 = type.equals("3");
        } else {
            z13 = false;
        }
        m28867f3.m28867f(i13, z13);
        String m20660c = AbstractC5091h.m20660c(subscribeData.getName(), subscribeData.getAlias());
        if (AbstractC6567a.m25637g(m20660c)) {
            AbstractC4509b.m18869b("SubscribeAdapter", "name:" + m20660c, new Object[0]);
            C7607s1 c7607s1 = new C7607s1();
            AbstractC5868k.m23673e(m20660c, "textName");
            SeriesSeasonBean m29251a = c7607s1.m29251a(m20660c);
            String name = m29251a.getName();
            this.f17776k = m29251a.getSeason();
            c7531f.m28865d(R$id.tvVideoName, name);
        }
        final View view = (View) c7531f.m28863b(R$id.broader);
        if (this.f17771f && c7531f.itemView.hasFocus()) {
            c7531f.m28867f(R$id.rlCancel, true);
        } else {
            c7531f.m28867f(R$id.rlCancel, false);
        }
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: d9.q0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
                boolean m16930u;
                m16930u = C4009u0.m16930u(C7531f.this, this, view2, i14, keyEvent);
                return m16930u;
            }
        });
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.r0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z14) {
                C4009u0.m16931v(C7531f.this, this, view, view2, z14);
            }
        });
        c7531f.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: d9.s0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m16932w;
                m16932w = C4009u0.m16932w(C4009u0.this, c7531f, view2, motionEvent);
                return m16932w;
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: d9.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4009u0.m16933x(C4009u0.this, subscribeData, view2);
            }
        });
    }

    /* renamed from: z */
    public final void m16939z(InterfaceC5660l interfaceC5660l) {
        this.f17772g = interfaceC5660l;
    }
}
