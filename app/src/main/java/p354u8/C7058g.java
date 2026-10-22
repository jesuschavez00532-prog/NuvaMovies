package p354u8;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.main.R$drawable;
import com.main.R$id;
import com.main.R$layout;
import com.main.R$mipmap;
import com.main.R$string;
import com.module.bean.SeriesSeasonBean;
import com.request.result.AssetList;
import com.request.result.PosterList;
import com.vod.p089ui.activity.VodCategoryActivity;
import com.vod.p089ui.activity.VodDetailsActivity;
import java.util.Arrays;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p029b9.C1192c;
import p132fa.C4300d;
import p153h2.AbstractC4509b;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7594o0;
import p400xa.C7607s1;
import p400xa.C7619y;

/* renamed from: u8.g */
/* loaded from: classes2.dex */
public final class C7058g extends AbstractC7527b {

    /* renamed from: e */
    private String f26462e;

    /* renamed from: f */
    private int f26463f;

    /* renamed from: g */
    private int f26464g;

    /* renamed from: h */
    private String f26465h;

    /* renamed from: i */
    private String f26466i;

    /* renamed from: j */
    private String f26467j;

    /* renamed from: k */
    private final C7554b f26468k;

    /* renamed from: l */
    private InterfaceC5660l f26469l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u8.g$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_column_id", C7058g.this.m27194y());
            intent.putExtra("extra_column_code", C7058g.this.m27192w());
            intent.putExtra("extra_category_type", C4300d.f18678a.m18055r());
            intent.putExtra("extra_play_entrance", "");
            Intent putExtra = intent.putExtra("extra_category_selected_alias", C7058g.this.m27190u());
            AbstractC5868k.m23673e(putExtra, "intent .putExtra(VodCate…RY_SELECTED_ALIAS, alias)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u8.g$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ AssetList f26472b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AssetList assetList) {
            super(1);
            this.f26472b = assetList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x004e, code lost:
        
            if (r0 == null) goto L6;
         */
        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.content.Intent mo542f(android.content.Intent r3) {
            /*
                r2 = this;
                java.lang.String r0 = "intent"
                ne.AbstractC5868k.m23674f(r3, r0)
                u8.g r0 = p354u8.C7058g.this
                int r0 = r0.m27193x()
                java.lang.String r1 = "extra_column_id"
                r3.putExtra(r1, r0)
                com.request.result.AssetList r0 = r2.f26472b
                java.lang.String r0 = r0.getContentId()
                java.lang.String r1 = "extra_content_id"
                r3.putExtra(r1, r0)
                java.lang.String r0 = "extra_play_type"
                java.lang.String r1 = "0"
                r3.putExtra(r0, r1)
                com.request.result.AssetList r0 = r2.f26472b
                java.lang.String r0 = r0.getType()
                java.lang.String r1 = "extra_type"
                r3.putExtra(r1, r0)
                java.lang.String r0 = "extra_free"
                r1 = 1
                r3.putExtra(r0, r1)
                xa.m1$c$a r0 = p400xa.C7589m1.c.f27901a
                java.lang.String r0 = r0.m29165c()
                java.lang.String r1 = "extra_umeng_event_key"
                r3.putExtra(r1, r0)
                com.request.result.AssetList r0 = r2.f26472b
                java.lang.String r0 = r0.getProgramType()
                if (r0 == 0) goto L50
                java.lang.CharSequence r0 = p359ue.AbstractC7157k.m27699b0(r0)
                java.lang.String r0 = r0.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = ""
            L52:
                java.lang.String r1 = "extra_umeng_event_category"
                r3.putExtra(r1, r0)
                com.request.result.AssetList r0 = r2.f26472b
                java.lang.String r0 = r0.getContentType()
                java.lang.String r1 = "1"
                boolean r0 = ne.AbstractC5868k.m23669a(r0, r1)
                java.lang.String r1 = "extra_ts"
                r3.putExtra(r1, r0)
                u8.g r0 = p354u8.C7058g.this
                java.lang.String r0 = r0.m27191v()
                java.lang.String r1 = "extra_play_entrance"
                android.content.Intent r3 = r3.putExtra(r1, r0)
                java.lang.String r0 = "intent.putExtra(VodDetai…AY_ENTRANCE, columnAlias)"
                ne.AbstractC5868k.m23673e(r3, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p354u8.C7058g.b.mo542f(android.content.Intent):android.content.Intent");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7058g(String str, int i10) {
        super(R$layout.item_free_area_vod_list, null, 2, null);
        AbstractC5868k.m23674f(str, "columnAlias");
        this.f26462e = str;
        this.f26463f = i10;
        this.f26465h = "";
        this.f26466i = "";
        this.f26467j = "";
        this.f26468k = new C7554b();
    }

    /* renamed from: D */
    private final void m27181D(TextView textView, AssetList assetList) {
        if (AbstractC5868k.m23669a(assetList.getType(), MessageService.MSG_DB_READY_REPORT)) {
            textView.setVisibility(0);
            textView.setGravity(81);
            if (assetList.getUpdateCount() != assetList.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f26467j)) {
                    C5881x c5881x = C5881x.f23415a;
                    String string = m28850h().getString(R$string.program_update_to);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.program_update_to)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f26467j, Integer.valueOf(assetList.getUpdateCount())}, 2));
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
            C5881x c5881x3 = C5881x.f23415a;
            String string3 = m28850h().getString(R$string.detail_season_over);
            AbstractC5868k.m23673e(string3, "mContext.getString(R.string.detail_season_over)");
            String format3 = String.format(string3, Arrays.copyOf(new Object[]{this.f26467j}, 1));
            AbstractC5868k.m23673e(format3, "format(format, *args)");
            textView.setText(format3);
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m27184s(C7531f c7531f, C7058g c7058g, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c7058g, "this$0");
        c7531f.itemView.setSelected(z10);
        if (z10) {
            InterfaceC5660l interfaceC5660l = c7058g.f26469l;
            if (interfaceC5660l != null) {
                AbstractC5868k.m23673e(view, "v");
                interfaceC5660l.mo542f(view);
            }
            C7554b c7554b = c7058g.f26468k;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.1f);
            return;
        }
        C7554b c7554b2 = c7058g.f26468k;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m27185t(C7531f c7531f, C7058g c7058g, AssetList assetList, View view) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c7058g, "this$0");
        AbstractC5868k.m23674f(assetList, "$bean");
        if (c7531f.getAdapterPosition() == C1192c.f4723M0.m5467b() - 1) {
            C7619y.m29367d(C7619y.f28056a, c7058g.m28850h(), VodCategoryActivity.class, null, new a(), 2, null);
        } else {
            C7619y.m29367d(C7619y.f28056a, c7058g.m28850h(), VodDetailsActivity.class, null, new b(assetList), 2, null);
        }
    }

    /* renamed from: A */
    public final void m27186A(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f26465h = str;
    }

    /* renamed from: B */
    public final void m27187B(int i10) {
        this.f26464g = i10;
    }

    /* renamed from: C */
    public final void m27188C(InterfaceC5660l interfaceC5660l) {
        this.f26469l = interfaceC5660l;
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        int itemCount = super.getItemCount();
        C1192c.a aVar = C1192c.f4723M0;
        if (itemCount > aVar.m5467b()) {
            return aVar.m5467b();
        }
        return super.getItemCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final AssetList assetList) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(assetList, "bean");
        if (c7531f.getAdapterPosition() == C1192c.f4723M0.m5467b() - 1) {
            int i10 = R$id.mLayoutMore;
            c7531f.m28867f(i10, true).m28866e(R$id.mVideoNameText, 4).m28866e(R$id.mPosterImg, 4);
            ((View) c7531f.m28863b(i10)).setBackgroundDrawable(AbstractC7026c.m27112b(m28850h(), R$mipmap.bg_vod_more, true));
        } else {
            C7531f m28867f = c7531f.m28867f(R$id.mLayoutMore, false);
            int i11 = R$id.mVideoNameText;
            C7531f m28867f2 = m28867f.m28867f(i11, true);
            int i12 = R$id.mPosterImg;
            m28867f2.m28867f(i12, true);
            String name = assetList.getName();
            if (AbstractC6567a.m25637g(name)) {
                AbstractC4509b.m18869b("FreeVodItemAdapter", "name:" + name, new Object[0]);
                SeriesSeasonBean m29251a = new C7607s1().m29251a(name);
                String name2 = m29251a.getName();
                this.f26467j = m29251a.getSeason();
                c7531f.m28865d(i11, name2);
            }
            m27181D((TextView) c7531f.m28863b(R$id.mVideoStateText), assetList);
            Drawable m27111a = AbstractC7026c.m27111a(m28850h(), R$drawable.bg_placehoder);
            C7594o0 c7594o0 = C7594o0.f27942a;
            List<PosterList> posterList = assetList.getPosterList();
            C7594o0.a aVar = C7594o0.a.Icon;
            ImageView imageView = (ImageView) c7531f.m28863b(i12);
            Context m28850h = m28850h();
            AbstractC5868k.m23673e(m27111a, "placeholder");
            c7594o0.m29224o(posterList, aVar, imageView, m28850h, m27111a, 0);
        }
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: u8.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C7058g.m27184s(C7531f.this, this, view, z10);
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: u8.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7058g.m27185t(C7531f.this, this, assetList, view);
            }
        });
    }

    /* renamed from: u */
    public final String m27190u() {
        return this.f26466i;
    }

    /* renamed from: v */
    public final String m27191v() {
        return this.f26462e;
    }

    /* renamed from: w */
    public final String m27192w() {
        return this.f26465h;
    }

    /* renamed from: x */
    public final int m27193x() {
        return this.f26464g;
    }

    /* renamed from: y */
    public final int m27194y() {
        return this.f26463f;
    }

    /* renamed from: z */
    public final void m27195z(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f26466i = str;
    }
}
