package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class TotalMovieListItem {
    private List<MovieList> movieList;
    private String quality;

    public TotalMovieListItem(String str, List<MovieList> list) {
        this.quality = str;
        this.movieList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TotalMovieListItem copy$default(TotalMovieListItem totalMovieListItem, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = totalMovieListItem.quality;
        }
        if ((i10 & 2) != 0) {
            list = totalMovieListItem.movieList;
        }
        return totalMovieListItem.copy(str, list);
    }

    public final String component1() {
        return this.quality;
    }

    public final List<MovieList> component2() {
        return this.movieList;
    }

    public final TotalMovieListItem copy(String str, List<MovieList> list) {
        return new TotalMovieListItem(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalMovieListItem)) {
            return false;
        }
        TotalMovieListItem totalMovieListItem = (TotalMovieListItem) obj;
        return AbstractC5868k.m23669a(this.quality, totalMovieListItem.quality) && AbstractC5868k.m23669a(this.movieList, totalMovieListItem.movieList);
    }

    public final List<MovieList> getMovieList() {
        return this.movieList;
    }

    public final String getQuality() {
        return this.quality;
    }

    public int hashCode() {
        String str = this.quality;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MovieList> list = this.movieList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setMovieList(List<MovieList> list) {
        this.movieList = list;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public String toString() {
        return "TotalMovieListItem(quality=" + this.quality + ", movieList=" + this.movieList + ')';
    }
}
