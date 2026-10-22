package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import be.C1328x;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p201k2.AbstractC5086c;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.l */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4782l extends C7767e implements View.OnClickListener {

    /* renamed from: K0 */
    public static final a f20180K0 = new a(null);

    /* renamed from: G0 */
    private View f20182G0;

    /* renamed from: H0 */
    private InterfaceC5660l f20183H0;

    /* renamed from: I0 */
    private Disposable f20184I0;

    /* renamed from: J0 */
    public Map f20185J0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f20181F0 = ViewOnClickListenerC4782l.class.getSimpleName();

    /* renamed from: ha.l$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.l$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19786a(Long l10) {
            TextView textView = (TextView) ViewOnClickListenerC4782l.this.m19783J9(R$id.mTvCountDown);
            if (textView != null) {
                AbstractC5868k.m23673e(l10, "it");
                textView.setText(String.valueOf(10 - l10.longValue()));
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19786a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L9 */
    public static final void m19781L9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public static final void m19782M9(ViewOnClickListenerC4782l viewOnClickListenerC4782l) {
        AbstractC5868k.m23674f(viewOnClickListenerC4782l, "this$0");
        InterfaceC5660l interfaceC5660l = viewOnClickListenerC4782l.f20183H0;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Boolean.TRUE);
        }
        viewOnClickListenerC4782l.mo3279p9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20185J0.clear();
    }

    /* renamed from: J9 */
    public View m19783J9(int i10) {
        View findViewById;
        Map map = this.f20185J0;
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

    /* renamed from: K9 */
    public final void m19784K9() {
        ((Button) m19783J9(R$id.mBtnReplay)).setOnClickListener(this);
        ((Button) m19783J9(R$id.mBtnContinue)).setOnClickListener(this);
        Flowable<Long> observeOn = Flowable.intervalRange(0L, 11L, 0L, 1L, TimeUnit.SECONDS).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread());
        final b bVar = new b();
        this.f20184I0 = observeOn.doOnNext(new Consumer() { // from class: ha.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC4782l.m19781L9(InterfaceC5660l.this, obj);
            }
        }).doOnComplete(new Action() { // from class: ha.k
            @Override // io.reactivex.functions.Action
            public final void run() {
                ViewOnClickListenerC4782l.m19782M9(ViewOnClickListenerC4782l.this);
            }
        }).subscribe();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: N9 */
    public final void m19785N9(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        this.f20183H0 = interfaceC5660l;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_continue_play, viewGroup, false);
        this.f20182G0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        Disposable disposable = this.f20184I0;
        if (disposable != null) {
            disposable.dispose();
        }
        super.mo3123S7();
        mo16979F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(813), AbstractC7786b.m30163g(493));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        Bundle m3090H6 = m3090H6();
        AbstractC5868k.m23671c(m3090H6);
        int i10 = m3090H6.getInt("extra_play_time", 0);
        TextView textView = (TextView) m19783J9(R$id.mTvPlayPositon);
        C5881x c5881x = C5881x.f23415a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String string = m3096J6.getResources().getString(R$string.play_last_time);
        AbstractC5868k.m23673e(string, "context!!.resources.getS…(R.string.play_last_time)");
        String format = String.format(string, Arrays.copyOf(new Object[]{AbstractC5086c.m20623p(i10 / 1000)}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(format);
        m19784K9();
        ((Button) m19783J9(R$id.mBtnContinue)).requestFocus();
        super.mo3176k8(view, bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        InterfaceC5660l interfaceC5660l = this.f20183H0;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Boolean.TRUE);
        }
        Disposable disposable = this.f20184I0;
        if (disposable != null) {
            disposable.dispose();
        }
        mo3279p9();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnReplay) {
            InterfaceC5660l interfaceC5660l = this.f20183H0;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.FALSE);
            }
            Disposable disposable = this.f20184I0;
            if (disposable != null) {
                disposable.dispose();
            }
            mo3278o9();
            return;
        }
        if (id2 == R$id.mBtnContinue) {
            InterfaceC5660l interfaceC5660l2 = this.f20183H0;
            if (interfaceC5660l2 != null) {
                interfaceC5660l2.mo542f(Boolean.TRUE);
            }
            Disposable disposable2 = this.f20184I0;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            mo3278o9();
        }
    }
}
