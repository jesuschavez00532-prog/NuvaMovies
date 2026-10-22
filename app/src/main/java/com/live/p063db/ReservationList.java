package com.live.p063db;

import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.AnalyticsConfig;
import java.util.List;
import java.util.ListIterator;
import ne.AbstractC5868k;
import org.android.agoo.common.AgooConstants;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1508t;
import p359ue.C7155i;

@Table(name = "ReservationList")
/* loaded from: classes2.dex */
public final class ReservationList {

    @Column(name = "channelCode")
    private String channelCode;

    @Column(name = "content")
    private String content;

    @Column(name = Progress.DATE)
    private String date;

    @Column(name = "expireTime")
    private long expireTime;

    @Column(name = "fileUrl")
    private String fileUrl;

    /* renamed from: id */
    @Column(isId = true, name = "id")
    private long f10823id;

    @Column(name = "isNotified")
    private int isNotified;
    private boolean isPlaying;
    private boolean isReserve;

    @Column(name = "isRestore")
    private int isRestore;

    @Column(name = SerializableCookie.NAME)
    private String name;

    @Column(name = AnalyticsConfig.RTD_START_TIME)
    private String startTime;

    @Column(name = AgooConstants.MESSAGE_TIME)
    private String time;

    public ReservationList() {
        this.isReserve = true;
        this.isRestore = 1;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDate() {
        return this.date;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final long getId() {
        return this.f10823id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTime() {
        return this.time;
    }

    public final int isNotified() {
        return this.isNotified;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final boolean isReserve() {
        return this.isReserve;
    }

    public final int isRestore() {
        return this.isRestore;
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setExpireTime(long j10) {
        this.expireTime = j10;
    }

    public final void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public final void setId(long j10) {
        this.f10823id = j10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNotified(int i10) {
        this.isNotified = i10;
    }

    public final void setPlaying(boolean z10) {
        this.isPlaying = z10;
    }

    public final void setReserve(boolean z10) {
        this.isReserve = z10;
    }

    public final void setRestore(int i10) {
        this.isRestore = i10;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setTime(String str) {
        this.time = str;
    }

    public String toString() {
        return "ReservationList{id=" + this.f10823id + ", channelCode='" + this.channelCode + "', name='" + this.name + "', date='" + this.date + "', time='" + this.time + "', content='" + this.content + "', fileUrl='" + this.fileUrl + "', startTime='" + this.startTime + "', expireTime=" + this.expireTime + '}';
    }

    public ReservationList(String str, String str2, String str3, String str4, String str5, String str6, int i10) {
        List m6985d;
        List m6985d2;
        List m6985d3;
        List m6985d4;
        AbstractC5868k.m23674f(str, "channelCode");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str3, Progress.DATE);
        AbstractC5868k.m23674f(str4, AgooConstants.MESSAGE_TIME);
        AbstractC5868k.m23674f(str5, "content");
        AbstractC5868k.m23674f(str6, "fileUrl");
        this.isReserve = true;
        this.channelCode = str;
        this.name = str2;
        this.date = str3;
        this.time = str4;
        this.content = str5;
        this.fileUrl = str6;
        this.isRestore = i10;
        List m27681e = new C7155i(Operator.Operation.MINUS).m27681e(str3, 0);
        if (!m27681e.isEmpty()) {
            ListIterator listIterator = m27681e.listIterator(m27681e.size());
            while (listIterator.hasPrevious()) {
                if (!(((String) listIterator.previous()).length() == 0)) {
                    m6985d = AbstractC1508t.m6997B(m27681e, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        m6985d = AbstractC1500l.m6985d();
        String[] strArr = (String[]) m6985d.toArray(new String[0]);
        List m27681e2 = new C7155i(Operator.Operation.MINUS).m27681e(str4, 0);
        if (!m27681e2.isEmpty()) {
            ListIterator listIterator2 = m27681e2.listIterator(m27681e2.size());
            while (listIterator2.hasPrevious()) {
                if (!(((String) listIterator2.previous()).length() == 0)) {
                    m6985d2 = AbstractC1508t.m6997B(m27681e2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        m6985d2 = AbstractC1500l.m6985d();
        String[] strArr2 = (String[]) m6985d2.toArray(new String[0]);
        String str7 = strArr2[0];
        this.startTime = str7;
        AbstractC5868k.m23671c(str7);
        List m27681e3 = new C7155i(":").m27681e(str7, 0);
        if (!m27681e3.isEmpty()) {
            ListIterator listIterator3 = m27681e3.listIterator(m27681e3.size());
            while (listIterator3.hasPrevious()) {
                if (!(((String) listIterator3.previous()).length() == 0)) {
                    m6985d3 = AbstractC1508t.m6997B(m27681e3, listIterator3.nextIndex() + 1);
                    break;
                }
            }
        }
        m6985d3 = AbstractC1500l.m6985d();
        String[] strArr3 = (String[]) m6985d3.toArray(new String[0]);
        List m27681e4 = new C7155i(":").m27681e(strArr2[1], 0);
        if (!m27681e4.isEmpty()) {
            ListIterator listIterator4 = m27681e4.listIterator(m27681e4.size());
            while (listIterator4.hasPrevious()) {
                if (!(((String) listIterator4.previous()).length() == 0)) {
                    m6985d4 = AbstractC1508t.m6997B(m27681e4, listIterator4.nextIndex() + 1);
                    break;
                }
            }
        }
        m6985d4 = AbstractC1500l.m6985d();
        String[] strArr4 = (String[]) m6985d4.toArray(new String[0]);
        Integer valueOf = Integer.valueOf(strArr3[0] + strArr3[1]);
        AbstractC5868k.m23673e(valueOf, "valueOf(starts[0] + starts[1])");
        int intValue = valueOf.intValue();
        Integer valueOf2 = Integer.valueOf(strArr4[0] + strArr4[1]);
        AbstractC5868k.m23673e(valueOf2, "valueOf(endTime[0] + endTime[1])");
        if (intValue > valueOf2.intValue()) {
            Long valueOf3 = Long.valueOf(strArr[0] + strArr[1] + strArr[2] + AgooConstants.REPORT_NOT_ENCRYPT + strArr4[1]);
            AbstractC5868k.m23673e(valueOf3, "valueOf(date1[0] + date1…te1[2] + 24 + endTime[1])");
            this.expireTime = valueOf3.longValue();
            return;
        }
        Long valueOf4 = Long.valueOf(strArr[0] + strArr[1] + strArr[2] + strArr4[0] + strArr4[1]);
        AbstractC5868k.m23673e(valueOf4, "valueOf(date1[0] + date1… endTime[0] + endTime[1])");
        this.expireTime = valueOf4.longValue();
    }
}
