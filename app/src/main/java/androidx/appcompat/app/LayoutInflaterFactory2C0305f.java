package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0323c;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.appcompat.view.menu.InterfaceC0331k;
import androidx.appcompat.widget.AbstractC0466x2;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0415l;
import androidx.appcompat.widget.C0438q2;
import androidx.appcompat.widget.C0462w2;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0413k1;
import androidx.appcompat.widget.InterfaceC0437q1;
import androidx.core.app.AbstractC0513j;
import androidx.core.content.AbstractC0547a;
import androidx.core.view.AbstractC0597l1;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0623s;
import androidx.core.view.AbstractC0627t;
import androidx.core.view.C0589j1;
import androidx.core.view.C0609o1;
import androidx.core.view.InterfaceC0588j0;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0752f;
import com.p077uc.crashsdk.export.LogType;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p106e.AbstractC4105b;
import p138g.AbstractC4318b;
import p138g.AbstractWindowCallbackC4329m;
import p138g.C4320d;
import p138g.C4322f;
import p138g.C4323g;
import p214l.C5311i;
import p254o.AbstractC5894i;
import p373w.AbstractC7338c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0305f extends AbstractC0304e implements C0325e.a, LayoutInflater.Factory2 {

    /* renamed from: n0 */
    private static final C5311i f1055n0 = new C5311i();

    /* renamed from: o0 */
    private static final boolean f1056o0;

    /* renamed from: p0 */
    private static final int[] f1057p0;

    /* renamed from: q0 */
    private static final boolean f1058q0;

    /* renamed from: r0 */
    private static final boolean f1059r0;

    /* renamed from: s0 */
    private static boolean f1060s0;

    /* renamed from: A */
    boolean f1061A;

    /* renamed from: B */
    boolean f1062B;

    /* renamed from: C */
    boolean f1063C;

    /* renamed from: D */
    boolean f1064D;

    /* renamed from: E */
    boolean f1065E;

    /* renamed from: F */
    private boolean f1066F;

    /* renamed from: G */
    private t[] f1067G;

    /* renamed from: H */
    private t f1068H;

    /* renamed from: I */
    private boolean f1069I;

    /* renamed from: J */
    private boolean f1070J;

    /* renamed from: K */
    private boolean f1071K;

    /* renamed from: L */
    private boolean f1072L;

    /* renamed from: M */
    boolean f1073M;

    /* renamed from: N */
    private int f1074N;

    /* renamed from: O */
    private int f1075O;

    /* renamed from: V */
    private boolean f1076V;

    /* renamed from: W */
    private boolean f1077W;

    /* renamed from: X */
    private p f1078X;

    /* renamed from: Y */
    private p f1079Y;

    /* renamed from: Z */
    boolean f1080Z;

    /* renamed from: d */
    final Object f1081d;

    /* renamed from: e */
    final Context f1082e;

    /* renamed from: f */
    Window f1083f;

    /* renamed from: g */
    private n f1084g;

    /* renamed from: g0 */
    int f1085g0;

    /* renamed from: h */
    final InterfaceC0303d f1086h;

    /* renamed from: h0 */
    private final Runnable f1087h0;

    /* renamed from: i */
    AbstractC0300a f1088i;

    /* renamed from: i0 */
    private boolean f1089i0;

    /* renamed from: j */
    MenuInflater f1090j;

    /* renamed from: j0 */
    private Rect f1091j0;

    /* renamed from: k */
    private CharSequence f1092k;

    /* renamed from: k0 */
    private Rect f1093k0;

    /* renamed from: l */
    private InterfaceC0413k1 f1094l;

    /* renamed from: l0 */
    private C0313n f1095l0;

    /* renamed from: m */
    private h f1096m;

    /* renamed from: m0 */
    private C0314o f1097m0;

    /* renamed from: n */
    private u f1098n;

    /* renamed from: o */
    AbstractC4318b f1099o;

    /* renamed from: p */
    ActionBarContextView f1100p;

    /* renamed from: q */
    PopupWindow f1101q;

    /* renamed from: r */
    Runnable f1102r;

    /* renamed from: s */
    C0589j1 f1103s;

    /* renamed from: t */
    private boolean f1104t;

    /* renamed from: u */
    private boolean f1105u;

    /* renamed from: v */
    ViewGroup f1106v;

    /* renamed from: w */
    private TextView f1107w;

    /* renamed from: x */
    private View f1108x;

    /* renamed from: y */
    private boolean f1109y;

    /* renamed from: z */
    private boolean f1110z;

    /* renamed from: androidx.appcompat.app.f$a */
    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1111a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1111a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m1157a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (!message.contains("drawable") && !message.contains("Drawable")) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (m1157a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f1111a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f1111a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.f$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f = LayoutInflaterFactory2C0305f.this;
            if ((layoutInflaterFactory2C0305f.f1085g0 & 1) != 0) {
                layoutInflaterFactory2C0305f.m1138U(0);
            }
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f2 = LayoutInflaterFactory2C0305f.this;
            if ((layoutInflaterFactory2C0305f2.f1085g0 & 4096) != 0) {
                layoutInflaterFactory2C0305f2.m1138U(108);
            }
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f3 = LayoutInflaterFactory2C0305f.this;
            layoutInflaterFactory2C0305f3.f1080Z = false;
            layoutInflaterFactory2C0305f3.f1085g0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC0588j0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0588j0
        public C0609o1 onApplyWindowInsets(View view, C0609o1 c0609o1) {
            int m2521k = c0609o1.m2521k();
            int m1132L0 = LayoutInflaterFactory2C0305f.this.m1132L0(c0609o1, null);
            if (m2521k != m1132L0) {
                c0609o1 = c0609o1.m2524o(c0609o1.m2519i(), m1132L0, c0609o1.m2520j(), c0609o1.m2518h());
            }
            return AbstractC0616q0.m2608Z(view, c0609o1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC0437q1.a {
        d() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0437q1.a
        /* renamed from: a */
        public void mo1158a(Rect rect) {
            rect.top = LayoutInflaterFactory2C0305f.this.m1132L0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$e */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.InterfaceC0345a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0345a
        /* renamed from: a */
        public void mo1159a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0345a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C0305f.this.m1136S();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        /* loaded from: classes.dex */
        class a extends AbstractC0597l1 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC0593k1
            /* renamed from: b */
            public void mo1160b(View view) {
                LayoutInflaterFactory2C0305f.this.f1100p.setAlpha(1.0f);
                LayoutInflaterFactory2C0305f.this.f1103s.m2488f(null);
                LayoutInflaterFactory2C0305f.this.f1103s = null;
            }

            @Override // androidx.core.view.AbstractC0597l1, androidx.core.view.InterfaceC0593k1
            /* renamed from: c */
            public void mo1161c(View view) {
                LayoutInflaterFactory2C0305f.this.f1100p.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f = LayoutInflaterFactory2C0305f.this;
            layoutInflaterFactory2C0305f.f1101q.showAtLocation(layoutInflaterFactory2C0305f.f1100p, 55, 0, 0);
            LayoutInflaterFactory2C0305f.this.m1139V();
            if (LayoutInflaterFactory2C0305f.this.m1126D0()) {
                LayoutInflaterFactory2C0305f.this.f1100p.setAlpha(0.0f);
                LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f2 = LayoutInflaterFactory2C0305f.this;
                layoutInflaterFactory2C0305f2.f1103s = AbstractC0616q0.m2615d(layoutInflaterFactory2C0305f2.f1100p).m2483a(1.0f);
                LayoutInflaterFactory2C0305f.this.f1103s.m2488f(new a());
                return;
            }
            LayoutInflaterFactory2C0305f.this.f1100p.setAlpha(1.0f);
            LayoutInflaterFactory2C0305f.this.f1100p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$g */
    /* loaded from: classes.dex */
    public class g extends AbstractC0597l1 {
        g() {
        }

        @Override // androidx.core.view.InterfaceC0593k1
        /* renamed from: b */
        public void mo1160b(View view) {
            LayoutInflaterFactory2C0305f.this.f1100p.setAlpha(1.0f);
            LayoutInflaterFactory2C0305f.this.f1103s.m2488f(null);
            LayoutInflaterFactory2C0305f.this.f1103s = null;
        }

        @Override // androidx.core.view.AbstractC0597l1, androidx.core.view.InterfaceC0593k1
        /* renamed from: c */
        public void mo1161c(View view) {
            LayoutInflaterFactory2C0305f.this.f1100p.setVisibility(0);
            LayoutInflaterFactory2C0305f.this.f1100p.sendAccessibilityEvent(32);
            if (LayoutInflaterFactory2C0305f.this.f1100p.getParent() instanceof View) {
                AbstractC0616q0.m2630k0((View) LayoutInflaterFactory2C0305f.this.f1100p.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$h */
    /* loaded from: classes.dex */
    public final class h implements InterfaceC0330j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
        /* renamed from: a */
        public void mo1162a(C0325e c0325e, boolean z10) {
            LayoutInflaterFactory2C0305f.this.m1131L(c0325e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
        /* renamed from: b */
        public boolean mo1163b(C0325e c0325e) {
            Window.Callback m1146f0 = LayoutInflaterFactory2C0305f.this.m1146f0();
            if (m1146f0 != null) {
                m1146f0.onMenuOpened(108, c0325e);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$i */
    /* loaded from: classes.dex */
    public class i implements AbstractC4318b.a {

        /* renamed from: a */
        private AbstractC4318b.a f1120a;

        /* renamed from: androidx.appcompat.app.f$i$a */
        /* loaded from: classes.dex */
        class a extends AbstractC0597l1 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC0593k1
            /* renamed from: b */
            public void mo1160b(View view) {
                LayoutInflaterFactory2C0305f.this.f1100p.setVisibility(8);
                LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f = LayoutInflaterFactory2C0305f.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0305f.f1101q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0305f.f1100p.getParent() instanceof View) {
                    AbstractC0616q0.m2630k0((View) LayoutInflaterFactory2C0305f.this.f1100p.getParent());
                }
                LayoutInflaterFactory2C0305f.this.f1100p.m1436k();
                LayoutInflaterFactory2C0305f.this.f1103s.m2488f(null);
                LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f2 = LayoutInflaterFactory2C0305f.this;
                layoutInflaterFactory2C0305f2.f1103s = null;
                AbstractC0616q0.m2630k0(layoutInflaterFactory2C0305f2.f1106v);
            }
        }

        public i(AbstractC4318b.a aVar) {
            this.f1120a = aVar;
        }

        @Override // p138g.AbstractC4318b.a
        /* renamed from: a */
        public boolean mo1164a(AbstractC4318b abstractC4318b, MenuItem menuItem) {
            return this.f1120a.mo1164a(abstractC4318b, menuItem);
        }

        @Override // p138g.AbstractC4318b.a
        /* renamed from: b */
        public void mo1165b(AbstractC4318b abstractC4318b) {
            this.f1120a.mo1165b(abstractC4318b);
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f = LayoutInflaterFactory2C0305f.this;
            if (layoutInflaterFactory2C0305f.f1101q != null) {
                layoutInflaterFactory2C0305f.f1083f.getDecorView().removeCallbacks(LayoutInflaterFactory2C0305f.this.f1102r);
            }
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f2 = LayoutInflaterFactory2C0305f.this;
            if (layoutInflaterFactory2C0305f2.f1100p != null) {
                layoutInflaterFactory2C0305f2.m1139V();
                LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f3 = LayoutInflaterFactory2C0305f.this;
                layoutInflaterFactory2C0305f3.f1103s = AbstractC0616q0.m2615d(layoutInflaterFactory2C0305f3.f1100p).m2483a(0.0f);
                LayoutInflaterFactory2C0305f.this.f1103s.m2488f(new a());
            }
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f4 = LayoutInflaterFactory2C0305f.this;
            InterfaceC0303d interfaceC0303d = layoutInflaterFactory2C0305f4.f1086h;
            if (interfaceC0303d != null) {
                interfaceC0303d.mo1057N0(layoutInflaterFactory2C0305f4.f1099o);
            }
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f5 = LayoutInflaterFactory2C0305f.this;
            layoutInflaterFactory2C0305f5.f1099o = null;
            AbstractC0616q0.m2630k0(layoutInflaterFactory2C0305f5.f1106v);
        }

        @Override // p138g.AbstractC4318b.a
        /* renamed from: c */
        public boolean mo1166c(AbstractC4318b abstractC4318b, Menu menu) {
            AbstractC0616q0.m2630k0(LayoutInflaterFactory2C0305f.this.f1106v);
            return this.f1120a.mo1166c(abstractC4318b, menu);
        }

        @Override // p138g.AbstractC4318b.a
        /* renamed from: d */
        public boolean mo1167d(AbstractC4318b abstractC4318b, Menu menu) {
            return this.f1120a.mo1167d(abstractC4318b, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$j */
    /* loaded from: classes.dex */
    public static class j {
        /* renamed from: a */
        static Context m1168a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m1169b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$k */
    /* loaded from: classes.dex */
    static class k {
        /* renamed from: a */
        static boolean m1170a(PowerManager powerManager) {
            boolean isPowerSaveMode;
            isPowerSaveMode = powerManager.isPowerSaveMode();
            return isPowerSaveMode;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$l */
    /* loaded from: classes.dex */
    public static class l {
        /* renamed from: a */
        static void m1171a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$m */
    /* loaded from: classes.dex */
    public static class m {
        /* renamed from: a */
        static void m1172a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            i10 = configuration.colorMode;
            int i18 = i10 & 3;
            i11 = configuration2.colorMode;
            if (i18 != (i11 & 3)) {
                i16 = configuration3.colorMode;
                i17 = configuration2.colorMode;
                configuration3.colorMode = i16 | (i17 & 3);
            }
            i12 = configuration.colorMode;
            int i19 = i12 & 12;
            i13 = configuration2.colorMode;
            if (i19 != (i13 & 12)) {
                i14 = configuration3.colorMode;
                i15 = configuration2.colorMode;
                configuration3.colorMode = i14 | (i15 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$o */
    /* loaded from: classes.dex */
    public class o extends p {

        /* renamed from: c */
        private final PowerManager f1124c;

        o(Context context) {
            super();
            this.f1124c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0305f.p
        /* renamed from: b */
        IntentFilter mo1174b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0305f.p
        /* renamed from: c */
        public int mo1175c() {
            if (Build.VERSION.SDK_INT < 21 || !k.m1170a(this.f1124c)) {
                return 1;
            }
            return 2;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0305f.p
        /* renamed from: d */
        public void mo1176d() {
            LayoutInflaterFactory2C0305f.this.m1127F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$p */
    /* loaded from: classes.dex */
    public abstract class p {

        /* renamed from: a */
        private BroadcastReceiver f1126a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.f$p$a */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.mo1176d();
            }
        }

        p() {
        }

        /* renamed from: a */
        void m1177a() {
            BroadcastReceiver broadcastReceiver = this.f1126a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0305f.this.f1082e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1126a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo1174b();

        /* renamed from: c */
        abstract int mo1175c();

        /* renamed from: d */
        abstract void mo1176d();

        /* renamed from: e */
        void m1178e() {
            m1177a();
            IntentFilter mo1174b = mo1174b();
            if (mo1174b != null && mo1174b.countActions() != 0) {
                if (this.f1126a == null) {
                    this.f1126a = new a();
                }
                LayoutInflaterFactory2C0305f.this.f1082e.registerReceiver(this.f1126a, mo1174b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$q */
    /* loaded from: classes.dex */
    public class q extends p {

        /* renamed from: c */
        private final C0317r f1129c;

        q(C0317r c0317r) {
            super();
            this.f1129c = c0317r;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0305f.p
        /* renamed from: b */
        IntentFilter mo1174b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0305f.p
        /* renamed from: c */
        public int mo1175c() {
            if (this.f1129c.m1218d()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0305f.p
        /* renamed from: d */
        public void mo1176d() {
            LayoutInflaterFactory2C0305f.this.m1127F();
        }
    }

    /* renamed from: androidx.appcompat.app.f$r */
    /* loaded from: classes.dex */
    private static class r {
        /* renamed from: a */
        static void m1179a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$s */
    /* loaded from: classes.dex */
    public class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m1180c(int i10, int i11) {
            if (i10 >= -5 && i11 >= -5 && i10 <= getWidth() + 5 && i11 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!LayoutInflaterFactory2C0305f.this.m1137T(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m1180c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflaterFactory2C0305f.this.m1133N(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(AbstractC4105b.m17170d(getContext(), i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.f$t */
    /* loaded from: classes.dex */
    public static final class t {

        /* renamed from: a */
        int f1132a;

        /* renamed from: b */
        int f1133b;

        /* renamed from: c */
        int f1134c;

        /* renamed from: d */
        int f1135d;

        /* renamed from: e */
        int f1136e;

        /* renamed from: f */
        int f1137f;

        /* renamed from: g */
        ViewGroup f1138g;

        /* renamed from: h */
        View f1139h;

        /* renamed from: i */
        View f1140i;

        /* renamed from: j */
        C0325e f1141j;

        /* renamed from: k */
        C0323c f1142k;

        /* renamed from: l */
        Context f1143l;

        /* renamed from: m */
        boolean f1144m;

        /* renamed from: n */
        boolean f1145n;

        /* renamed from: o */
        boolean f1146o;

        /* renamed from: p */
        public boolean f1147p;

        /* renamed from: q */
        boolean f1148q = false;

        /* renamed from: r */
        boolean f1149r;

        /* renamed from: s */
        Bundle f1150s;

        t(int i10) {
            this.f1132a = i10;
        }

        /* renamed from: a */
        InterfaceC0331k m1181a(InterfaceC0330j.a aVar) {
            if (this.f1141j == null) {
                return null;
            }
            if (this.f1142k == null) {
                C0323c c0323c = new C0323c(this.f1143l, R$layout.abc_list_menu_item_layout);
                this.f1142k = c0323c;
                c0323c.mo1281f(aVar);
                this.f1141j.m1355b(this.f1142k);
            }
            return this.f1142k.m1315j(this.f1138g);
        }

        /* renamed from: b */
        public boolean m1182b() {
            if (this.f1139h == null) {
                return false;
            }
            if (this.f1140i == null && this.f1142k.m1314h().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        void m1183c(C0325e c0325e) {
            C0323c c0323c;
            C0325e c0325e2 = this.f1141j;
            if (c0325e == c0325e2) {
                return;
            }
            if (c0325e2 != null) {
                c0325e2.m1342O(this.f1142k);
            }
            this.f1141j = c0325e;
            if (c0325e != null && (c0323c = this.f1142k) != null) {
                c0325e.m1355b(c0323c);
            }
        }

        /* renamed from: d */
        void m1184d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(R$attr.panelMenuListTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(R$style.Theme_AppCompat_CompactMenu, true);
            }
            C4320d c4320d = new C4320d(context, 0);
            c4320d.getTheme().setTo(newTheme);
            this.f1143l = c4320d;
            TypedArray obtainStyledAttributes = c4320d.obtainStyledAttributes(R$styleable.f918o);
            this.f1133b = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_panelBackground, 0);
            this.f1137f = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$u */
    /* loaded from: classes.dex */
    public final class u implements InterfaceC0330j.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
        /* renamed from: a */
        public void mo1162a(C0325e c0325e, boolean z10) {
            boolean z11;
            C0325e mo1332D = c0325e.mo1332D();
            if (mo1332D != c0325e) {
                z11 = true;
            } else {
                z11 = false;
            }
            LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f = LayoutInflaterFactory2C0305f.this;
            if (z11) {
                c0325e = mo1332D;
            }
            t m1140Y = layoutInflaterFactory2C0305f.m1140Y(c0325e);
            if (m1140Y != null) {
                if (z11) {
                    LayoutInflaterFactory2C0305f.this.m1130K(m1140Y.f1132a, m1140Y, mo1332D);
                    LayoutInflaterFactory2C0305f.this.m1134O(m1140Y, true);
                } else {
                    LayoutInflaterFactory2C0305f.this.m1134O(m1140Y, z10);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
        /* renamed from: b */
        public boolean mo1163b(C0325e c0325e) {
            Window.Callback m1146f0;
            if (c0325e == c0325e.mo1332D()) {
                LayoutInflaterFactory2C0305f layoutInflaterFactory2C0305f = LayoutInflaterFactory2C0305f.this;
                if (layoutInflaterFactory2C0305f.f1061A && (m1146f0 = layoutInflaterFactory2C0305f.m1146f0()) != null && !LayoutInflaterFactory2C0305f.this.f1073M) {
                    m1146f0.onMenuOpened(108, c0325e);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT < 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1056o0 = z10;
        f1057p0 = new int[]{R.attr.windowBackground};
        f1058q0 = !"robolectric".equals(Build.FINGERPRINT);
        f1059r0 = true;
        if (z10 && !f1060s0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
            f1060s0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflaterFactory2C0305f(Activity activity, InterfaceC0303d interfaceC0303d) {
        this(activity, null, interfaceC0303d, activity);
    }

    /* renamed from: A0 */
    private boolean m1095A0(t tVar, KeyEvent keyEvent) {
        boolean z10;
        InterfaceC0413k1 interfaceC0413k1;
        int i10;
        boolean z11;
        InterfaceC0413k1 interfaceC0413k12;
        InterfaceC0413k1 interfaceC0413k13;
        if (this.f1073M) {
            return false;
        }
        if (tVar.f1144m) {
            return true;
        }
        t tVar2 = this.f1068H;
        if (tVar2 != null && tVar2 != tVar) {
            m1134O(tVar2, false);
        }
        Window.Callback m1146f0 = m1146f0();
        if (m1146f0 != null) {
            tVar.f1140i = m1146f0.onCreatePanelView(tVar.f1132a);
        }
        int i11 = tVar.f1132a;
        if (i11 != 0 && i11 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (interfaceC0413k13 = this.f1094l) != null) {
            interfaceC0413k13.mo1448c();
        }
        if (tVar.f1140i == null) {
            if (z10) {
                m1156y0();
            }
            C0325e c0325e = tVar.f1141j;
            if (c0325e == null || tVar.f1149r) {
                if (c0325e == null && (!m1119j0(tVar) || tVar.f1141j == null)) {
                    return false;
                }
                if (z10 && this.f1094l != null) {
                    if (this.f1096m == null) {
                        this.f1096m = new h();
                    }
                    this.f1094l.mo1446a(tVar.f1141j, this.f1096m);
                }
                tVar.f1141j.m1359d0();
                if (!m1146f0.onCreatePanelMenu(tVar.f1132a, tVar.f1141j)) {
                    tVar.m1183c(null);
                    if (z10 && (interfaceC0413k1 = this.f1094l) != null) {
                        interfaceC0413k1.mo1446a(null, this.f1096m);
                    }
                    return false;
                }
                tVar.f1149r = false;
            }
            tVar.f1141j.m1359d0();
            Bundle bundle = tVar.f1150s;
            if (bundle != null) {
                tVar.f1141j.m1343P(bundle);
                tVar.f1150s = null;
            }
            if (!m1146f0.onPreparePanel(0, tVar.f1140i, tVar.f1141j)) {
                if (z10 && (interfaceC0413k12 = this.f1094l) != null) {
                    interfaceC0413k12.mo1446a(null, this.f1096m);
                }
                tVar.f1141j.m1357c0();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            tVar.f1147p = z11;
            tVar.f1141j.setQwertyMode(z11);
            tVar.f1141j.m1357c0();
        }
        tVar.f1144m = true;
        tVar.f1145n = false;
        this.f1068H = tVar;
        return true;
    }

    /* renamed from: B0 */
    private void m1096B0(boolean z10) {
        InterfaceC0413k1 interfaceC0413k1 = this.f1094l;
        if (interfaceC0413k1 != null && interfaceC0413k1.mo1449d() && (!ViewConfiguration.get(this.f1082e).hasPermanentMenuKey() || this.f1094l.mo1451f())) {
            Window.Callback m1146f0 = m1146f0();
            if (this.f1094l.mo1447b() && z10) {
                this.f1094l.mo1452g();
                if (!this.f1073M) {
                    m1146f0.onPanelClosed(108, m1144d0(0, true).f1141j);
                    return;
                }
                return;
            }
            if (m1146f0 != null && !this.f1073M) {
                if (this.f1080Z && (this.f1085g0 & 1) != 0) {
                    this.f1083f.getDecorView().removeCallbacks(this.f1087h0);
                    this.f1087h0.run();
                }
                t m1144d0 = m1144d0(0, true);
                C0325e c0325e = m1144d0.f1141j;
                if (c0325e != null && !m1144d0.f1149r && m1146f0.onPreparePanel(0, m1144d0.f1140i, c0325e)) {
                    m1146f0.onMenuOpened(108, m1144d0.f1141j);
                    this.f1094l.mo1453h();
                    return;
                }
                return;
            }
            return;
        }
        t m1144d02 = m1144d0(0, true);
        m1144d02.f1148q = true;
        m1134O(m1144d02, false);
        m1124x0(m1144d02, null);
    }

    /* renamed from: C0 */
    private int m1097C0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
        return i10;
    }

    /* renamed from: E0 */
    private boolean m1098E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1083f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || AbstractC0616q0.m2599Q((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: G */
    private boolean m1099G(boolean z10) {
        if (this.f1073M) {
            return false;
        }
        int m1104J = m1104J();
        boolean m1105J0 = m1105J0(m1148n0(this.f1082e, m1104J), z10);
        if (m1104J == 0) {
            m1115c0(this.f1082e).m1178e();
        } else {
            p pVar = this.f1078X;
            if (pVar != null) {
                pVar.m1177a();
            }
        }
        if (m1104J == 3) {
            m1114b0(this.f1082e).m1178e();
        } else {
            p pVar2 = this.f1079Y;
            if (pVar2 != null) {
                pVar2.m1177a();
            }
        }
        return m1105J0;
    }

    /* renamed from: H */
    private void m1100H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1106v.findViewById(R.id.content);
        View decorView = this.f1083f.getDecorView();
        contentFrameLayout.m1492b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1082e.obtainStyledAttributes(R$styleable.f918o);
        obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i10 = R$styleable.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = R$styleable.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = R$styleable.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = R$styleable.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: H0 */
    private void m1101H0() {
        if (!this.f1105u) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    private void m1102I(Window window) {
        if (this.f1083f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(callback);
                this.f1084g = nVar;
                window.setCallback(nVar);
                C0438q2 m1873u = C0438q2.m1873u(this.f1082e, null, f1057p0);
                Drawable m1882h = m1873u.m1882h(0);
                if (m1882h != null) {
                    window.setBackgroundDrawable(m1882h);
                }
                m1873u.m1894w();
                this.f1083f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: I0 */
    private AbstractActivityC0302c m1103I0() {
        for (Context context = this.f1082e; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AbstractActivityC0302c) {
                return (AbstractActivityC0302c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: J */
    private int m1104J() {
        int i10 = this.f1074N;
        if (i10 == -100) {
            return AbstractC0304e.m1069j();
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m1105J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f1082e
            r1 = 0
            android.content.res.Configuration r0 = r6.m1109P(r0, r7, r1)
            boolean r2 = r6.m1121l0()
            android.content.Context r3 = r6.f1082e
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.f1070J
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.LayoutInflaterFactory2C0305f.f1058q0
            if (r8 != 0) goto L30
            boolean r8 = r6.f1071K
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f1081d
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f1081d
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.AbstractC0498c.m2182m(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.m1106K0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f1081d
            boolean r0 = r8 instanceof androidx.appcompat.app.AbstractActivityC0302c
            if (r0 == 0) goto L5e
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.AbstractActivityC0302c) r8
            r8.m1053D4(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0305f.m1105J0(int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K0 */
    private void m1106K0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f1082e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            AbstractC0315p.m1206a(resources);
        }
        int i12 = this.f1075O;
        if (i12 != 0) {
            this.f1082e.setTheme(i12);
            if (i11 >= 23) {
                this.f1082e.getTheme().applyStyle(this.f1075O, true);
            }
        }
        if (z10) {
            Object obj = this.f1081d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC0752f) {
                    if (((InterfaceC0752f) activity).mo953f6().mo3704b().m3709a(AbstractC0749c.c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f1072L) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: M */
    private void m1107M() {
        p pVar = this.f1078X;
        if (pVar != null) {
            pVar.m1177a();
        }
        p pVar2 = this.f1079Y;
        if (pVar2 != null) {
            pVar2.m1177a();
        }
    }

    /* renamed from: M0 */
    private void m1108M0(View view) {
        boolean z10;
        int m2322d;
        if ((AbstractC0616q0.m2593K(view) & 8192) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m2322d = AbstractC0547a.m2322d(this.f1082e, R$color.abc_decor_view_status_guard_light);
        } else {
            m2322d = AbstractC0547a.m2322d(this.f1082e, R$color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(m2322d);
    }

    /* renamed from: P */
    private Configuration m1109P(Context context, int i10, Configuration configuration) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: Q */
    private ViewGroup m1110Q() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f1082e.obtainStyledAttributes(R$styleable.f918o);
        int i10 = R$styleable.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowNoTitle, false)) {
                mo1094z(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                mo1094z(108);
            }
            if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                mo1094z(109);
            }
            if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                mo1094z(10);
            }
            this.f1064D = obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m1112X();
            this.f1083f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1082e);
            if (!this.f1065E) {
                if (this.f1064D) {
                    viewGroup = (ViewGroup) from.inflate(R$layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f1062B = false;
                    this.f1061A = false;
                } else if (this.f1061A) {
                    TypedValue typedValue = new TypedValue();
                    this.f1082e.getTheme().resolveAttribute(R$attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C4320d(this.f1082e, typedValue.resourceId);
                    } else {
                        context = this.f1082e;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R$layout.abc_screen_toolbar, (ViewGroup) null);
                    InterfaceC0413k1 interfaceC0413k1 = (InterfaceC0413k1) viewGroup.findViewById(R$id.decor_content_parent);
                    this.f1094l = interfaceC0413k1;
                    interfaceC0413k1.setWindowCallback(m1146f0());
                    if (this.f1062B) {
                        this.f1094l.mo1454i(109);
                    }
                    if (this.f1109y) {
                        this.f1094l.mo1454i(2);
                    }
                    if (this.f1110z) {
                        this.f1094l.mo1454i(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f1063C ? (ViewGroup) from.inflate(R$layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R$layout.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    AbstractC0616q0.m2658y0(viewGroup, new c());
                } else if (viewGroup instanceof InterfaceC0437q1) {
                    ((InterfaceC0437q1) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.f1094l == null) {
                    this.f1107w = (TextView) viewGroup.findViewById(R$id.title);
                }
                AbstractC0466x2.m2028c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R$id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f1083f.findViewById(R.id.content);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(R.id.content);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f1083f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1061A + ", windowActionBarOverlay: " + this.f1062B + ", android:windowIsFloating: " + this.f1064D + ", windowActionModeOverlay: " + this.f1063C + ", windowNoTitle: " + this.f1065E + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: W */
    private void m1111W() {
        if (!this.f1105u) {
            this.f1106v = m1110Q();
            CharSequence m1145e0 = m1145e0();
            if (!TextUtils.isEmpty(m1145e0)) {
                InterfaceC0413k1 interfaceC0413k1 = this.f1094l;
                if (interfaceC0413k1 != null) {
                    interfaceC0413k1.setWindowTitle(m1145e0);
                } else if (m1156y0() != null) {
                    m1156y0().mo1037t(m1145e0);
                } else {
                    TextView textView = this.f1107w;
                    if (textView != null) {
                        textView.setText(m1145e0);
                    }
                }
            }
            m1100H();
            m1155w0(this.f1106v);
            this.f1105u = true;
            t m1144d0 = m1144d0(0, false);
            if (!this.f1073M) {
                if (m1144d0 == null || m1144d0.f1141j == null) {
                    m1120k0(108);
                }
            }
        }
    }

    /* renamed from: X */
    private void m1112X() {
        if (this.f1083f == null) {
            Object obj = this.f1081d;
            if (obj instanceof Activity) {
                m1102I(((Activity) obj).getWindow());
            }
        }
        if (this.f1083f != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Z */
    private static Configuration m1113Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                l.m1171a(configuration, configuration2, configuration3);
            } else if (!AbstractC7338c.m28317a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & LogType.UNEXP_OTHER;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & LogType.UNEXP_OTHER)) {
                configuration3.screenLayout |= i34 & LogType.UNEXP_OTHER;
            }
            if (i14 >= 26) {
                m.m1172a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            j.m1169b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: b0 */
    private p m1114b0(Context context) {
        if (this.f1079Y == null) {
            this.f1079Y = new o(context);
        }
        return this.f1079Y;
    }

    /* renamed from: c0 */
    private p m1115c0(Context context) {
        if (this.f1078X == null) {
            this.f1078X = new q(C0317r.m1213a(context));
        }
        return this.f1078X;
    }

    /* renamed from: g0 */
    private void m1116g0() {
        m1111W();
        if (this.f1061A && this.f1088i == null) {
            Object obj = this.f1081d;
            if (obj instanceof Activity) {
                this.f1088i = new C0318s((Activity) this.f1081d, this.f1062B);
            } else if (obj instanceof Dialog) {
                this.f1088i = new C0318s((Dialog) this.f1081d);
            }
            AbstractC0300a abstractC0300a = this.f1088i;
            if (abstractC0300a != null) {
                abstractC0300a.mo1035r(this.f1089i0);
            }
        }
    }

    /* renamed from: h0 */
    private boolean m1117h0(t tVar) {
        View view = tVar.f1140i;
        if (view != null) {
            tVar.f1139h = view;
            return true;
        }
        if (tVar.f1141j == null) {
            return false;
        }
        if (this.f1098n == null) {
            this.f1098n = new u();
        }
        View view2 = (View) tVar.m1181a(this.f1098n);
        tVar.f1139h = view2;
        if (view2 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    private boolean m1118i0(t tVar) {
        tVar.m1184d(m1142a0());
        tVar.f1138g = new s(tVar.f1143l);
        tVar.f1134c = 81;
        return true;
    }

    /* renamed from: j0 */
    private boolean m1119j0(t tVar) {
        Resources.Theme theme;
        Context context = this.f1082e;
        int i10 = tVar.f1132a;
        if ((i10 == 0 || i10 == 108) && this.f1094l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C4320d c4320d = new C4320d(context, 0);
                c4320d.getTheme().setTo(theme);
                context = c4320d;
            }
        }
        C0325e c0325e = new C0325e(context);
        c0325e.mo1345R(this);
        tVar.m1183c(c0325e);
        return true;
    }

    /* renamed from: k0 */
    private void m1120k0(int i10) {
        this.f1085g0 = (1 << i10) | this.f1085g0;
        if (!this.f1080Z) {
            AbstractC0616q0.m2620f0(this.f1083f.getDecorView(), this.f1087h0);
            this.f1080Z = true;
        }
    }

    /* renamed from: l0 */
    private boolean m1121l0() {
        int i10;
        boolean z10;
        if (!this.f1077W && (this.f1081d instanceof Activity)) {
            PackageManager packageManager = this.f1082e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    i10 = 269221888;
                } else if (i11 >= 24) {
                    i10 = 786432;
                } else {
                    i10 = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f1082e, this.f1081d.getClass()), i10);
                if (activityInfo != null && (activityInfo.configChanges & 512) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1076V = z10;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f1076V = false;
            }
        }
        this.f1077W = true;
        return this.f1076V;
    }

    /* renamed from: q0 */
    private boolean m1122q0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            t m1144d0 = m1144d0(i10, true);
            if (!m1144d0.f1146o) {
                return m1095A0(m1144d0, keyEvent);
            }
            return false;
        }
        return false;
    }

    /* renamed from: t0 */
    private boolean m1123t0(int i10, KeyEvent keyEvent) {
        boolean z10;
        InterfaceC0413k1 interfaceC0413k1;
        if (this.f1099o != null) {
            return false;
        }
        boolean z11 = true;
        t m1144d0 = m1144d0(i10, true);
        if (i10 == 0 && (interfaceC0413k1 = this.f1094l) != null && interfaceC0413k1.mo1449d() && !ViewConfiguration.get(this.f1082e).hasPermanentMenuKey()) {
            if (!this.f1094l.mo1447b()) {
                if (!this.f1073M && m1095A0(m1144d0, keyEvent)) {
                    z11 = this.f1094l.mo1453h();
                }
                z11 = false;
            } else {
                z11 = this.f1094l.mo1452g();
            }
        } else {
            boolean z12 = m1144d0.f1146o;
            if (!z12 && !m1144d0.f1145n) {
                if (m1144d0.f1144m) {
                    if (m1144d0.f1149r) {
                        m1144d0.f1144m = false;
                        z10 = m1095A0(m1144d0, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        m1124x0(m1144d0, keyEvent);
                    }
                }
                z11 = false;
            } else {
                m1134O(m1144d0, true);
                z11 = z12;
            }
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f1082e.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    /* renamed from: x0 */
    private void m1124x0(t tVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        boolean z10;
        if (!tVar.f1146o && !this.f1073M) {
            if (tVar.f1132a == 0) {
                if ((this.f1082e.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            Window.Callback m1146f0 = m1146f0();
            if (m1146f0 != null && !m1146f0.onMenuOpened(tVar.f1132a, tVar.f1141j)) {
                m1134O(tVar, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.f1082e.getSystemService("window");
            if (windowManager == null || !m1095A0(tVar, keyEvent)) {
                return;
            }
            ViewGroup viewGroup = tVar.f1138g;
            if (viewGroup != null && !tVar.f1148q) {
                View view = tVar.f1140i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    tVar.f1145n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, tVar.f1135d, tVar.f1136e, 1002, 8519680, -3);
                    layoutParams2.gravity = tVar.f1134c;
                    layoutParams2.windowAnimations = tVar.f1137f;
                    windowManager.addView(tVar.f1138g, layoutParams2);
                    tVar.f1146o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!m1118i0(tVar) || tVar.f1138g == null) {
                        return;
                    }
                } else if (tVar.f1148q && viewGroup.getChildCount() > 0) {
                    tVar.f1138g.removeAllViews();
                }
                if (m1117h0(tVar) && tVar.m1182b()) {
                    ViewGroup.LayoutParams layoutParams3 = tVar.f1139h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    tVar.f1138g.setBackgroundResource(tVar.f1133b);
                    ViewParent parent = tVar.f1139h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(tVar.f1139h);
                    }
                    tVar.f1138g.addView(tVar.f1139h, layoutParams3);
                    if (!tVar.f1139h.hasFocus()) {
                        tVar.f1139h.requestFocus();
                    }
                } else {
                    tVar.f1148q = true;
                    return;
                }
            }
            i10 = -2;
            tVar.f1145n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, tVar.f1135d, tVar.f1136e, 1002, 8519680, -3);
            layoutParams22.gravity = tVar.f1134c;
            layoutParams22.windowAnimations = tVar.f1137f;
            windowManager.addView(tVar.f1138g, layoutParams22);
            tVar.f1146o = true;
        }
    }

    /* renamed from: z0 */
    private boolean m1125z0(t tVar, int i10, KeyEvent keyEvent, int i11) {
        C0325e c0325e;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f1144m || m1095A0(tVar, keyEvent)) && (c0325e = tVar.f1141j) != null) {
            z10 = c0325e.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f1094l == null) {
            m1134O(tVar, true);
        }
        return z10;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: A */
    public void mo1072A(int i10) {
        m1111W();
        ViewGroup viewGroup = (ViewGroup) this.f1106v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1082e).inflate(i10, viewGroup);
        this.f1084g.m18141a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: B */
    public void mo1073B(View view) {
        m1111W();
        ViewGroup viewGroup = (ViewGroup) this.f1106v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1084g.m18141a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: C */
    public void mo1074C(View view, ViewGroup.LayoutParams layoutParams) {
        m1111W();
        ViewGroup viewGroup = (ViewGroup) this.f1106v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1084g.m18141a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: D */
    public void mo1075D(int i10) {
        this.f1075O = i10;
    }

    /* renamed from: D0 */
    final boolean m1126D0() {
        ViewGroup viewGroup;
        if (this.f1105u && (viewGroup = this.f1106v) != null && AbstractC0616q0.m2600R(viewGroup)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: E */
    public final void mo1076E(CharSequence charSequence) {
        this.f1092k = charSequence;
        InterfaceC0413k1 interfaceC0413k1 = this.f1094l;
        if (interfaceC0413k1 != null) {
            interfaceC0413k1.setWindowTitle(charSequence);
            return;
        }
        if (m1156y0() != null) {
            m1156y0().mo1037t(charSequence);
            return;
        }
        TextView textView = this.f1107w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: F */
    public boolean m1127F() {
        return m1099G(true);
    }

    /* renamed from: F0 */
    public AbstractC4318b m1128F0(AbstractC4318b.a aVar) {
        InterfaceC0303d interfaceC0303d;
        if (aVar != null) {
            AbstractC4318b abstractC4318b = this.f1099o;
            if (abstractC4318b != null) {
                abstractC4318b.mo1244c();
            }
            i iVar = new i(aVar);
            AbstractC0300a mo1083m = mo1083m();
            if (mo1083m != null) {
                AbstractC4318b mo1038u = mo1083m.mo1038u(iVar);
                this.f1099o = mo1038u;
                if (mo1038u != null && (interfaceC0303d = this.f1086h) != null) {
                    interfaceC0303d.mo1062V1(mo1038u);
                }
            }
            if (this.f1099o == null) {
                this.f1099o = m1129G0(iVar);
            }
            return this.f1099o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002a  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    p138g.AbstractC4318b m1129G0(p138g.AbstractC4318b.a r8) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0305f.m1129G0(g.b$a):g.b");
    }

    /* renamed from: K */
    void m1130K(int i10, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i10 >= 0) {
                t[] tVarArr = this.f1067G;
                if (i10 < tVarArr.length) {
                    tVar = tVarArr[i10];
                }
            }
            if (tVar != null) {
                menu = tVar.f1141j;
            }
        }
        if ((tVar == null || tVar.f1146o) && !this.f1073M) {
            this.f1084g.m18141a().onPanelClosed(i10, menu);
        }
    }

    /* renamed from: L */
    void m1131L(C0325e c0325e) {
        if (this.f1066F) {
            return;
        }
        this.f1066F = true;
        this.f1094l.mo1455j();
        Window.Callback m1146f0 = m1146f0();
        if (m1146f0 != null && !this.f1073M) {
            m1146f0.onPanelClosed(108, c0325e);
        }
        this.f1066F = false;
    }

    /* renamed from: L0 */
    final int m1132L0(C0609o1 c0609o1, Rect rect) {
        int i10;
        boolean z10;
        int m2519i;
        int m2520j;
        boolean z11;
        int i11 = 0;
        if (c0609o1 != null) {
            i10 = c0609o1.m2521k();
        } else if (rect != null) {
            i10 = rect.top;
        } else {
            i10 = 0;
        }
        ActionBarContextView actionBarContextView = this.f1100p;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1100p.getLayoutParams();
            boolean z12 = true;
            if (this.f1100p.isShown()) {
                if (this.f1091j0 == null) {
                    this.f1091j0 = new Rect();
                    this.f1093k0 = new Rect();
                }
                Rect rect2 = this.f1091j0;
                Rect rect3 = this.f1093k0;
                if (c0609o1 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0609o1.m2519i(), c0609o1.m2521k(), c0609o1.m2520j(), c0609o1.m2518h());
                }
                AbstractC0466x2.m2026a(this.f1106v, rect2, rect3);
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                C0609o1 m2590H = AbstractC0616q0.m2590H(this.f1106v);
                if (m2590H == null) {
                    m2519i = 0;
                } else {
                    m2519i = m2590H.m2519i();
                }
                if (m2590H == null) {
                    m2520j = 0;
                } else {
                    m2520j = m2590H.m2520j();
                }
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i12;
                    marginLayoutParams.leftMargin = i13;
                    marginLayoutParams.rightMargin = i14;
                    z11 = true;
                }
                if (i12 > 0 && this.f1108x == null) {
                    View view = new View(this.f1082e);
                    this.f1108x = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m2519i;
                    layoutParams.rightMargin = m2520j;
                    this.f1106v.addView(this.f1108x, -1, layoutParams);
                } else {
                    View view2 = this.f1108x;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != m2519i || marginLayoutParams2.rightMargin != m2520j) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = m2519i;
                            marginLayoutParams2.rightMargin = m2520j;
                            this.f1108x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f1108x;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    m1108M0(this.f1108x);
                }
                if (!this.f1063C && z12) {
                    i10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f1100p.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view4 = this.f1108x;
        if (view4 != null) {
            if (!z10) {
                i11 = 8;
            }
            view4.setVisibility(i11);
        }
        return i10;
    }

    /* renamed from: N */
    void m1133N(int i10) {
        m1134O(m1144d0(i10, true), true);
    }

    /* renamed from: O */
    void m1134O(t tVar, boolean z10) {
        ViewGroup viewGroup;
        InterfaceC0413k1 interfaceC0413k1;
        if (z10 && tVar.f1132a == 0 && (interfaceC0413k1 = this.f1094l) != null && interfaceC0413k1.mo1447b()) {
            m1131L(tVar.f1141j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1082e.getSystemService("window");
        if (windowManager != null && tVar.f1146o && (viewGroup = tVar.f1138g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                m1130K(tVar.f1132a, tVar, null);
            }
        }
        tVar.f1144m = false;
        tVar.f1145n = false;
        tVar.f1146o = false;
        tVar.f1139h = null;
        tVar.f1148q = true;
        if (this.f1068H == tVar) {
            this.f1068H = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    public View m1135R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11 = false;
        if (this.f1095l0 == null) {
            String string = this.f1082e.obtainStyledAttributes(R$styleable.f918o).getString(R$styleable.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f1095l0 = new C0313n();
            } else {
                try {
                    this.f1095l0 = (C0313n) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f1095l0 = new C0313n();
                }
            }
        }
        boolean z12 = f1056o0;
        if (z12) {
            if (this.f1097m0 == null) {
                this.f1097m0 = new C0314o();
            }
            if (this.f1097m0.m1205a(attributeSet)) {
                z10 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z11 = true;
                    }
                } else {
                    z11 = m1098E0((ViewParent) view);
                }
                z10 = z11;
            }
        } else {
            z10 = false;
        }
        return this.f1095l0.createView(view, str, context, attributeSet, z10, z12, true, C0462w2.m2022b());
    }

    /* renamed from: S */
    void m1136S() {
        C0325e c0325e;
        InterfaceC0413k1 interfaceC0413k1 = this.f1094l;
        if (interfaceC0413k1 != null) {
            interfaceC0413k1.mo1455j();
        }
        if (this.f1101q != null) {
            this.f1083f.getDecorView().removeCallbacks(this.f1102r);
            if (this.f1101q.isShowing()) {
                try {
                    this.f1101q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1101q = null;
        }
        m1139V();
        t m1144d0 = m1144d0(0, false);
        if (m1144d0 != null && (c0325e = m1144d0.f1141j) != null) {
            c0325e.close();
        }
    }

    /* renamed from: T */
    boolean m1137T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f1081d;
        boolean z10 = true;
        if (((obj instanceof AbstractC0623s.a) || (obj instanceof AbstractDialogC0312m)) && (decorView = this.f1083f.getDecorView()) != null && AbstractC0623s.m2806d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1084g.m18141a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z10 = false;
        }
        if (z10) {
            return m1150p0(keyCode, keyEvent);
        }
        return m1152s0(keyCode, keyEvent);
    }

    /* renamed from: U */
    void m1138U(int i10) {
        t m1144d0;
        t m1144d02 = m1144d0(i10, true);
        if (m1144d02.f1141j != null) {
            Bundle bundle = new Bundle();
            m1144d02.f1141j.m1344Q(bundle);
            if (bundle.size() > 0) {
                m1144d02.f1150s = bundle;
            }
            m1144d02.f1141j.m1359d0();
            m1144d02.f1141j.clear();
        }
        m1144d02.f1149r = true;
        m1144d02.f1148q = true;
        if ((i10 == 108 || i10 == 0) && this.f1094l != null && (m1144d0 = m1144d0(0, false)) != null) {
            m1144d0.f1144m = false;
            m1095A0(m1144d0, null);
        }
    }

    /* renamed from: V */
    void m1139V() {
        C0589j1 c0589j1 = this.f1103s;
        if (c0589j1 != null) {
            c0589j1.m2484b();
        }
    }

    /* renamed from: Y */
    t m1140Y(Menu menu) {
        int i10;
        t[] tVarArr = this.f1067G;
        if (tVarArr != null) {
            i10 = tVarArr.length;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            t tVar = tVarArr[i11];
            if (tVar != null && tVar.f1141j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.C0325e.a
    /* renamed from: a */
    public boolean mo1141a(C0325e c0325e, MenuItem menuItem) {
        t m1140Y;
        Window.Callback m1146f0 = m1146f0();
        if (m1146f0 != null && !this.f1073M && (m1140Y = m1140Y(c0325e.mo1332D())) != null) {
            return m1146f0.onMenuItemSelected(m1140Y.f1132a, menuItem);
        }
        return false;
    }

    /* renamed from: a0 */
    final Context m1142a0() {
        Context context;
        AbstractC0300a mo1083m = mo1083m();
        if (mo1083m != null) {
            context = mo1083m.mo1028k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f1082e;
        }
        return context;
    }

    @Override // androidx.appcompat.view.menu.C0325e.a
    /* renamed from: b */
    public void mo1143b(C0325e c0325e) {
        m1096B0(true);
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: d */
    public void mo1077d(View view, ViewGroup.LayoutParams layoutParams) {
        m1111W();
        ((ViewGroup) this.f1106v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f1084g.m18141a().onContentChanged();
    }

    /* renamed from: d0 */
    protected t m1144d0(int i10, boolean z10) {
        t[] tVarArr = this.f1067G;
        if (tVarArr == null || tVarArr.length <= i10) {
            t[] tVarArr2 = new t[i10 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f1067G = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i10];
        if (tVar == null) {
            t tVar2 = new t(i10);
            tVarArr[i10] = tVar2;
            return tVar2;
        }
        return tVar;
    }

    /* renamed from: e0 */
    final CharSequence m1145e0() {
        Object obj = this.f1081d;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f1092k;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: f */
    public Context mo1079f(Context context) {
        boolean z10 = true;
        this.f1070J = true;
        int m1148n0 = m1148n0(context, m1104J());
        Configuration configuration = null;
        if (f1059r0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.m1179a((ContextThemeWrapper) context, m1109P(context, m1148n0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C4320d) {
            try {
                ((C4320d) context).m18111a(m1109P(context, m1148n0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f1058q0) {
            return super.mo1079f(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = j.m1168a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m1113Z(configuration3, configuration4);
        }
        Configuration m1109P = m1109P(context, m1148n0, configuration);
        C4320d c4320d = new C4320d(context, R$style.Theme_AppCompat_Empty);
        c4320d.m18111a(m1109P);
        boolean z11 = false;
        try {
            if (context.getTheme() == null) {
                z10 = false;
            }
            z11 = z10;
        } catch (NullPointerException unused3) {
        }
        if (z11) {
            AbstractC5894i.e.m23809a(c4320d.getTheme());
        }
        return super.mo1079f(c4320d);
    }

    /* renamed from: f0 */
    final Window.Callback m1146f0() {
        return this.f1083f.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: i */
    public View mo1080i(int i10) {
        m1111W();
        return this.f1083f.findViewById(i10);
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: k */
    public int mo1081k() {
        return this.f1074N;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: l */
    public MenuInflater mo1082l() {
        Context context;
        if (this.f1090j == null) {
            m1116g0();
            AbstractC0300a abstractC0300a = this.f1088i;
            if (abstractC0300a != null) {
                context = abstractC0300a.mo1028k();
            } else {
                context = this.f1082e;
            }
            this.f1090j = new C4323g(context);
        }
        return this.f1090j;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: m */
    public AbstractC0300a mo1083m() {
        m1116g0();
        return this.f1088i;
    }

    /* renamed from: m0 */
    public boolean m1147m0() {
        return this.f1104t;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: n */
    public void mo1084n() {
        LayoutInflater from = LayoutInflater.from(this.f1082e);
        if (from.getFactory() == null) {
            AbstractC0627t.m2813b(from, this);
        } else if (!(from.getFactory2() instanceof LayoutInflaterFactory2C0305f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: n0 */
    int m1148n0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        return m1114b0(context).mo1175c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m1115c0(context).mo1175c();
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: o */
    public void mo1085o() {
        AbstractC0300a mo1083m = mo1083m();
        if (mo1083m != null && mo1083m.m1029l()) {
            return;
        }
        m1120k0(0);
    }

    /* renamed from: o0 */
    boolean m1149o0() {
        AbstractC4318b abstractC4318b = this.f1099o;
        if (abstractC4318b != null) {
            abstractC4318b.mo1244c();
            return true;
        }
        AbstractC0300a mo1083m = mo1083m();
        if (mo1083m != null && mo1083m.mo1025h()) {
            return true;
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m1135R(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: p */
    public void mo1086p(Configuration configuration) {
        AbstractC0300a mo1083m;
        if (this.f1061A && this.f1105u && (mo1083m = mo1083m()) != null) {
            mo1083m.mo1030m(configuration);
        }
        C0415l.m1763b().m1770g(this.f1082e);
        m1099G(false);
    }

    /* renamed from: p0 */
    boolean m1150p0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 != 4) {
            if (i10 == 82) {
                m1122q0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.f1069I = z10;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: q */
    public void mo1087q(Bundle bundle) {
        String str;
        this.f1070J = true;
        m1099G(false);
        m1112X();
        Object obj = this.f1081d;
        if (obj instanceof Activity) {
            try {
                str = AbstractC0513j.m2220c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0300a m1156y0 = m1156y0();
                if (m1156y0 == null) {
                    this.f1089i0 = true;
                } else {
                    m1156y0.mo1035r(true);
                }
            }
            AbstractC0304e.m1066c(this);
        }
        this.f1071K = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1088r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1081d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AbstractC0304e.m1070x(r3)
        L9:
            boolean r0 = r3.f1080Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f1083f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f1087h0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f1072L = r0
            r0 = 1
            r3.f1073M = r0
            int r0 = r3.f1074N
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f1081d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            l.i r0 = androidx.appcompat.app.LayoutInflaterFactory2C0305f.f1055n0
            java.lang.Object r1 = r3.f1081d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f1074N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            l.i r0 = androidx.appcompat.app.LayoutInflaterFactory2C0305f.f1055n0
            java.lang.Object r1 = r3.f1081d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.f1088i
            if (r0 == 0) goto L5e
            r0.m1031n()
        L5e:
            r3.m1107M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0305f.mo1088r():void");
    }

    /* renamed from: r0 */
    boolean m1151r0(int i10, KeyEvent keyEvent) {
        AbstractC0300a mo1083m = mo1083m();
        if (mo1083m != null && mo1083m.mo1032o(i10, keyEvent)) {
            return true;
        }
        t tVar = this.f1068H;
        if (tVar != null && m1125z0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.f1068H;
            if (tVar2 != null) {
                tVar2.f1145n = true;
            }
            return true;
        }
        if (this.f1068H == null) {
            t m1144d0 = m1144d0(0, true);
            m1095A0(m1144d0, keyEvent);
            boolean m1125z0 = m1125z0(m1144d0, keyEvent.getKeyCode(), keyEvent, 1);
            m1144d0.f1144m = false;
            if (m1125z0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: s */
    public void mo1089s(Bundle bundle) {
        m1111W();
    }

    /* renamed from: s0 */
    boolean m1152s0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                m1123t0(0, keyEvent);
                return true;
            }
        } else {
            boolean z10 = this.f1069I;
            this.f1069I = false;
            t m1144d0 = m1144d0(0, false);
            if (m1144d0 != null && m1144d0.f1146o) {
                if (!z10) {
                    m1134O(m1144d0, true);
                }
                return true;
            }
            if (m1149o0()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: t */
    public void mo1090t() {
        AbstractC0300a mo1083m = mo1083m();
        if (mo1083m != null) {
            mo1083m.mo1036s(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: u */
    public void mo1091u(Bundle bundle) {
    }

    /* renamed from: u0 */
    void m1153u0(int i10) {
        AbstractC0300a mo1083m;
        if (i10 == 108 && (mo1083m = mo1083m()) != null) {
            mo1083m.mo1026i(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: v */
    public void mo1092v() {
        this.f1072L = true;
        m1127F();
    }

    /* renamed from: v0 */
    void m1154v0(int i10) {
        if (i10 == 108) {
            AbstractC0300a mo1083m = mo1083m();
            if (mo1083m != null) {
                mo1083m.mo1026i(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            t m1144d0 = m1144d0(i10, true);
            if (m1144d0.f1146o) {
                m1134O(m1144d0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: w */
    public void mo1093w() {
        this.f1072L = false;
        AbstractC0300a mo1083m = mo1083m();
        if (mo1083m != null) {
            mo1083m.mo1036s(false);
        }
    }

    /* renamed from: w0 */
    void m1155w0(ViewGroup viewGroup) {
    }

    /* renamed from: y0 */
    final AbstractC0300a m1156y0() {
        return this.f1088i;
    }

    @Override // androidx.appcompat.app.AbstractC0304e
    /* renamed from: z */
    public boolean mo1094z(int i10) {
        int m1097C0 = m1097C0(i10);
        if (this.f1065E && m1097C0 == 108) {
            return false;
        }
        if (this.f1061A && m1097C0 == 1) {
            this.f1061A = false;
        }
        if (m1097C0 != 1) {
            if (m1097C0 != 2) {
                if (m1097C0 != 5) {
                    if (m1097C0 != 10) {
                        if (m1097C0 != 108) {
                            if (m1097C0 != 109) {
                                return this.f1083f.requestFeature(m1097C0);
                            }
                            m1101H0();
                            this.f1062B = true;
                            return true;
                        }
                        m1101H0();
                        this.f1061A = true;
                        return true;
                    }
                    m1101H0();
                    this.f1063C = true;
                    return true;
                }
                m1101H0();
                this.f1110z = true;
                return true;
            }
            m1101H0();
            this.f1109y = true;
            return true;
        }
        m1101H0();
        this.f1065E = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflaterFactory2C0305f(Dialog dialog, InterfaceC0303d interfaceC0303d) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0303d, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflaterFactory2C0305f(Context context, Window window, InterfaceC0303d interfaceC0303d, Object obj) {
        AbstractActivityC0302c m1103I0;
        this.f1103s = null;
        this.f1104t = true;
        this.f1074N = -100;
        this.f1087h0 = new b();
        this.f1082e = context;
        this.f1086h = interfaceC0303d;
        this.f1081d = obj;
        if (this.f1074N == -100 && (obj instanceof Dialog) && (m1103I0 = m1103I0()) != null) {
            this.f1074N = m1103I0.m1064u4().mo1081k();
        }
        if (this.f1074N == -100) {
            C5311i c5311i = f1055n0;
            Integer num = (Integer) c5311i.get(obj.getClass().getName());
            if (num != null) {
                this.f1074N = num.intValue();
                c5311i.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m1102I(window);
        }
        C0415l.m1765h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$n */
    /* loaded from: classes.dex */
    public class n extends AbstractWindowCallbackC4329m {
        n(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        final ActionMode m1173b(ActionMode.Callback callback) {
            C4322f.a aVar = new C4322f.a(LayoutInflaterFactory2C0305f.this.f1082e, callback);
            AbstractC4318b m1128F0 = LayoutInflaterFactory2C0305f.this.m1128F0(aVar);
            if (m1128F0 != null) {
                return aVar.m18115e(m1128F0);
            }
            return null;
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!LayoutInflaterFactory2C0305f.this.m1137T(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !LayoutInflaterFactory2C0305f.this.m1151r0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 == 0 && !(menu instanceof C0325e)) {
                return false;
            }
            return super.onCreatePanelMenu(i10, menu);
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            LayoutInflaterFactory2C0305f.this.m1153u0(i10);
            return true;
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            LayoutInflaterFactory2C0305f.this.m1154v0(i10);
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            C0325e c0325e;
            if (menu instanceof C0325e) {
                c0325e = (C0325e) menu;
            } else {
                c0325e = null;
            }
            if (i10 == 0 && c0325e == null) {
                return false;
            }
            if (c0325e != null) {
                c0325e.m1354a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (c0325e != null) {
                c0325e.m1354a0(false);
            }
            return onPreparePanel;
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            C0325e c0325e;
            t m1144d0 = LayoutInflaterFactory2C0305f.this.m1144d0(0, true);
            if (m1144d0 != null && (c0325e = m1144d0.f1141j) != null) {
                super.onProvideKeyboardShortcuts(list, c0325e, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflaterFactory2C0305f.this.m1147m0()) {
                return m1173b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // p138g.AbstractWindowCallbackC4329m, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (LayoutInflaterFactory2C0305f.this.m1147m0() && i10 == 0) {
                return m1173b(callback);
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }
}
