package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class StartPlayBTVResultLicenseList implements Serializable {
    private List<LicenseBTVData> licenseList;

    public StartPlayBTVResultLicenseList(List<LicenseBTVData> list) {
        this.licenseList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartPlayBTVResultLicenseList copy$default(StartPlayBTVResultLicenseList startPlayBTVResultLicenseList, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = startPlayBTVResultLicenseList.licenseList;
        }
        return startPlayBTVResultLicenseList.copy(list);
    }

    public final List<LicenseBTVData> component1() {
        return this.licenseList;
    }

    public final StartPlayBTVResultLicenseList copy(List<LicenseBTVData> list) {
        return new StartPlayBTVResultLicenseList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartPlayBTVResultLicenseList) && AbstractC5868k.m23669a(this.licenseList, ((StartPlayBTVResultLicenseList) obj).licenseList);
    }

    public final List<LicenseBTVData> getLicenseList() {
        return this.licenseList;
    }

    public int hashCode() {
        List<LicenseBTVData> list = this.licenseList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setLicenseList(List<LicenseBTVData> list) {
        this.licenseList = list;
    }

    public String toString() {
        return "StartPlayBTVResultLicenseList(licenseList=" + this.licenseList + ')';
    }
}
