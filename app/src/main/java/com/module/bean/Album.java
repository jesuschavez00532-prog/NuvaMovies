package com.module.bean;

import java.io.Serializable;
import org.android.agoo.common.AgooConstants;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "Album_2_0")
/* loaded from: classes2.dex */
public class Album implements Serializable {

    @Column(name = "albumBackgroud")
    private String albumBackgroud;

    @Column(name = "albumPic")
    private String albumPic;

    @Column(name = "albumState")
    private int albumState;

    @Column(name = "albumTitle")
    private String albumTitle;

    @Column(name = "albumType")
    private String albumType;

    @Column(name = "alias")
    private String alias;

    @Column(name = "collectionTime")
    private int collectionTime;

    @Column(name = "contentId")
    private String contentId;

    @Column(name = "contentType")
    private String contentType;

    @Column(name = "decplayIndex")
    private int decplayIndex;

    /* renamed from: id */
    @Column(isId = true, name = "id")
    private int f12055id;

    @Column(name = "movieRate")
    private float movieRate;

    @Column(name = "playIndexTitle")
    private String playIndexTitle;

    @Column(name = "postiveplayIndex")
    private int postiveplayIndex;

    @Column(name = "realAudio")
    private String realAudio;

    @Column(name = "shelveType")
    private String shelveType;

    @Column(name = "streamNumber")
    private int streamNumber;

    @Column(name = "subIndex")
    private int subIndex;

    @Column(name = "subLanguage")
    private String subLanguage;

    @Column(name = "subLanguageSwitch")
    private String subLanguageSwitch;

    @Column(name = "subSize")
    private int subSize;

    @Column(name = "subStyle")
    private int subStyle;

    @Column(name = AgooConstants.MESSAGE_TIME)
    private String time;

    @Column(name = "totalNum")
    private int totalNum;

    @Column(name = "typeId")
    private int typeId;

    public String getAlbumBackgroud() {
        return this.albumBackgroud;
    }

    public String getAlbumPic() {
        if (this.albumPic == null) {
            this.albumPic = "";
        }
        return this.albumPic;
    }

    public int getAlbumState() {
        return this.albumState;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public String getAlbumType() {
        return this.albumType;
    }

    public String getAlias() {
        return this.alias;
    }

    public int getCollectionTime() {
        return this.collectionTime;
    }

    public String getContentId() {
        return this.contentId;
    }

    public String getContentType() {
        return this.contentType;
    }

    public int getDecplayIndex() {
        return this.decplayIndex;
    }

    public int getId() {
        return this.f12055id;
    }

    public float getMovieRate() {
        return this.movieRate;
    }

    public String getPlayIndexTitle() {
        return this.playIndexTitle;
    }

    public int getPostiveplayIndex() {
        return this.postiveplayIndex;
    }

    public String getRealAudio() {
        return this.realAudio;
    }

    public String getShelveType() {
        return this.shelveType;
    }

    public int getStreamNumber() {
        return this.streamNumber;
    }

    public int getSubIndex() {
        return this.subIndex;
    }

    public String getSubLanguage() {
        return this.subLanguage;
    }

    public String getSubLanguageSwitch() {
        return this.subLanguageSwitch;
    }

    public int getSubSize() {
        return this.subSize;
    }

    public int getSubStyle() {
        return this.subStyle;
    }

    public String getTime() {
        return this.time;
    }

    public int getTotalNum() {
        return this.totalNum;
    }

    public int getTypeId() {
        return this.typeId;
    }

    public void setAlbumBackgroud(String str) {
        this.albumBackgroud = str;
    }

    public void setAlbumPic(String str) {
        this.albumPic = str;
    }

    public void setAlbumState(int i10) {
        this.albumState = i10;
    }

    public void setAlbumTitle(String str) {
        this.albumTitle = str;
    }

    public void setAlbumType(String str) {
        this.albumType = str;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setCollectionTime(int i10) {
        this.collectionTime = i10;
    }

    public void setContentId(String str) {
        this.contentId = str;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setDecplayIndex(int i10) {
        this.decplayIndex = i10;
    }

    public void setId(int i10) {
        this.f12055id = i10;
    }

    public void setMovieRate(float f10) {
        this.movieRate = f10;
    }

    public void setPlayIndexTitle(String str) {
        this.playIndexTitle = str;
    }

    public void setPostiveplayIndex(int i10) {
        this.postiveplayIndex = i10;
    }

    public void setRealAudio(String str) {
        this.realAudio = str;
    }

    public void setShelveType(String str) {
        this.shelveType = str;
    }

    public void setStreamNumber(int i10) {
        this.streamNumber = i10;
    }

    public void setSubIndex(int i10) {
        this.subIndex = i10;
    }

    public void setSubLanguage(String str) {
        this.subLanguage = str;
    }

    public void setSubLanguageSwitch(String str) {
        this.subLanguageSwitch = str;
    }

    public void setSubSize(int i10) {
        this.subSize = i10;
    }

    public void setSubStyle(int i10) {
        this.subStyle = i10;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setTotalNum(int i10) {
        this.totalNum = i10;
    }

    public void setTypeId(int i10) {
        this.typeId = i10;
    }

    public String toString() {
        return "Album{id=" + this.f12055id + ", contentId='" + this.contentId + "', decplayIndex=" + this.decplayIndex + ", postiveplayIndex=" + this.postiveplayIndex + ", playIndexTitle='" + this.playIndexTitle + "', collectionTime=" + this.collectionTime + ", typeId=" + this.typeId + ", albumType='" + this.albumType + "', albumTitle='" + this.albumTitle + "', albumState=" + this.albumState + ", albumPic='" + this.albumPic + "', albumBackgroud='" + this.albumBackgroud + "', movieRate=" + this.movieRate + ", streamNumber=" + this.streamNumber + ", shelveType='" + this.shelveType + "', time='" + this.time + "', alias='" + this.alias + "', totalNum=" + this.totalNum + ", contentType='" + this.contentType + "', subLanguageSwitch='" + this.subLanguageSwitch + "', subLanguage='" + this.subLanguage + "', subIndex='" + this.subIndex + "', subSize='" + this.subSize + "', subStyle='" + this.subStyle + "', realAudio='" + this.realAudio + "'}";
    }
}
