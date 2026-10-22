package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.AbstractC0509h;
import p373w.AbstractC7338c;

/* renamed from: androidx.core.content.d */
/* loaded from: classes.dex */
public abstract class AbstractC0550d {
    /* renamed from: a */
    public static int m2355a(Context context, String str, int i10, int i11, String str2) {
        boolean z10;
        int m2211b;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String m2212c = AbstractC0509h.m2212c(str);
        if (m2212c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i11 && AbstractC7338c.m28317a(packageName, str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m2211b = AbstractC0509h.m2210a(context, i11, m2212c, str2);
        } else {
            m2211b = AbstractC0509h.m2211b(context, m2212c, str2);
        }
        if (m2211b == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: b */
    public static int m2356b(Context context, String str) {
        return m2355a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
