package org.xutils.view;

import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC0712e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import org.xutils.C6127x;
import org.xutils.ViewInjector;
import org.xutils.common.util.LogUtil;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

/* loaded from: classes3.dex */
public final class ViewInjectorImpl implements ViewInjector {
    private static final HashSet<Class<?>> IGNORED;
    private static volatile ViewInjectorImpl instance;
    private static final Object lock;

    static {
        HashSet<Class<?>> hashSet = new HashSet<>();
        IGNORED = hashSet;
        hashSet.add(Object.class);
        hashSet.add(Activity.class);
        hashSet.add(Fragment.class);
        try {
            int i10 = androidx.fragment.app.Fragment.f2617n0;
            hashSet.add(androidx.fragment.app.Fragment.class);
            int i11 = AbstractActivityC0712e.f2782p;
            hashSet.add(AbstractActivityC0712e.class);
        } catch (Throwable unused) {
        }
        lock = new Object();
    }

    private ViewInjectorImpl() {
    }

    private static ContentView findContentView(Class<?> cls) {
        if (cls != null && !IGNORED.contains(cls) && !cls.getName().startsWith("androidx.")) {
            ContentView contentView = (ContentView) cls.getAnnotation(ContentView.class);
            if (contentView == null) {
                return findContentView(cls.getSuperclass());
            }
            return contentView;
        }
        return null;
    }

    private static void injectObject(Object obj, Class<?> cls, C6125a c6125a) {
        Event event;
        ViewInject viewInject;
        if (cls == null || IGNORED.contains(cls) || cls.getName().startsWith("androidx.")) {
            return;
        }
        injectObject(obj, cls.getSuperclass(), c6125a);
        Field[] declaredFields = cls.getDeclaredFields();
        if (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                Class<?> type = field.getType();
                if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isFinal(field.getModifiers()) && !type.isPrimitive() && !type.isArray() && (viewInject = (ViewInject) field.getAnnotation(ViewInject.class)) != null) {
                    try {
                        View m24420b = c6125a.m24420b(viewInject.value(), viewInject.parentId());
                        if (m24420b != null) {
                            field.setAccessible(true);
                            field.set(obj, m24420b);
                        } else {
                            throw new RuntimeException("Invalid @ViewInject for " + cls.getSimpleName() + "." + field.getName());
                            break;
                        }
                    } catch (Throwable th) {
                        LogUtil.m24376e(th.getMessage(), th);
                    }
                }
            }
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (declaredMethods == null || declaredMethods.length <= 0) {
            return;
        }
        for (Method method : declaredMethods) {
            if (!Modifier.isStatic(method.getModifiers()) && Modifier.isPrivate(method.getModifiers()) && (event = (Event) method.getAnnotation(Event.class)) != null) {
                try {
                    int[] value = event.value();
                    int[] parentId = event.parentId();
                    int length = parentId == null ? 0 : parentId.length;
                    int i10 = 0;
                    while (i10 < value.length) {
                        int i11 = value[i10];
                        if (i11 > 0) {
                            C6126b c6126b = new C6126b();
                            c6126b.f24114a = i11;
                            c6126b.f24115b = length > i10 ? parentId[i10] : 0;
                            method.setAccessible(true);
                            EventListenerManager.m24418b(c6125a, c6126b, event, obj, method);
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    LogUtil.m24376e(th2.getMessage(), th2);
                }
            }
        }
    }

    public static void registerInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ViewInjectorImpl();
                }
            }
        }
        C6127x.Ext.setViewInjector(instance);
    }

    @Override // org.xutils.ViewInjector
    public void inject(View view) {
        injectObject(view, view.getClass(), new C6125a(view));
    }

    @Override // org.xutils.ViewInjector
    public void inject(Activity activity) {
        int value;
        Class<?> cls = activity.getClass();
        try {
            ContentView findContentView = findContentView(cls);
            if (findContentView != null && (value = findContentView.value()) > 0) {
                activity.setContentView(value);
            }
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
        injectObject(activity, cls, new C6125a(activity));
    }

    @Override // org.xutils.ViewInjector
    public void inject(Object obj, View view) {
        injectObject(obj, obj.getClass(), new C6125a(view));
    }

    @Override // org.xutils.ViewInjector
    public View inject(Object obj, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int value;
        Class<?> cls = obj.getClass();
        View view = null;
        try {
            ContentView findContentView = findContentView(cls);
            if (findContentView != null && (value = findContentView.value()) > 0) {
                view = layoutInflater.inflate(value, viewGroup, false);
            }
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
        injectObject(obj, cls, new C6125a(view));
        return view;
    }
}
