package org.xutils.http.loader;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LoaderFactory {
    private static final HashMap<Type, Loader> converterHashMap;

    static {
        HashMap<Type, Loader> hashMap = new HashMap<>();
        converterHashMap = hashMap;
        hashMap.put(JSONObject.class, new C6112f());
        hashMap.put(JSONArray.class, new C6111e());
        hashMap.put(String.class, new C6114h());
        hashMap.put(File.class, new FileLoader());
        hashMap.put(byte[].class, new C6108b());
        hashMap.put(InputStream.class, new C6109c());
        C6107a c6107a = new C6107a();
        hashMap.put(Boolean.TYPE, c6107a);
        hashMap.put(Boolean.class, c6107a);
        C6110d c6110d = new C6110d();
        hashMap.put(Integer.TYPE, c6110d);
        hashMap.put(Integer.class, c6110d);
    }

    private LoaderFactory() {
    }

    public static Loader<?> getLoader(Type type) {
        Loader loader = converterHashMap.get(type);
        if (loader == null) {
            return new C6113g(type);
        }
        return loader.newInstance();
    }

    public static <T> void registerLoader(Type type, Loader<T> loader) {
        converterHashMap.put(type, loader);
    }
}
