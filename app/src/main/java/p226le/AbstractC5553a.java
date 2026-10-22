package p226le;

import ne.AbstractC5868k;
import ne.InterfaceC5861d;
import se.InterfaceC6865b;

/* renamed from: le.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5553a {
    /* renamed from: a */
    public static final Class m22515a(InterfaceC6865b interfaceC6865b) {
        AbstractC5868k.m23674f(interfaceC6865b, "<this>");
        Class mo23666a = ((InterfaceC5861d) interfaceC6865b).mo23666a();
        if (!mo23666a.isPrimitive()) {
            AbstractC5868k.m23672d(mo23666a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return mo23666a;
        }
        String name = mo23666a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    mo23666a = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    mo23666a = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    mo23666a = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    mo23666a = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    mo23666a = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    mo23666a = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    mo23666a = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    mo23666a = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    mo23666a = Short.class;
                    break;
                }
                break;
        }
        AbstractC5868k.m23672d(mo23666a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return mo23666a;
    }
}
