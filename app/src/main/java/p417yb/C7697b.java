package p417yb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.util.HttpConstant;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.qiniu.android.dns.C3063a;
import com.umeng.analytics.pro.C3384f;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lb.C5540a;
import lb.C5541b;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import okhttp3.Dns;
import p043ce.AbstractC1494g;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1508t;
import p210kb.C5140a;
import p210kb.InterfaceC5142c;
import p210kb.InterfaceC5143d;
import p239mb.C5625a;
import p266ob.AbstractC5960d;
import p343tb.InterfaceC6930b;
import p348u2.AbstractC7030g;
import p355u9.AbstractC7062b;
import p356ub.AbstractC7073a;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p421z0.C7730d;

/* renamed from: yb.b */
/* loaded from: classes.dex */
public final class C7697b implements Dns {

    /* renamed from: g */
    private static C7697b f28152g;

    /* renamed from: h */
    private static Context f28153h;

    /* renamed from: a */
    private final String f28155a;

    /* renamed from: b */
    private final InterfaceC1312h f28156b;

    /* renamed from: c */
    private final InterfaceC1312h f28157c;

    /* renamed from: d */
    private C5140a f28158d;

    /* renamed from: e */
    private InterfaceC6930b f28159e;

    /* renamed from: f */
    public static final a f28151f = new a(null);

    /* renamed from: i */
    private static final Set f28154i = new LinkedHashSet();

    /* renamed from: yb.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C7697b m29575a() {
            if (C7697b.f28152g == null) {
                synchronized (C7697b.class) {
                    if (C7697b.f28152g == null) {
                        C7697b.f28152g = new C7697b(null);
                    }
                    C1328x c1328x = C1328x.f4998a;
                }
            }
            C7697b c7697b = C7697b.f28152g;
            AbstractC5868k.m23671c(c7697b);
            return c7697b;
        }

        /* renamed from: b */
        public final void m29576b(Context context) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            C7697b.f28153h = context.getApplicationContext();
        }
    }

    /* renamed from: yb.b$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f28160a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC5868k.m23669a(AbstractC5960d.m24119a("debug.dns.enable", "1"), "1"));
        }
    }

    /* renamed from: yb.b$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f28161a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC5868k.m23669a(AbstractC5960d.m24119a("debug.dns.filter", "1"), "1"));
        }
    }

    public /* synthetic */ C7697b(AbstractC5864g abstractC5864g) {
        this();
    }

    /* renamed from: e */
    private final boolean m29564e(String str) {
        String m27728o;
        String m27728o2;
        try {
            m27728o = AbstractC7166t.m27728o(str, ".", "", false, 4, null);
            m27728o2 = AbstractC7166t.m27728o(m27728o, ":", "", false, 4, null);
        } catch (MalformedURLException unused) {
        }
        if (!TextUtils.isDigitsOnly(m27728o2)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final List m29565f(List list, String str, String str2, String str3) {
        List m7001F;
        boolean z10;
        boolean z11;
        boolean z12;
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z13 = false;
        int i10 = 0;
        while (true) {
            boolean z14 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            byte[] address = ((InetAddress) next).getAddress();
            if (address != null && address.length == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                C5881x c5881x = C5881x.f23415a;
                String format = String.format("%03d.%03d.%03d.%03d", Arrays.copyOf(new Object[]{Integer.valueOf(address[0] & 255), Integer.valueOf(address[1] & 255), Integer.valueOf(address[2] & 255), Integer.valueOf(address[3] & 255)}, 4));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                if (("192.168.000.000".compareTo(format) > 0 || "192.168.255.255".compareTo(format) < 0) && !TextUtils.equals(format, "127.000.000.001") && !TextUtils.equals(format, "000.000.000.000") && !TextUtils.equals(format, "255.255.255.255")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (sb2.length() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        sb2.append(",");
                    }
                    String format2 = String.format("%d.%d.%d.%d(%d/%d)", Arrays.copyOf(new Object[]{Integer.valueOf(address[0] & 255), Integer.valueOf(address[1] & 255), Integer.valueOf(address[2] & 255), Integer.valueOf(address[3] & 255), Integer.valueOf(i11), Integer.valueOf(size)}, 6));
                    AbstractC5868k.m23673e(format2, "format(format, *args)");
                    sb2.append(format2);
                }
                z14 = z11;
            }
            if (z14) {
                arrayList.add(next);
            }
            i10 = i11;
        }
        m7001F = AbstractC1508t.m7001F(arrayList);
        if (sb2.length() > 0) {
            z13 = true;
        }
        if (z13) {
            String sb3 = sb2.toString();
            AbstractC5868k.m23673e(sb3, "filterDnsResult.toString()");
            m29571m(str, str2, sb3, str3);
        }
        return m7001F;
    }

    /* renamed from: g */
    private final InterfaceC5142c m29566g() {
        File file;
        boolean z10;
        Context context = f28153h;
        if (context != null) {
            file = context.getCacheDir();
        } else {
            file = null;
        }
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null && absolutePath.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return new C5540a(file.getAbsolutePath());
            }
        }
        return new C5541b();
    }

    /* renamed from: h */
    private final boolean m29567h() {
        return ((Boolean) this.f28156b.getValue()).booleanValue();
    }

    /* renamed from: i */
    private final boolean m29568i() {
        return ((Boolean) this.f28157c.getValue()).booleanValue();
    }

    /* renamed from: k */
    private final List m29569k(String str) {
        String[] strArr;
        boolean z10;
        List m6948a;
        try {
            C5140a c5140a = this.f28158d;
            if (c5140a != null) {
                strArr = c5140a.m20802e(str);
            } else {
                strArr = null;
            }
            if (strArr != null && strArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (strArr != null) {
                for (String str2 : strArr) {
                    InetAddress[] allByName = InetAddress.getAllByName(str2);
                    AbstractC5868k.m23673e(allByName, "getAllByName(it)");
                    m6948a = AbstractC1494g.m6948a(allByName);
                    arrayList.addAll(m6948a);
                }
            }
            return arrayList;
        } catch (IOException e10) {
            Log.w(this.f28155a, "query http dns exception and exception info is " + e10.getLocalizedMessage());
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    private final void m29570l(String str, String str2, String str3, String str4, String str5) {
        boolean m27763v;
        boolean m27763v2;
        m27763v = AbstractC7167u.m27763v(str5, ".bigbee", false, 2, null);
        if (!m27763v) {
            m27763v2 = AbstractC7167u.m27763v(str5, ".img", false, 2, null);
            if (m27763v2) {
                String str6 = str + str2 + str3;
                Set set = f28154i;
                if (!set.contains(str6)) {
                    set.add(str6);
                    HashMap hashMap = new HashMap();
                    hashMap.put("dns_type", str);
                    hashMap.put("domain|DES", str2);
                    hashMap.put("mapper", str3);
                    hashMap.put("resolver", str4);
                    C7730d.m29861b(C7730d.f28438a, "app_dns", hashMap, SystemClock.elapsedRealtime(), 0L, false, false, 56, null);
                    return;
                }
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("dns_type", str);
            hashMap2.put("domain|DES", str2);
            hashMap2.put("mapper", str3);
            hashMap2.put("resolver", str4);
            C7730d.m29861b(C7730d.f28438a, "app_dns", hashMap2, SystemClock.elapsedRealtime(), 0L, false, false, 56, null);
            return;
        }
        InterfaceC6930b interfaceC6930b = this.f28159e;
        if (interfaceC6930b != null) {
            interfaceC6930b.mo6921a(str, str2, str3, str4);
        }
    }

    /* renamed from: m */
    private final void m29571m(final String str, final String str2, final String str3, final String str4) {
        AbstractC7030g.m27129c("exception-dns", new Runnable() { // from class: yb.a
            @Override // java.lang.Runnable
            public final void run() {
                C7697b.m29572n(str, str2, this, str3, str4);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m29572n(String str, String str2, C7697b c7697b, String str3, String str4) {
        String str5;
        boolean z10;
        String str6;
        AbstractC5868k.m23674f(str, "$type");
        AbstractC5868k.m23674f(str2, "$hostname");
        AbstractC5868k.m23674f(c7697b, "this$0");
        AbstractC5868k.m23674f(str3, "$mapper");
        AbstractC5868k.m23674f(str4, "$alias");
        if (AbstractC5868k.m23669a(str, "system")) {
            str5 = AbstractC5960d.m24119a("net.dns1", "") + ',' + AbstractC5960d.m24119a("net.dns2", "");
        } else {
            str5 = "google";
        }
        String str7 = str5;
        String m27213a = AbstractC7062b.m27213a(str2, AbstractC7073a.f26506a);
        if (m27213a != null && m27213a.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            str6 = str2;
        } else {
            str6 = m27213a;
        }
        AbstractC5868k.m23673e(str6, "hostnameMapper");
        c7697b.m29570l(str, str6, str3, str7, str4);
    }

    /* renamed from: j */
    public final List m29573j(String str, String str2) {
        List m29569k;
        boolean z10;
        AbstractC5868k.m23674f(str, "hostname");
        AbstractC5868k.m23674f(str2, "alias");
        try {
            List<InetAddress> lookup = Dns.SYSTEM.lookup(str);
            if (lookup != null && !lookup.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (m29564e(str)) {
                    AbstractC5868k.m23673e(lookup, "lookupList");
                    return lookup;
                }
                if (m29568i()) {
                    AbstractC5868k.m23673e(lookup, "lookupList");
                    lookup = m29565f(lookup, "system", str, str2);
                    if (lookup.isEmpty()) {
                        throw new UnknownHostException("system dns lookup empty list.(" + str + ')');
                    }
                }
                AbstractC5868k.m23673e(lookup, "lookupList");
                return lookup;
            }
            throw new UnknownHostException("system dns lookup empty list.(" + str + ')');
        } catch (UnknownHostException e10) {
            e10.printStackTrace();
            if (this.f28158d != null && !m29564e(str)) {
                if (m29567h() && (m29569k = m29569k(str)) != null) {
                    if (true ^ m29569k.isEmpty()) {
                        return m29565f(m29569k, HttpConstant.HTTP, str, str2);
                    }
                    return m29569k;
                }
                throw new UnknownHostException("unknown host name(" + str + ')');
            }
            throw e10;
        }
    }

    @Override // okhttp3.Dns
    public List lookup(String str) {
        AbstractC5868k.m23674f(str, "hostname");
        List<InetAddress> lookup = Dns.SYSTEM.lookup(str);
        AbstractC5868k.m23673e(lookup, "SYSTEM.lookup(hostname)");
        return lookup;
    }

    /* renamed from: o */
    public final void m29574o(InterfaceC6930b interfaceC6930b) {
        AbstractC5868k.m23674f(interfaceC6930b, "listener");
        this.f28159e = interfaceC6930b;
    }

    private C7697b() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        this.f28155a = C7697b.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(b.f28160a);
        this.f28156b = m5965b;
        m5965b2 = AbstractC1314j.m5965b(c.f28161a);
        this.f28157c = m5965b2;
        this.f28158d = new C5140a(C3063a.f12569d, new InterfaceC5143d[]{new C5625a()}, m29566g());
    }
}
