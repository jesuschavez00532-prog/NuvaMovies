package p359ue;

import re.C6575c;

/* renamed from: ue.a */
/* loaded from: classes3.dex */
abstract class AbstractC7147a {
    /* renamed from: a */
    public static final int m27656a(int i10) {
        if (new C6575c(2, 36).m25662n(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C6575c(2, 36));
    }

    /* renamed from: b */
    public static final int m27657b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    /* renamed from: c */
    public static final boolean m27658c(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }
}
