package p354u8;

import android.view.View;
import android.widget.ImageView;
import com.live.p064ui.activity.LiveFreeActivity;
import com.main.R$id;
import com.main.R$layout;
import com.main.R$mipmap;
import com.request.result.Channel;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p029b9.C1192c;
import p040c8.C1407f;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7594o0;
import p400xa.C7619y;

/* renamed from: u8.d */
/* loaded from: classes2.dex */
public final class C7055d extends AbstractC7527b {

    /* renamed from: e */
    private int f26454e;

    /* renamed from: f */
    private InterfaceC5660l f26455f;

    /* renamed from: g */
    private final C7554b f26456g;

    public C7055d() {
        super(R$layout.item_free_area_channel_list, null, 2, null);
        this.f26456g = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m27176s(C7531f c7531f, C7055d c7055d, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c7055d, "this$0");
        c7531f.itemView.setSelected(z10);
        if (z10) {
            InterfaceC5660l interfaceC5660l = c7055d.f26455f;
            if (interfaceC5660l != null) {
                AbstractC5868k.m23673e(view, "v");
                interfaceC5660l.mo542f(view);
            }
            C7554b c7554b = c7055d.f26456g;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.1f);
            return;
        }
        C7554b c7554b2 = c7055d.f26456g;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m27177t(C7531f c7531f, C7055d c7055d, View view) {
        int adapterPosition;
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c7055d, "this$0");
        if (c7531f.getAdapterPosition() == C1192c.f4723M0.m5466a() - 1) {
            adapterPosition = 0;
        } else {
            adapterPosition = c7531f.getAdapterPosition();
        }
        List m28848f = c7055d.m28848f();
        C1407f c1407f = C1407f.f5458a;
        c1407f.m6508f0(m28848f);
        c1407f.m6506e0(adapterPosition);
        C7619y.f28056a.m29369b(c7055d.m28850h(), LiveFreeActivity.class);
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        int itemCount = super.getItemCount();
        C1192c.a aVar = C1192c.f4723M0;
        if (itemCount > aVar.m5466a()) {
            return aVar.m5466a();
        }
        return itemCount;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, Channel channel) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(channel, "bean");
        if (c7531f.getAdapterPosition() == C1192c.f4723M0.m5466a() - 1) {
            c7531f.m28867f(R$id.mLayoutMore, true).m28867f(R$id.mPosterImg, false).m28867f(R$id.mVideoNameText, false);
        } else {
            C7531f m28867f = c7531f.m28867f(R$id.mLayoutMore, false);
            int i10 = R$id.mVideoNameText;
            m28867f.m28867f(i10, true).m28865d(i10, channel.getName());
            C7594o0.m29205p(C7594o0.f27942a, channel.getPosterList(), C7594o0.a.Poster, (ImageView) c7531f.m28863b(R$id.mPosterImg), m28850h(), R$mipmap.icon_live_free_placeholder, 0, 32, null);
        }
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: u8.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C7055d.m27176s(C7531f.this, this, view, z10);
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: u8.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7055d.m27177t(C7531f.this, this, view);
            }
        });
    }

    /* renamed from: u */
    public final void m27179u(int i10) {
        this.f26454e = i10;
    }

    /* renamed from: v */
    public final void m27180v(InterfaceC5660l interfaceC5660l) {
        this.f26455f = interfaceC5660l;
    }
}
