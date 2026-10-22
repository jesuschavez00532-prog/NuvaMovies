package com.request.result;

import anet.channel.entity.EventType;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SimpleProgramList {
    private String contentId;
    private String duration;
    private float fraction;
    private String hasPositive;
    private String hasTidbits;
    private String hasTrailer;
    private boolean isDownloaded;
    private boolean isDownloading;
    private boolean isSelected;
    private String name;
    private List<PosterList> posterList;
    private String quality;
    private int seriesNumber;
    private String viewPoint;

    public SimpleProgramList(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, float f10, boolean z10, boolean z11, boolean z12, List<PosterList> list) {
        this.contentId = str;
        this.name = str2;
        this.duration = str3;
        this.hasPositive = str4;
        this.hasTidbits = str5;
        this.hasTrailer = str6;
        this.seriesNumber = i10;
        this.quality = str7;
        this.viewPoint = str8;
        this.fraction = f10;
        this.isDownloading = z10;
        this.isDownloaded = z11;
        this.isSelected = z12;
        this.posterList = list;
    }

    public final String component1() {
        return this.contentId;
    }

    public final float component10() {
        return this.fraction;
    }

    public final boolean component11() {
        return this.isDownloading;
    }

    public final boolean component12() {
        return this.isDownloaded;
    }

    public final boolean component13() {
        return this.isSelected;
    }

    public final List<PosterList> component14() {
        return this.posterList;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.duration;
    }

    public final String component4() {
        return this.hasPositive;
    }

    public final String component5() {
        return this.hasTidbits;
    }

    public final String component6() {
        return this.hasTrailer;
    }

    public final int component7() {
        return this.seriesNumber;
    }

    public final String component8() {
        return this.quality;
    }

    public final String component9() {
        return this.viewPoint;
    }

    public final SimpleProgramList copy(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, float f10, boolean z10, boolean z11, boolean z12, List<PosterList> list) {
        return new SimpleProgramList(str, str2, str3, str4, str5, str6, i10, str7, str8, f10, z10, z11, z12, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleProgramList)) {
            return false;
        }
        SimpleProgramList simpleProgramList = (SimpleProgramList) obj;
        return AbstractC5868k.m23669a(this.contentId, simpleProgramList.contentId) && AbstractC5868k.m23669a(this.name, simpleProgramList.name) && AbstractC5868k.m23669a(this.duration, simpleProgramList.duration) && AbstractC5868k.m23669a(this.hasPositive, simpleProgramList.hasPositive) && AbstractC5868k.m23669a(this.hasTidbits, simpleProgramList.hasTidbits) && AbstractC5868k.m23669a(this.hasTrailer, simpleProgramList.hasTrailer) && this.seriesNumber == simpleProgramList.seriesNumber && AbstractC5868k.m23669a(this.quality, simpleProgramList.quality) && AbstractC5868k.m23669a(this.viewPoint, simpleProgramList.viewPoint) && Float.compare(this.fraction, simpleProgramList.fraction) == 0 && this.isDownloading == simpleProgramList.isDownloading && this.isDownloaded == simpleProgramList.isDownloaded && this.isSelected == simpleProgramList.isSelected && AbstractC5868k.m23669a(this.posterList, simpleProgramList.posterList);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final String getHasPositive() {
        return this.hasPositive;
    }

    public final String getHasTidbits() {
        return this.hasTidbits;
    }

    public final String getHasTrailer() {
        return this.hasTrailer;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PosterList> getPosterList() {
        return this.posterList;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final int getSeriesNumber() {
        return this.seriesNumber;
    }

    public final String getViewPoint() {
        return this.viewPoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.contentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.duration;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hasPositive;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hasTidbits;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hasTrailer;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.seriesNumber) * 31;
        String str7 = this.quality;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.viewPoint;
        int hashCode8 = (((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Float.floatToIntBits(this.fraction)) * 31;
        boolean z10 = this.isDownloading;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode8 + i10) * 31;
        boolean z11 = this.isDownloaded;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.isSelected;
        int i14 = (i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31;
        List<PosterList> list = this.posterList;
        return i14 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isDownloaded() {
        return this.isDownloaded;
    }

    public final boolean isDownloading() {
        return this.isDownloading;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    public final void setDownloaded(boolean z10) {
        this.isDownloaded = z10;
    }

    public final void setDownloading(boolean z10) {
        this.isDownloading = z10;
    }

    public final void setDuration(String str) {
        this.duration = str;
    }

    public final void setFraction(float f10) {
        this.fraction = f10;
    }

    public final void setHasPositive(String str) {
        this.hasPositive = str;
    }

    public final void setHasTidbits(String str) {
        this.hasTidbits = str;
    }

    public final void setHasTrailer(String str) {
        this.hasTrailer = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPosterList(List<PosterList> list) {
        this.posterList = list;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public final void setSeriesNumber(int i10) {
        this.seriesNumber = i10;
    }

    public final void setViewPoint(String str) {
        this.viewPoint = str;
    }

    public String toString() {
        return "SimpleProgramList(contentId=" + this.contentId + ", name=" + this.name + ", duration=" + this.duration + ", hasPositive=" + this.hasPositive + ", hasTidbits=" + this.hasTidbits + ", hasTrailer=" + this.hasTrailer + ", seriesNumber=" + this.seriesNumber + ", quality=" + this.quality + ", viewPoint=" + this.viewPoint + ", fraction=" + this.fraction + ", isDownloading=" + this.isDownloading + ", isDownloaded=" + this.isDownloaded + ", isSelected=" + this.isSelected + ", posterList=" + this.posterList + ')';
    }

    public /* synthetic */ SimpleProgramList(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, float f10, boolean z10, boolean z11, boolean z12, List list, int i11, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, str4, str5, str6, i10, str7, str8, f10, (i11 & EventType.AUTH_FAIL) != 0 ? false : z10, (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? false : z12, list);
    }
}
