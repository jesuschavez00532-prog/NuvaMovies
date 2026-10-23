package p212kd;

import android.content.Intent;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.module.bean.SeriesSeasonBean;
import com.open.leanback.widget.AbstractC3050a;
import com.request.result.AssetList;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.p089ui.activity.VodDetailsActivity;
import java.util.Arrays;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p153h2.AbstractC4509b;
import p170i2.C4842a;
import p201k2.AbstractC5091h;
import p317rb.AbstractC6567a;
import p399x9.AbstractC7528c;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7607s1;
import p400xa.C7619y;

/* renamed from: kd.m0 */
/* loaded from: classes3.dex */
public final class C5199m0 extends AbstractC7528c {

    /* renamed from: e */
    private String f21272e;

    /* renamed from: f */
    private int f21273f;

    /* renamed from: g */
    private String f21274g;

    /* renamed from: h */
    private boolean f21275h;

    /* renamed from: i */
    private boolean f21276i;

    /* renamed from: j */
    private int f21277j;

    /* renamed from: k */
    private String f21278k;

    /* renamed from: l */
    private AbstractC3050a f21279l;

    /* renamed from: m */
    private final InterfaceC1312h f21280m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.m0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f21281a;

        /* renamed from: b */
        final /* synthetic */ C5199m0 f21282b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AssetList assetList, C5199m0 c5199m0) {
            super(1);
            this.f21281a = assetList;
            this.f21282b = c5199m0;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f21281a.getContentId());
            intent.putExtra("extra_type", this.f21281a.getType());
            intent.putExtra("extra_column_id", this.f21282b.f21273f);
            intent.putExtra("extra_play_type", MessageService.MSG_DB_READY_REPORT);
            intent.putExtra("extra_free", this.f21282b.m20997A());
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29164b());
            intent.putExtra("extra_umeng_event_category", this.f21282b.m21002z());
            intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f21281a.getContentType(), "1"));
            intent.putExtra("extra_play_entrance", this.f21282b.f21272e);
            Intent putExtra = intent.putExtra("extra_restrict", this.f21282b.m20998B());
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…XTRA_RESTRICT,isRestrict)");
            return putExtra;
        }
    }

    /* renamed from: kd.m0$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f21283a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7554b invoke() {
            return new C7554b();
        }
    }

    public C5199m0() {
        super(R$layout.layout_item_filter, null, 2, null);
        InterfaceC1312h m5965b;
        this.f21272e = "";
        this.f21274g = "";
        this.f21278k = "";
        m5965b = AbstractC1314j.m5965b(b.f21283a);
        this.f21280m = m5965b;
    }

    /* renamed from: E */
    private final void m20986E(TextView textView, AssetList assetList) {
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

    /* renamed from: F */
    private final void m20987F(TextView textView, AssetList assetList) {
        AbstractC4509b.m18869b("FilterAdapter", "bean:" + assetList, new Object[0]);
        if (AbstractC5868k.m23669a(assetList.getType(), MessageService.MSG_DB_READY_REPORT)) {
            textView.setVisibility(0);
            textView.setGravity(81);
            if (assetList.getUpdateCount() != assetList.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f21278k)) {
                    C5881x c5881x = C5881x.f23415a;
                    String string = m28850h().getString(R$string.program_update_to);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.program_update_to)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f21278k, Integer.valueOf(assetList.getUpdateCount())}, 2));
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
            if (AbstractC6567a.m25637g(this.f21278k)) {
                C5881x c5881x3 = C5881x.f23415a;
                String string3 = m28850h().getString(R$string.detail_season_over);
                AbstractC5868k.m23673e(string3, "mContext.getString(R.string.detail_season_over)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[]{this.f21278k}, 1));
                AbstractC5868k.m23673e(format3, "format(format, *args)");
                textView.setText(format3);
                return;
            }
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m20993v(C5199m0 c5199m0, AssetList assetList, View view) {
        AbstractC5868k.m23674f(c5199m0, "this$0");
        AbstractC5868k.m23674f(assetList, "$bean");
        C7619y.m29367d(C7619y.f28056a, c5199m0.m28850h(), VodDetailsActivity.class, null, new a(assetList, c5199m0), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m20994w(C5199m0 c5199m0, View view, boolean z10) {
        AbstractC5868k.m23674f(c5199m0, "this$0");
        view.setSelected(z10);
        if (z10) {
            C7554b m20996y = c5199m0.m20996y();
            AbstractC5868k.m23673e(view, "view");
            m20996y.m28943c(view, 1.1f);
        } else {
            C7554b m20996y2 = c5199m0.m20996y();
            AbstractC5868k.m23673e(view, "view");
            m20996y2.m28945f(view, 1.1f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m20995x(C7531f c7531f, C5199m0 c5199m0, View view, int i10, KeyEvent keyEvent) {
        int i11 = 0;
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c5199m0, "this$0");
        int i12 = 6;
        if (keyEvent.getAction() == 0 && i10 == 21) {
            if (c7531f.getAdapterPosition() != 0 && c7531f.getAdapterPosition() % 6 == 0) {
                AbstractC3050a abstractC3050a = c5199m0.f21279l;
                if (abstractC3050a != null) {
                    abstractC3050a.setSelectedPositionSmooth(c7531f.getAdapterPosition() - 1);
                }
                return true;
            }
            return false;
        }
        if (keyEvent.getAction() == 0 && i10 == 22) {
            if (c7531f.getAdapterPosition() + 1 == c5199m0.getItemCount()) {
                C7554b m20996y = c5199m0.m20996y();
                AbstractC5868k.m23673e(view, "v");
                m20996y.m28941a(view).start();
                return true;
            }
            if (c7531f.getAdapterPosition() % 6 == 5 && c7531f.getAdapterPosition() + 1 < c5199m0.getItemCount()) {
                AbstractC3050a abstractC3050a2 = c5199m0.f21279l;
                if (abstractC3050a2 != null) {
                    abstractC3050a2.setSelectedPositionSmooth(c7531f.getAdapterPosition() + 1);
                }
                return true;
            }
            return false;
        }
        if (keyEvent.getAction() == 0 && i10 == 20 && (i11 = c5199m0.f21277j) > 0) {
            int i13 = i11 % 6;
            if (i13 != 0) {
                i12 = i13;
            }
            if (c7531f.getAdapterPosition() >= i11 - i12) {
                C7554b c7554b = new C7554b();
                AbstractC5868k.m23673e(view, "v");
                c7554b.m28942b(view).start();
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: y */
    private final C7554b m20996y() {
        return (C7554b) this.f21280m.getValue();
    }

    /* renamed from: A */
    public final boolean m20997A() {
        return this.f21275h;
    }

    /* renamed from: B */
    public final boolean m20998B() {
        return this.f21276i;
    }

    /* renamed from: C */
    public final void m20999C(String str, int i10) {
        AbstractC5868k.m23674f(str, "playEntrance");
        this.f21272e = str;
        this.f21273f = i10;
    }

    /* renamed from: D */
    public final void m21000D(int i10) {
        this.f21277j = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21279l = (AbstractC3050a) recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final AssetList assetList) {
        int i10 = 0;
        int i11 = 0;
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
            AbstractC4509b.m18869b("FilterAdapter", "name:" + m20660c, new Object[0]);
            C7607s1 c7607s1 = new C7607s1();
            AbstractC5868k.m23673e(m20660c, "textName");
            SeriesSeasonBean m29251a = c7607s1.m29251a(m20660c);
            AbstractC4509b.m18869b("VodProgramsAdapter", "seriesSeason:" + m29251a, new Object[0]);
            String name = m29251a.getName();
            this.f21278k = m29251a.getSeason();
            textView.setText(name);
        }
        C7594o0.m29205p(C7594o0.f27942a, assetList.getPosterList(), C7594o0.a.Icon, imageView, m28850h(), R$drawable.bg_placehoder, 0, 32, null);
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
        m20987F(textView2, assetList);
        m20986E(textView3, assetList);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5199m0.m20993v(C5199m0.this, assetList, view);
            }
        });
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.k0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5199m0.m20994w(C5199m0.this, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: kd.l0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
                boolean m20995x;
                m20995x = C5199m0.m20995x(C7531f.this, this, view, i13, keyEvent);
                return m20995x;
            }
        });
    }

    /* renamed from: z */
    public final String m21002z() {
        return this.f21274g;
    }
}
