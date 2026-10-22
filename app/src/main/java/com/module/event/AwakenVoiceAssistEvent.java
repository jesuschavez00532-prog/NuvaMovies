package com.module.event;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class AwakenVoiceAssistEvent {
    private final int commad;
    private String type;
    private String voiceMsg;

    public AwakenVoiceAssistEvent(int i10, String str, String str2) {
        AbstractC5868k.m23674f(str, "voiceMsg");
        AbstractC5868k.m23674f(str2, "type");
        this.commad = i10;
        this.voiceMsg = str;
        this.type = str2;
    }

    public final int getCommad() {
        return this.commad;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVoiceMsg() {
        return this.voiceMsg;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public final void setVoiceMsg(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.voiceMsg = str;
    }
}
