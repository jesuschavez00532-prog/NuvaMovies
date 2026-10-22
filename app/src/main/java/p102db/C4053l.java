package p102db;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p153h2.AbstractC4509b;
import p400xa.C7577i1;
import p419yd.C7706a;
import p433zd.AbstractC7786b;

/* renamed from: db.l */
/* loaded from: classes2.dex */
public final class C4053l extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: P0 */
    public static final a f17879P0 = new a(null);

    /* renamed from: Q0 */
    private static boolean f17880Q0;

    /* renamed from: D0 */
    private View f17882D0;

    /* renamed from: E0 */
    private View f17883E0;

    /* renamed from: F0 */
    private View f17884F0;

    /* renamed from: G0 */
    private int f17885G0;

    /* renamed from: K0 */
    private InterfaceC5642a f17889K0;

    /* renamed from: O0 */
    public Map f17893O0 = new LinkedHashMap();

    /* renamed from: C0 */
    private final String f17881C0 = C4053l.class.getSimpleName();

    /* renamed from: H0 */
    private b f17886H0 = b.BOTTOM_RIGHT;

    /* renamed from: I0 */
    private final int[] f17887I0 = new int[2];

    /* renamed from: J0 */
    private final int[] f17888J0 = new int[2];

    /* renamed from: L0 */
    private String f17890L0 = "";

    /* renamed from: M0 */
    private String f17891M0 = "";

    /* renamed from: N0 */
    private final Html.ImageGetter f17892N0 = new Html.ImageGetter() { // from class: db.g
        @Override // android.text.Html.ImageGetter
        public final Drawable getDrawable(String str) {
            Drawable m17060X9;
            m17060X9 = C4053l.m17060X9(C4053l.this, str);
            return m17060X9;
        }
    };

    /* renamed from: db.l$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final boolean m17070a() {
            return C4053l.f17880Q0;
        }

        /* renamed from: b */
        public final boolean m17071b(c cVar) {
            AbstractC5868k.m23674f(cVar, "guideType");
            return ((Boolean) C7577i1.f27838b.m29084c().m29074f(cVar.toString(), Boolean.FALSE)).booleanValue();
        }

        /* renamed from: c */
        public final void m17072c(boolean z10) {
            C4053l.f17880Q0 = z10;
        }

        /* renamed from: d */
        public final void m17073d(c cVar, boolean z10) {
            AbstractC5868k.m23674f(cVar, "guideType");
            C7577i1.f27838b.m29084c().m29076h(cVar.toString(), Boolean.valueOf(z10));
        }
    }

    /* renamed from: db.l$b */
    /* loaded from: classes2.dex */
    public enum b {
        LEFT,
        RIGHT,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    /* renamed from: db.l$c */
    /* loaded from: classes2.dex */
    public enum c {
        Subscribe,
        BackIcon,
        EpgRight,
        LiveMenu,
        VodInfoBar,
        VodInfoBarPlayer,
        BackInfoBar,
        AccountSecurity,
        InputPassword,
        PopMenu,
        VodThumbnail,
        PersonalSubtitle,
        VodDetailSubtitle,
        VodPlaySubtitle,
        VodPlayQuality,
        VodDetailQuality,
        VodDownload,
        PersonalCrSwitch,
        LiveSearch,
        GlobalSearch
    }

    /* renamed from: db.l$d */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17922a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f17922a = iArr;
        }
    }

    /* renamed from: O9 */
    private final void m17051O9() {
        Button button;
        TextView textView;
        boolean z10;
        ImageView imageView = null;
        if (this.f17885G0 > 0) {
            this.f17884F0 = View.inflate(m3096J6(), this.f17885G0, null);
        }
        View view = this.f17884F0;
        if (view != null) {
            if (view != null) {
                button = (Button) view.findViewWithTag("mButton");
            } else {
                button = null;
            }
            View view2 = this.f17884F0;
            if (view2 != null) {
                textView = (TextView) view2.findViewWithTag("mTextContent");
            } else {
                textView = null;
            }
            boolean z11 = true;
            if (this.f17891M0.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && button != null) {
                button.setText(this.f17891M0);
            }
            if (this.f17890L0.length() <= 0) {
                z11 = false;
            }
            if (z11 && textView != null) {
                textView.setText(this.f17890L0);
            }
            ((AutoRelativeLayout) m17062L9(R$id.mLayoutRoot)).setOnClickListener(new View.OnClickListener() { // from class: db.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C4053l.m17052P9(C4053l.this, view3);
                }
            });
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: db.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C4053l.m17053Q9(C4053l.this, view3);
                    }
                });
            }
            if (textView != null) {
                textView.setText(Html.fromHtml(String.valueOf(textView.getText()), this.f17892N0, null));
            }
            View view3 = this.f17884F0;
            if (view3 != null) {
                imageView = (ImageView) view3.findViewWithTag("mThumbnailArrow");
            }
            if (imageView != null) {
                m17058V9(imageView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P9 */
    public static final void m17052P9(C4053l c4053l, View view) {
        AbstractC5868k.m23674f(c4053l, "this$0");
        c4053l.mo3279p9();
        InterfaceC5642a interfaceC5642a = c4053l.f17889K0;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q9 */
    public static final void m17053Q9(C4053l c4053l, View view) {
        AbstractC5868k.m23674f(c4053l, "this$0");
        c4053l.mo3279p9();
        InterfaceC5642a interfaceC5642a = c4053l.f17889K0;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
    }

    /* renamed from: R9 */
    private final void m17054R9() {
        m17051O9();
        View view = this.f17884F0;
        if (view != null) {
            ((AutoRelativeLayout) m17062L9(R$id.mLayoutRoot)).addView(view);
            int m29780g = C7706a.m29774d().m29780g();
            View.MeasureSpec.makeMeasureSpec(m29780g, Integer.MIN_VALUE);
            view.measure(m29780g / 2, -1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            switch (d.f17922a[this.f17886H0.ordinal()]) {
                case 1:
                    int measuredHeight = (this.f17887I0[1] - view.getMeasuredHeight()) - AbstractC7786b.m30163g(43);
                    int[] iArr = this.f17888J0;
                    layoutParams.topMargin = measuredHeight + iArr[1];
                    layoutParams.rightMargin = iArr[0];
                    layoutParams.addRule(7, ((ImageView) m17062L9(R$id.mImgTarget)).getId());
                    break;
                case 2:
                    int measuredHeight2 = (this.f17887I0[1] - view.getMeasuredHeight()) - AbstractC7786b.m30163g(43);
                    int[] iArr2 = this.f17888J0;
                    layoutParams.topMargin = measuredHeight2 + iArr2[1];
                    layoutParams.leftMargin = iArr2[0];
                    layoutParams.addRule(5, ((ImageView) m17062L9(R$id.mImgTarget)).getId());
                    break;
                case 3:
                    int i10 = R$id.mImgTarget;
                    layoutParams.addRule(3, i10);
                    layoutParams.addRule(7, ((ImageView) m17062L9(i10)).getId());
                    int m30163g = AbstractC7786b.m30163g(43);
                    int[] iArr3 = this.f17888J0;
                    layoutParams.topMargin = m30163g + iArr3[1];
                    layoutParams.rightMargin = iArr3[0];
                    break;
                case 4:
                    int i11 = R$id.mImgTarget;
                    layoutParams.addRule(3, i11);
                    layoutParams.addRule(5, ((ImageView) m17062L9(i11)).getId());
                    int m30163g2 = AbstractC7786b.m30163g(43);
                    int[] iArr4 = this.f17888J0;
                    layoutParams.topMargin = m30163g2 + iArr4[1];
                    layoutParams.leftMargin = iArr4[0];
                    break;
                case 5:
                    layoutParams.topMargin = this.f17887I0[1] - AbstractC7786b.m30163g(43);
                    layoutParams.leftMargin = ((this.f17887I0[0] - view.getMeasuredWidth()) - AbstractC7786b.m30163g(43)) + this.f17888J0[1];
                    break;
                case 6:
                    layoutParams.addRule(0, ((ImageView) m17062L9(R$id.mImgTarget)).getId());
                    layoutParams.leftMargin = AbstractC7786b.m30163g(43) + this.f17888J0[1];
                    break;
            }
            view.setLayoutParams(layoutParams);
            AbstractC4509b.m18869b(this.f17881C0, "addCustomView width: " + view.getMeasuredWidth() + ", height: " + view.getMeasuredHeight(), new Object[0]);
        }
    }

    /* renamed from: S9 */
    private final void m17055S9() {
        m17057U9();
        m17054R9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: db.h
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    boolean m17056T9;
                    m17056T9 = C4053l.m17056T9(C4053l.this, dialogInterface, i10, keyEvent);
                    return m17056T9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T9 */
    public static final boolean m17056T9(C4053l c4053l, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c4053l, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 4) {
            c4053l.mo3279p9();
            InterfaceC5642a interfaceC5642a = c4053l.f17889K0;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U9 */
    private final void m17057U9() {
        View view = this.f17883E0;
        if (view != null) {
            view.getLocationOnScreen(this.f17887I0);
            View view2 = this.f17883E0;
            if (view2 != null) {
                view2.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            int i10 = R$id.mImgTarget;
            ((ImageView) m17062L9(i10)).setImageBitmap(drawingCache);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(view.getWidth(), view.getHeight());
            int[] iArr = this.f17887I0;
            layoutParams.leftMargin = iArr[0];
            layoutParams.topMargin = iArr[1];
            ((ImageView) m17062L9(i10)).setLayoutParams(layoutParams);
            AbstractC4509b.m18869b(this.f17881C0, "width: " + layoutParams.width + ", height: " + layoutParams.height + ", left: " + layoutParams.leftMargin + ", top: " + layoutParams.topMargin, new Object[0]);
        }
    }

    /* renamed from: V9 */
    private final void m17058V9(ImageView imageView) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, AbstractC7786b.m30163g(70));
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.start();
        imageView.setOnKeyListener(new View.OnKeyListener() { // from class: db.k
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean m17059W9;
                m17059W9 = C4053l.m17059W9(ofFloat, this, view, i10, keyEvent);
                return m17059W9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W9 */
    public static final boolean m17059W9(ObjectAnimator objectAnimator, C4053l c4053l, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c4053l, "this$0");
        if (keyEvent.getAction() == 0) {
            if (i10 != 4 && i10 != 66) {
                switch (i10) {
                }
            }
            objectAnimator.cancel();
            c4053l.mo3279p9();
            InterfaceC5642a interfaceC5642a = c4053l.f17889K0;
            if (interfaceC5642a != null) {
                interfaceC5642a.invoke();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public static final Drawable m17060X9(C4053l c4053l, String str) {
        String str2;
        AbstractC5868k.m23674f(c4053l, "this$0");
        Context m3096J6 = c4053l.m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        Resources resources = m3096J6.getResources();
        Context m3096J62 = c4053l.m3096J6();
        if (m3096J62 != null) {
            str2 = m3096J62.getPackageName();
        } else {
            str2 = null;
        }
        int identifier = resources.getIdentifier(str, "mipmap", str2);
        Context m3096J63 = c4053l.m3096J6();
        AbstractC5868k.m23671c(m3096J63);
        Drawable drawable = m3096J63.getResources().getDrawable(identifier);
        drawable.setBounds(0, 0, AbstractC7786b.m30166j(64), AbstractC7786b.m30163g(36));
        return drawable;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: E9 */
    public void mo3277E9(AbstractC0729o abstractC0729o, String str) {
        AbstractC5868k.m23674f(abstractC0729o, "manager");
        super.mo3277E9(abstractC0729o, str);
        f17880Q0 = true;
    }

    /* renamed from: K9 */
    public void m17061K9() {
        this.f17893O0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public View m17062L9(int i10) {
        View findViewById;
        Map map = this.f17893O0;
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

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_guide_base, viewGroup, false);
        this.f17882D0 = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        m17061K9();
    }

    /* renamed from: Y9 */
    public final void m17063Y9(String str) {
        AbstractC5868k.m23674f(str, "text");
        this.f17891M0 = str;
    }

    /* renamed from: Z9 */
    public final void m17064Z9(String str) {
        AbstractC5868k.m23674f(str, "text");
        this.f17890L0 = str;
    }

    /* renamed from: aa */
    public final void m17065aa(int i10) {
        this.f17885G0 = i10;
    }

    /* renamed from: ba */
    public final void m17066ba(int i10, int i11) {
        int[] iArr = this.f17888J0;
        iArr[0] = i10;
        iArr[1] = i11;
    }

    /* renamed from: ca */
    public final void m17067ca(b bVar) {
        AbstractC5868k.m23674f(bVar, "direction");
        this.f17886H0 = bVar;
    }

    /* renamed from: da */
    public final void m17068da(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "listener");
        this.f17889K0 = interfaceC5642a;
    }

    /* renamed from: ea */
    public final void m17069ea(View view) {
        AbstractC5868k.m23674f(view, "view");
        this.f17883E0 = view;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m17055S9();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        InterfaceC5642a interfaceC5642a = this.f17889K0;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
        f17880Q0 = false;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        f17880Q0 = false;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: p9 */
    public void mo3279p9() {
        super.mo3279p9();
        f17880Q0 = false;
    }
}
