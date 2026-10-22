package com.module.event;

/* loaded from: classes2.dex */
public final class RefreshLockEvent {
    private boolean isLocked;

    public RefreshLockEvent(boolean z10) {
        this.isLocked = z10;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void setLocked(boolean z10) {
        this.isLocked = z10;
    }
}
