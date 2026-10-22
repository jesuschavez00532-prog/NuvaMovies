package com.umeng.innner.umcrash;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class UMCrashUtil {
    private static final int MAX_THREAD_TRACE_LENGTH = 20480;
    private static final String TAG = "UMCrashUtil";

    public static Map<String, String> getAllThreadTraces() {
        Map<Thread, StackTraceElement[]> allStackTraces;
        HashMap hashMap = new HashMap();
        try {
            allStackTraces = Thread.getAllStackTraces();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (allStackTraces == null) {
            return null;
        }
        Thread thread = Looper.getMainLooper().getThread();
        if (!allStackTraces.containsKey(thread)) {
            allStackTraces.put(thread, thread.getStackTrace());
        }
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            if (id2 != entry.getKey().getId()) {
                int i10 = 0;
                sb2.setLength(0);
                if (entry.getValue() != null && entry.getValue().length != 0) {
                    StackTraceElement[] value = entry.getValue();
                    int length = value.length;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        StackTraceElement stackTraceElement = value[i10];
                        if (sb2.length() >= MAX_THREAD_TRACE_LENGTH) {
                            sb2.append("\n[Stack trace size must be less than :");
                            sb2.append(MAX_THREAD_TRACE_LENGTH);
                            sb2.append("!]");
                            break;
                        }
                        sb2.append("  at ");
                        sb2.append(stackTraceElement.toString());
                        sb2.append("\n");
                        i10++;
                    }
                    hashMap.put(entry.getKey().getName() + "(" + entry.getKey().getId() + ")", sb2.toString());
                }
            }
        }
        return hashMap;
    }
}
