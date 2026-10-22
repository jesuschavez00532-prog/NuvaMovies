package p324s3;

import java.util.concurrent.Executor;
import p364v3.AbstractC7201d;
import p364v3.InterfaceC7199b;

/* renamed from: s3.k */
/* loaded from: classes.dex */
public final class C6663k implements InterfaceC7199b {

    /* renamed from: s3.k$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C6663k f25574a = new C6663k();
    }

    /* renamed from: a */
    public static C6663k m26030a() {
        return a.f25574a;
    }

    /* renamed from: b */
    public static Executor m26031b() {
        return (Executor) AbstractC7201d.m27895c(AbstractC6662j.m26029a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m26031b();
    }
}
