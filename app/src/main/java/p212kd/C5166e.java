package p212kd;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.module.bean.SeriesSeasonBean;
import com.open.leanback.widget.AbstractC3050a;
import com.request.result.PersonWorksInfo;
import com.request.result.PosterList;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.p089ui.activity.ActorDetailsActivity;
import com.vod.p089ui.activity.VodDetailsActivity;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
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

/* renamed from: kd.e */
/* loaded from: classes3.dex */
public final class C5166e extends AbstractC7527b {

    /* renamed from: e */
    private final SimpleDateFormat f21156e;

    /* renamed from: f */
    private boolean f21157f;

    /* renamed from: g */
    private int f21158g;

    /* renamed from: h */
    private int f21159h;

    /* renamed from: i */
    private String f21160i;

    /* renamed from: j */
    private final C7554b f21161j;

    /* renamed from: k */
    private AbstractC3050a f21162k;

    /* renamed from: l */
    private InterfaceC5664p f21163l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.e$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ PersonWorksInfo f21164a;

        /* renamed from: b */
        final /* synthetic */ C5166e f21165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PersonWorksInfo personWorksInfo, C5166e c5166e) {
            super(1);
            this.f21164a = personWorksInfo;
            this.f21165b = c5166e;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f21164a.getContentId());
            intent.putExtra("extra_type", this.f21164a.getType());
            intent.putExtra("extra_play_type", "1");
            intent.putExtra("extra_restrict", this.f21165b.m20872y());
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29168f());
            intent.putExtra("extra_column_id", this.f21165b.m20870w());
            intent.putExtra("extra_play_entrance", "detail/recommend");
            Intent putExtra = intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f21164a.getContentType(), "1"));
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai… bean.contentType == \"1\")");
            return putExtra;
        }
    }

    public C5166e() {
        super(R$layout.layout_item_actor_works, null, 2, null);
        this.f21156e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        this.f21159h = 5;
        this.f21160i = "";
        this.f21161j = new C7554b();
    }

    /* renamed from: B */
    private final void m20860B(TextView textView, PersonWorksInfo personWorksInfo) {
        boolean z10 = true;
        if (personWorksInfo.getScore() > 0.0f && personWorksInfo.getScore() < 10.0f) {
            textView.setVisibility(0);
            C5881x c5881x = C5881x.f23415a;
            String string = m28850h().getString(R$string.program_score);
            AbstractC5868k.m23673e(string, "mContext.getString(R.string.program_score)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(((int) personWorksInfo.getScore()) % 10), Integer.valueOf(((int) (personWorksInfo.getScore() * 10)) % 10)}, 2));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(Html.fromHtml(format));
            return;
        }
        if (personWorksInfo.getScore() != 10.0f) {
            z10 = false;
        }
        if (z10) {
            textView.setText(String.valueOf(personWorksInfo.getScore()));
        } else {
            textView.setVisibility(8);
        }
    }

    /* renamed from: C */
    private final void m20861C(TextView textView, PersonWorksInfo personWorksInfo) {
        if (AbstractC5868k.m23669a(personWorksInfo.getType(), MessageService.MSG_DB_READY_REPORT)) {
            textView.setVisibility(0);
            textView.setGravity(81);
            if (personWorksInfo.getUpdateCount() != personWorksInfo.getVolumnCount()) {
                if (AbstractC6567a.m25637g(this.f21160i)) {
                    C5881x c5881x = C5881x.f23415a;
                    String string = m28850h().getString(R$string.program_update_to);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.program_update_to)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.f21160i, Integer.valueOf(personWorksInfo.getUpdateCount())}, 2));
                    AbstractC5868k.m23673e(format, "format(format, *args)");
                    textView.setText(format);
                    return;
                }
                C5881x c5881x2 = C5881x.f23415a;
                String string2 = m28850h().getString(R$string.detail_temp_set);
                AbstractC5868k.m23673e(string2, "mContext.getString(R.string.detail_temp_set)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(personWorksInfo.getUpdateCount())}, 1));
                AbstractC5868k.m23673e(format2, "format(format, *args)");
                textView.setText(format2);
                return;
            }
            if (AbstractC6567a.m25637g(this.f21160i)) {
                C5881x c5881x3 = C5881x.f23415a;
                String string3 = m28850h().getString(R$string.detail_season_over);
                AbstractC5868k.m23673e(string3, "mContext.getString(R.string.detail_season_over)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[]{this.f21160i}, 1));
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
    /* renamed from: t */
    public static final void m20865t(C5166e c5166e, PersonWorksInfo personWorksInfo, View view) {
        AbstractC5868k.m23674f(c5166e, "this$0");
        AbstractC5868k.m23674f(personWorksInfo, "$bean");
        C7619y.m29367d(C7619y.f28056a, c5166e.m28850h(), VodDetailsActivity.class, null, new a(personWorksInfo, c5166e), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m20866u(C5166e c5166e, View view, boolean z10) {
        AbstractC5868k.m23674f(c5166e, "this$0");
        view.setSelected(z10);
        if (z10) {
            C7554b c7554b = c5166e.f21161j;
            AbstractC5868k.m23673e(view, "view");
            C7554b.m28939e(c7554b, view, 0.0f, 2, null);
        } else {
            C7554b c7554b2 = c5166e.f21161j;
            AbstractC5868k.m23673e(view, "view");
            C7554b.m28940h(c7554b2, view, 0.0f, 2, null);
        }
        InterfaceC5664p interfaceC5664p = c5166e.f21163l;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(view, Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final boolean m20867v(C7531f c7531f, C5166e c5166e, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c5166e, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 22) {
            int adapterPosition = c7531f.getAdapterPosition();
            int i11 = c5166e.f21159h;
            if (adapterPosition % i11 == i11 - 1 && c7531f.getAdapterPosition() + 1 < c5166e.getItemCount()) {
                AbstractC3050a abstractC3050a = c5166e.f21162k;
                if (abstractC3050a != null) {
                    abstractC3050a.setSelectedPositionSmooth(c7531f.getAdapterPosition() + 1);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: A */
    public final void m20868A(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f21163l = interfaceC5664p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21162k = (AbstractC3050a) recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final PersonWorksInfo personWorksInfo) {
        int i10 = 0;
        int i11 = 0;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(personWorksInfo, "bean");
        TextView textView = (TextView) c7531f.m28863b(R$id.mTextName);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mImgPoster);
        TextView textView2 = (TextView) c7531f.m28863b(R$id.mTextUpdate);
        TextView textView3 = (TextView) c7531f.m28863b(R$id.mTextScore);
        ImageView imageView2 = (ImageView) c7531f.m28863b(R$id.mImgTsTag);
        ImageView imageView3 = (ImageView) c7531f.m28863b(R$id.mImg4kTag);
        ImageView imageView4 = (ImageView) c7531f.m28863b(R$id.mImgSubtitleTag);
        String m20660c = AbstractC5091h.m20660c(personWorksInfo.getName(), personWorksInfo.getAlias());
        if (AbstractC6567a.m25637g(m20660c)) {
            AbstractC4509b.m18869b("ActorWorksAdapter", "name:" + m20660c, new Object[0]);
            C7607s1 c7607s1 = new C7607s1();
            AbstractC5868k.m23673e(m20660c, "textName");
            SeriesSeasonBean m29251a = c7607s1.m29251a(m20660c);
            AbstractC4509b.m18869b("ActorWorksAdapter", "seriesSeason:" + m29251a, new Object[0]);
            String name = m29251a.getName();
            this.f21160i = m29251a.getSeason();
            textView.setText(name);
        }
        Drawable m27111a = AbstractC7026c.m27111a(m28850h(), R$drawable.bg_placehoder);
        C7594o0 c7594o0 = C7594o0.f27942a;
        List<PosterList> posterList = personWorksInfo.getPosterList();
        C7594o0.a aVar = C7594o0.a.Icon;
        Context m28850h = m28850h();
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29206q(c7594o0, posterList, aVar, imageView, m28850h, m27111a, 0, 32, null);
        int i12 = 8;
        if (AbstractC5868k.m23669a(personWorksInfo.getContentType(), "1")) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        if (AbstractC5868k.m23669a(personWorksInfo.getContentType(), "3") && C4842a.f20329a.m19920a().m19932I()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView3.setVisibility(i11);
        if (personWorksInfo.getMoreSubtitle() == 1 && AbstractC5868k.m23669a(personWorksInfo.getType(), "1")) {
            i12 = 0;
        }
        imageView4.setVisibility(i12);
        m20861C(textView2, personWorksInfo);
        m20860B(textView3, personWorksInfo);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5166e.m20865t(C5166e.this, personWorksInfo, view);
            }
        });
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5166e.m20866u(C5166e.this, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: kd.d
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
                boolean m20867v;
                m20867v = C5166e.m20867v(C7531f.this, this, view, i13, keyEvent);
                return m20867v;
            }
        });
        if (c7531f.getAdapterPosition() < this.f21159h) {
            Context m28850h2 = m28850h();
            AbstractC5868k.m23672d(m28850h2, "null cannot be cast to non-null type com.vod.ui.activity.ActorDetailsActivity");
            String mo16131L1 = ((ActorDetailsActivity) m28850h2).mo16131L1();
            if (AbstractC5868k.m23669a(mo16131L1, "1")) {
                c7531f.itemView.setNextFocusUpId(R$id.mButtonMovie);
            } else if (AbstractC5868k.m23669a(mo16131L1, MessageService.MSG_DB_READY_REPORT)) {
                c7531f.itemView.setNextFocusUpId(R$id.mButtonSeries);
            }
        }
    }

    /* renamed from: w */
    public final int m20870w() {
        return this.f21158g;
    }

    /* renamed from: x */
    public final int m20871x() {
        return this.f21159h;
    }

    /* renamed from: y */
    public final boolean m20872y() {
        return this.f21157f;
    }

    /* renamed from: z */
    public final void m20873z(int i10) {
        this.f21159h = i10;
    }
}
