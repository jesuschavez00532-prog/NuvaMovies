package com.download.bean;

import com.lzy.okgo.cookie.SerializableCookie;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class UDiskBean {
    private String name;
    private String path;

    public UDiskBean(String str, String str2) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str2, "path");
        this.name = str;
        this.path = str2;
    }

    public static /* synthetic */ UDiskBean copy$default(UDiskBean uDiskBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uDiskBean.name;
        }
        if ((i10 & 2) != 0) {
            str2 = uDiskBean.path;
        }
        return uDiskBean.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.path;
    }

    public final UDiskBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str2, "path");
        return new UDiskBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UDiskBean)) {
            return false;
        }
        UDiskBean uDiskBean = (UDiskBean) obj;
        return AbstractC5868k.m23669a(this.name, uDiskBean.name) && AbstractC5868k.m23669a(this.path, uDiskBean.path);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.path.hashCode();
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setPath(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.path = str;
    }

    public String toString() {
        return "UDiskBean(name=" + this.name + ", path=" + this.path + ')';
    }
}
