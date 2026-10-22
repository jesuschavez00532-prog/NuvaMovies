package p212kd;

import android.content.Intent;
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
import p317rb.AbstractC6567a;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7607s1;
import p400xa.C7619y;

/* renamed from: kd.l2 */
/* loaded from: classes3.dex */
public final class C5197l2 extends AbstractC7527b {

    /* renamed from: e */
    private String f21259e;

    /* renamed from: f */
    private int f21260f;

    /* renamed from: g */
    private String f21261g;

    /* renamed from: h */
    private boolean f21262h;

    /* renamed from: i */
    private boolean f21263i;

    /* renamed from: j */
    private int f21264j;

    /* renamed from: k */
    private String f21265k;

    /* renamed from: l */
    private AbstractC3050a f21266l;

    /* renamed from: m */
    private final InterfaceC1312h f21267m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.l2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f21268a;

        /* renamed from: b */
        final /* synthetic */ C5197l2 f21269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AssetList assetList, C5197l2 c5197l2) {
            super(1);
            this.f21268a = assetList;
            this.f21269b = c5197l2;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f21268a.getContentId());
            intent.putExtra("extra_type", this.f21268a.getType());
            intent.putExtra("extra_column_id", this.f21269b.f21260f);
            intent.putExtra("extra_play_type", MessageService.MSG_DB_READY_REPORT);
            intent.putExtra("extra_free", this.f21269b.m20975A());
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29164b());
            intent.putExtra("extra_umeng_event_category", this.f21269b.m20983z());
            intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f21268a.getContentType(), "1"));
            intent.putExtra("extra_play_entrance", this.f21269b.f21259e);
            Intent putExtra = intent.putExtra("extra_restrict", this.f21269b.m20976B());
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…XTRA_RESTRICT,isRestrict)");
            return putExtra;
        }
    }

    /* renamed from: kd.l2$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f21270a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7554b invoke() {
            return new C7554b();
        }
    }

    public C5197l2() {
        super(R$layout.layout_item_vod_programs, null, 2, null);
        InterfaceC1312h m5965b;
        this.f21259e = "";
        this.f21261g = "";
        this.f21265k = "";
        m5965b = AbstractC1314j.m5965b(b.f21270a);
        this.f21267m = m5965b;
    }

    /* renamed from: G */
    private final void m20964G(TextView textView, AssetList assetList) {
        boolean z10 = false;
        if (assetList.getScore() > 0.0f && assetList.getScore() < 10.0f) {
            textView.setVisibility(0);
            textView.setText(assetList.getMScoreStr());
            return;
        }
        if (assetList.getScore() == 10.0f) {
            z10 = true;
        }
        if (z10) {
            textView.setText(String.valueOf(assetList.getScore()));
        } else {
            textView.setVisibility(8);
        }
    }

    /* renamed from: H */
    private final void m20965H(TextView textView, AssetList assetList) {
        AbstractC4509b.m18869b("VodProgramsAdapter", "bean:" + assetList, new Object[0]);
        if (AbstractC5868k.m23669a(assetList.getType(), MessageService.MSG_DB_READY_REPORT)) {
            textView.setVisibility(0);
            textView.setGravity(81);
            if (assetList.getUpdateCount() != assetList.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f21265k)) {
                    C5881x c5881x = C5881x.f23415a;
                    String string = m28850h().getString(R$string.program_update_to);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.program_update_to)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f21265k, Integer.valueOf(assetList.getUpdateCount())}, 2));
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
            if (AbstractC6567a.m25637g(this.f21265k)) {
                C5881x c5881x3 = C5881x.f23415a;
                String string3 = m28850h().getString(R$string.detail_season_over);
                AbstractC5868k.m23673e(string3, "mContext.getString(R.string.detail_season_over)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[]{this.f21265k}, 1));
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
    public static final void m20971v(C5197l2 c5197l2, AssetList assetList, View view) {
        AbstractC5868k.m23674f(c5197l2, "this$0");
        AbstractC5868k.m23674f(assetList, "$bean");
        C7619y.m29367d(C7619y.f28056a, c5197l2.m28850h(), VodDetailsActivity.class, null, new a(assetList, c5197l2), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m20972w(C5197l2 c5197l2, View view, boolean z10) {
        AbstractC5868k.m23674f(c5197l2, "this$0");
        view.setSelected(z10);
        if (z10) {
            C7554b m20974y = c5197l2.m20974y();
            AbstractC5868k.m23673e(view, "view");
            m20974y.m28943c(view, 1.05f);
        } else {
            C7554b m20974y2 = c5197l2.m20974y();
            AbstractC5868k.m23673e(view, "view");
            m20974y2.m28945f(view, 1.05f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m20973x(C7531f c7531f, C5197l2 c5197l2, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c5197l2, "this$0");
        int i11 = 6;
        if (keyEvent.getAction() == 0 && i10 == 22) {
            if (c7531f.getAdapterPosition() + 1 == c5197l2.getItemCount()) {
                C7554b m20974y = c5197l2.m20974y();
                AbstractC5868k.m23673e(view, "v");
                m20974y.m28941a(view).start();
                return true;
            }
            if (c7531f.getAdapterPosition() % 6 == 5 && c7531f.getAdapterPosition() + 1 < c5197l2.getItemCount()) {
                AbstractC3050a abstractC3050a = c5197l2.f21266l;
                if (abstractC3050a != null) {
                    abstractC3050a.setSelectedPositionSmooth(c7531f.getAdapterPosition() + 1);
                }
                return true;
            }
            return false;
        }
        if (keyEvent.getAction() == 0 && i10 == 20) {
            if (c7531f.getAdapterPosition() + 1 == c5197l2.getItemCount()) {
                C7554b m20974y2 = c5197l2.m20974y();
                AbstractC5868k.m23673e(view, "v");
                m20974y2.m28942b(view).start();
                return true;
            }
            int i12 = c5197l2.f21264j;
            if (i12 > 0) {
                int i13 = i12 % 6;
                if (i13 != 0) {
                    i11 = i13;
                }
                if (c7531f.getAdapterPosition() >= i12 - i11) {
                    C7554b c7554b = new C7554b();
                    AbstractC5868k.m23673e(view, "v");
                    c7554b.m28942b(view).start();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: y */
    private final C7554b m20974y() {
        return (C7554b) this.f21267m.getValue();
    }

    /* renamed from: A */
    public final boolean m20975A() {
        return this.f21262h;
    }

    /* renamed from: B */
    public final boolean m20976B() {
        return this.f21263i;
    }

    /* renamed from: C */
    public final void m20977C(String str, int i10) {
        AbstractC5868k.m23674f(str, "playEntrance");
        this.f21259e = str;
        this.f21260f = i10;
    }

    /* renamed from: D */
    public final void m20978D(boolean z10) {
        this.f21262h = z10;
    }

    /* renamed from: E */
    public final void m20979E(int i10) {
        this.f21264j = i10;
    }

    /* renamed from: F */
    public final void m20980F(boolean z10) {
        this.f21263i = z10;
    }

    /* renamed from: I */
    public final void m20981I(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21261g = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21266l = (AbstractC3050a) recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final AssetList assetList) {
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
        if (AbstractC6567a.m25637g(assetList.getMShowName())) {
            AbstractC4509b.m18869b("VodProgramsAdapter", "name:" + assetList.getMShowName(), new Object[0]);
            C7607s1 c7607s1 = new C7607s1();
            String mShowName = assetList.getMShowName();
            AbstractC5868k.m23671c(mShowName);
            SeriesSeasonBean m29251a = c7607s1.m29251a(mShowName);
            AbstractC4509b.m18869b("VodProgramsAdapter", "seriesSeason:" + m29251a, new Object[0]);
            String name = m29251a.getName();
            this.f21265k = m29251a.getSeason();
            textView.setText(name);
        }
        C7594o0.m29203l(C7594o0.f27942a, assetList.getMIconPosterUrl(), imageView, m28850h(), R$drawable.bg_placehoder, 0, 16, null);
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
        m20965H(textView2, assetList);
        m20964G(textView3, assetList);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5197l2.m20971v(C5197l2.this, assetList, view);
            }
        });
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.j2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5197l2.m20972w(C5197l2.this, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: kd.k2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
                boolean m20973x;
                m20973x = C5197l2.m20973x(C7531f.this, this, view, i13, keyEvent);
                return m20973x;
            }
        });
    }

    /* renamed from: z */
    public final String m20983z() {
        return this.f21261g;
    }
}
