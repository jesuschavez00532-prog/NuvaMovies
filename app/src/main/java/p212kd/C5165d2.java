package p212kd;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.request.result.ChildColumn;
import com.request.result.PosterList;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import java.util.List;
import me.InterfaceC5660l;
import me.InterfaceC5665q;
import ne.AbstractC5868k;
import p201k2.AbstractC5091h;
import p216l1.AbstractC5323j;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7594o0;

/* renamed from: kd.d2 */
/* loaded from: classes3.dex */
public final class C5165d2 extends AbstractC7527b {

    /* renamed from: e */
    private InterfaceC5665q f21151e;

    /* renamed from: f */
    private InterfaceC5660l f21152f;

    /* renamed from: g */
    private RecyclerView f21153g;

    /* renamed from: h */
    private boolean f21154h;

    /* renamed from: i */
    private View f21155i;

    public C5165d2() {
        super(R$layout.layout_item_vod_kids_category, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m20851t(C5165d2 c5165d2, C7531f c7531f, ChildColumn childColumn, TextView textView, ImageView imageView, View view, boolean z10) {
        AbstractC5868k.m23674f(c5165d2, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(childColumn, "$bean");
        AbstractC5868k.m23674f(textView, "$tvName");
        AbstractC5868k.m23674f(imageView, "$ivIcon");
        InterfaceC5665q interfaceC5665q = c5165d2.f21151e;
        if (interfaceC5665q != null) {
            interfaceC5665q.mo12281b(Integer.valueOf(c7531f.getAdapterPosition()), childColumn, Boolean.valueOf(z10));
        }
        ((LinearLayout) c7531f.m28863b(R$id.llCentreItem)).setSelected(z10);
        if (z10) {
            c5165d2.f21154h = false;
            textView.setTextColor(c5165d2.m28850h().getResources().getColor(R$color.color_8d5429));
            C7594o0 c7594o0 = C7594o0.f27942a;
            Context m28850h = c5165d2.m28850h();
            List<PosterList> posterList = childColumn.getPosterList();
            C7594o0.a aVar = C7594o0.a.Icon;
            AbstractC5323j abstractC5323j = AbstractC5323j.f21745c;
            AbstractC5868k.m23673e(abstractC5323j, "DATA");
            C7594o0.m29189D(c7594o0, m28850h, posterList, aVar, imageView, null, null, abstractC5323j, 1, 48, null);
            return;
        }
        C7594o0 c7594o02 = C7594o0.f27942a;
        Context m28850h2 = c5165d2.m28850h();
        List<PosterList> posterList2 = childColumn.getPosterList();
        C7594o0.a aVar2 = C7594o0.a.Logo;
        AbstractC5323j abstractC5323j2 = AbstractC5323j.f21745c;
        AbstractC5868k.m23673e(abstractC5323j2, "DATA");
        C7594o0.m29189D(c7594o02, m28850h2, posterList2, aVar2, imageView, null, null, abstractC5323j2, 1, 48, null);
        if (c5165d2.f21154h) {
            c5165d2.f21155i = view;
            textView.setTextColor(c5165d2.m28850h().getResources().getColor(R$color.color_kids_item_text_f));
        } else {
            textView.setTextColor(c5165d2.m28850h().getResources().getColor(R$color.color_0a6638));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m20852u(C5165d2 c5165d2, ChildColumn childColumn, View view, MotionEvent motionEvent) {
        InterfaceC5660l interfaceC5660l;
        AbstractC5868k.m23674f(c5165d2, "this$0");
        AbstractC5868k.m23674f(childColumn, "$bean");
        if (motionEvent.getAction() == 1 && (interfaceC5660l = c5165d2.f21152f) != null) {
            interfaceC5660l.mo542f(childColumn);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21153g = recyclerView;
    }

    /* renamed from: r */
    public final void m20853r() {
        this.f21155i = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final ChildColumn childColumn) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(childColumn, "bean");
        final TextView textView = (TextView) c7531f.m28863b(R$id.tvName);
        textView.setText(AbstractC5091h.m20660c(childColumn.getName(), childColumn.getAlias()));
        textView.setTypeface(Typeface.createFromAsset(m28850h().getAssets(), "amazingkids.otf"));
        final ImageView imageView = (ImageView) c7531f.m28863b(R$id.ivIcon);
        C7594o0 c7594o0 = C7594o0.f27942a;
        Context m28850h = m28850h();
        List<PosterList> posterList = childColumn.getPosterList();
        C7594o0.a aVar = C7594o0.a.Logo;
        AbstractC5323j abstractC5323j = AbstractC5323j.f21745c;
        AbstractC5868k.m23673e(abstractC5323j, "DATA");
        C7594o0.m29189D(c7594o0, m28850h, posterList, aVar, imageView, null, null, abstractC5323j, 1, 48, null);
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.b2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5165d2.m20851t(C5165d2.this, c7531f, childColumn, textView, imageView, view, z10);
            }
        });
        c7531f.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: kd.c2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m20852u;
                m20852u = C5165d2.m20852u(C5165d2.this, childColumn, view, motionEvent);
                return m20852u;
            }
        });
    }

    /* renamed from: v */
    public final boolean m20855v() {
        if (this.f21155i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void m20856w() {
        View view = this.f21155i;
        if (view != null) {
            view.requestFocus();
        }
    }

    /* renamed from: x */
    public final void m20857x(InterfaceC5665q interfaceC5665q) {
        this.f21151e = interfaceC5665q;
    }

    /* renamed from: y */
    public final void m20858y(InterfaceC5660l interfaceC5660l) {
        this.f21152f = interfaceC5660l;
    }

    /* renamed from: z */
    public final void m20859z(boolean z10) {
        this.f21154h = z10;
    }
}
