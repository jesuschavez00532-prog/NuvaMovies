package org.mozilla.intl.chardet;

/* loaded from: classes3.dex */
public class nsDetector extends nsPSMDetector implements nsICharsetDetector {
    nsICharsetDetectionObserver mObserver;

    public nsDetector() {
        this.mObserver = null;
    }

    @Override // org.mozilla.intl.chardet.nsICharsetDetector
    public boolean DoIt(byte[] bArr, int i10, boolean z10) {
        if (bArr != null && !z10) {
            HandleData(bArr, i10);
            return this.mDone;
        }
        return false;
    }

    @Override // org.mozilla.intl.chardet.nsICharsetDetector
    public void Done() {
        DataEnd();
    }

    @Override // org.mozilla.intl.chardet.nsICharsetDetector
    public void Init(nsICharsetDetectionObserver nsicharsetdetectionobserver) {
        this.mObserver = nsicharsetdetectionobserver;
    }

    @Override // org.mozilla.intl.chardet.nsPSMDetector
    public void Report(String str) {
        nsICharsetDetectionObserver nsicharsetdetectionobserver = this.mObserver;
        if (nsicharsetdetectionobserver != null) {
            nsicharsetdetectionobserver.Notify(str);
        }
    }

    public boolean isAscii(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if ((bArr[i11] & 128) != 0) {
                return false;
            }
        }
        return true;
    }

    public nsDetector(int i10) {
        super(i10);
        this.mObserver = null;
    }
}
