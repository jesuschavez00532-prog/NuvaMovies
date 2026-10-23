package ge;

import java.lang.reflect.Field;
import ne.AbstractC5868k;

/* renamed from: ge.g */
/* loaded from: classes3.dex */
public abstract class AbstractC4440g {
    /* renamed from: a */
    private static final void m18633a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final InterfaceC4439f m18634b(AbstractC4434a abstractC4434a) {
        return (InterfaceC4439f) abstractC4434a.getClass().getAnnotation(InterfaceC4439f.class);
    }

    /* renamed from: c */
    private static final int m18635c(AbstractC4434a abstractC4434a) {
        Integer num;
        int i10 = 0;
        try {
            Field declaredField = abstractC4434a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC4434a);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            return i10 - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m18636d(AbstractC4434a abstractC4434a) {
        int i10 = 0;
        String str;
        AbstractC5868k.m23674f(abstractC4434a, "<this>");
        InterfaceC4439f m18634b = m18634b(abstractC4434a);
        if (m18634b == null) {
            return null;
        }
        m18633a(1, m18634b.m18632v());
        int m18635c = m18635c(abstractC4434a);
        if (m18635c < 0) {
            i10 = -1;
        } else {
            i10 = m18634b.m18630l()[m18635c];
        }
        String m18641b = C4442i.f19255a.m18641b(abstractC4434a);
        if (m18641b == null) {
            str = m18634b.m18628c();
        } else {
            str = m18641b + '/' + m18634b.m18628c();
        }
        return new StackTraceElement(str, m18634b.m18631m(), m18634b.m18629f(), i10);
    }
}
