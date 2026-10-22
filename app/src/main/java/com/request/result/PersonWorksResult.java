package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PersonWorksResult {
    private PersonWorksData data;
    private String errorMessage;
    private String returnCode;

    public PersonWorksResult(String str, String str2, PersonWorksData personWorksData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = personWorksData;
    }

    public static /* synthetic */ PersonWorksResult copy$default(PersonWorksResult personWorksResult, String str, String str2, PersonWorksData personWorksData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = personWorksResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = personWorksResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            personWorksData = personWorksResult.data;
        }
        return personWorksResult.copy(str, str2, personWorksData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final PersonWorksData component3() {
        return this.data;
    }

    public final PersonWorksResult copy(String str, String str2, PersonWorksData personWorksData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new PersonWorksResult(str, str2, personWorksData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonWorksResult)) {
            return false;
        }
        PersonWorksResult personWorksResult = (PersonWorksResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, personWorksResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, personWorksResult.errorMessage) && AbstractC5868k.m23669a(this.data, personWorksResult.data);
    }

    public final PersonWorksData getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        int hashCode = this.returnCode.hashCode() * 31;
        String str = this.errorMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PersonWorksData personWorksData = this.data;
        return hashCode2 + (personWorksData != null ? personWorksData.hashCode() : 0);
    }

    public final void setData(PersonWorksData personWorksData) {
        this.data = personWorksData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "PersonWorksResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
