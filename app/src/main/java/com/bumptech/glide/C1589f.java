package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.f */
/* loaded from: classes.dex */
public class C1589f {

    /* renamed from: a */
    private final Map f6307a;

    /* renamed from: com.bumptech.glide.f$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a */
        private final Map f6308a = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public C1589f m7318b() {
            return new C1589f(this);
        }
    }

    C1589f(a aVar) {
        this.f6307a = Collections.unmodifiableMap(new HashMap(aVar.f6308a));
    }

    /* renamed from: a */
    public boolean m7316a(Class cls) {
        return this.f6307a.containsKey(cls);
    }
}
