package com.request.result;

import com.lzy.okgo.model.Progress;
import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class UrlListBeanResult implements Serializable {
    private String tag;
    private String url;

    public UrlListBeanResult(String str, String str2) {
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(str2, "url");
        this.tag = str;
        this.url = str2;
    }

    public static /* synthetic */ UrlListBeanResult copy$default(UrlListBeanResult urlListBeanResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = urlListBeanResult.tag;
        }
        if ((i10 & 2) != 0) {
            str2 = urlListBeanResult.url;
        }
        return urlListBeanResult.copy(str, str2);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.url;
    }

    public final UrlListBeanResult copy(String str, String str2) {
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(str2, "url");
        return new UrlListBeanResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlListBeanResult)) {
            return false;
        }
        UrlListBeanResult urlListBeanResult = (UrlListBeanResult) obj;
        return AbstractC5868k.m23669a(this.tag, urlListBeanResult.tag) && AbstractC5868k.m23669a(this.url, urlListBeanResult.url);
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.url.hashCode();
    }

    public final void setTag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.tag = str;
    }

    public final void setUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "UrlListBeanResult(tag=" + this.tag + ", url=" + this.url + ')';
    }
}
