package p300q9;

import com.mobile.bean.UpdateBean;
import okhttp3.ResponseBody;
import p355u9.AbstractC7066f;
import retrofit2.Converter;

/* renamed from: q9.a */
/* loaded from: classes2.dex */
public class C6353a implements Converter {
    @Override // retrofit2.Converter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public UpdateBean mo22520a(ResponseBody responseBody) {
        return AbstractC7066f.m27229a(responseBody.byteStream());
    }
}
