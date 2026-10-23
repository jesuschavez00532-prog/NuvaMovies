package p251n9;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cf.AbstractC1516b;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$mipmap;
import com.mine.R$string;
import com.module.bean.Album;
import com.open.leanback.widget.VerticalGridView;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p100d9.C4002r;
import p102db.DialogC4023b;
import p116e9.C4156a;
import p132fa.C4300d;
import p160h9.InterfaceC4737m;
import p160h9.InterfaceC4738n;
import p192j9.C5036s;
import p302qc.C6448c;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7598p1;
import p400xa.C7589m1;

/* renamed from: n9.v */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5820v extends AbstractC5774c<InterfaceC4737m> implements InterfaceC4738n, View.OnClickListener {

    /* renamed from: B0 */
    private boolean f23275B0;

    /* renamed from: C0 */
    private final InterfaceC1312h f23276C0;

    /* renamed from: D0 */
    private boolean f23277D0;

    /* renamed from: E0 */
    private DialogC4023b f23278E0;

    /* renamed from: F0 */
    private boolean f23279F0;

    /* renamed from: G0 */
    private boolean f23280G0;

    /* renamed from: H0 */
    public Map f23281H0 = new LinkedHashMap();

    /* renamed from: n9.v$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f23282a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4002r invoke() {
            return new C4002r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.v$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m23505a(boolean z10) {
            ViewOnClickListenerC5820v.this.f23279F0 = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23505a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.v$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        /* renamed from: a */
        public final void m23506a() {
            ((AutoRelativeLayout) ViewOnClickListenerC5820v.this.m23499W9(R$id.mEditLayout)).requestFocus();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23506a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.v$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5664p {
        d() {
            super(2);
        }

        /* renamed from: a */
        public final void m23507a(boolean z10, C4156a c4156a) {
            AbstractC5868k.m23674f(c4156a, "bean");
            if (z10) {
                ViewOnClickListenerC5820v.this.m23501Z9(c4156a);
            } else {
                ViewOnClickListenerC5820v.this.m23502aa(c4156a.m17368a());
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m23507a(((Boolean) obj).booleanValue(), (C4156a) obj2);
            return C1328x.f4998a;
        }
    }

    public ViewOnClickListenerC5820v() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f23282a);
        this.f23276C0 = m5965b;
        this.f23280G0 = true;
    }

    /* renamed from: ba */
    private final C4002r m23490ba() {
        return (C4002r) this.f23276C0.getValue();
    }

    /* renamed from: da */
    private final void m23491da(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ((ImageView) m23499W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_blue);
                    return;
                }
                return;
            }
            ((ImageView) m23499W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_white);
            return;
        }
        ((ImageView) m23499W9(R$id.mDeleteImg)).setImageResource(R$mipmap.vod_icon_del_white);
    }

    /* renamed from: ea */
    private final void m23492ea(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ((ImageView) m23499W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_blue);
                    return;
                }
                return;
            }
            ((ImageView) m23499W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_white);
            return;
        }
        ((ImageView) m23499W9(R$id.mEditImg)).setImageResource(R$mipmap.vod_icon_edit_white);
    }

    /* renamed from: fa */
    private final void m23493fa() {
        m23490ba().m16919A(new b());
        m23490ba().m16922D(new c());
        m23490ba().m16921C(new d());
        int i10 = R$id.mEditLayout;
        ((AutoRelativeLayout) m23499W9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n9.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC5820v.m23494ga(ViewOnClickListenerC5820v.this, view, z10);
            }
        });
        int i11 = R$id.mDeleteLayout;
        ((AutoRelativeLayout) m23499W9(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n9.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC5820v.m23495ha(ViewOnClickListenerC5820v.this, view, z10);
            }
        });
        ((AutoRelativeLayout) m23499W9(i10)).setOnClickListener(this);
        ((AutoRelativeLayout) m23499W9(i11)).setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m23494ga(ViewOnClickListenerC5820v viewOnClickListenerC5820v, View view, boolean z10) {
        int i10 = 0;
        AbstractC5868k.m23674f(viewOnClickListenerC5820v, "this$0");
        if (viewOnClickListenerC5820v.f23277D0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            viewOnClickListenerC5820v.m23492ea(i10);
            return;
        }
        viewOnClickListenerC5820v.m23492ea(z10 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final void m23495ha(ViewOnClickListenerC5820v viewOnClickListenerC5820v, View view, boolean z10) {
        AbstractC5868k.m23674f(viewOnClickListenerC5820v, "this$0");
        viewOnClickListenerC5820v.m23491da(z10 ? 1 : 0);
    }

    /* renamed from: ia */
    private final void m23496ia(String str) {
        Button m17016a;
        if (this.f23277D0) {
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.toast_enter_cancel_mode), new int[0]);
            return;
        }
        if (m23490ba().m28848f().size() == 0) {
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.empty_fav_play_recode), new int[0]);
        }
        DialogC4023b dialogC4023b = new DialogC4023b(m3096J6(), R$layout.layout_delete_dialog);
        this.f23278E0 = dialogC4023b;
        dialogC4023b.m17017b(str);
        DialogC4023b dialogC4023b2 = this.f23278E0;
        if (dialogC4023b2 != null) {
            dialogC4023b2.m17019d(m3154d7().getString(R$string.dlg_ok), new DialogInterface.OnClickListener() { // from class: n9.r
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ViewOnClickListenerC5820v.m23497ja(ViewOnClickListenerC5820v.this, dialogInterface, i10);
                }
            });
        }
        DialogC4023b dialogC4023b3 = this.f23278E0;
        if (dialogC4023b3 != null) {
            dialogC4023b3.m17018c(m3154d7().getString(R$string.dlg_cancel), new DialogInterface.OnClickListener() { // from class: n9.s
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ViewOnClickListenerC5820v.m23498ka(dialogInterface, i10);
                }
            });
        }
        DialogC4023b dialogC4023b4 = this.f23278E0;
        if (dialogC4023b4 != null) {
            dialogC4023b4.setCanceledOnTouchOutside(false);
        }
        DialogC4023b dialogC4023b5 = this.f23278E0;
        if (dialogC4023b5 != null) {
            dialogC4023b5.show();
        }
        DialogC4023b dialogC4023b6 = this.f23278E0;
        if (dialogC4023b6 != null && (m17016a = dialogC4023b6.m17016a()) != null) {
            m17016a.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public static final void m23497ja(ViewOnClickListenerC5820v viewOnClickListenerC5820v, DialogInterface dialogInterface, int i10) {
        AbstractC5868k.m23674f(viewOnClickListenerC5820v, "this$0");
        viewOnClickListenerC5820v.m23500Y9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public static final void m23498ka(DialogInterface dialogInterface, int i10) {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_record;
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
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23499W9(R$id.mEditLayout);
        if (autoRelativeLayout != null && autoRelativeLayout.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        AutoRelativeLayout autoRelativeLayout2 = (AutoRelativeLayout) m23499W9(R$id.mDeleteLayout);
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
        AbstractC1516b.m7037a("History", "adapter.getDataList().isNotEmpty():" + (!m23490ba().m28848f().isEmpty()));
        return !m23490ba().m28848f().isEmpty();
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: M9 */
    public boolean mo23276M9() {
        return this.f23279F0;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: N9 */
    public void mo23277N9() {
        VerticalGridView verticalGridView;
        if (m23490ba().m28848f().size() > 0 && (verticalGridView = (VerticalGridView) m23499W9(R$id.mGridView)) != null) {
            verticalGridView.requestFocus();
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: W9 */
    public View m23499W9(int i10) {
        View findViewById;
        Map map = this.f23281H0;
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
    protected final void m23500Y9() {
        ((InterfaceC4737m) m5478w9()).mo19619f3(null);
        m23490ba().m28847d();
        m23492ea(0);
        ((TextView) m23499W9(R$id.mTextNoRecords)).setVisibility(0);
        InterfaceC5642a m23274G9 = m23274G9();
        if (m23274G9 != null) {
            m23274G9.invoke();
        }
        ((TextView) m23499W9(R$id.mTotalText)).setText(String.valueOf(m23490ba().m28848f().size()));
    }

    /* renamed from: Z9 */
    protected final void m23501Z9(C4156a c4156a) {
        AbstractC5868k.m23674f(c4156a, "bean");
        ((InterfaceC4737m) m5478w9()).mo19619f3(c4156a.m17368a());
        m23490ba().m28853k(c4156a);
        if (m23490ba().m28848f().size() == 0) {
            m23492ea(0);
            this.f23277D0 = false;
            m23490ba().m16920B(this.f23277D0);
            ((TextView) m23499W9(R$id.mTextNoRecords)).setVisibility(0);
            InterfaceC5642a m23274G9 = m23274G9();
            if (m23274G9 != null) {
                m23274G9.invoke();
            }
        } else {
            VerticalGridView verticalGridView = (VerticalGridView) m23499W9(R$id.mGridView);
            if (verticalGridView != null) {
                verticalGridView.requestFocus();
            }
        }
        ((TextView) m23499W9(R$id.mTotalText)).setText(String.valueOf(m23490ba().m28848f().size()));
    }

    /* renamed from: aa */
    protected final void m23502aa(Album album) {
        AbstractC5868k.m23674f(album, "programModel");
        if (AbstractC5868k.m23669a(C4300d.f18678a.m18069y(), album.getAlbumType())) {
            C6448c.m25240q(C5634i.m22843d("http://module_vod/TopicActivity").m25257w("extra_topic_column_id", album.getContentId()).m25257w("extra_topic_name", album.getAlbumTitle()).m25257w("extra_topic_alias", album.getAlias()).m25257w("extra_topic_poster", album.getAlbumPic()).m25257w("extra_topic_background", album.getAlbumBackgroud()).m25257w("extra_play_entrance", "history_special").m25253s("extra_from_router", true).m25254t(262144), m3096J6(), null, 2, null);
        } else {
            C6448c.m25240q(C5634i.m22843d("http://module_vod/VodDetailsActivity").m25257w("extra_content_id", album.getContentId()).m25257w("extra_play_type", "1").m25257w("extra_type", album.getShelveType()).m25257w("extra_umeng_event_key", C7589m1.c.f27901a.m29168f()).m25257w("extra_play_entrance", "history").m25253s("extra_from_router", true).m25254t(262144), m3096J6(), null, 2, null);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: ca, reason: merged with bridge method [inline-methods] */
    public InterfaceC4737m mo5465y9() {
        return new C5036s(this, this);
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        if (this.f23280G0) {
            this.f23280G0 = false;
        } else {
            ((InterfaceC4737m) m5478w9()).mo19618Y1();
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23281H0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m23490ba().setHasStableIds(true);
        int i10 = R$id.mGridView;
        VerticalGridView verticalGridView = (VerticalGridView) m23499W9(i10);
        AbstractC5868k.m23673e(verticalGridView, "mGridView");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        ((VerticalGridView) m23499W9(i10)).setAdapter(m23490ba());
        int i11 = R$id.mTextNoRecords;
        ((TextView) m23499W9(i11)).setVisibility(8);
        ((TextView) m23499W9(i11)).setText(m3172j7(R$string.empty_fav_play_recode));
        m23493fa();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mEditLayout) {
            int i10 = 1;
            this.f23277D0 = !this.f23277D0;
            m23490ba().m16920B(this.f23277D0);
            if (this.f23277D0) {
                if (!view.hasFocus()) {
                    i10 = 2;
                }
                m23492ea(i10);
            } else {
                m23492ea(view.hasFocus() ? 1 : 0);
            }
            VerticalGridView verticalGridView = (VerticalGridView) m23499W9(R$id.mGridView);
            if (verticalGridView != null) {
                verticalGridView.requestFocus();
            }
            m23490ba().notifyDataSetChanged();
            return;
        }
        if (id2 == R$id.mDeleteLayout) {
            String string = m3154d7().getString(R$string.vod_delete_all_records);
            AbstractC5868k.m23673e(string, "resources.getString(R.st…g.vod_delete_all_records)");
            m23496ia(string);
        }
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        AbstractC5868k.m23674f(keyEvent, "event");
        C1328x c1328x = null;
        if (i10 != 4) {
            if (i10 != 20) {
                if (i10 == 21 && ((AutoRelativeLayout) m23499W9(R$id.mEditLayout)).hasFocus()) {
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
            } else if (((AutoRelativeLayout) m23499W9(R$id.mEditLayout)).hasFocus() || ((AutoRelativeLayout) m23499W9(R$id.mDeleteLayout)).hasFocus()) {
                TextView textView = (TextView) m23499W9(R$id.mTextNoRecords);
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
        if (this.f23277D0) {
            this.f23277D0 = false;
            m23492ea(0);
            m23490ba().m16920B(this.f23277D0);
            m23490ba().notifyDataSetChanged();
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
    }

    @Override // p160h9.InterfaceC4738n
    /* renamed from: r5 */
    public void mo19620r5(List list) {
        int i10 = 0;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            m23490ba().m28854l(list);
            int size = m23490ba().m28848f().size();
            TextView textView = (TextView) m23499W9(R$id.mTotalText);
            if (textView != null) {
                textView.setText(String.valueOf(size));
            }
            TextView textView2 = (TextView) m23499W9(R$id.mTextNoRecords);
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        InterfaceC5642a m23274G9 = m23274G9();
        if (m23274G9 != null) {
            m23274G9.invoke();
        }
        TextView textView3 = (TextView) m23499W9(R$id.mTotalText);
        if (textView3 != null) {
            textView3.setText(MessageService.MSG_DB_READY_REPORT);
        }
        m23490ba().m28847d();
        TextView textView4 = (TextView) m23499W9(R$id.mTextNoRecords);
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23275B0;
    }
}
