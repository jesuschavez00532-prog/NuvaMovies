package p263o8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.live.R$array;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.bean.InfoBarBean;
import com.live.view.AccelerationSeekBar;
import com.live.view.C2879g;
import com.live.view.C2880h;
import com.live.view.C2881i;
import com.live.view.C2882j;
import com.module.view.AutoFocusedTextView;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p040c8.C1407f;
import p043ce.AbstractC1500l;
import p102db.C4053l;
import p104dd.C4094b;
import p132fa.C4297a;
import p161ha.ViewOnClickListenerC4758c0;
import p170i2.C4842a;
import p201k2.AbstractC5086c;
import p201k2.C5096m;
import p223l8.C5498s1;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p400xa.AbstractC7555b0;
import p400xa.C7554b;
import p400xa.C7565e1;
import p400xa.C7577i1;
import p400xa.C7578j;
import p400xa.C7589m1;
import vc.EnumC7254b;

/* renamed from: o8.g */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5929g extends RelativeLayout implements View.OnClickListener, View.OnKeyListener, C2882j.a, C2879g.a, View.OnFocusChangeListener, InterfaceC5940r, C2880h.a, C2881i.a {

    /* renamed from: a */
    private final String f23567a;

    /* renamed from: b */
    private String f23568b;

    /* renamed from: c */
    private String f23569c;

    /* renamed from: d */
    private String f23570d;

    /* renamed from: e */
    private String f23571e;

    /* renamed from: f */
    private String f23572f;

    /* renamed from: g */
    private ArrayList f23573g;

    /* renamed from: h */
    private a f23574h;

    /* renamed from: i */
    private C7554b f23575i;

    /* renamed from: j */
    private C2879g f23576j;

    /* renamed from: k */
    private C2882j f23577k;

    /* renamed from: l */
    private C2881i f23578l;

    /* renamed from: m */
    private C2880h f23579m;

    /* renamed from: n */
    private boolean f23580n;

    /* renamed from: o */
    private boolean f23581o;

    /* renamed from: p */
    private C5498s1.b f23582p;

    /* renamed from: q */
    private boolean f23583q;

    /* renamed from: r */
    private boolean f23584r;

    /* renamed from: s */
    public Map f23585s;

    /* renamed from: o8.g$a */
    /* loaded from: classes2.dex */
    public class a {
        /* renamed from: E1 */
        void mo22233E1(int i10, String str);

        /* renamed from: H5 */
        void mo22235H5();

        /* renamed from: J1 */
        boolean mo22239J1(int i10);

        /* renamed from: P */
        void mo22246P();

        /* renamed from: Q3 */
        void mo22248Q3(int i10);

        /* renamed from: T3 */
        void mo22251T3();

        /* renamed from: Y3 */
        void mo22254Y3(int i10, String str);

        /* renamed from: e0 */
        void mo22259e0(int i10);

        /* renamed from: p6 */
        void mo22271p6();

        /* renamed from: s2 */
        void mo22275s2();

        /* renamed from: z5 */
        void mo22280z5();
    }

    /* renamed from: o8.g$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23586a;

        static {
            int[] iArr = new int[EnumC7254b.values().length];
            try {
                iArr[EnumC7254b.IJK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23586a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o8.g$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        /* renamed from: a */
        public final void m23998a() {
            C5498s1.b bVar = ViewOnClickListenerC5929g.this.f23582p;
            if (bVar != null) {
                bVar.sendEmptyMessageDelayed(1, 10000L);
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23998a();
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC5929g(Context context) {
        this(context, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m23957A(ViewOnClickListenerC5929g viewOnClickListenerC5929g) {
        AbstractC5868k.m23674f(viewOnClickListenerC5929g, "this$0");
        viewOnClickListenerC5929g.m23970P();
    }

    /* renamed from: C */
    private final void m23958C(View view, boolean z10) {
        if (z10) {
            this.f23575i.m28943c(view, 1.1f);
        } else {
            this.f23575i.m28945f(view, 1.1f);
        }
    }

    /* renamed from: D */
    private final boolean m23959D() {
        TextView textView;
        if (this.f23581o) {
            textView = (TextView) m23996n(R$id.mBtnPip);
        } else if (this.f23580n) {
            textView = (TextView) m23996n(R$id.mBtnHD);
        } else {
            textView = (TextView) m23996n(R$id.mBtnPre);
        }
        if (textView.isSelected()) {
            return false;
        }
        textView.setSelected(true);
        textView.setFocusable(true);
        textView.requestFocus();
        return true;
    }

    /* renamed from: E */
    private final void m23960E() {
        int size = this.f23573g.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (AbstractC5868k.m23669a(this.f23572f, this.f23573g.get(i10))) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            ((TextView) m23996n(R$id.mQualityText)).setText("");
        } else {
            ((TextView) m23996n(R$id.mQualityText)).setText((CharSequence) this.f23573g.get(i10));
        }
    }

    /* renamed from: F */
    private final void m23961F() {
        String[] stringArray = getResources().getStringArray(R$array.play_setting_playratio);
        AbstractC5868k.m23673e(stringArray, "resources.getStringArray…y.play_setting_playratio)");
        ((TextView) m23996n(R$id.mScaleText)).setText(stringArray[((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue()]);
    }

    /* renamed from: G */
    private final void m23962G() {
        TextView textView = (TextView) m23996n(R$id.mTvDate);
        if (textView != null) {
            textView.setText(AbstractC5086c.m20616i("yyyy-MM-dd"));
        }
    }

    /* renamed from: H */
    private final void m23963H(TextView textView, boolean z10, int i10) {
        if (z10) {
            textView.setText(getContext().getString(i10));
        } else {
            textView.setText("");
        }
    }

    /* renamed from: J */
    private final void m23964J() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        Object obj;
        int i10 = R$id.mBtnPip;
        TextView textView = (TextView) m23996n(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams5 = null;
        if (textView != null) {
            layoutParams = textView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i11 = R$id.mBtnHD;
        TextView textView2 = (TextView) m23996n(i11);
        if (textView2 != null) {
            layoutParams2 = textView2.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams2 = null;
        }
        int i12 = R$id.mBtnPre;
        TextView textView3 = (TextView) m23996n(i12);
        if (textView3 != null) {
            layoutParams3 = textView3.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        } else {
            marginLayoutParams3 = null;
        }
        int i13 = R$id.mBtnRatio;
        TextView textView4 = (TextView) m23996n(i13);
        if (textView4 != null) {
            layoutParams4 = textView4.getLayoutParams();
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        } else {
            marginLayoutParams4 = null;
        }
        int i14 = R$id.mBtnFav;
        TextView textView5 = (TextView) m23996n(i14);
        if (textView5 != null) {
            obj = textView5.getLayoutParams();
        } else {
            obj = null;
        }
        if (obj instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams5 = (ViewGroup.MarginLayoutParams) obj;
        }
        if (Build.VERSION.SDK_INT >= 28 && !TextUtils.isEmpty(C5096m.f20979a.m20690a())) {
            ((TextView) m23996n(R$id.mBtnSwitchPlayer)).setVisibility(8);
            m23965K(marginLayoutParams5, 56.0f);
            m23965K(marginLayoutParams4, 56.0f);
            m23965K(marginLayoutParams3, 56.0f);
            if (this.f23580n) {
                m23965K(marginLayoutParams2, 56.0f);
                if (this.f23581o) {
                    this.f23584r = true;
                    m23965K(marginLayoutParams, 56.0f);
                }
            } else if (this.f23581o) {
                this.f23584r = true;
                m23965K(marginLayoutParams, 113.0f);
            }
        } else {
            ((TextView) m23996n(R$id.mBtnSwitchPlayer)).setVisibility(0);
            if (!this.f23580n && this.f23581o) {
                this.f23584r = true;
                m23965K(marginLayoutParams, 56.0f);
            }
        }
        TextView textView6 = (TextView) m23996n(i10);
        if (textView6 != null) {
            textView6.setLayoutParams(marginLayoutParams);
        }
        TextView textView7 = (TextView) m23996n(i11);
        if (textView7 != null) {
            textView7.setLayoutParams(marginLayoutParams2);
        }
        TextView textView8 = (TextView) m23996n(i12);
        if (textView8 != null) {
            textView8.setLayoutParams(marginLayoutParams3);
        }
        TextView textView9 = (TextView) m23996n(i13);
        if (textView9 != null) {
            textView9.setLayoutParams(marginLayoutParams4);
        }
        TextView textView10 = (TextView) m23996n(i14);
        if (textView10 != null) {
            textView10.setLayoutParams(marginLayoutParams5);
        }
    }

    /* renamed from: K */
    private final void m23965K(ViewGroup.MarginLayoutParams marginLayoutParams, float f10) {
        Integer num;
        if (marginLayoutParams != null) {
            num = Integer.valueOf(marginLayoutParams.rightMargin);
        } else {
            num = null;
        }
        if (num != null) {
            marginLayoutParams.rightMargin = num.intValue() - AutoSizeUtils.dp2px(getContext(), f10);
        }
    }

    /* renamed from: L */
    private final void m23966L() {
        String obj = ((TextView) m23996n(R$id.mChannelName)).getText().toString();
        if (AbstractC6567a.m25634d(obj)) {
            return;
        }
        Context context = getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0302c) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as AppCompatActi…y).supportFragmentManager");
        ViewOnClickListenerC4758c0.f20101M0.m19681b("live", obj).mo3277E9(m3294d4, "FeedbackDialog");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m23967M() {
        /*
            r3 = this;
            int r0 = com.live.R$id.mTextChannelIndex
            android.view.View r0 = r3.m23996n(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = p359ue.AbstractC7157k.m27699b0(r0)
            java.lang.String r0 = r0.toString()
            r1 = 1
            if (r0 == 0) goto L24
            int r2 = r0.length()
            if (r2 != 0) goto L22
            goto L24
        L22:
            r2 = 0
            goto L25
        L24:
            r2 = 1
        L25:
            if (r2 == 0) goto L28
            goto L31
        L28:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2d
            goto L32
        L2d:
            r0 = move-exception
            r0.printStackTrace()
        L31:
            r0 = 1
        L32:
            int r0 = r0 - r1
            o8.g$a r2 = r3.f23574h
            if (r2 == 0) goto L40
            boolean r0 = r2.mo22239J1(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L41
        L40:
            r0 = 0
        L41:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r2)
            if (r0 == 0) goto L54
            int r0 = com.live.R$id.mBtnLock
            android.view.View r0 = r3.m23996n(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setSelected(r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p263o8.ViewOnClickListenerC5929g.m23967M():void");
    }

    /* renamed from: N */
    private final void m23968N() {
        if (this.f23579m != null) {
            this.f23579m = null;
        }
        C2880h m23984s = m23984s();
        this.f23579m = m23984s;
        if (m23984s != null) {
            m23984s.m11627e(0);
        }
        C2880h c2880h = this.f23579m;
        if (c2880h != null) {
            int i10 = R$id.mBtnPip;
            TextView textView = (TextView) m23996n(i10);
            int width = ((TextView) m23996n(i10)).getWidth() / 2;
            C2880h c2880h2 = this.f23579m;
            AbstractC5868k.m23671c(c2880h2);
            int width2 = width - (c2880h2.getWidth() / 2);
            int i11 = -((TextView) m23996n(i10)).getHeight();
            C2880h c2880h3 = this.f23579m;
            AbstractC5868k.m23671c(c2880h3);
            c2880h.showAsDropDown(textView, width2, i11 - c2880h3.getHeight());
        }
    }

    /* renamed from: O */
    private final void m23969O() {
        String str;
        if (this.f23578l != null) {
            this.f23578l = null;
        }
        this.f23578l = m23986u();
        C4094b c4094b = C4094b.f17998a;
        Channel m6531w = C1407f.f5458a.m6531w();
        if (m6531w == null || (str = m6531w.getChannelCode()) == null) {
            str = "";
        }
        EnumC7254b m17138a = c4094b.m17138a(str);
        int i10 = 1;
        if (b.f23586a[m17138a.ordinal()] != 1) {
            i10 = 0;
        }
        C2881i c2881i = this.f23578l;
        if (c2881i != null) {
            c2881i.m11632e(i10);
        }
        C2881i c2881i2 = this.f23578l;
        if (c2881i2 != null) {
            int i11 = R$id.mBtnSwitchPlayer;
            TextView textView = (TextView) m23996n(i11);
            int width = ((TextView) m23996n(i11)).getWidth() / 2;
            C2881i c2881i3 = this.f23578l;
            AbstractC5868k.m23671c(c2881i3);
            int width2 = width - (c2881i3.getWidth() / 2);
            int i12 = -((TextView) m23996n(i11)).getHeight();
            C2881i c2881i4 = this.f23578l;
            AbstractC5868k.m23671c(c2881i4);
            c2881i2.showAsDropDown(textView, width2, i12 - c2881i4.getHeight());
        }
    }

    /* renamed from: P */
    private final void m23970P() {
        C4053l.a aVar = C4053l.f17879P0;
        C4053l.c cVar = C4053l.c.PopMenu;
        if (!aVar.m17071b(cVar)) {
            C5498s1.b bVar = this.f23582p;
            if (bVar != null) {
                bVar.removeMessages(1);
            }
            final C4053l c4053l = new C4053l();
            TextView textView = (TextView) m23996n(R$id.mBtnPip);
            AbstractC5868k.m23673e(textView, "mBtnPip");
            c4053l.m17069ea(textView);
            c4053l.m17067ca(C4053l.b.TOP_LEFT);
            c4053l.m17065aa(R$layout.layout_guide_live_pip);
            c4053l.m17066ba(-AutoSizeUtils.dp2px(getContext(), 25.0f), AutoSizeUtils.dp2px(getContext(), 20.0f));
            c4053l.m17068da(new c());
            C5498s1.b bVar2 = this.f23582p;
            if (bVar2 != null) {
                bVar2.postDelayed(new Runnable() { // from class: o8.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC5929g.m23971Q(C4053l.this, this);
                    }
                }, 100L);
            }
            aVar.m17073d(cVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m23971Q(C4053l c4053l, ViewOnClickListenerC5929g viewOnClickListenerC5929g) {
        AbstractC5868k.m23674f(c4053l, "$guideDialog");
        AbstractC5868k.m23674f(viewOnClickListenerC5929g, "this$0");
        Context context = viewOnClickListenerC5929g.getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
        c4053l.mo3277E9(m3294d4, "PipGuideDialog");
    }

    /* renamed from: R */
    private final void m23972R() {
        if (this.f23576j != null) {
            this.f23576j = null;
        }
        C2879g m23982q = m23982q();
        this.f23576j = m23982q;
        if (m23982q != null) {
            m23982q.m11620c(this.f23573g);
        }
        int size = this.f23573g.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (this.f23572f.equals(this.f23573g.get(i11))) {
                i10 = i11;
                break;
            }
            i11++;
        }
        C2879g c2879g = this.f23576j;
        if (c2879g != null) {
            c2879g.m11622e(i10);
        }
        C2879g c2879g2 = this.f23576j;
        if (c2879g2 != null) {
            int i12 = R$id.mBtnHD;
            TextView textView = (TextView) m23996n(i12);
            int width = ((TextView) m23996n(i12)).getWidth() / 2;
            C2879g c2879g3 = this.f23576j;
            AbstractC5868k.m23671c(c2879g3);
            int width2 = width - (c2879g3.getWidth() / 2);
            int i13 = -((TextView) m23996n(i12)).getHeight();
            C2879g c2879g4 = this.f23576j;
            AbstractC5868k.m23671c(c2879g4);
            c2879g2.showAsDropDown(textView, width2, i13 - c2879g4.getHeight());
        }
    }

    /* renamed from: S */
    private final void m23973S() {
        if (this.f23577k != null) {
            this.f23577k = null;
        }
        int intValue = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
        C2882j m23988w = m23988w();
        this.f23577k = m23988w;
        if (m23988w != null) {
            m23988w.m11637e(intValue);
        }
        C2882j c2882j = this.f23577k;
        if (c2882j != null) {
            int i10 = R$id.mBtnRatio;
            TextView textView = (TextView) m23996n(i10);
            int width = ((TextView) m23996n(i10)).getWidth() / 2;
            C2882j c2882j2 = this.f23577k;
            AbstractC5868k.m23671c(c2882j2);
            int width2 = width - (c2882j2.getWidth() / 2);
            int i11 = -((TextView) m23996n(i10)).getHeight();
            C2882j c2882j3 = this.f23577k;
            AbstractC5868k.m23671c(c2882j3);
            c2882j.showAsDropDown(textView, width2, i11 - c2882j3.getHeight());
        }
    }

    private final String getNextPlayStr() {
        if (AbstractC6567a.m25634d(this.f23570d)) {
            String string = getContext().getString(R$string.next_play);
            AbstractC5868k.m23673e(string, "context.getString(R.string.next_play)");
            this.f23570d = string;
        }
        return this.f23570d;
    }

    private final String getNowPlayStr() {
        if (AbstractC6567a.m25634d(this.f23569c)) {
            String string = getContext().getString(R$string.now_play);
            AbstractC5868k.m23673e(string, "context.getString(R.string.now_play)");
            this.f23569c = string;
        }
        return this.f23569c;
    }

    /* renamed from: p */
    private final void m23981p() {
        setChannelIndex(MessageService.MSG_DB_READY_REPORT);
        setChannelName("");
        setFavStatus(false);
        setLockStatus(false);
        m23992I(new ArrayList(), 0);
        C2879g c2879g = this.f23576j;
        if (c2879g != null) {
            c2879g.dismiss();
        }
        C2882j c2882j = this.f23577k;
        if (c2882j != null) {
            c2882j.dismiss();
        }
        C2880h c2880h = this.f23579m;
        if (c2880h != null) {
            c2880h.dismiss();
        }
        C2881i c2881i = this.f23578l;
        if (c2881i != null) {
            c2881i.dismiss();
        }
    }

    /* renamed from: q */
    private final C2879g m23982q() {
        View inflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_pop_pip, (ViewGroup) null);
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        AbstractC5868k.m23673e(inflate, "rootView");
        C2879g c2879g = new C2879g(context, inflate);
        String[] stringArray = getResources().getStringArray(R$array.play_setting_hd);
        AbstractC5868k.m23673e(stringArray, "resources.getStringArray(R.array.play_setting_hd)");
        c2879g.m11620c(new ArrayList(Arrays.asList(Arrays.copyOf(stringArray, stringArray.length))));
        c2879g.m11621d(this);
        c2879g.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o8.e
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewOnClickListenerC5929g.m23983r(ViewOnClickListenerC5929g.this);
            }
        });
        return c2879g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m23983r(ViewOnClickListenerC5929g viewOnClickListenerC5929g) {
        AbstractC5868k.m23674f(viewOnClickListenerC5929g, "this$0");
        viewOnClickListenerC5929g.f23576j = null;
    }

    /* renamed from: s */
    private final C2880h m23984s() {
        List m6988g;
        View inflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_pop_pip, (ViewGroup) null);
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        AbstractC5868k.m23673e(inflate, "rootView");
        C2880h c2880h = new C2880h(context, inflate);
        String[] stringArray = getResources().getStringArray(R$array.play_setting_pip);
        AbstractC5868k.m23673e(stringArray, "resources.getStringArray(R.array.play_setting_pip)");
        m6988g = AbstractC1500l.m6988g(Arrays.copyOf(stringArray, stringArray.length));
        c2880h.m11625c(new ArrayList(m6988g));
        c2880h.m11626d(this);
        c2880h.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o8.a
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewOnClickListenerC5929g.m23985t(ViewOnClickListenerC5929g.this);
            }
        });
        return c2880h;
    }

    private final void setChannelIndex(String str) {
        TextView textView = (TextView) m23996n(R$id.mTextChannelIndex);
        if (textView != null) {
            String str2 = "";
            if (!AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT) && !AbstractC5868k.m23669a(str, "")) {
                str2 = str.toString();
            }
            textView.setText(str2);
        }
    }

    private final void setChannelName(String str) {
        if (AbstractC6567a.m25637g(str)) {
            TextView textView = (TextView) m23996n(R$id.mChannelName);
            if (textView != null) {
                textView.setText(str);
            }
            AbstractC5868k.m23671c(str);
            this.f23568b = str;
            if (C4842a.f20329a.m19920a().mo19972u(str)) {
                ImageView imageView = (ImageView) m23996n(R$id.mImageUHD);
                if (imageView != null) {
                    imageView.setImageResource(R$drawable.ic_uhd);
                    return;
                }
                return;
            }
            ImageView imageView2 = (ImageView) m23996n(R$id.mImageUHD);
            if (imageView2 != null) {
                imageView2.setImageResource(0);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) m23996n(R$id.mChannelName);
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    private final void setChannelPip(String str) {
        boolean z10;
        boolean z11;
        Object obj;
        C4842a c4842a = C4842a.f20329a;
        int i10 = 0;
        if (c4842a.m19920a().m19932I() && AbstractC5868k.m23669a(str, "av1")) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f23583q = z10;
        if (c4842a.m19920a().m19941R() && this.f23583q) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23581o = z11;
        int i11 = R$id.mBtnPip;
        TextView textView = (TextView) m23996n(i11);
        if (!this.f23581o) {
            i10 = 8;
        }
        textView.setVisibility(i10);
        if (!this.f23584r && this.f23581o) {
            TextView textView2 = (TextView) m23996n(i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (textView2 != null) {
                obj = textView2.getLayoutParams();
            } else {
                obj = null;
            }
            if (obj instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
            }
            if (Build.VERSION.SDK_INT >= 28 && !TextUtils.isEmpty(C5096m.f20979a.m20690a())) {
                this.f23584r = true;
                if (this.f23580n) {
                    m23965K(marginLayoutParams, 56.0f);
                } else {
                    m23965K(marginLayoutParams, 113.0f);
                }
            } else if (!this.f23580n) {
                this.f23584r = true;
                m23965K(marginLayoutParams, 56.0f);
            }
            TextView textView3 = (TextView) m23996n(i11);
            if (textView3 != null) {
                textView3.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f23581o) {
            if (this.f23580n) {
                ((TextView) m23996n(R$id.mBtnHD)).setFocusable(true);
            } else {
                ((TextView) m23996n(R$id.mBtnPre)).setFocusable(true);
            }
        }
    }

    private final void setChannelPost(String str) {
        String str2;
        if (AbstractC6567a.m25637g(str) && AbstractC5868k.m23669a(str, this.f23571e)) {
            return;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f23571e = str2;
        Drawable m27111a = AbstractC7026c.m27111a(getContext(), R$drawable.live_channel_default_icon);
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(getContext().getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        ((C1596k) ((C1596k) ((C1596k) ((C1596k) AbstractC7555b0.m28954h(m7282u, str, false, 2, null).mo49d0(m27111a)).mo59k(m27111a)).mo61l()).mo54h()).m7365E0((ImageView) m23996n(R$id.mLiveLogo));
    }

    private final void setFavStatus(boolean z10) {
        int i10 = 0;
        ImageView imageView = (ImageView) m23996n(R$id.mInfoFav);
        if (imageView != null) {
            if (z10) {
                i10 = R$drawable.ic_channel_fav;
            } else {
                i10 = 0;
            }
            imageView.setImageResource(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m23985t(ViewOnClickListenerC5929g viewOnClickListenerC5929g) {
        AbstractC5868k.m23674f(viewOnClickListenerC5929g, "this$0");
        viewOnClickListenerC5929g.f23579m = null;
    }

    /* renamed from: u */
    private final C2881i m23986u() {
        List m6988g;
        View inflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_switch_player_pip, (ViewGroup) null);
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        AbstractC5868k.m23673e(inflate, "rootView");
        C2881i c2881i = new C2881i(context, inflate);
        String[] stringArray = getResources().getStringArray(R$array.play_setting_player_switch);
        AbstractC5868k.m23673e(stringArray, "resources.getStringArray…ay_setting_player_switch)");
        m6988g = AbstractC1500l.m6988g(Arrays.copyOf(stringArray, stringArray.length));
        c2881i.m11630c(new ArrayList(m6988g));
        c2881i.m11631d(this);
        c2881i.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o8.d
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewOnClickListenerC5929g.m23987v(ViewOnClickListenerC5929g.this);
            }
        });
        return c2881i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m23987v(ViewOnClickListenerC5929g viewOnClickListenerC5929g) {
        AbstractC5868k.m23674f(viewOnClickListenerC5929g, "this$0");
        viewOnClickListenerC5929g.f23578l = null;
    }

    /* renamed from: w */
    private final C2882j m23988w() {
        View inflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_live_subtitle_pop, (ViewGroup) null);
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        AbstractC5868k.m23673e(inflate, "rootView");
        C2882j c2882j = new C2882j(context, inflate);
        String[] stringArray = getResources().getStringArray(R$array.play_setting_playratio);
        AbstractC5868k.m23673e(stringArray, "resources.getStringArray…y.play_setting_playratio)");
        c2882j.m11635c(new ArrayList(Arrays.asList(Arrays.copyOf(stringArray, stringArray.length))));
        c2882j.m11636d(this);
        c2882j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o8.b
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewOnClickListenerC5929g.m23989x(ViewOnClickListenerC5929g.this);
            }
        });
        return c2882j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m23989x(ViewOnClickListenerC5929g viewOnClickListenerC5929g) {
        AbstractC5868k.m23674f(viewOnClickListenerC5929g, "this$0");
        viewOnClickListenerC5929g.f23577k = null;
    }

    /* renamed from: z */
    private final void m23990z() {
        int i10 = R$id.mMenuInfo;
        ((TextView) m23996n(i10)).setOnClickListener(this);
        int i11 = R$id.mBtnHD;
        ((TextView) m23996n(i11)).setOnClickListener(this);
        int i12 = R$id.mBtnPre;
        ((TextView) m23996n(i12)).setOnClickListener(this);
        int i13 = R$id.mBtnRatio;
        ((TextView) m23996n(i13)).setOnClickListener(this);
        int i14 = R$id.mBtnFav;
        ((TextView) m23996n(i14)).setOnClickListener(this);
        int i15 = R$id.mBtnSwitchPlayer;
        ((TextView) m23996n(i15)).setOnClickListener(this);
        int i16 = R$id.mBtnLock;
        ((TextView) m23996n(i16)).setOnClickListener(this);
        int i17 = R$id.mBtnFeedBack;
        ((TextView) m23996n(i17)).setOnClickListener(this);
        int i18 = R$id.mBtnPip;
        ((TextView) m23996n(i18)).setOnClickListener(this);
        ((TextView) m23996n(i10)).setOnKeyListener(this);
        ((TextView) m23996n(i11)).setOnKeyListener(this);
        ((TextView) m23996n(i12)).setOnKeyListener(this);
        ((TextView) m23996n(i13)).setOnKeyListener(this);
        ((TextView) m23996n(i14)).setOnKeyListener(this);
        ((TextView) m23996n(i15)).setOnKeyListener(this);
        ((TextView) m23996n(i16)).setOnKeyListener(this);
        ((TextView) m23996n(i17)).setOnKeyListener(this);
        ((TextView) m23996n(i18)).setOnKeyListener(this);
        ((TextView) m23996n(i11)).setOnFocusChangeListener(this);
        ((TextView) m23996n(i12)).setOnFocusChangeListener(this);
        ((TextView) m23996n(i13)).setOnFocusChangeListener(this);
        ((TextView) m23996n(i14)).setOnFocusChangeListener(this);
        ((TextView) m23996n(i15)).setOnFocusChangeListener(this);
        ((TextView) m23996n(i16)).setOnFocusChangeListener(this);
        ((TextView) m23996n(i17)).setOnFocusChangeListener(this);
        ((TextView) m23996n(i18)).setOnFocusChangeListener(this);
    }

    /* renamed from: B */
    public final void m23991B() {
        int i10 = R$id.mBtnLock;
        ((TextView) m23996n(i10)).setSelected(false);
        ((TextView) m23996n(i10)).setFocusable(true);
        ((TextView) m23996n(i10)).requestFocus();
    }

    /* renamed from: I */
    public final void m23992I(ArrayList arrayList, int i10) {
        AbstractC5868k.m23674f(arrayList, "infobarEpgs");
        if (AbstractC6567a.m25635e(arrayList)) {
            AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m23996n(R$id.mNowPlayInfo);
            if (autoFocusedTextView != null) {
                autoFocusedTextView.setText(getNowPlayStr());
            }
            AutoFocusedTextView autoFocusedTextView2 = (AutoFocusedTextView) m23996n(R$id.mNextPlayInfo);
            if (autoFocusedTextView2 != null) {
                autoFocusedTextView2.setText(getNextPlayStr());
            }
            AccelerationSeekBar accelerationSeekBar = (AccelerationSeekBar) m23996n(R$id.mSeekBar);
            if (accelerationSeekBar != null) {
                accelerationSeekBar.setProgress(0);
            }
            TextView textView = (TextView) m23996n(R$id.mTimeRanger);
            if (textView != null) {
                textView.setText("00:00-23:59");
                return;
            }
            return;
        }
        Object obj = arrayList.get(0);
        AbstractC5868k.m23673e(obj, "infobarEpgs[0]");
        EpgProgram epgProgram = (EpgProgram) obj;
        AutoFocusedTextView autoFocusedTextView3 = (AutoFocusedTextView) m23996n(R$id.mNowPlayInfo);
        if (autoFocusedTextView3 != null) {
            autoFocusedTextView3.setText(getNowPlayStr() + epgProgram.getProgramName() + '(' + epgProgram.getStart() + '-' + epgProgram.getStop() + ')');
        }
        AccelerationSeekBar accelerationSeekBar2 = (AccelerationSeekBar) m23996n(R$id.mSeekBar);
        if (accelerationSeekBar2 != null) {
            accelerationSeekBar2.setProgress(i10);
        }
        TextView textView2 = (TextView) m23996n(R$id.mTimeRanger);
        if (textView2 != null) {
            textView2.setText(epgProgram.getStart() + '-' + epgProgram.getStop());
        }
        if (arrayList.size() < 2) {
            AutoFocusedTextView autoFocusedTextView4 = (AutoFocusedTextView) m23996n(R$id.mNextPlayInfo);
            if (autoFocusedTextView4 != null) {
                autoFocusedTextView4.setText(getNextPlayStr());
                return;
            }
            return;
        }
        Object obj2 = arrayList.get(1);
        AbstractC5868k.m23673e(obj2, "infobarEpgs[1]");
        EpgProgram epgProgram2 = (EpgProgram) obj2;
        AutoFocusedTextView autoFocusedTextView5 = (AutoFocusedTextView) m23996n(R$id.mNextPlayInfo);
        if (autoFocusedTextView5 != null) {
            autoFocusedTextView5.setText(getNextPlayStr() + epgProgram2.getProgramName() + '(' + epgProgram2.getStart() + '-' + epgProgram2.getStop() + ')');
        }
    }

    @Override // com.live.view.C2880h.a
    /* renamed from: a */
    public void mo11628a(int i10, String str) {
        AbstractC5868k.m23674f(str, "operate");
        a aVar = this.f23574h;
        if (aVar != null) {
            aVar.mo22233E1(i10, str);
        }
    }

    @Override // p263o8.InterfaceC5940r
    /* renamed from: b */
    public void mo23993b() {
        m23981p();
    }

    @Override // com.live.view.C2881i.a
    /* renamed from: c */
    public void mo11633c(int i10) {
        a aVar = this.f23574h;
        if (aVar != null) {
            aVar.mo22248Q3(i10);
        }
    }

    @Override // p263o8.InterfaceC5940r
    /* renamed from: d */
    public void mo23994d(InfoBarBean infoBarBean) {
        AbstractC5868k.m23674f(infoBarBean, "bean");
        m23962G();
        setChannelIndex(infoBarBean.getIndex());
        setChannelName(infoBarBean.getName());
        setChannelPost(infoBarBean.getPostUrl());
        setFavStatus(infoBarBean.getFaved());
        setLockStatus(infoBarBean.getLocked());
        m23992I(infoBarBean.getInfoBarEpgs(), infoBarBean.getProcess());
        this.f23573g.clear();
        this.f23573g.addAll(infoBarBean.getDefinitions());
        this.f23572f = infoBarBean.getVideoQuality();
        m23960E();
        m23961F();
        setChannelPip(infoBarBean.getSupportVideoType());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    @Override // p263o8.InterfaceC5940r
    /* renamed from: e */
    public void mo23995e(boolean z10) {
        setFavStatus(z10);
    }

    @Override // com.live.view.C2882j.a
    /* renamed from: f */
    public void mo11638f(int i10, String str) {
        AbstractC5868k.m23674f(str, "ratio");
        ((TextView) m23996n(R$id.mScaleText)).setText(str);
        C7577i1.f27838b.m29085d().m29076h("play_ratio", Integer.valueOf(i10));
        a aVar = this.f23574h;
        if (aVar != null) {
            aVar.mo22259e0(C7565e1.f27773a.m28998c(i10));
        }
    }

    @Override // com.live.view.C2879g.a
    /* renamed from: g */
    public void mo11623g(int i10) {
        Object obj = this.f23573g.get(i10);
        AbstractC5868k.m23673e(obj, "mQuality[pos]");
        this.f23572f = (String) obj;
        ((TextView) m23996n(R$id.mQualityText)).setText(this.f23572f);
        a aVar = this.f23574h;
        if (aVar != null) {
            aVar.mo22254Y3(i10, this.f23572f);
        }
    }

    /* renamed from: n */
    public View m23996n(int i10) {
        Map map = this.f23585s;
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
        a aVar;
        a aVar2;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mMenuInfo;
        if (num != null && num.intValue() == i10) {
            a aVar3 = this.f23574h;
            if (aVar3 != null) {
                aVar3.mo22271p6();
                return;
            }
            return;
        }
        int i11 = R$id.mBtnHD;
        if (num != null && num.intValue() == i11) {
            m23972R();
            return;
        }
        int i12 = R$id.mBtnPre;
        if (num != null && num.intValue() == i12) {
            a aVar4 = this.f23574h;
            if (aVar4 != null) {
                aVar4.mo22251T3();
                return;
            }
            return;
        }
        int i13 = R$id.mBtnRatio;
        if (num != null && num.intValue() == i13) {
            m23973S();
            return;
        }
        int i14 = R$id.mBtnFav;
        if (num != null && num.intValue() == i14) {
            if (!C7578j.f27850a.m29087a() && (aVar2 = this.f23574h) != null) {
                aVar2.mo22280z5();
                return;
            }
            return;
        }
        int i15 = R$id.mBtnSwitchPlayer;
        if (num != null && num.intValue() == i15) {
            m23969O();
            return;
        }
        int i16 = R$id.mBtnLock;
        if (num != null && num.intValue() == i16) {
            m23967M();
            C7589m1.f27886a.m29150s(this.f23568b);
            return;
        }
        int i17 = R$id.mBtnFeedBack;
        if (num != null && num.intValue() == i17) {
            m23966L();
            return;
        }
        int i18 = R$id.mBtnPip;
        if (num != null && num.intValue() == i18) {
            if (!C4297a.f18620a.m17986c() && (aVar = this.f23574h) != null) {
                aVar.mo22233E1(0, "On");
            }
            m23968N();
        }
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
            TextView textView = (TextView) m23996n(i10);
            AbstractC5868k.m23673e(textView, "mBtnFeedBack");
            m23963H(textView, z10, R$string.info_feedback);
            TextView textView2 = (TextView) m23996n(i10);
            AbstractC5868k.m23673e(textView2, "mBtnFeedBack");
            m23958C(textView2, z10);
        } else {
            int i11 = R$id.mBtnHD;
            if (num != null && num.intValue() == i11) {
                TextView textView3 = (TextView) m23996n(i11);
                AbstractC5868k.m23673e(textView3, "mBtnHD");
                m23963H(textView3, z10, R$string.btn_hd);
                TextView textView4 = (TextView) m23996n(i11);
                AbstractC5868k.m23673e(textView4, "mBtnHD");
                m23958C(textView4, z10);
            } else {
                int i12 = R$id.mBtnPre;
                if (num != null && num.intValue() == i12) {
                    TextView textView5 = (TextView) m23996n(i12);
                    AbstractC5868k.m23673e(textView5, "mBtnPre");
                    m23963H(textView5, z10, R$string.btn_pre);
                    TextView textView6 = (TextView) m23996n(i12);
                    AbstractC5868k.m23673e(textView6, "mBtnPre");
                    m23958C(textView6, z10);
                } else {
                    int i13 = R$id.mBtnRatio;
                    if (num != null && num.intValue() == i13) {
                        TextView textView7 = (TextView) m23996n(i13);
                        AbstractC5868k.m23673e(textView7, "mBtnRatio");
                        m23963H(textView7, z10, R$string.btn_screen);
                        TextView textView8 = (TextView) m23996n(i13);
                        AbstractC5868k.m23673e(textView8, "mBtnRatio");
                        m23958C(textView8, z10);
                    } else {
                        int i14 = R$id.mBtnFav;
                        if (num != null && num.intValue() == i14) {
                            TextView textView9 = (TextView) m23996n(i14);
                            AbstractC5868k.m23673e(textView9, "mBtnFav");
                            m23963H(textView9, z10, R$string.btn_fav);
                            TextView textView10 = (TextView) m23996n(i14);
                            AbstractC5868k.m23673e(textView10, "mBtnFav");
                            m23958C(textView10, z10);
                        } else {
                            int i15 = R$id.mBtnSwitchPlayer;
                            if (num != null && num.intValue() == i15) {
                                TextView textView11 = (TextView) m23996n(i15);
                                AbstractC5868k.m23673e(textView11, "mBtnSwitchPlayer");
                                m23963H(textView11, z10, R$string.vod_menu_player);
                                TextView textView12 = (TextView) m23996n(i15);
                                AbstractC5868k.m23673e(textView12, "mBtnSwitchPlayer");
                                m23958C(textView12, z10);
                            } else {
                                int i16 = R$id.mBtnLock;
                                if (num != null && num.intValue() == i16) {
                                    TextView textView13 = (TextView) m23996n(i16);
                                    AbstractC5868k.m23673e(textView13, "mBtnLock");
                                    m23963H(textView13, z10, R$string.btn_lock);
                                    TextView textView14 = (TextView) m23996n(i16);
                                    AbstractC5868k.m23673e(textView14, "mBtnLock");
                                    m23958C(textView14, z10);
                                } else {
                                    int i17 = R$id.mBtnPip;
                                    if (num != null && num.intValue() == i17) {
                                        TextView textView15 = (TextView) m23996n(i17);
                                        AbstractC5868k.m23673e(textView15, "mBtnPip");
                                        m23963H(textView15, z10, R$string.btn_pip);
                                        TextView textView16 = (TextView) m23996n(i17);
                                        AbstractC5868k.m23673e(textView16, "mBtnPip");
                                        m23958C(textView16, z10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z10 && (aVar = this.f23574h) != null) {
            aVar.mo22246P();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(view, "v");
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 19) {
            if (keyEvent.getAction() == 0) {
                a aVar = this.f23574h;
                if (aVar != null) {
                    aVar.mo22275s2();
                }
                return true;
            }
            return false;
        }
        if (i10 == 20) {
            if (keyEvent.getAction() == 0) {
                a aVar2 = this.f23574h;
                if (aVar2 != null) {
                    aVar2.mo22235H5();
                }
                return true;
            }
            return false;
        }
        if (i10 == 21 && keyEvent.getAction() == 0) {
            if (((TextView) m23996n(R$id.mBtnPre)).hasFocus()) {
                int i11 = R$id.mBtnHD;
                if (((TextView) m23996n(i11)).getVisibility() == 0) {
                    ((TextView) m23996n(i11)).requestFocus();
                } else {
                    int i12 = R$id.mBtnPip;
                    if (((TextView) m23996n(i12)).getVisibility() == 0) {
                        ((TextView) m23996n(i12)).requestFocus();
                    }
                }
                return true;
            }
            if (((TextView) m23996n(R$id.mBtnHD)).hasFocus() && ((TextView) m23996n(R$id.mBtnPip)).getVisibility() == 8) {
                return true;
            }
            if (((TextView) m23996n(R$id.mBtnLock)).hasFocus() && ((TextView) m23996n(R$id.mBtnSwitchPlayer)).getVisibility() == 8) {
                ((TextView) m23996n(R$id.mBtnFav)).requestFocus();
                return true;
            }
            return false;
        }
        if (i10 == 22 && keyEvent.getAction() == 0) {
            if (((TextView) m23996n(R$id.mBtnPip)).hasFocus() && ((TextView) m23996n(R$id.mBtnHD)).getVisibility() == 8) {
                ((TextView) m23996n(R$id.mBtnPre)).requestFocus();
                return true;
            }
            if (((TextView) m23996n(R$id.mBtnFav)).hasFocus() && ((TextView) m23996n(R$id.mBtnSwitchPlayer)).getVisibility() == 8) {
                ((TextView) m23996n(R$id.mBtnLock)).requestFocus();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        TextView textView;
        AbstractC5868k.m23674f(view, "changedView");
        super.onVisibilityChanged(view, i10);
        if (AbstractC5868k.m23669a(view, this)) {
            if (i10 == 8) {
                if (this.f23581o) {
                    textView = (TextView) m23996n(R$id.mBtnPip);
                } else if (this.f23580n) {
                    textView = (TextView) m23996n(R$id.mBtnHD);
                } else {
                    textView = (TextView) m23996n(R$id.mBtnPre);
                }
                if (textView != null) {
                    textView.setSelected(false);
                    textView.setFocusable(false);
                }
                m23981p();
                return;
            }
            ((TextView) m23996n(R$id.mMenuInfo)).requestFocus();
            if (this.f23581o) {
                ((TextView) m23996n(R$id.mBtnPip)).post(new Runnable() { // from class: o8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC5929g.m23957A(ViewOnClickListenerC5929g.this);
                    }
                });
            }
        }
    }

    public final void setLiveHandle(C5498s1.b bVar) {
        AbstractC5868k.m23674f(bVar, "liveHandler");
        this.f23582p = bVar;
    }

    public final void setLockStatus(boolean z10) {
        int i10 = 0;
        ImageView imageView = (ImageView) m23996n(R$id.mInfoLock);
        if (imageView != null) {
            if (z10) {
                i10 = R$drawable.ic_channel_lock;
            } else {
                i10 = 0;
            }
            imageView.setImageResource(i10);
        }
        ((TextView) m23996n(R$id.mBtnLock)).setSelected(false);
    }

    public final void setOnBottomMenuListener(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f23574h = aVar;
    }

    public final void setupBottomMenuIcon(ArrayList<Drawable> arrayList) {
        AbstractC5868k.m23674f(arrayList, "menuIcons");
        ((TextView) m23996n(R$id.mMenuInfo)).setCompoundDrawables(arrayList.get(0), null, null, null);
        ((TextView) m23996n(R$id.mTvFuncSelect)).setCompoundDrawables(arrayList.get(1), null, null, null);
        ((TextView) m23996n(R$id.mBtnPip)).setCompoundDrawables(null, arrayList.get(2), null, null);
        ((TextView) m23996n(R$id.mBtnHD)).setCompoundDrawables(null, arrayList.get(3), null, null);
        ((TextView) m23996n(R$id.mBtnPre)).setCompoundDrawables(null, arrayList.get(4), null, null);
        ((TextView) m23996n(R$id.mBtnRatio)).setCompoundDrawables(null, arrayList.get(5), null, null);
        ((TextView) m23996n(R$id.mBtnFav)).setCompoundDrawables(null, arrayList.get(6), null, null);
        ((TextView) m23996n(R$id.mBtnSwitchPlayer)).setCompoundDrawables(null, arrayList.get(7), null, null);
        ((TextView) m23996n(R$id.mBtnLock)).setCompoundDrawables(null, arrayList.get(8), null, null);
        ((TextView) m23996n(R$id.mBtnFeedBack)).setCompoundDrawables(null, arrayList.get(9), null, null);
    }

    /* renamed from: y */
    public boolean m23997y(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 != 21 && i10 != 22) {
            return false;
        }
        return m23959D();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC5929g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f23585s = new LinkedHashMap();
        this.f23567a = ViewOnClickListenerC5929g.class.getSimpleName();
        this.f23568b = "";
        this.f23569c = "";
        this.f23570d = "";
        this.f23571e = "";
        this.f23572f = "HD";
        this.f23573g = new ArrayList();
        this.f23575i = new C7554b();
        this.f23580n = true;
        C4842a c4842a = C4842a.f20329a;
        this.f23583q = !c4842a.m19920a().m19932I();
        LayoutInflater.from(context).inflate(R$layout.layout_live_infobar, (ViewGroup) this, true);
        setBackgroundColor(getResources().getColor(R$color.color_e60c0d0f));
        setClipChildren(false);
        m23990z();
        this.f23580n = c4842a.m19920a().mo19944U();
        this.f23581o = c4842a.m19920a().m19941R() && this.f23583q;
        ((TextView) m23996n(R$id.mBtnHD)).setVisibility(this.f23580n ? 0 : 8);
        ((TextView) m23996n(R$id.mBtnPip)).setVisibility(this.f23581o ? 0 : 8);
        ((TextView) m23996n(R$id.mQualityText)).setVisibility(c4842a.m19920a().m19926C() ? 0 : 4);
        m23964J();
    }
}
