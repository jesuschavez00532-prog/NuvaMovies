package p385wb;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p348u2.AbstractC7027d;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: wb.a */
/* loaded from: classes2.dex */
public final class C7386a extends Converter.Factory {

    /* renamed from: a */
    private final Gson f27392a;

    /* renamed from: b */
    private InterfaceC7389d f27393b;

    private C7386a(Gson gson, boolean z10, InterfaceC7389d interfaceC7389d) {
        if (gson != null) {
            this.f27392a = gson;
            this.f27393b = interfaceC7389d;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: f */
    public static C7386a m28498f(boolean z10, InterfaceC7389d interfaceC7389d) {
        return new C7386a(AbstractC7027d.m27114a(), z10, interfaceC7389d);
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: c */
    public Converter mo22518c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new C7387b(this.f27392a, this.f27392a.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: d */
    public Converter mo22519d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new C7388c(this.f27392a, this.f27392a.getAdapter(TypeToken.get(type)), type, annotationArr, this.f27393b);
    }
}
