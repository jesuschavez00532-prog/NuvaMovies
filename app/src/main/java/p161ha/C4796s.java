package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import be.C1328x;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$mipmap;
import com.module.R$string;
import com.module.R$style;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5877t;
import p348u2.AbstractC7029f;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.s */
/* loaded from: classes2.dex */
public final class C4796s extends C7767e {

    /* renamed from: F0 */
    private final boolean f20206F0;

    /* renamed from: G0 */
    private final boolean f20207G0;

    /* renamed from: H0 */
    private View f20208H0;

    /* renamed from: I0 */
    private InterfaceC5642a f20209I0;

    /* renamed from: K0 */
    public Map f20211K0 = new LinkedHashMap();

    /* renamed from: J0 */
    private final long f20210J0 = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.s$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5877t f20213b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5877t c5877t) {
            super(1);
            this.f20213b = c5877t;
        }

        /* renamed from: a */
        public final void m19814a(Long l10) {
            if (C4796s.this.m19811M9()) {
                TextView textView = (TextView) C4796s.this.m19810L9(R$id.mTvClosedCountDown);
                Context m3096J6 = C4796s.this.m3096J6();
                AbstractC5868k.m23671c(m3096J6);
                Resources resources = m3096J6.getResources();
                int i10 = R$string.adult_return_channel;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20213b.f23411a);
                sb2.append('s');
                textView.setText(Html.fromHtml(resources.getString(i10, sb2.toString())));
                C5877t c5877t = this.f20213b;
                c5877t.f23411a--;
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19814a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.s$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f20214a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19815a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19815a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.s$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19816a(Disposable disposable) {
            if (C4796s.this.m19811M9()) {
                ((TextView) C4796s.this.m19810L9(R$id.mTvClosedCountDown)).setVisibility(0);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19816a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    public C4796s(boolean z10, boolean z11) {
        this.f20206F0 = z10;
        this.f20207G0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P9 */
    public static final void m19806P9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q9 */
    public static final void m19807Q9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R9 */
    public static final void m19808R9(C4796s c4796s) {
        AbstractC5868k.m23674f(c4796s, "this$0");
        c4796s.mo3278o9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S9 */
    public static final void m19809S9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20211K0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
        m3287z9(false);
    }

    /* renamed from: L9 */
    public View m19810L9(int i10) {
        View findViewById;
        Map map = this.f20211K0;
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

    /* renamed from: M9 */
    public final boolean m19811M9() {
        return this.f20207G0;
    }

    /* renamed from: N9 */
    public final void m19812N9(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "dialogCallback");
        this.f20209I0 = interfaceC5642a;
    }

    /* renamed from: O9 */
    public final void m19813O9() {
        C5877t c5877t = new C5877t();
        c5877t.f23411a = this.f20210J0;
        Observable<R> compose = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(this.f20210J0 + 1).compose(AbstractC7029f.m27120a());
        final a aVar = new a(c5877t);
        Consumer consumer = new Consumer() { // from class: ha.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4796s.m19806P9(InterfaceC5660l.this, obj);
            }
        };
        final b bVar = b.f20214a;
        Consumer<? super Throwable> consumer2 = new Consumer() { // from class: ha.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4796s.m19807Q9(InterfaceC5660l.this, obj);
            }
        };
        Action action = new Action() { // from class: ha.q
            @Override // io.reactivex.functions.Action
            public final void run() {
                C4796s.m19808R9(C4796s.this);
            }
        };
        final c cVar = new c();
        compose.subscribe(consumer, consumer2, action, new Consumer() { // from class: ha.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4796s.m19809S9(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_cr_status_changed_tips, viewGroup, false);
        this.f20208H0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
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
            window.setLayout(AbstractC7786b.m30166j(780), AbstractC7786b.m30163g(280));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        if (this.f20206F0) {
            ((ImageView) m19810L9(R$id.mIvCr)).setImageResource(R$mipmap.icon_function_cr_switch_open);
            int i10 = R$id.mTvOpenedTips;
            ((TextView) m19810L9(i10)).setVisibility(0);
            TextView textView = (TextView) m19810L9(i10);
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            textView.setText(Html.fromHtml(m3096J6.getResources().getString(R$string.adult_live_visible)));
        } else {
            ((ImageView) m19810L9(R$id.mIvCr)).setImageResource(R$mipmap.icon_function_cr_switch_close);
            int i11 = R$id.mTvClosedTips;
            ((TextView) m19810L9(i11)).setVisibility(0);
            TextView textView2 = (TextView) m19810L9(i11);
            Context m3096J62 = m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            textView2.setText(Html.fromHtml(m3096J62.getResources().getString(R$string.adult_live_invisible)));
        }
        m19813O9();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: o9 */
    public void mo3278o9() {
        super.mo3278o9();
        InterfaceC5642a interfaceC5642a = this.f20209I0;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
    }
}
