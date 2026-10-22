package anet.channel.strategy.utils;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: anet.channel.strategy.utils.d */
/* loaded from: classes.dex */
public class C1009d {
    /* renamed from: a */
    public static boolean m4779a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 7 || charArray.length > 15) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        for (char c10 : charArray) {
            if (c10 >= '0' && c10 <= '9') {
                i11 = ((i11 * 10) + c10) - 48;
                if (i11 > 255) {
                    return false;
                }
            } else {
                if (c10 != '.' || (i10 = i10 + 1) > 3) {
                    return false;
                }
                i11 = 0;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m4780b(String str) {
        int i10;
        boolean z10;
        int i11;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 2) {
            return false;
        }
        if (charArray[0] == ':') {
            if (charArray[1] != ':') {
                return false;
            }
            i10 = 1;
            z10 = false;
            i11 = 1;
        } else {
            i10 = 0;
            z10 = false;
            i11 = 0;
        }
        int i12 = 0;
        boolean z11 = true;
        while (i10 < charArray.length) {
            char c10 = charArray[i10];
            int digit = Character.digit(c10, 16);
            if (digit != -1) {
                i12 = (i12 << 4) + digit;
                if (i12 > 65535) {
                    return false;
                }
                z11 = false;
            } else {
                if (c10 != ':' || (i11 = i11 + 1) > 7) {
                    return false;
                }
                if (z11) {
                    if (z10) {
                        return false;
                    }
                    z10 = true;
                } else {
                    i12 = 0;
                    z11 = true;
                }
            }
            i10++;
        }
        if (!z10 && i11 < 7) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m4781c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray.length > 255) {
            return false;
        }
        boolean z10 = false;
        for (char c10 : charArray) {
            if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || c10 == '*')) {
                z10 = true;
            } else if ((c10 < '0' || c10 > '9') && c10 != '.' && c10 != '-') {
                return false;
            }
        }
        return z10;
    }

    /* renamed from: d */
    public static String m4782d(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m4777a(long j10) {
        StringBuilder sb2 = new StringBuilder(16);
        long j11 = 1000000000;
        do {
            sb2.append(j10 / j11);
            sb2.append('.');
            j10 %= j11;
            j11 /= 1000;
        } while (j11 > 0);
        sb2.setLength(sb2.length() - 1);
        return sb2.toString();
    }

    /* renamed from: a */
    public static String m4778a(Map<String, String> map, String str) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(64);
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(Operator.Operation.EQUALS);
                    sb2.append(URLEncoder.encode(m4782d(entry.getValue()), str).replace(Operator.Operation.PLUS, "%20"));
                    sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                }
            }
            sb2.deleteCharAt(sb2.length() - 1);
        } catch (UnsupportedEncodingException e10) {
            ALog.m4786e("Request", "format params failed", null, e10, new Object[0]);
        }
        return sb2.toString();
    }
}
