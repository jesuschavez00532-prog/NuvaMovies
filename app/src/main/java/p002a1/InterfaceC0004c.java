package p002a1;

import com.bigbee.p049db.EventDbModel;

/* renamed from: a1.c */
/* loaded from: classes.dex */
public interface InterfaceC0004c {

    /* renamed from: a1.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m15a(InterfaceC0004c interfaceC0004c, InterfaceC0003b interfaceC0003b, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    interfaceC0003b = null;
                }
                interfaceC0004c.mo7a(interfaceC0003b);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
    }

    /* renamed from: a */
    void mo7a(InterfaceC0003b interfaceC0003b);

    /* renamed from: b */
    void mo8b(EventDbModel eventDbModel);

    /* renamed from: c */
    void mo9c(EventDbModel eventDbModel);
}
