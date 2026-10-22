package com.module.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.C3913a;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p433zd.C7785a;

/* loaded from: classes2.dex */
public final class AutoRadioGroup extends RadioGroup {

    /* renamed from: a */
    private final C7785a f12156a;

    /* renamed from: b */
    public Map f12157b = new LinkedHashMap();

    /* renamed from: com.module.view.AutoRadioGroup$a */
    /* loaded from: classes2.dex */
    public static final class C2997a extends RadioGroup.LayoutParams implements C7785a.a {

        /* renamed from: a */
        private C3913a f12158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2997a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC5868k.m23674f(context, C3325bt.f14194aL);
            AbstractC5868k.m23674f(attributeSet, "attrs");
            C3913a m30154b = C7785a.m30154b(context, attributeSet);
            AbstractC5868k.m23673e(m30154b, "getAutoLayoutInfo(c, attrs)");
            this.f12158a = m30154b;
        }

        @Override // p433zd.C7785a.a
        public C3913a getAutoLayoutInfo() {
            C3913a c3913a = this.f12158a;
            if (c3913a == null) {
                AbstractC5868k.m23686r("mAutoLayoutInfo");
                return null;
            }
            return c3913a;
        }
    }

    public AutoRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12156a = new C7785a(this);
    }

    @Override // android.widget.RadioGroup, android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2997a generateLayoutParams(AttributeSet attributeSet) {
        AbstractC5868k.m23674f(attributeSet, "attrs");
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        return new C2997a(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!isInEditMode()) {
            this.f12156a.m30156a();
        }
        super.onMeasure(i10, i11);
    }
}
