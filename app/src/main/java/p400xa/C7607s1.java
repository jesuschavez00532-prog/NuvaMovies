package p400xa;

import com.lzy.okgo.cookie.SerializableCookie;
import com.module.bean.SeriesSeasonBean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ne.AbstractC5868k;
import p153h2.AbstractC4509b;
import p359ue.AbstractC7166t;

/* renamed from: xa.s1 */
/* loaded from: classes2.dex */
public final class C7607s1 {

    /* renamed from: a */
    private final String f27976a = "S[0-9]{1,3}";

    /* renamed from: b */
    private final String f27977b = "Temp.[0-9]{1,3}";

    /* renamed from: c */
    private final String f27978c = "Temp.\\s[0-9]{1,3}";

    /* renamed from: d */
    private final String f27979d = "T[0-9]{1,3}";

    /* renamed from: a */
    public final SeriesSeasonBean m29251a(String str) {
        String str2 = null;
        boolean m27722i;
        String substring = null;
        boolean m27722i2;
        boolean m27722i3;
        String str3 = null;
        boolean m27722i4;
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        Matcher matcher = Pattern.compile(this.f27976a).matcher(str);
        Matcher matcher2 = Pattern.compile(this.f27977b).matcher(str);
        Matcher matcher3 = Pattern.compile(this.f27978c).matcher(str);
        Matcher matcher4 = Pattern.compile(this.f27979d).matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(0).toString();
            m27722i4 = AbstractC7166t.m27722i(str, str2, false, 2, null);
            if (m27722i4) {
                substring = str.substring(0, str.length() - str2.length());
                AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            substring = str;
        } else if (matcher2.find()) {
            str2 = matcher2.group(0).toString();
            m27722i3 = AbstractC7166t.m27722i(str, str2, false, 2, null);
            if (m27722i3) {
                substring = str.substring(0, str.length() - str2.length());
                AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            substring = str;
        } else if (matcher3.find()) {
            str2 = matcher3.group(0).toString();
            m27722i2 = AbstractC7166t.m27722i(str, str2, false, 2, null);
            if (m27722i2) {
                substring = str.substring(0, str.length() - str2.length());
                AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            substring = str;
        } else {
            if (matcher4.find()) {
                str2 = matcher4.group(0).toString();
                m27722i = AbstractC7166t.m27722i(str, str2, false, 2, null);
                if (m27722i) {
                    substring = str.substring(0, str.length() - str2.length());
                    AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            } else {
                str2 = "";
            }
            substring = str;
        }
        Matcher matcher5 = Pattern.compile("[0-9]{1,3}").matcher(str2);
        if (matcher5.find()) {
            str3 = matcher5.group(0).toString();
        } else {
            str3 = "1";
        }
        AbstractC4509b.m18869b("VodNameUtil", "name:" + str + " -- season=" + str3, new Object[0]);
        return new SeriesSeasonBean(substring, str3);
    }
}
