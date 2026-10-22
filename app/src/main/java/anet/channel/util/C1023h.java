package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anet.channel.util.h */
/* loaded from: classes.dex */
public class C1023h {

    /* renamed from: a */
    private static Map<String, Integer> f4225a;

    static {
        HashMap hashMap = new HashMap();
        f4225a = hashMap;
        hashMap.put("tpatch", 3);
        f4225a.put("so", 3);
        f4225a.put("json", 3);
        f4225a.put("html", 4);
        f4225a.put("htm", 4);
        f4225a.put("css", 5);
        f4225a.put("js", 5);
        f4225a.put("webp", 6);
        f4225a.put("png", 6);
        f4225a.put("jpg", 6);
        f4225a.put("do", 6);
        f4225a.put("zip", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f4225a.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f4225a.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }

    /* renamed from: a */
    public static int m4811a(Request request) {
        Integer num;
        if (request != null) {
            if (request.getHeaders().containsKey(HttpConstant.X_PV)) {
                return 1;
            }
            String trySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
            if (trySolveFileExtFromUrlPath == null || (num = f4225a.get(trySolveFileExtFromUrlPath)) == null) {
                return 6;
            }
            return num.intValue();
        }
        throw new NullPointerException("url is null!");
    }
}
