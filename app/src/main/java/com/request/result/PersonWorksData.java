package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PersonWorksData {
    private List<PersonWorksInfo> itemList;
    private int totalSize;
    private String version;

    public PersonWorksData(String str, int i10, List<PersonWorksInfo> list) {
        this.version = str;
        this.totalSize = i10;
        this.itemList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonWorksData copy$default(PersonWorksData personWorksData, String str, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = personWorksData.version;
        }
        if ((i11 & 2) != 0) {
            i10 = personWorksData.totalSize;
        }
        if ((i11 & 4) != 0) {
            list = personWorksData.itemList;
        }
        return personWorksData.copy(str, i10, list);
    }

    public final String component1() {
        return this.version;
    }

    public final int component2() {
        return this.totalSize;
    }

    public final List<PersonWorksInfo> component3() {
        return this.itemList;
    }

    public final PersonWorksData copy(String str, int i10, List<PersonWorksInfo> list) {
        return new PersonWorksData(str, i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonWorksData)) {
            return false;
        }
        PersonWorksData personWorksData = (PersonWorksData) obj;
        return AbstractC5868k.m23669a(this.version, personWorksData.version) && this.totalSize == personWorksData.totalSize && AbstractC5868k.m23669a(this.itemList, personWorksData.itemList);
    }

    public final List<PersonWorksInfo> getItemList() {
        return this.itemList;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.totalSize) * 31;
        List<PersonWorksInfo> list = this.itemList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setItemList(List<PersonWorksInfo> list) {
        this.itemList = list;
    }

    public final void setTotalSize(int i10) {
        this.totalSize = i10;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "PersonWorksData(version=" + this.version + ", totalSize=" + this.totalSize + ", itemList=" + this.itemList + ')';
    }
}
