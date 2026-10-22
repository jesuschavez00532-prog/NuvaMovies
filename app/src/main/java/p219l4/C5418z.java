package p219l4;

import android.app.Activity;
import android.content.Intent;

/* renamed from: l4.z */
/* loaded from: classes.dex */
final class C5418z extends AbstractDialogInterfaceOnClickListenerC5356b0 {

    /* renamed from: a */
    final /* synthetic */ Intent f22055a;

    /* renamed from: b */
    final /* synthetic */ Activity f22056b;

    /* renamed from: c */
    final /* synthetic */ int f22057c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5418z(Intent intent, Activity activity, int i10) {
        this.f22055a = intent;
        this.f22056b = activity;
        this.f22057c = i10;
    }

    @Override // p219l4.AbstractDialogInterfaceOnClickListenerC5356b0
    /* renamed from: a */
    public final void mo21643a() {
        Intent intent = this.f22055a;
        if (intent != null) {
            this.f22056b.startActivityForResult(intent, this.f22057c);
        }
    }
}
