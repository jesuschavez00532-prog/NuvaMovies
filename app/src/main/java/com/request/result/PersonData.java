package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PersonData {
    private List<PersonDetailInfo> actorDisplayList;
    private List<PersonDetailInfo> directorList;

    public PersonData(List<PersonDetailInfo> list, List<PersonDetailInfo> list2) {
        this.directorList = list;
        this.actorDisplayList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonData copy$default(PersonData personData, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = personData.directorList;
        }
        if ((i10 & 2) != 0) {
            list2 = personData.actorDisplayList;
        }
        return personData.copy(list, list2);
    }

    public final List<PersonDetailInfo> component1() {
        return this.directorList;
    }

    public final List<PersonDetailInfo> component2() {
        return this.actorDisplayList;
    }

    public final PersonData copy(List<PersonDetailInfo> list, List<PersonDetailInfo> list2) {
        return new PersonData(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonData)) {
            return false;
        }
        PersonData personData = (PersonData) obj;
        return AbstractC5868k.m23669a(this.directorList, personData.directorList) && AbstractC5868k.m23669a(this.actorDisplayList, personData.actorDisplayList);
    }

    public final List<PersonDetailInfo> getActorDisplayList() {
        return this.actorDisplayList;
    }

    public final List<PersonDetailInfo> getDirectorList() {
        return this.directorList;
    }

    public int hashCode() {
        List<PersonDetailInfo> list = this.directorList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PersonDetailInfo> list2 = this.actorDisplayList;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setActorDisplayList(List<PersonDetailInfo> list) {
        this.actorDisplayList = list;
    }

    public final void setDirectorList(List<PersonDetailInfo> list) {
        this.directorList = list;
    }

    public String toString() {
        return "PersonData(directorList=" + this.directorList + ", actorDisplayList=" + this.actorDisplayList + ')';
    }
}
