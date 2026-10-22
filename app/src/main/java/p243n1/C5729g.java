package p243n1;

import android.content.Context;
import java.io.File;
import p243n1.AbstractC5726d;

/* renamed from: n1.g */
/* loaded from: classes.dex */
public final class C5729g extends AbstractC5726d {

    /* renamed from: n1.g$a */
    /* loaded from: classes.dex */
    class a implements AbstractC5726d.a {

        /* renamed from: a */
        final /* synthetic */ Context f23002a;

        /* renamed from: b */
        final /* synthetic */ String f23003b;

        a(Context context, String str) {
            this.f23002a = context;
            this.f23003b = str;
        }

        @Override // p243n1.AbstractC5726d.a
        /* renamed from: a */
        public File mo23124a() {
            File cacheDir = this.f23002a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f23003b != null) {
                return new File(cacheDir, this.f23003b);
            }
            return cacheDir;
        }
    }

    public C5729g(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C5729g(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
