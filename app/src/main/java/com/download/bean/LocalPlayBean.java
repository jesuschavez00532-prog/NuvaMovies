package com.download.bean;

import com.lzy.okgo.cookie.SerializableCookie;
import ne.AbstractC5868k;
import p142g3.RunnableC4341c;

/* loaded from: classes.dex */
public final class LocalPlayBean {
    private RunnableC4341c downloadTask;
    private String name;
    private String path;
    private String size;

    public LocalPlayBean(String str, String str2, String str3, RunnableC4341c runnableC4341c) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str2, "path");
        AbstractC5868k.m23674f(str3, "size");
        this.name = str;
        this.path = str2;
        this.size = str3;
        this.downloadTask = runnableC4341c;
    }

    public static /* synthetic */ LocalPlayBean copy$default(LocalPlayBean localPlayBean, String str, String str2, String str3, RunnableC4341c runnableC4341c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localPlayBean.name;
        }
        if ((i10 & 2) != 0) {
            str2 = localPlayBean.path;
        }
        if ((i10 & 4) != 0) {
            str3 = localPlayBean.size;
        }
        if ((i10 & 8) != 0) {
            runnableC4341c = localPlayBean.downloadTask;
        }
        return localPlayBean.copy(str, str2, str3, runnableC4341c);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.path;
    }

    public final String component3() {
        return this.size;
    }

    public final RunnableC4341c component4() {
        return this.downloadTask;
    }

    public final LocalPlayBean copy(String str, String str2, String str3, RunnableC4341c runnableC4341c) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str2, "path");
        AbstractC5868k.m23674f(str3, "size");
        return new LocalPlayBean(str, str2, str3, runnableC4341c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalPlayBean)) {
            return false;
        }
        LocalPlayBean localPlayBean = (LocalPlayBean) obj;
        return AbstractC5868k.m23669a(this.name, localPlayBean.name) && AbstractC5868k.m23669a(this.path, localPlayBean.path) && AbstractC5868k.m23669a(this.size, localPlayBean.size) && AbstractC5868k.m23669a(this.downloadTask, localPlayBean.downloadTask);
    }

    public final RunnableC4341c getDownloadTask() {
        return this.downloadTask;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = ((((this.name.hashCode() * 31) + this.path.hashCode()) * 31) + this.size.hashCode()) * 31;
        RunnableC4341c runnableC4341c = this.downloadTask;
        return hashCode + (runnableC4341c == null ? 0 : runnableC4341c.hashCode());
    }

    public final void setDownloadTask(RunnableC4341c runnableC4341c) {
        this.downloadTask = runnableC4341c;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setPath(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.path = str;
    }

    public final void setSize(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.size = str;
    }

    public String toString() {
        return "LocalPlayBean(name=" + this.name + ", path=" + this.path + ", size=" + this.size + ", downloadTask=" + this.downloadTask + ')';
    }
}
