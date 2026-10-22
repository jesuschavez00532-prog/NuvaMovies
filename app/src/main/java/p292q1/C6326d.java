package p292q1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p093d2.C3923b;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p200k1.AbstractC5080b;
import p278p1.C6179s;
import p278p1.InterfaceC6175o;
import p278p1.InterfaceC6176p;

/* renamed from: q1.d */
/* loaded from: classes.dex */
public final class C6326d implements InterfaceC6175o {

    /* renamed from: a */
    private final Context f24657a;

    /* renamed from: b */
    private final InterfaceC6175o f24658b;

    /* renamed from: c */
    private final InterfaceC6175o f24659c;

    /* renamed from: d */
    private final Class f24660d;

    /* renamed from: q1.d$a */
    /* loaded from: classes.dex */
    private static abstract class a implements InterfaceC6176p {

        /* renamed from: a */
        private final Context f24661a;

        /* renamed from: b */
        private final Class f24662b;

        a(Context context, Class cls) {
            this.f24661a = context;
            this.f24662b = cls;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public final void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public final InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6326d(this.f24661a, c6179s.m24683d(File.class, this.f24662b), c6179s.m24683d(Uri.class, this.f24662b), this.f24662b);
        }
    }

    /* renamed from: q1.d$b */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: q1.d$c */
    /* loaded from: classes.dex */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1.d$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC1604d {

        /* renamed from: k */
        private static final String[] f24663k = {"_data"};

        /* renamed from: a */
        private final Context f24664a;

        /* renamed from: b */
        private final InterfaceC6175o f24665b;

        /* renamed from: c */
        private final InterfaceC6175o f24666c;

        /* renamed from: d */
        private final Uri f24667d;

        /* renamed from: e */
        private final int f24668e;

        /* renamed from: f */
        private final int f24669f;

        /* renamed from: g */
        private final C4977h f24670g;

        /* renamed from: h */
        private final Class f24671h;

        /* renamed from: i */
        private volatile boolean f24672i;

        /* renamed from: j */
        private volatile InterfaceC1604d f24673j;

        d(Context context, InterfaceC6175o interfaceC6175o, InterfaceC6175o interfaceC6175o2, Uri uri, int i10, int i11, C4977h c4977h, Class cls) {
            this.f24664a = context.getApplicationContext();
            this.f24665b = interfaceC6175o;
            this.f24666c = interfaceC6175o2;
            this.f24667d = uri;
            this.f24668e = i10;
            this.f24669f = i11;
            this.f24670g = c4977h;
            this.f24671h = cls;
        }

        /* renamed from: c */
        private InterfaceC6175o.a m25096c() {
            boolean isExternalStorageLegacy;
            Uri uri;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f24665b.mo7343b(m25099g(this.f24667d), this.f24668e, this.f24669f, this.f24670g);
            }
            if (AbstractC5080b.m20574a(this.f24667d)) {
                return this.f24666c.mo7343b(this.f24667d, this.f24668e, this.f24669f, this.f24670g);
            }
            if (m25098f()) {
                uri = MediaStore.setRequireOriginal(this.f24667d);
            } else {
                uri = this.f24667d;
            }
            return this.f24666c.mo7343b(uri, this.f24668e, this.f24669f, this.f24670g);
        }

        /* renamed from: e */
        private InterfaceC1604d m25097e() {
            InterfaceC6175o.a m25096c = m25096c();
            if (m25096c != null) {
                return m25096c.f24287c;
            }
            return null;
        }

        /* renamed from: f */
        private boolean m25098f() {
            int checkSelfPermission;
            checkSelfPermission = this.f24664a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            if (checkSelfPermission == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private File m25099g(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f24664a.getContentResolver().query(uri, f24663k, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return this.f24671h;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
            InterfaceC1604d interfaceC1604d = this.f24673j;
            if (interfaceC1604d != null) {
                interfaceC1604d.mo7423b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
            this.f24672i = true;
            InterfaceC1604d interfaceC1604d = this.f24673j;
            if (interfaceC1604d != null) {
                interfaceC1604d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            try {
                InterfaceC1604d m25097e = m25097e();
                if (m25097e == null) {
                    aVar.mo7430c(new IllegalArgumentException("Failed to build fetcher for: " + this.f24667d));
                    return;
                }
                this.f24673j = m25097e;
                if (this.f24672i) {
                    cancel();
                } else {
                    m25097e.mo7425d(enumC1591h, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.mo7430c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return EnumC4970a.LOCAL;
        }
    }

    C6326d(Context context, InterfaceC6175o interfaceC6175o, InterfaceC6175o interfaceC6175o2, Class cls) {
        this.f24657a = context.getApplicationContext();
        this.f24658b = interfaceC6175o;
        this.f24659c = interfaceC6175o2;
        this.f24660d = cls;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Uri uri, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(uri), new d(this.f24657a, this.f24658b, this.f24659c, uri, i10, i11, c4977h, this.f24660d));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Uri uri) {
        if (Build.VERSION.SDK_INT >= 29 && AbstractC5080b.m20576c(uri)) {
            return true;
        }
        return false;
    }
}
