package p309r3;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: r3.n */
/* loaded from: classes.dex */
public abstract class AbstractC6527n {
    /* renamed from: a */
    static AbstractC6527n m25553a(long j10) {
        return new C6521h(j10);
    }

    /* renamed from: b */
    public static AbstractC6527n m25554b(Reader reader) throws java.io.IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return m25553a(Long.parseLong(jsonReader.nextString()));
                    }
                    return m25553a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo25538c();
}
