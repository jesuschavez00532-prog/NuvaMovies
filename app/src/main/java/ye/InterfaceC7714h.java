package ye;

import android.os.Looper;

/* renamed from: ye.h */
/* loaded from: classes3.dex */
public interface InterfaceC7714h {

    /* renamed from: ye.h$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC7714h {

        /* renamed from: a */
        private final Looper f28372a;

        public a(Looper looper) {
            this.f28372a = looper;
        }

        @Override // ye.InterfaceC7714h
        /* renamed from: a */
        public InterfaceC7718l mo29818a(C7709c c7709c) {
            return new HandlerC7712f(c7709c, this.f28372a, 10);
        }

        @Override // ye.InterfaceC7714h
        /* renamed from: b */
        public boolean mo29819b() {
            if (this.f28372a == Looper.myLooper()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    InterfaceC7718l mo29818a(C7709c c7709c);

    /* renamed from: b */
    boolean mo29819b();
}
