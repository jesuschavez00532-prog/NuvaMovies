package p375w1;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC1599a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p109e2.AbstractC4117g;
import p109e2.AbstractC4122l;
import p152h1.C4505c;
import p152h1.C4506d;
import p152h1.C4507e;
import p152h1.InterfaceC4503a;
import p184j1.C4977h;
import p184j1.EnumC4971b;
import p184j1.InterfaceC4979j;
import p230m1.InterfaceC5569b;
import p230m1.InterfaceC5571d;
import p307r1.C6510p;

/* renamed from: w1.a */
/* loaded from: classes.dex */
public class C7344a implements InterfaceC4979j {

    /* renamed from: f */
    private static final a f27245f = new a();

    /* renamed from: g */
    private static final b f27246g = new b();

    /* renamed from: a */
    private final Context f27247a;

    /* renamed from: b */
    private final List f27248b;

    /* renamed from: c */
    private final b f27249c;

    /* renamed from: d */
    private final a f27250d;

    /* renamed from: e */
    private final C7345b f27251e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1.a$a */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        /* renamed from: a */
        InterfaceC4503a m28334a(InterfaceC4503a.a aVar, C4505c c4505c, ByteBuffer byteBuffer, int i10) {
            return new C4507e(aVar, c4505c, byteBuffer, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Queue f27252a = AbstractC4122l.m17234g(0);

        b() {
        }

        /* renamed from: a */
        synchronized C4506d m28335a(ByteBuffer byteBuffer) {
            C4506d c4506d;
            c4506d = (C4506d) this.f27252a.poll();
            if (c4506d == null) {
                c4506d = new C4506d();
            }
            return c4506d.m18855p(byteBuffer);
        }

        /* renamed from: b */
        synchronized void m28336b(C4506d c4506d) {
            c4506d.m18853a();
            this.f27252a.offer(c4506d);
        }
    }

    public C7344a(Context context, List list, InterfaceC5571d interfaceC5571d, InterfaceC5569b interfaceC5569b) {
        this(context, list, interfaceC5571d, interfaceC5569b, f27246g, f27245f);
    }

    /* renamed from: c */
    private C7348e m28330c(ByteBuffer byteBuffer, int i10, int i11, C4506d c4506d, C4977h c4977h) {
        Bitmap.Config config;
        long m17210b = AbstractC4117g.m17210b();
        try {
            C4505c m18854c = c4506d.m18854c();
            if (m18854c.m18835b() > 0 && m18854c.m18836c() == 0) {
                if (c4977h.m20325c(AbstractC7352i.f27292a) == EnumC4971b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                InterfaceC4503a m28334a = this.f27250d.m28334a(this.f27251e, m18854c, byteBuffer, m28331e(m18854c, i10, i11));
                m28334a.mo18824w(config);
                m28334a.mo18821t();
                Bitmap mo18820s = m28334a.mo18820s();
                if (mo18820s == null) {
                    return null;
                }
                C7348e c7348e = new C7348e(new C7346c(this.f27247a, m28334a, C6510p.m25468c(), i10, i11, mo18820s));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC4117g.m17209a(m17210b));
                }
                return c7348e;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC4117g.m17209a(m17210b));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC4117g.m17209a(m17210b));
            }
        }
    }

    /* renamed from: e */
    private static int m28331e(C4505c c4505c, int i10, int i11) {
        int highestOneBit;
        int min = Math.min(c4505c.m18834a() / i11, c4505c.m18837d() / i10);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + c4505c.m18837d() + "x" + c4505c.m18834a() + "]");
        }
        return max;
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C7348e mo20329a(ByteBuffer byteBuffer, int i10, int i11, C4977h c4977h) {
        C4506d m28335a = this.f27249c.m28335a(byteBuffer);
        try {
            return m28330c(byteBuffer, i10, i11, m28335a, c4977h);
        } finally {
            this.f27249c.m28336b(m28335a);
        }
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(ByteBuffer byteBuffer, C4977h c4977h) {
        if (!((Boolean) c4977h.m20325c(AbstractC7352i.f27293b)).booleanValue() && AbstractC1599a.m7407g(this.f27248b, byteBuffer) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    C7344a(Context context, List list, InterfaceC5571d interfaceC5571d, InterfaceC5569b interfaceC5569b, b bVar, a aVar) {
        this.f27247a = context.getApplicationContext();
        this.f27248b = list;
        this.f27250d = aVar;
        this.f27251e = new C7345b(interfaceC5571d, interfaceC5569b);
        this.f27249c = bVar;
    }
}
