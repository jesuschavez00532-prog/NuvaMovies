package p251n9;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.LinearLayoutManager;
import anet.channel.util.HttpConstant;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.mine.R$color;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$mipmap;
import com.mine.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.view.LoadingView;
import com.open.leanback.widget.HorizontalGridView;
import com.open.leanback.widget.InterfaceC3056g;
import com.request.result.AuthInfoList;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.PackageInfo;
import com.request.result.UserInfo;
import com.widget.recyclerView.RecyclerViewTV;
import com.widget.utils.SimpleItemDecoration;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1500l;
import p100d9.C3981g0;
import p100d9.C3987j0;
import p100d9.C3989k0;
import p153h2.AbstractC4509b;
import p160h9.InterfaceC4747w;
import p160h9.InterfaceC4748x;
import p170i2.C4842a;
import p192j9.C5015a0;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5091h;
import p201k2.AbstractC5095l;
import p201k2.C5096m;
import p238m9.ViewOnClickListenerC5621m;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p371vb.C7252a;
import p415y9.AbstractApplicationC7689d;
import p433zd.AbstractC7786b;
import ye.InterfaceC7719m;

/* renamed from: n9.t0 */
/* loaded from: classes.dex */
public final class C5817t0 extends AbstractC5774c<InterfaceC4747w> implements InterfaceC4748x {

    /* renamed from: D0 */
    private final InterfaceC1312h f23252D0;

    /* renamed from: E0 */
    private final InterfaceC1312h f23253E0;

    /* renamed from: F0 */
    private ArrayList f23254F0;

    /* renamed from: G0 */
    private HashMap f23255G0;

    /* renamed from: H0 */
    private int f23256H0;

    /* renamed from: I0 */
    private View f23257I0;

    /* renamed from: J0 */
    private String f23258J0;

    /* renamed from: K0 */
    private final SimpleItemDecoration f23259K0;

    /* renamed from: L0 */
    private String f23260L0;

    /* renamed from: M0 */
    private String f23261M0;

    /* renamed from: N0 */
    private int f23262N0;

    /* renamed from: O0 */
    private int f23263O0;

    /* renamed from: P0 */
    private int f23264P0;

    /* renamed from: Q0 */
    private Disposable f23265Q0;

    /* renamed from: R0 */
    public Map f23266R0 = new LinkedHashMap();

    /* renamed from: B0 */
    private final String f23250B0 = "PurchaseActivity";

    /* renamed from: C0 */
    private boolean f23251C0 = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.t0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f23267a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return AbstractC5095l.m20689c(str, AbstractC7786b.m30166j(410), AbstractC7786b.m30163g(410));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.t0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m23480a(Bitmap bitmap) {
            ImageView imageView;
            if (bitmap != null && (imageView = (ImageView) C5817t0.this.m23474fa(R$id.mImgQrCode)) != null) {
                imageView.setImageBitmap(bitmap);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23480a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.t0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f23269a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m23481a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23481a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.t0$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f23270a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3981g0 invoke() {
            return new C3981g0();
        }
    }

    /* renamed from: n9.t0$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f23271a = new e();

        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3987j0 invoke() {
            return new C3987j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.t0$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {
        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m23484a(PackageInfo packageInfo) {
            AbstractC5868k.m23674f(packageInfo, "it");
            C5817t0.this.m23442Ha(packageInfo);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23484a((PackageInfo) obj);
            return C1328x.f4998a;
        }
    }

    public C5817t0() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(d.f23270a);
        this.f23252D0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(e.f23271a);
        this.f23253E0 = m5965b2;
        this.f23254F0 = new ArrayList();
        this.f23255G0 = new HashMap();
        this.f23256H0 = -1;
        this.f23258J0 = "";
        this.f23259K0 = new SimpleItemDecoration(AbstractC7786b.m30166j(20), false, false, 4, null);
        this.f23262N0 = -1;
        this.f23263O0 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Aa */
    public static final void m23435Aa(C5817t0 c5817t0) {
        View childAt;
        AbstractC5868k.m23674f(c5817t0, "this$0");
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) c5817t0.m23474fa(R$id.mRecyclerView);
        if (recyclerViewTV != null && (childAt = recyclerViewTV.getChildAt(0)) != null) {
            childAt.requestFocus();
        }
    }

    /* renamed from: Ba */
    private final void m23436Ba() {
        ((Button) m23474fa(R$id.mBtnBind)).setOnClickListener(new View.OnClickListener() { // from class: n9.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5817t0.m23437Ca(C5817t0.this, view);
            }
        });
        m23464oa().m16865D(new f());
        ((HorizontalGridView) m23474fa(R$id.mGridTab)).setOnChildSelectedListener(new InterfaceC3056g() { // from class: n9.m0
            @Override // com.open.leanback.widget.InterfaceC3056g
            /* renamed from: a */
            public final void mo12571a(ViewGroup viewGroup, View view, int i10, long j10) {
                C5817t0.m23438Da(C5817t0.this, viewGroup, view, i10, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ca */
    public static final void m23437Ca(C5817t0 c5817t0, View view) {
        AbstractC5868k.m23674f(c5817t0, "this$0");
        ViewOnClickListenerC5621m viewOnClickListenerC5621m = new ViewOnClickListenerC5621m();
        Context m3096J6 = c5817t0.m3096J6();
        AbstractC5868k.m23672d(m3096J6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) m3096J6).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
        viewOnClickListenerC5621m.mo3277E9(m3294d4, "SelectBindMethodDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Da */
    public static final void m23438Da(C5817t0 c5817t0, ViewGroup viewGroup, View view, int i10, long j10) {
        AbstractC5868k.m23674f(c5817t0, "this$0");
        c5817t0.f23264P0 = i10;
        c5817t0.m23468ua(i10);
    }

    /* renamed from: Ea */
    private final void m23439Ea(String str) {
        boolean m27730q;
        boolean m27730q2;
        if (!TextUtils.isEmpty(str)) {
            m27730q = AbstractC7166t.m27730q(str, HttpConstant.HTTP, false, 2, null);
            if (!m27730q) {
                m27730q2 = AbstractC7166t.m27730q(str, HttpConstant.HTTPS, false, 2, null);
                if (!m27730q2) {
                    return;
                }
            }
            m23459ha(str);
        }
    }

    /* renamed from: Fa */
    private final void m23440Fa() {
        String str;
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        String str2 = null;
        if (m6887v != null) {
            str = m6887v.getBindMail();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
            UserInfo m6887v2 = c1466m0.m6887v();
            if (m6887v2 != null) {
                str2 = m6887v2.getBindMobile();
            }
            if (AbstractC5868k.m23669a(str2, MessageService.MSG_DB_READY_REPORT)) {
                AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23474fa(R$id.mAlPurChase);
                if (autoLinearLayout != null) {
                    autoLinearLayout.setVisibility(8);
                }
                Button button = (Button) m23474fa(R$id.mBtnBind);
                if (button != null) {
                    button.setVisibility(0);
                }
                AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m23474fa(R$id.mAlBindTip);
                if (autoLinearLayout2 != null) {
                    autoLinearLayout2.setVisibility(0);
                }
                TextView textView = (TextView) m23474fa(R$id.mTvBindTips);
                if (textView != null) {
                    textView.setText(m3154d7().getString(R$string.vistorbindtip));
                    return;
                }
                return;
            }
        }
        Button button2 = (Button) m23474fa(R$id.mBtnBind);
        if (button2 != null) {
            button2.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout3 = (AutoLinearLayout) m23474fa(R$id.mAlBindTip);
        if (autoLinearLayout3 != null) {
            autoLinearLayout3.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout4 = (AutoLinearLayout) m23474fa(R$id.mAlPurChase);
        if (autoLinearLayout4 != null) {
            autoLinearLayout4.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ga */
    public static final void m23441Ga(C5817t0 c5817t0) {
        View view;
        AbstractC5868k.m23674f(c5817t0, "this$0");
        HorizontalGridView horizontalGridView = (HorizontalGridView) c5817t0.m23474fa(R$id.mGridTab);
        if (horizontalGridView != null) {
            view = horizontalGridView.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ha */
    public final void m23442Ha(PackageInfo packageInfo) {
        GetAuthInfoResultData getAuthInfoResultData;
        String str;
        String str2;
        GetAuthInfoResultData data;
        String str3;
        this.f23256H0 = packageInfo.getId();
        C7252a c7252a = C7252a.f27087a;
        GetAuthInfoResult m28073h = c7252a.m28073h();
        String str4 = null;
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            str = getAuthInfoResultData.getQrcodeDisplay();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(MessageService.MSG_DB_READY_REPORT, str)) {
            int i10 = R$id.mTextSanTip;
            TextView textView = (TextView) m23474fa(i10);
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = (TextView) m23474fa(i10);
            if (textView2 != null) {
                Context m3096J6 = m3096J6();
                if (m3096J6 != null) {
                    str3 = m3096J6.getString(R$string.purchase_scan_with_the_folling_tools);
                } else {
                    str3 = null;
                }
                textView2.setText(str3);
            }
            AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23474fa(R$id.mLayoutTips1);
            if (autoLinearLayout != null) {
                autoLinearLayout.setVisibility(0);
            }
            TextView textView3 = (TextView) m23474fa(R$id.mTvTips2);
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (getAuthInfoResultData != null) {
                str4 = getAuthInfoResultData.getQrcodeMessage();
            }
            String m20659b = AbstractC5091h.m20659b();
            C1466m0 c1466m0 = C1466m0.f5627a;
            String m6878m = c1466m0.m6878m();
            int i11 = this.f23256H0;
            String mo19960i = C4842a.f20329a.m19920a().mo19960i(AbstractApplicationC7689d.f28135d.m29494a());
            String m23476ma = m23476ma();
            int m20602l = AbstractC5085b.m20602l(m3096J6());
            GetAuthInfoResult m28073h2 = c7252a.m28073h();
            if (m28073h2 == null || (data = m28073h2.getData()) == null || (str2 = data.getUserType()) == null) {
                str2 = "";
            }
            m23439Ea(str4 + "?lang=" + m20659b + "&userId=" + m6878m + "&packageId=" + i11 + "&appId=" + mo19960i + "&packageType=2&expireTime=" + m23476ma + "&appVersion=" + m20602l + "&userType=" + str2 + "&timestamp=" + new Date().getTime() + "&sn=" + c1466m0.m6885t() + "&tk=" + c1466m0.m6879n() + "&loginType=" + m23463na());
            return;
        }
        TextView textView4 = (TextView) m23474fa(R$id.mTextSanTip);
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m23474fa(R$id.mLayoutTips1);
        if (autoLinearLayout2 != null) {
            autoLinearLayout2.setVisibility(8);
        }
        TextView textView5 = (TextView) m23474fa(R$id.mTvTips2);
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
    }

    /* renamed from: Ia */
    private final void m23443Ia() {
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23474fa(R$id.mLayoutTips1);
        if (autoLinearLayout != null) {
            autoLinearLayout.setVisibility(4);
        }
        TextView textView = (TextView) m23474fa(R$id.mTvTips2);
        if (textView != null) {
            textView.setVisibility(4);
        }
        int i10 = R$id.mTextSanTip;
        TextView textView2 = (TextView) m23474fa(i10);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = (TextView) m23474fa(i10);
        if (textView3 != null) {
            textView3.setText(R$string.help_center_net_fail_notice);
        }
        ImageView imageView = (ImageView) m23474fa(R$id.mImgQrCode);
        if (imageView != null) {
            imageView.setImageResource(R$mipmap.vod_image_help_center_net_fail);
        }
    }

    /* renamed from: h */
    private final void m23458h() {
        String str;
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        String str2 = null;
        if (m6887v != null) {
            str = m6887v.getBindMail();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
            UserInfo m6887v2 = c1466m0.m6887v();
            if (m6887v2 != null) {
                str2 = m6887v2.getBindMobile();
            }
            if (AbstractC5868k.m23669a(str2, MessageService.MSG_DB_READY_REPORT)) {
                AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23474fa(R$id.mAlBindTip);
                if (autoLinearLayout != null) {
                    autoLinearLayout.setVisibility(0);
                }
                AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m23474fa(R$id.mAlPurChase);
                if (autoLinearLayout2 != null) {
                    autoLinearLayout2.setVisibility(8);
                }
                TextView textView = (TextView) m23474fa(R$id.mTvBindTips);
                if (textView != null) {
                    textView.setText(m3154d7().getString(R$string.vistorbindtip));
                    return;
                }
                return;
            }
        }
        AutoLinearLayout autoLinearLayout3 = (AutoLinearLayout) m23474fa(R$id.mAlBindTip);
        if (autoLinearLayout3 != null) {
            autoLinearLayout3.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout4 = (AutoLinearLayout) m23474fa(R$id.mAlPurChase);
        if (autoLinearLayout4 != null) {
            autoLinearLayout4.setVisibility(0);
        }
    }

    /* renamed from: ha */
    private final void m23459ha(String str) {
        Disposable disposable = this.f23265Q0;
        boolean z10 = false;
        if (disposable != null && !disposable.isDisposed()) {
            z10 = true;
        }
        if (z10) {
            Disposable disposable2 = this.f23265Q0;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            this.f23265Q0 = null;
        }
        Observable just = Observable.just(str);
        final a aVar = a.f23267a;
        Observable compose = just.map(new Function() { // from class: n9.n0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m23460ia;
                m23460ia = C5817t0.m23460ia(InterfaceC5660l.this, obj);
                return m23460ia;
            }
        }).compose(m19902N3()).compose(AbstractC7029f.m27120a());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: n9.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5817t0.m23461ja(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f23269a;
        this.f23265Q0 = compose.subscribe(consumer, new Consumer() { // from class: n9.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5817t0.m23462ka(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ia */
    public static final Bitmap m23460ia(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public static final void m23461ja(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public static final void m23462ka(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: na */
    private final String m23463na() {
        if (C5096m.f20979a.m20692c()) {
            return "2";
        }
        return "1";
    }

    /* renamed from: oa */
    private final C3981g0 m23464oa() {
        return (C3981g0) this.f23252D0.getValue();
    }

    /* renamed from: pa */
    private final C3987j0 m23465pa() {
        return (C3987j0) this.f23253E0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sa */
    public static final void m23466sa(C5817t0 c5817t0) {
        AbstractC5868k.m23674f(c5817t0, "this$0");
        View childAt = ((HorizontalGridView) c5817t0.m23474fa(R$id.mGridTab)).getChildAt(0);
        if (childAt != null) {
            childAt.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ta */
    public static final void m23467ta(C5817t0 c5817t0) {
        AbstractC5868k.m23674f(c5817t0, "this$0");
        View childAt = ((HorizontalGridView) c5817t0.m23474fa(R$id.mGridTab)).getChildAt(c5817t0.f23264P0);
        if (childAt != null) {
            childAt.setSelected(true);
        }
    }

    /* renamed from: ua */
    private final void m23468ua(int i10) {
        List list = (List) this.f23255G0.get(((C3989k0) this.f23254F0.get(i10)).m16878b());
        if (list != null) {
            m23464oa().m28854l(list);
            if (this.f23260L0 == null) {
                m23442Ha((PackageInfo) list.get(0));
                return;
            }
            return;
        }
        m23464oa().m28854l(new ArrayList());
        m23443Ia();
    }

    /* renamed from: va */
    private final void m23469va(ArrayList arrayList, HashMap hashMap) {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        String str;
        PackageInfo packageInfo3;
        AbstractC4509b.m18869b(this.f23250B0, "setCouponFocus", new Object[0]);
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            if (AbstractC5868k.m23669a(((C3989k0) arrayList.get(i10)).m16878b(), this.f23261M0)) {
                this.f23262N0 = i10;
                if (i10 != -1) {
                    int i12 = R$id.mGridTab;
                    HorizontalGridView horizontalGridView = (HorizontalGridView) m23474fa(i12);
                    if (horizontalGridView != null) {
                        horizontalGridView.setSelectedPosition(this.f23262N0);
                    }
                    HorizontalGridView horizontalGridView2 = (HorizontalGridView) m23474fa(i12);
                    if (horizontalGridView2 != null) {
                        horizontalGridView2.post(new Runnable() { // from class: n9.r0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5817t0.m23470wa(C5817t0.this);
                            }
                        });
                    }
                }
                List list = (List) hashMap.get(this.f23261M0);
                if (list != null) {
                    int i13 = 0;
                    for (Object obj2 : list) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC1500l.m6991j();
                        }
                        List list2 = (List) hashMap.get(this.f23261M0);
                        if (list2 != null && (packageInfo3 = (PackageInfo) list2.get(i13)) != null) {
                            str = packageInfo3.getPackageCode();
                        } else {
                            str = null;
                        }
                        if (AbstractC5868k.m23669a(str, this.f23260L0)) {
                            this.f23263O0 = i13;
                        }
                        i13 = i14;
                    }
                }
                if (this.f23263O0 != -1) {
                    RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m23474fa(R$id.mRecyclerView);
                    if (recyclerViewTV != null) {
                        recyclerViewTV.post(new Runnable() { // from class: n9.s0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5817t0.m23471xa(C5817t0.this);
                            }
                        });
                    }
                    List list3 = (List) hashMap.get(this.f23261M0);
                    if (list3 != null && (packageInfo2 = (PackageInfo) list3.get(this.f23263O0)) != null) {
                        m23442Ha(packageInfo2);
                    }
                } else {
                    RecyclerViewTV recyclerViewTV2 = (RecyclerViewTV) m23474fa(R$id.mRecyclerView);
                    if (recyclerViewTV2 != null) {
                        recyclerViewTV2.post(new Runnable() { // from class: n9.h0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5817t0.m23472ya(C5817t0.this);
                            }
                        });
                    }
                }
            }
            i10 = i11;
        }
        if (this.f23262N0 == -1) {
            int i15 = R$id.mGridTab;
            HorizontalGridView horizontalGridView3 = (HorizontalGridView) m23474fa(i15);
            if (horizontalGridView3 != null) {
                horizontalGridView3.setSelectedPosition(0);
            }
            HorizontalGridView horizontalGridView4 = (HorizontalGridView) m23474fa(i15);
            if (horizontalGridView4 != null) {
                horizontalGridView4.post(new Runnable() { // from class: n9.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5817t0.m23473za(C5817t0.this);
                    }
                });
            }
            RecyclerViewTV recyclerViewTV3 = (RecyclerViewTV) m23474fa(R$id.mRecyclerView);
            if (recyclerViewTV3 != null) {
                recyclerViewTV3.post(new Runnable() { // from class: n9.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5817t0.m23435Aa(C5817t0.this);
                    }
                });
            }
            List list4 = (List) hashMap.get(((C3989k0) arrayList.get(0)).m16878b());
            if (list4 != null && (packageInfo = (PackageInfo) list4.get(0)) != null) {
                m23442Ha(packageInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wa */
    public static final void m23470wa(C5817t0 c5817t0) {
        View view;
        AbstractC5868k.m23674f(c5817t0, "this$0");
        HorizontalGridView horizontalGridView = (HorizontalGridView) c5817t0.m23474fa(R$id.mGridTab);
        if (horizontalGridView != null) {
            view = horizontalGridView.getChildAt(c5817t0.f23262N0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xa */
    public static final void m23471xa(C5817t0 c5817t0) {
        View childAt;
        AbstractC5868k.m23674f(c5817t0, "this$0");
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) c5817t0.m23474fa(R$id.mRecyclerView);
        if (recyclerViewTV != null && (childAt = recyclerViewTV.getChildAt(c5817t0.f23263O0)) != null) {
            childAt.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ya */
    public static final void m23472ya(C5817t0 c5817t0) {
        View childAt;
        AbstractC5868k.m23674f(c5817t0, "this$0");
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) c5817t0.m23474fa(R$id.mRecyclerView);
        if (recyclerViewTV != null && (childAt = recyclerViewTV.getChildAt(0)) != null) {
            childAt.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: za */
    public static final void m23473za(C5817t0 c5817t0) {
        View view;
        AbstractC5868k.m23674f(c5817t0, "this$0");
        HorizontalGridView horizontalGridView = (HorizontalGridView) c5817t0.m23474fa(R$id.mGridTab);
        if (horizontalGridView != null) {
            view = horizontalGridView.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_purchase;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: I9 */
    public boolean mo23265I9() {
        return ((HorizontalGridView) m23474fa(R$id.mGridTab)).hasFocus();
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        boolean z10;
        boolean z11;
        HorizontalGridView horizontalGridView = (HorizontalGridView) m23474fa(R$id.mGridTab);
        if (horizontalGridView != null && horizontalGridView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        Button button = (Button) m23474fa(R$id.mBtnBind);
        if (button != null && button.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: M9 */
    public boolean mo23276M9() {
        Boolean bool;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View childAt;
        HorizontalGridView horizontalGridView;
        HorizontalGridView horizontalGridView2;
        View childAt2;
        View childAt3;
        String str = this.f23250B0;
        int i10 = R$id.mGridTab;
        HorizontalGridView horizontalGridView3 = (HorizontalGridView) m23474fa(i10);
        if (horizontalGridView3 != null && (childAt3 = horizontalGridView3.getChildAt(0)) != null) {
            bool = Boolean.valueOf(childAt3.hasFocus());
        } else {
            bool = null;
        }
        AbstractC4509b.m18869b(str, "mGridTab:" + bool + "；", new Object[0]);
        HorizontalGridView horizontalGridView4 = (HorizontalGridView) m23474fa(i10);
        if (horizontalGridView4 != null && (childAt2 = horizontalGridView4.getChildAt(0)) != null && childAt2.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (horizontalGridView2 = (HorizontalGridView) m23474fa(i10)) != null) {
            horizontalGridView2.post(new Runnable() { // from class: n9.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C5817t0.m23466sa(C5817t0.this);
                }
            });
        }
        int i11 = R$id.mRecyclerView;
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m23474fa(i11);
        if (recyclerViewTV != null && recyclerViewTV.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (horizontalGridView = (HorizontalGridView) m23474fa(i10)) != null) {
            horizontalGridView.post(new Runnable() { // from class: n9.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C5817t0.m23467ta(C5817t0.this);
                }
            });
        }
        RecyclerViewTV recyclerViewTV2 = (RecyclerViewTV) m23474fa(i11);
        if (recyclerViewTV2 != null && recyclerViewTV2.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            HorizontalGridView horizontalGridView5 = (HorizontalGridView) m23474fa(i10);
            if (horizontalGridView5 != null && (childAt = horizontalGridView5.getChildAt(0)) != null && childAt.hasFocus()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                return false;
            }
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: N9 */
    public void mo23277N9() {
        HorizontalGridView horizontalGridView = (HorizontalGridView) m23474fa(R$id.mGridTab);
        if (horizontalGridView != null) {
            horizontalGridView.requestFocus();
        }
    }

    @Override // p160h9.InterfaceC4748x
    /* renamed from: O4 */
    public void mo19633O4() {
        m23443Ia();
    }

    @Override // ba.AbstractC1196d, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        super.mo3118Q7();
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // p160h9.InterfaceC4748x
    /* renamed from: Z5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo19634Z5(com.request.result.ConfigInfoBean r19) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n9.C5817t0.mo19634Z5(com.request.result.ConfigInfoBean):void");
    }

    @Override // p160h9.InterfaceC4748x
    /* renamed from: c */
    public void mo19635c() {
        LoadingView loadingView = (LoadingView) m23474fa(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
    }

    @Override // p160h9.InterfaceC4748x
    /* renamed from: d */
    public void mo19636d() {
        AbstractC4509b.m18869b("PurchaseFragment", "dismissLoadingView", new Object[0]);
        LoadingView loadingView = (LoadingView) m23474fa(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    /* renamed from: fa */
    public View m23474fa(int i10) {
        View findViewById;
        Map map = this.f23266R0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // p160h9.InterfaceC4748x
    /* renamed from: g4 */
    public void mo19637g4(boolean z10) {
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        m23475la();
        ((InterfaceC4747w) m5478w9()).mo19631H2();
        m23440Fa();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: la */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m23475la() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n9.C5817t0.m23475la():void");
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23266R0.clear();
    }

    /* renamed from: ma */
    public String m23476ma() {
        boolean z10;
        GetAuthInfoResultData getAuthInfoResultData;
        if (this.f23258J0.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
            AuthInfoList authInfoList = null;
            if (m28073h != null) {
                getAuthInfoResultData = m28073h.getData();
            } else {
                getAuthInfoResultData = null;
            }
            if (getAuthInfoResultData != null && getAuthInfoResultData.getRemainingDays() > 0) {
                List<AuthInfoList> authInfoList2 = getAuthInfoResultData.getAuthInfoList();
                if (authInfoList2 != null) {
                    authInfoList = authInfoList2.get(0);
                }
                AbstractC5868k.m23671c(authInfoList);
                String invalidTime = authInfoList.getInvalidTime();
                if (invalidTime == null) {
                    invalidTime = "";
                }
                this.f23258J0 = invalidTime;
            }
        }
        return this.f23258J0;
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        Intent intent = new Intent();
        this.f23260L0 = intent.getStringExtra("packageCode");
        this.f23261M0 = intent.getStringExtra("packageLabel");
        ((AutoFrameLayout) m23474fa(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(m3096J6(), R$color.color_000000));
        int i10 = R$id.mRecyclerView;
        ((RecyclerViewTV) m23474fa(i10)).setLayoutManager(new LinearLayoutManager(m3096J6(), 1, false));
        ((RecyclerViewTV) m23474fa(i10)).addItemDecoration(this.f23259K0);
        m23464oa().setHasStableIds(true);
        ((RecyclerViewTV) m23474fa(i10)).setAdapter(m23464oa());
        m23436Ba();
        m23440Fa();
        m23478ra();
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 22) {
            int i11 = R$id.mRecyclerView;
            if (((RecyclerViewTV) m23474fa(i11)).getFocusedChild() != null) {
                this.f23257I0 = ((RecyclerViewTV) m23474fa(i11)).getFocusedChild();
                int i12 = R$id.mBtnBind;
                if (((Button) m23474fa(i12)).getVisibility() == 0) {
                    ((Button) m23474fa(i12)).requestFocus();
                }
                return true;
            }
            int i13 = R$id.mGridTab;
            if (((HorizontalGridView) m23474fa(i13)).getFocusedChild() != null && ((HorizontalGridView) m23474fa(i13)).getSelectedPosition() == m23465pa().getItemCount() - 1) {
                ((HorizontalGridView) m23474fa(i13)).getFocusedChild().setSelected(true);
                int i14 = R$id.mBtnBind;
                if (((Button) m23474fa(i14)).getVisibility() == 0) {
                    ((Button) m23474fa(i14)).requestFocus();
                }
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: qa, reason: merged with bridge method [inline-methods] */
    public InterfaceC4747w mo5465y9() {
        return new C5015a0(this, this);
    }

    @Override // p160h9.InterfaceC4748x
    /* renamed from: r0 */
    public void mo19638r0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractActivityC0712e m3075C6 = m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
        AbstractActivityC2972a.m11957W5((AbstractActivityC2972a) m3075C6, str, false, null, null, null, null, null, 124, null);
        m23443Ia();
    }

    @Override // p160h9.InterfaceC4748x
    /* renamed from: r6 */
    public void mo19639r6(int i10) {
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23474fa(R$id.mTvContactWhatsApp1);
        if (autoLinearLayout != null) {
            autoLinearLayout.setVisibility(8);
        }
        TextView textView = (TextView) m23474fa(R$id.mTvWhatsApp1Time);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: ra */
    public void m23478ra() {
        C1466m0.f5627a.m6829B();
    }

    @InterfaceC7719m
    public final void refreshUerInfoDisplayMessage(RefreshUerInfoDisplayEvent refreshUerInfoDisplayEvent) {
        AbstractC5868k.m23674f(refreshUerInfoDisplayEvent, "event");
        m23458h();
        m23440Fa();
    }

    @Override // p160h9.InterfaceC4748x
    /* renamed from: s4 */
    public void mo19640s4(ArrayList arrayList, HashMap hashMap) {
        AbstractC5868k.m23674f(arrayList, "arrayTab");
        AbstractC5868k.m23674f(hashMap, "packageMap");
        int i10 = R$id.mGridTab;
        ((HorizontalGridView) m23474fa(i10)).setAdapter(m23465pa());
        m23465pa().m28856n(arrayList);
        this.f23254F0.clear();
        this.f23255G0.clear();
        this.f23254F0.addAll(arrayList);
        this.f23255G0 = hashMap;
        m23468ua(0);
        HorizontalGridView horizontalGridView = (HorizontalGridView) m23474fa(i10);
        if (horizontalGridView != null) {
            horizontalGridView.post(new Runnable() { // from class: n9.q0
                @Override // java.lang.Runnable
                public final void run() {
                    C5817t0.m23441Ga(C5817t0.this);
                }
            });
        }
        if (AbstractC6567a.m25637g(this.f23260L0)) {
            m23469va(arrayList, hashMap);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23251C0;
    }
}
