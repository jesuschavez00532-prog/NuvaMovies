package p325s4;

import android.os.IBinder;
import java.lang.reflect.Field;
import p219l4.AbstractC5391n;
import p325s4.InterfaceC6675a;

/* renamed from: s4.b */
/* loaded from: classes.dex */
public final class BinderC6676b extends InterfaceC6675a.a {

    /* renamed from: a */
    private final Object f25596a;

    private BinderC6676b(Object obj) {
        this.f25596a = obj;
    }

    /* renamed from: M */
    public static InterfaceC6675a m26053M(Object obj) {
        return new BinderC6676b(obj);
    }

    /* renamed from: d */
    public static Object m26054d(InterfaceC6675a interfaceC6675a) {
        if (interfaceC6675a instanceof BinderC6676b) {
            return ((BinderC6676b) interfaceC6675a).f25596a;
        }
        IBinder asBinder = interfaceC6675a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            AbstractC5391n.m21783i(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }
}
