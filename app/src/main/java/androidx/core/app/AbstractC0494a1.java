package androidx.core.app;

import android.app.RemoteInput;

/* renamed from: androidx.core.app.a1 */
/* loaded from: classes.dex */
public abstract class AbstractC0494a1 {
    /* renamed from: a */
    static RemoteInput m2177a(AbstractC0494a1 abstractC0494a1) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static RemoteInput[] m2178b(AbstractC0494a1[] abstractC0494a1Arr) {
        if (abstractC0494a1Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[abstractC0494a1Arr.length];
        for (int i10 = 0; i10 < abstractC0494a1Arr.length; i10++) {
            AbstractC0494a1 abstractC0494a1 = abstractC0494a1Arr[i10];
            remoteInputArr[i10] = m2177a(null);
        }
        return remoteInputArr;
    }
}
