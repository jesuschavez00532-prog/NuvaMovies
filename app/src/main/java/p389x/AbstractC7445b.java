package p389x;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: x.b */
/* loaded from: classes.dex */
public abstract class AbstractC7445b {
    /* renamed from: a */
    public static int m28551a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* renamed from: b */
    public static void m28552b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
