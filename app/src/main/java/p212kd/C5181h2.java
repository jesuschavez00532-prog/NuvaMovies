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
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
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
import p201k2.AbstractC5085b;
import p201k2.AbstractC5091h;
import p317rb.AbstractC6567a;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7607s1;
import p400xa.C7619y;

/* renamed from: kd.h2 */
/* loaded from: classes3.dex */
public final class C5181h2 extends AbstractC7527b {

    /* renamed from: e */
    private AbstractC3050a f21203e;

    /* renamed from: f */
    private final InterfaceC1312h f21204f;

    /* renamed from: g */
    private String f21205g;

    /* renamed from: h */
    private String f21206h;

    /* renamed from: i */
    private int f21207i;

    /* renamed from: j */
    private String f21208j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.h2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f21209a;

        /* renamed from: b */
        final /* synthetic */ C5181h2 f21210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AssetList assetList, C5181h2 c5181h2) {
            super(1);
            this.f21209a = assetList;
            this.f21210b = c5181h2;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f21209a.getContentId());
            intent.putExtra("extra_type", this.f21209a.getType());
            intent.putExtra("extra_column_id", this.f21210b.f21207i);
            intent.putExtra("extra_play_type", MessageService.MSG_DB_READY_REPORT);
            intent.putExtra("extra_free", false);
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29164b());
            intent.putExtra("extra_umeng_event_category", this.f21210b.m20923z());
            intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f21209a.getContentType(), "1"));
            intent.putExtra("extra_play_entrance", this.f21210b.f21206h);
            Intent putExtra = intent.putExtra("extra_restrict", false);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…ity.EXTRA_RESTRICT,false)");
            return putExtra;
        }
    }

    /* renamed from: kd.h2$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f21211a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7554b invoke() {
            return new C7554b();
        }
    }

    public C5181h2() {
        super(R$layout.layout_item_vod_kids_programs, null, 2, null);
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(b.f21211a);
        this.f21204f = m5965b;
        this.f21205g = "";
        this.f21206h = "";
        this.f21208j = "";
    }

    /* renamed from: B */
    private final void m20910B(TextView textView, AssetList assetList) {
        if (AbstractC5868k.m23669a(assetList.getType(), MessageService.MSG_DB_READY_REPORT)) {
            textView.setVisibility(0);
            textView.setGravity(81);
            if (assetList.getUpdateCount() != assetList.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f21208j)) {
                    C5881x c5881x = C5881x.f23415a;
                    String string = m28850h().getString(R$string.program_update_to);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.program_update_to)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f21208j, Integer.valueOf(assetList.getUpdateCount())}, 2));
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
            if (AbstractC6567a.m25637g(this.f21208j)) {
                C5881x c5881x3 = C5881x.f23415a;
                String string3 = m28850h().getString(R$string.detail_season_over);
                AbstractC5868k.m23673e(string3, "mContext.getString(R.string.detail_season_over)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[]{this.f21208j}, 1));
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
    public static final void m20916v(C5181h2 c5181h2, AssetList assetList, View view) {
        AbstractC5868k.m23674f(c5181h2, "this$0");
        AbstractC5868k.m23674f(assetList, "$bean");
        C7619y.m29367d(C7619y.f28056a, c5181h2.m28850h(), VodDetailsActivity.class, null, new a(assetList, c5181h2), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m20917w(C5181h2 c5181h2, TextView textView, TextView textView2, AssetList assetList, View view, boolean z10) {
        AbstractC5868k.m23674f(c5181h2, "this$0");
        AbstractC5868k.m23674f(textView, "$mTextName");
        AbstractC5868k.m23674f(textView2, "$mTextUpdate");
        AbstractC5868k.m23674f(assetList, "$bean");
        view.setSelected(z10);
        if (z10) {
            C7554b m20919y = c5181h2.m20919y();
            AbstractC5868k.m23673e(view, "view");
            C7554b.m28939e(m20919y, view, 0.0f, 2, null);
            textView.setVisibility(0);
            textView2.setVisibility(8);
            return;
        }
        C7554b m20919y2 = c5181h2.m20919y();
        AbstractC5868k.m23673e(view, "view");
        C7554b.m28940h(m20919y2, view, 0.0f, 2, null);
        textView.setVisibility(8);
        if (AbstractC5868k.m23669a(assetList.getType(), MessageService.MSG_DB_READY_REPORT)) {
            textView2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m20918x(C7531f c7531f, C5181h2 c5181h2, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c5181h2, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 22 && c7531f.getAdapterPosition() % 4 == 3 && c7531f.getAdapterPosition() + 1 < c5181h2.getItemCount()) {
            AbstractC3050a abstractC3050a = c5181h2.f21203e;
            if (abstractC3050a != null) {
                abstractC3050a.setSelectedPositionSmooth(c7531f.getAdapterPosition() + 1);
            }
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private final C7554b m20919y() {
        return (C7554b) this.f21204f.getValue();
    }

    /* renamed from: A */
    public final void m20920A(String str, int i10) {
        AbstractC5868k.m23674f(str, "playEntrance");
        this.f21206h = str;
        this.f21207i = i10;
    }

    /* renamed from: C */
    public final void m20921C(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21205g = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21203e = (AbstractC3050a) recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final AssetList assetList) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(assetList, "bean");
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mImgPoster);
        ImageView imageView2 = (ImageView) c7531f.m28863b(R$id.mImg4kTag);
        final TextView textView = (TextView) c7531f.m28863b(R$id.mTextName);
        final TextView textView2 = (TextView) c7531f.m28863b(R$id.mTextUpdate);
        String m20660c = AbstractC5091h.m20660c(assetList.getName(), assetList.getAlias());
        int i10 = 0;
        if (AbstractC6567a.m25637g(m20660c)) {
            AbstractC4509b.m18869b("VodKidsProgramsAdapter", "name:" + m20660c, new Object[0]);
            C7607s1 c7607s1 = new C7607s1();
            AbstractC5868k.m23673e(m20660c, "textName");
            SeriesSeasonBean m29251a = c7607s1.m29251a(m20660c);
            AbstractC4509b.m18869b("VodKidsProgramsAdapter", "seriesSeason:" + m29251a, new Object[0]);
            String name = m29251a.getName();
            this.f21208j = m29251a.getSeason();
            textView.setText(name);
        }
        if (!AbstractC5868k.m23669a(assetList.getContentType(), "3") || !C4842a.f20329a.m19920a().m19932I()) {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        m20910B(textView2, assetList);
        C7594o0.m29189D(C7594o0.f27942a, m28850h(), assetList.getPosterList(), C7594o0.a.Icon, imageView, Integer.valueOf(R$mipmap.bg_kids_placehoder), Integer.valueOf(AbstractC5085b.m20592b(m28850h(), 15.0f)), null, 0, 192, null);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5181h2.m20916v(C5181h2.this, assetList, view);
            }
        });
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.f2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5181h2.m20917w(C5181h2.this, textView, textView2, assetList, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: kd.g2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m20918x;
                m20918x = C5181h2.m20918x(C7531f.this, this, view, i11, keyEvent);
                return m20918x;
            }
        });
    }

    /* renamed from: z */
    public final String m20923z() {
        return this.f21205g;
    }
}
