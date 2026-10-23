package p251n9;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$mipmap;
import com.mine.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.UpdateVodFavEvent;
import com.module.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.FavoriteList;
import com.request.result.GetFavoritesResultData;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p100d9.C3992m;
import p101da.ViewOnClickListenerC4018d;
import p101da.ViewOnClickListenerC4019e;
import p102db.DialogC4023b;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p132fa.C4300d;
import p160h9.InterfaceC4733i;
import p160h9.InterfaceC4734j;
import p192j9.C5031n;
import p302qc.C6448c;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7598p1;
import p400xa.C7578j;
import p400xa.C7589m1;
import ye.InterfaceC7719m;

/* renamed from: n9.l */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC5800l extends AbstractC5774c<InterfaceC4733i> implements InterfaceC4734j, View.OnClickListener {

    /* renamed from: J0 */
    public static final a f23212J0 = new a(null);

    /* renamed from: C0 */
    private final InterfaceC1312h f23214C0;

    /* renamed from: D0 */
    private boolean f23215D0;

    /* renamed from: E0 */
    private boolean f23216E0;

    /* renamed from: F0 */
    private DialogC4023b f23217F0;

    /* renamed from: G0 */
    private boolean f23218G0;

    /* renamed from: H0 */
    private boolean f23219H0;

    /* renamed from: I0 */
    public Map f23220I0 = new LinkedHashMap();

    /* renamed from: B0 */
    private final String f23213B0 = "FavoriteFragment";

    /* renamed from: n9.l$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: n9.l$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f23221a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3992m invoke() {
            return new C3992m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.l$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m23416a(boolean z10) {
            ViewOnClickListenerC5800l.this.f23219H0 = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23416a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.l$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        /* renamed from: a */
        public final void m23417a() {
            ViewOnClickListenerC5800l.this.f23219H0 = false;
            ((AutoRelativeLayout) ViewOnClickListenerC5800l.this.m23410W9(R$id.mEditLayout)).requestFocus();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23417a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.l$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5664p {
        e() {
            super(2);
        }

        /* renamed from: a */
        public final void m23418a(boolean z10, FavoriteList favoriteList) {
            AbstractC5868k.m23674f(favoriteList, "bean");
            if (z10) {
                if (!C7578j.f27850a.m29087a()) {
                    ViewOnClickListenerC5800l.this.m23412aa(favoriteList);
                    return;
                }
                return;
            }
            ViewOnClickListenerC5800l.this.m23413ba(favoriteList);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m23418a(((Boolean) obj).booleanValue(), (FavoriteList) obj2);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.l$f */
    /* loaded from: classes2.dex */
    public static final class f implements ViewOnClickListenerC4019e.a {

        /* renamed from: b */
        final /* synthetic */ boolean f23226b;

        f(boolean z10) {
            this.f23226b = z10;
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: Z2 */
        public void mo17006Z2() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: b2 */
        public void mo17007b2() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: n2 */
        public void mo17008n2() {
            C4160d.b bVar = C4160d.f18217d;
            Context m3096J6 = ViewOnClickListenerC5800l.this.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            Context m3096J62 = ViewOnClickListenerC5800l.this.m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            String string = m3096J62.getString(R$string.pwd_set_suc);
            AbstractC5868k.m23673e(string, "context!!.getString(R.string.pwd_set_suc)");
            C4160d.b.m17389f(bVar, m3096J6, string, false, 4, null);
            ViewOnClickListenerC5800l.this.m23404ja(this.f23226b);
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: q0 */
        public void mo17009q0() {
            ViewOnClickListenerC4019e.a.C7837a.m17010a(this);
        }
    }

    /* renamed from: n9.l$g */
    /* loaded from: classes2.dex */
    public static final class g implements ViewOnClickListenerC4018d.a {

        /* renamed from: b */
        final /* synthetic */ boolean f23228b;

        g(boolean z10) {
            this.f23228b = z10;
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            ViewOnClickListenerC4018d.a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            ViewOnClickListenerC5800l.this.m23404ja(this.f23228b);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
        }
    }

    public ViewOnClickListenerC5800l() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(b.f23221a);
        this.f23214C0 = m5965b;
        this.f23215D0 = true;
    }

    /* renamed from: ca */
    private final C3992m m23398ca() {
        return (C3992m) this.f23214C0.getValue();
    }

    /* renamed from: ea */
    private final void m23399ea(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ((ImageView) m23410W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_blue);
                    return;
                }
                return;
            }
            ((ImageView) m23410W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_white);
            return;
        }
        ((ImageView) m23410W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_white);
    }

    /* renamed from: fa */
    private final void m23400fa(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ((ImageView) m23410W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_blue);
                    return;
                }
                return;
            }
            ((ImageView) m23410W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_white);
            return;
        }
        ((ImageView) m23410W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_white);
    }

    /* renamed from: ga */
    private final void m23401ga() {
        m23398ca().m16899z(new c());
        m23398ca().m16897E(new d());
        m23398ca().m16896D(new e());
        int i10 = R$id.mEditLayout;
        ((AutoRelativeLayout) m23410W9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n9.h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC5800l.m23402ha(ViewOnClickListenerC5800l.this, view, z10);
            }
        });
        int i11 = R$id.mDeleteLayout;
        ((AutoRelativeLayout) m23410W9(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n9.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC5800l.m23403ia(ViewOnClickListenerC5800l.this, view, z10);
            }
        });
        ((AutoRelativeLayout) m23410W9(i10)).setOnClickListener(this);
        ((AutoRelativeLayout) m23410W9(i11)).setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final void m23402ha(ViewOnClickListenerC5800l viewOnClickListenerC5800l, View view, boolean z10) {
        int i10 = 0;
        AbstractC5868k.m23674f(viewOnClickListenerC5800l, "this$0");
        if (viewOnClickListenerC5800l.f23216E0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            viewOnClickListenerC5800l.m23400fa(i10);
            return;
        }
        viewOnClickListenerC5800l.m23400fa(z10 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ia */
    public static final void m23403ia(ViewOnClickListenerC5800l viewOnClickListenerC5800l, View view, boolean z10) {
        AbstractC5868k.m23674f(viewOnClickListenerC5800l, "this$0");
        viewOnClickListenerC5800l.m23399ea(z10 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public final void m23404ja(boolean z10) {
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23410W9(R$id.mTitleLayout);
        if (autoRelativeLayout != null) {
            autoRelativeLayout.setVisibility(0);
        }
        VerticalGridView verticalGridView = (VerticalGridView) m23410W9(R$id.mGridView);
        if (verticalGridView != null) {
            verticalGridView.setVisibility(0);
        }
        if (z10) {
            ((InterfaceC4733i) m5478w9()).mo19606r();
        } else {
            ((InterfaceC4733i) m5478w9()).mo19604A3();
        }
    }

    /* renamed from: ka */
    private final void m23405ka(boolean z10) {
        if (TextUtils.isEmpty(AbstractC4161e.f18225a.m17399b())) {
            C4160d m17390a = C4160d.f18217d.m17390a();
            AbstractC0729o m3093I6 = m3093I6();
            AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
            C4160d.m17381p(m17390a, m3093I6, new f(z10), false, false, 12, null);
            return;
        }
        C4160d m17390a2 = C4160d.f18217d.m17390a();
        AbstractC0729o m3093I62 = m3093I6();
        AbstractC5868k.m23673e(m3093I62, "childFragmentManager");
        C4160d.m17379m(m17390a2, m3093I62, new g(z10), false, 4, null);
    }

    /* renamed from: la */
    private final void m23406la(String str) {
        Button m17016a;
        if (this.f23216E0) {
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.toast_enter_cancel_mode), new int[0]);
            return;
        }
        if (m23398ca().m28848f().size() == 0) {
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.empty_fav), new int[0]);
        }
        DialogC4023b dialogC4023b = new DialogC4023b(m3096J6(), R$layout.layout_delete_dialog);
        this.f23217F0 = dialogC4023b;
        dialogC4023b.m17017b(str);
        DialogC4023b dialogC4023b2 = this.f23217F0;
        if (dialogC4023b2 != null) {
            dialogC4023b2.m17019d(m3154d7().getString(R$string.dlg_ok), new DialogInterface.OnClickListener() { // from class: n9.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ViewOnClickListenerC5800l.m23407ma(ViewOnClickListenerC5800l.this, dialogInterface, i10);
                }
            });
        }
        DialogC4023b dialogC4023b3 = this.f23217F0;
        if (dialogC4023b3 != null) {
            dialogC4023b3.m17018c(m3154d7().getString(R$string.dlg_cancel), new DialogInterface.OnClickListener() { // from class: n9.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ViewOnClickListenerC5800l.m23408na(dialogInterface, i10);
                }
            });
        }
        DialogC4023b dialogC4023b4 = this.f23217F0;
        if (dialogC4023b4 != null) {
            dialogC4023b4.setCanceledOnTouchOutside(false);
        }
        DialogC4023b dialogC4023b5 = this.f23217F0;
        if (dialogC4023b5 != null) {
            dialogC4023b5.show();
        }
        DialogC4023b dialogC4023b6 = this.f23217F0;
        if (dialogC4023b6 != null && (m17016a = dialogC4023b6.m17016a()) != null) {
            m17016a.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ma */
    public static final void m23407ma(ViewOnClickListenerC5800l viewOnClickListenerC5800l, DialogInterface dialogInterface, int i10) {
        AbstractC5868k.m23674f(viewOnClickListenerC5800l, "this$0");
        viewOnClickListenerC5800l.m23411Z9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: na */
    public static final void m23408na(DialogInterface dialogInterface, int i10) {
    }

    /* renamed from: oa */
    private final void m23409oa(boolean z10) {
        if (m3075C6() == null) {
            return;
        }
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23410W9(R$id.mTitleLayout);
        if (autoRelativeLayout != null) {
            autoRelativeLayout.setVisibility(4);
        }
        VerticalGridView verticalGridView = (VerticalGridView) m23410W9(R$id.mGridView);
        if (verticalGridView != null) {
            verticalGridView.setVisibility(4);
        }
        m23405ka(z10);
    }

    @Override // p160h9.InterfaceC4734j
    /* renamed from: A */
    public void mo19607A(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractActivityC0712e m3075C6 = m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
        AbstractActivityC2972a.m11957W5((AbstractActivityC2972a) m3075C6, str, true, null, null, null, null, null, 124, null);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_record;
    }

    @Override // p160h9.InterfaceC4734j
    /* renamed from: G2 */
    public boolean mo19608G2() {
        return this.f23218G0;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        return false;
    }

    @Override // p160h9.InterfaceC4734j
    /* renamed from: I */
    public void mo19609I(GetFavoritesResultData getFavoritesResultData) {
        int i10 = 0;
        if (getFavoritesResultData != null) {
            List<FavoriteList> favoriteList = getFavoritesResultData.getFavoriteList();
            if (favoriteList != null) {
                i10 = favoriteList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                m23398ca().m28854l(getFavoritesResultData.getFavoriteList());
                int size = m23398ca().m28848f().size();
                TextView textView = (TextView) m23410W9(R$id.mTotalText);
                if (textView != null) {
                    textView.setText(String.valueOf(size));
                }
                TextView textView2 = (TextView) m23410W9(R$id.mTextNoRecords);
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
        TextView textView3 = (TextView) m23410W9(R$id.mTotalText);
        if (textView3 != null) {
            textView3.setText(MessageService.MSG_DB_READY_REPORT);
        }
        m23398ca().m28847d();
        TextView textView4 = (TextView) m23410W9(R$id.mTextNoRecords);
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: I9 */
    public boolean mo23265I9() {
        boolean z10;
        boolean z11;
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23410W9(R$id.mEditLayout);
        if (autoRelativeLayout != null && autoRelativeLayout.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        AutoRelativeLayout autoRelativeLayout2 = (AutoRelativeLayout) m23410W9(R$id.mDeleteLayout);
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
        return !m23398ca().m28848f().isEmpty();
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        boolean z10;
        boolean z11;
        boolean z12;
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23410W9(R$id.mEditLayout);
        if (autoRelativeLayout != null && autoRelativeLayout.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        AutoRelativeLayout autoRelativeLayout2 = (AutoRelativeLayout) m23410W9(R$id.mDeleteLayout);
        if (autoRelativeLayout2 != null && autoRelativeLayout2.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        VerticalGridView verticalGridView = (VerticalGridView) m23410W9(R$id.mGridView);
        if (verticalGridView != null && verticalGridView.hasFocus()) {
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
        return this.f23219H0;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: N9 */
    public void mo23277N9() {
        if (m23398ca().m28848f().size() > 0) {
            VerticalGridView verticalGridView = (VerticalGridView) m23410W9(R$id.mGridView);
            if (verticalGridView != null) {
                verticalGridView.requestFocus();
                return;
            }
            return;
        }
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23410W9(R$id.mEditLayout);
        if (autoRelativeLayout != null) {
            autoRelativeLayout.requestFocus();
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: W9 */
    public View m23410W9(int i10) {
        View findViewById;
        Map map = this.f23220I0;
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

    /* renamed from: Z9 */
    protected final void m23411Z9() {
        ArrayList arrayList = new ArrayList();
        Iterator it = m23398ca().m28848f().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((FavoriteList) it.next()).getId()));
        }
        ((InterfaceC4733i) m5478w9()).mo19605m1(arrayList, null);
    }

    /* renamed from: aa */
    protected final void m23412aa(FavoriteList favoriteList) {
        AbstractC5868k.m23674f(favoriteList, "bean");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(favoriteList.getId()));
        ((InterfaceC4733i) m5478w9()).mo19605m1(arrayList, favoriteList);
    }

    /* renamed from: ba */
    protected final void m23413ba(FavoriteList favoriteList) {
        AbstractC5868k.m23674f(favoriteList, "programModel");
        if (AbstractC5868k.m23669a(C4300d.f18678a.m18066w0(), favoriteList.getType())) {
            C6448c.m25240q(C5634i.m22843d("http://module_vod/TopicActivity").m25257w("extra_topic_column_id", favoriteList.getContentId()).m25257w("extra_topic_name", favoriteList.getName()).m25257w("extra_topic_alias", favoriteList.getAlias()).m25257w("extra_play_entrance", "favorite_special").m25253s("extra_from_router", true).m25254t(262144), m3096J6(), null, 2, null);
        } else {
            C6448c.m25240q(C5634i.m22843d("http://module_vod/VodDetailsActivity").m25257w("extra_content_id", favoriteList.getContentId()).m25257w("extra_play_type", "1").m25257w("extra_type", favoriteList.getType()).m25257w("extra_umeng_event_key", C7589m1.c.f27901a.m29168f()).m25257w("extra_play_entrance", "favorite").m25253s("extra_ts", AbstractC5868k.m23669a(favoriteList.getContentType(), "1")).m25253s("extra_restrict", this.f23218G0).m25253s("extra_from_router", true).m25254t(262144), m3096J6(), null, 2, null);
        }
    }

    @Override // p160h9.InterfaceC4734j
    /* renamed from: c */
    public void mo19610c() {
        LoadingView loadingView = (LoadingView) m23410W9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
        TextView textView = (TextView) m23410W9(R$id.mTextNoRecords);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // p160h9.InterfaceC4734j
    /* renamed from: d */
    public void mo19611d() {
        LoadingView loadingView = (LoadingView) m23410W9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: da, reason: merged with bridge method [inline-methods] */
    public InterfaceC4733i mo5465y9() {
        return new C5031n(this, this);
    }

    @Override // p160h9.InterfaceC4734j
    /* renamed from: e4 */
    public void mo19612e4(boolean z10) {
        if (this.f23218G0) {
            m23409oa(z10);
        } else {
            ((InterfaceC4733i) m5478w9()).mo19606r();
        }
    }

    @InterfaceC7719m
    public final void handSubscribeUpdate(UpdateVodFavEvent updateVodFavEvent) {
        AbstractC5868k.m23674f(updateVodFavEvent, "event");
        ((InterfaceC4733i) m5478w9()).mo19604A3();
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23220I0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        Bundle m3090H6 = m3090H6();
        boolean z10 = false;
        if (m3090H6 != null) {
            z10 = m3090H6.getBoolean("is_restricted", false);
        }
        this.f23218G0 = z10;
        m23398ca().setHasStableIds(true);
        int i10 = R$id.mGridView;
        VerticalGridView verticalGridView = (VerticalGridView) m23410W9(i10);
        AbstractC5868k.m23673e(verticalGridView, "mGridView");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        ((VerticalGridView) m23410W9(i10)).setAdapter(m23398ca());
        int i11 = R$id.mTextNoRecords;
        ((TextView) m23410W9(i11)).setVisibility(8);
        ((TextView) m23410W9(i11)).setText(m3172j7(R$string.no_favorite_yet));
        m23401ga();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mEditLayout) {
            int i10 = 1;
            this.f23216E0 = !this.f23216E0;
            m23398ca().m16895A(this.f23216E0);
            if (this.f23216E0) {
                if (!view.hasFocus()) {
                    i10 = 2;
                }
                m23400fa(i10);
            } else {
                m23400fa(view.hasFocus() ? 1 : 0);
            }
            VerticalGridView verticalGridView = (VerticalGridView) m23410W9(R$id.mGridView);
            if (verticalGridView != null) {
                verticalGridView.requestFocus();
            }
            m23398ca().notifyDataSetChanged();
            return;
        }
        if (id2 == R$id.mDeleteLayout) {
            String string = m3154d7().getString(R$string.vod_delete_all_records);
            AbstractC5868k.m23673e(string, "resources.getString(R.st…g.vod_delete_all_records)");
            m23406la(string);
        }
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        AbstractC5868k.m23674f(keyEvent, "event");
        C1328x c1328x = null;
        if (i10 != 4) {
            if (i10 != 20) {
                if (i10 == 21 && ((AutoRelativeLayout) m23410W9(R$id.mEditLayout)).hasFocus()) {
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
            } else if (((AutoRelativeLayout) m23410W9(R$id.mEditLayout)).hasFocus() || ((AutoRelativeLayout) m23410W9(R$id.mDeleteLayout)).hasFocus()) {
                TextView textView = (TextView) m23410W9(R$id.mTextNoRecords);
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
        if (this.f23216E0) {
            this.f23216E0 = false;
            m23400fa(0);
            m23398ca().m16895A(this.f23216E0);
            m23398ca().notifyDataSetChanged();
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

    @Override // p160h9.InterfaceC4734j
    /* renamed from: p */
    public void mo19613p(FavoriteList favoriteList) {
        if (favoriteList == null) {
            m23398ca().m28847d();
        } else {
            m23398ca().m28853k(favoriteList);
        }
        if (m23398ca().m28848f().size() == 0) {
            m23400fa(0);
            this.f23216E0 = false;
            m23398ca().m16895A(this.f23216E0);
            TextView textView = (TextView) m23410W9(R$id.mTextNoRecords);
            if (textView != null) {
                textView.setVisibility(0);
            }
            InterfaceC5642a m23274G9 = m23274G9();
            if (m23274G9 != null) {
                m23274G9.invoke();
            }
        } else {
            VerticalGridView verticalGridView = (VerticalGridView) m23410W9(R$id.mGridView);
            if (verticalGridView != null) {
                verticalGridView.requestFocus();
            }
        }
        TextView textView2 = (TextView) m23410W9(R$id.mTotalText);
        if (textView2 != null) {
            textView2.setText(String.valueOf(m23398ca().m28848f().size()));
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        mo19612e4(true);
    }

    @Override // p160h9.InterfaceC4734j
    /* renamed from: u */
    public void mo19614u(String str) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23215D0;
    }
}
