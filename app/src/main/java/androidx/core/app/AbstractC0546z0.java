package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.app.AbstractC0517l;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC0546z0 {

    /* renamed from: a */
    private static final Object f2290a = new Object();

    /* renamed from: b */
    private static final Object f2291b = new Object();

    /* renamed from: a */
    public static SparseArray m2314a(List list) {
        int size = list.size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = (Bundle) list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Bundle m2315b(AbstractC0517l.a aVar) {
        int i10;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat m2232e = aVar.m2232e();
        if (m2232e != null) {
            i10 = m2232e.m2366e();
        } else {
            i10 = 0;
        }
        bundle2.putInt("icon", i10);
        bundle2.putCharSequence("title", aVar.m2236i());
        bundle2.putParcelable("actionIntent", aVar.m2228a());
        if (aVar.m2231d() != null) {
            bundle = new Bundle(aVar.m2231d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m2229b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m2317d(aVar.m2233f()));
        bundle2.putBoolean("showsUserInterface", aVar.m2235h());
        bundle2.putInt("semanticAction", aVar.m2234g());
        return bundle2;
    }

    /* renamed from: c */
    private static Bundle m2316c(AbstractC0494a1 abstractC0494a1) {
        new Bundle();
        throw null;
    }

    /* renamed from: d */
    private static Bundle[] m2317d(AbstractC0494a1[] abstractC0494a1Arr) {
        if (abstractC0494a1Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[abstractC0494a1Arr.length];
        for (int i10 = 0; i10 < abstractC0494a1Arr.length; i10++) {
            AbstractC0494a1 abstractC0494a1 = abstractC0494a1Arr[i10];
            bundleArr[i10] = m2316c(null);
        }
        return bundleArr;
    }

    /* renamed from: e */
    public static Bundle m2318e(Notification.Builder builder, AbstractC0517l.a aVar) {
        int i10;
        IconCompat m2232e = aVar.m2232e();
        if (m2232e != null) {
            i10 = m2232e.m2366e();
        } else {
            i10 = 0;
        }
        builder.addAction(i10, aVar.m2236i(), aVar.m2228a());
        Bundle bundle = new Bundle(aVar.m2231d());
        if (aVar.m2233f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m2317d(aVar.m2233f()));
        }
        if (aVar.m2230c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m2317d(aVar.m2230c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m2229b());
        return bundle;
    }
}
