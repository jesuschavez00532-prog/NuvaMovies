package p400xa;

import android.content.Context;
import android.text.TextUtils;
import com.module.R$array;
import com.module.R$string;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import java.util.regex.Pattern;
import ne.AbstractC5868k;
import p359ue.AbstractC7166t;

/* renamed from: xa.c1 */
/* loaded from: classes2.dex */
public final class C7559c1 {

    /* renamed from: a */
    public static final C7559c1 f27762a = new C7559c1();

    /* renamed from: b */
    private static String[] f27763b;

    /* renamed from: c */
    private static String[] f27764c;

    private C7559c1() {
    }

    /* renamed from: c */
    public static /* synthetic */ String m28982c(C7559c1 c7559c1, Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = context.getString(R$string.system_busy);
            AbstractC5868k.m23673e(str2, "context.getString(R.string.system_busy)");
        }
        return c7559c1.m28985b(context, str, str2);
    }

    /* renamed from: g */
    public static /* synthetic */ String m28983g(C7559c1 c7559c1, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return c7559c1.m28988f(str, str2, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        if (r19.equals("Canada") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:
    
        if (r2.length() < 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e6, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append('(');
        r4 = r2.substring(0, 3);
        ne.AbstractC5868k.m23673e(r4, "this as java.lang.String…ing(startIndex, endIndex)");
        r1.append(r4);
        r1.append(')');
        r4 = r2.substring(3);
        ne.AbstractC5868k.m23673e(r4, "this as java.lang.String).substring(startIndex)");
        r1.append(r4);
        r17.setText(r1.toString());
        r17.setSelection(r2.length() + 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011d, code lost:
    
        if (r2.length() >= 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011f, code lost:
    
        r17.setText(r2);
        r17.setSelection(r2.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r19.equals("Brazil") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (r2.length() < 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        r1 = new java.lang.StringBuilder();
        r4 = r2.substring(0, 2);
        ne.AbstractC5868k.m23673e(r4, "this as java.lang.String…ing(startIndex, endIndex)");
        r1.append(r4);
        r1.append(' ');
        r4 = r2.substring(2);
        ne.AbstractC5868k.m23673e(r4, "this as java.lang.String).substring(startIndex)");
        r1.append(r4);
        r17.setText(r1.toString());
        r17.setSelection(r2.length() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (r2.length() >= 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        r17.setText(r2);
        r17.setSelection(r2.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r19.equals("55") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (r19.equals("1") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (r19.equals("United States of America") == false) goto L40;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28984a(android.widget.EditText r17, android.text.TextWatcher r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p400xa.C7559c1.m28984a(android.widget.EditText, android.text.TextWatcher, java.lang.String):void");
    }

    /* renamed from: b */
    public final String m28985b(Context context, String str, String str2) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        AbstractC5868k.m23674f(str2, "defaultMsg");
        switch (str.hashCode()) {
            case -582900128:
                if (!str.equals("paycore100060")) {
                    return str2;
                }
                String string = context.getString(R$string.frequent_operation_notice);
                AbstractC5868k.m23673e(string, "context.getString(R.stri…requent_operation_notice)");
                return string;
            case -396102967:
                if (str.equals("portal100064")) {
                    String string2 = context.getString(R$string.phone_sms_system_maintenance);
                    AbstractC5868k.m23673e(string2, "context.getString(R.stri…e_sms_system_maintenance)");
                    return string2;
                }
                return str2;
            case -396102966:
                if (str.equals("portal100065")) {
                    String string3 = context.getString(R$string.phone_sms_limited);
                    AbstractC5868k.m23673e(string3, "context.getString(R.string.phone_sms_limited)");
                    return string3;
                }
                return str2;
            case -396102965:
                if (!str.equals("portal100066")) {
                    return str2;
                }
                break;
            case -396102964:
                if (str.equals("portal100067")) {
                    String string4 = context.getString(R$string.phone_number_not_exitst);
                    AbstractC5868k.m23673e(string4, "context.getString(R.stri….phone_number_not_exitst)");
                    return string4;
                }
                return str2;
            case -396102963:
                if (str.equals("portal100068")) {
                    String string5 = context.getString(R$string.phone_sms_already_send);
                    AbstractC5868k.m23673e(string5, "context.getString(R.string.phone_sms_already_send)");
                    return string5;
                }
                return str2;
            case -396102940:
                if (!str.equals("portal100070")) {
                    return str2;
                }
                String string6 = context.getString(R$string.frequent_operation_notice);
                AbstractC5868k.m23673e(string6, "context.getString(R.stri…requent_operation_notice)");
                return string6;
            case -396102938:
                if (!str.equals("portal100072")) {
                    return str2;
                }
                break;
            case -396102936:
                if (str.equals("portal100074")) {
                    String string7 = context.getString(R$string.access_failed);
                    AbstractC5868k.m23673e(string7, "context.getString(R.string.access_failed)");
                    return string7;
                }
                return str2;
            case -396102931:
                if (str.equals("portal100079")) {
                    String string8 = context.getString(R$string.phone_number_not_exitst);
                    AbstractC5868k.m23673e(string8, "context.getString(R.stri….phone_number_not_exitst)");
                    return string8;
                }
                return str2;
            case -338366941:
                if (str.equals("aaa100003")) {
                    String string9 = context.getString(R$string.phone_number_not_exitst);
                    AbstractC5868k.m23673e(string9, "context.getString(R.stri….phone_number_not_exitst)");
                    return string9;
                }
                return str2;
            case -338366911:
                if (str.equals("aaa100012")) {
                    String string10 = context.getString(R$string.change_bind_incorrect_password);
                    AbstractC5868k.m23673e(string10, "context.getString(R.stri…_bind_incorrect_password)");
                    return string10;
                }
                return str2;
            case -338366875:
                if (str.equals("aaa100027")) {
                    String string11 = context.getString(R$string.access_failed);
                    AbstractC5868k.m23673e(string11, "context.getString(R.string.access_failed)");
                    return string11;
                }
                return str2;
            case -338366874:
                if (str.equals("aaa100028")) {
                    String string12 = context.getString(R$string.change_email_token_null);
                    AbstractC5868k.m23673e(string12, "context.getString(R.stri….change_email_token_null)");
                    return string12;
                }
                return str2;
            case -338366720:
                if (str.equals("aaa100077")) {
                    String string13 = context.getString(R$string.email_repeat_notice);
                    AbstractC5868k.m23673e(string13, "context.getString(R.string.email_repeat_notice)");
                    return string13;
                }
                return str2;
            case -338366696:
                if (str.equals("aaa100080")) {
                    String string14 = context.getString(R$string.account_login_token_invalid);
                    AbstractC5868k.m23673e(string14, "context.getString(R.stri…ount_login_token_invalid)");
                    return string14;
                }
                return str2;
            case -338366665:
                if (str.equals("aaa100090")) {
                    String string15 = context.getString(R$string.phone_already_bind);
                    AbstractC5868k.m23673e(string15, "context.getString(R.string.phone_already_bind)");
                    return string15;
                }
                return str2;
            default:
                return str2;
        }
        String string16 = context.getString(R$string.phone_verification_code_invalid);
        AbstractC5868k.m23673e(string16, "context.getString(R.stri…erification_code_invalid)");
        return string16;
    }

    /* renamed from: d */
    public final String m28986d(Context context, String str) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "areaCode");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (f27763b == null) {
            f27763b = context.getResources().getStringArray(R$array.nation);
        }
        if (f27764c == null) {
            f27764c = context.getResources().getStringArray(R$array.code);
        }
        String[] strArr = f27764c;
        AbstractC5868k.m23671c(strArr);
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                String[] strArr2 = f27764c;
                AbstractC5868k.m23671c(strArr2);
                if (TextUtils.equals(strArr2[i10], str)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return "";
        }
        String[] strArr3 = f27763b;
        AbstractC5868k.m23671c(strArr3);
        if (i10 >= strArr3.length) {
            return "";
        }
        String[] strArr4 = f27763b;
        AbstractC5868k.m23671c(strArr4);
        return strArr4[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (r14.equals("Canada") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        if (r13.length() > 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r14.equals("Brazil") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r13.length() > 3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r14.equals("55") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r14.equals("1") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r14.equals("United States of America") == false) goto L34;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m28987e(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "phoneStr"
            ne.AbstractC5868k.m23674f(r13, r0)
            java.lang.String r0 = "country"
            ne.AbstractC5868k.m23674f(r14, r0)
            java.lang.CharSequence r13 = p359ue.AbstractC7157k.m27699b0(r13)
            java.lang.String r0 = r13.toString()
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r6 = p359ue.AbstractC7157k.m27708o(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = "("
            java.lang.String r8 = ""
            r9 = 0
            r10 = 4
            r11 = 0
            java.lang.String r0 = p359ue.AbstractC7157k.m27708o(r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = ")"
            java.lang.String r2 = ""
            java.lang.String r13 = p359ue.AbstractC7157k.m27708o(r0, r1, r2, r3, r4, r5)
            int r0 = r14.hashCode()
            r1 = -771733562(0xffffffffd20047c6, float:-1.37739993E11)
            java.lang.String r2 = ""
            if (r0 == r1) goto L7a
            r1 = 49
            if (r0 == r1) goto L71
            r1 = 1696(0x6a0, float:2.377E-42)
            if (r0 == r1) goto L60
            r1 = 1997815692(0x77143f8c, float:3.0068313E33)
            if (r0 == r1) goto L57
            r1 = 2011108078(0x77df12ee, float:9.048954E33)
            if (r0 == r1) goto L4e
            goto L8b
        L4e:
            java.lang.String r0 = "Canada"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L83
            goto L8b
        L57:
            java.lang.String r0 = "Brazil"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L69
            goto L8b
        L60:
            java.lang.String r0 = "55"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L69
            goto L8b
        L69:
            int r14 = r13.length()
            r0 = 3
            if (r14 > r0) goto L8b
            return r2
        L71:
            java.lang.String r0 = "1"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L83
            goto L8b
        L7a:
            java.lang.String r0 = "United States of America"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L83
            goto L8b
        L83:
            int r14 = r13.length()
            r0 = 5
            if (r14 > r0) goto L8b
            return r2
        L8b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p400xa.C7559c1.m28987e(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public final String m28988f(String str, String str2, boolean z10) {
        boolean z11;
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        sb2.append(Operator.Operation.PLUS);
                    } else {
                        sb2.append("+0");
                    }
                } else {
                    sb2.append("+00");
                }
            } else {
                sb2.append("+000");
            }
            sb2.append(str2 + ' ');
        }
        if (!TextUtils.isEmpty(str)) {
            int length2 = str.length() - 3;
            int i10 = 0;
            int i11 = 0;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                int i12 = i11 + 1;
                int i13 = length2 - 3;
                if (i11 <= length2 - 1 && i13 <= i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && z10) {
                    sb2.append(Operator.Operation.MULTIPLY);
                } else {
                    sb2.append(charAt);
                }
                i10++;
                i11 = i12;
            }
        }
        String sb3 = sb2.toString();
        AbstractC5868k.m23673e(sb3, "phoneShow.toString()");
        return sb3;
    }

    /* renamed from: h */
    public final String m28989h(String str, String str2) {
        String m27728o;
        String m27728o2;
        String m27728o3;
        AbstractC5868k.m23674f(str, "phoneNumber");
        AbstractC5868k.m23674f(str2, C3325bt.f14170O);
        m27728o = AbstractC7166t.m27728o(str, " ", "", false, 4, null);
        m27728o2 = AbstractC7166t.m27728o(m27728o, "(", "", false, 4, null);
        m27728o3 = AbstractC7166t.m27728o(m27728o2, ")", "", false, 4, null);
        int hashCode = str2.hashCode();
        if (hashCode != -771733562) {
            if (hashCode != 49) {
                if (hashCode != 1696) {
                    if (hashCode != 1997815692) {
                        if (hashCode != 2011108078 || !str2.equals("Canada")) {
                            return m27728o3;
                        }
                    } else if (!str2.equals("Brazil")) {
                        return m27728o3;
                    }
                } else if (!str2.equals("55")) {
                    return m27728o3;
                }
                if (m27728o3.length() >= 3) {
                    StringBuilder sb2 = new StringBuilder();
                    String substring = m27728o3.substring(0, 2);
                    AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring);
                    sb2.append(' ');
                    String substring2 = m27728o3.substring(2);
                    AbstractC5868k.m23673e(substring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring2);
                    return sb2.toString();
                }
                return m27728o3;
            }
            if (!str2.equals("1")) {
                return m27728o3;
            }
        } else if (!str2.equals("United States of America")) {
            return m27728o3;
        }
        if (m27728o3.length() >= 4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('(');
            String substring3 = m27728o3.substring(0, 3);
            AbstractC5868k.m23673e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            sb3.append(substring3);
            sb3.append(')');
            String substring4 = m27728o3.substring(3);
            AbstractC5868k.m23673e(substring4, "this as java.lang.String).substring(startIndex)");
            sb3.append(substring4);
            return sb3.toString();
        }
        return m27728o3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        if (r15.equals("Canada") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
    
        if (r0.length() < 4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
    
        r15 = new java.lang.StringBuilder();
        r15.append('(');
        r1 = r0.substring(0, 3);
        ne.AbstractC5868k.m23673e(r1, "this as java.lang.String…ing(startIndex, endIndex)");
        r15.append(r1);
        r15.append(')');
        r0 = r0.substring(3);
        ne.AbstractC5868k.m23673e(r0, "this as java.lang.String).substring(startIndex)");
        r15.append(r0);
        r0 = r15.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r15.equals("Brazil") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r0.length() < 3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r15 = new java.lang.StringBuilder();
        r2 = r0.substring(0, 2);
        ne.AbstractC5868k.m23673e(r2, "this as java.lang.String…ing(startIndex, endIndex)");
        r15.append(r2);
        r15.append(' ');
        r0 = r0.substring(2);
        ne.AbstractC5868k.m23673e(r0, "this as java.lang.String).substring(startIndex)");
        r15.append(r0);
        r0 = r15.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r15.equals("55") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r15.equals("1") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r15.equals("United States of America") == false) goto L34;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28990i(android.widget.EditText r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "phoneEt"
            ne.AbstractC5868k.m23674f(r14, r0)
            java.lang.String r0 = "country"
            ne.AbstractC5868k.m23674f(r15, r0)
            android.text.Editable r0 = r14.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = p359ue.AbstractC7157k.m27699b0(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = " "
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r7 = p359ue.AbstractC7157k.m27708o(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "("
            java.lang.String r9 = ""
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r0 = p359ue.AbstractC7157k.m27708o(r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = ")"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r0 = p359ue.AbstractC7157k.m27708o(r0, r1, r2, r3, r4, r5)
            int r1 = r15.hashCode()
            r2 = -771733562(0xffffffffd20047c6, float:-1.37739993E11)
            java.lang.String r3 = "this as java.lang.String).substring(startIndex)"
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            r5 = 0
            r6 = 3
            if (r1 == r2) goto Lad
            r2 = 49
            if (r1 == r2) goto La4
            r2 = 1696(0x6a0, float:2.377E-42)
            if (r1 == r2) goto L71
            r2 = 1997815692(0x77143f8c, float:3.0068313E33)
            if (r1 == r2) goto L68
            r2 = 2011108078(0x77df12ee, float:9.048954E33)
            if (r1 == r2) goto L5e
            goto Le4
        L5e:
            java.lang.String r1 = "Canada"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto Lb6
            goto Le4
        L68:
            java.lang.String r1 = "Brazil"
            boolean r15 = r15.equals(r1)
            if (r15 == 0) goto Le4
            goto L7a
        L71:
            java.lang.String r1 = "55"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto L7a
            goto Le4
        L7a:
            int r15 = r0.length()
            if (r15 < r6) goto Le4
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r1 = 2
            java.lang.String r2 = r0.substring(r5, r1)
            ne.AbstractC5868k.m23673e(r2, r4)
            r15.append(r2)
            r2 = 32
            r15.append(r2)
            java.lang.String r0 = r0.substring(r1)
            ne.AbstractC5868k.m23673e(r0, r3)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            goto Le4
        La4:
            java.lang.String r1 = "1"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto Lb6
            goto Le4
        Lad:
            java.lang.String r1 = "United States of America"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto Lb6
            goto Le4
        Lb6:
            int r15 = r0.length()
            r1 = 4
            if (r15 < r1) goto Le4
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r1 = 40
            r15.append(r1)
            java.lang.String r1 = r0.substring(r5, r6)
            ne.AbstractC5868k.m23673e(r1, r4)
            r15.append(r1)
            r1 = 41
            r15.append(r1)
            java.lang.String r0 = r0.substring(r6)
            ne.AbstractC5868k.m23673e(r0, r3)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
        Le4:
            r14.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p400xa.C7559c1.m28990i(android.widget.EditText, java.lang.String):void");
    }

    /* renamed from: j */
    public final boolean m28991j(String str, String str2) {
        boolean m23669a;
        AbstractC5868k.m23674f(str, "mobile");
        AbstractC5868k.m23674f(str2, "nation");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str)) {
            if (AbstractC5868k.m23669a(str2, "China")) {
                m23669a = true;
            } else {
                m23669a = AbstractC5868k.m23669a(str2, "86");
            }
            if (m23669a) {
                if (str.length() == 11) {
                    return Pattern.compile("^1[3|4|5|6|7|8|9][0-9]\\d{8}$").matcher(str).matches();
                }
            } else if (str.length() >= 6 && str.length() <= 17) {
                return true;
            }
        }
        return false;
    }
}
