package com.module.event;

/* loaded from: classes2.dex */
public final class LockMonitorEvent {
    private boolean isLock;
    private Object lockedChannel;

    public LockMonitorEvent(Object obj, boolean z10) {
        this.lockedChannel = obj;
        this.isLock = z10;
    }

    public final Object getLockedChannel() {
        return this.lockedChannel;
    }

    public final boolean isLock() {
        return this.isLock;
    }

    public final void setLock(boolean z10) {
        this.isLock = z10;
    }

    public final void setLockedChannel(Object obj) {
        this.lockedChannel = obj;
    }
}
