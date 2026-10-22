package p243n1;

import android.content.Context;
import java.io.File;
import p243n1.AbstractC5726d;

/* renamed from: n1.f */
/* loaded from: classes.dex */
public final class C5728f extends AbstractC5726d {

    /* renamed from: n1.f$a */
    /* loaded from: classes.dex */
    class a implements AbstractC5726d.a {

        /* renamed from: a */
        final /* synthetic */ Context f23000a;

        /* renamed from: b */
        final /* synthetic */ String f23001b;

        a(Context context, String str) {
            this.f23000a = context;
            this.f23001b = str;
        }

        /* renamed from: b */
        private File m23128b() {
            File cacheDir = this.f23000a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f23001b != null) {
                return new File(cacheDir, this.f23001b);
            }
            return cacheDir;
        }

        @Override // p243n1.AbstractC5726d.a
        /* renamed from: a */
        public File mo23124a() {
            File m23128b = m23128b();
            if (m23128b != null && m23128b.exists()) {
                return m23128b;
            }
            File externalCacheDir = this.f23000a.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.canWrite()) {
                if (this.f23001b != null) {
                    return new File(externalCacheDir, this.f23001b);
                }
                return externalCacheDir;
            }
            return m23128b;
        }
    }

    public C5728f(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public C5728f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
