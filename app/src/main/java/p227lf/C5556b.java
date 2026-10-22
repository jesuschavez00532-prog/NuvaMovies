package p227lf;

import anet.channel.request.Request;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* renamed from: lf.b */
/* loaded from: classes3.dex */
final class C5556b implements Converter {

    /* renamed from: c */
    private static final MediaType f22510c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f22511d = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    private final Gson f22512a;

    /* renamed from: b */
    private final TypeAdapter f22513b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5556b(Gson gson, TypeAdapter typeAdapter) {
        this.f22512a = gson;
        this.f22513b = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody mo22520a(Object obj) {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.f22512a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f22511d));
        this.f22513b.write(newJsonWriter, obj);
        newJsonWriter.close();
        return RequestBody.create(f22510c, buffer.readByteString());
    }
}
