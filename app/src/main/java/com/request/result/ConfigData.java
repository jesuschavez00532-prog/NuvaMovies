package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ConfigData {
    private String config;

    public ConfigData(String str) {
        this.config = str;
    }

    public static /* synthetic */ ConfigData copy$default(ConfigData configData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = configData.config;
        }
        return configData.copy(str);
    }

    public final String component1() {
        return this.config;
    }

    public final ConfigData copy(String str) {
        return new ConfigData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfigData) && AbstractC5868k.m23669a(this.config, ((ConfigData) obj).config);
    }

    public final String getConfig() {
        return this.config;
    }

    public int hashCode() {
        String str = this.config;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setConfig(String str) {
        this.config = str;
    }

    public String toString() {
        return "ConfigData(config=" + this.config + ')';
    }
}
