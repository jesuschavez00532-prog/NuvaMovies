package p258o3;

import android.view.View;
import me.InterfaceC5660l;
import ne.AbstractC5868k;

/* renamed from: o3.c */
/* loaded from: classes.dex */
public abstract class AbstractC5907c {
    /* renamed from: b */
    public static final void m23858b(View view, final InterfaceC5660l interfaceC5660l, long j10) {
        AbstractC5868k.m23674f(view, "<this>");
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        final C5908d c5908d = new C5908d(j10);
        view.setOnClickListener(new View.OnClickListener() { // from class: o3.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC5907c.m23860d(C5908d.this, interfaceC5660l, view2);
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ void m23859c(View view, InterfaceC5660l interfaceC5660l, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 1000;
        }
        m23858b(view, interfaceC5660l, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m23860d(C5908d c5908d, InterfaceC5660l interfaceC5660l, View view) {
        AbstractC5868k.m23674f(c5908d, "$bean");
        AbstractC5868k.m23674f(interfaceC5660l, "$listener");
        if (System.currentTimeMillis() - c5908d.m23862b() > c5908d.m23861a()) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5660l.mo542f(view);
        }
        c5908d.m23863c(System.currentTimeMillis());
    }
}
