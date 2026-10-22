package com.request.bean;

import android.text.TextUtils;
import com.lzy.okgo.model.Progress;
import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class EpgProgram implements Serializable, Cloneable {
    private String contentId;
    private String desc;
    private String endTime;
    private transient int flag;
    private String programName;
    private String remark;
    private String startTime;
    private String type;
    private transient String date = "";
    private transient String start = "";
    private transient String stop = "";

    public final String getContentId() {
        return this.contentId;
    }

    public final String getDate() {
        if (TextUtils.isEmpty(this.date) && !TextUtils.isEmpty(this.startTime)) {
            String str = this.startTime;
            AbstractC5868k.m23671c(str);
            if (str.length() == 14) {
                StringBuilder sb2 = new StringBuilder();
                String str2 = this.startTime;
                AbstractC5868k.m23671c(str2);
                String substring = str2.substring(0, 4);
                AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                sb2.append('-');
                String str3 = this.startTime;
                AbstractC5868k.m23671c(str3);
                String substring2 = str3.substring(4, 6);
                AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring2);
                sb2.append('-');
                String str4 = this.startTime;
                AbstractC5868k.m23671c(str4);
                String substring3 = str4.substring(6, 8);
                AbstractC5868k.m23673e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring3);
                this.date = sb2.toString();
            }
        }
        return this.date;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final String getProgramName() {
        return this.programName;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getStart() {
        if (TextUtils.isEmpty(this.start) && !TextUtils.isEmpty(this.startTime)) {
            String str = this.startTime;
            AbstractC5868k.m23671c(str);
            if (str.length() == 14) {
                StringBuilder sb2 = new StringBuilder();
                String str2 = this.startTime;
                AbstractC5868k.m23671c(str2);
                String substring = str2.substring(8, 10);
                AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                sb2.append(':');
                String str3 = this.startTime;
                AbstractC5868k.m23671c(str3);
                String substring2 = str3.substring(10, 12);
                AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring2);
                this.start = sb2.toString();
            }
        }
        return this.start;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStop() {
        if (TextUtils.isEmpty(this.stop) && !TextUtils.isEmpty(this.endTime)) {
            String str = this.endTime;
            AbstractC5868k.m23671c(str);
            if (str.length() == 14) {
                StringBuilder sb2 = new StringBuilder();
                String str2 = this.endTime;
                AbstractC5868k.m23671c(str2);
                String substring = str2.substring(8, 10);
                AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                sb2.append(':');
                String str3 = this.endTime;
                AbstractC5868k.m23671c(str3);
                String substring2 = str3.substring(10, 12);
                AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring2);
                this.stop = sb2.toString();
            }
        }
        return this.stop;
    }

    public final String getType() {
        return this.type;
    }

    public final String getYearAndDate() {
        if (!TextUtils.isEmpty(this.startTime)) {
            String str = this.startTime;
            AbstractC5868k.m23671c(str);
            if (str.length() == 14) {
                String str2 = this.startTime;
                AbstractC5868k.m23671c(str2);
                String substring = str2.substring(0, 8);
                AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return "";
        }
        return "";
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    public final void setDate(String str) {
        AbstractC5868k.m23674f(str, Progress.DATE);
        this.date = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setEndTime(String str) {
        this.endTime = str;
    }

    public final void setFlag(int i10) {
        this.flag = i10;
    }

    public final void setProgramName(String str) {
        this.programName = str;
    }

    public final void setRemark(String str) {
        this.remark = str;
    }

    public final void setStart(String str) {
        AbstractC5868k.m23674f(str, "start");
        this.start = str;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setStop(String str) {
        AbstractC5868k.m23674f(str, "stop");
        this.stop = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "EpgProgramList{contentId='" + this.contentId + "', programName='" + this.programName + "', startTime='" + this.startTime + "', endTime='" + this.endTime + "', remark='" + this.remark + "', type='" + this.type + "', desc='" + this.desc + "', date='" + this.date + "', start='" + this.start + "', stop='" + this.stop + "', flag=" + this.flag + '}';
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EpgProgram m30177clone() {
        EpgProgram epgProgram = new EpgProgram();
        epgProgram.contentId = this.contentId;
        epgProgram.programName = this.programName;
        epgProgram.startTime = this.startTime;
        epgProgram.endTime = this.endTime;
        epgProgram.remark = this.remark;
        epgProgram.type = this.type;
        epgProgram.desc = this.desc;
        epgProgram.flag = this.flag;
        return epgProgram;
    }
}
