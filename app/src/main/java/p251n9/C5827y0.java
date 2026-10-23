package p251n9;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.text.TextPaint;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1328x;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$mipmap;
import com.mine.R$string;
import com.request.result.ConfigInfoBean;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p043ce.AbstractC1500l;
import p100d9.C4010v;
import p160h9.InterfaceC4749y;
import p160h9.InterfaceC4750z;
import p192j9.C5017b0;
import p201k2.AbstractC5095l;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7029f;
import p400xa.C7581k;
import p400xa.C7615w;
import p433zd.AbstractC7786b;

/* renamed from: n9.y0 */
/* loaded from: classes2.dex */
public final class C5827y0 extends AbstractC5774c<InterfaceC4749y> implements InterfaceC4750z {

    /* renamed from: B0 */
    private boolean f23304B0;

    /* renamed from: D0 */
    private int f23306D0;

    /* renamed from: E0 */
    private C4010v f23307E0;

    /* renamed from: F0 */
    private List f23308F0;

    /* renamed from: G0 */
    private View f23309G0;

    /* renamed from: H0 */
    private View f23310H0;

    /* renamed from: I0 */
    public Map f23311I0 = new LinkedHashMap();

    /* renamed from: C0 */
    private final String f23305C0 = C5827y0.class.getSimpleName();

    /* renamed from: n9.y0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5664p {
        a() {
            super(2);
        }

        /* renamed from: a */
        public final void m23542a(int i10, boolean z10) {
            C5827y0.this.f23306D0 = i10;
            if (i10 == 0) {
                C5827y0.this.m23539ka();
            } else {
                C5827y0.this.m23538ja();
            }
            C5827y0.this.m23537ha();
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m23542a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.y0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m23543a() {
            View childAt;
            Log.d("OrderHistory", "mCurIndex:" + C5827y0.this.f23306D0);
            RecyclerView recyclerView = (RecyclerView) C5827y0.this.m23540W9(R$id.recyclerView);
            if (recyclerView != null && (childAt = recyclerView.getChildAt(C5827y0.this.f23306D0)) != null) {
                childAt.requestFocus();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23543a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.y0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f23314a = new c();

        c() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return AbstractC5095l.m20689c(str, AbstractC7786b.m30166j(310), AbstractC7786b.m30166j(310));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.y0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ImageView f23315a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ImageView imageView) {
            super(1);
            this.f23315a = imageView;
        }

        /* renamed from: a */
        public final void m23545a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f23315a.setImageBitmap(bitmap);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23545a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.y0$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ImageView f23316a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ImageView imageView) {
            super(1);
            this.f23316a = imageView;
        }

        /* renamed from: a */
        public final void m23546a(Throwable th) {
            th.printStackTrace();
            this.f23316a.setImageResource(R$mipmap.icon_share_tv_default);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23546a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final void m23532ca(C5827y0 c5827y0) {
        View view;
        AbstractC5868k.m23674f(c5827y0, "this$0");
        RecyclerView recyclerView = (RecyclerView) c5827y0.m23540W9(R$id.recyclerView);
        if (recyclerView != null) {
            view = recyclerView.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
        c5827y0.m23539ka();
    }

    /* renamed from: da */
    private final void m23533da(ImageView imageView, String str) {
        Observable just = Observable.just(str);
        final c cVar = c.f23314a;
        Observable compose = just.map(new Function() { // from class: n9.u0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m23534ea;
                m23534ea = C5827y0.m23534ea(InterfaceC5660l.this, obj);
                return m23534ea;
            }
        }).compose(m19902N3()).compose(AbstractC7029f.m27120a());
        final d dVar = new d(imageView);
        Consumer consumer = new Consumer() { // from class: n9.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5827y0.m23535fa(InterfaceC5660l.this, obj);
            }
        };
        final e eVar = new e(imageView);
        compose.subscribe(consumer, new Consumer() { // from class: n9.w0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5827y0.m23536ga(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final Bitmap m23534ea(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fa */
    public static final void m23535fa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m23536ga(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public final void m23537ha() {
        boolean z10 = false;
        C7615w c7615w = C7615w.f27995a;
        if (c7615w.m29308N()) {
            View view = this.f23309G0;
            boolean z11 = true;
            if (view != null && view.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (AbstractC6567a.m25637g(c7615w.m29314t())) {
                    ImageView imageView = (ImageView) m23540W9(R$id.mImgQrCode);
                    AbstractC5868k.m23673e(imageView, "mImgQrCode");
                    m23533da(imageView, String.valueOf(c7615w.m29314t()));
                    TextView textView = (TextView) m23540W9(R$id.mTvDownloadApkUrl);
                    if (textView != null) {
                        textView.setText(c7615w.m29314t());
                    }
                } else {
                    TextView textView2 = (TextView) m23540W9(R$id.mTvDownloadApkUrl);
                    if (textView2 != null) {
                        textView2.setText("");
                    }
                    ((ImageView) m23540W9(R$id.mImgQrCode)).setImageResource(R$mipmap.icon_share_tv_default);
                }
                if (AbstractC6567a.m25637g(c7615w.m29304H())) {
                    TextView textView3 = (TextView) m23540W9(R$id.mTvTipsTwo);
                    if (textView3 != null) {
                        C5881x c5881x = C5881x.f23415a;
                        Context m3096J6 = m3096J6();
                        AbstractC5868k.m23671c(m3096J6);
                        String string = m3096J6.getString(R$string.share_app_tv_tips_two);
                        AbstractC5868k.m23673e(string, "context!!.getString(R.st…ng.share_app_tv_tips_two)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{c7615w.m29304H()}, 1));
                        AbstractC5868k.m23673e(format, "format(format, *args)");
                        textView3.setText(Html.fromHtml(format));
                        return;
                    }
                    return;
                }
                TextView textView4 = (TextView) m23540W9(R$id.mTvTipsTwo);
                if (textView4 != null) {
                    C5881x c5881x2 = C5881x.f23415a;
                    Context m3096J62 = m3096J6();
                    AbstractC5868k.m23671c(m3096J62);
                    String string2 = m3096J62.getString(R$string.share_app_tv_tips_two);
                    AbstractC5868k.m23673e(string2, "context!!.getString(R.st…ng.share_app_tv_tips_two)");
                    String format2 = String.format(string2, Arrays.copyOf(new Object[]{""}, 1));
                    AbstractC5868k.m23673e(format2, "format(format, *args)");
                    textView4.setText(Html.fromHtml(format2));
                    return;
                }
                return;
            }
            View view2 = this.f23310H0;
            if (view2 == null || view2.getVisibility() != 0) {
                z11 = false;
            }
            if (z11) {
                if (AbstractC6567a.m25637g(c7615w.m29313s())) {
                    ImageView imageView2 = (ImageView) m23540W9(R$id.mImgPhoneQrCode);
                    AbstractC5868k.m23673e(imageView2, "mImgPhoneQrCode");
                    m23533da(imageView2, String.valueOf(c7615w.m29313s()));
                    TextView textView5 = (TextView) m23540W9(R$id.mTvPhoneDownloadApkUrl);
                    if (textView5 != null) {
                        textView5.setText(c7615w.m29313s());
                        return;
                    }
                    return;
                }
                TextView textView6 = (TextView) m23540W9(R$id.mTvPhoneDownloadApkUrl);
                if (textView6 != null) {
                    textView6.setText("");
                }
                ((ImageView) m23540W9(R$id.mImgPhoneQrCode)).setImageResource(R$mipmap.icon_share_tv_default);
                return;
            }
            return;
        }
        ((InterfaceC4749y) m5478w9()).mo19641c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public final void m23538ja() {
        View view;
        TextPaint textPaint = null;
        if (this.f23310H0 == null) {
            ViewStub viewStub = (ViewStub) m23540W9(R$id.mLayoutSharePhone);
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.f23310H0 = view;
        }
        int i10 = R$id.mTvPhoneDownloadApkUrl;
        TextView textView = (TextView) m23540W9(i10);
        if (textView != null) {
            textView.setPaintFlags(8);
        }
        TextView textView2 = (TextView) m23540W9(i10);
        if (textView2 != null) {
            textPaint = textView2.getPaint();
        }
        if (textPaint != null) {
            textPaint.setAntiAlias(true);
        }
        View view2 = this.f23309G0;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.f23310H0;
        if (view3 != null) {
            view3.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public final void m23539ka() {
        View view;
        TextPaint textPaint = null;
        if (this.f23309G0 == null) {
            ViewStub viewStub = (ViewStub) m23540W9(R$id.mLayoutShareTV);
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.f23309G0 = view;
        }
        int i10 = R$id.mTvDownloadApkUrl;
        TextView textView = (TextView) m23540W9(i10);
        if (textView != null) {
            textView.setPaintFlags(8);
        }
        TextView textView2 = (TextView) m23540W9(i10);
        if (textView2 != null) {
            textPaint = textView2.getPaint();
        }
        if (textPaint != null) {
            textPaint.setAntiAlias(true);
        }
        View view2 = this.f23309G0;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.f23310H0;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_share_app;
    }

    @Override // p160h9.InterfaceC4750z
    /* renamed from: B */
    public void mo19642B(int i10) {
        boolean z10 = false;
        View view = this.f23309G0;
        if (view != null && view.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ImageView imageView = (ImageView) m23540W9(R$id.mImgQrCode);
            if (imageView != null) {
                imageView.setImageResource(R$mipmap.icon_share_tv_default);
            }
            TextView textView = (TextView) m23540W9(R$id.mTvTipsTwo);
            if (textView != null) {
                C5881x c5881x = C5881x.f23415a;
                String string = m3154d7().getString(R$string.share_app_tv_tips_two);
                AbstractC5868k.m23673e(string, "resources.getString(R.st…ng.share_app_tv_tips_two)");
                String format = String.format(string, Arrays.copyOf(new Object[]{""}, 1));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                textView.setText(Html.fromHtml(format));
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) m23540W9(R$id.mImgPhoneQrCode);
        if (imageView2 != null) {
            imageView2.setImageResource(R$mipmap.icon_share_tv_default);
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        View childAt;
        RecyclerView recyclerView = (RecyclerView) m23540W9(R$id.recyclerView);
        if (recyclerView == null || (childAt = recyclerView.getChildAt(0)) == null || !childAt.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        RecyclerView recyclerView = (RecyclerView) m23540W9(R$id.recyclerView);
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: M9 */
    public boolean mo23276M9() {
        RecyclerView recyclerView = (RecyclerView) m23540W9(R$id.recyclerView);
        if (recyclerView == null || !recyclerView.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    public void mo23245O9() {
        View view;
        boolean z10 = false;
        View childAt;
        View childAt2;
        int i10 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) m23540W9(i10);
        if (recyclerView != null && (childAt2 = recyclerView.getChildAt(0)) != null) {
            childAt2.requestFocus();
        }
        RecyclerView recyclerView2 = (RecyclerView) m23540W9(i10);
        View view2 = null;
        if (recyclerView2 != null) {
            view = recyclerView2.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(false);
        }
        List list = this.f23308F0;
        if (list != null && list.size() >= 1) {
            RecyclerView recyclerView3 = (RecyclerView) m23540W9(i10);
            if (recyclerView3 != null && (childAt = recyclerView3.getChildAt(1)) != null && childAt.isSelected()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                RecyclerView recyclerView4 = (RecyclerView) m23540W9(i10);
                if (recyclerView4 != null) {
                    view2 = recyclerView4.getChildAt(1);
                }
                if (view2 != null) {
                    view2.setSelected(false);
                }
            }
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: W9 */
    public View m23540W9(int i10) {
        View findViewById;
        Map map = this.f23311I0;
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

    @Override // p160h9.InterfaceC4750z
    /* renamed from: c0 */
    public void mo19643c0(String str) {
        boolean z10 = false;
        AbstractC5868k.m23674f(str, "bean");
        C7581k.f27855a.m29098g("Properties", str);
        Object fromJson = AbstractC7027d.m27114a().fromJson(str, (Class<Object>) ConfigInfoBean.class);
        AbstractC5868k.m23673e(fromJson, "jsoner.fromJson(bean, ConfigInfoBean::class.java)");
        ConfigInfoBean configInfoBean = (ConfigInfoBean) fromJson;
        C7615w c7615w = C7615w.f27995a;
        boolean z11 = true;
        c7615w.m29312T(true);
        c7615w.m29310P(true);
        View view = this.f23309G0;
        if (view != null && view.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (AbstractC6567a.m25637g(configInfoBean.getDownloadTVUrl())) {
                ImageView imageView = (ImageView) m23540W9(R$id.mImgQrCode);
                AbstractC5868k.m23673e(imageView, "mImgQrCode");
                m23533da(imageView, String.valueOf(configInfoBean.getDownloadTVUrl()));
                TextView textView = (TextView) m23540W9(R$id.mTvDownloadApkUrl);
                if (textView != null) {
                    textView.setText(configInfoBean.getDownloadTVUrl());
                }
            } else {
                TextView textView2 = (TextView) m23540W9(R$id.mTvDownloadApkUrl);
                if (textView2 != null) {
                    textView2.setText("");
                }
                ((ImageView) m23540W9(R$id.mImgQrCode)).setImageResource(R$mipmap.icon_share_tv_default);
            }
            if (AbstractC6567a.m25637g(configInfoBean.getTVtutorialUrl())) {
                TextView textView3 = (TextView) m23540W9(R$id.mTvTipsTwo);
                if (textView3 != null) {
                    C5881x c5881x = C5881x.f23415a;
                    String string = m3154d7().getString(R$string.share_app_tv_tips_two);
                    AbstractC5868k.m23673e(string, "resources.getString(R.st…ng.share_app_tv_tips_two)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{configInfoBean.getTVtutorialUrl()}, 1));
                    AbstractC5868k.m23673e(format, "format(format, *args)");
                    textView3.setText(Html.fromHtml(format));
                    return;
                }
                return;
            }
            TextView textView4 = (TextView) m23540W9(R$id.mTvTipsTwo);
            if (textView4 != null) {
                C5881x c5881x2 = C5881x.f23415a;
                String string2 = m3154d7().getString(R$string.share_app_tv_tips_two);
                AbstractC5868k.m23673e(string2, "resources.getString(R.st…ng.share_app_tv_tips_two)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{""}, 1));
                AbstractC5868k.m23673e(format2, "format(format, *args)");
                textView4.setText(Html.fromHtml(format2));
                return;
            }
            return;
        }
        View view2 = this.f23310H0;
        if (view2 == null || view2.getVisibility() != 0) {
            z11 = false;
        }
        if (z11) {
            if (AbstractC6567a.m25637g(configInfoBean.getDownloadApkUrl())) {
                ImageView imageView2 = (ImageView) m23540W9(R$id.mImgPhoneQrCode);
                AbstractC5868k.m23673e(imageView2, "mImgPhoneQrCode");
                m23533da(imageView2, String.valueOf(configInfoBean.getDownloadApkUrl()));
                TextView textView5 = (TextView) m23540W9(R$id.mTvPhoneDownloadApkUrl);
                if (textView5 != null) {
                    textView5.setText(configInfoBean.getDownloadApkUrl());
                    return;
                }
                return;
            }
            TextView textView6 = (TextView) m23540W9(R$id.mTvPhoneDownloadApkUrl);
            if (textView6 != null) {
                textView6.setText("");
            }
            ImageView imageView3 = (ImageView) m23540W9(R$id.mImgPhoneQrCode);
            if (imageView3 != null) {
                imageView3.setImageResource(R$mipmap.icon_share_tv_default);
            }
        }
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        m23537ha();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: ia, reason: merged with bridge method [inline-methods] */
    public InterfaceC4749y mo5465y9() {
        return new C5017b0(this, this);
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23311I0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        List m6989h;
        String string = m3154d7().getString(R$string.personal_share_app_tv);
        AbstractC5868k.m23673e(string, "resources.getString(R.st…ng.personal_share_app_tv)");
        String string2 = m3154d7().getString(R$string.personal_share_app_phone);
        AbstractC5868k.m23673e(string2, "resources.getString(R.st…personal_share_app_phone)");
        m6989h = AbstractC1500l.m6989h(string, string2);
        this.f23308F0 = m6989h;
        int i10 = R$id.recyclerView;
        ((RecyclerView) m23540W9(i10)).setLayoutManager(new LinearLayoutManager(m3107M8(), 0, false));
        C4010v c4010v = new C4010v();
        this.f23307E0 = c4010v;
        c4010v.m28856n(this.f23308F0);
        ((RecyclerView) m23540W9(i10)).setAdapter(this.f23307E0);
        C4010v c4010v2 = this.f23307E0;
        if (c4010v2 != null) {
            c4010v2.m16947w(new a());
        }
        RecyclerView recyclerView = (RecyclerView) m23540W9(i10);
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: n9.x0
                @Override // java.lang.Runnable
                public final void run() {
                    C5827y0.m23532ca(C5827y0.this);
                }
            });
        }
        m23279Q9(new b());
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = false;
        View view;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 20) {
            int i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) m23540W9(i11);
            if (recyclerView != null && recyclerView.hasFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                RecyclerView recyclerView2 = (RecyclerView) m23540W9(i11);
                if (recyclerView2 != null) {
                    view = recyclerView2.getChildAt(this.f23306D0);
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setSelected(false);
                }
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23304B0;
    }
}
