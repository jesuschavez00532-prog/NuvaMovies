package p387wd;

import android.R;
import android.app.Activity;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.event.MsgUnReadSizeUpdateEvent;
import com.module.p069db.UmengPush;
import com.module.p069db.UmengPushDao;
import com.taobao.accs.common.Constants;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.R$style;
import com.vod.view.MainFocusListView;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.Callable;
import md.C5639b;
import md.ViewOnClickListenerC5641d;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import p162hb.C4814c;
import p201k2.AbstractC5085b;
import p212kd.C5250z0;
import p348u2.AbstractC7029f;
import p348u2.AbstractC7030g;
import p387wd.C7414k;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: wd.k */
/* loaded from: classes3.dex */
public final class C7414k extends PopupWindow {

    /* renamed from: a */
    private Activity f27433a;

    /* renamed from: b */
    private TextView f27434b;

    /* renamed from: c */
    private MainFocusListView f27435c;

    /* renamed from: d */
    private TextView f27436d;

    /* renamed from: e */
    private FrameLayout f27437e;

    /* renamed from: f */
    private final InterfaceC1312h f27438f;

    /* renamed from: g */
    private final InterfaceC1312h f27439g;

    /* renamed from: h */
    private C4814c f27440h;

    /* renamed from: i */
    private ViewOnClickListenerC5641d f27441i;

    /* renamed from: j */
    private Disposable f27442j;

    /* renamed from: k */
    private C5639b f27443k;

    /* renamed from: wd.k$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private List f27444a;

        /* renamed from: b */
        private int f27445b;

        public a(List list, int i10) {
            AbstractC5868k.m23674f(list, "list");
            this.f27444a = list;
            this.f27445b = i10;
        }

        /* renamed from: a */
        public final List m28537a() {
            return this.f27444a;
        }

        /* renamed from: b */
        public final int m28538b() {
            return this.f27445b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5868k.m23669a(this.f27444a, aVar.f27444a) && this.f27445b == aVar.f27445b;
        }

        public int hashCode() {
            return (this.f27444a.hashCode() * 31) + this.f27445b;
        }

        public String toString() {
            return "PushMsgList(list=" + this.f27444a + ", unReadSize=" + this.f27445b + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wd.k$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m28540e(a aVar, C7414k c7414k) {
            AbstractC5868k.m23674f(c7414k, "this$0");
            if (aVar.m28537a().size() > 0) {
                c7414k.m28533p().requestFocus();
                c7414k.m28533p().setSelection(0);
            }
        }

        /* renamed from: d */
        public final void m28541d(final a aVar) {
            C7414k.this.m28526z(aVar.m28538b());
            C7414k.this.m28534q().m28843f(aVar.m28537a());
            MainFocusListView m28533p = C7414k.this.m28533p();
            final C7414k c7414k = C7414k.this;
            m28533p.postDelayed(new Runnable() { // from class: wd.l
                @Override // java.lang.Runnable
                public final void run() {
                    C7414k.b.m28540e(C7414k.a.this, c7414k);
                }
            }, 200L);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28541d((a) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wd.k$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m28542a(Throwable th) {
            C7414k.this.m28526z(0);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28542a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: wd.k$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f27448a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5250z0 invoke() {
            return new C5250z0();
        }
    }

    /* renamed from: wd.k$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f27449a = new e();

        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UmengPushDao invoke() {
            return new UmengPushDao();
        }
    }

    public C7414k(Activity activity) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(activity, "activity");
        this.f27433a = activity;
        m5965b = AbstractC1314j.m5965b(e.f27449a);
        this.f27438f = m5965b;
        m5965b2 = AbstractC1314j.m5965b(d.f27448a);
        this.f27439g = m5965b2;
        Activity activity2 = this.f27433a;
        AbstractC5868k.m23672d(activity2, "null cannot be cast to non-null type android.content.Context");
        setContentView(LayoutInflater.from(activity2).inflate(R$layout.layout_news, (ViewGroup) null));
        setWidth(AbstractC7786b.m30166j(580));
        setHeight(-1);
        setFocusable(true);
        View findViewById = getContentView().findViewById(R$id.mTextMessageNumber);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f27434b = (TextView) findViewById;
        View findViewById2 = getContentView().findViewById(R$id.mListViewMessage);
        AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type com.vod.view.MainFocusListView");
        this.f27435c = (MainFocusListView) findViewById2;
        View findViewById3 = getContentView().findViewById(R$id.mTextEmpty);
        AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f27436d = (TextView) findViewById3;
        View findViewById4 = getContentView().findViewById(R$id.mFocusBorderView);
        AbstractC5868k.m23672d(findViewById4, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f27437e = (FrameLayout) findViewById4;
        m28536s();
    }

    /* renamed from: B */
    private final void m28506B(UmengPush umengPush) {
        Activity activity = this.f27433a;
        AbstractC5868k.m23672d(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) activity).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "activity as FragmentActi…y).supportFragmentManager");
        C5639b c5639b = this.f27443k;
        boolean z10 = false;
        if (c5639b != null && c5639b.m3079D7()) {
            z10 = true;
        }
        if (z10) {
            C5639b c5639b2 = this.f27443k;
            if (c5639b2 != null) {
                c5639b2.mo3278o9();
            }
            C5639b c5639b3 = this.f27443k;
            if (c5639b3 != null) {
                c5639b3.m22881L9(m3294d4, "pushUpgradeDialog", umengPush);
                return;
            }
            return;
        }
        C5639b c5639b4 = new C5639b();
        this.f27443k = c5639b4;
        c5639b4.m22881L9(m3294d4, "pushUpgradeDialog", umengPush);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final a m28517m(C7414k c7414k) {
        AbstractC5868k.m23674f(c7414k, "this$0");
        String m20603m = AbstractC5085b.m20603m(c7414k.f27433a);
        UmengPushDao m28535r = c7414k.m28535r();
        AbstractC5868k.m23673e(m20603m, "versionName");
        m28535r.deleteMessageByMsgId(m20603m);
        List<UmengPush> queryAllMessage = c7414k.m28535r().queryAllMessage();
        AbstractC5868k.m23672d(queryAllMessage, "null cannot be cast to non-null type kotlin.collections.MutableList<com.module.db.UmengPush>");
        return new a(AbstractC5882y.m23702b(queryAllMessage), c7414k.m28535r().queryMessageUnReadSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m28518n(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m28519o(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m28520t(final C7414k c7414k, AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5868k.m23674f(c7414k, "this$0");
        final UmengPush umengPush = (UmengPush) c7414k.m28534q().getItem(i10);
        if (umengPush != null) {
            String messageType = umengPush.getMessageType();
            if (AbstractC5868k.m23669a(messageType, UmengPush.TYPE_ORDER)) {
                c7414k.m28529D(umengPush);
            } else if (AbstractC5868k.m23669a(messageType, UmengPush.TYPE_UPGRADE)) {
                c7414k.m28530E(umengPush);
            } else if (AbstractC5868k.m23669a(messageType, UmengPush.TYPE_LOGIN)) {
                c7414k.m28528C(umengPush);
            } else if (AbstractC5868k.m23669a(messageType, UmengPush.TYPE_EVENT)) {
                c7414k.m28506B(umengPush);
            }
            if (!AbstractC5868k.m23669a(umengPush.getStatus(), UmengPush.ALREADY_READ)) {
                AbstractC7030g.m27129c("update msg status", new Runnable() { // from class: wd.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7414k.m28521u(C7414k.this, umengPush);
                    }
                }, false);
                umengPush.setStatus(UmengPush.ALREADY_READ);
                c7414k.m28534q().m21155i(c7414k.f27435c, i10);
                c7414k.m28526z(c7414k.m28534q().m21154h());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m28521u(C7414k c7414k, UmengPush umengPush) {
        AbstractC5868k.m23674f(c7414k, "this$0");
        AbstractC5868k.m23674f(umengPush, "$message");
        UmengPushDao m28535r = c7414k.m28535r();
        String msgId = umengPush.getMsgId();
        AbstractC5868k.m23673e(msgId, "message.msgId");
        UmengPushDao.updateMessageStatusByMsgId$default(m28535r, msgId, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m28522v(final C7414k c7414k, View view) {
        AbstractC5868k.m23674f(c7414k, "this$0");
        AbstractC7030g.m27129c("delete msg", new Runnable() { // from class: wd.g
            @Override // java.lang.Runnable
            public final void run() {
                C7414k.m28523w(C7414k.this);
            }
        }, false);
        c7414k.m28526z(0);
        c7414k.m28534q().m28839a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m28523w(C7414k c7414k) {
        AbstractC5868k.m23674f(c7414k, "this$0");
        c7414k.m28535r().deleteAllMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m28524x(C7414k c7414k, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7414k, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 4) {
            c7414k.dismiss();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final boolean m28525y(C7414k c7414k, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7414k, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 4) {
            c7414k.dismiss();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m28526z(int i10) {
        int i11 = 0;
        StringBuilder sb2;
        String string = this.f27433a.getString(R$string.message_number_hint);
        AbstractC5868k.m23673e(string, "activity.getString(R.string.message_number_hint)");
        Activity activity = this.f27433a;
        if (i10 > 1) {
            i11 = R$string.message_number_hint_end_complex;
        } else {
            i11 = R$string.message_number_hint_end;
        }
        String string2 = activity.getString(i11);
        AbstractC5868k.m23673e(string2, "if (it >1)activity.getSt….message_number_hint_end)");
        boolean z10 = false;
        if (1 <= i10 && i10 < 10) {
            z10 = true;
        }
        if (z10) {
            sb2 = new StringBuilder();
            sb2.append('0');
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
        }
        sb2.append(i10);
        String sb3 = sb2.toString();
        SpannableString spannableString = new SpannableString(string + sb3 + string2);
        spannableString.setSpan(new TextAppearanceSpan(this.f27433a, R$style.style_msg_size_color), string.length() - 1, string.length() + sb3.length(), 33);
        this.f27434b.setText(spannableString);
    }

    /* renamed from: A */
    public final void m28527A() {
        setAnimationStyle(R$style.message_pop_style);
        showAtLocation(this.f27433a.getWindow().getDecorView().findViewById(R.id.content), 3, 0, 0);
        m28532l();
    }

    /* renamed from: C */
    public final void m28528C(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
    }

    /* renamed from: D */
    public final void m28529D(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
        Activity activity = this.f27433a;
        AbstractC5868k.m23672d(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) activity).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "activity as FragmentActi…y).supportFragmentManager");
        C4814c c4814c = this.f27440h;
        boolean z10 = false;
        if (c4814c != null && c4814c.m3079D7()) {
            z10 = true;
        }
        if (z10) {
            C4814c c4814c2 = this.f27440h;
            if (c4814c2 != null) {
                c4814c2.mo3278o9();
            }
            C4814c c4814c3 = this.f27440h;
            if (c4814c3 != null) {
                c4814c3.m19896N9(m3294d4, "pushProgramDialog", umengPush);
                return;
            }
            return;
        }
        C4814c c4814c4 = new C4814c();
        this.f27440h = c4814c4;
        c4814c4.m19896N9(m3294d4, "pushProgramDialog", umengPush);
    }

    /* renamed from: E */
    public final void m28530E(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
        Activity activity = this.f27433a;
        AbstractC5868k.m23672d(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) activity).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "activity as FragmentActi…y).supportFragmentManager");
        ViewOnClickListenerC5641d viewOnClickListenerC5641d = this.f27441i;
        boolean z10 = false;
        if (viewOnClickListenerC5641d != null && viewOnClickListenerC5641d.m3079D7()) {
            z10 = true;
        }
        if (z10) {
            ViewOnClickListenerC5641d viewOnClickListenerC5641d2 = this.f27441i;
            if (viewOnClickListenerC5641d2 != null) {
                viewOnClickListenerC5641d2.mo3278o9();
            }
            ViewOnClickListenerC5641d viewOnClickListenerC5641d3 = this.f27441i;
            if (viewOnClickListenerC5641d3 != null) {
                viewOnClickListenerC5641d3.m22896S9(m3294d4, "pushUpgradeDialog", umengPush);
                return;
            }
            return;
        }
        ViewOnClickListenerC5641d viewOnClickListenerC5641d4 = new ViewOnClickListenerC5641d();
        this.f27441i = viewOnClickListenerC5641d4;
        viewOnClickListenerC5641d4.m22896S9(m3294d4, "pushUpgradeDialog", umengPush);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        boolean z10;
        Disposable disposable;
        C7709c.m29787d().m29801m(new MsgUnReadSizeUpdateEvent());
        this.f27437e.setVisibility(8);
        super.dismiss();
        m28531k(1.0f);
        Disposable disposable2 = this.f27442j;
        if (disposable2 != null) {
            z10 = disposable2.isDisposed();
        } else {
            z10 = true;
        }
        if (!z10 && (disposable = this.f27442j) != null) {
            disposable.dispose();
        }
    }

    /* renamed from: k */
    public final void m28531k(float f10) {
        WindowManager.LayoutParams attributes = this.f27433a.getWindow().getAttributes();
        attributes.alpha = f10;
        this.f27433a.getWindow().setAttributes(attributes);
    }

    /* renamed from: l */
    public final void m28532l() {
        m28534q().m28839a();
        Observable compose = Observable.fromCallable(new Callable() { // from class: wd.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7414k.a m28517m;
                m28517m = C7414k.m28517m(C7414k.this);
                return m28517m;
            }
        }).compose(AbstractC7029f.m27120a());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: wd.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7414k.m28518n(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = new c();
        this.f27442j = compose.subscribe(consumer, new Consumer() { // from class: wd.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7414k.m28519o(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: p */
    public final MainFocusListView m28533p() {
        return this.f27435c;
    }

    /* renamed from: q */
    public final C5250z0 m28534q() {
        return (C5250z0) this.f27439g.getValue();
    }

    /* renamed from: r */
    public final UmengPushDao m28535r() {
        return (UmengPushDao) this.f27438f.getValue();
    }

    /* renamed from: s */
    public final void m28536s() {
        this.f27435c.setAdapter((ListAdapter) m28534q());
        this.f27435c.setFocusable(true);
        this.f27435c.setFocusableInTouchMode(true);
        this.f27435c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: wd.b
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                C7414k.m28520t(C7414k.this, adapterView, view, i10, j10);
            }
        });
        this.f27436d.setOnClickListener(new View.OnClickListener() { // from class: wd.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7414k.m28522v(C7414k.this, view);
            }
        });
        this.f27436d.setOnKeyListener(new View.OnKeyListener() { // from class: wd.d
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean m28524x;
                m28524x = C7414k.m28524x(C7414k.this, view, i10, keyEvent);
                return m28524x;
            }
        });
        this.f27435c.setOnKeyListener(new View.OnKeyListener() { // from class: wd.e
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean m28525y;
                m28525y = C7414k.m28525y(C7414k.this, view, i10, keyEvent);
                return m28525y;
            }
        });
    }
}
