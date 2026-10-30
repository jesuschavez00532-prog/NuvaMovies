package com.vod.ui.activity;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.childlock.view.MarqueTextView;
import com.module.view.LoadingView;
import com.open.leanback.widget.AbstractC3050a;
import com.open.leanback.widget.AbstractC3057h;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.PersonDetailInfo;
import com.request.result.PersonWorksData;
import com.request.result.PersonWorksInfo;
import com.vod.R$color;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.ui.activity.ActorDetailsActivity;
import com.widget.custom.MemoryListView;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import org.android.agoo.message.MessageService;
import p153h2.AbstractC4509b;
import p212kd.C5150a;
import p212kd.C5166e;
import p242n0.AbstractC5718e;
import p253nd.InterfaceC5841a;
import p253nd.InterfaceC5842b;
import p289pd.C6266d;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p348u2.AbstractC7029f;
import p400xa.AbstractC7568f1;
import p400xa.C7580j1;
import p400xa.C7594o0;
import p433zd.AbstractC7786b;
import td.C6933a;

/* loaded from: classes3.dex */
public final class ActorDetailsActivity extends AbstractActivityC2972a implements InterfaceC5842b {

    /* renamed from: i0 */
    public static final C3791a f17185i0 = new C3791a(null);

    /* renamed from: J */
    private int f17191J;

    /* renamed from: K */
    private int f17192K;

    /* renamed from: N */
    private boolean f17195N;

    /* renamed from: O */
    private String f17196O;

    /* renamed from: V */
    private String f17197V;

    /* renamed from: W */
    private PersonDetailInfo f17198W;

    /* renamed from: X */
    private C5150a f17199X;

    /* renamed from: Y */
    private C5166e f17200Y;

    /* renamed from: Z */
    private final InterfaceC1312h f17201Z;

    /* renamed from: g0 */
    private final C3799i f17202g0;

    /* renamed from: h0 */
    public Map f17203h0 = new LinkedHashMap();

    /* renamed from: E */
    private final String f17186E = "ActorDetailsActivity";

    /* renamed from: F */
    private String f17187F = "";

    /* renamed from: G */
    private String f17188G = "";

    /* renamed from: H */
    private String f17189H = "";

    /* renamed from: I */
    private int f17190I = 1;

    /* renamed from: L */
    private int f17193L = 1;

    /* renamed from: M */
    private final int f17194M = 20;

    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3791a {
        private C3791a() {
        }

        public /* synthetic */ C3791a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$b */
    /* loaded from: classes3.dex */
    static final class C3792b extends AbstractC5869l implements InterfaceC5660l {
        C3792b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo542f(Long l10) {
            int m20823b;
            AbstractC5868k.m23674f(l10, "it");
            C5150a c5150a = null;
            if (AbstractC5868k.m23669a("cast_type_director", ActorDetailsActivity.this.f17196O)) {
                C5150a c5150a2 = ActorDetailsActivity.this.f17199X;
                if (c5150a2 == null) {
                    AbstractC5868k.m23686r("mActorAdapter");
                } else {
                    c5150a = c5150a2;
                }
                m20823b = c5150a.m20824c();
            } else {
                C5150a c5150a3 = ActorDetailsActivity.this.f17199X;
                if (c5150a3 == null) {
                    AbstractC5868k.m23686r("mActorAdapter");
                } else {
                    c5150a = c5150a3;
                }
                m20823b = c5150a.m20823b();
            }
            return Integer.valueOf(m20823b);
        }
    }

    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$c */
    /* loaded from: classes3.dex */
    static final class C3793c extends AbstractC5869l implements InterfaceC5660l {
        C3793c() {
            super(1);
        }

        /* renamed from: a */
        public final void m16148a(Integer num) {
            AbstractC4509b.m18869b(ActorDetailsActivity.this.f17186E, "position:" + num, new Object[0]);
            ActorDetailsActivity actorDetailsActivity = ActorDetailsActivity.this;
            int i10 = R$id.mGridActorList;
            ((MemoryListView) actorDetailsActivity.m16123D6(i10)).requestFocus();
            MemoryListView memoryListView = (MemoryListView) ActorDetailsActivity.this.m16123D6(i10);
            AbstractC5868k.m23673e(num, "it");
            memoryListView.setSelectionTriggerItemSelect(num.intValue());
            AdapterView.OnItemClickListener onItemClickListener = ((MemoryListView) ActorDetailsActivity.this.m16123D6(i10)).getOnItemClickListener();
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick((MemoryListView) ActorDetailsActivity.this.m16123D6(i10), ((MemoryListView) ActorDetailsActivity.this.m16123D6(i10)).getSelectedView(), num.intValue(), num.intValue());
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16148a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$d */
    /* loaded from: classes3.dex */
    static final class C3794d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3794d f17206a = new C3794d();

        C3794d() {
            super(1);
        }

        /* renamed from: a */
        public final void m16149a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16149a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$e */
    /* loaded from: classes3.dex */
    public static final class C3795e extends AbstractC5869l implements InterfaceC5660l {
        C3795e() {
            super(1);
        }

        /* renamed from: a */
        public final void m16150a(Disposable disposable) {
            ActorDetailsActivity.this.mo16139c();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16150a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$f */
    /* loaded from: classes3.dex */
    public static final class C3796f extends AbstractC5869l implements InterfaceC5660l {
        C3796f() {
            super(1);
        }

        /* renamed from: a */
        public final void m16151a(Long l10) {
            ActorDetailsActivity.this.m16109r7(true);
            ActorDetailsActivity actorDetailsActivity = ActorDetailsActivity.this;
            PersonDetailInfo personDetailInfo = actorDetailsActivity.f17198W;
            AbstractC5868k.m23671c(personDetailInfo);
            actorDetailsActivity.m16091g7(personDetailInfo);
            ActorDetailsActivity.this.f17197V = null;
            ActorDetailsActivity.this.m16094h7();
            ((Button) ActorDetailsActivity.this.m16123D6(R$id.mButtonMovie)).requestFocus();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16151a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$g */
    /* loaded from: classes3.dex */
    public static final class C3797g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3797g f17209a = new C3797g();

        C3797g() {
            super(1);
        }

        /* renamed from: a */
        public final void m16152a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16152a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$h */
    /* loaded from: classes3.dex */
    static final class C3798h extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3798h f17210a = new C3798h();

        C3798h() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6933a invoke() {
            return new C6933a();
        }
    }

    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$i */
    /* loaded from: classes3.dex */
    public static final class C3799i extends AbstractC3057h {
        C3799i() {
        }

        @Override // com.open.leanback.widget.AbstractC3057h
        /* renamed from: a */
        public void mo11995a(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
            ((TextView) ActorDetailsActivity.this.m16123D6(R$id.mTextPageIndicator)).setText(ActorDetailsActivity.this.m16083Y6(i10 + 1));
        }
    }

    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$j */
    /* loaded from: classes3.dex */
    public static final class C3800j implements AdapterView.OnItemSelectedListener {
        C3800j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            AbstractC5868k.m23674f(view, "view");
            ActorDetailsActivity.this.m16104o7(view, i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$k */
    /* loaded from: classes3.dex */
    public static final class C3801k extends AbstractC3050a.f {
        C3801k() {
        }

        @Override // com.open.leanback.widget.AbstractC3050a.f
        /* renamed from: a */
        public void mo12522a() {
            if (AbstractC5718e.m23111a(ActorDetailsActivity.this.m30049S4())) {
                return;
            }
            ComponentCallbacks2C1586c.m7282u(ActorDetailsActivity.this.m30049S4().getApplicationContext()).m7391q();
        }

        @Override // com.open.leanback.widget.AbstractC3050a.f
        /* renamed from: b */
        public void mo12523b() {
        }

        @Override // com.open.leanback.widget.AbstractC3050a.f
        /* renamed from: c */
        public void mo12524c() {
            if (AbstractC5718e.m23111a(ActorDetailsActivity.this.m30049S4())) {
                return;
            }
            ComponentCallbacks2C1586c.m7282u(ActorDetailsActivity.this.m30049S4().getApplicationContext()).m7390p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.ActorDetailsActivity$l */
    /* loaded from: classes3.dex */
    public static final class C3802l extends AbstractC5869l implements InterfaceC5664p {
        C3802l() {
            super(2);
        }

        /* renamed from: a */
        public final void m16154a(View view, boolean z10) {
            AbstractC5868k.m23674f(view, "view");
            if (z10) {
                if (AbstractC5868k.m23669a(ActorDetailsActivity.this.f17197V, "works_type_movie")) {
                    ((Button) ActorDetailsActivity.this.m16123D6(R$id.mButtonMovie)).setSelected(true);
                } else if (AbstractC5868k.m23669a(ActorDetailsActivity.this.f17197V, "works_type_series")) {
                    ((Button) ActorDetailsActivity.this.m16123D6(R$id.mButtonSeries)).setSelected(true);
                }
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m16154a((View) obj, ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    public ActorDetailsActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C3798h.f17210a);
        this.f17201Z = m5965b;
        this.f17202g0 = new C3799i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A7 */
    public static final void m16060A7(ActorDetailsActivity actorDetailsActivity) {
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        actorDetailsActivity.m16103n7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B7 */
    public static final void m16062B7(ActorDetailsActivity actorDetailsActivity, View view) {
        String str;
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        Dialog m3280r9 = actorDetailsActivity.m16082T6().m3280r9();
        boolean z10 = false;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (!z10) {
            C6933a m16082T6 = actorDetailsActivity.m16082T6();
            PersonDetailInfo personDetailInfo = actorDetailsActivity.f17198W;
            if (personDetailInfo != null) {
                str = personDetailInfo.getAwards();
            } else {
                str = null;
            }
            m16082T6.m26931I9("awards", str);
            actorDetailsActivity.m16082T6().mo3277E9(actorDetailsActivity.m3294d4(), "ActorDetailExplainDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C7 */
    public static final void m16064C7(ActorDetailsActivity actorDetailsActivity, View view) {
        String str;
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        Dialog m3280r9 = actorDetailsActivity.m16082T6().m3280r9();
        boolean z10 = false;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (!z10) {
            C6933a m16082T6 = actorDetailsActivity.m16082T6();
            PersonDetailInfo personDetailInfo = actorDetailsActivity.f17198W;
            if (personDetailInfo != null) {
                str = personDetailInfo.getAwards();
            } else {
                str = null;
            }
            m16082T6.m26931I9("awards", str);
            actorDetailsActivity.m16082T6().mo3277E9(actorDetailsActivity.m3294d4(), "ActorDetailExplainDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D7 */
    public static final void m16065D7(ActorDetailsActivity actorDetailsActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        ((TextView) actorDetailsActivity.m16123D6(R$id.tvAwardsDes)).setSelected(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E7 */
    public static final void m16067E7(ActorDetailsActivity actorDetailsActivity, View view) {
        String str;
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        Dialog m3280r9 = actorDetailsActivity.m16082T6().m3280r9();
        boolean z10 = false;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (!z10) {
            C6933a m16082T6 = actorDetailsActivity.m16082T6();
            PersonDetailInfo personDetailInfo = actorDetailsActivity.f17198W;
            if (personDetailInfo != null) {
                str = personDetailInfo.getIntroduction();
            } else {
                str = null;
            }
            m16082T6.m26931I9("introduction", str);
            actorDetailsActivity.m16082T6().mo3277E9(actorDetailsActivity.m3294d4(), "DETAIL_TYPE_INTRODUCTION");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F7 */
    public static final void m16069F7(ActorDetailsActivity actorDetailsActivity, View view) {
        String str;
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        Dialog m3280r9 = actorDetailsActivity.m16082T6().m3280r9();
        boolean z10 = false;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (!z10) {
            C6933a m16082T6 = actorDetailsActivity.m16082T6();
            PersonDetailInfo personDetailInfo = actorDetailsActivity.f17198W;
            if (personDetailInfo != null) {
                str = personDetailInfo.getIntroduction();
            } else {
                str = null;
            }
            m16082T6.m26931I9("introduction", str);
            actorDetailsActivity.m16082T6().mo3277E9(actorDetailsActivity.m3294d4(), "DETAIL_TYPE_INTRODUCTION");
        }
    }

    /* renamed from: L7 */
    private final void m16076L7(TextView textView, String str, int i10, String str2) {
        String substring = str.substring(0, i10);
        AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        textView.setText(substring + "..." + str2);
        Layout layout = textView.getLayout();
        int lineCount = layout.getLineCount();
        if (layout.getEllipsisCount(lineCount - 1) > 0) {
            m16076L7(textView, str, i10 - 2, str2);
            return;
        }
        textView.setText(substring + "...");
        if (textView.getLayout().getLineCount() != lineCount) {
            StringBuilder sb2 = new StringBuilder();
            String substring2 = substring.substring(0, substring.length() - 5);
            AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring2);
            sb2.append("...");
            textView.setText(sb2.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        r8 = p359ue.AbstractC7166t.m27728o(r8, "\n", "", false, 4, null);
     */
    /* renamed from: Q6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m16080Q6(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = p317rb.AbstractC6567a.m25637g(r8)
            if (r0 == 0) goto L22
            if (r8 == 0) goto L16
            java.lang.String r2 = "\n"
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            java.lang.String r8 = p359ue.AbstractC7157k.m27708o(r1, r2, r3, r4, r5, r6)
            if (r8 != 0) goto L2d
        L16:
            int r8 = com.vod.R$string.unknown
            java.lang.String r8 = r7.getString(r8)
            java.lang.String r0 = "getString(R.string.unknown)"
            ne.AbstractC5868k.m23673e(r8, r0)
            goto L2d
        L22:
            int r8 = com.vod.R$string.unknown
            java.lang.String r8 = r7.getString(r8)
            java.lang.String r0 = "{\n            getString(…string.unknown)\n        }"
            ne.AbstractC5868k.m23673e(r8, r0)
        L2d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vod.p089ui.activity.ActorDetailsActivity.m16080Q6(java.lang.String):java.lang.String");
    }

    /* renamed from: S6 */
    private final boolean m16081S6() {
        boolean booleanExtra = getIntent().getBooleanExtra("extra_has_detail", false);
        this.f17195N = booleanExtra;
        if (booleanExtra) {
            this.f17198W = (PersonDetailInfo) getIntent().getSerializableExtra("extra_detail");
        } else {
            this.f17196O = getIntent().getStringExtra("cast_type");
            String stringExtra = getIntent().getStringExtra("extra_content_id");
            String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            m16145q7(stringExtra);
            String stringExtra2 = getIntent().getStringExtra("extra_imdb");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            m16146s7(stringExtra2);
            String stringExtra3 = getIntent().getStringExtra("extra_type");
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
            m16130K7(str);
        }
        if (this.f17195N) {
            ((LoadingView) m16123D6(R$id.mLoadingView)).setVisibility(8);
            ((AutoLinearLayout) m16123D6(R$id.mTextNotPerson)).setVisibility(8);
            ((AutoRelativeLayout) m16123D6(R$id.mPersonLayout)).setVisibility(0);
            return true;
        }
        if (TextUtils.isEmpty(m16134R6())) {
            ((LoadingView) m16123D6(R$id.mLoadingView)).setVisibility(8);
            ((AutoRelativeLayout) m16123D6(R$id.mPersonLayout)).setVisibility(8);
            ((AutoLinearLayout) m16123D6(R$id.mTextNotPerson)).setVisibility(0);
            return false;
        }
        ((AutoLinearLayout) m16123D6(R$id.mTextNotPerson)).setVisibility(8);
        ((AutoRelativeLayout) m16123D6(R$id.mPersonLayout)).setVisibility(8);
        ((LoadingView) m16123D6(R$id.mLoadingView)).setVisibility(0);
        return true;
    }

    /* renamed from: T6 */
    private final C6933a m16082T6() {
        return (C6933a) this.f17201Z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y6 */
    public final String m16083Y6(int i10) {
        int m20871x;
        int m20871x2;
        C5166e c5166e = this.f17200Y;
        C5166e c5166e2 = null;
        if (c5166e == null) {
            AbstractC5868k.m23686r("mActorWorksAdapter");
            c5166e = null;
        }
        if (i10 % c5166e.m20871x() == 0) {
            C5166e c5166e3 = this.f17200Y;
            if (c5166e3 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
                c5166e3 = null;
            }
            m20871x = i10 / c5166e3.m20871x();
        } else {
            C5166e c5166e4 = this.f17200Y;
            if (c5166e4 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
                c5166e4 = null;
            }
            m20871x = (i10 / c5166e4.m20871x()) + 1;
        }
        int m16137W6 = m16137W6();
        C5166e c5166e5 = this.f17200Y;
        if (c5166e5 == null) {
            AbstractC5868k.m23686r("mActorWorksAdapter");
            c5166e5 = null;
        }
        if (m16137W6 % c5166e5.m20871x() == 0) {
            int m16137W62 = m16137W6();
            C5166e c5166e6 = this.f17200Y;
            if (c5166e6 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
            } else {
                c5166e2 = c5166e6;
            }
            m20871x2 = m16137W62 / c5166e2.m20871x();
        } else {
            int m16137W63 = m16137W6();
            C5166e c5166e7 = this.f17200Y;
            if (c5166e7 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
            } else {
                c5166e2 = c5166e7;
            }
            m20871x2 = (m16137W63 / c5166e2.m20871x()) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m20871x);
        sb2.append('/');
        sb2.append(m20871x2);
        return sb2.toString();
    }

    /* renamed from: Z6 */
    private final int m16084Z6(int i10) {
        int i11 = this.f17194M;
        if (i10 % i11 == 0) {
            return i10 / i11;
        }
        return (i10 / i11) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7 */
    public static final Integer m16085a7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Integer) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b7 */
    public static final void m16086b7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7 */
    public static final void m16087c7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: f7 */
    private final void m16089f7() {
        this.f17200Y = new C5166e();
        int i10 = R$id.mGridWorksList;
        AbstractC7568f1.m28999a((VerticalGridView) m16123D6(i10));
        VerticalGridView verticalGridView = (VerticalGridView) m16123D6(i10);
        C5166e c5166e = this.f17200Y;
        C5166e c5166e2 = null;
        if (c5166e == null) {
            AbstractC5868k.m23686r("mActorWorksAdapter");
            c5166e = null;
        }
        verticalGridView.setAdapter(c5166e);
        if (!this.f17195N) {
            ((AutoLinearLayout) m16123D6(R$id.mEmptyLeftLayout)).setVisibility(8);
            ((AutoLinearLayout) m16123D6(R$id.mActorListLayout)).setVisibility(0);
            Context m30049S4 = m30049S4();
            int i11 = R$id.mGridActorList;
            MemoryListView memoryListView = (MemoryListView) m16123D6(i11);
            AbstractC5868k.m23673e(memoryListView, "mGridActorList");
            this.f17199X = new C5150a(m30049S4, memoryListView);
            MemoryListView memoryListView2 = (MemoryListView) m16123D6(i11);
            C5150a c5150a = this.f17199X;
            if (c5150a == null) {
                AbstractC5868k.m23686r("mActorAdapter");
                c5150a = null;
            }
            memoryListView2.setAdapter((ListAdapter) c5150a);
            ((VerticalGridView) m16123D6(i10)).setNumColumns(5);
            C5166e c5166e3 = this.f17200Y;
            if (c5166e3 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
            } else {
                c5166e2 = c5166e3;
            }
            c5166e2.m20873z(5);
            int i12 = R$id.mImageUpArrow;
            ViewGroup.LayoutParams layoutParams = ((ImageView) m16123D6(i12)).getLayoutParams();
            AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type com.zhy.autolayout.AutoLinearLayout.LayoutParams");
            AutoLinearLayout.C3911a c3911a = (AutoLinearLayout.C3911a) layoutParams;
            ((LinearLayout.LayoutParams) c3911a).rightMargin = AbstractC7786b.m30166j(26);
            ((ImageView) m16123D6(i12)).setLayoutParams(c3911a);
            int i13 = R$id.mInfoLayout;
            ViewGroup.LayoutParams layoutParams2 = ((AutoLinearLayout) m16123D6(i13)).getLayoutParams();
            AbstractC5868k.m23672d(layoutParams2, "null cannot be cast to non-null type com.zhy.autolayout.AutoRelativeLayout.LayoutParams");
            AutoRelativeLayout.C3912a c3912a = (AutoRelativeLayout.C3912a) layoutParams2;
            ((RelativeLayout.LayoutParams) c3912a).rightMargin = AbstractC7786b.m30166j(60);
            ((AutoLinearLayout) m16123D6(i13)).setLayoutParams(c3912a);
            return;
        }
        ((AutoLinearLayout) m16123D6(R$id.mActorListLayout)).setVisibility(8);
        ((AutoLinearLayout) m16123D6(R$id.mEmptyLeftLayout)).setVisibility(0);
        ((VerticalGridView) m16123D6(i10)).setNumColumns(6);
        C5166e c5166e4 = this.f17200Y;
        if (c5166e4 == null) {
            AbstractC5868k.m23686r("mActorWorksAdapter");
        } else {
            c5166e2 = c5166e4;
        }
        c5166e2.m20873z(6);
        int i14 = R$id.mImageUpArrow;
        ViewGroup.LayoutParams layoutParams3 = ((ImageView) m16123D6(i14)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams3, "null cannot be cast to non-null type com.zhy.autolayout.AutoLinearLayout.LayoutParams");
        AutoLinearLayout.C3911a c3911a2 = (AutoLinearLayout.C3911a) layoutParams3;
        ((LinearLayout.LayoutParams) c3911a2).rightMargin = AbstractC7786b.m30166j(100);
        ((ImageView) m16123D6(i14)).setLayoutParams(c3911a2);
        int i15 = R$id.mInfoLayout;
        ViewGroup.LayoutParams layoutParams4 = ((AutoLinearLayout) m16123D6(i15)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams4, "null cannot be cast to non-null type com.zhy.autolayout.AutoRelativeLayout.LayoutParams");
        AutoRelativeLayout.C3912a c3912a2 = (AutoRelativeLayout.C3912a) layoutParams4;
        ((RelativeLayout.LayoutParams) c3912a2).rightMargin = AbstractC7786b.m30166j(130);
        ((AutoLinearLayout) m16123D6(i15)).setLayoutParams(c3912a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7 */
    public final void m16091g7(PersonDetailInfo personDetailInfo) {
        this.f17198W = personDetailInfo;
        String m29088a = C7580j1.f27853a.m29088a(personDetailInfo.getIcon());
        Drawable m27111a = AbstractC7026c.m27111a(m11976o5(), R$drawable.bg_placehoder);
        C7594o0 c7594o0 = C7594o0.f27942a;
        ImageView imageView = (ImageView) m16123D6(R$id.mImgHeader);
        AbstractC5868k.m23673e(imageView, "mImgHeader");
        Context m11976o5 = m11976o5();
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29204m(c7594o0, m29088a, imageView, m11976o5, m27111a, 0, null, 48, null);
        ((MarqueTextView) m16123D6(R$id.tvName)).setText(m16080Q6(personDetailInfo.getName()));
        ((MarqueTextView) m16123D6(R$id.tvBorn)).setText(m16080Q6(personDetailInfo.getBirthPlace()));
        m16106p7(personDetailInfo.getAwards());
        m16112t7(personDetailInfo.getIntroduction());
        ((Button) m16123D6(R$id.mButtonMovie)).setSelected(false);
        ((Button) m16123D6(R$id.mButtonSeries)).setSelected(false);
    }

    /* renamed from: h */
    private final void m16092h() {
        if (this.f17195N) {
            if (this.f17198W != null) {
                Observable compose = Observable.timer(300L, TimeUnit.MILLISECONDS).compose(AbstractC7029f.m27120a()).compose(m19900N3());
                final C3795e c3795e = new C3795e();
                Observable doFinally = compose.doOnSubscribe(new Consumer() { // from class: sd.a
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ActorDetailsActivity.m16098j7(InterfaceC5660l.this, obj);
                    }
                }).doFinally(new Action() { // from class: sd.j
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        ActorDetailsActivity.m16099k7(ActorDetailsActivity.this);
                    }
                });
                final C3796f c3796f = new C3796f();
                Consumer consumer = new Consumer() { // from class: sd.k
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ActorDetailsActivity.m16101l7(InterfaceC5660l.this, obj);
                    }
                };
                final C3797g c3797g = C3797g.f17209a;
                doFinally.subscribe(consumer, new Consumer() { // from class: sd.l
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ActorDetailsActivity.m16102m7(InterfaceC5660l.this, obj);
                    }
                });
                return;
            }
            return;
        }
        ((InterfaceC5841a) m11977r5()).mo23637g(m16133P6(), m16134R6(), m16142e7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h7 */
    public final void m16094h7() {
        if (!AbstractC5868k.m23669a(this.f17197V, "works_type_movie")) {
            this.f17197V = "works_type_movie";
            C5166e c5166e = this.f17200Y;
            String str = null;
            if (c5166e == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
                c5166e = null;
            }
            c5166e.m28847d();
            ((TextView) m16123D6(R$id.mTextPageIndicator)).setVisibility(8);
            m16124G7(1);
            m16129J7(1);
            m16127I7(0);
            m16126H7(0);
            PersonDetailInfo personDetailInfo = this.f17198W;
            if (personDetailInfo != null) {
                str = personDetailInfo.getPuId();
            }
            if (AbstractC6567a.m25637g(str)) {
                ((TextView) m16123D6(R$id.mTextNoWorksTip)).setVisibility(8);
                ((VerticalGridView) m16123D6(R$id.mGridWorksList)).setVisibility(0);
                InterfaceC5841a interfaceC5841a = (InterfaceC5841a) m11977r5();
                PersonDetailInfo personDetailInfo2 = this.f17198W;
                AbstractC5868k.m23671c(personDetailInfo2);
                String puId = personDetailInfo2.getPuId();
                AbstractC5868k.m23671c(puId);
                interfaceC5841a.mo23636S1(puId, "1", m16135U6(), this.f17194M);
                return;
            }
            ((VerticalGridView) m16123D6(R$id.mGridWorksList)).setVisibility(8);
            ((TextView) m16123D6(R$id.mTextNoWorksTip)).setVisibility(0);
        }
    }

    /* renamed from: i7 */
    private final void m16096i7() {
        if (!AbstractC5868k.m23669a(this.f17197V, "works_type_series")) {
            this.f17197V = "works_type_series";
            C5166e c5166e = this.f17200Y;
            String str = null;
            if (c5166e == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
                c5166e = null;
            }
            c5166e.m28847d();
            ((TextView) m16123D6(R$id.mTextPageIndicator)).setVisibility(8);
            m16124G7(1);
            m16129J7(1);
            m16127I7(0);
            m16126H7(0);
            PersonDetailInfo personDetailInfo = this.f17198W;
            if (personDetailInfo != null) {
                str = personDetailInfo.getPuId();
            }
            if (AbstractC6567a.m25637g(str)) {
                ((TextView) m16123D6(R$id.mTextNoWorksTip)).setVisibility(8);
                ((VerticalGridView) m16123D6(R$id.mGridWorksList)).setVisibility(0);
                InterfaceC5841a interfaceC5841a = (InterfaceC5841a) m11977r5();
                PersonDetailInfo personDetailInfo2 = this.f17198W;
                AbstractC5868k.m23671c(personDetailInfo2);
                String puId = personDetailInfo2.getPuId();
                AbstractC5868k.m23671c(puId);
                interfaceC5841a.mo23636S1(puId, MessageService.MSG_DB_READY_REPORT, m16135U6(), this.f17194M);
                return;
            }
            ((VerticalGridView) m16123D6(R$id.mGridWorksList)).setVisibility(8);
            ((TextView) m16123D6(R$id.mTextNoWorksTip)).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j7 */
    public static final void m16098j7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7 */
    public static final void m16099k7(ActorDetailsActivity actorDetailsActivity) {
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        actorDetailsActivity.mo16140d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7 */
    public static final void m16101l7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7 */
    public static final void m16102m7(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: n7 */
    private final void m16103n7() {
        boolean z10 = false;
        AbstractC4509b.m18869b(this.f17186E, "pageDown mPageIndex: " + m16135U6() + ", mRequestPageIndex: " + m16136V6() + ", mTotalPage: " + m16138X6(), new Object[0]);
        int m16136V6 = m16136V6();
        int m16138X6 = m16138X6();
        int m16135U6 = m16135U6();
        if (m16136V6 <= m16135U6 && m16135U6 < m16138X6) {
            z10 = true;
        }
        if (z10) {
            m16126H7(m16135U6() + 1);
            InterfaceC5841a interfaceC5841a = (InterfaceC5841a) m11977r5();
            PersonDetailInfo personDetailInfo = this.f17198W;
            AbstractC5868k.m23671c(personDetailInfo);
            String puId = personDetailInfo.getPuId();
            AbstractC5868k.m23671c(puId);
            interfaceC5841a.mo23636S1(puId, mo16131L1(), m16136V6(), this.f17194M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o7 */
    public final void m16104o7(View view, int i10) {
        boolean z10;
        int i11 = R$id.mGridActorList;
        int firstVisiblePosition = ((MemoryListView) m16123D6(i11)).getFirstVisiblePosition();
        int lastVisiblePosition = ((MemoryListView) m16123D6(i11)).getLastVisiblePosition();
        C5150a c5150a = this.f17199X;
        C5150a c5150a2 = null;
        if (c5150a == null) {
            AbstractC5868k.m23686r("mActorAdapter");
            c5150a = null;
        }
        int m20826e = c5150a.m20826e();
        if (firstVisiblePosition <= m20826e && m20826e <= lastVisiblePosition) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ((ImageView) m16123D6(R$id.mActorListIndicator)).setVisibility(8);
            return;
        }
        C5150a c5150a3 = this.f17199X;
        if (c5150a3 == null) {
            AbstractC5868k.m23686r("mActorAdapter");
        } else {
            c5150a2 = c5150a3;
        }
        View m20827f = c5150a2.m20827f();
        if (m20827f != null) {
            int[] iArr = new int[2];
            m20827f.getLocationOnScreen(iArr);
            if (iArr[1] + AbstractC7786b.m30163g(75) <= AbstractC7786b.m30163g(80)) {
                ((ImageView) m16123D6(R$id.mActorListIndicator)).setVisibility(8);
                return;
            }
            int i12 = R$id.mActorListIndicator;
            ViewGroup.LayoutParams layoutParams = ((ImageView) m16123D6(i12)).getLayoutParams();
            AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type com.zhy.autolayout.AutoLinearLayout.LayoutParams");
            AutoLinearLayout.C3911a c3911a = (AutoLinearLayout.C3911a) layoutParams;
            ((LinearLayout.LayoutParams) c3911a).topMargin = iArr[1] + AbstractC7786b.m30163g(75);
            ((ImageView) m16123D6(i12)).setLayoutParams(c3911a);
            ((ImageView) m16123D6(i12)).setVisibility(0);
        }
    }

    /* renamed from: p7 */
    private final void m16106p7(String str) {
        String str2 = "\t\t\t\t\t\t\t" + m16080Q6(str);
        int i10 = R$id.mTextAwards;
        ((TextView) m16123D6(i10)).setText(str2);
        Layout layout = ((TextView) m16123D6(i10)).getLayout();
        int ellipsisCount = layout.getEllipsisCount(layout.getLineCount() - 1);
        if (layout.getLineCount() > 0 && ellipsisCount > 0) {
            ((TextView) m16123D6(i10)).setFocusable(false);
            int i11 = R$id.tvAwardsMore;
            ((TextView) m16123D6(i11)).setVisibility(0);
            int lineVisibleEnd = layout.getLineVisibleEnd(layout.getLineCount() - 1);
            boolean z10 = this.f17195N;
            if (z10 && lineVisibleEnd > 169) {
                lineVisibleEnd = 169;
            } else if (!z10 && lineVisibleEnd > 120) {
                lineVisibleEnd = 120;
            }
            TextView textView = (TextView) m16123D6(i10);
            AbstractC5868k.m23673e(textView, "mTextAwards");
            m16076L7(textView, str2, lineVisibleEnd - 8, ((TextView) m16123D6(i11)).getText().toString());
            return;
        }
        ((TextView) m16123D6(i10)).setFocusable(true);
        ((TextView) m16123D6(R$id.tvAwardsMore)).setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r7 */
    public final void m16109r7(boolean z10) {
        if (z10) {
            if (((TextView) m16123D6(R$id.tvAwardsMore)).getVisibility() == 4) {
                ((TextView) m16123D6(R$id.mTextAwards)).setFocusable(z10);
            }
            int i10 = R$id.tvIntroductionMore;
            if (((TextView) m16123D6(i10)).getVisibility() == 4) {
                ((TextView) m16123D6(i10)).setFocusable(z10);
            }
        }
        ((Button) m16123D6(R$id.mButtonMovie)).setFocusable(z10);
        ((Button) m16123D6(R$id.mButtonSeries)).setFocusable(z10);
    }

    /* renamed from: t7 */
    private final void m16112t7(String str) {
        int i10;
        String str2 = "\t\t\t\t\t\t\t\t\t" + m16080Q6(str);
        int i11 = R$id.mTextIntroduction;
        ((TextView) m16123D6(i11)).setText(str2);
        Layout layout = ((TextView) m16123D6(i11)).getLayout();
        if (layout != null) {
            i10 = layout.getLineCount();
        } else {
            i10 = 0;
        }
        if (i10 > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            ((TextView) m16123D6(i11)).setFocusable(false);
            int i12 = R$id.tvIntroductionMore;
            ((TextView) m16123D6(i12)).setVisibility(0);
            int lineVisibleEnd = layout.getLineVisibleEnd(layout.getLineCount() - 1);
            boolean z10 = this.f17195N;
            if (z10 && lineVisibleEnd > 169) {
                lineVisibleEnd = 169;
            } else if (!z10 && lineVisibleEnd > 120) {
                lineVisibleEnd = 120;
            }
            TextView textView = (TextView) m16123D6(i11);
            AbstractC5868k.m23673e(textView, "mTextIntroduction");
            m16076L7(textView, str2, lineVisibleEnd - 8, ((TextView) m16123D6(i12)).getText().toString());
            return;
        }
        ((TextView) m16123D6(i11)).setFocusable(true);
        ((TextView) m16123D6(R$id.tvIntroductionMore)).setVisibility(4);
    }

    /* renamed from: u7 */
    private final void m16113u7() {
        int i10 = R$id.mGridActorList;
        ((MemoryListView) m16123D6(i10)).setOnItemSelectedListener(new C3800j());
        ((MemoryListView) m16123D6(i10)).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: sd.m
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j10) {
                ActorDetailsActivity.m16114v7(ActorDetailsActivity.this, adapterView, view, i11, j10);
            }
        });
        ((MemoryListView) m16123D6(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: sd.o
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m16116w7;
                m16116w7 = ActorDetailsActivity.m16116w7(ActorDetailsActivity.this, view, i11, keyEvent);
                return m16116w7;
            }
        });
        int i11 = R$id.mButtonMovie;
        ((Button) m16123D6(i11)).setFocusableInTouchMode(true);
        ((Button) m16123D6(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sd.p
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ActorDetailsActivity.m16120y7(ActorDetailsActivity.this, view, z10);
            }
        });
        int i12 = R$id.mButtonSeries;
        ((Button) m16123D6(i12)).setFocusableInTouchMode(true);
        ((Button) m16123D6(i12)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sd.q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ActorDetailsActivity.m16122z7(ActorDetailsActivity.this, view, z10);
            }
        });
        int i13 = R$id.mGridWorksList;
        ((VerticalGridView) m16123D6(i13)).setOnLoadMoreListener(new AbstractC3050a.d() { // from class: sd.r
            @Override // com.open.leanback.widget.AbstractC3050a.d
            public final void onLoadMore() {
                ActorDetailsActivity.m16060A7(ActorDetailsActivity.this);
            }
        });
        ((VerticalGridView) m16123D6(i13)).setOnChildViewHolderSelectedListener(this.f17202g0);
        ((VerticalGridView) m16123D6(i13)).setOnScrollChangeListener(new C3801k());
        C5166e c5166e = this.f17200Y;
        if (c5166e == null) {
            AbstractC5868k.m23686r("mActorWorksAdapter");
            c5166e = null;
        }
        c5166e.m20868A(new C3802l());
        int i14 = R$id.mTextAwards;
        ((TextView) m16123D6(i14)).setOnClickListener(new View.OnClickListener() { // from class: sd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActorDetailsActivity.m16062B7(ActorDetailsActivity.this, view);
            }
        });
        ((TextView) m16123D6(R$id.tvAwardsMore)).setOnClickListener(new View.OnClickListener() { // from class: sd.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActorDetailsActivity.m16064C7(ActorDetailsActivity.this, view);
            }
        });
        ((TextView) m16123D6(i14)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sd.d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ActorDetailsActivity.m16065D7(ActorDetailsActivity.this, view, z10);
            }
        });
        int i15 = R$id.mTextIntroduction;
        ((TextView) m16123D6(i15)).setOnClickListener(new View.OnClickListener() { // from class: sd.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActorDetailsActivity.m16067E7(ActorDetailsActivity.this, view);
            }
        });
        ((TextView) m16123D6(R$id.tvIntroductionMore)).setOnClickListener(new View.OnClickListener() { // from class: sd.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActorDetailsActivity.m16069F7(ActorDetailsActivity.this, view);
            }
        });
        ((TextView) m16123D6(i15)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sd.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ActorDetailsActivity.m16118x7(ActorDetailsActivity.this, view, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7 */
    public static final void m16114v7(ActorDetailsActivity actorDetailsActivity, AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        C5150a c5150a = actorDetailsActivity.f17199X;
        if (c5150a == null) {
            AbstractC5868k.m23686r("mActorAdapter");
            c5150a = null;
        }
        c5150a.m20828g(i10, view);
        actorDetailsActivity.m16104o7(view, i10);
        C5150a c5150a2 = actorDetailsActivity.f17199X;
        if (c5150a2 == null) {
            AbstractC5868k.m23686r("mActorAdapter");
            c5150a2 = null;
        }
        actorDetailsActivity.m16091g7(c5150a2.getItem(i10));
        actorDetailsActivity.f17197V = null;
        actorDetailsActivity.m16094h7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7 */
    public static final boolean m16116w7(ActorDetailsActivity actorDetailsActivity, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 20) {
            int i11 = R$id.mGridActorList;
            if (((MemoryListView) actorDetailsActivity.m16123D6(i11)).getCount() > 1 && ((MemoryListView) actorDetailsActivity.m16123D6(i11)).getSelectedItemPosition() == ((MemoryListView) actorDetailsActivity.m16123D6(i11)).getCount() - 1) {
                ((MemoryListView) actorDetailsActivity.m16123D6(i11)).setSelectionTriggerItemSelect(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7 */
    public static final void m16118x7(ActorDetailsActivity actorDetailsActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        ((TextView) actorDetailsActivity.m16123D6(R$id.tvIntroductionDes)).setSelected(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7 */
    public static final void m16120y7(ActorDetailsActivity actorDetailsActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        view.setSelected(false);
        if (z10) {
            actorDetailsActivity.m16094h7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z7 */
    public static final void m16122z7(ActorDetailsActivity actorDetailsActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(actorDetailsActivity, "this$0");
        view.setSelected(false);
        if (z10) {
            actorDetailsActivity.m16096i7();
        }
    }

    /* renamed from: D6 */
    public View m16123D6(int i10) {
        Map map = this.f17203h0;
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

    /* renamed from: G7 */
    public void m16124G7(int i10) {
        this.f17190I = i10;
    }

    @Override // p253nd.InterfaceC5842b
    /* renamed from: H0 */
    public void mo16125H0() {
        ((AutoRelativeLayout) m16123D6(R$id.mPersonLayout)).setVisibility(8);
        ((AutoLinearLayout) m16123D6(R$id.mTextNotPerson)).setVisibility(0);
    }

    /* renamed from: H7 */
    public void m16126H7(int i10) {
        this.f17193L = i10;
    }

    /* renamed from: I7 */
    public void m16127I7(int i10) {
        this.f17192K = i10;
    }

    @Override // p253nd.InterfaceC5842b
    /* renamed from: J2 */
    public void mo16128J2(String str, PersonWorksData personWorksData) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(personWorksData, "data");
        int i10 = 8;
        C5166e c5166e = null;
        if (AbstractC6567a.m25638h(personWorksData.getItemList())) {
            ((TextView) m16123D6(R$id.mTextNoWorksTip)).setVisibility(8);
            ((VerticalGridView) m16123D6(R$id.mGridWorksList)).setVisibility(0);
            C5166e c5166e2 = this.f17200Y;
            if (c5166e2 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
                c5166e2 = null;
            }
            if (!AbstractC6567a.m25635e(c5166e2.m28849g())) {
                C5166e c5166e3 = this.f17200Y;
                if (c5166e3 == null) {
                    AbstractC5868k.m23686r("mActorWorksAdapter");
                    c5166e3 = null;
                }
                List<PersonWorksInfo> itemList = personWorksData.getItemList();
                AbstractC5868k.m23671c(itemList);
                c5166e3.m28845b(AbstractC5882y.m23702b(itemList));
                C5166e c5166e4 = this.f17200Y;
                if (c5166e4 == null) {
                    AbstractC5868k.m23686r("mActorWorksAdapter");
                    c5166e4 = null;
                }
                C5166e c5166e5 = this.f17200Y;
                if (c5166e5 == null) {
                    AbstractC5868k.m23686r("mActorWorksAdapter");
                    c5166e5 = null;
                }
                int size = c5166e5.m28849g().size();
                List<PersonWorksInfo> itemList2 = personWorksData.getItemList();
                AbstractC5868k.m23671c(itemList2);
                int size2 = (size - itemList2.size()) - 1;
                C5166e c5166e6 = this.f17200Y;
                if (c5166e6 == null) {
                    AbstractC5868k.m23686r("mActorWorksAdapter");
                    c5166e6 = null;
                }
                c5166e4.notifyItemRangeChanged(size2, c5166e6.m28849g().size());
            } else {
                C5166e c5166e7 = this.f17200Y;
                if (c5166e7 == null) {
                    AbstractC5868k.m23686r("mActorWorksAdapter");
                    c5166e7 = null;
                }
                List<PersonWorksInfo> itemList3 = personWorksData.getItemList();
                AbstractC5868k.m23671c(itemList3);
                c5166e7.m28854l(AbstractC5882y.m23702b(itemList3));
                ((TextView) m16123D6(R$id.mTextPageIndicator)).setText(m16083Y6(1));
            }
            m16129J7(m16084Z6(personWorksData.getTotalSize()));
            m16127I7(personWorksData.getTotalSize());
            C5166e c5166e8 = this.f17200Y;
            if (c5166e8 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
                c5166e8 = null;
            }
            m16124G7(m16084Z6(c5166e8.m28849g().size()));
            m16126H7(m16135U6());
        } else {
            C5166e c5166e9 = this.f17200Y;
            if (c5166e9 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
                c5166e9 = null;
            }
            if (AbstractC6567a.m25635e(c5166e9.m28849g())) {
                C5166e c5166e10 = this.f17200Y;
                if (c5166e10 == null) {
                    AbstractC5868k.m23686r("mActorWorksAdapter");
                    c5166e10 = null;
                }
                c5166e10.m28847d();
                m16124G7(1);
                m16126H7(1);
                m16129J7(0);
                m16127I7(0);
                ((VerticalGridView) m16123D6(R$id.mGridWorksList)).setVisibility(8);
                ((TextView) m16123D6(R$id.mTextNoWorksTip)).setVisibility(0);
            } else {
                C5166e c5166e11 = this.f17200Y;
                if (c5166e11 == null) {
                    AbstractC5868k.m23686r("mActorWorksAdapter");
                    c5166e11 = null;
                }
                m16124G7(m16084Z6(c5166e11.m28849g().size()));
                m16126H7(m16135U6());
                ((TextView) m16123D6(R$id.mTextNoWorksTip)).setVisibility(8);
                ((VerticalGridView) m16123D6(R$id.mGridWorksList)).setVisibility(0);
            }
        }
        TextView textView = (TextView) m16123D6(R$id.mTextPageIndicator);
        C5166e c5166e12 = this.f17200Y;
        if (c5166e12 == null) {
            AbstractC5868k.m23686r("mActorWorksAdapter");
        } else {
            c5166e = c5166e12;
        }
        if (c5166e.m28849g().size() > 0) {
            i10 = 0;
        }
        textView.setVisibility(i10);
    }

    /* renamed from: J7 */
    public void m16129J7(int i10) {
        this.f17191J = i10;
    }

    /* renamed from: K7 */
    public void m16130K7(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f17189H = str;
    }

    @Override // p253nd.InterfaceC5842b
    /* renamed from: L1 */
    public String mo16131L1() {
        if (AbstractC5868k.m23669a(this.f17197V, "works_type_movie")) {
            return "1";
        }
        return MessageService.MSG_DB_READY_REPORT;
    }

    @Override // p253nd.InterfaceC5842b
    /* renamed from: M1 */
    public void mo16132M1(List list) {
        AbstractC5868k.m23674f(list, "data");
        ((AutoLinearLayout) m16123D6(R$id.mTextNotPerson)).setVisibility(8);
        ((AutoRelativeLayout) m16123D6(R$id.mPersonLayout)).setVisibility(0);
        m16109r7(true);
        C5150a c5150a = this.f17199X;
        if (c5150a == null) {
            AbstractC5868k.m23686r("mActorAdapter");
            c5150a = null;
        }
        c5150a.m20822a(list);
        Observable compose = Observable.timer(400L, TimeUnit.MILLISECONDS).compose(AbstractC7029f.m27120a()).compose(m19900N3());
        final C3792b c3792b = new C3792b();
        Observable map = compose.map(new Function() { // from class: sd.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Integer m16085a7;
                m16085a7 = ActorDetailsActivity.m16085a7(InterfaceC5660l.this, obj);
                return m16085a7;
            }
        });
        final C3793c c3793c = new C3793c();
        Consumer consumer = new Consumer() { // from class: sd.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ActorDetailsActivity.m16086b7(InterfaceC5660l.this, obj);
            }
        };
        final C3794d c3794d = C3794d.f17206a;
        map.subscribe(consumer, new Consumer() { // from class: sd.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ActorDetailsActivity.m16087c7(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: P6 */
    public String m16133P6() {
        return this.f17187F;
    }

    /* renamed from: R6 */
    public String m16134R6() {
        return this.f17188G;
    }

    /* renamed from: U6 */
    public int m16135U6() {
        return this.f17190I;
    }

    /* renamed from: V6 */
    public int m16136V6() {
        return this.f17193L;
    }

    /* renamed from: W6 */
    public int m16137W6() {
        return this.f17192K;
    }

    /* renamed from: X6 */
    public int m16138X6() {
        return this.f17191J;
    }

    @Override // p253nd.InterfaceC5842b
    /* renamed from: c */
    public void mo16139c() {
        ((LoadingView) m16123D6(R$id.mLoadingView)).setVisibility(0);
    }

    @Override // p253nd.InterfaceC5842b
    /* renamed from: d */
    public void mo16140d() {
        ((LoadingView) m16123D6(R$id.mLoadingView)).setVisibility(8);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: d7, reason: merged with bridge method [inline-methods] */
    public InterfaceC5841a mo7516s5() {
        return new C6266d(this, this);
    }

    /* renamed from: e7 */
    public String m16142e7() {
        return this.f17189H;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((AutoRelativeLayout) m16123D6(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        m16109r7(false);
        if (m16081S6()) {
            m16089f7();
            m16113u7();
            m16092h();
        }
    }

    @Override // p253nd.InterfaceC5842b
    /* renamed from: i2 */
    public void mo16143i2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        ((AutoRelativeLayout) m16123D6(R$id.mPersonLayout)).setVisibility(8);
        ((AutoLinearLayout) m16123D6(R$id.mTextNotPerson)).setVisibility(8);
        m16109r7(true);
        AbstractActivityC2972a.m11957W5(this, str, true, null, null, null, null, null, 124, null);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getKeyCode() == 20) {
            if (((TextView) m16123D6(R$id.mTextIntroduction)).hasFocus()) {
                if (AbstractC5868k.m23669a(this.f17197V, "works_type_movie")) {
                    ((Button) m16123D6(R$id.mButtonMovie)).requestFocus();
                    return true;
                }
                if (AbstractC5868k.m23669a(this.f17197V, "works_type_series")) {
                    ((Button) m16123D6(R$id.mButtonSeries)).requestFocus();
                    return true;
                }
            } else if (((Button) m16123D6(R$id.mButtonMovie)).hasFocus() || ((Button) m16123D6(R$id.mButtonSeries)).hasFocus()) {
                int i11 = R$id.mGridWorksList;
                if (((VerticalGridView) m16123D6(i11)).getVisibility() == 8 || ((VerticalGridView) m16123D6(i11)).getChildCount() == 0) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p253nd.InterfaceC5842b
    /* renamed from: q0 */
    public void mo16144q0(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "errCode");
        C5166e c5166e = this.f17200Y;
        C5166e c5166e2 = null;
        if (c5166e == null) {
            AbstractC5868k.m23686r("mActorWorksAdapter");
            c5166e = null;
        }
        if (c5166e.m28849g().size() == 0) {
            ((VerticalGridView) m16123D6(R$id.mGridWorksList)).setVisibility(8);
            ((TextView) m16123D6(R$id.mTextNoWorksTip)).setVisibility(0);
            ((TextView) m16123D6(R$id.mTextPageIndicator)).setVisibility(8);
        } else {
            C5166e c5166e3 = this.f17200Y;
            if (c5166e3 == null) {
                AbstractC5868k.m23686r("mActorWorksAdapter");
            } else {
                c5166e2 = c5166e3;
            }
            m16124G7(m16084Z6(c5166e2.m28849g().size()));
            m16126H7(m16135U6());
        }
        AbstractActivityC2972a.m11957W5(this, str2, true, null, null, null, null, null, 124, null);
    }

    /* renamed from: q7 */
    public void m16145q7(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f17187F = str;
    }

    /* renamed from: s7 */
    public void m16146s7(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f17188G = str;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_actor_details;
    }
}
