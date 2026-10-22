package vc;

import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: vc.b */
/* loaded from: classes3.dex */
public enum EnumC7254b {
    IJK("ijk"),
    NATIVE("native"),
    EXO("exo"),
    NONE("none");


    /* renamed from: g */
    public static final a f27113g = new a(null);

    /* renamed from: a */
    private String f27114a;

    /* renamed from: vc.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final EnumC7254b m28087a(String str) {
            AbstractC5868k.m23675g(str, "property");
            for (EnumC7254b enumC7254b : EnumC7254b.values()) {
                if (AbstractC5868k.m23669a(enumC7254b.m28086a(), str)) {
                    return enumC7254b;
                }
            }
            return null;
        }
    }

    EnumC7254b(String str) {
        AbstractC5868k.m23675g(str, "value");
        this.f27114a = str;
    }

    /* renamed from: a */
    public final String m28086a() {
        return this.f27114a;
    }
}
