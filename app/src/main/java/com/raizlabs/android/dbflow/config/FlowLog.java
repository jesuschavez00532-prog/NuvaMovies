package com.raizlabs.android.dbflow.config;

import android.util.Log;

/* loaded from: classes2.dex */
public class FlowLog {
    public static final String TAG = "FlowLog";
    private static Level level = Level.E;

    /* loaded from: classes2.dex */
    public enum Level {
        V { // from class: com.raizlabs.android.dbflow.config.FlowLog.Level.1
            @Override // com.raizlabs.android.dbflow.config.FlowLog.Level
            void call(String str, String str2, Throwable th) {
                Log.v(str, str2, th);
            }
        },
        D { // from class: com.raizlabs.android.dbflow.config.FlowLog.Level.2
            @Override // com.raizlabs.android.dbflow.config.FlowLog.Level
            void call(String str, String str2, Throwable th) {
                Log.d(str, str2, th);
            }
        },
        I { // from class: com.raizlabs.android.dbflow.config.FlowLog.Level.3
            @Override // com.raizlabs.android.dbflow.config.FlowLog.Level
            void call(String str, String str2, Throwable th) {
                Log.i(str, str2, th);
            }
        },
        W { // from class: com.raizlabs.android.dbflow.config.FlowLog.Level.4
            @Override // com.raizlabs.android.dbflow.config.FlowLog.Level
            void call(String str, String str2, Throwable th) {
                Log.w(str, str2, th);
            }
        },
        E { // from class: com.raizlabs.android.dbflow.config.FlowLog.Level.5
            @Override // com.raizlabs.android.dbflow.config.FlowLog.Level
            void call(String str, String str2, Throwable th) {
                Log.e(str, str2, th);
            }
        },
        WTF { // from class: com.raizlabs.android.dbflow.config.FlowLog.Level.6
            @Override // com.raizlabs.android.dbflow.config.FlowLog.Level
            void call(String str, String str2, Throwable th) {
                Log.wtf(str, str2, th);
            }
        };

        abstract void call(String str, String str2, Throwable th);
    }

    public static boolean isEnabled(Level level2) {
        if (level2.ordinal() >= level.ordinal()) {
            return true;
        }
        return false;
    }

    public static void log(Level level2, String str) {
        log(level2, str, null);
    }

    public static void logError(Throwable th) {
        log(Level.E, th);
    }

    public static void setMinimumLoggingLevel(Level level2) {
        level = level2;
    }

    public static void log(Level level2, String str, Throwable th) {
        log(level2, TAG, str, th);
    }

    public static void log(Level level2, String str, String str2, Throwable th) {
        if (isEnabled(level2)) {
            level2.call(str, str2, th);
        }
    }

    public static void log(Level level2, Throwable th) {
        log(level2, TAG, "", th);
    }
}
