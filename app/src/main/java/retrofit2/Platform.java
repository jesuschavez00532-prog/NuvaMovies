package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class Platform {

    /* renamed from: a */
    private static final Platform f25317a = m25726e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Android extends Platform {

        /* loaded from: classes3.dex */
        static class MainThreadExecutor implements Executor {

            /* renamed from: a */
            private final Handler f25318a = new Handler(Looper.getMainLooper());

            MainThreadExecutor() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f25318a.post(runnable);
            }
        }

        Android() {
        }

        @Override // retrofit2.Platform
        /* renamed from: a */
        List mo25728a(Executor executor) {
            if (executor != null) {
                DefaultCallAdapterFactory defaultCallAdapterFactory = new DefaultCallAdapterFactory(executor);
                if (Build.VERSION.SDK_INT >= 24) {
                    return Arrays.asList(CompletableFutureCallAdapterFactory.f25208a, defaultCallAdapterFactory);
                }
                return Collections.singletonList(defaultCallAdapterFactory);
            }
            throw new AssertionError();
        }

        @Override // retrofit2.Platform
        /* renamed from: b */
        public Executor mo25729b() {
            return new MainThreadExecutor();
        }

        @Override // retrofit2.Platform
        /* renamed from: c */
        List mo25730c() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Collections.singletonList(OptionalConverterFactory.f25270a);
            }
            return Collections.emptyList();
        }

        @Override // retrofit2.Platform
        /* renamed from: d */
        int mo25731d() {
            if (Build.VERSION.SDK_INT >= 24) {
                return 1;
            }
            return 0;
        }

        @Override // retrofit2.Platform
        /* renamed from: h */
        boolean mo25733h(Method method) {
            boolean isDefault;
            if (Build.VERSION.SDK_INT >= 24) {
                isDefault = method.isDefault();
                return isDefault;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @IgnoreJRERequirement
    /* loaded from: classes3.dex */
    public static class Java8 extends Platform {
        Java8() {
        }

        @Override // retrofit2.Platform
        /* renamed from: a */
        List mo25728a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(CompletableFutureCallAdapterFactory.f25208a);
            arrayList.add(new DefaultCallAdapterFactory(executor));
            return Collections.unmodifiableList(arrayList);
        }

        @Override // retrofit2.Platform
        /* renamed from: c */
        List mo25730c() {
            return Collections.singletonList(OptionalConverterFactory.f25270a);
        }

        @Override // retrofit2.Platform
        /* renamed from: d */
        int mo25731d() {
            return 1;
        }

        @Override // retrofit2.Platform
        /* renamed from: g */
        Object mo25732g(Method method, Class cls, Object obj, Object... objArr) {
            MethodHandle unreflectSpecial;
            MethodHandle bindTo;
            Object invokeWithArguments;
            Constructor declaredConstructor = AbstractC6600g.m25812a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            unreflectSpecial = AbstractC6601h.m25813a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls);
            bindTo = unreflectSpecial.bindTo(obj);
            invokeWithArguments = bindTo.invokeWithArguments(objArr);
            return invokeWithArguments;
        }

        @Override // retrofit2.Platform
        /* renamed from: h */
        boolean mo25733h(Method method) {
            boolean isDefault;
            isDefault = method.isDefault();
            return isDefault;
        }
    }

    Platform() {
    }

    /* renamed from: e */
    private static Platform m25726e() {
        try {
            try {
                Class.forName("android.os.Build");
                return new Android();
            } catch (ClassNotFoundException unused) {
                return new Platform();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("java.util.Optional");
            return new Java8();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Platform m25727f() {
        return f25317a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List mo25728a(Executor executor) {
        return Collections.singletonList(new DefaultCallAdapterFactory(executor));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Executor mo25729b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List mo25730c() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo25731d() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Object mo25732g(Method method, Class cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo25733h(Method method) {
        return false;
    }
}
