package p242n0;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import anet.channel.entity.EventType;
import be.C1328x;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3384f;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p003a2.AbstractC0005a;
import p003a2.InterfaceC0011g;
import p022b2.InterfaceC1042j;
import p093d2.C3922a;
import p140g1.C4334b;
import p184j1.EnumC4970a;
import p216l1.AbstractC5323j;
import p216l1.C5330q;
import p242n0.C5715b;
import p243n1.C5733k;
import p359ue.AbstractC7166t;
import p375w1.C7346c;

/* renamed from: n0.b */
/* loaded from: classes.dex */
public final class C5715b {

    /* renamed from: a */
    public static final C5715b f22948a = new C5715b();

    /* renamed from: b */
    private static final String f22949b = C5715b.class.getSimpleName();

    /* renamed from: c */
    private static final String f22950c = "image_manager_ad";

    /* renamed from: d */
    private static final long f22951d = 31457280;

    /* renamed from: e */
    private static volatile C4334b f22952e;

    /* renamed from: n0.b$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0011g {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5660l f22953a;

        /* renamed from: b */
        final /* synthetic */ int f22954b;

        a(InterfaceC5660l interfaceC5660l, int i10) {
            this.f22953a = interfaceC5660l;
            this.f22954b = i10;
        }

        @Override // p003a2.InterfaceC0011g
        /* renamed from: a */
        public boolean mo101a(C5330q c5330q, Object obj, InterfaceC1042j interfaceC1042j, boolean z10) {
            AbstractC5868k.m23674f(interfaceC1042j, "target");
            InterfaceC5660l interfaceC5660l = this.f22953a;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.FALSE);
                return false;
            }
            return false;
        }

        @Override // p003a2.InterfaceC0011g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo102b(C7346c c7346c, Object obj, InterfaceC1042j interfaceC1042j, EnumC4970a enumC4970a, boolean z10) {
            AbstractC5868k.m23674f(c7346c, "resource");
            AbstractC5868k.m23674f(obj, Constants.KEY_MODEL);
            AbstractC5868k.m23674f(enumC4970a, "dataSource");
            int i10 = this.f22954b;
            if (i10 > 0) {
                c7346c.m28352n(i10);
            }
            InterfaceC5660l interfaceC5660l = this.f22953a;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.TRUE);
                return false;
            }
            return false;
        }
    }

    /* renamed from: n0.b$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0011g {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5660l f22955a;

        b(InterfaceC5660l interfaceC5660l) {
            this.f22955a = interfaceC5660l;
        }

        @Override // p003a2.InterfaceC0011g
        /* renamed from: a */
        public boolean mo101a(C5330q c5330q, Object obj, InterfaceC1042j interfaceC1042j, boolean z10) {
            AbstractC5868k.m23674f(interfaceC1042j, "target");
            InterfaceC5660l interfaceC5660l = this.f22955a;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.FALSE);
                return false;
            }
            return false;
        }

        @Override // p003a2.InterfaceC0011g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo102b(Drawable drawable, Object obj, InterfaceC1042j interfaceC1042j, EnumC4970a enumC4970a, boolean z10) {
            AbstractC5868k.m23674f(drawable, "resource");
            AbstractC5868k.m23674f(obj, Constants.KEY_MODEL);
            AbstractC5868k.m23674f(enumC4970a, "dataSource");
            InterfaceC5660l interfaceC5660l = this.f22955a;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.TRUE);
                return false;
            }
            return false;
        }
    }

    /* renamed from: n0.b$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC0011g {

        /* renamed from: a */
        final /* synthetic */ String f22956a;

        /* renamed from: b */
        final /* synthetic */ ImageView f22957b;

        /* renamed from: c */
        final /* synthetic */ Context f22958c;

        /* renamed from: d */
        final /* synthetic */ Integer f22959d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC5660l f22960e;

        /* renamed from: f */
        final /* synthetic */ Integer f22961f;

        /* renamed from: g */
        final /* synthetic */ boolean f22962g;

        /* renamed from: h */
        final /* synthetic */ int f22963h;

        c(String str, ImageView imageView, Context context, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10, int i10) {
            this.f22956a = str;
            this.f22957b = imageView;
            this.f22958c = context;
            this.f22959d = num;
            this.f22960e = interfaceC5660l;
            this.f22961f = num2;
            this.f22962g = z10;
            this.f22963h = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m23106d(Context context, ImageView imageView, String str, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10) {
            AbstractC5868k.m23674f(context, "$context");
            AbstractC5868k.m23674f(imageView, "$iv");
            AbstractC5868k.m23674f(str, "$url");
            C5715b.m23097g(C5715b.f22948a, context, imageView, str, num, interfaceC5660l, num2, z10, 0, 128, null);
        }

        @Override // p003a2.InterfaceC0011g
        /* renamed from: a */
        public boolean mo101a(C5330q c5330q, Object obj, InterfaceC1042j interfaceC1042j, boolean z10) {
            AbstractC5868k.m23674f(interfaceC1042j, "target");
            final ImageView imageView = this.f22957b;
            final Context context = this.f22958c;
            final String str = this.f22956a;
            final Integer num = this.f22959d;
            final InterfaceC5660l interfaceC5660l = this.f22960e;
            final Integer num2 = this.f22961f;
            final boolean z11 = this.f22962g;
            imageView.post(new Runnable() { // from class: n0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5715b.c.m23106d(context, imageView, str, num, interfaceC5660l, num2, z11);
                }
            });
            return false;
        }

        @Override // p003a2.InterfaceC0011g
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo102b(C7346c c7346c, Object obj, InterfaceC1042j interfaceC1042j, EnumC4970a enumC4970a, boolean z10) {
            AbstractC5868k.m23674f(c7346c, "resource");
            AbstractC5868k.m23674f(obj, Constants.KEY_MODEL);
            AbstractC5868k.m23674f(interfaceC1042j, "target");
            AbstractC5868k.m23674f(enumC4970a, "dataSource");
            int i10 = this.f22963h;
            if (i10 > 0) {
                c7346c.m28352n(i10);
            }
            InterfaceC5660l interfaceC5660l = this.f22960e;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.TRUE);
                return false;
            }
            return false;
        }
    }

    /* renamed from: n0.b$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0011g {

        /* renamed from: a */
        final /* synthetic */ String f22964a;

        /* renamed from: b */
        final /* synthetic */ ImageView f22965b;

        /* renamed from: c */
        final /* synthetic */ Context f22966c;

        /* renamed from: d */
        final /* synthetic */ Integer f22967d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC5660l f22968e;

        /* renamed from: f */
        final /* synthetic */ Integer f22969f;

        /* renamed from: g */
        final /* synthetic */ boolean f22970g;

        d(String str, ImageView imageView, Context context, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10) {
            this.f22964a = str;
            this.f22965b = imageView;
            this.f22966c = context;
            this.f22967d = num;
            this.f22968e = interfaceC5660l;
            this.f22969f = num2;
            this.f22970g = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m23109d(Context context, ImageView imageView, String str, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10) {
            AbstractC5868k.m23674f(context, "$context");
            AbstractC5868k.m23674f(imageView, "$iv");
            AbstractC5868k.m23674f(str, "$url");
            C5715b.m23097g(C5715b.f22948a, context, imageView, str, num, interfaceC5660l, num2, z10, 0, 128, null);
        }

        @Override // p003a2.InterfaceC0011g
        /* renamed from: a */
        public boolean mo101a(C5330q c5330q, Object obj, InterfaceC1042j interfaceC1042j, boolean z10) {
            AbstractC5868k.m23674f(interfaceC1042j, "target");
            final ImageView imageView = this.f22965b;
            final Context context = this.f22966c;
            final String str = this.f22964a;
            final Integer num = this.f22967d;
            final InterfaceC5660l interfaceC5660l = this.f22968e;
            final Integer num2 = this.f22969f;
            final boolean z11 = this.f22970g;
            imageView.post(new Runnable() { // from class: n0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5715b.d.m23109d(context, imageView, str, num, interfaceC5660l, num2, z11);
                }
            });
            return false;
        }

        @Override // p003a2.InterfaceC0011g
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo102b(Drawable drawable, Object obj, InterfaceC1042j interfaceC1042j, EnumC4970a enumC4970a, boolean z10) {
            AbstractC5868k.m23674f(drawable, "resource");
            AbstractC5868k.m23674f(obj, Constants.KEY_MODEL);
            AbstractC5868k.m23674f(interfaceC1042j, "target");
            AbstractC5868k.m23674f(enumC4970a, "dataSource");
            InterfaceC5660l interfaceC5660l = this.f22968e;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.TRUE);
                return false;
            }
            return false;
        }
    }

    private C5715b() {
    }

    /* renamed from: c */
    private final C4334b m23095c(Context context) {
        if (f22952e == null) {
            synchronized (C5715b.class) {
                if (f22952e == null) {
                    f22952e = C4334b.m18152B(new File(context.getCacheDir(), f22950c), 1, 1, f22951d);
                }
                C1328x c1328x = C1328x.f4998a;
            }
        }
        C4334b c4334b = f22952e;
        AbstractC5868k.m23671c(c4334b);
        return c4334b;
    }

    /* renamed from: f */
    private final void m23096f(Context context, ImageView imageView, String str, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10, int i10) {
        boolean m27722i;
        if (!m23098a(context)) {
            m27722i = AbstractC7166t.m27722i(str, ".gif", false, 2, null);
            if (m27722i) {
                C1596k mo7367H0 = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext()).mo7379d().mo7367H0(AbstractC5720g.m23113a(str));
                AbstractC5868k.m23673e(mo7367H0, "with(context.application…().load(url.toGlideUrl())");
                if (num2 != null) {
                    AbstractC0005a mo46b0 = mo7367H0.mo46b0(num2.intValue(), num2.intValue());
                    AbstractC5868k.m23673e(mo46b0, "requestBuilder.override(size,size)");
                    mo7367H0 = (C1596k) mo46b0;
                }
                if (z10) {
                    AbstractC0005a mo54h = mo7367H0.mo54h();
                    AbstractC5868k.m23673e(mo54h, "requestBuilder.dontAnimate()");
                    mo7367H0 = (C1596k) mo54h;
                }
                if (num != null) {
                    AbstractC0005a mo57j = ((C1596k) mo7367H0.mo47c0(num.intValue())).mo57j(num.intValue());
                    AbstractC5868k.m23673e(mo57j, "requestBuilder.placehold…urceId).error(resourceId)");
                    mo7367H0 = (C1596k) mo57j;
                }
                ((C1596k) mo7367H0.mo7371t0(new a(interfaceC5660l, i10)).mo53g(AbstractC5323j.f21746d)).m7365E0(imageView);
                return;
            }
            C1596k mo7387m = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext()).mo7387m(AbstractC5720g.m23113a(str));
            AbstractC5868k.m23673e(mo7387m, "with(context.application…t).load(url.toGlideUrl())");
            if (num2 != null) {
                AbstractC0005a mo46b02 = mo7387m.mo46b0(num2.intValue(), num2.intValue());
                AbstractC5868k.m23673e(mo46b02, "requestBuilder.override(size,size)");
                mo7387m = (C1596k) mo46b02;
            }
            if (z10) {
                AbstractC0005a mo54h2 = mo7387m.mo54h();
                AbstractC5868k.m23673e(mo54h2, "requestBuilder.dontAnimate()");
                mo7387m = (C1596k) mo54h2;
            }
            if (num != null) {
                AbstractC0005a mo57j2 = ((C1596k) mo7387m.mo47c0(num.intValue())).mo57j(num.intValue());
                AbstractC5868k.m23673e(mo57j2, "requestBuilder.placehold…urceId).error(resourceId)");
                mo7387m = (C1596k) mo57j2;
            }
            ((C1596k) mo7387m.mo7371t0(new b(interfaceC5660l)).mo53g(AbstractC5323j.f21746d)).m7365E0(imageView);
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m23097g(C5715b c5715b, Context context, ImageView imageView, String str, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10, int i10, int i11, Object obj) {
        Integer num3;
        InterfaceC5660l interfaceC5660l2;
        Integer num4;
        boolean z11;
        int i12;
        if ((i11 & 8) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i11 & 16) != 0) {
            interfaceC5660l2 = null;
        } else {
            interfaceC5660l2 = interfaceC5660l;
        }
        if ((i11 & 32) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i11 & 64) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 128) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        c5715b.m23096f(context, imageView, str, num3, interfaceC5660l2, num4, z11, i12);
    }

    /* renamed from: a */
    public final boolean m23098a(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final File m23099b(Context context, String str) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "url");
        C3922a m16760c = C3922a.m16760c();
        AbstractC5868k.m23673e(m16760c, "obtain()");
        try {
            C4334b.e m18176z = m23095c(context).m18176z(new C5733k().m23146b(new C5722i(str, m16760c)));
            if (m18176z != null) {
                return m18176z.m18198a(0);
            }
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public final void m23100d(Context context, String str, File file) {
        Throwable th;
        Exception e10;
        File m23099b;
        File m23099b2;
        BufferedOutputStream bufferedOutputStream;
        Throwable th2;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "url");
        if (file != null && !file.isDirectory()) {
            BufferedInputStream bufferedInputStream = null;
            try {
                try {
                    C3922a m16760c = C3922a.m16760c();
                    AbstractC5868k.m23673e(m16760c, "obtain()");
                    C4334b.c m18175t = m23095c(context).m18175t(new C5733k().m23146b(new C5722i(str, m16760c)));
                    if (m18175t != null) {
                        try {
                            try {
                                File m18183f = m18175t.m18183f(0);
                                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                                try {
                                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m18183f));
                                    try {
                                        byte[] bArr = new byte[EventType.AUTH_FAIL];
                                        while (true) {
                                            int read = bufferedInputStream2.read(bArr);
                                            if (read == -1) {
                                                break;
                                            } else {
                                                bufferedOutputStream.write(bArr, 0, read);
                                            }
                                        }
                                        bufferedOutputStream.flush();
                                        m18175t.m18182e();
                                        m18175t.m18181b();
                                        bufferedInputStream = bufferedInputStream2;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        m18175t.m18181b();
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    th2 = th;
                                    m18175t.m18181b();
                                    throw th2;
                                }
                            } catch (Exception e11) {
                                e10 = e11;
                                e10.printStackTrace();
                                C5719f c5719f = C5719f.f22985a;
                                c5719f.m23112a(null);
                                c5719f.m23112a(null);
                                String m23115b = AbstractC5721h.m23115b(file);
                                m23099b2 = m23099b(context, str);
                                if (m23099b2 == null || TextUtils.equals(m23115b, AbstractC5721h.m23115b(m23099b2))) {
                                    return;
                                }
                                m23099b2.delete();
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        bufferedOutputStream = null;
                    }
                    C5719f c5719f2 = C5719f.f22985a;
                    c5719f2.m23112a(bufferedInputStream);
                    c5719f2.m23112a(bufferedOutputStream);
                    String m23115b2 = AbstractC5721h.m23115b(file);
                    m23099b2 = m23099b(context, str);
                    if (m23099b2 == null || TextUtils.equals(m23115b2, AbstractC5721h.m23115b(m23099b2))) {
                        return;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    C5719f c5719f3 = C5719f.f22985a;
                    c5719f3.m23112a(null);
                    c5719f3.m23112a(null);
                    String m23115b3 = AbstractC5721h.m23115b(file);
                    m23099b = m23099b(context, str);
                    if (m23099b != null && !TextUtils.equals(m23115b3, AbstractC5721h.m23115b(m23099b))) {
                        m23099b.delete();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e10 = e12;
            } catch (Throwable th7) {
                th = th7;
                C5719f c5719f32 = C5719f.f22985a;
                c5719f32.m23112a(null);
                c5719f32.m23112a(null);
                String m23115b32 = AbstractC5721h.m23115b(file);
                m23099b = m23099b(context, str);
                if (m23099b != null) {
                    m23099b.delete();
                }
                throw th;
            }
            m23099b2.delete();
        }
    }

    /* renamed from: e */
    public final boolean m23101e(Context context, String str) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "url");
        File m23099b = m23099b(context, str);
        if (m23099b != null && !m23099b.isDirectory()) {
            return true;
        }
        try {
            if (m23098a(context)) {
                return false;
            }
            m23100d(context, str, (File) ComponentCallbacks2C1586c.m7282u(context.getApplicationContext()).mo7382h().mo7367H0(AbstractC5720g.m23113a(str)).m7369L0().get());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: h */
    public final void m23102h(Context context, ImageView imageView, String str, File file, Integer num, InterfaceC5660l interfaceC5660l, Integer num2, boolean z10, int i10) {
        boolean m27722i;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(imageView, "iv");
        AbstractC5868k.m23674f(str, "url");
        if (file != null && file.exists() && !file.isDirectory()) {
            if (!m23098a(context)) {
                m27722i = AbstractC7166t.m27722i(str, ".gif", false, 2, null);
                if (m27722i) {
                    AbstractC0005a mo65n0 = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext()).mo7379d().mo7366G0(file).mo65n0(0);
                    AbstractC5868k.m23673e(mo65n0, "with(context.application…().load(cache).timeout(0)");
                    C1596k c1596k = (C1596k) mo65n0;
                    if (num2 != null) {
                        AbstractC0005a mo46b0 = c1596k.mo46b0(num2.intValue(), num2.intValue());
                        AbstractC5868k.m23673e(mo46b0, "requestBuilder.override(size,size)");
                        c1596k = (C1596k) mo46b0;
                    }
                    if (z10) {
                        AbstractC0005a mo54h = c1596k.mo54h();
                        AbstractC5868k.m23673e(mo54h, "requestBuilder.dontAnimate()");
                        c1596k = (C1596k) mo54h;
                    }
                    if (num != null) {
                        AbstractC0005a mo57j = ((C1596k) c1596k.mo47c0(num.intValue())).mo57j(num.intValue());
                        AbstractC5868k.m23673e(mo57j, "requestBuilder.placehold…).error(placeholderResId)");
                        c1596k = (C1596k) mo57j;
                    }
                    c1596k.mo7371t0(new c(str, imageView, context, num, interfaceC5660l, num2, z10, i10)).m7365E0(imageView);
                    return;
                }
                C1596k mo7386l = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext()).mo7386l(file);
                AbstractC5868k.m23673e(mo7386l, "with(context.applicationContext).load(cache)");
                if (num2 != null) {
                    AbstractC0005a mo46b02 = mo7386l.mo46b0(num2.intValue(), num2.intValue());
                    AbstractC5868k.m23673e(mo46b02, "requestBuilder.override(size,size)");
                    mo7386l = (C1596k) mo46b02;
                }
                if (z10) {
                    AbstractC0005a mo54h2 = mo7386l.mo54h();
                    AbstractC5868k.m23673e(mo54h2, "requestBuilder.dontAnimate()");
                    mo7386l = (C1596k) mo54h2;
                }
                if (num != null) {
                    AbstractC0005a mo57j2 = ((C1596k) mo7386l.mo47c0(num.intValue())).mo57j(num.intValue());
                    AbstractC5868k.m23673e(mo57j2, "requestBuilder.placehold…).error(placeholderResId)");
                    mo7386l = (C1596k) mo57j2;
                }
                mo7386l.mo7371t0(new d(str, imageView, context, num, interfaceC5660l, num2, z10)).m7365E0(imageView);
                return;
            }
            return;
        }
        m23097g(this, context, imageView, str, num, interfaceC5660l, num2, z10, 0, 128, null);
    }
}
