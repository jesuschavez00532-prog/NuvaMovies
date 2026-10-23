package p251n9;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.view.LoadingView;
import com.request.result.ExchangeOrderInfo;
import com.request.result.GetExchangeOrderInfoResult;
import com.request.result.GetOrderInfoResult;
import com.request.result.OrderInfo;
import com.widget.utils.SimpleItemDecoration;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1501m;
import p043ce.AbstractC1508t;
import p100d9.C4010v;
import p100d9.C4014z;
import p160h9.InterfaceC4743s;
import p160h9.InterfaceC4744t;
import p192j9.C5039v;
import p359ue.AbstractC7166t;
import ye.InterfaceC7719m;

/* renamed from: n9.e0 */
/* loaded from: classes.dex */
public final class C5781e0 extends AbstractC5774c<InterfaceC4743s> implements InterfaceC4744t, AdapterView.OnItemSelectedListener {

    /* renamed from: C0 */
    private C4010v f23150C0;

    /* renamed from: D0 */
    private List f23151D0;

    /* renamed from: E0 */
    private final InterfaceC1312h f23152E0;

    /* renamed from: F0 */
    private String f23153F0;

    /* renamed from: G0 */
    private int f23154G0;

    /* renamed from: H0 */
    private boolean f23155H0;

    /* renamed from: I0 */
    public Map f23156I0 = new LinkedHashMap();

    /* renamed from: B0 */
    private boolean f23149B0 = true;

    /* renamed from: n9.e0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m23318a(boolean z10) {
            C5781e0.this.f23155H0 = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23318a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.e0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m23319a() {
            View childAt;
            Log.d("OrderHistory", "mCurIndex:" + C5781e0.this.f23154G0);
            RecyclerView recyclerView = (RecyclerView) C5781e0.this.m23314U9(R$id.recyclerView);
            if (recyclerView != null && (childAt = recyclerView.getChildAt(C5781e0.this.f23154G0)) != null) {
                childAt.requestFocus();
            }
            C5781e0.this.f23155H0 = false;
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23319a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.e0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5664p {
        c() {
            super(2);
        }

        /* renamed from: a */
        public final void m23320a(int i10, boolean z10) {
            String str;
            boolean m27724k;
            String m3172j7;
            C4010v c4010v = C5781e0.this.f23150C0;
            if (c4010v != null) {
                c4010v.m16948x(z10);
            }
            C5781e0.this.f23154G0 = i10;
            List m23315aa = C5781e0.this.m23315aa();
            if (m23315aa != null) {
                str = (String) m23315aa.get(i10);
            } else {
                str = null;
            }
            m27724k = AbstractC7166t.m27724k(str, C5781e0.this.m3154d7().getString(R$string.personal_order_history), false, 2, null);
            if (m27724k) {
                ((InterfaceC4743s) C5781e0.this.m5478w9()).mo19622L1();
            } else {
                ((InterfaceC4743s) C5781e0.this.m5478w9()).mo19623p2();
            }
            if (C1466m0.f5627a.m6842O()) {
                C5781e0 c5781e0 = C5781e0.this;
                int i11 = R$id.mTextNoRecords;
                TextView textView = (TextView) c5781e0.m23314U9(i11);
                if (textView != null) {
                    if (MessageService.MSG_DB_READY_REPORT.equals(C5781e0.this.mo19624B1())) {
                        m3172j7 = C5781e0.this.m3172j7(R$string.personal_no_order_recordes);
                    } else {
                        m3172j7 = C5781e0.this.m3172j7(R$string.personal_no_conversion_recordes);
                    }
                    textView.setText(m3172j7);
                }
                ImageView imageView = (ImageView) C5781e0.this.m23314U9(R$id.mIvNoRecords);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                TextView textView2 = (TextView) C5781e0.this.m23314U9(i11);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                RecyclerView recyclerView = (RecyclerView) C5781e0.this.m23314U9(R$id.mListView);
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m23320a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.e0$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f23160a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4014z invoke() {
            return new C4014z();
        }
    }

    public C5781e0() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(d.f23160a);
        this.f23152E0 = m5965b;
        this.f23153F0 = MessageService.MSG_DB_READY_REPORT;
    }

    /* renamed from: W0 */
    private final void m23307W0() {
        List m6989h;
        List m6989h2;
        Log.d("OrderHistory", "initData");
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6838K()) {
            String string = m3154d7().getString(R$string.personal_order_history);
            AbstractC5868k.m23673e(string, "resources.getString(R.st…g.personal_order_history)");
            String string2 = m3154d7().getString(R$string.personal_exchange_record);
            AbstractC5868k.m23673e(string2, "resources.getString(R.st…personal_exchange_record)");
            m6989h2 = AbstractC1500l.m6989h(string, string2);
            this.f23151D0 = m6989h2;
            m23317ea(MessageService.MSG_DB_READY_REPORT);
        } else if (c1466m0.m6839L()) {
            String string3 = m3154d7().getString(R$string.personal_exchange_record);
            AbstractC5868k.m23673e(string3, "resources.getString(R.st…personal_exchange_record)");
            m6989h = AbstractC1500l.m6989h(string3);
            this.f23151D0 = m6989h;
            m23317ea("1");
        }
        Log.d("OrderHistory", "mTitles:" + this.f23151D0);
        int i10 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) m23314U9(i10);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(m3107M8(), 0, false));
        }
        C4010v c4010v = new C4010v();
        this.f23150C0 = c4010v;
        c4010v.m28856n(this.f23151D0);
        RecyclerView recyclerView2 = (RecyclerView) m23314U9(i10);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f23150C0);
        }
        RecyclerView recyclerView3 = (RecyclerView) m23314U9(i10);
        if (recyclerView3 != null) {
            recyclerView3.post(new Runnable() { // from class: n9.d0
                @Override // java.lang.Runnable
                public final void run() {
                    C5781e0.m23312ca(C5781e0.this);
                }
            });
        }
        C4010v c4010v2 = this.f23150C0;
        if (c4010v2 != null) {
            c4010v2.m16947w(new c());
        }
    }

    /* renamed from: Z9 */
    private final C4014z m23311Z9() {
        return (C4014z) this.f23152E0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final void m23312ca(C5781e0 c5781e0) {
        View view;
        AbstractC5868k.m23674f(c5781e0, "this$0");
        RecyclerView recyclerView = (RecyclerView) c5781e0.m23314U9(R$id.recyclerView);
        if (recyclerView != null) {
            view = recyclerView.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da */
    public static final void m23313da(C5781e0 c5781e0) {
        View childAt;
        AbstractC5868k.m23674f(c5781e0, "this$0");
        int i10 = R$id.mListView;
        RecyclerView recyclerView = (RecyclerView) c5781e0.m23314U9(i10);
        if (recyclerView != null) {
            recyclerView.requestFocusFromTouch();
        }
        RecyclerView recyclerView2 = (RecyclerView) c5781e0.m23314U9(i10);
        if (recyclerView2 != null && (childAt = recyclerView2.getChildAt(0)) != null) {
            childAt.requestFocus();
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_order_history;
    }

    @Override // p160h9.InterfaceC4744t
    /* renamed from: B1 */
    public String mo19624B1() {
        return this.f23153F0;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        boolean z10;
        boolean z11;
        boolean z12;
        View childAt;
        int i10 = R$id.mListView;
        RecyclerView recyclerView = (RecyclerView) m23314U9(i10);
        if (recyclerView != null && recyclerView.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f23155H0 = false;
        }
        RecyclerView recyclerView2 = (RecyclerView) m23314U9(R$id.recyclerView);
        if (recyclerView2 != null && (childAt = recyclerView2.getChildAt(0)) != null && childAt.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        RecyclerView recyclerView3 = (RecyclerView) m23314U9(i10);
        if (recyclerView3 != null && recyclerView3.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: I9 */
    public boolean mo23265I9() {
        return this.f23155H0;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: J9 */
    public boolean mo23244J9() {
        View view;
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23314U9(R$id.mRootLayout);
        if (autoLinearLayout != null) {
            view = autoLinearLayout.getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    @Override // p160h9.InterfaceC4744t
    /* renamed from: L */
    public void mo19625L(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractActivityC0712e m3075C6 = m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
        AbstractActivityC2972a.m11957W5((AbstractActivityC2972a) m3075C6, str, false, null, null, null, null, null, 126, null);
        int i10 = R$id.mTextNoRecords;
        TextView textView = (TextView) m23314U9(i10);
        if (textView != null) {
            textView.setText(m3172j7(R$string.personal_order_record_get_failed));
        }
        TextView textView2 = (TextView) m23314U9(i10);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ImageView imageView = (ImageView) m23314U9(R$id.mIvNoRecords);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) m23314U9(R$id.mListView);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23314U9(R$id.mRootLayout);
        if (autoLinearLayout == null || autoLinearLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: M9 */
    public boolean mo23276M9() {
        RecyclerView recyclerView = (RecyclerView) m23314U9(R$id.mListView);
        if (recyclerView == null || !recyclerView.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: N9 */
    public void mo23277N9() {
        RecyclerView recyclerView = (RecyclerView) m23314U9(R$id.mListView);
        if (recyclerView != null) {
            recyclerView.requestFocus();
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    public void mo23245O9() {
        View view;
        boolean z10;
        View childAt;
        View childAt2;
        int i10 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) m23314U9(i10);
        if (recyclerView != null && (childAt2 = recyclerView.getChildAt(0)) != null) {
            childAt2.requestFocus();
        }
        RecyclerView recyclerView2 = (RecyclerView) m23314U9(i10);
        View view2 = null;
        if (recyclerView2 != null) {
            view = recyclerView2.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(false);
        }
        List list = this.f23151D0;
        if (list != null && list.size() >= 1) {
            RecyclerView recyclerView3 = (RecyclerView) m23314U9(i10);
            if (recyclerView3 != null && (childAt = recyclerView3.getChildAt(1)) != null && childAt.isSelected()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                RecyclerView recyclerView4 = (RecyclerView) m23314U9(i10);
                if (recyclerView4 != null) {
                    view2 = recyclerView4.getChildAt(1);
                }
                if (view2 != null) {
                    view2.setSelected(false);
                }
            }
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: U9 */
    public View m23314U9(int i10) {
        View findViewById;
        Map map = this.f23156I0;
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

    /* renamed from: aa */
    public final List m23315aa() {
        return this.f23151D0;
    }

    @Override // ba.AbstractC1196d
    /* renamed from: ba, reason: merged with bridge method [inline-methods] */
    public InterfaceC4743s mo5465y9() {
        return new C5039v(this, this);
    }

    @Override // p160h9.InterfaceC4744t
    /* renamed from: c */
    public void mo19626c() {
        LoadingView loadingView = (LoadingView) m23314U9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
    }

    @Override // p160h9.InterfaceC4744t
    /* renamed from: d */
    public void mo19627d() {
        LoadingView loadingView = (LoadingView) m23314U9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    /* renamed from: ea */
    public void m23317ea(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f23153F0 = str;
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        if (C1466m0.f5627a.m6840M()) {
            ((InterfaceC4743s) m5478w9()).getRequest();
        }
    }

    @Override // p160h9.InterfaceC4744t
    /* renamed from: i0 */
    public void mo19628i0(GetOrderInfoResult getOrderInfoResult) {
        int i10 = 0;
        List list;
        int m6992k;
        AbstractC5868k.m23674f(getOrderInfoResult, "data");
        List<OrderInfo> data = getOrderInfoResult.getData();
        if (data != null) {
            i10 = data.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            TextView textView = (TextView) m23314U9(R$id.mTextNoRecords);
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = (ImageView) m23314U9(R$id.mIvNoRecords);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            RecyclerView recyclerView = (RecyclerView) m23314U9(R$id.mListView);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            List<OrderInfo> data2 = getOrderInfoResult.getData();
            Integer num = null;
            if (data2 != null) {
                m6992k = AbstractC1501m.m6992k(data2, 10);
                ArrayList arrayList = new ArrayList(m6992k);
                for (OrderInfo orderInfo : data2) {
                    AbstractC5868k.m23672d(orderInfo, "null cannot be cast to non-null type kotlin.Any");
                    arrayList.add(orderInfo);
                }
                list = AbstractC1508t.m7001F(arrayList);
            } else {
                list = null;
            }
            m23311Z9().m28854l(list);
            m23311Z9().notifyDataSetChanged();
            int i11 = R$id.text_order_history_num;
            TextView textView2 = (TextView) m23314U9(i11);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = (TextView) m23314U9(i11);
            if (textView3 != null) {
                int i12 = R$string.total;
                Object[] objArr = new Object[1];
                List<OrderInfo> data3 = getOrderInfoResult.getData();
                if (data3 != null) {
                    num = Integer.valueOf(data3.size());
                }
                objArr[0] = num;
                textView3.setText(m3175k7(i12, objArr));
                return;
            }
            return;
        }
        int i13 = R$id.mTextNoRecords;
        TextView textView4 = (TextView) m23314U9(i13);
        if (textView4 != null) {
            textView4.setText(m3172j7(R$string.personal_no_order_recordes));
        }
        TextView textView5 = (TextView) m23314U9(i13);
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) m23314U9(R$id.mIvNoRecords);
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        RecyclerView recyclerView2 = (RecyclerView) m23314U9(R$id.mListView);
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        TextView textView6 = (TextView) m23314U9(R$id.text_order_history_num);
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23156I0.clear();
    }

    @Override // p160h9.InterfaceC4744t
    /* renamed from: n0 */
    public void mo19629n0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractActivityC0712e m3075C6 = m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
        AbstractActivityC2972a.m11957W5((AbstractActivityC2972a) m3075C6, str, false, null, null, null, null, null, 126, null);
        LoadingView loadingView = (LoadingView) m23314U9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
        int i10 = R$id.mTextNoRecords;
        TextView textView = (TextView) m23314U9(i10);
        if (textView != null) {
            textView.setText(m3172j7(R$string.personal_conversion_record_get_failed));
        }
        TextView textView2 = (TextView) m23314U9(i10);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ImageView imageView = (ImageView) m23314U9(R$id.mIvNoRecords);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) m23314U9(R$id.mListView);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m23307W0();
        m23311Z9().setHasStableIds(true);
        int i10 = R$id.mListView;
        RecyclerView recyclerView = (RecyclerView) m23314U9(i10);
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }
        RecyclerView recyclerView2 = (RecyclerView) m23314U9(i10);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(m3107M8(), 1, false));
        }
        RecyclerView recyclerView3 = (RecyclerView) m23314U9(i10);
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new SimpleItemDecoration(AutoSizeUtils.dp2px(m3096J6(), 32.0f), false, false, 4, null));
        }
        RecyclerView recyclerView4 = (RecyclerView) m23314U9(i10);
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(m23311Z9());
        }
        m23311Z9().m16960v(new a());
        m23279Q9(new b());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        View view;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 20) {
            int i11 = R$id.recyclerView;
            if (((RecyclerView) m23314U9(i11)).hasFocus()) {
                int i12 = R$id.mListView;
                RecyclerView recyclerView = (RecyclerView) m23314U9(i12);
                if (recyclerView != null && recyclerView.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    RecyclerView recyclerView2 = (RecyclerView) m23314U9(i12);
                    if (recyclerView2 != null) {
                        recyclerView2.post(new Runnable() { // from class: n9.c0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5781e0.m23313da(C5781e0.this);
                            }
                        });
                    }
                } else {
                    RecyclerView recyclerView3 = (RecyclerView) m23314U9(i11);
                    if (recyclerView3 != null) {
                        view = recyclerView3.getChildAt(this.f23154G0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.setSelected(false);
                    }
                }
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @InterfaceC7719m
    public final void refreshUerInfoDisplayMessage(RefreshUerInfoDisplayEvent refreshUerInfoDisplayEvent) {
        AbstractC5868k.m23674f(refreshUerInfoDisplayEvent, "event");
        m23307W0();
        ((InterfaceC4743s) m5478w9()).mo19621H();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23149B0;
    }

    @Override // p160h9.InterfaceC4744t
    /* renamed from: y */
    public void mo19630y(GetExchangeOrderInfoResult getExchangeOrderInfoResult) {
        List list;
        int m6992k;
        AbstractC5868k.m23674f(getExchangeOrderInfoResult, "data");
        if (getExchangeOrderInfoResult.getData().size() > 0) {
            TextView textView = (TextView) m23314U9(R$id.mTextNoRecords);
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = (ImageView) m23314U9(R$id.mIvNoRecords);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            RecyclerView recyclerView = (RecyclerView) m23314U9(R$id.mListView);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            List<ExchangeOrderInfo> data = getExchangeOrderInfoResult.getData();
            if (data != null) {
                m6992k = AbstractC1501m.m6992k(data, 10);
                ArrayList arrayList = new ArrayList(m6992k);
                for (ExchangeOrderInfo exchangeOrderInfo : data) {
                    AbstractC5868k.m23672d(exchangeOrderInfo, "null cannot be cast to non-null type kotlin.Any");
                    arrayList.add(exchangeOrderInfo);
                }
                list = AbstractC1508t.m7001F(arrayList);
            } else {
                list = null;
            }
            m23311Z9().m28854l(list);
            m23311Z9().notifyDataSetChanged();
            int i10 = R$id.text_order_history_num;
            TextView textView2 = (TextView) m23314U9(i10);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = (TextView) m23314U9(i10);
            if (textView3 != null) {
                textView3.setText(m3175k7(R$string.total, Integer.valueOf(getExchangeOrderInfoResult.getData().size())));
                return;
            }
            return;
        }
        int i11 = R$id.mTextNoRecords;
        TextView textView4 = (TextView) m23314U9(i11);
        if (textView4 != null) {
            textView4.setText(m3172j7(R$string.personal_no_conversion_recordes));
        }
        TextView textView5 = (TextView) m23314U9(i11);
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) m23314U9(R$id.mIvNoRecords);
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        RecyclerView recyclerView2 = (RecyclerView) m23314U9(R$id.mListView);
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        TextView textView6 = (TextView) m23314U9(R$id.text_order_history_num);
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
    }
}
