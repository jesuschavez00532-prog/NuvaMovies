package p280p3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.download.R$id;
import com.download.R$layout;
import com.download.R$string;
import com.download.R$style;
import com.download.activity.DownloadActivity;
import com.download.view.LoadingView;
import com.module.bean.DefinitionBean;
import com.module.view.SelectionView;
import com.request.result.AssetData;
import com.request.result.SameSeasonSeriesBean;
import com.request.result.SimpleProgramList;
import com.umeng.analytics.pro.C3384f;
import com.widget.recyclerView.LinearLayoutManagerTV;
import com.widget.recyclerView.RecyclerViewTV;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p102db.C4088y0;
import p110e3.C4125c;
import p171i3.InterfaceC4848c;
import p171i3.InterfaceC4849d;
import p202k3.C5100d;
import p400xa.AbstractC7598p1;
import p400xa.C7617x;
import p400xa.C7619y;
import p433zd.AbstractC7786b;

/* renamed from: p3.d */
/* loaded from: classes.dex */
public final class DialogC6192d extends Dialog implements InterfaceC4849d {

    /* renamed from: a */
    private final Context f24335a;

    /* renamed from: b */
    private final InterfaceC1312h f24336b;

    /* renamed from: c */
    private final InterfaceC1312h f24337c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p3.d$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5664p {
        a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m24725a(int i10, SimpleProgramList simpleProgramList) {
            AbstractC5868k.m23674f(simpleProgramList, "simpleProgramList");
            DialogC6192d.this.m24718f().mo19992J(false, simpleProgramList);
            return Boolean.FALSE;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            return m24725a(((Number) obj).intValue(), (SimpleProgramList) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p3.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m24726a(int i10) {
            DialogC6192d.this.m24718f().mo19998k0(i10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24726a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: p3.d$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f24340a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4125c invoke() {
            return new C4125c();
        }
    }

    /* renamed from: p3.d$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4848c invoke() {
            return DialogC6192d.this.m24723h();
        }
    }

    /* renamed from: p3.d$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m24729a(SameSeasonSeriesBean sameSeasonSeriesBean) {
            AbstractC5868k.m23674f(sameSeasonSeriesBean, "it");
            DialogC6192d.this.m24718f().mo19997i3(sameSeasonSeriesBean.getContentId());
            ((SelectionView) DialogC6192d.this.findViewById(R$id.mSelectionView)).m12272C();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24729a((SameSeasonSeriesBean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6192d(Context context) {
        super(context, R$style.InputPasswordDialog);
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(context, "mContext");
        this.f24335a = context;
        m5965b = AbstractC1314j.m5965b(new d());
        this.f24336b = m5965b;
        m5965b2 = AbstractC1314j.m5965b(c.f24340a);
        this.f24337c = m5965b2;
    }

    /* renamed from: e */
    private final C4125c m24717e() {
        return (C4125c) this.f24337c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final InterfaceC4848c m24718f() {
        return (InterfaceC4848c) this.f24336b.getValue();
    }

    /* renamed from: i */
    private final void m24719i() {
        int i10 = R$id.mSelectionView;
        ((SelectionView) findViewById(i10)).m12273D();
        LinearLayoutManagerTV linearLayoutManagerTV = new LinearLayoutManagerTV(getContext(), 0, false);
        int i11 = R$id.mRcAudio;
        ((RecyclerViewTV) findViewById(i11)).setLayoutManager(linearLayoutManagerTV);
        ((RecyclerViewTV) findViewById(i11)).setSelectedItemAtCentered(true);
        ((RecyclerViewTV) findViewById(i11)).setInterceptLeftEvent(true);
        m24717e().setHasStableIds(true);
        ((RecyclerViewTV) findViewById(i11)).setAdapter(m24717e());
        ((AutoFrameLayout) findViewById(R$id.mFlSeason)).setOnClickListener(new View.OnClickListener() { // from class: p3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC6192d.m24720j(DialogC6192d.this, view);
            }
        });
        ((SelectionView) findViewById(i10)).setOnItemClickListener(new a());
        m24717e().m17258u(new b());
        ((Button) findViewById(R$id.mBtDownload)).setOnClickListener(new View.OnClickListener() { // from class: p3.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC6192d.m24721k(DialogC6192d.this, view);
            }
        });
        ((Button) findViewById(R$id.mBtDownloadList)).setOnClickListener(new View.OnClickListener() { // from class: p3.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC6192d.m24722l(DialogC6192d.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m24720j(DialogC6192d dialogC6192d, View view) {
        AbstractC5868k.m23674f(dialogC6192d, "this$0");
        dialogC6192d.m24718f().mo19994S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m24721k(DialogC6192d dialogC6192d, View view) {
        AbstractC5868k.m23674f(dialogC6192d, "this$0");
        dialogC6192d.m24718f().mo19993Q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m24722l(DialogC6192d dialogC6192d, View view) {
        AbstractC5868k.m23674f(dialogC6192d, "this$0");
        C7619y c7619y = C7619y.f28056a;
        Context context = dialogC6192d.getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        c7619y.m29369b(context, DownloadActivity.class);
        dialogC6192d.dismiss();
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: B */
    public void mo19999B(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        C7617x c7617x = C7617x.f28030a;
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        AbstractC7598p1.m29245i(getContext(), C7617x.m29327c(c7617x, context, str, false, 4, null), new int[0]);
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: C */
    public void mo20000C() {
        m24717e().m28847d();
        ((Group) findViewById(R$id.mGroupAudio)).setVisibility(8);
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: D */
    public void mo20001D() {
        ((SelectionView) findViewById(R$id.mSelectionView)).m12276v();
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: E */
    public void mo20002E(List list, int i10) {
        AbstractC5868k.m23674f(list, "sameSeasonSeriesList");
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        C4088y0 c4088y0 = new C4088y0(context);
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) findViewById(R$id.mFlSeason);
        AbstractC5868k.m23673e(autoFrameLayout, "mFlSeason");
        ImageView imageView = (ImageView) findViewById(R$id.mIvArrow);
        AbstractC5868k.m23673e(imageView, "mIvArrow");
        c4088y0.m17121c(autoFrameLayout, list, i10, imageView, new e());
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: F */
    public void mo20003F() {
        AbstractC7598p1.m29245i(getContext(), getContext().getString(R$string.download_please_insert_storage), new int[0]);
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: G */
    public void mo20004G(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "msg");
        if (z10) {
            int i10 = R$id.mTvError;
            ((TextView) findViewById(i10)).setVisibility(0);
            ((TextView) findViewById(i10)).setText(str);
            m24718f().mo19995a3();
            return;
        }
        ((TextView) findViewById(R$id.mTvError)).setVisibility(8);
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: H */
    public void mo20005H(int i10, List list) {
        int i11 = R$id.mSelectionView;
        ((SelectionView) findViewById(i11)).setVisibility(i10);
        if (i10 == 0 && list != null) {
            SelectionView selectionView = (SelectionView) findViewById(i11);
            AbstractC5868k.m23673e(selectionView, "mSelectionView");
            SelectionView.m12242K(selectionView, (ArrayList) list, null, 2, null);
        }
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: I */
    public void mo20006I() {
        ((AutoFrameLayout) findViewById(R$id.mFlSeason)).setVisibility(8);
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: J */
    public void mo20007J(String str) {
        AbstractC5868k.m23674f(str, "subtitles");
        ((Group) findViewById(R$id.mGroupSubtitles)).setVisibility(0);
        ((TextView) findViewById(R$id.mTvSubtitlesName)).setText(str);
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: K */
    public void mo20008K(DefinitionBean definitionBean) {
        AbstractC5868k.m23674f(definitionBean, "definitionBean");
        ((Group) findViewById(R$id.mGroupAudio)).setVisibility(0);
        m24717e().m17259v(0);
        m24717e().m28854l(definitionBean.getSourceList());
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: L */
    public void mo20009L() {
        ((Group) findViewById(R$id.mGroupSubtitles)).setVisibility(8);
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: M */
    public void mo20010M() {
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: N */
    public void mo20011N(String str) {
        AbstractC5868k.m23674f(str, "diskName");
        ((TextView) findViewById(R$id.mTvStorageName)).setText(str);
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: O */
    public void mo20012O(int i10) {
        ((AutoFrameLayout) findViewById(R$id.mFlSeason)).setVisibility(0);
        ((TextView) findViewById(R$id.mTvSeason)).setText(getContext().getString(R$string.detail_season, Integer.valueOf(i10)));
    }

    @Override // p171i3.InterfaceC4849d
    /* renamed from: g */
    public void mo20013g(boolean z10) {
        int i10 = 0;
        LoadingView loadingView = (LoadingView) findViewById(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
    }

    /* renamed from: h */
    public InterfaceC4848c m24723h() {
        return new C5100d(this.f24335a, this);
    }

    /* renamed from: m */
    public final void m24724m(AssetData assetData, String str) {
        AbstractC5868k.m23674f(assetData, "detail");
        AbstractC5868k.m23674f(str, "type");
        m24718f().mo19996f2(assetData, str);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m24718f().mo6701B0();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_download_select);
        m24719i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m24718f().mo6702n2();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(AbstractC7786b.m30166j(980), -1);
            window.setGravity(8388613);
        }
    }
}
