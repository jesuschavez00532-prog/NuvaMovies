package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ULog {
    public static boolean DEBUG = false;
    private static final int LEVEL_DEBUG = 2;
    private static final int LEVEL_ERROR = 5;
    private static final int LEVEL_INFO = 3;
    private static final int LEVEL_VERBOSE = 1;
    private static final int LEVEL_WARN = 4;
    private static int LOG_MAXLENGTH = 2000;
    private static String TAG = "ULog";

    private ULog() {
    }

    /* renamed from: d */
    public static void m14794d(Locale locale, String str, Object... objArr) {
        try {
            m14790d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    /* renamed from: e */
    public static void m14800e(Locale locale, String str, Object... objArr) {
        try {
            m14796e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    public static String getStackTrace(Throwable th) {
        PrintWriter printWriter;
        StringWriter stringWriter;
        StringWriter stringWriter2 = null;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
            } catch (Throwable unused) {
                printWriter = null;
            }
        } catch (Throwable unused2) {
            printWriter = null;
        }
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            String stringWriter3 = stringWriter.toString();
            try {
                stringWriter.close();
            } catch (Throwable unused3) {
            }
            printWriter.close();
            return stringWriter3;
        } catch (Throwable unused4) {
            stringWriter2 = stringWriter;
            if (stringWriter2 != null) {
                try {
                    stringWriter2.close();
                } catch (Throwable unused5) {
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            return "";
        }
    }

    /* renamed from: i */
    public static void m14806i(Locale locale, String str, Object... objArr) {
        try {
            m14802i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    private static void print(int i10, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i11 = LOG_MAXLENGTH;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= 100) {
                    break;
                }
                if (length > i11) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        Log.e(str, str2.substring(i13, i11));
                                    }
                                } else {
                                    Log.w(str, str2.substring(i13, i11));
                                }
                            } else {
                                Log.i(str, str2.substring(i13, i11));
                            }
                        } else {
                            Log.d(str, str2.substring(i13, i11));
                        }
                    } else {
                        Log.v(str, str2.substring(i13, i11));
                    }
                    i12++;
                    i13 = i11;
                    i11 = LOG_MAXLENGTH + i11;
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    Log.e(str, str2.substring(i13, length));
                                }
                            } else {
                                Log.w(str, str2.substring(i13, length));
                            }
                        } else {
                            Log.i(str, str2.substring(i13, length));
                        }
                    } else {
                        Log.d(str, str2.substring(i13, length));
                    }
                } else {
                    Log.v(str, str2.substring(i13, length));
                }
            }
        }
        if (th != null) {
            String stackTrace = getStackTrace(th);
            if (!TextUtils.isEmpty(stackTrace)) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    Log.e(str, stackTrace);
                                    return;
                                }
                                return;
                            }
                            Log.w(str, stackTrace);
                            return;
                        }
                        Log.i(str, stackTrace);
                        return;
                    }
                    Log.d(str, stackTrace);
                    return;
                }
                Log.v(str, stackTrace);
            }
        }
    }

    /* renamed from: v */
    public static void m14812v(Locale locale, String str, Object... objArr) {
        try {
            m14808v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    /* renamed from: w */
    public static void m14818w(Locale locale, String str, Object... objArr) {
        try {
            m14814w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    /* renamed from: d */
    public static void m14792d(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14790d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14790d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    /* renamed from: e */
    public static void m14798e(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14796e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14796e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    /* renamed from: i */
    public static void m14804i(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14802i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14802i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    /* renamed from: v */
    public static void m14810v(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14808v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14808v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    /* renamed from: w */
    public static void m14816w(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14814w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14814w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14799e(th);
        }
    }

    /* renamed from: d */
    public static void m14793d(Throwable th) {
        m14790d(TAG, (String) null, th);
    }

    /* renamed from: e */
    public static void m14799e(Throwable th) {
        m14796e(TAG, (String) null, th);
    }

    /* renamed from: i */
    public static void m14805i(Throwable th) {
        m14802i(TAG, (String) null, th);
    }

    /* renamed from: v */
    public static void m14811v(Throwable th) {
        m14808v(TAG, (String) null, th);
    }

    /* renamed from: w */
    public static void m14817w(Throwable th) {
        m14814w(TAG, (String) null, th);
    }

    /* renamed from: d */
    public static void m14791d(String str, Throwable th) {
        m14790d(TAG, str, th);
    }

    /* renamed from: e */
    public static void m14797e(String str, Throwable th) {
        m14796e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m14803i(String str, Throwable th) {
        m14802i(TAG, str, th);
    }

    /* renamed from: v */
    public static void m14809v(String str, Throwable th) {
        m14808v(TAG, str, th);
    }

    /* renamed from: w */
    public static void m14815w(String str, Throwable th) {
        m14814w(TAG, str, th);
    }

    /* renamed from: d */
    public static void m14789d(String str) {
        m14790d(TAG, str, (Throwable) null);
    }

    /* renamed from: e */
    public static void m14795e(String str) {
        m14796e(TAG, str, (Throwable) null);
    }

    /* renamed from: i */
    public static void m14801i(String str) {
        m14802i(TAG, str, (Throwable) null);
    }

    /* renamed from: v */
    public static void m14807v(String str) {
        m14808v(TAG, str, (Throwable) null);
    }

    /* renamed from: w */
    public static void m14813w(String str) {
        m14814w(TAG, str, (Throwable) null);
    }

    /* renamed from: d */
    public static void m14790d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m14796e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m14802i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m14808v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m14814w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }
}
