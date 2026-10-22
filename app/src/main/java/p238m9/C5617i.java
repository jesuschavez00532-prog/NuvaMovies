package p238m9;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$style;
import com.module.view.LoadingView;
import com.request.result.UserInfo;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p170i2.AbstractC4843b;
import p170i2.C4842a;
import p179ib.AbstractC4926c;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5091h;
import p201k2.AbstractC5095l;
import p201k2.C5096m;
import p287pb.AbstractApplicationC6253c;
import p348u2.AbstractC7029f;
import p433zd.AbstractC7786b;

/* renamed from: m9.i */
/* loaded from: classes2.dex */
public final class C5617i extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: H0 */
    public static final a f22648H0 = new a(null);

    /* renamed from: I0 */
    private static final String f22649I0 = "invite_code";

    /* renamed from: D0 */
    private final InterfaceC1312h f22651D0;

    /* renamed from: E0 */
    private String f22652E0;

    /* renamed from: F0 */
    private Disposable f22653F0;

    /* renamed from: G0 */
    public Map f22654G0 = new LinkedHashMap();

    /* renamed from: C0 */
    private final String f22650C0 = "InviteQrCodeDialog";

    /* renamed from: m9.i$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final String m22804a() {
            return C5617i.f22649I0;
        }
    }

    /* renamed from: m9.i$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f22655a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AbstractC4926c.m20242i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m9.i$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f22656a = new c();

        c() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return AbstractC5095l.m20687a(str, AbstractC7786b.m30166j(253));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m9.i$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m22807a(Bitmap bitmap) {
            ((LoadingView) C5617i.this.m22803J9(R$id.mLoadingView)).setVisibility(8);
            C5617i c5617i = C5617i.this;
            int i10 = R$id.mImgQrCode;
            ((ImageView) c5617i.m22803J9(i10)).setVisibility(0);
            if (!bitmap.isRecycled()) {
                ((ImageView) C5617i.this.m22803J9(i10)).setImageBitmap(bitmap);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22807a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m9.i$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m22808a(Throwable th) {
            th.printStackTrace();
            ((LoadingView) C5617i.this.m22803J9(R$id.mLoadingView)).setVisibility(8);
            if (((ImageView) C5617i.this.m22803J9(R$id.mImgQrCode)).getVisibility() == 8) {
                ((TextView) C5617i.this.m22803J9(R$id.mTvError)).setVisibility(0);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22808a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C5617i() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(b.f22655a);
        this.f22651D0 = m5965b;
        this.f22652E0 = "";
    }

    /* renamed from: L9 */
    private final void m22796L9() {
        String str;
        String m22801Q9 = m22801Q9();
        String m20659b = AbstractC5091h.m20659b();
        C1466m0 c1466m0 = C1466m0.f5627a;
        String m6878m = c1466m0.m6878m();
        AbstractC4843b m19920a = C4842a.f20329a.m19920a();
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String mo19960i = m19920a.mo19960i(m3096J6);
        int m20602l = AbstractC5085b.m20602l(AbstractApplicationC6253c.f24484b.m24887a());
        String m6879n = c1466m0.m6879n();
        String m22800P9 = m22800P9();
        long time = new Date().getTime();
        String m6874k = c1466m0.m6874k();
        String str2 = this.f22652E0;
        UserInfo m6887v = c1466m0.m6887v();
        String str3 = null;
        if (m6887v != null) {
            str = m6887v.getEmail();
        } else {
            str = null;
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 != null) {
            str3 = m6887v2.getActiveTime();
        }
        Observable just = Observable.just("http://" + m22801Q9 + "/#/invite?lang=" + m20659b + "&userId=" + m6878m + "&appId=" + mo19960i + "&appVersion=" + m20602l + "&tk=" + m6879n + "&loginType=" + m22800P9 + "&timeStamp=" + time + "&portalCode=" + m6874k + "&shareCode=" + str2 + "&email=" + str + "&activeTime=" + str3);
        final c cVar = c.f22656a;
        Observable compose = just.map(new Function() { // from class: m9.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m22797M9;
                m22797M9 = C5617i.m22797M9(InterfaceC5660l.this, obj);
                return m22797M9;
            }
        }).compose(AbstractC7029f.m27120a());
        final d dVar = new d();
        Consumer consumer = new Consumer() { // from class: m9.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5617i.m22798N9(InterfaceC5660l.this, obj);
            }
        };
        final e eVar = new e();
        this.f22653F0 = compose.subscribe(consumer, new Consumer() { // from class: m9.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5617i.m22799O9(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public static final Bitmap m22797M9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N9 */
    public static final void m22798N9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O9 */
    public static final void m22799O9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: P9 */
    private final String m22800P9() {
        if (C5096m.f20979a.m20692c()) {
            return "2";
        }
        return "1";
    }

    /* renamed from: Q9 */
    private final String m22801Q9() {
        return (String) this.f22651D0.getValue();
    }

    /* renamed from: I9 */
    public void m22802I9() {
        this.f22654G0.clear();
    }

    /* renamed from: J9 */
    public View m22803J9(int i10) {
        View findViewById;
        Map map = this.f22654G0;
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
        String str;
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
        Bundle m3090H6 = m3090H6();
        if (m3090H6 != null) {
            str = m3090H6.getString(f22649I0);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f22652E0 = str;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_invite_qr_code, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        Disposable disposable = this.f22653F0;
        if (disposable != null) {
            disposable.dispose();
        }
        m22802I9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(1142), AbstractC7786b.m30163g(540));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        LoadingView loadingView = (LoadingView) m22803J9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
        m22796L9();
    }
}
