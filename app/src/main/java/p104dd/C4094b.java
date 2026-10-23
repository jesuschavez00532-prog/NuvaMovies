package p104dd;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.titans.entity.RangerPlayTag;
import com.umeng.analytics.pro.C3384f;
import java.util.HashMap;
import ne.AbstractC5868k;
import vc.EnumC7254b;

/* renamed from: dd.b */
/* loaded from: classes3.dex */
public final class C4094b {

    /* renamed from: a */
    public static final C4094b f17998a = new C4094b();

    /* renamed from: b */
    private static final String f17999b = "MediaPlayerSwitchUtils";

    /* renamed from: c */
    private static int f18000c = -1;

    /* renamed from: d */
    private static int f18001d = -1;

    /* renamed from: e */
    private static HashMap f18002e = new HashMap();

    /* renamed from: f */
    private static EnumC7254b f18003f;

    /* renamed from: g */
    private static SharedPreferences f18004g;

    /* renamed from: dd.b$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18005a;

        static {
            int[] iArr = new int[EnumC7254b.values().length];
            try {
                iArr[EnumC7254b.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7254b.IJK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7254b.EXO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18005a = iArr;
        }
    }

    private C4094b() {
    }

    /* renamed from: m */
    private final EnumC7254b m17136m(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return EnumC7254b.IJK;
                }
                return EnumC7254b.EXO;
            }
            return EnumC7254b.IJK;
        }
        return EnumC7254b.NATIVE;
    }

    /* renamed from: n */
    private final int m17137n(EnumC7254b enumC7254b) {
        int i10 = a.f18005a[enumC7254b.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 != 3) {
            return 2;
        }
        return 3;
    }

    /* renamed from: a */
    public final EnumC7254b m17138a(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        Integer num = (Integer) f18002e.get(str);
        if (num == null) {
            SharedPreferences sharedPreferences = f18004g;
            if (sharedPreferences == null) {
                AbstractC5868k.m23686r("mSp");
                sharedPreferences = null;
            }
            num = Integer.valueOf(sharedPreferences.getInt("MediaPlayerTypeKey" + str, -1));
            if (num.intValue() == -1) {
                if (Build.VERSION.SDK_INT > 22) {
                    num = 2;
                } else {
                    num = 1;
                }
            }
            f18002e.put(str, num);
        }
        return m17136m(num.intValue());
    }

    /* renamed from: b */
    public final EnumC7254b m17139b() {
        return f18003f;
    }

    /* renamed from: c */
    public final EnumC7254b m17140c(String str, String str2) {
        AbstractC5868k.m23674f(str, "buss");
        AbstractC5868k.m23674f(str2, "programCode");
        if (AbstractC5868k.m23669a(str, RangerPlayTag.VOD.getValue())) {
            return m17145h();
        }
        if (AbstractC5868k.m23669a(str, RangerPlayTag.RECORD.getValue())) {
            return m17144g();
        }
        return m17138a(str2);
    }

    /* renamed from: d */
    public final HashMap m17141d() {
        return f18002e;
    }

    /* renamed from: e */
    public final int m17142e() {
        return f18001d;
    }

    /* renamed from: f */
    public final int m17143f() {
        return f18000c;
    }

    /* renamed from: g */
    public final EnumC7254b m17144g() {
        int i10 = 0;
        if (f18001d == -1) {
            SharedPreferences sharedPreferences = f18004g;
            if (sharedPreferences == null) {
                AbstractC5868k.m23686r("mSp");
                sharedPreferences = null;
            }
            int i11 = sharedPreferences.getInt("MediaPlayerTypeKey" + RangerPlayTag.RECORD.getValue(), -1);
            f18001d = i11;
            if (i11 == -1) {
                if (Build.VERSION.SDK_INT > 22) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                f18001d = i10;
            }
        }
        return m17136m(f18001d);
    }

    /* renamed from: h */
    public final EnumC7254b m17145h() {
        int i10 = 0;
        if (f18000c == -1) {
            SharedPreferences sharedPreferences = f18004g;
            if (sharedPreferences == null) {
                AbstractC5868k.m23686r("mSp");
                sharedPreferences = null;
            }
            int i11 = sharedPreferences.getInt("MediaPlayerTypeKey" + RangerPlayTag.VOD.getValue(), -1);
            f18000c = i11;
            if (i11 == -1) {
                if (Build.VERSION.SDK_INT > 22) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                f18000c = i10;
            }
        }
        return m17136m(f18000c);
    }

    /* renamed from: i */
    public final void m17146i(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        SharedPreferences sharedPreferences = context.getSharedPreferences("playerSwitch", 0);
        AbstractC5868k.m23673e(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        f18004g = sharedPreferences;
    }

    /* renamed from: j */
    public final void m17147j(String str, String str2) {
        AbstractC5868k.m23674f(str, "buss");
        AbstractC5868k.m23674f(str2, "programCode");
        RangerPlayTag rangerPlayTag = RangerPlayTag.VOD;
        SharedPreferences sharedPreferences = null;
        if (AbstractC5868k.m23669a(str, rangerPlayTag.getValue())) {
            SharedPreferences sharedPreferences2 = f18004g;
            if (sharedPreferences2 == null) {
                AbstractC5868k.m23686r("mSp");
            } else {
                sharedPreferences = sharedPreferences2;
            }
            sharedPreferences.edit().putInt("MediaPlayerTypeKey" + rangerPlayTag.getValue(), f18000c).apply();
            return;
        }
        RangerPlayTag rangerPlayTag2 = RangerPlayTag.RECORD;
        if (AbstractC5868k.m23669a(str, rangerPlayTag2.getValue())) {
            SharedPreferences sharedPreferences3 = f18004g;
            if (sharedPreferences3 == null) {
                AbstractC5868k.m23686r("mSp");
            } else {
                sharedPreferences = sharedPreferences3;
            }
            sharedPreferences.edit().putInt("MediaPlayerTypeKey" + rangerPlayTag2.getValue(), f18001d).apply();
            return;
        }
        SharedPreferences sharedPreferences4 = f18004g;
        if (sharedPreferences4 == null) {
            AbstractC5868k.m23686r("mSp");
        } else {
            sharedPreferences = sharedPreferences4;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String str3 = "MediaPlayerTypeKey" + str2;
        Integer num = (Integer) f18002e.get(str2);
        if (num == null) {
            num = -1;
        }
        edit.putInt(str3, num.intValue()).apply();
    }

    /* renamed from: k */
    public final void m17148k(EnumC7254b enumC7254b) {
        f18003f = enumC7254b;
    }

    /* renamed from: l */
    public final void m17149l(String str, String str2, EnumC7254b enumC7254b) {
        AbstractC5868k.m23674f(str, "buss");
        AbstractC5868k.m23674f(str2, "programCode");
        AbstractC5868k.m23674f(enumC7254b, "playerType");
        if (AbstractC5868k.m23669a(str, RangerPlayTag.VOD.getValue())) {
            f18000c = m17137n(enumC7254b);
        } else if (AbstractC5868k.m23669a(str, RangerPlayTag.RECORD.getValue())) {
            f18001d = m17137n(enumC7254b);
        } else {
            f18002e.put(str2, Integer.valueOf(m17137n(enumC7254b)));
        }
    }
}
