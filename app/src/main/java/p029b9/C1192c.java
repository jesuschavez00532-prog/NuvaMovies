package p029b9;

import android.view.KeyEvent;
import android.view.View;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.main.R$id;
import com.main.R$layout;
import com.module.event.FreeColumnGetDataEvent;
import com.module.event.RequestLiveColumnSuccessEvent;
import com.module.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.AssetList;
import com.request.result.Channel;
import com.request.result.ChildColumn;
import com.request.result.GetColumnContentsResultData;
import com.request.result.GetLiveDataResult;
import com.request.result.GetLiveDataResultData;
import com.request.result.GetShelveData;
import com.request.result.GetShelveResult;
import com.widget.utils.SimpleItemDecoration;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import org.greenrobot.eventbus.ThreadMode;
import p040c8.C1407f;
import p132fa.C4300d;
import p193ja.C5044a;
import p317rb.AbstractC6567a;
import p354u8.C7052a;
import p382w8.InterfaceC7381a;
import p382w8.InterfaceC7382b;
import p400xa.AbstractC7555b0;
import p400xa.C7577i1;
import p414y8.C7685c;
import p430z9.AbstractC7768f;
import ye.InterfaceC7719m;

/* renamed from: b9.c */
/* loaded from: classes.dex */
public final class C1192c extends AbstractC7768f<InterfaceC7381a> implements InterfaceC7382b {

    /* renamed from: M0 */
    public static final a f4723M0 = new a(null);

    /* renamed from: N0 */
    private static final int f4724N0 = 12;

    /* renamed from: O0 */
    private static final int f4725O0 = 6;

    /* renamed from: C0 */
    private final InterfaceC1312h f4728C0;

    /* renamed from: D0 */
    private boolean f4729D0;

    /* renamed from: E0 */
    private List f4730E0;

    /* renamed from: F0 */
    private List f4731F0;

    /* renamed from: G0 */
    private HashMap f4732G0;

    /* renamed from: H0 */
    private List f4733H0;

    /* renamed from: I0 */
    private int f4734I0;

    /* renamed from: J0 */
    private ChildColumn f4735J0;

    /* renamed from: K0 */
    private boolean f4736K0;

    /* renamed from: L0 */
    public Map f4737L0 = new LinkedHashMap();

    /* renamed from: A0 */
    private final String f4726A0 = C1192c.class.getSimpleName();

    /* renamed from: B0 */
    private boolean f4727B0 = true;

    /* renamed from: b9.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final int m5466a() {
            return C1192c.f4724N0;
        }

        /* renamed from: b */
        public final int m5467b() {
            return C1192c.f4725O0;
        }
    }

    /* renamed from: b9.c$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f4738a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7052a invoke() {
            return new C7052a(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b9.c$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m5469a(ChildColumn childColumn) {
            InterfaceC7381a interfaceC7381a = (InterfaceC7381a) C1192c.this.m5478w9();
            int id2 = childColumn.getId();
            a aVar = C1192c.f4723M0;
            interfaceC7381a.mo28491V2(id2, "2", aVar.m5467b(), 1, Integer.valueOf(aVar.m5467b()), 0);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5469a((ChildColumn) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b9.c$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f4740a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m5470a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5470a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C1192c() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(b.f4738a);
        this.f4728C0 = m5965b;
        this.f4730E0 = new ArrayList();
        this.f4732G0 = new HashMap();
        this.f4733H0 = new ArrayList();
    }

    /* renamed from: N9 */
    private final C7052a m5445N9() {
        return (C7052a) this.f4728C0.getValue();
    }

    /* renamed from: Q9 */
    private final void m5446Q9() {
        GetColumnContentsResultData getColumnContentsResultData;
        List<ChildColumn> childColumnList;
        Object m20485a = C5044a.f20862a.m20485a(C4300d.f18678a.m18035h());
        if (m20485a instanceof GetColumnContentsResultData) {
            getColumnContentsResultData = (GetColumnContentsResultData) m20485a;
        } else {
            getColumnContentsResultData = null;
        }
        if (getColumnContentsResultData != null && (childColumnList = getColumnContentsResultData.getChildColumnList()) != null) {
            for (ChildColumn childColumn : childColumnList) {
                if (AbstractC5868k.m23669a(childColumn.getFree(), "1")) {
                    this.f4735J0 = childColumn;
                    C1407f.f5458a.m6497V(childColumn.getId());
                }
            }
        }
    }

    /* renamed from: S9 */
    private final void m5447S9(List list) {
        Observable fromIterable = Observable.fromIterable(list);
        final c cVar = new c();
        Consumer consumer = new Consumer() { // from class: b9.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1192c.m5448T9(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f4740a;
        fromIterable.subscribe(consumer, new Consumer() { // from class: b9.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1192c.m5449U9(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T9 */
    public static final void m5448T9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U9 */
    public static final void m5449U9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: V9 */
    private final void m5450V9(ChildColumn childColumn) {
        int id2 = childColumn.getId();
        ((InterfaceC7381a) m5478w9()).mo28492f1(id2, (String) C7577i1.f27838b.m29083b().m29074f(String.valueOf(id2), ""));
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_freefragment;
    }

    @Override // p382w8.InterfaceC7382b
    /* renamed from: G0 */
    public void mo5452G0(GetLiveDataResult getLiveDataResult) {
        List<Channel> channelList;
        AbstractC5868k.m23674f(getLiveDataResult, "data");
        GetLiveDataResultData data = getLiveDataResult.getData();
        if (data != null && (channelList = data.getChannelList()) != null) {
            this.f4733H0.clear();
            this.f4733H0.addAll(channelList);
        }
        this.f4736K0 = true;
        m5457R9();
    }

    /* renamed from: K9 */
    public View m5453K9(int i10) {
        View findViewById;
        Map map = this.f4737L0;
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

    @Override // p382w8.InterfaceC7382b
    /* renamed from: N2 */
    public void mo5454N2() {
        this.f4736K0 = true;
        m5457R9();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: O9, reason: merged with bridge method [inline-methods] */
    public InterfaceC7381a mo5465y9() {
        return new C7685c(this, this);
    }

    /* renamed from: P9 */
    public boolean m5456P9() {
        if (m5445N9().m27167j()) {
            return true;
        }
        return false;
    }

    @Override // p011aa.InterfaceC0124b
    /* renamed from: Q2 */
    public boolean mo493Q2() {
        boolean z10;
        LoadingView loadingView;
        View view;
        if (m5445N9().m27165g()) {
            VerticalGridView verticalGridView = (VerticalGridView) m5453K9(R$id.mRecyclerFreeArea);
            if ((verticalGridView == null || (view = verticalGridView.getChildAt(0)) == null) && (view = (LoadingView) m5453K9(R$id.mLoadingView)) == null) {
                return false;
            }
            return view.requestFocus();
        }
        int i10 = R$id.mLoadingView;
        LoadingView loadingView2 = (LoadingView) m5453K9(i10);
        if (loadingView2 != null && loadingView2.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (loadingView = (LoadingView) m5453K9(i10)) == null) {
            return false;
        }
        return loadingView.requestFocus();
    }

    /* renamed from: R9 */
    public final void m5457R9() {
        int i10;
        if (this.f4736K0) {
            int i11 = this.f4734I0;
            List list = this.f4731F0;
            if (list != null) {
                i10 = list.size();
            } else {
                i10 = 0;
            }
            if (i11 >= i10) {
                LoadingView loadingView = (LoadingView) m5453K9(R$id.mLoadingView);
                if (loadingView != null) {
                    loadingView.setVisibility(8);
                }
                m5445N9().m27170m(this.f4730E0, this.f4733H0, this.f4732G0);
            }
        }
    }

    @Override // p430z9.AbstractC7768f, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p382w8.InterfaceC7382b
    /* renamed from: W0 */
    public void mo5458W0() {
        int i10;
        List list;
        GetColumnContentsResultData getColumnContentsResultData;
        int i11;
        if (!this.f4729D0) {
            return;
        }
        if (this.f4730E0.size() > 0 && this.f4732G0.size() > 0 && this.f4733H0.size() > 0) {
            int size = this.f4732G0.size();
            List list2 = this.f4731F0;
            if (list2 != null) {
                i11 = list2.size();
            } else {
                i11 = 0;
            }
            if (size >= i11) {
                LoadingView loadingView = (LoadingView) m5453K9(R$id.mLoadingView);
                if (loadingView != null) {
                    loadingView.setVisibility(8);
                }
                m5445N9().m27170m(this.f4730E0, this.f4733H0, this.f4732G0);
                return;
            }
        }
        int i12 = R$id.mLoadingView;
        LoadingView loadingView2 = (LoadingView) m5453K9(i12);
        if (loadingView2 != null) {
            loadingView2.setVisibility(0);
        }
        if (this.f4733H0.size() == 0) {
            if (this.f4735J0 == null) {
                m5446Q9();
                ChildColumn childColumn = this.f4735J0;
                if (childColumn != null && !this.f4730E0.contains(childColumn)) {
                    this.f4730E0.add(0, childColumn);
                }
            }
            ChildColumn childColumn2 = this.f4735J0;
            if (childColumn2 == null) {
                this.f4736K0 = true;
            }
            if (childColumn2 != null) {
                this.f4736K0 = false;
                m5450V9(childColumn2);
            }
        }
        if (this.f4731F0 == null) {
            Object m20485a = C5044a.f20862a.m20485a(C4300d.f18678a.m18029e());
            List<ChildColumn> list3 = null;
            if (m20485a instanceof GetColumnContentsResultData) {
                getColumnContentsResultData = (GetColumnContentsResultData) m20485a;
            } else {
                getColumnContentsResultData = null;
            }
            if (getColumnContentsResultData != null) {
                list3 = getColumnContentsResultData.getChildColumnList();
            }
            this.f4731F0 = list3;
            if (list3 != null) {
                this.f4730E0.addAll(list3);
            }
        }
        int size2 = this.f4732G0.size();
        List list4 = this.f4731F0;
        if (list4 != null) {
            i10 = list4.size();
        } else {
            i10 = 0;
        }
        if (size2 < i10 && (list = this.f4731F0) != null) {
            LoadingView loadingView3 = (LoadingView) m5453K9(i12);
            if (loadingView3 != null) {
                loadingView3.setVisibility(0);
            }
            this.f4732G0.clear();
            this.f4734I0 = 0;
            m5447S9(list);
        }
    }

    @Override // p011aa.InterfaceC0124b
    /* renamed from: b5 */
    public boolean mo494b5() {
        return m5445N9().m27166h();
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void freeColumDataMessage(FreeColumnGetDataEvent freeColumnGetDataEvent) {
        AbstractC5868k.m23674f(freeColumnGetDataEvent, "event");
        mo5458W0();
    }

    @Override // p430z9.AbstractC7768f, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f4737L0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        this.f4729D0 = true;
        int i10 = R$id.mRecyclerFreeArea;
        VerticalGridView verticalGridView = (VerticalGridView) m5453K9(i10);
        AbstractC5868k.m23673e(verticalGridView, "mRecyclerFreeArea");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        ((VerticalGridView) m5453K9(i10)).addItemDecoration(new SimpleItemDecoration(AutoSizeUtils.dp2px(m3096J6(), 21.0f), false, false, 4, null));
        ((VerticalGridView) m5453K9(i10)).setAdapter(m5445N9());
    }

    @Override // p011aa.InterfaceC0124b
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 != 4 && (i10 != 19 || !m5456P9())) {
            return false;
        }
        InterfaceC5642a m30066G9 = m30066G9();
        if (m30066G9 != null) {
            m30066G9.invoke();
            return true;
        }
        return true;
    }

    @Override // p382w8.InterfaceC7382b
    /* renamed from: p0 */
    public void mo5461p0(GetShelveResult getShelveResult, int i10) {
        List<AssetList> list;
        AbstractC5868k.m23674f(getShelveResult, "getShelveDataResult");
        this.f4734I0++;
        GetShelveData data = getShelveResult.getData();
        if (data != null) {
            list = data.getAssetList();
        } else {
            list = null;
        }
        if (AbstractC6567a.m25635e(list)) {
            m5457R9();
            return;
        }
        HashMap hashMap = this.f4732G0;
        Integer valueOf = Integer.valueOf(i10);
        List<AssetList> assetList = getShelveResult.getData().getAssetList();
        AbstractC5868k.m23672d(assetList, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.AssetList>");
        hashMap.put(valueOf, AbstractC5882y.m23702b(assetList));
        m5457R9();
    }

    @Override // p382w8.InterfaceC7382b
    /* renamed from: q */
    public void mo5462q(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f4734I0++;
        m5457R9();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        int i10;
        if (this.f4733H0.size() > 0) {
            int size = this.f4732G0.size();
            List list = this.f4731F0;
            if (list != null) {
                i10 = list.size();
            } else {
                i10 = 0;
            }
            if (size >= i10 && this.f4731F0 != null) {
                return;
            }
        }
        mo5458W0();
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void requestLiveColumnSuccessMessage(RequestLiveColumnSuccessEvent requestLiveColumnSuccessEvent) {
        AbstractC5868k.m23674f(requestLiveColumnSuccessEvent, "event");
        mo5458W0();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f4727B0;
    }
}
