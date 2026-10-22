package com.vod.p089ui.activity;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.ChildColumn;
import com.request.result.GetColumnContentsResultData;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
import com.vod.R$string;
import com.vod.p089ui.activity.TopicMoreActivity;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import p212kd.C5220r1;
import p253nd.InterfaceC5851k;
import p253nd.InterfaceC5852l;
import p289pd.C6279q;
import p348u2.AbstractC7026c;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7598p1;
import p400xa.C7594o0;
import p400xa.C7619y;

/* loaded from: classes3.dex */
public final class TopicMoreActivity extends AbstractActivityC2972a implements InterfaceC5852l {

    /* renamed from: L */
    public static final C3832a f17304L = new C3832a(null);

    /* renamed from: E */
    private final InterfaceC1312h f17305E;

    /* renamed from: F */
    private final int f17306F;

    /* renamed from: G */
    private int f17307G;

    /* renamed from: H */
    private int f17308H;

    /* renamed from: I */
    private String f17309I;

    /* renamed from: J */
    private final Runnable f17310J;

    /* renamed from: K */
    public Map f17311K = new LinkedHashMap();

    /* renamed from: com.vod.ui.activity.TopicMoreActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3832a {
        private C3832a() {
        }

        public /* synthetic */ C3832a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.vod.ui.activity.TopicMoreActivity$b */
    /* loaded from: classes3.dex */
    static final class C3833b extends AbstractC5869l implements InterfaceC5660l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.vod.ui.activity.TopicMoreActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ ChildColumn f17313a;

            /* renamed from: b */
            final /* synthetic */ TopicMoreActivity f17314b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChildColumn childColumn, TopicMoreActivity topicMoreActivity) {
                super(1);
                this.f17313a = childColumn;
                this.f17314b = topicMoreActivity;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                C7594o0 c7594o0 = C7594o0.f27942a;
                intent.putExtra("extra_topic_poster", c7594o0.m29220i(this.f17313a.getPosterList(), C7594o0.a.SpecialTopic));
                intent.putExtra("extra_topic_background", c7594o0.m29220i(this.f17313a.getPosterList(), C7594o0.a.Background));
                intent.putExtra("extra_topic_column_id", String.valueOf(this.f17313a.getId()));
                intent.putExtra("extra_topic_name", this.f17313a.getName());
                intent.putExtra("extra_topic_alias", this.f17313a.getAlias());
                Intent putExtra = intent.putExtra("extra_play_entrance", this.f17314b.f17309I);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(TopicAct…_ENTRANCE, mPlayEntrance)");
                return putExtra;
            }
        }

        C3833b() {
            super(1);
        }

        /* renamed from: a */
        public final void m16346a(ChildColumn childColumn) {
            AbstractC5868k.m23674f(childColumn, "it");
            C7619y.m29367d(C7619y.f28056a, TopicMoreActivity.this.m30049S4(), TopicActivity.class, null, new a(childColumn, TopicMoreActivity.this), 2, null);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16346a((ChildColumn) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.TopicMoreActivity$c */
    /* loaded from: classes3.dex */
    static final class C3834c extends AbstractC5869l implements InterfaceC5664p {
        C3834c() {
            super(2);
        }

        /* renamed from: a */
        public final void m16348a(int i10, boolean z10) {
            int selectedPosition;
            int itemCount;
            TopicMoreActivity topicMoreActivity = TopicMoreActivity.this;
            int i11 = R$id.topicMoreGridview;
            if ((((VerticalGridView) topicMoreActivity.m16343g6(i11)).getSelectedPosition() + 1) % TopicMoreActivity.this.f17306F == 0) {
                selectedPosition = (((VerticalGridView) TopicMoreActivity.this.m16343g6(i11)).getSelectedPosition() + 1) / TopicMoreActivity.this.f17306F;
            } else {
                selectedPosition = ((((VerticalGridView) TopicMoreActivity.this.m16343g6(i11)).getSelectedPosition() + 1) / TopicMoreActivity.this.f17306F) + 1;
            }
            if (TopicMoreActivity.this.m16336l6().getItemCount() % TopicMoreActivity.this.f17306F == 0) {
                itemCount = TopicMoreActivity.this.m16336l6().getItemCount() / TopicMoreActivity.this.f17306F;
            } else {
                itemCount = (TopicMoreActivity.this.m16336l6().getItemCount() / TopicMoreActivity.this.f17306F) + 1;
            }
            TextView textView = (TextView) TopicMoreActivity.this.m16343g6(R$id.tvPageNum);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(selectedPosition);
            sb2.append('/');
            sb2.append(itemCount);
            textView.setText(sb2.toString());
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m16348a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.TopicMoreActivity$d */
    /* loaded from: classes3.dex */
    static final class C3835d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3835d f17316a = new C3835d();

        C3835d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5220r1 invoke() {
            return new C5220r1();
        }
    }

    public TopicMoreActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C3835d.f17316a);
        this.f17305E = m5965b;
        this.f17306F = 6;
        this.f17309I = "";
        this.f17310J = new Runnable() { // from class: sd.t0
            @Override // java.lang.Runnable
            public final void run() {
                TopicMoreActivity.m16338r6(TopicMoreActivity.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6 */
    public final C5220r1 m16336l6() {
        return (C5220r1) this.f17305E.getValue();
    }

    /* renamed from: q6 */
    private final void m16337q6(int i10) {
        int i11 = R$id.topicMoreGridview;
        int i12 = i10 - 1;
        ((VerticalGridView) m16343g6(i11)).scrollToPosition(this.f17306F * i12);
        ((VerticalGridView) m16343g6(i11)).setSelectedPositionSmooth(i12 * this.f17306F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public static final void m16338r6(TopicMoreActivity topicMoreActivity) {
        AbstractC5868k.m23674f(topicMoreActivity, "this$0");
        int i10 = topicMoreActivity.f17307G;
        if (i10 != 0 && i10 <= topicMoreActivity.f17308H) {
            topicMoreActivity.m16337q6(i10);
        } else {
            AbstractC7598p1.m29244h(topicMoreActivity.m30049S4(), topicMoreActivity.getString(R$string.tip_invalid_pro_number), new int[0]);
        }
        topicMoreActivity.f17307G = 0;
        int i11 = R$id.mTextInputNumber;
        ((TextView) topicMoreActivity.m16343g6(i11)).setText("");
        ((TextView) topicMoreActivity.m16343g6(i11)).setVisibility(8);
    }

    /* renamed from: s6 */
    private final void m16339s6(List list) {
        int itemCount;
        if (!AbstractC5882y.m23710j(list)) {
            list = null;
        }
        m16336l6().m28854l(list);
        ((TextView) m16343g6(R$id.tvTotalNum)).setText(getString(R$string.total_movelist_number, Integer.valueOf(m16336l6().getItemCount())));
        if (m16336l6().getItemCount() % this.f17306F == 0) {
            itemCount = m16336l6().getItemCount() / this.f17306F;
        } else {
            itemCount = (m16336l6().getItemCount() / this.f17306F) + 1;
        }
        this.f17308H = itemCount;
        ((TextView) m16343g6(R$id.tvPageNum)).setText("1/" + this.f17308H);
        int i10 = R$id.topicMoreGridview;
        ((VerticalGridView) m16343g6(i10)).setAdapter(m16336l6());
        VerticalGridView verticalGridView = (VerticalGridView) m16343g6(i10);
        AbstractC5868k.m23673e(verticalGridView, "topicMoreGridview");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
    }

    @Override // p253nd.InterfaceC5852l
    /* renamed from: a */
    public void mo16340a() {
        ((LoadingView) m16343g6(R$id.loading)).setVisibility(0);
    }

    @Override // p253nd.InterfaceC5852l
    /* renamed from: b */
    public void mo16341b() {
        ((LoadingView) m16343g6(R$id.loading)).setVisibility(8);
    }

    @Override // p253nd.InterfaceC5852l
    /* renamed from: f2 */
    public void mo16342f2() {
        AbstractC7598p1.m29244h(m30049S4(), getResources().getString(R$string.search_result_hint), R$mipmap.toast_err);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((AutoFrameLayout) m16343g6(R$id.mian_layout)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        String stringExtra = getIntent().getStringExtra("extra_play_entrance");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f17309I = stringExtra;
        m16336l6().m21062v(new C3833b());
        m16336l6().m21061u(new C3834c());
    }

    /* renamed from: g6 */
    public View m16343g6(int i10) {
        Map map = this.f17311K;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // p253nd.InterfaceC5852l
    /* renamed from: o3 */
    public void mo16344o3(GetColumnContentsResultData getColumnContentsResultData) {
        AbstractC5868k.m23674f(getColumnContentsResultData, "data");
        ((AutoLinearLayout) m16343g6(R$id.llContainer)).setVisibility(0);
        List<ChildColumn> childColumnList = getColumnContentsResultData.getChildColumnList();
        if (childColumnList != null) {
            m16339s6(childColumnList);
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                this.f17307G = (this.f17307G * 10) + (i10 - 7);
                int i11 = R$id.mTextInputNumber;
                ((TextView) m16343g6(i11)).setVisibility(0);
                ((TextView) m16343g6(i11)).setText(String.valueOf(this.f17307G));
                ((TextView) m16343g6(i11)).removeCallbacks(this.f17310J);
                ((TextView) m16343g6(i11)).postDelayed(this.f17310J, 3000L);
                break;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: p6, reason: merged with bridge method [inline-methods] */
    public InterfaceC5851k mo7516s5() {
        return new C6279q(this, this);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_topicmore;
    }
}
