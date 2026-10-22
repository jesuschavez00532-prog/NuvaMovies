package com.module.p069db;

import com.lzy.okgo.model.Progress;
import java.io.Serializable;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "UmengPush")
/* loaded from: classes2.dex */
public class UmengPush implements Serializable {
    public static String ALREADY_READ = "1";
    public static String TYPE_EVENT = "4";
    public static String TYPE_LOGIN = "2";
    public static String TYPE_ORDER = "1";
    public static String TYPE_UPGRADE = "3";
    public static String UN_READ = "0";

    @Column(name = "contentId")
    private String contentId;

    @Column(name = "extArgs")
    private String extArgs;

    /* renamed from: id */
    @Column(autoGen = true, isId = true, name = "id")
    private int f12057id;

    @Column(name = "loginCity")
    private String loginCity;

    @Column(name = "loginCountry")
    private String loginCountry;

    @Column(name = "loginIp")
    private String loginIp;

    @Column(name = "messageTime")
    private String messageTime;

    @Column(name = "messageType")
    private String messageType;

    @Column(name = "msgId")
    private String msgId;

    /* renamed from: sn */
    @Column(name = "sn")
    private String f12058sn;

    @Column(name = Progress.STATUS)
    private String status = UN_READ;

    @Column(name = "text")
    private String text;

    @Column(name = "ticker")
    private String ticker;

    @Column(name = "title")
    private String title;

    @Column(name = "type")
    private String type;

    @Column(name = "userId")
    private String userId;

    @Column(name = "userToken")
    private String userToken;

    public String getContentId() {
        return this.contentId;
    }

    public String getExtArgs() {
        return this.extArgs;
    }

    public int getId() {
        return this.f12057id;
    }

    public String getLoginCity() {
        return this.loginCity;
    }

    public String getLoginCountry() {
        return this.loginCountry;
    }

    public String getLoginIp() {
        return this.loginIp;
    }

    public String getMessageTime() {
        return this.messageTime;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getMsgId() {
        return this.msgId;
    }

    public String getSn() {
        return this.f12058sn;
    }

    public String getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getTicker() {
        return this.ticker;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserToken() {
        return this.userToken;
    }

    public void setContentId(String str) {
        this.contentId = str;
    }

    public void setExtArgs(String str) {
        this.extArgs = str;
    }

    public void setId(int i10) {
        this.f12057id = i10;
    }

    public void setLoginCity(String str) {
        this.loginCity = str;
    }

    public void setLoginCountry(String str) {
        this.loginCountry = str;
    }

    public void setLoginIp(String str) {
        this.loginIp = str;
    }

    public void setMessageTime(String str) {
        this.messageTime = str;
    }

    public void setMessageType(String str) {
        this.messageType = str;
    }

    public void setMsgId(String str) {
        this.msgId = str;
    }

    public void setSn(String str) {
        this.f12058sn = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTicker(String str) {
        this.ticker = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserToken(String str) {
        this.userToken = str;
    }
}
