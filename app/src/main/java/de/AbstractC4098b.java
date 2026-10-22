package de;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: de.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4098b {
    /* renamed from: a */
    public static int m17160a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
