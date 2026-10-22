package com.module.view.net;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p012ab.InterfaceC0125a;

/* loaded from: classes2.dex */
public final class NetSpeedTextView extends AppCompatTextView implements InterfaceC0125a {

    /* renamed from: a */
    public Map f12360a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetSpeedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attrs");
        this.f12360a = new LinkedHashMap();
    }

    @Override // p012ab.InterfaceC0125a
    /* renamed from: a */
    public void mo497a(String str) {
        AbstractC5868k.m23674f(str, "speedInfo");
        setText(str);
    }
}
