package com.lzy.okgo.callback;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.lzy.okgo.convert.BitmapConvert;
import okhttp3.Response;

/* loaded from: classes2.dex */
public abstract class BitmapCallback extends AbsCallback<Bitmap> {
    private BitmapConvert convert;

    public BitmapCallback() {
        this.convert = new BitmapConvert();
    }

    @Override // com.lzy.okgo.convert.Converter
    public Bitmap convertResponse(Response response) {
        Bitmap convertResponse = this.convert.convertResponse(response);
        response.close();
        return convertResponse;
    }

    public BitmapCallback(int i10, int i11) {
        this.convert = new BitmapConvert(i10, i11);
    }

    public BitmapCallback(int i10, int i11, Bitmap.Config config, ImageView.ScaleType scaleType) {
        this.convert = new BitmapConvert(i10, i11, config, scaleType);
    }
}
