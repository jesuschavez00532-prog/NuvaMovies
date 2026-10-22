package pe;

import java.util.Random;
import ne.AbstractC5868k;

/* renamed from: pe.b */
/* loaded from: classes3.dex */
public final class C6290b extends AbstractC6289a {

    /* renamed from: c */
    private final a f24631c = new a();

    /* renamed from: pe.b$a */
    /* loaded from: classes3.dex */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // pe.AbstractC6289a
    /* renamed from: d */
    public Random mo25033d() {
        Object obj = this.f24631c.get();
        AbstractC5868k.m23673e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
