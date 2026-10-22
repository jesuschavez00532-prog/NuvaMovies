package org.android.spdy;

/* loaded from: classes3.dex */
public enum SslVersion {
    SLIGHT_VERSION_V1(0);

    private int code;

    SslVersion(int i10) {
        this.code = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getint() {
        return this.code;
    }
}
