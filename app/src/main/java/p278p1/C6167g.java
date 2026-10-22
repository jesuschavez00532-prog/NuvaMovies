package p278p1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.IOException;
import java.io.InputStream;
import p093d2.C3923b;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p278p1.InterfaceC6175o;
import p347u1.AbstractC7019i;
import p347u1.C7022l;

/* renamed from: p1.g */
/* loaded from: classes.dex */
public final class C6167g implements InterfaceC6175o {

    /* renamed from: a */
    private final Context f24242a;

    /* renamed from: b */
    private final e f24243b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.g$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6176p, e {

        /* renamed from: a */
        private final Context f24244a;

        a(Context context) {
            this.f24244a = context;
        }

        @Override // p278p1.C6167g.e
        /* renamed from: a */
        public Class mo24623a() {
            return AssetFileDescriptor.class;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6167g(this.f24244a, this);
        }

        @Override // p278p1.C6167g.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // p278p1.C6167g.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor mo24624b(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.g$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC6176p, e {

        /* renamed from: a */
        private final Context f24245a;

        b(Context context) {
            this.f24245a = context;
        }

        @Override // p278p1.C6167g.e
        /* renamed from: a */
        public Class mo24623a() {
            return Drawable.class;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6167g(this.f24245a, this);
        }

        @Override // p278p1.C6167g.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(Drawable drawable) {
        }

        @Override // p278p1.C6167g.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable mo24624b(Resources.Theme theme, Resources resources, int i10) {
            return AbstractC7019i.m27093a(this.f24245a, i10, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.g$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC6176p, e {

        /* renamed from: a */
        private final Context f24246a;

        c(Context context) {
            this.f24246a = context;
        }

        @Override // p278p1.C6167g.e
        /* renamed from: a */
        public Class mo24623a() {
            return InputStream.class;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6167g(this.f24246a, this);
        }

        @Override // p278p1.C6167g.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(InputStream inputStream) {
            inputStream.close();
        }

        @Override // p278p1.C6167g.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream mo24624b(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.g$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC1604d {

        /* renamed from: a */
        private final Resources.Theme f24247a;

        /* renamed from: b */
        private final Resources f24248b;

        /* renamed from: c */
        private final e f24249c;

        /* renamed from: d */
        private final int f24250d;

        /* renamed from: e */
        private Object f24251e;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f24247a = theme;
            this.f24248b = resources;
            this.f24249c = eVar;
            this.f24250d = i10;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return this.f24249c.mo24623a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
            Object obj = this.f24251e;
            if (obj != null) {
                try {
                    this.f24249c.close(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            try {
                Object mo24624b = this.f24249c.mo24624b(this.f24247a, this.f24248b, this.f24250d);
                this.f24251e = mo24624b;
                aVar.mo7431e(mo24624b);
            } catch (Resources.NotFoundException e10) {
                aVar.mo7430c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return EnumC4970a.LOCAL;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.g$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        Class mo24623a();

        /* renamed from: b */
        Object mo24624b(Resources.Theme theme, Resources resources, int i10);

        void close(Object obj);
    }

    C6167g(Context context, e eVar) {
        this.f24242a = context.getApplicationContext();
        this.f24243b = eVar;
    }

    /* renamed from: c */
    public static InterfaceC6176p m24618c(Context context) {
        return new a(context);
    }

    /* renamed from: e */
    public static InterfaceC6176p m24619e(Context context) {
        return new b(context);
    }

    /* renamed from: g */
    public static InterfaceC6176p m24620g(Context context) {
        return new c(context);
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Integer num, int i10, int i11, C4977h c4977h) {
        Resources resources;
        Resources.Theme theme = (Resources.Theme) c4977h.m20325c(C7022l.f26396b);
        if (Build.VERSION.SDK_INT >= 21 && theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.f24242a.getResources();
        }
        return new InterfaceC6175o.a(new C3923b(num), new d(theme, resources, this.f24243b, num.intValue()));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Integer num) {
        return true;
    }
}
