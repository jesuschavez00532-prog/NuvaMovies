package p322s1;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p184j1.C4976g;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5571d;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* renamed from: s1.l0 */
/* loaded from: classes.dex */
public class C6635l0 implements InterfaceC4979j {

    /* renamed from: d */
    public static final C4976g f25452d = C4976g.m20316a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e */
    public static final C4976g f25453e = C4976g.m20316a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f */
    private static final f f25454f = new f();

    /* renamed from: g */
    private static final List f25455g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    private final e f25456a;

    /* renamed from: b */
    private final InterfaceC5571d f25457b;

    /* renamed from: c */
    private final f f25458c;

    /* renamed from: s1.l0$a */
    /* loaded from: classes.dex */
    class a implements C4976g.b {

        /* renamed from: a */
        private final ByteBuffer f25459a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // p184j1.C4976g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo20323a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f25459a) {
                this.f25459a.position(0);
                messageDigest.update(this.f25459a.putLong(l10.longValue()).array());
            }
        }
    }

    /* renamed from: s1.l0$b */
    /* loaded from: classes.dex */
    class b implements C4976g.b {

        /* renamed from: a */
        private final ByteBuffer f25460a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // p184j1.C4976g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo20323a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f25460a) {
                this.f25460a.position(0);
                messageDigest.update(this.f25460a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: s1.l0$c */
    /* loaded from: classes.dex */
    private static final class c implements e {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // p322s1.C6635l0.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo25897a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // p322s1.C6635l0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25898b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: s1.l0$d */
    /* loaded from: classes.dex */
    static final class d implements e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s1.l0$d$a */
        /* loaded from: classes.dex */
        public class a extends MediaDataSource {

            /* renamed from: a */
            final /* synthetic */ ByteBuffer f25461a;

            a(ByteBuffer byteBuffer) {
                this.f25461a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f25461a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f25461a.limit()) {
                    return -1;
                }
                this.f25461a.position((int) j10);
                int min = Math.min(i11, this.f25461a.remaining());
                this.f25461a.get(bArr, i10, min);
                return min;
            }
        }

        d() {
        }

        /* renamed from: c */
        private MediaDataSource m25901c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // p322s1.C6635l0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25897a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(m25901c(byteBuffer));
        }

        @Override // p322s1.C6635l0.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo25898b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(m25901c(byteBuffer));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.l0$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo25897a(MediaExtractor mediaExtractor, Object obj);

        /* renamed from: b */
        void mo25898b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: s1.l0$f */
    /* loaded from: classes.dex */
    static class f {
        f() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever m25904a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: s1.l0$g */
    /* loaded from: classes.dex */
    static final class g implements e {
        g() {
        }

        @Override // p322s1.C6635l0.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo25897a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // p322s1.C6635l0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25898b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1.l0$h */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    C6635l0(InterfaceC5571d interfaceC5571d, e eVar) {
        this(interfaceC5571d, eVar, f25454f);
    }

    /* renamed from: c */
    public static InterfaceC4979j m25884c(InterfaceC5571d interfaceC5571d) {
        return new C6635l0(interfaceC5571d, new c(null));
    }

    /* renamed from: d */
    public static InterfaceC4979j m25885d(InterfaceC5571d interfaceC5571d) {
        return new C6635l0(interfaceC5571d, new d());
    }

    /* renamed from: e */
    private static Bitmap m25886e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!m25891j()) {
            return bitmap;
        }
        boolean z10 = false;
        try {
            if (m25890i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    z10 = true;
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        if (!z10) {
            return bitmap;
        }
        if (Log.isLoggable("VideoDecoder", 3)) {
            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: f */
    private Bitmap m25887f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, AbstractC6640o abstractC6640o) {
        Bitmap bitmap;
        if (!m25893l(obj, mediaMetadataRetriever)) {
            if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && abstractC6640o != AbstractC6640o.f25474f) {
                bitmap = m25889h(mediaMetadataRetriever, j10, i10, i11, i12, abstractC6640o);
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                bitmap = m25888g(mediaMetadataRetriever, j10, i10);
            }
            Bitmap m25886e = m25886e(mediaMetadataRetriever, bitmap);
            if (m25886e != null) {
                return m25886e;
            }
            throw new h();
        }
        throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
    }

    /* renamed from: g */
    private static Bitmap m25888g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    /* renamed from: h */
    private static Bitmap m25889h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, AbstractC6640o abstractC6640o) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float mo25926b = abstractC6640o.mo25926b(parseInt, parseInt2, i11, i12);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(parseInt * mo25926b), Math.round(mo25926b * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                return null;
            }
            return null;
        }
    }

    /* renamed from: i */
    private static boolean m25890i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    static boolean m25891j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m25892k();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && i10 < 33) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m25892k() {
        Iterator it = f25455g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private boolean m25893l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        boolean z10 = false;
        String str = Build.DEVICE;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f25456a.mo25897a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString(IMediaFormat.KEY_MIME))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th2) {
            th = th2;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static InterfaceC4979j m25894m(InterfaceC5571d interfaceC5571d) {
        return new C6635l0(interfaceC5571d, new g());
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: a */
    public InterfaceC5335v mo20329a(Object obj, int i10, int i11, C4977h c4977h) {
        long longValue = ((Long) c4977h.m20325c(f25452d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) c4977h.m20325c(f25453e);
        if (num == null) {
            num = 2;
        }
        AbstractC6640o abstractC6640o = (AbstractC6640o) c4977h.m20325c(AbstractC6640o.f25476h);
        if (abstractC6640o == null) {
            abstractC6640o = AbstractC6640o.f25475g;
        }
        AbstractC6640o abstractC6640o2 = abstractC6640o;
        MediaMetadataRetriever m25904a = this.f25458c.m25904a();
        try {
            this.f25456a.mo25898b(m25904a, obj);
            return C6624g.m25851e(m25887f(obj, m25904a, longValue, num.intValue(), i10, i11, abstractC6640o2), this.f25457b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                m25904a.release();
            } else {
                m25904a.release();
            }
        }
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: b */
    public boolean mo20330b(Object obj, C4977h c4977h) {
        return true;
    }

    C6635l0(InterfaceC5571d interfaceC5571d, e eVar, f fVar) {
        this.f25457b = interfaceC5571d;
        this.f25456a = eVar;
        this.f25458c = fVar;
    }
}
