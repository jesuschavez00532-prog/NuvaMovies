package p212kd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.request.result.AssetList;
import com.request.result.PosterList;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p201k2.AbstractC5091h;
import p348u2.AbstractC7026c;
import p399x9.AbstractC7526a;
import p399x9.C7532g;
import p400xa.C7554b;
import p400xa.C7594o0;

/* renamed from: kd.o1 */
/* loaded from: classes3.dex */
public final class C5208o1 extends AbstractC7526a {

    /* renamed from: d */
    private C7554b f21310d;

    /* renamed from: e */
    private InterfaceC5660l f21311e;

    public C5208o1() {
        super(R$layout.topic_item, null, 2, null);
        this.f21310d = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m21035i(C7532g c7532g, C5208o1 c5208o1, AssetList assetList, View view, boolean z10) {
        AbstractC5868k.m23674f(c7532g, "$holder");
        AbstractC5868k.m23674f(c5208o1, "this$0");
        AbstractC5868k.m23674f(assetList, "$bean");
        ((AutoRelativeLayout) c7532g.m28870c(R$id.rlTopicLayout)).setSelected(z10);
        if (z10) {
            C7554b c7554b = c5208o1.f21310d;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.1f);
            InterfaceC5660l interfaceC5660l = c5208o1.f21311e;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(assetList);
                return;
            }
            return;
        }
        C7554b c7554b2 = c5208o1.f21310d;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.1f);
    }

    @Override // p399x9.AbstractC7526a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo21036b(final C7532g c7532g, final AssetList assetList) {
        boolean z10 = false;
        AbstractC5868k.m23674f(c7532g, "holder");
        AbstractC5868k.m23674f(assetList, "bean");
        if (c7532g.m28869b() == m28841d().size() - 1) {
            ((ImageView) c7532g.m28870c(R$id.ivTopicImage)).setImageResource(R$mipmap.topic_new_more_poster);
        } else {
            Drawable m27111a = AbstractC7026c.m27111a(m28842e(), R$drawable.bg_placehoder);
            C7594o0 c7594o0 = C7594o0.f27942a;
            List<PosterList> posterList = assetList.getPosterList();
            C7594o0.a aVar = C7594o0.a.Icon;
            ImageView imageView = (ImageView) c7532g.m28870c(R$id.ivTopicImage);
            Context m28842e = m28842e();
            AbstractC5868k.m23671c(m28842e);
            AbstractC5868k.m23673e(m27111a, "placeholder");
            C7594o0.m29206q(c7594o0, posterList, aVar, imageView, m28842e, m27111a, 0, 32, null);
        }
        if (assetList.getScore() == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int i10 = R$id.tvTopicGrade;
            c7532g.m28873f(i10, true).m28872e(i10, String.valueOf(assetList.getScore()));
        } else {
            c7532g.m28873f(R$id.tvTopicGrade, false);
        }
        c7532g.m28872e(R$id.mTvTopicName, AbstractC5091h.m20660c(assetList.getName(), assetList.getAlias()));
        c7532g.m28868a().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.n1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                C5208o1.m21035i(C7532g.this, this, assetList, view, z11);
            }
        });
        c7532g.m28868a().setPadding(0, 0, 0, 0);
    }

    /* renamed from: j */
    public final void m21038j(InterfaceC5660l interfaceC5660l) {
        this.f21311e = interfaceC5660l;
    }
}
