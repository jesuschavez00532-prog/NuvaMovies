package com.module.event;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class PasswordRightEvent {
    private EnterTYPE type;

    /* loaded from: classes2.dex */
    public enum EnterTYPE {
        PLAY,
        TURN_OF_MAIN_SWITCH,
        MODIFY_ENCRYPTION_TIME,
        UNLOCK_ENCRYPTION_TIME,
        LOCK,
        RESTRICTED,
        SET_LOCK
    }

    public PasswordRightEvent(EnterTYPE enterTYPE) {
        AbstractC5868k.m23674f(enterTYPE, "type");
        this.type = enterTYPE;
    }

    public final EnterTYPE getType() {
        return this.type;
    }

    public final void setType(EnterTYPE enterTYPE) {
        AbstractC5868k.m23674f(enterTYPE, "<set-?>");
        this.type = enterTYPE;
    }
}
