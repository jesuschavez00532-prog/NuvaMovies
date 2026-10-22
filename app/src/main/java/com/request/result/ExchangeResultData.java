package com.request.result;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ne.AbstractC5868k;
import p153h2.AbstractC4509b;
import p201k2.AbstractC5086c;
import p201k2.AbstractC5091h;
import p359ue.AbstractC7157k;

/* loaded from: classes.dex */
public final class ExchangeResultData implements Serializable {
    private Integer assAuthDays;
    private List<AuthInfoList> authInfoList;
    private Integer authTime;
    private String codeInvalidTime;
    private String exchangeDate;
    private boolean isChangOffservice;
    private boolean isChangeExchange;
    private String offserviceDate;
    private Integer type;
    private String userName;
    private final String dateFormat1 = "yyyy-MM-dd HH:mm:ss";
    private final String dateFormat2 = "yyyy-MM-dd";
    private final SimpleDateFormat formatResult = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final String TAG = "ExchangeResultData";

    public ExchangeResultData(List<AuthInfoList> list, Integer num, Integer num2, String str, Integer num3) {
        this.authInfoList = list;
        this.type = num;
        this.authTime = num2;
        this.userName = str;
        this.assAuthDays = num3;
    }

    public static /* synthetic */ ExchangeResultData copy$default(ExchangeResultData exchangeResultData, List list, Integer num, Integer num2, String str, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = exchangeResultData.authInfoList;
        }
        if ((i10 & 2) != 0) {
            num = exchangeResultData.type;
        }
        Integer num4 = num;
        if ((i10 & 4) != 0) {
            num2 = exchangeResultData.authTime;
        }
        Integer num5 = num2;
        if ((i10 & 8) != 0) {
            str = exchangeResultData.userName;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            num3 = exchangeResultData.assAuthDays;
        }
        return exchangeResultData.copy(list, num4, num5, str2, num3);
    }

    private final String getDateFormatByLang() {
        if (AbstractC5091h.m20663f()) {
            return "HH:mm:ss dd-MM-yyyy";
        }
        return "HH:mm:ss MM-dd-yyyy";
    }

    public final List<AuthInfoList> component1() {
        return this.authInfoList;
    }

    public final Integer component2() {
        return this.type;
    }

    public final Integer component3() {
        return this.authTime;
    }

    public final String component4() {
        return this.userName;
    }

    public final Integer component5() {
        return this.assAuthDays;
    }

    public final ExchangeResultData copy(List<AuthInfoList> list, Integer num, Integer num2, String str, Integer num3) {
        return new ExchangeResultData(list, num, num2, str, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeResultData)) {
            return false;
        }
        ExchangeResultData exchangeResultData = (ExchangeResultData) obj;
        return AbstractC5868k.m23669a(this.authInfoList, exchangeResultData.authInfoList) && AbstractC5868k.m23669a(this.type, exchangeResultData.type) && AbstractC5868k.m23669a(this.authTime, exchangeResultData.authTime) && AbstractC5868k.m23669a(this.userName, exchangeResultData.userName) && AbstractC5868k.m23669a(this.assAuthDays, exchangeResultData.assAuthDays);
    }

    public final Integer getAssAuthDays() {
        return this.assAuthDays;
    }

    public final List<AuthInfoList> getAuthInfoList() {
        return this.authInfoList;
    }

    public final Integer getAuthTime() {
        return this.authTime;
    }

    public final String getCodeInvalidTime() {
        boolean z10;
        String str = this.codeInvalidTime;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && !this.isChangeExchange) {
                    this.isChangeExchange = true;
                    if (!AbstractC7157k.m27705j(AbstractC5086c.m20617j(), "GMT+00:00", true) && !AbstractC7157k.m27705j(AbstractC5086c.m20617j(), "UTC+00:00", true)) {
                        Date m20624q = AbstractC5086c.m20624q(this.formatResult.format(this.formatResult.parse(this.codeInvalidTime)), "GMT+0", this.dateFormat1);
                        if (m20624q != null) {
                            this.codeInvalidTime = new SimpleDateFormat(getDateFormatByLang()).format(m20624q);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return this.codeInvalidTime;
        }
        return null;
    }

    public final String getExchangeDate() {
        boolean z10;
        String str = this.exchangeDate;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && !this.isChangeExchange) {
                    this.isChangeExchange = true;
                    if (!AbstractC7157k.m27705j(AbstractC5086c.m20617j(), "GMT+00:00", true) && !AbstractC7157k.m27705j(AbstractC5086c.m20617j(), "UTC+00:00", true)) {
                        Date m20624q = AbstractC5086c.m20624q(this.formatResult.format(this.formatResult.parse(this.exchangeDate)), "GMT+0", this.dateFormat1);
                        if (m20624q != null) {
                            this.exchangeDate = new SimpleDateFormat(getDateFormatByLang()).format(m20624q);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return this.exchangeDate;
        }
        return null;
    }

    public final String getOffserviceDate() {
        boolean z10;
        Date m20624q;
        String str = this.offserviceDate;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && !this.isChangOffservice) {
                    this.isChangOffservice = true;
                    Date parse = this.formatResult.parse(this.offserviceDate);
                    AbstractC4509b.m18869b(this.TAG, "时区转换前offservice_date= " + this.offserviceDate, new Object[0]);
                    if (!AbstractC7157k.m27705j(AbstractC5086c.m20617j(), "GMT+00:00", true) && !AbstractC7157k.m27705j(AbstractC5086c.m20617j(), "UTC+00:00", true) && (m20624q = AbstractC5086c.m20624q(this.formatResult.format(parse), "GMT+0", this.dateFormat1)) != null) {
                        this.offserviceDate = new SimpleDateFormat(getDateFormatByLang()).format(m20624q);
                    }
                }
            } catch (Exception unused) {
            }
            return this.offserviceDate;
        }
        return null;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        List<AuthInfoList> list = this.authInfoList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.authTime;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.userName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.assAuthDays;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setAssAuthDays(Integer num) {
        this.assAuthDays = num;
    }

    public final void setAuthInfoList(List<AuthInfoList> list) {
        this.authInfoList = list;
    }

    public final void setAuthTime(Integer num) {
        this.authTime = num;
    }

    public final void setCodeInvalidTime(String str) {
        this.codeInvalidTime = str;
    }

    public final void setExchangeDate(String str) {
        this.exchangeDate = str;
    }

    public final void setOffserviceDate(String str) {
        this.offserviceDate = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "ExchangeResultData(authInfoList=" + this.authInfoList + ", type=" + this.type + ", authTime=" + this.authTime + ", userName=" + this.userName + ", assAuthDays=" + this.assAuthDays + ')';
    }
}
