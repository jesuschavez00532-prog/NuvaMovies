package p258o3;

import android.content.Context;
import android.content.IntentFilter;
import be.C1328x;
import com.download.bean.UDiskBean;
import com.lzy.okgo.cookie.SerializableCookie;
import com.module.event.UsbChangedEvent;
import com.umeng.analytics.pro.C3384f;
import me.InterfaceC5665q;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p258o3.C5911g;
import ua.C7072d;
import ye.C7709c;

/* renamed from: o3.h */
/* loaded from: classes.dex */
public final class C5912h {

    /* renamed from: a */
    public static final C5912h f23531a = new C5912h();

    /* renamed from: b */
    private static C7072d f23532b;

    /* renamed from: o3.h$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5665q {

        /* renamed from: a */
        public static final a f23533a = new a();

        a() {
            super(3);
        }

        /* renamed from: a */
        public final void m23911a(boolean z10, String str, String str2) {
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            AbstractC5868k.m23674f(str2, "path");
            if (z10) {
                C5911g.f23514h.m23905a().m23892f(new UDiskBean(str, str2));
            } else {
                C5911g.f23514h.m23905a().m23902s(str2);
            }
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m23911a(((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
            return C1328x.f4998a;
        }
    }

    private C5912h() {
    }

    /* renamed from: a */
    public final void m23909a(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (f23532b == null) {
            C5911g.a aVar = C5911g.f23514h;
            aVar.m23905a().m23901r(context);
            f23532b = new C7072d();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addDataScheme("file");
            C7072d c7072d = f23532b;
            if (c7072d != null) {
                c7072d.m27238d(a.f23533a);
            }
            context.getApplicationContext().registerReceiver(f23532b, intentFilter);
            if (aVar.m23905a().m23900q()) {
                C7709c.m29787d().m29801m(new UsbChangedEvent());
            }
        }
    }

    /* renamed from: b */
    public final void m23910b(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        C7072d c7072d = f23532b;
        if (c7072d != null) {
            context.getApplicationContext().unregisterReceiver(c7072d);
            f23532b = null;
        }
    }
}
