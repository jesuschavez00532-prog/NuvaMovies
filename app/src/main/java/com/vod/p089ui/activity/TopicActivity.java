package com.vod.p089ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.request.result.AssetList;
import com.request.result.FavIdDataItem;
import com.request.result.GetShelveData;
import com.swlauthnew.view.ScrollTextView;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.p089ui.activity.TopicActivity;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import org.android.agoo.common.AgooConstants;
import p193ja.C5044a;
import p201k2.AbstractC5091h;
import p212kd.C5208o1;
import p253nd.InterfaceC5849i;
import p253nd.InterfaceC5850j;
import p289pd.C6280r;
import p348u2.AbstractC7026c;
import p400xa.AbstractC7598p1;
import p400xa.C7578j;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7619y;

/* loaded from: classes3.dex */
public final class TopicActivity extends AbstractActivityC2972a implements InterfaceC5850j {

    /* renamed from: N */
    public static final C3827a f17289N = new C3827a(null);

    /* renamed from: J */
    private GetShelveData f17295J;

    /* renamed from: L */
    private final InterfaceC1312h f17297L;

    /* renamed from: M */
    public Map f17298M = new LinkedHashMap();

    /* renamed from: E */
    public String f17290E = "";

    /* renamed from: F */
    public String f17291F = "";

    /* renamed from: G */
    public String f17292G = "";

    /* renamed from: H */
    public String f17293H = "";

    /* renamed from: I */
    public String f17294I = "";

    /* renamed from: K */
    public String f17296K = "";

    /* renamed from: com.vod.ui.activity.TopicActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3827a {
        private C3827a() {
        }

        public /* synthetic */ C3827a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.vod.ui.activity.TopicActivity$b */
    /* loaded from: classes3.dex */
    static final class C3828b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3828b f17299a = new C3828b();

        C3828b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5208o1 invoke() {
            return new C5208o1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.TopicActivity$c */
    /* loaded from: classes3.dex */
    public static final class C3829c extends AbstractC5869l implements InterfaceC5660l {
        C3829c() {
            super(1);
        }

        /* renamed from: a */
        public final void m16329a(AssetList assetList) {
            AbstractC5868k.m23674f(assetList, "it");
            String str = "";
            if (assetList.getName().equals(TopicActivity.this.getString(R$string.more_info))) {
                ((TextView) TopicActivity.this.m16323h6(R$id.tvTopicName)).setText("");
                ((ScrollTextView) TopicActivity.this.m16323h6(R$id.tvTopicDes)).setText("");
                return;
            }
            ((TextView) TopicActivity.this.m16323h6(R$id.tvTopicName)).setText(AbstractC5091h.m20660c(assetList.getName(), assetList.getAlias()));
            ScrollTextView scrollTextView = (ScrollTextView) TopicActivity.this.m16323h6(R$id.tvTopicDes);
            String description = assetList.getDescription();
            if (description != null) {
                str = description;
            }
            scrollTextView.setText(str);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16329a((AssetList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.TopicActivity$d */
    /* loaded from: classes3.dex */
    public static final class C3830d extends AbstractC5869l implements InterfaceC5660l {
        C3830d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "it");
            Intent putExtra = intent.putExtra("extra_play_entrance", TopicActivity.this.f17296K);
            AbstractC5868k.m23673e(putExtra, "it.putExtra(TopicMoreAct…_ENTRANCE, mPlayEntrance)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.TopicActivity$e */
    /* loaded from: classes3.dex */
    public static final class C3831e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f17302a;

        /* renamed from: b */
        final /* synthetic */ TopicActivity f17303b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3831e(AssetList assetList, TopicActivity topicActivity) {
            super(1);
            this.f17302a = assetList;
            this.f17303b = topicActivity;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_column_id", 0);
            intent.putExtra("extra_play_type", "1");
            intent.putExtra("extra_content_id", this.f17302a.getContentId());
            intent.putExtra("extra_type", this.f17302a.getType());
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29167e());
            intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f17302a.getContentType(), "1"));
            Intent putExtra = intent.putExtra("extra_play_entrance", this.f17303b.f17296K);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…_ENTRANCE, mPlayEntrance)");
            return putExtra;
        }
    }

    public TopicActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C3828b.f17299a);
        this.f17297L = m5965b;
    }

    /* renamed from: i6 */
    private final C5208o1 m16313i6() {
        return (C5208o1) this.f17297L.getValue();
    }

    /* renamed from: l6 */
    private final void m16314l6(GetShelveData getShelveData) {
        if (AbstractC5868k.m23669a("1", getShelveData.getHasFavorite())) {
            int i10 = R$id.mCollectText;
            ((TextView) m16323h6(i10)).setText(R$string.remove_from_favorite);
            ((TextView) m16323h6(i10)).setSelected(true);
        } else {
            int i11 = R$id.mCollectText;
            ((TextView) m16323h6(i11)).setText(R$string.detail_collect);
            ((TextView) m16323h6(i11)).setSelected(false);
        }
    }

    /* renamed from: p6 */
    private final void m16315p6() {
        m16313i6().m21038j(new C3829c());
        ((Gallery) m16323h6(R$id.glTopicDetail)).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: sd.r0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                TopicActivity.m16316q6(TopicActivity.this, adapterView, view, i10, j10);
            }
        });
        ((TextView) m16323h6(R$id.mCollectText)).setOnClickListener(new View.OnClickListener() { // from class: sd.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopicActivity.m16317r6(TopicActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q6 */
    public static final void m16316q6(TopicActivity topicActivity, AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5868k.m23674f(topicActivity, "this$0");
        if (i10 == topicActivity.m16313i6().getCount() - 1) {
            if (C5044a.f20862a.m20485a("Special_root") == null) {
                return;
            }
            C7619y.m29367d(C7619y.f28056a, topicActivity, TopicMoreActivity.class, null, new C3830d(), 2, null);
            topicActivity.finish();
            return;
        }
        AssetList assetList = (AssetList) topicActivity.m16313i6().getItem(i10);
        C7589m1.f27886a.m29131N(topicActivity.f17291F);
        C7619y.m29367d(C7619y.f28056a, topicActivity, VodDetailsActivity.class, null, new C3831e(assetList, topicActivity), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public static final void m16317r6(TopicActivity topicActivity, View view) {
        AbstractC5868k.m23674f(topicActivity, "this$0");
        if (!C7578j.f27850a.m29087a() && topicActivity.f17295J != null) {
            if (((TextView) topicActivity.m16323h6(R$id.mCollectText)).getText() == topicActivity.getString(R$string.detail_collect)) {
                ((InterfaceC5849i) topicActivity.m11977r5()).mo23647q0(topicActivity.f17290E);
                return;
            }
            InterfaceC5849i interfaceC5849i = (InterfaceC5849i) topicActivity.m11977r5();
            GetShelveData getShelveData = topicActivity.f17295J;
            AbstractC5868k.m23671c(getShelveData);
            interfaceC5849i.mo23645J0(getShelveData.getFavoriteId());
        }
    }

    @Override // p253nd.InterfaceC5850j
    /* renamed from: F3 */
    public void mo16318F3(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractActivityC2972a.m11957W5(this, str, true, null, null, null, null, null, 124, null);
    }

    @Override // p253nd.InterfaceC5850j
    /* renamed from: L0 */
    public void mo16319L0(GetShelveData getShelveData) {
        AbstractC5868k.m23674f(getShelveData, "bean");
        this.f17295J = getShelveData;
        m16314l6(getShelveData);
        List m23702b = AbstractC5882y.m23702b(getShelveData.getAssetList());
        if (m23702b != null) {
            String string = getResources().getString(R$string.more_info);
            AbstractC5868k.m23673e(string, "getResources().getString(R.string.more_info)");
            m23702b.add(new AssetList(string));
        }
        m16313i6().m28843f(m23702b);
        ((Gallery) m16323h6(R$id.glTopicDetail)).requestFocus();
        ((TextView) m16323h6(R$id.mCollectText)).setFocusable(true);
    }

    @Override // p253nd.InterfaceC5850j
    /* renamed from: W0 */
    public void mo16320W0() {
        ((TextView) m16323h6(R$id.mCollectText)).setText(R$string.detail_collect);
        AbstractC7598p1.m29245i(this, getString(R$string.detail_no_collect_success_hint), new int[0]);
    }

    @Override // p253nd.InterfaceC5850j
    /* renamed from: c */
    public void mo16321c() {
        ((LoadingView) m16323h6(R$id.loadingView)).setVisibility(0);
    }

    @Override // p253nd.InterfaceC5850j
    /* renamed from: d */
    public void mo16322d() {
        ((LoadingView) m16323h6(R$id.loadingView)).setVisibility(8);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        String str;
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m16323h6(R$id.mRootView);
        int i10 = R$color.color_0b0b0b;
        autoRelativeLayout.setBackgroundDrawable(AbstractC7026c.m27111a(this, i10));
        if (!this.f12044B) {
            String stringExtra = getIntent().getStringExtra("extra_topic_column_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f17290E = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("extra_topic_name");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f17291F = stringExtra2;
            this.f17292G = getIntent().getStringExtra("extra_topic_alias");
            this.f17293H = getIntent().getStringExtra("extra_topic_poster");
            this.f17294I = getIntent().getStringExtra("extra_topic_background");
            String stringExtra3 = getIntent().getStringExtra("extra_play_entrance");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.f17296K = stringExtra3;
        }
        int i11 = R$id.glTopicDetail;
        ((Gallery) m16323h6(i11)).bringToFront();
        ((Gallery) m16323h6(i11)).setAdapter((SpinnerAdapter) m16313i6());
        C7594o0 c7594o0 = C7594o0.f27942a;
        String str2 = this.f17294I;
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        ImageView imageView = (ImageView) m16323h6(R$id.ivTopicBg);
        AbstractC5868k.m23673e(imageView, "ivTopicBg");
        Drawable m27111a = AbstractC7026c.m27111a(this, i10);
        AbstractC5868k.m23673e(m27111a, "acquire(this, R.color.color_0b0b0b)");
        C7594o0.m29204m(c7594o0, str, imageView, this, m27111a, 0, null, 48, null);
        m16315p6();
        ((InterfaceC5849i) m11977r5()).mo23646J2(this.f17290E);
    }

    /* renamed from: h6 */
    public View m16323h6(int i10) {
        Map map = this.f17298M;
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

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public InterfaceC5849i mo7516s5() {
        return new C6280r(this, this);
    }

    @Override // p253nd.InterfaceC5850j
    /* renamed from: n */
    public void mo16325n(List list) {
        GetShelveData getShelveData;
        AbstractC5868k.m23674f(list, "favId");
        if (list.size() > 0 && (getShelveData = this.f17295J) != null) {
            getShelveData.setFavoriteId(((FavIdDataItem) list.get(0)).getFavoriteId());
        }
        ((TextView) m16323h6(R$id.mCollectText)).setText(R$string.remove_from_favorite);
        AbstractC7598p1.m29245i(this, getString(R$string.detail_collect_success_hint), new int[0]);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 22) {
            int i11 = R$id.glTopicDetail;
            if (((Gallery) m16323h6(i11)).hasFocus() && ((Gallery) m16323h6(i11)).getSelectedItemPosition() == m16313i6().getCount() - 1) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p253nd.InterfaceC5850j
    /* renamed from: s */
    public void mo16326s(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        if (AbstractC5868k.m23669a(str, "portal100061")) {
            AbstractC7598p1.m29245i(this, getString(com.module.R$string.error_code_user_type) + AgooConstants.ACK_BODY_NULL + getString(com.module.R$string.user_ef11), new int[0]);
            return;
        }
        AbstractC7598p1.m29245i(this, getString(R$string.favorite_failed), new int[0]);
    }

    @Override // p253nd.InterfaceC5850j
    /* renamed from: u */
    public void mo16327u(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC7598p1.m29245i(this, getString(R$string.rm_favorite_failed), new int[0]);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_topic;
    }
}
