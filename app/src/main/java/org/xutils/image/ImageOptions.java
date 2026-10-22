package org.xutils.image;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import org.xutils.common.util.DensityUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;

/* loaded from: classes3.dex */
public class ImageOptions {
    public static final ImageOptions DEFAULT = new ImageOptions();
    private ParamsBuilder paramsBuilder;
    private int maxWidth = 0;
    private int maxHeight = 0;
    private int width = 0;
    private int height = 0;
    private boolean crop = false;
    private int radius = 0;
    private boolean square = false;
    private boolean circular = false;
    private boolean autoRotate = false;
    private boolean compress = true;
    private Bitmap.Config config = Bitmap.Config.RGB_565;
    private boolean ignoreGif = true;
    private int gifRate = 100;
    private int loadingDrawableId = 0;
    private int failureDrawableId = 0;
    private Drawable loadingDrawable = null;
    private Drawable failureDrawable = null;
    private boolean forceLoadingDrawable = true;
    private ImageView.ScaleType placeholderScaleType = ImageView.ScaleType.CENTER_INSIDE;
    private ImageView.ScaleType imageScaleType = ImageView.ScaleType.CENTER_CROP;
    private boolean fadeIn = false;
    private Animation animation = null;
    private boolean useMemCache = true;

    /* loaded from: classes3.dex */
    public static class Builder {
        protected ImageOptions options;

        public Builder() {
            newImageOptions();
        }

        public ImageOptions build() {
            return this.options;
        }

        protected void newImageOptions() {
            this.options = new ImageOptions();
        }

        public Builder setAnimation(Animation animation) {
            this.options.animation = animation;
            return this;
        }

        public Builder setAutoRotate(boolean z10) {
            this.options.autoRotate = z10;
            return this;
        }

        public Builder setCircular(boolean z10) {
            this.options.circular = z10;
            return this;
        }

        public Builder setConfig(Bitmap.Config config) {
            this.options.config = config;
            return this;
        }

        public Builder setCrop(boolean z10) {
            this.options.crop = z10;
            return this;
        }

        public Builder setFadeIn(boolean z10) {
            this.options.fadeIn = z10;
            return this;
        }

        public Builder setFailureDrawable(Drawable drawable) {
            this.options.failureDrawable = drawable;
            return this;
        }

        public Builder setFailureDrawableId(int i10) {
            this.options.failureDrawableId = i10;
            return this;
        }

        public Builder setForceLoadingDrawable(boolean z10) {
            this.options.forceLoadingDrawable = z10;
            return this;
        }

        public Builder setGifRate(int i10) {
            this.options.gifRate = i10;
            return this;
        }

        public Builder setIgnoreGif(boolean z10) {
            this.options.ignoreGif = z10;
            return this;
        }

        public Builder setImageScaleType(ImageView.ScaleType scaleType) {
            this.options.imageScaleType = scaleType;
            return this;
        }

        public Builder setLoadingDrawable(Drawable drawable) {
            this.options.loadingDrawable = drawable;
            return this;
        }

        public Builder setLoadingDrawableId(int i10) {
            this.options.loadingDrawableId = i10;
            return this;
        }

        public Builder setParamsBuilder(ParamsBuilder paramsBuilder) {
            this.options.paramsBuilder = paramsBuilder;
            return this;
        }

        public Builder setPlaceholderScaleType(ImageView.ScaleType scaleType) {
            this.options.placeholderScaleType = scaleType;
            return this;
        }

        public Builder setRadius(int i10) {
            this.options.radius = i10;
            return this;
        }

        public Builder setSize(int i10, int i11) {
            this.options.width = i10;
            this.options.height = i11;
            return this;
        }

        public Builder setSquare(boolean z10) {
            this.options.square = z10;
            return this;
        }

        public Builder setUseMemCache(boolean z10) {
            this.options.useMemCache = z10;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface ParamsBuilder {
        RequestParams buildParams(RequestParams requestParams, ImageOptions imageOptions);
    }

    protected ImageOptions() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageOptions imageOptions = (ImageOptions) obj;
        if (this.maxWidth == imageOptions.maxWidth && this.maxHeight == imageOptions.maxHeight && this.width == imageOptions.width && this.height == imageOptions.height && this.crop == imageOptions.crop && this.radius == imageOptions.radius && this.square == imageOptions.square && this.circular == imageOptions.circular && this.autoRotate == imageOptions.autoRotate && this.compress == imageOptions.compress && this.config == imageOptions.config) {
            return true;
        }
        return false;
    }

    public Animation getAnimation() {
        return this.animation;
    }

    public Bitmap.Config getConfig() {
        return this.config;
    }

    public Drawable getFailureDrawable(ImageView imageView) {
        if (this.failureDrawable == null && this.failureDrawableId > 0 && imageView != null) {
            try {
                this.failureDrawable = imageView.getResources().getDrawable(this.failureDrawableId);
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
        }
        return this.failureDrawable;
    }

    public int getGifRate() {
        return this.gifRate;
    }

    public int getHeight() {
        return this.height;
    }

    public ImageView.ScaleType getImageScaleType() {
        return this.imageScaleType;
    }

    public Drawable getLoadingDrawable(ImageView imageView) {
        if (this.loadingDrawable == null && this.loadingDrawableId > 0 && imageView != null) {
            try {
                this.loadingDrawable = imageView.getResources().getDrawable(this.loadingDrawableId);
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
        }
        return this.loadingDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public ParamsBuilder getParamsBuilder() {
        return this.paramsBuilder;
    }

    public ImageView.ScaleType getPlaceholderScaleType() {
        return this.placeholderScaleType;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i10;
        int i11 = ((((((((((((((((((this.maxWidth * 31) + this.maxHeight) * 31) + this.width) * 31) + this.height) * 31) + (this.crop ? 1 : 0)) * 31) + this.radius) * 31) + (this.square ? 1 : 0)) * 31) + (this.circular ? 1 : 0)) * 31) + (this.autoRotate ? 1 : 0)) * 31) + (this.compress ? 1 : 0)) * 31;
        Bitmap.Config config = this.config;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public boolean isAutoRotate() {
        return this.autoRotate;
    }

    public boolean isCircular() {
        return this.circular;
    }

    public boolean isCompress() {
        return this.compress;
    }

    public boolean isCrop() {
        return this.crop;
    }

    public boolean isFadeIn() {
        return this.fadeIn;
    }

    public boolean isForceLoadingDrawable() {
        return this.forceLoadingDrawable;
    }

    public boolean isIgnoreGif() {
        return this.ignoreGif;
    }

    public boolean isSquare() {
        return this.square;
    }

    public boolean isUseMemCache() {
        return this.useMemCache;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void optimizeMaxSize(ImageView imageView) {
        int i10;
        int i11 = this.width;
        if (i11 > 0 && (i10 = this.height) > 0) {
            this.maxWidth = i11;
            this.maxHeight = i10;
            return;
        }
        int screenWidth = DensityUtil.getScreenWidth();
        int screenHeight = DensityUtil.getScreenHeight();
        if (this == DEFAULT) {
            int i12 = (screenWidth * 3) / 2;
            this.width = i12;
            this.maxWidth = i12;
            int i13 = (screenHeight * 3) / 2;
            this.height = i13;
            this.maxHeight = i13;
            return;
        }
        if (this.width < 0) {
            this.maxWidth = (screenWidth * 3) / 2;
            this.compress = false;
        }
        if (this.height < 0) {
            this.maxHeight = (screenHeight * 3) / 2;
            this.compress = false;
        }
        if (imageView == null && this.maxWidth <= 0 && this.maxHeight <= 0) {
            this.maxWidth = screenWidth;
            this.maxHeight = screenHeight;
            return;
        }
        int i14 = this.maxWidth;
        int i15 = this.maxHeight;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                if (i14 <= 0) {
                    int i16 = layoutParams.width;
                    if (i16 > 0) {
                        if (this.width <= 0) {
                            this.width = i16;
                        }
                        i14 = i16;
                    } else if (i16 != -2) {
                        i14 = imageView.getWidth();
                    }
                }
                if (i15 <= 0) {
                    int i17 = layoutParams.height;
                    if (i17 > 0) {
                        if (this.height <= 0) {
                            this.height = i17;
                        }
                        i15 = i17;
                    } else if (i17 != -2) {
                        i15 = imageView.getHeight();
                    }
                }
            }
            if (i14 <= 0) {
                i14 = imageView.getMaxWidth();
            }
            if (i15 <= 0) {
                i15 = imageView.getMaxHeight();
            }
        }
        if (i14 > 0) {
            screenWidth = i14;
        }
        if (i15 > 0) {
            screenHeight = i15;
        }
        this.maxWidth = screenWidth;
        this.maxHeight = screenHeight;
    }

    public String toString() {
        return "_" + this.maxWidth + "_" + this.maxHeight + "_" + this.width + "_" + this.height + "_" + this.radius + "_" + this.config + "_" + (this.crop ? 1 : 0) + (this.square ? 1 : 0) + (this.circular ? 1 : 0) + (this.autoRotate ? 1 : 0) + (this.compress ? 1 : 0);
    }
}
