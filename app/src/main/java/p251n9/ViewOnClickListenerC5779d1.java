package p251n9;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$mipmap;
import com.mine.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.UpdateSubscribeEvent;
import com.module.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.SubscribeData;
import com.request.result.SubscribeListData;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p100d9.C4009u0;
import p102db.DialogC4023b;
import p160h9.InterfaceC4722a0;
import p160h9.InterfaceC4724b0;
import p192j9.C5019c0;
import p302qc.C6448c;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7598p1;
import p400xa.C7578j;
import p400xa.C7589m1;
import ye.InterfaceC7719m;

/* renamed from: n9.d1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC5779d1 extends AbstractC5774c<InterfaceC4722a0> implements InterfaceC4724b0, View.OnClickListener {

    /* renamed from: C0 */
    private boolean f23139C0;

    /* renamed from: D0 */
    private DialogC4023b f23140D0;

    /* renamed from: E0 */
    private final InterfaceC1312h f23141E0;

    /* renamed from: F0 */
    private boolean f23142F0;

    /* renamed from: G0 */
    public Map f23143G0 = new LinkedHashMap();

    /* renamed from: B0 */
    private boolean f23138B0 = true;

    /* renamed from: n9.d1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f23144a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4009u0 invoke() {
            return new C4009u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.d1$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m23301a(boolean z10) {
            ViewOnClickListenerC5779d1.this.f23142F0 = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23301a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.d1$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        /* renamed from: a */
        public final void m23302a() {
            ViewOnClickListenerC5779d1.this.f23142F0 = false;
            ((AutoRelativeLayout) ViewOnClickListenerC5779d1.this.m23295W9(R$id.mEditLayout)).requestFocus();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23302a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.d1$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5664p {
        d() {
            super(2);
        }

        /* renamed from: a */
        public final void m23303a(boolean z10, SubscribeData subscribeData) {
            AbstractC5868k.m23674f(subscribeData, "bean");
            if (z10) {
                if (!C7578j.f27850a.m29087a()) {
                    ViewOnClickListenerC5779d1.this.m23297Z9(subscribeData);
                    return;
                }
                return;
            }
            ViewOnClickListenerC5779d1.this.m23298aa(subscribeData);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m23303a(((Boolean) obj).booleanValue(), (SubscribeData) obj2);
            return C1328x.f4998a;
        }
    }

    public ViewOnClickListenerC5779d1() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f23144a);
        this.f23141E0 = m5965b;
    }

    /* renamed from: ba */
    private final C4009u0 m23286ba() {
        return (C4009u0) this.f23141E0.getValue();
    }

    /* renamed from: da */
    private final void m23287da(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ((ImageView) m23295W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_blue);
                    return;
                }
                return;
            }
            ((ImageView) m23295W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_white);
            return;
        }
        ((ImageView) m23295W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_white);
    }

    /* renamed from: ea */
    private final void m23288ea(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ((ImageView) m23295W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_blue);
                    return;
                }
                return;
            }
            ((ImageView) m23295W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_white);
            return;
        }
        ((ImageView) m23295W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_white);
    }

    /* renamed from: fa */
    private final void m23289fa() {
        m23286ba().m16939z(new b());
        m23286ba().m16937E(new c());
        m23286ba().m16936D(new d());
        int i10 = R$id.mEditLayout;
        ((AutoRelativeLayout) m23295W9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n9.b1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC5779d1.m23290ga(ViewOnClickListenerC5779d1.this, view, z10);
            }
        });
        int i11 = R$id.mDeleteLayout;
        ((AutoRelativeLayout) m23295W9(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n9.c1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC5779d1.m23291ha(ViewOnClickListenerC5779d1.this, view, z10);
            }
        });
        ((AutoRelativeLayout) m23295W9(i10)).setOnClickListener(this);
        ((AutoRelativeLayout) m23295W9(i11)).setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m23290ga(ViewOnClickListenerC5779d1 viewOnClickListenerC5779d1, View view, boolean z10) {
        int i10;
        AbstractC5868k.m23674f(viewOnClickListenerC5779d1, "this$0");
        if (viewOnClickListenerC5779d1.f23139C0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            viewOnClickListenerC5779d1.m23288ea(i10);
            return;
        }
        viewOnClickListenerC5779d1.m23288ea(z10 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final void m23291ha(ViewOnClickListenerC5779d1 viewOnClickListenerC5779d1, View view, boolean z10) {
        AbstractC5868k.m23674f(viewOnClickListenerC5779d1, "this$0");
        viewOnClickListenerC5779d1.m23287da(z10 ? 1 : 0);
    }

    /* renamed from: ia */
    private final void m23292ia(String str) {
        Button m17016a;
        if (this.f23139C0) {
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.toast_enter_cancel_mode), new int[0]);
            return;
        }
        if (m23286ba().m28848f().size() == 0) {
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.no_subscribe_yet), new int[0]);
        }
        DialogC4023b dialogC4023b = new DialogC4023b(m3096J6(), R$layout.layout_delete_dialog);
        this.f23140D0 = dialogC4023b;
        dialogC4023b.m17017b(str);
        DialogC4023b dialogC4023b2 = this.f23140D0;
        if (dialogC4023b2 != null) {
            dialogC4023b2.m17019d(m3154d7().getString(R$string.dlg_ok), new DialogInterface.OnClickListener() { // from class: n9.z0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ViewOnClickListenerC5779d1.m23293ja(ViewOnClickListenerC5779d1.this, dialogInterface, i10);
                }
            });
        }
        DialogC4023b dialogC4023b3 = this.f23140D0;
        if (dialogC4023b3 != null) {
            dialogC4023b3.m17018c(m3154d7().getString(R$string.dlg_cancel), new DialogInterface.OnClickListener() { // from class: n9.a1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ViewOnClickListenerC5779d1.m23294ka(dialogInterface, i10);
                }
            });
        }
        DialogC4023b dialogC4023b4 = this.f23140D0;
        if (dialogC4023b4 != null) {
            dialogC4023b4.setCanceledOnTouchOutside(false);
        }
        DialogC4023b dialogC4023b5 = this.f23140D0;
        if (dialogC4023b5 != null) {
            dialogC4023b5.show();
        }
        DialogC4023b dialogC4023b6 = this.f23140D0;
        if (dialogC4023b6 != null && (m17016a = dialogC4023b6.m17016a()) != null) {
            m17016a.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public static final void m23293ja(ViewOnClickListenerC5779d1 viewOnClickListenerC5779d1, DialogInterface dialogInterface, int i10) {
        AbstractC5868k.m23674f(viewOnClickListenerC5779d1, "this$0");
        viewOnClickListenerC5779d1.m23296Y9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public static final void m23294ka(DialogInterface dialogInterface, int i10) {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_record;
    }

    @Override // p160h9.InterfaceC4724b0
    /* renamed from: E */
    public void mo19578E(SubscribeData subscribeData) {
        if (subscribeData == null) {
            m23286ba().m28847d();
        } else {
            m23286ba().m28853k(subscribeData);
        }
        if (m23286ba().m28848f().size() == 0) {
            m23288ea(0);
            this.f23139C0 = false;
            m23286ba().m16935A(this.f23139C0);
            TextView textView = (TextView) m23295W9(R$id.mTextNoRecords);
            if (textView != null) {
                textView.setVisibility(0);
            }
            InterfaceC5642a m23274G9 = m23274G9();
            if (m23274G9 != null) {
                m23274G9.invoke();
            }
        } else {
            VerticalGridView verticalGridView = (VerticalGridView) m23295W9(R$id.mGridView);
            if (verticalGridView != null) {
                verticalGridView.requestFocus();
            }
        }
        TextView textView2 = (TextView) m23295W9(R$id.mTotalText);
        if (textView2 != null) {
            textView2.setText(String.valueOf(m23286ba().m28848f().size()));
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: I9 */
    public boolean mo23265I9() {
        boolean z10;
        boolean z11;
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23295W9(R$id.mEditLayout);
        if (autoRelativeLayout != null && autoRelativeLayout.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        AutoRelativeLayout autoRelativeLayout2 = (AutoRelativeLayout) m23295W9(R$id.mDeleteLayout);
        if (autoRelativeLayout2 != null && autoRelativeLayout2.hasFocus()) {
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
    /* renamed from: K9 */
    public boolean mo23275K9() {
        return !m23286ba().m28848f().isEmpty();
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        boolean z10;
        boolean z11;
        boolean z12;
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23295W9(R$id.mEditLayout);
        if (autoRelativeLayout != null && autoRelativeLayout.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        AutoRelativeLayout autoRelativeLayout2 = (AutoRelativeLayout) m23295W9(R$id.mDeleteLayout);
        if (autoRelativeLayout2 != null && autoRelativeLayout2.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        VerticalGridView verticalGridView = (VerticalGridView) m23295W9(R$id.mGridView);
        if (verticalGridView != null && verticalGridView.requestFocus()) {
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
    /* renamed from: M9 */
    public boolean mo23276M9() {
        return this.f23142F0;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: N9 */
    public void mo23277N9() {
        VerticalGridView verticalGridView;
        if (m23286ba().m28848f().size() > 0 && (verticalGridView = (VerticalGridView) m23295W9(R$id.mGridView)) != null) {
            verticalGridView.requestFocus();
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p160h9.InterfaceC4724b0
    /* renamed from: W */
    public void mo19579W(SubscribeListData subscribeListData) {
        int i10;
        if (subscribeListData != null) {
            ArrayList<SubscribeData> subscribeList = subscribeListData.getSubscribeList();
            if (subscribeList != null) {
                i10 = subscribeList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                m23286ba().m28854l(subscribeListData.getSubscribeList());
                int size = m23286ba().m28848f().size();
                TextView textView = (TextView) m23295W9(R$id.mTotalText);
                if (textView != null) {
                    textView.setText(String.valueOf(size));
                }
                TextView textView2 = (TextView) m23295W9(R$id.mTextNoRecords);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    return;
                }
                return;
            }
        }
        InterfaceC5642a m23274G9 = m23274G9();
        if (m23274G9 != null) {
            m23274G9.invoke();
        }
        TextView textView3 = (TextView) m23295W9(R$id.mTotalText);
        if (textView3 != null) {
            textView3.setText(MessageService.MSG_DB_READY_REPORT);
        }
        m23286ba().m28847d();
        TextView textView4 = (TextView) m23295W9(R$id.mTextNoRecords);
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
    }

    /* renamed from: W9 */
    public View m23295W9(int i10) {
        View findViewById;
        Map map = this.f23143G0;
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

    /* renamed from: Y9 */
    protected final void m23296Y9() {
        ArrayList arrayList = new ArrayList();
        Iterator it = m23286ba().m28848f().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SubscribeData) it.next()).getSubscribeId()));
        }
        ((InterfaceC4722a0) m5478w9()).mo19576D2(arrayList, null);
    }

    /* renamed from: Z9 */
    protected final void m23297Z9(SubscribeData subscribeData) {
        AbstractC5868k.m23674f(subscribeData, "bean");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(subscribeData.getSubscribeId()));
        ((InterfaceC4722a0) m5478w9()).mo19576D2(arrayList, subscribeData);
    }

    /* renamed from: aa */
    protected final void m23298aa(SubscribeData subscribeData) {
        AbstractC5868k.m23674f(subscribeData, "programModel");
        C6448c.m25240q(C5634i.m22843d("http://module_vod/VodDetailsActivity").m25257w("extra_content_id", subscribeData.getContentId()).m25257w("extra_play_type", "1").m25257w("extra_type", subscribeData.getType()).m25257w("extra_umeng_event_key", C7589m1.c.f27901a.m29168f()).m25257w("extra_play_entrance", "subscribe").m25253s("extra_ts", AbstractC5868k.m23669a(subscribeData.getContentType(), "1")).m25253s("extra_from_router", true).m25254t(262144), m3096J6(), null, 2, null);
    }

    @Override // p160h9.InterfaceC4724b0
    /* renamed from: b0 */
    public void mo19580b0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    @Override // p160h9.InterfaceC4724b0
    /* renamed from: c */
    public void mo19581c() {
        LoadingView loadingView = (LoadingView) m23295W9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
        TextView textView = (TextView) m23295W9(R$id.mTextNoRecords);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: ca, reason: merged with bridge method [inline-methods] */
    public InterfaceC4722a0 mo5465y9() {
        return new C5019c0(this, this);
    }

    @Override // p160h9.InterfaceC4724b0
    /* renamed from: d */
    public void mo19582d() {
        LoadingView loadingView = (LoadingView) m23295W9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    @Override // p160h9.InterfaceC4724b0
    /* renamed from: g0 */
    public void mo19583g0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractActivityC0712e m3075C6 = m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
        AbstractActivityC2972a.m11957W5((AbstractActivityC2972a) m3075C6, str, true, null, null, null, null, null, 124, null);
    }

    @InterfaceC7719m
    public final void handSubscribeUpdate(UpdateSubscribeEvent updateSubscribeEvent) {
        AbstractC5868k.m23674f(updateSubscribeEvent, "event");
        ((InterfaceC4722a0) m5478w9()).mo19577Q0();
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23143G0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m23286ba().setHasStableIds(true);
        int i10 = R$id.mGridView;
        ((VerticalGridView) m23295W9(i10)).setAdapter(m23286ba());
        VerticalGridView verticalGridView = (VerticalGridView) m23295W9(i10);
        AbstractC5868k.m23673e(verticalGridView, "mGridView");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        int i11 = R$id.mTextNoRecords;
        ((TextView) m23295W9(i11)).setVisibility(8);
        ((TextView) m23295W9(i11)).setText(m3172j7(R$string.no_subscribe_yet));
        m23289fa();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mEditLayout) {
            int i10 = 1;
            this.f23139C0 = !this.f23139C0;
            m23286ba().m16935A(this.f23139C0);
            if (this.f23139C0) {
                if (!view.hasFocus()) {
                    i10 = 2;
                }
                m23288ea(i10);
            } else {
                m23288ea(view.hasFocus() ? 1 : 0);
            }
            VerticalGridView verticalGridView = (VerticalGridView) m23295W9(R$id.mGridView);
            if (verticalGridView != null) {
                verticalGridView.requestFocus();
            }
            m23286ba().notifyDataSetChanged();
            return;
        }
        if (id2 == R$id.mDeleteLayout) {
            String string = m3154d7().getString(R$string.vod_delete_all_records);
            AbstractC5868k.m23673e(string, "resources.getString(R.st…g.vod_delete_all_records)");
            m23292ia(string);
        }
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        AbstractC5868k.m23674f(keyEvent, "event");
        C1328x c1328x = null;
        if (i10 != 4) {
            if (i10 != 20) {
                if (i10 == 21 && ((AutoRelativeLayout) m23295W9(R$id.mEditLayout)).hasFocus()) {
                    InterfaceC5642a m23274G9 = m23274G9();
                    if (m23274G9 != null) {
                        m23274G9.invoke();
                        c1328x = C1328x.f4998a;
                    }
                    if (c1328x != null) {
                        return true;
                    }
                    return false;
                }
            } else if (((AutoRelativeLayout) m23295W9(R$id.mEditLayout)).hasFocus() || ((AutoRelativeLayout) m23295W9(R$id.mDeleteLayout)).hasFocus()) {
                TextView textView = (TextView) m23295W9(R$id.mTextNoRecords);
                if (textView != null && textView.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }
        if (this.f23139C0) {
            this.f23139C0 = false;
            m23288ea(0);
            m23286ba().m16935A(this.f23139C0);
            m23286ba().notifyDataSetChanged();
            return true;
        }
        InterfaceC5642a m23274G92 = m23274G9();
        if (m23274G92 != null) {
            m23274G92.invoke();
            c1328x = C1328x.f4998a;
        }
        if (c1328x != null) {
            return true;
        }
        return false;
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        ((InterfaceC4722a0) m5478w9()).mo19577Q0();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23138B0;
    }
}
