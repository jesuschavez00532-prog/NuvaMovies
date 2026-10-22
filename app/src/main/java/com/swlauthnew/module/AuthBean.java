package com.swlauthnew.module;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import p211kc.AbstractC5148c;

/* loaded from: classes.dex */
public class AuthBean {
    private String TAG = "AuthBean";
    private String dateFormat1 = "yyyy-MM-dd HH:mm:ss";
    private String dateFormat2 = "yyyy-MM-dd";
    private String exchange_date;
    private String offservice_date;
    private List<AuthInfo> product;
    private int status;

    public String getExchange_date() {
        Date m20815b;
        if (!TextUtils.isEmpty(this.exchange_date) && !AbstractC5148c.m20818e().equalsIgnoreCase("GMT+00:00") && !AbstractC5148c.m20818e().equalsIgnoreCase("UTC+00:00") && (m20815b = AbstractC5148c.m20815b(this.exchange_date, this.dateFormat1)) != null) {
            this.exchange_date = new SimpleDateFormat(this.dateFormat1).format(m20815b);
        }
        return this.exchange_date;
    }

    public String getOffservice_date() {
        Date m20815b;
        if (!TextUtils.isEmpty(this.offservice_date) && !AbstractC5148c.m20818e().equalsIgnoreCase("GMT+00:00") && !AbstractC5148c.m20818e().equalsIgnoreCase("UTC+00:00") && (m20815b = AbstractC5148c.m20815b(this.offservice_date, this.dateFormat2)) != null) {
            this.offservice_date = new SimpleDateFormat(this.dateFormat2).format(m20815b);
        }
        return this.offservice_date;
    }

    public List<AuthInfo> getProduct() {
        return this.product;
    }

    public int getStatus() {
        return this.status;
    }

    public void setExchange_date(String str) {
        this.exchange_date = str;
    }

    public void setOffservice_date(String str) {
        this.offservice_date = str;
    }

    public void setProduct(List<AuthInfo> list) {
        this.product = list;
    }

    public void setStatus(int i10) {
        this.status = i10;
    }
}
