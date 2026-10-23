package p212kd;

import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.bean.SeriesSeasonBean;
import com.request.result.AssetList;
import com.vod.R$color;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$string;
import com.vod.R$style;
import java.util.Arrays;
import ne.AbstractC5868k;
import ne.C5881x;
import p153h2.AbstractC4509b;
import p170i2.C4842a;
import p201k2.AbstractC5091h;
import p317rb.AbstractC6567a;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7594o0;
import p400xa.C7607s1;

/* renamed from: kd.p2 */
/* loaded from: classes3.dex */
public final class C5213p2 extends AbstractC7527b {

    /* renamed from: e */
    private C7554b f21320e;

    /* renamed from: f */
    private C7531f f21321f;

    /* renamed from: g */
    private InterfaceC5156b1 f21322g;

    /* renamed from: h */
    private String f21323h;

    public C5213p2(int i10) {
        super(i10, null, 2, null);
        this.f21320e = new C7554b();
        this.f21323h = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m21042t(C5213p2 c5213p2, C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c5213p2, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (z10) {
            c5213p2.f21321f = c7531f;
            ((TextView) c7531f.m28863b(R$id.tvVideoState)).setSelected(true);
            ((TextView) c7531f.m28863b(R$id.tvVideoName)).setSelected(true);
            c7531f.itemView.setTag(Boolean.TRUE);
            C7554b c7554b = c5213p2.f21320e;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.1f);
            return;
        }
        ((TextView) c7531f.m28863b(R$id.tvVideoState)).setSelected(false);
        ((TextView) c7531f.m28863b(R$id.tvVideoName)).setSelected(false);
        C7554b c7554b2 = c5213p2.f21320e;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.1f);
        c7531f.itemView.setTag(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m21043u(C5213p2 c5213p2, C7531f c7531f, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5213p2, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5156b1 interfaceC5156b1 = c5213p2.f21322g;
        if (interfaceC5156b1 != null) {
            AbstractC5868k.m23673e(view, "v");
            AbstractC5868k.m23673e(keyEvent, "event");
            return interfaceC5156b1.mo16309a(view, i10, keyEvent, c7531f);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m21044v(C5213p2 c5213p2, AssetList assetList, C7531f c7531f, View view) {
        AbstractC5868k.m23674f(c5213p2, "this$0");
        AbstractC5868k.m23674f(assetList, "$bean");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5156b1 interfaceC5156b1 = c5213p2.f21322g;
        if (interfaceC5156b1 != null) {
            interfaceC5156b1.mo16310b(assetList, c7531f.getAdapterPosition());
        }
    }

    /* renamed from: x */
    private final void m21045x(TextView textView, AssetList assetList) {
        textView.setTextColor(-1);
        if (!AbstractC5868k.m23669a("1", assetList.getType()) && !AbstractC5868k.m23669a("3", assetList.getType()) && assetList.getVolumnCount() != 1) {
            if (assetList.getUpdateCount() == assetList.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f21323h)) {
                    textView.setVisibility(0);
                    C5881x c5881x = C5881x.f23415a;
                    String string = m28850h().getString(R$string.detail_season_over);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.detail_season_over)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f21323h}, 1));
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
            if (AbstractC6567a.m25637g(this.f21323h)) {
                C5881x c5881x2 = C5881x.f23415a;
                String string2 = m28850h().getString(R$string.program_update_to);
                AbstractC5868k.m23673e(string2, "mContext.getString(R.string.program_update_to)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{this.f21323h, Integer.valueOf(assetList.getUpdateCount())}, 2));
                AbstractC5868k.m23673e(format2, "format(format, *args)");
                textView.setText(format2);
                return;
            }
            C5881x c5881x3 = C5881x.f23415a;
            String string3 = m28850h().getString(R$string.detail_temp_set);
            AbstractC5868k.m23673e(string3, "mContext.getString(R.string.detail_temp_set)");
            String format3 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(assetList.getUpdateCount())}, 1));
            AbstractC5868k.m23673e(format3, "format(format, *args)");
            textView.setText(format3);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: y */
    private final void m21046y(TextView textView, AssetList assetList) {
        if (assetList.getScore() <= 0.0f) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        SpannableString spannableString = new SpannableString(String.valueOf(assetList.getScore()));
        spannableString.setSpan(new TextAppearanceSpan(m28850h(), R$style.style_movie_rate_large), 0, 1, 33);
        spannableString.setSpan(new TextAppearanceSpan(m28850h(), R$style.style_movie_rate_small), 2, 3, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final AssetList assetList) {
        boolean z10 = false;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(assetList, "bean");
        String m20660c = AbstractC5091h.m20660c(assetList.getName(), assetList.getAlias());
        boolean z11 = false;
        if (AbstractC6567a.m25637g(m20660c)) {
            AbstractC4509b.m18869b("VodSearchNewAdapter", "name:" + m20660c, new Object[0]);
            C7607s1 c7607s1 = new C7607s1();
            AbstractC5868k.m23673e(m20660c, "textName");
            SeriesSeasonBean m29251a = c7607s1.m29251a(m20660c);
            String name = m29251a.getName();
            this.f21323h = m29251a.getSeason();
            c7531f.m28865d(R$id.tvVideoName, name);
        }
        C7594o0.m29205p(C7594o0.f27942a, assetList.getPosterList(), C7594o0.a.Icon, (ImageView) c7531f.m28863b(R$id.ivVideoPoster), m28850h(), R$drawable.bg_placehoder, 0, 32, null);
        m21045x((TextView) c7531f.m28863b(R$id.tvVideoState), assetList);
        m21046y((TextView) c7531f.m28863b(R$id.tvVideoScore), assetList);
        C7531f m28867f = c7531f.m28867f(R$id.ivVideoTsTag, "1".equals(assetList.getContentType()));
        int i10 = R$id.ivVideo4kTag;
        if (AbstractC5868k.m23669a(assetList.getContentType(), "3") && C4842a.f20329a.m19920a().m19932I()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C7531f m28867f2 = m28867f.m28867f(i10, z10);
        int i11 = R$id.ivVideoSubtitleTag;
        if (1 == assetList.getMoreSubtitle() && AbstractC5868k.m23669a(assetList.getType(), "1")) {
            z11 = true;
        }
        m28867f2.m28867f(i11, z11);
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.m2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                C5213p2.m21042t(C5213p2.this, c7531f, view, z12);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: kd.n2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                boolean m21043u;
                m21043u = C5213p2.m21043u(C5213p2.this, c7531f, view, i12, keyEvent);
                return m21043u;
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5213p2.m21044v(C5213p2.this, assetList, c7531f, view);
            }
        });
    }

    /* renamed from: w */
    public final void m21048w(InterfaceC5156b1 interfaceC5156b1) {
        this.f21322g = interfaceC5156b1;
    }
}
