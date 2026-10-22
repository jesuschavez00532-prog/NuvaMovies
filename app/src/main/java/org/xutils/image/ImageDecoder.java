package org.xutils.image;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.C6127x;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.DiskCacheFile;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.Callback;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;

/* loaded from: classes3.dex */
public final class ImageDecoder {
    private static final int BITMAP_DECODE_MAX_WORKER;
    private static final AtomicInteger bitmapDecodeWorker = new AtomicInteger(0);
    private static final Object bitmapDecodeLock = new Object();
    private static final Object gifDecodeLock = new Object();
    private static final byte[] GIF_HEADER = {71, 73, 70};
    private static final Executor THUMB_CACHE_EXECUTOR = new PriorityExecutor(1, true);
    private static final LruDiskCache THUMB_CACHE = LruDiskCache.getDiskCache("xUtils_img_thumb");

    /* renamed from: org.xutils.image.ImageDecoder$a */
    /* loaded from: classes3.dex */
    static class RunnableC6116a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ File f24059a;

        /* renamed from: b */
        final /* synthetic */ ImageOptions f24060b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f24061c;

        RunnableC6116a(File file, ImageOptions imageOptions, Bitmap bitmap) {
            this.f24059a = file;
            this.f24060b = imageOptions;
            this.f24061c = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageDecoder.saveThumbCache(this.f24059a, this.f24060b, this.f24061c);
        }
    }

    static {
        int i10 = 1;
        if (Runtime.getRuntime().availableProcessors() > 4) {
            i10 = 2;
        }
        BITMAP_DECODE_MAX_WORKER = i10;
    }

    private ImageDecoder() {
    }

    public static int calculateSampleSize(int i10, int i11, int i12, int i13) {
        int round;
        int i14 = 1;
        if (i10 > i12 || i11 > i13) {
            if (i10 > i11) {
                round = Math.round(i11 / i13);
            } else {
                round = Math.round(i10 / i12);
            }
            if (round >= 1) {
                i14 = round;
            }
            while ((i10 * i11) / (i14 * i14) > i12 * i13 * 2) {
                i14++;
            }
        }
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void clearCacheFiles() {
        THUMB_CACHE.clearCacheFiles();
    }

    public static Bitmap cut2Circular(Bitmap bitmap, boolean z10) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        if (createBitmap != null) {
            Canvas canvas = new Canvas(createBitmap);
            float f10 = min / 2;
            canvas.drawCircle(f10, f10, f10, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (min - r0) / 2, (min - r1) / 2, paint);
            if (z10) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    public static Bitmap cut2RoundCorner(Bitmap bitmap, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        if (i10 <= 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (z10) {
            i11 = Math.min(width, height);
            i12 = i11;
        } else {
            i11 = width;
            i12 = height;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        if (createBitmap != null) {
            Canvas canvas = new Canvas(createBitmap);
            float f10 = i10;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, i11, i12), f10, f10, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (i11 - width) / 2, (i12 - height) / 2, paint);
            if (z11) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    public static Bitmap cut2ScaleSize(Bitmap bitmap, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == i10 && height == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f10 = i10;
        float f11 = width;
        float f12 = f10 / f11;
        float f13 = i11;
        float f14 = height;
        float f15 = f13 / f14;
        if (f12 > f15) {
            float f16 = f13 / f12;
            height = (int) ((f14 + f16) / 2.0f);
            i13 = (int) ((f14 - f16) / 2.0f);
            i12 = 0;
        } else {
            float f17 = f10 / f15;
            i12 = (int) ((f11 - f17) / 2.0f);
            width = (int) ((f11 + f17) / 2.0f);
            f12 = f15;
            i13 = 0;
        }
        matrix.setScale(f12, f12);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i12, i13, width - i12, height - i13, matrix, true);
        if (createBitmap != null) {
            if (z10 && createBitmap != bitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    public static Bitmap cut2Square(Bitmap bitmap, boolean z10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == height) {
            return bitmap;
        }
        int min = Math.min(width, height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (width - min) / 2, (height - min) / 2, min, min);
        if (createBitmap != null) {
            if (z10 && createBitmap != bitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
    
        r11 = rotate(r11, r4, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap decodeBitmap(java.io.File r11, org.xutils.image.ImageOptions r12, org.xutils.common.Callback.Cancelable r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.decodeBitmap(java.io.File, org.xutils.image.ImageOptions, org.xutils.common.Callback$Cancelable):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable decodeFileWithLock(File file, ImageOptions imageOptions, Callback.Cancelable cancelable) {
        AtomicInteger atomicInteger;
        Bitmap bitmap;
        Movie decodeGif;
        if (file == null || !file.exists() || file.length() < 1) {
            return null;
        }
        if (cancelable != null && cancelable.isCancelled()) {
            throw new Callback.CancelledException("cancelled during decode image");
        }
        if (!imageOptions.isIgnoreGif() && isGif(file)) {
            synchronized (gifDecodeLock) {
                decodeGif = decodeGif(file, imageOptions, cancelable);
            }
            if (decodeGif == null) {
                return null;
            }
            GifDrawable gifDrawable = new GifDrawable(decodeGif, (int) file.length());
            gifDrawable.setRate(imageOptions.getGifRate());
            return gifDrawable;
        }
        try {
            synchronized (bitmapDecodeLock) {
                while (true) {
                    atomicInteger = bitmapDecodeWorker;
                    if (atomicInteger.get() < BITMAP_DECODE_MAX_WORKER || (cancelable != null && cancelable.isCancelled())) {
                        break;
                    }
                    try {
                        bitmapDecodeLock.wait();
                    } catch (InterruptedException unused) {
                        throw new Callback.CancelledException("cancelled during decode image");
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (cancelable != null && cancelable.isCancelled()) {
                throw new Callback.CancelledException("cancelled during decode image");
            }
            atomicInteger.incrementAndGet();
            if (imageOptions.isCompress()) {
                bitmap = getThumbCache(file, imageOptions);
            } else {
                bitmap = null;
            }
            if (bitmap == null && (bitmap = decodeBitmap(file, imageOptions, cancelable)) != null && imageOptions.isCompress()) {
                THUMB_CACHE_EXECUTOR.execute(new RunnableC6116a(file, imageOptions, bitmap));
            }
            atomicInteger.decrementAndGet();
            Object obj = bitmapDecodeLock;
            synchronized (obj) {
                obj.notifyAll();
            }
            if (bitmap == null) {
                return null;
            }
            return new C6123c(C6127x.app().getResources(), bitmap);
        } catch (Throwable th) {
            if (0 != 0) {
                bitmapDecodeWorker.decrementAndGet();
            }
            Object obj2 = bitmapDecodeLock;
            synchronized (obj2) {
                obj2.notifyAll();
                throw th;
            }
        }
    }

    public static Movie decodeGif(File file, ImageOptions imageOptions, Callback.Cancelable cancelable) {
        if (file == null || !file.exists() || file.length() < 1) {
            return null;
        }
        if (cancelable != null) {
            try {
                if (cancelable.isCancelled()) {
                    throw new Callback.CancelledException("cancelled during decode image");
                }
            } catch (IOException e10) {
                throw e10;
            } catch (Callback.CancelledException e11) {
                throw e11;
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
                return null;
            }
        }
        Movie decodeFile = Movie.decodeFile(file.getAbsolutePath());
        if (decodeFile != null) {
            return decodeFile;
        }
        throw new IOException("decode image error");
    }

    @SuppressLint({"ExifInterface"})
    public static int getRotateAngle(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 0);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
            return 0;
        }
    }

    private static Bitmap getThumbCache(File file, ImageOptions imageOptions) {
        DiskCacheFile diskCacheFile;
        try {
            diskCacheFile = THUMB_CACHE.getDiskCacheFile(file.getAbsolutePath() + "@" + file.lastModified() + imageOptions.toString());
            if (diskCacheFile != null) {
                try {
                    if (diskCacheFile.exists()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inPurgeable = true;
                        options.inInputShareable = true;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        return BitmapFactory.decodeFile(diskCacheFile.getAbsolutePath(), options);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        LogUtil.m24382w(th.getMessage(), th);
                        return null;
                    } finally {
                        IOUtil.closeQuietly(diskCacheFile);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            diskCacheFile = null;
        }
        return null;
    }

    public static boolean isGif(File file) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                boolean equals = Arrays.equals(GIF_HEADER, IOUtil.readBytes(fileInputStream2, 0L, 3));
                IOUtil.closeQuietly(fileInputStream2);
                return equals;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    LogUtil.m24376e(th.getMessage(), th);
                    IOUtil.closeQuietly(fileInputStream);
                    return false;
                } catch (Throwable th2) {
                    IOUtil.closeQuietly(fileInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap rotate(android.graphics.Bitmap r7, int r8, boolean r9) {
        /*
            if (r8 == 0) goto L24
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r8 = (float) r8
            r5.setRotate(r8)
            r1 = 0
            r2 = 0
            int r3 = r7.getWidth()     // Catch: java.lang.Throwable -> L1c
            int r4 = r7.getHeight()     // Catch: java.lang.Throwable -> L1c
            r6 = 1
            r0 = r7
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            goto L25
        L1c:
            r8 = move-exception
            java.lang.String r0 = r8.getMessage()
            org.xutils.common.util.LogUtil.m24376e(r0, r8)
        L24:
            r8 = 0
        L25:
            if (r8 == 0) goto L2f
            if (r9 == 0) goto L2e
            if (r8 == r7) goto L2e
            r7.recycle()
        L2e:
            r7 = r8
        L2f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.rotate(android.graphics.Bitmap, int, boolean):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveThumbCache(File file, ImageOptions imageOptions, Bitmap bitmap) {
        FileOutputStream fileOutputStream;
        Throwable th;
        DiskCacheFile diskCacheFile;
        DiskCacheEntity diskCacheEntity = new DiskCacheEntity();
        diskCacheEntity.setKey(file.getAbsolutePath() + "@" + file.lastModified() + imageOptions.toString());
        FileOutputStream fileOutputStream2 = null;
        try {
            diskCacheFile = THUMB_CACHE.createDiskCacheFile(diskCacheEntity);
            if (diskCacheFile != null) {
                try {
                    fileOutputStream = new FileOutputStream(diskCacheFile);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream);
                        fileOutputStream.flush();
                        diskCacheFile = diskCacheFile.commit();
                        fileOutputStream2 = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            IOUtil.deleteFileOrDir(diskCacheFile);
                            LogUtil.m24382w(th.getMessage(), th);
                            return;
                        } finally {
                            IOUtil.closeQuietly(diskCacheFile);
                            IOUtil.closeQuietly(fileOutputStream);
                        }
                    }
                } catch (Throwable th3) {
                    fileOutputStream = null;
                    th = th3;
                }
            }
            IOUtil.closeQuietly(diskCacheFile);
            IOUtil.closeQuietly(fileOutputStream2);
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            diskCacheFile = null;
        }
    }
}
