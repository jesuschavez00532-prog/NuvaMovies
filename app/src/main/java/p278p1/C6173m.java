package p278p1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.File;
import java.io.FileNotFoundException;
import p093d2.C3923b;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p200k1.AbstractC5080b;
import p278p1.InterfaceC6175o;

/* renamed from: p1.m */
/* loaded from: classes.dex */
public final class C6173m implements InterfaceC6175o {

    /* renamed from: a */
    private final Context f24274a;

    /* renamed from: p1.m$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6176p {

        /* renamed from: a */
        private final Context f24275a;

        public a(Context context) {
            this.f24275a = context;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6173m(this.f24275a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.m$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC1604d {

        /* renamed from: c */
        private static final String[] f24276c = {"_data"};

        /* renamed from: a */
        private final Context f24277a;

        /* renamed from: b */
        private final Uri f24278b;

        b(Context context, Uri uri) {
            this.f24277a = context;
            this.f24278b = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            Cursor query = this.f24277a.getContentResolver().query(this.f24278b, f24276c, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo7430c(new FileNotFoundException("Failed to find file path for: " + this.f24278b));
                return;
            }
            aVar.mo7431e(new File(str));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return EnumC4970a.LOCAL;
        }
    }

    public C6173m(Context context) {
        this.f24274a = context;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Uri uri, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(uri), new b(this.f24274a, uri));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Uri uri) {
        return AbstractC5080b.m20576c(uri);
    }
}
