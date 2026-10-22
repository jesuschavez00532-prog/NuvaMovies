package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
final class SubscriptionDisposable extends ReferenceDisposable<InterfaceC5075d> {
    private static final long serialVersionUID = -707001650852963139L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriptionDisposable(InterfaceC5075d interfaceC5075d) {
        super(interfaceC5075d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull InterfaceC5075d interfaceC5075d) {
        interfaceC5075d.cancel();
    }
}
