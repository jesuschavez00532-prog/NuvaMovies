package p161ha;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.LoginSuccessEvent;
import com.open.leanback.widget.HorizontalGridView;
import com.widget.utils.SimpleItemDecoration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import la.InterfaceC5539g;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import na.C5835f;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.greenrobot.eventbus.ThreadMode;
import p030bc.C1224f;
import p161ha.C4774h1;
import p242n0.AbstractC5718e;
import p399x9.C7538m;
import p399x9.C7550y;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: ha.h1 */
/* loaded from: classes.dex */
public final class C4774h1 extends C7767e implements InterfaceC5539g {

    /* renamed from: H0 */
    private int f20145H0;

    /* renamed from: I0 */
    private AwakenVoiceAssistEvent f20146I0;

    /* renamed from: J0 */
    private final InterfaceC1312h f20147J0;

    /* renamed from: K0 */
    private C7538m f20148K0;

    /* renamed from: L0 */
    private a f20149L0;

    /* renamed from: M0 */
    private boolean f20150M0;

    /* renamed from: N0 */
    private Handler f20151N0;

    /* renamed from: O0 */
    private ObjectAnimator f20152O0;

    /* renamed from: P0 */
    public Map f20153P0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f20143F0 = C4774h1.class.getSimpleName();

    /* renamed from: G0 */
    private int f20144G0 = 1;

    /* renamed from: ha.h1$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo19755a();
    }

    /* renamed from: ha.h1$b */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.AbstractC0802u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            Context m3096J6;
            AbstractC5868k.m23674f(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 != 0) {
                if ((i10 == 1 || i10 == 2) && (m3096J6 = C4774h1.this.m3096J6()) != null && !AbstractC5718e.m23111a(m3096J6)) {
                    ComponentCallbacks2C1586c.m7282u(m3096J6).m7390p();
                    return;
                }
                return;
            }
            Context m3096J62 = C4774h1.this.m3096J6();
            if (m3096J62 != null && !AbstractC5718e.m23111a(m3096J62)) {
                ComponentCallbacks2C1586c.m7282u(m3096J62).m7391q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.h1$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5664p {
        c() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m19757e(C4774h1 c4774h1) {
            AbstractC5868k.m23674f(c4774h1, "this$0");
            c4774h1.m19742R9().m23604F3();
            c4774h1.f20150M0 = false;
        }

        /* renamed from: d */
        public final void m19758d(int i10, boolean z10) {
            int i11 = i10 + 1;
            C4774h1.this.f20144G0 = i11;
            C4774h1.this.m19744T9();
            if (!C4774h1.this.f20150M0) {
                C7538m c7538m = C4774h1.this.f20148K0;
                boolean z11 = false;
                if (c7538m != null && i11 == c7538m.getItemCount()) {
                    z11 = true;
                }
                if (z11) {
                    C4774h1.this.f20150M0 = true;
                    Handler handler = C4774h1.this.f20151N0;
                    final C4774h1 c4774h1 = C4774h1.this;
                    handler.post(new Runnable() { // from class: ha.i1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4774h1.c.m19757e(C4774h1.this);
                        }
                    });
                }
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m19758d(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.h1$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        /* renamed from: a */
        public final void m19759a() {
            Dialog m3280r9 = C4774h1.this.m3280r9();
            if (m3280r9 != null) {
                m3280r9.cancel();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m19759a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: ha.h1$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5835f invoke() {
            return new C5835f(C4774h1.this);
        }
    }

    public C4774h1() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new e());
        this.f20147J0 = m5965b;
        this.f20151N0 = new Handler(Looper.getMainLooper());
    }

    /* renamed from: Q9 */
    private final void m19741Q9() {
        ((HorizontalGridView) m19746I9(R$id.mRvtResult)).smoothScrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R9 */
    public final C5835f m19742R9() {
        return (C5835f) this.f20147J0.getValue();
    }

    /* renamed from: S9 */
    private final void m19743S9() {
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.setCancelable(true);
        }
        int i10 = R$id.mRvtResult;
        ((HorizontalGridView) m19746I9(i10)).addItemDecoration(new SimpleItemDecoration(AbstractC7786b.m30166j(35), true, true));
        ((HorizontalGridView) m19746I9(i10)).addOnScrollListener(new b());
        C7538m c7538m = new C7538m();
        this.f20148K0 = c7538m;
        c7538m.m28895v(new c());
        C7538m c7538m2 = this.f20148K0;
        if (c7538m2 != null) {
            c7538m2.m28894u(new d());
        }
        ((HorizontalGridView) m19746I9(i10)).setAdapter(this.f20148K0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T9 */
    public final void m19744T9() {
        int i10 = R$id.mTvPage;
        ((TextView) m19746I9(i10)).setVisibility(0);
        TextView textView = (TextView) m19746I9(i10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20144G0);
        sb2.append('/');
        sb2.append(this.f20145H0);
        textView.setText(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W9 */
    public static final void m19745W9(C4774h1 c4774h1) {
        AbstractC5868k.m23674f(c4774h1, "this$0");
        ((HorizontalGridView) c4774h1.m19746I9(R$id.mRvtResult)).requestFocus();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20153P0.clear();
    }

    /* renamed from: I9 */
    public View m19746I9(int i10) {
        View findViewById;
        Map map = this.f20153P0;
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

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.VoiceAssistDialog);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_voice_assist, viewGroup, false);
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: U9 */
    public final void m19747U9(a aVar) {
        AbstractC5868k.m23674f(aVar, "callback");
        this.f20149L0 = aVar;
    }

    /* renamed from: V9 */
    public final void m19748V9(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "voiceMsg");
        this.f20146I0 = awakenVoiceAssistEvent;
    }

    @Override // la.InterfaceC5539g
    /* renamed from: X3 */
    public void mo19749X3() {
        ObjectAnimator objectAnimator = this.f20152O0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f20152O0 = null;
        ((ImageView) m19746I9(R$id.mIvLoading)).setVisibility(8);
    }

    /* renamed from: X9 */
    public final void m19750X9() {
        String str = null;
        AwakenVoiceAssistEvent awakenVoiceAssistEvent = this.f20146I0;
        String str2 = null;
        if (awakenVoiceAssistEvent != null) {
            str = awakenVoiceAssistEvent.getVoiceMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!C1224f.f4816e.m5632c()) {
            mo19751d1();
            return;
        }
        this.f20144G0 = 1;
        m19741Q9();
        C7538m c7538m = this.f20148K0;
        if (c7538m != null) {
            c7538m.m28847d();
        }
        C5835f m19742R9 = m19742R9();
        AwakenVoiceAssistEvent awakenVoiceAssistEvent2 = this.f20146I0;
        if (awakenVoiceAssistEvent2 != null) {
            str2 = awakenVoiceAssistEvent2.getVoiceMsg();
        }
        AbstractC5868k.m23671c(str2);
        m19742R9.m23606Y0(str2);
    }

    @Override // la.InterfaceC5539g
    /* renamed from: d1 */
    public void mo19751d1() {
        int i10 = R$id.mIvLoading;
        ((ImageView) m19746I9(i10)).setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) m19746I9(i10), "rotation", 0.0f, 360.0f);
        this.f20152O0 = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(1500L);
        }
        ObjectAnimator objectAnimator = this.f20152O0;
        if (objectAnimator != null) {
            objectAnimator.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator2 = this.f20152O0;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator3 = this.f20152O0;
        if (objectAnimator3 != null) {
            objectAnimator3.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator4 = this.f20152O0;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        Window window2;
        Window window3;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window3 = m3280r9.getWindow()) != null) {
            window3.setGravity(80);
        }
        Dialog m3280r92 = m3280r9();
        if (m3280r92 != null && (window2 = m3280r92.getWindow()) != null) {
            window2.setLayout(AbstractC7786b.m30166j(1920), AbstractC7786b.m30163g(520));
        }
        Dialog m3280r93 = m3280r9();
        if (m3280r93 != null && (window = m3280r93.getWindow()) != null) {
            window.setWindowAnimations(R$style.DialogBottomAnim);
        }
    }

    @Override // la.InterfaceC5539g
    /* renamed from: j1 */
    public void mo19752j1() {
        String str = null;
        int i10 = R$id.mTvDesc;
        ((TextView) m19746I9(i10)).setVisibility(0);
        TextView textView = (TextView) m19746I9(i10);
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            str = m3096J6.getString(R$string.voice_load_search_for_you);
        } else {
            str = null;
        }
        textView.setText(str);
        ((TextView) m19746I9(R$id.mTvPage)).setVisibility(8);
        ((HorizontalGridView) m19746I9(R$id.mRvtResult)).setVisibility(8);
    }

    @Override // la.InterfaceC5539g
    /* renamed from: k1 */
    public void mo19753k1() {
        int i10 = R$id.mTvDesc;
        ((TextView) m19746I9(i10)).setVisibility(0);
        TextView textView = (TextView) m19746I9(i10);
        Context m3096J6 = m3096J6();
        String str = null;
        if (m3096J6 != null) {
            int i11 = R$string.voice_no_search_result;
            Object[] objArr = new Object[1];
            AwakenVoiceAssistEvent awakenVoiceAssistEvent = this.f20146I0;
            if (awakenVoiceAssistEvent != null) {
                str = awakenVoiceAssistEvent.getVoiceMsg();
            }
            objArr[0] = str;
            str = m3096J6.getString(i11, objArr);
        }
        textView.setText(str);
        ((TextView) m19746I9(R$id.mTvPage)).setVisibility(8);
        ((HorizontalGridView) m19746I9(R$id.mRvtResult)).setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m19743S9();
        if (!C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29803r(this);
        }
        m19750X9();
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void loginSuccessMessage(LoginSuccessEvent loginSuccessEvent) {
        AbstractC5868k.m23674f(loginSuccessEvent, "event");
        m19750X9();
    }

    @Override // la.InterfaceC5539g
    /* renamed from: m6 */
    public void mo19754m6(int i10, int i11, int i12, ArrayList arrayList) {
        boolean z10 = false;
        C7538m c7538m;
        AbstractC5868k.m23674f(arrayList, "datas");
        int i13 = R$id.mTvDesc;
        ((TextView) m19746I9(i13)).setVisibility(0);
        TextView textView = (TextView) m19746I9(i13);
        Context m3096J6 = m3096J6();
        String str = null;
        if (m3096J6 != null) {
            int i14 = R$string.voice_relate_search_result;
            Object[] objArr = new Object[1];
            AwakenVoiceAssistEvent awakenVoiceAssistEvent = this.f20146I0;
            if (awakenVoiceAssistEvent != null) {
                str = awakenVoiceAssistEvent.getVoiceMsg();
            }
            objArr[0] = str;
            str = m3096J6.getString(i14, objArr);
        }
        textView.setText(str);
        int i15 = R$id.mRvtResult;
        ((HorizontalGridView) m19746I9(i15)).setVisibility(0);
        if (i11 == 1) {
            AwakenVoiceAssistEvent awakenVoiceAssistEvent2 = this.f20146I0;
            if (awakenVoiceAssistEvent2 != null && awakenVoiceAssistEvent2.getCommad() == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && arrayList.size() == 1) {
                Object obj = arrayList.get(0);
                AbstractC5868k.m23673e(obj, "datas.get(0)");
                C7550y c7550y = (C7550y) obj;
                if (c7550y.m28930c()) {
                    C7538m c7538m2 = this.f20148K0;
                    if (c7538m2 != null) {
                        c7538m2.m28892s(c7550y);
                        return;
                    }
                    return;
                }
                if (m3096J6() != null && (c7538m = this.f20148K0) != null) {
                    Context m3096J62 = m3096J6();
                    AbstractC5868k.m23671c(m3096J62);
                    c7538m.m28893t(m3096J62, c7550y);
                    return;
                }
                return;
            }
            C7538m c7538m3 = this.f20148K0;
            if (c7538m3 != null) {
                c7538m3.m28856n(arrayList);
            }
            ((HorizontalGridView) m19746I9(i15)).post(new Runnable() { // from class: ha.g1
                @Override // java.lang.Runnable
                public final void run() {
                    C4774h1.m19745W9(C4774h1.this);
                }
            });
        } else {
            C7538m c7538m4 = this.f20148K0;
            if (c7538m4 != null) {
                c7538m4.m28845b(arrayList);
            }
        }
        this.f20145H0 = i12;
        m19744T9();
        this.f20150M0 = false;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        ObjectAnimator objectAnimator = this.f20152O0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f20152O0 = null;
        if (C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29806v(this);
        }
        a aVar = this.f20149L0;
        if (aVar != null) {
            aVar.mo19755a();
        }
    }
}
