package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p290q.AbstractC6307l;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f2300k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f2301a;

    /* renamed from: b */
    Object f2302b;

    /* renamed from: c */
    public byte[] f2303c;

    /* renamed from: d */
    public Parcelable f2304d;

    /* renamed from: e */
    public int f2305e;

    /* renamed from: f */
    public int f2306f;

    /* renamed from: g */
    public ColorStateList f2307g;

    /* renamed from: h */
    PorterDuff.Mode f2308h;

    /* renamed from: i */
    public String f2309i;

    /* renamed from: j */
    public String f2310j;

    public IconCompat() {
        this.f2301a = -1;
        this.f2303c = null;
        this.f2304d = null;
        this.f2305e = 0;
        this.f2306f = 0;
        this.f2307g = null;
        this.f2308h = f2300k;
        this.f2309i = null;
    }

    /* renamed from: a */
    static Bitmap m2357a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m2358b(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f2302b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    /* renamed from: c */
    public static IconCompat m2359c(Resources resources, String str, int i10) {
        if (str != null) {
            if (i10 != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.f2305e = i10;
                if (resources != null) {
                    try {
                        iconCompat.f2302b = resources.getResourceName(i10);
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                } else {
                    iconCompat.f2302b = str;
                }
                iconCompat.f2310j = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    /* renamed from: f */
    private static int m2360f(Icon icon) {
        int resId;
        if (Build.VERSION.SDK_INT >= 28) {
            resId = icon.getResId();
            return resId;
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    /* renamed from: h */
    private static String m2361h(Icon icon) {
        String resPackage;
        if (Build.VERSION.SDK_INT >= 28) {
            resPackage = icon.getResPackage();
            return resPackage;
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    /* renamed from: j */
    private static int m2362j(Icon icon) {
        int type;
        if (Build.VERSION.SDK_INT >= 28) {
            type = icon.getType();
            return type;
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e12);
            return -1;
        }
    }

    /* renamed from: l */
    private static Uri m2363l(Icon icon) {
        Uri uri;
        if (Build.VERSION.SDK_INT >= 28) {
            uri = icon.getUri();
            return uri;
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    /* renamed from: r */
    private static String m2364r(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: d */
    public Bitmap m2365d() {
        int i10 = this.f2301a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f2302b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f2302b;
        }
        if (i10 == 5) {
            return m2357a((Bitmap) this.f2302b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: e */
    public int m2366e() {
        int i10 = this.f2301a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2360f(AbstractC6307l.m25073a(this.f2302b));
        }
        if (i10 == 2) {
            return this.f2305e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: g */
    public String m2367g() {
        int i10 = this.f2301a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2361h(AbstractC6307l.m25073a(this.f2302b));
        }
        if (i10 == 2) {
            if (TextUtils.isEmpty(this.f2310j)) {
                return ((String) this.f2302b).split(":", -1)[0];
            }
            return this.f2310j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: i */
    public int m2368i() {
        int i10 = this.f2301a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2362j(AbstractC6307l.m25073a(this.f2302b));
        }
        return i10;
    }

    /* renamed from: k */
    public Uri m2369k() {
        int i10 = this.f2301a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2363l(AbstractC6307l.m25073a(this.f2302b));
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f2302b);
    }

    /* renamed from: m */
    public InputStream m2370m(Context context) {
        Uri m2369k = m2369k();
        String scheme = m2369k.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f2302b));
            } catch (FileNotFoundException e10) {
                Log.w("IconCompat", "Unable to load image from path: " + m2369k, e10);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(m2369k);
        } catch (Exception e11) {
            Log.w("IconCompat", "Unable to load image from URI: " + m2369k, e11);
            return null;
        }
    }

    /* renamed from: n */
    public void m2371n() {
        this.f2308h = PorterDuff.Mode.valueOf(this.f2309i);
        switch (this.f2301a) {
            case -1:
                Parcelable parcelable = this.f2304d;
                if (parcelable != null) {
                    this.f2302b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2304d;
                if (parcelable2 != null) {
                    this.f2302b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2303c;
                this.f2302b = bArr;
                this.f2301a = 3;
                this.f2305e = 0;
                this.f2306f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2303c, Charset.forName("UTF-16"));
                this.f2302b = str;
                if (this.f2301a == 2 && this.f2310j == null) {
                    this.f2310j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2302b = this.f2303c;
                return;
        }
    }

    /* renamed from: o */
    public void m2372o(boolean z10) {
        this.f2309i = this.f2308h.name();
        switch (this.f2301a) {
            case -1:
                if (!z10) {
                    this.f2304d = (Parcelable) this.f2302b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    Bitmap bitmap = (Bitmap) this.f2302b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2303c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f2304d = (Parcelable) this.f2302b;
                return;
            case 2:
                this.f2303c = ((String) this.f2302b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2303c = (byte[]) this.f2302b;
                return;
            case 4:
            case 6:
                this.f2303c = this.f2302b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: p */
    public Icon m2373p() {
        return m2374q(null);
    }

    /* renamed from: q */
    public Icon m2374q(Context context) {
        Icon createWithBitmap;
        switch (this.f2301a) {
            case -1:
                return AbstractC6307l.m25073a(this.f2302b);
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f2302b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(m2367g(), this.f2305e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f2302b, this.f2305e, this.f2306f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f2302b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f2302b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(m2357a((Bitmap) this.f2302b, false));
                    break;
                }
            case 6:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(m2369k());
                    break;
                } else if (context != null) {
                    InputStream m2370m = m2370m(context);
                    if (m2370m != null) {
                        if (i10 >= 26) {
                            createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(m2370m));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(m2357a(BitmapFactory.decodeStream(m2370m), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + m2369k());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m2369k());
                }
        }
        ColorStateList colorStateList = this.f2307g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2308h;
        if (mode != f2300k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public String toString() {
        if (this.f2301a == -1) {
            return String.valueOf(this.f2302b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m2364r(this.f2301a));
        switch (this.f2301a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2302b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f2302b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2310j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m2366e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2305e);
                if (this.f2306f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f2306f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2302b);
                break;
        }
        if (this.f2307g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2307g);
        }
        if (this.f2308h != f2300k) {
            sb2.append(" mode=");
            sb2.append(this.f2308h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    private IconCompat(int i10) {
        this.f2303c = null;
        this.f2304d = null;
        this.f2305e = 0;
        this.f2306f = 0;
        this.f2307g = null;
        this.f2308h = f2300k;
        this.f2309i = null;
        this.f2301a = i10;
    }
}
