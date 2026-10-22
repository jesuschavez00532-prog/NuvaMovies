package p389x;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: x.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC7466l0 {
    /* renamed from: a */
    public static void m28654a(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    /* renamed from: b */
    public static void m28655b(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    /* renamed from: c */
    public static void m28656c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
