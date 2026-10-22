package p007a6;

import android.content.Context;

/* renamed from: a6.y */
/* loaded from: classes.dex */
class C0106y {

    /* renamed from: a */
    private String f356a;

    /* renamed from: b */
    private static String m480b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m481a(Context context) {
        String str;
        if (this.f356a == null) {
            this.f356a = m480b(context);
        }
        if ("".equals(this.f356a)) {
            str = null;
        } else {
            str = this.f356a;
        }
        return str;
    }
}
