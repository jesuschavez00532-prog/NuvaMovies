package com.module.event;

import ne.AbstractC5864g;

/* loaded from: classes2.dex */
public final class RefreshUerInfoDisplayEvent {
    private boolean userIdentityChanged;

    public RefreshUerInfoDisplayEvent() {
        this(false, 1, null);
    }

    public final boolean getUserIdentityChanged() {
        return this.userIdentityChanged;
    }

    public final void setUserIdentityChanged(boolean z10) {
        this.userIdentityChanged = z10;
    }

    public RefreshUerInfoDisplayEvent(boolean z10) {
        this.userIdentityChanged = z10;
    }

    public /* synthetic */ RefreshUerInfoDisplayEvent(boolean z10, int i10, AbstractC5864g abstractC5864g) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
