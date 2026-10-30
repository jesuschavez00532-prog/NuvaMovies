package com.vod.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0749c;
import anet.channel.entity.EventType;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1441a;
import cc.C1466m0;
import com.download.bean.DownloadModel;
import com.download.util.AutoDownloadObserver;
import com.lzy.okgo.model.Progress;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.bean.Album;
import com.module.childlock.view.MarqueTextView;
import com.module.event.AutoPlayNextEpisodeEvent;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.FinishVodDetailEvent;
import com.module.event.StopWhenPlayVoiceLiveEvent;
import com.module.event.SubtitleSelectEvent;
import com.module.event.UpdateSubscribeEvent;
import com.module.event.UpdateVodFavEvent;
import com.module.view.LoadingView;
import com.request.result.ActiveResult;
import com.request.result.AddSubscribeData;
import com.request.result.AssetData;
import com.request.result.AssetList;
import com.request.result.ChildColumn;
import com.request.result.FavIdDataItem;
import com.request.result.FavoriteList;
import com.request.result.LoginResult;
import com.request.result.SearchByContentResultData;
import com.request.result.SimpleProgramList;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.vod.R$color;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.ui.activity.VodDetailsActivity;
import com.vod.view.VodDetailBottomScrollView;
import com.vod.view.VodDetailLeftPanel;
import com.vod.view.VodDetailMenuPanel;
import com.vod.view.VodPlayerWindow;
import com.zhy.autolayout.AutoFrameLayout;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.Serializable;
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
import ne.AbstractC5882y;
import ne.C5878u;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;
import org.greenrobot.eventbus.ThreadMode;
import p104dd.AbstractC4096d;
import p132fa.C4300d;
import p142g3.C4343e;
import p142g3.RunnableC4341c;
import p170i2.C4842a;
import p193ja.C5044a;
import p201k2.C5096m;
import p212kd.C5153a2;
import p217l2.InterfaceC5346g;
import p253nd.InterfaceC5854n;
import p253nd.InterfaceC5855o;
import p258o3.C5911g;
import p280p3.DialogC6192d;
import p289pd.C6284v;
import p302qc.C6448c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7028e;
import p348u2.AbstractC7029f;
import p400xa.AbstractC7598p1;
import p400xa.C7575i;
import p400xa.C7578j;
import p400xa.C7589m1;
import p400xa.C7619y;
import ye.C7709c;
import ye.InterfaceC7719m;
import za.C7776f;

/* loaded from: classes.dex */
public final class VodDetailsActivity extends AbstractActivityC2972a implements InterfaceC5855o {

    /* renamed from: q0 */
    public static final C3848a f17367q0 = new C3848a(null);

    /* renamed from: r0 */
    private static boolean f17368r0;

    /* renamed from: H */
    public int f17372H;

    /* renamed from: J */
    private AssetData f17374J;

    /* renamed from: K */
    public boolean f17375K;

    /* renamed from: L */
    public boolean f17376L;

    /* renamed from: V */
    private Disposable f17380V;

    /* renamed from: W */
    private int f17381W;

    /* renamed from: X */
    private int f17382X;

    /* renamed from: Z */
    public boolean f17384Z;

    /* renamed from: k0 */
    private int f17389k0;

    /* renamed from: m0 */
    public boolean f17391m0;

    /* renamed from: n0 */
    private final InterfaceC1312h f17392n0;

    /* renamed from: o0 */
    private Disposable f17393o0;

    /* renamed from: p0 */
    public Map f17394p0 = new LinkedHashMap();

    /* renamed from: E */
    private final String f17369E = "VodDetailsActivity";

    /* renamed from: F */
    public String f17370F = "";

    /* renamed from: G */
    public String f17371G = "";

    /* renamed from: I */
    public String f17373I = "";

    /* renamed from: M */
    public String f17377M = "";

    /* renamed from: N */
    public String f17378N = "";

    /* renamed from: O */
    public String f17379O = "";

    /* renamed from: Y */
    private int f17383Y = 1;

    /* renamed from: g0 */
    public long f17385g0 = -1;

    /* renamed from: h0 */
    public int f17386h0 = -1;

    /* renamed from: i0 */
    public String f17387i0 = "";

    /* renamed from: j0 */
    public String f17388j0 = "";

    /* renamed from: l0 */
    private String f17390l0 = "";

    /* renamed from: com.vod.ui.activity.VodDetailsActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3848a {
        private C3848a() {
        }

        public /* synthetic */ C3848a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final boolean m16498a() {
            return VodDetailsActivity.f17368r0;
        }

        /* renamed from: b */
        public final void m16499b(boolean z10) {
            VodDetailsActivity.f17368r0 = z10;
        }
    }

    /* renamed from: com.vod.ui.activity.VodDetailsActivity$b */
    /* loaded from: classes3.dex */
    public static final class C3849b implements C7776f.a {
        C3849b() {
        }

        @Override // za.C7776f.a
        /* renamed from: a */
        public void mo11443a(boolean z10, String str, ActiveResult activeResult, LoginResult loginResult, String str2, String str3) {
            AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
            AbstractC5868k.m23674f(str2, "uri");
            AbstractC5868k.m23674f(str3, "accountType");
            if (z10) {
                if (AbstractC6567a.m25637g(VodDetailsActivity.this.f17370F) && AbstractC6567a.m25637g(VodDetailsActivity.this.f17371G)) {
                    if (!AbstractC5868k.m23669a(VodDetailsActivity.this.f17371G, "1")) {
                        VodDetailsActivity.this.m16447W6();
                    } else {
                        VodPlayerWindow vodPlayerWindow = (VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow);
                        AbstractC5868k.m23673e(vodPlayerWindow, "mPlayerWindow");
                        VodDetailsActivity vodDetailsActivity = VodDetailsActivity.this;
                        String str4 = vodDetailsActivity.f17370F;
                        int i10 = vodDetailsActivity.f17372H;
                        String str5 = vodDetailsActivity.f17371G;
                        String str6 = vodDetailsActivity.f17373I;
                        int playIndex = ((VodDetailBottomScrollView) vodDetailsActivity.m16495s6(R$id.mScrollView)).getPlayIndex();
                        VodDetailsActivity vodDetailsActivity2 = VodDetailsActivity.this;
                        boolean z11 = vodDetailsActivity2.f17375K;
                        boolean z12 = vodDetailsActivity2.f17376L;
                        String str7 = vodDetailsActivity2.f17377M;
                        String str8 = vodDetailsActivity2.f17378N;
                        if (str8 == null) {
                            str8 = "";
                        }
                        vodPlayerWindow.m16731g(str4, i10, str5, str6, playIndex, z11, z12, str7, str8, vodDetailsActivity2.f17391m0, (r28 & EventType.AUTH_FAIL) != 0 ? 0 : 0, (r28 & 2048) != 0 ? 1 : 0);
                    }
                    InterfaceC5854n interfaceC5854n = (InterfaceC5854n) VodDetailsActivity.this.m11977r5();
                    VodDetailsActivity vodDetailsActivity3 = VodDetailsActivity.this;
                    interfaceC5854n.mo23654m(vodDetailsActivity3.f17370F, vodDetailsActivity3.f17371G, MessageService.MSG_DB_READY_REPORT);
                    VodDetailsActivity vodDetailsActivity4 = VodDetailsActivity.this;
                    if (vodDetailsActivity4.f17375K) {
                        ((InterfaceC5854n) vodDetailsActivity4.m11977r5()).mo23651Z2(VodDetailsActivity.this.f17370F, AgooConstants.ACK_REMOVE_PACKAGE);
                        return;
                    }
                    InterfaceC5854n interfaceC5854n2 = (InterfaceC5854n) vodDetailsActivity4.m11977r5();
                    VodDetailsActivity vodDetailsActivity5 = VodDetailsActivity.this;
                    interfaceC5854n2.mo23648P1(vodDetailsActivity5.f17371G, vodDetailsActivity5.f17370F, 0, 10);
                    return;
                }
                return;
            }
            VodDetailsActivity vodDetailsActivity6 = VodDetailsActivity.this;
            if (vodDetailsActivity6.f17384Z) {
                AbstractActivityC2972a.m11957W5(vodDetailsActivity6, str, false, str2, null, null, null, null, 122, null);
            }
        }
    }

    /* renamed from: com.vod.ui.activity.VodDetailsActivity$c */
    /* loaded from: classes3.dex */
    static final class C3850c extends AbstractC5869l implements InterfaceC5642a {
        C3850c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DialogC6192d invoke() {
            return new DialogC6192d(VodDetailsActivity.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$d */
    /* loaded from: classes3.dex */
    public static final class C3851d extends AbstractC5869l implements InterfaceC5660l {
        C3851d() {
            super(1);
        }

        /* renamed from: a */
        public final void m16501a(String str) {
            if (VodDetailsActivity.this.isFinishing()) {
                return;
            }
            VodPlayerWindow vodPlayerWindow = (VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow);
            VodDetailsActivity vodDetailsActivity = VodDetailsActivity.this;
            String str2 = vodDetailsActivity.f17370F;
            int i10 = vodDetailsActivity.f17372H;
            String str3 = vodDetailsActivity.f17371G;
            String str4 = vodDetailsActivity.f17373I;
            int i11 = vodDetailsActivity.f17381W;
            VodDetailsActivity vodDetailsActivity2 = VodDetailsActivity.this;
            boolean z10 = vodDetailsActivity2.f17375K;
            boolean z11 = vodDetailsActivity2.f17376L;
            String str5 = vodDetailsActivity2.f17377M;
            String str6 = vodDetailsActivity2.f17378N;
            if (str6 == null) {
                str6 = "";
            }
            vodPlayerWindow.m16731g(str2, i10, str3, str4, i11, z10, z11, str5, str6, vodDetailsActivity2.f17391m0, vodDetailsActivity2.f17382X, VodDetailsActivity.this.f17383Y);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16501a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$e */
    /* loaded from: classes3.dex */
    public static final class C3852e extends AbstractC5869l implements InterfaceC5664p {
        C3852e() {
            super(2);
        }

        /* renamed from: a */
        public final void m16502a(View view, int i10) {
            AbstractC5868k.m23674f(view, "view");
            if (i10 == 1) {
                VodDetailsActivity.this.m16462i7("cast_type_director");
            } else if (i10 == 2) {
                VodDetailsActivity.this.m16462i7("cast_type_actor");
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m16502a((View) obj, ((Number) obj2).intValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$f */
    /* loaded from: classes3.dex */
    public static final class C3853f extends AbstractC5869l implements InterfaceC5664p {
        C3853f() {
            super(2);
        }

        /* renamed from: a */
        public final void m16503a(View view, int i10) {
            AbstractC5868k.m23674f(view, "view");
            switch (i10) {
                case 1:
                    if (VodDetailsActivity.this.f17374J != null) {
                        ((VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow)).m16737o();
                        return;
                    }
                    return;
                case 2:
                    ((VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow)).m16740r();
                    return;
                case 3:
                    if (C7578j.f27850a.m29087a()) {
                        return;
                    }
                    if (!C5096m.f20979a.m20692c()) {
                        VodDetailsActivity.this.m16439M6();
                        return;
                    } else {
                        VodDetailsActivity.this.m16439M6();
                        return;
                    }
                case 4:
                    C1466m0 c1466m0 = C1466m0.f5627a;
                    if (c1466m0.m6842O()) {
                        VodDetailsActivity vodDetailsActivity = VodDetailsActivity.this;
                        AbstractC7598p1.m29244h(vodDetailsActivity, vodDetailsActivity.getString(R$string.personal_set_pwd_visitor_tips), new int[0]);
                        return;
                    } else if (!c1466m0.m6836I()) {
                        VodDetailsActivity.this.m16438L6();
                        return;
                    } else {
                        VodDetailsActivity vodDetailsActivity2 = VodDetailsActivity.this;
                        AbstractC7598p1.m29244h(vodDetailsActivity2, vodDetailsActivity2.getString(R$string.personal_goto_personal_get_vip), new int[0]);
                        return;
                    }
                case 5:
                    if (C7578j.f27850a.m29087a()) {
                        return;
                    }
                    if (!C5096m.f20979a.m20692c()) {
                        VodDetailsActivity.this.m16440N6();
                        return;
                    } else {
                        VodDetailsActivity.this.m16440N6();
                        return;
                    }
                case 6:
                    ((VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow)).m16739q();
                    return;
                default:
                    return;
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m16503a((View) obj, ((Number) obj2).intValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$g */
    /* loaded from: classes3.dex */
    public static final class C3854g extends AbstractC5869l implements InterfaceC5660l {
        C3854g() {
            super(1);
        }

        /* renamed from: a */
        public final void m16504a(boolean z10) {
            TextView textView;
            TextView textView2;
            TextView textView3 = null;
            if (z10) {
                VodDetailsActivity vodDetailsActivity = VodDetailsActivity.this;
                int i10 = R$id.llMeun;
                VodDetailLeftPanel vodDetailLeftPanel = (VodDetailLeftPanel) vodDetailsActivity.m16495s6(i10);
                if (vodDetailLeftPanel != null) {
                    textView2 = (TextView) vodDetailLeftPanel.m16680i(R$id.tvMore);
                } else {
                    textView2 = null;
                }
                if (textView2 != null) {
                    textView2.setEnabled(false);
                }
                VodDetailLeftPanel vodDetailLeftPanel2 = (VodDetailLeftPanel) VodDetailsActivity.this.m16495s6(i10);
                if (vodDetailLeftPanel2 != null) {
                    textView3 = (TextView) vodDetailLeftPanel2.m16680i(R$id.tvMore);
                }
                if (textView3 != null) {
                    textView3.setFocusable(false);
                }
                ((VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow)).setBackgroundColor(VodDetailsActivity.this.getResources().getColor(R$color.color_000000));
            } else {
                VodDetailsActivity vodDetailsActivity2 = VodDetailsActivity.this;
                int i11 = R$id.llMeun;
                VodDetailLeftPanel vodDetailLeftPanel3 = (VodDetailLeftPanel) vodDetailsActivity2.m16495s6(i11);
                if (vodDetailLeftPanel3 != null) {
                    textView = (TextView) vodDetailLeftPanel3.m16680i(R$id.tvMore);
                } else {
                    textView = null;
                }
                if (textView != null) {
                    textView.setEnabled(true);
                }
                VodDetailLeftPanel vodDetailLeftPanel4 = (VodDetailLeftPanel) VodDetailsActivity.this.m16495s6(i11);
                if (vodDetailLeftPanel4 != null) {
                    textView3 = (TextView) vodDetailLeftPanel4.m16680i(R$id.tvMore);
                }
                if (textView3 != null) {
                    textView3.setFocusable(true);
                }
                ((VodDetailBottomScrollView) VodDetailsActivity.this.m16495s6(R$id.mScrollView)).scrollTo(0, 0);
                VodDetailsActivity vodDetailsActivity3 = VodDetailsActivity.this;
                int i12 = R$id.mPlayerWindow;
                ((VodPlayerWindow) vodDetailsActivity3.m16495s6(i12)).requestFocus();
                ((VodPlayerWindow) VodDetailsActivity.this.m16495s6(i12)).setBackgroundResource(R$drawable.sel_player_window);
                VodDetailsActivity.this.m16469o7();
            }
            VodDetailsActivity.this.m16452b7(!z10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16504a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$h */
    /* loaded from: classes3.dex */
    public static final class C3855h extends AbstractC5869l implements InterfaceC5642a {
        C3855h() {
            super(0);
        }

        /* renamed from: a */
        public final void m16505a() {
            VodPlayerWindow vodPlayerWindow = (VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow);
            if (vodPlayerWindow != null) {
                vodPlayerWindow.m16741s();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16505a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$i */
    /* loaded from: classes3.dex */
    public static final class C3856i extends AbstractC5869l implements InterfaceC5660l {
        C3856i() {
            super(1);
        }

        /* renamed from: a */
        public final void m16506a(String str) {
            AbstractC5868k.m23674f(str, "it");
            VodDetailsActivity vodDetailsActivity = VodDetailsActivity.this;
            vodDetailsActivity.f17370F = str;
            ((VodDetailLeftPanel) vodDetailsActivity.m16495s6(R$id.llMeun)).setContentId(str);
            VodDetailsActivity vodDetailsActivity2 = VodDetailsActivity.this;
            int i10 = R$id.mPlayerWindow;
            VodPlayerWindow vodPlayerWindow = (VodPlayerWindow) vodDetailsActivity2.m16495s6(i10);
            if (vodPlayerWindow != null) {
                vodPlayerWindow.m16736n();
            }
            VodDetailsActivity.this.m16447W6();
            ((VodPlayerWindow) VodDetailsActivity.this.m16495s6(i10)).m16735m();
            InterfaceC5854n interfaceC5854n = (InterfaceC5854n) VodDetailsActivity.this.m11977r5();
            VodDetailsActivity vodDetailsActivity3 = VodDetailsActivity.this;
            interfaceC5854n.mo23654m(vodDetailsActivity3.f17370F, vodDetailsActivity3.f17371G, MessageService.MSG_DB_READY_REPORT);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16506a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.VodDetailsActivity$j */
    /* loaded from: classes3.dex */
    public static final class C3857j implements C5153a2.a {

        /* renamed from: com.vod.ui.activity.VodDetailsActivity$j$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C5878u f17404a;

            /* renamed from: b */
            final /* synthetic */ C5878u f17405b;

            /* renamed from: c */
            final /* synthetic */ C5878u f17406c;

            /* renamed from: d */
            final /* synthetic */ String f17407d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5878u c5878u, C5878u c5878u2, C5878u c5878u3, String str) {
                super(1);
                this.f17404a = c5878u;
                this.f17405b = c5878u2;
                this.f17406c = c5878u3;
                this.f17407d = str;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                intent.putExtra("extra_parent_column_id", ((Number) this.f17404a.f23412a).intValue());
                intent.putExtra("extra_column_code", (String) this.f17405b.f23412a);
                intent.putExtra("extra_category_type", (String) this.f17406c.f23412a);
                intent.putExtra("extra_play_entrance", "detail");
                Intent putExtra = intent.putExtra("extra_category_selected_alias", this.f17407d);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodCateg…RY_SELECTED_ALIAS, genre)");
                return putExtra;
            }
        }

        C3857j() {
        }

        @Override // p212kd.C5153a2.a
        /* renamed from: a */
        public void mo16507a(String str, int i10) {
            ChildColumn childColumn;
            String code;
            ChildColumn childColumn2;
            String code2;
            AbstractC5868k.m23674f(str, "genre");
            C5878u c5878u = new C5878u();
            C5878u c5878u2 = new C5878u();
            C5878u c5878u3 = new C5878u();
            String str2 = "";
            Integer num = null;
            if (AbstractC5868k.m23669a(VodDetailsActivity.this.f17371G, MessageService.MSG_DB_READY_REPORT)) {
                C5044a c5044a = C5044a.f20862a;
                C4300d c4300d = C4300d.f18678a;
                Object m20485a = c5044a.m20485a(c4300d.m18041k());
                if (m20485a instanceof ChildColumn) {
                    childColumn2 = (ChildColumn) m20485a;
                } else {
                    childColumn2 = null;
                }
                if (childColumn2 != null && (code2 = childColumn2.getCode()) != null) {
                    str2 = code2;
                }
                c5878u.f23412a = str2;
                if (childColumn2 != null) {
                    num = Integer.valueOf(childColumn2.getId());
                }
                c5878u2.f23412a = num;
                c5878u3.f23412a = c4300d.m18059t();
            } else {
                C5044a c5044a2 = C5044a.f20862a;
                C4300d c4300d2 = C4300d.f18678a;
                Object m20485a2 = c5044a2.m20485a(c4300d2.m18039j());
                if (m20485a2 instanceof ChildColumn) {
                    childColumn = (ChildColumn) m20485a2;
                } else {
                    childColumn = null;
                }
                if (childColumn != null && (code = childColumn.getCode()) != null) {
                    str2 = code;
                }
                c5878u.f23412a = str2;
                if (childColumn != null) {
                    num = Integer.valueOf(childColumn.getId());
                }
                c5878u2.f23412a = num;
                c5878u3.f23412a = c4300d2.m18057s();
            }
            if (c5878u2.f23412a != null && !AbstractC5868k.m23669a(str, VodDetailsActivity.this.getString(R$string.unknown))) {
                C7619y.m29367d(C7619y.f28056a, VodDetailsActivity.this.m30049S4(), VodCategoryActivity.class, null, new a(c5878u2, c5878u, c5878u3, str), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$k */
    /* loaded from: classes3.dex */
    public static final class C3858k extends AbstractC5869l implements InterfaceC5664p {
        C3858k() {
            super(2);
        }

        /* renamed from: a */
        public final void m16509a(int i10, boolean z10) {
            if (z10) {
                ((VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow)).m16734l(i10);
            } else {
                ((VodPlayerWindow) VodDetailsActivity.this.m16495s6(R$id.mPlayerWindow)).m16737o();
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m16509a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$l */
    /* loaded from: classes3.dex */
    public static final class C3859l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f17409a;

        /* renamed from: b */
        final /* synthetic */ VodDetailsActivity f17410b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3859l(String str, VodDetailsActivity vodDetailsActivity) {
            super(1);
            this.f17409a = str;
            this.f17410b = vodDetailsActivity;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_has_detail", false);
            intent.putExtra("cast_type", this.f17409a);
            AssetData assetData = this.f17410b.f17374J;
            AbstractC5868k.m23671c(assetData);
            intent.putExtra("extra_imdb", assetData.getKeyWords());
            AssetData assetData2 = this.f17410b.f17374J;
            AbstractC5868k.m23671c(assetData2);
            intent.putExtra("extra_content_id", assetData2.getContentId());
            Intent putExtra = intent.putExtra("extra_type", this.f17410b.f17371G);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(ActorDet…tivity.EXTRA_TYPE, mType)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$m */
    /* loaded from: classes3.dex */
    public static final class C3860m extends AbstractC5869l implements InterfaceC5660l {
        C3860m() {
            super(1);
        }

        /* renamed from: a */
        public final void m16511a(Boolean bool) {
            Disposable disposable = VodDetailsActivity.this.f17393o0;
            if (disposable != null) {
                disposable.dispose();
            }
            VodDetailMenuPanel vodDetailMenuPanel = (VodDetailMenuPanel) VodDetailsActivity.this.m16495s6(R$id.mLayoutButtons);
            AbstractC5868k.m23673e(bool, "it");
            vodDetailMenuPanel.setDownloadSelectState(bool.booleanValue());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16511a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodDetailsActivity$n */
    /* loaded from: classes3.dex */
    public static final class C3861n extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3861n f17412a = new C3861n();

        C3861n() {
            super(1);
        }

        /* renamed from: a */
        public final void m16512a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16512a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public VodDetailsActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new C3850c());
        this.f17392n0 = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J6 */
    public static final void m16436J6(VodDetailsActivity vodDetailsActivity) {
        AbstractC5868k.m23674f(vodDetailsActivity, "this$0");
        int i10 = R$id.mLayoutNotice;
        if (((AutoFrameLayout) vodDetailsActivity.m16495s6(i10)) != null) {
            ((AutoFrameLayout) vodDetailsActivity.m16495s6(i10)).setVisibility(8);
        }
    }

    /* renamed from: K6 */
    private final void m16437K6() {
        if (C1441a.f5552a.m6705c().size() == 1) {
            C6448c.m25240q(C5634i.m22843d("http://module_main/HomeActivity").m25255u("formPageKey", 2).m25254t(67108864), this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L6 */
    public final void m16438L6() {
        if (this.f17374J != null) {
            if (C5911g.f23514h.m23905a().m23900q()) {
                if (!m16443R6().isShowing()) {
                    DialogC6192d m16443R6 = m16443R6();
                    AssetData assetData = this.f17374J;
                    AbstractC5868k.m23671c(assetData);
                    m16443R6.m24724m(assetData, this.f17371G);
                    m16443R6().show();
                    return;
                }
                return;
            }
            AbstractC7598p1.m29245i(m11976o5(), getString(R$string.download_please_insert_storage), new int[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M6 */
    public final void m16439M6() {
        String str;
        AssetData assetData = this.f17374J;
        if (assetData != null) {
            if (assetData != null) {
                str = assetData.getHasFavorite();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(str, "1")) {
                InterfaceC5854n interfaceC5854n = (InterfaceC5854n) m11977r5();
                AssetData assetData2 = this.f17374J;
                AbstractC5868k.m23671c(assetData2);
                interfaceC5854n.mo23653e3(assetData2.getFavoriteId());
                return;
            }
            InterfaceC5854n interfaceC5854n2 = (InterfaceC5854n) m11977r5();
            String str2 = this.f17371G;
            AssetData assetData3 = this.f17374J;
            AbstractC5868k.m23671c(assetData3);
            String name = assetData3.getName();
            if (name == null) {
                name = "";
            }
            AssetData assetData4 = this.f17374J;
            AbstractC5868k.m23671c(assetData4);
            interfaceC5854n2.mo23650X(str2, name, assetData4.getContentId(), this.f17375K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N6 */
    public final void m16440N6() {
        String str;
        AssetData assetData = this.f17374J;
        if (assetData != null) {
            if (assetData != null) {
                str = assetData.getHasSubscribe();
            } else {
                str = null;
            }
            if (!AbstractC5868k.m23669a(str, "1")) {
                InterfaceC5854n interfaceC5854n = (InterfaceC5854n) m11977r5();
                String str2 = this.f17371G;
                AssetData assetData2 = this.f17374J;
                AbstractC5868k.m23671c(assetData2);
                interfaceC5854n.mo23652b2(str2, assetData2.getContentId());
                return;
            }
            InterfaceC5854n interfaceC5854n2 = (InterfaceC5854n) m11977r5();
            AssetData assetData3 = this.f17374J;
            AbstractC5868k.m23671c(assetData3);
            interfaceC5854n2.mo23649W1(assetData3.getSubscribeId());
        }
    }

    /* renamed from: O6 */
    private final void m16441O6() {
        boolean z10;
        Disposable disposable;
        Disposable disposable2 = this.f17380V;
        if (disposable2 != null) {
            z10 = disposable2.isDisposed();
        } else {
            z10 = true;
        }
        if (!z10 && (disposable = this.f17380V) != null) {
            disposable.dispose();
        }
    }

    /* renamed from: Q6 */
    private final void m16442Q6(Intent intent) {
        if (!this.f12044B) {
            String stringExtra = intent.getStringExtra("extra_content_id");
            String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f17370F = stringExtra;
            String stringExtra2 = intent.getStringExtra("extra_type");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f17371G = stringExtra2;
            this.f17372H = intent.getIntExtra("extra_column_id", 0);
            String stringExtra3 = intent.getStringExtra("extra_play_type");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.f17373I = stringExtra3;
            this.f17375K = intent.getBooleanExtra("extra_restrict", false);
            this.f17376L = intent.getBooleanExtra("extra_free", false);
            String stringExtra4 = intent.getStringExtra("extra_umeng_event_key");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            this.f17377M = stringExtra4;
            String stringExtra5 = intent.getStringExtra("extra_umeng_event_category");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            this.f17378N = stringExtra5;
            String stringExtra6 = intent.getStringExtra("extra_play_entrance");
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            this.f17379O = stringExtra6;
            boolean booleanExtra = intent.getBooleanExtra("extra_voice", false);
            this.f17384Z = booleanExtra;
            if (booleanExtra) {
                this.f17385g0 = intent.getLongExtra("extra_startTime", -1L);
                this.f17386h0 = intent.getIntExtra("extra_itemPosition", -1);
                String stringExtra7 = intent.getStringExtra("extra_searchWord");
                if (stringExtra7 == null) {
                    stringExtra7 = "";
                }
                this.f17387i0 = stringExtra7;
                String stringExtra8 = intent.getStringExtra("extra_title");
                if (stringExtra8 != null) {
                    str = stringExtra8;
                }
                this.f17388j0 = str;
            }
        }
        ((VodDetailLeftPanel) m16495s6(R$id.llMeun)).setContentId(this.f17370F);
        if (this.f17384Z) {
            C7575i.f27835a.m29068d(this.f17387i0, this.f17388j0, this.f17386h0, this.f17379O, this.f17385g0);
        }
    }

    /* renamed from: R6 */
    private final DialogC6192d m16443R6() {
        return (DialogC6192d) this.f17392n0.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r1 == null) goto L6;
     */
    /* renamed from: T6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m16444T6() {
        /*
            r3 = this;
            int r0 = com.vod.R$id.mRlRoot
            android.view.View r0 = r3.m16495s6(r0)
            com.core.sysopt.mark.vod.detail.VodDetailRootView r0 = (com.core.sysopt.mark.vod.detail.VodDetailRootView) r0
            int r1 = com.vod.R$color.color_0b0b0b
            android.graphics.drawable.Drawable r1 = p348u2.AbstractC7026c.m27111a(r3, r1)
            r0.setBackgroundDrawable(r1)
            int r0 = com.vod.R$id.mPlayerWindow
            android.view.View r0 = r3.m16495s6(r0)
            com.vod.view.VodPlayerWindow r0 = (com.vod.view.VodPlayerWindow) r0
            java.lang.String r1 = r3.f17379O
            if (r1 == 0) goto L28
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "this as java.lang.String).toLowerCase()"
            ne.AbstractC5868k.m23673e(r1, r2)
            if (r1 != 0) goto L2a
        L28:
            java.lang.String r1 = ""
        L2a:
            r0.setPlayEntrance(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vod.p089ui.activity.VodDetailsActivity.m16444T6():void");
    }

    /* renamed from: U6 */
    private final void m16445U6() {
        if (!((VodDetailLeftPanel) m16495s6(R$id.llMeun)).m16681n()) {
            ((VodPlayerWindow) m16495s6(R$id.mPlayerWindow)).requestFocus(33);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V6 */
    public static final void m16446V6(VodDetailsActivity vodDetailsActivity, ObservableEmitter observableEmitter) {
        Album album;
        InterfaceC5346g interfaceC5346g;
        AbstractC5868k.m23674f(vodDetailsActivity, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        InterfaceC5346g interfaceC5346g2 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
        if (interfaceC5346g2 != null) {
            album = interfaceC5346g2.mo20790g(vodDetailsActivity.f17370F, C4300d.f18678a.m18068x0());
        } else {
            album = null;
        }
        if (album != null && (interfaceC5346g = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0])) != null) {
            interfaceC5346g.mo20785b(C4300d.f18678a.m18068x0(), vodDetailsActivity.f17370F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W6 */
    public final void m16447W6() {
        Observable observeOn = Observable.create(new ObservableOnSubscribe() { // from class: sd.q1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                VodDetailsActivity.m16449Y6(VodDetailsActivity.this, observableEmitter);
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final C3851d c3851d = new C3851d();
        this.f17380V = observeOn.subscribe(new Consumer() { // from class: sd.r1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VodDetailsActivity.m16450Z6(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: X6 */
    private final void m16448X6(AssetData assetData) {
        List<SimpleProgramList> list;
        if (assetData != null) {
            list = assetData.getSimpleProgramList();
        } else {
            list = null;
        }
        if (AbstractC6567a.m25638h(list)) {
            ((VodDetailBottomScrollView) m16495s6(R$id.mScrollView)).m16652u0(this.f17381W, true);
        } else {
            ((VodDetailBottomScrollView) m16495s6(R$id.mScrollView)).m16652u0(0, true);
        }
        ((VodPlayerWindow) m16495s6(R$id.mPlayerWindow)).m16738p(assetData, this.f17391m0);
        m16458g7(assetData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y6 */
    public static final void m16449Y6(VodDetailsActivity vodDetailsActivity, ObservableEmitter observableEmitter) {
        Album album;
        int i10;
        AbstractC5868k.m23674f(vodDetailsActivity, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        InterfaceC5346g interfaceC5346g = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
        if (interfaceC5346g != null) {
            album = interfaceC5346g.mo20790g(vodDetailsActivity.f17370F, C4300d.f18678a.m18068x0());
        } else {
            album = null;
        }
        if (album != null) {
            ((VodPlayerWindow) vodDetailsActivity.m16495s6(R$id.mPlayerWindow)).setHistoryAlbum(album);
            vodDetailsActivity.f17381W = album.getPostiveplayIndex();
            vodDetailsActivity.f17382X = album.getTotalNum();
            if (!TextUtils.isEmpty(album.getPlayIndexTitle()) && TextUtils.isDigitsOnly(album.getPlayIndexTitle())) {
                String playIndexTitle = album.getPlayIndexTitle();
                AbstractC5868k.m23673e(playIndexTitle, "album.playIndexTitle");
                i10 = Integer.parseInt(playIndexTitle);
            } else {
                i10 = vodDetailsActivity.f17381W + 1;
            }
            vodDetailsActivity.f17383Y = i10;
        } else {
            vodDetailsActivity.f17381W = 0;
            vodDetailsActivity.f17382X = 0;
            vodDetailsActivity.f17383Y = 1;
        }
        observableEmitter.onNext("");
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z6 */
    public static final void m16450Z6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: a7 */
    private final void m16451a7(AssetData assetData) {
        this.f17374J = assetData;
        m16448X6(assetData);
        ((VodDetailLeftPanel) m16495s6(R$id.llMeun)).m16682p(assetData, this.f17371G);
        boolean z10 = false;
        if (!this.f12044B) {
            this.f17391m0 = getIntent().getBooleanExtra("extra_ts", false);
        }
        if (this.f17391m0 || AbstractC5868k.m23669a(assetData.getContentType(), "1")) {
            z10 = true;
        }
        this.f17391m0 = z10;
        ((VodDetailMenuPanel) m16495s6(R$id.mLayoutButtons)).m16724v(assetData, this.f17371G, this.f17375K, this.f17391m0);
        m16460h7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b7 */
    public final void m16452b7(boolean z10) {
        ((VodDetailLeftPanel) m16495s6(R$id.llMeun)).setChildFocusable(z10);
        int i10 = R$id.mScrollView;
        ((VodDetailBottomScrollView) m16495s6(i10)).setChildFocusable(z10);
        if (z10) {
            int i11 = R$id.mLayoutButtons;
            ((VodDetailMenuPanel) m16495s6(i11)).setDescendantFocusability(262144);
            ((VodDetailMenuPanel) m16495s6(i11)).setFocusable(true);
            ((VodDetailBottomScrollView) m16495s6(i10)).setFocusable(true);
            return;
        }
        int i12 = R$id.mLayoutButtons;
        ((VodDetailMenuPanel) m16495s6(i12)).setDescendantFocusability(393216);
        ((VodDetailMenuPanel) m16495s6(i12)).setFocusable(false);
        ((VodDetailBottomScrollView) m16495s6(i10)).setFocusable(false);
    }

    /* renamed from: c7 */
    private final void m16453c7() {
        int i10 = R$id.mPlayerWindow;
        ((VodPlayerWindow) m16495s6(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sd.l1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                VodDetailsActivity.m16454d7(VodDetailsActivity.this, view, z10);
            }
        });
        int i11 = R$id.llMeun;
        ((VodDetailLeftPanel) m16495s6(i11)).setChildClickListener(new C3852e());
        ((VodDetailMenuPanel) m16495s6(R$id.mLayoutButtons)).setChildClickListener(new C3853f());
        ((VodPlayerWindow) m16495s6(i10)).setFullScreenListener(new C3854g());
        int i12 = R$id.mScrollView;
        ((VodDetailBottomScrollView) m16495s6(i12)).setStartNewVodAtyListener(new C3855h());
        ((VodDetailBottomScrollView) m16495s6(i12)).setSelectSeaonListener(new C3856i());
        ((VodDetailLeftPanel) m16495s6(i11)).setGenreOnItemClickListener(new C3857j());
        m16443R6().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: sd.m1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                VodDetailsActivity.m16456e7(VodDetailsActivity.this, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d7 */
    public static final void m16454d7(VodDetailsActivity vodDetailsActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(vodDetailsActivity, "this$0");
        int i10 = R$id.mPlayerWindow;
        if (!((VodPlayerWindow) vodDetailsActivity.m16495s6(i10)).m16732j()) {
            ((VodPlayerWindow) vodDetailsActivity.m16495s6(i10)).setBackgroundResource(R$drawable.sel_player_window);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e7 */
    public static final void m16456e7(VodDetailsActivity vodDetailsActivity, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(vodDetailsActivity, "this$0");
        vodDetailsActivity.m16464k7();
    }

    /* renamed from: g7 */
    private final void m16458g7(AssetData assetData) {
        ((VodDetailBottomScrollView) m16495s6(R$id.mScrollView)).m16653w0(assetData, this.f17371G, this.f17370F, new C3858k());
    }

    /* renamed from: h7 */
    private final void m16460h7() {
        if (AbstractC5868k.m23669a(this.f17371G, "1") && this.f17391m0) {
            ((MarqueTextView) m16495s6(R$id.mTvTs)).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7 */
    public final void m16462i7(String str) {
        if (this.f17374J != null) {
            C7619y.m29367d(C7619y.f28056a, m30049S4(), ActorDetailsActivity.class, null, new C3859l(str, this), 2, null);
        }
    }

    /* renamed from: k7 */
    private final void m16464k7() {
        if (!C4842a.f20329a.m19920a().m19953b0()) {
            return;
        }
        final Map m18231c = C4343e.m18227a().m18231c();
        Disposable disposable = this.f17393o0;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: sd.n1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                VodDetailsActivity.m16466l7(m18231c, this, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final C3860m c3860m = new C3860m();
        Consumer consumer = new Consumer() { // from class: sd.o1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VodDetailsActivity.m16467m7(InterfaceC5660l.this, obj);
            }
        };
        final C3861n c3861n = C3861n.f17412a;
        this.f17393o0 = compose.subscribe(consumer, new Consumer() { // from class: sd.p1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VodDetailsActivity.m16468n7(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7 */
    public static final void m16466l7(Map map, VodDetailsActivity vodDetailsActivity, ObservableEmitter observableEmitter) {
        Progress progress;
        AbstractC5868k.m23674f(vodDetailsActivity, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        AbstractC5868k.m23673e(map, "taskMap");
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RunnableC4341c runnableC4341c = (RunnableC4341c) ((Map.Entry) it.next()).getValue();
            Serializable serializable = null;
            if (runnableC4341c != null) {
                progress = runnableC4341c.f18886a;
            } else {
                progress = null;
            }
            if (progress != null) {
                serializable = progress.extra1;
            }
            if (serializable != null && (serializable instanceof DownloadModel)) {
                if (AbstractC5868k.m23669a(vodDetailsActivity.f17371G, MessageService.MSG_DB_READY_REPORT) && AbstractC5868k.m23669a(((DownloadModel) serializable).getSeriesContentId(), vodDetailsActivity.f17370F)) {
                    observableEmitter.onNext(Boolean.TRUE);
                    break;
                } else if (AbstractC5868k.m23669a(vodDetailsActivity.f17371G, "1") && AbstractC5868k.m23669a(((DownloadModel) serializable).getContentId(), vodDetailsActivity.f17370F)) {
                    observableEmitter.onNext(Boolean.TRUE);
                    break;
                }
            }
        }
        observableEmitter.onNext(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7 */
    public static final void m16467m7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n7 */
    public static final void m16468n7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o7 */
    public final void m16469o7() {
        int playIndex = ((VodPlayerWindow) m16495s6(R$id.mPlayerWindow)).getPlayIndex();
        int i10 = R$id.mScrollView;
        if (playIndex != ((VodDetailBottomScrollView) m16495s6(i10)).getPlayIndex()) {
            VodDetailBottomScrollView vodDetailBottomScrollView = (VodDetailBottomScrollView) m16495s6(i10);
            AbstractC5868k.m23673e(vodDetailBottomScrollView, "mScrollView");
            VodDetailBottomScrollView.m16646v0(vodDetailBottomScrollView, playIndex, false, 2, null);
        }
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: D */
    public void mo16478D(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC7598p1.m29244h(this, getString(R$string.subscribe_failed), new int[0]);
    }

    /* renamed from: P6 */
    public final void m16479P6() {
        VodPlayerWindow vodPlayerWindow = (VodPlayerWindow) m16495s6(R$id.mPlayerWindow);
        if (vodPlayerWindow != null) {
            vodPlayerWindow.m16729a();
        }
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: S1 */
    public void mo16480S1(AddSubscribeData addSubscribeData) {
        int i10;
        C7709c.m29787d().m29801m(new UpdateSubscribeEvent());
        AssetData assetData = this.f17374J;
        if (assetData != null) {
            if (addSubscribeData != null) {
                i10 = addSubscribeData.getSubscribeId();
            } else {
                i10 = 0;
            }
            assetData.setSubscribeId(i10);
        }
        AssetData assetData2 = this.f17374J;
        if (assetData2 != null) {
            assetData2.setHasSubscribe("1");
        }
        ((VodDetailMenuPanel) m16495s6(R$id.mLayoutButtons)).setSubscribeState(true);
        int i11 = R$id.mLayoutNotice;
        ((AutoFrameLayout) m16495s6(i11)).setVisibility(0);
        ((AutoFrameLayout) m16495s6(i11)).postDelayed(new Runnable() { // from class: sd.s1
            @Override // java.lang.Runnable
            public final void run() {
                VodDetailsActivity.m16436J6(VodDetailsActivity.this);
            }
        }, 5000L);
        C7589m1 c7589m1 = C7589m1.f27886a;
        String m29169g = C7589m1.c.f27901a.m29169g();
        AssetData assetData3 = this.f17374J;
        AbstractC5868k.m23671c(assetData3);
        c7589m1.m29138g(m29169g, assetData3);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: S6, reason: merged with bridge method [inline-methods] */
    public InterfaceC5854n mo7516s5() {
        return new C6284v(this, this);
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: a1 */
    public void mo16482a1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        if (!AbstractC5868k.m23669a("portal100006", str) && !AbstractC5868k.m23669a("portal100008", str)) {
            m11972U5(str, true, "/getItemData", "vod", this.f17370F, "", "");
        } else {
            AbstractC7598p1.m29244h(m30049S4(), getString(R$string.no_item_data), new int[0]);
            Observable.create(new ObservableOnSubscribe() { // from class: sd.t1
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    VodDetailsActivity.m16446V6(VodDetailsActivity.this, observableEmitter);
                }
            }).subscribeOn(Schedulers.m20294io()).subscribe();
        }
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: b0 */
    public void mo16483b0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC7598p1.m29244h(this, getString(R$string.rm_subscribe_failed), new int[0]);
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: c */
    public void mo16484c() {
        ((LoadingView) m16495s6(R$id.mLoadingView)).setVisibility(0);
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: d */
    public void mo16485d() {
        ((LoadingView) m16495s6(R$id.mLoadingView)).setVisibility(8);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a, androidx.appcompat.app.AbstractActivityC0302c, androidx.core.app.AbstractActivityC0511i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.isLongPress()) {
            this.f17389k0 = keyEvent.getKeyCode();
        }
        if (keyEvent.getKeyCode() != this.f17389k0 && keyEvent.getAction() == 0) {
            this.f17389k0 = keyEvent.getKeyCode();
            AbstractC4096d.m17153c(String.valueOf(keyEvent.getKeyCode()), "start");
        } else if (keyEvent.getAction() == 1) {
            this.f17389k0 = 0;
            AbstractC4096d.m17153c(String.valueOf(keyEvent.getKeyCode()), "stop");
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: e3 */
    public void mo16486e3() {
        C7709c.m29787d().m29801m(new UpdateSubscribeEvent());
        AssetData assetData = this.f17374J;
        if (assetData != null) {
            assetData.setHasSubscribe(MessageService.MSG_DB_READY_REPORT);
        }
        ((VodDetailMenuPanel) m16495s6(R$id.mLayoutButtons)).setSubscribeState(false);
    }

    /* renamed from: f7 */
    public final void m16487f7(boolean z10) {
        VodDetailMenuPanel vodDetailMenuPanel = (VodDetailMenuPanel) m16495s6(R$id.mLayoutButtons);
        if (vodDetailMenuPanel != null) {
            vodDetailMenuPanel.setShowQuality(Boolean.valueOf(z10));
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        AbstractC7028e.m27119e(9, "j");
        Intent intent = getIntent();
        AbstractC5868k.m23673e(intent, "intent");
        m16442Q6(intent);
        m16444T6();
        m16453c7();
        m16487f7(true);
        ((VodPlayerWindow) m16495s6(R$id.mPlayerWindow)).requestFocus();
        AutoDownloadObserver.C1659a c1659a = AutoDownloadObserver.f6984a;
        AbstractC0749c mo953f6 = mo953f6();
        AbstractC5868k.m23673e(mo953f6, "lifecycle");
        c1659a.m7595c(mo953f6);
        AbstractC7028e.m27119e(10, "k");
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: h */
    public void mo16488h() {
        mo16484c();
        C7776f.f28648a.m30102r(new C3849b());
    }

    /* renamed from: j7 */
    public final void m16489j7() {
        VodPlayerWindow vodPlayerWindow = (VodPlayerWindow) m16495s6(R$id.mPlayerWindow);
        if (vodPlayerWindow != null) {
            vodPlayerWindow.m16741s();
        }
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: l0 */
    public void mo16490l0(SearchByContentResultData searchByContentResultData) {
        AbstractC5868k.m23674f(searchByContentResultData, "result");
        VodDetailBottomScrollView vodDetailBottomScrollView = (VodDetailBottomScrollView) m16495s6(R$id.mScrollView);
        List<AssetList> assetList = searchByContentResultData.getAssetList();
        if (!AbstractC5882y.m23710j(assetList)) {
            assetList = null;
        }
        vodDetailBottomScrollView.m16654y0(assetList, this.f17372H, this.f17375K);
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: n */
    public void mo16491n(List list) {
        AssetData assetData;
        AbstractC5868k.m23674f(list, "favId");
        C7709c.m29787d().m29801m(new UpdateVodFavEvent());
        AssetData assetData2 = this.f17374J;
        if (assetData2 != null) {
            assetData2.setHasFavorite("1");
        }
        ((VodDetailMenuPanel) m16495s6(R$id.mLayoutButtons)).setFavoriteState(true);
        if (list.size() > 0 && (assetData = this.f17374J) != null) {
            assetData.setFavoriteId(((FavIdDataItem) list.get(0)).getFavoriteId());
        }
        C7589m1 c7589m1 = C7589m1.f27886a;
        String m29163a = C7589m1.c.f27901a.m29163a();
        AssetData assetData3 = this.f17374J;
        AbstractC5868k.m23671c(assetData3);
        c7589m1.m29134c(m29163a, assetData3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p430z9.AbstractActivityC7763a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0511i, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m16441O6();
    }

    @InterfaceC7719m
    public final void onEventAutoPlayNextEpisodeEvent(AutoPlayNextEpisodeEvent autoPlayNextEpisodeEvent) {
        AbstractC5868k.m23674f(autoPlayNextEpisodeEvent, "event");
        m16469o7();
    }

    @InterfaceC7719m
    public final void onEventFinish(FinishVodDetailEvent finishVodDetailEvent) {
        AbstractC5868k.m23674f(finishVodDetailEvent, "event");
        ((VodPlayerWindow) m16495s6(R$id.mPlayerWindow)).m16741s();
        finish();
    }

    @InterfaceC7719m
    public final void onEventSubtitleSelect(SubtitleSelectEvent subtitleSelectEvent) {
        AbstractC5868k.m23674f(subtitleSelectEvent, "event");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (((com.vod.view.VodDetailBottomScrollView) m16495s6(com.vod.R$id.mScrollView)).m16651p0() == false) goto L34;
     */
    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r6, android.view.KeyEvent r7) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 101(0x65, float:1.42E-43)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 4
            p348u2.AbstractC7028e.m27119e(r1, r0)
            r0 = 1
            r2 = 0
            if (r7 == 0) goto L21
            int r3 = r7.getAction()
            if (r3 != 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            if (r3 == 0) goto Lc6
            if (r6 == r1) goto L99
            r1 = 19
            if (r6 == r1) goto L4d
            r1 = 20
            if (r6 == r1) goto L30
            goto Lb1
        L30:
            int r1 = com.vod.R$id.mLayoutButtons
            android.view.View r1 = r5.m16495s6(r1)
            com.vod.view.VodDetailMenuPanel r1 = (com.vod.view.VodDetailMenuPanel) r1
            android.view.View r1 = r1.getFocusedChild()
            if (r1 == 0) goto Lb1
            int r1 = com.vod.R$id.mScrollView
            android.view.View r1 = r5.m16495s6(r1)
            com.vod.view.VodDetailBottomScrollView r1 = (com.vod.view.VodDetailBottomScrollView) r1
            boolean r1 = r1.m16651p0()
            if (r1 == 0) goto Lb1
            goto Lb2
        L4d:
            int r1 = com.vod.R$id.mScrollView
            android.view.View r1 = r5.m16495s6(r1)
            com.vod.view.VodDetailBottomScrollView r1 = (com.vod.view.VodDetailBottomScrollView) r1
            java.lang.Boolean r1 = r1.m16650o0()
            r3 = 33
            if (r1 == 0) goto L6f
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lb2
            int r1 = com.vod.R$id.mLayoutButtons
            android.view.View r1 = r5.m16495s6(r1)
            com.vod.view.VodDetailMenuPanel r1 = (com.vod.view.VodDetailMenuPanel) r1
            r1.m16723u(r3)
            goto Lb2
        L6f:
            int r1 = com.vod.R$id.mLayoutButtons
            android.view.View r4 = r5.m16495s6(r1)
            com.vod.view.VodDetailMenuPanel r4 = (com.vod.view.VodDetailMenuPanel) r4
            android.view.View r4 = r4.getFocusedChild()
            if (r4 == 0) goto Lb1
            android.view.View r1 = r5.m16495s6(r1)
            com.vod.view.VodDetailMenuPanel r1 = (com.vod.view.VodDetailMenuPanel) r1
            boolean r1 = r1.m16722s()
            if (r1 == 0) goto L8d
            r5.m16445U6()
            goto Lb2
        L8d:
            int r0 = com.vod.R$id.mPlayerWindow
            android.view.View r0 = r5.m16495s6(r0)
            com.vod.view.VodPlayerWindow r0 = (com.vod.view.VodPlayerWindow) r0
            r0.requestFocus(r3)
            goto Lb1
        L99:
            int r1 = com.vod.R$id.mPlayerWindow
            android.view.View r1 = r5.m16495s6(r1)
            com.vod.view.VodPlayerWindow r1 = (com.vod.view.VodPlayerWindow) r1
            boolean r1 = r1.m16732j()
            if (r1 != 0) goto Lb1
            r5.m16489j7()
            r5.m16437K6()
            r5.finish()
            goto Lb2
        Lb1:
            r0 = 0
        Lb2:
            if (r0 != 0) goto Lc5
            com.request.result.AssetData r1 = r5.f17374J
            if (r1 == 0) goto Lc5
            int r0 = com.vod.R$id.mPlayerWindow
            android.view.View r0 = r5.m16495s6(r0)
            com.vod.view.VodPlayerWindow r0 = (com.vod.view.VodPlayerWindow) r0
            boolean r2 = r0.m16733k(r6, r7)
            goto Lc6
        Lc5:
            r2 = r0
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vod.p089ui.activity.VodDetailsActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        super.onResume();
        m16464k7();
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: p */
    public void mo16492p(FavoriteList favoriteList) {
        C7709c.m29787d().m29801m(new UpdateVodFavEvent());
        AssetData assetData = this.f17374J;
        if (assetData != null) {
            assetData.setHasFavorite(MessageService.MSG_DB_READY_REPORT);
        }
        ((VodDetailMenuPanel) m16495s6(R$id.mLayoutButtons)).setFavoriteState(false);
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: s */
    public void mo16493s(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        if (AbstractC5868k.m23669a(str, "portal100061")) {
            AbstractC7598p1.m29245i(this, getString(com.module.R$string.error_code_user_type) + AgooConstants.ACK_BODY_NULL + getString(com.module.R$string.user_ef11), new int[0]);
            return;
        }
        AbstractC7598p1.m29244h(this, getString(R$string.favorite_failed), new int[0]);
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: s3 */
    public void mo16494s3(AssetData assetData) {
        AbstractC5868k.m23674f(assetData, "assetData");
        AbstractC7028e.m27119e(11, "l");
        m16451a7(assetData);
        ((VodDetailLeftPanel) m16495s6(R$id.llMeun)).setNewSelect(assetData);
        m16443R6().m24724m(assetData, this.f17371G);
        AbstractC7028e.m27119e(12, "m");
    }

    /* renamed from: s6 */
    public View m16495s6(int i10) {
        Map map = this.f17394p0;
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

    @Override // androidx.appcompat.app.AbstractActivityC0302c, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        AbstractC7028e.m27119e(8, C3325bt.f14191aI);
        super.setContentView(i10);
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void stopWhenPlayVoiceLive(StopWhenPlayVoiceLiveEvent stopWhenPlayVoiceLiveEvent) {
        AbstractC5868k.m23674f(stopWhenPlayVoiceLiveEvent, "event");
        ((VodPlayerWindow) m16495s6(R$id.mPlayerWindow)).m16741s();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: t5 */
    public void mo11422t5(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        if (awakenVoiceAssistEvent.getCommad() == 1) {
            ((VodPlayerWindow) m16495s6(R$id.mPlayerWindow)).m16730c(awakenVoiceAssistEvent);
        }
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: u */
    public void mo16496u(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC7598p1.m29244h(this, getString(R$string.rm_favorite_failed), new int[0]);
    }

    @Override // p253nd.InterfaceC5855o
    /* renamed from: u1 */
    public void mo16497u1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        ((VodDetailBottomScrollView) m16495s6(R$id.mScrollView)).m16654y0(null, this.f17372H, this.f17375K);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_voddetails;
    }
}
