package ne;

import se.InterfaceC6865b;
import se.InterfaceC6866c;
import se.InterfaceC6867d;
import se.InterfaceC6868e;

/* renamed from: ne.v */
/* loaded from: classes.dex */
public abstract class AbstractC5879v {

    /* renamed from: a */
    private static final C5880w f23413a;

    /* renamed from: b */
    private static final InterfaceC6865b[] f23414b;

    static {
        C5880w c5880w = null;
        try {
            c5880w = (C5880w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c5880w == null) {
            c5880w = new C5880w();
        }
        f23413a = c5880w;
        f23414b = new InterfaceC6865b[0];
    }

    /* renamed from: a */
    public static InterfaceC6867d m23689a(AbstractC5866i abstractC5866i) {
        return f23413a.m23695a(abstractC5866i);
    }

    /* renamed from: b */
    public static InterfaceC6865b m23690b(Class cls) {
        return f23413a.m23696b(cls);
    }

    /* renamed from: c */
    public static InterfaceC6866c m23691c(Class cls) {
        return f23413a.m23697c(cls, "");
    }

    /* renamed from: d */
    public static InterfaceC6868e m23692d(AbstractC5871n abstractC5871n) {
        return f23413a.m23698d(abstractC5871n);
    }

    /* renamed from: e */
    public static String m23693e(InterfaceC5865h interfaceC5865h) {
        return f23413a.m23699e(interfaceC5865h);
    }

    /* renamed from: f */
    public static String m23694f(AbstractC5869l abstractC5869l) {
        return f23413a.m23700f(abstractC5869l);
    }
}
