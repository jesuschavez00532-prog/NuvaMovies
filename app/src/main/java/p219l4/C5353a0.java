package p219l4;

import android.content.Intent;
import p203k4.InterfaceC5108e;

/* renamed from: l4.a0 */
/* loaded from: classes.dex */
final class C5353a0 extends AbstractDialogInterfaceOnClickListenerC5356b0 {

    /* renamed from: a */
    final /* synthetic */ Intent f21889a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC5108e f21890b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5353a0(Intent intent, InterfaceC5108e interfaceC5108e, int i10) {
        this.f21889a = intent;
        this.f21890b = interfaceC5108e;
    }

    @Override // p219l4.AbstractDialogInterfaceOnClickListenerC5356b0
    /* renamed from: a */
    public final void mo21643a() {
        Intent intent = this.f21889a;
        if (intent != null) {
            this.f21890b.startActivityForResult(intent, 2);
        }
    }
}
