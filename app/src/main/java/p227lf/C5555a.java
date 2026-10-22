package p227lf;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: lf.a */
/* loaded from: classes3.dex */
public final class C5555a extends Converter.Factory {

    /* renamed from: a */
    private final Gson f22509a;

    private C5555a(Gson gson) {
        this.f22509a = gson;
    }

    /* renamed from: f */
    public static C5555a m22516f() {
        return m22517g(new Gson());
    }

    /* renamed from: g */
    public static C5555a m22517g(Gson gson) {
        if (gson != null) {
            return new C5555a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: c */
    public Converter mo22518c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new C5556b(this.f22509a, this.f22509a.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: d */
    public Converter mo22519d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new C5557c(this.f22509a, this.f22509a.getAdapter(TypeToken.get(type)));
    }
}
