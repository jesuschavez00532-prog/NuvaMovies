package com.lzy.okgo.convert;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public class BitmapConvert implements Converter<Bitmap> {
    private Bitmap.Config decodeConfig;
    private int maxHeight;
    private int maxWidth;
    private ImageView.ScaleType scaleType;

    public BitmapConvert() {
        this(1000, 1000, Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE);
    }

    private static int findBestSampleSize(int i10, int i11, int i12, int i13) {
        double d10 = i10;
        double d11 = i12;
        Double.isNaN(d10);
        Double.isNaN(d11);
        double d12 = i11;
        double d13 = i13;
        Double.isNaN(d12);
        Double.isNaN(d13);
        double min = Math.min(d10 / d11, d12 / d13);
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 <= min) {
                f10 = f11;
            } else {
                return (int) f10;
            }
        }
    }

    private static int getResizedDimension(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (i10 == 0) {
                return i12;
            }
            return i10;
        }
        if (i10 == 0) {
            double d10 = i11;
            double d11 = i13;
            Double.isNaN(d10);
            Double.isNaN(d11);
            double d12 = i12;
            Double.isNaN(d12);
            return (int) (d12 * (d10 / d11));
        }
        if (i11 == 0) {
            return i10;
        }
        double d13 = i13;
        double d14 = i12;
        Double.isNaN(d13);
        Double.isNaN(d14);
        double d15 = d13 / d14;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d16 = i10;
            Double.isNaN(d16);
            double d17 = i11;
            if (d16 * d15 < d17) {
                Double.isNaN(d17);
                return (int) (d17 / d15);
            }
            return i10;
        }
        double d18 = i10;
        Double.isNaN(d18);
        double d19 = i11;
        if (d18 * d15 > d19) {
            Double.isNaN(d19);
            return (int) (d19 / d15);
        }
        return i10;
    }

    private Bitmap parse(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.maxWidth == 0 && this.maxHeight == 0) {
            options.inPreferredConfig = this.decodeConfig;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        int resizedDimension = getResizedDimension(this.maxWidth, this.maxHeight, i10, i11, this.scaleType);
        int resizedDimension2 = getResizedDimension(this.maxHeight, this.maxWidth, i11, i10, this.scaleType);
        options.inJustDecodeBounds = false;
        options.inSampleSize = findBestSampleSize(i10, i11, resizedDimension, resizedDimension2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            if (decodeByteArray.getWidth() > resizedDimension || decodeByteArray.getHeight() > resizedDimension2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, resizedDimension, resizedDimension2, true);
                decodeByteArray.recycle();
                return createScaledBitmap;
            }
            return decodeByteArray;
        }
        return decodeByteArray;
    }

    public BitmapConvert(int i10, int i11) {
        this(i10, i11, Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.lzy.okgo.convert.Converter
    public Bitmap convertResponse(Response response) {
        ResponseBody body = response.body();
        if (body == null) {
            return null;
        }
        return parse(body.bytes());
    }

    public BitmapConvert(int i10, int i11, Bitmap.Config config, ImageView.ScaleType scaleType) {
        this.maxWidth = i10;
        this.maxHeight = i11;
        this.decodeConfig = config;
        this.scaleType = scaleType;
    }
}
