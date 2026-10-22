package anet.channel.appmonitor;

import android.text.TextUtils;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p199k0.AbstractC5078b;

/* renamed from: anet.channel.appmonitor.a */
/* loaded from: classes.dex */
public class C0899a implements IAppMonitor {

    /* renamed from: a */
    private static boolean f3788a;

    /* renamed from: b */
    private static Map<Class<?>, List<Field>> f3789b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<Class<?>, List<Field>> f3790c = new ConcurrentHashMap();

    /* renamed from: d */
    private static Map<Field, String> f3791d = new ConcurrentHashMap();

    /* renamed from: e */
    private static Random f3792e = new Random();

    /* renamed from: f */
    private static Set<Class<?>> f3793f = Collections.newSetFromMap(new ConcurrentHashMap());

    public C0899a() {
        try {
            Class.forName("com.alibaba.mtl.appmonitor.AppMonitor");
            f3788a = true;
        } catch (Exception unused) {
            f3788a = false;
        }
    }

    /* renamed from: a */
    synchronized void m4507a(Class<?> cls) {
        String name;
        String name2;
        if (cls != null) {
            if (f3788a) {
                try {
                } catch (Exception e10) {
                    ALog.m4786e("awcn.DefaultAppMonitor", "register fail", null, e10, new Object[0]);
                }
                if (f3793f.contains(cls)) {
                    return;
                }
                Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
                if (monitor == null) {
                    return;
                }
                Field[] fields = cls.getFields();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                DimensionSet create = DimensionSet.create();
                MeasureSet create2 = MeasureSet.create();
                for (Field field : fields) {
                    Dimension dimension = (Dimension) field.getAnnotation(Dimension.class);
                    if (dimension != null) {
                        field.setAccessible(true);
                        arrayList.add(field);
                        if (dimension.name().equals("")) {
                            name2 = field.getName();
                        } else {
                            name2 = dimension.name();
                        }
                        f3791d.put(field, name2);
                        create.addDimension(name2);
                    } else {
                        Measure measure = (Measure) field.getAnnotation(Measure.class);
                        if (measure != null) {
                            field.setAccessible(true);
                            arrayList2.add(field);
                            if (measure.name().equals("")) {
                                name = field.getName();
                            } else {
                                name = measure.name();
                            }
                            f3791d.put(field, name);
                            if (measure.max() != Double.MAX_VALUE) {
                                create2.addMeasure(new com.alibaba.mtl.appmonitor.model.Measure(name, Double.valueOf(measure.constantValue()), Double.valueOf(measure.min()), Double.valueOf(measure.max())));
                            } else {
                                create2.addMeasure(name);
                            }
                        }
                    }
                }
                f3789b.put(cls, arrayList);
                f3790c.put(cls, arrayList2);
                com.alibaba.mtl.appmonitor.AppMonitor.register(monitor.module(), monitor.monitorPoint(), create2, create);
                f3793f.add(cls);
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitAlarm(AlarmObject alarmObject) {
        if (f3788a && alarmObject != null && !TextUtils.isEmpty(alarmObject.module) && !TextUtils.isEmpty(alarmObject.modulePoint)) {
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.DefaultAppMonitor", "commit alarm: " + alarmObject, null, new Object[0]);
            }
            if (!alarmObject.isSuccess) {
                AppMonitor.Alarm.commitFail(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg), StringUtils.stringNull2Empty(alarmObject.errorCode), StringUtils.stringNull2Empty(alarmObject.errorMsg));
            } else {
                AppMonitor.Alarm.commitSuccess(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg));
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitCount(CountObject countObject) {
        if (f3788a && countObject != null && !TextUtils.isEmpty(countObject.module) && !TextUtils.isEmpty(countObject.modulePoint)) {
            if (ALog.isPrintLog(2)) {
                ALog.m4788i("awcn.DefaultAppMonitor", "commit count: " + countObject, null, new Object[0]);
            }
            AppMonitor.Counter.commit(countObject.module, countObject.modulePoint, StringUtils.stringNull2Empty(countObject.arg), countObject.value);
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitStat(StatObject statObject) {
        HashMap hashMap;
        String obj;
        if (f3788a && statObject != null) {
            Class<?> cls = statObject.getClass();
            Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
            if (monitor == null) {
                return;
            }
            if (!f3793f.contains(cls)) {
                m4507a(cls);
            }
            if (!statObject.beforeCommit()) {
                return;
            }
            if (monitor.monitorPoint().equals("network")) {
                int m20551a = AbstractC5078b.m20551a();
                if (m20551a > 10000 || m20551a < 0) {
                    m20551a = 10000;
                }
                if (m20551a != 10000 && f3792e.nextInt(10000) >= m20551a) {
                    return;
                }
            }
            try {
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                List<Field> list = f3789b.get(cls);
                if (ALog.isPrintLog(1)) {
                    hashMap = new HashMap();
                } else {
                    hashMap = null;
                }
                if (list != null) {
                    for (Field field : list) {
                        Object obj2 = field.get(statObject);
                        String str = f3791d.get(field);
                        if (obj2 == null) {
                            obj = "";
                        } else {
                            obj = obj2.toString();
                        }
                        create.setValue(str, obj);
                    }
                    for (Field field2 : f3790c.get(cls)) {
                        Double valueOf = Double.valueOf(field2.getDouble(statObject));
                        create2.setValue(f3791d.get(field2), valueOf.doubleValue());
                        if (hashMap != null) {
                            hashMap.put(f3791d.get(field2), valueOf);
                        }
                    }
                }
                AppMonitor.Stat.commit(monitor.module(), monitor.monitorPoint(), create, create2);
                if (ALog.isPrintLog(1)) {
                    ALog.m4785d("awcn.DefaultAppMonitor", "commit stat: " + monitor.monitorPoint(), null, "\nDimensions", create.getMap().toString(), "\nMeasures", hashMap.toString());
                }
            } catch (Throwable th) {
                ALog.m4786e("awcn.DefaultAppMonitor", "commit monitor point failed", null, th, new Object[0]);
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register() {
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register(Class<?> cls) {
    }
}
