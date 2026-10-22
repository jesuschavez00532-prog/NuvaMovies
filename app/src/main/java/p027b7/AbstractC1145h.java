package p027b7;

import android.content.Context;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;

/* renamed from: b7.h */
/* loaded from: classes.dex */
public abstract class AbstractC1145h {

    /* renamed from: b7.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        String mo5205a(Object obj);
    }

    /* renamed from: b */
    public static C7216d m5202b(String str, String str2) {
        return C7216d.m27911j(AbstractC1143f.m5200a(str, str2), AbstractC1143f.class);
    }

    /* renamed from: c */
    public static C7216d m5203c(final String str, final a aVar) {
        return C7216d.m27912k(AbstractC1143f.class).m27929b(C7233r.m27995j(Context.class)).m27933f(new InterfaceC7223h() { // from class: b7.g
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                AbstractC1143f m5204d;
                m5204d = AbstractC1145h.m5204d(str, aVar, interfaceC7218e);
                return m5204d;
            }
        }).m27931d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC1143f m5204d(String str, a aVar, InterfaceC7218e interfaceC7218e) {
        return AbstractC1143f.m5200a(str, aVar.mo5205a((Context) interfaceC7218e.mo27905a(Context.class)));
    }
}
