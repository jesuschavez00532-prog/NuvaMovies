package p165he;

import ie.C4932a;
import je.C5071a;
import ne.AbstractC5868k;
import p359ue.AbstractC7167u;

/* renamed from: he.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4819b {

    /* renamed from: a */
    public static final C4818a f20292a;

    static {
        C4818a c4818a;
        Object newInstance;
        Object newInstance2;
        int m19906a = m19906a();
        if (m19906a >= 65544 || m19906a < 65536) {
            try {
                newInstance = C5071a.class.newInstance();
                AbstractC5868k.m23673e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e10) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = C4818a.class.getClassLoader();
                        if (!AbstractC5868k.m23669a(classLoader, classLoader2)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                        }
                        throw e10;
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                AbstractC5868k.m23673e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 != null) {
                        c4818a = (C4818a) newInstance3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassCastException e11) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = C4818a.class.getClassLoader();
                    if (!AbstractC5868k.m23669a(classLoader3, classLoader4)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                    }
                    throw e11;
                }
            }
            if (newInstance != null) {
                c4818a = (C4818a) newInstance;
                f20292a = c4818a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        if (m19906a >= 65543 || m19906a < 65536) {
            try {
                try {
                    newInstance2 = C4932a.class.newInstance();
                    AbstractC5868k.m23673e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e12) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = C4818a.class.getClassLoader();
                        if (!AbstractC5868k.m23669a(classLoader5, classLoader6)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                        }
                        throw e12;
                    }
                } catch (ClassNotFoundException unused3) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    AbstractC5868k.m23673e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 != null) {
                            c4818a = (C4818a) newInstance4;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                    } catch (ClassCastException e13) {
                        ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = C4818a.class.getClassLoader();
                        if (!AbstractC5868k.m23669a(classLoader7, classLoader8)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                        }
                        throw e13;
                    }
                }
            } catch (ClassNotFoundException unused4) {
            }
            if (newInstance2 != null) {
                c4818a = (C4818a) newInstance2;
                f20292a = c4818a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        c4818a = new C4818a();
        f20292a = c4818a;
    }

    /* renamed from: a */
    private static final int m19906a() {
        int m27734D;
        int m27734D2;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            m27734D = AbstractC7167u.m27734D(property, '.', 0, false, 6, null);
            if (m27734D < 0) {
                try {
                    return Integer.parseInt(property) * 65536;
                } catch (NumberFormatException unused) {
                    return 65542;
                }
            }
            int i10 = m27734D + 1;
            m27734D2 = AbstractC7167u.m27734D(property, '.', i10, false, 4, null);
            if (m27734D2 < 0) {
                m27734D2 = property.length();
            }
            String substring = property.substring(0, m27734D);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i10, m27734D2);
            AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
        return 65542;
    }
}
