package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ConfigBean {
    private String groupName;
    private String moduleName;

    public ConfigBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "moduleName");
        AbstractC5868k.m23674f(str2, "groupName");
        this.moduleName = str;
        this.groupName = str2;
    }

    public static /* synthetic */ ConfigBean copy$default(ConfigBean configBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = configBean.moduleName;
        }
        if ((i10 & 2) != 0) {
            str2 = configBean.groupName;
        }
        return configBean.copy(str, str2);
    }

    public final String component1() {
        return this.moduleName;
    }

    public final String component2() {
        return this.groupName;
    }

    public final ConfigBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "moduleName");
        AbstractC5868k.m23674f(str2, "groupName");
        return new ConfigBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigBean)) {
            return false;
        }
        ConfigBean configBean = (ConfigBean) obj;
        return AbstractC5868k.m23669a(this.moduleName, configBean.moduleName) && AbstractC5868k.m23669a(this.groupName, configBean.groupName);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public int hashCode() {
        return (this.moduleName.hashCode() * 31) + this.groupName.hashCode();
    }

    public final void setGroupName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.groupName = str;
    }

    public final void setModuleName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.moduleName = str;
    }

    public String toString() {
        return "ConfigBean(moduleName=" + this.moduleName + ", groupName=" + this.groupName + ')';
    }
}
