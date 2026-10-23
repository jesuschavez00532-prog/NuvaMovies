package p251n9;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import be.C1328x;
import cc.C1466m0;
import com.mine.R$id;
import com.mine.R$layout;
import com.module.p070ui.activity.WebActivity;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.UserInfo;
import com.taobao.accs.flowcontrol.FlowControl;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p132fa.C4300d;
import p160h9.InterfaceC4735k;
import p160h9.InterfaceC4736l;
import p170i2.C4842a;
import p192j9.C5032o;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5095l;
import p348u2.AbstractC7029f;
import p371vb.C7252a;
import p400xa.AbstractC7555b0;
import p400xa.C7619y;
import p433zd.AbstractC7786b;

/* renamed from: n9.q */
/* loaded from: classes2.dex */
public final class C5810q extends AbstractC5774c<InterfaceC4735k> implements InterfaceC4736l {

    /* renamed from: C0 */
    private boolean f23239C0;

    /* renamed from: D0 */
    public Map f23240D0 = new LinkedHashMap();

    /* renamed from: B0 */
    private final String f23238B0 = "FeedBackFragment";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.q$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f23241a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f23241a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "it");
            Intent putExtra = intent.putExtra("extra_url", this.f23241a);
            AbstractC5868k.m23673e(putExtra, "it.putExtra(WebActivity.EXTRA_URL, url)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.q$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f23242a = new b();

        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return AbstractC5095l.m20689c(str, AbstractC7786b.m30166j(FlowControl.STATUS_FLOW_CTRL_ALL), AbstractC7786b.m30166j(FlowControl.STATUS_FLOW_CTRL_ALL));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.q$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m23433a(Bitmap bitmap) {
            if (bitmap != null) {
                ((ImageView) C5810q.this.m23429W9(R$id.setting_feedback_scan_qr)).setImageBitmap(bitmap);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23433a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.q$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f23244a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m23434a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23434a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public static final void m23423X9(C5810q c5810q, View view) {
        String str = null;
        GetAuthInfoResultData data;
        AbstractC5868k.m23674f(c5810q, "this$0");
        Context m3096J6 = c5810q.m3096J6();
        if (m3096J6 == null || !AbstractC7555b0.m28949c(m3096J6)) {
            return;
        }
        String m18049o = C4300d.f18678a.m18049o();
        String mo19960i = C4842a.f20329a.m19920a().mo19960i(m3096J6);
        String language = Locale.getDefault().getLanguage();
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h == null || (data = m28073h.getData()) == null || (str = data.getUserType()) == null) {
            str = "";
        }
        C7619y.m29367d(C7619y.f28056a, m3096J6, WebActivity.class, null, new a("http://" + m18049o + "/#/tv-help?appId=" + mo19960i + "&lang=" + language + "&userType=" + str + "&timestamp=" + new Date().getTime() + "&portalCode=" + C1466m0.f5627a.m6882q()), 2, null);
    }

    /* renamed from: Y9 */
    private final void m23424Y9() {
        String str = null;
        String str2 = null;
        GetAuthInfoResultData data;
        String showFlag = null;
        C5881x c5881x = C5881x.f23415a;
        Object[] objArr = new Object[8];
        objArr[0] = C4300d.f18678a.m18049o();
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            str = C4842a.f20329a.m19920a().mo19960i(m3096J6);
        } else {
            str = null;
        }
        objArr[1] = str;
        C1466m0 c1466m0 = C1466m0.f5627a;
        objArr[2] = c1466m0.m6878m();
        objArr[3] = Locale.getDefault().getLanguage();
        objArr[4] = Integer.valueOf(AbstractC5085b.m20602l(m3096J6()));
        UserInfo m6887v = c1466m0.m6887v();
        String str3 = "";
        if (m6887v == null || (str2 = m6887v.getEmail()) == null) {
            str2 = "";
        }
        objArr[5] = str2;
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null && (data = m28073h.getData()) != null && (showFlag = data.getShowFlag()) != null) {
            str3 = showFlag;
        }
        objArr[6] = str3;
        objArr[7] = Long.valueOf(new Date().getTime());
        String format = String.format("http://%s/#/feedback?appId=%s&userId=%s&lang=%s&appVersion=%s&email=%s&tvType=1&userType=%s&timeStamp=%s", Arrays.copyOf(objArr, 8));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        Observable just = Observable.just(format);
        final b bVar = b.f23242a;
        Observable compose = just.map(new Function() { // from class: n9.n
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m23425Z9;
                m23425Z9 = C5810q.m23425Z9(InterfaceC5660l.this, obj);
                return m23425Z9;
            }
        }).compose(m19902N3()).compose(AbstractC7029f.m27120a());
        final c cVar = new c();
        Consumer consumer = new Consumer() { // from class: n9.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5810q.m23426aa(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f23244a;
        compose.subscribe(consumer, new Consumer() { // from class: n9.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5810q.m23427ba(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z9 */
    public static final Bitmap m23425Z9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aa */
    public static final void m23426aa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final void m23427ba(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* renamed from: ca */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m23428ca() {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n9.C5810q.m23428ca():void");
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_feedback;
    }

    @Override // p160h9.InterfaceC4736l
    /* renamed from: B */
    public void mo19616B(int i10) {
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23429W9(R$id.llWhatsAppTips);
        if (autoRelativeLayout != null) {
            autoRelativeLayout.setVisibility(8);
        }
        AutoRelativeLayout autoRelativeLayout2 = (AutoRelativeLayout) m23429W9(R$id.llWhatsAppTipsTwo);
        if (autoRelativeLayout2 != null) {
            autoRelativeLayout2.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23429W9(R$id.mTvEmailTips);
        if (autoLinearLayout != null) {
            autoLinearLayout.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m23429W9(R$id.tvWebTips);
        if (autoLinearLayout2 != null) {
            autoLinearLayout2.setVisibility(8);
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        TextView textView = (TextView) m23429W9(R$id.mTvHelpCenter);
        if (textView == null || textView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    public void mo23245O9() {
        TextView textView = (TextView) m23429W9(R$id.mTvHelpCenter);
        if (textView != null) {
            textView.requestFocus();
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: W9 */
    public View m23429W9(int i10) {
        View findViewById;
        Map map = this.f23240D0;
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

    /* JADX WARN: Removed duplicated region for block: B:113:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    @Override // p160h9.InterfaceC4736l
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo19617c0(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n9.C5810q.mo19617c0(java.lang.String):void");
    }

    @Override // ba.AbstractC1196d
    /* renamed from: da, reason: merged with bridge method [inline-methods] */
    public InterfaceC4735k mo5465y9() {
        return new C5032o(this, this);
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        m23428ca();
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23240D0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        int i10 = R$id.mTvHelpCenter;
        ((TextView) m23429W9(i10)).setPaintFlags(8);
        ((TextView) m23429W9(i10)).getPaint().setAntiAlias(true);
        ((TextView) m23429W9(i10)).setOnClickListener(new View.OnClickListener() { // from class: n9.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5810q.m23423X9(C5810q.this, view);
            }
        });
        m23424Y9();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23239C0;
    }
}
