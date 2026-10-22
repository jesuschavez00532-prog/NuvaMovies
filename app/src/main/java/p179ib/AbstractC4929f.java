package p179ib;

import android.app.Notification;
import android.content.Context;
import android.util.Log;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;
import com.umeng.message.UTrack;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.entity.UMessage;
import p194jb.AbstractC5046a;
import p194jb.AbstractC5047b;

/* renamed from: ib.f */
/* loaded from: classes.dex */
public abstract class AbstractC4929f {

    /* renamed from: a */
    private static final String f20502a = "f";

    /* renamed from: b */
    protected static Context f20503b;

    /* renamed from: c */
    protected static C4925b f20504c;

    /* renamed from: d */
    protected static AbstractC4928e f20505d;

    /* renamed from: e */
    private static int f20506e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ib.f$a */
    /* loaded from: classes2.dex */
    public class a extends UmengMessageHandler {
        a() {
        }

        @Override // com.umeng.message.UmengMessageHandler
        public void dealWithCustomMessage(Context context, UMessage uMessage) {
            UTrack.getInstance(context.getApplicationContext()).trackMsgClick(uMessage);
            AbstractC4929f.f20504c.m20230a(AbstractC4929f.f20503b, uMessage);
            AbstractC4928e abstractC4928e = AbstractC4929f.f20505d;
            if (abstractC4928e != null) {
                abstractC4928e.m20247a(context, uMessage);
            }
        }

        @Override // com.umeng.message.UmengMessageHandler
        public void dealWithNotificationMessage(Context context, UMessage uMessage) {
            AbstractC4929f.f20504c.m20231b(AbstractC4929f.f20503b, uMessage);
            AbstractC4928e abstractC4928e = AbstractC4929f.f20505d;
            if (abstractC4928e != null) {
                abstractC4928e.m20248b(context, uMessage);
            }
        }

        @Override // com.umeng.message.UmengMessageHandler
        public Notification getNotification(Context context, UMessage uMessage) {
            AbstractC4928e abstractC4928e = AbstractC4929f.f20505d;
            if (abstractC4928e != null) {
                return abstractC4928e.m20249c(context, uMessage);
            }
            return super.getNotification(context, uMessage);
        }

        @Override // com.umeng.message.UmengMessageHandler, com.umeng.message.api.UPushMessageHandler
        public void handleMessage(Context context, UMessage uMessage) {
            AbstractC4928e abstractC4928e = AbstractC4929f.f20505d;
            if (abstractC4928e != null) {
                abstractC4928e.mo20250d(context, uMessage);
            }
            super.handleMessage(context, uMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ib.f$b */
    /* loaded from: classes2.dex */
    public class b extends UmengMessageHandler {
        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ib.f$c */
    /* loaded from: classes2.dex */
    public class c implements IUmengRegisterCallback {

        /* renamed from: a */
        final /* synthetic */ d f20507a;

        /* renamed from: b */
        final /* synthetic */ PushAgent f20508b;

        c(d dVar, PushAgent pushAgent) {
            this.f20507a = dVar;
            this.f20508b = pushAgent;
        }

        @Override // com.umeng.message.api.UPushRegisterCallback
        public void onFailure(String str, String str2) {
            Log.i(AbstractC4929f.f20502a, "register failed: " + str + " " + str2);
            d dVar = this.f20507a;
            if (dVar != null) {
                dVar.mo20260a(this.f20508b, str, str2);
            }
        }

        @Override // com.umeng.message.api.UPushRegisterCallback
        public void onSuccess(String str) {
            Log.i(AbstractC4929f.f20502a, "device token: " + str);
            d dVar = this.f20507a;
            if (dVar != null) {
                dVar.mo20261d(this.f20508b, str);
            }
        }
    }

    /* renamed from: ib.f$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo20260a(PushAgent pushAgent, String str, String str2);

        /* renamed from: d */
        void mo20261d(PushAgent pushAgent, String str);

        /* renamed from: e */
        void mo20262e(PushAgent pushAgent);
    }

    /* renamed from: b */
    public static int m20252b() {
        return f20506e;
    }

    /* renamed from: c */
    public static void m20253c(String str, String str2, EnumC4924a enumC4924a, String str3, d dVar, String str4) {
        f20504c = new C4925b();
        m20259i(f20503b);
        UMConfigure.init(f20503b, str, str2, enumC4924a.m20229b(), str3);
        m20254d(f20503b, dVar, str4);
    }

    /* renamed from: d */
    private static void m20254d(Context context, d dVar, String str) {
        PushAgent pushAgent = PushAgent.getInstance(context);
        if (str != null) {
            pushAgent.setResourcePackageName(str);
        }
        if (dVar != null) {
            dVar.mo20262e(pushAgent);
        }
        pushAgent.setNotificationPlaySound(2);
        pushAgent.setMessageHandler(new a());
        pushAgent.setNotificationClickHandler(new b());
        pushAgent.register(new c(dVar, pushAgent));
    }

    /* renamed from: e */
    public static void m20255e(Context context) {
        PushAgent.getInstance(context).onAppStart();
    }

    /* renamed from: f */
    public static void m20256f(Context context, String str, String str2) {
        f20503b = context.getApplicationContext();
        UMConfigure.preInit(context, str, str2);
    }

    /* renamed from: g */
    public static void m20257g(boolean z10) {
        C4925b c4925b = f20504c;
        if (c4925b != null) {
            c4925b.m20233d(z10);
            return;
        }
        throw new NullPointerException("please before use init method!!!");
    }

    /* renamed from: h */
    public static void m20258h(AbstractC4928e abstractC4928e) {
        f20505d = abstractC4928e;
    }

    /* renamed from: i */
    private static void m20259i(Context context) {
        int m20500b = AbstractC5047b.m20500b(context);
        int m20495b = AbstractC5046a.m20495b(context);
        f20506e = m20495b;
        if (m20495b != m20500b) {
            AbstractC5046a.m20494a(context);
            AbstractC5046a.m20498e(context, m20500b);
        }
    }
}
