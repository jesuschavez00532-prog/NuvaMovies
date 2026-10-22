package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SearchROrPData {
    private PersonSearchResult personResult;
    private ProgramSearchResult programResult;
    private ResourceSearchResult resourceResult;
    private SeriesSearchResult seriesResult;

    public SearchROrPData(ProgramSearchResult programSearchResult, SeriesSearchResult seriesSearchResult, PersonSearchResult personSearchResult, ResourceSearchResult resourceSearchResult) {
        this.programResult = programSearchResult;
        this.seriesResult = seriesSearchResult;
        this.personResult = personSearchResult;
        this.resourceResult = resourceSearchResult;
    }

    public static /* synthetic */ SearchROrPData copy$default(SearchROrPData searchROrPData, ProgramSearchResult programSearchResult, SeriesSearchResult seriesSearchResult, PersonSearchResult personSearchResult, ResourceSearchResult resourceSearchResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            programSearchResult = searchROrPData.programResult;
        }
        if ((i10 & 2) != 0) {
            seriesSearchResult = searchROrPData.seriesResult;
        }
        if ((i10 & 4) != 0) {
            personSearchResult = searchROrPData.personResult;
        }
        if ((i10 & 8) != 0) {
            resourceSearchResult = searchROrPData.resourceResult;
        }
        return searchROrPData.copy(programSearchResult, seriesSearchResult, personSearchResult, resourceSearchResult);
    }

    public final ProgramSearchResult component1() {
        return this.programResult;
    }

    public final SeriesSearchResult component2() {
        return this.seriesResult;
    }

    public final PersonSearchResult component3() {
        return this.personResult;
    }

    public final ResourceSearchResult component4() {
        return this.resourceResult;
    }

    public final SearchROrPData copy(ProgramSearchResult programSearchResult, SeriesSearchResult seriesSearchResult, PersonSearchResult personSearchResult, ResourceSearchResult resourceSearchResult) {
        return new SearchROrPData(programSearchResult, seriesSearchResult, personSearchResult, resourceSearchResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchROrPData)) {
            return false;
        }
        SearchROrPData searchROrPData = (SearchROrPData) obj;
        return AbstractC5868k.m23669a(this.programResult, searchROrPData.programResult) && AbstractC5868k.m23669a(this.seriesResult, searchROrPData.seriesResult) && AbstractC5868k.m23669a(this.personResult, searchROrPData.personResult) && AbstractC5868k.m23669a(this.resourceResult, searchROrPData.resourceResult);
    }

    public final PersonSearchResult getPersonResult() {
        return this.personResult;
    }

    public final ProgramSearchResult getProgramResult() {
        return this.programResult;
    }

    public final ResourceSearchResult getResourceResult() {
        return this.resourceResult;
    }

    public final SeriesSearchResult getSeriesResult() {
        return this.seriesResult;
    }

    public int hashCode() {
        ProgramSearchResult programSearchResult = this.programResult;
        int hashCode = (programSearchResult == null ? 0 : programSearchResult.hashCode()) * 31;
        SeriesSearchResult seriesSearchResult = this.seriesResult;
        int hashCode2 = (hashCode + (seriesSearchResult == null ? 0 : seriesSearchResult.hashCode())) * 31;
        PersonSearchResult personSearchResult = this.personResult;
        int hashCode3 = (hashCode2 + (personSearchResult == null ? 0 : personSearchResult.hashCode())) * 31;
        ResourceSearchResult resourceSearchResult = this.resourceResult;
        return hashCode3 + (resourceSearchResult != null ? resourceSearchResult.hashCode() : 0);
    }

    public final void setPersonResult(PersonSearchResult personSearchResult) {
        this.personResult = personSearchResult;
    }

    public final void setProgramResult(ProgramSearchResult programSearchResult) {
        this.programResult = programSearchResult;
    }

    public final void setResourceResult(ResourceSearchResult resourceSearchResult) {
        this.resourceResult = resourceSearchResult;
    }

    public final void setSeriesResult(SeriesSearchResult seriesSearchResult) {
        this.seriesResult = seriesSearchResult;
    }

    public String toString() {
        return "SearchROrPData(programResult=" + this.programResult + ", seriesResult=" + this.seriesResult + ", personResult=" + this.personResult + ", resourceResult=" + this.resourceResult + ')';
    }
}
