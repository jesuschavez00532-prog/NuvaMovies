package p307r1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import p184j1.C4976g;
import p184j1.C4977h;
import p184j1.EnumC4971b;
import p184j1.EnumC4978i;
import p322s1.AbstractC6640o;
import p322s1.C6646u;
import p322s1.C6651z;

/* renamed from: r1.n */
/* loaded from: classes.dex */
public final class C6508n implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    private final C6651z f24970a = C6651z.m25964b();

    /* renamed from: b */
    private final int f24971b;

    /* renamed from: c */
    private final int f24972c;

    /* renamed from: d */
    private final EnumC4971b f24973d;

    /* renamed from: e */
    private final AbstractC6640o f24974e;

    /* renamed from: f */
    private final boolean f24975f;

    /* renamed from: g */
    private final EnumC4978i f24976g;

    /* renamed from: r1.n$a */
    /* loaded from: classes.dex */
    class a implements ImageDecoder.OnPartialImageListener {
        a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C6508n(int i10, int i11, C4977h c4977h) {
        boolean z10;
        this.f24971b = i10;
        this.f24972c = i11;
        this.f24973d = (EnumC4971b) c4977h.m20325c(C6646u.f25481f);
        this.f24974e = (AbstractC6640o) c4977h.m20325c(AbstractC6640o.f25476h);
        C4976g c4976g = C6646u.f25485j;
        if (c4977h.m20325c(c4976g) != null && ((Boolean) c4977h.m20325c(c4976g)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24975f = z10;
        this.f24976g = (EnumC4978i) c4977h.m20325c(C6646u.f25482g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        int width;
        int height;
        int width2;
        int height2;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        int width3;
        int height3;
        boolean z10 = false;
        if (this.f24970a.m25968f(this.f24971b, this.f24972c, this.f24975f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f24973d == EnumC4971b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i10 = this.f24971b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f24972c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        AbstractC6640o abstractC6640o = this.f24974e;
        width = size.getWidth();
        height = size.getHeight();
        float mo25926b = abstractC6640o.mo25926b(width, height, i10, i11);
        width2 = size.getWidth();
        int round = Math.round(width2 * mo25926b);
        height2 = size.getHeight();
        int round2 = Math.round(height2 * mo25926b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Resizing from [");
            width3 = size.getWidth();
            sb2.append(width3);
            sb2.append("x");
            height3 = size.getHeight();
            sb2.append(height3);
            sb2.append("] to [");
            sb2.append(round);
            sb2.append("x");
            sb2.append(round2);
            sb2.append("] scaleFactor: ");
            sb2.append(mo25926b);
            Log.v("ImageDecoder", sb2.toString());
        }
        imageDecoder.setTargetSize(round, round2);
        EnumC4978i enumC4978i = this.f24976g;
        if (enumC4978i != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (enumC4978i == EnumC4978i.DISPLAY_P3) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            z10 = true;
                        }
                    }
                }
                colorSpace2 = ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                imageDecoder.setTargetColorSpace(colorSpace2);
                return;
            }
            if (i12 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
