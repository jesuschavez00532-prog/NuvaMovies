package org.xutils.p274db.table;

import android.text.TextUtils;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class DbModel {
    private final HashMap<String, String> dataMap = new HashMap<>();

    public void add(String str, String str2) {
        this.dataMap.put(str, str2);
    }

    public boolean getBoolean(String str) {
        String str2 = this.dataMap.get(str);
        if (str2 != null) {
            if (str2.length() == 1) {
                return "1".equals(str2);
            }
            return Boolean.valueOf(str2).booleanValue();
        }
        return false;
    }

    public HashMap<String, String> getDataMap() {
        return this.dataMap;
    }

    public Date getDate(String str, long j10) {
        return new Date(getLong(str, j10));
    }

    public double getDouble(String str, double d10) {
        String str2 = this.dataMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            return d10;
        }
        try {
            return Double.valueOf(str2).doubleValue();
        } catch (Throwable unused) {
            return d10;
        }
    }

    public float getFloat(String str, float f10) {
        String str2 = this.dataMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            return f10;
        }
        try {
            return Float.valueOf(str2).floatValue();
        } catch (Throwable unused) {
            return f10;
        }
    }

    public int getInt(String str, int i10) {
        String str2 = this.dataMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            return i10;
        }
        try {
            return Integer.valueOf(str2).intValue();
        } catch (Throwable unused) {
            return i10;
        }
    }

    public long getLong(String str, long j10) {
        String str2 = this.dataMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        try {
            return Long.valueOf(str2).longValue();
        } catch (Throwable unused) {
            return j10;
        }
    }

    public java.sql.Date getSqlDate(String str, long j10) {
        return new java.sql.Date(getLong(str, j10));
    }

    public String getString(String str) {
        return this.dataMap.get(str);
    }

    public boolean isEmpty(String str) {
        return TextUtils.isEmpty(this.dataMap.get(str));
    }
}
