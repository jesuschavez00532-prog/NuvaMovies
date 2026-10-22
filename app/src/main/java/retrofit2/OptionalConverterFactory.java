package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;

@IgnoreJRERequirement
/* loaded from: classes3.dex */
final class OptionalConverterFactory extends Converter.Factory {

    /* renamed from: a */
    static final Converter.Factory f25270a = new OptionalConverterFactory();

    @IgnoreJRERequirement
    /* loaded from: classes3.dex */
    static final class OptionalConverter<T> implements Converter<ResponseBody, Optional<T>> {

        /* renamed from: a */
        final Converter f25271a;

        OptionalConverter(Converter converter) {
            this.f25271a = converter;
        }

        @Override // retrofit2.Converter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional mo22520a(ResponseBody responseBody) {
            Optional ofNullable;
            ofNullable = Optional.ofNullable(this.f25271a.mo22520a(responseBody));
            return ofNullable;
        }
    }

    OptionalConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: d */
    public Converter mo22519d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.m25692b(type) != AbstractC6597d.m25809a()) {
            return null;
        }
        return new OptionalConverter(retrofit.m25773i(Converter.Factory.m25691a(0, (ParameterizedType) type), annotationArr));
    }
}
