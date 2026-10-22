package com.bytedance.boost_multidex;

import android.content.SharedPreferences;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class DexLoader {
    ElementConstructor mElementConstructor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface ElementConstructor {
        Object newInstance(File file, Object obj);
    }

    /* loaded from: classes.dex */
    private static class ICSElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        ICSElementConstructor(Class<?> cls) {
            Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
            this.mConstructor = constructor;
            constructor.setAccessible(true);
        }

        @Override // com.bytedance.boost_multidex.DexLoader.ElementConstructor
        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(file, null, obj);
        }
    }

    /* loaded from: classes.dex */
    private static class JBMR11ElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        JBMR11ElementConstructor(Class<?> cls) {
            Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
            this.mConstructor = constructor;
            constructor.setAccessible(true);
        }

        @Override // com.bytedance.boost_multidex.DexLoader.ElementConstructor
        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(file, null, obj);
        }
    }

    /* loaded from: classes.dex */
    private static class JBMR2ElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        JBMR2ElementConstructor(Class<?> cls) {
            Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
            this.mConstructor = constructor;
            constructor.setAccessible(true);
        }

        @Override // com.bytedance.boost_multidex.DexLoader.ElementConstructor
        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(file, Boolean.FALSE, null, obj);
        }
    }

    /* loaded from: classes.dex */
    private static class KKElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        KKElementConstructor(Class<?> cls) {
            Constructor<?> findConstructor = Utility.findConstructor(cls, File.class, Boolean.TYPE, File.class, DexFile.class);
            this.mConstructor = findConstructor;
            findConstructor.setAccessible(true);
        }

        @Override // com.bytedance.boost_multidex.DexLoader.ElementConstructor
        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(file, Boolean.FALSE, null, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class V14 extends DexLoader {
        private V14() {
            ElementConstructor elementConstructor;
            try {
                Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
                try {
                    elementConstructor = new ICSElementConstructor(cls);
                } catch (Exception unused) {
                    elementConstructor = null;
                }
                if (elementConstructor == null) {
                    try {
                        elementConstructor = new JBMR11ElementConstructor(cls);
                    } catch (Exception unused2) {
                    }
                }
                if (elementConstructor == null) {
                    try {
                        elementConstructor = new JBMR2ElementConstructor(cls);
                    } catch (Exception unused3) {
                    }
                }
                this.mElementConstructor = elementConstructor;
            } catch (Exception e10) {
                Monitor.get().logError("can not find DexPathList$Element", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class V19 extends DexLoader {
        private V19() {
            try {
                this.mElementConstructor = new KKElementConstructor(Class.forName("dalvik.system.DexPathList$Element"));
            } catch (Throwable th) {
                Monitor.get().logError("fail to get Element constructor", th);
            }
        }
    }

    DexLoader() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DexLoader create(int i10) {
        if (i10 >= 19) {
            return new V19();
        }
        if (i10 >= 14) {
            return new V14();
        }
        throw new UnsupportedOperationException("only support SDK_INT >= 14, give up when < 14");
    }

    private Object[] makeDexElements(List<DexHolder> list, SharedPreferences sharedPreferences) {
        Object dexListElement;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            DexHolder dexHolder = list.get(i10);
            while (true) {
                dexListElement = dexHolder.toDexListElement(this.mElementConstructor);
                while (dexListElement == null && dexHolder != null) {
                    Monitor.get().logWarning("Load faster dex in holder " + dexHolder.toString());
                    dexHolder = dexHolder.toFasterHolder(sharedPreferences);
                    if (dexHolder != null) {
                        break;
                    }
                }
            }
            if (dexListElement == null) {
                throw new RuntimeException("Fail to load dex, index is " + i10);
            }
            Monitor.get().logInfo("Load dex in holder " + dexHolder.toString());
            list.set(i10, dexHolder);
            arrayList.add(dexListElement);
            String obj = dexHolder.toString();
            Result.get().addDexInfo(obj);
            Monitor.get().logInfo("Add info: " + obj);
        }
        return arrayList.toArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void install(ClassLoader classLoader, List<DexHolder> list) {
        Object obj = Utility.findFieldRecursively(classLoader.getClass(), "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            DexHolder dexHolder = list.get(i10);
            arrayList.add(dexHolder.toDexListElement(this.mElementConstructor));
            Monitor.get().logInfo("Install holder: " + dexHolder.getClass().getName() + ", index " + i10);
        }
        Utility.expandFieldArray(obj, "dexElements", arrayList.toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void install(ClassLoader classLoader, List<DexHolder> list, SharedPreferences sharedPreferences) {
        Utility.expandFieldArray(Utility.findFieldRecursively(classLoader.getClass(), "pathList").get(classLoader), "dexElements", makeDexElements(list, sharedPreferences));
    }
}
