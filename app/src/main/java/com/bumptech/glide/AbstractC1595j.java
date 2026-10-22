package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.C1587d;
import com.bumptech.glide.load.data.C1611k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p109e2.AbstractC4116f;
import p139g0.AbstractC4331b;
import p152h1.InterfaceC4503a;
import p184j1.InterfaceC4979j;
import p230m1.InterfaceC5569b;
import p230m1.InterfaceC5571d;
import p278p1.C6161a;
import p278p1.C6162b;
import p278p1.C6163c;
import p278p1.C6164d;
import p278p1.C6165e;
import p278p1.C6167g;
import p278p1.C6168h;
import p278p1.C6169i;
import p278p1.C6173m;
import p278p1.C6180t;
import p278p1.C6181u;
import p278p1.C6182v;
import p278p1.C6183w;
import p278p1.C6184x;
import p278p1.C6185y;
import p278p1.C6186z;
import p278p1.InterfaceC6176p;
import p292q1.C6323a;
import p292q1.C6324b;
import p292q1.C6325c;
import p292q1.C6326d;
import p292q1.C6329g;
import p322s1.C6612a;
import p322s1.C6614b;
import p322s1.C6615b0;
import p322s1.C6616c;
import p322s1.C6619d0;
import p322s1.C6623f0;
import p322s1.C6627h0;
import p322s1.C6628i;
import p322s1.C6631j0;
import p322s1.C6632k;
import p322s1.C6635l0;
import p322s1.C6638n;
import p322s1.C6646u;
import p322s1.C6649x;
import p333t1.C6889a;
import p347u1.C7018h;
import p347u1.C7022l;
import p347u1.C7023m;
import p362v1.C7195a;
import p375w1.C7344a;
import p375w1.C7346c;
import p375w1.C7347d;
import p375w1.C7351h;
import p375w1.C7353j;
import p391x1.C7484a;
import p391x1.C7485b;
import p391x1.C7486c;
import p391x1.C7487d;
import p407y1.AbstractC7657a;
import p407y1.InterfaceC7658b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.j */
/* loaded from: classes.dex */
public abstract class AbstractC1595j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.j$a */
    /* loaded from: classes.dex */
    public class a implements AbstractC4116f.b {

        /* renamed from: a */
        private boolean f6339a;

        /* renamed from: b */
        final /* synthetic */ ComponentCallbacks2C1586c f6340b;

        /* renamed from: c */
        final /* synthetic */ List f6341c;

        /* renamed from: d */
        final /* synthetic */ AbstractC7657a f6342d;

        a(ComponentCallbacks2C1586c componentCallbacks2C1586c, List list, AbstractC7657a abstractC7657a) {
            this.f6340b = componentCallbacks2C1586c;
            this.f6341c = list;
            this.f6342d = abstractC7657a;
        }

        @Override // p109e2.AbstractC4116f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1592i get() {
            if (!this.f6339a) {
                AbstractC4331b.m18143a("Glide registry");
                this.f6339a = true;
                try {
                    return AbstractC1595j.m7349a(this.f6340b, this.f6341c, this.f6342d);
                } finally {
                    this.f6339a = false;
                    AbstractC4331b.m18144b();
                }
            }
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }

    /* renamed from: a */
    static C1592i m7349a(ComponentCallbacks2C1586c componentCallbacks2C1586c, List list, AbstractC7657a abstractC7657a) {
        InterfaceC5571d m7288g = componentCallbacks2C1586c.m7288g();
        InterfaceC5569b m7287f = componentCallbacks2C1586c.m7287f();
        Context applicationContext = componentCallbacks2C1586c.m7291j().getApplicationContext();
        C1589f m7313g = componentCallbacks2C1586c.m7291j().m7313g();
        C1592i c1592i = new C1592i();
        m7350b(applicationContext, c1592i, m7288g, m7287f, m7313g);
        m7351c(applicationContext, componentCallbacks2C1586c, c1592i, list, abstractC7657a);
        return c1592i;
    }

    /* renamed from: b */
    private static void m7350b(Context context, C1592i c1592i, InterfaceC5571d interfaceC5571d, InterfaceC5569b interfaceC5569b, C1589f c1589f) {
        InterfaceC4979j c6628i;
        InterfaceC4979j c6627h0;
        Class cls;
        C1592i c1592i2;
        c1592i.m7335o(new C6638n());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            c1592i.m7335o(new C6649x());
        }
        Resources resources = context.getResources();
        List m7327g = c1592i.m7327g();
        C7344a c7344a = new C7344a(context, m7327g, interfaceC5571d, interfaceC5569b);
        InterfaceC4979j m25894m = C6635l0.m25894m(interfaceC5571d);
        C6646u c6646u = new C6646u(c1592i.m7327g(), resources.getDisplayMetrics(), interfaceC5571d, interfaceC5569b);
        if (i10 >= 28 && c1589f.m7316a(C1587d.c.class)) {
            c6627h0 = new C6615b0();
            c6628i = new C6632k();
        } else {
            c6628i = new C6628i(c6646u);
            c6627h0 = new C6627h0(c6646u, interfaceC5569b);
        }
        if (i10 >= 28) {
            c1592i.m7326e("Animation", InputStream.class, Drawable.class, C7018h.m27084f(m7327g, interfaceC5569b));
            c1592i.m7326e("Animation", ByteBuffer.class, Drawable.class, C7018h.m27082a(m7327g, interfaceC5569b));
        }
        C7022l c7022l = new C7022l(context);
        C6616c c6616c = new C6616c(interfaceC5569b);
        C7484a c7484a = new C7484a();
        C7487d c7487d = new C7487d();
        ContentResolver contentResolver = context.getContentResolver();
        c1592i.m7322a(ByteBuffer.class, new C6163c()).m7322a(InputStream.class, new C6182v(interfaceC5569b)).m7326e("Bitmap", ByteBuffer.class, Bitmap.class, c6628i).m7326e("Bitmap", InputStream.class, Bitmap.class, c6627h0);
        if (ParcelFileDescriptorRewinder.m7411c()) {
            c1592i.m7326e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C6619d0(c6646u));
        }
        c1592i.m7326e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C6635l0.m25884c(interfaceC5571d));
        c1592i.m7326e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m25894m).m7325d(Bitmap.class, Bitmap.class, C6184x.a.m24705a()).m7326e("Bitmap", Bitmap.class, Bitmap.class, new C6631j0()).m7323b(Bitmap.class, c6616c).m7326e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C6612a(resources, c6628i)).m7326e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C6612a(resources, c6627h0)).m7326e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C6612a(resources, m25894m)).m7323b(BitmapDrawable.class, new C6614b(interfaceC5571d, c6616c)).m7326e("Animation", InputStream.class, C7346c.class, new C7353j(m7327g, c7344a, interfaceC5569b)).m7326e("Animation", ByteBuffer.class, C7346c.class, c7344a).m7323b(C7346c.class, new C7347d()).m7325d(InterfaceC4503a.class, InterfaceC4503a.class, C6184x.a.m24705a()).m7326e("Bitmap", InterfaceC4503a.class, Bitmap.class, new C7351h(interfaceC5571d)).m7324c(Uri.class, Drawable.class, c7022l).m7324c(Uri.class, Bitmap.class, new C6623f0(c7022l, interfaceC5571d)).m7336p(new C6889a.a()).m7325d(File.class, ByteBuffer.class, new C6164d.b()).m7325d(File.class, InputStream.class, new C6168h.e()).m7324c(File.class, File.class, new C7195a()).m7325d(File.class, ParcelFileDescriptor.class, new C6168h.b()).m7325d(File.class, File.class, C6184x.a.m24705a()).m7336p(new C1611k.a(interfaceC5569b));
        if (ParcelFileDescriptorRewinder.m7411c()) {
            cls = BitmapDrawable.class;
            c1592i2 = c1592i;
            c1592i2.m7336p(new ParcelFileDescriptorRewinder.C1600a());
        } else {
            cls = BitmapDrawable.class;
            c1592i2 = c1592i;
        }
        InterfaceC6176p m24620g = C6167g.m24620g(context);
        InterfaceC6176p m24618c = C6167g.m24618c(context);
        InterfaceC6176p m24619e = C6167g.m24619e(context);
        Class cls2 = Integer.TYPE;
        c1592i2.m7325d(cls2, InputStream.class, m24620g).m7325d(Integer.class, InputStream.class, m24620g).m7325d(cls2, AssetFileDescriptor.class, m24618c).m7325d(Integer.class, AssetFileDescriptor.class, m24618c).m7325d(cls2, Drawable.class, m24619e).m7325d(Integer.class, Drawable.class, m24619e).m7325d(Uri.class, InputStream.class, C6181u.m24694f(context)).m7325d(Uri.class, AssetFileDescriptor.class, C6181u.m24693e(context));
        C6180t.c cVar = new C6180t.c(resources);
        C6180t.a aVar = new C6180t.a(resources);
        C6180t.b bVar = new C6180t.b(resources);
        Class cls3 = cls;
        c1592i2.m7325d(Integer.class, Uri.class, cVar).m7325d(cls2, Uri.class, cVar).m7325d(Integer.class, AssetFileDescriptor.class, aVar).m7325d(cls2, AssetFileDescriptor.class, aVar).m7325d(Integer.class, InputStream.class, bVar).m7325d(cls2, InputStream.class, bVar);
        c1592i2.m7325d(String.class, InputStream.class, new C6165e.c()).m7325d(Uri.class, InputStream.class, new C6165e.c()).m7325d(String.class, InputStream.class, new C6183w.c()).m7325d(String.class, ParcelFileDescriptor.class, new C6183w.b()).m7325d(String.class, AssetFileDescriptor.class, new C6183w.a()).m7325d(Uri.class, InputStream.class, new C6161a.c(context.getAssets())).m7325d(Uri.class, AssetFileDescriptor.class, new C6161a.b(context.getAssets())).m7325d(Uri.class, InputStream.class, new C6324b.a(context)).m7325d(Uri.class, InputStream.class, new C6325c.a(context));
        if (i10 >= 29) {
            c1592i2.m7325d(Uri.class, InputStream.class, new C6326d.c(context));
            c1592i2.m7325d(Uri.class, ParcelFileDescriptor.class, new C6326d.b(context));
        }
        c1592i2.m7325d(Uri.class, InputStream.class, new C6185y.d(contentResolver)).m7325d(Uri.class, ParcelFileDescriptor.class, new C6185y.b(contentResolver)).m7325d(Uri.class, AssetFileDescriptor.class, new C6185y.a(contentResolver)).m7325d(Uri.class, InputStream.class, new C6186z.a()).m7325d(URL.class, InputStream.class, new C6329g.a()).m7325d(Uri.class, File.class, new C6173m.a(context)).m7325d(C6169i.class, InputStream.class, new C6323a.a()).m7325d(byte[].class, ByteBuffer.class, new C6162b.a()).m7325d(byte[].class, InputStream.class, new C6162b.d()).m7325d(Uri.class, Uri.class, C6184x.a.m24705a()).m7325d(Drawable.class, Drawable.class, C6184x.a.m24705a()).m7324c(Drawable.class, Drawable.class, new C7023m()).m7337q(Bitmap.class, cls3, new C7485b(resources)).m7337q(Bitmap.class, byte[].class, c7484a).m7337q(Drawable.class, byte[].class, new C7486c(interfaceC5571d, c7484a, c7487d)).m7337q(C7346c.class, byte[].class, c7487d);
        if (i10 >= 23) {
            InterfaceC4979j m25885d = C6635l0.m25885d(interfaceC5571d);
            c1592i2.m7324c(ByteBuffer.class, Bitmap.class, m25885d);
            c1592i2.m7324c(ByteBuffer.class, cls3, new C6612a(resources, m25885d));
        }
    }

    /* renamed from: c */
    private static void m7351c(Context context, ComponentCallbacks2C1586c componentCallbacks2C1586c, C1592i c1592i, List list, AbstractC7657a abstractC7657a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC7658b interfaceC7658b = (InterfaceC7658b) it.next();
            try {
                interfaceC7658b.mo7341b(context, componentCallbacks2C1586c, c1592i);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + interfaceC7658b.getClass().getName(), e10);
            }
        }
        if (abstractC7657a != null) {
            abstractC7657a.mo7270a(context, componentCallbacks2C1586c, c1592i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static AbstractC4116f.b m7352d(ComponentCallbacks2C1586c componentCallbacks2C1586c, List list, AbstractC7657a abstractC7657a) {
        return new a(componentCallbacks2C1586c, list, abstractC7657a);
    }
}
