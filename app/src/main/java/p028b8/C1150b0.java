package p028b8;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.AbstractC0547a;
import be.C1328x;
import cc.C1464l0;
import com.live.R$color;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.p064ui.activity.MatchDetailActivity;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.Match;
import com.widget.custom.adapter.BaseAdapterImpl;
import com.zhy.autolayout.AutoLinearLayout;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p011aa.AbstractViewOnClickListenerC0123a;
import p040c8.C1402c0;
import p102db.C4055l1;
import p237m8.C5608b;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p400xa.C7554b;
import p400xa.C7589m1;
import p433zd.AbstractC7786b;

/* renamed from: b8.b0 */
/* loaded from: classes2.dex */
public final class C1150b0 extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private Context f4510a;

    /* renamed from: b */
    private final C7554b f4511b;

    /* renamed from: c */
    private ArrayList f4512c;

    /* renamed from: d */
    private View.OnKeyListener f4513d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b8.b0$a */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a */
        private AutoLinearLayout f4514a;

        /* renamed from: b */
        private ImageView f4515b;

        /* renamed from: c */
        private TextView f4516c;

        /* renamed from: d */
        private TextView f4517d;

        /* renamed from: e */
        private ImageView f4518e;

        /* renamed from: f */
        private TextView f4519f;

        /* renamed from: g */
        private ImageView f4520g;

        /* renamed from: h */
        private TextView f4521h;

        /* renamed from: i */
        private TextView f4522i;

        /* renamed from: j */
        private TextView f4523j;

        /* renamed from: k */
        private ImageView f4524k;

        public a() {
        }

        /* renamed from: a */
        public final ImageView m5251a() {
            return this.f4515b;
        }

        /* renamed from: b */
        public final ImageView m5252b() {
            return this.f4524k;
        }

        /* renamed from: c */
        public final ImageView m5253c() {
            return this.f4518e;
        }

        /* renamed from: d */
        public final ImageView m5254d() {
            return this.f4520g;
        }

        /* renamed from: e */
        public final AutoLinearLayout m5255e() {
            return this.f4514a;
        }

        /* renamed from: f */
        public final TextView m5256f() {
            return this.f4522i;
        }

        /* renamed from: g */
        public final TextView m5257g() {
            return this.f4516c;
        }

        /* renamed from: h */
        public final TextView m5258h() {
            return this.f4523j;
        }

        /* renamed from: i */
        public final TextView m5259i() {
            return this.f4517d;
        }

        /* renamed from: j */
        public final TextView m5260j() {
            return this.f4521h;
        }

        /* renamed from: k */
        public final TextView m5261k() {
            return this.f4519f;
        }

        /* renamed from: l */
        public final void m5262l(ImageView imageView) {
            this.f4515b = imageView;
        }

        /* renamed from: m */
        public final void m5263m(ImageView imageView) {
            this.f4524k = imageView;
        }

        /* renamed from: n */
        public final void m5264n(ImageView imageView) {
            this.f4518e = imageView;
        }

        /* renamed from: o */
        public final void m5265o(ImageView imageView) {
            this.f4520g = imageView;
        }

        /* renamed from: p */
        public final void m5266p(AutoLinearLayout autoLinearLayout) {
            this.f4514a = autoLinearLayout;
        }

        /* renamed from: q */
        public final void m5267q(TextView textView) {
            this.f4522i = textView;
        }

        /* renamed from: r */
        public final void m5268r(TextView textView) {
            this.f4516c = textView;
        }

        /* renamed from: s */
        public final void m5269s(TextView textView) {
            this.f4523j = textView;
        }

        /* renamed from: t */
        public final void m5270t(TextView textView) {
            this.f4517d = textView;
        }

        /* renamed from: u */
        public final void m5271u(TextView textView) {
            this.f4521h = textView;
        }

        /* renamed from: v */
        public final void m5272v(TextView textView) {
            this.f4519f = textView;
        }
    }

    /* renamed from: b8.b0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractViewOnClickListenerC0123a {

        /* renamed from: b */
        final /* synthetic */ Match f4526b;

        /* renamed from: c */
        final /* synthetic */ C1150b0 f4527c;

        b(Match match, C1150b0 c1150b0) {
            this.f4526b = match;
            this.f4527c = c1150b0;
        }

        @Override // p011aa.AbstractViewOnClickListenerC0123a
        /* renamed from: c */
        public void mo492c(View view) {
            String m27728o;
            String m6824c = C1464l0.f5622a.m6824c(this.f4526b.getGameTime(), "yyyy-MM-dd HH:mm");
            MatchDetailActivity.C2860a c2860a = MatchDetailActivity.f10864W;
            Context context = this.f4527c.f4510a;
            String gameId = this.f4526b.getGameId();
            String substring = m6824c.substring(0, 10);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            m27728o = AbstractC7166t.m27728o(substring, Operator.Operation.MINUS, "", false, 4, null);
            c2860a.m11527a(context, gameId, m27728o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b8.b0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Match f4528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Match match) {
            super(1);
            this.f4528a = match;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Match match) {
            AbstractC5868k.m23674f(match, "it");
            if (this.f4528a.isSubscribed()) {
                C1402c0.f5445a.m6464x(this.f4528a);
                this.f4528a.setSubscribed(false);
            } else {
                C1402c0.f5445a.m6463u(this.f4528a);
                Match match2 = this.f4528a;
                match2.setInFifteenMinutes(match2.calcInFifteenMinutes());
                this.f4528a.setSubscribed(true);
            }
            return Boolean.valueOf(this.f4528a.isSubscribed());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b8.b0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ImageView f4529a;

        /* renamed from: b */
        final /* synthetic */ C1150b0 f4530b;

        /* renamed from: c */
        final /* synthetic */ Match f4531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ImageView imageView, C1150b0 c1150b0, Match match) {
            super(1);
            this.f4529a = imageView;
            this.f4530b = c1150b0;
            this.f4531c = match;
        }

        /* renamed from: a */
        public final void m5274a(Boolean bool) {
            AbstractC5868k.m23673e(bool, "it");
            if (bool.booleanValue()) {
                ImageView imageView = this.f4529a;
                if (imageView != null) {
                    imageView.setBackgroundColor(AbstractC0547a.m2322d(this.f4530b.f4510a, R$color.color_font_height_light));
                }
                if (!this.f4531c.isInFifteenMinutes()) {
                    C4055l1.a aVar = C4055l1.f17924H0;
                    Context context = this.f4530b.f4510a;
                    String string = this.f4530b.f4510a.getString(R$string.match_subscribed);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.string.match_subscribed)");
                    aVar.m17082a(context, string, 5000L);
                }
            } else {
                ImageView imageView2 = this.f4529a;
                if (imageView2 != null) {
                    imageView2.setBackgroundColor(AbstractC0547a.m2322d(this.f4530b.f4510a, R$color.color_4d5c5f66));
                }
                C4055l1.a aVar2 = C4055l1.f17924H0;
                Context context2 = this.f4530b.f4510a;
                String string2 = this.f4530b.f4510a.getString(R$string.match_unsubscribed);
                AbstractC5868k.m23673e(string2, "mContext.getString(R.string.match_unsubscribed)");
                aVar2.m17082a(context2, string2, 5000L);
            }
            C7589m1.f27886a.m29127J(bool.booleanValue());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5274a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b8.b0$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f4532a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m5275a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5275a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C1150b0(Context context) {
        AbstractC5868k.m23674f(context, "mContext");
        this.f4510a = context;
        this.f4511b = new C7554b();
        this.f4512c = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m5241h(C1150b0 c1150b0, View view, boolean z10) {
        AbstractC5868k.m23674f(c1150b0, "this$0");
        if (z10) {
            C7554b c7554b = c1150b0.f4511b;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28944d(view, 1.05f, 1.025f);
        } else {
            C7554b c7554b2 = c1150b0.f4511b;
            AbstractC5868k.m23673e(view, "v");
            c7554b2.m28946g(view, 1.05f, 1.025f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final boolean m5242i(C1150b0 c1150b0, a aVar, Match match, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c1150b0, "this$0");
        AbstractC5868k.m23674f(aVar, "$viewHolder");
        AbstractC5868k.m23674f(match, "$match");
        AbstractC5868k.m23673e(view, "v");
        AbstractC5868k.m23673e(keyEvent, "event");
        return c1150b0.m5247n(view, i10, keyEvent, aVar, match);
    }

    /* renamed from: j */
    private final void m5243j(Match match, ImageView imageView) {
        if (match.findFirstChannel() && match.compareToGameTime()) {
            Observable just = Observable.just(match);
            final c cVar = new c(match);
            Observable compose = just.map(new Function() { // from class: b8.y
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Boolean m5244k;
                    m5244k = C1150b0.m5244k(InterfaceC5660l.this, obj);
                    return m5244k;
                }
            }).compose(AbstractC7029f.m27121b());
            final d dVar = new d(imageView, this, match);
            Consumer consumer = new Consumer() { // from class: b8.z
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1150b0.m5245l(InterfaceC5660l.this, obj);
                }
            };
            final e eVar = e.f4532a;
            compose.subscribe(consumer, new Consumer() { // from class: b8.a0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1150b0.m5246m(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final Boolean m5244k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m5245l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m5246m(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: n */
    private final boolean m5247n(View view, int i10, KeyEvent keyEvent, a aVar, Match match) {
        if (i10 != 22) {
            if (i10 != 82) {
                View.OnKeyListener onKeyListener = this.f4513d;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(view, i10, keyEvent);
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                m5243j(match, aVar.m5252b());
            }
        }
        return true;
    }

    /* renamed from: g */
    public final ArrayList m5248g() {
        return this.f4512c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4512c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Object obj = this.f4512c.get(i10);
        AbstractC5868k.m23673e(obj, "mMatchList[position]");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        final a aVar;
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.f4510a).inflate(R$layout.layout_match_schedule_item, viewGroup, false);
            AbstractC7786b.m30161e(view2);
            aVar.m5266p(view2 != null ? (AutoLinearLayout) view2.findViewById(R$id.mLayoutMatchHome) : null);
            aVar.m5262l((ImageView) view2.findViewById(R$id.mIvMatchLogo));
            aVar.m5268r((TextView) view2.findViewById(R$id.mTvMatchName));
            aVar.m5270t((TextView) view2.findViewById(R$id.mTvTeam1));
            aVar.m5264n((ImageView) view2.findViewById(R$id.mIvTeam1));
            aVar.m5272v((TextView) view2.findViewById(R$id.mTvTimeOrScore));
            aVar.m5271u((TextView) view2.findViewById(R$id.mTvTeam2));
            aVar.m5265o((ImageView) view2.findViewById(R$id.mIvTeam2));
            aVar.m5267q((TextView) view2.findViewById(R$id.mTvFinished));
            aVar.m5263m((ImageView) view2.findViewById(R$id.mIvSubscribe));
            aVar.m5269s((TextView) view2.findViewById(R$id.mTvProcessing));
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.MatchScheduleAdapter.ViewHolder");
            a aVar2 = (a) tag;
            view2 = view;
            aVar = aVar2;
        }
        Object obj = this.f4512c.get(i10);
        AbstractC5868k.m23673e(obj, "mMatchList[position]");
        final Match match = (Match) obj;
        C5608b c5608b = C5608b.f22632a;
        Context context = this.f4510a;
        ImageView m5251a = aVar.m5251a();
        AbstractC5868k.m23671c(m5251a);
        String matchLogo = match.getMatchLogo();
        if (matchLogo == null) {
            matchLogo = "";
        }
        c5608b.m22778a(context, m5251a, matchLogo);
        Context context2 = this.f4510a;
        ImageView m5253c = aVar.m5253c();
        AbstractC5868k.m23671c(m5253c);
        String teamLogo = match.getTeam_a().getTeamLogo();
        if (teamLogo == null) {
            teamLogo = "";
        }
        c5608b.m22780c(context2, m5253c, teamLogo);
        Context context3 = this.f4510a;
        ImageView m5254d = aVar.m5254d();
        AbstractC5868k.m23671c(m5254d);
        String teamLogo2 = match.getTeam_b().getTeamLogo();
        c5608b.m22780c(context3, m5254d, teamLogo2 != null ? teamLogo2 : "");
        TextView m5257g = aVar.m5257g();
        AbstractC5868k.m23671c(m5257g);
        m5257g.setText(match.getMatchName());
        TextView m5259i = aVar.m5259i();
        AbstractC5868k.m23671c(m5259i);
        m5259i.setText(match.getTeam_a().getTeamName());
        TextView m5260j = aVar.m5260j();
        AbstractC5868k.m23671c(m5260j);
        m5260j.setText(match.getTeam_b().getTeamName());
        if (match.isGameEnd()) {
            TextView m5261k = aVar.m5261k();
            AbstractC5868k.m23671c(m5261k);
            m5261k.setText(match.getScore());
            TextView m5256f = aVar.m5256f();
            AbstractC5868k.m23671c(m5256f);
            m5256f.setVisibility(0);
            TextView m5258h = aVar.m5258h();
            AbstractC5868k.m23671c(m5258h);
            m5258h.setVisibility(8);
        } else if (match.isGameOnGoing()) {
            TextView m5261k2 = aVar.m5261k();
            AbstractC5868k.m23671c(m5261k2);
            String substring = match.getGameTime().substring(11);
            AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
            m5261k2.setText(substring);
            TextView m5256f2 = aVar.m5256f();
            AbstractC5868k.m23671c(m5256f2);
            m5256f2.setVisibility(8);
            TextView m5258h2 = aVar.m5258h();
            AbstractC5868k.m23671c(m5258h2);
            m5258h2.setVisibility(0);
        } else {
            TextView m5261k3 = aVar.m5261k();
            AbstractC5868k.m23671c(m5261k3);
            String substring2 = match.getGameTime().substring(11);
            AbstractC5868k.m23673e(substring2, "this as java.lang.String).substring(startIndex)");
            m5261k3.setText(substring2);
            TextView m5256f3 = aVar.m5256f();
            AbstractC5868k.m23671c(m5256f3);
            m5256f3.setVisibility(8);
            TextView m5258h3 = aVar.m5258h();
            AbstractC5868k.m23671c(m5258h3);
            m5258h3.setVisibility(8);
        }
        if (match.findFirstChannel() && match.compareToGameTime()) {
            ImageView m5252b = aVar.m5252b();
            AbstractC5868k.m23671c(m5252b);
            m5252b.setVisibility(0);
            if (match.isSubscribed()) {
                ImageView m5252b2 = aVar.m5252b();
                AbstractC5868k.m23671c(m5252b2);
                m5252b2.setBackgroundColor(AbstractC0547a.m2322d(this.f4510a, R$color.color_font_height_light));
            } else {
                ImageView m5252b3 = aVar.m5252b();
                AbstractC5868k.m23671c(m5252b3);
                m5252b3.setBackgroundColor(AbstractC0547a.m2322d(this.f4510a, R$color.color_4d5c5f66));
            }
        } else {
            ImageView m5252b4 = aVar.m5252b();
            AbstractC5868k.m23671c(m5252b4);
            m5252b4.setVisibility(8);
        }
        AutoLinearLayout m5255e = aVar.m5255e();
        if (m5255e != null) {
            m5255e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: b8.w
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view3, boolean z10) {
                    C1150b0.m5241h(C1150b0.this, view3, z10);
                }
            });
        }
        AutoLinearLayout m5255e2 = aVar.m5255e();
        if (m5255e2 != null) {
            m5255e2.setOnKeyListener(new View.OnKeyListener() { // from class: b8.x
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view3, int i11, KeyEvent keyEvent) {
                    boolean m5242i;
                    m5242i = C1150b0.m5242i(C1150b0.this, aVar, match, view3, i11, keyEvent);
                    return m5242i;
                }
            });
        }
        AutoLinearLayout m5255e3 = aVar.m5255e();
        if (m5255e3 != null) {
            m5255e3.setOnClickListener(new b(match, this));
        }
        AbstractC5868k.m23671c(view2);
        return view2;
    }

    /* renamed from: o */
    public final void m5249o(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "matchList");
        this.f4512c.clear();
        this.f4512c.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: p */
    public final void m5250p(View.OnKeyListener onKeyListener) {
        AbstractC5868k.m23674f(onKeyListener, "listener");
        this.f4513d = onKeyListener;
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSecondPosition(int i10) {
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSelectPosition(int i10) {
    }
}
