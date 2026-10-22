package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public interface nsICharsetDetector {
    boolean DoIt(byte[] bArr, int i10, boolean z10);

    void Done();

    void Init(nsICharsetDetectionObserver nsicharsetdetectionobserver);
}
