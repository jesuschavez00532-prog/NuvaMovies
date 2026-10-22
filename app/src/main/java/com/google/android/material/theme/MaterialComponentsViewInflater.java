package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.C0313n;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0399h;
import androidx.appcompat.widget.C0403i;
import androidx.appcompat.widget.C0455v;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p173i5.C4896a;
import p260o5.C5916a;

@Keep
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0313n {
    private static int floatingToolbarItemBackgroundResId = -1;

    @Override // androidx.appcompat.app.C0313n
    protected C0399h createButton(Context context, AttributeSet attributeSet) {
        if (shouldInflateAppCompatButton(context, attributeSet)) {
            return new C0399h(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0313n
    protected C0403i createCheckBox(Context context, AttributeSet attributeSet) {
        return new C4896a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0313n
    protected C0455v createRadioButton(Context context, AttributeSet attributeSet) {
        return new C5916a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0313n
    protected AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    protected boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 23 && i10 != 24 && i10 != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", DispatchConstants.ANDROID);
        }
        int i11 = floatingToolbarItemBackgroundResId;
        if (i11 != 0 && i11 != -1) {
            for (int i12 = 0; i12 < attributeSet.getAttributeCount(); i12++) {
                if (attributeSet.getAttributeNameResource(i12) == 16842964) {
                    if (floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i12, null, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
