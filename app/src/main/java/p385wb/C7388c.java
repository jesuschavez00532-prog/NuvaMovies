package p385wb;

import android.text.TextUtils;
import cc.AbstractC1459j;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.request.converterFactory.bean.EncryptJsonBean;
import com.request.converterFactory.bean.ResultException;
import com.request.result.BaseResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import org.android.agoo.message.MessageService;
import retrofit2.Converter;

/* renamed from: wb.c */
/* loaded from: classes2.dex */
public final class C7388c implements Converter {

    /* renamed from: a */
    private final String f27398a = "GsonDResponseBodyConverter";

    /* renamed from: b */
    private final Gson f27399b;

    /* renamed from: c */
    private final TypeAdapter f27400c;

    /* renamed from: d */
    private final Type f27401d;

    /* renamed from: e */
    private final Annotation[] f27402e;

    /* renamed from: f */
    private boolean f27403f;

    /* renamed from: g */
    private InterfaceC7389d f27404g;

    /* renamed from: h */
    private boolean f27405h;

    public C7388c(Gson gson, TypeAdapter typeAdapter, Type type, Annotation[] annotationArr, InterfaceC7389d interfaceC7389d) {
        this.f27399b = gson;
        this.f27400c = typeAdapter;
        this.f27401d = type;
        this.f27402e = annotationArr;
        this.f27403f = m28502e(annotationArr);
        this.f27404g = interfaceC7389d;
        this.f27405h = m28501d(annotationArr);
    }

    /* renamed from: c */
    private Object m28500c(String str) {
        if (AbstractC1459j.m6800e() && this.f27405h) {
            EncryptJsonBean encryptJsonBean = (EncryptJsonBean) this.f27399b.fromJson(str, EncryptJsonBean.class);
            if (encryptJsonBean != null && !TextUtils.isEmpty(encryptJsonBean.getData())) {
                return this.f27399b.fromJson(str.replace("\"" + encryptJsonBean.getData() + "\"", this.f27404g.mo28504a(encryptJsonBean.getData())), this.f27401d);
            }
            return this.f27399b.fromJson(str, this.f27401d);
        }
        return this.f27399b.fromJson(str, this.f27401d);
    }

    /* renamed from: d */
    private boolean m28501d(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.toString().contains("needEncrypt:false")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private boolean m28502e(Annotation[] annotationArr) {
        if (annotationArr != null && annotationArr.length > 0) {
            for (Annotation annotation : annotationArr) {
                if (annotation.toString().contains("ProcessResult:false")) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // retrofit2.Converter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22520a(ResponseBody responseBody) {
        String string = responseBody.string();
        BaseResult baseResult = (BaseResult) this.f27399b.fromJson(string, BaseResult.class);
        if (this.f27403f) {
            if (MessageService.MSG_DB_READY_REPORT.equals(baseResult.getReturnCode())) {
                return m28500c(string);
            }
            String returnCode = baseResult.getReturnCode();
            if ("portal400002".equalsIgnoreCase(returnCode)) {
                returnCode = "ed2";
            }
            throw new ResultException(returnCode, baseResult.getErrorMessage());
        }
        return m28500c(string);
    }
}
