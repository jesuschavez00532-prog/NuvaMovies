package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes3.dex */
public class MLog {
    public static boolean DEBUG = false;
    private static final int LEVEL_DEBUG = 2;
    private static final int LEVEL_ERROR = 5;
    private static final int LEVEL_INFO = 3;
    private static final int LEVEL_VERBOSE = 1;
    private static final int LEVEL_WARN = 4;
    private static int LOG_MAXLENGTH = 2000;
    private static String TAG = "MobclickAgent";

    private MLog() {
    }

    /* renamed from: d */
    public static void m14764d(Locale locale, String str, Object... objArr) {
        try {
            m14760d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14769e(th);
        }
    }

    /* renamed from: e */
    public static void m14770e(Locale locale, String str, Object... objArr) {
        try {
            m14766e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14769e(th);
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
    public static void m14776i(Locale locale, String str, Object... objArr) {
        try {
            m14772i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14769e(th);
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
    public static void m14782v(Locale locale, String str, Object... objArr) {
        try {
            m14778v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14769e(th);
        }
    }

    /* renamed from: w */
    public static void m14788w(Locale locale, String str, Object... objArr) {
        try {
            m14784w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m14769e(th);
        }
    }

    /* renamed from: d */
    public static void m14762d(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14760d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14760d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14769e(th);
        }
    }

    /* renamed from: e */
    public static void m14768e(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14766e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14766e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14769e(th);
        }
    }

    /* renamed from: i */
    public static void m14774i(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14772i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14772i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14769e(th);
        }
    }

    /* renamed from: v */
    public static void m14780v(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14778v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14778v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14769e(th);
        }
    }

    /* renamed from: w */
    public static void m14786w(String str, Object... objArr) {
        try {
            if (str.contains(Operator.Operation.MOD)) {
                m14784w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m14784w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m14769e(th);
        }
    }

    /* renamed from: d */
    public static void m14763d(Throwable th) {
        m14760d(TAG, (String) null, th);
    }

    /* renamed from: e */
    public static void m14769e(Throwable th) {
        m14766e(TAG, (String) null, th);
    }

    /* renamed from: i */
    public static void m14775i(Throwable th) {
        m14772i(TAG, (String) null, th);
    }

    /* renamed from: v */
    public static void m14781v(Throwable th) {
        m14778v(TAG, (String) null, th);
    }

    /* renamed from: w */
    public static void m14787w(Throwable th) {
        m14784w(TAG, (String) null, th);
    }

    /* renamed from: d */
    public static void m14761d(String str, Throwable th) {
        m14760d(TAG, str, th);
    }

    /* renamed from: e */
    public static void m14767e(String str, Throwable th) {
        m14766e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m14773i(String str, Throwable th) {
        m14772i(TAG, str, th);
    }

    /* renamed from: v */
    public static void m14779v(String str, Throwable th) {
        m14778v(TAG, str, th);
    }

    /* renamed from: w */
    public static void m14785w(String str, Throwable th) {
        m14784w(TAG, str, th);
    }

    /* renamed from: d */
    public static void m14759d(String str) {
        m14760d(TAG, str, (Throwable) null);
    }

    /* renamed from: e */
    public static void m14765e(String str) {
        m14766e(TAG, str, (Throwable) null);
    }

    /* renamed from: i */
    public static void m14771i(String str) {
        m14772i(TAG, str, (Throwable) null);
    }

    /* renamed from: v */
    public static void m14777v(String str) {
        m14778v(TAG, str, (Throwable) null);
    }

    /* renamed from: w */
    public static void m14783w(String str) {
        m14784w(TAG, str, (Throwable) null);
    }

    /* renamed from: d */
    public static void m14760d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m14766e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m14772i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m14778v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m14784w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }
}
