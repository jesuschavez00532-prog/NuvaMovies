package me.jessyan.autosize;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import me.jessyan.autosize.external.ExternalAdaptInfo;
import me.jessyan.autosize.internal.CustomAdapt;
import me.jessyan.autosize.unit.Subunits;
import me.jessyan.autosize.utils.Preconditions;

/* loaded from: classes3.dex */
public final class AutoSizeCompat {
    private static final int MODE_DEVICE_SIZE = Integer.MIN_VALUE;
    private static final int MODE_MASK = -1073741824;
    private static final int MODE_ON_WIDTH = 1073741824;
    private static final int MODE_SHIFT = 30;
    private static SparseArray<DisplayMetricsInfo> mCache = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.jessyan.autosize.AutoSizeCompat$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C56531 {
        static final /* synthetic */ int[] $SwitchMap$me$jessyan$autosize$unit$Subunits;

        static {
            int[] iArr = new int[Subunits.values().length];
            $SwitchMap$me$jessyan$autosize$unit$Subunits = iArr;
            try {
                iArr[Subunits.PT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.MM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private AutoSizeCompat() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static void autoConvertDensity(Resources resources, float f10, boolean z10) {
        float designHeight;
        int screenHeight;
        float density;
        int densityDpi;
        float scaledDensity;
        float xdpi;
        int screenWidthDp;
        int screenHeightDp;
        int screenHeight2;
        float initScaledDensity;
        int screenHeight3;
        Preconditions.checkNotNull(resources, "resources == null");
        Preconditions.checkMainThread();
        if (z10) {
            designHeight = AutoSizeConfig.getInstance().getUnitsManager().getDesignWidth();
        } else {
            designHeight = AutoSizeConfig.getInstance().getUnitsManager().getDesignHeight();
        }
        if (designHeight <= 0.0f) {
            designHeight = f10;
        }
        if (z10) {
            screenHeight = AutoSizeConfig.getInstance().getScreenWidth();
        } else {
            screenHeight = AutoSizeConfig.getInstance().getScreenHeight();
        }
        int round = Math.round((f10 + designHeight + screenHeight) * AutoSizeConfig.getInstance().getInitScaledDensity()) & 1073741823;
        int i10 = z10 ? round | MODE_ON_WIDTH : round & (-1073741825);
        int i11 = AutoSizeConfig.getInstance().isUseDeviceSize() ? i10 | Integer.MIN_VALUE : i10 & Integer.MAX_VALUE;
        DisplayMetricsInfo displayMetricsInfo = mCache.get(i11);
        if (displayMetricsInfo == null) {
            if (z10) {
                screenHeight2 = AutoSizeConfig.getInstance().getScreenWidth();
            } else {
                screenHeight2 = AutoSizeConfig.getInstance().getScreenHeight();
            }
            density = (screenHeight2 * 1.0f) / f10;
            if (AutoSizeConfig.getInstance().getPrivateFontScale() > 0.0f) {
                initScaledDensity = AutoSizeConfig.getInstance().getPrivateFontScale();
            } else {
                initScaledDensity = AutoSizeConfig.getInstance().isExcludeFontScale() ? 1.0f : (AutoSizeConfig.getInstance().getInitScaledDensity() * 1.0f) / AutoSizeConfig.getInstance().getInitDensity();
            }
            scaledDensity = initScaledDensity * density;
            densityDpi = (int) (160.0f * density);
            screenWidthDp = (int) (AutoSizeConfig.getInstance().getScreenWidth() / density);
            screenHeightDp = (int) (AutoSizeConfig.getInstance().getScreenHeight() / density);
            if (z10) {
                screenHeight3 = AutoSizeConfig.getInstance().getScreenWidth();
            } else {
                screenHeight3 = AutoSizeConfig.getInstance().getScreenHeight();
            }
            float f11 = (screenHeight3 * 1.0f) / designHeight;
            mCache.put(i11, new DisplayMetricsInfo(density, densityDpi, scaledDensity, f11, screenWidthDp, screenHeightDp));
            xdpi = f11;
        } else {
            density = displayMetricsInfo.getDensity();
            densityDpi = displayMetricsInfo.getDensityDpi();
            scaledDensity = displayMetricsInfo.getScaledDensity();
            xdpi = displayMetricsInfo.getXdpi();
            screenWidthDp = displayMetricsInfo.getScreenWidthDp();
            screenHeightDp = displayMetricsInfo.getScreenHeightDp();
        }
        setDensity(resources, density, densityDpi, scaledDensity, xdpi);
        setScreenSizeDp(resources, screenWidthDp, screenHeightDp);
    }

    public static void autoConvertDensityBaseOnHeight(Resources resources, float f10) {
        autoConvertDensity(resources, f10, false);
    }

    public static void autoConvertDensityBaseOnWidth(Resources resources, float f10) {
        autoConvertDensity(resources, f10, true);
    }

    public static void autoConvertDensityOfCustomAdapt(Resources resources, CustomAdapt customAdapt) {
        int designHeightInDp;
        Preconditions.checkNotNull(customAdapt, "customAdapt == null");
        float sizeInDp = customAdapt.getSizeInDp();
        if (sizeInDp <= 0.0f) {
            if (customAdapt.isBaseOnWidth()) {
                designHeightInDp = AutoSizeConfig.getInstance().getDesignWidthInDp();
            } else {
                designHeightInDp = AutoSizeConfig.getInstance().getDesignHeightInDp();
            }
            sizeInDp = designHeightInDp;
        }
        autoConvertDensity(resources, sizeInDp, customAdapt.isBaseOnWidth());
    }

    public static void autoConvertDensityOfExternalAdaptInfo(Resources resources, ExternalAdaptInfo externalAdaptInfo) {
        int designHeightInDp;
        Preconditions.checkNotNull(externalAdaptInfo, "externalAdaptInfo == null");
        float sizeInDp = externalAdaptInfo.getSizeInDp();
        if (sizeInDp <= 0.0f) {
            if (externalAdaptInfo.isBaseOnWidth()) {
                designHeightInDp = AutoSizeConfig.getInstance().getDesignWidthInDp();
            } else {
                designHeightInDp = AutoSizeConfig.getInstance().getDesignHeightInDp();
            }
            sizeInDp = designHeightInDp;
        }
        autoConvertDensity(resources, sizeInDp, externalAdaptInfo.isBaseOnWidth());
    }

    public static void autoConvertDensityOfGlobal(Resources resources) {
        if (AutoSizeConfig.getInstance().isBaseOnWidth()) {
            autoConvertDensityBaseOnWidth(resources, AutoSizeConfig.getInstance().getDesignWidthInDp());
        } else {
            autoConvertDensityBaseOnHeight(resources, AutoSizeConfig.getInstance().getDesignHeightInDp());
        }
    }

    public static void cancelAdapt(Resources resources) {
        float f10;
        Preconditions.checkMainThread();
        float initXdpi = AutoSizeConfig.getInstance().getInitXdpi();
        int i10 = C56531.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 25.4f;
            }
            setDensity(resources, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
            setScreenSizeDp(resources, AutoSizeConfig.getInstance().getInitScreenWidthDp(), AutoSizeConfig.getInstance().getInitScreenHeightDp());
        }
        f10 = 72.0f;
        initXdpi /= f10;
        setDensity(resources, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
        setScreenSizeDp(resources, AutoSizeConfig.getInstance().getInitScreenWidthDp(), AutoSizeConfig.getInstance().getInitScreenHeightDp());
    }

    private static DisplayMetrics getMetricsOnMiui(Resources resources) {
        if (AutoSizeConfig.getInstance().isMiui() && AutoSizeConfig.getInstance().getTmpMetricsField() != null) {
            try {
                return (DisplayMetrics) AutoSizeConfig.getInstance().getTmpMetricsField().get(resources);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static void setDensity(Resources resources, float f10, int i10, float f11, float f12) {
        setDensity(resources.getDisplayMetrics(), f10, i10, f11, f12);
        setDensity(AutoSizeConfig.getInstance().getApplication().getResources().getDisplayMetrics(), f10, i10, f11, f12);
        DisplayMetrics metricsOnMiui = getMetricsOnMiui(resources);
        DisplayMetrics metricsOnMiui2 = getMetricsOnMiui(AutoSizeConfig.getInstance().getApplication().getResources());
        if (metricsOnMiui != null) {
            setDensity(metricsOnMiui, f10, i10, f11, f12);
        }
        if (metricsOnMiui2 != null) {
            setDensity(metricsOnMiui2, f10, i10, f11, f12);
        }
    }

    private static void setScreenSizeDp(Resources resources, int i10, int i11) {
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportDP() && AutoSizeConfig.getInstance().getUnitsManager().isSupportScreenSizeDP()) {
            setScreenSizeDp(resources.getConfiguration(), i10, i11);
            setScreenSizeDp(AutoSizeConfig.getInstance().getApplication().getResources().getConfiguration(), i10, i11);
        }
    }

    private static void setScreenSizeDp(Configuration configuration, int i10, int i11) {
        configuration.screenWidthDp = i10;
        configuration.screenHeightDp = i11;
    }

    private static void setDensity(DisplayMetrics displayMetrics, float f10, int i10, float f11, float f12) {
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportDP()) {
            displayMetrics.density = f10;
            displayMetrics.densityDpi = i10;
        }
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportSP()) {
            displayMetrics.scaledDensity = f11;
        }
        int i11 = C56531.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i11 == 1) {
            displayMetrics.xdpi = f12 * 72.0f;
        } else if (i11 == 2) {
            displayMetrics.xdpi = f12 * 25.4f;
        } else {
            if (i11 != 4) {
                return;
            }
            displayMetrics.xdpi = f12;
        }
    }
}
