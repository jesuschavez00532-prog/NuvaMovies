package com.module.childlock.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class MarqueTextView extends AppCompatTextView {

    /* renamed from: a */
    public Map f12056a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attrs");
        this.f12056a = new LinkedHashMap();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }
}
