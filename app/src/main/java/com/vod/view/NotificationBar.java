package com.vod.view;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.net.NetworkInfo;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.C1328x;
import cc.C1464l0;
import cc.C1466m0;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
import com.vod.view.NotificationBar;
import com.widget.custom.CustomLinearLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p104dd.AbstractC4096d;
import p170i2.C4842a;
import p193ja.C5044a;
import p193ja.InterfaceC5045b;
import p198k.C5076a;
import p201k2.AbstractC5094k;
import p258o3.C5911g;
import p348u2.AbstractC7030g;
import p400xa.RunnableC7583k1;
import ua.C7069a;
import ua.C7070b;

/* loaded from: classes3.dex */
public final class NotificationBar extends CustomLinearLayout implements C7069a.a, InterfaceC5045b {

    /* renamed from: a */
    private final SimpleDateFormat f17444a;

    /* renamed from: b */
    private final SimpleDateFormat f17445b;

    /* renamed from: c */
    private C7069a f17446c;

    /* renamed from: d */
    private C7070b f17447d;

    /* renamed from: e */
    private InterfaceC5660l f17448e;

    /* renamed from: f */
    private InterfaceC5660l f17449f;

    /* renamed from: g */
    private boolean f17450g;

    /* renamed from: h */
    private Boolean f17451h;

    /* renamed from: i */
    private String f17452i;

    /* renamed from: j */
    public Map f17453j = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.view.NotificationBar$a */
    /* loaded from: classes3.dex */
    public static final class C3873a extends AbstractC5869l implements InterfaceC5664p {
        C3873a() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            r10 = r11.getProductName();
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m16603a(boolean r10, android.hardware.usb.UsbDevice r11) {
            /*
                r9 = this;
                r0 = 0
                if (r11 == 0) goto L8
                int r1 = r11.getInterfaceCount()
                goto L9
            L8:
                r1 = 0
            L9:
                if (r1 <= 0) goto L8d
                if (r11 == 0) goto L18
                android.hardware.usb.UsbInterface r1 = r11.getInterface(r0)
                if (r1 == 0) goto L18
                int r1 = r1.getInterfaceClass()
                goto L19
            L18:
                r1 = -1
            L19:
                if (r10 == 0) goto L1e
                java.lang.String r2 = "start"
                goto L20
            L1e:
                java.lang.String r2 = "stop"
            L20:
                r3 = 3
                if (r1 == r3) goto L55
                r11 = 8
                if (r1 == r11) goto L28
                goto L8d
            L28:
                java.lang.String r1 = "disk"
                p104dd.AbstractC4096d.m17152b(r1, r2)
                if (r10 == 0) goto L47
                xa.w r3 = p400xa.C7615w.f27995a
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 7
                r8 = 0
                p400xa.C7615w.m29301w(r3, r4, r5, r6, r7, r8)
                com.vod.view.NotificationBar r10 = com.vod.view.NotificationBar.this
                int r11 = com.vod.R$id.mLayoutDownload
                android.view.View r10 = r10.m16597h(r11)
                android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
                r10.setVisibility(r0)
                goto L8d
            L47:
                com.vod.view.NotificationBar r10 = com.vod.view.NotificationBar.this
                int r0 = com.vod.R$id.mLayoutDownload
                android.view.View r10 = r10.m16597h(r0)
                android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
                r10.setVisibility(r11)
                goto L8d
            L55:
                int r10 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                java.lang.String r3 = "mouse"
                java.lang.String r4 = "keyboard"
                r5 = 1
                if (r10 < r1) goto L7b
                if (r11 == 0) goto L71
                java.lang.String r10 = p387wd.AbstractC7432t.m28545a(r11)
                if (r10 == 0) goto L71
                java.lang.String r11 = "Mouse"
                boolean r10 = p359ue.AbstractC7157k.m27711t(r10, r11, r5)
                if (r10 != r5) goto L71
                r0 = 1
            L71:
                if (r0 == 0) goto L77
                p104dd.AbstractC4096d.m17152b(r3, r2)
                goto L8d
            L77:
                p104dd.AbstractC4096d.m17152b(r4, r2)
                goto L8d
            L7b:
                if (r11 == 0) goto L84
                int r10 = r11.getInterfaceCount()
                if (r10 != r5) goto L84
                r0 = 1
            L84:
                if (r0 == 0) goto L8a
                p104dd.AbstractC4096d.m17152b(r3, r2)
                goto L8d
            L8a:
                p104dd.AbstractC4096d.m17152b(r4, r2)
            L8d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vod.view.NotificationBar.C3873a.m16603a(boolean, android.hardware.usb.UsbDevice):void");
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m16603a(((Boolean) obj).booleanValue(), (UsbDevice) obj2);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.view.NotificationBar$b */
    /* loaded from: classes3.dex */
    public static final class C3874b implements CustomLinearLayout.OnItemFocusChangeListener {
        C3874b() {
        }

        @Override // com.widget.custom.CustomLinearLayout.OnItemFocusChangeListener
        public void onItemFocusChange(View view, boolean z10) {
            NotificationBar.this.m16582q(view, z10);
        }

        @Override // com.widget.custom.CustomLinearLayout.OnItemFocusChangeListener
        public void onLayoutFocusChange(View view, boolean z10) {
            NotificationBar.this.m16582q(view, z10);
        }
    }

    public NotificationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Locale locale = Locale.US;
        this.f17444a = new SimpleDateFormat("hh:mm aaa", locale);
        this.f17445b = new SimpleDateFormat("HH:mm", locale);
        this.f17452i = "";
        new C5076a(getContext()).m20545a(R$layout.layout_notification_bar, this, new C5076a.e() { // from class: wd.m
            @Override // p198k.C5076a.e
            /* renamed from: a */
            public final void mo11400a(View view, int i10, ViewGroup viewGroup) {
                NotificationBar.m16577i(NotificationBar.this, view, i10, viewGroup);
            }
        });
    }

    /* renamed from: B */
    private final void m16568B() {
        if (this.f17446c != null) {
            try {
                getContext().unregisterReceiver(this.f17446c);
            } catch (IllegalArgumentException unused) {
                this.f17446c = null;
            }
        }
    }

    /* renamed from: C */
    private final void m16569C() {
        C7070b c7070b = this.f17447d;
        if (c7070b != null) {
            getContext().unregisterReceiver(c7070b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m16577i(NotificationBar notificationBar, View view, int i10, ViewGroup viewGroup) {
        AbstractC5868k.m23674f(notificationBar, "this$0");
        AbstractC5868k.m23674f(view, "view");
        ViewGroup viewGroup2 = (ViewGroup) view;
        int childCount = viewGroup2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup2.getChildAt(0);
            viewGroup2.removeViewAt(0);
            notificationBar.addView(childAt);
        }
        notificationBar.m16585u();
        notificationBar.f17450g = true;
        Boolean bool = notificationBar.f17451h;
        if (bool != null) {
            notificationBar.m16598k(bool.booleanValue());
        }
        notificationBar.m16594F();
    }

    /* renamed from: l */
    private final String m16579l(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && str.length() >= 10) {
            return C1464l0.f5622a.m6826e(str, "dd/MM/yyyy");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m16580o(NotificationBar notificationBar) {
        AbstractC5868k.m23674f(notificationBar, "this$0");
        ((LinearLayout) notificationBar.m16597h(R$id.mLlSearch)).setVisibility(0);
        ((LinearLayout) notificationBar.m16597h(R$id.mLlFilter)).setVisibility(0);
        InterfaceC5660l interfaceC5660l = notificationBar.f17449f;
        if (interfaceC5660l != null) {
            LinearLayout linearLayout = (LinearLayout) notificationBar.m16597h(R$id.mSearchAndFilter);
            AbstractC5868k.m23673e(linearLayout, "mSearchAndFilter");
            interfaceC5660l.mo542f(linearLayout);
        }
    }

    /* renamed from: p */
    private final void m16581p(View view) {
        Integer num;
        InterfaceC5660l interfaceC5660l;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mIvSearch;
        if (num != null && num.intValue() == i10) {
            InterfaceC5660l interfaceC5660l2 = this.f17448e;
            if (interfaceC5660l2 != null) {
                interfaceC5660l2.mo542f(0);
                return;
            }
            return;
        }
        int i11 = R$id.mIvPersonal;
        if (num != null && num.intValue() == i11) {
            InterfaceC5660l interfaceC5660l3 = this.f17448e;
            if (interfaceC5660l3 != null) {
                interfaceC5660l3.mo542f(1);
                return;
            }
            return;
        }
        int i12 = R$id.mImgRecords;
        if (num != null && num.intValue() == i12) {
            InterfaceC5660l interfaceC5660l4 = this.f17448e;
            if (interfaceC5660l4 != null) {
                interfaceC5660l4.mo542f(2);
                return;
            }
            return;
        }
        int i13 = R$id.mImgMessage;
        if (num != null && num.intValue() == i13) {
            InterfaceC5660l interfaceC5660l5 = this.f17448e;
            if (interfaceC5660l5 != null) {
                interfaceC5660l5.mo542f(3);
                return;
            }
            return;
        }
        int i14 = R$id.mTvMembership;
        if (num != null && num.intValue() == i14) {
            InterfaceC5660l interfaceC5660l6 = this.f17448e;
            if (interfaceC5660l6 != null) {
                interfaceC5660l6.mo542f(4);
                return;
            }
            return;
        }
        int i15 = R$id.mIvDownload;
        if (num != null && num.intValue() == i15) {
            InterfaceC5660l interfaceC5660l7 = this.f17448e;
            if (interfaceC5660l7 != null) {
                interfaceC5660l7.mo542f(5);
                return;
            }
            return;
        }
        int i16 = R$id.mIvFilter;
        if (num != null && num.intValue() == i16 && (interfaceC5660l = this.f17448e) != null) {
            interfaceC5660l.mo542f(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m16582q(View view, boolean z10) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mIvSearch;
        int i11 = 0;
        if (num != null && num.intValue() == i10) {
            int i12 = R$id.mTvSearch;
            TextView textView = (TextView) m16597h(i12);
            if (!z10) {
                i11 = 8;
            }
            textView.setVisibility(i11);
            ((TextView) m16597h(i12)).setSelected(z10);
            return;
        }
        int i13 = R$id.mImgRecords;
        if (num != null && num.intValue() == i13) {
            int i14 = R$id.mTextRecords;
            TextView textView2 = (TextView) m16597h(i14);
            if (!z10) {
                i11 = 8;
            }
            textView2.setVisibility(i11);
            ((TextView) m16597h(i14)).setSelected(z10);
            return;
        }
        int i15 = R$id.mImgMessage;
        if (num != null && num.intValue() == i15) {
            int i16 = R$id.mTextMessage;
            TextView textView3 = (TextView) m16597h(i16);
            if (!z10) {
                i11 = 8;
            }
            textView3.setVisibility(i11);
            ((TextView) m16597h(i16)).setSelected(z10);
            return;
        }
        int i17 = R$id.mIvDownload;
        if (num != null && num.intValue() == i17) {
            int i18 = R$id.mTvDownload;
            TextView textView4 = (TextView) m16597h(i18);
            if (!z10) {
                i11 = 8;
            }
            textView4.setVisibility(i11);
            ((TextView) m16597h(i18)).setSelected(z10);
            return;
        }
        int i19 = R$id.mIvPersonal;
        if (num != null && num.intValue() == i19) {
            int i20 = R$id.mTvPersonal;
            TextView textView5 = (TextView) m16597h(i20);
            if (!z10) {
                i11 = 8;
            }
            textView5.setVisibility(i11);
            ((TextView) m16597h(i20)).setSelected(z10);
            return;
        }
        int i21 = R$id.mIvFilter;
        if (num != null && num.intValue() == i21) {
            int i22 = R$id.mTvFilter;
            TextView textView6 = (TextView) m16597h(i22);
            if (!z10) {
                i11 = 8;
            }
            textView6.setVisibility(i11);
            ((TextView) m16597h(i22)).setSelected(z10);
        }
    }

    /* renamed from: r */
    private final void m16583r() {
        if (this.f17446c == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C7069a c7069a = new C7069a();
            this.f17446c = c7069a;
            c7069a.m27233a(this);
            getContext().registerReceiver(this.f17446c, intentFilter);
        }
    }

    /* renamed from: s */
    private final void m16584s() {
        if (this.f17447d == null) {
            this.f17447d = new C7070b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            C7070b c7070b = this.f17447d;
            if (c7070b != null) {
                c7070b.m27234a(new C3873a());
            }
            getContext().registerReceiver(this.f17447d, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(NotificationBar notificationBar) {
        AbstractC5868k.m23674f(notificationBar, "this$0");
        notificationBar.m16583r();
        if (C4842a.f20329a.m19920a().m19953b0()) {
            notificationBar.m16584s();
        }
    }

    /* renamed from: u */
    private final void m16585u() {
        C4842a c4842a = C4842a.f20329a;
        int i10 = 8;
        if (!c4842a.m19920a().m19953b0()) {
            ((LinearLayout) m16597h(R$id.mLayoutDownload)).setVisibility(8);
        }
        AbstractC7030g.m27129c("registerReceiver", new Runnable() { // from class: wd.o
            @Override // java.lang.Runnable
            public final void run() {
                NotificationBar.setListener$lambda$2(NotificationBar.this);
            }
        }, false);
        setViewDirection(-2);
        int i11 = R$id.mIvSearch;
        int i12 = R$id.mImgMessage;
        int i13 = R$id.mTvMembership;
        setChildView((ImageView) m16597h(i11), (ImageView) m16597h(R$id.mIvFilter), (ImageView) m16597h(i12), (ImageView) m16597h(R$id.mImgRecords), (TextView) m16597h(i13), (ImageView) m16597h(R$id.mIvDownload), (ImageView) m16597h(R$id.mIvPersonal));
        setOnItemFocusChangeListener(new C3874b());
        setOnItemClickListener(new CustomLinearLayout.OnItemClickListener() { // from class: wd.p
            @Override // com.widget.custom.CustomLinearLayout.OnItemClickListener
            public final void onItemClick(View view) {
                NotificationBar.m16586v(NotificationBar.this, view);
            }
        });
        ((TextView) m16597h(i13)).setOnKeyListener(new View.OnKeyListener() { // from class: wd.q
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i14, KeyEvent keyEvent) {
                boolean m16587w;
                m16587w = NotificationBar.m16587w(view, i14, keyEvent);
                return m16587w;
            }
        });
        ((ImageView) m16597h(i11)).setOnKeyListener(new View.OnKeyListener() { // from class: wd.r
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i14, KeyEvent keyEvent) {
                boolean m16588x;
                m16588x = NotificationBar.m16588x(NotificationBar.this, view, i14, keyEvent);
                return m16588x;
            }
        });
        ((ImageView) m16597h(i12)).setOnKeyListener(new View.OnKeyListener() { // from class: wd.s
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i14, KeyEvent keyEvent) {
                boolean m16589y;
                m16589y = NotificationBar.m16589y(view, i14, keyEvent);
                return m16589y;
            }
        });
        m16591A();
        C5044a.f20862a.m20491g(this);
        if (c4842a.m19920a().m19953b0()) {
            LinearLayout linearLayout = (LinearLayout) m16597h(R$id.mLayoutDownload);
            if (C5911g.f23514h.m23905a().m23900q()) {
                i10 = 0;
            }
            linearLayout.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m16586v(NotificationBar notificationBar, View view) {
        AbstractC5868k.m23674f(notificationBar, "this$0");
        notificationBar.m16581p(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final boolean m16587w(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 21) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m16588x(NotificationBar notificationBar, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(notificationBar, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 21 && ((TextView) notificationBar.m16597h(R$id.mTvMembership)).getVisibility() == 8) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final boolean m16589y(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 22) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private final void m16590z() {
        if (AbstractC5094k.m20686c(getContext()) && !AbstractC5094k.m20684a(getContext())) {
            ((ImageView) m16597h(R$id.mImgWifi)).setVisibility(0);
            ((ImageView) m16597h(R$id.mImgEthernet)).setVisibility(8);
            if (AbstractC5868k.m23669a(this.f17452i, "wired")) {
                AbstractC4096d.m17154d("wired", "stop");
            }
            AbstractC4096d.m17154d("wlan", "start");
            this.f17452i = "wlan";
            return;
        }
        if (!AbstractC5094k.m20686c(getContext()) && AbstractC5094k.m20684a(getContext())) {
            ((ImageView) m16597h(R$id.mImgWifi)).setVisibility(8);
            ((ImageView) m16597h(R$id.mImgEthernet)).setVisibility(0);
            if (AbstractC5868k.m23669a(this.f17452i, "wlan")) {
                AbstractC4096d.m17154d("wlan", "stop");
            }
            AbstractC4096d.m17154d("wired", "start");
            this.f17452i = "wired";
            return;
        }
        if (!AbstractC5094k.m20686c(getContext()) && !AbstractC5094k.m20684a(getContext())) {
            ((ImageView) m16597h(R$id.mImgWifi)).setVisibility(0);
            ((ImageView) m16597h(R$id.mImgEthernet)).setVisibility(0);
            if (AbstractC5868k.m23669a(this.f17452i, "wired")) {
                AbstractC4096d.m17154d("wired", "stop");
            } else if (AbstractC5868k.m23669a(this.f17452i, "wlan")) {
                AbstractC4096d.m17154d("wlan", "stop");
            }
        }
    }

    /* renamed from: A */
    public final void m16591A() {
        int i10 = R$id.mTextTime;
        if (((TextView) m16597h(i10)) != null) {
            if (DateFormat.is24HourFormat(getContext())) {
                ((TextView) m16597h(i10)).setText(this.f17445b.format(new Date()));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f17444a.format(new Date()));
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(AutoSizeUtils.dp2px(getContext(), 16.0f)), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 33);
                ((TextView) m16597h(i10)).setText(spannableStringBuilder);
            }
        }
    }

    /* renamed from: D */
    public final void m16592D() {
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6838K()) {
            if (c1466m0.m6832E()) {
                ((ImageView) m16597h(R$id.mIvCouponFlag)).setVisibility(0);
                return;
            } else {
                ((ImageView) m16597h(R$id.mIvCouponFlag)).setVisibility(8);
                return;
            }
        }
        ((ImageView) m16597h(R$id.mIvCouponFlag)).setVisibility(8);
    }

    /* renamed from: E */
    public final void m16593E() {
        ((LinearLayout) m16597h(R$id.mLayoutDownload)).setVisibility(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r0.equals("4") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r0 = r6.m6891z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r7 = r0.getServiceType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r7 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r7 = p359ue.AbstractC7166t.m27728o("", "\n", " ", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r0 = r0.getInvalidTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r0 = m16579l(r0);
        r8 = com.vod.R$id.mTvMembership;
        r9 = (android.widget.TextView) m16597h(r8);
        r10 = ne.C5881x.f23415a;
        r10 = getContext();
        ne.AbstractC5868k.m23671c(r10);
        r10 = r10.getString(com.module.R$string.home_plan);
        ne.AbstractC5868k.m23673e(r10, "context!!.getString(com.module.R.string.home_plan)");
        r0 = java.lang.String.format(r10, java.util.Arrays.copyOf(new java.lang.Object[]{r7, r0}, 2));
        ne.AbstractC5868k.m23673e(r0, "format(format, *args)");
        r9.setText(r0);
        ((android.widget.TextView) m16597h(r8)).setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        ((android.widget.TextView) m16597h(com.vod.R$id.mTvMembership)).setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
    
        if (r0.equals("3") == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16594F() {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vod.view.NotificationBar.m16594F():void");
    }

    @Override // p193ja.InterfaceC5045b
    /* renamed from: Y0 */
    public void mo16595Y0() {
        C5044a.f20862a.m20493i(this);
        post(new Runnable() { // from class: wd.n
            @Override // java.lang.Runnable
            public final void run() {
                NotificationBar.m16580o(NotificationBar.this);
            }
        });
    }

    @Override // ua.C7069a.a
    /* renamed from: e5 */
    public void mo16596e5(int i10) {
        if (i10 != -200) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            ((ImageView) m16597h(R$id.mImgWifi)).setImageResource(R$mipmap.ic_wifi_level_0);
                            return;
                        } else {
                            ((ImageView) m16597h(R$id.mImgWifi)).setImageResource(R$mipmap.ic_wifi_level_4);
                            return;
                        }
                    }
                    ((ImageView) m16597h(R$id.mImgWifi)).setImageResource(R$mipmap.ic_wifi_level_3);
                    return;
                }
                ((ImageView) m16597h(R$id.mImgWifi)).setImageResource(R$mipmap.ic_wifi_level_2);
                return;
            }
            ((ImageView) m16597h(R$id.mImgWifi)).setImageResource(R$mipmap.ic_wifi_level_1);
            return;
        }
        ((ImageView) m16597h(R$id.mImgWifi)).setImageResource(R$mipmap.ic_wifi_level_0);
    }

    /* renamed from: h */
    public View m16597h(int i10) {
        Map map = this.f17453j;
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

    /* renamed from: k */
    public final void m16598k(boolean z10) {
        if (this.f17450g) {
            ((ImageView) m16597h(R$id.mIvSearch)).setFocusable(z10);
            ((ImageView) m16597h(R$id.mIvFilter)).setFocusable(z10);
            ((ImageView) m16597h(R$id.mIvPersonal)).setFocusable(z10);
            ((ImageView) m16597h(R$id.mIvDownload)).setFocusable(z10);
            ((ImageView) m16597h(R$id.mImgRecords)).setFocusable(z10);
            ((ImageView) m16597h(R$id.mImgMessage)).setFocusable(z10);
            ((TextView) m16597h(R$id.mTvMembership)).setFocusable(z10);
            return;
        }
        this.f17451h = Boolean.valueOf(z10);
    }

    /* renamed from: m */
    public final void m16599m() {
        if (!this.f17450g) {
            return;
        }
        int i10 = R$id.mTvMembership;
        if (((TextView) m16597h(i10)).getVisibility() == 0) {
            ((TextView) m16597h(i10)).requestFocus();
        } else {
            requestFocus();
        }
    }

    /* renamed from: n */
    public final void m16600n() {
        ((ImageView) m16597h(R$id.mImgMessage)).requestFocus();
    }

    @Override // ua.C7069a.a
    /* renamed from: o1 */
    public void mo16601o1(NetworkInfo networkInfo) {
        try {
            m16590z();
            if (networkInfo != null && networkInfo.isConnected()) {
                int i10 = R$id.mImgEthernet;
                ((ImageView) m16597h(i10)).setVisibility(0);
                ((ImageView) m16597h(i10)).setImageResource(R$mipmap.icon_net_work_on);
            } else {
                ((ImageView) m16597h(R$id.mImgEthernet)).setImageResource(R$mipmap.icon_net_work_off);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m16568B();
        m16569C();
    }

    public final void setMsgNumber(int i10) {
        TextView textView;
        if (i10 > 0) {
            int i11 = R$id.mTextMsgNumber;
            ((TextView) m16597h(i11)).setText(String.valueOf(i10));
            if (!((ImageView) m16597h(R$id.mImgMessage)).hasFocus() && (textView = (TextView) m16597h(i11)) != null) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        int i12 = R$id.mTextMsgNumber;
        TextView textView2 = (TextView) m16597h(i12);
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = (TextView) m16597h(i12);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    public final void setOnGuideCallback(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "callback");
        this.f17449f = interfaceC5660l;
    }

    public final void setOnIconClickListener(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        this.f17448e = interfaceC5660l;
    }

    public final void setTime(RunnableC7583k1.a aVar) {
        AbstractC5868k.m23674f(aVar, "timeInfo");
        int i10 = R$id.mTextTime;
        if (((TextView) m16597h(i10)) != null) {
            if (DateFormat.is24HourFormat(getContext())) {
                ((TextView) m16597h(i10)).setText(this.f17445b.format(new Date(aVar.m29101a())));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f17444a.format(new Date(aVar.m29101a())));
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(AutoSizeUtils.dp2px(getContext(), 16.0f)), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 33);
                ((TextView) m16597h(i10)).setText(spannableStringBuilder);
            }
        }
    }

    /* renamed from: t */
    public final void m16602t() {
        if (!this.f17450g) {
            return;
        }
        int i10 = R$id.mLlSearch;
        if (((LinearLayout) m16597h(i10)).getVisibility() == 0) {
            ((LinearLayout) m16597h(i10)).requestFocus();
        } else {
            requestFocus();
        }
    }
}
