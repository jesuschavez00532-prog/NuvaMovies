package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC0855a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0855a abstractC0855a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2301a = abstractC0855a.m4425p(iconCompat.f2301a, 1);
        iconCompat.f2303c = abstractC0855a.m4419j(iconCompat.f2303c, 2);
        iconCompat.f2304d = abstractC0855a.m4427r(iconCompat.f2304d, 3);
        iconCompat.f2305e = abstractC0855a.m4425p(iconCompat.f2305e, 4);
        iconCompat.f2306f = abstractC0855a.m4425p(iconCompat.f2306f, 5);
        iconCompat.f2307g = (ColorStateList) abstractC0855a.m4427r(iconCompat.f2307g, 6);
        iconCompat.f2309i = abstractC0855a.m4429t(iconCompat.f2309i, 7);
        iconCompat.f2310j = abstractC0855a.m4429t(iconCompat.f2310j, 8);
        iconCompat.m2371n();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0855a abstractC0855a) {
        abstractC0855a.m4433x(true, true);
        iconCompat.m2372o(abstractC0855a.m4415f());
        int i10 = iconCompat.f2301a;
        if (-1 != i10) {
            abstractC0855a.m4405F(i10, 1);
        }
        byte[] bArr = iconCompat.f2303c;
        if (bArr != null) {
            abstractC0855a.m4401B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2304d;
        if (parcelable != null) {
            abstractC0855a.m4407H(parcelable, 3);
        }
        int i11 = iconCompat.f2305e;
        if (i11 != 0) {
            abstractC0855a.m4405F(i11, 4);
        }
        int i12 = iconCompat.f2306f;
        if (i12 != 0) {
            abstractC0855a.m4405F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2307g;
        if (colorStateList != null) {
            abstractC0855a.m4407H(colorStateList, 6);
        }
        String str = iconCompat.f2309i;
        if (str != null) {
            abstractC0855a.m4409J(str, 7);
        }
        String str2 = iconCompat.f2310j;
        if (str2 != null) {
            abstractC0855a.m4409J(str2, 8);
        }
    }
}
