package p201k2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import java.util.Hashtable;
import p098d7.C3963c;
import p098d7.EnumC3961a;
import p098d7.EnumC3962b;
import p114e7.C4140b;
import p146g7.C4354a;
import p158h7.EnumC4561a;

/* renamed from: k2.l */
/* loaded from: classes.dex */
public abstract class AbstractC5095l {
    /* renamed from: a */
    public static Bitmap m20687a(String str, int i10) {
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(EnumC3962b.CHARACTER_SET, "utf-8");
            hashtable.put(EnumC3962b.ERROR_CORRECTION, EnumC4561a.M);
            hashtable.put(EnumC3962b.MARGIN, 0);
            C4140b m18278a = new C4354a().m18278a(str, EnumC3961a.QR_CODE, i10, i10, hashtable);
            int[] iArr = new int[i10 * i10];
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (m18278a.m17344d(i12, i11)) {
                        iArr[(i11 * i10) + i12] = -16777216;
                    } else {
                        iArr[(i11 * i10) + i12] = -1;
                    }
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i10, 0, 0, i10, i10);
            return createBitmap;
        } catch (C3963c e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static Bitmap m20688b(String str, int i10, Bitmap bitmap) {
        try {
            int i11 = i10 / 8;
            Hashtable hashtable = new Hashtable();
            hashtable.put(EnumC3962b.CHARACTER_SET, "utf-8");
            hashtable.put(EnumC3962b.ERROR_CORRECTION, EnumC4561a.M);
            hashtable.put(EnumC3962b.MARGIN, 0);
            C4140b m18278a = new C4354a().m18278a(str, EnumC3961a.QR_CODE, i10, i10, hashtable);
            int m17346f = m18278a.m17346f();
            int m17345e = m18278a.m17345e();
            Math.min(m17346f / i10, m17345e / i10);
            int i12 = m17346f / 2;
            int i13 = m17345e / 2;
            Matrix matrix = new Matrix();
            float f10 = i11 * 2.0f;
            matrix.setScale(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            int[] iArr = new int[i10 * i10];
            for (int i14 = 0; i14 < i10; i14++) {
                for (int i15 = 0; i15 < i10; i15++) {
                    if (i15 > i12 - i11 && i15 < i12 + i11 && i14 > i13 - i11 && i14 < i13 + i11) {
                        iArr[(i14 * m17346f) + i15] = createBitmap.getPixel((i15 - i12) + i11, (i14 - i13) + i11);
                    } else if (m18278a.m17344d(i15, i14)) {
                        iArr[(i14 * i10) + i15] = -16777216;
                    } else {
                        iArr[(i14 * i10) + i15] = -1;
                    }
                }
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
            createBitmap2.setPixels(iArr, 0, i10, 0, 0, i10, i10);
            return createBitmap2;
        } catch (C3963c e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static Bitmap m20689c(String str, int i10, int i11) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Hashtable hashtable = new Hashtable();
            hashtable.put(EnumC3962b.CHARACTER_SET, "utf-8");
            hashtable.put(EnumC3962b.MARGIN, 0);
            C4140b m18278a = new C4354a().m18278a(str, EnumC3961a.QR_CODE, i10, i11, hashtable);
            int[] iArr = new int[i10 * i11];
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i10; i13++) {
                    if (m18278a.m17344d(i13, i12)) {
                        iArr[(i12 * i10) + i13] = -16777216;
                    } else {
                        iArr[(i12 * i10) + i13] = -1;
                    }
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            createBitmap.setPixels(iArr, 0, i10, 0, 0, i10, i11);
            return createBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
