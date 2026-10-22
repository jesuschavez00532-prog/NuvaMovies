package p263o8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.live.R$array;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.live.bean.InfoBarBean;
import com.live.view.AccelerationSeekBar;
import com.live.view.C2882j;
import com.module.view.net.NetSpeedTextView;
import com.request.bean.EpgProgram;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p012ab.C0128d;
import p161ha.ViewOnClickListenerC4758c0;
import p170i2.C4842a;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p400xa.AbstractC7555b0;
import p400xa.C7554b;
import p400xa.C7565e1;
import p400xa.C7577i1;

/* renamed from: o8.q */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5939q extends AutoFrameLayout implements View.OnClickListener, C2882j.a, View.OnFocusChangeListener, InterfaceC5940r {

    /* renamed from: a */
    private final String f23619a;

    /* renamed from: b */
    private String f23620b;

    /* renamed from: c */
    private a f23621c;

    /* renamed from: d */
    private C7554b f23622d;

    /* renamed from: e */
    private C2882j f23623e;

    /* renamed from: f */
    private Disposable f23624f;

    /* renamed from: g */
    public Map f23625g;

    /* renamed from: o8.q$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: P */
        void mo22034P();

        /* renamed from: a */
        void mo22035a();

        /* renamed from: e0 */
        void mo22036e0(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o8.q$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m24059a(Long l10) {
            ((TextView) ViewOnClickListenerC5939q.this.m24058g(R$id.mTvTime)).setText(new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(new Date()));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24059a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC5939q(Context context) {
        this(context, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* renamed from: h */
    private final void m24042h() {
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m24058g(R$id.mTvDownSpeed);
        AbstractC5868k.m23673e(netSpeedTextView, "mTvDownSpeed");
        c0128d.m510e(netSpeedTextView);
    }

    /* renamed from: i */
    private final void m24043i() {
        setChannelName("");
        m24051q(new ArrayList(), 0);
        C2882j c2882j = this.f23623e;
        if (c2882j != null) {
            c2882j.dismiss();
        }
    }

    /* renamed from: j */
    private final C2882j m24044j() {
        View inflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_live_subtitle_pop, (ViewGroup) null);
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        AbstractC5868k.m23673e(inflate, "rootView");
        C2882j c2882j = new C2882j(context, inflate);
        String[] stringArray = getResources().getStringArray(R$array.play_setting_playratio);
        AbstractC5868k.m23673e(stringArray, "resources.getStringArray…y.play_setting_playratio)");
        c2882j.m11635c(new ArrayList(Arrays.asList(Arrays.copyOf(stringArray, stringArray.length))));
        c2882j.m11636d(this);
        c2882j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o8.o
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewOnClickListenerC5939q.m24045k(ViewOnClickListenerC5939q.this);
            }
        });
        return c2882j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m24045k(ViewOnClickListenerC5939q viewOnClickListenerC5939q) {
        AbstractC5868k.m23674f(viewOnClickListenerC5939q, "this$0");
        viewOnClickListenerC5939q.f23623e = null;
    }

    /* renamed from: l */
    private final void m24046l() {
        int i10 = R$id.mBtnRatio;
        ((Button) m24058g(i10)).setOnClickListener(this);
        int i11 = R$id.mBtnFeedBack;
        ((Button) m24058g(i11)).setOnClickListener(this);
        ((Button) m24058g(i10)).setOnFocusChangeListener(this);
        ((Button) m24058g(i11)).setOnFocusChangeListener(this);
    }

    /* renamed from: m */
    private final void m24047m() {
        int i10 = R$id.mTvDownSpeed;
        if (((NetSpeedTextView) m24058g(i10)) == null) {
            return;
        }
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m24058g(i10);
        AbstractC5868k.m23673e(netSpeedTextView, "mTvDownSpeed");
        c0128d.m513n(netSpeedTextView);
    }

    /* renamed from: n */
    private final void m24048n(View view, boolean z10) {
        if (z10) {
            this.f23622d.m28943c(view, 1.1f);
        } else {
            this.f23622d.m28945f(view, 1.1f);
        }
    }

    /* renamed from: o */
    private final boolean m24049o() {
        if (getFocusedChild() != null) {
            return false;
        }
        int i10 = R$id.mBtnRatio;
        ((Button) m24058g(i10)).setFocusable(true);
        ((Button) m24058g(i10)).requestFocus();
        return true;
    }

    /* renamed from: p */
    private final void m24050p() {
        String[] stringArray = getResources().getStringArray(R$array.play_setting_playratio);
        AbstractC5868k.m23673e(stringArray, "resources.getStringArray…y.play_setting_playratio)");
        ((TextView) m24058g(R$id.mScaleText)).setText(stringArray[((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue()]);
    }

    /* renamed from: q */
    private final void m24051q(ArrayList arrayList, int i10) {
        if (AbstractC6567a.m25635e(arrayList)) {
            AccelerationSeekBar accelerationSeekBar = (AccelerationSeekBar) m24058g(R$id.mSeekBar);
            if (accelerationSeekBar != null) {
                accelerationSeekBar.setProgress(0);
            }
            TextView textView = (TextView) m24058g(R$id.mStartTimeText);
            if (textView != null) {
                textView.setText("00:00");
            }
            TextView textView2 = (TextView) m24058g(R$id.mEndTimeText);
            if (textView2 != null) {
                textView2.setText("23:59");
                return;
            }
            return;
        }
        Object obj = arrayList.get(0);
        AbstractC5868k.m23673e(obj, "infobarEpgs[0]");
        EpgProgram epgProgram = (EpgProgram) obj;
        AccelerationSeekBar accelerationSeekBar2 = (AccelerationSeekBar) m24058g(R$id.mSeekBar);
        if (accelerationSeekBar2 != null) {
            accelerationSeekBar2.setProgress(i10);
        }
        TextView textView3 = (TextView) m24058g(R$id.mStartTimeText);
        if (textView3 != null) {
            textView3.setText(epgProgram.getStart());
        }
        TextView textView4 = (TextView) m24058g(R$id.mEndTimeText);
        if (textView4 != null) {
            textView4.setText(epgProgram.getStop());
        }
    }

    /* renamed from: r */
    private final void m24052r(View view, boolean z10) {
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    /* renamed from: s */
    private final void m24053s() {
        String obj = ((TextView) m24058g(R$id.mChannelName)).getText().toString();
        if (AbstractC6567a.m25634d(obj)) {
            return;
        }
        Context context = getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0302c) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as AppCompatActi…y).supportFragmentManager");
        ViewOnClickListenerC4758c0.f20101M0.m19681b("live", obj).mo3277E9(m3294d4, "FeedbackDialog");
    }

    private final void setChannelName(String str) {
        if (AbstractC6567a.m25637g(str)) {
            TextView textView = (TextView) m24058g(R$id.mChannelName);
            if (textView != null) {
                textView.setText(str);
            }
            if (C4842a.f20329a.m19920a().mo19972u(str)) {
                ImageView imageView = (ImageView) m24058g(R$id.mImageUHD);
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            ImageView imageView2 = (ImageView) m24058g(R$id.mImageUHD);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) m24058g(R$id.mChannelName);
        if (textView2 != null) {
            textView2.setText("");
        }
        ((ImageView) m24058g(R$id.mImageUHD)).setVisibility(8);
    }

    private final void setChannelPost(String str) {
        String str2;
        if (AbstractC6567a.m25637g(str) && AbstractC5868k.m23669a(str, this.f23620b)) {
            return;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f23620b = str2;
        Drawable m27111a = AbstractC7026c.m27111a(getContext(), R$drawable.live_channel_default_icon);
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(getContext().getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        ((C1596k) ((C1596k) ((C1596k) ((C1596k) AbstractC7555b0.m28954h(m7282u, str, false, 2, null).mo49d0(m27111a)).mo59k(m27111a)).mo61l()).mo54h()).m7365E0((ImageView) m24058g(R$id.mLiveLogo));
    }

    /* renamed from: t */
    private final void m24054t() {
        if (this.f23623e != null) {
            this.f23623e = null;
        }
        int intValue = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
        C2882j m24044j = m24044j();
        this.f23623e = m24044j;
        if (m24044j != null) {
            m24044j.m11637e(intValue);
        }
        C2882j c2882j = this.f23623e;
        if (c2882j != null) {
            int i10 = R$id.mBtnRatio;
            Button button = (Button) m24058g(i10);
            int width = ((Button) m24058g(i10)).getWidth() / 2;
            C2882j c2882j2 = this.f23623e;
            AbstractC5868k.m23671c(c2882j2);
            int width2 = width - (c2882j2.getWidth() / 2);
            int i11 = -((Button) m24058g(i10)).getHeight();
            C2882j c2882j3 = this.f23623e;
            AbstractC5868k.m23671c(c2882j3);
            c2882j.showAsDropDown(button, width2, i11 - c2882j3.getHeight());
        }
    }

    /* renamed from: u */
    private final void m24055u() {
        Disposable disposable = this.f23624f;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                return;
            }
        }
        Observable<Long> observeOn = Observable.interval(2L, TimeUnit.SECONDS).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread());
        final b bVar = new b();
        this.f23624f = observeOn.subscribe(new Consumer() { // from class: o8.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC5939q.m24056v(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m24056v(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: w */
    private final void m24057w() {
        Disposable disposable = this.f23624f;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // p263o8.InterfaceC5940r
    /* renamed from: b */
    public void mo23993b() {
        m24043i();
    }

    @Override // p263o8.InterfaceC5940r
    /* renamed from: d */
    public void mo23994d(InfoBarBean infoBarBean) {
        AbstractC5868k.m23674f(infoBarBean, "bean");
        setChannelName(infoBarBean.getName());
        setChannelPost(infoBarBean.getPostUrl());
        m24051q(infoBarBean.getInfoBarEpgs(), infoBarBean.getProcess());
        ((TextView) m24058g(R$id.mQualityText)).setText(infoBarBean.getVideoQuality());
        m24050p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a aVar;
        AbstractC5868k.m23674f(keyEvent, "event");
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4 && keyCode != 82) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && (aVar = this.f23621c) != null) {
            aVar.mo22035a();
            return true;
        }
        return true;
    }

    @Override // p263o8.InterfaceC5940r
    /* renamed from: e */
    public void mo23995e(boolean z10) {
    }

    @Override // com.live.view.C2882j.a
    /* renamed from: f */
    public void mo11638f(int i10, String str) {
        AbstractC5868k.m23674f(str, "ratio");
        ((TextView) m24058g(R$id.mScaleText)).setText(str);
        C7577i1.f27838b.m29085d().m29076h("play_ratio", Integer.valueOf(i10));
        a aVar = this.f23621c;
        if (aVar != null) {
            aVar.mo22036e0(C7565e1.f27773a.m28998c(i10));
        }
    }

    /* renamed from: g */
    public View m24058g(int i10) {
        Map map = this.f23625g;
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mBtnRatio;
        if (num != null && num.intValue() == i10) {
            m24054t();
            return;
        }
        int i11 = R$id.mBtnFeedBack;
        if (num != null && num.intValue() == i11) {
            m24053s();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        m24047m();
        m24057w();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        Integer num;
        a aVar;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mBtnFeedBack;
        if (num != null && num.intValue() == i10) {
            TextView textView = (TextView) m24058g(R$id.mTextFeedBack);
            AbstractC5868k.m23673e(textView, "mTextFeedBack");
            m24052r(textView, z10);
            AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m24058g(R$id.mUserFeedbackLayout);
            AbstractC5868k.m23673e(autoLinearLayout, "mUserFeedbackLayout");
            m24048n(autoLinearLayout, z10);
        } else {
            int i11 = R$id.mBtnRatio;
            if (num != null && num.intValue() == i11) {
                TextView textView2 = (TextView) m24058g(R$id.mTextScreen);
                AbstractC5868k.m23673e(textView2, "mTextScreen");
                m24052r(textView2, z10);
                AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m24058g(R$id.mScreenLayout);
                AbstractC5868k.m23673e(autoLinearLayout2, "mScreenLayout");
                m24048n(autoLinearLayout2, z10);
            }
        }
        if (z10 && (aVar = this.f23621c) != null) {
            aVar.mo22034P();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 21 && i10 != 22) {
            return super.onKeyDown(i10, keyEvent);
        }
        return m24049o();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        AbstractC5868k.m23674f(view, "changedView");
        super.onVisibilityChanged(view, i10);
        if (AbstractC5868k.m23669a(view, this)) {
            if (i10 == 0) {
                setFocusable(true);
                requestFocus();
                m24042h();
                m24055u();
                return;
            }
            setFocusable(false);
            m24043i();
            m24047m();
            m24057w();
        }
    }

    public final void setOnBottomMenuListener(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f23621c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC5939q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f23625g = new LinkedHashMap();
        this.f23619a = ViewOnClickListenerC5939q.class.getSimpleName();
        this.f23620b = "";
        this.f23622d = new C7554b();
        LayoutInflater.from(context).inflate(R$layout.layout_match_live_infobar_bottom, (ViewGroup) this, true);
        m24046l();
    }
}
