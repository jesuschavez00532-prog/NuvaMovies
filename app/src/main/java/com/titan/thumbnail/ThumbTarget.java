package com.titan.thumbnail;

import android.view.View;
import com.bumptech.glide.R$id;
import java.io.File;
import ne.AbstractC5868k;
import p003a2.InterfaceC0008d;
import p022b2.AbstractC1040h;
import p034c2.InterfaceC1344b;

/* loaded from: classes3.dex */
public abstract class ThumbTarget extends AbstractC1040h {
    private final int tagId;
    private final String url;
    private final View view;

    public ThumbTarget(View view, String str) {
        AbstractC5868k.m23675g(view, "view");
        AbstractC5868k.m23675g(str, "url");
        this.view = view;
        this.url = str;
        this.tagId = R$id.glide_custom_view_target_tag;
    }

    @Override // p022b2.InterfaceC1042j
    public InterfaceC0008d getRequest() {
        Object tag = this.view.getTag(this.tagId);
        if (!(tag instanceof InterfaceC0008d)) {
            tag = null;
        }
        return (InterfaceC0008d) tag;
    }

    public final String getUrl() {
        return this.url;
    }

    public final View getView() {
        return this.view;
    }

    public abstract void onResourceReadyUrl(File file, String str);

    @Override // p022b2.InterfaceC1042j
    public void setRequest(InterfaceC0008d interfaceC0008d) {
        this.view.setTag(this.tagId, interfaceC0008d);
    }

    @Override // p022b2.InterfaceC1042j
    public void onResourceReady(File file, InterfaceC1344b interfaceC1344b) {
        AbstractC5868k.m23675g(file, "resource");
        onResourceReadyUrl(file, this.url);
    }
}
