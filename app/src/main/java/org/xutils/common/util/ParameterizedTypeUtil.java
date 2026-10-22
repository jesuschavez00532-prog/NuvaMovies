package org.xutils.common.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes3.dex */
public class ParameterizedTypeUtil {
    private ParameterizedTypeUtil() {
    }

    public static Type getParameterizedType(Type type, Class<?> cls, int i10) {
        Class<?> cls2;
        Type[] typeArr;
        TypeVariable<Class<?>>[] typeVariableArr;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            cls2 = (Class) parameterizedType.getRawType();
            typeArr = parameterizedType.getActualTypeArguments();
            typeVariableArr = cls2.getTypeParameters();
        } else {
            cls2 = (Class) type;
            typeArr = null;
            typeVariableArr = null;
        }
        if (cls == cls2) {
            if (typeArr != null) {
                return typeArr[i10];
            }
            return Object.class;
        }
        Type[] genericInterfaces = cls2.getGenericInterfaces();
        if (genericInterfaces != null) {
            for (Type type2 : genericInterfaces) {
                if ((type2 instanceof ParameterizedType) && cls.isAssignableFrom((Class) ((ParameterizedType) type2).getRawType())) {
                    try {
                        return getTrueType(getParameterizedType(type2, cls, i10), typeVariableArr, typeArr);
                    } catch (Throwable th) {
                        LogUtil.m24382w(th.getMessage(), th);
                    }
                }
            }
        }
        Class<? super Object> superclass = cls2.getSuperclass();
        if (superclass != null && cls.isAssignableFrom(superclass)) {
            return getTrueType(getParameterizedType(cls2.getGenericSuperclass(), cls, i10), typeVariableArr, typeArr);
        }
        throw new IllegalArgumentException("FindGenericType:" + type + ", declaredClass: " + cls + ", index: " + i10);
    }

    private static Type getTrueType(Type type, TypeVariable<?>[] typeVariableArr, Type[] typeArr) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            String name = typeVariable.getName();
            if (typeArr != null) {
                for (int i10 = 0; i10 < typeVariableArr.length; i10++) {
                    if (name.equals(typeVariableArr[i10].getName())) {
                        return typeArr[i10];
                    }
                }
            }
            return typeVariable;
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof Class) {
                return Array.newInstance((Class<?>) genericComponentType, 0).getClass();
            }
            return type;
        }
        return type;
    }
}
