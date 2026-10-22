package p212kd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.bean.SeriesSeasonBean;
import com.request.result.AssetList;
import com.request.result.PosterList;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.p089ui.activity.VodDetailsActivity;
import java.util.Arrays;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p153h2.AbstractC4509b;
import p170i2.C4842a;
import p201k2.AbstractC5091h;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7607s1;
import p400xa.C7619y;

/* renamed from: kd.x2 */
/* loaded from: classes3.dex */
public final class C5245x2 extends AbstractC7527b {

    /* renamed from: e */
    private InterfaceC5642a f21409e;

    /* renamed from: f */
    private boolean f21410f;

    /* renamed from: g */
    private int f21411g;

    /* renamed from: h */
    private String f21412h;

    /* renamed from: i */
    private final C7554b f21413i;

    /* renamed from: j */
    private InterfaceC5664p f21414j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.x2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f21415a;

        /* renamed from: b */
        final /* synthetic */ C5245x2 f21416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AssetList assetList, C5245x2 c5245x2) {
            super(1);
            this.f21415a = assetList;
            this.f21416b = c5245x2;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f21415a.getContentId());
            intent.putExtra("extra_type", this.f21415a.getType());
            intent.putExtra("extra_play_type", "1");
            intent.putExtra("extra_restrict", this.f21416b.m21131v());
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29168f());
            intent.putExtra("extra_column_id", this.f21416b.m21130u());
            intent.putExtra("extra_play_entrance", "detail/recommend");
            Intent putExtra = intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f21415a.getContentType(), "1"));
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai… bean.contentType == \"1\")");
            return putExtra;
        }
    }

    public C5245x2(InterfaceC5642a interfaceC5642a) {
        super(R$layout.layout_item_vod_similar, null, 2, null);
        this.f21409e = interfaceC5642a;
        this.f21412h = "";
        this.f21413i = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m21125s(C5245x2 c5245x2, AssetList assetList, View view) {
        AbstractC5868k.m23674f(c5245x2, "this$0");
        AbstractC5868k.m23674f(assetList, "$bean");
        InterfaceC5642a interfaceC5642a = c5245x2.f21409e;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
        C7619y.m29367d(C7619y.f28056a, c5245x2.m28850h(), VodDetailsActivity.class, null, new a(assetList, c5245x2), 2, null);
        Context m28850h = c5245x2.m28850h();
        AbstractC5868k.m23672d(m28850h, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) m28850h).finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m21126t(C5245x2 c5245x2, View view, boolean z10) {
        AbstractC5868k.m23674f(c5245x2, "this$0");
        view.setSelected(z10);
        if (z10) {
            C7554b c7554b = c5245x2.f21413i;
            AbstractC5868k.m23673e(view, "view");
            C7554b.m28939e(c7554b, view, 0.0f, 2, null);
        } else {
            C7554b c7554b2 = c5245x2.f21413i;
            AbstractC5868k.m23673e(view, "view");
            C7554b.m28940h(c7554b2, view, 0.0f, 2, null);
        }
        InterfaceC5664p interfaceC5664p = c5245x2.f21414j;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(view, Boolean.valueOf(z10));
        }
    }

    /* renamed from: y */
    private final void m21127y(TextView textView, AssetList assetList) {
        boolean z10 = true;
        if (assetList.getScore() > 0.0f && assetList.getScore() < 10.0f) {
            textView.setVisibility(0);
            C5881x c5881x = C5881x.f23415a;
            String string = m28850h().getString(R$string.program_score);
            AbstractC5868k.m23673e(string, "mContext.getString(R.string.program_score)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(((int) assetList.getScore()) % 10), Integer.valueOf(((int) (assetList.getScore() * 10)) % 10)}, 2));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(Html.fromHtml(format));
            return;
        }
        if (assetList.getScore() != 10.0f) {
            z10 = false;
        }
        if (z10) {
            textView.setText(String.valueOf(assetList.getScore()));
        } else {
            textView.setVisibility(8);
        }
    }

    /* renamed from: z */
    private final void m21128z(TextView textView, AssetList assetList) {
        if (AbstractC5868k.m23669a(assetList.getType(), MessageService.MSG_DB_READY_REPORT)) {
            textView.setVisibility(0);
            textView.setGravity(81);
            if (assetList.getUpdateCount() != assetList.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f21412h)) {
                    C5881x c5881x = C5881x.f23415a;
                    String string = m28850h().getString(R$string.program_update_to);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.program_update_to)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f21412h, Integer.valueOf(assetList.getUpdateCount())}, 2));
                    AbstractC5868k.m23673e(format, "format(format, *args)");
                    textView.setText(format);
                    return;
                }
                C5881x c5881x2 = C5881x.f23415a;
                String string2 = m28850h().getString(R$string.detail_temp_set);
                AbstractC5868k.m23673e(string2, "mContext.getString(R.string.detail_temp_set)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(assetList.getUpdateCount())}, 1));
                AbstractC5868k.m23673e(format2, "format(format, *args)");
                textView.setText(format2);
                return;
            }
            if (AbstractC6567a.m25637g(this.f21412h)) {
                C5881x c5881x3 = C5881x.f23415a;
                String string3 = m28850h().getString(R$string.detail_season_over);
                AbstractC5868k.m23673e(string3, "mContext.getString(R.string.detail_season_over)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[]{this.f21412h}, 1));
                AbstractC5868k.m23673e(format3, "format(format, *args)");
                textView.setText(format3);
                return;
            }
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, final AssetList assetList) {
        int i10;
        int i11;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(assetList, "bean");
        TextView textView = (TextView) c7531f.m28863b(R$id.mTextName);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mImgPoster);
        TextView textView2 = (TextView) c7531f.m28863b(R$id.mTextUpdate);
        TextView textView3 = (TextView) c7531f.m28863b(R$id.mTextScore);
        ImageView imageView2 = (ImageView) c7531f.m28863b(R$id.mImgTsTag);
        ImageView imageView3 = (ImageView) c7531f.m28863b(R$id.mImg4kTag);
        ImageView imageView4 = (ImageView) c7531f.m28863b(R$id.mImgSubtitleTag);
        String m20660c = AbstractC5091h.m20660c(assetList.getName(), assetList.getAlias());
        if (AbstractC6567a.m25637g(m20660c)) {
            AbstractC4509b.m18869b("VodSimilarAdapter", "name:" + m20660c, new Object[0]);
            C7607s1 c7607s1 = new C7607s1();
            AbstractC5868k.m23673e(m20660c, "textName");
            SeriesSeasonBean m29251a = c7607s1.m29251a(m20660c);
            String name = m29251a.getName();
            this.f21412h = m29251a.getSeason();
            textView.setText(name);
        }
        Drawable m27111a = AbstractC7026c.m27111a(m28850h(), R$drawable.bg_placehoder);
        C7594o0 c7594o0 = C7594o0.f27942a;
        List<PosterList> posterList = assetList.getPosterList();
        C7594o0.a aVar = C7594o0.a.Icon;
        Context m28850h = m28850h();
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29206q(c7594o0, posterList, aVar, imageView, m28850h, m27111a, 0, 32, null);
        int i12 = 8;
        if (AbstractC5868k.m23669a(assetList.getContentType(), "1")) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        if (AbstractC5868k.m23669a(assetList.getContentType(), "3") && C4842a.f20329a.m19920a().m19932I()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView3.setVisibility(i11);
        if (assetList.getMoreSubtitle() == 1 && AbstractC5868k.m23669a(assetList.getType(), "1")) {
            i12 = 0;
        }
        imageView4.setVisibility(i12);
        m21128z(textView2, assetList);
        m21127y(textView3, assetList);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.v2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5245x2.m21125s(C5245x2.this, assetList, view);
            }
        });
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.w2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5245x2.m21126t(C5245x2.this, view, z10);
            }
        });
    }

    /* renamed from: u */
    public final int m21130u() {
        return this.f21411g;
    }

    /* renamed from: v */
    public final boolean m21131v() {
        return this.f21410f;
    }

    /* renamed from: w */
    public final void m21132w(int i10) {
        this.f21411g = i10;
    }

    /* renamed from: x */
    public final void m21133x(boolean z10) {
        this.f21410f = z10;
    }
}
