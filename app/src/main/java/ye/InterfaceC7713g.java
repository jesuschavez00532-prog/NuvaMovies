package ye;

import android.os.Looper;
import java.util.logging.Level;
import p434ze.C7790a;

/* renamed from: ye.g */
/* loaded from: classes3.dex */
public interface InterfaceC7713g {

    /* renamed from: ye.g$a */
    /* loaded from: classes3.dex */
    public static class a {
        /* renamed from: a */
        public static InterfaceC7713g m29816a() {
            if (C7790a.m30173c() && m29817b() != null) {
                return new C7790a("EventBus");
            }
            return new b();
        }

        /* renamed from: b */
        static Object m29817b() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* renamed from: ye.g$b */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC7713g {
        @Override // ye.InterfaceC7713g
        /* renamed from: a */
        public void mo29814a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // ye.InterfaceC7713g
        /* renamed from: b */
        public void mo29815b(Level level, String str, Throwable th) {
            System.out.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    /* renamed from: a */
    void mo29814a(Level level, String str);

    /* renamed from: b */
    void mo29815b(Level level, String str, Throwable th);
}
