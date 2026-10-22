package com.module.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$styleable;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class CustomImageTextView extends AutoLinearLayout {

    /* renamed from: a */
    private int f12159a;

    /* renamed from: b */
    private ImageView f12160b;

    /* renamed from: c */
    private TextView f12161c;

    /* renamed from: d */
    public Map f12162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomImageTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ImageView imageView;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attrs");
        this.f12162d = new LinkedHashMap();
        this.f12159a = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f11944O);
        AbstractC5868k.m23673e(obtainStyledAttributes, "context.obtainStyledAttr…able.CustomImageTextView)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == R$styleable.CustomImageTextView_src) {
                this.f12159a = obtainStyledAttributes.getResourceId(index, R$drawable.icon_nation_add);
            }
        }
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(R$layout.layout_image_textview, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(R$id.mImageIcon);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f12160b = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R$id.mText);
        AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f12161c = (TextView) findViewById2;
        int i11 = this.f12159a;
        if (i11 != -1 && (imageView = this.f12160b) != null) {
            imageView.setImageResource(i11);
        }
    }

    public final void setViewText(String str) {
        AbstractC5868k.m23674f(str, "text");
        TextView textView = this.f12161c;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
