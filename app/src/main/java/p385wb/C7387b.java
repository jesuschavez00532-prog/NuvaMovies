package p385wb;

import anet.channel.request.Request;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* renamed from: wb.b */
/* loaded from: classes2.dex */
public final class C7387b implements Converter {

    /* renamed from: c */
    private static final MediaType f27394c = MediaType.parse("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f27395d = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    private final Gson f27396a;

    /* renamed from: b */
    private final TypeAdapter f27397b;

    public C7387b(Gson gson, TypeAdapter typeAdapter) {
        this.f27396a = gson;
        this.f27397b = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody mo22520a(Object obj) {
        return RequestBody.create(f27394c, String.valueOf(obj));
    }
}
