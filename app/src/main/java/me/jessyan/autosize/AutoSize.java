package me.jessyan.autosize;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.raizlabs.android.dbflow.structure.provider.ContentUtils;
import java.util.Locale;
import me.jessyan.autosize.external.ExternalAdaptInfo;
import me.jessyan.autosize.internal.CustomAdapt;
import me.jessyan.autosize.unit.Subunits;
import me.jessyan.autosize.utils.AutoSizeLog;
import me.jessyan.autosize.utils.Preconditions;

/* loaded from: classes3.dex */
public final class AutoSize {
    private static final int MODE_DEVICE_SIZE = Integer.MIN_VALUE;
    private static final int MODE_MASK = -1073741824;
    private static final int MODE_ON_WIDTH = 1073741824;
    private static final int MODE_SHIFT = 30;
    private static SparseArray<DisplayMetricsInfo> mCache = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.jessyan.autosize.AutoSize$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C56521 {
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

    private AutoSize() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static void autoConvertDensity(Activity activity, float f10, boolean z10) {
        float designHeight;
        int screenHeight;
        float density;
        int densityDpi;
        float scaledDensity;
        int screenWidthDp;
        int screenHeightDp;
        float f11;
        int screenHeight2;
        float initScaledDensity;
        int screenHeight3;
        Preconditions.checkNotNull(activity, "activity == null");
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
            float f12 = initScaledDensity * density;
            densityDpi = (int) (160.0f * density);
            screenWidthDp = (int) (AutoSizeConfig.getInstance().getScreenWidth() / density);
            screenHeightDp = (int) (AutoSizeConfig.getInstance().getScreenHeight() / density);
            if (z10) {
                screenHeight3 = AutoSizeConfig.getInstance().getScreenWidth();
            } else {
                screenHeight3 = AutoSizeConfig.getInstance().getScreenHeight();
            }
            float f13 = (screenHeight3 * 1.0f) / designHeight;
            mCache.put(i11, new DisplayMetricsInfo(density, densityDpi, f12, f13, screenWidthDp, screenHeightDp));
            scaledDensity = f12;
            f11 = f13;
        } else {
            density = displayMetricsInfo.getDensity();
            densityDpi = displayMetricsInfo.getDensityDpi();
            scaledDensity = displayMetricsInfo.getScaledDensity();
            float xdpi = displayMetricsInfo.getXdpi();
            screenWidthDp = displayMetricsInfo.getScreenWidthDp();
            screenHeightDp = displayMetricsInfo.getScreenHeightDp();
            f11 = xdpi;
        }
        setDensity(activity, density, densityDpi, scaledDensity, f11);
        setScreenSizeDp(activity, screenWidthDp, screenHeightDp);
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[13];
        objArr[0] = activity.getClass().getName();
        objArr[1] = activity.getClass().getSimpleName();
        objArr[2] = Boolean.valueOf(z10);
        objArr[3] = z10 ? "designWidthInDp" : "designHeightInDp";
        objArr[4] = Float.valueOf(f10);
        objArr[5] = z10 ? "designWidthInSubunits" : "designHeightInSubunits";
        objArr[6] = Float.valueOf(designHeight);
        objArr[7] = Float.valueOf(density);
        objArr[8] = Float.valueOf(scaledDensity);
        objArr[9] = Integer.valueOf(densityDpi);
        objArr[10] = Float.valueOf(f11);
        objArr[11] = Integer.valueOf(screenWidthDp);
        objArr[12] = Integer.valueOf(screenHeightDp);
        AutoSizeLog.m22899d(String.format(locale, "The %s has been adapted! \n%s Info: isBaseOnWidth = %s, %s = %f, %s = %f, targetDensity = %f, targetScaledDensity = %f, targetDensityDpi = %d, targetXdpi = %f, targetScreenWidthDp = %d, targetScreenHeightDp = %d", objArr));
    }

    public static void autoConvertDensityBaseOnHeight(Activity activity, float f10) {
        autoConvertDensity(activity, f10, false);
    }

    public static void autoConvertDensityBaseOnWidth(Activity activity, float f10) {
        autoConvertDensity(activity, f10, true);
    }

    public static void autoConvertDensityOfCustomAdapt(Activity activity, CustomAdapt customAdapt) {
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
        autoConvertDensity(activity, sizeInDp, customAdapt.isBaseOnWidth());
    }

    public static void autoConvertDensityOfExternalAdaptInfo(Activity activity, ExternalAdaptInfo externalAdaptInfo) {
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
        autoConvertDensity(activity, sizeInDp, externalAdaptInfo.isBaseOnWidth());
    }

    public static void autoConvertDensityOfGlobal(Activity activity) {
        if (AutoSizeConfig.getInstance().isBaseOnWidth()) {
            autoConvertDensityBaseOnWidth(activity, AutoSizeConfig.getInstance().getDesignWidthInDp());
        } else {
            autoConvertDensityBaseOnHeight(activity, AutoSizeConfig.getInstance().getDesignHeightInDp());
        }
    }

    public static void cancelAdapt(Activity activity) {
        float f10;
        Preconditions.checkMainThread();
        float initXdpi = AutoSizeConfig.getInstance().getInitXdpi();
        int i10 = C56521.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 25.4f;
            }
            setDensity(activity, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
            setScreenSizeDp(activity, AutoSizeConfig.getInstance().getInitScreenWidthDp(), AutoSizeConfig.getInstance().getInitScreenHeightDp());
        }
        f10 = 72.0f;
        initXdpi /= f10;
        setDensity(activity, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
        setScreenSizeDp(activity, AutoSizeConfig.getInstance().getInitScreenWidthDp(), AutoSizeConfig.getInstance().getInitScreenHeightDp());
    }

    public static void checkAndInit(Application application) {
        if (!checkInit()) {
            AutoSizeConfig.getInstance().setLog(true).init(application).setUseDeviceSize(false);
        }
    }

    public static boolean checkInit() {
        if (AutoSizeConfig.getInstance().getInitDensity() != -1.0f) {
            return true;
        }
        return false;
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

    public static void initCompatMultiProcess(Context context) {
        context.getContentResolver().query(Uri.parse(ContentUtils.BASE_CONTENT_URI + context.getPackageName() + ".autosize-init-provider"), null, null, null, null);
    }

    private static void setDensity(Activity activity, float f10, int i10, float f11, float f12) {
        setDensity(activity.getResources().getDisplayMetrics(), f10, i10, f11, f12);
        setDensity(AutoSizeConfig.getInstance().getApplication().getResources().getDisplayMetrics(), f10, i10, f11, f12);
        DisplayMetrics metricsOnMiui = getMetricsOnMiui(activity.getResources());
        DisplayMetrics metricsOnMiui2 = getMetricsOnMiui(AutoSizeConfig.getInstance().getApplication().getResources());
        if (metricsOnMiui != null) {
            setDensity(metricsOnMiui, f10, i10, f11, f12);
        }
        if (metricsOnMiui2 != null) {
            setDensity(metricsOnMiui2, f10, i10, f11, f12);
        }
    }

    private static void setScreenSizeDp(Activity activity, int i10, int i11) {
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportDP() && AutoSizeConfig.getInstance().getUnitsManager().isSupportScreenSizeDP()) {
            setScreenSizeDp(activity.getResources().getConfiguration(), i10, i11);
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
        int i11 = C56521.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
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
