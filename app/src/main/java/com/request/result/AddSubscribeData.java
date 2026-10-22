package com.request.result;

/* loaded from: classes.dex */
public final class AddSubscribeData {
    private int subscribeId;

    public AddSubscribeData(int i10) {
        this.subscribeId = i10;
    }

    public static /* synthetic */ AddSubscribeData copy$default(AddSubscribeData addSubscribeData, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = addSubscribeData.subscribeId;
        }
        return addSubscribeData.copy(i10);
    }

    public final int component1() {
        return this.subscribeId;
    }

    public final AddSubscribeData copy(int i10) {
        return new AddSubscribeData(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddSubscribeData) && this.subscribeId == ((AddSubscribeData) obj).subscribeId;
    }

    public final int getSubscribeId() {
        return this.subscribeId;
    }

    public int hashCode() {
        return this.subscribeId;
    }

    public final void setSubscribeId(int i10) {
        this.subscribeId = i10;
    }

    public String toString() {
        return "AddSubscribeData(subscribeId=" + this.subscribeId + ')';
    }
}
