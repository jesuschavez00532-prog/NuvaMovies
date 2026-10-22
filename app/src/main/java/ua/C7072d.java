package ua;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import be.C1318n;
import be.C1328x;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import me.InterfaceC5665q;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;

/* renamed from: ua.d */
/* loaded from: classes2.dex */
public final class C7072d extends BroadcastReceiver {

    /* renamed from: a */
    private final String f26502a = C7072d.class.getSimpleName();

    /* renamed from: b */
    private InterfaceC5665q f26503b;

    /* renamed from: ua.d$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Intent f26504a;

        /* renamed from: b */
        final /* synthetic */ C7072d f26505b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Intent intent, C7072d c7072d) {
            super(1);
            this.f26504a = intent;
            this.f26505b = c7072d;
        }

        /* renamed from: a */
        public final void m27239a(Long l10) {
            String str;
            ArrayList<C1318n> mo19982e;
            Uri data = this.f26504a.getData();
            Object obj = "";
            if (data == null || (str = data.getPath()) == null) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
                boolean z10 = false;
                if (m19921b != null && (mo19982e = m19921b.mo19982e()) != null) {
                    for (C1318n c1318n : mo19982e) {
                        if (AbstractC5868k.m23669a(str, c1318n.m5970d())) {
                            obj = c1318n.m5969c();
                            z10 = true;
                        }
                    }
                }
                InterfaceC5665q m27237b = this.f26505b.m27237b();
                if (m27237b != null) {
                    m27237b.mo12281b(Boolean.valueOf(z10), obj, str);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27239a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m27236c(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: b */
    public final InterfaceC5665q m27237b() {
        return this.f26503b;
    }

    /* renamed from: d */
    public final void m27238d(InterfaceC5665q interfaceC5665q) {
        this.f26503b = interfaceC5665q;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(intent, "intent");
        if (AbstractC5868k.m23669a(intent.getAction(), "android.intent.action.MEDIA_MOUNTED")) {
            Observable<Long> timer = Observable.timer(100L, TimeUnit.MILLISECONDS);
            final a aVar = new a(intent, this);
            timer.subscribe(new Consumer() { // from class: ua.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7072d.m27236c(InterfaceC5660l.this, obj);
                }
            });
            return;
        }
        if (!AbstractC5868k.m23669a(intent.getAction(), "android.intent.action.MEDIA_UNMOUNTED") && !AbstractC5868k.m23669a(intent.getAction(), "android.intent.action.MEDIA_REMOVED")) {
            if (AbstractC5868k.m23669a(intent.getAction(), "android.intent.action.MEDIA_EJECT")) {
                Uri data = intent.getData();
                if (data == null || (str2 = data.getPath()) == null) {
                    str2 = "";
                }
                InterfaceC5665q interfaceC5665q = this.f26503b;
                if (interfaceC5665q != null) {
                    interfaceC5665q.mo12281b(Boolean.FALSE, "", str2);
                    return;
                }
                return;
            }
            return;
        }
        Uri data2 = intent.getData();
        if (data2 == null || (str = data2.getPath()) == null) {
            str = "";
        }
        InterfaceC5665q interfaceC5665q2 = this.f26503b;
        if (interfaceC5665q2 != null) {
            interfaceC5665q2.mo12281b(Boolean.FALSE, "", str);
        }
    }
}
