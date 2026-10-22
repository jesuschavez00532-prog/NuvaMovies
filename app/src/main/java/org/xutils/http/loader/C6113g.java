package org.xutils.http.loader;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.ParameterizedTypeUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpResponse;
import org.xutils.http.app.ResponseParser;
import org.xutils.http.request.UriRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.xutils.http.loader.g */
/* loaded from: classes3.dex */
public class C6113g extends Loader {

    /* renamed from: a */
    private final Type f24052a;

    /* renamed from: b */
    private final Class f24053b;

    /* renamed from: c */
    private final ResponseParser f24054c;

    /* renamed from: d */
    private final Loader f24055d;

    public C6113g(Type type) {
        HttpResponse httpResponse;
        Class cls;
        this.f24052a = type;
        if (type instanceof ParameterizedType) {
            this.f24053b = (Class) ((ParameterizedType) type).getRawType();
        } else if (!(type instanceof TypeVariable)) {
            this.f24053b = (Class) type;
        } else {
            throw new IllegalArgumentException("not support callback type " + type.toString());
        }
        if (List.class.equals(this.f24053b)) {
            type = ParameterizedTypeUtil.getParameterizedType(type, List.class, 0);
            if (type instanceof ParameterizedType) {
                cls = (Class) ((ParameterizedType) type).getRawType();
            } else if (!(type instanceof TypeVariable)) {
                cls = (Class) type;
            } else {
                throw new IllegalArgumentException("not support callback type " + type.toString());
            }
            httpResponse = (HttpResponse) cls.getAnnotation(HttpResponse.class);
        } else {
            httpResponse = (HttpResponse) this.f24053b.getAnnotation(HttpResponse.class);
        }
        if (httpResponse != null) {
            try {
                Class<? extends ResponseParser> parser = httpResponse.parser();
                this.f24054c = parser.newInstance();
                Loader<?> loader = LoaderFactory.getLoader(ParameterizedTypeUtil.getParameterizedType(parser, ResponseParser.class, 0));
                this.f24055d = loader;
                if (!(loader instanceof C6113g)) {
                    return;
                }
                throw new IllegalArgumentException("not support callback type " + type);
            } catch (Throwable th) {
                throw new RuntimeException("create parser error", th);
            }
        }
        throw new IllegalArgumentException("not found @HttpResponse from " + type);
    }

    @Override // org.xutils.http.loader.Loader
    public Object load(UriRequest uriRequest) {
        uriRequest.setResponseParser(this.f24054c);
        return this.f24054c.parse(this.f24052a, this.f24053b, this.f24055d.load(uriRequest));
    }

    @Override // org.xutils.http.loader.Loader
    public Object loadFromCache(DiskCacheEntity diskCacheEntity) {
        return this.f24054c.parse(this.f24052a, this.f24053b, this.f24055d.loadFromCache(diskCacheEntity));
    }

    @Override // org.xutils.http.loader.Loader
    public Loader<Object> newInstance() {
        throw new IllegalAccessError("use constructor create ObjectLoader.");
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
        this.f24055d.save2Cache(uriRequest);
    }

    @Override // org.xutils.http.loader.Loader
    public void setParams(RequestParams requestParams) {
        this.f24055d.setParams(requestParams);
    }
}
