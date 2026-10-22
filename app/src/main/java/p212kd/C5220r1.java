package p212kd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.request.result.ChildColumn;
import com.request.result.PosterList;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import java.util.List;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p201k2.AbstractC5091h;
import p348u2.AbstractC7026c;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7594o0;

/* renamed from: kd.r1 */
/* loaded from: classes3.dex */
public final class C5220r1 extends AbstractC7527b {

    /* renamed from: e */
    private C7554b f21337e;

    /* renamed from: f */
    private InterfaceC5664p f21338f;

    /* renamed from: g */
    private InterfaceC5660l f21339g;

    public C5220r1() {
        super(R$layout.item_vod_more_topic, null, 2, null);
        this.f21337e = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m21058s(C5220r1 c5220r1, C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c5220r1, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (z10) {
            C7554b c7554b = c5220r1.f21337e;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.1f);
            ((TextView) c7531f.m28863b(R$id.tvTopicVideoName)).setSelected(true);
            c7531f.itemView.setBackgroundResource(R$drawable.poster_focus_nohalo);
        } else {
            c7531f.itemView.setBackgroundColor(0);
            ((TextView) c7531f.m28863b(R$id.tvTopicVideoName)).setSelected(false);
            C7554b c7554b2 = c5220r1.f21337e;
            AbstractC5868k.m23673e(view, "v");
            c7554b2.m28945f(view, 1.1f);
        }
        InterfaceC5664p interfaceC5664p = c5220r1.f21338f;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(Integer.valueOf(c7531f.getAdapterPosition()), Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m21059t(C5220r1 c5220r1, ChildColumn childColumn, View view) {
        AbstractC5868k.m23674f(c5220r1, "this$0");
        AbstractC5868k.m23674f(childColumn, "$bean");
        InterfaceC5660l interfaceC5660l = c5220r1.f21339g;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(childColumn);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final ChildColumn childColumn) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(childColumn, "bean");
        Drawable m27111a = AbstractC7026c.m27111a(m28850h(), R$drawable.bg_placehoder);
        C7594o0 c7594o0 = C7594o0.f27942a;
        List<PosterList> posterList = childColumn.getPosterList();
        C7594o0.a aVar = C7594o0.a.SpecialTopicBanner;
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.ivTopicVideoPoster);
        Context m28850h = m28850h();
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29206q(c7594o0, posterList, aVar, imageView, m28850h, m27111a, 0, 32, null);
        c7531f.m28865d(R$id.tvTopicVideoName, AbstractC5091h.m20660c(childColumn.getName(), childColumn.getAlias()));
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.p1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5220r1.m21058s(C5220r1.this, c7531f, view, z10);
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5220r1.m21059t(C5220r1.this, childColumn, view);
            }
        });
    }

    /* renamed from: u */
    public final void m21061u(InterfaceC5664p interfaceC5664p) {
        this.f21338f = interfaceC5664p;
    }

    /* renamed from: v */
    public final void m21062v(InterfaceC5660l interfaceC5660l) {
        this.f21339g = interfaceC5660l;
    }
}
