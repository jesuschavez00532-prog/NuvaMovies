package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.R$dimen;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: androidx.core.app.l */
/* loaded from: classes.dex */
public abstract class AbstractC0517l {

    /* renamed from: androidx.core.app.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Bundle f2214a;

        /* renamed from: b */
        private IconCompat f2215b;

        /* renamed from: c */
        private final AbstractC0494a1[] f2216c;

        /* renamed from: d */
        private final AbstractC0494a1[] f2217d;

        /* renamed from: e */
        private boolean f2218e;

        /* renamed from: f */
        boolean f2219f;

        /* renamed from: g */
        private final int f2220g;

        /* renamed from: h */
        private final boolean f2221h;

        /* renamed from: i */
        public int f2222i;

        /* renamed from: j */
        public CharSequence f2223j;

        /* renamed from: k */
        public PendingIntent f2224k;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.m2359c(null, "", i10) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m2228a() {
            return this.f2224k;
        }

        /* renamed from: b */
        public boolean m2229b() {
            return this.f2218e;
        }

        /* renamed from: c */
        public AbstractC0494a1[] m2230c() {
            return this.f2217d;
        }

        /* renamed from: d */
        public Bundle m2231d() {
            return this.f2214a;
        }

        /* renamed from: e */
        public IconCompat m2232e() {
            int i10;
            if (this.f2215b == null && (i10 = this.f2222i) != 0) {
                this.f2215b = IconCompat.m2359c(null, "", i10);
            }
            return this.f2215b;
        }

        /* renamed from: f */
        public AbstractC0494a1[] m2233f() {
            return this.f2216c;
        }

        /* renamed from: g */
        public int m2234g() {
            return this.f2220g;
        }

        /* renamed from: h */
        public boolean m2235h() {
            return this.f2219f;
        }

        /* renamed from: i */
        public CharSequence m2236i() {
            return this.f2223j;
        }

        /* renamed from: j */
        public boolean m2237j() {
            return this.f2221h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC0494a1[] abstractC0494a1Arr, AbstractC0494a1[] abstractC0494a1Arr2, boolean z10, int i10, boolean z11, boolean z12) {
            this.f2219f = true;
            this.f2215b = iconCompat;
            if (iconCompat != null && iconCompat.m2368i() == 2) {
                this.f2222i = iconCompat.m2366e();
            }
            this.f2223j = e.m2249d(charSequence);
            this.f2224k = pendingIntent;
            this.f2214a = bundle == null ? new Bundle() : bundle;
            this.f2216c = abstractC0494a1Arr;
            this.f2217d = abstractC0494a1Arr2;
            this.f2218e = z10;
            this.f2220g = i10;
            this.f2219f = z11;
            this.f2221h = z12;
        }
    }

    /* renamed from: androidx.core.app.l$b */
    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: e */
        private Bitmap f2225e;

        /* renamed from: f */
        private IconCompat f2226f;

        /* renamed from: g */
        private boolean f2227g;

        /* renamed from: h */
        private boolean f2228h;

        /* renamed from: androidx.core.app.l$b$a */
        /* loaded from: classes.dex */
        private static class a {
            /* renamed from: a */
            static void m2242a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m2243b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C7797b {
            /* renamed from: a */
            static void m2244a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.l$b$c */
        /* loaded from: classes.dex */
        private static class c {
            /* renamed from: a */
            static void m2245a(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.AbstractC0517l.f
        /* renamed from: b */
        public void mo2238b(InterfaceC0515k interfaceC0515k) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(interfaceC0515k.mo2225a()).setBigContentTitle(this.f2278b).bigPicture(this.f2225e);
            if (this.f2227g) {
                IconCompat iconCompat = this.f2226f;
                Context context = null;
                if (iconCompat == null) {
                    a.m2242a(bigPicture, null);
                } else if (i10 >= 23) {
                    if (interfaceC0515k instanceof C0544y0) {
                        context = ((C0544y0) interfaceC0515k).m2312f();
                    }
                    C7797b.m2244a(bigPicture, this.f2226f.m2374q(context));
                } else if (iconCompat.m2368i() == 1) {
                    a.m2242a(bigPicture, this.f2226f.m2365d());
                } else {
                    a.m2242a(bigPicture, null);
                }
            }
            if (this.f2280d) {
                a.m2243b(bigPicture, this.f2279c);
            }
            if (i10 >= 31) {
                c.m2245a(bigPicture, this.f2228h);
            }
        }

        @Override // androidx.core.app.AbstractC0517l.f
        /* renamed from: c */
        protected String mo2239c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public b m2240h(Bitmap bitmap) {
            IconCompat m2358b;
            if (bitmap == null) {
                m2358b = null;
            } else {
                m2358b = IconCompat.m2358b(bitmap);
            }
            this.f2226f = m2358b;
            this.f2227g = true;
            return this;
        }

        /* renamed from: i */
        public b m2241i(Bitmap bitmap) {
            this.f2225e = bitmap;
            return this;
        }
    }

    /* renamed from: androidx.core.app.l$c */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        private CharSequence f2229e;

        @Override // androidx.core.app.AbstractC0517l.f
        /* renamed from: a */
        public void mo2246a(Bundle bundle) {
            super.mo2246a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2229e);
            }
        }

        @Override // androidx.core.app.AbstractC0517l.f
        /* renamed from: b */
        public void mo2238b(InterfaceC0515k interfaceC0515k) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC0515k.mo2225a()).setBigContentTitle(this.f2278b).bigText(this.f2229e);
            if (this.f2280d) {
                bigText.setSummaryText(this.f2279c);
            }
        }

        @Override // androidx.core.app.AbstractC0517l.f
        /* renamed from: c */
        protected String mo2239c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public c m2247h(CharSequence charSequence) {
            this.f2229e = e.m2249d(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.l$d */
    /* loaded from: classes.dex */
    public static final class d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m2248a(d dVar) {
            return null;
        }
    }

    /* renamed from: androidx.core.app.l$f */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        protected e f2277a;

        /* renamed from: b */
        CharSequence f2278b;

        /* renamed from: c */
        CharSequence f2279c;

        /* renamed from: d */
        boolean f2280d = false;

        /* renamed from: a */
        public void mo2246a(Bundle bundle) {
            if (this.f2280d) {
                bundle.putCharSequence("android.summaryText", this.f2279c);
            }
            CharSequence charSequence = this.f2278b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo2239c = mo2239c();
            if (mo2239c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo2239c);
            }
        }

        /* renamed from: b */
        public abstract void mo2238b(InterfaceC0515k interfaceC0515k);

        /* renamed from: c */
        protected abstract String mo2239c();

        /* renamed from: d */
        public RemoteViews m2276d(InterfaceC0515k interfaceC0515k) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m2277e(InterfaceC0515k interfaceC0515k) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m2278f(InterfaceC0515k interfaceC0515k) {
            return null;
        }

        /* renamed from: g */
        public void m2279g(e eVar) {
            if (this.f2277a != eVar) {
                this.f2277a = eVar;
                if (eVar != null) {
                    eVar.m2272w(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2227a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: androidx.core.app.l$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: A */
        boolean f2230A;

        /* renamed from: B */
        boolean f2231B;

        /* renamed from: C */
        String f2232C;

        /* renamed from: D */
        Bundle f2233D;

        /* renamed from: E */
        int f2234E;

        /* renamed from: F */
        int f2235F;

        /* renamed from: G */
        Notification f2236G;

        /* renamed from: H */
        RemoteViews f2237H;

        /* renamed from: I */
        RemoteViews f2238I;

        /* renamed from: J */
        RemoteViews f2239J;

        /* renamed from: K */
        String f2240K;

        /* renamed from: L */
        int f2241L;

        /* renamed from: M */
        String f2242M;

        /* renamed from: N */
        long f2243N;

        /* renamed from: O */
        int f2244O;

        /* renamed from: P */
        int f2245P;

        /* renamed from: Q */
        boolean f2246Q;

        /* renamed from: R */
        Notification f2247R;

        /* renamed from: S */
        boolean f2248S;

        /* renamed from: T */
        Icon f2249T;

        /* renamed from: U */
        public ArrayList f2250U;

        /* renamed from: a */
        public Context f2251a;

        /* renamed from: b */
        public ArrayList f2252b;

        /* renamed from: c */
        public ArrayList f2253c;

        /* renamed from: d */
        ArrayList f2254d;

        /* renamed from: e */
        CharSequence f2255e;

        /* renamed from: f */
        CharSequence f2256f;

        /* renamed from: g */
        PendingIntent f2257g;

        /* renamed from: h */
        PendingIntent f2258h;

        /* renamed from: i */
        RemoteViews f2259i;

        /* renamed from: j */
        Bitmap f2260j;

        /* renamed from: k */
        CharSequence f2261k;

        /* renamed from: l */
        int f2262l;

        /* renamed from: m */
        int f2263m;

        /* renamed from: n */
        boolean f2264n;

        /* renamed from: o */
        boolean f2265o;

        /* renamed from: p */
        f f2266p;

        /* renamed from: q */
        CharSequence f2267q;

        /* renamed from: r */
        CharSequence f2268r;

        /* renamed from: s */
        CharSequence[] f2269s;

        /* renamed from: t */
        int f2270t;

        /* renamed from: u */
        int f2271u;

        /* renamed from: v */
        boolean f2272v;

        /* renamed from: w */
        String f2273w;

        /* renamed from: x */
        boolean f2274x;

        /* renamed from: y */
        String f2275y;

        /* renamed from: z */
        boolean f2276z;

        public e(Context context, String str) {
            this.f2252b = new ArrayList();
            this.f2253c = new ArrayList();
            this.f2254d = new ArrayList();
            this.f2264n = true;
            this.f2276z = false;
            this.f2234E = 0;
            this.f2235F = 0;
            this.f2241L = 0;
            this.f2244O = 0;
            this.f2245P = 0;
            Notification notification = new Notification();
            this.f2247R = notification;
            this.f2251a = context;
            this.f2240K = str;
            notification.when = System.currentTimeMillis();
            this.f2247R.audioStreamType = -1;
            this.f2263m = 0;
            this.f2250U = new ArrayList();
            this.f2246Q = true;
        }

        /* renamed from: d */
        protected static CharSequence m2249d(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: e */
        private Bitmap m2250e(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f2251a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double d10 = dimensionPixelSize;
                double max = Math.max(1, bitmap.getWidth());
                Double.isNaN(d10);
                Double.isNaN(max);
                double d11 = d10 / max;
                double d12 = dimensionPixelSize2;
                double max2 = Math.max(1, bitmap.getHeight());
                Double.isNaN(d12);
                Double.isNaN(max2);
                double min = Math.min(d11, d12 / max2);
                double width = bitmap.getWidth();
                Double.isNaN(width);
                int ceil = (int) Math.ceil(width * min);
                double height = bitmap.getHeight();
                Double.isNaN(height);
                return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
            }
            return bitmap;
        }

        /* renamed from: n */
        private void m2251n(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f2247R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f2247R;
                notification2.flags = (i10 ^ (-1)) & notification2.flags;
            }
        }

        /* renamed from: A */
        public e m2252A(long j10) {
            this.f2247R.when = j10;
            return this;
        }

        /* renamed from: a */
        public e m2253a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2252b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification m2254b() {
            return new C0544y0(this).m2310c();
        }

        /* renamed from: c */
        public Bundle m2255c() {
            if (this.f2233D == null) {
                this.f2233D = new Bundle();
            }
            return this.f2233D;
        }

        /* renamed from: f */
        public e m2256f(boolean z10) {
            m2251n(16, z10);
            return this;
        }

        /* renamed from: g */
        public e m2257g(String str) {
            this.f2240K = str;
            return this;
        }

        /* renamed from: h */
        public e m2258h(int i10) {
            this.f2234E = i10;
            return this;
        }

        /* renamed from: i */
        public e m2259i(PendingIntent pendingIntent) {
            this.f2257g = pendingIntent;
            return this;
        }

        /* renamed from: j */
        public e m2260j(CharSequence charSequence) {
            this.f2256f = m2249d(charSequence);
            return this;
        }

        /* renamed from: k */
        public e m2261k(CharSequence charSequence) {
            this.f2255e = m2249d(charSequence);
            return this;
        }

        /* renamed from: l */
        public e m2262l(int i10) {
            Notification notification = this.f2247R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: m */
        public e m2263m(PendingIntent pendingIntent) {
            this.f2247R.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: o */
        public e m2264o(Bitmap bitmap) {
            this.f2260j = m2250e(bitmap);
            return this;
        }

        /* renamed from: p */
        public e m2265p(int i10, int i11, int i12) {
            int i13;
            Notification notification = this.f2247R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            if (i11 != 0 && i12 != 0) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            notification.flags = i13 | (notification.flags & (-2));
            return this;
        }

        /* renamed from: q */
        public e m2266q(boolean z10) {
            this.f2276z = z10;
            return this;
        }

        /* renamed from: r */
        public e m2267r(int i10) {
            this.f2262l = i10;
            return this;
        }

        /* renamed from: s */
        public e m2268s(int i10) {
            this.f2263m = i10;
            return this;
        }

        /* renamed from: t */
        public e m2269t(boolean z10) {
            this.f2264n = z10;
            return this;
        }

        /* renamed from: u */
        public e m2270u(int i10) {
            this.f2247R.icon = i10;
            return this;
        }

        /* renamed from: v */
        public e m2271v(Uri uri) {
            AudioAttributes.Builder contentType;
            AudioAttributes.Builder usage;
            AudioAttributes build;
            Notification notification = this.f2247R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                contentType = new AudioAttributes.Builder().setContentType(4);
                usage = contentType.setUsage(5);
                build = usage.build();
                notification.audioAttributes = build;
            }
            return this;
        }

        /* renamed from: w */
        public e m2272w(f fVar) {
            if (this.f2266p != fVar) {
                this.f2266p = fVar;
                if (fVar != null) {
                    fVar.m2279g(this);
                }
            }
            return this;
        }

        /* renamed from: x */
        public e m2273x(CharSequence charSequence) {
            this.f2247R.tickerText = m2249d(charSequence);
            return this;
        }

        /* renamed from: y */
        public e m2274y(long[] jArr) {
            this.f2247R.vibrate = jArr;
            return this;
        }

        /* renamed from: z */
        public e m2275z(int i10) {
            this.f2235F = i10;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
