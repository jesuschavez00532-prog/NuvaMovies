package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PortalCodeList implements Serializable {
    private String portalCode;
    private String type;

    public PortalCodeList(String str, String str2) {
        this.portalCode = str;
        this.type = str2;
    }

    public static /* synthetic */ PortalCodeList copy$default(PortalCodeList portalCodeList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = portalCodeList.portalCode;
        }
        if ((i10 & 2) != 0) {
            str2 = portalCodeList.type;
        }
        return portalCodeList.copy(str, str2);
    }

    public final String component1() {
        return this.portalCode;
    }

    public final String component2() {
        return this.type;
    }

    public final PortalCodeList copy(String str, String str2) {
        return new PortalCodeList(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortalCodeList)) {
            return false;
        }
        PortalCodeList portalCodeList = (PortalCodeList) obj;
        return AbstractC5868k.m23669a(this.portalCode, portalCodeList.portalCode) && AbstractC5868k.m23669a(this.type, portalCodeList.type);
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.portalCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPortalCode(String str) {
        this.portalCode = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "PortalCodeList(portalCode=" + this.portalCode + ", type=" + this.type + ')';
    }
}
