package p431zb;

import android.text.TextUtils;
import anet.channel.request.Request;
import cc.AbstractC1459j;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import p134fc.AbstractC4305b;

/* renamed from: zb.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7780c implements Interceptor {

    /* renamed from: a */
    private final MediaType f28707a = MediaType.parse("application/json; charset=utf-8");

    /* renamed from: b */
    public static String m30142b(Request request) {
        RequestBody body = request.body();
        Charset forName = Charset.forName(anet.channel.request.Request.DEFAULT_CHARSET);
        StringBuilder sb2 = new StringBuilder();
        MediaType contentType = body.contentType();
        if (contentType != null) {
            forName = contentType.charset(Charset.forName(anet.channel.request.Request.DEFAULT_CHARSET));
        }
        Buffer buffer = new Buffer();
        try {
            body.writeTo(buffer);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        sb2.append(buffer.readString(forName));
        buffer.close();
        return sb2.toString();
    }

    /* renamed from: a */
    public abstract Iterable mo30129a();

    /* renamed from: c */
    public abstract boolean mo30130c();

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        JsonObject asJsonObject;
        String jsonElement;
        Request.Builder put;
        Request request = chain.request();
        if ((!TextUtils.equals(request.method(), "POST") && !TextUtils.equals(request.method(), Request.Method.PUT)) || !request.body().contentType().toString().contains("application/json;")) {
            return chain.proceed(request);
        }
        try {
            if (AbstractC4305b.f18742a.equals("2b494e53756c664c2f44465245733572")) {
                chain.call().cancel();
            }
            String header = request.header("needEncrypt");
            if (request.body().contentLength() <= 0) {
                asJsonObject = new JsonObject();
            } else {
                asJsonObject = new JsonParser().parse(m30142b(request)).getAsJsonObject();
            }
            try {
                String path = request.url().url().getPath();
                if (!path.contains("/sendEmailVerifyCode") && !path.contains("/getAreaCode") && !path.contains("/validateVerifyCode") && !path.contains("/resetPwd") && !path.contains("/qr/token") && !path.contains("v3/getProgram") && !path.contains("/feedback/userFeedBack") && !path.contains("/getVerifiCode") && !path.contains("/checkVerifiCode") && asJsonObject.get("userId") != null && asJsonObject.get("userId").getAsString().isEmpty()) {
                    chain.call().cancel();
                }
            } catch (Exception unused) {
            }
            for (Map.Entry entry : mo30129a()) {
                asJsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
            }
            if (mo30130c() && !"false".equals(header)) {
                jsonElement = AbstractC1459j.m6798c(asJsonObject.toString());
            } else {
                jsonElement = asJsonObject.toString();
            }
            RequestBody create = RequestBody.create(this.f28707a, jsonElement);
            if (TextUtils.equals(request.method(), "POST")) {
                put = request.newBuilder().post(create);
            } else {
                put = request.newBuilder().put(create);
            }
            request = put.build();
            return chain.proceed(request);
        } catch (Exception unused2) {
            return chain.proceed(request);
        }
    }
}
