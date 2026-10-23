package p227lf;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* renamed from: lf.c */
/* loaded from: classes3.dex */
final class C5557c implements Converter {

    /* renamed from: a */
    private final Gson f22514a;

    /* renamed from: b */
    private final TypeAdapter f22515b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5557c(Gson gson, TypeAdapter typeAdapter) {
        this.f22514a = gson;
        this.f22515b = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22520a(ResponseBody responseBody) throws java.io.IOException {
        JsonReader newJsonReader = this.f22514a.newJsonReader(responseBody.charStream());
        try {
            Object read2 = this.f22515b.read2(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read2;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
