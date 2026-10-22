package p283p6;

/* renamed from: p6.d */
/* loaded from: classes.dex */
public @interface InterfaceC6223d {

    /* renamed from: p6.d$a */
    /* loaded from: classes.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
