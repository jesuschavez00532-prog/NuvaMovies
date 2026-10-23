package p405y;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import anet.channel.entity.EventType;
import p373w.AbstractC7342g;

/* renamed from: y.c */
/* loaded from: classes.dex */
public abstract class AbstractC7653c {

    /* renamed from: a */
    private static final String[] f28087a = new String[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y.c$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m29447a(EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    /* renamed from: a */
    public static String[] m29439a(EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                return f28087a;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f28087a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray == null) {
            return f28087a;
        }
        return stringArray;
    }

    /* renamed from: b */
    private static boolean m29440b(CharSequence charSequence, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i10));
        }
        return Character.isLowSurrogate(charSequence.charAt(i10));
    }

    /* renamed from: c */
    private static boolean m29441c(int i10) {
        int i11 = i10 & EventType.ALL;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    /* renamed from: d */
    public static void m29442d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m29443e(EditorInfo editorInfo, CharSequence charSequence, int i10) {
        int i11 = 0;
        int i12 = 0;
        AbstractC7342g.m28327g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m29447a(editorInfo, charSequence, i10);
            return;
        }
        int i13 = editorInfo.initialSelStart;
        int i14 = editorInfo.initialSelEnd;
        if (i13 > i14) {
            i11 = i14 - i10;
        } else {
            i11 = i13 - i10;
        }
        if (i13 > i14) {
            i12 = i13 - i10;
        } else {
            i12 = i14 - i10;
        }
        int length = charSequence.length();
        if (i10 >= 0 && i11 >= 0 && i12 <= length) {
            if (m29441c(editorInfo.inputType)) {
                m29445g(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                m29445g(editorInfo, charSequence, i11, i12);
                return;
            } else {
                m29446h(editorInfo, charSequence, i11, i12);
                return;
            }
        }
        m29445g(editorInfo, null, 0, 0);
    }

    /* renamed from: f */
    public static void m29444f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m29447a(editorInfo, charSequence, 0);
        } else {
            m29443e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m29445g(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    /* renamed from: h */
    private static void m29446h(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        CharSequence subSequence;
        int i13 = i11 - i10;
        if (i13 > 1024) {
            i12 = 0;
        } else {
            i12 = i13;
        }
        int length = charSequence.length() - i11;
        int i14 = 2048 - i12;
        double d10 = i14;
        Double.isNaN(d10);
        int min = Math.min(length, i14 - Math.min(i10, (int) (d10 * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (m29440b(charSequence, i15, 0)) {
            i15++;
            min2--;
        }
        if (m29440b(charSequence, (i11 + min) - 1, 1)) {
            min--;
        }
        int i16 = min2 + i12 + min;
        if (i12 != i13) {
            subSequence = TextUtils.concat(charSequence.subSequence(i15, i15 + min2), charSequence.subSequence(i11, min + i11));
        } else {
            subSequence = charSequence.subSequence(i15, i16 + i15);
        }
        int i17 = min2 + 0;
        m29445g(editorInfo, subSequence, i17, i12 + i17);
    }
}
