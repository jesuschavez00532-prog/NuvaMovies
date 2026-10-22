package p243n1;

import java.io.File;
import p243n1.InterfaceC5723a;

/* renamed from: n1.d */
/* loaded from: classes.dex */
public abstract class AbstractC5726d implements InterfaceC5723a.a {

    /* renamed from: a */
    private final long f22993a;

    /* renamed from: b */
    private final a f22994b;

    /* renamed from: n1.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        File mo23124a();
    }

    public AbstractC5726d(a aVar, long j10) {
        this.f22993a = j10;
        this.f22994b = aVar;
    }

    @Override // p243n1.InterfaceC5723a.a
    /* renamed from: a */
    public InterfaceC5723a mo23119a() {
        File mo23124a = this.f22994b.mo23124a();
        if (mo23124a == null) {
            return null;
        }
        if (!mo23124a.isDirectory() && !mo23124a.mkdirs()) {
            return null;
        }
        return C5727e.m23125c(mo23124a, this.f22993a);
    }
}
