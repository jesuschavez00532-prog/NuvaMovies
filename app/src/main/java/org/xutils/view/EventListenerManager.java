package org.xutils.view;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xutils.common.util.DoubleKeyValueMap;
import org.xutils.common.util.LogUtil;
import org.xutils.view.annotation.Event;

/* loaded from: classes3.dex */
abstract class EventListenerManager {

    /* renamed from: a */
    private static final HashSet f24110a;

    /* renamed from: b */
    private static final DoubleKeyValueMap f24111b;

    /* loaded from: classes3.dex */
    public static class DynamicHandler implements InvocationHandler {
        private static long lastClickTime;
        private WeakReference<Object> handlerRef;
        private final HashMap<String, Method> methodMap = new HashMap<>(1);

        public DynamicHandler(Object obj) {
            this.handlerRef = new WeakReference<>(obj);
        }

        public void addMethod(String str, Method method) {
            this.methodMap.put(str, method);
        }

        public Object getHandler() {
            return this.handlerRef.get();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2 = this.handlerRef.get();
            if (obj2 != null) {
                String name = method.getName();
                if ("toString".equals(name)) {
                    return DynamicHandler.class.getSimpleName();
                }
                Method method2 = this.methodMap.get(name);
                if (method2 == null && this.methodMap.size() == 1) {
                    Iterator<Map.Entry<String, Method>> it = this.methodMap.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry<String, Method> next = it.next();
                        if (TextUtils.isEmpty(next.getKey())) {
                            method2 = next.getValue();
                        }
                    }
                }
                if (method2 != null) {
                    if (EventListenerManager.f24110a.contains(name)) {
                        long currentTimeMillis = System.currentTimeMillis() - lastClickTime;
                        if (currentTimeMillis > 0 && currentTimeMillis < 300) {
                            LogUtil.m24373d("onClick cancelled: " + currentTimeMillis);
                            return null;
                        }
                        lastClickTime = System.currentTimeMillis();
                    }
                    try {
                        return method2.invoke(obj2, objArr);
                    } catch (Throwable th) {
                        throw new RuntimeException("invoke method error:" + obj2.getClass().getName() + "#" + method2.getName(), th);
                    }
                }
                LogUtil.m24381w("method not impl: " + name + "(" + obj2.getClass().getSimpleName() + ")");
            }
            return null;
        }
    }

    static {
        HashSet hashSet = new HashSet(2);
        f24110a = hashSet;
        hashSet.add("onClick");
        hashSet.add("onItemClick");
        f24111b = new DoubleKeyValueMap();
    }

    /* renamed from: b */
    public static void m24418b(C6125a c6125a, C6126b c6126b, Event event, Object obj, Method method) {
        boolean z10;
        try {
            View m24421c = c6125a.m24421c(c6126b);
            if (m24421c != null) {
                Class<?> type = event.type();
                String str = event.setter();
                if (TextUtils.isEmpty(str)) {
                    str = "set" + type.getSimpleName();
                }
                String method2 = event.method();
                DoubleKeyValueMap doubleKeyValueMap = f24111b;
                Object obj2 = doubleKeyValueMap.get(c6126b, type);
                if (obj2 != null) {
                    DynamicHandler dynamicHandler = (DynamicHandler) Proxy.getInvocationHandler(obj2);
                    z10 = obj.equals(dynamicHandler.getHandler());
                    if (z10) {
                        dynamicHandler.addMethod(method2, method);
                    }
                } else {
                    z10 = false;
                }
                if (!z10) {
                    DynamicHandler dynamicHandler2 = new DynamicHandler(obj);
                    dynamicHandler2.addMethod(method2, method);
                    obj2 = Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, dynamicHandler2);
                    doubleKeyValueMap.put(c6126b, type, obj2);
                }
                m24421c.getClass().getMethod(str, type).invoke(m24421c, obj2);
            }
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }
}
