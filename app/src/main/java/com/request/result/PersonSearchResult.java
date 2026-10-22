package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PersonSearchResult {
    private List<PersonDetailInfo> personList;
    private int totalSize;

    public PersonSearchResult(int i10, List<PersonDetailInfo> list) {
        this.totalSize = i10;
        this.personList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonSearchResult copy$default(PersonSearchResult personSearchResult, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = personSearchResult.totalSize;
        }
        if ((i11 & 2) != 0) {
            list = personSearchResult.personList;
        }
        return personSearchResult.copy(i10, list);
    }

    public final int component1() {
        return this.totalSize;
    }

    public final List<PersonDetailInfo> component2() {
        return this.personList;
    }

    public final PersonSearchResult copy(int i10, List<PersonDetailInfo> list) {
        return new PersonSearchResult(i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonSearchResult)) {
            return false;
        }
        PersonSearchResult personSearchResult = (PersonSearchResult) obj;
        return this.totalSize == personSearchResult.totalSize && AbstractC5868k.m23669a(this.personList, personSearchResult.personList);
    }

    public final List<PersonDetailInfo> getPersonList() {
        return this.personList;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int i10 = this.totalSize * 31;
        List<PersonDetailInfo> list = this.personList;
        return i10 + (list == null ? 0 : list.hashCode());
    }

    public final void setPersonList(List<PersonDetailInfo> list) {
        this.personList = list;
    }

    public final void setTotalSize(int i10) {
        this.totalSize = i10;
    }

    public String toString() {
        return "PersonSearchResult(totalSize=" + this.totalSize + ", personList=" + this.personList + ')';
    }
}
