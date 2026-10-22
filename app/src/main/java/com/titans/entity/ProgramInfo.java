package com.titans.entity;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes3.dex */
public final class ProgramInfo implements Serializable {
    private String app_ctx;
    private String buss;
    private long delay;
    private String desc;
    private String lang;
    private String program_code;
    private String quality;
    private List<Sources> sources;
    private long start;
    private long timeout;

    public ProgramInfo(String str, String str2, String str3, String str4, long j10, long j11, List<Sources> list, long j12, String str5, String str6) {
        AbstractC5868k.m23674f(str, "program_code");
        AbstractC5868k.m23674f(str2, "buss");
        AbstractC5868k.m23674f(str3, "desc");
        AbstractC5868k.m23674f(str4, "quality");
        AbstractC5868k.m23674f(list, "sources");
        AbstractC5868k.m23674f(str5, "lang");
        AbstractC5868k.m23674f(str6, "app_ctx");
        this.program_code = str;
        this.buss = str2;
        this.desc = str3;
        this.quality = str4;
        this.delay = j10;
        this.timeout = j11;
        this.sources = list;
        this.start = j12;
        this.lang = str5;
        this.app_ctx = str6;
    }

    public final String component1() {
        return this.program_code;
    }

    public final String component10() {
        return this.app_ctx;
    }

    public final String component2() {
        return this.buss;
    }

    public final String component3() {
        return this.desc;
    }

    public final String component4() {
        return this.quality;
    }

    public final long component5() {
        return this.delay;
    }

    public final long component6() {
        return this.timeout;
    }

    public final List<Sources> component7() {
        return this.sources;
    }

    public final long component8() {
        return this.start;
    }

    public final String component9() {
        return this.lang;
    }

    public final ProgramInfo copy(String str, String str2, String str3, String str4, long j10, long j11, List<Sources> list, long j12, String str5, String str6) {
        AbstractC5868k.m23674f(str, "program_code");
        AbstractC5868k.m23674f(str2, "buss");
        AbstractC5868k.m23674f(str3, "desc");
        AbstractC5868k.m23674f(str4, "quality");
        AbstractC5868k.m23674f(list, "sources");
        AbstractC5868k.m23674f(str5, "lang");
        AbstractC5868k.m23674f(str6, "app_ctx");
        return new ProgramInfo(str, str2, str3, str4, j10, j11, list, j12, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramInfo)) {
            return false;
        }
        ProgramInfo programInfo = (ProgramInfo) obj;
        return AbstractC5868k.m23669a(this.program_code, programInfo.program_code) && AbstractC5868k.m23669a(this.buss, programInfo.buss) && AbstractC5868k.m23669a(this.desc, programInfo.desc) && AbstractC5868k.m23669a(this.quality, programInfo.quality) && this.delay == programInfo.delay && this.timeout == programInfo.timeout && AbstractC5868k.m23669a(this.sources, programInfo.sources) && this.start == programInfo.start && AbstractC5868k.m23669a(this.lang, programInfo.lang) && AbstractC5868k.m23669a(this.app_ctx, programInfo.app_ctx);
    }

    public final String getApp_ctx() {
        return this.app_ctx;
    }

    public final String getBuss() {
        return this.buss;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getProgram_code() {
        return this.program_code;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final List<Sources> getSources() {
        return this.sources;
    }

    public final long getStart() {
        return this.start;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return (((((((((((((((((this.program_code.hashCode() * 31) + this.buss.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.quality.hashCode()) * 31) + AbstractC6322a.m25086a(this.delay)) * 31) + AbstractC6322a.m25086a(this.timeout)) * 31) + this.sources.hashCode()) * 31) + AbstractC6322a.m25086a(this.start)) * 31) + this.lang.hashCode()) * 31) + this.app_ctx.hashCode();
    }

    public final void setApp_ctx(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.app_ctx = str;
    }

    public final void setBuss(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.buss = str;
    }

    public final void setDelay(long j10) {
        this.delay = j10;
    }

    public final void setDesc(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.desc = str;
    }

    public final void setLang(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.lang = str;
    }

    public final void setProgram_code(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.program_code = str;
    }

    public final void setQuality(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.quality = str;
    }

    public final void setSources(List<Sources> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.sources = list;
    }

    public final void setStart(long j10) {
        this.start = j10;
    }

    public final void setTimeout(long j10) {
        this.timeout = j10;
    }

    public String toString() {
        return "ProgramInfo(program_code=" + this.program_code + ", buss=" + this.buss + ", desc=" + this.desc + ", quality=" + this.quality + ", delay=" + this.delay + ", timeout=" + this.timeout + ", sources=" + this.sources + ", start=" + this.start + ", lang=" + this.lang + ", app_ctx=" + this.app_ctx + ')';
    }

    public /* synthetic */ ProgramInfo(String str, String str2, String str3, String str4, long j10, long j11, List list, long j12, String str5, String str6, int i10, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, str4, j10, j11, list, (i10 & 128) != 0 ? 0L : j12, (i10 & 256) != 0 ? "" : str5, str6);
    }
}
