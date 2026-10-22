package com.module.bean;

import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SourceBean {
    private final List<AudioInfoBean> audioInfoList;
    private final String audioTag;
    private final String contentId;
    private final boolean hasLicense;
    private int selectAudio;

    public SourceBean(String str, String str2, List<AudioInfoBean> list, boolean z10, int i10) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "audioTag");
        AbstractC5868k.m23674f(list, "audioInfoList");
        this.contentId = str;
        this.audioTag = str2;
        this.audioInfoList = list;
        this.hasLicense = z10;
        this.selectAudio = i10;
    }

    public static /* synthetic */ SourceBean copy$default(SourceBean sourceBean, String str, String str2, List list, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sourceBean.contentId;
        }
        if ((i11 & 2) != 0) {
            str2 = sourceBean.audioTag;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            list = sourceBean.audioInfoList;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            z10 = sourceBean.hasLicense;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            i10 = sourceBean.selectAudio;
        }
        return sourceBean.copy(str, str3, list2, z11, i10);
    }

    public final String component1() {
        return this.contentId;
    }

    public final String component2() {
        return this.audioTag;
    }

    public final List<AudioInfoBean> component3() {
        return this.audioInfoList;
    }

    public final boolean component4() {
        return this.hasLicense;
    }

    public final int component5() {
        return this.selectAudio;
    }

    public final SourceBean copy(String str, String str2, List<AudioInfoBean> list, boolean z10, int i10) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "audioTag");
        AbstractC5868k.m23674f(list, "audioInfoList");
        return new SourceBean(str, str2, list, z10, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceBean)) {
            return false;
        }
        SourceBean sourceBean = (SourceBean) obj;
        return AbstractC5868k.m23669a(this.contentId, sourceBean.contentId) && AbstractC5868k.m23669a(this.audioTag, sourceBean.audioTag) && AbstractC5868k.m23669a(this.audioInfoList, sourceBean.audioInfoList) && this.hasLicense == sourceBean.hasLicense && this.selectAudio == sourceBean.selectAudio;
    }

    public final String getAllLangStr() {
        StringBuilder sb2 = new StringBuilder();
        List<AudioInfoBean> list = this.audioInfoList;
        int size = list.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                sb2.append(list.get(i10).getTransLanguage());
                if (i10 < this.audioInfoList.size() - 1) {
                    sb2.append(" ");
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        AbstractC5868k.m23673e(sb3, "sb.toString()");
        return sb3;
    }

    public final List<AudioInfoBean> getAudioInfoList() {
        return this.audioInfoList;
    }

    public final String getAudioTag() {
        return this.audioTag;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final boolean getHasLicense() {
        return this.hasLicense;
    }

    public final AudioInfoBean getSelectAduio() {
        int i10 = this.selectAudio;
        if (i10 >= 0 && i10 < this.audioInfoList.size()) {
            return this.audioInfoList.get(this.selectAudio);
        }
        return null;
    }

    public final int getSelectAudio() {
        return this.selectAudio;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.contentId.hashCode() * 31) + this.audioTag.hashCode()) * 31) + this.audioInfoList.hashCode()) * 31;
        boolean z10 = this.hasLicense;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.selectAudio;
    }

    public final void setSelectAudio(int i10) {
        this.selectAudio = i10;
    }

    public String toString() {
        return "SourceBean(contentId=" + this.contentId + ", audioTag=" + this.audioTag + ", audioInfoList=" + this.audioInfoList + ", hasLicense=" + this.hasLicense + ", selectAudio=" + this.selectAudio + ')';
    }

    public /* synthetic */ SourceBean(String str, String str2, List list, boolean z10, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(str, str2, list, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? 0 : i10);
    }
}
