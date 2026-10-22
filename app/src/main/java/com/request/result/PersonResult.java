package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PersonResult {
    private PersonData data;
    private String errorMessage;
    private String returnCode;

    public PersonResult(String str, String str2, PersonData personData) {
        AbstractC5868k.m23674f(str, "returnCode");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = personData;
    }

    public static /* synthetic */ PersonResult copy$default(PersonResult personResult, String str, String str2, PersonData personData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = personResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = personResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            personData = personResult.data;
        }
        return personResult.copy(str, str2, personData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final PersonData component3() {
        return this.data;
    }

    public final PersonResult copy(String str, String str2, PersonData personData) {
        AbstractC5868k.m23674f(str, "returnCode");
        return new PersonResult(str, str2, personData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonResult)) {
            return false;
        }
        PersonResult personResult = (PersonResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, personResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, personResult.errorMessage) && AbstractC5868k.m23669a(this.data, personResult.data);
    }

    public final PersonData getData() {
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
        PersonData personData = this.data;
        return hashCode2 + (personData != null ? personData.hashCode() : 0);
    }

    public final void setData(PersonData personData) {
        this.data = personData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "PersonResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
