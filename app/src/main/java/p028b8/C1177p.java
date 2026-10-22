package p028b8;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.AbstractC0547a;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1464l0;
import com.live.R$color;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.p064ui.activity.MatchDetailActivity;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.Match;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p011aa.AbstractViewOnClickListenerC0123a;
import p040c8.C1402c0;
import p102db.C4055l1;
import p201k2.AbstractC5086c;
import p237m8.C5608b;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p400xa.C7589m1;

/* renamed from: b8.p */
/* loaded from: classes2.dex */
public final class C1177p extends AbstractC7527b {

    /* renamed from: e */
    private final InterfaceC1312h f4643e;

    /* renamed from: f */
    private final C7554b f4644f;

    /* renamed from: g */
    private View.OnKeyListener f4645g;

    /* renamed from: h */
    private View f4646h;

    /* renamed from: b8.p$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractViewOnClickListenerC0123a {

        /* renamed from: b */
        final /* synthetic */ Match f4647b;

        /* renamed from: c */
        final /* synthetic */ C1177p f4648c;

        a(Match match, C1177p c1177p) {
            this.f4647b = match;
            this.f4648c = c1177p;
        }

        @Override // p011aa.AbstractViewOnClickListenerC0123a
        /* renamed from: c */
        public void mo492c(View view) {
            String m27728o;
            String m6824c = C1464l0.f5622a.m6824c(this.f4647b.getGameTime(), "yyyy-MM-dd HH:mm");
            MatchDetailActivity.C2860a c2860a = MatchDetailActivity.f10864W;
            Context m28850h = this.f4648c.m28850h();
            String gameId = this.f4647b.getGameId();
            String substring = m6824c.substring(0, 10);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            m27728o = AbstractC7166t.m27728o(substring, Operator.Operation.MINUS, "", false, 4, null);
            c2860a.m11527a(m28850h, gameId, m27728o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b8.p$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Match f4649a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Match match) {
            super(1);
            this.f4649a = match;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Match match) {
            AbstractC5868k.m23674f(match, "it");
            if (this.f4649a.isSubscribed()) {
                C1402c0.f5445a.m6464x(this.f4649a);
                this.f4649a.setSubscribed(false);
            } else {
                C1402c0.f5445a.m6463u(this.f4649a);
                Match match2 = this.f4649a;
                match2.setInFifteenMinutes(match2.calcInFifteenMinutes());
                this.f4649a.setSubscribed(true);
            }
            return Boolean.valueOf(this.f4649a.isSubscribed());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b8.p$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ImageView f4650a;

        /* renamed from: b */
        final /* synthetic */ C1177p f4651b;

        /* renamed from: c */
        final /* synthetic */ Match f4652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ImageView imageView, C1177p c1177p, Match match) {
            super(1);
            this.f4650a = imageView;
            this.f4651b = c1177p;
            this.f4652c = match;
        }

        /* renamed from: a */
        public final void m5404a(Boolean bool) {
            AbstractC5868k.m23673e(bool, "it");
            if (bool.booleanValue()) {
                ImageView imageView = this.f4650a;
                if (imageView != null) {
                    imageView.setBackgroundColor(AbstractC0547a.m2322d(this.f4651b.m28850h(), R$color.color_font_height_light));
                }
                if (!this.f4652c.isInFifteenMinutes()) {
                    C4055l1.a aVar = C4055l1.f17924H0;
                    Context m28850h = this.f4651b.m28850h();
                    String string = this.f4651b.m28850h().getString(R$string.match_subscribed);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.match_subscribed)");
                    aVar.m17082a(m28850h, string, 5000L);
                }
            } else {
                ImageView imageView2 = this.f4650a;
                if (imageView2 != null) {
                    imageView2.setBackgroundColor(AbstractC0547a.m2322d(this.f4651b.m28850h(), R$color.color_4d5c5f66));
                }
                C4055l1.a aVar2 = C4055l1.f17924H0;
                Context m28850h2 = this.f4651b.m28850h();
                String string2 = this.f4651b.m28850h().getString(R$string.match_unsubscribed);
                AbstractC5868k.m23673e(string2, "mContext.getString(R.string.match_unsubscribed)");
                aVar2.m17082a(m28850h2, string2, 5000L);
            }
            C7589m1.f27886a.m29127J(bool.booleanValue());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5404a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b8.p$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f4653a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m5405a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5405a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: b8.p$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            return new String[]{C1177p.this.m28850h().getResources().getString(R$string.sun), C1177p.this.m28850h().getResources().getString(R$string.mon), C1177p.this.m28850h().getResources().getString(R$string.tue), C1177p.this.m28850h().getResources().getString(R$string.wed), C1177p.this.m28850h().getResources().getString(R$string.thu), C1177p.this.m28850h().getResources().getString(R$string.fri), C1177p.this.m28850h().getResources().getString(R$string.sat)};
        }
    }

    public C1177p() {
        super(R$layout.layout_match_category_schedule_item, null, 2, null);
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new e());
        this.f4643e = m5965b;
        this.f4644f = new C7554b();
    }

    /* renamed from: A */
    private final void m5383A(Match match, ImageView imageView) {
        if (match.findFirstChannel() && match.compareToGameTime()) {
            Observable just = Observable.just(match);
            final b bVar = new b(match);
            Observable compose = just.map(new Function() { // from class: b8.m
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Boolean m5384B;
                    m5384B = C1177p.m5384B(InterfaceC5660l.this, obj);
                    return m5384B;
                }
            }).compose(AbstractC7029f.m27121b());
            final c cVar = new c(imageView, this, match);
            Consumer consumer = new Consumer() { // from class: b8.n
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1177p.m5385C(InterfaceC5660l.this, obj);
                }
            };
            final d dVar = d.f4653a;
            compose.subscribe(consumer, new Consumer() { // from class: b8.o
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1177p.m5386D(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final Boolean m5384B(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m5385C(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m5386D(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: E */
    private final boolean m5387E(View view, int i10, KeyEvent keyEvent, C7531f c7531f, Match match) {
        if (i10 != 22) {
            if (i10 != 82) {
                View.OnKeyListener onKeyListener = this.f4645g;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(view, i10, keyEvent);
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                m5383A(match, (ImageView) c7531f.m28863b(R$id.mIvSubscribe));
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m5393v(C1177p c1177p, View view, boolean z10) {
        AbstractC5868k.m23674f(c1177p, "this$0");
        if (z10) {
            c1177p.f4646h = view;
            C7554b c7554b = c1177p.f4644f;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28944d(view, 1.05f, 1.025f);
            return;
        }
        C7554b c7554b2 = c1177p.f4644f;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28946g(view, 1.05f, 1.025f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final boolean m5394w(C1177p c1177p, C7531f c7531f, Match match, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c1177p, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(match, "$bean");
        AbstractC5868k.m23673e(view, "v");
        AbstractC5868k.m23673e(keyEvent, "event");
        return c1177p.m5387E(view, i10, keyEvent, c7531f, match);
    }

    /* renamed from: y */
    private final String m5395y(Match match) {
        boolean z10;
        List m27748R;
        List m27748R2;
        String m20613f;
        String gameTime = match.getGameTime();
        if (gameTime != null && gameTime.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            m27748R = AbstractC7167u.m27748R(match.getGameTime(), new String[]{" "}, false, 0, 6, null);
            if (m27748R.size() == 2) {
                m27748R2 = AbstractC7167u.m27748R((CharSequence) m27748R.get(0), new String[]{Operator.Operation.MINUS}, false, 0, 6, null);
                if (m27748R2.size() == 3) {
                    StringBuilder sb2 = new StringBuilder();
                    if (AbstractC5086c.m20622o((String) m27748R.get(0), "yyyy-MM-dd")) {
                        m20613f = m28850h().getResources().getString(R$string.today);
                    } else {
                        m20613f = AbstractC5086c.m20613f((String) m27748R.get(0), m5396z());
                    }
                    sb2.append((String) m27748R2.get(2));
                    sb2.append(Operator.Operation.DIVISION);
                    sb2.append((String) m27748R2.get(1));
                    sb2.append(" ");
                    sb2.append(m20613f);
                    sb2.append("\n");
                    sb2.append((String) m27748R.get(1));
                    String sb3 = sb2.toString();
                    AbstractC5868k.m23673e(sb3, "timeSb.toString()");
                    return sb3;
                }
            }
            return "";
        }
        return "";
    }

    /* renamed from: z */
    private final String[] m5396z() {
        return (String[]) this.f4643e.getValue();
    }

    /* renamed from: F */
    public final void m5397F(C7531f c7531f, Match match) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(match, "bean");
        if (match.findFirstChannel() && match.compareToGameTime()) {
            int i10 = R$id.mIvSubscribe;
            c7531f.m28867f(i10, true);
            if (match.isSubscribed()) {
                ((ImageView) c7531f.m28863b(i10)).setBackgroundColor(AbstractC0547a.m2322d(m28850h(), R$color.color_font_height_light));
                return;
            } else {
                ((ImageView) c7531f.m28863b(i10)).setBackgroundColor(AbstractC0547a.m2322d(m28850h(), R$color.color_4d5c5f66));
                return;
            }
        }
        c7531f.m28867f(R$id.mIvSubscribe, false);
    }

    /* renamed from: G */
    public final void m5398G(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "parent");
        View view = this.f4646h;
        if (view != null) {
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        recyclerView.requestFocus();
    }

    /* renamed from: H */
    public final void m5399H(View view) {
        this.f4646h = view;
    }

    /* renamed from: I */
    public final void m5400I(View.OnKeyListener onKeyListener) {
        AbstractC5868k.m23674f(onKeyListener, "listener");
        this.f4645g = onKeyListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final Match match) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(match, "bean");
        C5608b c5608b = C5608b.f22632a;
        Context m28850h = m28850h();
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mIvTeam1);
        String teamLogo = match.getTeam_a().getTeamLogo();
        String str = "";
        if (teamLogo == null) {
            teamLogo = "";
        }
        c5608b.m22780c(m28850h, imageView, teamLogo);
        Context m28850h2 = m28850h();
        ImageView imageView2 = (ImageView) c7531f.m28863b(R$id.mIvTeam2);
        String teamLogo2 = match.getTeam_b().getTeamLogo();
        if (teamLogo2 != null) {
            str = teamLogo2;
        }
        c5608b.m22780c(m28850h2, imageView2, str);
        c7531f.m28865d(R$id.mTvMatchTime, m5395y(match)).m28865d(R$id.mTvTeam1, match.getTeam_a().getTeamName()).m28865d(R$id.mTvTeam2, match.getTeam_b().getTeamName());
        TextView textView = (TextView) c7531f.m28863b(R$id.mTvFinished);
        if (match.isGameEnd()) {
            int i10 = R$id.mTvTimeOrScore;
            c7531f.m28867f(i10, true);
            c7531f.m28867f(R$id.ivVs, false);
            c7531f.m28865d(i10, match.getScore());
            textView.setTextColor(m28850h().getResources().getColor(R$color.color_font_main));
            textView.setText(m28850h().getText(R$string.match_finished));
        } else if (match.isGameOnGoing()) {
            c7531f.m28867f(R$id.mTvTimeOrScore, false);
            c7531f.m28867f(R$id.ivVs, true);
            textView.setTextColor(m28850h().getResources().getColor(R$color.color_font_match_processing));
            textView.setText(m28850h().getText(R$string.match_processing));
        } else {
            c7531f.m28867f(R$id.mTvTimeOrScore, false);
            c7531f.m28867f(R$id.ivVs, true);
            textView.setTextColor(m28850h().getResources().getColor(R$color.color_font_main));
            textView.setText(m28850h().getText(R$string.match_not_start));
        }
        m5397F(c7531f, match);
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: b8.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C1177p.m5393v(C1177p.this, view, z10);
            }
        });
        c7531f.itemView.setOnClickListener(new a(match, this));
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: b8.l
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m5394w;
                m5394w = C1177p.m5394w(C1177p.this, c7531f, match, view, i11, keyEvent);
                return m5394w;
            }
        });
    }

    /* renamed from: x */
    public final C7531f m5402x(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "parent");
        View view = this.f4646h;
        if (view == null) {
            return null;
        }
        AbstractC5868k.m23671c(view);
        RecyclerView.AbstractC0787f0 childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof C7531f)) {
            return null;
        }
        return (C7531f) childViewHolder;
    }
}
