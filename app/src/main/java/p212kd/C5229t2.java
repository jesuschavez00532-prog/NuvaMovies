package p212kd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.open.leanback.widget.AbstractC3050a;
import com.request.result.PersonDetailInfo;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import ne.AbstractC5868k;
import p348u2.AbstractC7026c;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7580j1;
import p400xa.C7594o0;

/* renamed from: kd.t2 */
/* loaded from: classes3.dex */
public final class C5229t2 extends AbstractC7527b {

    /* renamed from: e */
    private C7554b f21381e;

    /* renamed from: f */
    private AbstractC3050a f21382f;

    /* renamed from: g */
    private C7531f f21383g;

    /* renamed from: h */
    private InterfaceC5152a1 f21384h;

    public C5229t2() {
        super(R$layout.item_vod_search_person_list, null, 2, null);
        this.f21381e = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m21088t(C5229t2 c5229t2, C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c5229t2, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (z10) {
            c5229t2.f21383g = c7531f;
            ((TextView) c7531f.m28863b(R$id.tvVideoState)).setSelected(true);
            ((TextView) c7531f.m28863b(R$id.tvVideoName)).setSelected(true);
            c7531f.itemView.setTag(Boolean.TRUE);
            C7554b c7554b = c5229t2.f21381e;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.1f);
            return;
        }
        ((TextView) c7531f.m28863b(R$id.tvVideoState)).setSelected(false);
        ((TextView) c7531f.m28863b(R$id.tvVideoName)).setSelected(false);
        C7554b c7554b2 = c5229t2.f21381e;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.1f);
        c7531f.itemView.setTag(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m21089u(C5229t2 c5229t2, C7531f c7531f, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5229t2, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5152a1 interfaceC5152a1 = c5229t2.f21384h;
        if (interfaceC5152a1 != null) {
            AbstractC5868k.m23673e(view, "v");
            AbstractC5868k.m23673e(keyEvent, "event");
            return interfaceC5152a1.mo20833a(view, i10, keyEvent, c7531f);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m21090v(C5229t2 c5229t2, PersonDetailInfo personDetailInfo, C7531f c7531f, View view) {
        AbstractC5868k.m23674f(c5229t2, "this$0");
        AbstractC5868k.m23674f(personDetailInfo, "$bean");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5152a1 interfaceC5152a1 = c5229t2.f21384h;
        if (interfaceC5152a1 != null) {
            interfaceC5152a1.mo20834b(personDetailInfo, c7531f.getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21382f = (AbstractC3050a) recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final PersonDetailInfo personDetailInfo) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(personDetailInfo, "bean");
        int i10 = R$id.tvVideoName;
        String name = personDetailInfo.getName();
        if (name == null) {
            name = "";
        }
        c7531f.m28865d(i10, name);
        String m29088a = C7580j1.f27853a.m29088a(personDetailInfo.getIcon());
        Drawable m27111a = AbstractC7026c.m27111a(m28850h(), R$drawable.bg_placehoder);
        C7594o0 c7594o0 = C7594o0.f27942a;
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.ivVideoPoster);
        Context m28850h = m28850h();
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29204m(c7594o0, m29088a, imageView, m28850h, m27111a, 0, null, 48, null);
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.q2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5229t2.m21088t(C5229t2.this, c7531f, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: kd.r2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m21089u;
                m21089u = C5229t2.m21089u(C5229t2.this, c7531f, view, i11, keyEvent);
                return m21089u;
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5229t2.m21090v(C5229t2.this, personDetailInfo, c7531f, view);
            }
        });
    }

    /* renamed from: w */
    public final void m21092w(InterfaceC5152a1 interfaceC5152a1) {
        this.f21384h = interfaceC5152a1;
    }
}
