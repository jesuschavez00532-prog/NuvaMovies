package ye;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: ye.f */
/* loaded from: classes3.dex */
public class HandlerC7712f extends Handler implements InterfaceC7718l {

    /* renamed from: a */
    private final C7717k f28368a;

    /* renamed from: b */
    private final int f28369b;

    /* renamed from: c */
    private final C7709c f28370c;

    /* renamed from: d */
    private boolean f28371d;

    /* JADX INFO: Access modifiers changed from: protected */
    public HandlerC7712f(C7709c c7709c, Looper looper, int i10) {
        super(looper);
        this.f28370c = c7709c;
        this.f28369b = i10;
        this.f28368a = new C7717k();
    }

    @Override // ye.InterfaceC7718l
    /* renamed from: a */
    public void mo29783a(C7723q c7723q, Object obj) {
        C7716j m29820a = C7716j.m29820a(c7723q, obj);
        synchronized (this) {
            this.f28368a.m29822a(m29820a);
            if (!this.f28371d) {
                this.f28371d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new C7711e("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C7716j m29823b = this.f28368a.m29823b();
                if (m29823b == null) {
                    synchronized (this) {
                        m29823b = this.f28368a.m29823b();
                        if (m29823b == null) {
                            return;
                        }
                    }
                }
                this.f28370c.m29798h(m29823b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f28369b);
            if (sendMessage(obtainMessage())) {
                this.f28371d = true;
                return;
            }
            throw new C7711e("Could not send handler message");
        } finally {
            this.f28371d = false;
        }
    }
}
