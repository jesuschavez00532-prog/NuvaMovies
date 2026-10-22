package retrofit2;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import okhttp3.ResponseBody;
import okio.Buffer;

/* loaded from: classes3.dex */
final class Utils {

    /* renamed from: a */
    static final Type[] f25392a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class GenericArrayTypeImpl implements GenericArrayType {

        /* renamed from: a */
        private final Type f25393a;

        GenericArrayTypeImpl(Type type) {
            this.f25393a = type;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && Utils.m25788e(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f25393a;
        }

        public int hashCode() {
            return this.f25393a.hashCode();
        }

        public String toString() {
            return Utils.m25804u(this.f25393a) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ParameterizedTypeImpl implements ParameterizedType {

        /* renamed from: a */
        private final Type f25394a;

        /* renamed from: b */
        private final Type f25395b;

        /* renamed from: c */
        private final Type[] f25396c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            boolean z10;
            if (type2 instanceof Class) {
                if (type == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Utils.m25785b(type3, "typeArgument == null");
                Utils.m25786c(type3);
            }
            this.f25394a = type;
            this.f25395b = type2;
            this.f25396c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && Utils.m25788e(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f25396c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f25394a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f25395b;
        }

        public int hashCode() {
            int i10;
            int hashCode = Arrays.hashCode(this.f25396c) ^ this.f25395b.hashCode();
            Type type = this.f25394a;
            if (type != null) {
                i10 = type.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode ^ i10;
        }

        public String toString() {
            Type[] typeArr = this.f25396c;
            if (typeArr.length == 0) {
                return Utils.m25804u(this.f25395b);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(Utils.m25804u(this.f25395b));
            sb2.append(Operator.Operation.LESS_THAN);
            sb2.append(Utils.m25804u(this.f25396c[0]));
            for (int i10 = 1; i10 < this.f25396c.length; i10++) {
                sb2.append(", ");
                sb2.append(Utils.m25804u(this.f25396c[i10]));
            }
            sb2.append(Operator.Operation.GREATER_THAN);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class WildcardTypeImpl implements WildcardType {

        /* renamed from: a */
        private final Type f25397a;

        /* renamed from: b */
        private final Type f25398b;

        WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Type type = typeArr2[0];
                        type.getClass();
                        Utils.m25786c(type);
                        if (typeArr[0] == Object.class) {
                            this.f25398b = typeArr2[0];
                            this.f25397a = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    Type type2 = typeArr[0];
                    type2.getClass();
                    Utils.m25786c(type2);
                    this.f25398b = null;
                    this.f25397a = typeArr[0];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && Utils.m25788e(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f25398b;
            if (type != null) {
                return new Type[]{type};
            }
            return Utils.f25392a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f25397a};
        }

        public int hashCode() {
            int i10;
            Type type = this.f25398b;
            if (type != null) {
                i10 = type.hashCode() + 31;
            } else {
                i10 = 1;
            }
            return i10 ^ (this.f25397a.hashCode() + 31);
        }

        public String toString() {
            if (this.f25398b != null) {
                return "? super " + Utils.m25804u(this.f25398b);
            }
            if (this.f25397a == Object.class) {
                return Operator.Operation.EMPTY_PARAM;
            }
            return "? extends " + Utils.m25804u(this.f25397a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ResponseBody m25784a(ResponseBody responseBody) {
        Buffer buffer = new Buffer();
        responseBody.source().readAll(buffer);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object m25785b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    static void m25786c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    private static Class m25787d(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m25788e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m25788e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    static Type m25789f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m25789f(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m25789f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Type m25790g(int i10, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i10];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getLowerBounds()[0];
        }
        return type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Type m25791h(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        throw new IllegalArgumentException("Index " + i10 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Class m25792i(Type type) {
        m25785b(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m25792i(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m25792i(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Type m25793j(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m25801r(type, cls, m25789f(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static boolean m25794k(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m25794k(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m25794k(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    /* renamed from: l */
    private static int m25795l(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static boolean m25796m(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static RuntimeException m25797n(Method method, String str, Object... objArr) {
        return m25798o(method, null, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static RuntimeException m25798o(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static RuntimeException m25799p(Method method, int i10, String str, Object... objArr) {
        return m25797n(method, str + " (parameter #" + (i10 + 1) + ")", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static RuntimeException m25800q(Method method, Throwable th, int i10, String str, Object... objArr) {
        return m25798o(method, th, str + " (parameter #" + (i10 + 1) + ")", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r10 = r10;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.reflect.Type m25801r(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto Lf
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m25802s(r8, r9, r10)
            if (r0 != r10) goto Ld
            return r0
        Ld:
            r10 = r0
            goto L0
        Lf:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L2d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L2d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m25801r(r8, r9, r10)
            if (r10 != r8) goto L27
            goto L2c
        L27:
            retrofit2.Utils$GenericArrayTypeImpl r0 = new retrofit2.Utils$GenericArrayTypeImpl
            r0.<init>(r8)
        L2c:
            return r0
        L2d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L44
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m25801r(r8, r9, r0)
            if (r0 != r8) goto L3e
            goto L43
        L3e:
            retrofit2.Utils$GenericArrayTypeImpl r10 = new retrofit2.Utils$GenericArrayTypeImpl
            r10.<init>(r8)
        L43:
            return r10
        L44:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L86
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m25801r(r8, r9, r0)
            if (r3 == r0) goto L58
            r0 = 1
            goto L59
        L58:
            r0 = 0
        L59:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L5e:
            if (r2 >= r5) goto L79
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m25801r(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L76
            if (r0 != 0) goto L74
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L74:
            r4[r2] = r6
        L76:
            int r2 = r2 + 1
            goto L5e
        L79:
            if (r0 == 0) goto L85
            retrofit2.Utils$ParameterizedTypeImpl r8 = new retrofit2.Utils$ParameterizedTypeImpl
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L85:
            return r10
        L86:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lca
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lb1
            r3 = r0[r2]
            java.lang.reflect.Type r8 = m25801r(r8, r9, r3)
            r9 = r0[r2]
            if (r8 == r9) goto Lca
            retrofit2.Utils$WildcardTypeImpl r9 = new retrofit2.Utils$WildcardTypeImpl
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r2] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r0[r2] = r8
            r9.<init>(r10, r0)
            return r9
        Lb1:
            int r0 = r3.length
            if (r0 != r1) goto Lca
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m25801r(r8, r9, r0)     // Catch: java.lang.Throwable -> Lcb
            r9 = r3[r2]
            if (r8 == r9) goto Lca
            retrofit2.Utils$WildcardTypeImpl r9 = new retrofit2.Utils$WildcardTypeImpl
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            java.lang.reflect.Type[] r8 = retrofit2.Utils.f25392a
            r9.<init>(r10, r8)
            return r9
        Lca:
            return r10
        Lcb:
            r8 = move-exception
            goto Lce
        Lcd:
            throw r8
        Lce:
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.Utils.m25801r(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: s */
    private static Type m25802s(Type type, Class cls, TypeVariable typeVariable) {
        Class m25787d = m25787d(typeVariable);
        if (m25787d == null) {
            return typeVariable;
        }
        Type m25789f = m25789f(type, cls, m25787d);
        if (m25789f instanceof ParameterizedType) {
            return ((ParameterizedType) m25789f).getActualTypeArguments()[m25795l(m25787d.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m25803t(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw ((LinkageError) th);
                }
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    /* renamed from: u */
    static String m25804u(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m25805v(Class cls) {
        if (cls.isInterface()) {
            if (cls.getInterfaces().length <= 0) {
                return;
            } else {
                throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
            }
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }
}
